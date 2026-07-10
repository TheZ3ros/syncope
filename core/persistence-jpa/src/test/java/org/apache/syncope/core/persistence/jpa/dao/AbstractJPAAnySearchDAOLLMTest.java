package org.apache.syncope.core.persistence.jpa.dao;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import jakarta.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.apache.syncope.common.lib.types.AnyTypeKind;
import org.apache.syncope.common.lib.types.AttrSchemaType;
import org.apache.syncope.core.persistence.api.attrvalue.PlainAttrValidationManager;
import org.apache.syncope.core.persistence.api.dao.AnyObjectDAO;
import org.apache.syncope.core.persistence.api.dao.GroupDAO;
import org.apache.syncope.core.persistence.api.dao.PlainSchemaDAO;
import org.apache.syncope.core.persistence.api.dao.RealmSearchDAO;
import org.apache.syncope.core.persistence.api.dao.UserDAO;
import org.apache.syncope.core.persistence.api.dao.search.AnyCond;
import org.apache.syncope.core.persistence.api.dao.search.AnyTypeCond;
import org.apache.syncope.core.persistence.api.dao.search.AttrCond;
import org.apache.syncope.core.persistence.api.dao.search.SearchCond;
import org.apache.syncope.core.persistence.api.entity.AnyUtilsFactory;
import org.apache.syncope.core.persistence.api.entity.EntityFactory;
import org.apache.syncope.core.persistence.api.entity.PlainAttrValue;
import org.apache.syncope.core.persistence.api.entity.PlainSchema;
import org.apache.syncope.core.persistence.common.dao.AbstractSearchDAO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.Mockito;

class AbstractJPAAnySearchDAOLLMTest {

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

