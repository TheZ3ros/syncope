package org.apache.syncope.core.provisioning.api.jexl;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

import java.util.HashMap;
import java.util.Map;
import org.apache.syncope.common.lib.SyncopeClientException;
import org.apache.syncope.common.lib.to.UserTO;
import org.apache.syncope.common.lib.types.ClientExceptionType;
import org.apache.syncope.core.persistence.api.dao.GroupDAO;
import org.apache.syncope.core.persistence.api.dao.UserDAO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

class TemplateUtilsLLM12Test {

    @Mock
    private UserDAO userDAO;

    @Mock
    private GroupDAO groupDAO;

    @Mock
    private JexlTools jexlTools;

    private TemplateUtils templateUtils;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);

        templateUtils = new TemplateUtils(
                userDAO,
                groupDAO,
                jexlTools);
    }

    @Test
    void checkShouldThrowNPEWhenTemplatesMapIsNull() {
        assertThrows(
                NullPointerException.class,
                () -> templateUtils.check(null, ClientExceptionType.InvalidRequest));
    }

    @Test
    void checkShouldThrowNPEWhenTemplateValueIsNull() {
        Map<String, org.apache.syncope.common.lib.to.AnyTO> templates = new HashMap<>();
        templates.put("user", null);

        assertThrows(
                NullPointerException.class,
                () -> templateUtils.check(
                        templates,
                        ClientExceptionType.InvalidRequest));
    }

    @Test
    void checkShouldNotFailWhenUsernameIsNull() {
        UserTO user = new UserTO();
        user.setUsername(null);

        Map<String, org.apache.syncope.common.lib.to.AnyTO> templates =
                Map.of("user", user);

        assertDoesNotThrow(() ->
                templateUtils.check(
                        templates,
                        ClientExceptionType.InvalidRequest));
    }

    @Test
    void checkShouldThrowSyncopeClientExceptionForInvalidUsername() {
        UserTO user = new UserTO();
        user.setUsername("${invalid}");

        when(jexlTools.isExpressionValid("${invalid}"))
                .thenReturn(false);

        Map<String, org.apache.syncope.common.lib.to.AnyTO> templates =
                Map.of("user", user);

        SyncopeClientException exception = assertThrows(
                SyncopeClientException.class,
                () -> templateUtils.check(
                        templates,
                        ClientExceptionType.InvalidRequest));

        assertEquals(1, exception.getElements().size());
    }

    @Test
    void checkShouldThrowSyncopeClientExceptionForInvalidPassword() {
        UserTO user = new UserTO();
        user.setPassword("${badPassword}");

        when(jexlTools.isExpressionValid("${badPassword}"))
                .thenReturn(false);

        Map<String, org.apache.syncope.common.lib.to.AnyTO> templates =
                Map.of("user", user);

        SyncopeClientException exception = assertThrows(
                SyncopeClientException.class,
                () -> templateUtils.check(
                        templates,
                        ClientExceptionType.InvalidRequest));

        assertEquals(1, exception.getElements().size());
    }

    @Test
    void checkShouldPassWithValidUsername() {
        UserTO user = new UserTO();
        user.setUsername("${firstname}");

        when(jexlTools.isExpressionValid("${firstname}"))
                .thenReturn(true);

        Map<String, org.apache.syncope.common.lib.to.AnyTO> templates =
                Map.of("user", user);

        assertDoesNotThrow(() ->
                templateUtils.check(
                        templates,
                        ClientExceptionType.InvalidRequest));
    }
}
