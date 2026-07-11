package org.apache.syncope.core.persistence.jpa.dao;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import jakarta.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.apache.syncope.common.lib.types.AnyTypeKind;
import org.apache.syncope.core.persistence.api.attrvalue.PlainAttrValidationManager;
import org.apache.syncope.core.persistence.api.dao.AnyObjectDAO;
import org.apache.syncope.core.persistence.api.dao.GroupDAO;
import org.apache.syncope.core.persistence.api.dao.PlainSchemaDAO;
import org.apache.syncope.core.persistence.api.dao.RealmSearchDAO;
import org.apache.syncope.core.persistence.api.dao.UserDAO;
import org.apache.syncope.core.persistence.api.dao.search.AnyCond;
import org.apache.syncope.core.persistence.api.dao.search.AnyTypeCond;
import org.apache.syncope.core.persistence.api.dao.search.AttrCond;
import org.apache.syncope.core.persistence.api.dao.search.RoleCond;
import org.apache.syncope.core.persistence.api.dao.search.ResourceCond;
import org.apache.syncope.core.persistence.api.dao.search.SearchCond;
import org.apache.syncope.core.persistence.api.entity.AnyUtilsFactory;
import org.apache.syncope.core.persistence.api.entity.EntityFactory;
import org.apache.syncope.core.persistence.api.entity.PlainSchema;
import org.apache.syncope.core.persistence.common.dao.AbstractSearchDAO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.Mockito;

class AbstractJPAAnySearchDAOFewShotTest {

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

