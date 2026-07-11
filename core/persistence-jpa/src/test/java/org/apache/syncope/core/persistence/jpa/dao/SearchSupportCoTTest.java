package org.apache.syncope.core.persistence.jpa.dao;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.apache.syncope.common.lib.types.AnyTypeKind;
import org.apache.syncope.core.persistence.jpa.entity.anyobject.JPAAnyObject;
import org.apache.syncope.core.persistence.jpa.entity.group.JPAGroup;
import org.apache.syncope.core.persistence.jpa.entity.user.JPAUser;
import org.junit.jupiter.api.Test;

class SearchSupportCoTTest {

    @Test
    void tableForAnyObject() {
        SearchSupport support = new SearchSupport(AnyTypeKind.ANY_OBJECT);

        SearchSupport.SearchView view = support.table();

        assertEquals("t", view.alias());
        assertEquals(JPAAnyObject.TABLE, view.name());
    }

    @Test
    void tableForGroup() {
        SearchSupport support = new SearchSupport(AnyTypeKind.GROUP);

        SearchSupport.SearchView view = support.table();

        assertEquals("t", view.alias());
        assertEquals(JPAGroup.TABLE, view.name());
    }

    @Test
    void tableForUser() {
        SearchSupport support = new SearchSupport(AnyTypeKind.USER);

        SearchSupport.SearchView view = support.table();

        assertEquals("t", view.alias());
        assertEquals(JPAUser.TABLE, view.name());
    }

    @Test
    void fieldForAnyObject() {
        SearchSupport support = new SearchSupport(AnyTypeKind.ANY_OBJECT);

        SearchSupport.SearchView view = support.field();

        assertEquals("sv", view.alias());
        assertEquals("anyObject_search", view.name());
    }

    @Test
    void fieldForGroup() {
        SearchSupport support = new SearchSupport(AnyTypeKind.GROUP);

        SearchSupport.SearchView view = support.field();

        assertEquals("sv", view.alias());
        assertEquals("group_search", view.name());
    }

    @Test
    void fieldForUser() {
        SearchSupport support = new SearchSupport(AnyTypeKind.USER);

        SearchSupport.SearchView view = support.field();

        assertEquals("sv", view.alias());
        assertEquals("user_search", view.name());
    }

    @Test
    void relationshipForUser() {
        SearchSupport support = new SearchSupport(AnyTypeKind.USER);

        SearchSupport.SearchView view = support.relationship();

        assertEquals("svum", view.alias());
        assertEquals("user_search_urelationship", view.name());
    }

    @Test
    void relationshipForGroup() {
        SearchSupport support = new SearchSupport(AnyTypeKind.GROUP);

        SearchSupport.SearchView view = support.relationship();

        assertEquals("svgm", view.alias());
        assertEquals("group_search_grelationship", view.name());
    }

    @Test
    void relationshipForAnyObject() {
        SearchSupport support = new SearchSupport(AnyTypeKind.ANY_OBJECT);

        SearchSupport.SearchView view = support.relationship();

        assertEquals("svam", view.alias());
        assertEquals("anyObject_search_arelationship", view.name());
    }

    @Test
    void membershipForUser() {
        SearchSupport support = new SearchSupport(AnyTypeKind.USER);

        SearchSupport.SearchView view = support.membership();

        assertEquals("svum", view.alias());
        assertEquals("user_search_umembership", view.name());
    }

    @Test
    void membershipForGroup() {
        SearchSupport support = new SearchSupport(AnyTypeKind.GROUP);

        SearchSupport.SearchView view = support.membership();

        assertEquals("svam", view.alias());
        assertEquals("group_search_amembership", view.name());
    }

    @Test
    void membershipForAnyObject() {
        SearchSupport support = new SearchSupport(AnyTypeKind.ANY_OBJECT);

        SearchSupport.SearchView view = support.membership();

        assertEquals("svam", view.alias());
        assertEquals("anyObject_search_amembership", view.name());
    }

    @Test
    void roleForUser() {
        SearchSupport support = new SearchSupport(AnyTypeKind.USER);

        SearchSupport.SearchView view = support.role();

        assertEquals("svr", view.alias());
        assertEquals("user_search_role", view.name());
    }

    @Test
    void auxClassForGroup() {
        SearchSupport support = new SearchSupport(AnyTypeKind.GROUP);

        SearchSupport.SearchView view = support.auxClass();

        assertEquals("svac", view.alias());
        assertEquals("group_search_auxClass", view.name());
    }

    @Test
    void resourceForAnyObject() {
        SearchSupport support = new SearchSupport(AnyTypeKind.ANY_OBJECT);

        SearchSupport.SearchView view = support.resource();

        assertEquals("svr", view.alias());
        assertEquals("anyObject_search_resource", view.name());
    }

    @Test
    void groupResourceForUser() {
        SearchSupport support = new SearchSupport(AnyTypeKind.USER);

        SearchSupport.SearchView view = support.groupResource();

        assertEquals("svrr", view.alias());
        assertEquals("user_search_group_res", view.name());
    }

    @Test
    void entitlementsForGroup() {
        SearchSupport support = new SearchSupport(AnyTypeKind.GROUP);

        SearchSupport.SearchView view = support.entitlements();

        assertEquals("sve", view.alias());
        assertEquals("group_search_entitlements", view.name());
    }

    @Test
    void asSearchViewSupportThrowsException() {
        SearchSupport support = new SearchSupport(AnyTypeKind.USER);

        assertThrows(
                IllegalArgumentException.class,
                support::asSearchViewSupport);
    }

    @Test
    void asSearchViewSupportReturnsInstance() {
        class TestSearchViewSupport extends SearchViewSupport {

            TestSearchViewSupport() {
                super(AnyTypeKind.USER);
            }
        }

        TestSearchViewSupport support = new TestSearchViewSupport();

        SearchViewSupport result = support.asSearchViewSupport();

        assertSame(support, result);
    }
}
