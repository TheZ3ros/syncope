package org.apache.syncope.core.provisioning.api.jexl;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.syncope.common.lib.Attr;
import org.apache.syncope.common.lib.SyncopeClientException;
import org.apache.syncope.common.lib.to.AnyObjectTO;
import org.apache.syncope.common.lib.to.AnyTO;
import org.apache.syncope.common.lib.to.GroupTO;
import org.apache.syncope.common.lib.to.UserTO;
import org.apache.syncope.common.lib.types.ClientExceptionType;
import org.apache.syncope.core.persistence.api.dao.GroupDAO;
import org.apache.syncope.core.persistence.api.dao.UserDAO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class TemplateUtilsTest {

    @Mock
    private UserDAO userDAO;

    @Mock
    private GroupDAO groupDAO;

    @Mock
    private JexlTools jexlTools;

    @InjectMocks
    private TemplateUtils templateUtils;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testTC1_EmptyMap() {
        Map<String, AnyTO> templates = new HashMap<>();
        assertDoesNotThrow(() -> templateUtils.check(templates, ClientExceptionType.InvalidAnyType));
    }

    @Test
    public void testTC2_ValidUserTO() {
        Map<String, AnyTO> templates = new HashMap<>();
        UserTO user = new UserTO();
        user.setUsername("validJexl");
        templates.put("user", user);

        when(jexlTools.isExpressionValid(anyString())).thenReturn(true);

        assertDoesNotThrow(() -> templateUtils.check(templates, ClientExceptionType.InvalidAnyType));
    }

    @Test
    public void testTC3_InvalidUserTOUsername() {
        Map<String, AnyTO> templates = new HashMap<>();
        UserTO user = new UserTO();
        user.setUsername("invalidJexl!!");
        templates.put("user", user);

        when(jexlTools.isExpressionValid(anyString())).thenReturn(false);

        SyncopeClientException exception = assertThrows(SyncopeClientException.class,
                () -> templateUtils.check(templates, ClientExceptionType.InvalidAnyType));
        assertTrue(exception.getElements().iterator().next().contains("Invalid JEXL:"));
    }

    @Test
    public void testTC4_InvalidGroupTOName() {
        Map<String, AnyTO> templates = new HashMap<>();
        GroupTO group = new GroupTO();
        group.setName("invalidGroup!!");
        templates.put("group", group);

        when(jexlTools.isExpressionValid(anyString())).thenReturn(false);

        SyncopeClientException exception = assertThrows(SyncopeClientException.class,
                () -> templateUtils.check(templates, ClientExceptionType.InvalidAnyType));
        assertTrue(exception.getElements().iterator().next().contains("Invalid JEXL:"));
    }

    @Test
    public void testTC5_NullTemplates() {
        assertThrows(NullPointerException.class,
                () -> templateUtils.check(null, ClientExceptionType.InvalidAnyType));
    }

    @Test
    public void testInvalidPlainAttr() {
        Map<String, AnyTO> templates = new HashMap<>();
        AnyObjectTO any = new AnyObjectTO();
        Attr attr = new Attr();
        attr.setSchema("attr1");
        attr.getValues().add("invalidAttrExp!!");
        any.getPlainAttrs().add(attr);
        templates.put("any", any);

        when(jexlTools.isExpressionValid(anyString())).thenReturn(false);

        SyncopeClientException exception = assertThrows(SyncopeClientException.class,
                () -> templateUtils.check(templates, ClientExceptionType.InvalidAnyType));
        assertTrue(exception.getElements().iterator().next().contains("Invalid JEXL: invalidAttrExp!!"));
    }
}
