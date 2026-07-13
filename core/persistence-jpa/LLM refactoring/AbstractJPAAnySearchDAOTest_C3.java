@Test
public void testAnyCond() {
    AnyCond anyCond = new AnyCond();
    anyCond.setSchema("username");
    anyCond.setType(AttrCond.Type.EQ);
    anyCond.setExpression("admin");

    SearchCond cond = SearchCond.getLeaf(anyCond);

    Optional<AbstractJPAAnySearchDAO.QueryInfo> result =
            dao.getQuery(
                    cond,
                    new ArrayList<>(),
                    new SearchViewSupport(AnyTypeKind.USER));

    assertTrue(result.isPresent());
    assertNotNull(result.get().node());
}

@Test
public void testRoleCond() {
    RoleCond roleCond = new RoleCond();
    roleCond.setRole("roleKey");

    SearchCond cond = SearchCond.getLeaf(roleCond);

    Optional<AbstractJPAAnySearchDAO.QueryInfo> result =
            dao.getQuery(
                    cond,
                    new ArrayList<>(),
                    new SearchViewSupport(AnyTypeKind.USER));

    assertTrue(result.isPresent());
    assertNotNull(result.get().node());
}

@Test
public void testResourceCond() {
    ResourceCond resourceCond = new ResourceCond();
    resourceCond.setResource("resourceKey");

    SearchCond cond = SearchCond.getLeaf(resourceCond);

    Optional<AbstractJPAAnySearchDAO.QueryInfo> result =
            dao.getQuery(
                    cond,
                    new ArrayList<>(),
                    new SearchViewSupport(AnyTypeKind.USER));

    assertTrue(result.isPresent());
    assertNotNull(result.get().node());
}