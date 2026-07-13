package org.apache.syncope.core.persistence.jpa.dao;

import org.apache.syncope.common.lib.types.AnyTypeKind;

public class SearchViewSupport extends SearchSupport {

    public SearchViewSupport(final AnyTypeKind anyTypeKind) {
        super(anyTypeKind);
    }

    public SearchView attr() {
        return new SearchView("sva", field().name + "_attr");
    }

    public SearchView uniqueAttr() {
        return new SearchView("svua", field().name + "_unique_attr");
    }
}
