package org.apache.syncope.core.provisioning.api.jexl;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashMap;
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

class TemplateUtilsLLM22Test {

    private TemplateUtils templateUtils;

    @BeforeEach
    void setUp() {
        UserDAO userDAO = Mockito.mock(UserDAO.class);
        GroupDAO groupDAO = Mockito.mock(GroupDAO.class);
        JexlTools jexlTools = new JexlTools(new org.apache.commons.jexl3.JexlBuilder().create(), null); // real object avoiding over-mocking

        templateUtils = new TemplateUtils(userDAO, groupDAO, jexlTools);
    }

    @Test
    void testInvalidPlainAttr() {
        Map<String, AnyTO> templates = new HashMap<>();

        UserTO user = new UserTO();

        Attr plainAttr = new Attr();
        plainAttr.setSchema("fullname");
        plainAttr.getValues().add("${invalidJexl!!");

        user.getPlainAttrs().add(plainAttr);

        templates.put("user", user);

        SyncopeClientException ex = assertThrows(
                SyncopeClientException.class,
                () -> templateUtils.check(templates, ClientExceptionType.InvalidRequest));

        assertTrue(ex.getElements().contains("Invalid JEXL: ${invalidJexl!!"));
    }
}
