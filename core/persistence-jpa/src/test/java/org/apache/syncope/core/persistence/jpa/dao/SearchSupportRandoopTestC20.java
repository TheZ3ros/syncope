package org.apache.syncope.core.persistence.jpa.dao;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SearchSupportRandoopTestC20 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test001");
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView2 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView("hi!", "");
        java.lang.Class<?> wildcardClass3 = searchView2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test002");
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
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test003");
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
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test004");
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
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test005");
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

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test006");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test007");
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind0 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport1 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind0);
        boolean boolean2 = searchSupport1.nonMandatorySchemas;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView3 = searchSupport1.field();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.common.lib.types.AnyTypeKind.ordinal()\" because \"this.anyTypeKind\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test008");
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView2 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView("hi!", "");
        java.lang.String str3 = searchView2.alias();
        boolean boolean5 = searchView2.equals((java.lang.Object) 1.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test009");
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind0 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport1 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView2 = searchSupport1.relationship();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.common.lib.types.AnyTypeKind.ordinal()\" because \"this.anyTypeKind\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test010");
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind0 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport1 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind0);
        boolean boolean2 = searchSupport1.nonMandatorySchemas;
        searchSupport1.nonMandatorySchemas = true;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView5 = searchSupport1.table();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.common.lib.types.AnyTypeKind.ordinal()\" because \"this.anyTypeKind\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test011");
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind0 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport1 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind0);
        boolean boolean2 = searchSupport1.nonMandatorySchemas;
        searchSupport1.nonMandatorySchemas = true;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView5 = searchSupport1.auxClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.common.lib.types.AnyTypeKind.ordinal()\" because \"this.anyTypeKind\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test012");
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind0 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport1 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind0);
        boolean boolean2 = searchSupport1.nonMandatorySchemas;
        boolean boolean3 = searchSupport1.nonMandatorySchemas;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView4 = searchSupport1.auxClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.common.lib.types.AnyTypeKind.ordinal()\" because \"this.anyTypeKind\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test013");
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind0 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport1 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind0);
        boolean boolean2 = searchSupport1.nonMandatorySchemas;
        searchSupport1.nonMandatorySchemas = true;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView5 = searchSupport1.groupResource();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.common.lib.types.AnyTypeKind.ordinal()\" because \"this.anyTypeKind\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test014");
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind0 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport1 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind0);
        boolean boolean2 = searchSupport1.nonMandatorySchemas;
        boolean boolean3 = searchSupport1.nonMandatorySchemas;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.core.persistence.jpa.dao.SearchViewSupport searchViewSupport4 = searchSupport1.asSearchViewSupport();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Not an class org.apache.syncope.core.persistence.jpa.dao.SearchViewSupport instance");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test015");
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind0 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport1 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind0);
        boolean boolean2 = searchSupport1.nonMandatorySchemas;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView3 = searchSupport1.table();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.common.lib.types.AnyTypeKind.ordinal()\" because \"this.anyTypeKind\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test016");
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind0 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport1 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView2 = searchSupport1.membership();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.common.lib.types.AnyTypeKind.ordinal()\" because \"this.anyTypeKind\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test017");
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind0 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport1 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind0);
        boolean boolean2 = searchSupport1.nonMandatorySchemas;
        searchSupport1.nonMandatorySchemas = true;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView5 = searchSupport1.field();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.common.lib.types.AnyTypeKind.ordinal()\" because \"this.anyTypeKind\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test018");
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind0 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport1 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind0);
        boolean boolean2 = searchSupport1.nonMandatorySchemas;
        boolean boolean3 = searchSupport1.nonMandatorySchemas;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView4 = searchSupport1.role();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.common.lib.types.AnyTypeKind.ordinal()\" because \"this.anyTypeKind\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test019");
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind0 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport1 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind0);
        boolean boolean2 = searchSupport1.nonMandatorySchemas;
        boolean boolean3 = searchSupport1.nonMandatorySchemas;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView4 = searchSupport1.relationship();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.common.lib.types.AnyTypeKind.ordinal()\" because \"this.anyTypeKind\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test020");
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind0 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport1 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind0);
        java.lang.Class<?> wildcardClass2 = searchSupport1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test021");
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind0 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport1 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind0);
        boolean boolean2 = searchSupport1.nonMandatorySchemas;
        boolean boolean3 = searchSupport1.nonMandatorySchemas;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView4 = searchSupport1.membership();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.common.lib.types.AnyTypeKind.ordinal()\" because \"this.anyTypeKind\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test022");
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind0 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport1 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind0);
        boolean boolean2 = searchSupport1.nonMandatorySchemas;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.core.persistence.jpa.dao.SearchViewSupport searchViewSupport3 = searchSupport1.asSearchViewSupport();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Not an class org.apache.syncope.core.persistence.jpa.dao.SearchViewSupport instance");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test023");
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind0 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport1 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind0);
        boolean boolean2 = searchSupport1.nonMandatorySchemas;
        searchSupport1.nonMandatorySchemas = true;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView5 = searchSupport1.entitlements();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.common.lib.types.AnyTypeKind.ordinal()\" because \"this.anyTypeKind\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test024");
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind0 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport1 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind0);
        boolean boolean2 = searchSupport1.nonMandatorySchemas;
        boolean boolean3 = searchSupport1.nonMandatorySchemas;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView4 = searchSupport1.resource();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.common.lib.types.AnyTypeKind.ordinal()\" because \"this.anyTypeKind\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test025");
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind0 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport1 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind0);
        boolean boolean2 = searchSupport1.nonMandatorySchemas;
        boolean boolean3 = searchSupport1.nonMandatorySchemas;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind4 = searchSupport1.anyTypeKind;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView5 = searchSupport1.role();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.common.lib.types.AnyTypeKind.ordinal()\" because \"this.anyTypeKind\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(anyTypeKind4);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test026");
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind0 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport1 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind0);
        boolean boolean2 = searchSupport1.nonMandatorySchemas;
        boolean boolean3 = searchSupport1.nonMandatorySchemas;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind4 = searchSupport1.anyTypeKind;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView5 = searchSupport1.membership();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.common.lib.types.AnyTypeKind.ordinal()\" because \"this.anyTypeKind\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(anyTypeKind4);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test027");
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind0 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport1 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind0);
        boolean boolean2 = searchSupport1.nonMandatorySchemas;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView3 = searchSupport1.auxClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.common.lib.types.AnyTypeKind.ordinal()\" because \"this.anyTypeKind\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test028");
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind0 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport1 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind0);
        boolean boolean2 = searchSupport1.nonMandatorySchemas;
        searchSupport1.nonMandatorySchemas = true;
        searchSupport1.nonMandatorySchemas = true;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView7 = searchSupport1.role();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.common.lib.types.AnyTypeKind.ordinal()\" because \"this.anyTypeKind\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test029");
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView2 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView("", "hi!");
        java.lang.String str3 = searchView2.alias();
        java.lang.Class<?> wildcardClass4 = searchView2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test030");
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind0 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport1 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView2 = searchSupport1.groupResource();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.common.lib.types.AnyTypeKind.ordinal()\" because \"this.anyTypeKind\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test031");
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind0 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport1 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind0);
        boolean boolean2 = searchSupport1.nonMandatorySchemas;
        searchSupport1.nonMandatorySchemas = true;
        searchSupport1.nonMandatorySchemas = true;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.core.persistence.jpa.dao.SearchViewSupport searchViewSupport7 = searchSupport1.asSearchViewSupport();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Not an class org.apache.syncope.core.persistence.jpa.dao.SearchViewSupport instance");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test032");
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind0 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport1 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind0);
        boolean boolean2 = searchSupport1.nonMandatorySchemas;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind3 = searchSupport1.anyTypeKind;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.core.persistence.jpa.dao.SearchViewSupport searchViewSupport4 = searchSupport1.asSearchViewSupport();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Not an class org.apache.syncope.core.persistence.jpa.dao.SearchViewSupport instance");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(anyTypeKind3);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test033");
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind0 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport1 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind0);
        boolean boolean2 = searchSupport1.nonMandatorySchemas;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind3 = searchSupport1.anyTypeKind;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView4 = searchSupport1.entitlements();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.common.lib.types.AnyTypeKind.ordinal()\" because \"this.anyTypeKind\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(anyTypeKind3);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test034");
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView2 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView("hi!", "hi!");
        java.lang.String str3 = searchView2.alias();
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView6 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView("hi!", "hi!");
        java.lang.Class<?> wildcardClass7 = searchView6.getClass();
        boolean boolean8 = searchView2.equals((java.lang.Object) searchView6);
        boolean boolean10 = searchView6.equals((java.lang.Object) '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test035");
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView2 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView("hi!", "hi!");
        java.lang.String str3 = searchView2.alias();
        java.lang.String str4 = searchView2.name();
        java.lang.String str5 = searchView2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SearchView[alias=hi!, name=hi!]" + "'", str5, "SearchView[alias=hi!, name=hi!]");
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test036");
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind0 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport1 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind0);
        boolean boolean2 = searchSupport1.nonMandatorySchemas;
        searchSupport1.nonMandatorySchemas = true;
        searchSupport1.nonMandatorySchemas = true;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView7 = searchSupport1.table();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.common.lib.types.AnyTypeKind.ordinal()\" because \"this.anyTypeKind\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test037");
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind0 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport1 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.core.persistence.jpa.dao.SearchViewSupport searchViewSupport2 = searchSupport1.asSearchViewSupport();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Not an class org.apache.syncope.core.persistence.jpa.dao.SearchViewSupport instance");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test038");
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind0 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport1 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind0);
        boolean boolean2 = searchSupport1.nonMandatorySchemas;
        boolean boolean3 = searchSupport1.nonMandatorySchemas;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind4 = searchSupport1.anyTypeKind;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView5 = searchSupport1.groupResource();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.common.lib.types.AnyTypeKind.ordinal()\" because \"this.anyTypeKind\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(anyTypeKind4);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test039");
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind0 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport1 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind0);
        boolean boolean2 = searchSupport1.nonMandatorySchemas;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind3 = searchSupport1.anyTypeKind;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView4 = searchSupport1.groupResource();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.common.lib.types.AnyTypeKind.ordinal()\" because \"this.anyTypeKind\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(anyTypeKind3);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test040");
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView2 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView("", "hi!");
        java.lang.String str3 = searchView2.alias();
        java.lang.String str4 = searchView2.name();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test041");
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind0 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport1 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind0);
        boolean boolean2 = searchSupport1.nonMandatorySchemas;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView3 = searchSupport1.entitlements();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.common.lib.types.AnyTypeKind.ordinal()\" because \"this.anyTypeKind\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test042");
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind0 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport1 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind0);
        boolean boolean2 = searchSupport1.nonMandatorySchemas;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind3 = searchSupport1.anyTypeKind;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView4 = searchSupport1.resource();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.common.lib.types.AnyTypeKind.ordinal()\" because \"this.anyTypeKind\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(anyTypeKind3);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test043");
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind0 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport1 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind0);
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind2 = searchSupport1.anyTypeKind;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView3 = searchSupport1.resource();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.common.lib.types.AnyTypeKind.ordinal()\" because \"this.anyTypeKind\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(anyTypeKind2);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test044");
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind0 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport1 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind0);
        boolean boolean2 = searchSupport1.nonMandatorySchemas;
        boolean boolean3 = searchSupport1.nonMandatorySchemas;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView4 = searchSupport1.groupResource();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.common.lib.types.AnyTypeKind.ordinal()\" because \"this.anyTypeKind\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test045");
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind0 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport1 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind0);
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind2 = searchSupport1.anyTypeKind;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView3 = searchSupport1.role();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.common.lib.types.AnyTypeKind.ordinal()\" because \"this.anyTypeKind\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(anyTypeKind2);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test046");
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind0 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport1 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind0);
        boolean boolean2 = searchSupport1.nonMandatorySchemas;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind3 = searchSupport1.anyTypeKind;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind4 = searchSupport1.anyTypeKind;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView5 = searchSupport1.entitlements();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.common.lib.types.AnyTypeKind.ordinal()\" because \"this.anyTypeKind\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(anyTypeKind3);
        org.junit.Assert.assertNull(anyTypeKind4);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test047");
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind0 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport1 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind0);
        searchSupport1.nonMandatorySchemas = true;
        java.lang.Class<?> wildcardClass4 = searchSupport1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test048");
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind0 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport1 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind0);
        boolean boolean2 = searchSupport1.nonMandatorySchemas;
        searchSupport1.nonMandatorySchemas = true;
        searchSupport1.nonMandatorySchemas = true;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView7 = searchSupport1.auxClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.common.lib.types.AnyTypeKind.ordinal()\" because \"this.anyTypeKind\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test049");
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind0 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport1 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind0);
        boolean boolean2 = searchSupport1.nonMandatorySchemas;
        searchSupport1.nonMandatorySchemas = true;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind5 = searchSupport1.anyTypeKind;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView6 = searchSupport1.relationship();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.common.lib.types.AnyTypeKind.ordinal()\" because \"this.anyTypeKind\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(anyTypeKind5);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test050");
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView2 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView("hi!", "hi!");
        java.lang.String str3 = searchView2.alias();
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView6 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView("hi!", "hi!");
        java.lang.Class<?> wildcardClass7 = searchView6.getClass();
        boolean boolean8 = searchView2.equals((java.lang.Object) searchView6);
        java.lang.String str9 = searchView6.alias();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test051");
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind0 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport1 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind0);
        boolean boolean2 = searchSupport1.nonMandatorySchemas;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind3 = searchSupport1.anyTypeKind;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind4 = searchSupport1.anyTypeKind;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView5 = searchSupport1.membership();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.common.lib.types.AnyTypeKind.ordinal()\" because \"this.anyTypeKind\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(anyTypeKind3);
        org.junit.Assert.assertNull(anyTypeKind4);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test052");
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind0 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport1 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind0);
        boolean boolean2 = searchSupport1.nonMandatorySchemas;
        boolean boolean3 = searchSupport1.nonMandatorySchemas;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind4 = searchSupport1.anyTypeKind;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView5 = searchSupport1.relationship();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.common.lib.types.AnyTypeKind.ordinal()\" because \"this.anyTypeKind\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(anyTypeKind4);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test053");
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind0 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport1 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind0);
        searchSupport1.nonMandatorySchemas = true;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView4 = searchSupport1.auxClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.common.lib.types.AnyTypeKind.ordinal()\" because \"this.anyTypeKind\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test054");
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind0 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport1 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind0);
        searchSupport1.nonMandatorySchemas = true;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView4 = searchSupport1.groupResource();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.common.lib.types.AnyTypeKind.ordinal()\" because \"this.anyTypeKind\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test055");
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind0 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport1 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind0);
        boolean boolean2 = searchSupport1.nonMandatorySchemas;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind3 = searchSupport1.anyTypeKind;
        java.lang.Class<?> wildcardClass4 = searchSupport1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(anyTypeKind3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test056");
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind0 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport1 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind0);
        boolean boolean2 = searchSupport1.nonMandatorySchemas;
        boolean boolean3 = searchSupport1.nonMandatorySchemas;
        searchSupport1.nonMandatorySchemas = false;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView6 = searchSupport1.entitlements();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.common.lib.types.AnyTypeKind.ordinal()\" because \"this.anyTypeKind\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test057");
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind0 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport1 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind0);
        boolean boolean2 = searchSupport1.nonMandatorySchemas;
        boolean boolean3 = searchSupport1.nonMandatorySchemas;
        searchSupport1.nonMandatorySchemas = false;
        boolean boolean6 = searchSupport1.nonMandatorySchemas;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView7 = searchSupport1.role();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.common.lib.types.AnyTypeKind.ordinal()\" because \"this.anyTypeKind\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test058");
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView2 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView("", "");
        boolean boolean4 = searchView2.equals((java.lang.Object) (-1.0f));
        java.lang.String str5 = searchView2.alias();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test059");
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind0 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport1 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind0);
        boolean boolean2 = searchSupport1.nonMandatorySchemas;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView3 = searchSupport1.role();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.common.lib.types.AnyTypeKind.ordinal()\" because \"this.anyTypeKind\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test060");
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind0 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport1 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind0);
        boolean boolean2 = searchSupport1.nonMandatorySchemas;
        boolean boolean3 = searchSupport1.nonMandatorySchemas;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView4 = searchSupport1.table();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.common.lib.types.AnyTypeKind.ordinal()\" because \"this.anyTypeKind\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test061");
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind0 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport1 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind0);
        boolean boolean2 = searchSupport1.nonMandatorySchemas;
        searchSupport1.nonMandatorySchemas = true;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView5 = searchSupport1.relationship();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.common.lib.types.AnyTypeKind.ordinal()\" because \"this.anyTypeKind\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test062");
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind0 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport1 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind0);
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind2 = searchSupport1.anyTypeKind;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView3 = searchSupport1.field();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.common.lib.types.AnyTypeKind.ordinal()\" because \"this.anyTypeKind\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(anyTypeKind2);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test063");
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind0 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport1 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind0);
        boolean boolean2 = searchSupport1.nonMandatorySchemas;
        boolean boolean3 = searchSupport1.nonMandatorySchemas;
        searchSupport1.nonMandatorySchemas = false;
        boolean boolean6 = searchSupport1.nonMandatorySchemas;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView7 = searchSupport1.groupResource();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.common.lib.types.AnyTypeKind.ordinal()\" because \"this.anyTypeKind\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test064");
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind0 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport1 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind0);
        boolean boolean2 = searchSupport1.nonMandatorySchemas;
        searchSupport1.nonMandatorySchemas = true;
        java.lang.Class<?> wildcardClass5 = searchSupport1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test065");
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind0 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport1 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind0);
        boolean boolean2 = searchSupport1.nonMandatorySchemas;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind3 = searchSupport1.anyTypeKind;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind4 = searchSupport1.anyTypeKind;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView5 = searchSupport1.relationship();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.common.lib.types.AnyTypeKind.ordinal()\" because \"this.anyTypeKind\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(anyTypeKind3);
        org.junit.Assert.assertNull(anyTypeKind4);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test066");
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind0 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport1 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind0);
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind2 = searchSupport1.anyTypeKind;
        searchSupport1.nonMandatorySchemas = true;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind5 = searchSupport1.anyTypeKind;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView6 = searchSupport1.membership();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.common.lib.types.AnyTypeKind.ordinal()\" because \"this.anyTypeKind\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(anyTypeKind2);
        org.junit.Assert.assertNull(anyTypeKind5);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test067");
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView2 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView("hi!", "hi!");
        java.lang.String str3 = searchView2.alias();
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView6 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView("hi!", "hi!");
        java.lang.Class<?> wildcardClass7 = searchView6.getClass();
        boolean boolean8 = searchView2.equals((java.lang.Object) searchView6);
        java.lang.String str9 = searchView2.alias();
        java.lang.String str10 = searchView2.alias();
        java.lang.String str11 = searchView2.name();
        java.lang.Class<?> wildcardClass12 = searchView2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test068");
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind0 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport1 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind0);
        boolean boolean2 = searchSupport1.nonMandatorySchemas;
        searchSupport1.nonMandatorySchemas = true;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind5 = searchSupport1.anyTypeKind;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView6 = searchSupport1.auxClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.common.lib.types.AnyTypeKind.ordinal()\" because \"this.anyTypeKind\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(anyTypeKind5);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test069");
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView2 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView("", "hi!");
        java.lang.String str3 = searchView2.alias();
        java.lang.String str4 = searchView2.alias();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test070");
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind0 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport1 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind0);
        boolean boolean2 = searchSupport1.nonMandatorySchemas;
        boolean boolean3 = searchSupport1.nonMandatorySchemas;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView4 = searchSupport1.field();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.common.lib.types.AnyTypeKind.ordinal()\" because \"this.anyTypeKind\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test071");
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind0 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport1 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind0);
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind2 = searchSupport1.anyTypeKind;
        searchSupport1.nonMandatorySchemas = true;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind5 = searchSupport1.anyTypeKind;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView6 = searchSupport1.role();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.common.lib.types.AnyTypeKind.ordinal()\" because \"this.anyTypeKind\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(anyTypeKind2);
        org.junit.Assert.assertNull(anyTypeKind5);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test072");
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind0 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport1 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind0);
        boolean boolean2 = searchSupport1.nonMandatorySchemas;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView3 = searchSupport1.groupResource();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.common.lib.types.AnyTypeKind.ordinal()\" because \"this.anyTypeKind\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test073");
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind0 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport1 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind0);
        boolean boolean2 = searchSupport1.nonMandatorySchemas;
        searchSupport1.nonMandatorySchemas = true;
        searchSupport1.nonMandatorySchemas = true;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView7 = searchSupport1.resource();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.common.lib.types.AnyTypeKind.ordinal()\" because \"this.anyTypeKind\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test074");
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind0 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport1 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind0);
        boolean boolean2 = searchSupport1.nonMandatorySchemas;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind3 = searchSupport1.anyTypeKind;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind4 = searchSupport1.anyTypeKind;
        searchSupport1.nonMandatorySchemas = true;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView7 = searchSupport1.field();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.common.lib.types.AnyTypeKind.ordinal()\" because \"this.anyTypeKind\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(anyTypeKind3);
        org.junit.Assert.assertNull(anyTypeKind4);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test075");
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView2 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView("", "");
        java.lang.Class<?> wildcardClass3 = searchView2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test076");
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView2 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView("hi!", "");
        java.lang.String str3 = searchView2.alias();
        java.lang.String str4 = searchView2.name();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test077");
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView2 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView("hi!", "");
        java.lang.String str3 = searchView2.toString();
        java.lang.String str4 = searchView2.name();
        boolean boolean6 = searchView2.equals((java.lang.Object) 0L);
        java.lang.String str7 = searchView2.alias();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "SearchView[alias=hi!, name=]" + "'", str3, "SearchView[alias=hi!, name=]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test078");
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind0 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport1 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind0);
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind2 = searchSupport1.anyTypeKind;
        searchSupport1.nonMandatorySchemas = true;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView5 = searchSupport1.field();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.common.lib.types.AnyTypeKind.ordinal()\" because \"this.anyTypeKind\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(anyTypeKind2);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test079");
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind0 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport1 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind0);
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind2 = searchSupport1.anyTypeKind;
        searchSupport1.nonMandatorySchemas = true;
        boolean boolean5 = searchSupport1.nonMandatorySchemas;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView6 = searchSupport1.relationship();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.common.lib.types.AnyTypeKind.ordinal()\" because \"this.anyTypeKind\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(anyTypeKind2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test080");
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind0 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport1 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind0);
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind2 = searchSupport1.anyTypeKind;
        searchSupport1.nonMandatorySchemas = true;
        searchSupport1.nonMandatorySchemas = true;
        searchSupport1.nonMandatorySchemas = true;
        boolean boolean9 = searchSupport1.nonMandatorySchemas;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView10 = searchSupport1.groupResource();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.common.lib.types.AnyTypeKind.ordinal()\" because \"this.anyTypeKind\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(anyTypeKind2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test081");
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind0 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport1 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind0);
        boolean boolean2 = searchSupport1.nonMandatorySchemas;
        boolean boolean3 = searchSupport1.nonMandatorySchemas;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind4 = searchSupport1.anyTypeKind;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView5 = searchSupport1.entitlements();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.common.lib.types.AnyTypeKind.ordinal()\" because \"this.anyTypeKind\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(anyTypeKind4);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test082");
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind0 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport1 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind0);
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind2 = searchSupport1.anyTypeKind;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView3 = searchSupport1.membership();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.common.lib.types.AnyTypeKind.ordinal()\" because \"this.anyTypeKind\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(anyTypeKind2);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test083");
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView2 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView("hi!", "");
        java.lang.String str3 = searchView2.toString();
        java.lang.Class<?> wildcardClass4 = searchView2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "SearchView[alias=hi!, name=]" + "'", str3, "SearchView[alias=hi!, name=]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test084");
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind0 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport1 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind0);
        boolean boolean2 = searchSupport1.nonMandatorySchemas;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind3 = searchSupport1.anyTypeKind;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind4 = searchSupport1.anyTypeKind;
        searchSupport1.nonMandatorySchemas = true;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView7 = searchSupport1.resource();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.common.lib.types.AnyTypeKind.ordinal()\" because \"this.anyTypeKind\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(anyTypeKind3);
        org.junit.Assert.assertNull(anyTypeKind4);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test085");
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind0 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport1 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind0);
        boolean boolean2 = searchSupport1.nonMandatorySchemas;
        boolean boolean3 = searchSupport1.nonMandatorySchemas;
        searchSupport1.nonMandatorySchemas = false;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.core.persistence.jpa.dao.SearchViewSupport searchViewSupport6 = searchSupport1.asSearchViewSupport();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Not an class org.apache.syncope.core.persistence.jpa.dao.SearchViewSupport instance");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test086");
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind0 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport1 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind0);
        boolean boolean2 = searchSupport1.nonMandatorySchemas;
        boolean boolean3 = searchSupport1.nonMandatorySchemas;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind4 = searchSupport1.anyTypeKind;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView5 = searchSupport1.resource();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.common.lib.types.AnyTypeKind.ordinal()\" because \"this.anyTypeKind\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(anyTypeKind4);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test087");
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind0 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport1 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind0);
        boolean boolean2 = searchSupport1.nonMandatorySchemas;
        searchSupport1.nonMandatorySchemas = true;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind5 = searchSupport1.anyTypeKind;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView6 = searchSupport1.table();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.common.lib.types.AnyTypeKind.ordinal()\" because \"this.anyTypeKind\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(anyTypeKind5);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test088");
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind0 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport1 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView2 = searchSupport1.table();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.common.lib.types.AnyTypeKind.ordinal()\" because \"this.anyTypeKind\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test089");
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind0 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport1 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind0);
        boolean boolean2 = searchSupport1.nonMandatorySchemas;
        boolean boolean3 = searchSupport1.nonMandatorySchemas;
        searchSupport1.nonMandatorySchemas = false;
        searchSupport1.nonMandatorySchemas = false;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.core.persistence.jpa.dao.SearchViewSupport searchViewSupport8 = searchSupport1.asSearchViewSupport();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Not an class org.apache.syncope.core.persistence.jpa.dao.SearchViewSupport instance");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test090");
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind0 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport1 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind0);
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind2 = searchSupport1.anyTypeKind;
        searchSupport1.nonMandatorySchemas = true;
        searchSupport1.nonMandatorySchemas = true;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView7 = searchSupport1.relationship();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.common.lib.types.AnyTypeKind.ordinal()\" because \"this.anyTypeKind\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(anyTypeKind2);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test091");
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind0 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport1 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind0);
        boolean boolean2 = searchSupport1.nonMandatorySchemas;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind3 = searchSupport1.anyTypeKind;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind4 = searchSupport1.anyTypeKind;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = anyTypeKind4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(anyTypeKind3);
        org.junit.Assert.assertNull(anyTypeKind4);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test092");
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView2 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView("hi!", "");
        java.lang.String str3 = searchView2.alias();
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView6 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView("hi!", "");
        java.lang.String str7 = searchView6.alias();
        java.lang.String str8 = searchView6.toString();
        java.lang.String str9 = searchView6.alias();
        java.lang.Class<?> wildcardClass10 = searchView6.getClass();
        boolean boolean11 = searchView2.equals((java.lang.Object) wildcardClass10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "SearchView[alias=hi!, name=]" + "'", str8, "SearchView[alias=hi!, name=]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test093");
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind0 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport1 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind0);
        boolean boolean2 = searchSupport1.nonMandatorySchemas;
        searchSupport1.nonMandatorySchemas = true;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView5 = searchSupport1.membership();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.common.lib.types.AnyTypeKind.ordinal()\" because \"this.anyTypeKind\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test094");
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind0 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport1 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind0);
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind2 = searchSupport1.anyTypeKind;
        searchSupport1.nonMandatorySchemas = true;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView5 = searchSupport1.groupResource();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.common.lib.types.AnyTypeKind.ordinal()\" because \"this.anyTypeKind\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(anyTypeKind2);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test095");
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView2 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView("", "hi!");
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind3 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport4 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind3);
        searchSupport4.nonMandatorySchemas = true;
        boolean boolean7 = searchView2.equals((java.lang.Object) searchSupport4);
        java.lang.String str8 = searchView2.name();
        java.lang.String str9 = searchView2.alias();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test096");
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind0 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport1 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind0);
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind2 = searchSupport1.anyTypeKind;
        searchSupport1.nonMandatorySchemas = true;
        searchSupport1.nonMandatorySchemas = true;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView7 = searchSupport1.table();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.common.lib.types.AnyTypeKind.ordinal()\" because \"this.anyTypeKind\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(anyTypeKind2);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test097");
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind0 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport1 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind0);
        boolean boolean2 = searchSupport1.nonMandatorySchemas;
        boolean boolean3 = searchSupport1.nonMandatorySchemas;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind4 = searchSupport1.anyTypeKind;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView5 = searchSupport1.auxClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.common.lib.types.AnyTypeKind.ordinal()\" because \"this.anyTypeKind\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(anyTypeKind4);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test098");
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView2 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView("hi!", "hi!");
        java.lang.String str3 = searchView2.alias();
        java.lang.Class<?> wildcardClass4 = searchView2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test099");
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView2 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView("hi!", "hi!");
        java.lang.String str3 = searchView2.alias();
        boolean boolean5 = searchView2.equals((java.lang.Object) 0L);
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView8 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView("hi!", "");
        java.lang.String str9 = searchView8.toString();
        java.lang.String str10 = searchView8.toString();
        java.lang.String str11 = searchView8.name();
        boolean boolean12 = searchView2.equals((java.lang.Object) str11);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SearchView[alias=hi!, name=]" + "'", str9, "SearchView[alias=hi!, name=]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "SearchView[alias=hi!, name=]" + "'", str10, "SearchView[alias=hi!, name=]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test100");
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind0 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport1 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind0);
        boolean boolean2 = searchSupport1.nonMandatorySchemas;
        boolean boolean3 = searchSupport1.nonMandatorySchemas;
        searchSupport1.nonMandatorySchemas = false;
        boolean boolean6 = searchSupport1.nonMandatorySchemas;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView7 = searchSupport1.resource();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.common.lib.types.AnyTypeKind.ordinal()\" because \"this.anyTypeKind\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test101");
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind0 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport1 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind0);
        boolean boolean2 = searchSupport1.nonMandatorySchemas;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind3 = searchSupport1.anyTypeKind;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind4 = searchSupport1.anyTypeKind;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView5 = searchSupport1.auxClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.common.lib.types.AnyTypeKind.ordinal()\" because \"this.anyTypeKind\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(anyTypeKind3);
        org.junit.Assert.assertNull(anyTypeKind4);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test102");
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind0 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport1 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind0);
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind2 = searchSupport1.anyTypeKind;
        searchSupport1.nonMandatorySchemas = true;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView5 = searchSupport1.role();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.common.lib.types.AnyTypeKind.ordinal()\" because \"this.anyTypeKind\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(anyTypeKind2);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test103");
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind0 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport1 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind0);
        boolean boolean2 = searchSupport1.nonMandatorySchemas;
        boolean boolean3 = searchSupport1.nonMandatorySchemas;
        searchSupport1.nonMandatorySchemas = false;
        boolean boolean6 = searchSupport1.nonMandatorySchemas;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView7 = searchSupport1.auxClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.common.lib.types.AnyTypeKind.ordinal()\" because \"this.anyTypeKind\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test104");
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind0 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport1 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind0);
        boolean boolean2 = searchSupport1.nonMandatorySchemas;
        searchSupport1.nonMandatorySchemas = true;
        searchSupport1.nonMandatorySchemas = true;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView7 = searchSupport1.relationship();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.common.lib.types.AnyTypeKind.ordinal()\" because \"this.anyTypeKind\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test105");
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind0 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport1 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind0);
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind2 = searchSupport1.anyTypeKind;
        searchSupport1.nonMandatorySchemas = true;
        boolean boolean5 = searchSupport1.nonMandatorySchemas;
        boolean boolean6 = searchSupport1.nonMandatorySchemas;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView7 = searchSupport1.relationship();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.common.lib.types.AnyTypeKind.ordinal()\" because \"this.anyTypeKind\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(anyTypeKind2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test106");
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind0 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport1 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind0);
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind2 = searchSupport1.anyTypeKind;
        searchSupport1.nonMandatorySchemas = true;
        searchSupport1.nonMandatorySchemas = true;
        searchSupport1.nonMandatorySchemas = true;
        boolean boolean9 = searchSupport1.nonMandatorySchemas;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView10 = searchSupport1.membership();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.common.lib.types.AnyTypeKind.ordinal()\" because \"this.anyTypeKind\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(anyTypeKind2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test107");
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind0 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport1 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind0);
        boolean boolean2 = searchSupport1.nonMandatorySchemas;
        boolean boolean3 = searchSupport1.nonMandatorySchemas;
        searchSupport1.nonMandatorySchemas = false;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind6 = searchSupport1.anyTypeKind;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView7 = searchSupport1.relationship();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.common.lib.types.AnyTypeKind.ordinal()\" because \"this.anyTypeKind\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(anyTypeKind6);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test108");
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind0 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport1 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind0);
        boolean boolean2 = searchSupport1.nonMandatorySchemas;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind3 = searchSupport1.anyTypeKind;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind4 = searchSupport1.anyTypeKind;
        searchSupport1.nonMandatorySchemas = true;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView7 = searchSupport1.relationship();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.common.lib.types.AnyTypeKind.ordinal()\" because \"this.anyTypeKind\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(anyTypeKind3);
        org.junit.Assert.assertNull(anyTypeKind4);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test109");
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind0 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport1 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind0);
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind2 = searchSupport1.anyTypeKind;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView3 = searchSupport1.auxClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.common.lib.types.AnyTypeKind.ordinal()\" because \"this.anyTypeKind\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(anyTypeKind2);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test110");
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView2 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView("hi!", "");
        java.lang.String str3 = searchView2.toString();
        java.lang.String str4 = searchView2.name();
        java.lang.String str5 = searchView2.toString();
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView8 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView("", "");
        java.lang.String str9 = searchView8.name();
        boolean boolean10 = searchView2.equals((java.lang.Object) searchView8);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "SearchView[alias=hi!, name=]" + "'", str3, "SearchView[alias=hi!, name=]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SearchView[alias=hi!, name=]" + "'", str5, "SearchView[alias=hi!, name=]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test111");
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind0 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport1 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind0);
        boolean boolean2 = searchSupport1.nonMandatorySchemas;
        boolean boolean3 = searchSupport1.nonMandatorySchemas;
        searchSupport1.nonMandatorySchemas = false;
        searchSupport1.nonMandatorySchemas = false;
        boolean boolean8 = searchSupport1.nonMandatorySchemas;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView9 = searchSupport1.resource();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.common.lib.types.AnyTypeKind.ordinal()\" because \"this.anyTypeKind\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test112");
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind0 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport1 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind0);
        boolean boolean2 = searchSupport1.nonMandatorySchemas;
        boolean boolean3 = searchSupport1.nonMandatorySchemas;
        boolean boolean4 = searchSupport1.nonMandatorySchemas;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView5 = searchSupport1.table();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.common.lib.types.AnyTypeKind.ordinal()\" because \"this.anyTypeKind\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test113");
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView2 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView("", "hi!");
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind3 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport4 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind3);
        searchSupport4.nonMandatorySchemas = true;
        boolean boolean7 = searchView2.equals((java.lang.Object) searchSupport4);
        boolean boolean8 = searchSupport4.nonMandatorySchemas;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind9 = searchSupport4.anyTypeKind;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView10 = searchSupport4.entitlements();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.common.lib.types.AnyTypeKind.ordinal()\" because \"this.anyTypeKind\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(anyTypeKind9);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test114");
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind0 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport1 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind0);
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind2 = searchSupport1.anyTypeKind;
        searchSupport1.nonMandatorySchemas = true;
        boolean boolean5 = searchSupport1.nonMandatorySchemas;
        boolean boolean6 = searchSupport1.nonMandatorySchemas;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView7 = searchSupport1.role();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.common.lib.types.AnyTypeKind.ordinal()\" because \"this.anyTypeKind\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(anyTypeKind2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test115");
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind0 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport1 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind0);
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind2 = searchSupport1.anyTypeKind;
        searchSupport1.nonMandatorySchemas = true;
        searchSupport1.nonMandatorySchemas = true;
        boolean boolean7 = searchSupport1.nonMandatorySchemas;
        searchSupport1.nonMandatorySchemas = true;
        org.junit.Assert.assertNull(anyTypeKind2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test116");
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView2 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView("SearchView[alias=hi!, name=]", "");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test117");
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind0 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport1 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind0);
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind2 = searchSupport1.anyTypeKind;
        searchSupport1.nonMandatorySchemas = true;
        boolean boolean5 = searchSupport1.nonMandatorySchemas;
        boolean boolean6 = searchSupport1.nonMandatorySchemas;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind7 = searchSupport1.anyTypeKind;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView8 = searchSupport1.resource();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.common.lib.types.AnyTypeKind.ordinal()\" because \"this.anyTypeKind\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(anyTypeKind2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(anyTypeKind7);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test118");
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView2 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView("SearchView[alias=, name=hi!]", "");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test119");
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView2 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView("SearchView[alias=hi!, name=]", "SearchView[alias=hi!, name=]");
        java.lang.String str3 = searchView2.name();
        boolean boolean5 = searchView2.equals((java.lang.Object) 10.0d);
        java.lang.String str6 = searchView2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "SearchView[alias=hi!, name=]" + "'", str3, "SearchView[alias=hi!, name=]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SearchView[alias=SearchView[alias=hi!, name=], name=SearchView[alias=hi!, name=]]" + "'", str6, "SearchView[alias=SearchView[alias=hi!, name=], name=SearchView[alias=hi!, name=]]");
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test120");
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind0 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport1 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind0);
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind2 = searchSupport1.anyTypeKind;
        searchSupport1.nonMandatorySchemas = true;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView5 = searchSupport1.auxClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.common.lib.types.AnyTypeKind.ordinal()\" because \"this.anyTypeKind\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(anyTypeKind2);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test121");
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind0 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport1 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind0);
        boolean boolean2 = searchSupport1.nonMandatorySchemas;
        searchSupport1.nonMandatorySchemas = true;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind5 = searchSupport1.anyTypeKind;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind6 = searchSupport1.anyTypeKind;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView7 = searchSupport1.role();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.common.lib.types.AnyTypeKind.ordinal()\" because \"this.anyTypeKind\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(anyTypeKind5);
        org.junit.Assert.assertNull(anyTypeKind6);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test122");
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView2 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView("hi!", "hi!");
        java.lang.String str3 = searchView2.alias();
        boolean boolean5 = searchView2.equals((java.lang.Object) 0L);
        boolean boolean7 = searchView2.equals((java.lang.Object) 1.0f);
        java.lang.String str8 = searchView2.alias();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test123");
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind0 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport1 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind0);
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind2 = searchSupport1.anyTypeKind;
        searchSupport1.nonMandatorySchemas = true;
        searchSupport1.nonMandatorySchemas = true;
        boolean boolean7 = searchSupport1.nonMandatorySchemas;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView8 = searchSupport1.table();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.common.lib.types.AnyTypeKind.ordinal()\" because \"this.anyTypeKind\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(anyTypeKind2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test124");
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind0 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport1 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind0);
        boolean boolean2 = searchSupport1.nonMandatorySchemas;
        searchSupport1.nonMandatorySchemas = true;
        boolean boolean5 = searchSupport1.nonMandatorySchemas;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView6 = searchSupport1.relationship();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.common.lib.types.AnyTypeKind.ordinal()\" because \"this.anyTypeKind\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test125");
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView2 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView("", "hi!");
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind3 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport4 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind3);
        searchSupport4.nonMandatorySchemas = true;
        boolean boolean7 = searchView2.equals((java.lang.Object) searchSupport4);
        java.lang.String str8 = searchView2.toString();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "SearchView[alias=, name=hi!]" + "'", str8, "SearchView[alias=, name=hi!]");
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test126");
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind0 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport1 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind0);
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind2 = searchSupport1.anyTypeKind;
        searchSupport1.nonMandatorySchemas = true;
        searchSupport1.nonMandatorySchemas = true;
        boolean boolean7 = searchSupport1.nonMandatorySchemas;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind8 = searchSupport1.anyTypeKind;
        org.junit.Assert.assertNull(anyTypeKind2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(anyTypeKind8);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test127");
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind0 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport1 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind0);
        boolean boolean2 = searchSupport1.nonMandatorySchemas;
        boolean boolean3 = searchSupport1.nonMandatorySchemas;
        searchSupport1.nonMandatorySchemas = false;
        searchSupport1.nonMandatorySchemas = false;
        boolean boolean8 = searchSupport1.nonMandatorySchemas;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView9 = searchSupport1.field();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.common.lib.types.AnyTypeKind.ordinal()\" because \"this.anyTypeKind\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test128");
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView2 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView("", "");
        boolean boolean4 = searchView2.equals((java.lang.Object) (-1.0f));
        java.lang.String str5 = searchView2.name();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test129");
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView2 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView("", "hi!");
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind3 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport4 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind3);
        searchSupport4.nonMandatorySchemas = true;
        boolean boolean7 = searchView2.equals((java.lang.Object) searchSupport4);
        java.lang.String str8 = searchView2.name();
        java.lang.Class<?> wildcardClass9 = searchView2.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test130");
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind0 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport1 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind0);
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind2 = searchSupport1.anyTypeKind;
        searchSupport1.nonMandatorySchemas = true;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind5 = searchSupport1.anyTypeKind;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.core.persistence.jpa.dao.SearchViewSupport searchViewSupport6 = searchSupport1.asSearchViewSupport();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Not an class org.apache.syncope.core.persistence.jpa.dao.SearchViewSupport instance");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(anyTypeKind2);
        org.junit.Assert.assertNull(anyTypeKind5);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test131");
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView2 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView("hi!", "");
        java.lang.String str3 = searchView2.alias();
        java.lang.String str4 = searchView2.alias();
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind5 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport6 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind5);
        boolean boolean7 = searchSupport6.nonMandatorySchemas;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind8 = searchSupport6.anyTypeKind;
        boolean boolean9 = searchView2.equals((java.lang.Object) searchSupport6);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(anyTypeKind8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test132");
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind0 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport1 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind0);
        boolean boolean2 = searchSupport1.nonMandatorySchemas;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind3 = searchSupport1.anyTypeKind;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind4 = searchSupport1.anyTypeKind;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView5 = searchSupport1.resource();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.common.lib.types.AnyTypeKind.ordinal()\" because \"this.anyTypeKind\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(anyTypeKind3);
        org.junit.Assert.assertNull(anyTypeKind4);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test133");
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind0 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport1 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind0);
        boolean boolean2 = searchSupport1.nonMandatorySchemas;
        searchSupport1.nonMandatorySchemas = true;
        searchSupport1.nonMandatorySchemas = true;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView7 = searchSupport1.field();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.common.lib.types.AnyTypeKind.ordinal()\" because \"this.anyTypeKind\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test134");
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind0 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport1 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind0);
        boolean boolean2 = searchSupport1.nonMandatorySchemas;
        boolean boolean3 = searchSupport1.nonMandatorySchemas;
        searchSupport1.nonMandatorySchemas = false;
        boolean boolean6 = searchSupport1.nonMandatorySchemas;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView7 = searchSupport1.relationship();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.common.lib.types.AnyTypeKind.ordinal()\" because \"this.anyTypeKind\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test135");
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView2 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView("hi!", "");
        java.lang.String str3 = searchView2.alias();
        java.lang.String str4 = searchView2.alias();
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind5 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport6 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind5);
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind7 = searchSupport6.anyTypeKind;
        searchSupport6.nonMandatorySchemas = true;
        searchSupport6.nonMandatorySchemas = true;
        boolean boolean12 = searchView2.equals((java.lang.Object) true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(anyTypeKind7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test136");
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind0 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport1 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind0);
        boolean boolean2 = searchSupport1.nonMandatorySchemas;
        boolean boolean3 = searchSupport1.nonMandatorySchemas;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind4 = searchSupport1.anyTypeKind;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind5 = searchSupport1.anyTypeKind;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(anyTypeKind4);
        org.junit.Assert.assertNull(anyTypeKind5);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test137");
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView2 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView("", "hi!");
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind3 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport4 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind3);
        searchSupport4.nonMandatorySchemas = true;
        boolean boolean7 = searchView2.equals((java.lang.Object) searchSupport4);
        boolean boolean8 = searchSupport4.nonMandatorySchemas;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView9 = searchSupport4.groupResource();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.common.lib.types.AnyTypeKind.ordinal()\" because \"this.anyTypeKind\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test138");
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind0 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport1 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind0);
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind2 = searchSupport1.anyTypeKind;
        searchSupport1.nonMandatorySchemas = true;
        searchSupport1.nonMandatorySchemas = true;
        searchSupport1.nonMandatorySchemas = true;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind9 = searchSupport1.anyTypeKind;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView10 = searchSupport1.role();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.common.lib.types.AnyTypeKind.ordinal()\" because \"this.anyTypeKind\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(anyTypeKind2);
        org.junit.Assert.assertNull(anyTypeKind9);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test139");
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView2 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView("", "hi!");
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind3 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport4 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind3);
        searchSupport4.nonMandatorySchemas = true;
        boolean boolean7 = searchView2.equals((java.lang.Object) searchSupport4);
        boolean boolean8 = searchSupport4.nonMandatorySchemas;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView9 = searchSupport4.field();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.common.lib.types.AnyTypeKind.ordinal()\" because \"this.anyTypeKind\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test140");
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind0 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport1 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind0);
        boolean boolean2 = searchSupport1.nonMandatorySchemas;
        boolean boolean3 = searchSupport1.nonMandatorySchemas;
        searchSupport1.nonMandatorySchemas = false;
        searchSupport1.nonMandatorySchemas = false;
        boolean boolean8 = searchSupport1.nonMandatorySchemas;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind9 = searchSupport1.anyTypeKind;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind10 = searchSupport1.anyTypeKind;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView11 = searchSupport1.relationship();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.common.lib.types.AnyTypeKind.ordinal()\" because \"this.anyTypeKind\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(anyTypeKind9);
        org.junit.Assert.assertNull(anyTypeKind10);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test141");
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView2 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView("hi!", "");
        java.lang.String str3 = searchView2.alias();
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView6 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView("hi!", "hi!");
        java.lang.String str7 = searchView6.alias();
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView10 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView("hi!", "hi!");
        java.lang.Class<?> wildcardClass11 = searchView10.getClass();
        boolean boolean12 = searchView6.equals((java.lang.Object) searchView10);
        boolean boolean13 = searchView2.equals((java.lang.Object) searchView6);
        java.lang.Object obj14 = null;
        boolean boolean15 = searchView6.equals(obj14);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test142");
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView2 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView("", "hi!");
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind3 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport4 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind3);
        searchSupport4.nonMandatorySchemas = true;
        boolean boolean7 = searchView2.equals((java.lang.Object) searchSupport4);
        searchSupport4.nonMandatorySchemas = true;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView10 = searchSupport4.entitlements();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.common.lib.types.AnyTypeKind.ordinal()\" because \"this.anyTypeKind\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test143");
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind0 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport1 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind0);
        searchSupport1.nonMandatorySchemas = true;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.core.persistence.jpa.dao.SearchViewSupport searchViewSupport4 = searchSupport1.asSearchViewSupport();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Not an class org.apache.syncope.core.persistence.jpa.dao.SearchViewSupport instance");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test144");
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView2 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView("", "hi!");
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind3 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport4 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind3);
        searchSupport4.nonMandatorySchemas = true;
        boolean boolean7 = searchView2.equals((java.lang.Object) searchSupport4);
        boolean boolean8 = searchSupport4.nonMandatorySchemas;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView9 = searchSupport4.auxClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.common.lib.types.AnyTypeKind.ordinal()\" because \"this.anyTypeKind\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test145");
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind0 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport1 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind0);
        boolean boolean2 = searchSupport1.nonMandatorySchemas;
        boolean boolean3 = searchSupport1.nonMandatorySchemas;
        searchSupport1.nonMandatorySchemas = false;
        searchSupport1.nonMandatorySchemas = false;
        boolean boolean8 = searchSupport1.nonMandatorySchemas;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind9 = searchSupport1.anyTypeKind;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView10 = searchSupport1.field();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.common.lib.types.AnyTypeKind.ordinal()\" because \"this.anyTypeKind\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(anyTypeKind9);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test146");
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind0 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport1 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind0);
        boolean boolean2 = searchSupport1.nonMandatorySchemas;
        boolean boolean3 = searchSupport1.nonMandatorySchemas;
        searchSupport1.nonMandatorySchemas = false;
        searchSupport1.nonMandatorySchemas = false;
        boolean boolean8 = searchSupport1.nonMandatorySchemas;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind9 = searchSupport1.anyTypeKind;
        searchSupport1.nonMandatorySchemas = false;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(anyTypeKind9);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test147");
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView2 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView("", "hi!");
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind3 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport4 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind3);
        searchSupport4.nonMandatorySchemas = true;
        boolean boolean7 = searchView2.equals((java.lang.Object) searchSupport4);
        java.lang.String str8 = searchView2.name();
        java.lang.String str9 = searchView2.toString();
        boolean boolean11 = searchView2.equals((java.lang.Object) 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SearchView[alias=, name=hi!]" + "'", str9, "SearchView[alias=, name=hi!]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test148");
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView2 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView("hi!", "hi!");
        java.lang.String str3 = searchView2.alias();
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView6 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView("hi!", "hi!");
        java.lang.Class<?> wildcardClass7 = searchView6.getClass();
        boolean boolean8 = searchView2.equals((java.lang.Object) searchView6);
        java.lang.String str9 = searchView2.alias();
        java.lang.String str10 = searchView2.alias();
        java.lang.String str11 = searchView2.alias();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test149");
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind0 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport1 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind0);
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind2 = searchSupport1.anyTypeKind;
        searchSupport1.nonMandatorySchemas = true;
        boolean boolean5 = searchSupport1.nonMandatorySchemas;
        boolean boolean6 = searchSupport1.nonMandatorySchemas;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind7 = searchSupport1.anyTypeKind;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind8 = searchSupport1.anyTypeKind;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind9 = searchSupport1.anyTypeKind;
        boolean boolean10 = searchSupport1.nonMandatorySchemas;
        org.junit.Assert.assertNull(anyTypeKind2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(anyTypeKind7);
        org.junit.Assert.assertNull(anyTypeKind8);
        org.junit.Assert.assertNull(anyTypeKind9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test150");
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind0 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport1 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind0);
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind2 = searchSupport1.anyTypeKind;
        searchSupport1.nonMandatorySchemas = true;
        searchSupport1.nonMandatorySchemas = true;
        searchSupport1.nonMandatorySchemas = true;
        boolean boolean9 = searchSupport1.nonMandatorySchemas;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView10 = searchSupport1.resource();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.common.lib.types.AnyTypeKind.ordinal()\" because \"this.anyTypeKind\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(anyTypeKind2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test151");
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView2 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView("hi!", "hi!");
        java.lang.String str3 = searchView2.alias();
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView6 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView("hi!", "hi!");
        java.lang.Class<?> wildcardClass7 = searchView6.getClass();
        boolean boolean8 = searchView2.equals((java.lang.Object) searchView6);
        java.lang.String str9 = searchView2.alias();
        java.lang.String str10 = searchView2.alias();
        java.lang.String str11 = searchView2.name();
        java.lang.String str12 = searchView2.name();
        java.lang.String str13 = searchView2.alias();
        boolean boolean15 = searchView2.equals((java.lang.Object) false);
        java.lang.String str16 = searchView2.alias();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test152");
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView2 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView("", "hi!");
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind3 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport4 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind3);
        searchSupport4.nonMandatorySchemas = true;
        boolean boolean7 = searchView2.equals((java.lang.Object) searchSupport4);
        boolean boolean8 = searchSupport4.nonMandatorySchemas;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind9 = searchSupport4.anyTypeKind;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView10 = searchSupport4.relationship();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.common.lib.types.AnyTypeKind.ordinal()\" because \"this.anyTypeKind\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(anyTypeKind9);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test153");
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind0 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport1 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind0);
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind2 = searchSupport1.anyTypeKind;
        searchSupport1.nonMandatorySchemas = true;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.core.persistence.jpa.dao.SearchSupport.SearchView searchView5 = searchSupport1.relationship();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.common.lib.types.AnyTypeKind.ordinal()\" because \"this.anyTypeKind\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(anyTypeKind2);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test154");
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind0 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport1 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind0);
        boolean boolean2 = searchSupport1.nonMandatorySchemas;
        searchSupport1.nonMandatorySchemas = true;
        boolean boolean5 = searchSupport1.nonMandatorySchemas;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind6 = searchSupport1.anyTypeKind;
        boolean boolean7 = searchSupport1.nonMandatorySchemas;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(anyTypeKind6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test155");
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind0 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport1 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind0);
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind2 = searchSupport1.anyTypeKind;
        searchSupport1.nonMandatorySchemas = true;
        searchSupport1.nonMandatorySchemas = true;
        searchSupport1.nonMandatorySchemas = true;
        boolean boolean9 = searchSupport1.nonMandatorySchemas;
        boolean boolean10 = searchSupport1.nonMandatorySchemas;
        org.junit.Assert.assertNull(anyTypeKind2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test156");
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind0 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport1 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind0);
        boolean boolean2 = searchSupport1.nonMandatorySchemas;
        searchSupport1.nonMandatorySchemas = true;
        boolean boolean5 = searchSupport1.nonMandatorySchemas;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind6 = searchSupport1.anyTypeKind;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.core.persistence.jpa.dao.SearchViewSupport searchViewSupport7 = searchSupport1.asSearchViewSupport();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Not an class org.apache.syncope.core.persistence.jpa.dao.SearchViewSupport instance");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(anyTypeKind6);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchSupportRandoopTestC20.test157");
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind0 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport1 = new org.apache.syncope.core.persistence.jpa.dao.SearchSupport(anyTypeKind0);
        boolean boolean2 = searchSupport1.nonMandatorySchemas;
        searchSupport1.nonMandatorySchemas = true;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind5 = searchSupport1.anyTypeKind;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind6 = searchSupport1.anyTypeKind;
        searchSupport1.nonMandatorySchemas = true;
        searchSupport1.nonMandatorySchemas = false;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(anyTypeKind5);
        org.junit.Assert.assertNull(anyTypeKind6);
    }
}

