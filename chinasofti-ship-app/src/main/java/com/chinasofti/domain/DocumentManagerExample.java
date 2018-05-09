package com.chinasofti.domain;

import com.limp.framework.core.bean.Pager;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DocumentManagerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Pager page;

    public DocumentManagerExample() {
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
            addCriterion("CDM_ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("CDM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("CDM_ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("CDM_ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("CDM_ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("CDM_ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("CDM_ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("CDM_ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("CDM_ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("CDM_ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("CDM_ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("CDM_ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("CDM_ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("CDM_ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andRefidIsNull() {
            addCriterion("CDM_REFID is null");
            return (Criteria) this;
        }

        public Criteria andRefidIsNotNull() {
            addCriterion("CDM_REFID is not null");
            return (Criteria) this;
        }

        public Criteria andRefidEqualTo(String value) {
            addCriterion("CDM_REFID =", value, "refid");
            return (Criteria) this;
        }

        public Criteria andRefidNotEqualTo(String value) {
            addCriterion("CDM_REFID <>", value, "refid");
            return (Criteria) this;
        }

        public Criteria andRefidGreaterThan(String value) {
            addCriterion("CDM_REFID >", value, "refid");
            return (Criteria) this;
        }

        public Criteria andRefidGreaterThanOrEqualTo(String value) {
            addCriterion("CDM_REFID >=", value, "refid");
            return (Criteria) this;
        }

        public Criteria andRefidLessThan(String value) {
            addCriterion("CDM_REFID <", value, "refid");
            return (Criteria) this;
        }

        public Criteria andRefidLessThanOrEqualTo(String value) {
            addCriterion("CDM_REFID <=", value, "refid");
            return (Criteria) this;
        }

        public Criteria andRefidLike(String value) {
            addCriterion("CDM_REFID like", value, "refid");
            return (Criteria) this;
        }

        public Criteria andRefidNotLike(String value) {
            addCriterion("CDM_REFID not like", value, "refid");
            return (Criteria) this;
        }

        public Criteria andRefidIn(List<String> values) {
            addCriterion("CDM_REFID in", values, "refid");
            return (Criteria) this;
        }

        public Criteria andRefidNotIn(List<String> values) {
            addCriterion("CDM_REFID not in", values, "refid");
            return (Criteria) this;
        }

        public Criteria andRefidBetween(String value1, String value2) {
            addCriterion("CDM_REFID between", value1, value2, "refid");
            return (Criteria) this;
        }

        public Criteria andRefidNotBetween(String value1, String value2) {
            addCriterion("CDM_REFID not between", value1, value2, "refid");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("CDM_NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("CDM_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("CDM_NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("CDM_NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("CDM_NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("CDM_NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("CDM_NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("CDM_NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("CDM_NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("CDM_NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("CDM_NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("CDM_NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("CDM_NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("CDM_NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andIntroIsNull() {
            addCriterion("CDM_INTRO is null");
            return (Criteria) this;
        }

        public Criteria andIntroIsNotNull() {
            addCriterion("CDM_INTRO is not null");
            return (Criteria) this;
        }

        public Criteria andIntroEqualTo(String value) {
            addCriterion("CDM_INTRO =", value, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroNotEqualTo(String value) {
            addCriterion("CDM_INTRO <>", value, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroGreaterThan(String value) {
            addCriterion("CDM_INTRO >", value, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroGreaterThanOrEqualTo(String value) {
            addCriterion("CDM_INTRO >=", value, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroLessThan(String value) {
            addCriterion("CDM_INTRO <", value, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroLessThanOrEqualTo(String value) {
            addCriterion("CDM_INTRO <=", value, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroLike(String value) {
            addCriterion("CDM_INTRO like", value, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroNotLike(String value) {
            addCriterion("CDM_INTRO not like", value, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroIn(List<String> values) {
            addCriterion("CDM_INTRO in", values, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroNotIn(List<String> values) {
            addCriterion("CDM_INTRO not in", values, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroBetween(String value1, String value2) {
            addCriterion("CDM_INTRO between", value1, value2, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroNotBetween(String value1, String value2) {
            addCriterion("CDM_INTRO not between", value1, value2, "intro");
            return (Criteria) this;
        }

        public Criteria andPathIsNull() {
            addCriterion("CDM_PATH is null");
            return (Criteria) this;
        }

        public Criteria andPathIsNotNull() {
            addCriterion("CDM_PATH is not null");
            return (Criteria) this;
        }

        public Criteria andPathEqualTo(String value) {
            addCriterion("CDM_PATH =", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotEqualTo(String value) {
            addCriterion("CDM_PATH <>", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathGreaterThan(String value) {
            addCriterion("CDM_PATH >", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathGreaterThanOrEqualTo(String value) {
            addCriterion("CDM_PATH >=", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLessThan(String value) {
            addCriterion("CDM_PATH <", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLessThanOrEqualTo(String value) {
            addCriterion("CDM_PATH <=", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLike(String value) {
            addCriterion("CDM_PATH like", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotLike(String value) {
            addCriterion("CDM_PATH not like", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathIn(List<String> values) {
            addCriterion("CDM_PATH in", values, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotIn(List<String> values) {
            addCriterion("CDM_PATH not in", values, "path");
            return (Criteria) this;
        }

        public Criteria andPathBetween(String value1, String value2) {
            addCriterion("CDM_PATH between", value1, value2, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotBetween(String value1, String value2) {
            addCriterion("CDM_PATH not between", value1, value2, "path");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("CDM_URL is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("CDM_URL is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("CDM_URL =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("CDM_URL <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("CDM_URL >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("CDM_URL >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("CDM_URL <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("CDM_URL <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("CDM_URL like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("CDM_URL not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("CDM_URL in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("CDM_URL not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("CDM_URL between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("CDM_URL not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andTypenumIsNull() {
            addCriterion("CDM_TYPENUM is null");
            return (Criteria) this;
        }

        public Criteria andTypenumIsNotNull() {
            addCriterion("CDM_TYPENUM is not null");
            return (Criteria) this;
        }

        public Criteria andTypenumEqualTo(String value) {
            addCriterion("CDM_TYPENUM =", value, "typenum");
            return (Criteria) this;
        }

        public Criteria andTypenumNotEqualTo(String value) {
            addCriterion("CDM_TYPENUM <>", value, "typenum");
            return (Criteria) this;
        }

        public Criteria andTypenumGreaterThan(String value) {
            addCriterion("CDM_TYPENUM >", value, "typenum");
            return (Criteria) this;
        }

        public Criteria andTypenumGreaterThanOrEqualTo(String value) {
            addCriterion("CDM_TYPENUM >=", value, "typenum");
            return (Criteria) this;
        }

        public Criteria andTypenumLessThan(String value) {
            addCriterion("CDM_TYPENUM <", value, "typenum");
            return (Criteria) this;
        }

        public Criteria andTypenumLessThanOrEqualTo(String value) {
            addCriterion("CDM_TYPENUM <=", value, "typenum");
            return (Criteria) this;
        }

        public Criteria andTypenumLike(String value) {
            addCriterion("CDM_TYPENUM like", value, "typenum");
            return (Criteria) this;
        }

        public Criteria andTypenumNotLike(String value) {
            addCriterion("CDM_TYPENUM not like", value, "typenum");
            return (Criteria) this;
        }

        public Criteria andTypenumIn(List<String> values) {
            addCriterion("CDM_TYPENUM in", values, "typenum");
            return (Criteria) this;
        }

        public Criteria andTypenumNotIn(List<String> values) {
            addCriterion("CDM_TYPENUM not in", values, "typenum");
            return (Criteria) this;
        }

        public Criteria andTypenumBetween(String value1, String value2) {
            addCriterion("CDM_TYPENUM between", value1, value2, "typenum");
            return (Criteria) this;
        }

        public Criteria andTypenumNotBetween(String value1, String value2) {
            addCriterion("CDM_TYPENUM not between", value1, value2, "typenum");
            return (Criteria) this;
        }

        public Criteria andOrderIsNull() {
            addCriterion("CDM_ORDER is null");
            return (Criteria) this;
        }

        public Criteria andOrderIsNotNull() {
            addCriterion("CDM_ORDER is not null");
            return (Criteria) this;
        }

        public Criteria andOrderEqualTo(Short value) {
            addCriterion("CDM_ORDER =", value, "order");
            return (Criteria) this;
        }

        public Criteria andOrderNotEqualTo(Short value) {
            addCriterion("CDM_ORDER <>", value, "order");
            return (Criteria) this;
        }

        public Criteria andOrderGreaterThan(Short value) {
            addCriterion("CDM_ORDER >", value, "order");
            return (Criteria) this;
        }

        public Criteria andOrderGreaterThanOrEqualTo(Short value) {
            addCriterion("CDM_ORDER >=", value, "order");
            return (Criteria) this;
        }

        public Criteria andOrderLessThan(Short value) {
            addCriterion("CDM_ORDER <", value, "order");
            return (Criteria) this;
        }

        public Criteria andOrderLessThanOrEqualTo(Short value) {
            addCriterion("CDM_ORDER <=", value, "order");
            return (Criteria) this;
        }

        public Criteria andOrderIn(List<Short> values) {
            addCriterion("CDM_ORDER in", values, "order");
            return (Criteria) this;
        }

        public Criteria andOrderNotIn(List<Short> values) {
            addCriterion("CDM_ORDER not in", values, "order");
            return (Criteria) this;
        }

        public Criteria andOrderBetween(Short value1, Short value2) {
            addCriterion("CDM_ORDER between", value1, value2, "order");
            return (Criteria) this;
        }

        public Criteria andOrderNotBetween(Short value1, Short value2) {
            addCriterion("CDM_ORDER not between", value1, value2, "order");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("CDM_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("CDM_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Short value) {
            addCriterion("CDM_STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Short value) {
            addCriterion("CDM_STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Short value) {
            addCriterion("CDM_STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("CDM_STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Short value) {
            addCriterion("CDM_STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Short value) {
            addCriterion("CDM_STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Short> values) {
            addCriterion("CDM_STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Short> values) {
            addCriterion("CDM_STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Short value1, Short value2) {
            addCriterion("CDM_STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Short value1, Short value2) {
            addCriterion("CDM_STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andIdtIsNull() {
            addCriterion("CDM_IDT is null");
            return (Criteria) this;
        }

        public Criteria andIdtIsNotNull() {
            addCriterion("CDM_IDT is not null");
            return (Criteria) this;
        }

        public Criteria andIdtEqualTo(Object value) {
            addCriterion("CDM_IDT =", value, "idt");
            return (Criteria) this;
        }

        public Criteria andIdtNotEqualTo(Object value) {
            addCriterion("CDM_IDT <>", value, "idt");
            return (Criteria) this;
        }

        public Criteria andIdtGreaterThan(Object value) {
            addCriterion("CDM_IDT >", value, "idt");
            return (Criteria) this;
        }

        public Criteria andIdtGreaterThanOrEqualTo(Object value) {
            addCriterion("CDM_IDT >=", value, "idt");
            return (Criteria) this;
        }

        public Criteria andIdtLessThan(Object value) {
            addCriterion("CDM_IDT <", value, "idt");
            return (Criteria) this;
        }

        public Criteria andIdtLessThanOrEqualTo(Object value) {
            addCriterion("CDM_IDT <=", value, "idt");
            return (Criteria) this;
        }

        public Criteria andIdtIn(List<Object> values) {
            addCriterion("CDM_IDT in", values, "idt");
            return (Criteria) this;
        }

        public Criteria andIdtNotIn(List<Object> values) {
            addCriterion("CDM_IDT not in", values, "idt");
            return (Criteria) this;
        }

        public Criteria andIdtBetween(Object value1, Object value2) {
            addCriterion("CDM_IDT between", value1, value2, "idt");
            return (Criteria) this;
        }

        public Criteria andIdtNotBetween(Object value1, Object value2) {
            addCriterion("CDM_IDT not between", value1, value2, "idt");
            return (Criteria) this;
        }

        public Criteria andUdtIsNull() {
            addCriterion("CDM_UDT is null");
            return (Criteria) this;
        }

        public Criteria andUdtIsNotNull() {
            addCriterion("CDM_UDT is not null");
            return (Criteria) this;
        }

        public Criteria andUdtEqualTo(Object value) {
            addCriterion("CDM_UDT =", value, "udt");
            return (Criteria) this;
        }

        public Criteria andUdtNotEqualTo(Object value) {
            addCriterion("CDM_UDT <>", value, "udt");
            return (Criteria) this;
        }

        public Criteria andUdtGreaterThan(Object value) {
            addCriterion("CDM_UDT >", value, "udt");
            return (Criteria) this;
        }

        public Criteria andUdtGreaterThanOrEqualTo(Object value) {
            addCriterion("CDM_UDT >=", value, "udt");
            return (Criteria) this;
        }

        public Criteria andUdtLessThan(Object value) {
            addCriterion("CDM_UDT <", value, "udt");
            return (Criteria) this;
        }

        public Criteria andUdtLessThanOrEqualTo(Object value) {
            addCriterion("CDM_UDT <=", value, "udt");
            return (Criteria) this;
        }

        public Criteria andUdtIn(List<Object> values) {
            addCriterion("CDM_UDT in", values, "udt");
            return (Criteria) this;
        }

        public Criteria andUdtNotIn(List<Object> values) {
            addCriterion("CDM_UDT not in", values, "udt");
            return (Criteria) this;
        }

        public Criteria andUdtBetween(Object value1, Object value2) {
            addCriterion("CDM_UDT between", value1, value2, "udt");
            return (Criteria) this;
        }

        public Criteria andUdtNotBetween(Object value1, Object value2) {
            addCriterion("CDM_UDT not between", value1, value2, "udt");
            return (Criteria) this;
        }

        public Criteria andRc1IsNull() {
            addCriterion("CDM_RC1 is null");
            return (Criteria) this;
        }

        public Criteria andRc1IsNotNull() {
            addCriterion("CDM_RC1 is not null");
            return (Criteria) this;
        }

        public Criteria andRc1EqualTo(String value) {
            addCriterion("CDM_RC1 =", value, "rc1");
            return (Criteria) this;
        }

        public Criteria andRc1NotEqualTo(String value) {
            addCriterion("CDM_RC1 <>", value, "rc1");
            return (Criteria) this;
        }

        public Criteria andRc1GreaterThan(String value) {
            addCriterion("CDM_RC1 >", value, "rc1");
            return (Criteria) this;
        }

        public Criteria andRc1GreaterThanOrEqualTo(String value) {
            addCriterion("CDM_RC1 >=", value, "rc1");
            return (Criteria) this;
        }

        public Criteria andRc1LessThan(String value) {
            addCriterion("CDM_RC1 <", value, "rc1");
            return (Criteria) this;
        }

        public Criteria andRc1LessThanOrEqualTo(String value) {
            addCriterion("CDM_RC1 <=", value, "rc1");
            return (Criteria) this;
        }

        public Criteria andRc1Like(String value) {
            addCriterion("CDM_RC1 like", value, "rc1");
            return (Criteria) this;
        }

        public Criteria andRc1NotLike(String value) {
            addCriterion("CDM_RC1 not like", value, "rc1");
            return (Criteria) this;
        }

        public Criteria andRc1In(List<String> values) {
            addCriterion("CDM_RC1 in", values, "rc1");
            return (Criteria) this;
        }

        public Criteria andRc1NotIn(List<String> values) {
            addCriterion("CDM_RC1 not in", values, "rc1");
            return (Criteria) this;
        }

        public Criteria andRc1Between(String value1, String value2) {
            addCriterion("CDM_RC1 between", value1, value2, "rc1");
            return (Criteria) this;
        }

        public Criteria andRc1NotBetween(String value1, String value2) {
            addCriterion("CDM_RC1 not between", value1, value2, "rc1");
            return (Criteria) this;
        }

        public Criteria andRc2IsNull() {
            addCriterion("CDM_RC2 is null");
            return (Criteria) this;
        }

        public Criteria andRc2IsNotNull() {
            addCriterion("CDM_RC2 is not null");
            return (Criteria) this;
        }

        public Criteria andRc2EqualTo(String value) {
            addCriterion("CDM_RC2 =", value, "rc2");
            return (Criteria) this;
        }

        public Criteria andRc2NotEqualTo(String value) {
            addCriterion("CDM_RC2 <>", value, "rc2");
            return (Criteria) this;
        }

        public Criteria andRc2GreaterThan(String value) {
            addCriterion("CDM_RC2 >", value, "rc2");
            return (Criteria) this;
        }

        public Criteria andRc2GreaterThanOrEqualTo(String value) {
            addCriterion("CDM_RC2 >=", value, "rc2");
            return (Criteria) this;
        }

        public Criteria andRc2LessThan(String value) {
            addCriterion("CDM_RC2 <", value, "rc2");
            return (Criteria) this;
        }

        public Criteria andRc2LessThanOrEqualTo(String value) {
            addCriterion("CDM_RC2 <=", value, "rc2");
            return (Criteria) this;
        }

        public Criteria andRc2Like(String value) {
            addCriterion("CDM_RC2 like", value, "rc2");
            return (Criteria) this;
        }

        public Criteria andRc2NotLike(String value) {
            addCriterion("CDM_RC2 not like", value, "rc2");
            return (Criteria) this;
        }

        public Criteria andRc2In(List<String> values) {
            addCriterion("CDM_RC2 in", values, "rc2");
            return (Criteria) this;
        }

        public Criteria andRc2NotIn(List<String> values) {
            addCriterion("CDM_RC2 not in", values, "rc2");
            return (Criteria) this;
        }

        public Criteria andRc2Between(String value1, String value2) {
            addCriterion("CDM_RC2 between", value1, value2, "rc2");
            return (Criteria) this;
        }

        public Criteria andRc2NotBetween(String value1, String value2) {
            addCriterion("CDM_RC2 not between", value1, value2, "rc2");
            return (Criteria) this;
        }

        public Criteria andRc3IsNull() {
            addCriterion("CDM_RC3 is null");
            return (Criteria) this;
        }

        public Criteria andRc3IsNotNull() {
            addCriterion("CDM_RC3 is not null");
            return (Criteria) this;
        }

        public Criteria andRc3EqualTo(Date value) {
            addCriterion("CDM_RC3 =", value, "rc3");
            return (Criteria) this;
        }

        public Criteria andRc3NotEqualTo(Date value) {
            addCriterion("CDM_RC3 <>", value, "rc3");
            return (Criteria) this;
        }

        public Criteria andRc3GreaterThan(Date value) {
            addCriterion("CDM_RC3 >", value, "rc3");
            return (Criteria) this;
        }

        public Criteria andRc3GreaterThanOrEqualTo(Date value) {
            addCriterion("CDM_RC3 >=", value, "rc3");
            return (Criteria) this;
        }

        public Criteria andRc3LessThan(Date value) {
            addCriterion("CDM_RC3 <", value, "rc3");
            return (Criteria) this;
        }

        public Criteria andRc3LessThanOrEqualTo(Date value) {
            addCriterion("CDM_RC3 <=", value, "rc3");
            return (Criteria) this;
        }

        public Criteria andRc3In(List<Date> values) {
            addCriterion("CDM_RC3 in", values, "rc3");
            return (Criteria) this;
        }

        public Criteria andRc3NotIn(List<Date> values) {
            addCriterion("CDM_RC3 not in", values, "rc3");
            return (Criteria) this;
        }

        public Criteria andRc3Between(Date value1, Date value2) {
            addCriterion("CDM_RC3 between", value1, value2, "rc3");
            return (Criteria) this;
        }

        public Criteria andRc3NotBetween(Date value1, Date value2) {
            addCriterion("CDM_RC3 not between", value1, value2, "rc3");
            return (Criteria) this;
        }

        public Criteria andRc4IsNull() {
            addCriterion("CDM_RC4 is null");
            return (Criteria) this;
        }

        public Criteria andRc4IsNotNull() {
            addCriterion("CDM_RC4 is not null");
            return (Criteria) this;
        }

        public Criteria andRc4EqualTo(Date value) {
            addCriterion("CDM_RC4 =", value, "rc4");
            return (Criteria) this;
        }

        public Criteria andRc4NotEqualTo(Date value) {
            addCriterion("CDM_RC4 <>", value, "rc4");
            return (Criteria) this;
        }

        public Criteria andRc4GreaterThan(Date value) {
            addCriterion("CDM_RC4 >", value, "rc4");
            return (Criteria) this;
        }

        public Criteria andRc4GreaterThanOrEqualTo(Date value) {
            addCriterion("CDM_RC4 >=", value, "rc4");
            return (Criteria) this;
        }

        public Criteria andRc4LessThan(Date value) {
            addCriterion("CDM_RC4 <", value, "rc4");
            return (Criteria) this;
        }

        public Criteria andRc4LessThanOrEqualTo(Date value) {
            addCriterion("CDM_RC4 <=", value, "rc4");
            return (Criteria) this;
        }

        public Criteria andRc4In(List<Date> values) {
            addCriterion("CDM_RC4 in", values, "rc4");
            return (Criteria) this;
        }

        public Criteria andRc4NotIn(List<Date> values) {
            addCriterion("CDM_RC4 not in", values, "rc4");
            return (Criteria) this;
        }

        public Criteria andRc4Between(Date value1, Date value2) {
            addCriterion("CDM_RC4 between", value1, value2, "rc4");
            return (Criteria) this;
        }

        public Criteria andRc4NotBetween(Date value1, Date value2) {
            addCriterion("CDM_RC4 not between", value1, value2, "rc4");
            return (Criteria) this;
        }

        public Criteria andRc5IsNull() {
            addCriterion("CDM_RC5 is null");
            return (Criteria) this;
        }

        public Criteria andRc5IsNotNull() {
            addCriterion("CDM_RC5 is not null");
            return (Criteria) this;
        }

        public Criteria andRc5EqualTo(Short value) {
            addCriterion("CDM_RC5 =", value, "rc5");
            return (Criteria) this;
        }

        public Criteria andRc5NotEqualTo(Short value) {
            addCriterion("CDM_RC5 <>", value, "rc5");
            return (Criteria) this;
        }

        public Criteria andRc5GreaterThan(Short value) {
            addCriterion("CDM_RC5 >", value, "rc5");
            return (Criteria) this;
        }

        public Criteria andRc5GreaterThanOrEqualTo(Short value) {
            addCriterion("CDM_RC5 >=", value, "rc5");
            return (Criteria) this;
        }

        public Criteria andRc5LessThan(Short value) {
            addCriterion("CDM_RC5 <", value, "rc5");
            return (Criteria) this;
        }

        public Criteria andRc5LessThanOrEqualTo(Short value) {
            addCriterion("CDM_RC5 <=", value, "rc5");
            return (Criteria) this;
        }

        public Criteria andRc5In(List<Short> values) {
            addCriterion("CDM_RC5 in", values, "rc5");
            return (Criteria) this;
        }

        public Criteria andRc5NotIn(List<Short> values) {
            addCriterion("CDM_RC5 not in", values, "rc5");
            return (Criteria) this;
        }

        public Criteria andRc5Between(Short value1, Short value2) {
            addCriterion("CDM_RC5 between", value1, value2, "rc5");
            return (Criteria) this;
        }

        public Criteria andRc5NotBetween(Short value1, Short value2) {
            addCriterion("CDM_RC5 not between", value1, value2, "rc5");
            return (Criteria) this;
        }

        public Criteria andRefid2IsNull() {
            addCriterion("CDM_REFID2 is null");
            return (Criteria) this;
        }

        public Criteria andRefid2IsNotNull() {
            addCriterion("CDM_REFID2 is not null");
            return (Criteria) this;
        }

        public Criteria andRefid2EqualTo(String value) {
            addCriterion("CDM_REFID2 =", value, "refid2");
            return (Criteria) this;
        }

        public Criteria andRefid2NotEqualTo(String value) {
            addCriterion("CDM_REFID2 <>", value, "refid2");
            return (Criteria) this;
        }

        public Criteria andRefid2GreaterThan(String value) {
            addCriterion("CDM_REFID2 >", value, "refid2");
            return (Criteria) this;
        }

        public Criteria andRefid2GreaterThanOrEqualTo(String value) {
            addCriterion("CDM_REFID2 >=", value, "refid2");
            return (Criteria) this;
        }

        public Criteria andRefid2LessThan(String value) {
            addCriterion("CDM_REFID2 <", value, "refid2");
            return (Criteria) this;
        }

        public Criteria andRefid2LessThanOrEqualTo(String value) {
            addCriterion("CDM_REFID2 <=", value, "refid2");
            return (Criteria) this;
        }

        public Criteria andRefid2Like(String value) {
            addCriterion("CDM_REFID2 like", value, "refid2");
            return (Criteria) this;
        }

        public Criteria andRefid2NotLike(String value) {
            addCriterion("CDM_REFID2 not like", value, "refid2");
            return (Criteria) this;
        }

        public Criteria andRefid2In(List<String> values) {
            addCriterion("CDM_REFID2 in", values, "refid2");
            return (Criteria) this;
        }

        public Criteria andRefid2NotIn(List<String> values) {
            addCriterion("CDM_REFID2 not in", values, "refid2");
            return (Criteria) this;
        }

        public Criteria andRefid2Between(String value1, String value2) {
            addCriterion("CDM_REFID2 between", value1, value2, "refid2");
            return (Criteria) this;
        }

        public Criteria andRefid2NotBetween(String value1, String value2) {
            addCriterion("CDM_REFID2 not between", value1, value2, "refid2");
            return (Criteria) this;
        }

        public Criteria andTypenameIsNull() {
            addCriterion("CDM_TYPENAME is null");
            return (Criteria) this;
        }

        public Criteria andTypenameIsNotNull() {
            addCriterion("CDM_TYPENAME is not null");
            return (Criteria) this;
        }

        public Criteria andTypenameEqualTo(String value) {
            addCriterion("CDM_TYPENAME =", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameNotEqualTo(String value) {
            addCriterion("CDM_TYPENAME <>", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameGreaterThan(String value) {
            addCriterion("CDM_TYPENAME >", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameGreaterThanOrEqualTo(String value) {
            addCriterion("CDM_TYPENAME >=", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameLessThan(String value) {
            addCriterion("CDM_TYPENAME <", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameLessThanOrEqualTo(String value) {
            addCriterion("CDM_TYPENAME <=", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameLike(String value) {
            addCriterion("CDM_TYPENAME like", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameNotLike(String value) {
            addCriterion("CDM_TYPENAME not like", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameIn(List<String> values) {
            addCriterion("CDM_TYPENAME in", values, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameNotIn(List<String> values) {
            addCriterion("CDM_TYPENAME not in", values, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameBetween(String value1, String value2) {
            addCriterion("CDM_TYPENAME between", value1, value2, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameNotBetween(String value1, String value2) {
            addCriterion("CDM_TYPENAME not between", value1, value2, "typename");
            return (Criteria) this;
        }

        public Criteria andIdLikeInsensitive(String value) {
            addCriterion("upper(CDM_ID) like", value.toUpperCase(), "id");
            return (Criteria) this;
        }

        public Criteria andRefidLikeInsensitive(String value) {
            addCriterion("upper(CDM_REFID) like", value.toUpperCase(), "refid");
            return (Criteria) this;
        }

        public Criteria andNameLikeInsensitive(String value) {
            addCriterion("upper(CDM_NAME) like", value.toUpperCase(), "name");
            return (Criteria) this;
        }

        public Criteria andIntroLikeInsensitive(String value) {
            addCriterion("upper(CDM_INTRO) like", value.toUpperCase(), "intro");
            return (Criteria) this;
        }

        public Criteria andPathLikeInsensitive(String value) {
            addCriterion("upper(CDM_PATH) like", value.toUpperCase(), "path");
            return (Criteria) this;
        }

        public Criteria andUrlLikeInsensitive(String value) {
            addCriterion("upper(CDM_URL) like", value.toUpperCase(), "url");
            return (Criteria) this;
        }

        public Criteria andTypenumLikeInsensitive(String value) {
            addCriterion("upper(CDM_TYPENUM) like", value.toUpperCase(), "typenum");
            return (Criteria) this;
        }

        public Criteria andRc1LikeInsensitive(String value) {
            addCriterion("upper(CDM_RC1) like", value.toUpperCase(), "rc1");
            return (Criteria) this;
        }

        public Criteria andRc2LikeInsensitive(String value) {
            addCriterion("upper(CDM_RC2) like", value.toUpperCase(), "rc2");
            return (Criteria) this;
        }

        public Criteria andRefid2LikeInsensitive(String value) {
            addCriterion("upper(CDM_REFID2) like", value.toUpperCase(), "refid2");
            return (Criteria) this;
        }

        public Criteria andTypenameLikeInsensitive(String value) {
            addCriterion("upper(CDM_TYPENAME) like", value.toUpperCase(), "typename");
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