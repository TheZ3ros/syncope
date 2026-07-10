package org.apache.syncope.core.persistence.jpa.dao;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AbstractJPAAnySearchDAORandoopTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractJPAAnySearchDAORandoopTest0.test1");
        org.apache.syncope.common.lib.types.AttrSchemaType attrSchemaType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.syncope.core.persistence.common.dao.AbstractSearchDAO.key(attrSchemaType0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.common.lib.types.AttrSchemaType.ordinal()\" because \"schemaType\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractJPAAnySearchDAORandoopTest0.test2");
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO0 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.entity.Realm realm1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond7 = null;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind8 = null;
        long long9 = dummyJPAAnySearchDAO0.count(realm1, true, (java.util.Set<java.lang.String>) strSet5, searchCond7, anyTypeKind8);
        java.lang.Class<?> wildcardClass10 = strSet5.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractJPAAnySearchDAORandoopTest0.test3");
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO0 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond1 = dummyJPAAnySearchDAO0.getAllMatchingCond();
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport2 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport orderBySupport3 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport.Item item4 = null;
        org.springframework.data.domain.Sort.Order order5 = null;
        org.apache.syncope.core.persistence.api.entity.PlainSchema plainSchema6 = null;
        dummyJPAAnySearchDAO0.parseOrderByForPlainSchema(searchSupport2, orderBySupport3, item4, order5, plainSchema6, "");
        org.apache.syncope.core.persistence.api.entity.Realm realm9 = null;
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO16 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond17 = dummyJPAAnySearchDAO16.getAllMatchingCond();
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind18 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long19 = dummyJPAAnySearchDAO0.count(realm9, true, (java.util.Set<java.lang.String>) strSet14, searchCond17, anyTypeKind18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmSearchDAO.findByFullPath(String)\" because \"this.realmSearchDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(searchCond1);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(searchCond17);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractJPAAnySearchDAORandoopTest0.test4");
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO0 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond1 = dummyJPAAnySearchDAO0.getAllMatchingCond();
        org.apache.syncope.core.persistence.api.dao.search.AttrCond attrCond2 = null;
        org.apache.syncope.core.persistence.common.dao.AbstractSearchDAO.CheckResult<org.apache.syncope.core.persistence.api.dao.search.AttrCond> attrCondCheckResult4 = null;
        java.lang.Object obj5 = new java.lang.Object();
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO15 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.entity.Realm realm16 = null;
        java.lang.String[] strArray19 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet20 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet20, strArray19);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond22 = null;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind23 = null;
        long long24 = dummyJPAAnySearchDAO15.count(realm16, true, (java.util.Set<java.lang.String>) strSet20, searchCond22, anyTypeKind23);
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO25 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.entity.Realm realm26 = null;
        java.lang.String[] strArray29 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet30 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet30, strArray29);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond32 = null;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind33 = null;
        long long34 = dummyJPAAnySearchDAO25.count(realm26, true, (java.util.Set<java.lang.String>) strSet30, searchCond32, anyTypeKind33);
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO35 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond36 = dummyJPAAnySearchDAO35.getAllMatchingCond();
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO48 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond49 = dummyJPAAnySearchDAO48.getAllMatchingCond();
        java.lang.Object obj65 = new java.lang.Object();
        java.lang.Object[] objArray66 = new java.lang.Object[] { obj5, (short) 10, (byte) 10, 0, 0.0f, 1, (short) -1, 0, 0, 1L, anyTypeKind23, realm26, dummyJPAAnySearchDAO35, 0.0f, 100L, "hi!", (byte) 10, ' ', '#', (-1.0d), 100.0d, 'a', (-1), (short) -1, dummyJPAAnySearchDAO48, 10, '4', (-1.0f), "hi!", 100.0f, 100L, "hi!", 0, (byte) 0, (byte) 1, (-1.0f), true, '#', true, 100L, obj65 };
        java.util.ArrayList<java.lang.Object> objList67 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList67, objArray66);
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport69 = null;
        org.apache.syncope.core.persistence.jpa.dao.AbstractJPAAnySearchDAO.AttrCondQuery attrCondQuery70 = dummyJPAAnySearchDAO0.getQuery(attrCond2, true, attrCondCheckResult4, (java.util.List<java.lang.Object>) objList67, searchSupport69);
        org.junit.Assert.assertNotNull(searchCond1);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertNotNull(searchCond36);
        org.junit.Assert.assertNotNull(searchCond49);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(attrCondQuery70);
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractJPAAnySearchDAORandoopTest0.test5");
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO0 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.entity.Realm realm1 = null;
        java.util.Set<java.lang.String> strSet3 = null;
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO4 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond5 = dummyJPAAnySearchDAO4.getAllMatchingCond();
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind6 = null;
        long long7 = dummyJPAAnySearchDAO0.count(realm1, false, strSet3, searchCond5, anyTypeKind6);
        java.lang.Class<?> wildcardClass8 = dummyJPAAnySearchDAO0.getClass();
        org.junit.Assert.assertNotNull(searchCond5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractJPAAnySearchDAORandoopTest0.test6");
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO0 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.entity.Realm realm1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO7 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.entity.Realm realm8 = null;
        java.util.Set<java.lang.String> strSet10 = null;
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO11 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond12 = dummyJPAAnySearchDAO11.getAllMatchingCond();
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind13 = null;
        long long14 = dummyJPAAnySearchDAO7.count(realm8, false, strSet10, searchCond12, anyTypeKind13);
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind15 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long16 = dummyJPAAnySearchDAO0.count(realm1, true, (java.util.Set<java.lang.String>) strSet5, searchCond12, anyTypeKind15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmSearchDAO.findByFullPath(String)\" because \"this.realmSearchDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(searchCond12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test7() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractJPAAnySearchDAORandoopTest0.test7");
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO0 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond1 = dummyJPAAnySearchDAO0.getAllMatchingCond();
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport2 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport orderBySupport3 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport.Item item4 = null;
        org.springframework.data.domain.Sort.Order order5 = null;
        org.apache.syncope.core.persistence.api.entity.PlainSchema plainSchema6 = null;
        dummyJPAAnySearchDAO0.parseOrderByForPlainSchema(searchSupport2, orderBySupport3, item4, order5, plainSchema6, "");
        java.lang.Class<?> wildcardClass9 = dummyJPAAnySearchDAO0.getClass();
        org.junit.Assert.assertNotNull(searchCond1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }
}

