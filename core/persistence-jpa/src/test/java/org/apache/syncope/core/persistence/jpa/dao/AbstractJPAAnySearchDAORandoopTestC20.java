package org.apache.syncope.core.persistence.jpa.dao;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AbstractJPAAnySearchDAORandoopTestC20 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractJPAAnySearchDAORandoopTestC20.test01");
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
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractJPAAnySearchDAORandoopTestC20.test02");
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
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractJPAAnySearchDAORandoopTestC20.test03");
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
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractJPAAnySearchDAORandoopTestC20.test04");
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
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractJPAAnySearchDAORandoopTestC20.test05");
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
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractJPAAnySearchDAORandoopTestC20.test06");
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

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractJPAAnySearchDAORandoopTestC20.test07");
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO0 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond1 = dummyJPAAnySearchDAO0.getAllMatchingCond();
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport2 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport orderBySupport3 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport.Item item4 = null;
        org.springframework.data.domain.Sort.Order order5 = null;
        org.apache.syncope.core.persistence.api.entity.PlainSchema plainSchema6 = null;
        dummyJPAAnySearchDAO0.parseOrderByForPlainSchema(searchSupport2, orderBySupport3, item4, order5, plainSchema6, "");
        org.apache.syncope.core.persistence.api.entity.Realm realm9 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO15 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.entity.Realm realm16 = null;
        java.util.Set<java.lang.String> strSet18 = null;
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO19 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond20 = dummyJPAAnySearchDAO19.getAllMatchingCond();
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind21 = null;
        long long22 = dummyJPAAnySearchDAO15.count(realm16, false, strSet18, searchCond20, anyTypeKind21);
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind23 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long24 = dummyJPAAnySearchDAO0.count(realm9, true, (java.util.Set<java.lang.String>) strSet13, searchCond20, anyTypeKind23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmSearchDAO.findByFullPath(String)\" because \"this.realmSearchDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(searchCond1);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(searchCond20);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractJPAAnySearchDAORandoopTestC20.test08");
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
        org.apache.syncope.core.persistence.api.entity.Realm realm71 = null;
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO73 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.entity.Realm realm74 = null;
        java.lang.String[] strArray77 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet78 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet78, strArray77);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond80 = null;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind81 = null;
        long long82 = dummyJPAAnySearchDAO73.count(realm74, true, (java.util.Set<java.lang.String>) strSet78, searchCond80, anyTypeKind81);
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO83 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.entity.Realm realm84 = null;
        java.util.Set<java.lang.String> strSet86 = null;
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO87 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond88 = dummyJPAAnySearchDAO87.getAllMatchingCond();
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind89 = null;
        long long90 = dummyJPAAnySearchDAO83.count(realm84, false, strSet86, searchCond88, anyTypeKind89);
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind91 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long92 = dummyJPAAnySearchDAO0.count(realm71, false, (java.util.Set<java.lang.String>) strSet78, searchCond88, anyTypeKind91);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.persistence.api.entity.Realm.getFullPath()\" because \"base\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertArrayEquals(strArray77, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + long82 + "' != '" + 0L + "'", long82 == 0L);
        org.junit.Assert.assertNotNull(searchCond88);
        org.junit.Assert.assertTrue("'" + long90 + "' != '" + 0L + "'", long90 == 0L);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractJPAAnySearchDAORandoopTestC20.test09");
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO0 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.entity.Realm realm1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO8 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.entity.Realm realm9 = null;
        java.util.Set<java.lang.String> strSet11 = null;
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO12 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond13 = dummyJPAAnySearchDAO12.getAllMatchingCond();
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind14 = null;
        long long15 = dummyJPAAnySearchDAO8.count(realm9, false, strSet11, searchCond13, anyTypeKind14);
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind16 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long17 = dummyJPAAnySearchDAO0.count(realm1, false, (java.util.Set<java.lang.String>) strSet6, searchCond13, anyTypeKind16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.persistence.api.entity.Realm.getFullPath()\" because \"base\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(searchCond13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractJPAAnySearchDAORandoopTestC20.test10");
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO0 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.entity.Realm realm1 = null;
        java.util.Set<java.lang.String> strSet3 = null;
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO4 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond5 = dummyJPAAnySearchDAO4.getAllMatchingCond();
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind6 = null;
        long long7 = dummyJPAAnySearchDAO0.count(realm1, false, strSet3, searchCond5, anyTypeKind6);
        org.apache.syncope.core.persistence.api.entity.Realm realm8 = null;
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO10 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.entity.Realm realm11 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet15 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet15, strArray14);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond17 = null;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind18 = null;
        long long19 = dummyJPAAnySearchDAO10.count(realm11, true, (java.util.Set<java.lang.String>) strSet15, searchCond17, anyTypeKind18);
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO20 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond21 = dummyJPAAnySearchDAO20.getAllMatchingCond();
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind22 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long23 = dummyJPAAnySearchDAO0.count(realm8, true, (java.util.Set<java.lang.String>) strSet15, searchCond21, anyTypeKind22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmSearchDAO.findByFullPath(String)\" because \"this.realmSearchDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(searchCond5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(searchCond21);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractJPAAnySearchDAORandoopTestC20.test11");
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO0 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.entity.Realm realm1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
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
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(searchCond12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractJPAAnySearchDAORandoopTestC20.test12");
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO0 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.AttrCond attrCond1 = null;
        org.apache.syncope.core.persistence.common.dao.AbstractSearchDAO.CheckResult<org.apache.syncope.core.persistence.api.dao.search.AttrCond> attrCondCheckResult3 = null;
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO4 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond5 = dummyJPAAnySearchDAO4.getAllMatchingCond();
        org.apache.syncope.core.persistence.api.dao.search.AttrCond attrCond6 = null;
        org.apache.syncope.core.persistence.common.dao.AbstractSearchDAO.CheckResult<org.apache.syncope.core.persistence.api.dao.search.AttrCond> attrCondCheckResult8 = null;
        java.lang.Object obj9 = new java.lang.Object();
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO19 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.entity.Realm realm20 = null;
        java.lang.String[] strArray23 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond26 = null;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind27 = null;
        long long28 = dummyJPAAnySearchDAO19.count(realm20, true, (java.util.Set<java.lang.String>) strSet24, searchCond26, anyTypeKind27);
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO29 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.entity.Realm realm30 = null;
        java.lang.String[] strArray33 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet34 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet34, strArray33);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond36 = null;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind37 = null;
        long long38 = dummyJPAAnySearchDAO29.count(realm30, true, (java.util.Set<java.lang.String>) strSet34, searchCond36, anyTypeKind37);
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO39 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond40 = dummyJPAAnySearchDAO39.getAllMatchingCond();
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO52 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond53 = dummyJPAAnySearchDAO52.getAllMatchingCond();
        java.lang.Object obj69 = new java.lang.Object();
        java.lang.Object[] objArray70 = new java.lang.Object[] { obj9, (short) 10, (byte) 10, 0, 0.0f, 1, (short) -1, 0, 0, 1L, anyTypeKind27, realm30, dummyJPAAnySearchDAO39, 0.0f, 100L, "hi!", (byte) 10, ' ', '#', (-1.0d), 100.0d, 'a', (-1), (short) -1, dummyJPAAnySearchDAO52, 10, '4', (-1.0f), "hi!", 100.0f, 100L, "hi!", 0, (byte) 0, (byte) 1, (-1.0f), true, '#', true, 100L, obj69 };
        java.util.ArrayList<java.lang.Object> objList71 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList71, objArray70);
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport73 = null;
        org.apache.syncope.core.persistence.jpa.dao.AbstractJPAAnySearchDAO.AttrCondQuery attrCondQuery74 = dummyJPAAnySearchDAO4.getQuery(attrCond6, true, attrCondCheckResult8, (java.util.List<java.lang.Object>) objList71, searchSupport73);
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport75 = null;
        org.apache.syncope.core.persistence.jpa.dao.AbstractJPAAnySearchDAO.AttrCondQuery attrCondQuery76 = dummyJPAAnySearchDAO0.getQuery(attrCond1, true, attrCondCheckResult3, (java.util.List<java.lang.Object>) objList71, searchSupport75);
        java.lang.Class<?> wildcardClass77 = attrCondQuery76.getClass();
        org.junit.Assert.assertNotNull(searchCond5);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertNotNull(searchCond40);
        org.junit.Assert.assertNotNull(searchCond53);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(attrCondQuery74);
        org.junit.Assert.assertNotNull(attrCondQuery76);
        org.junit.Assert.assertNotNull(wildcardClass77);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractJPAAnySearchDAORandoopTestC20.test13");
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO0 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport1 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport orderBySupport2 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport.Item item3 = null;
        org.springframework.data.domain.Sort.Order order4 = null;
        org.apache.syncope.core.persistence.api.entity.PlainSchema plainSchema5 = null;
        dummyJPAAnySearchDAO0.parseOrderByForPlainSchema(searchSupport1, orderBySupport2, item3, order4, plainSchema5, "");
        org.apache.syncope.core.persistence.api.entity.Realm realm8 = null;
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO10 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.entity.Realm realm11 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet15 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet15, strArray14);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond17 = null;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind18 = null;
        long long19 = dummyJPAAnySearchDAO10.count(realm11, true, (java.util.Set<java.lang.String>) strSet15, searchCond17, anyTypeKind18);
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO20 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.entity.Realm realm21 = null;
        java.util.Set<java.lang.String> strSet23 = null;
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO24 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond25 = dummyJPAAnySearchDAO24.getAllMatchingCond();
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind26 = null;
        long long27 = dummyJPAAnySearchDAO20.count(realm21, false, strSet23, searchCond25, anyTypeKind26);
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind28 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long29 = dummyJPAAnySearchDAO0.count(realm8, false, (java.util.Set<java.lang.String>) strSet15, searchCond25, anyTypeKind28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.persistence.api.entity.Realm.getFullPath()\" because \"base\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(searchCond25);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractJPAAnySearchDAORandoopTestC20.test14");
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO0 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.entity.Realm realm1 = null;
        java.util.Set<java.lang.String> strSet3 = null;
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO4 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond5 = dummyJPAAnySearchDAO4.getAllMatchingCond();
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind6 = null;
        long long7 = dummyJPAAnySearchDAO0.count(realm1, false, strSet3, searchCond5, anyTypeKind6);
        org.apache.syncope.core.persistence.api.entity.Realm realm8 = null;
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO14 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.AttrCond attrCond15 = null;
        org.apache.syncope.core.persistence.common.dao.AbstractSearchDAO.CheckResult<org.apache.syncope.core.persistence.api.dao.search.AttrCond> attrCondCheckResult17 = null;
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO18 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond19 = dummyJPAAnySearchDAO18.getAllMatchingCond();
        org.apache.syncope.core.persistence.api.dao.search.AttrCond attrCond20 = null;
        org.apache.syncope.core.persistence.common.dao.AbstractSearchDAO.CheckResult<org.apache.syncope.core.persistence.api.dao.search.AttrCond> attrCondCheckResult22 = null;
        java.lang.Object obj23 = new java.lang.Object();
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO33 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.entity.Realm realm34 = null;
        java.lang.String[] strArray37 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet38 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet38, strArray37);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond40 = null;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind41 = null;
        long long42 = dummyJPAAnySearchDAO33.count(realm34, true, (java.util.Set<java.lang.String>) strSet38, searchCond40, anyTypeKind41);
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO43 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.entity.Realm realm44 = null;
        java.lang.String[] strArray47 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet48 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet48, strArray47);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond50 = null;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind51 = null;
        long long52 = dummyJPAAnySearchDAO43.count(realm44, true, (java.util.Set<java.lang.String>) strSet48, searchCond50, anyTypeKind51);
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO53 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond54 = dummyJPAAnySearchDAO53.getAllMatchingCond();
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO66 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond67 = dummyJPAAnySearchDAO66.getAllMatchingCond();
        java.lang.Object obj83 = new java.lang.Object();
        java.lang.Object[] objArray84 = new java.lang.Object[] { obj23, (short) 10, (byte) 10, 0, 0.0f, 1, (short) -1, 0, 0, 1L, anyTypeKind41, realm44, dummyJPAAnySearchDAO53, 0.0f, 100L, "hi!", (byte) 10, ' ', '#', (-1.0d), 100.0d, 'a', (-1), (short) -1, dummyJPAAnySearchDAO66, 10, '4', (-1.0f), "hi!", 100.0f, 100L, "hi!", 0, (byte) 0, (byte) 1, (-1.0f), true, '#', true, 100L, obj83 };
        java.util.ArrayList<java.lang.Object> objList85 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList85, objArray84);
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport87 = null;
        org.apache.syncope.core.persistence.jpa.dao.AbstractJPAAnySearchDAO.AttrCondQuery attrCondQuery88 = dummyJPAAnySearchDAO18.getQuery(attrCond20, true, attrCondCheckResult22, (java.util.List<java.lang.Object>) objList85, searchSupport87);
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport89 = null;
        org.apache.syncope.core.persistence.jpa.dao.AbstractJPAAnySearchDAO.AttrCondQuery attrCondQuery90 = dummyJPAAnySearchDAO14.getQuery(attrCond15, true, attrCondCheckResult17, (java.util.List<java.lang.Object>) objList85, searchSupport89);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond91 = dummyJPAAnySearchDAO14.getAllMatchingCond();
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind92 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long93 = dummyJPAAnySearchDAO0.count(realm8, false, (java.util.Set<java.lang.String>) strSet12, searchCond91, anyTypeKind92);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.persistence.api.entity.Realm.getFullPath()\" because \"base\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(searchCond5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(searchCond19);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertArrayEquals(strArray37, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertArrayEquals(strArray47, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertNotNull(searchCond54);
        org.junit.Assert.assertNotNull(searchCond67);
        org.junit.Assert.assertNotNull(objArray84);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertNotNull(attrCondQuery88);
        org.junit.Assert.assertNotNull(attrCondQuery90);
        org.junit.Assert.assertNotNull(searchCond91);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractJPAAnySearchDAORandoopTestC20.test15");
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO0 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport1 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport orderBySupport2 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport.Item item3 = null;
        org.springframework.data.domain.Sort.Order order4 = null;
        org.apache.syncope.core.persistence.api.entity.PlainSchema plainSchema5 = null;
        dummyJPAAnySearchDAO0.parseOrderByForPlainSchema(searchSupport1, orderBySupport2, item3, order4, plainSchema5, "");
        org.apache.syncope.core.persistence.api.entity.Realm realm8 = null;
        java.lang.String[] strArray11 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO14 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.AttrCond attrCond15 = null;
        org.apache.syncope.core.persistence.common.dao.AbstractSearchDAO.CheckResult<org.apache.syncope.core.persistence.api.dao.search.AttrCond> attrCondCheckResult17 = null;
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO18 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond19 = dummyJPAAnySearchDAO18.getAllMatchingCond();
        org.apache.syncope.core.persistence.api.dao.search.AttrCond attrCond20 = null;
        org.apache.syncope.core.persistence.common.dao.AbstractSearchDAO.CheckResult<org.apache.syncope.core.persistence.api.dao.search.AttrCond> attrCondCheckResult22 = null;
        java.lang.Object obj23 = new java.lang.Object();
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO33 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.entity.Realm realm34 = null;
        java.lang.String[] strArray37 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet38 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet38, strArray37);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond40 = null;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind41 = null;
        long long42 = dummyJPAAnySearchDAO33.count(realm34, true, (java.util.Set<java.lang.String>) strSet38, searchCond40, anyTypeKind41);
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO43 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.entity.Realm realm44 = null;
        java.lang.String[] strArray47 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet48 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet48, strArray47);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond50 = null;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind51 = null;
        long long52 = dummyJPAAnySearchDAO43.count(realm44, true, (java.util.Set<java.lang.String>) strSet48, searchCond50, anyTypeKind51);
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO53 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond54 = dummyJPAAnySearchDAO53.getAllMatchingCond();
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO66 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond67 = dummyJPAAnySearchDAO66.getAllMatchingCond();
        java.lang.Object obj83 = new java.lang.Object();
        java.lang.Object[] objArray84 = new java.lang.Object[] { obj23, (short) 10, (byte) 10, 0, 0.0f, 1, (short) -1, 0, 0, 1L, anyTypeKind41, realm44, dummyJPAAnySearchDAO53, 0.0f, 100L, "hi!", (byte) 10, ' ', '#', (-1.0d), 100.0d, 'a', (-1), (short) -1, dummyJPAAnySearchDAO66, 10, '4', (-1.0f), "hi!", 100.0f, 100L, "hi!", 0, (byte) 0, (byte) 1, (-1.0f), true, '#', true, 100L, obj83 };
        java.util.ArrayList<java.lang.Object> objList85 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList85, objArray84);
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport87 = null;
        org.apache.syncope.core.persistence.jpa.dao.AbstractJPAAnySearchDAO.AttrCondQuery attrCondQuery88 = dummyJPAAnySearchDAO18.getQuery(attrCond20, true, attrCondCheckResult22, (java.util.List<java.lang.Object>) objList85, searchSupport87);
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport89 = null;
        org.apache.syncope.core.persistence.jpa.dao.AbstractJPAAnySearchDAO.AttrCondQuery attrCondQuery90 = dummyJPAAnySearchDAO14.getQuery(attrCond15, true, attrCondCheckResult17, (java.util.List<java.lang.Object>) objList85, searchSupport89);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond91 = dummyJPAAnySearchDAO14.getAllMatchingCond();
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind92 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long93 = dummyJPAAnySearchDAO0.count(realm8, true, (java.util.Set<java.lang.String>) strSet12, searchCond91, anyTypeKind92);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmSearchDAO.findByFullPath(String)\" because \"this.realmSearchDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(searchCond19);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertArrayEquals(strArray37, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertArrayEquals(strArray47, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertNotNull(searchCond54);
        org.junit.Assert.assertNotNull(searchCond67);
        org.junit.Assert.assertNotNull(objArray84);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertNotNull(attrCondQuery88);
        org.junit.Assert.assertNotNull(attrCondQuery90);
        org.junit.Assert.assertNotNull(searchCond91);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractJPAAnySearchDAORandoopTestC20.test16");
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO0 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.entity.Realm realm1 = null;
        java.util.Set<java.lang.String> strSet3 = null;
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO4 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond5 = dummyJPAAnySearchDAO4.getAllMatchingCond();
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind6 = null;
        long long7 = dummyJPAAnySearchDAO0.count(realm1, false, strSet3, searchCond5, anyTypeKind6);
        java.lang.Class<?> wildcardClass8 = searchCond5.getClass();
        org.junit.Assert.assertNotNull(searchCond5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractJPAAnySearchDAORandoopTestC20.test17");
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO0 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.AttrCond attrCond1 = null;
        org.apache.syncope.core.persistence.common.dao.AbstractSearchDAO.CheckResult<org.apache.syncope.core.persistence.api.dao.search.AttrCond> attrCondCheckResult3 = null;
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO4 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond5 = dummyJPAAnySearchDAO4.getAllMatchingCond();
        org.apache.syncope.core.persistence.api.dao.search.AttrCond attrCond6 = null;
        org.apache.syncope.core.persistence.common.dao.AbstractSearchDAO.CheckResult<org.apache.syncope.core.persistence.api.dao.search.AttrCond> attrCondCheckResult8 = null;
        java.lang.Object obj9 = new java.lang.Object();
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO19 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.entity.Realm realm20 = null;
        java.lang.String[] strArray23 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond26 = null;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind27 = null;
        long long28 = dummyJPAAnySearchDAO19.count(realm20, true, (java.util.Set<java.lang.String>) strSet24, searchCond26, anyTypeKind27);
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO29 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.entity.Realm realm30 = null;
        java.lang.String[] strArray33 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet34 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet34, strArray33);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond36 = null;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind37 = null;
        long long38 = dummyJPAAnySearchDAO29.count(realm30, true, (java.util.Set<java.lang.String>) strSet34, searchCond36, anyTypeKind37);
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO39 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond40 = dummyJPAAnySearchDAO39.getAllMatchingCond();
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO52 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond53 = dummyJPAAnySearchDAO52.getAllMatchingCond();
        java.lang.Object obj69 = new java.lang.Object();
        java.lang.Object[] objArray70 = new java.lang.Object[] { obj9, (short) 10, (byte) 10, 0, 0.0f, 1, (short) -1, 0, 0, 1L, anyTypeKind27, realm30, dummyJPAAnySearchDAO39, 0.0f, 100L, "hi!", (byte) 10, ' ', '#', (-1.0d), 100.0d, 'a', (-1), (short) -1, dummyJPAAnySearchDAO52, 10, '4', (-1.0f), "hi!", 100.0f, 100L, "hi!", 0, (byte) 0, (byte) 1, (-1.0f), true, '#', true, 100L, obj69 };
        java.util.ArrayList<java.lang.Object> objList71 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList71, objArray70);
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport73 = null;
        org.apache.syncope.core.persistence.jpa.dao.AbstractJPAAnySearchDAO.AttrCondQuery attrCondQuery74 = dummyJPAAnySearchDAO4.getQuery(attrCond6, true, attrCondCheckResult8, (java.util.List<java.lang.Object>) objList71, searchSupport73);
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport75 = null;
        org.apache.syncope.core.persistence.jpa.dao.AbstractJPAAnySearchDAO.AttrCondQuery attrCondQuery76 = dummyJPAAnySearchDAO0.getQuery(attrCond1, true, attrCondCheckResult3, (java.util.List<java.lang.Object>) objList71, searchSupport75);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond77 = dummyJPAAnySearchDAO0.getAllMatchingCond();
        java.lang.Class<?> wildcardClass78 = dummyJPAAnySearchDAO0.getClass();
        org.junit.Assert.assertNotNull(searchCond5);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertNotNull(searchCond40);
        org.junit.Assert.assertNotNull(searchCond53);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(attrCondQuery74);
        org.junit.Assert.assertNotNull(attrCondQuery76);
        org.junit.Assert.assertNotNull(searchCond77);
        org.junit.Assert.assertNotNull(wildcardClass78);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractJPAAnySearchDAORandoopTestC20.test18");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractJPAAnySearchDAORandoopTestC20.test19");
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO0 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond1 = dummyJPAAnySearchDAO0.getAllMatchingCond();
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport2 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport orderBySupport3 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport.Item item4 = null;
        org.springframework.data.domain.Sort.Order order5 = null;
        org.apache.syncope.core.persistence.api.entity.PlainSchema plainSchema6 = null;
        dummyJPAAnySearchDAO0.parseOrderByForPlainSchema(searchSupport2, orderBySupport3, item4, order5, plainSchema6, "");
        org.apache.syncope.core.persistence.api.entity.Realm realm9 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO15 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.entity.Realm realm16 = null;
        java.lang.String[] strArray19 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet20 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet20, strArray19);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond22 = null;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind23 = null;
        long long24 = dummyJPAAnySearchDAO15.count(realm16, true, (java.util.Set<java.lang.String>) strSet20, searchCond22, anyTypeKind23);
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport25 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport orderBySupport26 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport.Item item27 = null;
        org.springframework.data.domain.Sort.Order order28 = null;
        org.apache.syncope.core.persistence.api.entity.PlainSchema plainSchema29 = null;
        dummyJPAAnySearchDAO15.parseOrderByForPlainSchema(searchSupport25, orderBySupport26, item27, order28, plainSchema29, "");
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond32 = dummyJPAAnySearchDAO15.getAllMatchingCond();
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind33 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long34 = dummyJPAAnySearchDAO0.count(realm9, false, (java.util.Set<java.lang.String>) strSet13, searchCond32, anyTypeKind33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.persistence.api.entity.Realm.getFullPath()\" because \"base\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(searchCond1);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(searchCond32);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractJPAAnySearchDAORandoopTestC20.test20");
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO0 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.AttrCond attrCond1 = null;
        org.apache.syncope.core.persistence.common.dao.AbstractSearchDAO.CheckResult<org.apache.syncope.core.persistence.api.dao.search.AttrCond> attrCondCheckResult3 = null;
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO4 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond5 = dummyJPAAnySearchDAO4.getAllMatchingCond();
        org.apache.syncope.core.persistence.api.dao.search.AttrCond attrCond6 = null;
        org.apache.syncope.core.persistence.common.dao.AbstractSearchDAO.CheckResult<org.apache.syncope.core.persistence.api.dao.search.AttrCond> attrCondCheckResult8 = null;
        java.lang.Object obj9 = new java.lang.Object();
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO19 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.entity.Realm realm20 = null;
        java.lang.String[] strArray23 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond26 = null;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind27 = null;
        long long28 = dummyJPAAnySearchDAO19.count(realm20, true, (java.util.Set<java.lang.String>) strSet24, searchCond26, anyTypeKind27);
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO29 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.entity.Realm realm30 = null;
        java.lang.String[] strArray33 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet34 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet34, strArray33);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond36 = null;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind37 = null;
        long long38 = dummyJPAAnySearchDAO29.count(realm30, true, (java.util.Set<java.lang.String>) strSet34, searchCond36, anyTypeKind37);
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO39 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond40 = dummyJPAAnySearchDAO39.getAllMatchingCond();
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO52 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond53 = dummyJPAAnySearchDAO52.getAllMatchingCond();
        java.lang.Object obj69 = new java.lang.Object();
        java.lang.Object[] objArray70 = new java.lang.Object[] { obj9, (short) 10, (byte) 10, 0, 0.0f, 1, (short) -1, 0, 0, 1L, anyTypeKind27, realm30, dummyJPAAnySearchDAO39, 0.0f, 100L, "hi!", (byte) 10, ' ', '#', (-1.0d), 100.0d, 'a', (-1), (short) -1, dummyJPAAnySearchDAO52, 10, '4', (-1.0f), "hi!", 100.0f, 100L, "hi!", 0, (byte) 0, (byte) 1, (-1.0f), true, '#', true, 100L, obj69 };
        java.util.ArrayList<java.lang.Object> objList71 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList71, objArray70);
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport73 = null;
        org.apache.syncope.core.persistence.jpa.dao.AbstractJPAAnySearchDAO.AttrCondQuery attrCondQuery74 = dummyJPAAnySearchDAO4.getQuery(attrCond6, true, attrCondCheckResult8, (java.util.List<java.lang.Object>) objList71, searchSupport73);
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport75 = null;
        org.apache.syncope.core.persistence.jpa.dao.AbstractJPAAnySearchDAO.AttrCondQuery attrCondQuery76 = dummyJPAAnySearchDAO0.getQuery(attrCond1, true, attrCondCheckResult3, (java.util.List<java.lang.Object>) objList71, searchSupport75);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond77 = dummyJPAAnySearchDAO0.getAllMatchingCond();
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport78 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport orderBySupport79 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport.Item item80 = null;
        org.springframework.data.domain.Sort.Order order81 = null;
        org.apache.syncope.core.persistence.api.entity.PlainSchema plainSchema82 = null;
        dummyJPAAnySearchDAO0.parseOrderByForPlainSchema(searchSupport78, orderBySupport79, item80, order81, plainSchema82, "");
        java.lang.Class<?> wildcardClass85 = dummyJPAAnySearchDAO0.getClass();
        org.junit.Assert.assertNotNull(searchCond5);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertNotNull(searchCond40);
        org.junit.Assert.assertNotNull(searchCond53);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(attrCondQuery74);
        org.junit.Assert.assertNotNull(attrCondQuery76);
        org.junit.Assert.assertNotNull(searchCond77);
        org.junit.Assert.assertNotNull(wildcardClass85);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractJPAAnySearchDAORandoopTestC20.test21");
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
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport71 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport orderBySupport72 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport.Item item73 = null;
        org.springframework.data.domain.Sort.Order order74 = null;
        org.apache.syncope.core.persistence.api.entity.PlainSchema plainSchema75 = null;
        dummyJPAAnySearchDAO0.parseOrderByForPlainSchema(searchSupport71, orderBySupport72, item73, order74, plainSchema75, "");
        java.lang.Class<?> wildcardClass78 = dummyJPAAnySearchDAO0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass78);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractJPAAnySearchDAORandoopTestC20.test22");
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO0 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond1 = dummyJPAAnySearchDAO0.getAllMatchingCond();
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport2 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport orderBySupport3 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport.Item item4 = null;
        org.springframework.data.domain.Sort.Order order5 = null;
        org.apache.syncope.core.persistence.api.entity.PlainSchema plainSchema6 = null;
        dummyJPAAnySearchDAO0.parseOrderByForPlainSchema(searchSupport2, orderBySupport3, item4, order5, plainSchema6, "");
        org.apache.syncope.core.persistence.api.entity.Realm realm9 = null;
        java.lang.String[] strArray13 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO16 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.AttrCond attrCond17 = null;
        org.apache.syncope.core.persistence.common.dao.AbstractSearchDAO.CheckResult<org.apache.syncope.core.persistence.api.dao.search.AttrCond> attrCondCheckResult19 = null;
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO20 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond21 = dummyJPAAnySearchDAO20.getAllMatchingCond();
        org.apache.syncope.core.persistence.api.dao.search.AttrCond attrCond22 = null;
        org.apache.syncope.core.persistence.common.dao.AbstractSearchDAO.CheckResult<org.apache.syncope.core.persistence.api.dao.search.AttrCond> attrCondCheckResult24 = null;
        java.lang.Object obj25 = new java.lang.Object();
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO35 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.entity.Realm realm36 = null;
        java.lang.String[] strArray39 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet40 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet40, strArray39);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond42 = null;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind43 = null;
        long long44 = dummyJPAAnySearchDAO35.count(realm36, true, (java.util.Set<java.lang.String>) strSet40, searchCond42, anyTypeKind43);
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO45 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.entity.Realm realm46 = null;
        java.lang.String[] strArray49 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet50 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet50, strArray49);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond52 = null;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind53 = null;
        long long54 = dummyJPAAnySearchDAO45.count(realm46, true, (java.util.Set<java.lang.String>) strSet50, searchCond52, anyTypeKind53);
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO55 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond56 = dummyJPAAnySearchDAO55.getAllMatchingCond();
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO68 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond69 = dummyJPAAnySearchDAO68.getAllMatchingCond();
        java.lang.Object obj85 = new java.lang.Object();
        java.lang.Object[] objArray86 = new java.lang.Object[] { obj25, (short) 10, (byte) 10, 0, 0.0f, 1, (short) -1, 0, 0, 1L, anyTypeKind43, realm46, dummyJPAAnySearchDAO55, 0.0f, 100L, "hi!", (byte) 10, ' ', '#', (-1.0d), 100.0d, 'a', (-1), (short) -1, dummyJPAAnySearchDAO68, 10, '4', (-1.0f), "hi!", 100.0f, 100L, "hi!", 0, (byte) 0, (byte) 1, (-1.0f), true, '#', true, 100L, obj85 };
        java.util.ArrayList<java.lang.Object> objList87 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList87, objArray86);
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport89 = null;
        org.apache.syncope.core.persistence.jpa.dao.AbstractJPAAnySearchDAO.AttrCondQuery attrCondQuery90 = dummyJPAAnySearchDAO20.getQuery(attrCond22, true, attrCondCheckResult24, (java.util.List<java.lang.Object>) objList87, searchSupport89);
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport91 = null;
        org.apache.syncope.core.persistence.jpa.dao.AbstractJPAAnySearchDAO.AttrCondQuery attrCondQuery92 = dummyJPAAnySearchDAO16.getQuery(attrCond17, true, attrCondCheckResult19, (java.util.List<java.lang.Object>) objList87, searchSupport91);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond93 = dummyJPAAnySearchDAO16.getAllMatchingCond();
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond94 = dummyJPAAnySearchDAO16.getAllMatchingCond();
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind95 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long96 = dummyJPAAnySearchDAO0.count(realm9, false, (java.util.Set<java.lang.String>) strSet14, searchCond94, anyTypeKind95);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.persistence.api.entity.Realm.getFullPath()\" because \"base\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(searchCond1);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(searchCond21);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertArrayEquals(strArray39, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertArrayEquals(strArray49, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
        org.junit.Assert.assertNotNull(searchCond56);
        org.junit.Assert.assertNotNull(searchCond69);
        org.junit.Assert.assertNotNull(objArray86);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertNotNull(attrCondQuery90);
        org.junit.Assert.assertNotNull(attrCondQuery92);
        org.junit.Assert.assertNotNull(searchCond93);
        org.junit.Assert.assertNotNull(searchCond94);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractJPAAnySearchDAORandoopTestC20.test23");
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO0 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.AttrCond attrCond1 = null;
        org.apache.syncope.core.persistence.common.dao.AbstractSearchDAO.CheckResult<org.apache.syncope.core.persistence.api.dao.search.AttrCond> attrCondCheckResult3 = null;
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO4 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond5 = dummyJPAAnySearchDAO4.getAllMatchingCond();
        org.apache.syncope.core.persistence.api.dao.search.AttrCond attrCond6 = null;
        org.apache.syncope.core.persistence.common.dao.AbstractSearchDAO.CheckResult<org.apache.syncope.core.persistence.api.dao.search.AttrCond> attrCondCheckResult8 = null;
        java.lang.Object obj9 = new java.lang.Object();
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO19 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.entity.Realm realm20 = null;
        java.lang.String[] strArray23 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond26 = null;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind27 = null;
        long long28 = dummyJPAAnySearchDAO19.count(realm20, true, (java.util.Set<java.lang.String>) strSet24, searchCond26, anyTypeKind27);
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO29 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.entity.Realm realm30 = null;
        java.lang.String[] strArray33 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet34 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet34, strArray33);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond36 = null;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind37 = null;
        long long38 = dummyJPAAnySearchDAO29.count(realm30, true, (java.util.Set<java.lang.String>) strSet34, searchCond36, anyTypeKind37);
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO39 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond40 = dummyJPAAnySearchDAO39.getAllMatchingCond();
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO52 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond53 = dummyJPAAnySearchDAO52.getAllMatchingCond();
        java.lang.Object obj69 = new java.lang.Object();
        java.lang.Object[] objArray70 = new java.lang.Object[] { obj9, (short) 10, (byte) 10, 0, 0.0f, 1, (short) -1, 0, 0, 1L, anyTypeKind27, realm30, dummyJPAAnySearchDAO39, 0.0f, 100L, "hi!", (byte) 10, ' ', '#', (-1.0d), 100.0d, 'a', (-1), (short) -1, dummyJPAAnySearchDAO52, 10, '4', (-1.0f), "hi!", 100.0f, 100L, "hi!", 0, (byte) 0, (byte) 1, (-1.0f), true, '#', true, 100L, obj69 };
        java.util.ArrayList<java.lang.Object> objList71 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList71, objArray70);
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport73 = null;
        org.apache.syncope.core.persistence.jpa.dao.AbstractJPAAnySearchDAO.AttrCondQuery attrCondQuery74 = dummyJPAAnySearchDAO4.getQuery(attrCond6, true, attrCondCheckResult8, (java.util.List<java.lang.Object>) objList71, searchSupport73);
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport75 = null;
        org.apache.syncope.core.persistence.jpa.dao.AbstractJPAAnySearchDAO.AttrCondQuery attrCondQuery76 = dummyJPAAnySearchDAO0.getQuery(attrCond1, true, attrCondCheckResult3, (java.util.List<java.lang.Object>) objList71, searchSupport75);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond77 = dummyJPAAnySearchDAO0.getAllMatchingCond();
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond78 = dummyJPAAnySearchDAO0.getAllMatchingCond();
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond79 = dummyJPAAnySearchDAO0.getAllMatchingCond();
        java.lang.Class<?> wildcardClass80 = dummyJPAAnySearchDAO0.getClass();
        org.junit.Assert.assertNotNull(searchCond5);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertNotNull(searchCond40);
        org.junit.Assert.assertNotNull(searchCond53);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(attrCondQuery74);
        org.junit.Assert.assertNotNull(attrCondQuery76);
        org.junit.Assert.assertNotNull(searchCond77);
        org.junit.Assert.assertNotNull(searchCond78);
        org.junit.Assert.assertNotNull(searchCond79);
        org.junit.Assert.assertNotNull(wildcardClass80);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractJPAAnySearchDAORandoopTestC20.test24");
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO0 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        java.lang.Class<?> wildcardClass1 = dummyJPAAnySearchDAO0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractJPAAnySearchDAORandoopTestC20.test25");
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO0 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.AttrCond attrCond1 = null;
        org.apache.syncope.core.persistence.common.dao.AbstractSearchDAO.CheckResult<org.apache.syncope.core.persistence.api.dao.search.AttrCond> attrCondCheckResult3 = null;
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO4 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond5 = dummyJPAAnySearchDAO4.getAllMatchingCond();
        org.apache.syncope.core.persistence.api.dao.search.AttrCond attrCond6 = null;
        org.apache.syncope.core.persistence.common.dao.AbstractSearchDAO.CheckResult<org.apache.syncope.core.persistence.api.dao.search.AttrCond> attrCondCheckResult8 = null;
        java.lang.Object obj9 = new java.lang.Object();
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO19 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.entity.Realm realm20 = null;
        java.lang.String[] strArray23 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond26 = null;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind27 = null;
        long long28 = dummyJPAAnySearchDAO19.count(realm20, true, (java.util.Set<java.lang.String>) strSet24, searchCond26, anyTypeKind27);
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO29 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.entity.Realm realm30 = null;
        java.lang.String[] strArray33 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet34 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet34, strArray33);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond36 = null;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind37 = null;
        long long38 = dummyJPAAnySearchDAO29.count(realm30, true, (java.util.Set<java.lang.String>) strSet34, searchCond36, anyTypeKind37);
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO39 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond40 = dummyJPAAnySearchDAO39.getAllMatchingCond();
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO52 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond53 = dummyJPAAnySearchDAO52.getAllMatchingCond();
        java.lang.Object obj69 = new java.lang.Object();
        java.lang.Object[] objArray70 = new java.lang.Object[] { obj9, (short) 10, (byte) 10, 0, 0.0f, 1, (short) -1, 0, 0, 1L, anyTypeKind27, realm30, dummyJPAAnySearchDAO39, 0.0f, 100L, "hi!", (byte) 10, ' ', '#', (-1.0d), 100.0d, 'a', (-1), (short) -1, dummyJPAAnySearchDAO52, 10, '4', (-1.0f), "hi!", 100.0f, 100L, "hi!", 0, (byte) 0, (byte) 1, (-1.0f), true, '#', true, 100L, obj69 };
        java.util.ArrayList<java.lang.Object> objList71 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList71, objArray70);
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport73 = null;
        org.apache.syncope.core.persistence.jpa.dao.AbstractJPAAnySearchDAO.AttrCondQuery attrCondQuery74 = dummyJPAAnySearchDAO4.getQuery(attrCond6, true, attrCondCheckResult8, (java.util.List<java.lang.Object>) objList71, searchSupport73);
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport75 = null;
        org.apache.syncope.core.persistence.jpa.dao.AbstractJPAAnySearchDAO.AttrCondQuery attrCondQuery76 = dummyJPAAnySearchDAO0.getQuery(attrCond1, true, attrCondCheckResult3, (java.util.List<java.lang.Object>) objList71, searchSupport75);
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport77 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport orderBySupport78 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport.Item item79 = null;
        org.springframework.data.domain.Sort.Order order80 = null;
        org.apache.syncope.core.persistence.api.entity.PlainSchema plainSchema81 = null;
        dummyJPAAnySearchDAO0.parseOrderByForPlainSchema(searchSupport77, orderBySupport78, item79, order80, plainSchema81, "");
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport84 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport orderBySupport85 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport.Item item86 = null;
        org.springframework.data.domain.Sort.Order order87 = null;
        org.apache.syncope.core.persistence.api.entity.PlainSchema plainSchema88 = null;
        dummyJPAAnySearchDAO0.parseOrderByForPlainSchema(searchSupport84, orderBySupport85, item86, order87, plainSchema88, "hi!");
        org.apache.syncope.core.persistence.api.dao.search.AttrCond attrCond91 = null;
        org.apache.syncope.core.persistence.common.dao.AbstractSearchDAO.CheckResult<org.apache.syncope.core.persistence.api.dao.search.AttrCond> attrCondCheckResult93 = null;
        java.util.List<java.lang.Object> objList94 = null;
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport95 = null;
        org.apache.syncope.core.persistence.jpa.dao.AbstractJPAAnySearchDAO.AttrCondQuery attrCondQuery96 = dummyJPAAnySearchDAO0.getQuery(attrCond91, true, attrCondCheckResult93, objList94, searchSupport95);
        org.junit.Assert.assertNotNull(searchCond5);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertNotNull(searchCond40);
        org.junit.Assert.assertNotNull(searchCond53);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(attrCondQuery74);
        org.junit.Assert.assertNotNull(attrCondQuery76);
        org.junit.Assert.assertNotNull(attrCondQuery96);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractJPAAnySearchDAORandoopTestC20.test26");
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO0 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.entity.Realm realm1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond7 = null;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind8 = null;
        long long9 = dummyJPAAnySearchDAO0.count(realm1, true, (java.util.Set<java.lang.String>) strSet5, searchCond7, anyTypeKind8);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond10 = dummyJPAAnySearchDAO0.getAllMatchingCond();
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport11 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport orderBySupport12 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport.Item item13 = null;
        org.springframework.data.domain.Sort.Order order14 = null;
        org.apache.syncope.core.persistence.api.entity.PlainSchema plainSchema15 = null;
        dummyJPAAnySearchDAO0.parseOrderByForPlainSchema(searchSupport11, orderBySupport12, item13, order14, plainSchema15, "hi!");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(searchCond10);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractJPAAnySearchDAORandoopTestC20.test27");
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO0 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond1 = dummyJPAAnySearchDAO0.getAllMatchingCond();
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond2 = dummyJPAAnySearchDAO0.getAllMatchingCond();
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond3 = dummyJPAAnySearchDAO0.getAllMatchingCond();
        java.lang.Class<?> wildcardClass4 = searchCond3.getClass();
        org.junit.Assert.assertNotNull(searchCond1);
        org.junit.Assert.assertNotNull(searchCond2);
        org.junit.Assert.assertNotNull(searchCond3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractJPAAnySearchDAORandoopTestC20.test28");
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO0 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.entity.Realm realm1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond7 = null;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind8 = null;
        long long9 = dummyJPAAnySearchDAO0.count(realm1, true, (java.util.Set<java.lang.String>) strSet5, searchCond7, anyTypeKind8);
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport10 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport orderBySupport11 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport.Item item12 = null;
        org.springframework.data.domain.Sort.Order order13 = null;
        org.apache.syncope.core.persistence.api.entity.PlainSchema plainSchema14 = null;
        dummyJPAAnySearchDAO0.parseOrderByForPlainSchema(searchSupport10, orderBySupport11, item12, order13, plainSchema14, "hi!");
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport17 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport orderBySupport18 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport.Item item19 = null;
        org.springframework.data.domain.Sort.Order order20 = null;
        org.apache.syncope.core.persistence.api.entity.PlainSchema plainSchema21 = null;
        dummyJPAAnySearchDAO0.parseOrderByForPlainSchema(searchSupport17, orderBySupport18, item19, order20, plainSchema21, "");
        java.lang.Class<?> wildcardClass24 = dummyJPAAnySearchDAO0.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractJPAAnySearchDAORandoopTestC20.test29");
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO0 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond1 = dummyJPAAnySearchDAO0.getAllMatchingCond();
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond2 = dummyJPAAnySearchDAO0.getAllMatchingCond();
        org.apache.syncope.core.persistence.api.entity.Realm realm3 = null;
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO5 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.entity.Realm realm6 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond12 = null;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind13 = null;
        long long14 = dummyJPAAnySearchDAO5.count(realm6, true, (java.util.Set<java.lang.String>) strSet10, searchCond12, anyTypeKind13);
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO15 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.entity.Realm realm16 = null;
        java.util.Set<java.lang.String> strSet18 = null;
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO19 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond20 = dummyJPAAnySearchDAO19.getAllMatchingCond();
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind21 = null;
        long long22 = dummyJPAAnySearchDAO15.count(realm16, false, strSet18, searchCond20, anyTypeKind21);
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind23 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long24 = dummyJPAAnySearchDAO0.count(realm3, false, (java.util.Set<java.lang.String>) strSet10, searchCond20, anyTypeKind23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.persistence.api.entity.Realm.getFullPath()\" because \"base\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(searchCond1);
        org.junit.Assert.assertNotNull(searchCond2);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(searchCond20);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractJPAAnySearchDAORandoopTestC20.test30");
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO0 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.entity.Realm realm1 = null;
        java.util.Set<java.lang.String> strSet3 = null;
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO4 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond5 = dummyJPAAnySearchDAO4.getAllMatchingCond();
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind6 = null;
        long long7 = dummyJPAAnySearchDAO0.count(realm1, false, strSet3, searchCond5, anyTypeKind6);
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport8 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport orderBySupport9 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport.Item item10 = null;
        org.springframework.data.domain.Sort.Order order11 = null;
        org.apache.syncope.core.persistence.api.entity.PlainSchema plainSchema12 = null;
        dummyJPAAnySearchDAO0.parseOrderByForPlainSchema(searchSupport8, orderBySupport9, item10, order11, plainSchema12, "hi!");
        org.junit.Assert.assertNotNull(searchCond5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractJPAAnySearchDAORandoopTestC20.test31");
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO0 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.entity.Realm realm1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond7 = null;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind8 = null;
        long long9 = dummyJPAAnySearchDAO0.count(realm1, true, (java.util.Set<java.lang.String>) strSet5, searchCond7, anyTypeKind8);
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport10 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport orderBySupport11 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport.Item item12 = null;
        org.springframework.data.domain.Sort.Order order13 = null;
        org.apache.syncope.core.persistence.api.entity.PlainSchema plainSchema14 = null;
        dummyJPAAnySearchDAO0.parseOrderByForPlainSchema(searchSupport10, orderBySupport11, item12, order13, plainSchema14, "");
        java.lang.Class<?> wildcardClass17 = dummyJPAAnySearchDAO0.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractJPAAnySearchDAORandoopTestC20.test32");
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
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport71 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport orderBySupport72 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport.Item item73 = null;
        org.springframework.data.domain.Sort.Order order74 = null;
        org.apache.syncope.core.persistence.api.entity.PlainSchema plainSchema75 = null;
        dummyJPAAnySearchDAO0.parseOrderByForPlainSchema(searchSupport71, orderBySupport72, item73, order74, plainSchema75, "");
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport78 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport orderBySupport79 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport.Item item80 = null;
        org.springframework.data.domain.Sort.Order order81 = null;
        org.apache.syncope.core.persistence.api.entity.PlainSchema plainSchema82 = null;
        dummyJPAAnySearchDAO0.parseOrderByForPlainSchema(searchSupport78, orderBySupport79, item80, order81, plainSchema82, "");
        java.lang.Class<?> wildcardClass85 = dummyJPAAnySearchDAO0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass85);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractJPAAnySearchDAORandoopTestC20.test33");
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO0 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.AttrCond attrCond1 = null;
        org.apache.syncope.core.persistence.common.dao.AbstractSearchDAO.CheckResult<org.apache.syncope.core.persistence.api.dao.search.AttrCond> attrCondCheckResult3 = null;
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO4 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond5 = dummyJPAAnySearchDAO4.getAllMatchingCond();
        org.apache.syncope.core.persistence.api.dao.search.AttrCond attrCond6 = null;
        org.apache.syncope.core.persistence.common.dao.AbstractSearchDAO.CheckResult<org.apache.syncope.core.persistence.api.dao.search.AttrCond> attrCondCheckResult8 = null;
        java.lang.Object obj9 = new java.lang.Object();
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO19 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.entity.Realm realm20 = null;
        java.lang.String[] strArray23 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond26 = null;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind27 = null;
        long long28 = dummyJPAAnySearchDAO19.count(realm20, true, (java.util.Set<java.lang.String>) strSet24, searchCond26, anyTypeKind27);
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO29 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.entity.Realm realm30 = null;
        java.lang.String[] strArray33 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet34 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet34, strArray33);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond36 = null;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind37 = null;
        long long38 = dummyJPAAnySearchDAO29.count(realm30, true, (java.util.Set<java.lang.String>) strSet34, searchCond36, anyTypeKind37);
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO39 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond40 = dummyJPAAnySearchDAO39.getAllMatchingCond();
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO52 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond53 = dummyJPAAnySearchDAO52.getAllMatchingCond();
        java.lang.Object obj69 = new java.lang.Object();
        java.lang.Object[] objArray70 = new java.lang.Object[] { obj9, (short) 10, (byte) 10, 0, 0.0f, 1, (short) -1, 0, 0, 1L, anyTypeKind27, realm30, dummyJPAAnySearchDAO39, 0.0f, 100L, "hi!", (byte) 10, ' ', '#', (-1.0d), 100.0d, 'a', (-1), (short) -1, dummyJPAAnySearchDAO52, 10, '4', (-1.0f), "hi!", 100.0f, 100L, "hi!", 0, (byte) 0, (byte) 1, (-1.0f), true, '#', true, 100L, obj69 };
        java.util.ArrayList<java.lang.Object> objList71 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList71, objArray70);
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport73 = null;
        org.apache.syncope.core.persistence.jpa.dao.AbstractJPAAnySearchDAO.AttrCondQuery attrCondQuery74 = dummyJPAAnySearchDAO4.getQuery(attrCond6, true, attrCondCheckResult8, (java.util.List<java.lang.Object>) objList71, searchSupport73);
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport75 = null;
        org.apache.syncope.core.persistence.jpa.dao.AbstractJPAAnySearchDAO.AttrCondQuery attrCondQuery76 = dummyJPAAnySearchDAO0.getQuery(attrCond1, true, attrCondCheckResult3, (java.util.List<java.lang.Object>) objList71, searchSupport75);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond77 = dummyJPAAnySearchDAO0.getAllMatchingCond();
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond78 = dummyJPAAnySearchDAO0.getAllMatchingCond();
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond79 = dummyJPAAnySearchDAO0.getAllMatchingCond();
        java.lang.Class<?> wildcardClass80 = searchCond79.getClass();
        org.junit.Assert.assertNotNull(searchCond5);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertNotNull(searchCond40);
        org.junit.Assert.assertNotNull(searchCond53);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(attrCondQuery74);
        org.junit.Assert.assertNotNull(attrCondQuery76);
        org.junit.Assert.assertNotNull(searchCond77);
        org.junit.Assert.assertNotNull(searchCond78);
        org.junit.Assert.assertNotNull(searchCond79);
        org.junit.Assert.assertNotNull(wildcardClass80);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractJPAAnySearchDAORandoopTestC20.test34");
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
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport71 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport orderBySupport72 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport.Item item73 = null;
        org.springframework.data.domain.Sort.Order order74 = null;
        org.apache.syncope.core.persistence.api.entity.PlainSchema plainSchema75 = null;
        dummyJPAAnySearchDAO0.parseOrderByForPlainSchema(searchSupport71, orderBySupport72, item73, order74, plainSchema75, "hi!");
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport78 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport orderBySupport79 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport.Item item80 = null;
        org.springframework.data.domain.Sort.Order order81 = null;
        org.apache.syncope.core.persistence.api.entity.PlainSchema plainSchema82 = null;
        dummyJPAAnySearchDAO0.parseOrderByForPlainSchema(searchSupport78, orderBySupport79, item80, order81, plainSchema82, "hi!");
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond85 = dummyJPAAnySearchDAO0.getAllMatchingCond();
        java.lang.Class<?> wildcardClass86 = dummyJPAAnySearchDAO0.getClass();
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
        org.junit.Assert.assertNotNull(searchCond85);
        org.junit.Assert.assertNotNull(wildcardClass86);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractJPAAnySearchDAORandoopTestC20.test35");
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
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport71 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport orderBySupport72 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport.Item item73 = null;
        org.springframework.data.domain.Sort.Order order74 = null;
        org.apache.syncope.core.persistence.api.entity.PlainSchema plainSchema75 = null;
        dummyJPAAnySearchDAO0.parseOrderByForPlainSchema(searchSupport71, orderBySupport72, item73, order74, plainSchema75, "");
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond78 = dummyJPAAnySearchDAO0.getAllMatchingCond();
        java.lang.Class<?> wildcardClass79 = searchCond78.getClass();
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
        org.junit.Assert.assertNotNull(searchCond78);
        org.junit.Assert.assertNotNull(wildcardClass79);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractJPAAnySearchDAORandoopTestC20.test36");
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO0 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.entity.Realm realm1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond7 = null;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind8 = null;
        long long9 = dummyJPAAnySearchDAO0.count(realm1, true, (java.util.Set<java.lang.String>) strSet5, searchCond7, anyTypeKind8);
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport10 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport orderBySupport11 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport.Item item12 = null;
        org.springframework.data.domain.Sort.Order order13 = null;
        org.apache.syncope.core.persistence.api.entity.PlainSchema plainSchema14 = null;
        dummyJPAAnySearchDAO0.parseOrderByForPlainSchema(searchSupport10, orderBySupport11, item12, order13, plainSchema14, "hi!");
        org.apache.syncope.core.persistence.api.dao.search.AttrCond attrCond17 = null;
        org.apache.syncope.core.persistence.common.dao.AbstractSearchDAO.CheckResult<org.apache.syncope.core.persistence.api.dao.search.AttrCond> attrCondCheckResult19 = null;
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO20 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.AttrCond attrCond21 = null;
        org.apache.syncope.core.persistence.common.dao.AbstractSearchDAO.CheckResult<org.apache.syncope.core.persistence.api.dao.search.AttrCond> attrCondCheckResult23 = null;
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO24 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond25 = dummyJPAAnySearchDAO24.getAllMatchingCond();
        org.apache.syncope.core.persistence.api.dao.search.AttrCond attrCond26 = null;
        org.apache.syncope.core.persistence.common.dao.AbstractSearchDAO.CheckResult<org.apache.syncope.core.persistence.api.dao.search.AttrCond> attrCondCheckResult28 = null;
        java.lang.Object obj29 = new java.lang.Object();
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO39 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.entity.Realm realm40 = null;
        java.lang.String[] strArray43 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet44 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet44, strArray43);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond46 = null;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind47 = null;
        long long48 = dummyJPAAnySearchDAO39.count(realm40, true, (java.util.Set<java.lang.String>) strSet44, searchCond46, anyTypeKind47);
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO49 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.entity.Realm realm50 = null;
        java.lang.String[] strArray53 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet54 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet54, strArray53);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond56 = null;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind57 = null;
        long long58 = dummyJPAAnySearchDAO49.count(realm50, true, (java.util.Set<java.lang.String>) strSet54, searchCond56, anyTypeKind57);
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO59 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond60 = dummyJPAAnySearchDAO59.getAllMatchingCond();
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO72 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond73 = dummyJPAAnySearchDAO72.getAllMatchingCond();
        java.lang.Object obj89 = new java.lang.Object();
        java.lang.Object[] objArray90 = new java.lang.Object[] { obj29, (short) 10, (byte) 10, 0, 0.0f, 1, (short) -1, 0, 0, 1L, anyTypeKind47, realm50, dummyJPAAnySearchDAO59, 0.0f, 100L, "hi!", (byte) 10, ' ', '#', (-1.0d), 100.0d, 'a', (-1), (short) -1, dummyJPAAnySearchDAO72, 10, '4', (-1.0f), "hi!", 100.0f, 100L, "hi!", 0, (byte) 0, (byte) 1, (-1.0f), true, '#', true, 100L, obj89 };
        java.util.ArrayList<java.lang.Object> objList91 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean92 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList91, objArray90);
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport93 = null;
        org.apache.syncope.core.persistence.jpa.dao.AbstractJPAAnySearchDAO.AttrCondQuery attrCondQuery94 = dummyJPAAnySearchDAO24.getQuery(attrCond26, true, attrCondCheckResult28, (java.util.List<java.lang.Object>) objList91, searchSupport93);
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport95 = null;
        org.apache.syncope.core.persistence.jpa.dao.AbstractJPAAnySearchDAO.AttrCondQuery attrCondQuery96 = dummyJPAAnySearchDAO20.getQuery(attrCond21, true, attrCondCheckResult23, (java.util.List<java.lang.Object>) objList91, searchSupport95);
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport97 = null;
        org.apache.syncope.core.persistence.jpa.dao.AbstractJPAAnySearchDAO.AttrCondQuery attrCondQuery98 = dummyJPAAnySearchDAO0.getQuery(attrCond17, true, attrCondCheckResult19, (java.util.List<java.lang.Object>) objList91, searchSupport97);
        java.lang.Class<?> wildcardClass99 = attrCondQuery98.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(searchCond25);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertArrayEquals(strArray43, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertArrayEquals(strArray53, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 0L + "'", long58 == 0L);
        org.junit.Assert.assertNotNull(searchCond60);
        org.junit.Assert.assertNotNull(searchCond73);
        org.junit.Assert.assertNotNull(objArray90);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertNotNull(attrCondQuery94);
        org.junit.Assert.assertNotNull(attrCondQuery96);
        org.junit.Assert.assertNotNull(attrCondQuery98);
        org.junit.Assert.assertNotNull(wildcardClass99);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractJPAAnySearchDAORandoopTestC20.test37");
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO0 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.AttrCond attrCond1 = null;
        org.apache.syncope.core.persistence.common.dao.AbstractSearchDAO.CheckResult<org.apache.syncope.core.persistence.api.dao.search.AttrCond> attrCondCheckResult3 = null;
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO4 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond5 = dummyJPAAnySearchDAO4.getAllMatchingCond();
        org.apache.syncope.core.persistence.api.dao.search.AttrCond attrCond6 = null;
        org.apache.syncope.core.persistence.common.dao.AbstractSearchDAO.CheckResult<org.apache.syncope.core.persistence.api.dao.search.AttrCond> attrCondCheckResult8 = null;
        java.lang.Object obj9 = new java.lang.Object();
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO19 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.entity.Realm realm20 = null;
        java.lang.String[] strArray23 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond26 = null;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind27 = null;
        long long28 = dummyJPAAnySearchDAO19.count(realm20, true, (java.util.Set<java.lang.String>) strSet24, searchCond26, anyTypeKind27);
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO29 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.entity.Realm realm30 = null;
        java.lang.String[] strArray33 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet34 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet34, strArray33);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond36 = null;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind37 = null;
        long long38 = dummyJPAAnySearchDAO29.count(realm30, true, (java.util.Set<java.lang.String>) strSet34, searchCond36, anyTypeKind37);
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO39 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond40 = dummyJPAAnySearchDAO39.getAllMatchingCond();
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO52 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond53 = dummyJPAAnySearchDAO52.getAllMatchingCond();
        java.lang.Object obj69 = new java.lang.Object();
        java.lang.Object[] objArray70 = new java.lang.Object[] { obj9, (short) 10, (byte) 10, 0, 0.0f, 1, (short) -1, 0, 0, 1L, anyTypeKind27, realm30, dummyJPAAnySearchDAO39, 0.0f, 100L, "hi!", (byte) 10, ' ', '#', (-1.0d), 100.0d, 'a', (-1), (short) -1, dummyJPAAnySearchDAO52, 10, '4', (-1.0f), "hi!", 100.0f, 100L, "hi!", 0, (byte) 0, (byte) 1, (-1.0f), true, '#', true, 100L, obj69 };
        java.util.ArrayList<java.lang.Object> objList71 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList71, objArray70);
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport73 = null;
        org.apache.syncope.core.persistence.jpa.dao.AbstractJPAAnySearchDAO.AttrCondQuery attrCondQuery74 = dummyJPAAnySearchDAO4.getQuery(attrCond6, true, attrCondCheckResult8, (java.util.List<java.lang.Object>) objList71, searchSupport73);
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport75 = null;
        org.apache.syncope.core.persistence.jpa.dao.AbstractJPAAnySearchDAO.AttrCondQuery attrCondQuery76 = dummyJPAAnySearchDAO0.getQuery(attrCond1, true, attrCondCheckResult3, (java.util.List<java.lang.Object>) objList71, searchSupport75);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond77 = dummyJPAAnySearchDAO0.getAllMatchingCond();
        java.lang.Class<?> wildcardClass78 = searchCond77.getClass();
        org.junit.Assert.assertNotNull(searchCond5);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertNotNull(searchCond40);
        org.junit.Assert.assertNotNull(searchCond53);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(attrCondQuery74);
        org.junit.Assert.assertNotNull(attrCondQuery76);
        org.junit.Assert.assertNotNull(searchCond77);
        org.junit.Assert.assertNotNull(wildcardClass78);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractJPAAnySearchDAORandoopTestC20.test38");
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
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport71 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport orderBySupport72 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport.Item item73 = null;
        org.springframework.data.domain.Sort.Order order74 = null;
        org.apache.syncope.core.persistence.api.entity.PlainSchema plainSchema75 = null;
        dummyJPAAnySearchDAO0.parseOrderByForPlainSchema(searchSupport71, orderBySupport72, item73, order74, plainSchema75, "hi!");
        java.lang.Class<?> wildcardClass78 = dummyJPAAnySearchDAO0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass78);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractJPAAnySearchDAORandoopTestC20.test39");
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO0 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.entity.Realm realm1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond7 = null;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind8 = null;
        long long9 = dummyJPAAnySearchDAO0.count(realm1, true, (java.util.Set<java.lang.String>) strSet5, searchCond7, anyTypeKind8);
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport10 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport orderBySupport11 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport.Item item12 = null;
        org.springframework.data.domain.Sort.Order order13 = null;
        org.apache.syncope.core.persistence.api.entity.PlainSchema plainSchema14 = null;
        dummyJPAAnySearchDAO0.parseOrderByForPlainSchema(searchSupport10, orderBySupport11, item12, order13, plainSchema14, "hi!");
        java.lang.Class<?> wildcardClass17 = dummyJPAAnySearchDAO0.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractJPAAnySearchDAORandoopTestC20.test40");
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO0 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.AttrCond attrCond1 = null;
        org.apache.syncope.core.persistence.common.dao.AbstractSearchDAO.CheckResult<org.apache.syncope.core.persistence.api.dao.search.AttrCond> attrCondCheckResult3 = null;
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO4 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond5 = dummyJPAAnySearchDAO4.getAllMatchingCond();
        org.apache.syncope.core.persistence.api.dao.search.AttrCond attrCond6 = null;
        org.apache.syncope.core.persistence.common.dao.AbstractSearchDAO.CheckResult<org.apache.syncope.core.persistence.api.dao.search.AttrCond> attrCondCheckResult8 = null;
        java.lang.Object obj9 = new java.lang.Object();
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO19 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.entity.Realm realm20 = null;
        java.lang.String[] strArray23 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond26 = null;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind27 = null;
        long long28 = dummyJPAAnySearchDAO19.count(realm20, true, (java.util.Set<java.lang.String>) strSet24, searchCond26, anyTypeKind27);
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO29 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.entity.Realm realm30 = null;
        java.lang.String[] strArray33 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet34 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet34, strArray33);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond36 = null;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind37 = null;
        long long38 = dummyJPAAnySearchDAO29.count(realm30, true, (java.util.Set<java.lang.String>) strSet34, searchCond36, anyTypeKind37);
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO39 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond40 = dummyJPAAnySearchDAO39.getAllMatchingCond();
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO52 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond53 = dummyJPAAnySearchDAO52.getAllMatchingCond();
        java.lang.Object obj69 = new java.lang.Object();
        java.lang.Object[] objArray70 = new java.lang.Object[] { obj9, (short) 10, (byte) 10, 0, 0.0f, 1, (short) -1, 0, 0, 1L, anyTypeKind27, realm30, dummyJPAAnySearchDAO39, 0.0f, 100L, "hi!", (byte) 10, ' ', '#', (-1.0d), 100.0d, 'a', (-1), (short) -1, dummyJPAAnySearchDAO52, 10, '4', (-1.0f), "hi!", 100.0f, 100L, "hi!", 0, (byte) 0, (byte) 1, (-1.0f), true, '#', true, 100L, obj69 };
        java.util.ArrayList<java.lang.Object> objList71 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList71, objArray70);
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport73 = null;
        org.apache.syncope.core.persistence.jpa.dao.AbstractJPAAnySearchDAO.AttrCondQuery attrCondQuery74 = dummyJPAAnySearchDAO4.getQuery(attrCond6, true, attrCondCheckResult8, (java.util.List<java.lang.Object>) objList71, searchSupport73);
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport75 = null;
        org.apache.syncope.core.persistence.jpa.dao.AbstractJPAAnySearchDAO.AttrCondQuery attrCondQuery76 = dummyJPAAnySearchDAO0.getQuery(attrCond1, true, attrCondCheckResult3, (java.util.List<java.lang.Object>) objList71, searchSupport75);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond77 = dummyJPAAnySearchDAO0.getAllMatchingCond();
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport78 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport orderBySupport79 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport.Item item80 = null;
        org.springframework.data.domain.Sort.Order order81 = null;
        org.apache.syncope.core.persistence.api.entity.PlainSchema plainSchema82 = null;
        dummyJPAAnySearchDAO0.parseOrderByForPlainSchema(searchSupport78, orderBySupport79, item80, order81, plainSchema82, "");
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond85 = dummyJPAAnySearchDAO0.getAllMatchingCond();
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond86 = dummyJPAAnySearchDAO0.getAllMatchingCond();
        org.junit.Assert.assertNotNull(searchCond5);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertNotNull(searchCond40);
        org.junit.Assert.assertNotNull(searchCond53);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(attrCondQuery74);
        org.junit.Assert.assertNotNull(attrCondQuery76);
        org.junit.Assert.assertNotNull(searchCond77);
        org.junit.Assert.assertNotNull(searchCond85);
        org.junit.Assert.assertNotNull(searchCond86);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractJPAAnySearchDAORandoopTestC20.test41");
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO0 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond1 = dummyJPAAnySearchDAO0.getAllMatchingCond();
        java.lang.Class<?> wildcardClass2 = searchCond1.getClass();
        org.junit.Assert.assertNotNull(searchCond1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractJPAAnySearchDAORandoopTestC20.test42");
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO0 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.AttrCond attrCond1 = null;
        org.apache.syncope.core.persistence.common.dao.AbstractSearchDAO.CheckResult<org.apache.syncope.core.persistence.api.dao.search.AttrCond> attrCondCheckResult3 = null;
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO4 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond5 = dummyJPAAnySearchDAO4.getAllMatchingCond();
        org.apache.syncope.core.persistence.api.dao.search.AttrCond attrCond6 = null;
        org.apache.syncope.core.persistence.common.dao.AbstractSearchDAO.CheckResult<org.apache.syncope.core.persistence.api.dao.search.AttrCond> attrCondCheckResult8 = null;
        java.lang.Object obj9 = new java.lang.Object();
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO19 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.entity.Realm realm20 = null;
        java.lang.String[] strArray23 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond26 = null;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind27 = null;
        long long28 = dummyJPAAnySearchDAO19.count(realm20, true, (java.util.Set<java.lang.String>) strSet24, searchCond26, anyTypeKind27);
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO29 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.entity.Realm realm30 = null;
        java.lang.String[] strArray33 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet34 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet34, strArray33);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond36 = null;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind37 = null;
        long long38 = dummyJPAAnySearchDAO29.count(realm30, true, (java.util.Set<java.lang.String>) strSet34, searchCond36, anyTypeKind37);
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO39 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond40 = dummyJPAAnySearchDAO39.getAllMatchingCond();
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO52 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond53 = dummyJPAAnySearchDAO52.getAllMatchingCond();
        java.lang.Object obj69 = new java.lang.Object();
        java.lang.Object[] objArray70 = new java.lang.Object[] { obj9, (short) 10, (byte) 10, 0, 0.0f, 1, (short) -1, 0, 0, 1L, anyTypeKind27, realm30, dummyJPAAnySearchDAO39, 0.0f, 100L, "hi!", (byte) 10, ' ', '#', (-1.0d), 100.0d, 'a', (-1), (short) -1, dummyJPAAnySearchDAO52, 10, '4', (-1.0f), "hi!", 100.0f, 100L, "hi!", 0, (byte) 0, (byte) 1, (-1.0f), true, '#', true, 100L, obj69 };
        java.util.ArrayList<java.lang.Object> objList71 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList71, objArray70);
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport73 = null;
        org.apache.syncope.core.persistence.jpa.dao.AbstractJPAAnySearchDAO.AttrCondQuery attrCondQuery74 = dummyJPAAnySearchDAO4.getQuery(attrCond6, true, attrCondCheckResult8, (java.util.List<java.lang.Object>) objList71, searchSupport73);
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport75 = null;
        org.apache.syncope.core.persistence.jpa.dao.AbstractJPAAnySearchDAO.AttrCondQuery attrCondQuery76 = dummyJPAAnySearchDAO0.getQuery(attrCond1, true, attrCondCheckResult3, (java.util.List<java.lang.Object>) objList71, searchSupport75);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond77 = dummyJPAAnySearchDAO0.getAllMatchingCond();
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond78 = dummyJPAAnySearchDAO0.getAllMatchingCond();
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond79 = dummyJPAAnySearchDAO0.getAllMatchingCond();
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport80 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport orderBySupport81 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport.Item item82 = null;
        org.springframework.data.domain.Sort.Order order83 = null;
        org.apache.syncope.core.persistence.api.entity.PlainSchema plainSchema84 = null;
        dummyJPAAnySearchDAO0.parseOrderByForPlainSchema(searchSupport80, orderBySupport81, item82, order83, plainSchema84, "");
        org.junit.Assert.assertNotNull(searchCond5);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertNotNull(searchCond40);
        org.junit.Assert.assertNotNull(searchCond53);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(attrCondQuery74);
        org.junit.Assert.assertNotNull(attrCondQuery76);
        org.junit.Assert.assertNotNull(searchCond77);
        org.junit.Assert.assertNotNull(searchCond78);
        org.junit.Assert.assertNotNull(searchCond79);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractJPAAnySearchDAORandoopTestC20.test43");
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO0 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond1 = dummyJPAAnySearchDAO0.getAllMatchingCond();
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport2 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport orderBySupport3 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport.Item item4 = null;
        org.springframework.data.domain.Sort.Order order5 = null;
        org.apache.syncope.core.persistence.api.entity.PlainSchema plainSchema6 = null;
        dummyJPAAnySearchDAO0.parseOrderByForPlainSchema(searchSupport2, orderBySupport3, item4, order5, plainSchema6, "");
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond9 = dummyJPAAnySearchDAO0.getAllMatchingCond();
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport10 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport orderBySupport11 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport.Item item12 = null;
        org.springframework.data.domain.Sort.Order order13 = null;
        org.apache.syncope.core.persistence.api.entity.PlainSchema plainSchema14 = null;
        dummyJPAAnySearchDAO0.parseOrderByForPlainSchema(searchSupport10, orderBySupport11, item12, order13, plainSchema14, "hi!");
        org.junit.Assert.assertNotNull(searchCond1);
        org.junit.Assert.assertNotNull(searchCond9);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractJPAAnySearchDAORandoopTestC20.test44");
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
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport71 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport orderBySupport72 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport.Item item73 = null;
        org.springframework.data.domain.Sort.Order order74 = null;
        org.apache.syncope.core.persistence.api.entity.PlainSchema plainSchema75 = null;
        dummyJPAAnySearchDAO0.parseOrderByForPlainSchema(searchSupport71, orderBySupport72, item73, order74, plainSchema75, "");
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond78 = dummyJPAAnySearchDAO0.getAllMatchingCond();
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport79 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport orderBySupport80 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport.Item item81 = null;
        org.springframework.data.domain.Sort.Order order82 = null;
        org.apache.syncope.core.persistence.api.entity.PlainSchema plainSchema83 = null;
        dummyJPAAnySearchDAO0.parseOrderByForPlainSchema(searchSupport79, orderBySupport80, item81, order82, plainSchema83, "");
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport86 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport orderBySupport87 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport.Item item88 = null;
        org.springframework.data.domain.Sort.Order order89 = null;
        org.apache.syncope.core.persistence.api.entity.PlainSchema plainSchema90 = null;
        dummyJPAAnySearchDAO0.parseOrderByForPlainSchema(searchSupport86, orderBySupport87, item88, order89, plainSchema90, "");
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
        org.junit.Assert.assertNotNull(searchCond78);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractJPAAnySearchDAORandoopTestC20.test45");
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
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport71 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport orderBySupport72 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport.Item item73 = null;
        org.springframework.data.domain.Sort.Order order74 = null;
        org.apache.syncope.core.persistence.api.entity.PlainSchema plainSchema75 = null;
        dummyJPAAnySearchDAO0.parseOrderByForPlainSchema(searchSupport71, orderBySupport72, item73, order74, plainSchema75, "");
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond78 = dummyJPAAnySearchDAO0.getAllMatchingCond();
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond79 = dummyJPAAnySearchDAO0.getAllMatchingCond();
        java.lang.Class<?> wildcardClass80 = searchCond79.getClass();
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
        org.junit.Assert.assertNotNull(searchCond78);
        org.junit.Assert.assertNotNull(searchCond79);
        org.junit.Assert.assertNotNull(wildcardClass80);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractJPAAnySearchDAORandoopTestC20.test46");
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO0 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.AttrCond attrCond1 = null;
        org.apache.syncope.core.persistence.common.dao.AbstractSearchDAO.CheckResult<org.apache.syncope.core.persistence.api.dao.search.AttrCond> attrCondCheckResult3 = null;
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO4 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond5 = dummyJPAAnySearchDAO4.getAllMatchingCond();
        org.apache.syncope.core.persistence.api.dao.search.AttrCond attrCond6 = null;
        org.apache.syncope.core.persistence.common.dao.AbstractSearchDAO.CheckResult<org.apache.syncope.core.persistence.api.dao.search.AttrCond> attrCondCheckResult8 = null;
        java.lang.Object obj9 = new java.lang.Object();
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO19 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.entity.Realm realm20 = null;
        java.lang.String[] strArray23 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond26 = null;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind27 = null;
        long long28 = dummyJPAAnySearchDAO19.count(realm20, true, (java.util.Set<java.lang.String>) strSet24, searchCond26, anyTypeKind27);
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO29 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.entity.Realm realm30 = null;
        java.lang.String[] strArray33 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet34 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet34, strArray33);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond36 = null;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind37 = null;
        long long38 = dummyJPAAnySearchDAO29.count(realm30, true, (java.util.Set<java.lang.String>) strSet34, searchCond36, anyTypeKind37);
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO39 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond40 = dummyJPAAnySearchDAO39.getAllMatchingCond();
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO52 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond53 = dummyJPAAnySearchDAO52.getAllMatchingCond();
        java.lang.Object obj69 = new java.lang.Object();
        java.lang.Object[] objArray70 = new java.lang.Object[] { obj9, (short) 10, (byte) 10, 0, 0.0f, 1, (short) -1, 0, 0, 1L, anyTypeKind27, realm30, dummyJPAAnySearchDAO39, 0.0f, 100L, "hi!", (byte) 10, ' ', '#', (-1.0d), 100.0d, 'a', (-1), (short) -1, dummyJPAAnySearchDAO52, 10, '4', (-1.0f), "hi!", 100.0f, 100L, "hi!", 0, (byte) 0, (byte) 1, (-1.0f), true, '#', true, 100L, obj69 };
        java.util.ArrayList<java.lang.Object> objList71 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList71, objArray70);
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport73 = null;
        org.apache.syncope.core.persistence.jpa.dao.AbstractJPAAnySearchDAO.AttrCondQuery attrCondQuery74 = dummyJPAAnySearchDAO4.getQuery(attrCond6, true, attrCondCheckResult8, (java.util.List<java.lang.Object>) objList71, searchSupport73);
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport75 = null;
        org.apache.syncope.core.persistence.jpa.dao.AbstractJPAAnySearchDAO.AttrCondQuery attrCondQuery76 = dummyJPAAnySearchDAO0.getQuery(attrCond1, true, attrCondCheckResult3, (java.util.List<java.lang.Object>) objList71, searchSupport75);
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport77 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport orderBySupport78 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport.Item item79 = null;
        org.springframework.data.domain.Sort.Order order80 = null;
        org.apache.syncope.core.persistence.api.entity.PlainSchema plainSchema81 = null;
        dummyJPAAnySearchDAO0.parseOrderByForPlainSchema(searchSupport77, orderBySupport78, item79, order80, plainSchema81, "");
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport84 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport orderBySupport85 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport.Item item86 = null;
        org.springframework.data.domain.Sort.Order order87 = null;
        org.apache.syncope.core.persistence.api.entity.PlainSchema plainSchema88 = null;
        dummyJPAAnySearchDAO0.parseOrderByForPlainSchema(searchSupport84, orderBySupport85, item86, order87, plainSchema88, "hi!");
        java.lang.Class<?> wildcardClass91 = dummyJPAAnySearchDAO0.getClass();
        org.junit.Assert.assertNotNull(searchCond5);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertNotNull(searchCond40);
        org.junit.Assert.assertNotNull(searchCond53);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(attrCondQuery74);
        org.junit.Assert.assertNotNull(attrCondQuery76);
        org.junit.Assert.assertNotNull(wildcardClass91);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractJPAAnySearchDAORandoopTestC20.test47");
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO0 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport1 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport orderBySupport2 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport.Item item3 = null;
        org.springframework.data.domain.Sort.Order order4 = null;
        org.apache.syncope.core.persistence.api.entity.PlainSchema plainSchema5 = null;
        dummyJPAAnySearchDAO0.parseOrderByForPlainSchema(searchSupport1, orderBySupport2, item3, order4, plainSchema5, "");
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond8 = dummyJPAAnySearchDAO0.getAllMatchingCond();
        org.apache.syncope.core.persistence.api.dao.search.AttrCond attrCond9 = null;
        org.apache.syncope.core.persistence.common.dao.AbstractSearchDAO.CheckResult<org.apache.syncope.core.persistence.api.dao.search.AttrCond> attrCondCheckResult11 = null;
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO12 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond13 = dummyJPAAnySearchDAO12.getAllMatchingCond();
        org.apache.syncope.core.persistence.api.dao.search.AttrCond attrCond14 = null;
        org.apache.syncope.core.persistence.common.dao.AbstractSearchDAO.CheckResult<org.apache.syncope.core.persistence.api.dao.search.AttrCond> attrCondCheckResult16 = null;
        java.lang.Object obj17 = new java.lang.Object();
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO27 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.entity.Realm realm28 = null;
        java.lang.String[] strArray31 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet32 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet32, strArray31);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond34 = null;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind35 = null;
        long long36 = dummyJPAAnySearchDAO27.count(realm28, true, (java.util.Set<java.lang.String>) strSet32, searchCond34, anyTypeKind35);
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO37 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.entity.Realm realm38 = null;
        java.lang.String[] strArray41 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet42 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet42, strArray41);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond44 = null;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind45 = null;
        long long46 = dummyJPAAnySearchDAO37.count(realm38, true, (java.util.Set<java.lang.String>) strSet42, searchCond44, anyTypeKind45);
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO47 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond48 = dummyJPAAnySearchDAO47.getAllMatchingCond();
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO60 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond61 = dummyJPAAnySearchDAO60.getAllMatchingCond();
        java.lang.Object obj77 = new java.lang.Object();
        java.lang.Object[] objArray78 = new java.lang.Object[] { obj17, (short) 10, (byte) 10, 0, 0.0f, 1, (short) -1, 0, 0, 1L, anyTypeKind35, realm38, dummyJPAAnySearchDAO47, 0.0f, 100L, "hi!", (byte) 10, ' ', '#', (-1.0d), 100.0d, 'a', (-1), (short) -1, dummyJPAAnySearchDAO60, 10, '4', (-1.0f), "hi!", 100.0f, 100L, "hi!", 0, (byte) 0, (byte) 1, (-1.0f), true, '#', true, 100L, obj77 };
        java.util.ArrayList<java.lang.Object> objList79 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList79, objArray78);
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport81 = null;
        org.apache.syncope.core.persistence.jpa.dao.AbstractJPAAnySearchDAO.AttrCondQuery attrCondQuery82 = dummyJPAAnySearchDAO12.getQuery(attrCond14, true, attrCondCheckResult16, (java.util.List<java.lang.Object>) objList79, searchSupport81);
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport83 = null;
        org.apache.syncope.core.persistence.jpa.dao.AbstractJPAAnySearchDAO.AttrCondQuery attrCondQuery84 = dummyJPAAnySearchDAO0.getQuery(attrCond9, true, attrCondCheckResult11, (java.util.List<java.lang.Object>) objList79, searchSupport83);
        org.junit.Assert.assertNotNull(searchCond8);
        org.junit.Assert.assertNotNull(searchCond13);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertArrayEquals(strArray41, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertNotNull(searchCond48);
        org.junit.Assert.assertNotNull(searchCond61);
        org.junit.Assert.assertNotNull(objArray78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(attrCondQuery82);
        org.junit.Assert.assertNotNull(attrCondQuery84);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractJPAAnySearchDAORandoopTestC20.test48");
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
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport71 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport orderBySupport72 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport.Item item73 = null;
        org.springframework.data.domain.Sort.Order order74 = null;
        org.apache.syncope.core.persistence.api.entity.PlainSchema plainSchema75 = null;
        dummyJPAAnySearchDAO0.parseOrderByForPlainSchema(searchSupport71, orderBySupport72, item73, order74, plainSchema75, "");
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond78 = dummyJPAAnySearchDAO0.getAllMatchingCond();
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond79 = dummyJPAAnySearchDAO0.getAllMatchingCond();
        java.lang.Class<?> wildcardClass80 = dummyJPAAnySearchDAO0.getClass();
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
        org.junit.Assert.assertNotNull(searchCond78);
        org.junit.Assert.assertNotNull(searchCond79);
        org.junit.Assert.assertNotNull(wildcardClass80);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractJPAAnySearchDAORandoopTestC20.test49");
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO0 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.AttrCond attrCond1 = null;
        org.apache.syncope.core.persistence.common.dao.AbstractSearchDAO.CheckResult<org.apache.syncope.core.persistence.api.dao.search.AttrCond> attrCondCheckResult3 = null;
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO4 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond5 = dummyJPAAnySearchDAO4.getAllMatchingCond();
        org.apache.syncope.core.persistence.api.dao.search.AttrCond attrCond6 = null;
        org.apache.syncope.core.persistence.common.dao.AbstractSearchDAO.CheckResult<org.apache.syncope.core.persistence.api.dao.search.AttrCond> attrCondCheckResult8 = null;
        java.lang.Object obj9 = new java.lang.Object();
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO19 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.entity.Realm realm20 = null;
        java.lang.String[] strArray23 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond26 = null;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind27 = null;
        long long28 = dummyJPAAnySearchDAO19.count(realm20, true, (java.util.Set<java.lang.String>) strSet24, searchCond26, anyTypeKind27);
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO29 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.entity.Realm realm30 = null;
        java.lang.String[] strArray33 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet34 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet34, strArray33);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond36 = null;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind37 = null;
        long long38 = dummyJPAAnySearchDAO29.count(realm30, true, (java.util.Set<java.lang.String>) strSet34, searchCond36, anyTypeKind37);
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO39 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond40 = dummyJPAAnySearchDAO39.getAllMatchingCond();
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO52 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond53 = dummyJPAAnySearchDAO52.getAllMatchingCond();
        java.lang.Object obj69 = new java.lang.Object();
        java.lang.Object[] objArray70 = new java.lang.Object[] { obj9, (short) 10, (byte) 10, 0, 0.0f, 1, (short) -1, 0, 0, 1L, anyTypeKind27, realm30, dummyJPAAnySearchDAO39, 0.0f, 100L, "hi!", (byte) 10, ' ', '#', (-1.0d), 100.0d, 'a', (-1), (short) -1, dummyJPAAnySearchDAO52, 10, '4', (-1.0f), "hi!", 100.0f, 100L, "hi!", 0, (byte) 0, (byte) 1, (-1.0f), true, '#', true, 100L, obj69 };
        java.util.ArrayList<java.lang.Object> objList71 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList71, objArray70);
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport73 = null;
        org.apache.syncope.core.persistence.jpa.dao.AbstractJPAAnySearchDAO.AttrCondQuery attrCondQuery74 = dummyJPAAnySearchDAO4.getQuery(attrCond6, true, attrCondCheckResult8, (java.util.List<java.lang.Object>) objList71, searchSupport73);
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport75 = null;
        org.apache.syncope.core.persistence.jpa.dao.AbstractJPAAnySearchDAO.AttrCondQuery attrCondQuery76 = dummyJPAAnySearchDAO0.getQuery(attrCond1, true, attrCondCheckResult3, (java.util.List<java.lang.Object>) objList71, searchSupport75);
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport77 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport orderBySupport78 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport.Item item79 = null;
        org.springframework.data.domain.Sort.Order order80 = null;
        org.apache.syncope.core.persistence.api.entity.PlainSchema plainSchema81 = null;
        dummyJPAAnySearchDAO0.parseOrderByForPlainSchema(searchSupport77, orderBySupport78, item79, order80, plainSchema81, "");
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport84 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport orderBySupport85 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport.Item item86 = null;
        org.springframework.data.domain.Sort.Order order87 = null;
        org.apache.syncope.core.persistence.api.entity.PlainSchema plainSchema88 = null;
        dummyJPAAnySearchDAO0.parseOrderByForPlainSchema(searchSupport84, orderBySupport85, item86, order87, plainSchema88, "hi!");
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport91 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport orderBySupport92 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport.Item item93 = null;
        org.springframework.data.domain.Sort.Order order94 = null;
        org.apache.syncope.core.persistence.api.entity.PlainSchema plainSchema95 = null;
        dummyJPAAnySearchDAO0.parseOrderByForPlainSchema(searchSupport91, orderBySupport92, item93, order94, plainSchema95, "hi!");
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond98 = dummyJPAAnySearchDAO0.getAllMatchingCond();
        org.junit.Assert.assertNotNull(searchCond5);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertNotNull(searchCond40);
        org.junit.Assert.assertNotNull(searchCond53);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(attrCondQuery74);
        org.junit.Assert.assertNotNull(attrCondQuery76);
        org.junit.Assert.assertNotNull(searchCond98);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractJPAAnySearchDAORandoopTestC20.test50");
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO0 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.entity.Realm realm1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond7 = null;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind8 = null;
        long long9 = dummyJPAAnySearchDAO0.count(realm1, true, (java.util.Set<java.lang.String>) strSet5, searchCond7, anyTypeKind8);
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport10 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport orderBySupport11 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport.Item item12 = null;
        org.springframework.data.domain.Sort.Order order13 = null;
        org.apache.syncope.core.persistence.api.entity.PlainSchema plainSchema14 = null;
        dummyJPAAnySearchDAO0.parseOrderByForPlainSchema(searchSupport10, orderBySupport11, item12, order13, plainSchema14, "");
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport17 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport orderBySupport18 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport.Item item19 = null;
        org.springframework.data.domain.Sort.Order order20 = null;
        org.apache.syncope.core.persistence.api.entity.PlainSchema plainSchema21 = null;
        dummyJPAAnySearchDAO0.parseOrderByForPlainSchema(searchSupport17, orderBySupport18, item19, order20, plainSchema21, "");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractJPAAnySearchDAORandoopTestC20.test51");
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
        java.lang.Class<?> wildcardClass71 = dummyJPAAnySearchDAO0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass71);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractJPAAnySearchDAORandoopTestC20.test52");
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO0 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.entity.Realm realm1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond7 = null;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind8 = null;
        long long9 = dummyJPAAnySearchDAO0.count(realm1, true, (java.util.Set<java.lang.String>) strSet5, searchCond7, anyTypeKind8);
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport10 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport orderBySupport11 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport.Item item12 = null;
        org.springframework.data.domain.Sort.Order order13 = null;
        org.apache.syncope.core.persistence.api.entity.PlainSchema plainSchema14 = null;
        dummyJPAAnySearchDAO0.parseOrderByForPlainSchema(searchSupport10, orderBySupport11, item12, order13, plainSchema14, "");
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond17 = dummyJPAAnySearchDAO0.getAllMatchingCond();
        java.lang.Class<?> wildcardClass18 = dummyJPAAnySearchDAO0.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(searchCond17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractJPAAnySearchDAORandoopTestC20.test53");
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO0 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.AttrCond attrCond1 = null;
        org.apache.syncope.core.persistence.common.dao.AbstractSearchDAO.CheckResult<org.apache.syncope.core.persistence.api.dao.search.AttrCond> attrCondCheckResult3 = null;
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO4 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond5 = dummyJPAAnySearchDAO4.getAllMatchingCond();
        org.apache.syncope.core.persistence.api.dao.search.AttrCond attrCond6 = null;
        org.apache.syncope.core.persistence.common.dao.AbstractSearchDAO.CheckResult<org.apache.syncope.core.persistence.api.dao.search.AttrCond> attrCondCheckResult8 = null;
        java.lang.Object obj9 = new java.lang.Object();
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO19 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.entity.Realm realm20 = null;
        java.lang.String[] strArray23 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond26 = null;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind27 = null;
        long long28 = dummyJPAAnySearchDAO19.count(realm20, true, (java.util.Set<java.lang.String>) strSet24, searchCond26, anyTypeKind27);
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO29 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.entity.Realm realm30 = null;
        java.lang.String[] strArray33 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet34 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet34, strArray33);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond36 = null;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind37 = null;
        long long38 = dummyJPAAnySearchDAO29.count(realm30, true, (java.util.Set<java.lang.String>) strSet34, searchCond36, anyTypeKind37);
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO39 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond40 = dummyJPAAnySearchDAO39.getAllMatchingCond();
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO52 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond53 = dummyJPAAnySearchDAO52.getAllMatchingCond();
        java.lang.Object obj69 = new java.lang.Object();
        java.lang.Object[] objArray70 = new java.lang.Object[] { obj9, (short) 10, (byte) 10, 0, 0.0f, 1, (short) -1, 0, 0, 1L, anyTypeKind27, realm30, dummyJPAAnySearchDAO39, 0.0f, 100L, "hi!", (byte) 10, ' ', '#', (-1.0d), 100.0d, 'a', (-1), (short) -1, dummyJPAAnySearchDAO52, 10, '4', (-1.0f), "hi!", 100.0f, 100L, "hi!", 0, (byte) 0, (byte) 1, (-1.0f), true, '#', true, 100L, obj69 };
        java.util.ArrayList<java.lang.Object> objList71 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList71, objArray70);
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport73 = null;
        org.apache.syncope.core.persistence.jpa.dao.AbstractJPAAnySearchDAO.AttrCondQuery attrCondQuery74 = dummyJPAAnySearchDAO4.getQuery(attrCond6, true, attrCondCheckResult8, (java.util.List<java.lang.Object>) objList71, searchSupport73);
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport75 = null;
        org.apache.syncope.core.persistence.jpa.dao.AbstractJPAAnySearchDAO.AttrCondQuery attrCondQuery76 = dummyJPAAnySearchDAO0.getQuery(attrCond1, true, attrCondCheckResult3, (java.util.List<java.lang.Object>) objList71, searchSupport75);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond77 = dummyJPAAnySearchDAO0.getAllMatchingCond();
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport78 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport orderBySupport79 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport.Item item80 = null;
        org.springframework.data.domain.Sort.Order order81 = null;
        org.apache.syncope.core.persistence.api.entity.PlainSchema plainSchema82 = null;
        dummyJPAAnySearchDAO0.parseOrderByForPlainSchema(searchSupport78, orderBySupport79, item80, order81, plainSchema82, "");
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond85 = dummyJPAAnySearchDAO0.getAllMatchingCond();
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport86 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport orderBySupport87 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport.Item item88 = null;
        org.springframework.data.domain.Sort.Order order89 = null;
        org.apache.syncope.core.persistence.api.entity.PlainSchema plainSchema90 = null;
        dummyJPAAnySearchDAO0.parseOrderByForPlainSchema(searchSupport86, orderBySupport87, item88, order89, plainSchema90, "hi!");
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport93 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport orderBySupport94 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport.Item item95 = null;
        org.springframework.data.domain.Sort.Order order96 = null;
        org.apache.syncope.core.persistence.api.entity.PlainSchema plainSchema97 = null;
        dummyJPAAnySearchDAO0.parseOrderByForPlainSchema(searchSupport93, orderBySupport94, item95, order96, plainSchema97, "");
        org.junit.Assert.assertNotNull(searchCond5);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertNotNull(searchCond40);
        org.junit.Assert.assertNotNull(searchCond53);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(attrCondQuery74);
        org.junit.Assert.assertNotNull(attrCondQuery76);
        org.junit.Assert.assertNotNull(searchCond77);
        org.junit.Assert.assertNotNull(searchCond85);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractJPAAnySearchDAORandoopTestC20.test54");
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO0 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond1 = dummyJPAAnySearchDAO0.getAllMatchingCond();
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond2 = dummyJPAAnySearchDAO0.getAllMatchingCond();
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond3 = dummyJPAAnySearchDAO0.getAllMatchingCond();
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport4 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport orderBySupport5 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport.Item item6 = null;
        org.springframework.data.domain.Sort.Order order7 = null;
        org.apache.syncope.core.persistence.api.entity.PlainSchema plainSchema8 = null;
        dummyJPAAnySearchDAO0.parseOrderByForPlainSchema(searchSupport4, orderBySupport5, item6, order7, plainSchema8, "");
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond11 = dummyJPAAnySearchDAO0.getAllMatchingCond();
        org.junit.Assert.assertNotNull(searchCond1);
        org.junit.Assert.assertNotNull(searchCond2);
        org.junit.Assert.assertNotNull(searchCond3);
        org.junit.Assert.assertNotNull(searchCond11);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractJPAAnySearchDAORandoopTestC20.test55");
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO0 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.AttrCond attrCond1 = null;
        org.apache.syncope.core.persistence.common.dao.AbstractSearchDAO.CheckResult<org.apache.syncope.core.persistence.api.dao.search.AttrCond> attrCondCheckResult3 = null;
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO4 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond5 = dummyJPAAnySearchDAO4.getAllMatchingCond();
        org.apache.syncope.core.persistence.api.dao.search.AttrCond attrCond6 = null;
        org.apache.syncope.core.persistence.common.dao.AbstractSearchDAO.CheckResult<org.apache.syncope.core.persistence.api.dao.search.AttrCond> attrCondCheckResult8 = null;
        java.lang.Object obj9 = new java.lang.Object();
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO19 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.entity.Realm realm20 = null;
        java.lang.String[] strArray23 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond26 = null;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind27 = null;
        long long28 = dummyJPAAnySearchDAO19.count(realm20, true, (java.util.Set<java.lang.String>) strSet24, searchCond26, anyTypeKind27);
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO29 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.entity.Realm realm30 = null;
        java.lang.String[] strArray33 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet34 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet34, strArray33);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond36 = null;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind37 = null;
        long long38 = dummyJPAAnySearchDAO29.count(realm30, true, (java.util.Set<java.lang.String>) strSet34, searchCond36, anyTypeKind37);
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO39 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond40 = dummyJPAAnySearchDAO39.getAllMatchingCond();
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO52 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond53 = dummyJPAAnySearchDAO52.getAllMatchingCond();
        java.lang.Object obj69 = new java.lang.Object();
        java.lang.Object[] objArray70 = new java.lang.Object[] { obj9, (short) 10, (byte) 10, 0, 0.0f, 1, (short) -1, 0, 0, 1L, anyTypeKind27, realm30, dummyJPAAnySearchDAO39, 0.0f, 100L, "hi!", (byte) 10, ' ', '#', (-1.0d), 100.0d, 'a', (-1), (short) -1, dummyJPAAnySearchDAO52, 10, '4', (-1.0f), "hi!", 100.0f, 100L, "hi!", 0, (byte) 0, (byte) 1, (-1.0f), true, '#', true, 100L, obj69 };
        java.util.ArrayList<java.lang.Object> objList71 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList71, objArray70);
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport73 = null;
        org.apache.syncope.core.persistence.jpa.dao.AbstractJPAAnySearchDAO.AttrCondQuery attrCondQuery74 = dummyJPAAnySearchDAO4.getQuery(attrCond6, true, attrCondCheckResult8, (java.util.List<java.lang.Object>) objList71, searchSupport73);
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport75 = null;
        org.apache.syncope.core.persistence.jpa.dao.AbstractJPAAnySearchDAO.AttrCondQuery attrCondQuery76 = dummyJPAAnySearchDAO0.getQuery(attrCond1, true, attrCondCheckResult3, (java.util.List<java.lang.Object>) objList71, searchSupport75);
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport77 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport orderBySupport78 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport.Item item79 = null;
        org.springframework.data.domain.Sort.Order order80 = null;
        org.apache.syncope.core.persistence.api.entity.PlainSchema plainSchema81 = null;
        dummyJPAAnySearchDAO0.parseOrderByForPlainSchema(searchSupport77, orderBySupport78, item79, order80, plainSchema81, "");
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport84 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport orderBySupport85 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport.Item item86 = null;
        org.springframework.data.domain.Sort.Order order87 = null;
        org.apache.syncope.core.persistence.api.entity.PlainSchema plainSchema88 = null;
        dummyJPAAnySearchDAO0.parseOrderByForPlainSchema(searchSupport84, orderBySupport85, item86, order87, plainSchema88, "");
        java.lang.Class<?> wildcardClass91 = dummyJPAAnySearchDAO0.getClass();
        org.junit.Assert.assertNotNull(searchCond5);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertNotNull(searchCond40);
        org.junit.Assert.assertNotNull(searchCond53);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(attrCondQuery74);
        org.junit.Assert.assertNotNull(attrCondQuery76);
        org.junit.Assert.assertNotNull(wildcardClass91);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractJPAAnySearchDAORandoopTestC20.test56");
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO0 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.entity.Realm realm1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond7 = null;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind8 = null;
        long long9 = dummyJPAAnySearchDAO0.count(realm1, true, (java.util.Set<java.lang.String>) strSet5, searchCond7, anyTypeKind8);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond10 = dummyJPAAnySearchDAO0.getAllMatchingCond();
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport11 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport orderBySupport12 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport.Item item13 = null;
        org.springframework.data.domain.Sort.Order order14 = null;
        org.apache.syncope.core.persistence.api.entity.PlainSchema plainSchema15 = null;
        dummyJPAAnySearchDAO0.parseOrderByForPlainSchema(searchSupport11, orderBySupport12, item13, order14, plainSchema15, "");
        org.apache.syncope.core.persistence.api.entity.Realm realm18 = null;
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "" };
        java.util.LinkedHashSet<java.lang.String> strSet23 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet23, strArray22);
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO25 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.entity.Realm realm26 = null;
        java.lang.String[] strArray29 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet30 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet30, strArray29);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond32 = null;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind33 = null;
        long long34 = dummyJPAAnySearchDAO25.count(realm26, true, (java.util.Set<java.lang.String>) strSet30, searchCond32, anyTypeKind33);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond35 = dummyJPAAnySearchDAO25.getAllMatchingCond();
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport36 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport orderBySupport37 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport.Item item38 = null;
        org.springframework.data.domain.Sort.Order order39 = null;
        org.apache.syncope.core.persistence.api.entity.PlainSchema plainSchema40 = null;
        dummyJPAAnySearchDAO25.parseOrderByForPlainSchema(searchSupport36, orderBySupport37, item38, order39, plainSchema40, "");
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond43 = dummyJPAAnySearchDAO25.getAllMatchingCond();
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind44 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long45 = dummyJPAAnySearchDAO0.count(realm18, true, (java.util.Set<java.lang.String>) strSet23, searchCond43, anyTypeKind44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmSearchDAO.findByFullPath(String)\" because \"this.realmSearchDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(searchCond10);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertNotNull(searchCond35);
        org.junit.Assert.assertNotNull(searchCond43);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractJPAAnySearchDAORandoopTestC20.test57");
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO0 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond1 = dummyJPAAnySearchDAO0.getAllMatchingCond();
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport2 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport orderBySupport3 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport.Item item4 = null;
        org.springframework.data.domain.Sort.Order order5 = null;
        org.apache.syncope.core.persistence.api.entity.PlainSchema plainSchema6 = null;
        dummyJPAAnySearchDAO0.parseOrderByForPlainSchema(searchSupport2, orderBySupport3, item4, order5, plainSchema6, "");
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond9 = dummyJPAAnySearchDAO0.getAllMatchingCond();
        org.apache.syncope.core.persistence.api.dao.search.AttrCond attrCond10 = null;
        org.apache.syncope.core.persistence.common.dao.AbstractSearchDAO.CheckResult<org.apache.syncope.core.persistence.api.dao.search.AttrCond> attrCondCheckResult12 = null;
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO13 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.AttrCond attrCond14 = null;
        org.apache.syncope.core.persistence.common.dao.AbstractSearchDAO.CheckResult<org.apache.syncope.core.persistence.api.dao.search.AttrCond> attrCondCheckResult16 = null;
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO17 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond18 = dummyJPAAnySearchDAO17.getAllMatchingCond();
        org.apache.syncope.core.persistence.api.dao.search.AttrCond attrCond19 = null;
        org.apache.syncope.core.persistence.common.dao.AbstractSearchDAO.CheckResult<org.apache.syncope.core.persistence.api.dao.search.AttrCond> attrCondCheckResult21 = null;
        java.lang.Object obj22 = new java.lang.Object();
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO32 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.entity.Realm realm33 = null;
        java.lang.String[] strArray36 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet37 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet37, strArray36);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond39 = null;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind40 = null;
        long long41 = dummyJPAAnySearchDAO32.count(realm33, true, (java.util.Set<java.lang.String>) strSet37, searchCond39, anyTypeKind40);
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO42 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.entity.Realm realm43 = null;
        java.lang.String[] strArray46 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet47 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet47, strArray46);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond49 = null;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind50 = null;
        long long51 = dummyJPAAnySearchDAO42.count(realm43, true, (java.util.Set<java.lang.String>) strSet47, searchCond49, anyTypeKind50);
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO52 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond53 = dummyJPAAnySearchDAO52.getAllMatchingCond();
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO65 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond66 = dummyJPAAnySearchDAO65.getAllMatchingCond();
        java.lang.Object obj82 = new java.lang.Object();
        java.lang.Object[] objArray83 = new java.lang.Object[] { obj22, (short) 10, (byte) 10, 0, 0.0f, 1, (short) -1, 0, 0, 1L, anyTypeKind40, realm43, dummyJPAAnySearchDAO52, 0.0f, 100L, "hi!", (byte) 10, ' ', '#', (-1.0d), 100.0d, 'a', (-1), (short) -1, dummyJPAAnySearchDAO65, 10, '4', (-1.0f), "hi!", 100.0f, 100L, "hi!", 0, (byte) 0, (byte) 1, (-1.0f), true, '#', true, 100L, obj82 };
        java.util.ArrayList<java.lang.Object> objList84 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList84, objArray83);
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport86 = null;
        org.apache.syncope.core.persistence.jpa.dao.AbstractJPAAnySearchDAO.AttrCondQuery attrCondQuery87 = dummyJPAAnySearchDAO17.getQuery(attrCond19, true, attrCondCheckResult21, (java.util.List<java.lang.Object>) objList84, searchSupport86);
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport88 = null;
        org.apache.syncope.core.persistence.jpa.dao.AbstractJPAAnySearchDAO.AttrCondQuery attrCondQuery89 = dummyJPAAnySearchDAO13.getQuery(attrCond14, true, attrCondCheckResult16, (java.util.List<java.lang.Object>) objList84, searchSupport88);
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport90 = null;
        org.apache.syncope.core.persistence.jpa.dao.AbstractJPAAnySearchDAO.AttrCondQuery attrCondQuery91 = dummyJPAAnySearchDAO0.getQuery(attrCond10, false, attrCondCheckResult12, (java.util.List<java.lang.Object>) objList84, searchSupport90);
        org.junit.Assert.assertNotNull(searchCond1);
        org.junit.Assert.assertNotNull(searchCond9);
        org.junit.Assert.assertNotNull(searchCond18);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertArrayEquals(strArray46, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
        org.junit.Assert.assertNotNull(searchCond53);
        org.junit.Assert.assertNotNull(searchCond66);
        org.junit.Assert.assertNotNull(objArray83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNotNull(attrCondQuery87);
        org.junit.Assert.assertNotNull(attrCondQuery89);
        org.junit.Assert.assertNotNull(attrCondQuery91);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractJPAAnySearchDAORandoopTestC20.test58");
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
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond71 = dummyJPAAnySearchDAO0.getAllMatchingCond();
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport72 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport orderBySupport73 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport.Item item74 = null;
        org.springframework.data.domain.Sort.Order order75 = null;
        org.apache.syncope.core.persistence.api.entity.PlainSchema plainSchema76 = null;
        dummyJPAAnySearchDAO0.parseOrderByForPlainSchema(searchSupport72, orderBySupport73, item74, order75, plainSchema76, "hi!");
        java.lang.Class<?> wildcardClass79 = dummyJPAAnySearchDAO0.getClass();
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
        org.junit.Assert.assertNotNull(searchCond71);
        org.junit.Assert.assertNotNull(wildcardClass79);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractJPAAnySearchDAORandoopTestC20.test59");
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO0 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.AttrCond attrCond1 = null;
        org.apache.syncope.core.persistence.common.dao.AbstractSearchDAO.CheckResult<org.apache.syncope.core.persistence.api.dao.search.AttrCond> attrCondCheckResult3 = null;
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO4 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond5 = dummyJPAAnySearchDAO4.getAllMatchingCond();
        org.apache.syncope.core.persistence.api.dao.search.AttrCond attrCond6 = null;
        org.apache.syncope.core.persistence.common.dao.AbstractSearchDAO.CheckResult<org.apache.syncope.core.persistence.api.dao.search.AttrCond> attrCondCheckResult8 = null;
        java.lang.Object obj9 = new java.lang.Object();
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO19 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.entity.Realm realm20 = null;
        java.lang.String[] strArray23 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond26 = null;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind27 = null;
        long long28 = dummyJPAAnySearchDAO19.count(realm20, true, (java.util.Set<java.lang.String>) strSet24, searchCond26, anyTypeKind27);
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO29 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.entity.Realm realm30 = null;
        java.lang.String[] strArray33 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet34 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet34, strArray33);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond36 = null;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind37 = null;
        long long38 = dummyJPAAnySearchDAO29.count(realm30, true, (java.util.Set<java.lang.String>) strSet34, searchCond36, anyTypeKind37);
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO39 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond40 = dummyJPAAnySearchDAO39.getAllMatchingCond();
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO52 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond53 = dummyJPAAnySearchDAO52.getAllMatchingCond();
        java.lang.Object obj69 = new java.lang.Object();
        java.lang.Object[] objArray70 = new java.lang.Object[] { obj9, (short) 10, (byte) 10, 0, 0.0f, 1, (short) -1, 0, 0, 1L, anyTypeKind27, realm30, dummyJPAAnySearchDAO39, 0.0f, 100L, "hi!", (byte) 10, ' ', '#', (-1.0d), 100.0d, 'a', (-1), (short) -1, dummyJPAAnySearchDAO52, 10, '4', (-1.0f), "hi!", 100.0f, 100L, "hi!", 0, (byte) 0, (byte) 1, (-1.0f), true, '#', true, 100L, obj69 };
        java.util.ArrayList<java.lang.Object> objList71 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList71, objArray70);
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport73 = null;
        org.apache.syncope.core.persistence.jpa.dao.AbstractJPAAnySearchDAO.AttrCondQuery attrCondQuery74 = dummyJPAAnySearchDAO4.getQuery(attrCond6, true, attrCondCheckResult8, (java.util.List<java.lang.Object>) objList71, searchSupport73);
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport75 = null;
        org.apache.syncope.core.persistence.jpa.dao.AbstractJPAAnySearchDAO.AttrCondQuery attrCondQuery76 = dummyJPAAnySearchDAO0.getQuery(attrCond1, true, attrCondCheckResult3, (java.util.List<java.lang.Object>) objList71, searchSupport75);
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport77 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport orderBySupport78 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport.Item item79 = null;
        org.springframework.data.domain.Sort.Order order80 = null;
        org.apache.syncope.core.persistence.api.entity.PlainSchema plainSchema81 = null;
        dummyJPAAnySearchDAO0.parseOrderByForPlainSchema(searchSupport77, orderBySupport78, item79, order80, plainSchema81, "");
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport84 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport orderBySupport85 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport.Item item86 = null;
        org.springframework.data.domain.Sort.Order order87 = null;
        org.apache.syncope.core.persistence.api.entity.PlainSchema plainSchema88 = null;
        dummyJPAAnySearchDAO0.parseOrderByForPlainSchema(searchSupport84, orderBySupport85, item86, order87, plainSchema88, "hi!");
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport91 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport orderBySupport92 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport.Item item93 = null;
        org.springframework.data.domain.Sort.Order order94 = null;
        org.apache.syncope.core.persistence.api.entity.PlainSchema plainSchema95 = null;
        dummyJPAAnySearchDAO0.parseOrderByForPlainSchema(searchSupport91, orderBySupport92, item93, order94, plainSchema95, "");
        org.junit.Assert.assertNotNull(searchCond5);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertNotNull(searchCond40);
        org.junit.Assert.assertNotNull(searchCond53);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(attrCondQuery74);
        org.junit.Assert.assertNotNull(attrCondQuery76);
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractJPAAnySearchDAORandoopTestC20.test60");
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO0 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.AttrCond attrCond1 = null;
        org.apache.syncope.core.persistence.common.dao.AbstractSearchDAO.CheckResult<org.apache.syncope.core.persistence.api.dao.search.AttrCond> attrCondCheckResult3 = null;
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO4 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond5 = dummyJPAAnySearchDAO4.getAllMatchingCond();
        org.apache.syncope.core.persistence.api.dao.search.AttrCond attrCond6 = null;
        org.apache.syncope.core.persistence.common.dao.AbstractSearchDAO.CheckResult<org.apache.syncope.core.persistence.api.dao.search.AttrCond> attrCondCheckResult8 = null;
        java.lang.Object obj9 = new java.lang.Object();
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO19 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.entity.Realm realm20 = null;
        java.lang.String[] strArray23 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond26 = null;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind27 = null;
        long long28 = dummyJPAAnySearchDAO19.count(realm20, true, (java.util.Set<java.lang.String>) strSet24, searchCond26, anyTypeKind27);
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO29 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.entity.Realm realm30 = null;
        java.lang.String[] strArray33 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet34 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet34, strArray33);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond36 = null;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind37 = null;
        long long38 = dummyJPAAnySearchDAO29.count(realm30, true, (java.util.Set<java.lang.String>) strSet34, searchCond36, anyTypeKind37);
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO39 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond40 = dummyJPAAnySearchDAO39.getAllMatchingCond();
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO52 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond53 = dummyJPAAnySearchDAO52.getAllMatchingCond();
        java.lang.Object obj69 = new java.lang.Object();
        java.lang.Object[] objArray70 = new java.lang.Object[] { obj9, (short) 10, (byte) 10, 0, 0.0f, 1, (short) -1, 0, 0, 1L, anyTypeKind27, realm30, dummyJPAAnySearchDAO39, 0.0f, 100L, "hi!", (byte) 10, ' ', '#', (-1.0d), 100.0d, 'a', (-1), (short) -1, dummyJPAAnySearchDAO52, 10, '4', (-1.0f), "hi!", 100.0f, 100L, "hi!", 0, (byte) 0, (byte) 1, (-1.0f), true, '#', true, 100L, obj69 };
        java.util.ArrayList<java.lang.Object> objList71 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList71, objArray70);
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport73 = null;
        org.apache.syncope.core.persistence.jpa.dao.AbstractJPAAnySearchDAO.AttrCondQuery attrCondQuery74 = dummyJPAAnySearchDAO4.getQuery(attrCond6, true, attrCondCheckResult8, (java.util.List<java.lang.Object>) objList71, searchSupport73);
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport75 = null;
        org.apache.syncope.core.persistence.jpa.dao.AbstractJPAAnySearchDAO.AttrCondQuery attrCondQuery76 = dummyJPAAnySearchDAO0.getQuery(attrCond1, true, attrCondCheckResult3, (java.util.List<java.lang.Object>) objList71, searchSupport75);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond77 = dummyJPAAnySearchDAO0.getAllMatchingCond();
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport78 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport orderBySupport79 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport.Item item80 = null;
        org.springframework.data.domain.Sort.Order order81 = null;
        org.apache.syncope.core.persistence.api.entity.PlainSchema plainSchema82 = null;
        dummyJPAAnySearchDAO0.parseOrderByForPlainSchema(searchSupport78, orderBySupport79, item80, order81, plainSchema82, "");
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond85 = dummyJPAAnySearchDAO0.getAllMatchingCond();
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport86 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport orderBySupport87 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport.Item item88 = null;
        org.springframework.data.domain.Sort.Order order89 = null;
        org.apache.syncope.core.persistence.api.entity.PlainSchema plainSchema90 = null;
        dummyJPAAnySearchDAO0.parseOrderByForPlainSchema(searchSupport86, orderBySupport87, item88, order89, plainSchema90, "hi!");
        java.lang.Class<?> wildcardClass93 = dummyJPAAnySearchDAO0.getClass();
        org.junit.Assert.assertNotNull(searchCond5);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertNotNull(searchCond40);
        org.junit.Assert.assertNotNull(searchCond53);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(attrCondQuery74);
        org.junit.Assert.assertNotNull(attrCondQuery76);
        org.junit.Assert.assertNotNull(searchCond77);
        org.junit.Assert.assertNotNull(searchCond85);
        org.junit.Assert.assertNotNull(wildcardClass93);
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractJPAAnySearchDAORandoopTestC20.test61");
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO0 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.entity.Realm realm1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond7 = null;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind8 = null;
        long long9 = dummyJPAAnySearchDAO0.count(realm1, true, (java.util.Set<java.lang.String>) strSet5, searchCond7, anyTypeKind8);
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport10 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport orderBySupport11 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport.Item item12 = null;
        org.springframework.data.domain.Sort.Order order13 = null;
        org.apache.syncope.core.persistence.api.entity.PlainSchema plainSchema14 = null;
        dummyJPAAnySearchDAO0.parseOrderByForPlainSchema(searchSupport10, orderBySupport11, item12, order13, plainSchema14, "hi!");
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport17 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport orderBySupport18 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport.Item item19 = null;
        org.springframework.data.domain.Sort.Order order20 = null;
        org.apache.syncope.core.persistence.api.entity.PlainSchema plainSchema21 = null;
        dummyJPAAnySearchDAO0.parseOrderByForPlainSchema(searchSupport17, orderBySupport18, item19, order20, plainSchema21, "");
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond24 = dummyJPAAnySearchDAO0.getAllMatchingCond();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(searchCond24);
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractJPAAnySearchDAORandoopTestC20.test62");
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO0 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.AttrCond attrCond1 = null;
        org.apache.syncope.core.persistence.common.dao.AbstractSearchDAO.CheckResult<org.apache.syncope.core.persistence.api.dao.search.AttrCond> attrCondCheckResult3 = null;
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO4 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond5 = dummyJPAAnySearchDAO4.getAllMatchingCond();
        org.apache.syncope.core.persistence.api.dao.search.AttrCond attrCond6 = null;
        org.apache.syncope.core.persistence.common.dao.AbstractSearchDAO.CheckResult<org.apache.syncope.core.persistence.api.dao.search.AttrCond> attrCondCheckResult8 = null;
        java.lang.Object obj9 = new java.lang.Object();
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO19 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.entity.Realm realm20 = null;
        java.lang.String[] strArray23 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond26 = null;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind27 = null;
        long long28 = dummyJPAAnySearchDAO19.count(realm20, true, (java.util.Set<java.lang.String>) strSet24, searchCond26, anyTypeKind27);
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO29 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.entity.Realm realm30 = null;
        java.lang.String[] strArray33 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet34 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet34, strArray33);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond36 = null;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind37 = null;
        long long38 = dummyJPAAnySearchDAO29.count(realm30, true, (java.util.Set<java.lang.String>) strSet34, searchCond36, anyTypeKind37);
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO39 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond40 = dummyJPAAnySearchDAO39.getAllMatchingCond();
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO52 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond53 = dummyJPAAnySearchDAO52.getAllMatchingCond();
        java.lang.Object obj69 = new java.lang.Object();
        java.lang.Object[] objArray70 = new java.lang.Object[] { obj9, (short) 10, (byte) 10, 0, 0.0f, 1, (short) -1, 0, 0, 1L, anyTypeKind27, realm30, dummyJPAAnySearchDAO39, 0.0f, 100L, "hi!", (byte) 10, ' ', '#', (-1.0d), 100.0d, 'a', (-1), (short) -1, dummyJPAAnySearchDAO52, 10, '4', (-1.0f), "hi!", 100.0f, 100L, "hi!", 0, (byte) 0, (byte) 1, (-1.0f), true, '#', true, 100L, obj69 };
        java.util.ArrayList<java.lang.Object> objList71 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList71, objArray70);
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport73 = null;
        org.apache.syncope.core.persistence.jpa.dao.AbstractJPAAnySearchDAO.AttrCondQuery attrCondQuery74 = dummyJPAAnySearchDAO4.getQuery(attrCond6, true, attrCondCheckResult8, (java.util.List<java.lang.Object>) objList71, searchSupport73);
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport75 = null;
        org.apache.syncope.core.persistence.jpa.dao.AbstractJPAAnySearchDAO.AttrCondQuery attrCondQuery76 = dummyJPAAnySearchDAO0.getQuery(attrCond1, true, attrCondCheckResult3, (java.util.List<java.lang.Object>) objList71, searchSupport75);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond77 = dummyJPAAnySearchDAO0.getAllMatchingCond();
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport78 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport orderBySupport79 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport.Item item80 = null;
        org.springframework.data.domain.Sort.Order order81 = null;
        org.apache.syncope.core.persistence.api.entity.PlainSchema plainSchema82 = null;
        dummyJPAAnySearchDAO0.parseOrderByForPlainSchema(searchSupport78, orderBySupport79, item80, order81, plainSchema82, "");
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond85 = dummyJPAAnySearchDAO0.getAllMatchingCond();
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport86 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport orderBySupport87 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport.Item item88 = null;
        org.springframework.data.domain.Sort.Order order89 = null;
        org.apache.syncope.core.persistence.api.entity.PlainSchema plainSchema90 = null;
        dummyJPAAnySearchDAO0.parseOrderByForPlainSchema(searchSupport86, orderBySupport87, item88, order89, plainSchema90, "hi!");
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond93 = dummyJPAAnySearchDAO0.getAllMatchingCond();
        org.junit.Assert.assertNotNull(searchCond5);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertNotNull(searchCond40);
        org.junit.Assert.assertNotNull(searchCond53);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(attrCondQuery74);
        org.junit.Assert.assertNotNull(attrCondQuery76);
        org.junit.Assert.assertNotNull(searchCond77);
        org.junit.Assert.assertNotNull(searchCond85);
        org.junit.Assert.assertNotNull(searchCond93);
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractJPAAnySearchDAORandoopTestC20.test63");
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO0 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.AttrCond attrCond1 = null;
        org.apache.syncope.core.persistence.common.dao.AbstractSearchDAO.CheckResult<org.apache.syncope.core.persistence.api.dao.search.AttrCond> attrCondCheckResult3 = null;
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO4 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond5 = dummyJPAAnySearchDAO4.getAllMatchingCond();
        org.apache.syncope.core.persistence.api.dao.search.AttrCond attrCond6 = null;
        org.apache.syncope.core.persistence.common.dao.AbstractSearchDAO.CheckResult<org.apache.syncope.core.persistence.api.dao.search.AttrCond> attrCondCheckResult8 = null;
        java.lang.Object obj9 = new java.lang.Object();
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO19 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.entity.Realm realm20 = null;
        java.lang.String[] strArray23 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond26 = null;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind27 = null;
        long long28 = dummyJPAAnySearchDAO19.count(realm20, true, (java.util.Set<java.lang.String>) strSet24, searchCond26, anyTypeKind27);
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO29 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.entity.Realm realm30 = null;
        java.lang.String[] strArray33 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet34 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet34, strArray33);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond36 = null;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind37 = null;
        long long38 = dummyJPAAnySearchDAO29.count(realm30, true, (java.util.Set<java.lang.String>) strSet34, searchCond36, anyTypeKind37);
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO39 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond40 = dummyJPAAnySearchDAO39.getAllMatchingCond();
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO52 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond53 = dummyJPAAnySearchDAO52.getAllMatchingCond();
        java.lang.Object obj69 = new java.lang.Object();
        java.lang.Object[] objArray70 = new java.lang.Object[] { obj9, (short) 10, (byte) 10, 0, 0.0f, 1, (short) -1, 0, 0, 1L, anyTypeKind27, realm30, dummyJPAAnySearchDAO39, 0.0f, 100L, "hi!", (byte) 10, ' ', '#', (-1.0d), 100.0d, 'a', (-1), (short) -1, dummyJPAAnySearchDAO52, 10, '4', (-1.0f), "hi!", 100.0f, 100L, "hi!", 0, (byte) 0, (byte) 1, (-1.0f), true, '#', true, 100L, obj69 };
        java.util.ArrayList<java.lang.Object> objList71 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList71, objArray70);
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport73 = null;
        org.apache.syncope.core.persistence.jpa.dao.AbstractJPAAnySearchDAO.AttrCondQuery attrCondQuery74 = dummyJPAAnySearchDAO4.getQuery(attrCond6, true, attrCondCheckResult8, (java.util.List<java.lang.Object>) objList71, searchSupport73);
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport75 = null;
        org.apache.syncope.core.persistence.jpa.dao.AbstractJPAAnySearchDAO.AttrCondQuery attrCondQuery76 = dummyJPAAnySearchDAO0.getQuery(attrCond1, true, attrCondCheckResult3, (java.util.List<java.lang.Object>) objList71, searchSupport75);
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport77 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport orderBySupport78 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport.Item item79 = null;
        org.springframework.data.domain.Sort.Order order80 = null;
        org.apache.syncope.core.persistence.api.entity.PlainSchema plainSchema81 = null;
        dummyJPAAnySearchDAO0.parseOrderByForPlainSchema(searchSupport77, orderBySupport78, item79, order80, plainSchema81, "");
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond84 = dummyJPAAnySearchDAO0.getAllMatchingCond();
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport85 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport orderBySupport86 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport.Item item87 = null;
        org.springframework.data.domain.Sort.Order order88 = null;
        org.apache.syncope.core.persistence.api.entity.PlainSchema plainSchema89 = null;
        dummyJPAAnySearchDAO0.parseOrderByForPlainSchema(searchSupport85, orderBySupport86, item87, order88, plainSchema89, "");
        org.junit.Assert.assertNotNull(searchCond5);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertNotNull(searchCond40);
        org.junit.Assert.assertNotNull(searchCond53);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(attrCondQuery74);
        org.junit.Assert.assertNotNull(attrCondQuery76);
        org.junit.Assert.assertNotNull(searchCond84);
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractJPAAnySearchDAORandoopTestC20.test64");
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO0 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.AttrCond attrCond1 = null;
        org.apache.syncope.core.persistence.common.dao.AbstractSearchDAO.CheckResult<org.apache.syncope.core.persistence.api.dao.search.AttrCond> attrCondCheckResult3 = null;
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO4 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond5 = dummyJPAAnySearchDAO4.getAllMatchingCond();
        org.apache.syncope.core.persistence.api.dao.search.AttrCond attrCond6 = null;
        org.apache.syncope.core.persistence.common.dao.AbstractSearchDAO.CheckResult<org.apache.syncope.core.persistence.api.dao.search.AttrCond> attrCondCheckResult8 = null;
        java.lang.Object obj9 = new java.lang.Object();
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO19 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.entity.Realm realm20 = null;
        java.lang.String[] strArray23 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond26 = null;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind27 = null;
        long long28 = dummyJPAAnySearchDAO19.count(realm20, true, (java.util.Set<java.lang.String>) strSet24, searchCond26, anyTypeKind27);
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO29 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.entity.Realm realm30 = null;
        java.lang.String[] strArray33 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet34 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet34, strArray33);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond36 = null;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind37 = null;
        long long38 = dummyJPAAnySearchDAO29.count(realm30, true, (java.util.Set<java.lang.String>) strSet34, searchCond36, anyTypeKind37);
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO39 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond40 = dummyJPAAnySearchDAO39.getAllMatchingCond();
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO52 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond53 = dummyJPAAnySearchDAO52.getAllMatchingCond();
        java.lang.Object obj69 = new java.lang.Object();
        java.lang.Object[] objArray70 = new java.lang.Object[] { obj9, (short) 10, (byte) 10, 0, 0.0f, 1, (short) -1, 0, 0, 1L, anyTypeKind27, realm30, dummyJPAAnySearchDAO39, 0.0f, 100L, "hi!", (byte) 10, ' ', '#', (-1.0d), 100.0d, 'a', (-1), (short) -1, dummyJPAAnySearchDAO52, 10, '4', (-1.0f), "hi!", 100.0f, 100L, "hi!", 0, (byte) 0, (byte) 1, (-1.0f), true, '#', true, 100L, obj69 };
        java.util.ArrayList<java.lang.Object> objList71 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList71, objArray70);
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport73 = null;
        org.apache.syncope.core.persistence.jpa.dao.AbstractJPAAnySearchDAO.AttrCondQuery attrCondQuery74 = dummyJPAAnySearchDAO4.getQuery(attrCond6, true, attrCondCheckResult8, (java.util.List<java.lang.Object>) objList71, searchSupport73);
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport75 = null;
        org.apache.syncope.core.persistence.jpa.dao.AbstractJPAAnySearchDAO.AttrCondQuery attrCondQuery76 = dummyJPAAnySearchDAO0.getQuery(attrCond1, true, attrCondCheckResult3, (java.util.List<java.lang.Object>) objList71, searchSupport75);
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport77 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport orderBySupport78 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport.Item item79 = null;
        org.springframework.data.domain.Sort.Order order80 = null;
        org.apache.syncope.core.persistence.api.entity.PlainSchema plainSchema81 = null;
        dummyJPAAnySearchDAO0.parseOrderByForPlainSchema(searchSupport77, orderBySupport78, item79, order80, plainSchema81, "");
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport84 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport orderBySupport85 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport.Item item86 = null;
        org.springframework.data.domain.Sort.Order order87 = null;
        org.apache.syncope.core.persistence.api.entity.PlainSchema plainSchema88 = null;
        dummyJPAAnySearchDAO0.parseOrderByForPlainSchema(searchSupport84, orderBySupport85, item86, order87, plainSchema88, "hi!");
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond91 = dummyJPAAnySearchDAO0.getAllMatchingCond();
        java.lang.Class<?> wildcardClass92 = searchCond91.getClass();
        org.junit.Assert.assertNotNull(searchCond5);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertNotNull(searchCond40);
        org.junit.Assert.assertNotNull(searchCond53);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(attrCondQuery74);
        org.junit.Assert.assertNotNull(attrCondQuery76);
        org.junit.Assert.assertNotNull(searchCond91);
        org.junit.Assert.assertNotNull(wildcardClass92);
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractJPAAnySearchDAORandoopTestC20.test65");
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO0 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.AttrCond attrCond1 = null;
        org.apache.syncope.core.persistence.common.dao.AbstractSearchDAO.CheckResult<org.apache.syncope.core.persistence.api.dao.search.AttrCond> attrCondCheckResult3 = null;
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO4 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond5 = dummyJPAAnySearchDAO4.getAllMatchingCond();
        org.apache.syncope.core.persistence.api.dao.search.AttrCond attrCond6 = null;
        org.apache.syncope.core.persistence.common.dao.AbstractSearchDAO.CheckResult<org.apache.syncope.core.persistence.api.dao.search.AttrCond> attrCondCheckResult8 = null;
        java.lang.Object obj9 = new java.lang.Object();
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO19 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.entity.Realm realm20 = null;
        java.lang.String[] strArray23 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond26 = null;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind27 = null;
        long long28 = dummyJPAAnySearchDAO19.count(realm20, true, (java.util.Set<java.lang.String>) strSet24, searchCond26, anyTypeKind27);
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO29 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.entity.Realm realm30 = null;
        java.lang.String[] strArray33 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet34 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet34, strArray33);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond36 = null;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind37 = null;
        long long38 = dummyJPAAnySearchDAO29.count(realm30, true, (java.util.Set<java.lang.String>) strSet34, searchCond36, anyTypeKind37);
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO39 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond40 = dummyJPAAnySearchDAO39.getAllMatchingCond();
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO52 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond53 = dummyJPAAnySearchDAO52.getAllMatchingCond();
        java.lang.Object obj69 = new java.lang.Object();
        java.lang.Object[] objArray70 = new java.lang.Object[] { obj9, (short) 10, (byte) 10, 0, 0.0f, 1, (short) -1, 0, 0, 1L, anyTypeKind27, realm30, dummyJPAAnySearchDAO39, 0.0f, 100L, "hi!", (byte) 10, ' ', '#', (-1.0d), 100.0d, 'a', (-1), (short) -1, dummyJPAAnySearchDAO52, 10, '4', (-1.0f), "hi!", 100.0f, 100L, "hi!", 0, (byte) 0, (byte) 1, (-1.0f), true, '#', true, 100L, obj69 };
        java.util.ArrayList<java.lang.Object> objList71 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList71, objArray70);
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport73 = null;
        org.apache.syncope.core.persistence.jpa.dao.AbstractJPAAnySearchDAO.AttrCondQuery attrCondQuery74 = dummyJPAAnySearchDAO4.getQuery(attrCond6, true, attrCondCheckResult8, (java.util.List<java.lang.Object>) objList71, searchSupport73);
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport75 = null;
        org.apache.syncope.core.persistence.jpa.dao.AbstractJPAAnySearchDAO.AttrCondQuery attrCondQuery76 = dummyJPAAnySearchDAO0.getQuery(attrCond1, true, attrCondCheckResult3, (java.util.List<java.lang.Object>) objList71, searchSupport75);
        java.lang.Class<?> wildcardClass77 = objList71.getClass();
        org.junit.Assert.assertNotNull(searchCond5);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertNotNull(searchCond40);
        org.junit.Assert.assertNotNull(searchCond53);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(attrCondQuery74);
        org.junit.Assert.assertNotNull(attrCondQuery76);
        org.junit.Assert.assertNotNull(wildcardClass77);
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractJPAAnySearchDAORandoopTestC20.test66");
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
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport71 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport orderBySupport72 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport.Item item73 = null;
        org.springframework.data.domain.Sort.Order order74 = null;
        org.apache.syncope.core.persistence.api.entity.PlainSchema plainSchema75 = null;
        dummyJPAAnySearchDAO0.parseOrderByForPlainSchema(searchSupport71, orderBySupport72, item73, order74, plainSchema75, "hi!");
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport78 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport orderBySupport79 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport.Item item80 = null;
        org.springframework.data.domain.Sort.Order order81 = null;
        org.apache.syncope.core.persistence.api.entity.PlainSchema plainSchema82 = null;
        dummyJPAAnySearchDAO0.parseOrderByForPlainSchema(searchSupport78, orderBySupport79, item80, order81, plainSchema82, "hi!");
        org.apache.syncope.core.persistence.api.entity.Realm realm85 = null;
        java.lang.String[] strArray88 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet89 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean90 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet89, strArray88);
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO91 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond92 = dummyJPAAnySearchDAO91.getAllMatchingCond();
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind93 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long94 = dummyJPAAnySearchDAO0.count(realm85, true, (java.util.Set<java.lang.String>) strSet89, searchCond92, anyTypeKind93);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmSearchDAO.findByFullPath(String)\" because \"this.realmSearchDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(strArray88);
        org.junit.Assert.assertArrayEquals(strArray88, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertNotNull(searchCond92);
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractJPAAnySearchDAORandoopTestC20.test67");
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
        org.apache.syncope.core.persistence.api.entity.Realm realm71 = null;
        java.lang.String[] strArray75 = new java.lang.String[] { "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet76 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet76, strArray75);
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO78 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond79 = dummyJPAAnySearchDAO78.getAllMatchingCond();
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond80 = dummyJPAAnySearchDAO78.getAllMatchingCond();
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind81 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long82 = dummyJPAAnySearchDAO0.count(realm71, true, (java.util.Set<java.lang.String>) strSet76, searchCond80, anyTypeKind81);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmSearchDAO.findByFullPath(String)\" because \"this.realmSearchDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertArrayEquals(strArray75, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(searchCond79);
        org.junit.Assert.assertNotNull(searchCond80);
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractJPAAnySearchDAORandoopTestC20.test68");
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO0 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.entity.Realm realm1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond7 = null;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind8 = null;
        long long9 = dummyJPAAnySearchDAO0.count(realm1, true, (java.util.Set<java.lang.String>) strSet5, searchCond7, anyTypeKind8);
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport10 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport orderBySupport11 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport.Item item12 = null;
        org.springframework.data.domain.Sort.Order order13 = null;
        org.apache.syncope.core.persistence.api.entity.PlainSchema plainSchema14 = null;
        dummyJPAAnySearchDAO0.parseOrderByForPlainSchema(searchSupport10, orderBySupport11, item12, order13, plainSchema14, "hi!");
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport17 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport orderBySupport18 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport.Item item19 = null;
        org.springframework.data.domain.Sort.Order order20 = null;
        org.apache.syncope.core.persistence.api.entity.PlainSchema plainSchema21 = null;
        dummyJPAAnySearchDAO0.parseOrderByForPlainSchema(searchSupport17, orderBySupport18, item19, order20, plainSchema21, "");
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport24 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport orderBySupport25 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport.Item item26 = null;
        org.springframework.data.domain.Sort.Order order27 = null;
        org.apache.syncope.core.persistence.api.entity.PlainSchema plainSchema28 = null;
        dummyJPAAnySearchDAO0.parseOrderByForPlainSchema(searchSupport24, orderBySupport25, item26, order27, plainSchema28, "hi!");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractJPAAnySearchDAORandoopTestC20.test69");
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO0 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.entity.Realm realm1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond7 = null;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind8 = null;
        long long9 = dummyJPAAnySearchDAO0.count(realm1, true, (java.util.Set<java.lang.String>) strSet5, searchCond7, anyTypeKind8);
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport10 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport orderBySupport11 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport.Item item12 = null;
        org.springframework.data.domain.Sort.Order order13 = null;
        org.apache.syncope.core.persistence.api.entity.PlainSchema plainSchema14 = null;
        dummyJPAAnySearchDAO0.parseOrderByForPlainSchema(searchSupport10, orderBySupport11, item12, order13, plainSchema14, "");
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond17 = dummyJPAAnySearchDAO0.getAllMatchingCond();
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport18 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport orderBySupport19 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport.Item item20 = null;
        org.springframework.data.domain.Sort.Order order21 = null;
        org.apache.syncope.core.persistence.api.entity.PlainSchema plainSchema22 = null;
        dummyJPAAnySearchDAO0.parseOrderByForPlainSchema(searchSupport18, orderBySupport19, item20, order21, plainSchema22, "hi!");
        org.apache.syncope.core.persistence.api.entity.Realm realm25 = null;
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet29 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet29, strArray28);
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO31 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.entity.Realm realm32 = null;
        java.lang.String[] strArray35 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet36 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet36, strArray35);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond38 = null;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind39 = null;
        long long40 = dummyJPAAnySearchDAO31.count(realm32, true, (java.util.Set<java.lang.String>) strSet36, searchCond38, anyTypeKind39);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond41 = dummyJPAAnySearchDAO31.getAllMatchingCond();
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind42 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long43 = dummyJPAAnySearchDAO0.count(realm25, false, (java.util.Set<java.lang.String>) strSet29, searchCond41, anyTypeKind42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.persistence.api.entity.Realm.getFullPath()\" because \"base\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(searchCond17);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertNotNull(searchCond41);
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractJPAAnySearchDAORandoopTestC20.test70");
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
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport71 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport orderBySupport72 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport.Item item73 = null;
        org.springframework.data.domain.Sort.Order order74 = null;
        org.apache.syncope.core.persistence.api.entity.PlainSchema plainSchema75 = null;
        dummyJPAAnySearchDAO0.parseOrderByForPlainSchema(searchSupport71, orderBySupport72, item73, order74, plainSchema75, "");
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport78 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport orderBySupport79 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport.Item item80 = null;
        org.springframework.data.domain.Sort.Order order81 = null;
        org.apache.syncope.core.persistence.api.entity.PlainSchema plainSchema82 = null;
        dummyJPAAnySearchDAO0.parseOrderByForPlainSchema(searchSupport78, orderBySupport79, item80, order81, plainSchema82, "hi!");
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
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractJPAAnySearchDAORandoopTestC20.test71");
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
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond71 = dummyJPAAnySearchDAO0.getAllMatchingCond();
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport72 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport orderBySupport73 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport.Item item74 = null;
        org.springframework.data.domain.Sort.Order order75 = null;
        org.apache.syncope.core.persistence.api.entity.PlainSchema plainSchema76 = null;
        dummyJPAAnySearchDAO0.parseOrderByForPlainSchema(searchSupport72, orderBySupport73, item74, order75, plainSchema76, "hi!");
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport79 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport orderBySupport80 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport.Item item81 = null;
        org.springframework.data.domain.Sort.Order order82 = null;
        org.apache.syncope.core.persistence.api.entity.PlainSchema plainSchema83 = null;
        dummyJPAAnySearchDAO0.parseOrderByForPlainSchema(searchSupport79, orderBySupport80, item81, order82, plainSchema83, "");
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
        org.junit.Assert.assertNotNull(searchCond71);
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractJPAAnySearchDAORandoopTestC20.test72");
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO0 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.entity.Realm realm1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond7 = null;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind8 = null;
        long long9 = dummyJPAAnySearchDAO0.count(realm1, true, (java.util.Set<java.lang.String>) strSet5, searchCond7, anyTypeKind8);
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport10 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport orderBySupport11 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport.Item item12 = null;
        org.springframework.data.domain.Sort.Order order13 = null;
        org.apache.syncope.core.persistence.api.entity.PlainSchema plainSchema14 = null;
        dummyJPAAnySearchDAO0.parseOrderByForPlainSchema(searchSupport10, orderBySupport11, item12, order13, plainSchema14, "hi!");
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport17 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport orderBySupport18 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport.Item item19 = null;
        org.springframework.data.domain.Sort.Order order20 = null;
        org.apache.syncope.core.persistence.api.entity.PlainSchema plainSchema21 = null;
        dummyJPAAnySearchDAO0.parseOrderByForPlainSchema(searchSupport17, orderBySupport18, item19, order20, plainSchema21, "hi!");
        org.apache.syncope.core.persistence.api.entity.Realm realm24 = null;
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "" };
        java.util.LinkedHashSet<java.lang.String> strSet29 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet29, strArray28);
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO31 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport32 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport orderBySupport33 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport.Item item34 = null;
        org.springframework.data.domain.Sort.Order order35 = null;
        org.apache.syncope.core.persistence.api.entity.PlainSchema plainSchema36 = null;
        dummyJPAAnySearchDAO31.parseOrderByForPlainSchema(searchSupport32, orderBySupport33, item34, order35, plainSchema36, "");
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond39 = dummyJPAAnySearchDAO31.getAllMatchingCond();
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind40 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long41 = dummyJPAAnySearchDAO0.count(realm24, false, (java.util.Set<java.lang.String>) strSet29, searchCond39, anyTypeKind40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.persistence.api.entity.Realm.getFullPath()\" because \"base\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(searchCond39);
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractJPAAnySearchDAORandoopTestC20.test73");
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO0 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond1 = dummyJPAAnySearchDAO0.getAllMatchingCond();
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond2 = dummyJPAAnySearchDAO0.getAllMatchingCond();
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond3 = dummyJPAAnySearchDAO0.getAllMatchingCond();
        java.lang.Class<?> wildcardClass4 = dummyJPAAnySearchDAO0.getClass();
        org.junit.Assert.assertNotNull(searchCond1);
        org.junit.Assert.assertNotNull(searchCond2);
        org.junit.Assert.assertNotNull(searchCond3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractJPAAnySearchDAORandoopTestC20.test74");
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO0 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.entity.Realm realm1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond7 = null;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind8 = null;
        long long9 = dummyJPAAnySearchDAO0.count(realm1, true, (java.util.Set<java.lang.String>) strSet5, searchCond7, anyTypeKind8);
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport10 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport orderBySupport11 = null;
        org.apache.syncope.core.persistence.jpa.dao.OrderBySupport.Item item12 = null;
        org.springframework.data.domain.Sort.Order order13 = null;
        org.apache.syncope.core.persistence.api.entity.PlainSchema plainSchema14 = null;
        dummyJPAAnySearchDAO0.parseOrderByForPlainSchema(searchSupport10, orderBySupport11, item12, order13, plainSchema14, "hi!");
        org.apache.syncope.core.persistence.api.dao.search.AttrCond attrCond17 = null;
        org.apache.syncope.core.persistence.common.dao.AbstractSearchDAO.CheckResult<org.apache.syncope.core.persistence.api.dao.search.AttrCond> attrCondCheckResult19 = null;
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO20 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.AttrCond attrCond21 = null;
        org.apache.syncope.core.persistence.common.dao.AbstractSearchDAO.CheckResult<org.apache.syncope.core.persistence.api.dao.search.AttrCond> attrCondCheckResult23 = null;
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO24 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond25 = dummyJPAAnySearchDAO24.getAllMatchingCond();
        org.apache.syncope.core.persistence.api.dao.search.AttrCond attrCond26 = null;
        org.apache.syncope.core.persistence.common.dao.AbstractSearchDAO.CheckResult<org.apache.syncope.core.persistence.api.dao.search.AttrCond> attrCondCheckResult28 = null;
        java.lang.Object obj29 = new java.lang.Object();
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO39 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.entity.Realm realm40 = null;
        java.lang.String[] strArray43 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet44 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet44, strArray43);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond46 = null;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind47 = null;
        long long48 = dummyJPAAnySearchDAO39.count(realm40, true, (java.util.Set<java.lang.String>) strSet44, searchCond46, anyTypeKind47);
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO49 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.entity.Realm realm50 = null;
        java.lang.String[] strArray53 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet54 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet54, strArray53);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond56 = null;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind57 = null;
        long long58 = dummyJPAAnySearchDAO49.count(realm50, true, (java.util.Set<java.lang.String>) strSet54, searchCond56, anyTypeKind57);
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO59 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond60 = dummyJPAAnySearchDAO59.getAllMatchingCond();
        org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO dummyJPAAnySearchDAO72 = new org.apache.syncope.core.persistence.jpa.dao.DummyJPAAnySearchDAO();
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond73 = dummyJPAAnySearchDAO72.getAllMatchingCond();
        java.lang.Object obj89 = new java.lang.Object();
        java.lang.Object[] objArray90 = new java.lang.Object[] { obj29, (short) 10, (byte) 10, 0, 0.0f, 1, (short) -1, 0, 0, 1L, anyTypeKind47, realm50, dummyJPAAnySearchDAO59, 0.0f, 100L, "hi!", (byte) 10, ' ', '#', (-1.0d), 100.0d, 'a', (-1), (short) -1, dummyJPAAnySearchDAO72, 10, '4', (-1.0f), "hi!", 100.0f, 100L, "hi!", 0, (byte) 0, (byte) 1, (-1.0f), true, '#', true, 100L, obj89 };
        java.util.ArrayList<java.lang.Object> objList91 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean92 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList91, objArray90);
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport93 = null;
        org.apache.syncope.core.persistence.jpa.dao.AbstractJPAAnySearchDAO.AttrCondQuery attrCondQuery94 = dummyJPAAnySearchDAO24.getQuery(attrCond26, true, attrCondCheckResult28, (java.util.List<java.lang.Object>) objList91, searchSupport93);
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport95 = null;
        org.apache.syncope.core.persistence.jpa.dao.AbstractJPAAnySearchDAO.AttrCondQuery attrCondQuery96 = dummyJPAAnySearchDAO20.getQuery(attrCond21, true, attrCondCheckResult23, (java.util.List<java.lang.Object>) objList91, searchSupport95);
        org.apache.syncope.core.persistence.jpa.dao.SearchSupport searchSupport97 = null;
        org.apache.syncope.core.persistence.jpa.dao.AbstractJPAAnySearchDAO.AttrCondQuery attrCondQuery98 = dummyJPAAnySearchDAO0.getQuery(attrCond17, true, attrCondCheckResult19, (java.util.List<java.lang.Object>) objList91, searchSupport97);
        java.lang.Class<?> wildcardClass99 = dummyJPAAnySearchDAO0.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(searchCond25);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertArrayEquals(strArray43, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertArrayEquals(strArray53, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 0L + "'", long58 == 0L);
        org.junit.Assert.assertNotNull(searchCond60);
        org.junit.Assert.assertNotNull(searchCond73);
        org.junit.Assert.assertNotNull(objArray90);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertNotNull(attrCondQuery94);
        org.junit.Assert.assertNotNull(attrCondQuery96);
        org.junit.Assert.assertNotNull(attrCondQuery98);
        org.junit.Assert.assertNotNull(wildcardClass99);
    }
}