    private TestDAO dao;
    private SearchSupport searchSupport;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);

        dao = new TestDAO(
                realmSearchDAO,
                userDAO,
                groupDAO,
                anyObjectDAO,
                plainSchemaDAO,
                entityFactory,
                anyUtilsFactory,
                validator,
                entityManager);

        searchSupport = new SearchViewSupport(AnyTypeKind.USER);
    }

    // --- Tests from Prompt 2.3 ---

    @Test
    public void testTC5_OR_User() {
        AnyCond left = new AnyCond(AttrCond.Type.ISNULL);
        left.setSchema("username");
        AnyCond right = new AnyCond(AttrCond.Type.ISNULL);
        right.setSchema("status");
        SearchCond cond = SearchCond.or(SearchCond.of(left), SearchCond.of(right));

        AbstractSearchDAO.CheckResult<AnyCond> leftCheck =
                new AbstractSearchDAO.CheckResult<>(mock(PlainSchema.class), mock(org.apache.syncope.core.persistence.api.entity.PlainAttrValue.class), left);
        dao.setAnyCheckResult(leftCheck);

        org.apache.syncope.core.persistence.api.entity.AnyUtils anyUtils = mock(org.apache.syncope.core.persistence.api.entity.AnyUtils.class);
        when(anyUtilsFactory.getInstance(Mockito.any(AnyTypeKind.class))).thenReturn(anyUtils);
        try {
            java.lang.reflect.Field dummyField = String.class.getDeclaredField("value");
            when(anyUtils.getField("username")).thenReturn(Optional.ofNullable(dummyField));
            when(anyUtils.getField("status")).thenReturn(Optional.ofNullable(dummyField));
        } catch (Exception e) {}

        // Setup mock dao (non serve setup ulteriore per nodi vuoti nel TestDAO)

        Optional<AbstractJPAAnySearchDAO.QueryInfo> result =
                dao.exposedGetQuery(cond, new ArrayList<>(), new SearchViewSupport(AnyTypeKind.USER));

        assertTrue(result.isPresent());
    }

    @Test
    public void testTC6_NOT_User() {
        AnyCond anyCond = new AnyCond();
        anyCond.setSchema("username");
        anyCond.setType(AttrCond.Type.EQ);
        anyCond.setExpression("testuser");

        SearchCond cond = SearchCond.negate(SearchCond.of(anyCond));

        // Setup mock dao
        org.apache.syncope.core.persistence.api.entity.PlainAttrValue attrValue = mock(org.apache.syncope.core.persistence.api.entity.PlainAttrValue.class);
        when(attrValue.getValue()).thenReturn("testuser");
        AbstractSearchDAO.CheckResult<AnyCond> checkResult =
                new AbstractSearchDAO.CheckResult<>(mock(PlainSchema.class), attrValue, anyCond);
        dao.setAnyCheckResult(checkResult);

        org.apache.syncope.core.persistence.api.entity.AnyUtils anyUtils = mock(org.apache.syncope.core.persistence.api.entity.AnyUtils.class);
        when(anyUtilsFactory.getInstance(Mockito.any(AnyTypeKind.class))).thenReturn(anyUtils);
        try {
            java.lang.reflect.Field dummyField = String.class.getDeclaredField("value");
            when(anyUtils.getField("username")).thenReturn(Optional.ofNullable(dummyField));
        } catch (Exception e) {}

        Optional<AbstractJPAAnySearchDAO.QueryInfo> result =
                dao.exposedGetQuery(cond, new ArrayList<>(), new SearchViewSupport(AnyTypeKind.USER));

        assertTrue(result.isPresent());
    }

    @Test
    public void testTC6_NOT_AnyCond_EQ_User() {
        AnyCond anyCond = new AnyCond();
        anyCond.setSchema("username");
        anyCond.setType(AttrCond.Type.EQ);
        anyCond.setExpression("testuser");

        SearchCond cond = SearchCond.negate(SearchCond.of(anyCond));

        // Setup mock dao
        org.apache.syncope.core.persistence.api.entity.PlainAttrValue attrValue = mock(org.apache.syncope.core.persistence.api.entity.PlainAttrValue.class);
        when(attrValue.getValue()).thenReturn("testuser");
        AbstractSearchDAO.CheckResult<AnyCond> checkResult =
                new AbstractSearchDAO.CheckResult<>(mock(PlainSchema.class), attrValue, anyCond);
        dao.setAnyCheckResult(checkResult);

        org.apache.syncope.core.persistence.api.entity.AnyUtils anyUtils = mock(org.apache.syncope.core.persistence.api.entity.AnyUtils.class);
        when(anyUtilsFactory.getInstance(Mockito.any(AnyTypeKind.class))).thenReturn(anyUtils);
        try {
            java.lang.reflect.Field dummyField = String.class.getDeclaredField("value");
            when(anyUtils.getField("username")).thenReturn(Optional.ofNullable(dummyField));
        } catch (Exception e) {}

        Optional<AbstractJPAAnySearchDAO.QueryInfo> result =
                dao.exposedGetQuery(cond, new ArrayList<>(), new SearchViewSupport(AnyTypeKind.USER));

        assertTrue(result.isPresent());

        AnySearchNode.Leaf leaf =
                (AnySearchNode.Leaf) result.get().node();

        assertTrue(leaf.getClause().contains("<>"));
    }

    // --- Tests from Prompt 2.4 ---

    @Test
    public void testRoleCond() {
        RoleCond roleCond = new RoleCond();
        roleCond.setRole("admin");

        SearchCond cond = SearchCond.of(roleCond);

        List<Object> parameters = new ArrayList<>();

        Optional<AbstractJPAAnySearchDAO.QueryInfo> result =
                dao.exposedGetQuery(
                        cond,
                        parameters,
                        new SearchViewSupport(AnyTypeKind.USER));

        assertTrue(result.isPresent());

        AnySearchNode.Leaf leaf =
                (AnySearchNode.Leaf) result.get().node();

        assertTrue(leaf.getClause().contains("role_id=?1"));
        assertEquals(1, parameters.size());
        assertEquals("admin", parameters.get(0));
    }

    @Test
    public void testResourceCond() {
        ResourceCond resourceCond = new ResourceCond();
        resourceCond.setResource("RESOURCE1");

        SearchCond cond = SearchCond.of(resourceCond);

        List<Object> parameters = new ArrayList<>();

        Optional<AbstractJPAAnySearchDAO.QueryInfo> result =
                dao.exposedGetQuery(
                        cond,
                        parameters,
                        new SearchViewSupport(AnyTypeKind.USER));

        assertTrue(result.isPresent());

        AnySearchNode.Leaf leaf =
                (AnySearchNode.Leaf) result.get().node();

        assertTrue(leaf.getClause().contains("resource_id=?1"));
        assertEquals(2, parameters.size()); // USER => query + UNION group resource
        assertEquals("RESOURCE1", parameters.get(0));
    }

    @Test
    public void testAnyTypeCond() {
        AnyTypeCond anyTypeCond = new AnyTypeCond();
        anyTypeCond.setAnyTypeKey("PRINTER");

        SearchCond cond = SearchCond.of(anyTypeCond);

        List<Object> parameters = new ArrayList<>();

        Optional<AbstractJPAAnySearchDAO.QueryInfo> result =
                dao.exposedGetQuery(
                        cond,
                        parameters,
                        new SearchViewSupport(AnyTypeKind.ANY_OBJECT));

        assertTrue(result.isPresent());

        AnySearchNode.Leaf leaf =
                (AnySearchNode.Leaf) result.get().node();

        assertEquals("type_id=?1", leaf.getClause());
        assertEquals(1, parameters.size());
        assertEquals("PRINTER", parameters.get(0));
    }

    // Helper class per by-passare i metodi protected
    private static class TestDAO extends AbstractJPAAnySearchDAO {

        private AbstractSearchDAO.CheckResult<AttrCond> attrCheckResult;
        private AbstractSearchDAO.CheckResult<AnyCond> anyCheckResult;

        TestDAO(
                RealmSearchDAO realmSearchDAO,
                UserDAO userDAO,
                GroupDAO groupDAO,
                AnyObjectDAO anyObjectDAO,
                PlainSchemaDAO plainSchemaDAO,
                EntityFactory entityFactory,
                AnyUtilsFactory anyUtilsFactory,
                PlainAttrValidationManager validator,
                EntityManager entityManager) {
            super(
                realmSearchDAO,
                userDAO,
                groupDAO,
                anyObjectDAO,
                plainSchemaDAO,
                entityFactory,
                anyUtilsFactory,
                validator,
                entityManager);
        }

        void setAttrCheckResult(final AbstractSearchDAO.CheckResult<AttrCond> attrCheckResult) {
            this.attrCheckResult = attrCheckResult;
        }

        void setAnyCheckResult(final AbstractSearchDAO.CheckResult<AnyCond> anyCheckResult) {
            this.anyCheckResult = anyCheckResult;
        }

        Optional<QueryInfo> exposedGetQuery(
                final SearchCond cond,
                final List<Object> parameters,
                final SearchSupport svs) {
            return super.getQuery(cond, parameters, svs);
        }

        @Override
        protected AbstractSearchDAO.CheckResult<AttrCond> check(final AttrCond cond) {
            return attrCheckResult;
        }

        @Override
        protected AbstractSearchDAO.CheckResult<AnyCond> check(
                final AnyCond cond, final java.lang.reflect.Field field, final java.util.Set<String> relationshipsFields) {
            return anyCheckResult;
        }

        @Override
        protected AttrCondQuery getQuery(
                final AttrCond cond,
                final boolean not,
                final AbstractSearchDAO.CheckResult<AttrCond> checked,
                final List<Object> parameters,
                final SearchSupport svs) {

            AnySearchNode.Leaf leaf =
                    new AnySearchNode.Leaf(
                            svs.field(),
                            "stringvalue=?1");
            return new AttrCondQuery(true, leaf);
        }

        @Override
        protected void parseOrderByForPlainSchema(
                final SearchSupport svs,
                final OrderBySupport obs,
                final OrderBySupport.Item item,
                final org.springframework.data.domain.Sort.Order clause,
                final PlainSchema schema,
                final String fieldName) {
        }
    }
}
