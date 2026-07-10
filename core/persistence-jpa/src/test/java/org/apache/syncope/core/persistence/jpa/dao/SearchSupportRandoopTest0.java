package org.apache.syncope.core.persistence.jpa.dao;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SearchSupportRandoopTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTest0.test1");
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView2 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView("", "");
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTest0.test2");
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView2 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView("hi!", "");
        java.lang.Class<?> wildcardClass3 = searchView2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTest0.test3");
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind0 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport1 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind0);
        boolean boolean2 = searchSupport1.nonMandatorySchemas;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTest0.test4");
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind0 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport1 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView2 = searchSupport1.role();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.common.lib.types.AnyTypeKind.ordinal()\" because \"this.anyTypeKind\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTest0.test5");
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind0 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport1 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView2 = searchSupport1.entitlements();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.common.lib.types.AnyTypeKind.ordinal()\" because \"this.anyTypeKind\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTest0.test6");
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind0 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport1 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView2 = searchSupport1.auxClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.common.lib.types.AnyTypeKind.ordinal()\" because \"this.anyTypeKind\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTest0.test7");
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView2 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView("hi!", "hi!");
        java.lang.String str3 = searchView2.alias();
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView6 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView("hi!", "hi!");
        java.lang.Class<?> wildcardClass7 = searchView6.getClass();
        boolean boolean8 = searchView2.equals((java.lang.Object) searchView6);
        java.lang.String str9 = searchView2.alias();
        java.lang.Class<?> wildcardClass10 = searchView2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }
}

