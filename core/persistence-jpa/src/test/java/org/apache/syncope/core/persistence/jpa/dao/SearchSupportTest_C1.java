package org.apache.syncope.core.persistence.jpa.dao;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.apache.syncope.common.lib.types.AnyTypeKind;
import org.apache.syncope.core.persistence.jpa.entity.anyobject.JPAAnyObject;
import org.apache.syncope.core.persistence.jpa.entity.group.JPAGroup;
import org.apache.syncope.core.persistence.jpa.entity.user.JPAUser;
import org.junit.jupiter.api.Test;

public class SearchSupportTest {

    // TC1: Test with AnyTypeKind.USER
    @Test
    public void testUserSearchSupport() {
        SearchSupport support = new SearchSupport(AnyTypeKind.USER);

        assertEquals(JPAUser.TABLE, support.table().name());
        assertEquals("user_search", support.field().name());
        assertEquals("user_search_urelationship", support.relationship().name());
        assertEquals("user_search_umembership", support.membership().name());
        assertEquals("user_search_role", support.role().name());
        assertEquals("user_search_auxClass", support.auxClass().name());
        assertEquals("user_search_resource", support.resource().name());
        assertEquals("user_search_group_res", support.groupResource().name());
        assertEquals("user_search_entitlements", support.entitlements().name());
    }

    // TC2: Test with AnyTypeKind.GROUP
    @Test
    public void testGroupSearchSupport() {
        SearchSupport support = new SearchSupport(AnyTypeKind.GROUP);

        assertEquals(JPAGroup.TABLE, support.table().name());
        assertEquals("group_search", support.field().name());
        assertEquals("group_search_grelationship", support.relationship().name());
        assertEquals("group_search_amembership", support.membership().name());
    }

    // TC3: Test with AnyTypeKind.ANY_OBJECT
    @Test
    public void testAnyObjectSearchSupport() {
        SearchSupport support = new SearchSupport(AnyTypeKind.ANY_OBJECT);

        assertEquals(JPAAnyObject.TABLE, support.table().name());
        assertEquals("anyObject_search", support.field().name());
        assertEquals("anyObject_search_arelationship", support.relationship().name());
        assertEquals("anyObject_search_amembership", support.membership().name());
    }

    // TC4: Test with null AnyTypeKind (Boundary Condition)
    @Test
    public void testNullAnyTypeKind() {
        SearchSupport support = new SearchSupport(null);
        assertThrows(NullPointerException.class, support::table);
    }

    // TC5: Test asSearchViewSupport method
    @Test
    public void testAsSearchViewSupport() {
        SearchSupport support = new SearchSupport(AnyTypeKind.USER);
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, support::asSearchViewSupport);
        assertEquals("Not an class org.apache.syncope.core.persistence.jpa.dao.SearchViewSupport instance", exception.getMessage());
    }

    // White-box test to cover the true branch of `this instanceof SearchViewSupport`
    @Test
    public void testAsSearchViewSupportTrueBranch() {
        SearchSupport support = new SearchViewSupport(AnyTypeKind.USER);
        assertEquals(support, support.asSearchViewSupport());
    }
}
