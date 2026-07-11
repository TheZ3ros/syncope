package org.apache.syncope.core.persistence.jpa.dao;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.apache.syncope.common.lib.types.AnyTypeKind;
import org.apache.syncope.core.persistence.jpa.entity.anyobject.JPAAnyObject;
import org.apache.syncope.core.persistence.jpa.entity.group.JPAGroup;
import org.apache.syncope.core.persistence.jpa.entity.user.JPAUser;
import org.junit.jupiter.api.Test;

class SearchSupportFewShotTest2 {

    @Test
    void testTable_User() {
        SearchSupport.SearchView view = new SearchSupport(AnyTypeKind.USER).table();

        assertAll(
                () -> assertEquals(JPAUser.TABLE, view.name()),
                () -> assertEquals("t", view.alias()));
    }

    @Test
    void testTable_Group() {
        SearchSupport.SearchView view = new SearchSupport(AnyTypeKind.GROUP).table();

        assertAll(
                () -> assertEquals(JPAGroup.TABLE, view.name()),
                () -> assertEquals("t", view.alias()));
    }

    @Test
    void testTable_AnyObject() {
        SearchSupport.SearchView view = new SearchSupport(AnyTypeKind.ANY_OBJECT).table();

        assertAll(
                () -> assertEquals(JPAAnyObject.TABLE, view.name()),
                () -> assertEquals("t", view.alias()));
    }

    @Test
    void testField_User() {
        SearchSupport.SearchView view = new SearchSupport(AnyTypeKind.USER).field();

        assertAll(
                () -> assertEquals("user_search", view.name()),
                () -> assertEquals("sv", view.alias()));
    }

    @Test
    void testField_Group() {
        SearchSupport.SearchView view = new SearchSupport(AnyTypeKind.GROUP).field();

        assertAll(
                () -> assertEquals("group_search", view.name()),
                () -> assertEquals("sv", view.alias()));
    }

    @Test
    void testField_AnyObject() {
        SearchSupport.SearchView view = new SearchSupport(AnyTypeKind.ANY_OBJECT).field();

        assertAll(
                () -> assertEquals("anyObject_search", view.name()),
                () -> assertEquals("sv", view.alias()));
    }

    @Test
    void testRelationship_User() {
        SearchSupport.SearchView view = new SearchSupport(AnyTypeKind.USER).relationship();

        assertAll(
                () -> assertEquals("user_search_urelationship", view.name()),
                () -> assertEquals("svum", view.alias()));
    }

    @Test
    void testRelationship_Group() {
        SearchSupport.SearchView view = new SearchSupport(AnyTypeKind.GROUP).relationship();

        assertAll(
                () -> assertEquals("group_search_grelationship", view.name()),
                () -> assertEquals("svgm", view.alias()));
    }

    @Test
    void testRelationship_AnyObject() {
        SearchSupport.SearchView view = new SearchSupport(AnyTypeKind.ANY_OBJECT).relationship();

        assertAll(
                () -> assertEquals("anyObject_search_arelationship", view.name()),
                () -> assertEquals("svam", view.alias()));
    }

    @Test
    void testMembership_User() {
        SearchSupport.SearchView view = new SearchSupport(AnyTypeKind.USER).membership();

        assertAll(
                () -> assertEquals("user_search_umembership", view.name()),
                () -> assertEquals("svum", view.alias()));
    }

    @Test
    void testMembership_AnyObject() {
        SearchSupport.SearchView view = new SearchSupport(AnyTypeKind.ANY_OBJECT).membership();

        assertAll(
                () -> assertEquals("anyObject_search_amembership", view.name()),
                () -> assertEquals("svam", view.alias()));
    }

    @Test
    void testMembership_Group() {
        SearchSupport.SearchView view = new SearchSupport(AnyTypeKind.GROUP).membership();

        assertAll(
                () -> assertEquals("group_search_amembership", view.name()),
                () -> assertEquals("svam", view.alias()));
    }

    @Test
    void testRole_User() {
        SearchSupport.SearchView view = new SearchSupport(AnyTypeKind.USER).role();

        assertAll(
                () -> assertEquals("user_search_role", view.name()),
                () -> assertEquals("svr", view.alias()));
    }

