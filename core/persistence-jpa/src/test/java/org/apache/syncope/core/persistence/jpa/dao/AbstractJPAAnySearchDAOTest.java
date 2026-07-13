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
import org.apache.syncope.core.persistence.api.entity.AnyUtils;
import org.apache.syncope.core.persistence.api.entity.AnyUtilsFactory;
import org.apache.syncope.core.persistence.api.entity.EntityFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.data.domain.Sort;

@ExtendWith(MockitoExtension.class)
public class AbstractJPAAnySearchDAOTest {

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
        dao = new AbstractJPAAnySearchDAO(
                realmSearchDAO, userDAO, groupDAO, anyObjectDAO,
                plainSchemaDAO, entityFactory, anyUtilsFactory, validator, entityManager) {

            @Override
            protected AbstractJPAAnySearchDAO.AttrCondQuery getQuery(
                    AttrCond cond, boolean not, CheckResult<AttrCond> checked,
                    List<Object> parameters, SearchSupport svs) {
                // Mock behavior for AttrCondQuery
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
    public void testTC1_Leaf_AnyTypeCond_AnyObject() {
        // CE1: LEAF, AnyTypeCond, ANY_OBJECT
        AnyTypeCond leafCond = new AnyTypeCond();
        leafCond.setAnyTypeKey("PRINTER");
        SearchCond cond = SearchCond.of(leafCond);
        List<Object> params = new ArrayList<>();
        SearchSupport svs = new SearchViewSupport(AnyTypeKind.ANY_OBJECT);

        Optional<AbstractJPAAnySearchDAO.QueryInfo> result = dao.getQuery(cond, params, svs);

        assertTrue(result.isPresent());
        assertTrue(result.get().node() instanceof AnySearchNode.Leaf);
        AnySearchNode.Leaf leaf = (AnySearchNode.Leaf) result.get().node();
        assertTrue(leaf.getClause().contains("type_id=?"));
        assertEquals(1, params.size());
        assertEquals("PRINTER", params.get(0));
    }

    @Test
    public void testTC2_NotLeaf_RoleCond_User() {
        // CE2: NOT_LEAF, RoleCond, USER
        RoleCond roleCond = new RoleCond();
        roleCond.setRole("ADMIN");
        SearchCond cond = SearchCond.negate(roleCond);
        List<Object> params = new ArrayList<>();
        SearchSupport svs = new SearchViewSupport(AnyTypeKind.USER);

        Optional<AbstractJPAAnySearchDAO.QueryInfo> result = dao.getQuery(cond, params, svs);

        assertTrue(result.isPresent());
        assertTrue(result.get().node() instanceof AnySearchNode.Leaf);
        AnySearchNode.Leaf leaf = (AnySearchNode.Leaf) result.get().node();
        assertTrue(leaf.getClause().contains("NOT IN"));
        assertTrue(leaf.getClause().contains("role_id=?"));
        assertEquals(1, params.size());
        assertEquals("ADMIN", params.get(0));
    }

    @Test
    public void testTC3_Leaf_AnyCond_Group() {
        // CE3: LEAF, AnyCond, GROUP
        AnyCond anyCond = new AnyCond();
        anyCond.setSchema("name");
        anyCond.setType(AnyCond.Type.EQ);
        anyCond.setExpression("MyGroup");
        SearchCond cond = SearchCond.of(anyCond);
        List<Object> params = new ArrayList<>();
        SearchSupport svs = new SearchViewSupport(AnyTypeKind.GROUP);

        // We must mock AnyUtils behavior for 'check(AnyCond)' since it's called by getQuery for AnyCond
        AnyUtils anyUtilsMock = mock(AnyUtils.class);
        when(anyUtilsFactory.getInstance(AnyTypeKind.GROUP)).thenReturn(anyUtilsMock);
        
        // Mock getField to avoid IllegalArgumentException
        try {
            java.lang.reflect.Field nameField = String.class.getDeclaredField("value"); // dummy field
            when(anyUtilsMock.getField("name")).thenReturn(Optional.of(nameField));
        } catch (Exception e) {
            fail("Reflection setup failed");
        }
        
        doAnswer(invocation -> {
            org.apache.syncope.core.persistence.api.entity.PlainAttrValue attrValue = invocation.getArgument(2);
            attrValue.setStringValue("MyGroup");
            return null;
        }).when(validator).validate(any(), any(), any());
        
        org.apache.syncope.core.persistence.api.entity.PlainSchema dummySchema = mock(org.apache.syncope.core.persistence.api.entity.PlainSchema.class);
        when(entityFactory.newEntity(org.apache.syncope.core.persistence.api.entity.PlainSchema.class)).thenReturn(dummySchema);

        Optional<AbstractJPAAnySearchDAO.QueryInfo> result = dao.getQuery(cond, params, svs);

        assertTrue(result.isPresent());
        assertTrue(result.get().node() instanceof AnySearchNode.Leaf);
        AnySearchNode.Leaf leaf = (AnySearchNode.Leaf) result.get().node();
        assertTrue(leaf.getClause().contains("="));
        assertEquals(1, params.size());
        assertEquals("MyGroup", params.get(0));
    }

    @Test
    public void testTC4_AND_User() {
        // CE4: AND, USER
        RoleCond roleCond1 = new RoleCond();
        roleCond1.setRole("ADMIN");
        RoleCond roleCond2 = new RoleCond();
        roleCond2.setRole("USER");

        SearchCond cond = SearchCond.and(SearchCond.of(roleCond1), SearchCond.of(roleCond2));
        List<Object> params = new ArrayList<>();
        SearchSupport svs = new SearchViewSupport(AnyTypeKind.USER);

        Optional<AbstractJPAAnySearchDAO.QueryInfo> result = dao.getQuery(cond, params, svs);

        assertTrue(result.isPresent());
        assertEquals(AnySearchNode.Type.AND, result.get().node().getType());
        assertEquals(2, result.get().node().getChildren().size());
        assertEquals(2, params.size());
    }

    @Test
    public void testTC5_OR_AnyObject() {
        // CE5: OR, ANY_OBJECT
        AnyTypeCond typeCond1 = new AnyTypeCond();
        typeCond1.setAnyTypeKey("PRINTER");
        AnyTypeCond typeCond2 = new AnyTypeCond();
        typeCond2.setAnyTypeKey("SCANNER");

        SearchCond cond = SearchCond.or(SearchCond.of(typeCond1), SearchCond.of(typeCond2));
        List<Object> params = new ArrayList<>();
        SearchSupport svs = new SearchViewSupport(AnyTypeKind.ANY_OBJECT);

        Optional<AbstractJPAAnySearchDAO.QueryInfo> result = dao.getQuery(cond, params, svs);

        assertTrue(result.isPresent());
        assertEquals(AnySearchNode.Type.OR, result.get().node().getType());
        assertEquals(2, result.get().node().getChildren().size());
        assertEquals(2, params.size());
    }
    
    @Test
    public void testTC6_Leaf_AttrCond_User() {
        // CE6: LEAF, AttrCond, USER
        AttrCond attrCond = new AttrCond();
        attrCond.setSchema("custom_attr");
        SearchCond cond = SearchCond.of(attrCond);
        List<Object> params = new ArrayList<>();
        SearchSupport svs = new SearchViewSupport(AnyTypeKind.USER);
        
        org.apache.syncope.core.persistence.api.entity.PlainSchema dummySchema = mock(org.apache.syncope.core.persistence.api.entity.PlainSchema.class);
        doReturn(Optional.of(dummySchema)).when(plainSchemaDAO).findById("custom_attr");
        
        doAnswer(invocation -> {
            org.apache.syncope.core.persistence.api.entity.PlainAttrValue attrValue = invocation.getArgument(2);
            attrValue.setStringValue("custom_value");
            return null;
        }).when(validator).validate(any(), any(), any());
        
        // This will fall back to our dummy implementation in setUp()
        Optional<AbstractJPAAnySearchDAO.QueryInfo> result = dao.getQuery(cond, params, svs);
        
        assertTrue(result.isPresent());
        assertTrue(result.get().node() instanceof AnySearchNode.Leaf);
        AnySearchNode.Leaf leaf = (AnySearchNode.Leaf) result.get().node();
        assertEquals("mock_attr_cond", leaf.getClause());
    }

    @Test
    public void testTC7_Leaf_AuxClassCond() {
        // CE7: LEAF, AuxClassCond
        org.apache.syncope.core.persistence.api.dao.search.AuxClassCond auxCond = new org.apache.syncope.core.persistence.api.dao.search.AuxClassCond();
        auxCond.setAuxClass("MyAuxClass");
        SearchCond cond = SearchCond.of(auxCond);
        List<Object> params = new ArrayList<>();
        SearchSupport svs = new SearchViewSupport(AnyTypeKind.USER);

        Optional<AbstractJPAAnySearchDAO.QueryInfo> result = dao.getQuery(cond, params, svs);

        assertTrue(result.isPresent());
        assertTrue(result.get().node() instanceof AnySearchNode.Leaf);
        AnySearchNode.Leaf leaf = (AnySearchNode.Leaf) result.get().node();
        assertTrue(leaf.getClause().contains("IN (SELECT any_id FROM"));
        assertEquals(1, params.size());
        assertEquals("MyAuxClass", params.get(0));
    }
}
