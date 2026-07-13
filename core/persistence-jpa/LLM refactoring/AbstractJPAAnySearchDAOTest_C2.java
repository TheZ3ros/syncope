public class AbstractJPAAnySearchDAOTest_C2 {

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
        roleCond.setRole("role-test");

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
        resourceCond.setResource("RESOURCE-1");

        SearchCond cond = SearchCond.getLeaf(resourceCond);

        Optional<AbstractJPAAnySearchDAO.QueryInfo> result =
                dao.getQuery(
                        cond,
                        new ArrayList<>(),
                        new SearchViewSupport(AnyTypeKind.USER));

        assertTrue(result.isPresent());
        assertNotNull(result.get().node());
    }
}