    @Test
    void testRole_Group() {
        SearchSupport.SearchView view = new SearchSupport(AnyTypeKind.GROUP).role();

        assertAll(
                () -> assertEquals("group_search_role", view.name()),
                () -> assertEquals("svr", view.alias()));
    }

    @Test
    void testRole_AnyObject() {
        SearchSupport.SearchView view = new SearchSupport(AnyTypeKind.ANY_OBJECT).role();

        assertAll(
                () -> assertEquals("anyObject_search_role", view.name()),
                () -> assertEquals("svr", view.alias()));
    }

    @Test
    void testAuxClass_User() {
        SearchSupport.SearchView view = new SearchSupport(AnyTypeKind.USER).auxClass();

        assertAll(
                () -> assertEquals("user_search_auxClass", view.name()),
                () -> assertEquals("svac", view.alias()));
    }

    @Test
    void testAuxClass_Group() {
        SearchSupport.SearchView view = new SearchSupport(AnyTypeKind.GROUP).auxClass();

        assertAll(
                () -> assertEquals("group_search_auxClass", view.name()),
                () -> assertEquals("svac", view.alias()));
    }

    @Test
    void testAuxClass_AnyObject() {
        SearchSupport.SearchView view = new SearchSupport(AnyTypeKind.ANY_OBJECT).auxClass();

        assertAll(
                () -> assertEquals("anyObject_search_auxClass", view.name()),
                () -> assertEquals("svac", view.alias()));
    }

    @Test
    void testResource_User() {
        SearchSupport.SearchView view = new SearchSupport(AnyTypeKind.USER).resource();

        assertAll(
                () -> assertEquals("user_search_resource", view.name()),
                () -> assertEquals("svr", view.alias()));
    }

    @Test
    void testResource_Group() {
        SearchSupport.SearchView view = new SearchSupport(AnyTypeKind.GROUP).resource();

        assertAll(
                () -> assertEquals("group_search_resource", view.name()),
                () -> assertEquals("svr", view.alias()));
    }

    @Test
    void testResource_AnyObject() {
        SearchSupport.SearchView view = new SearchSupport(AnyTypeKind.ANY_OBJECT).resource();

        assertAll(
                () -> assertEquals("anyObject_search_resource", view.name()),
                () -> assertEquals("svr", view.alias()));
    }

    @Test
    void testGroupResource_User() {
        SearchSupport.SearchView view = new SearchSupport(AnyTypeKind.USER).groupResource();

        assertAll(
                () -> assertEquals("user_search_group_res", view.name()),
                () -> assertEquals("svrr", view.alias()));
    }

    @Test
    void testGroupResource_Group() {
        SearchSupport.SearchView view = new SearchSupport(AnyTypeKind.GROUP).groupResource();

        assertAll(
                () -> assertEquals("group_search_group_res", view.name()),
                () -> assertEquals("svrr", view.alias()));
    }

    @Test
    void testGroupResource_AnyObject() {
        SearchSupport.SearchView view = new SearchSupport(AnyTypeKind.ANY_OBJECT).groupResource();

        assertAll(
                () -> assertEquals("anyObject_search_group_res", view.name()),
                () -> assertEquals("svrr", view.alias()));
    }

    @Test
    void testEntitlements_User() {
        SearchSupport.SearchView view = new SearchSupport(AnyTypeKind.USER).entitlements();

        assertAll(
                () -> assertEquals("user_search_entitlements", view.name()),
                () -> assertEquals("sve", view.alias()));
    }

    @Test
    void testEntitlements_Group() {
        SearchSupport.SearchView view = new SearchSupport(AnyTypeKind.GROUP).entitlements();

        assertAll(
                () -> assertEquals("group_search_entitlements", view.name()),
                () -> assertEquals("sve", view.alias()));
    }

    @Test
    void testEntitlements_AnyObject() {
        SearchSupport.SearchView view = new SearchSupport(AnyTypeKind.ANY_OBJECT).entitlements();

        assertAll(
                () -> assertEquals("anyObject_search_entitlements", view.name()),
                () -> assertEquals("sve", view.alias()));
    }
}
