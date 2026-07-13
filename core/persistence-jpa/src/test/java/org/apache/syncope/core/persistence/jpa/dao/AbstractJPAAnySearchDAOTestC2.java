package org.apache.syncope.core.persistence.jpa.dao;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import jakarta.persistence.EntityManager;
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
import org.apache.syncope.core.persistence.api.dao.search.SearchCond;
import org.apache.syncope.core.persistence.api.dao.search.ResourceCond;
import org.apache.syncope.core.persistence.api.entity.AnyUtils;
import org.apache.syncope.core.persistence.api.entity.AnyUtilsFactory;
import org.apache.syncope.core.persistence.api.entity.EntityFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.data.domain.Sort;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

@ExtendWith(MockitoExtension.class)
public class AbstractJPAAnySearchDAOTestC2 {

    @Mock private RealmSearchDAO realmSearchDAO;
    @Mock private UserDAO userDAO;
    @Mock private GroupDAO groupDAO;
    @Mock private AnyObjectDAO anyObjectDAO;
    @Mock private PlainSchemaDAO plainSchemaDAO;
    @Mock private EntityFactory entityFactory;
    @Mock private AnyUtilsFactory anyUtilsFactory;
    @Mock private PlainAttrValidationManager validator;
    @Mock private EntityManager entityManager;

    private AbstractJPAAnySearchDAO dao;

    @BeforeEach
    public void setUp() {
        try {
            AnyUtils anyUtils = mock(AnyUtils.class);
            lenient().when(anyUtilsFactory.getInstance(AnyTypeKind.USER)).thenReturn(anyUtils);
            java.lang.reflect.Field field = org.apache.syncope.core.persistence.jpa.entity.user.JPAUser.class.getDeclaredField("username");
            lenient().when(anyUtils.getField("username")).thenReturn(Optional.of(field));
                                org.apache.syncope.core.persistence.api.entity.PlainSchema schema = mock(org.apache.syncope.core.persistence.api.entity.PlainSchema.class);
            lenient().when(plainSchemaDAO.findById(anyString())).thenReturn((java.util.Optional) java.util.Optional.of(schema));
            lenient().when(schema.getKey()).thenReturn("username");
            lenient().when(entityFactory.newEntity(org.apache.syncope.core.persistence.api.entity.PlainSchema.class)).thenReturn(schema);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        dao = new AbstractJPAAnySearchDAO(
                realmSearchDAO, userDAO, groupDAO, anyObjectDAO,
                plainSchemaDAO, entityFactory, anyUtilsFactory, validator, entityManager) {

            @Override
            protected AbstractJPAAnySearchDAO.AttrCondQuery getQuery(
                    AttrCond cond, boolean not, CheckResult<AttrCond> checked,
                    List<Object> parameters, SearchSupport svs) {
                return new AbstractJPAAnySearchDAO.AttrCondQuery(
                        false, new AnySearchNode.Leaf(defaultSV(svs), "mock_attr_cond"));
            }

            @Override
            protected void parseOrderByForPlainSchema(
                    SearchSupport svs, OrderBySupport obs, OrderBySupport.Item item,
                    Sort.Order clause, org.apache.syncope.core.persistence.api.entity.PlainSchema schema,
                    String fieldName) {
            }
        };
    }

    @Test
    public void testAnyCond() {
        AnyCond anyCond = new AnyCond();
        anyCond.setSchema("username");
        anyCond.setType(AttrCond.Type.EQ);
        anyCond.setExpression("admin");

        SearchCond cond = SearchCond.of(anyCond);

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

        SearchCond cond = SearchCond.of(roleCond);

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

        SearchCond cond = SearchCond.of(resourceCond);

        Optional<AbstractJPAAnySearchDAO.QueryInfo> result =
                dao.getQuery(
                        cond,
                        new ArrayList<>(),
                        new SearchViewSupport(AnyTypeKind.USER));

        assertTrue(result.isPresent());
        assertNotNull(result.get().node());
    }

}






