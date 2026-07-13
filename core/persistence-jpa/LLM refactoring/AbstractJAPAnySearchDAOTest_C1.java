public class AbstractJPAAnySearchDAOTest_C1 {

    @InjectMocks
    private TestJPAAnySearchDAO dao;

    @Mock
    private RealmSearchDAO realmSearchDAO;

    @Mock
    private UserDAO userDAO;

    @Mock
    private GroupDAO groupDAO;

    @Mock
    private AnyObjectDAO anyObjectDAO;

    @Mock
    private PlainSchemaDAO plainSchemaDAO;

    @Mock
    private EntityFactory entityFactory;

    @Mock
    private AnyUtilsFactory anyUtilsFactory;

    @Mock
    private PlainAttrValidationManager validator;

    @Mock
    private EntityManager entityManager;

    @BeforeEach
    void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testAnyCond() {
        AnyCond anyCond = new AnyCond();
        anyCond.setSchema("username");
        anyCond.setType(AttrCond.Type.EQ);
        anyCond.setExpression("rossi");

        SearchCond cond = SearchCond.getLeaf(anyCond);

        List<Object> parameters = new ArrayList<>();

        Optional<AbstractJPAAnySearchDAO.QueryInfo> result =
                dao.getQuery(cond, parameters, new SearchViewSupport(AnyTypeKind.USER));

        assertTrue(result.isPresent());
        assertNotNull(result.get().node());
    }

    @Test
    void testRoleCond() {
        RoleCond roleCond = new RoleCond();
        roleCond.setRole("ROLE_ADMIN");

        SearchCond cond = SearchCond.getLeaf(roleCond);

        List<Object> parameters = new ArrayList<>();

        Optional<AbstractJPAAnySearchDAO.QueryInfo> result =
                dao.getQuery(cond, parameters, new SearchViewSupport(AnyTypeKind.USER));

        assertTrue(result.isPresent());
        assertNotNull(result.get().node());

        AnySearchNode.Leaf leaf = (AnySearchNode.Leaf) result.get().node();
        assertTrue(leaf.getClause().contains("role_id"));
        assertEquals("ROLE_ADMIN", parameters.get(0));
    }

    @Test
    void testResourceCond() {
        ResourceCond resourceCond = new ResourceCond();
        resourceCond.setResource("RESOURCE_TEST");

        SearchCond cond = SearchCond.getLeaf(resourceCond);

        List<Object> parameters = new ArrayList<>();

        Optional<AbstractJPAAnySearchDAO.QueryInfo> result =
                dao.getQuery(cond, parameters, new SearchViewSupport(AnyTypeKind.USER));

        assertTrue(result.isPresent());
        assertNotNull(result.get().node());

        AnySearchNode.Leaf leaf = (AnySearchNode.Leaf) result.get().node();
        assertTrue(leaf.getClause().contains("resource_id"));
        assertFalse(parameters.isEmpty());
        assertEquals("RESOURCE_TEST", parameters.get(0));
    }
}