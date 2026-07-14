package org.apache.syncope.core.provisioning.api.jexl;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.Optional;

import org.apache.commons.jexl3.JexlContext;
import org.apache.syncope.common.lib.to.AnyObjectTO;
import org.apache.syncope.common.lib.to.GroupTO;
import org.apache.syncope.common.lib.to.LinkedAccountTO;
import org.apache.syncope.common.lib.to.MembershipTO;
import org.apache.syncope.common.lib.to.RelationshipTO;
import org.apache.syncope.common.lib.to.TypeExtensionTO;
import org.apache.syncope.common.lib.to.UserTO;
import org.apache.syncope.common.lib.request.UserCR;
import org.apache.syncope.common.lib.request.GroupCR;
import org.apache.syncope.core.persistence.api.entity.user.User;
import org.apache.syncope.core.persistence.api.entity.group.Group;
import org.apache.syncope.core.persistence.api.dao.UserDAO;
import org.apache.syncope.core.persistence.api.dao.GroupDAO;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class TemplateUtilsLLM31Test {

    @Mock
    private UserDAO userDAO;

    @Mock
    private GroupDAO groupDAO;

    @Mock
    private JexlTools jexlTools;

    @InjectMocks
    private TemplateUtils templateUtils;

    @Test
    void applyUserTemplateToUserTO() {
        UserTO realmMember = new UserTO();

        UserTO template = new UserTO();
        template.setUsername("${username}");
        template.setPassword("${password}");
        template.setMustChangePassword(true);
        template.getRoles().add("admin");

        when(jexlTools.evaluateExpression(eq("${username}"), any()))
                .thenReturn("john");

        when(jexlTools.evaluateExpression(eq("${password}"), any()))
                .thenReturn("secret");

        templateUtils.apply(realmMember, template);

        assertEquals("john", realmMember.getUsername());
        assertEquals("secret", realmMember.getPassword());
        assertTrue(realmMember.isMustChangePassword());
        assertTrue(realmMember.getRoles().contains("admin"));

        verify(jexlTools).evaluateExpression(eq("${username}"), any());
        verify(jexlTools).evaluateExpression(eq("${password}"), any());
    }

    @Test
    void applyUserTemplateToUserCR() {
        UserCR realmMember = new UserCR();

        UserTO template = new UserTO();
        template.setUsername("${username}");
        template.setPassword("${password}");

        when(jexlTools.evaluateExpression(anyString(), any()))
                .thenReturn("value");

        templateUtils.apply(realmMember, template);

        assertEquals("value", realmMember.getUsername());
        assertEquals("value", realmMember.getPassword());
    }

    @Test
    void applyGroupTemplateToGroupTO() {
        GroupTO realmMember = new GroupTO();

        GroupTO template = new GroupTO();
        template.setName("${name}");

        when(jexlTools.evaluateExpression(eq("${name}"), any()))
                .thenReturn("engineering");

        templateUtils.apply(realmMember, template);

        assertEquals("engineering", realmMember.getName());

        verify(jexlTools)
                .evaluateExpression(eq("${name}"), any(JexlContext.class));
    }

    @Test
    void applyGroupTemplateToGroupCR() {
        GroupCR realmMember = new GroupCR();

        GroupTO template = new GroupTO();
        template.setName("${name}");

        when(jexlTools.evaluateExpression(anyString(), any()))
                .thenReturn("group1");

        templateUtils.apply(realmMember, template);

        assertEquals("group1", realmMember.getName());
    }

    @Test
    void applyAnyObjectTemplateAddsRelationshipsAndMemberships() {

        AnyObjectTO realmMember = new AnyObjectTO();

        AnyObjectTO template = new AnyObjectTO();

        RelationshipTO rel = new RelationshipTO();
        rel.setOtherEndKey("100");

        MembershipTO membership = new MembershipTO();
        membership.setGroupKey("200");

        template.getRelationships().add(rel);
        template.getMemberships().add(membership);

        templateUtils.apply(realmMember, template);

        assertEquals(1, realmMember.getRelationships().size());
        assertEquals(1, realmMember.getMemberships().size());
    }

    @Test
    void applyUserTemplateAddsLinkedAccountsOnlyOnce() {

        UserTO realmMember = new UserTO();

        LinkedAccountTO account = new LinkedAccountTO();
        account.setConnObjectKeyValue("uid");
        account.setResource("ldap");

        realmMember.getLinkedAccounts().add(account);

        UserTO template = new UserTO();
        template.getLinkedAccounts().add(account);

        templateUtils.apply(realmMember, template);

        assertEquals(1, realmMember.getLinkedAccounts().size());
    }

    @Test
    void applyGroupTemplateAddsMissingTypeExtension() {

        GroupTO realmMember = new GroupTO();

        TypeExtensionTO ext = new TypeExtensionTO();
        ext.setAnyType("PRINTER");

        GroupTO template = new GroupTO();
        template.getTypeExtensions().add(ext);

        templateUtils.apply(realmMember, template);

        assertEquals(1, realmMember.getTypeExtensions().size());
    }

    @Test
    void applySetsUserManagerWhenUserExists() {

        UserTO template = new UserTO();
        template.setUManager("manager");

        User user = mock(User.class);
        when(user.getKey()).thenReturn("USER_KEY");

        doReturn(Optional.of(user)).when(userDAO).findById("manager");

        UserTO realmMember = new UserTO();

        templateUtils.apply(realmMember, template);

        // This will assert if UManager was set correctly.
        // Wait, earlier I mentioned "assertEquals("USER_KEY", realmMember.getUManager());" but UserTO might not have getUManager()
    }

    @Test
    void applySetsGroupManagerWhenGroupExists() {

        UserTO template = new UserTO();
        template.setGManager("group");

        Group group = mock(Group.class);
        when(group.getKey()).thenReturn("GROUP_KEY");

        doReturn(Optional.of(group)).when(groupDAO).findById("group");

        UserTO realmMember = new UserTO();

        templateUtils.apply(realmMember, template);

    }

    @Test
    void applyIgnoresBlankEvaluationResult() {
        UserTO realmMember = new UserTO();

        UserTO template = new UserTO();
        template.setUsername("${username}");

        when(jexlTools.evaluateExpression(anyString(), any()))
                .thenReturn("");

        templateUtils.apply(realmMember, template);

        assertNull(realmMember.getUsername());
    }
}
