import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test1");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test2");
        org.apache.syncope.core.persistence.api.dao.UserDAO userDAO0 = null;
        org.apache.syncope.core.persistence.api.dao.GroupDAO groupDAO1 = null;
        org.apache.syncope.core.provisioning.api.jexl.JexlTools jexlTools2 = null;
        org.apache.syncope.core.provisioning.api.jexl.TemplateUtils templateUtils3 = new org.apache.syncope.core.provisioning.api.jexl.TemplateUtils(userDAO0, groupDAO1, jexlTools2);
        java.util.Map<java.lang.String, org.apache.syncope.common.lib.to.AnyTO> strMap4 = null;
        org.apache.syncope.common.lib.types.ClientExceptionType clientExceptionType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            templateUtils3.check(strMap4, clientExceptionType5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Map.values()\" because \"templates\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test3");
        org.apache.syncope.core.persistence.api.dao.UserDAO userDAO0 = null;
        org.apache.syncope.core.persistence.api.dao.GroupDAO groupDAO1 = null;
        org.apache.syncope.core.provisioning.api.jexl.JexlTools jexlTools2 = null;
        org.apache.syncope.core.provisioning.api.jexl.TemplateUtils templateUtils3 = new org.apache.syncope.core.provisioning.api.jexl.TemplateUtils(userDAO0, groupDAO1, jexlTools2);
        java.lang.Class<?> wildcardClass4 = templateUtils3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test4");
        org.apache.syncope.core.persistence.api.dao.UserDAO userDAO0 = null;
        org.apache.syncope.core.persistence.api.dao.GroupDAO groupDAO1 = null;
        org.apache.syncope.core.provisioning.api.jexl.JexlTools jexlTools2 = null;
        org.apache.syncope.core.provisioning.api.jexl.TemplateUtils templateUtils3 = new org.apache.syncope.core.provisioning.api.jexl.TemplateUtils(userDAO0, groupDAO1, jexlTools2);
        org.apache.syncope.common.lib.RealmMember realmMember4 = null;
        org.apache.syncope.common.lib.to.AnyTO anyTO5 = null;
        // The following exception was thrown during execution in test generation
        try {
            templateUtils3.apply(realmMember4, anyTO5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.common.lib.RealmMember.getPlainAttrs()\" because \"realmMember\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }
}

