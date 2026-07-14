package org.apache.syncope.core.provisioning.api.jexl;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

import java.util.Map;

import org.apache.syncope.common.lib.Attr;
import org.apache.syncope.common.lib.SyncopeClientException;
import org.apache.syncope.common.lib.to.AnyTO;
import org.apache.syncope.common.lib.to.UserTO;
import org.apache.syncope.common.lib.types.ClientExceptionType;
import org.apache.syncope.core.persistence.api.dao.GroupDAO;
import org.apache.syncope.core.persistence.api.dao.UserDAO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class TemplateUtilsLLM11Test {

    private TemplateUtils templateUtils;

    private JexlTools jexlTools;

    @BeforeEach
    void setUp() {
        UserDAO userDAO = Mockito.mock(UserDAO.class);
        GroupDAO groupDAO = Mockito.mock(GroupDAO.class);
        jexlTools = Mockito.mock(JexlTools.class);

        templateUtils = new TemplateUtils(userDAO, groupDAO, jexlTools);
    }

    @Test
    void checkValidTemplate() {
        UserTO userTO = new UserTO();
        userTO.setUsername("${firstname}");

        Attr attr = new Attr();
        attr.setSchema("fullname");
        attr.getValues().add("${lastname}");
        userTO.getPlainAttrs().add(attr);

        when(jexlTools.isExpressionValid("${firstname}")).thenReturn(true);
        when(jexlTools.isExpressionValid("${lastname}")).thenReturn(true);

        Map<String, AnyTO> templates = Map.of("user", userTO);

        assertDoesNotThrow(() ->
                templateUtils.check(templates, ClientExceptionType.InvalidRequest));
    }

    @Test
    void checkInvalidTemplate() {
        UserTO userTO = new UserTO();
        userTO.setUsername("${invalid");

        when(jexlTools.isExpressionValid("${invalid")).thenReturn(false);

        Map<String, AnyTO> templates = Map.of("user", userTO);

        assertThrows(
                SyncopeClientException.class,
                () -> templateUtils.check(
                        templates,
                        ClientExceptionType.InvalidRequest));
    }
}
