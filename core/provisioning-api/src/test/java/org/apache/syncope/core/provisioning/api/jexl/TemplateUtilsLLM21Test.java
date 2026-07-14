package org.apache.syncope.core.provisioning.api.jexl;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashMap;
import java.util.Map;
import org.apache.syncope.common.lib.SyncopeClientException;
import org.apache.syncope.common.lib.to.AnyTO;
import org.apache.syncope.common.lib.to.GroupTO;
import org.apache.syncope.common.lib.types.ClientExceptionType;
import org.apache.syncope.core.persistence.api.dao.GroupDAO;
import org.apache.syncope.core.persistence.api.dao.UserDAO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class TemplateUtilsLLM21Test {

    private TemplateUtils templateUtils;

    @BeforeEach
    void setUp() {
        UserDAO userDAO = Mockito.mock(UserDAO.class);
        GroupDAO groupDAO = Mockito.mock(GroupDAO.class);
        JexlTools jexlTools = new JexlTools(new org.apache.commons.jexl3.JexlBuilder().create(), null);

        templateUtils = new TemplateUtils(userDAO, groupDAO, jexlTools);
    }

    @Test
    void testCheck_InvalidGroupName() {
        Map<String, AnyTO> templates = new HashMap<>();
        GroupTO group = new GroupTO();
        group.setName("${invalid");
        templates.put("group", group);

        SyncopeClientException exception = assertThrows(
                SyncopeClientException.class,
                () -> templateUtils.check(templates, ClientExceptionType.InvalidRequest));

        assertTrue(exception.getElements().contains("Invalid JEXL: ${invalid"));
    }
}
