package org.apache.syncope.core.persistence.jpa.dao;

import org.apache.syncope.core.persistence.api.dao.search.AttrCond;
import org.apache.syncope.core.persistence.api.entity.PlainSchema;
import org.springframework.data.domain.Sort;
import java.util.List;

public class DummyJPAAnySearchDAO extends AbstractJPAAnySearchDAO {

    public DummyJPAAnySearchDAO() {
        super(null, null, null, null, null, null, null, null, null);
    }

    @Override
    protected AttrCondQuery getQuery(
            AttrCond cond,
            boolean not,
            CheckResult<AttrCond> checked,
            List<Object> parameters,
            SearchSupport svs) {
        return new AttrCondQuery(false, new AnySearchNode(AnySearchNode.Type.LEAF));
    }

    @Override
    protected void parseOrderByForPlainSchema(
            SearchSupport svs,
            OrderBySupport obs,
            OrderBySupport.Item item,
            Sort.Order clause,
            PlainSchema schema,
            String fieldName) {
    }
}
