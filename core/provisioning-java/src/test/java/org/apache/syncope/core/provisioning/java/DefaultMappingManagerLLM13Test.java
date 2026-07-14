package org.apache.syncope.core.provisioning.java;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.List;
import java.util.Optional;

import org.apache.syncope.common.lib.types.MappingPurpose;
import org.apache.syncope.core.persistence.api.entity.Realm;
import org.apache.syncope.core.persistence.api.entity.ExternalResource;
import org.apache.syncope.common.lib.to.Item;
import org.apache.syncope.common.lib.types.MappingPurpose;
import org.apache.syncope.common.lib.to.OrgUnit;
import org.apache.syncope.core.provisioning.api.jexl.JexlTools;
import org.apache.syncope.core.persistence.api.dao.UserDAO;
import org.apache.syncope.core.persistence.api.dao.AnyObjectDAO;
import org.apache.syncope.core.persistence.api.dao.GroupDAO;
import org.apache.syncope.core.persistence.api.dao.RelationshipTypeDAO;
import org.apache.syncope.core.persistence.api.dao.RealmSearchDAO;
import org.apache.syncope.core.provisioning.api.DerAttrHandler;
import org.apache.syncope.core.provisioning.api.IntAttrNameParser;
import org.apache.syncope.core.persistence.api.EncryptorManager;
import org.apache.syncope.core.persistence.api.dao.ImplementationDAO;
import org.apache.syncope.core.provisioning.api.MappingManager.PreparedAttrs;
import org.apache.syncope.core.provisioning.api.MappingManager.PreparedAttr;
import org.identityconnectors.framework.common.objects.AttributeBuilder;
import org.identityconnectors.framework.common.objects.AttributeUtil;
import org.identityconnectors.framework.common.objects.Name;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class DefaultMappingManagerLLM13Test {

    @Mock private UserDAO userDAO;
    @Mock private AnyObjectDAO anyObjectDAO;
    @Mock private GroupDAO groupDAO;
    @Mock private RelationshipTypeDAO relationshipTypeDAO;
    @Mock private RealmSearchDAO realmSearchDAO;
    @Mock private ImplementationDAO implementationDAO;
    @Mock private DerAttrHandler derAttrHandler;
    @Mock private IntAttrNameParser intAttrNameParser;
    @Mock private EncryptorManager encryptorManager;
    @Mock private JexlTools jexlTools;

    @Mock private Realm realm;
    @Mock private ExternalResource resource;
    @Mock private OrgUnit orgUnit;

    private DefaultMappingManager mappingManager;

    @BeforeEach
    void setUp() {
        mappingManager = Mockito.spy(new DefaultMappingManager(
                userDAO,
                anyObjectDAO,
                groupDAO,
                relationshipTypeDAO,
                realmSearchDAO,
                implementationDAO,
                derAttrHandler,
                intAttrNameParser,
                encryptorManager,
                jexlTools));
    }

    @Test
    void shouldReturnEmptyPreparedAttrsWhenOrgUnitIsMissing() {
        when(resource.getOrgUnit()).thenReturn(null);

        PreparedAttrs result = mappingManager.prepareAttrsFromRealm(realm, resource);

        assertNull(result.connObjectLink());
        assertTrue(result.attributes().isEmpty());
    }

    @Test
    void shouldAddNameAttributeAndConnObjectKeyWhenPresent() {
        // We mock Item interface since it's likely an interface in Syncope (or a POJO if concrete).
        // Let's use mock() for Item if it's an interface, or just a new Item() if it's concrete.
        // Wait, Copilot used new Item(), but Item is an interface in Syncope usually.
        // Let's see if this compiles. If not, we'll fix it.
        Item connObjectKeyItem = new Item();
        connObjectKeyItem.setConnObjectKey(true);
        connObjectKeyItem.setExtAttrName("uid");
        connObjectKeyItem.setPurpose(MappingPurpose.PROPAGATION);

        when(resource.getOrgUnit()).thenReturn(orgUnit);
        when(orgUnit.getItems()).thenReturn(List.of(connObjectKeyItem));
        when(orgUnit.getConnObjectKeyItem()).thenReturn(Optional.of(connObjectKeyItem));
        when(orgUnit.getConnObjectLink()).thenReturn(null);

        doReturn(new PreparedAttr("realm-key", null))
                .when(mappingManager)
                .prepareAttr(resource, connObjectKeyItem, realm);

        PreparedAttrs result = mappingManager.prepareAttrsFromRealm(realm, resource);

        assertEquals("realm-key", result.connObjectLink());
        assertNotNull(AttributeUtil.find(Name.NAME, result.attributes()));
        assertNull(AttributeUtil.find("uid", result.attributes()));
    }

    @Test
    void shouldMergePreparedAttributeAndconnObjectLink() {
        Item attrItem = new Item();
        attrItem.setExtAttrName("cn");
        attrItem.setPurpose(MappingPurpose.PROPAGATION);

        Item connObjectKeyItem = new Item();
        connObjectKeyItem.setConnObjectKey(true);
        connObjectKeyItem.setExtAttrName("uid");
        connObjectKeyItem.setPurpose(MappingPurpose.PROPAGATION);

        when(resource.getOrgUnit()).thenReturn(orgUnit);
        when(orgUnit.getItems()).thenReturn(List.of(attrItem, connObjectKeyItem));
        when(orgUnit.getConnObjectKeyItem()).thenReturn(Optional.of(connObjectKeyItem));
        when(orgUnit.getConnObjectLink()).thenReturn(null);

        doReturn(new PreparedAttr(
                null,
                AttributeBuilder.build("cn", "realmName")))
                .when(mappingManager)
                .prepareAttr(resource, attrItem, realm);

        doReturn(new PreparedAttr("realm-key", null))
                .when(mappingManager)
                .prepareAttr(resource, connObjectKeyItem, realm);

        PreparedAttrs result = mappingManager.prepareAttrsFromRealm(realm, resource);

        assertEquals("realm-key", result.connObjectLink());
        assertNotNull(AttributeUtil.find("cn", result.attributes()));
        assertNotNull(AttributeUtil.find(Name.NAME, result.attributes()));
        assertEquals(2, result.attributes().size()); // cn + __NAME__
    }
}






