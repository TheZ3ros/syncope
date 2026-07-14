package org.apache.syncope.core.provisioning.java;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

import org.apache.syncope.common.lib.to.Item;
import org.apache.syncope.common.lib.to.OrgUnit;
import org.apache.syncope.common.lib.types.MappingPurpose;
import org.apache.syncope.core.persistence.api.entity.Realm;
import org.apache.syncope.core.persistence.api.entity.ExternalResource;
import org.apache.syncope.core.provisioning.api.MappingManager;
import org.identityconnectors.framework.common.objects.Attribute;
import org.identityconnectors.framework.common.objects.AttributeBuilder;
import org.identityconnectors.framework.common.objects.AttributeUtil;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import java.util.Optional;

@ExtendWith(MockitoExtension.class)
public class DefaultMappingManagerLLM32Test {

    @Mock
    private org.apache.syncope.core.persistence.api.dao.UserDAO userDAO;
    @Mock
    private org.apache.syncope.core.persistence.api.dao.AnyObjectDAO anyObjectDAO;
    @Mock
    private org.apache.syncope.core.persistence.api.dao.GroupDAO groupDAO;
    @Mock
    private org.apache.syncope.core.persistence.api.dao.RelationshipTypeDAO relationshipTypeDAO;
    @Mock
    private org.apache.syncope.core.persistence.api.dao.RealmSearchDAO realmSearchDAO;
    @Mock
    private org.apache.syncope.core.persistence.api.dao.ImplementationDAO implementationDAO;
    @Mock
    private org.apache.syncope.core.provisioning.api.DerAttrHandler derAttrHandler;
    @Mock
    private org.apache.syncope.core.provisioning.api.IntAttrNameParser intAttrNameParser;
    @Mock
    private org.apache.syncope.core.provisioning.api.jexl.JexlTools jexlTools;

    @Mock
    private org.apache.syncope.core.persistence.api.EncryptorManager encryptorManager;

    private DefaultMappingManager manager;

    @BeforeEach
    void setUp() {
        DefaultMappingManager realManager = new DefaultMappingManager(
                userDAO,
                anyObjectDAO,
                groupDAO,
                relationshipTypeDAO,
                realmSearchDAO,
                implementationDAO,
                derAttrHandler,
                intAttrNameParser,
                encryptorManager,
                jexlTools
        );
        manager = spy(realManager);
    }

    @Test
    void shouldReturnEmptyPreparedAttrsWhenOrgUnitIsNull() {
        ExternalResource resource = mock(ExternalResource.class);
        Realm realm = mock(Realm.class);
        when(resource.getOrgUnit()).thenReturn(null);

        MappingManager.PreparedAttrs result = manager.prepareAttrsFromRealm(realm, resource);

        assertNull(result.connObjectLink());
        assertTrue(result.attributes().isEmpty());
    }

    @Test
    void shouldAddPreparedAttribute() throws Exception {
        ExternalResource resource = mock(ExternalResource.class);
        Realm realm = mock(Realm.class);
        OrgUnit orgUnit = new OrgUnit();
        Item item = new Item();
        item.setPurpose(MappingPurpose.PROPAGATION);
        orgUnit.getItems().add(item);
        when(resource.getOrgUnit()).thenReturn(orgUnit);

        Attribute attr = AttributeBuilder.build("email", "test@example.com");
        MappingManager.PreparedAttr prepared = new MappingManager.PreparedAttr(null, attr);

        doReturn(prepared).when(manager).prepareAttr(resource, item, realm);

        MappingManager.PreparedAttrs result = manager.prepareAttrsFromRealm(realm, resource);

        assertEquals(1, result.attributes().size());
        assertNotNull(AttributeUtil.find("email", result.attributes()));
    }

    @Test
    void shouldStoreConnObjectKeyValue() throws Exception {
        ExternalResource resource = mock(ExternalResource.class);
        Realm realm = mock(Realm.class);
        OrgUnit orgUnit = mock(OrgUnit.class);
        Item item = new Item();
        item.setPurpose(MappingPurpose.PROPAGATION);

        when(orgUnit.getItems()).thenReturn(List.of(item));
        when(orgUnit.getConnObjectKeyItem()).thenReturn(Optional.empty()); // non rilevante per il test se prepared fornisce link
        when(resource.getOrgUnit()).thenReturn(orgUnit);

        MappingManager.PreparedAttr prepared = new MappingManager.PreparedAttr("realmKey", null);

        doReturn(prepared).when(manager).prepareAttr(resource, item, realm);

        MappingManager.PreparedAttrs result = manager.prepareAttrsFromRealm(realm, resource);

        assertEquals("realmKey", result.connObjectLink());
    }

    @Test
    void shouldIgnoreFailingItemAndContinue() throws Exception {
        ExternalResource resource = mock(ExternalResource.class);
        Realm realm = mock(Realm.class);
        OrgUnit orgUnit = mock(OrgUnit.class);
        Item item = new Item();
        item.setPurpose(MappingPurpose.PROPAGATION);

        when(orgUnit.getItems()).thenReturn(List.of(item));
        when(orgUnit.getConnObjectKeyItem()).thenReturn(Optional.empty());
        when(resource.getOrgUnit()).thenReturn(orgUnit);

        doThrow(new RuntimeException("boom")).when(manager).prepareAttr(resource, item, realm);

        assertDoesNotThrow(() -> manager.prepareAttrsFromRealm(realm, resource));

        MappingManager.PreparedAttrs result = manager.prepareAttrsFromRealm(realm, resource);

        assertTrue(result.attributes().isEmpty());
    }
}
