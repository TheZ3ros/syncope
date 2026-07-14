package org.apache.syncope.core.provisioning.java;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.same;
import static org.mockito.Mockito.*;

import java.util.Set;
import org.apache.syncope.common.lib.to.Item;
import org.apache.syncope.common.lib.types.MappingPurpose;
import org.apache.syncope.common.lib.to.OrgUnit;
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
import org.apache.syncope.core.provisioning.api.IntAttrName;
import org.apache.syncope.core.provisioning.api.IntAttrNameParser;
import org.apache.syncope.core.provisioning.api.MappingManager.PreparedAttr;
import org.apache.syncope.core.provisioning.api.MappingManager.PreparedAttrs;
import org.apache.syncope.core.provisioning.api.jexl.JexlTools;
import org.identityconnectors.framework.common.objects.Attribute;
import org.identityconnectors.framework.common.objects.AttributeBuilder;
import org.identityconnectors.framework.common.objects.AttributeUtil;
import org.identityconnectors.framework.common.objects.Name;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class DefaultMappingManagerLLM14Test {

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
    @DisplayName("Should return empty PreparedAttrs when OrgUnit is not configured")
    void shouldReturnEmptyPreparedAttrsWhenNoOrgUnit() {
        ExternalResource resource = mock(ExternalResource.class);
        when(resource.getOrgUnit()).thenReturn(null);

        PreparedAttrs result =
                mappingManager.prepareAttrsFromRealm(mock(Realm.class), resource);

        assertNull(result.connObjectLink());
        assertTrue(result.attributes().isEmpty());
    }

    @Test
    @DisplayName("Should process OrgUnit items and generate attributes")
    void shouldPrepareAttributesFromRealm() throws Exception {
        Realm realm = mock(Realm.class);

        when(realm.getName()).thenReturn("ROOT");
        lenient().when(realm.getKey()).thenReturn("realm-key");
        lenient().when(realm.getFullPath()).thenReturn("/ROOT");

        Item connObjectKeyItem = new Item();
        connObjectKeyItem.setIntAttrName("name");
        connObjectKeyItem.setExtAttrName("uid");
        connObjectKeyItem.setConnObjectKey(true);
        connObjectKeyItem.setPurpose(MappingPurpose.PROPAGATION);

        Item normalItem = new Item();
        normalItem.setIntAttrName("fullPath");
        normalItem.setExtAttrName("path");
        normalItem.setPurpose(MappingPurpose.PROPAGATION);

        OrgUnit orgUnit = new OrgUnit();
        orgUnit.setConnObjectLink(null);
        orgUnit.getItems().add(connObjectKeyItem);
        orgUnit.getItems().add(normalItem);

        ExternalResource resource = mock(ExternalResource.class);
        when(resource.getOrgUnit()).thenReturn(orgUnit);

        IntAttrName nameAttr = mock(IntAttrName.class);
        IntAttrName pathAttr = mock(IntAttrName.class);

        when(nameAttr.getField()).thenReturn("name");
        when(nameAttr.getSchemaInfo()).thenReturn(null);

        when(pathAttr.getField()).thenReturn("fullPath");
        when(pathAttr.getSchemaInfo()).thenReturn(null);

        when(intAttrNameParser.parse("name")).thenReturn(nameAttr);
        when(intAttrNameParser.parse("fullPath")).thenReturn(pathAttr);

        PreparedAttrs attrs = mappingManager.prepareAttrsFromRealm(realm, resource);

        assertNotNull(attrs);
        assertEquals("ROOT", attrs.connObjectLink());

        Attribute nameAttrGenerated = AttributeUtil.find("path", attrs.attributes());
        assertNotNull(nameAttrGenerated);
        assertEquals("/ROOT", nameAttrGenerated.getValue().get(0));

        Name generatedName = attrs.attributes().stream()
                .filter(Name.class::isInstance)
                .map(Name.class::cast)
                .findFirst()
                .orElse(null);

        assertNotNull(generatedName);
        assertEquals("ROOT", generatedName.getNameValue());
    }

    @Test
    @DisplayName("Should invoke prepareAttr for every OrgUnit item")
    void shouldInvokePrepareAttrForEachItem() throws Exception {
        DefaultMappingManager spy = Mockito.spy(mappingManager);
        Realm realm = mock(Realm.class);

        Item item1 = new Item();
        item1.setIntAttrName("name");
        item1.setExtAttrName("name");
        item1.setPurpose(MappingPurpose.PROPAGATION);

        Item item2 = new Item();
        item2.setIntAttrName("fullPath");
        item2.setExtAttrName("path");
        item2.setPurpose(MappingPurpose.PROPAGATION);

        OrgUnit orgUnit = new OrgUnit();
        orgUnit.getItems().add(item1);
        orgUnit.getItems().add(item2);

        ExternalResource resource = mock(ExternalResource.class);
        when(resource.getOrgUnit()).thenReturn(orgUnit);

        doReturn(new PreparedAttr(null, AttributeBuilder.build("name", "value")))
                .when(spy).prepareAttr(same(resource), same(item1), same(realm));
        doReturn(new PreparedAttr(null, AttributeBuilder.build("path", "/ROOT")))
                .when(spy).prepareAttr(same(resource), same(item2), same(realm));

        spy.prepareAttrsFromRealm(realm, resource);

        verify(spy, times(1)).prepareAttr(resource, item1, realm);
        verify(spy, times(1)).prepareAttr(resource, item2, realm);
    }

    @Test
    @DisplayName("Should continue processing when an item throws exception")
    void shouldIgnoreFaultyItem() {
        DefaultMappingManager spy = Mockito.spy(mappingManager);
        Realm realm = mock(Realm.class);

        Item item = new Item();
        item.setIntAttrName("name");
        item.setPurpose(MappingPurpose.PROPAGATION);

        OrgUnit orgUnit = new OrgUnit();
        orgUnit.getItems().add(item);

        ExternalResource resource = mock(ExternalResource.class);
        when(resource.getOrgUnit()).thenReturn(orgUnit);

        doThrow(new RuntimeException("boom")).when(spy).prepareAttr(resource, item, realm);

        PreparedAttrs result = spy.prepareAttrsFromRealm(realm, resource);

        assertNotNull(result);
        assertTrue(result.attributes().isEmpty());
    }
}



