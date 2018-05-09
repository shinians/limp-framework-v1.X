package com.limp.framework.boss.domain;

import com.limp.framework.core.bean.Pager;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PermissionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Pager page;

    public PermissionExample() {
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
            addCriterion("PER_ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("PER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("PER_ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("PER_ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("PER_ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("PER_ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("PER_ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("PER_ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("PER_ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("PER_ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("PER_ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("PER_ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("PER_ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("PER_ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("PER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("PER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("PER_NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("PER_NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("PER_NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("PER_NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("PER_NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("PER_NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("PER_NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("PER_NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("PER_NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("PER_NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("PER_NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("PER_NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andIntroIsNull() {
            addCriterion("PER_INTRO is null");
            return (Criteria) this;
        }

        public Criteria andIntroIsNotNull() {
            addCriterion("PER_INTRO is not null");
            return (Criteria) this;
        }

        public Criteria andIntroEqualTo(String value) {
            addCriterion("PER_INTRO =", value, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroNotEqualTo(String value) {
            addCriterion("PER_INTRO <>", value, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroGreaterThan(String value) {
            addCriterion("PER_INTRO >", value, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroGreaterThanOrEqualTo(String value) {
            addCriterion("PER_INTRO >=", value, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroLessThan(String value) {
            addCriterion("PER_INTRO <", value, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroLessThanOrEqualTo(String value) {
            addCriterion("PER_INTRO <=", value, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroLike(String value) {
            addCriterion("PER_INTRO like", value, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroNotLike(String value) {
            addCriterion("PER_INTRO not like", value, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroIn(List<String> values) {
            addCriterion("PER_INTRO in", values, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroNotIn(List<String> values) {
            addCriterion("PER_INTRO not in", values, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroBetween(String value1, String value2) {
            addCriterion("PER_INTRO between", value1, value2, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroNotBetween(String value1, String value2) {
            addCriterion("PER_INTRO not between", value1, value2, "intro");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("PER_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("PER_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Short value) {
            addCriterion("PER_TYPE =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Short value) {
            addCriterion("PER_TYPE <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Short value) {
            addCriterion("PER_TYPE >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("PER_TYPE >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Short value) {
            addCriterion("PER_TYPE <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Short value) {
            addCriterion("PER_TYPE <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Short> values) {
            addCriterion("PER_TYPE in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Short> values) {
            addCriterion("PER_TYPE not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Short value1, Short value2) {
            addCriterion("PER_TYPE between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Short value1, Short value2) {
            addCriterion("PER_TYPE not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeextIsNull() {
            addCriterion("PER_TYPEEXT is null");
            return (Criteria) this;
        }

        public Criteria andTypeextIsNotNull() {
            addCriterion("PER_TYPEEXT is not null");
            return (Criteria) this;
        }

        public Criteria andTypeextEqualTo(String value) {
            addCriterion("PER_TYPEEXT =", value, "typeext");
            return (Criteria) this;
        }

        public Criteria andTypeextNotEqualTo(String value) {
            addCriterion("PER_TYPEEXT <>", value, "typeext");
            return (Criteria) this;
        }

        public Criteria andTypeextGreaterThan(String value) {
            addCriterion("PER_TYPEEXT >", value, "typeext");
            return (Criteria) this;
        }

        public Criteria andTypeextGreaterThanOrEqualTo(String value) {
            addCriterion("PER_TYPEEXT >=", value, "typeext");
            return (Criteria) this;
        }

        public Criteria andTypeextLessThan(String value) {
            addCriterion("PER_TYPEEXT <", value, "typeext");
            return (Criteria) this;
        }

        public Criteria andTypeextLessThanOrEqualTo(String value) {
            addCriterion("PER_TYPEEXT <=", value, "typeext");
            return (Criteria) this;
        }

        public Criteria andTypeextLike(String value) {
            addCriterion("PER_TYPEEXT like", value, "typeext");
            return (Criteria) this;
        }

        public Criteria andTypeextNotLike(String value) {
            addCriterion("PER_TYPEEXT not like", value, "typeext");
            return (Criteria) this;
        }

        public Criteria andTypeextIn(List<String> values) {
            addCriterion("PER_TYPEEXT in", values, "typeext");
            return (Criteria) this;
        }

        public Criteria andTypeextNotIn(List<String> values) {
            addCriterion("PER_TYPEEXT not in", values, "typeext");
            return (Criteria) this;
        }

        public Criteria andTypeextBetween(String value1, String value2) {
            addCriterion("PER_TYPEEXT between", value1, value2, "typeext");
            return (Criteria) this;
        }

        public Criteria andTypeextNotBetween(String value1, String value2) {
            addCriterion("PER_TYPEEXT not between", value1, value2, "typeext");
            return (Criteria) this;
        }

        public Criteria andFatheridIsNull() {
            addCriterion("PER_FATHERID is null");
            return (Criteria) this;
        }

        public Criteria andFatheridIsNotNull() {
            addCriterion("PER_FATHERID is not null");
            return (Criteria) this;
        }

        public Criteria andFatheridEqualTo(String value) {
            addCriterion("PER_FATHERID =", value, "fatherid");
            return (Criteria) this;
        }

        public Criteria andFatheridNotEqualTo(String value) {
            addCriterion("PER_FATHERID <>", value, "fatherid");
            return (Criteria) this;
        }

        public Criteria andFatheridGreaterThan(String value) {
            addCriterion("PER_FATHERID >", value, "fatherid");
            return (Criteria) this;
        }

        public Criteria andFatheridGreaterThanOrEqualTo(String value) {
            addCriterion("PER_FATHERID >=", value, "fatherid");
            return (Criteria) this;
        }

        public Criteria andFatheridLessThan(String value) {
            addCriterion("PER_FATHERID <", value, "fatherid");
            return (Criteria) this;
        }

        public Criteria andFatheridLessThanOrEqualTo(String value) {
            addCriterion("PER_FATHERID <=", value, "fatherid");
            return (Criteria) this;
        }

        public Criteria andFatheridLike(String value) {
            addCriterion("PER_FATHERID like", value, "fatherid");
            return (Criteria) this;
        }

        public Criteria andFatheridNotLike(String value) {
            addCriterion("PER_FATHERID not like", value, "fatherid");
            return (Criteria) this;
        }

        public Criteria andFatheridIn(List<String> values) {
            addCriterion("PER_FATHERID in", values, "fatherid");
            return (Criteria) this;
        }

        public Criteria andFatheridNotIn(List<String> values) {
            addCriterion("PER_FATHERID not in", values, "fatherid");
            return (Criteria) this;
        }

        public Criteria andFatheridBetween(String value1, String value2) {
            addCriterion("PER_FATHERID between", value1, value2, "fatherid");
            return (Criteria) this;
        }

        public Criteria andFatheridNotBetween(String value1, String value2) {
            addCriterion("PER_FATHERID not between", value1, value2, "fatherid");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("PER_URL is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("PER_URL is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("PER_URL =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("PER_URL <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("PER_URL >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("PER_URL >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("PER_URL <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("PER_URL <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("PER_URL like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("PER_URL not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("PER_URL in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("PER_URL not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("PER_URL between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("PER_URL not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrltypeIsNull() {
            addCriterion("PER_URLTYPE is null");
            return (Criteria) this;
        }

        public Criteria andUrltypeIsNotNull() {
            addCriterion("PER_URLTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andUrltypeEqualTo(String value) {
            addCriterion("PER_URLTYPE =", value, "urltype");
            return (Criteria) this;
        }

        public Criteria andUrltypeNotEqualTo(String value) {
            addCriterion("PER_URLTYPE <>", value, "urltype");
            return (Criteria) this;
        }

        public Criteria andUrltypeGreaterThan(String value) {
            addCriterion("PER_URLTYPE >", value, "urltype");
            return (Criteria) this;
        }

        public Criteria andUrltypeGreaterThanOrEqualTo(String value) {
            addCriterion("PER_URLTYPE >=", value, "urltype");
            return (Criteria) this;
        }

        public Criteria andUrltypeLessThan(String value) {
            addCriterion("PER_URLTYPE <", value, "urltype");
            return (Criteria) this;
        }

        public Criteria andUrltypeLessThanOrEqualTo(String value) {
            addCriterion("PER_URLTYPE <=", value, "urltype");
            return (Criteria) this;
        }

        public Criteria andUrltypeLike(String value) {
            addCriterion("PER_URLTYPE like", value, "urltype");
            return (Criteria) this;
        }

        public Criteria andUrltypeNotLike(String value) {
            addCriterion("PER_URLTYPE not like", value, "urltype");
            return (Criteria) this;
        }

        public Criteria andUrltypeIn(List<String> values) {
            addCriterion("PER_URLTYPE in", values, "urltype");
            return (Criteria) this;
        }

        public Criteria andUrltypeNotIn(List<String> values) {
            addCriterion("PER_URLTYPE not in", values, "urltype");
            return (Criteria) this;
        }

        public Criteria andUrltypeBetween(String value1, String value2) {
            addCriterion("PER_URLTYPE between", value1, value2, "urltype");
            return (Criteria) this;
        }

        public Criteria andUrltypeNotBetween(String value1, String value2) {
            addCriterion("PER_URLTYPE not between", value1, value2, "urltype");
            return (Criteria) this;
        }

        public Criteria andClassnameIsNull() {
            addCriterion("PER_CLASSNAME is null");
            return (Criteria) this;
        }

        public Criteria andClassnameIsNotNull() {
            addCriterion("PER_CLASSNAME is not null");
            return (Criteria) this;
        }

        public Criteria andClassnameEqualTo(String value) {
            addCriterion("PER_CLASSNAME =", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameNotEqualTo(String value) {
            addCriterion("PER_CLASSNAME <>", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameGreaterThan(String value) {
            addCriterion("PER_CLASSNAME >", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameGreaterThanOrEqualTo(String value) {
            addCriterion("PER_CLASSNAME >=", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameLessThan(String value) {
            addCriterion("PER_CLASSNAME <", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameLessThanOrEqualTo(String value) {
            addCriterion("PER_CLASSNAME <=", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameLike(String value) {
            addCriterion("PER_CLASSNAME like", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameNotLike(String value) {
            addCriterion("PER_CLASSNAME not like", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameIn(List<String> values) {
            addCriterion("PER_CLASSNAME in", values, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameNotIn(List<String> values) {
            addCriterion("PER_CLASSNAME not in", values, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameBetween(String value1, String value2) {
            addCriterion("PER_CLASSNAME between", value1, value2, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameNotBetween(String value1, String value2) {
            addCriterion("PER_CLASSNAME not between", value1, value2, "classname");
            return (Criteria) this;
        }

        public Criteria andSortIsNull() {
            addCriterion("PER_SORT is null");
            return (Criteria) this;
        }

        public Criteria andSortIsNotNull() {
            addCriterion("PER_SORT is not null");
            return (Criteria) this;
        }

        public Criteria andSortEqualTo(Short value) {
            addCriterion("PER_SORT =", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotEqualTo(Short value) {
            addCriterion("PER_SORT <>", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThan(Short value) {
            addCriterion("PER_SORT >", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThanOrEqualTo(Short value) {
            addCriterion("PER_SORT >=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThan(Short value) {
            addCriterion("PER_SORT <", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThanOrEqualTo(Short value) {
            addCriterion("PER_SORT <=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortIn(List<Short> values) {
            addCriterion("PER_SORT in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotIn(List<Short> values) {
            addCriterion("PER_SORT not in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortBetween(Short value1, Short value2) {
            addCriterion("PER_SORT between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotBetween(Short value1, Short value2) {
            addCriterion("PER_SORT not between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andShowIsNull() {
            addCriterion("PER_SHOW is null");
            return (Criteria) this;
        }

        public Criteria andShowIsNotNull() {
            addCriterion("PER_SHOW is not null");
            return (Criteria) this;
        }

        public Criteria andShowEqualTo(String value) {
            addCriterion("PER_SHOW =", value, "show");
            return (Criteria) this;
        }

        public Criteria andShowNotEqualTo(String value) {
            addCriterion("PER_SHOW <>", value, "show");
            return (Criteria) this;
        }

        public Criteria andShowGreaterThan(String value) {
            addCriterion("PER_SHOW >", value, "show");
            return (Criteria) this;
        }

        public Criteria andShowGreaterThanOrEqualTo(String value) {
            addCriterion("PER_SHOW >=", value, "show");
            return (Criteria) this;
        }

        public Criteria andShowLessThan(String value) {
            addCriterion("PER_SHOW <", value, "show");
            return (Criteria) this;
        }

        public Criteria andShowLessThanOrEqualTo(String value) {
            addCriterion("PER_SHOW <=", value, "show");
            return (Criteria) this;
        }

        public Criteria andShowLike(String value) {
            addCriterion("PER_SHOW like", value, "show");
            return (Criteria) this;
        }

        public Criteria andShowNotLike(String value) {
            addCriterion("PER_SHOW not like", value, "show");
            return (Criteria) this;
        }

        public Criteria andShowIn(List<String> values) {
            addCriterion("PER_SHOW in", values, "show");
            return (Criteria) this;
        }

        public Criteria andShowNotIn(List<String> values) {
            addCriterion("PER_SHOW not in", values, "show");
            return (Criteria) this;
        }

        public Criteria andShowBetween(String value1, String value2) {
            addCriterion("PER_SHOW between", value1, value2, "show");
            return (Criteria) this;
        }

        public Criteria andShowNotBetween(String value1, String value2) {
            addCriterion("PER_SHOW not between", value1, value2, "show");
            return (Criteria) this;
        }

        public Criteria andImgpathIsNull() {
            addCriterion("PER_IMGPATH is null");
            return (Criteria) this;
        }

        public Criteria andImgpathIsNotNull() {
            addCriterion("PER_IMGPATH is not null");
            return (Criteria) this;
        }

        public Criteria andImgpathEqualTo(String value) {
            addCriterion("PER_IMGPATH =", value, "imgpath");
            return (Criteria) this;
        }

        public Criteria andImgpathNotEqualTo(String value) {
            addCriterion("PER_IMGPATH <>", value, "imgpath");
            return (Criteria) this;
        }

        public Criteria andImgpathGreaterThan(String value) {
            addCriterion("PER_IMGPATH >", value, "imgpath");
            return (Criteria) this;
        }

        public Criteria andImgpathGreaterThanOrEqualTo(String value) {
            addCriterion("PER_IMGPATH >=", value, "imgpath");
            return (Criteria) this;
        }

        public Criteria andImgpathLessThan(String value) {
            addCriterion("PER_IMGPATH <", value, "imgpath");
            return (Criteria) this;
        }

        public Criteria andImgpathLessThanOrEqualTo(String value) {
            addCriterion("PER_IMGPATH <=", value, "imgpath");
            return (Criteria) this;
        }

        public Criteria andImgpathLike(String value) {
            addCriterion("PER_IMGPATH like", value, "imgpath");
            return (Criteria) this;
        }

        public Criteria andImgpathNotLike(String value) {
            addCriterion("PER_IMGPATH not like", value, "imgpath");
            return (Criteria) this;
        }

        public Criteria andImgpathIn(List<String> values) {
            addCriterion("PER_IMGPATH in", values, "imgpath");
            return (Criteria) this;
        }

        public Criteria andImgpathNotIn(List<String> values) {
            addCriterion("PER_IMGPATH not in", values, "imgpath");
            return (Criteria) this;
        }

        public Criteria andImgpathBetween(String value1, String value2) {
            addCriterion("PER_IMGPATH between", value1, value2, "imgpath");
            return (Criteria) this;
        }

        public Criteria andImgpathNotBetween(String value1, String value2) {
            addCriterion("PER_IMGPATH not between", value1, value2, "imgpath");
            return (Criteria) this;
        }

        public Criteria andHintsIsNull() {
            addCriterion("PER_HINTS is null");
            return (Criteria) this;
        }

        public Criteria andHintsIsNotNull() {
            addCriterion("PER_HINTS is not null");
            return (Criteria) this;
        }

        public Criteria andHintsEqualTo(Short value) {
            addCriterion("PER_HINTS =", value, "hints");
            return (Criteria) this;
        }

        public Criteria andHintsNotEqualTo(Short value) {
            addCriterion("PER_HINTS <>", value, "hints");
            return (Criteria) this;
        }

        public Criteria andHintsGreaterThan(Short value) {
            addCriterion("PER_HINTS >", value, "hints");
            return (Criteria) this;
        }

        public Criteria andHintsGreaterThanOrEqualTo(Short value) {
            addCriterion("PER_HINTS >=", value, "hints");
            return (Criteria) this;
        }

        public Criteria andHintsLessThan(Short value) {
            addCriterion("PER_HINTS <", value, "hints");
            return (Criteria) this;
        }

        public Criteria andHintsLessThanOrEqualTo(Short value) {
            addCriterion("PER_HINTS <=", value, "hints");
            return (Criteria) this;
        }

        public Criteria andHintsIn(List<Short> values) {
            addCriterion("PER_HINTS in", values, "hints");
            return (Criteria) this;
        }

        public Criteria andHintsNotIn(List<Short> values) {
            addCriterion("PER_HINTS not in", values, "hints");
            return (Criteria) this;
        }

        public Criteria andHintsBetween(Short value1, Short value2) {
            addCriterion("PER_HINTS between", value1, value2, "hints");
            return (Criteria) this;
        }

        public Criteria andHintsNotBetween(Short value1, Short value2) {
            addCriterion("PER_HINTS not between", value1, value2, "hints");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("PER_CODE is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("PER_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("PER_CODE =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("PER_CODE <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("PER_CODE >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PER_CODE >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("PER_CODE <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("PER_CODE <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("PER_CODE like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("PER_CODE not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("PER_CODE in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("PER_CODE not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("PER_CODE between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("PER_CODE not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andMathvalueIsNull() {
            addCriterion("PER_MATHVALUE is null");
            return (Criteria) this;
        }

        public Criteria andMathvalueIsNotNull() {
            addCriterion("PER_MATHVALUE is not null");
            return (Criteria) this;
        }

        public Criteria andMathvalueEqualTo(String value) {
            addCriterion("PER_MATHVALUE =", value, "mathvalue");
            return (Criteria) this;
        }

        public Criteria andMathvalueNotEqualTo(String value) {
            addCriterion("PER_MATHVALUE <>", value, "mathvalue");
            return (Criteria) this;
        }

        public Criteria andMathvalueGreaterThan(String value) {
            addCriterion("PER_MATHVALUE >", value, "mathvalue");
            return (Criteria) this;
        }

        public Criteria andMathvalueGreaterThanOrEqualTo(String value) {
            addCriterion("PER_MATHVALUE >=", value, "mathvalue");
            return (Criteria) this;
        }

        public Criteria andMathvalueLessThan(String value) {
            addCriterion("PER_MATHVALUE <", value, "mathvalue");
            return (Criteria) this;
        }

        public Criteria andMathvalueLessThanOrEqualTo(String value) {
            addCriterion("PER_MATHVALUE <=", value, "mathvalue");
            return (Criteria) this;
        }

        public Criteria andMathvalueLike(String value) {
            addCriterion("PER_MATHVALUE like", value, "mathvalue");
            return (Criteria) this;
        }

        public Criteria andMathvalueNotLike(String value) {
            addCriterion("PER_MATHVALUE not like", value, "mathvalue");
            return (Criteria) this;
        }

        public Criteria andMathvalueIn(List<String> values) {
            addCriterion("PER_MATHVALUE in", values, "mathvalue");
            return (Criteria) this;
        }

        public Criteria andMathvalueNotIn(List<String> values) {
            addCriterion("PER_MATHVALUE not in", values, "mathvalue");
            return (Criteria) this;
        }

        public Criteria andMathvalueBetween(String value1, String value2) {
            addCriterion("PER_MATHVALUE between", value1, value2, "mathvalue");
            return (Criteria) this;
        }

        public Criteria andMathvalueNotBetween(String value1, String value2) {
            addCriterion("PER_MATHVALUE not between", value1, value2, "mathvalue");
            return (Criteria) this;
        }

        public Criteria andMathtypeIsNull() {
            addCriterion("PER_MATHTYPE is null");
            return (Criteria) this;
        }

        public Criteria andMathtypeIsNotNull() {
            addCriterion("PER_MATHTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andMathtypeEqualTo(String value) {
            addCriterion("PER_MATHTYPE =", value, "mathtype");
            return (Criteria) this;
        }

        public Criteria andMathtypeNotEqualTo(String value) {
            addCriterion("PER_MATHTYPE <>", value, "mathtype");
            return (Criteria) this;
        }

        public Criteria andMathtypeGreaterThan(String value) {
            addCriterion("PER_MATHTYPE >", value, "mathtype");
            return (Criteria) this;
        }

        public Criteria andMathtypeGreaterThanOrEqualTo(String value) {
            addCriterion("PER_MATHTYPE >=", value, "mathtype");
            return (Criteria) this;
        }

        public Criteria andMathtypeLessThan(String value) {
            addCriterion("PER_MATHTYPE <", value, "mathtype");
            return (Criteria) this;
        }

        public Criteria andMathtypeLessThanOrEqualTo(String value) {
            addCriterion("PER_MATHTYPE <=", value, "mathtype");
            return (Criteria) this;
        }

        public Criteria andMathtypeLike(String value) {
            addCriterion("PER_MATHTYPE like", value, "mathtype");
            return (Criteria) this;
        }

        public Criteria andMathtypeNotLike(String value) {
            addCriterion("PER_MATHTYPE not like", value, "mathtype");
            return (Criteria) this;
        }

        public Criteria andMathtypeIn(List<String> values) {
            addCriterion("PER_MATHTYPE in", values, "mathtype");
            return (Criteria) this;
        }

        public Criteria andMathtypeNotIn(List<String> values) {
            addCriterion("PER_MATHTYPE not in", values, "mathtype");
            return (Criteria) this;
        }

        public Criteria andMathtypeBetween(String value1, String value2) {
            addCriterion("PER_MATHTYPE between", value1, value2, "mathtype");
            return (Criteria) this;
        }

        public Criteria andMathtypeNotBetween(String value1, String value2) {
            addCriterion("PER_MATHTYPE not between", value1, value2, "mathtype");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("PER_STATE is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("PER_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Short value) {
            addCriterion("PER_STATE =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Short value) {
            addCriterion("PER_STATE <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Short value) {
            addCriterion("PER_STATE >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Short value) {
            addCriterion("PER_STATE >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Short value) {
            addCriterion("PER_STATE <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Short value) {
            addCriterion("PER_STATE <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Short> values) {
            addCriterion("PER_STATE in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Short> values) {
            addCriterion("PER_STATE not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Short value1, Short value2) {
            addCriterion("PER_STATE between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Short value1, Short value2) {
            addCriterion("PER_STATE not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andRc0IsNull() {
            addCriterion("PER_RC0 is null");
            return (Criteria) this;
        }

        public Criteria andRc0IsNotNull() {
            addCriterion("PER_RC0 is not null");
            return (Criteria) this;
        }

        public Criteria andRc0EqualTo(String value) {
            addCriterion("PER_RC0 =", value, "rc0");
            return (Criteria) this;
        }

        public Criteria andRc0NotEqualTo(String value) {
            addCriterion("PER_RC0 <>", value, "rc0");
            return (Criteria) this;
        }

        public Criteria andRc0GreaterThan(String value) {
            addCriterion("PER_RC0 >", value, "rc0");
            return (Criteria) this;
        }

        public Criteria andRc0GreaterThanOrEqualTo(String value) {
            addCriterion("PER_RC0 >=", value, "rc0");
            return (Criteria) this;
        }

        public Criteria andRc0LessThan(String value) {
            addCriterion("PER_RC0 <", value, "rc0");
            return (Criteria) this;
        }

        public Criteria andRc0LessThanOrEqualTo(String value) {
            addCriterion("PER_RC0 <=", value, "rc0");
            return (Criteria) this;
        }

        public Criteria andRc0Like(String value) {
            addCriterion("PER_RC0 like", value, "rc0");
            return (Criteria) this;
        }

        public Criteria andRc0NotLike(String value) {
            addCriterion("PER_RC0 not like", value, "rc0");
            return (Criteria) this;
        }

        public Criteria andRc0In(List<String> values) {
            addCriterion("PER_RC0 in", values, "rc0");
            return (Criteria) this;
        }

        public Criteria andRc0NotIn(List<String> values) {
            addCriterion("PER_RC0 not in", values, "rc0");
            return (Criteria) this;
        }

        public Criteria andRc0Between(String value1, String value2) {
            addCriterion("PER_RC0 between", value1, value2, "rc0");
            return (Criteria) this;
        }

        public Criteria andRc0NotBetween(String value1, String value2) {
            addCriterion("PER_RC0 not between", value1, value2, "rc0");
            return (Criteria) this;
        }

        public Criteria andRc1IsNull() {
            addCriterion("PER_RC1 is null");
            return (Criteria) this;
        }

        public Criteria andRc1IsNotNull() {
            addCriterion("PER_RC1 is not null");
            return (Criteria) this;
        }

        public Criteria andRc1EqualTo(String value) {
            addCriterion("PER_RC1 =", value, "rc1");
            return (Criteria) this;
        }

        public Criteria andRc1NotEqualTo(String value) {
            addCriterion("PER_RC1 <>", value, "rc1");
            return (Criteria) this;
        }

        public Criteria andRc1GreaterThan(String value) {
            addCriterion("PER_RC1 >", value, "rc1");
            return (Criteria) this;
        }

        public Criteria andRc1GreaterThanOrEqualTo(String value) {
            addCriterion("PER_RC1 >=", value, "rc1");
            return (Criteria) this;
        }

        public Criteria andRc1LessThan(String value) {
            addCriterion("PER_RC1 <", value, "rc1");
            return (Criteria) this;
        }

        public Criteria andRc1LessThanOrEqualTo(String value) {
            addCriterion("PER_RC1 <=", value, "rc1");
            return (Criteria) this;
        }

        public Criteria andRc1Like(String value) {
            addCriterion("PER_RC1 like", value, "rc1");
            return (Criteria) this;
        }

        public Criteria andRc1NotLike(String value) {
            addCriterion("PER_RC1 not like", value, "rc1");
            return (Criteria) this;
        }

        public Criteria andRc1In(List<String> values) {
            addCriterion("PER_RC1 in", values, "rc1");
            return (Criteria) this;
        }

        public Criteria andRc1NotIn(List<String> values) {
            addCriterion("PER_RC1 not in", values, "rc1");
            return (Criteria) this;
        }

        public Criteria andRc1Between(String value1, String value2) {
            addCriterion("PER_RC1 between", value1, value2, "rc1");
            return (Criteria) this;
        }

        public Criteria andRc1NotBetween(String value1, String value2) {
            addCriterion("PER_RC1 not between", value1, value2, "rc1");
            return (Criteria) this;
        }

        public Criteria andRc2IsNull() {
            addCriterion("PER_RC2 is null");
            return (Criteria) this;
        }

        public Criteria andRc2IsNotNull() {
            addCriterion("PER_RC2 is not null");
            return (Criteria) this;
        }

        public Criteria andRc2EqualTo(String value) {
            addCriterion("PER_RC2 =", value, "rc2");
            return (Criteria) this;
        }

        public Criteria andRc2NotEqualTo(String value) {
            addCriterion("PER_RC2 <>", value, "rc2");
            return (Criteria) this;
        }

        public Criteria andRc2GreaterThan(String value) {
            addCriterion("PER_RC2 >", value, "rc2");
            return (Criteria) this;
        }

        public Criteria andRc2GreaterThanOrEqualTo(String value) {
            addCriterion("PER_RC2 >=", value, "rc2");
            return (Criteria) this;
        }

        public Criteria andRc2LessThan(String value) {
            addCriterion("PER_RC2 <", value, "rc2");
            return (Criteria) this;
        }

        public Criteria andRc2LessThanOrEqualTo(String value) {
            addCriterion("PER_RC2 <=", value, "rc2");
            return (Criteria) this;
        }

        public Criteria andRc2Like(String value) {
            addCriterion("PER_RC2 like", value, "rc2");
            return (Criteria) this;
        }

        public Criteria andRc2NotLike(String value) {
            addCriterion("PER_RC2 not like", value, "rc2");
            return (Criteria) this;
        }

        public Criteria andRc2In(List<String> values) {
            addCriterion("PER_RC2 in", values, "rc2");
            return (Criteria) this;
        }

        public Criteria andRc2NotIn(List<String> values) {
            addCriterion("PER_RC2 not in", values, "rc2");
            return (Criteria) this;
        }

        public Criteria andRc2Between(String value1, String value2) {
            addCriterion("PER_RC2 between", value1, value2, "rc2");
            return (Criteria) this;
        }

        public Criteria andRc2NotBetween(String value1, String value2) {
            addCriterion("PER_RC2 not between", value1, value2, "rc2");
            return (Criteria) this;
        }

        public Criteria andRc3IsNull() {
            addCriterion("PER_RC3 is null");
            return (Criteria) this;
        }

        public Criteria andRc3IsNotNull() {
            addCriterion("PER_RC3 is not null");
            return (Criteria) this;
        }

        public Criteria andRc3EqualTo(String value) {
            addCriterion("PER_RC3 =", value, "rc3");
            return (Criteria) this;
        }

        public Criteria andRc3NotEqualTo(String value) {
            addCriterion("PER_RC3 <>", value, "rc3");
            return (Criteria) this;
        }

        public Criteria andRc3GreaterThan(String value) {
            addCriterion("PER_RC3 >", value, "rc3");
            return (Criteria) this;
        }

        public Criteria andRc3GreaterThanOrEqualTo(String value) {
            addCriterion("PER_RC3 >=", value, "rc3");
            return (Criteria) this;
        }

        public Criteria andRc3LessThan(String value) {
            addCriterion("PER_RC3 <", value, "rc3");
            return (Criteria) this;
        }

        public Criteria andRc3LessThanOrEqualTo(String value) {
            addCriterion("PER_RC3 <=", value, "rc3");
            return (Criteria) this;
        }

        public Criteria andRc3Like(String value) {
            addCriterion("PER_RC3 like", value, "rc3");
            return (Criteria) this;
        }

        public Criteria andRc3NotLike(String value) {
            addCriterion("PER_RC3 not like", value, "rc3");
            return (Criteria) this;
        }

        public Criteria andRc3In(List<String> values) {
            addCriterion("PER_RC3 in", values, "rc3");
            return (Criteria) this;
        }

        public Criteria andRc3NotIn(List<String> values) {
            addCriterion("PER_RC3 not in", values, "rc3");
            return (Criteria) this;
        }

        public Criteria andRc3Between(String value1, String value2) {
            addCriterion("PER_RC3 between", value1, value2, "rc3");
            return (Criteria) this;
        }

        public Criteria andRc3NotBetween(String value1, String value2) {
            addCriterion("PER_RC3 not between", value1, value2, "rc3");
            return (Criteria) this;
        }

        public Criteria andRc4IsNull() {
            addCriterion("PER_RC4 is null");
            return (Criteria) this;
        }

        public Criteria andRc4IsNotNull() {
            addCriterion("PER_RC4 is not null");
            return (Criteria) this;
        }

        public Criteria andRc4EqualTo(String value) {
            addCriterion("PER_RC4 =", value, "rc4");
            return (Criteria) this;
        }

        public Criteria andRc4NotEqualTo(String value) {
            addCriterion("PER_RC4 <>", value, "rc4");
            return (Criteria) this;
        }

        public Criteria andRc4GreaterThan(String value) {
            addCriterion("PER_RC4 >", value, "rc4");
            return (Criteria) this;
        }

        public Criteria andRc4GreaterThanOrEqualTo(String value) {
            addCriterion("PER_RC4 >=", value, "rc4");
            return (Criteria) this;
        }

        public Criteria andRc4LessThan(String value) {
            addCriterion("PER_RC4 <", value, "rc4");
            return (Criteria) this;
        }

        public Criteria andRc4LessThanOrEqualTo(String value) {
            addCriterion("PER_RC4 <=", value, "rc4");
            return (Criteria) this;
        }

        public Criteria andRc4Like(String value) {
            addCriterion("PER_RC4 like", value, "rc4");
            return (Criteria) this;
        }

        public Criteria andRc4NotLike(String value) {
            addCriterion("PER_RC4 not like", value, "rc4");
            return (Criteria) this;
        }

        public Criteria andRc4In(List<String> values) {
            addCriterion("PER_RC4 in", values, "rc4");
            return (Criteria) this;
        }

        public Criteria andRc4NotIn(List<String> values) {
            addCriterion("PER_RC4 not in", values, "rc4");
            return (Criteria) this;
        }

        public Criteria andRc4Between(String value1, String value2) {
            addCriterion("PER_RC4 between", value1, value2, "rc4");
            return (Criteria) this;
        }

        public Criteria andRc4NotBetween(String value1, String value2) {
            addCriterion("PER_RC4 not between", value1, value2, "rc4");
            return (Criteria) this;
        }

        public Criteria andRc5IsNull() {
            addCriterion("PER_RC5 is null");
            return (Criteria) this;
        }

        public Criteria andRc5IsNotNull() {
            addCriterion("PER_RC5 is not null");
            return (Criteria) this;
        }

        public Criteria andRc5EqualTo(String value) {
            addCriterion("PER_RC5 =", value, "rc5");
            return (Criteria) this;
        }

        public Criteria andRc5NotEqualTo(String value) {
            addCriterion("PER_RC5 <>", value, "rc5");
            return (Criteria) this;
        }

        public Criteria andRc5GreaterThan(String value) {
            addCriterion("PER_RC5 >", value, "rc5");
            return (Criteria) this;
        }

        public Criteria andRc5GreaterThanOrEqualTo(String value) {
            addCriterion("PER_RC5 >=", value, "rc5");
            return (Criteria) this;
        }

        public Criteria andRc5LessThan(String value) {
            addCriterion("PER_RC5 <", value, "rc5");
            return (Criteria) this;
        }

        public Criteria andRc5LessThanOrEqualTo(String value) {
            addCriterion("PER_RC5 <=", value, "rc5");
            return (Criteria) this;
        }

        public Criteria andRc5Like(String value) {
            addCriterion("PER_RC5 like", value, "rc5");
            return (Criteria) this;
        }

        public Criteria andRc5NotLike(String value) {
            addCriterion("PER_RC5 not like", value, "rc5");
            return (Criteria) this;
        }

        public Criteria andRc5In(List<String> values) {
            addCriterion("PER_RC5 in", values, "rc5");
            return (Criteria) this;
        }

        public Criteria andRc5NotIn(List<String> values) {
            addCriterion("PER_RC5 not in", values, "rc5");
            return (Criteria) this;
        }

        public Criteria andRc5Between(String value1, String value2) {
            addCriterion("PER_RC5 between", value1, value2, "rc5");
            return (Criteria) this;
        }

        public Criteria andRc5NotBetween(String value1, String value2) {
            addCriterion("PER_RC5 not between", value1, value2, "rc5");
            return (Criteria) this;
        }

        public Criteria andRc6IsNull() {
            addCriterion("PER_RC6 is null");
            return (Criteria) this;
        }

        public Criteria andRc6IsNotNull() {
            addCriterion("PER_RC6 is not null");
            return (Criteria) this;
        }

        public Criteria andRc6EqualTo(Short value) {
            addCriterion("PER_RC6 =", value, "rc6");
            return (Criteria) this;
        }

        public Criteria andRc6NotEqualTo(Short value) {
            addCriterion("PER_RC6 <>", value, "rc6");
            return (Criteria) this;
        }

        public Criteria andRc6GreaterThan(Short value) {
            addCriterion("PER_RC6 >", value, "rc6");
            return (Criteria) this;
        }

        public Criteria andRc6GreaterThanOrEqualTo(Short value) {
            addCriterion("PER_RC6 >=", value, "rc6");
            return (Criteria) this;
        }

        public Criteria andRc6LessThan(Short value) {
            addCriterion("PER_RC6 <", value, "rc6");
            return (Criteria) this;
        }

        public Criteria andRc6LessThanOrEqualTo(Short value) {
            addCriterion("PER_RC6 <=", value, "rc6");
            return (Criteria) this;
        }

        public Criteria andRc6In(List<Short> values) {
            addCriterion("PER_RC6 in", values, "rc6");
            return (Criteria) this;
        }

        public Criteria andRc6NotIn(List<Short> values) {
            addCriterion("PER_RC6 not in", values, "rc6");
            return (Criteria) this;
        }

        public Criteria andRc6Between(Short value1, Short value2) {
            addCriterion("PER_RC6 between", value1, value2, "rc6");
            return (Criteria) this;
        }

        public Criteria andRc6NotBetween(Short value1, Short value2) {
            addCriterion("PER_RC6 not between", value1, value2, "rc6");
            return (Criteria) this;
        }

        public Criteria andRc7IsNull() {
            addCriterion("PER_RC7 is null");
            return (Criteria) this;
        }

        public Criteria andRc7IsNotNull() {
            addCriterion("PER_RC7 is not null");
            return (Criteria) this;
        }

        public Criteria andRc7EqualTo(Short value) {
            addCriterion("PER_RC7 =", value, "rc7");
            return (Criteria) this;
        }

        public Criteria andRc7NotEqualTo(Short value) {
            addCriterion("PER_RC7 <>", value, "rc7");
            return (Criteria) this;
        }

        public Criteria andRc7GreaterThan(Short value) {
            addCriterion("PER_RC7 >", value, "rc7");
            return (Criteria) this;
        }

        public Criteria andRc7GreaterThanOrEqualTo(Short value) {
            addCriterion("PER_RC7 >=", value, "rc7");
            return (Criteria) this;
        }

        public Criteria andRc7LessThan(Short value) {
            addCriterion("PER_RC7 <", value, "rc7");
            return (Criteria) this;
        }

        public Criteria andRc7LessThanOrEqualTo(Short value) {
            addCriterion("PER_RC7 <=", value, "rc7");
            return (Criteria) this;
        }

        public Criteria andRc7In(List<Short> values) {
            addCriterion("PER_RC7 in", values, "rc7");
            return (Criteria) this;
        }

        public Criteria andRc7NotIn(List<Short> values) {
            addCriterion("PER_RC7 not in", values, "rc7");
            return (Criteria) this;
        }

        public Criteria andRc7Between(Short value1, Short value2) {
            addCriterion("PER_RC7 between", value1, value2, "rc7");
            return (Criteria) this;
        }

        public Criteria andRc7NotBetween(Short value1, Short value2) {
            addCriterion("PER_RC7 not between", value1, value2, "rc7");
            return (Criteria) this;
        }

        public Criteria andRc8IsNull() {
            addCriterion("PER_RC8 is null");
            return (Criteria) this;
        }

        public Criteria andRc8IsNotNull() {
            addCriterion("PER_RC8 is not null");
            return (Criteria) this;
        }

        public Criteria andRc8EqualTo(Date value) {
            addCriterion("PER_RC8 =", value, "rc8");
            return (Criteria) this;
        }

        public Criteria andRc8NotEqualTo(Date value) {
            addCriterion("PER_RC8 <>", value, "rc8");
            return (Criteria) this;
        }

        public Criteria andRc8GreaterThan(Date value) {
            addCriterion("PER_RC8 >", value, "rc8");
            return (Criteria) this;
        }

        public Criteria andRc8GreaterThanOrEqualTo(Date value) {
            addCriterion("PER_RC8 >=", value, "rc8");
            return (Criteria) this;
        }

        public Criteria andRc8LessThan(Date value) {
            addCriterion("PER_RC8 <", value, "rc8");
            return (Criteria) this;
        }

        public Criteria andRc8LessThanOrEqualTo(Date value) {
            addCriterion("PER_RC8 <=", value, "rc8");
            return (Criteria) this;
        }

        public Criteria andRc8In(List<Date> values) {
            addCriterion("PER_RC8 in", values, "rc8");
            return (Criteria) this;
        }

        public Criteria andRc8NotIn(List<Date> values) {
            addCriterion("PER_RC8 not in", values, "rc8");
            return (Criteria) this;
        }

        public Criteria andRc8Between(Date value1, Date value2) {
            addCriterion("PER_RC8 between", value1, value2, "rc8");
            return (Criteria) this;
        }

        public Criteria andRc8NotBetween(Date value1, Date value2) {
            addCriterion("PER_RC8 not between", value1, value2, "rc8");
            return (Criteria) this;
        }

        public Criteria andRc9IsNull() {
            addCriterion("PER_RC9 is null");
            return (Criteria) this;
        }

        public Criteria andRc9IsNotNull() {
            addCriterion("PER_RC9 is not null");
            return (Criteria) this;
        }

        public Criteria andRc9EqualTo(Date value) {
            addCriterion("PER_RC9 =", value, "rc9");
            return (Criteria) this;
        }

        public Criteria andRc9NotEqualTo(Date value) {
            addCriterion("PER_RC9 <>", value, "rc9");
            return (Criteria) this;
        }

        public Criteria andRc9GreaterThan(Date value) {
            addCriterion("PER_RC9 >", value, "rc9");
            return (Criteria) this;
        }

        public Criteria andRc9GreaterThanOrEqualTo(Date value) {
            addCriterion("PER_RC9 >=", value, "rc9");
            return (Criteria) this;
        }

        public Criteria andRc9LessThan(Date value) {
            addCriterion("PER_RC9 <", value, "rc9");
            return (Criteria) this;
        }

        public Criteria andRc9LessThanOrEqualTo(Date value) {
            addCriterion("PER_RC9 <=", value, "rc9");
            return (Criteria) this;
        }

        public Criteria andRc9In(List<Date> values) {
            addCriterion("PER_RC9 in", values, "rc9");
            return (Criteria) this;
        }

        public Criteria andRc9NotIn(List<Date> values) {
            addCriterion("PER_RC9 not in", values, "rc9");
            return (Criteria) this;
        }

        public Criteria andRc9Between(Date value1, Date value2) {
            addCriterion("PER_RC9 between", value1, value2, "rc9");
            return (Criteria) this;
        }

        public Criteria andRc9NotBetween(Date value1, Date value2) {
            addCriterion("PER_RC9 not between", value1, value2, "rc9");
            return (Criteria) this;
        }

        public Criteria andIdtIsNull() {
            addCriterion("PER_IDT is null");
            return (Criteria) this;
        }

        public Criteria andIdtIsNotNull() {
            addCriterion("PER_IDT is not null");
            return (Criteria) this;
        }

        public Criteria andIdtEqualTo(Date value) {
            addCriterion("PER_IDT =", value, "idt");
            return (Criteria) this;
        }

        public Criteria andIdtNotEqualTo(Date value) {
            addCriterion("PER_IDT <>", value, "idt");
            return (Criteria) this;
        }

        public Criteria andIdtGreaterThan(Date value) {
            addCriterion("PER_IDT >", value, "idt");
            return (Criteria) this;
        }

        public Criteria andIdtGreaterThanOrEqualTo(Date value) {
            addCriterion("PER_IDT >=", value, "idt");
            return (Criteria) this;
        }

        public Criteria andIdtLessThan(Date value) {
            addCriterion("PER_IDT <", value, "idt");
            return (Criteria) this;
        }

        public Criteria andIdtLessThanOrEqualTo(Date value) {
            addCriterion("PER_IDT <=", value, "idt");
            return (Criteria) this;
        }

        public Criteria andIdtIn(List<Date> values) {
            addCriterion("PER_IDT in", values, "idt");
            return (Criteria) this;
        }

        public Criteria andIdtNotIn(List<Date> values) {
            addCriterion("PER_IDT not in", values, "idt");
            return (Criteria) this;
        }

        public Criteria andIdtBetween(Date value1, Date value2) {
            addCriterion("PER_IDT between", value1, value2, "idt");
            return (Criteria) this;
        }

        public Criteria andIdtNotBetween(Date value1, Date value2) {
            addCriterion("PER_IDT not between", value1, value2, "idt");
            return (Criteria) this;
        }

        public Criteria andUdtIsNull() {
            addCriterion("PER_UDT is null");
            return (Criteria) this;
        }

        public Criteria andUdtIsNotNull() {
            addCriterion("PER_UDT is not null");
            return (Criteria) this;
        }

        public Criteria andUdtEqualTo(Date value) {
            addCriterion("PER_UDT =", value, "udt");
            return (Criteria) this;
        }

        public Criteria andUdtNotEqualTo(Date value) {
            addCriterion("PER_UDT <>", value, "udt");
            return (Criteria) this;
        }

        public Criteria andUdtGreaterThan(Date value) {
            addCriterion("PER_UDT >", value, "udt");
            return (Criteria) this;
        }

        public Criteria andUdtGreaterThanOrEqualTo(Date value) {
            addCriterion("PER_UDT >=", value, "udt");
            return (Criteria) this;
        }

        public Criteria andUdtLessThan(Date value) {
            addCriterion("PER_UDT <", value, "udt");
            return (Criteria) this;
        }

        public Criteria andUdtLessThanOrEqualTo(Date value) {
            addCriterion("PER_UDT <=", value, "udt");
            return (Criteria) this;
        }

        public Criteria andUdtIn(List<Date> values) {
            addCriterion("PER_UDT in", values, "udt");
            return (Criteria) this;
        }

        public Criteria andUdtNotIn(List<Date> values) {
            addCriterion("PER_UDT not in", values, "udt");
            return (Criteria) this;
        }

        public Criteria andUdtBetween(Date value1, Date value2) {
            addCriterion("PER_UDT between", value1, value2, "udt");
            return (Criteria) this;
        }

        public Criteria andUdtNotBetween(Date value1, Date value2) {
            addCriterion("PER_UDT not between", value1, value2, "udt");
            return (Criteria) this;
        }

        public Criteria andIdLikeInsensitive(String value) {
            addCriterion("upper(PER_ID) like", value.toUpperCase(), "id");
            return (Criteria) this;
        }

        public Criteria andNameLikeInsensitive(String value) {
            addCriterion("upper(PER_NAME) like", value.toUpperCase(), "name");
            return (Criteria) this;
        }

        public Criteria andIntroLikeInsensitive(String value) {
            addCriterion("upper(PER_INTRO) like", value.toUpperCase(), "intro");
            return (Criteria) this;
        }

        public Criteria andTypeextLikeInsensitive(String value) {
            addCriterion("upper(PER_TYPEEXT) like", value.toUpperCase(), "typeext");
            return (Criteria) this;
        }

        public Criteria andFatheridLikeInsensitive(String value) {
            addCriterion("upper(PER_FATHERID) like", value.toUpperCase(), "fatherid");
            return (Criteria) this;
        }

        public Criteria andUrlLikeInsensitive(String value) {
            addCriterion("upper(PER_URL) like", value.toUpperCase(), "url");
            return (Criteria) this;
        }

        public Criteria andUrltypeLikeInsensitive(String value) {
            addCriterion("upper(PER_URLTYPE) like", value.toUpperCase(), "urltype");
            return (Criteria) this;
        }

        public Criteria andClassnameLikeInsensitive(String value) {
            addCriterion("upper(PER_CLASSNAME) like", value.toUpperCase(), "classname");
            return (Criteria) this;
        }

        public Criteria andShowLikeInsensitive(String value) {
            addCriterion("upper(PER_SHOW) like", value.toUpperCase(), "show");
            return (Criteria) this;
        }

        public Criteria andImgpathLikeInsensitive(String value) {
            addCriterion("upper(PER_IMGPATH) like", value.toUpperCase(), "imgpath");
            return (Criteria) this;
        }

        public Criteria andCodeLikeInsensitive(String value) {
            addCriterion("upper(PER_CODE) like", value.toUpperCase(), "code");
            return (Criteria) this;
        }

        public Criteria andMathvalueLikeInsensitive(String value) {
            addCriterion("upper(PER_MATHVALUE) like", value.toUpperCase(), "mathvalue");
            return (Criteria) this;
        }

        public Criteria andMathtypeLikeInsensitive(String value) {
            addCriterion("upper(PER_MATHTYPE) like", value.toUpperCase(), "mathtype");
            return (Criteria) this;
        }

        public Criteria andRc0LikeInsensitive(String value) {
            addCriterion("upper(PER_RC0) like", value.toUpperCase(), "rc0");
            return (Criteria) this;
        }

        public Criteria andRc1LikeInsensitive(String value) {
            addCriterion("upper(PER_RC1) like", value.toUpperCase(), "rc1");
            return (Criteria) this;
        }

        public Criteria andRc2LikeInsensitive(String value) {
            addCriterion("upper(PER_RC2) like", value.toUpperCase(), "rc2");
            return (Criteria) this;
        }

        public Criteria andRc3LikeInsensitive(String value) {
            addCriterion("upper(PER_RC3) like", value.toUpperCase(), "rc3");
            return (Criteria) this;
        }

        public Criteria andRc4LikeInsensitive(String value) {
            addCriterion("upper(PER_RC4) like", value.toUpperCase(), "rc4");
            return (Criteria) this;
        }

        public Criteria andRc5LikeInsensitive(String value) {
            addCriterion("upper(PER_RC5) like", value.toUpperCase(), "rc5");
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