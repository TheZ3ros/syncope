package org.apache.syncope.core.provisioning.java;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.Optional;
import java.util.Set;
import org.apache.syncope.core.persistence.api.dao.AnyObjectDAO;
import org.apache.syncope.core.persistence.api.dao.GroupDAO;
import org.apache.syncope.core.persistence.api.dao.ImplementationDAO;
import org.apache.syncope.core.persistence.api.dao.RealmSearchDAO;
import org.apache.syncope.core.persistence.api.dao.RelationshipTypeDAO;
import org.apache.syncope.core.persistence.api.dao.UserDAO;
import org.apache.syncope.core.persistence.api.entity.ExternalResource;
import org.apache.syncope.core.persistence.api.entity.Realm;
import org.apache.syncope.core.provisioning.api.DerAttrHandler;
import org.apache.syncope.core.provisioning.api.IntAttrNameParser;
import org.apache.syncope.core.provisioning.api.jexl.JexlTools;
import org.apache.syncope.core.persistence.api.EncryptorManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.apache.syncope.core.provisioning.api.MappingManager;
import org.identityconnectors.framework.common.objects.Attribute;
import org.apache.syncope.common.lib.to.OrgUnit;
import org.apache.syncope.common.lib.to.Item;

public class DefaultMappingManagerTest {

    @Mock
    private UserDAO userDAO;
    @Mock
    private AnyObjectDAO anyObjectDAO;
    @Mock
    private GroupDAO groupDAO;
    @Mock
    private RelationshipTypeDAO relationshipTypeDAO;
    @Mock
    private RealmSearchDAO realmSearchDAO;
    @Mock
    private ImplementationDAO implementationDAO;
    @Mock
    private DerAttrHandler derAttrHandler;
    @Mock
    private IntAttrNameParser intAttrNameParser;
    @Mock
    private EncryptorManager encryptorManager;
    @Mock
    private JexlTools jexlTools;

    @InjectMocks
    private DefaultMappingManager mappingManager;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testTC1_PrepareAttrsFromRealm_NullOrgUnit() {
        Realm realm = mock(Realm.class);
        ExternalResource resource = mock(ExternalResource.class);
        when(resource.getOrgUnit()).thenReturn(null);

        MappingManager.PreparedAttrs attrs = mappingManager.prepareAttrsFromRealm(realm, resource);

        assertNull(attrs.connObjectLink());
        assertTrue(attrs.attributes().isEmpty());
    }

    @Test
    public void testTC2_PrepareAttrsFromRealm_ValidOrgUnit() {
        Realm realm = mock(Realm.class);
        ExternalResource resource = mock(ExternalResource.class);
        OrgUnit orgUnit = mock(OrgUnit.class);
        when(resource.getOrgUnit()).thenReturn(orgUnit);
        
        Item connObjectKeyItem = new Item();
        connObjectKeyItem.setExtAttrName("ou");
        connObjectKeyItem.setIntAttrName("name");
        when(orgUnit.getConnObjectKeyItem()).thenReturn(Optional.of(connObjectKeyItem));
        when(orgUnit.getItems()).thenReturn(java.util.List.of(connObjectKeyItem));

        MappingManager.PreparedAttrs attrs = mappingManager.prepareAttrsFromRealm(realm, resource);

        assertNotNull(attrs.attributes());
    }

    @Test
    public void testTC3_PrepareAttrsFromRealm_NullRealm() {
        ExternalResource resource = mock(ExternalResource.class);
        OrgUnit orgUnit = mock(OrgUnit.class);
        when(resource.getOrgUnit()).thenReturn(orgUnit);
        Item item = new Item();
        item.setIntAttrName("name");
        item.setPurpose(org.apache.syncope.common.lib.types.MappingPurpose.PROPAGATION);
        when(orgUnit.getItems()).thenReturn(java.util.List.of(item));
        when(orgUnit.getConnObjectKeyItem()).thenReturn(Optional.of(item));

        assertThrows(NullPointerException.class, () -> mappingManager.prepareAttrsFromRealm(null, resource));
    }

    @Test
    public void testTC4_PrepareAttr_Realm() throws Exception {
        ExternalResource resource = mock(ExternalResource.class);
        Item item = new Item();
        item.setIntAttrName("name");
        item.setExtAttrName("extName");
        Realm realm = mock(Realm.class);
        when(realm.getName()).thenReturn("myRealm");

        org.apache.syncope.core.provisioning.api.IntAttrName intAttrName = mock(org.apache.syncope.core.provisioning.api.IntAttrName.class);
        when(intAttrNameParser.parse("name")).thenReturn(intAttrName);
        when(intAttrName.getField()).thenReturn("name");
        when(intAttrName.getSchemaInfo()).thenReturn(null);

        org.apache.syncope.core.provisioning.api.MappingManager.PreparedAttr attr = mappingManager.prepareAttr(resource, item, realm);

        assertNotNull(attr);
        assertNotNull(attr.attribute());
        assertEquals("extName", attr.attribute().getName());
        assertEquals("myRealm", attr.attribute().getValue().get(0).toString());
    }

    @Test
    public void testTC5_PrepareAttr_Realm_EmptyValues() throws Exception {
        ExternalResource resource = mock(ExternalResource.class);
        Item item = new Item();
        item.setIntAttrName("invalid");
        item.setExtAttrName("extName");
        Realm realm = mock(Realm.class);

        org.apache.syncope.core.provisioning.api.IntAttrName intAttrName = mock(org.apache.syncope.core.provisioning.api.IntAttrName.class);
        when(intAttrNameParser.parse("invalid")).thenReturn(intAttrName);
        when(intAttrName.getField()).thenReturn("invalid");
        when(intAttrName.getSchemaInfo()).thenReturn(null);

        org.apache.syncope.core.provisioning.api.MappingManager.PreparedAttr attr = mappingManager.prepareAttr(resource, item, realm);

        assertNotNull(attr);
        assertNotNull(attr.attribute());
        assertEquals("extName", attr.attribute().getName());
        assertTrue(attr.attribute().getValue() == null || attr.attribute().getValue().isEmpty());
    }
}