    private TestDAO testDao;
    private SearchSupport searchSupport;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);

        testDao = new TestDAO(
                realmSearchDAO,
                userDAO,
                groupDAO,
                anyObjectDAO,
                plainSchemaDAO,
                entityFactory,
                anyUtilsFactory,
                validator,
                entityManager);

        searchSupport = new SearchViewSupport(AnyTypeKind.ANY_OBJECT);
    }

    // --- Tests from Prompt 1.3 ---

    @Test
    void getQueryWithAnyCondEQShouldCreateLeafAndParameter() {
        SearchSupport svs = new SearchViewSupport(AnyTypeKind.USER);
        List<Object> parameters = new ArrayList<>();

        AnyCond anyCond = new AnyCond(AttrCond.Type.EQ);
        anyCond.setSchema("username");
        anyCond.setExpression("alice");

        SearchCond searchCond = SearchCond.of(anyCond);

        PlainSchema schema = mock(PlainSchema.class);
        when(schema.getType()).thenReturn(AttrSchemaType.String);

        PlainAttrValue value = mock(PlainAttrValue.class);
        when(value.getValue()).thenReturn("alice");

        AnyCond checkedCond = new AnyCond(AttrCond.Type.EQ);
        checkedCond.setSchema("username");
        checkedCond.setExpression("alice");

        AbstractSearchDAO.CheckResult<AnyCond> checkResult =
                new AbstractSearchDAO.CheckResult<>(schema, value, checkedCond);

        org.apache.syncope.core.persistence.api.entity.AnyUtils anyUtils = mock(org.apache.syncope.core.persistence.api.entity.AnyUtils.class);
        when(anyUtilsFactory.getInstance(Mockito.any(AnyTypeKind.class))).thenReturn(anyUtils);
        java.lang.reflect.Field dummyField = null;
        try {
            dummyField = String.class.getDeclaredField("value");
        } catch (Exception e) {}
        when(anyUtils.getField("username")).thenReturn(Optional.ofNullable(dummyField));

        testDao.setAnyCheckResult(checkResult);

        Optional<AbstractJPAAnySearchDAO.QueryInfo> result =
                testDao.exposedGetQuery(searchCond, parameters, svs);

        assertTrue(result.isPresent());
        assertTrue(result.get().node() instanceof AnySearchNode.Leaf);
        assertEquals(
                "username=?1",
                ((AnySearchNode.Leaf) result.get().node()).getClause());
        assertEquals(List.of("alice"), parameters);
    }

    @Test
    void getQueryWithAnyCondIsNullShouldCreateIsNullClause() {
        SearchSupport svs = new SearchViewSupport(AnyTypeKind.USER);
        List<Object> parameters = new ArrayList<>();

        AnyCond anyCond = new AnyCond(AttrCond.Type.ISNULL);
        anyCond.setSchema("username");

        SearchCond searchCond = SearchCond.of(anyCond);

        PlainSchema schema = mock(PlainSchema.class);
        PlainAttrValue value = mock(PlainAttrValue.class);

        AbstractSearchDAO.CheckResult<AnyCond> checkResult =
                new AbstractSearchDAO.CheckResult<>(schema, value, anyCond);

        org.apache.syncope.core.persistence.api.entity.AnyUtils anyUtils = mock(org.apache.syncope.core.persistence.api.entity.AnyUtils.class);
        when(anyUtilsFactory.getInstance(Mockito.any(AnyTypeKind.class))).thenReturn(anyUtils);
        java.lang.reflect.Field dummyField = null;
        try {
            dummyField = String.class.getDeclaredField("value");
        } catch (Exception e) {}
        when(anyUtils.getField("username")).thenReturn(Optional.ofNullable(dummyField));

        testDao.setAnyCheckResult(checkResult);

        Optional<AbstractJPAAnySearchDAO.QueryInfo> result =
                testDao.exposedGetQuery(searchCond, parameters, svs);

        assertTrue(result.isPresent());
        assertEquals(
                "username IS NULL",
                ((AnySearchNode.Leaf) result.get().node()).getClause());
        assertTrue(parameters.isEmpty());
    }

    @Test
    void getQueryWithNegatedAnyCondIsNullShouldCreateIsNotNullClause() {
        SearchSupport svs = new SearchViewSupport(AnyTypeKind.USER);
        List<Object> parameters = new ArrayList<>();

        AnyCond anyCond = new AnyCond(AttrCond.Type.ISNULL);
        anyCond.setSchema("username");

        SearchCond searchCond = SearchCond.negate(anyCond);

        PlainSchema schema = mock(PlainSchema.class);
        PlainAttrValue value = mock(PlainAttrValue.class);

        AbstractSearchDAO.CheckResult<AnyCond> checkResult =
                new AbstractSearchDAO.CheckResult<>(schema, value, anyCond);

        org.apache.syncope.core.persistence.api.entity.AnyUtils anyUtils = mock(org.apache.syncope.core.persistence.api.entity.AnyUtils.class);
        when(anyUtilsFactory.getInstance(Mockito.any(AnyTypeKind.class))).thenReturn(anyUtils);
        java.lang.reflect.Field dummyField = null;
        try {
            dummyField = String.class.getDeclaredField("value");
        } catch (Exception e) {}
        when(anyUtils.getField("username")).thenReturn(Optional.ofNullable(dummyField));

        testDao.setAnyCheckResult(checkResult);

        Optional<AbstractJPAAnySearchDAO.QueryInfo> result =
                testDao.exposedGetQuery(searchCond, parameters, svs);

        assertTrue(result.isPresent());
        assertEquals(
                "username IS NOT NULL",
                ((AnySearchNode.Leaf) result.get().node()).getClause());
        assertTrue(parameters.isEmpty());
    }

    // --- Tests from Prompt 1.4 (Uses TestDAO) ---

    @Test
    void shouldBuildLeafNodeForAnyTypeCond() {
        AnyTypeCond anyTypeCond = new AnyTypeCond();
        anyTypeCond.setAnyTypeKey("PRINTER");

        SearchCond condition = SearchCond.of(anyTypeCond);
        List<Object> parameters = new ArrayList<>();

        Optional<AbstractJPAAnySearchDAO.QueryInfo> result =
                testDao.exposedGetQuery(condition, parameters, searchSupport);

        assertTrue(result.isPresent());
        assertNotNull(result.get().node());
        assertEquals(1, parameters.size());
        assertEquals("PRINTER", parameters.getFirst());
        assertTrue(result.get().plainSchemas().isEmpty());
    }

    @Test
    void shouldBuildNegatedNodeForNotLeafCondition() {
        AnyTypeCond anyTypeCond = new AnyTypeCond();
        anyTypeCond.setAnyTypeKey("DEVICE");

        SearchCond condition = SearchCond.negate(anyTypeCond);
        List<Object> parameters = new ArrayList<>();

        Optional<AbstractJPAAnySearchDAO.QueryInfo> result =
                testDao.exposedGetQuery(condition, parameters, searchSupport);

        assertTrue(result.isPresent());
        AnySearchNode.Leaf leaf = (AnySearchNode.Leaf) result.get().node();
        assertNotNull(leaf);
        assertTrue(leaf.getClause().contains("<>"));
        assertEquals(1, parameters.size());
        assertEquals("DEVICE", parameters.get(0));
    }

    @Test
    void shouldBuildAndNodeWithTwoChildren() {
        AnyTypeCond left = new AnyTypeCond();
        left.setAnyTypeKey("TYPE_A");

        AnyTypeCond right = new AnyTypeCond();
        right.setAnyTypeKey("TYPE_B");

        SearchCond andCond = SearchCond.and(
                SearchCond.of(left),
                SearchCond.of(right));

        List<Object> parameters = new ArrayList<>();

        Optional<AbstractJPAAnySearchDAO.QueryInfo> result =
                testDao.exposedGetQuery(andCond, parameters, searchSupport);

        assertTrue(result.isPresent());
        AnySearchNode root = result.get().node();
        assertEquals(AnySearchNode.Type.AND, root.getType());
        assertEquals(2, root.getChildren().size());
        assertEquals(2, parameters.size());
        assertEquals("TYPE_A", parameters.get(0));
        assertEquals("TYPE_B", parameters.get(1));
    }

    @Test
    void shouldBuildOrNodeWithTwoChildren() {
        AnyTypeCond left = new AnyTypeCond();
        left.setAnyTypeKey("LEFT");

        AnyTypeCond right = new AnyTypeCond();
        right.setAnyTypeKey("RIGHT");

        SearchCond orCond = SearchCond.or(
                SearchCond.of(left),
                SearchCond.of(right));

        List<Object> parameters = new ArrayList<>();

        Optional<AbstractJPAAnySearchDAO.QueryInfo> result =
                testDao.exposedGetQuery(orCond, parameters, searchSupport);

        assertTrue(result.isPresent());
        AnySearchNode root = result.get().node();
        assertEquals(AnySearchNode.Type.OR, root.getType());
        assertEquals(2, root.getChildren().size());
        assertEquals(2, parameters.size());
        assertTrue(parameters.contains("LEFT"));
        assertTrue(parameters.contains("RIGHT"));
    }

    @Test
    void shouldCollectPlainSchemaForAttrCond() {
        AttrCond attrCond = new AttrCond();
        attrCond.setSchema("firstname");
        attrCond.setExpression("john");
        attrCond.setType(AttrCond.Type.EQ);

        PlainSchema schema = mock(PlainSchema.class);
        when(schema.getKey()).thenReturn("firstname");
        when(schema.getType()).thenReturn(AttrSchemaType.String);

        PlainAttrValue attrValue = mock(PlainAttrValue.class);
        when(attrValue.getValue()).thenReturn("john");

        AbstractSearchDAO.CheckResult<AttrCond> checkResult =
                new AbstractSearchDAO.CheckResult<>(schema, attrValue, attrCond);

        testDao.setAttrCheckResult(checkResult);

        SearchCond condition = SearchCond.of(attrCond);
        List<Object> parameters = new ArrayList<>();

        Optional<AbstractJPAAnySearchDAO.QueryInfo> result =
                testDao.exposedGetQuery(condition, parameters, searchSupport);

        assertTrue(result.isPresent());
        assertTrue(
                result.get().plainSchemas().contains("firstname"),
                "Lo schema firstname deve essere presente nei plainSchemas");
    }

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
            // non utilizzato in questa suite
        }
    }
}
