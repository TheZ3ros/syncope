package org.apache.syncope.core.persistence.jpa.dao;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.apache.syncope.common.lib.types.AnyTypeKind;
import org.apache.syncope.core.persistence.jpa.entity.anyobject.JPAAnyObject;
import org.apache.syncope.core.persistence.jpa.entity.group.JPAGroup;
import org.apache.syncope.core.persistence.jpa.entity.user.JPAUser;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SearchSupportTestC4 {

    @Test
    @DisplayName("table() should return AnyObject table")
    void tableAnyObject() {
        SearchSupport support = new SearchSupport(AnyTypeKind.ANY_OBJECT);

        SearchSupport.SearchView result = support.table();

        assertEquals("t", result.alias());
        assertEquals(JPAAnyObject.TABLE, result.name());
    }

    @Test
    @DisplayName("table() should return Group table")
    void tableGroup() {
        SearchSupport support = new SearchSupport(AnyTypeKind.GROUP);

        SearchSupport.SearchView result = support.table();

        assertEquals("t", result.alias());
        assertEquals(JPAGroup.TABLE, result.name());
    }

    @Test
    @DisplayName("table() should return User table")
    void tableUser() {
        SearchSupport support = new SearchSupport(AnyTypeKind.USER);

        SearchSupport.SearchView result = support.table();

        assertEquals("t", result.alias());
        assertEquals(JPAUser.TABLE, result.name());
    }

    @Test
    void fieldAnyObject() {
        SearchSupport.SearchView result =
                new SearchSupport(AnyTypeKind.ANY_OBJECT).field();

        assertEquals("sv", result.alias());
        assertEquals("anyObject_search", result.name());
    }

    @Test
    void fieldGroup() {
        SearchSupport.SearchView result =
                new SearchSupport(AnyTypeKind.GROUP).field();

        assertEquals("sv", result.alias());
        assertEquals("group_search", result.name());
    }

    @Test
    void fieldUser() {
        SearchSupport.SearchView result =
                new SearchSupport(AnyTypeKind.USER).field();

        assertEquals("sv", result.alias());
        assertEquals("user_search", result.name());
    }

    @Test
    void relationshipAnyObject() {
        SearchSupport.SearchView result =
                new SearchSupport(AnyTypeKind.ANY_OBJECT).relationship();

        assertEquals("svam", result.alias());
        assertEquals("anyObject_search_arelationship", result.name());
    }

    @Test
    void relationshipGroup() {
        SearchSupport.SearchView result =
                new SearchSupport(AnyTypeKind.GROUP).relationship();

        assertEquals("svgm", result.alias());
        assertEquals("group_search_grelationship", result.name());
    }

    @Test
    void relationshipUser() {
        SearchSupport.SearchView result =
                new SearchSupport(AnyTypeKind.USER).relationship();

        assertEquals("svum", result.alias());
        assertEquals("user_search_urelationship", result.name());
    }

    @Test
    void membershipAnyObject() {
        SearchSupport.SearchView result =
                new SearchSupport(AnyTypeKind.ANY_OBJECT).membership();

        assertEquals("svam", result.alias());
        assertEquals("anyObject_search_amembership", result.name());
    }

    @Test
    void membershipGroup() {
        SearchSupport.SearchView result =
                new SearchSupport(AnyTypeKind.GROUP).membership();

        assertEquals("svam", result.alias());
        assertEquals("group_search_amembership", result.name());
    }

    @Test
    void membershipUser() {
        SearchSupport.SearchView result =
                new SearchSupport(AnyTypeKind.USER).membership();

        assertEquals("svum", result.alias());
        assertEquals("user_search_umembership", result.name());
    }

    @Test
    void role() {
        SearchSupport.SearchView result =
                new SearchSupport(AnyTypeKind.USER).role();

        assertEquals("svr", result.alias());
        assertEquals("user_search_role", result.name());
    }

    @Test
    void auxClass() {
        SearchSupport.SearchView result =
                new SearchSupport(AnyTypeKind.USER).auxClass();

        assertEquals("svac", result.alias());
        assertEquals("user_search_auxClass", result.name());
    }

    @Test
    void resource() {
        SearchSupport.SearchView result =
                new SearchSupport(AnyTypeKind.USER).resource();

        assertEquals("svr", result.alias());
        assertEquals("user_search_resource", result.name());
    }

    @Test
    void groupResource() {
        SearchSupport.SearchView result =
                new SearchSupport(AnyTypeKind.USER).groupResource();

        assertEquals("svrr", result.alias());
        assertEquals("user_search_group_res", result.name());
    }

    @Test
    void entitlements() {
        SearchSupport.SearchView result =
                new SearchSupport(AnyTypeKind.USER).entitlements();

        assertEquals("sve", result.alias());
        assertEquals("user_search_entitlements", result.name());
    }

    @Test
    void asSearchViewSupportShouldThrowException() {
        SearchSupport support = new SearchSupport(AnyTypeKind.USER);

        assertThrows(IllegalArgumentException.class,
                support::asSearchViewSupport);
    }

    @Test
    void asSearchViewSupportShouldReturnInstance() {
        SearchSupport support = new SearchSupportStub(AnyTypeKind.USER);

        SearchViewSupport result = support.asSearchViewSupport();

        assertInstanceOf(SearchViewSupport.class, result);
    }

    private static final class SearchSupportStub
            extends SearchViewSupport {

        SearchSupportStub(final AnyTypeKind anyTypeKind) {
            super(anyTypeKind);
        }
    }
}
