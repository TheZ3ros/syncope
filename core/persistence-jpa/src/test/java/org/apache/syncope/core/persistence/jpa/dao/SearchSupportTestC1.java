package org.apache.syncope.core.persistence.jpa.dao;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.apache.syncope.common.lib.types.AnyTypeKind;
import org.apache.syncope.core.persistence.jpa.entity.anyobject.JPAAnyObject;
import org.apache.syncope.core.persistence.jpa.entity.group.JPAGroup;
import org.apache.syncope.core.persistence.jpa.entity.user.JPAUser;
import org.junit.jupiter.api.Test;

class SearchSupportTestC1 {

    @Test
    void testTableForUser() {
        SearchSupport searchSupport = new SearchSupport(AnyTypeKind.USER);

        SearchSupport.SearchView view = searchSupport.table();

        assertEquals("t", view.alias());
        assertEquals(JPAUser.TABLE, view.name());
    }

    @Test
    void testTableForGroup() {
        SearchSupport searchSupport = new SearchSupport(AnyTypeKind.GROUP);

        SearchSupport.SearchView view = searchSupport.table();

        assertEquals("t", view.alias());
        assertEquals(JPAGroup.TABLE, view.name());
    }

    @Test
    void testTableForAnyObject() {
        SearchSupport searchSupport = new SearchSupport(AnyTypeKind.ANY_OBJECT);

        SearchSupport.SearchView view = searchSupport.table();

        assertEquals("t", view.alias());
        assertEquals(JPAAnyObject.TABLE, view.name());
    }

    @Test
    void testFieldForUser() {
        SearchSupport.SearchView view =
                new SearchSupport(AnyTypeKind.USER).field();

        assertEquals("sv", view.alias());
        assertEquals("user_search", view.name());
    }

    @Test
    void testFieldForGroup() {
        SearchSupport.SearchView view =
                new SearchSupport(AnyTypeKind.GROUP).field();

        assertEquals("sv", view.alias());
        assertEquals("group_search", view.name());
    }

    @Test
    void testFieldForAnyObject() {
        SearchSupport.SearchView view =
                new SearchSupport(AnyTypeKind.ANY_OBJECT).field();

        assertEquals("sv", view.alias());
        assertEquals("anyObject_search", view.name());
    }

    @Test
    void testRelationshipForUser() {
        SearchSupport.SearchView view =
                new SearchSupport(AnyTypeKind.USER).relationship();

        assertEquals("svum", view.alias());
        assertEquals("user_search_urelationship", view.name());
    }

    @Test
    void testRelationshipForGroup() {
        SearchSupport.SearchView view =
                new SearchSupport(AnyTypeKind.GROUP).relationship();

        assertEquals("svgm", view.alias());
        assertEquals("group_search_grelationship", view.name());
    }

    @Test
    void testRelationshipForAnyObject() {
        SearchSupport.SearchView view =
                new SearchSupport(AnyTypeKind.ANY_OBJECT).relationship();

        assertEquals("svam", view.alias());
        assertEquals("anyObject_search_arelationship", view.name());
    }

    @Test
    void testMembershipForUser() {
        SearchSupport.SearchView view =
                new SearchSupport(AnyTypeKind.USER).membership();

        assertEquals("svum", view.alias());
        assertEquals("user_search_umembership", view.name());
    }

    @Test
    void testMembershipForGroup() {
        SearchSupport.SearchView view =
                new SearchSupport(AnyTypeKind.GROUP).membership();

        assertEquals("svam", view.alias());
        assertEquals("group_search_amembership", view.name());
    }

    @Test
    void testMembershipForAnyObject() {
        SearchSupport.SearchView view =
                new SearchSupport(AnyTypeKind.ANY_OBJECT).membership();

        assertEquals("svam", view.alias());
        assertEquals("anyObject_search_amembership", view.name());
    }

    @Test
    void testRole() {
        SearchSupport.SearchView view =
                new SearchSupport(AnyTypeKind.USER).role();

        assertEquals("svr", view.alias());
        assertEquals("user_search_role", view.name());
    }

    @Test
    void testAuxClass() {
        SearchSupport.SearchView view =
                new SearchSupport(AnyTypeKind.USER).auxClass();

        assertEquals("svac", view.alias());
        assertEquals("user_search_auxClass", view.name());
    }

    @Test
    void testResource() {
        SearchSupport.SearchView view =
                new SearchSupport(AnyTypeKind.USER).resource();

        assertEquals("svr", view.alias());
        assertEquals("user_search_resource", view.name());
    }

    @Test
    void testGroupResource() {
        SearchSupport.SearchView view =
                new SearchSupport(AnyTypeKind.USER).groupResource();

        assertEquals("svrr", view.alias());
        assertEquals("user_search_group_res", view.name());
    }

    @Test
    void testEntitlements() {
        SearchSupport.SearchView view =
                new SearchSupport(AnyTypeKind.USER).entitlements();

        assertEquals("sve", view.alias());
        assertEquals("user_search_entitlements", view.name());
    }

    @Test
    void testAsSearchViewSupportThrowsException() {
        SearchSupport searchSupport =
                new SearchSupport(AnyTypeKind.USER);

        assertThrows(
                IllegalArgumentException.class,
                searchSupport::asSearchViewSupport);
    }
}
