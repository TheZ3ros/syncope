package org.apache.syncope.core.persistence.jpa.dao;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import jakarta.persistence.EntityManager;
import org.apache.syncope.common.lib.types.AnyTypeKind;
import org.apache.syncope.core.persistence.api.dao.AnyObjectDAO;
import org.apache.syncope.core.persistence.api.dao.GroupDAO;
import org.apache.syncope.core.persistence.api.dao.PlainSchemaDAO;
import org.apache.syncope.core.persistence.api.dao.RealmSearchDAO;
import org.apache.syncope.core.persistence.api.dao.UserDAO;
import org.apache.syncope.core.persistence.api.entity.AnyUtilsFactory;
import org.apache.syncope.core.persistence.api.entity.EntityFactory;
import org.apache.syncope.core.persistence.api.entity.PlainSchema;
import org.apache.syncope.core.persistence.api.dao.search.AnyCond;
import org.apache.syncope.core.persistence.api.dao.search.AnyTypeCond;
import org.apache.syncope.core.persistence.api.dao.search.AttrCond;
import org.apache.syncope.core.persistence.api.dao.search.SearchCond;
import org.apache.syncope.core.persistence.jpa.dao.AnySearchNode;
import org.apache.syncope.core.persistence.api.attrvalue.PlainAttrValidationManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.data.domain.Sort;

@ExtendWith(MockitoExtension.class)
class AbstractJPAAnySearchDAOCoTTest {

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

    private DummyDAO dao;

    @BeforeEach
    void setUp() {
        dao = new DummyDAO(
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

    @Test
    void getQueryShouldUseNegationForNotLeafAnyTypeCond() {
        AnyTypeCond anyTypeCond = new AnyTypeCond();
        anyTypeCond.setAnyTypeKey("PRINTER");

        SearchCond searchCond = SearchCond.negate(anyTypeCond);

        List<Object> parameters = new ArrayList<>();

        SearchSupport svs = new SearchSupport(AnyTypeKind.ANY_OBJECT);

        Optional<AbstractJPAAnySearchDAO.QueryInfo> result =
                dao.exposedGetQuery(searchCond, parameters, svs);

        assertTrue(result.isPresent());

        AnySearchNode node = result.get().node();

        assertTrue(node instanceof AnySearchNode.Leaf);

        String clause = ((AnySearchNode.Leaf) node).getClause();

        assertEquals("type_id<>?1", clause);
        assertEquals(1, parameters.size());
        assertEquals("PRINTER", parameters.get(0));
    }

    private static class DummyDAO extends AbstractJPAAnySearchDAO {

        DummyDAO(
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

        Optional<QueryInfo> exposedGetQuery(
                SearchCond cond,
                List<Object> parameters,
                SearchSupport svs) {

            return super.getQuery(cond, parameters, svs);
        }

        @Override
        protected AttrCondQuery getQuery(
                AttrCond cond,
                boolean not,
                CheckResult<AttrCond> checked,
                List<Object> parameters,
                SearchSupport svs) {

            throw new UnsupportedOperationException("Not needed for this test");
        }

        @Override
        protected void parseOrderByForPlainSchema(
                SearchSupport svs,
                OrderBySupport obs,
                OrderBySupport.Item item,
                Sort.Order clause,
                PlainSchema schema,
                String fieldName) {

            // not needed for this test
        }
    }
}
