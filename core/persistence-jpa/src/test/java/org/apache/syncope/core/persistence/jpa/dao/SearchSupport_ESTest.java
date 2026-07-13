package org.apache.syncope.core.persistence.jpa.dao;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.apache.syncope.common.lib.types.AnyTypeKind;

public class SearchSupport_ESTest {

  @Test
  public void test00() {
      SearchSupport searchSupport0 = new SearchSupport((AnyTypeKind) null);
      assertThrows(NullPointerException.class, () -> searchSupport0.table());
  }

  @Test
  public void test01() {
      SearchSupport searchSupport0 = new SearchSupport((AnyTypeKind) null);
      assertThrows(NullPointerException.class, () -> searchSupport0.role());
  }

  @Test
  public void test02() {
      SearchViewSupport searchViewSupport0 = new SearchViewSupport((AnyTypeKind) null);
      assertThrows(NullPointerException.class, () -> searchViewSupport0.relationship());
  }

  @Test
  public void test03() {
      SearchSupport searchSupport0 = new SearchSupport((AnyTypeKind) null);
      assertThrows(NullPointerException.class, () -> searchSupport0.membership());
  }

  @Test
  public void test04() {
      SearchViewSupport searchViewSupport0 = new SearchViewSupport((AnyTypeKind) null);
      assertThrows(NullPointerException.class, () -> searchViewSupport0.groupResource());
  }

  @Test
  public void test05() {
      AnyTypeKind anyTypeKind0 = AnyTypeKind.ANY_OBJECT;
      SearchSupport searchSupport0 = new SearchSupport(anyTypeKind0);
      SearchSupport.SearchView searchSupport_SearchView0 = searchSupport0.field();
      assertNotNull(searchSupport_SearchView0);
  }

  @Test
  public void test06() {
      AnyTypeKind anyTypeKind0 = AnyTypeKind.USER;
      SearchSupport searchSupport0 = new SearchSupport(anyTypeKind0);
      SearchSupport.SearchView searchSupport_SearchView0 = searchSupport0.field();
      assertNotNull(searchSupport_SearchView0);
  }

  @Test
  public void test07() {
      AnyTypeKind anyTypeKind0 = AnyTypeKind.GROUP;
      SearchSupport searchSupport0 = new SearchSupport(anyTypeKind0);
      SearchSupport.SearchView searchSupport_SearchView0 = searchSupport0.field();
      assertNotNull(searchSupport_SearchView0);
  }

  @Test
  public void test08() {
      SearchSupport.SearchView searchSupport_SearchView0 = new SearchSupport.SearchView("_entitlements", "_entitlements");
      assertNotNull(searchSupport_SearchView0);
  }

  @Test
  public void test09() {
      AnyTypeKind anyTypeKind0 = AnyTypeKind.ANY_OBJECT;
      SearchViewSupport searchViewSupport0 = new SearchViewSupport(anyTypeKind0);
      SearchViewSupport searchViewSupport1 = searchViewSupport0.asSearchViewSupport();
      assertSame(searchViewSupport0, searchViewSupport1);
  }

  @Test
  public void test10() {
      AnyTypeKind anyTypeKind0 = AnyTypeKind.USER;
      SearchSupport searchSupport0 = new SearchSupport(anyTypeKind0);
      assertThrows(IllegalArgumentException.class, () -> searchSupport0.asSearchViewSupport());
  }

  @Test
  public void test11() {
      AnyTypeKind anyTypeKind0 = AnyTypeKind.USER;
      SearchSupport searchSupport0 = new SearchSupport(anyTypeKind0);
      SearchSupport.SearchView searchSupport_SearchView0 = searchSupport0.membership();
      assertNotNull(searchSupport_SearchView0);
  }

  @Test
  public void test12() {
      AnyTypeKind anyTypeKind0 = AnyTypeKind.GROUP;
      SearchViewSupport searchViewSupport0 = new SearchViewSupport(anyTypeKind0);
      SearchSupport.SearchView searchSupport_SearchView0 = searchViewSupport0.relationship();
      assertNotNull(searchSupport_SearchView0);
  }

  @Test
  public void test13() {
      AnyTypeKind anyTypeKind0 = AnyTypeKind.USER;
      SearchSupport searchSupport0 = new SearchSupport(anyTypeKind0);
      SearchSupport.SearchView searchSupport_SearchView0 = searchSupport0.relationship();
      assertNotNull(searchSupport_SearchView0);
  }

  @Test
  public void test14() {
      AnyTypeKind anyTypeKind0 = AnyTypeKind.USER;
      SearchSupport searchSupport0 = new SearchSupport(anyTypeKind0);
      SearchSupport.SearchView searchSupport_SearchView0 = searchSupport0.table();
      assertNotNull(searchSupport_SearchView0);
  }

  @Test
  public void test15() {
      AnyTypeKind anyTypeKind0 = AnyTypeKind.GROUP;
      SearchSupport searchSupport0 = new SearchSupport(anyTypeKind0);
      SearchSupport.SearchView searchSupport_SearchView0 = searchSupport0.table();
      assertNotNull(searchSupport_SearchView0);
  }

  @Test
  public void test16() {
      AnyTypeKind anyTypeKind0 = AnyTypeKind.ANY_OBJECT;
      SearchViewSupport searchViewSupport0 = new SearchViewSupport(anyTypeKind0);
      SearchSupport.SearchView searchSupport_SearchView0 = searchViewSupport0.table();
      assertNotNull(searchSupport_SearchView0);
  }

  @Test
  public void test17() {
      AnyTypeKind anyTypeKind0 = AnyTypeKind.ANY_OBJECT;
      SearchViewSupport searchViewSupport0 = new SearchViewSupport(anyTypeKind0);
      SearchSupport.SearchView searchSupport_SearchView0 = searchViewSupport0.role();
      assertNotNull(searchSupport_SearchView0);
  }

  @Test
  public void test18() {
      AnyTypeKind anyTypeKind0 = AnyTypeKind.USER;
      SearchSupport searchSupport0 = new SearchSupport(anyTypeKind0);
      SearchSupport.SearchView searchSupport_SearchView0 = searchSupport0.groupResource();
      assertNotNull(searchSupport_SearchView0);
  }

  @Test
  public void test19() {
      AnyTypeKind anyTypeKind0 = AnyTypeKind.USER;
      SearchSupport searchSupport0 = new SearchSupport(anyTypeKind0);
      SearchSupport.SearchView searchSupport_SearchView0 = searchSupport0.entitlements();
      assertNotNull(searchSupport_SearchView0);
  }

  @Test
  public void test20() {
      AnyTypeKind anyTypeKind0 = AnyTypeKind.GROUP;
      SearchSupport searchSupport0 = new SearchSupport(anyTypeKind0);
      SearchSupport.SearchView searchSupport_SearchView0 = searchSupport0.resource();
      assertNotNull(searchSupport_SearchView0);
  }

  @Test
  public void test21() {
      AnyTypeKind anyTypeKind0 = AnyTypeKind.GROUP;
      SearchSupport searchSupport0 = new SearchSupport(anyTypeKind0);
      SearchSupport.SearchView searchSupport_SearchView0 = searchSupport0.auxClass();
      assertNotNull(searchSupport_SearchView0);
  }
}
