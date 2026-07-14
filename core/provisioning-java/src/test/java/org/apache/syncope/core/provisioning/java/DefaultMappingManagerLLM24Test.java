package org.apache.syncope.core.provisioning.java;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.Optional;

import org.apache.syncope.common.lib.to.Item;
import org.apache.syncope.common.lib.to.OrgUnit;
import org.apache.syncope.common.lib.types.MappingPurpose;
import org.apache.syncope.core.persistence.api.EncryptorManager;
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
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class DefaultMappingManagerLLM24Test {

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

    private DefaultMappingManager mappingManager;

    @BeforeEach
    void setup() {
        mappingManager = new DefaultMappingManager(
                userDAO,
                anyObjectDAO,
                groupDAO,
                relationshipTypeDAO,
                realmSearchDAO,
                implementationDAO,
                derAttrHandler,
                intAttrNameParser,
                encryptorManager,
                jexlTools);
    }

    @Test
    public void testEmptyIntAttrName() throws Exception {
        ExternalResource resource = mock(ExternalResource.class);
        OrgUnit orgUnit = mock(OrgUnit.class);

        Item item = new Item();
        item.setIntAttrName("");
        item.setExtAttrName("ext");
        item.setPurpose(MappingPurpose.PROPAGATION);

        when(orgUnit.getItems()).thenReturn(java.util.List.of(item));
        when(orgUnit.getConnObjectKeyItem()).thenReturn(Optional.of(item));
        when(resource.getOrgUnit()).thenReturn(orgUnit);

        Realm realm = mock(Realm.class);
        when(intAttrNameParser.parse("")).thenThrow(new java.text.ParseException("Empty string", 0));

        assertDoesNotThrow(() ->
                mappingManager.prepareAttrsFromRealm(realm, resource));
    }

    @Test
    public void testEmptyExtAttrNameOnConnObjectKey() {
        ExternalResource resource = mock(ExternalResource.class);
        OrgUnit orgUnit = mock(OrgUnit.class);
        Realm realm = mock(Realm.class);

        lenient().when(realm.getName()).thenReturn("realm");

        Item item = new Item();
        item.setIntAttrName("name");
        item.setExtAttrName("");
        item.setConnObjectKey(true);
        item.setPurpose(MappingPurpose.PROPAGATION);

        when(orgUnit.getItems()).thenReturn(java.util.List.of(item));
        when(orgUnit.getConnObjectKeyItem()).thenReturn(Optional.of(item));
        when(resource.getOrgUnit()).thenReturn(orgUnit);

        assertDoesNotThrow(
                () -> mappingManager.prepareAttrsFromRealm(realm, resource));
    }

    @Test
    public void testNonPropagationPurpose() {
        ExternalResource resource = mock(ExternalResource.class);
        OrgUnit orgUnit = mock(OrgUnit.class);

        Item item = new Item();
        item.setIntAttrName("name");
        item.setPurpose(MappingPurpose.PULL);

        when(orgUnit.getItems()).thenReturn(java.util.List.of(item));
        when(orgUnit.getConnObjectKeyItem()).thenReturn(Optional.empty());
        when(resource.getOrgUnit()).thenReturn(orgUnit);

        Realm realm = mock(Realm.class);

        assertDoesNotThrow(() ->
                mappingManager.prepareAttrsFromRealm(realm, resource));
    }
}


