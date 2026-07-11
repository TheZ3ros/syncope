package org.apache.syncope.core.persistence.jpa.dao;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.apache.syncope.common.lib.types.AnyTypeKind;
import org.apache.syncope.core.persistence.jpa.entity.anyobject.JPAAnyObject;
import org.apache.syncope.core.persistence.jpa.entity.group.JPAGroup;
import org.apache.syncope.core.persistence.jpa.entity.user.JPAUser;
import org.junit.jupiter.api.Test;

class SearchSupportFewShotTest {

    @Test
    void testTable_User() {
        SearchSupport support = new SearchSupport(AnyTypeKind.USER);
        SearchSupport.SearchView view = support.table();
        assertEquals(JPAUser.TABLE, view.name());
        assertEquals("t", view.alias());
    }

    @Test
    void testTable_Group() {
        SearchSupport support = new SearchSupport(AnyTypeKind.GROUP);
        SearchSupport.SearchView view = support.table();
        assertEquals(JPAGroup.TABLE, view.name());
        assertEquals("t", view.alias());
    }

    @Test
    void testTable_AnyObject() {
        SearchSupport support = new SearchSupport(AnyTypeKind.ANY_OBJECT);
        SearchSupport.SearchView view = support.table();
        assertEquals(JPAAnyObject.TABLE, view.name());
        assertEquals("t", view.alias());
    }

    @Test
    void testField_User() {
        SearchSupport support = new SearchSupport(AnyTypeKind.USER);
        SearchSupport.SearchView view = support.field();
        assertEquals("user_search", view.name());
        assertEquals("sv", view.alias());
    }

    @Test
    void testField_Group() {
        SearchSupport support = new SearchSupport(AnyTypeKind.GROUP);
        SearchSupport.SearchView view = support.field();
        assertEquals("group_search", view.name());
        assertEquals("sv", view.alias());
    }

    @Test
    void testField_AnyObject() {
        SearchSupport support = new SearchSupport(AnyTypeKind.ANY_OBJECT);
        SearchSupport.SearchView view = support.field();
        assertEquals("anyObject_search", view.name());
        assertEquals("sv", view.alias());
    }

    @Test
    void testRelationship_User() {
        SearchSupport support = new SearchSupport(AnyTypeKind.USER);
        SearchSupport.SearchView view = support.relationship();
        assertEquals("user_search_urelationship", view.name());
        assertEquals("svum", view.alias());
    }

    @Test
    void testRelationship_Group() {
        SearchSupport support = new SearchSupport(AnyTypeKind.GROUP);
        SearchSupport.SearchView view = support.relationship();
        assertEquals("group_search_grelationship", view.name());
        assertEquals("svgm", view.alias());
    }

    @Test
    void testRelationship_AnyObject() {
        SearchSupport support = new SearchSupport(AnyTypeKind.ANY_OBJECT);
        SearchSupport.SearchView view = support.relationship();
        assertEquals("anyObject_search_arelationship", view.name());
        assertEquals("svam", view.alias());
    }

    @Test
    void testMembership_User() {
        SearchSupport support = new SearchSupport(AnyTypeKind.USER);
        SearchSupport.SearchView view = support.membership();
        assertEquals("user_search_umembership", view.name());
        assertEquals("svum", view.alias());
    }

    @Test
    void testMembership_Group() {
        SearchSupport support = new SearchSupport(AnyTypeKind.GROUP);
        SearchSupport.SearchView view = support.membership();
        assertEquals("group_search_amembership", view.name());
        assertEquals("svam", view.alias());
    }

    @Test
    void testMembership_AnyObject() {
        SearchSupport support = new SearchSupport(AnyTypeKind.ANY_OBJECT);
        SearchSupport.SearchView view = support.membership();
        assertEquals("anyObject_search_amembership", view.name());
        assertEquals("svam", view.alias());
    }

    @Test
    void testRole_User() {
        SearchSupport support = new SearchSupport(AnyTypeKind.USER);
        SearchSupport.SearchView view = support.role();
        assertEquals("user_search_role", view.name());
        assertEquals("svr", view.alias());
    }

    @Test
    void testAuxClass_User() {
        SearchSupport support = new SearchSupport(AnyTypeKind.USER);
        SearchSupport.SearchView view = support.auxClass();
        assertEquals("user_search_auxClass", view.name());
        assertEquals("svac", view.alias());
    }

    @Test
    void testResource_User() {
        SearchSupport support = new SearchSupport(AnyTypeKind.USER);
        SearchSupport.SearchView view = support.resource();
        assertEquals("user_search_resource", view.name());
        assertEquals("svr", view.alias());
    }

    @Test
    void testGroupResource_User() {
        SearchSupport support = new SearchSupport(AnyTypeKind.USER);
        SearchSupport.SearchView view = support.groupResource();
        assertEquals("user_search_group_res", view.name());
        assertEquals("svrr", view.alias());
    }

    @Test
    void testEntitlements_User() {
        SearchSupport support = new SearchSupport(AnyTypeKind.USER);
        SearchSupport.SearchView view = support.entitlements();
        assertEquals("user_search_entitlements", view.name());
        assertEquals("sve", view.alias());
    }

    @Test
    void testAsSearchViewSupportException() {
        SearchSupport support = new SearchSupport(AnyTypeKind.USER);

        assertThrows(
                IllegalArgumentException.class,
                support::asSearchViewSupport);
    }

    @Test
    void testAsSearchViewSupport() {
        SearchViewSupport support = new SearchViewSupport(AnyTypeKind.USER);

        assertEquals(support, support.asSearchViewSupport());
    }
}
