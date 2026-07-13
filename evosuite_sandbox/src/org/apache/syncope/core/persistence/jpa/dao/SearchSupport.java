package org.apache.syncope.core.persistence.jpa.dao;

import org.apache.syncope.common.lib.types.AnyTypeKind;
import org.apache.syncope.core.persistence.jpa.entity.anyobject.JPAAnyObject;
import org.apache.syncope.core.persistence.jpa.entity.group.JPAGroup;
import org.apache.syncope.core.persistence.jpa.entity.user.JPAUser;

public class SearchSupport {

    public static class SearchView {
        public final String alias;
        public final String name;
        public SearchView(String alias, String name) {
            this.alias = alias;
            this.name = name;
        }
    }

    protected final AnyTypeKind anyTypeKind;
    protected boolean nonMandatorySchemas = false;

    public SearchSupport(final AnyTypeKind anyTypeKind) {
        this.anyTypeKind = anyTypeKind;
    }

    public SearchView table() {
        String result;
        switch (anyTypeKind) {
            case ANY_OBJECT:
                result = JPAAnyObject.TABLE;
                break;
            case GROUP:
                result = JPAGroup.TABLE;
                break;
            case USER:
            default:
                result = JPAUser.TABLE;
                break;
        }
        return new SearchView("t", result);
    }

    public SearchView field() {
        String result;
        switch (anyTypeKind) {
            case ANY_OBJECT:
                result = "anyObject_search";
                break;
            case GROUP:
                result = "group_search";
                break;
            case USER:
            default:
                result = "user_search";
                break;
        }
        return new SearchView("sv", result);
    }

    public SearchView relationship() {
        String kind = anyTypeKind == AnyTypeKind.USER ? "u" : (anyTypeKind == AnyTypeKind.GROUP ? "g" : "a");
        return new SearchView("sv" + kind + 'm', field().name + '_' + kind + "relationship");
    }

    public SearchView membership() {
        String kind = anyTypeKind == AnyTypeKind.USER ? "u" : "a";
        return new SearchView("sv" + kind + 'm', field().name + '_' + kind + "membership");
    }

    public SearchView role() {
        return new SearchView("svr", field().name + "_role");
    }

    public SearchView auxClass() {
        return new SearchView("svac", field().name + "_auxClass");
    }

    public SearchView resource() {
        return new SearchView("svr", field().name + "_resource");
    }

    public SearchView groupResource() {
        return new SearchView("svrr", field().name + "_group_res");
    }

    public SearchView entitlements() {
        return new SearchView("sve", field().name + "_entitlements");
    }

    SearchViewSupport asSearchViewSupport() {
        if (this instanceof SearchViewSupport) {
            return (SearchViewSupport) this;
        }
        throw new IllegalArgumentException("Not an SearchViewSupport instance");
    }
}
