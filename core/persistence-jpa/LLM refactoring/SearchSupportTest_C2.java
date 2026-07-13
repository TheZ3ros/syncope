package org.apache.syncope.core.persistence.jpa.dao;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.apache.syncope.common.lib.types.AnyTypeKind;
import org.apache.syncope.core.persistence.jpa.entity.anyobject.JPAAnyObject;
import org.apache.syncope.core.persistence.jpa.entity.group.JPAGroup;
import org.apache.syncope.core.persistence.jpa.entity.user.JPAUser;
import org.junit.jupiter.api.Test;

class SearchSupportTest_C2 {

    @Test
    void tableForAnyObject() {
        SearchSupport.SearchView view =
                new SearchSupport(AnyTypeKind.ANY_OBJECT).table();

        assertEquals("t", view.alias());
        assertEquals(JPAAnyObject.TABLE, view.name());
    }

    @Test
    void tableForGroup() {
        SearchSupport.SearchView view =
                new SearchSupport(AnyTypeKind.GROUP).table();

        assertEquals("t", view.alias());
        assertEquals(JPAGroup.TABLE, view.name());
    }

    @Test
    void tableForUser() {
        SearchSupport.SearchView view =
                new SearchSupport(AnyTypeKind.USER).table();

        assertEquals("t", view.alias());
        assertEquals(JPAUser.TABLE, view.name());
    }

    @Test
    void fieldForAnyObject() {
        SearchSupport.SearchView view =
                new SearchSupport(AnyTypeKind.ANY_OBJECT).field();

        assertEquals("sv", view.alias());
        assertEquals("anyObject_search", view.name());
    }

    @Test
    void fieldForGroup() {
        SearchSupport.SearchView view =
                new SearchSupport(AnyTypeKind.GROUP).field();

        assertEquals("sv", view.alias());
        assertEquals("group_search", view.name());
    }

    @Test
    void fieldForUser() {
        SearchSupport.SearchView view =
                new SearchSupport(AnyTypeKind.USER).field();

        assertEquals("sv", view.alias());
        assertEquals("user_search", view.name());
    }

    @Test
    void relationshipForUser() {
        SearchSupport.SearchView view =
                new SearchSupport(AnyTypeKind.USER).relationship();

        assertEquals("svum", view.alias());
        assertEquals("user_search_urelationship", view.name());
    }

    @Test
    void relationshipForGroup() {
        SearchSupport.SearchView view =
                new SearchSupport(AnyTypeKind.GROUP).relationship();

        assertEquals("svgm", view.alias());
        assertEquals("group_search_grelationship", view.name());
    }

    @Test
    void relationshipForAnyObject() {
        SearchSupport.SearchView view =
                new SearchSupport(AnyTypeKind.ANY_OBJECT).relationship();

        assertEquals("svam", view.alias());
        assertEquals("anyObject_search_arelationship", view.name());
    }

    @Test
    void membershipForUser() {
        SearchSupport.SearchView view =
                new SearchSupport(AnyTypeKind.USER).membership();

        assertEquals("svum", view.alias());
        assertEquals("user_search_umembership", view.name());
    }

    @Test
    void membershipForGroup() {
        SearchSupport.SearchView view =
                new SearchSupport(AnyTypeKind.GROUP).membership();

        assertEquals("svam", view.alias());
        assertEquals("group_search_amembership", view.name());
    }

    @Test
    void membershipForAnyObject() {
        SearchSupport.SearchView view =
                new SearchSupport(AnyTypeKind.ANY_OBJECT).membership();

        assertEquals("svam", view.alias());
        assertEquals("anyObject_search_amembership", view.name());
    }

    @Test
    void roleForUser() {
        SearchSupport.SearchView view =
                new SearchSupport(AnyTypeKind.USER).role();

        assertEquals("svr", view.alias());
        assertEquals("user_search_role", view.name());
    }

    @Test
    void auxClassForGroup() {
        SearchSupport.SearchView view =
                new SearchSupport(AnyTypeKind.GROUP).auxClass();

        assertEquals("svac", view.alias());
        assertEquals("group_search_auxClass", view.name());
    }

    @Test
    void resourceForAnyObject() {
        SearchSupport.SearchView view =
                new SearchSupport(AnyTypeKind.ANY_OBJECT).resource();

        assertEquals("svr", view.alias());
        assertEquals("anyObject_search_resource", view.name());
    }

    @Test
    void groupResourceForUser() {
        SearchSupport.SearchView view =
                new SearchSupport(AnyTypeKind.USER).groupResource();

        assertEquals("svrr", view.alias());
        assertEquals("user_search_group_res", view.name());
    }

    @Test
    void entitlementsForUser() {
        SearchSupport.SearchView view =
                new SearchSupport(AnyTypeKind.USER).entitlements();

        assertEquals("sve", view.alias());
        assertEquals("user_search_entitlements", view.name());
    }

    @Test
    void asSearchViewSupportThrowsExceptionWhenNotSearchViewSupport() {
        SearchSupport support = new SearchSupport(AnyTypeKind.USER);

        assertThrows(
                IllegalArgumentException.class,
                support::asSearchViewSupport);
    }

    @Test
    void asSearchViewSupportReturnsInstance() {
        DummySearchViewSupport support =
                new DummySearchViewSupport(AnyTypeKind.USER);

        assertInstanceOf(
                SearchViewSupport.class,
                support.asSearchViewSupport());
    }

    private static class DummySearchViewSupport
            extends SearchViewSupport {

        DummySearchViewSupport(final AnyTypeKind anyTypeKind) {
            super(anyTypeKind);
        }
    }
}