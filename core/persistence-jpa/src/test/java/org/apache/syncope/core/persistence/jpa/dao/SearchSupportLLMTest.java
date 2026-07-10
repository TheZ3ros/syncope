package org.apache.syncope.core.persistence.jpa.dao;

import static org.junit.jupiter.api.Assertions.*;

import org.apache.syncope.common.lib.types.AnyTypeKind;
import org.apache.syncope.core.persistence.jpa.entity.anyobject.JPAAnyObject;
import org.apache.syncope.core.persistence.jpa.entity.group.JPAGroup;
import org.apache.syncope.core.persistence.jpa.entity.user.JPAUser;
import org.junit.jupiter.api.Test;

class SearchSupportLLMTest {

    @Test
    void testTableWithUser() {
        SearchSupport support = new SearchSupport(AnyTypeKind.USER);

        SearchSupport.SearchView result = support.table();

        assertEquals("t", result.alias());
        assertEquals(JPAUser.TABLE, result.name());
    }

    @Test
    void testTableWithGroup() {
        SearchSupport support = new SearchSupport(AnyTypeKind.GROUP);

        SearchSupport.SearchView result = support.table();

        assertEquals("t", result.alias());
        assertEquals(JPAGroup.TABLE, result.name());
    }

    @Test
    void testTableWithAnyObject() {
        SearchSupport support = new SearchSupport(AnyTypeKind.ANY_OBJECT);

        SearchSupport.SearchView result = support.table();

        assertEquals("t", result.alias());
        assertEquals(JPAAnyObject.TABLE, result.name());
    }

    @Test
    void testFieldWithUser() {
        SearchSupport support = new SearchSupport(AnyTypeKind.USER);

        SearchSupport.SearchView result = support.field();

        assertEquals("sv", result.alias());
        assertEquals("user_search", result.name());
    }

    @Test
    void testFieldWithGroup() {
        SearchSupport support = new SearchSupport(AnyTypeKind.GROUP);

        SearchSupport.SearchView result = support.field();

        assertEquals("sv", result.alias());
        assertEquals("group_search", result.name());
    }

    @Test
    void testFieldWithAnyObject() {
        SearchSupport support = new SearchSupport(AnyTypeKind.ANY_OBJECT);

        SearchSupport.SearchView result = support.field();

        assertEquals("sv", result.alias());
        assertEquals("anyObject_search", result.name());
    }

    @Test
    void testRelationshipWithUser() {
        SearchSupport support = new SearchSupport(AnyTypeKind.USER);

        SearchSupport.SearchView result = support.relationship();

        assertEquals("svum", result.alias());
        assertEquals("user_search_urelationship", result.name());
    }

    @Test
    void testRelationshipWithGroup() {
        SearchSupport support = new SearchSupport(AnyTypeKind.GROUP);

        SearchSupport.SearchView result = support.relationship();

        assertEquals("svgm", result.alias());
        assertEquals("group_search_grelationship", result.name());
    }

    @Test
    void testRelationshipWithAnyObject() {
        SearchSupport support = new SearchSupport(AnyTypeKind.ANY_OBJECT);

        SearchSupport.SearchView result = support.relationship();

        assertEquals("svam", result.alias());
        assertEquals("anyObject_search_arelationship", result.name());
    }

    @Test
    void testMembershipWithUser() {
        SearchSupport support = new SearchSupport(AnyTypeKind.USER);

        SearchSupport.SearchView result = support.membership();

        assertEquals("svum", result.alias());
        assertEquals("user_search_umembership", result.name());
    }

    @Test
    void testMembershipWithAnyObject() {
        SearchSupport support = new SearchSupport(AnyTypeKind.ANY_OBJECT);

        SearchSupport.SearchView result = support.membership();

        assertEquals("svam", result.alias());
        assertEquals("anyObject_search_amembership", result.name());
    }

    @Test
    void testRole() {
        SearchSupport support = new SearchSupport(AnyTypeKind.USER);

        SearchSupport.SearchView result = support.role();

        assertEquals("svr", result.alias());
        assertEquals("user_search_role", result.name());
    }

    @Test
    void testAuxClass() {
        SearchSupport support = new SearchSupport(AnyTypeKind.USER);

        SearchSupport.SearchView result = support.auxClass();

        assertEquals("svac", result.alias());
        assertEquals("user_search_auxClass", result.name());
    }

    @Test
    void testResource() {
        SearchSupport support = new SearchSupport(AnyTypeKind.USER);

        SearchSupport.SearchView result = support.resource();

        assertEquals("svr", result.alias());
        assertEquals("user_search_resource", result.name());
    }

    @Test
    void testGroupResource() {
        SearchSupport support = new SearchSupport(AnyTypeKind.USER);

        SearchSupport.SearchView result = support.groupResource();

        assertEquals("svrr", result.alias());
        assertEquals("user_search_group_res", result.name());
    }

    @Test
    void testEntitlements() {
        SearchSupport support = new SearchSupport(AnyTypeKind.USER);

        SearchSupport.SearchView result = support.entitlements();

        assertEquals("sve", result.alias());
        assertEquals("user_search_entitlements", result.name());
    }

    @Test
    void testAsSearchViewSupportWhenInstanceIsSearchViewSupport() {
        SearchViewSupport support = new SearchViewSupport(AnyTypeKind.USER);

        assertSame(support, support.asSearchViewSupport());
    }

    @Test
    void testAsSearchViewSupportThrowsExceptionWhenNotSearchViewSupport() {
        SearchSupport support = new SearchSupport(AnyTypeKind.USER);

        IllegalArgumentException ex =
                assertThrows(IllegalArgumentException.class, support::asSearchViewSupport);

        assertTrue(ex.getMessage().contains("SearchViewSupport"));
    }

    @Test
    void testTableWithNullAnyTypeKindThrowsException() {
        SearchSupport support = new SearchSupport(null);

        assertThrows(NullPointerException.class, support::table);
    }

    @Test
    void testFieldWithNullAnyTypeKindThrowsException() {
        SearchSupport support = new SearchSupport(null);

        assertThrows(NullPointerException.class, support::field);
    }

    @Test
    void testRelationshipWithNullAnyTypeKindFallsBackToAnyObjectBranch() {
        SearchSupport support = new SearchSupport(null);

        assertThrows(NullPointerException.class, support::relationship);
    }
}
