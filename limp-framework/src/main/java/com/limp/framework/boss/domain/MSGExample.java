package com.limp.framework.boss.domain;

import com.limp.framework.core.bean.Pager;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MSGExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Pager page;

    public MSGExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setPage(Pager page) {
        this.page=page;
    }

    public Pager getPage() {
        return page;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("MSG_ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("MSG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("MSG_ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("MSG_ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("MSG_ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("MSG_ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("MSG_ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("MSG_ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("MSG_ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("MSG_ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("MSG_ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("MSG_ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("MSG_ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("MSG_ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("MSG_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("MSG_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("MSG_TITLE =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("MSG_TITLE <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("MSG_TITLE >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("MSG_TITLE >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("MSG_TITLE <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("MSG_TITLE <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("MSG_TITLE like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("MSG_TITLE not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("MSG_TITLE in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("MSG_TITLE not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("MSG_TITLE between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("MSG_TITLE not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andIntroIsNull() {
            addCriterion("MSG_INTRO is null");
            return (Criteria) this;
        }

        public Criteria andIntroIsNotNull() {
            addCriterion("MSG_INTRO is not null");
            return (Criteria) this;
        }

        public Criteria andIntroEqualTo(String value) {
            addCriterion("MSG_INTRO =", value, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroNotEqualTo(String value) {
            addCriterion("MSG_INTRO <>", value, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroGreaterThan(String value) {
            addCriterion("MSG_INTRO >", value, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroGreaterThanOrEqualTo(String value) {
            addCriterion("MSG_INTRO >=", value, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroLessThan(String value) {
            addCriterion("MSG_INTRO <", value, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroLessThanOrEqualTo(String value) {
            addCriterion("MSG_INTRO <=", value, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroLike(String value) {
            addCriterion("MSG_INTRO like", value, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroNotLike(String value) {
            addCriterion("MSG_INTRO not like", value, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroIn(List<String> values) {
            addCriterion("MSG_INTRO in", values, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroNotIn(List<String> values) {
            addCriterion("MSG_INTRO not in", values, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroBetween(String value1, String value2) {
            addCriterion("MSG_INTRO between", value1, value2, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroNotBetween(String value1, String value2) {
            addCriterion("MSG_INTRO not between", value1, value2, "intro");
            return (Criteria) this;
        }

        public Criteria andPathIsNull() {
            addCriterion("MSG_PATH is null");
            return (Criteria) this;
        }

        public Criteria andPathIsNotNull() {
            addCriterion("MSG_PATH is not null");
            return (Criteria) this;
        }

        public Criteria andPathEqualTo(String value) {
            addCriterion("MSG_PATH =", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotEqualTo(String value) {
            addCriterion("MSG_PATH <>", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathGreaterThan(String value) {
            addCriterion("MSG_PATH >", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathGreaterThanOrEqualTo(String value) {
            addCriterion("MSG_PATH >=", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLessThan(String value) {
            addCriterion("MSG_PATH <", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLessThanOrEqualTo(String value) {
            addCriterion("MSG_PATH <=", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLike(String value) {
            addCriterion("MSG_PATH like", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotLike(String value) {
            addCriterion("MSG_PATH not like", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathIn(List<String> values) {
            addCriterion("MSG_PATH in", values, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotIn(List<String> values) {
            addCriterion("MSG_PATH not in", values, "path");
            return (Criteria) this;
        }

        public Criteria andPathBetween(String value1, String value2) {
            addCriterion("MSG_PATH between", value1, value2, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotBetween(String value1, String value2) {
            addCriterion("MSG_PATH not between", value1, value2, "path");
            return (Criteria) this;
        }

        public Criteria andIdtIsNull() {
            addCriterion("MSG_IDT is null");
            return (Criteria) this;
        }

        public Criteria andIdtIsNotNull() {
            addCriterion("MSG_IDT is not null");
            return (Criteria) this;
        }

        public Criteria andIdtEqualTo(Object value) {
            addCriterion("MSG_IDT =", value, "idt");
            return (Criteria) this;
        }

        public Criteria andIdtNotEqualTo(Object value) {
            addCriterion("MSG_IDT <>", value, "idt");
            return (Criteria) this;
        }

        public Criteria andIdtGreaterThan(Object value) {
            addCriterion("MSG_IDT >", value, "idt");
            return (Criteria) this;
        }

        public Criteria andIdtGreaterThanOrEqualTo(Object value) {
            addCriterion("MSG_IDT >=", value, "idt");
            return (Criteria) this;
        }

        public Criteria andIdtLessThan(Object value) {
            addCriterion("MSG_IDT <", value, "idt");
            return (Criteria) this;
        }

        public Criteria andIdtLessThanOrEqualTo(Object value) {
            addCriterion("MSG_IDT <=", value, "idt");
            return (Criteria) this;
        }

        public Criteria andIdtIn(List<Object> values) {
            addCriterion("MSG_IDT in", values, "idt");
            return (Criteria) this;
        }

        public Criteria andIdtNotIn(List<Object> values) {
            addCriterion("MSG_IDT not in", values, "idt");
            return (Criteria) this;
        }

        public Criteria andIdtBetween(Object value1, Object value2) {
            addCriterion("MSG_IDT between", value1, value2, "idt");
            return (Criteria) this;
        }

        public Criteria andIdtNotBetween(Object value1, Object value2) {
            addCriterion("MSG_IDT not between", value1, value2, "idt");
            return (Criteria) this;
        }

        public Criteria andUsridfromIsNull() {
            addCriterion("MSG_USRIDFROM is null");
            return (Criteria) this;
        }

        public Criteria andUsridfromIsNotNull() {
            addCriterion("MSG_USRIDFROM is not null");
            return (Criteria) this;
        }

        public Criteria andUsridfromEqualTo(String value) {
            addCriterion("MSG_USRIDFROM =", value, "usridfrom");
            return (Criteria) this;
        }

        public Criteria andUsridfromNotEqualTo(String value) {
            addCriterion("MSG_USRIDFROM <>", value, "usridfrom");
            return (Criteria) this;
        }

        public Criteria andUsridfromGreaterThan(String value) {
            addCriterion("MSG_USRIDFROM >", value, "usridfrom");
            return (Criteria) this;
        }

        public Criteria andUsridfromGreaterThanOrEqualTo(String value) {
            addCriterion("MSG_USRIDFROM >=", value, "usridfrom");
            return (Criteria) this;
        }

        public Criteria andUsridfromLessThan(String value) {
            addCriterion("MSG_USRIDFROM <", value, "usridfrom");
            return (Criteria) this;
        }

        public Criteria andUsridfromLessThanOrEqualTo(String value) {
            addCriterion("MSG_USRIDFROM <=", value, "usridfrom");
            return (Criteria) this;
        }

        public Criteria andUsridfromLike(String value) {
            addCriterion("MSG_USRIDFROM like", value, "usridfrom");
            return (Criteria) this;
        }

        public Criteria andUsridfromNotLike(String value) {
            addCriterion("MSG_USRIDFROM not like", value, "usridfrom");
            return (Criteria) this;
        }

        public Criteria andUsridfromIn(List<String> values) {
            addCriterion("MSG_USRIDFROM in", values, "usridfrom");
            return (Criteria) this;
        }

        public Criteria andUsridfromNotIn(List<String> values) {
            addCriterion("MSG_USRIDFROM not in", values, "usridfrom");
            return (Criteria) this;
        }

        public Criteria andUsridfromBetween(String value1, String value2) {
            addCriterion("MSG_USRIDFROM between", value1, value2, "usridfrom");
            return (Criteria) this;
        }

        public Criteria andUsridfromNotBetween(String value1, String value2) {
            addCriterion("MSG_USRIDFROM not between", value1, value2, "usridfrom");
            return (Criteria) this;
        }

        public Criteria andUsridtoIsNull() {
            addCriterion("MSG_USRIDTO is null");
            return (Criteria) this;
        }

        public Criteria andUsridtoIsNotNull() {
            addCriterion("MSG_USRIDTO is not null");
            return (Criteria) this;
        }

        public Criteria andUsridtoEqualTo(String value) {
            addCriterion("MSG_USRIDTO =", value, "usridto");
            return (Criteria) this;
        }

        public Criteria andUsridtoNotEqualTo(String value) {
            addCriterion("MSG_USRIDTO <>", value, "usridto");
            return (Criteria) this;
        }

        public Criteria andUsridtoGreaterThan(String value) {
            addCriterion("MSG_USRIDTO >", value, "usridto");
            return (Criteria) this;
        }

        public Criteria andUsridtoGreaterThanOrEqualTo(String value) {
            addCriterion("MSG_USRIDTO >=", value, "usridto");
            return (Criteria) this;
        }

        public Criteria andUsridtoLessThan(String value) {
            addCriterion("MSG_USRIDTO <", value, "usridto");
            return (Criteria) this;
        }

        public Criteria andUsridtoLessThanOrEqualTo(String value) {
            addCriterion("MSG_USRIDTO <=", value, "usridto");
            return (Criteria) this;
        }

        public Criteria andUsridtoLike(String value) {
            addCriterion("MSG_USRIDTO like", value, "usridto");
            return (Criteria) this;
        }

        public Criteria andUsridtoNotLike(String value) {
            addCriterion("MSG_USRIDTO not like", value, "usridto");
            return (Criteria) this;
        }

        public Criteria andUsridtoIn(List<String> values) {
            addCriterion("MSG_USRIDTO in", values, "usridto");
            return (Criteria) this;
        }

        public Criteria andUsridtoNotIn(List<String> values) {
            addCriterion("MSG_USRIDTO not in", values, "usridto");
            return (Criteria) this;
        }

        public Criteria andUsridtoBetween(String value1, String value2) {
            addCriterion("MSG_USRIDTO between", value1, value2, "usridto");
            return (Criteria) this;
        }

        public Criteria andUsridtoNotBetween(String value1, String value2) {
            addCriterion("MSG_USRIDTO not between", value1, value2, "usridto");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("MSG_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("MSG_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Short value) {
            addCriterion("MSG_TYPE =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Short value) {
            addCriterion("MSG_TYPE <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Short value) {
            addCriterion("MSG_TYPE >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("MSG_TYPE >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Short value) {
            addCriterion("MSG_TYPE <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Short value) {
            addCriterion("MSG_TYPE <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Short> values) {
            addCriterion("MSG_TYPE in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Short> values) {
            addCriterion("MSG_TYPE not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Short value1, Short value2) {
            addCriterion("MSG_TYPE between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Short value1, Short value2) {
            addCriterion("MSG_TYPE not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andReadIsNull() {
            addCriterion("MSG_READ is null");
            return (Criteria) this;
        }

        public Criteria andReadIsNotNull() {
            addCriterion("MSG_READ is not null");
            return (Criteria) this;
        }

        public Criteria andReadEqualTo(Short value) {
            addCriterion("MSG_READ =", value, "read");
            return (Criteria) this;
        }

        public Criteria andReadNotEqualTo(Short value) {
            addCriterion("MSG_READ <>", value, "read");
            return (Criteria) this;
        }

        public Criteria andReadGreaterThan(Short value) {
            addCriterion("MSG_READ >", value, "read");
            return (Criteria) this;
        }

        public Criteria andReadGreaterThanOrEqualTo(Short value) {
            addCriterion("MSG_READ >=", value, "read");
            return (Criteria) this;
        }

        public Criteria andReadLessThan(Short value) {
            addCriterion("MSG_READ <", value, "read");
            return (Criteria) this;
        }

        public Criteria andReadLessThanOrEqualTo(Short value) {
            addCriterion("MSG_READ <=", value, "read");
            return (Criteria) this;
        }

        public Criteria andReadIn(List<Short> values) {
            addCriterion("MSG_READ in", values, "read");
            return (Criteria) this;
        }

        public Criteria andReadNotIn(List<Short> values) {
            addCriterion("MSG_READ not in", values, "read");
            return (Criteria) this;
        }

        public Criteria andReadBetween(Short value1, Short value2) {
            addCriterion("MSG_READ between", value1, value2, "read");
            return (Criteria) this;
        }

        public Criteria andReadNotBetween(Short value1, Short value2) {
            addCriterion("MSG_READ not between", value1, value2, "read");
            return (Criteria) this;
        }

        public Criteria andUdtIsNull() {
            addCriterion("MSG_UDT is null");
            return (Criteria) this;
        }

        public Criteria andUdtIsNotNull() {
            addCriterion("MSG_UDT is not null");
            return (Criteria) this;
        }

        public Criteria andUdtEqualTo(Object value) {
            addCriterion("MSG_UDT =", value, "udt");
            return (Criteria) this;
        }

        public Criteria andUdtNotEqualTo(Object value) {
            addCriterion("MSG_UDT <>", value, "udt");
            return (Criteria) this;
        }

        public Criteria andUdtGreaterThan(Object value) {
            addCriterion("MSG_UDT >", value, "udt");
            return (Criteria) this;
        }

        public Criteria andUdtGreaterThanOrEqualTo(Object value) {
            addCriterion("MSG_UDT >=", value, "udt");
            return (Criteria) this;
        }

        public Criteria andUdtLessThan(Object value) {
            addCriterion("MSG_UDT <", value, "udt");
            return (Criteria) this;
        }

        public Criteria andUdtLessThanOrEqualTo(Object value) {
            addCriterion("MSG_UDT <=", value, "udt");
            return (Criteria) this;
        }

        public Criteria andUdtIn(List<Object> values) {
            addCriterion("MSG_UDT in", values, "udt");
            return (Criteria) this;
        }

        public Criteria andUdtNotIn(List<Object> values) {
            addCriterion("MSG_UDT not in", values, "udt");
            return (Criteria) this;
        }

        public Criteria andUdtBetween(Object value1, Object value2) {
            addCriterion("MSG_UDT between", value1, value2, "udt");
            return (Criteria) this;
        }

        public Criteria andUdtNotBetween(Object value1, Object value2) {
            addCriterion("MSG_UDT not between", value1, value2, "udt");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("MSG_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("MSG_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Short value) {
            addCriterion("MSG_STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Short value) {
            addCriterion("MSG_STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Short value) {
            addCriterion("MSG_STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("MSG_STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Short value) {
            addCriterion("MSG_STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Short value) {
            addCriterion("MSG_STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Short> values) {
            addCriterion("MSG_STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Short> values) {
            addCriterion("MSG_STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Short value1, Short value2) {
            addCriterion("MSG_STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Short value1, Short value2) {
            addCriterion("MSG_STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andActionIsNull() {
            addCriterion("MSG_ACTION is null");
            return (Criteria) this;
        }

        public Criteria andActionIsNotNull() {
            addCriterion("MSG_ACTION is not null");
            return (Criteria) this;
        }

        public Criteria andActionEqualTo(String value) {
            addCriterion("MSG_ACTION =", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionNotEqualTo(String value) {
            addCriterion("MSG_ACTION <>", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionGreaterThan(String value) {
            addCriterion("MSG_ACTION >", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionGreaterThanOrEqualTo(String value) {
            addCriterion("MSG_ACTION >=", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionLessThan(String value) {
            addCriterion("MSG_ACTION <", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionLessThanOrEqualTo(String value) {
            addCriterion("MSG_ACTION <=", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionLike(String value) {
            addCriterion("MSG_ACTION like", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionNotLike(String value) {
            addCriterion("MSG_ACTION not like", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionIn(List<String> values) {
            addCriterion("MSG_ACTION in", values, "action");
            return (Criteria) this;
        }

        public Criteria andActionNotIn(List<String> values) {
            addCriterion("MSG_ACTION not in", values, "action");
            return (Criteria) this;
        }

        public Criteria andActionBetween(String value1, String value2) {
            addCriterion("MSG_ACTION between", value1, value2, "action");
            return (Criteria) this;
        }

        public Criteria andActionNotBetween(String value1, String value2) {
            addCriterion("MSG_ACTION not between", value1, value2, "action");
            return (Criteria) this;
        }

        public Criteria andRc1IsNull() {
            addCriterion("MSG_RC1 is null");
            return (Criteria) this;
        }

        public Criteria andRc1IsNotNull() {
            addCriterion("MSG_RC1 is not null");
            return (Criteria) this;
        }

        public Criteria andRc1EqualTo(String value) {
            addCriterion("MSG_RC1 =", value, "rc1");
            return (Criteria) this;
        }

        public Criteria andRc1NotEqualTo(String value) {
            addCriterion("MSG_RC1 <>", value, "rc1");
            return (Criteria) this;
        }

        public Criteria andRc1GreaterThan(String value) {
            addCriterion("MSG_RC1 >", value, "rc1");
            return (Criteria) this;
        }

        public Criteria andRc1GreaterThanOrEqualTo(String value) {
            addCriterion("MSG_RC1 >=", value, "rc1");
            return (Criteria) this;
        }

        public Criteria andRc1LessThan(String value) {
            addCriterion("MSG_RC1 <", value, "rc1");
            return (Criteria) this;
        }

        public Criteria andRc1LessThanOrEqualTo(String value) {
            addCriterion("MSG_RC1 <=", value, "rc1");
            return (Criteria) this;
        }

        public Criteria andRc1Like(String value) {
            addCriterion("MSG_RC1 like", value, "rc1");
            return (Criteria) this;
        }

        public Criteria andRc1NotLike(String value) {
            addCriterion("MSG_RC1 not like", value, "rc1");
            return (Criteria) this;
        }

        public Criteria andRc1In(List<String> values) {
            addCriterion("MSG_RC1 in", values, "rc1");
            return (Criteria) this;
        }

        public Criteria andRc1NotIn(List<String> values) {
            addCriterion("MSG_RC1 not in", values, "rc1");
            return (Criteria) this;
        }

        public Criteria andRc1Between(String value1, String value2) {
            addCriterion("MSG_RC1 between", value1, value2, "rc1");
            return (Criteria) this;
        }

        public Criteria andRc1NotBetween(String value1, String value2) {
            addCriterion("MSG_RC1 not between", value1, value2, "rc1");
            return (Criteria) this;
        }

        public Criteria andRc2IsNull() {
            addCriterion("MSG_RC2 is null");
            return (Criteria) this;
        }

        public Criteria andRc2IsNotNull() {
            addCriterion("MSG_RC2 is not null");
            return (Criteria) this;
        }

        public Criteria andRc2EqualTo(String value) {
            addCriterion("MSG_RC2 =", value, "rc2");
            return (Criteria) this;
        }

        public Criteria andRc2NotEqualTo(String value) {
            addCriterion("MSG_RC2 <>", value, "rc2");
            return (Criteria) this;
        }

        public Criteria andRc2GreaterThan(String value) {
            addCriterion("MSG_RC2 >", value, "rc2");
            return (Criteria) this;
        }

        public Criteria andRc2GreaterThanOrEqualTo(String value) {
            addCriterion("MSG_RC2 >=", value, "rc2");
            return (Criteria) this;
        }

        public Criteria andRc2LessThan(String value) {
            addCriterion("MSG_RC2 <", value, "rc2");
            return (Criteria) this;
        }

        public Criteria andRc2LessThanOrEqualTo(String value) {
            addCriterion("MSG_RC2 <=", value, "rc2");
            return (Criteria) this;
        }

        public Criteria andRc2Like(String value) {
            addCriterion("MSG_RC2 like", value, "rc2");
            return (Criteria) this;
        }

        public Criteria andRc2NotLike(String value) {
            addCriterion("MSG_RC2 not like", value, "rc2");
            return (Criteria) this;
        }

        public Criteria andRc2In(List<String> values) {
            addCriterion("MSG_RC2 in", values, "rc2");
            return (Criteria) this;
        }

        public Criteria andRc2NotIn(List<String> values) {
            addCriterion("MSG_RC2 not in", values, "rc2");
            return (Criteria) this;
        }

        public Criteria andRc2Between(String value1, String value2) {
            addCriterion("MSG_RC2 between", value1, value2, "rc2");
            return (Criteria) this;
        }

        public Criteria andRc2NotBetween(String value1, String value2) {
            addCriterion("MSG_RC2 not between", value1, value2, "rc2");
            return (Criteria) this;
        }

        public Criteria andRc3IsNull() {
            addCriterion("MSG_RC3 is null");
            return (Criteria) this;
        }

        public Criteria andRc3IsNotNull() {
            addCriterion("MSG_RC3 is not null");
            return (Criteria) this;
        }

        public Criteria andRc3EqualTo(Short value) {
            addCriterion("MSG_RC3 =", value, "rc3");
            return (Criteria) this;
        }

        public Criteria andRc3NotEqualTo(Short value) {
            addCriterion("MSG_RC3 <>", value, "rc3");
            return (Criteria) this;
        }

        public Criteria andRc3GreaterThan(Short value) {
            addCriterion("MSG_RC3 >", value, "rc3");
            return (Criteria) this;
        }

        public Criteria andRc3GreaterThanOrEqualTo(Short value) {
            addCriterion("MSG_RC3 >=", value, "rc3");
            return (Criteria) this;
        }

        public Criteria andRc3LessThan(Short value) {
            addCriterion("MSG_RC3 <", value, "rc3");
            return (Criteria) this;
        }

        public Criteria andRc3LessThanOrEqualTo(Short value) {
            addCriterion("MSG_RC3 <=", value, "rc3");
            return (Criteria) this;
        }

        public Criteria andRc3In(List<Short> values) {
            addCriterion("MSG_RC3 in", values, "rc3");
            return (Criteria) this;
        }

        public Criteria andRc3NotIn(List<Short> values) {
            addCriterion("MSG_RC3 not in", values, "rc3");
            return (Criteria) this;
        }

        public Criteria andRc3Between(Short value1, Short value2) {
            addCriterion("MSG_RC3 between", value1, value2, "rc3");
            return (Criteria) this;
        }

        public Criteria andRc3NotBetween(Short value1, Short value2) {
            addCriterion("MSG_RC3 not between", value1, value2, "rc3");
            return (Criteria) this;
        }

        public Criteria andRc4IsNull() {
            addCriterion("MSG_RC4 is null");
            return (Criteria) this;
        }

        public Criteria andRc4IsNotNull() {
            addCriterion("MSG_RC4 is not null");
            return (Criteria) this;
        }

        public Criteria andRc4EqualTo(Short value) {
            addCriterion("MSG_RC4 =", value, "rc4");
            return (Criteria) this;
        }

        public Criteria andRc4NotEqualTo(Short value) {
            addCriterion("MSG_RC4 <>", value, "rc4");
            return (Criteria) this;
        }

        public Criteria andRc4GreaterThan(Short value) {
            addCriterion("MSG_RC4 >", value, "rc4");
            return (Criteria) this;
        }

        public Criteria andRc4GreaterThanOrEqualTo(Short value) {
            addCriterion("MSG_RC4 >=", value, "rc4");
            return (Criteria) this;
        }

        public Criteria andRc4LessThan(Short value) {
            addCriterion("MSG_RC4 <", value, "rc4");
            return (Criteria) this;
        }

        public Criteria andRc4LessThanOrEqualTo(Short value) {
            addCriterion("MSG_RC4 <=", value, "rc4");
            return (Criteria) this;
        }

        public Criteria andRc4In(List<Short> values) {
            addCriterion("MSG_RC4 in", values, "rc4");
            return (Criteria) this;
        }

        public Criteria andRc4NotIn(List<Short> values) {
            addCriterion("MSG_RC4 not in", values, "rc4");
            return (Criteria) this;
        }

        public Criteria andRc4Between(Short value1, Short value2) {
            addCriterion("MSG_RC4 between", value1, value2, "rc4");
            return (Criteria) this;
        }

        public Criteria andRc4NotBetween(Short value1, Short value2) {
            addCriterion("MSG_RC4 not between", value1, value2, "rc4");
            return (Criteria) this;
        }

        public Criteria andRc5IsNull() {
            addCriterion("MSG_RC5 is null");
            return (Criteria) this;
        }

        public Criteria andRc5IsNotNull() {
            addCriterion("MSG_RC5 is not null");
            return (Criteria) this;
        }

        public Criteria andRc5EqualTo(Date value) {
            addCriterion("MSG_RC5 =", value, "rc5");
            return (Criteria) this;
        }

        public Criteria andRc5NotEqualTo(Date value) {
            addCriterion("MSG_RC5 <>", value, "rc5");
            return (Criteria) this;
        }

        public Criteria andRc5GreaterThan(Date value) {
            addCriterion("MSG_RC5 >", value, "rc5");
            return (Criteria) this;
        }

        public Criteria andRc5GreaterThanOrEqualTo(Date value) {
            addCriterion("MSG_RC5 >=", value, "rc5");
            return (Criteria) this;
        }

        public Criteria andRc5LessThan(Date value) {
            addCriterion("MSG_RC5 <", value, "rc5");
            return (Criteria) this;
        }

        public Criteria andRc5LessThanOrEqualTo(Date value) {
            addCriterion("MSG_RC5 <=", value, "rc5");
            return (Criteria) this;
        }

        public Criteria andRc5In(List<Date> values) {
            addCriterion("MSG_RC5 in", values, "rc5");
            return (Criteria) this;
        }

        public Criteria andRc5NotIn(List<Date> values) {
            addCriterion("MSG_RC5 not in", values, "rc5");
            return (Criteria) this;
        }

        public Criteria andRc5Between(Date value1, Date value2) {
            addCriterion("MSG_RC5 between", value1, value2, "rc5");
            return (Criteria) this;
        }

        public Criteria andRc5NotBetween(Date value1, Date value2) {
            addCriterion("MSG_RC5 not between", value1, value2, "rc5");
            return (Criteria) this;
        }

        public Criteria andIdLikeInsensitive(String value) {
            addCriterion("upper(MSG_ID) like", value.toUpperCase(), "id");
            return (Criteria) this;
        }

        public Criteria andTitleLikeInsensitive(String value) {
            addCriterion("upper(MSG_TITLE) like", value.toUpperCase(), "title");
            return (Criteria) this;
        }

        public Criteria andIntroLikeInsensitive(String value) {
            addCriterion("upper(MSG_INTRO) like", value.toUpperCase(), "intro");
            return (Criteria) this;
        }

        public Criteria andPathLikeInsensitive(String value) {
            addCriterion("upper(MSG_PATH) like", value.toUpperCase(), "path");
            return (Criteria) this;
        }

        public Criteria andUsridfromLikeInsensitive(String value) {
            addCriterion("upper(MSG_USRIDFROM) like", value.toUpperCase(), "usridfrom");
            return (Criteria) this;
        }

        public Criteria andUsridtoLikeInsensitive(String value) {
            addCriterion("upper(MSG_USRIDTO) like", value.toUpperCase(), "usridto");
            return (Criteria) this;
        }

        public Criteria andActionLikeInsensitive(String value) {
            addCriterion("upper(MSG_ACTION) like", value.toUpperCase(), "action");
            return (Criteria) this;
        }

        public Criteria andRc1LikeInsensitive(String value) {
            addCriterion("upper(MSG_RC1) like", value.toUpperCase(), "rc1");
            return (Criteria) this;
        }

        public Criteria andRc2LikeInsensitive(String value) {
            addCriterion("upper(MSG_RC2) like", value.toUpperCase(), "rc2");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}