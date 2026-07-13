@Test
public void testRoleCond() {
    RoleCond roleCond = new RoleCond();
    roleCond.setRole("testRole");

    SearchCond cond = SearchCond.getLeaf(roleCond);

    Optional<AbstractJPAAnySearchDAO.QueryInfo> result =
            dao.getQuery(cond, new ArrayList<>(), new SearchViewSupport(AnyTypeKind.USER));

    assertTrue(result.isPresent());
    assertNotNull(result.get().node());
    assertTrue(result.get().plainSchemas().isEmpty());

    AnySearchNode.Leaf leaf = (AnySearchNode.Leaf) result.get().node();
    assertTrue(leaf.getClause().contains("role_id=?"));
}

@Test
public void testResourceCond() {
    ResourceCond resourceCond = new ResourceCond();
    resourceCond.setResource("RESOURCE_KEY");

    SearchCond cond = SearchCond.getLeaf(resourceCond);

    Optional<AbstractJPAAnySearchDAO.QueryInfo> result =
            dao.getQuery(cond, new ArrayList<>(), new SearchViewSupport(AnyTypeKind.USER));

    assertTrue(result.isPresent());
    assertNotNull(result.get().node());
    assertTrue(result.get().plainSchemas().isEmpty());

    AnySearchNode.Leaf leaf = (AnySearchNode.Leaf) result.get().node();
    assertTrue(leaf.getClause().contains("resource_id=?"));
}

@Test
public void testAnyCond() {
    AnyCond anyCond = new AnyCond();
    anyCond.setSchema("username");
    anyCond.setType(AttrCond.Type.EQ);
    anyCond.setExpression("admin");

    AnyUtils anyUtils = mock(AnyUtils.class);

    when(anyUtilsFactory.getInstance(AnyTypeKind.USER)).thenReturn(anyUtils);
    when(anyUtils.getField("username")).thenReturn(Optional.of("username"));

    SearchCond cond = SearchCond.getLeaf(anyCond);

    Optional<AbstractJPAAnySearchDAO.QueryInfo> result =
            dao.getQuery(cond, new ArrayList<>(), new SearchViewSupport(AnyTypeKind.USER));

    assertTrue(result.isPresent());
    assertNotNull(result.get().node());
    assertTrue(result.get().plainSchemas().isEmpty());

    AnySearchNode.Leaf leaf = (AnySearchNode.Leaf) result.get().node();
    assertTrue(leaf.getClause().contains("username"));
}