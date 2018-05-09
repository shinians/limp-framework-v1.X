package com.chinasofti.domain;

import com.limp.framework.core.bean.Pager;

import java.util.ArrayList;
import java.util.List;

public class OrganInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Pager page;

    public OrganInfoExample() {
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
            addCriterion("CO_ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("CO_ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("CO_ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("CO_ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("CO_ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("CO_ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("CO_ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("CO_ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("CO_ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("CO_ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("CO_ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("CO_ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("CO_ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("CO_ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUidIsNull() {
            addCriterion("CO_UID is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("CO_UID is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(String value) {
            addCriterion("CO_UID =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(String value) {
            addCriterion("CO_UID <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(String value) {
            addCriterion("CO_UID >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(String value) {
            addCriterion("CO_UID >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(String value) {
            addCriterion("CO_UID <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(String value) {
            addCriterion("CO_UID <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLike(String value) {
            addCriterion("CO_UID like", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotLike(String value) {
            addCriterion("CO_UID not like", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<String> values) {
            addCriterion("CO_UID in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<String> values) {
            addCriterion("CO_UID not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(String value1, String value2) {
            addCriterion("CO_UID between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(String value1, String value2) {
            addCriterion("CO_UID not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andCertidIsNull() {
            addCriterion("CO_CERTID is null");
            return (Criteria) this;
        }

        public Criteria andCertidIsNotNull() {
            addCriterion("CO_CERTID is not null");
            return (Criteria) this;
        }

        public Criteria andCertidEqualTo(String value) {
            addCriterion("CO_CERTID =", value, "certid");
            return (Criteria) this;
        }

        public Criteria andCertidNotEqualTo(String value) {
            addCriterion("CO_CERTID <>", value, "certid");
            return (Criteria) this;
        }

        public Criteria andCertidGreaterThan(String value) {
            addCriterion("CO_CERTID >", value, "certid");
            return (Criteria) this;
        }

        public Criteria andCertidGreaterThanOrEqualTo(String value) {
            addCriterion("CO_CERTID >=", value, "certid");
            return (Criteria) this;
        }

        public Criteria andCertidLessThan(String value) {
            addCriterion("CO_CERTID <", value, "certid");
            return (Criteria) this;
        }

        public Criteria andCertidLessThanOrEqualTo(String value) {
            addCriterion("CO_CERTID <=", value, "certid");
            return (Criteria) this;
        }

        public Criteria andCertidLike(String value) {
            addCriterion("CO_CERTID like", value, "certid");
            return (Criteria) this;
        }

        public Criteria andCertidNotLike(String value) {
            addCriterion("CO_CERTID not like", value, "certid");
            return (Criteria) this;
        }

        public Criteria andCertidIn(List<String> values) {
            addCriterion("CO_CERTID in", values, "certid");
            return (Criteria) this;
        }

        public Criteria andCertidNotIn(List<String> values) {
            addCriterion("CO_CERTID not in", values, "certid");
            return (Criteria) this;
        }

        public Criteria andCertidBetween(String value1, String value2) {
            addCriterion("CO_CERTID between", value1, value2, "certid");
            return (Criteria) this;
        }

        public Criteria andCertidNotBetween(String value1, String value2) {
            addCriterion("CO_CERTID not between", value1, value2, "certid");
            return (Criteria) this;
        }

        public Criteria andOrgnameIsNull() {
            addCriterion("CO_ORGNAME is null");
            return (Criteria) this;
        }

        public Criteria andOrgnameIsNotNull() {
            addCriterion("CO_ORGNAME is not null");
            return (Criteria) this;
        }

        public Criteria andOrgnameEqualTo(String value) {
            addCriterion("CO_ORGNAME =", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameNotEqualTo(String value) {
            addCriterion("CO_ORGNAME <>", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameGreaterThan(String value) {
            addCriterion("CO_ORGNAME >", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameGreaterThanOrEqualTo(String value) {
            addCriterion("CO_ORGNAME >=", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameLessThan(String value) {
            addCriterion("CO_ORGNAME <", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameLessThanOrEqualTo(String value) {
            addCriterion("CO_ORGNAME <=", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameLike(String value) {
            addCriterion("CO_ORGNAME like", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameNotLike(String value) {
            addCriterion("CO_ORGNAME not like", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameIn(List<String> values) {
            addCriterion("CO_ORGNAME in", values, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameNotIn(List<String> values) {
            addCriterion("CO_ORGNAME not in", values, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameBetween(String value1, String value2) {
            addCriterion("CO_ORGNAME between", value1, value2, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameNotBetween(String value1, String value2) {
            addCriterion("CO_ORGNAME not between", value1, value2, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgcodeIsNull() {
            addCriterion("CO_ORGCODE is null");
            return (Criteria) this;
        }

        public Criteria andOrgcodeIsNotNull() {
            addCriterion("CO_ORGCODE is not null");
            return (Criteria) this;
        }

        public Criteria andOrgcodeEqualTo(String value) {
            addCriterion("CO_ORGCODE =", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeNotEqualTo(String value) {
            addCriterion("CO_ORGCODE <>", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeGreaterThan(String value) {
            addCriterion("CO_ORGCODE >", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeGreaterThanOrEqualTo(String value) {
            addCriterion("CO_ORGCODE >=", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeLessThan(String value) {
            addCriterion("CO_ORGCODE <", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeLessThanOrEqualTo(String value) {
            addCriterion("CO_ORGCODE <=", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeLike(String value) {
            addCriterion("CO_ORGCODE like", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeNotLike(String value) {
            addCriterion("CO_ORGCODE not like", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeIn(List<String> values) {
            addCriterion("CO_ORGCODE in", values, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeNotIn(List<String> values) {
            addCriterion("CO_ORGCODE not in", values, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeBetween(String value1, String value2) {
            addCriterion("CO_ORGCODE between", value1, value2, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeNotBetween(String value1, String value2) {
            addCriterion("CO_ORGCODE not between", value1, value2, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgaddrIsNull() {
            addCriterion("CO_ORGADDR is null");
            return (Criteria) this;
        }

        public Criteria andOrgaddrIsNotNull() {
            addCriterion("CO_ORGADDR is not null");
            return (Criteria) this;
        }

        public Criteria andOrgaddrEqualTo(String value) {
            addCriterion("CO_ORGADDR =", value, "orgaddr");
            return (Criteria) this;
        }

        public Criteria andOrgaddrNotEqualTo(String value) {
            addCriterion("CO_ORGADDR <>", value, "orgaddr");
            return (Criteria) this;
        }

        public Criteria andOrgaddrGreaterThan(String value) {
            addCriterion("CO_ORGADDR >", value, "orgaddr");
            return (Criteria) this;
        }

        public Criteria andOrgaddrGreaterThanOrEqualTo(String value) {
            addCriterion("CO_ORGADDR >=", value, "orgaddr");
            return (Criteria) this;
        }

        public Criteria andOrgaddrLessThan(String value) {
            addCriterion("CO_ORGADDR <", value, "orgaddr");
            return (Criteria) this;
        }

        public Criteria andOrgaddrLessThanOrEqualTo(String value) {
            addCriterion("CO_ORGADDR <=", value, "orgaddr");
            return (Criteria) this;
        }

        public Criteria andOrgaddrLike(String value) {
            addCriterion("CO_ORGADDR like", value, "orgaddr");
            return (Criteria) this;
        }

        public Criteria andOrgaddrNotLike(String value) {
            addCriterion("CO_ORGADDR not like", value, "orgaddr");
            return (Criteria) this;
        }

        public Criteria andOrgaddrIn(List<String> values) {
            addCriterion("CO_ORGADDR in", values, "orgaddr");
            return (Criteria) this;
        }

        public Criteria andOrgaddrNotIn(List<String> values) {
            addCriterion("CO_ORGADDR not in", values, "orgaddr");
            return (Criteria) this;
        }

        public Criteria andOrgaddrBetween(String value1, String value2) {
            addCriterion("CO_ORGADDR between", value1, value2, "orgaddr");
            return (Criteria) this;
        }

        public Criteria andOrgaddrNotBetween(String value1, String value2) {
            addCriterion("CO_ORGADDR not between", value1, value2, "orgaddr");
            return (Criteria) this;
        }

        public Criteria andFuntypeIsNull() {
            addCriterion("CO_FUNTYPE is null");
            return (Criteria) this;
        }

        public Criteria andFuntypeIsNotNull() {
            addCriterion("CO_FUNTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andFuntypeEqualTo(String value) {
            addCriterion("CO_FUNTYPE =", value, "funtype");
            return (Criteria) this;
        }

        public Criteria andFuntypeNotEqualTo(String value) {
            addCriterion("CO_FUNTYPE <>", value, "funtype");
            return (Criteria) this;
        }

        public Criteria andFuntypeGreaterThan(String value) {
            addCriterion("CO_FUNTYPE >", value, "funtype");
            return (Criteria) this;
        }

        public Criteria andFuntypeGreaterThanOrEqualTo(String value) {
            addCriterion("CO_FUNTYPE >=", value, "funtype");
            return (Criteria) this;
        }

        public Criteria andFuntypeLessThan(String value) {
            addCriterion("CO_FUNTYPE <", value, "funtype");
            return (Criteria) this;
        }

        public Criteria andFuntypeLessThanOrEqualTo(String value) {
            addCriterion("CO_FUNTYPE <=", value, "funtype");
            return (Criteria) this;
        }

        public Criteria andFuntypeLike(String value) {
            addCriterion("CO_FUNTYPE like", value, "funtype");
            return (Criteria) this;
        }

        public Criteria andFuntypeNotLike(String value) {
            addCriterion("CO_FUNTYPE not like", value, "funtype");
            return (Criteria) this;
        }

        public Criteria andFuntypeIn(List<String> values) {
            addCriterion("CO_FUNTYPE in", values, "funtype");
            return (Criteria) this;
        }

        public Criteria andFuntypeNotIn(List<String> values) {
            addCriterion("CO_FUNTYPE not in", values, "funtype");
            return (Criteria) this;
        }

        public Criteria andFuntypeBetween(String value1, String value2) {
            addCriterion("CO_FUNTYPE between", value1, value2, "funtype");
            return (Criteria) this;
        }

        public Criteria andFuntypeNotBetween(String value1, String value2) {
            addCriterion("CO_FUNTYPE not between", value1, value2, "funtype");
            return (Criteria) this;
        }

        public Criteria andParttypeIsNull() {
            addCriterion("CO_PARTTYPE is null");
            return (Criteria) this;
        }

        public Criteria andParttypeIsNotNull() {
            addCriterion("CO_PARTTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andParttypeEqualTo(String value) {
            addCriterion("CO_PARTTYPE =", value, "parttype");
            return (Criteria) this;
        }

        public Criteria andParttypeNotEqualTo(String value) {
            addCriterion("CO_PARTTYPE <>", value, "parttype");
            return (Criteria) this;
        }

        public Criteria andParttypeGreaterThan(String value) {
            addCriterion("CO_PARTTYPE >", value, "parttype");
            return (Criteria) this;
        }

        public Criteria andParttypeGreaterThanOrEqualTo(String value) {
            addCriterion("CO_PARTTYPE >=", value, "parttype");
            return (Criteria) this;
        }

        public Criteria andParttypeLessThan(String value) {
            addCriterion("CO_PARTTYPE <", value, "parttype");
            return (Criteria) this;
        }

        public Criteria andParttypeLessThanOrEqualTo(String value) {
            addCriterion("CO_PARTTYPE <=", value, "parttype");
            return (Criteria) this;
        }

        public Criteria andParttypeLike(String value) {
            addCriterion("CO_PARTTYPE like", value, "parttype");
            return (Criteria) this;
        }

        public Criteria andParttypeNotLike(String value) {
            addCriterion("CO_PARTTYPE not like", value, "parttype");
            return (Criteria) this;
        }

        public Criteria andParttypeIn(List<String> values) {
            addCriterion("CO_PARTTYPE in", values, "parttype");
            return (Criteria) this;
        }

        public Criteria andParttypeNotIn(List<String> values) {
            addCriterion("CO_PARTTYPE not in", values, "parttype");
            return (Criteria) this;
        }

        public Criteria andParttypeBetween(String value1, String value2) {
            addCriterion("CO_PARTTYPE between", value1, value2, "parttype");
            return (Criteria) this;
        }

        public Criteria andParttypeNotBetween(String value1, String value2) {
            addCriterion("CO_PARTTYPE not between", value1, value2, "parttype");
            return (Criteria) this;
        }

        public Criteria andBustypeIsNull() {
            addCriterion("CO_BUSTYPE is null");
            return (Criteria) this;
        }

        public Criteria andBustypeIsNotNull() {
            addCriterion("CO_BUSTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andBustypeEqualTo(String value) {
            addCriterion("CO_BUSTYPE =", value, "bustype");
            return (Criteria) this;
        }

        public Criteria andBustypeNotEqualTo(String value) {
            addCriterion("CO_BUSTYPE <>", value, "bustype");
            return (Criteria) this;
        }

        public Criteria andBustypeGreaterThan(String value) {
            addCriterion("CO_BUSTYPE >", value, "bustype");
            return (Criteria) this;
        }

        public Criteria andBustypeGreaterThanOrEqualTo(String value) {
            addCriterion("CO_BUSTYPE >=", value, "bustype");
            return (Criteria) this;
        }

        public Criteria andBustypeLessThan(String value) {
            addCriterion("CO_BUSTYPE <", value, "bustype");
            return (Criteria) this;
        }

        public Criteria andBustypeLessThanOrEqualTo(String value) {
            addCriterion("CO_BUSTYPE <=", value, "bustype");
            return (Criteria) this;
        }

        public Criteria andBustypeLike(String value) {
            addCriterion("CO_BUSTYPE like", value, "bustype");
            return (Criteria) this;
        }

        public Criteria andBustypeNotLike(String value) {
            addCriterion("CO_BUSTYPE not like", value, "bustype");
            return (Criteria) this;
        }

        public Criteria andBustypeIn(List<String> values) {
            addCriterion("CO_BUSTYPE in", values, "bustype");
            return (Criteria) this;
        }

        public Criteria andBustypeNotIn(List<String> values) {
            addCriterion("CO_BUSTYPE not in", values, "bustype");
            return (Criteria) this;
        }

        public Criteria andBustypeBetween(String value1, String value2) {
            addCriterion("CO_BUSTYPE between", value1, value2, "bustype");
            return (Criteria) this;
        }

        public Criteria andBustypeNotBetween(String value1, String value2) {
            addCriterion("CO_BUSTYPE not between", value1, value2, "bustype");
            return (Criteria) this;
        }

        public Criteria andFunscopeIsNull() {
            addCriterion("CO_FUNSCOPE is null");
            return (Criteria) this;
        }

        public Criteria andFunscopeIsNotNull() {
            addCriterion("CO_FUNSCOPE is not null");
            return (Criteria) this;
        }

        public Criteria andFunscopeEqualTo(String value) {
            addCriterion("CO_FUNSCOPE =", value, "funscope");
            return (Criteria) this;
        }

        public Criteria andFunscopeNotEqualTo(String value) {
            addCriterion("CO_FUNSCOPE <>", value, "funscope");
            return (Criteria) this;
        }

        public Criteria andFunscopeGreaterThan(String value) {
            addCriterion("CO_FUNSCOPE >", value, "funscope");
            return (Criteria) this;
        }

        public Criteria andFunscopeGreaterThanOrEqualTo(String value) {
            addCriterion("CO_FUNSCOPE >=", value, "funscope");
            return (Criteria) this;
        }

        public Criteria andFunscopeLessThan(String value) {
            addCriterion("CO_FUNSCOPE <", value, "funscope");
            return (Criteria) this;
        }

        public Criteria andFunscopeLessThanOrEqualTo(String value) {
            addCriterion("CO_FUNSCOPE <=", value, "funscope");
            return (Criteria) this;
        }

        public Criteria andFunscopeLike(String value) {
            addCriterion("CO_FUNSCOPE like", value, "funscope");
            return (Criteria) this;
        }

        public Criteria andFunscopeNotLike(String value) {
            addCriterion("CO_FUNSCOPE not like", value, "funscope");
            return (Criteria) this;
        }

        public Criteria andFunscopeIn(List<String> values) {
            addCriterion("CO_FUNSCOPE in", values, "funscope");
            return (Criteria) this;
        }

        public Criteria andFunscopeNotIn(List<String> values) {
            addCriterion("CO_FUNSCOPE not in", values, "funscope");
            return (Criteria) this;
        }

        public Criteria andFunscopeBetween(String value1, String value2) {
            addCriterion("CO_FUNSCOPE between", value1, value2, "funscope");
            return (Criteria) this;
        }

        public Criteria andFunscopeNotBetween(String value1, String value2) {
            addCriterion("CO_FUNSCOPE not between", value1, value2, "funscope");
            return (Criteria) this;
        }

        public Criteria andGeotypeIsNull() {
            addCriterion("CO_GEOTYPE is null");
            return (Criteria) this;
        }

        public Criteria andGeotypeIsNotNull() {
            addCriterion("CO_GEOTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andGeotypeEqualTo(String value) {
            addCriterion("CO_GEOTYPE =", value, "geotype");
            return (Criteria) this;
        }

        public Criteria andGeotypeNotEqualTo(String value) {
            addCriterion("CO_GEOTYPE <>", value, "geotype");
            return (Criteria) this;
        }

        public Criteria andGeotypeGreaterThan(String value) {
            addCriterion("CO_GEOTYPE >", value, "geotype");
            return (Criteria) this;
        }

        public Criteria andGeotypeGreaterThanOrEqualTo(String value) {
            addCriterion("CO_GEOTYPE >=", value, "geotype");
            return (Criteria) this;
        }

        public Criteria andGeotypeLessThan(String value) {
            addCriterion("CO_GEOTYPE <", value, "geotype");
            return (Criteria) this;
        }

        public Criteria andGeotypeLessThanOrEqualTo(String value) {
            addCriterion("CO_GEOTYPE <=", value, "geotype");
            return (Criteria) this;
        }

        public Criteria andGeotypeLike(String value) {
            addCriterion("CO_GEOTYPE like", value, "geotype");
            return (Criteria) this;
        }

        public Criteria andGeotypeNotLike(String value) {
            addCriterion("CO_GEOTYPE not like", value, "geotype");
            return (Criteria) this;
        }

        public Criteria andGeotypeIn(List<String> values) {
            addCriterion("CO_GEOTYPE in", values, "geotype");
            return (Criteria) this;
        }

        public Criteria andGeotypeNotIn(List<String> values) {
            addCriterion("CO_GEOTYPE not in", values, "geotype");
            return (Criteria) this;
        }

        public Criteria andGeotypeBetween(String value1, String value2) {
            addCriterion("CO_GEOTYPE between", value1, value2, "geotype");
            return (Criteria) this;
        }

        public Criteria andGeotypeNotBetween(String value1, String value2) {
            addCriterion("CO_GEOTYPE not between", value1, value2, "geotype");
            return (Criteria) this;
        }

        public Criteria andProvcodeIsNull() {
            addCriterion("CO_PROVCODE is null");
            return (Criteria) this;
        }

        public Criteria andProvcodeIsNotNull() {
            addCriterion("CO_PROVCODE is not null");
            return (Criteria) this;
        }

        public Criteria andProvcodeEqualTo(String value) {
            addCriterion("CO_PROVCODE =", value, "provcode");
            return (Criteria) this;
        }

        public Criteria andProvcodeNotEqualTo(String value) {
            addCriterion("CO_PROVCODE <>", value, "provcode");
            return (Criteria) this;
        }

        public Criteria andProvcodeGreaterThan(String value) {
            addCriterion("CO_PROVCODE >", value, "provcode");
            return (Criteria) this;
        }

        public Criteria andProvcodeGreaterThanOrEqualTo(String value) {
            addCriterion("CO_PROVCODE >=", value, "provcode");
            return (Criteria) this;
        }

        public Criteria andProvcodeLessThan(String value) {
            addCriterion("CO_PROVCODE <", value, "provcode");
            return (Criteria) this;
        }

        public Criteria andProvcodeLessThanOrEqualTo(String value) {
            addCriterion("CO_PROVCODE <=", value, "provcode");
            return (Criteria) this;
        }

        public Criteria andProvcodeLike(String value) {
            addCriterion("CO_PROVCODE like", value, "provcode");
            return (Criteria) this;
        }

        public Criteria andProvcodeNotLike(String value) {
            addCriterion("CO_PROVCODE not like", value, "provcode");
            return (Criteria) this;
        }

        public Criteria andProvcodeIn(List<String> values) {
            addCriterion("CO_PROVCODE in", values, "provcode");
            return (Criteria) this;
        }

        public Criteria andProvcodeNotIn(List<String> values) {
            addCriterion("CO_PROVCODE not in", values, "provcode");
            return (Criteria) this;
        }

        public Criteria andProvcodeBetween(String value1, String value2) {
            addCriterion("CO_PROVCODE between", value1, value2, "provcode");
            return (Criteria) this;
        }

        public Criteria andProvcodeNotBetween(String value1, String value2) {
            addCriterion("CO_PROVCODE not between", value1, value2, "provcode");
            return (Criteria) this;
        }

        public Criteria andProvnameIsNull() {
            addCriterion("CO_PROVNAME is null");
            return (Criteria) this;
        }

        public Criteria andProvnameIsNotNull() {
            addCriterion("CO_PROVNAME is not null");
            return (Criteria) this;
        }

        public Criteria andProvnameEqualTo(String value) {
            addCriterion("CO_PROVNAME =", value, "provname");
            return (Criteria) this;
        }

        public Criteria andProvnameNotEqualTo(String value) {
            addCriterion("CO_PROVNAME <>", value, "provname");
            return (Criteria) this;
        }

        public Criteria andProvnameGreaterThan(String value) {
            addCriterion("CO_PROVNAME >", value, "provname");
            return (Criteria) this;
        }

        public Criteria andProvnameGreaterThanOrEqualTo(String value) {
            addCriterion("CO_PROVNAME >=", value, "provname");
            return (Criteria) this;
        }

        public Criteria andProvnameLessThan(String value) {
            addCriterion("CO_PROVNAME <", value, "provname");
            return (Criteria) this;
        }

        public Criteria andProvnameLessThanOrEqualTo(String value) {
            addCriterion("CO_PROVNAME <=", value, "provname");
            return (Criteria) this;
        }

        public Criteria andProvnameLike(String value) {
            addCriterion("CO_PROVNAME like", value, "provname");
            return (Criteria) this;
        }

        public Criteria andProvnameNotLike(String value) {
            addCriterion("CO_PROVNAME not like", value, "provname");
            return (Criteria) this;
        }

        public Criteria andProvnameIn(List<String> values) {
            addCriterion("CO_PROVNAME in", values, "provname");
            return (Criteria) this;
        }

        public Criteria andProvnameNotIn(List<String> values) {
            addCriterion("CO_PROVNAME not in", values, "provname");
            return (Criteria) this;
        }

        public Criteria andProvnameBetween(String value1, String value2) {
            addCriterion("CO_PROVNAME between", value1, value2, "provname");
            return (Criteria) this;
        }

        public Criteria andProvnameNotBetween(String value1, String value2) {
            addCriterion("CO_PROVNAME not between", value1, value2, "provname");
            return (Criteria) this;
        }

        public Criteria andTypelvIsNull() {
            addCriterion("CO_TYPELV is null");
            return (Criteria) this;
        }

        public Criteria andTypelvIsNotNull() {
            addCriterion("CO_TYPELV is not null");
            return (Criteria) this;
        }

        public Criteria andTypelvEqualTo(String value) {
            addCriterion("CO_TYPELV =", value, "typelv");
            return (Criteria) this;
        }

        public Criteria andTypelvNotEqualTo(String value) {
            addCriterion("CO_TYPELV <>", value, "typelv");
            return (Criteria) this;
        }

        public Criteria andTypelvGreaterThan(String value) {
            addCriterion("CO_TYPELV >", value, "typelv");
            return (Criteria) this;
        }

        public Criteria andTypelvGreaterThanOrEqualTo(String value) {
            addCriterion("CO_TYPELV >=", value, "typelv");
            return (Criteria) this;
        }

        public Criteria andTypelvLessThan(String value) {
            addCriterion("CO_TYPELV <", value, "typelv");
            return (Criteria) this;
        }

        public Criteria andTypelvLessThanOrEqualTo(String value) {
            addCriterion("CO_TYPELV <=", value, "typelv");
            return (Criteria) this;
        }

        public Criteria andTypelvLike(String value) {
            addCriterion("CO_TYPELV like", value, "typelv");
            return (Criteria) this;
        }

        public Criteria andTypelvNotLike(String value) {
            addCriterion("CO_TYPELV not like", value, "typelv");
            return (Criteria) this;
        }

        public Criteria andTypelvIn(List<String> values) {
            addCriterion("CO_TYPELV in", values, "typelv");
            return (Criteria) this;
        }

        public Criteria andTypelvNotIn(List<String> values) {
            addCriterion("CO_TYPELV not in", values, "typelv");
            return (Criteria) this;
        }

        public Criteria andTypelvBetween(String value1, String value2) {
            addCriterion("CO_TYPELV between", value1, value2, "typelv");
            return (Criteria) this;
        }

        public Criteria andTypelvNotBetween(String value1, String value2) {
            addCriterion("CO_TYPELV not between", value1, value2, "typelv");
            return (Criteria) this;
        }

        public Criteria andOrgnameupIsNull() {
            addCriterion("CO_ORGNAMEUP is null");
            return (Criteria) this;
        }

        public Criteria andOrgnameupIsNotNull() {
            addCriterion("CO_ORGNAMEUP is not null");
            return (Criteria) this;
        }

        public Criteria andOrgnameupEqualTo(String value) {
            addCriterion("CO_ORGNAMEUP =", value, "orgnameup");
            return (Criteria) this;
        }

        public Criteria andOrgnameupNotEqualTo(String value) {
            addCriterion("CO_ORGNAMEUP <>", value, "orgnameup");
            return (Criteria) this;
        }

        public Criteria andOrgnameupGreaterThan(String value) {
            addCriterion("CO_ORGNAMEUP >", value, "orgnameup");
            return (Criteria) this;
        }

        public Criteria andOrgnameupGreaterThanOrEqualTo(String value) {
            addCriterion("CO_ORGNAMEUP >=", value, "orgnameup");
            return (Criteria) this;
        }

        public Criteria andOrgnameupLessThan(String value) {
            addCriterion("CO_ORGNAMEUP <", value, "orgnameup");
            return (Criteria) this;
        }

        public Criteria andOrgnameupLessThanOrEqualTo(String value) {
            addCriterion("CO_ORGNAMEUP <=", value, "orgnameup");
            return (Criteria) this;
        }

        public Criteria andOrgnameupLike(String value) {
            addCriterion("CO_ORGNAMEUP like", value, "orgnameup");
            return (Criteria) this;
        }

        public Criteria andOrgnameupNotLike(String value) {
            addCriterion("CO_ORGNAMEUP not like", value, "orgnameup");
            return (Criteria) this;
        }

        public Criteria andOrgnameupIn(List<String> values) {
            addCriterion("CO_ORGNAMEUP in", values, "orgnameup");
            return (Criteria) this;
        }

        public Criteria andOrgnameupNotIn(List<String> values) {
            addCriterion("CO_ORGNAMEUP not in", values, "orgnameup");
            return (Criteria) this;
        }

        public Criteria andOrgnameupBetween(String value1, String value2) {
            addCriterion("CO_ORGNAMEUP between", value1, value2, "orgnameup");
            return (Criteria) this;
        }

        public Criteria andOrgnameupNotBetween(String value1, String value2) {
            addCriterion("CO_ORGNAMEUP not between", value1, value2, "orgnameup");
            return (Criteria) this;
        }

        public Criteria andOrgcodeupIsNull() {
            addCriterion("CO_ORGCODEUP is null");
            return (Criteria) this;
        }

        public Criteria andOrgcodeupIsNotNull() {
            addCriterion("CO_ORGCODEUP is not null");
            return (Criteria) this;
        }

        public Criteria andOrgcodeupEqualTo(String value) {
            addCriterion("CO_ORGCODEUP =", value, "orgcodeup");
            return (Criteria) this;
        }

        public Criteria andOrgcodeupNotEqualTo(String value) {
            addCriterion("CO_ORGCODEUP <>", value, "orgcodeup");
            return (Criteria) this;
        }

        public Criteria andOrgcodeupGreaterThan(String value) {
            addCriterion("CO_ORGCODEUP >", value, "orgcodeup");
            return (Criteria) this;
        }

        public Criteria andOrgcodeupGreaterThanOrEqualTo(String value) {
            addCriterion("CO_ORGCODEUP >=", value, "orgcodeup");
            return (Criteria) this;
        }

        public Criteria andOrgcodeupLessThan(String value) {
            addCriterion("CO_ORGCODEUP <", value, "orgcodeup");
            return (Criteria) this;
        }

        public Criteria andOrgcodeupLessThanOrEqualTo(String value) {
            addCriterion("CO_ORGCODEUP <=", value, "orgcodeup");
            return (Criteria) this;
        }

        public Criteria andOrgcodeupLike(String value) {
            addCriterion("CO_ORGCODEUP like", value, "orgcodeup");
            return (Criteria) this;
        }

        public Criteria andOrgcodeupNotLike(String value) {
            addCriterion("CO_ORGCODEUP not like", value, "orgcodeup");
            return (Criteria) this;
        }

        public Criteria andOrgcodeupIn(List<String> values) {
            addCriterion("CO_ORGCODEUP in", values, "orgcodeup");
            return (Criteria) this;
        }

        public Criteria andOrgcodeupNotIn(List<String> values) {
            addCriterion("CO_ORGCODEUP not in", values, "orgcodeup");
            return (Criteria) this;
        }

        public Criteria andOrgcodeupBetween(String value1, String value2) {
            addCriterion("CO_ORGCODEUP between", value1, value2, "orgcodeup");
            return (Criteria) this;
        }

        public Criteria andOrgcodeupNotBetween(String value1, String value2) {
            addCriterion("CO_ORGCODEUP not between", value1, value2, "orgcodeup");
            return (Criteria) this;
        }

        public Criteria andOrgareanameIsNull() {
            addCriterion("CO_ORGAREANAME is null");
            return (Criteria) this;
        }

        public Criteria andOrgareanameIsNotNull() {
            addCriterion("CO_ORGAREANAME is not null");
            return (Criteria) this;
        }

        public Criteria andOrgareanameEqualTo(String value) {
            addCriterion("CO_ORGAREANAME =", value, "orgareaname");
            return (Criteria) this;
        }

        public Criteria andOrgareanameNotEqualTo(String value) {
            addCriterion("CO_ORGAREANAME <>", value, "orgareaname");
            return (Criteria) this;
        }

        public Criteria andOrgareanameGreaterThan(String value) {
            addCriterion("CO_ORGAREANAME >", value, "orgareaname");
            return (Criteria) this;
        }

        public Criteria andOrgareanameGreaterThanOrEqualTo(String value) {
            addCriterion("CO_ORGAREANAME >=", value, "orgareaname");
            return (Criteria) this;
        }

        public Criteria andOrgareanameLessThan(String value) {
            addCriterion("CO_ORGAREANAME <", value, "orgareaname");
            return (Criteria) this;
        }

        public Criteria andOrgareanameLessThanOrEqualTo(String value) {
            addCriterion("CO_ORGAREANAME <=", value, "orgareaname");
            return (Criteria) this;
        }

        public Criteria andOrgareanameLike(String value) {
            addCriterion("CO_ORGAREANAME like", value, "orgareaname");
            return (Criteria) this;
        }

        public Criteria andOrgareanameNotLike(String value) {
            addCriterion("CO_ORGAREANAME not like", value, "orgareaname");
            return (Criteria) this;
        }

        public Criteria andOrgareanameIn(List<String> values) {
            addCriterion("CO_ORGAREANAME in", values, "orgareaname");
            return (Criteria) this;
        }

        public Criteria andOrgareanameNotIn(List<String> values) {
            addCriterion("CO_ORGAREANAME not in", values, "orgareaname");
            return (Criteria) this;
        }

        public Criteria andOrgareanameBetween(String value1, String value2) {
            addCriterion("CO_ORGAREANAME between", value1, value2, "orgareaname");
            return (Criteria) this;
        }

        public Criteria andOrgareanameNotBetween(String value1, String value2) {
            addCriterion("CO_ORGAREANAME not between", value1, value2, "orgareaname");
            return (Criteria) this;
        }

        public Criteria andOrgpostcodeIsNull() {
            addCriterion("CO_ORGPOSTCODE is null");
            return (Criteria) this;
        }

        public Criteria andOrgpostcodeIsNotNull() {
            addCriterion("CO_ORGPOSTCODE is not null");
            return (Criteria) this;
        }

        public Criteria andOrgpostcodeEqualTo(String value) {
            addCriterion("CO_ORGPOSTCODE =", value, "orgpostcode");
            return (Criteria) this;
        }

        public Criteria andOrgpostcodeNotEqualTo(String value) {
            addCriterion("CO_ORGPOSTCODE <>", value, "orgpostcode");
            return (Criteria) this;
        }

        public Criteria andOrgpostcodeGreaterThan(String value) {
            addCriterion("CO_ORGPOSTCODE >", value, "orgpostcode");
            return (Criteria) this;
        }

        public Criteria andOrgpostcodeGreaterThanOrEqualTo(String value) {
            addCriterion("CO_ORGPOSTCODE >=", value, "orgpostcode");
            return (Criteria) this;
        }

        public Criteria andOrgpostcodeLessThan(String value) {
            addCriterion("CO_ORGPOSTCODE <", value, "orgpostcode");
            return (Criteria) this;
        }

        public Criteria andOrgpostcodeLessThanOrEqualTo(String value) {
            addCriterion("CO_ORGPOSTCODE <=", value, "orgpostcode");
            return (Criteria) this;
        }

        public Criteria andOrgpostcodeLike(String value) {
            addCriterion("CO_ORGPOSTCODE like", value, "orgpostcode");
            return (Criteria) this;
        }

        public Criteria andOrgpostcodeNotLike(String value) {
            addCriterion("CO_ORGPOSTCODE not like", value, "orgpostcode");
            return (Criteria) this;
        }

        public Criteria andOrgpostcodeIn(List<String> values) {
            addCriterion("CO_ORGPOSTCODE in", values, "orgpostcode");
            return (Criteria) this;
        }

        public Criteria andOrgpostcodeNotIn(List<String> values) {
            addCriterion("CO_ORGPOSTCODE not in", values, "orgpostcode");
            return (Criteria) this;
        }

        public Criteria andOrgpostcodeBetween(String value1, String value2) {
            addCriterion("CO_ORGPOSTCODE between", value1, value2, "orgpostcode");
            return (Criteria) this;
        }

        public Criteria andOrgpostcodeNotBetween(String value1, String value2) {
            addCriterion("CO_ORGPOSTCODE not between", value1, value2, "orgpostcode");
            return (Criteria) this;
        }

        public Criteria andAreacodeIsNull() {
            addCriterion("CO_AREACODE is null");
            return (Criteria) this;
        }

        public Criteria andAreacodeIsNotNull() {
            addCriterion("CO_AREACODE is not null");
            return (Criteria) this;
        }

        public Criteria andAreacodeEqualTo(String value) {
            addCriterion("CO_AREACODE =", value, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeNotEqualTo(String value) {
            addCriterion("CO_AREACODE <>", value, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeGreaterThan(String value) {
            addCriterion("CO_AREACODE >", value, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeGreaterThanOrEqualTo(String value) {
            addCriterion("CO_AREACODE >=", value, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeLessThan(String value) {
            addCriterion("CO_AREACODE <", value, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeLessThanOrEqualTo(String value) {
            addCriterion("CO_AREACODE <=", value, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeLike(String value) {
            addCriterion("CO_AREACODE like", value, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeNotLike(String value) {
            addCriterion("CO_AREACODE not like", value, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeIn(List<String> values) {
            addCriterion("CO_AREACODE in", values, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeNotIn(List<String> values) {
            addCriterion("CO_AREACODE not in", values, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeBetween(String value1, String value2) {
            addCriterion("CO_AREACODE between", value1, value2, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeNotBetween(String value1, String value2) {
            addCriterion("CO_AREACODE not between", value1, value2, "areacode");
            return (Criteria) this;
        }

        public Criteria andContactphoneIsNull() {
            addCriterion("CO_CONTACTPHONE is null");
            return (Criteria) this;
        }

        public Criteria andContactphoneIsNotNull() {
            addCriterion("CO_CONTACTPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andContactphoneEqualTo(String value) {
            addCriterion("CO_CONTACTPHONE =", value, "contactphone");
            return (Criteria) this;
        }

        public Criteria andContactphoneNotEqualTo(String value) {
            addCriterion("CO_CONTACTPHONE <>", value, "contactphone");
            return (Criteria) this;
        }

        public Criteria andContactphoneGreaterThan(String value) {
            addCriterion("CO_CONTACTPHONE >", value, "contactphone");
            return (Criteria) this;
        }

        public Criteria andContactphoneGreaterThanOrEqualTo(String value) {
            addCriterion("CO_CONTACTPHONE >=", value, "contactphone");
            return (Criteria) this;
        }

        public Criteria andContactphoneLessThan(String value) {
            addCriterion("CO_CONTACTPHONE <", value, "contactphone");
            return (Criteria) this;
        }

        public Criteria andContactphoneLessThanOrEqualTo(String value) {
            addCriterion("CO_CONTACTPHONE <=", value, "contactphone");
            return (Criteria) this;
        }

        public Criteria andContactphoneLike(String value) {
            addCriterion("CO_CONTACTPHONE like", value, "contactphone");
            return (Criteria) this;
        }

        public Criteria andContactphoneNotLike(String value) {
            addCriterion("CO_CONTACTPHONE not like", value, "contactphone");
            return (Criteria) this;
        }

        public Criteria andContactphoneIn(List<String> values) {
            addCriterion("CO_CONTACTPHONE in", values, "contactphone");
            return (Criteria) this;
        }

        public Criteria andContactphoneNotIn(List<String> values) {
            addCriterion("CO_CONTACTPHONE not in", values, "contactphone");
            return (Criteria) this;
        }

        public Criteria andContactphoneBetween(String value1, String value2) {
            addCriterion("CO_CONTACTPHONE between", value1, value2, "contactphone");
            return (Criteria) this;
        }

        public Criteria andContactphoneNotBetween(String value1, String value2) {
            addCriterion("CO_CONTACTPHONE not between", value1, value2, "contactphone");
            return (Criteria) this;
        }

        public Criteria andContactfaxIsNull() {
            addCriterion("CO_CONTACTFAX is null");
            return (Criteria) this;
        }

        public Criteria andContactfaxIsNotNull() {
            addCriterion("CO_CONTACTFAX is not null");
            return (Criteria) this;
        }

        public Criteria andContactfaxEqualTo(String value) {
            addCriterion("CO_CONTACTFAX =", value, "contactfax");
            return (Criteria) this;
        }

        public Criteria andContactfaxNotEqualTo(String value) {
            addCriterion("CO_CONTACTFAX <>", value, "contactfax");
            return (Criteria) this;
        }

        public Criteria andContactfaxGreaterThan(String value) {
            addCriterion("CO_CONTACTFAX >", value, "contactfax");
            return (Criteria) this;
        }

        public Criteria andContactfaxGreaterThanOrEqualTo(String value) {
            addCriterion("CO_CONTACTFAX >=", value, "contactfax");
            return (Criteria) this;
        }

        public Criteria andContactfaxLessThan(String value) {
            addCriterion("CO_CONTACTFAX <", value, "contactfax");
            return (Criteria) this;
        }

        public Criteria andContactfaxLessThanOrEqualTo(String value) {
            addCriterion("CO_CONTACTFAX <=", value, "contactfax");
            return (Criteria) this;
        }

        public Criteria andContactfaxLike(String value) {
            addCriterion("CO_CONTACTFAX like", value, "contactfax");
            return (Criteria) this;
        }

        public Criteria andContactfaxNotLike(String value) {
            addCriterion("CO_CONTACTFAX not like", value, "contactfax");
            return (Criteria) this;
        }

        public Criteria andContactfaxIn(List<String> values) {
            addCriterion("CO_CONTACTFAX in", values, "contactfax");
            return (Criteria) this;
        }

        public Criteria andContactfaxNotIn(List<String> values) {
            addCriterion("CO_CONTACTFAX not in", values, "contactfax");
            return (Criteria) this;
        }

        public Criteria andContactfaxBetween(String value1, String value2) {
            addCriterion("CO_CONTACTFAX between", value1, value2, "contactfax");
            return (Criteria) this;
        }

        public Criteria andContactfaxNotBetween(String value1, String value2) {
            addCriterion("CO_CONTACTFAX not between", value1, value2, "contactfax");
            return (Criteria) this;
        }

        public Criteria andContacttelIsNull() {
            addCriterion("CO_CONTACTTEL is null");
            return (Criteria) this;
        }

        public Criteria andContacttelIsNotNull() {
            addCriterion("CO_CONTACTTEL is not null");
            return (Criteria) this;
        }

        public Criteria andContacttelEqualTo(String value) {
            addCriterion("CO_CONTACTTEL =", value, "contacttel");
            return (Criteria) this;
        }

        public Criteria andContacttelNotEqualTo(String value) {
            addCriterion("CO_CONTACTTEL <>", value, "contacttel");
            return (Criteria) this;
        }

        public Criteria andContacttelGreaterThan(String value) {
            addCriterion("CO_CONTACTTEL >", value, "contacttel");
            return (Criteria) this;
        }

        public Criteria andContacttelGreaterThanOrEqualTo(String value) {
            addCriterion("CO_CONTACTTEL >=", value, "contacttel");
            return (Criteria) this;
        }

        public Criteria andContacttelLessThan(String value) {
            addCriterion("CO_CONTACTTEL <", value, "contacttel");
            return (Criteria) this;
        }

        public Criteria andContacttelLessThanOrEqualTo(String value) {
            addCriterion("CO_CONTACTTEL <=", value, "contacttel");
            return (Criteria) this;
        }

        public Criteria andContacttelLike(String value) {
            addCriterion("CO_CONTACTTEL like", value, "contacttel");
            return (Criteria) this;
        }

        public Criteria andContacttelNotLike(String value) {
            addCriterion("CO_CONTACTTEL not like", value, "contacttel");
            return (Criteria) this;
        }

        public Criteria andContacttelIn(List<String> values) {
            addCriterion("CO_CONTACTTEL in", values, "contacttel");
            return (Criteria) this;
        }

        public Criteria andContacttelNotIn(List<String> values) {
            addCriterion("CO_CONTACTTEL not in", values, "contacttel");
            return (Criteria) this;
        }

        public Criteria andContacttelBetween(String value1, String value2) {
            addCriterion("CO_CONTACTTEL between", value1, value2, "contacttel");
            return (Criteria) this;
        }

        public Criteria andContacttelNotBetween(String value1, String value2) {
            addCriterion("CO_CONTACTTEL not between", value1, value2, "contacttel");
            return (Criteria) this;
        }

        public Criteria andContactemailIsNull() {
            addCriterion("CO_CONTACTEMAIL is null");
            return (Criteria) this;
        }

        public Criteria andContactemailIsNotNull() {
            addCriterion("CO_CONTACTEMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andContactemailEqualTo(String value) {
            addCriterion("CO_CONTACTEMAIL =", value, "contactemail");
            return (Criteria) this;
        }

        public Criteria andContactemailNotEqualTo(String value) {
            addCriterion("CO_CONTACTEMAIL <>", value, "contactemail");
            return (Criteria) this;
        }

        public Criteria andContactemailGreaterThan(String value) {
            addCriterion("CO_CONTACTEMAIL >", value, "contactemail");
            return (Criteria) this;
        }

        public Criteria andContactemailGreaterThanOrEqualTo(String value) {
            addCriterion("CO_CONTACTEMAIL >=", value, "contactemail");
            return (Criteria) this;
        }

        public Criteria andContactemailLessThan(String value) {
            addCriterion("CO_CONTACTEMAIL <", value, "contactemail");
            return (Criteria) this;
        }

        public Criteria andContactemailLessThanOrEqualTo(String value) {
            addCriterion("CO_CONTACTEMAIL <=", value, "contactemail");
            return (Criteria) this;
        }

        public Criteria andContactemailLike(String value) {
            addCriterion("CO_CONTACTEMAIL like", value, "contactemail");
            return (Criteria) this;
        }

        public Criteria andContactemailNotLike(String value) {
            addCriterion("CO_CONTACTEMAIL not like", value, "contactemail");
            return (Criteria) this;
        }

        public Criteria andContactemailIn(List<String> values) {
            addCriterion("CO_CONTACTEMAIL in", values, "contactemail");
            return (Criteria) this;
        }

        public Criteria andContactemailNotIn(List<String> values) {
            addCriterion("CO_CONTACTEMAIL not in", values, "contactemail");
            return (Criteria) this;
        }

        public Criteria andContactemailBetween(String value1, String value2) {
            addCriterion("CO_CONTACTEMAIL between", value1, value2, "contactemail");
            return (Criteria) this;
        }

        public Criteria andContactemailNotBetween(String value1, String value2) {
            addCriterion("CO_CONTACTEMAIL not between", value1, value2, "contactemail");
            return (Criteria) this;
        }

        public Criteria andBodertypeIsNull() {
            addCriterion("CO_BODERTYPE is null");
            return (Criteria) this;
        }

        public Criteria andBodertypeIsNotNull() {
            addCriterion("CO_BODERTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andBodertypeEqualTo(String value) {
            addCriterion("CO_BODERTYPE =", value, "bodertype");
            return (Criteria) this;
        }

        public Criteria andBodertypeNotEqualTo(String value) {
            addCriterion("CO_BODERTYPE <>", value, "bodertype");
            return (Criteria) this;
        }

        public Criteria andBodertypeGreaterThan(String value) {
            addCriterion("CO_BODERTYPE >", value, "bodertype");
            return (Criteria) this;
        }

        public Criteria andBodertypeGreaterThanOrEqualTo(String value) {
            addCriterion("CO_BODERTYPE >=", value, "bodertype");
            return (Criteria) this;
        }

        public Criteria andBodertypeLessThan(String value) {
            addCriterion("CO_BODERTYPE <", value, "bodertype");
            return (Criteria) this;
        }

        public Criteria andBodertypeLessThanOrEqualTo(String value) {
            addCriterion("CO_BODERTYPE <=", value, "bodertype");
            return (Criteria) this;
        }

        public Criteria andBodertypeLike(String value) {
            addCriterion("CO_BODERTYPE like", value, "bodertype");
            return (Criteria) this;
        }

        public Criteria andBodertypeNotLike(String value) {
            addCriterion("CO_BODERTYPE not like", value, "bodertype");
            return (Criteria) this;
        }

        public Criteria andBodertypeIn(List<String> values) {
            addCriterion("CO_BODERTYPE in", values, "bodertype");
            return (Criteria) this;
        }

        public Criteria andBodertypeNotIn(List<String> values) {
            addCriterion("CO_BODERTYPE not in", values, "bodertype");
            return (Criteria) this;
        }

        public Criteria andBodertypeBetween(String value1, String value2) {
            addCriterion("CO_BODERTYPE between", value1, value2, "bodertype");
            return (Criteria) this;
        }

        public Criteria andBodertypeNotBetween(String value1, String value2) {
            addCriterion("CO_BODERTYPE not between", value1, value2, "bodertype");
            return (Criteria) this;
        }

        public Criteria andHeadhasIsNull() {
            addCriterion("CO_HEADHAS is null");
            return (Criteria) this;
        }

        public Criteria andHeadhasIsNotNull() {
            addCriterion("CO_HEADHAS is not null");
            return (Criteria) this;
        }

        public Criteria andHeadhasEqualTo(String value) {
            addCriterion("CO_HEADHAS =", value, "headhas");
            return (Criteria) this;
        }

        public Criteria andHeadhasNotEqualTo(String value) {
            addCriterion("CO_HEADHAS <>", value, "headhas");
            return (Criteria) this;
        }

        public Criteria andHeadhasGreaterThan(String value) {
            addCriterion("CO_HEADHAS >", value, "headhas");
            return (Criteria) this;
        }

        public Criteria andHeadhasGreaterThanOrEqualTo(String value) {
            addCriterion("CO_HEADHAS >=", value, "headhas");
            return (Criteria) this;
        }

        public Criteria andHeadhasLessThan(String value) {
            addCriterion("CO_HEADHAS <", value, "headhas");
            return (Criteria) this;
        }

        public Criteria andHeadhasLessThanOrEqualTo(String value) {
            addCriterion("CO_HEADHAS <=", value, "headhas");
            return (Criteria) this;
        }

        public Criteria andHeadhasLike(String value) {
            addCriterion("CO_HEADHAS like", value, "headhas");
            return (Criteria) this;
        }

        public Criteria andHeadhasNotLike(String value) {
            addCriterion("CO_HEADHAS not like", value, "headhas");
            return (Criteria) this;
        }

        public Criteria andHeadhasIn(List<String> values) {
            addCriterion("CO_HEADHAS in", values, "headhas");
            return (Criteria) this;
        }

        public Criteria andHeadhasNotIn(List<String> values) {
            addCriterion("CO_HEADHAS not in", values, "headhas");
            return (Criteria) this;
        }

        public Criteria andHeadhasBetween(String value1, String value2) {
            addCriterion("CO_HEADHAS between", value1, value2, "headhas");
            return (Criteria) this;
        }

        public Criteria andHeadhasNotBetween(String value1, String value2) {
            addCriterion("CO_HEADHAS not between", value1, value2, "headhas");
            return (Criteria) this;
        }

        public Criteria andFinasourceIsNull() {
            addCriterion("CO_FINASOURCE is null");
            return (Criteria) this;
        }

        public Criteria andFinasourceIsNotNull() {
            addCriterion("CO_FINASOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andFinasourceEqualTo(String value) {
            addCriterion("CO_FINASOURCE =", value, "finasource");
            return (Criteria) this;
        }

        public Criteria andFinasourceNotEqualTo(String value) {
            addCriterion("CO_FINASOURCE <>", value, "finasource");
            return (Criteria) this;
        }

        public Criteria andFinasourceGreaterThan(String value) {
            addCriterion("CO_FINASOURCE >", value, "finasource");
            return (Criteria) this;
        }

        public Criteria andFinasourceGreaterThanOrEqualTo(String value) {
            addCriterion("CO_FINASOURCE >=", value, "finasource");
            return (Criteria) this;
        }

        public Criteria andFinasourceLessThan(String value) {
            addCriterion("CO_FINASOURCE <", value, "finasource");
            return (Criteria) this;
        }

        public Criteria andFinasourceLessThanOrEqualTo(String value) {
            addCriterion("CO_FINASOURCE <=", value, "finasource");
            return (Criteria) this;
        }

        public Criteria andFinasourceLike(String value) {
            addCriterion("CO_FINASOURCE like", value, "finasource");
            return (Criteria) this;
        }

        public Criteria andFinasourceNotLike(String value) {
            addCriterion("CO_FINASOURCE not like", value, "finasource");
            return (Criteria) this;
        }

        public Criteria andFinasourceIn(List<String> values) {
            addCriterion("CO_FINASOURCE in", values, "finasource");
            return (Criteria) this;
        }

        public Criteria andFinasourceNotIn(List<String> values) {
            addCriterion("CO_FINASOURCE not in", values, "finasource");
            return (Criteria) this;
        }

        public Criteria andFinasourceBetween(String value1, String value2) {
            addCriterion("CO_FINASOURCE between", value1, value2, "finasource");
            return (Criteria) this;
        }

        public Criteria andFinasourceNotBetween(String value1, String value2) {
            addCriterion("CO_FINASOURCE not between", value1, value2, "finasource");
            return (Criteria) this;
        }

        public Criteria andResppersonIsNull() {
            addCriterion("CO_RESPPERSON is null");
            return (Criteria) this;
        }

        public Criteria andResppersonIsNotNull() {
            addCriterion("CO_RESPPERSON is not null");
            return (Criteria) this;
        }

        public Criteria andResppersonEqualTo(String value) {
            addCriterion("CO_RESPPERSON =", value, "respperson");
            return (Criteria) this;
        }

        public Criteria andResppersonNotEqualTo(String value) {
            addCriterion("CO_RESPPERSON <>", value, "respperson");
            return (Criteria) this;
        }

        public Criteria andResppersonGreaterThan(String value) {
            addCriterion("CO_RESPPERSON >", value, "respperson");
            return (Criteria) this;
        }

        public Criteria andResppersonGreaterThanOrEqualTo(String value) {
            addCriterion("CO_RESPPERSON >=", value, "respperson");
            return (Criteria) this;
        }

        public Criteria andResppersonLessThan(String value) {
            addCriterion("CO_RESPPERSON <", value, "respperson");
            return (Criteria) this;
        }

        public Criteria andResppersonLessThanOrEqualTo(String value) {
            addCriterion("CO_RESPPERSON <=", value, "respperson");
            return (Criteria) this;
        }

        public Criteria andResppersonLike(String value) {
            addCriterion("CO_RESPPERSON like", value, "respperson");
            return (Criteria) this;
        }

        public Criteria andResppersonNotLike(String value) {
            addCriterion("CO_RESPPERSON not like", value, "respperson");
            return (Criteria) this;
        }

        public Criteria andResppersonIn(List<String> values) {
            addCriterion("CO_RESPPERSON in", values, "respperson");
            return (Criteria) this;
        }

        public Criteria andResppersonNotIn(List<String> values) {
            addCriterion("CO_RESPPERSON not in", values, "respperson");
            return (Criteria) this;
        }

        public Criteria andResppersonBetween(String value1, String value2) {
            addCriterion("CO_RESPPERSON between", value1, value2, "respperson");
            return (Criteria) this;
        }

        public Criteria andResppersonNotBetween(String value1, String value2) {
            addCriterion("CO_RESPPERSON not between", value1, value2, "respperson");
            return (Criteria) this;
        }

        public Criteria andLegalpersonIsNull() {
            addCriterion("CO_LEGALPERSON is null");
            return (Criteria) this;
        }

        public Criteria andLegalpersonIsNotNull() {
            addCriterion("CO_LEGALPERSON is not null");
            return (Criteria) this;
        }

        public Criteria andLegalpersonEqualTo(String value) {
            addCriterion("CO_LEGALPERSON =", value, "legalperson");
            return (Criteria) this;
        }

        public Criteria andLegalpersonNotEqualTo(String value) {
            addCriterion("CO_LEGALPERSON <>", value, "legalperson");
            return (Criteria) this;
        }

        public Criteria andLegalpersonGreaterThan(String value) {
            addCriterion("CO_LEGALPERSON >", value, "legalperson");
            return (Criteria) this;
        }

        public Criteria andLegalpersonGreaterThanOrEqualTo(String value) {
            addCriterion("CO_LEGALPERSON >=", value, "legalperson");
            return (Criteria) this;
        }

        public Criteria andLegalpersonLessThan(String value) {
            addCriterion("CO_LEGALPERSON <", value, "legalperson");
            return (Criteria) this;
        }

        public Criteria andLegalpersonLessThanOrEqualTo(String value) {
            addCriterion("CO_LEGALPERSON <=", value, "legalperson");
            return (Criteria) this;
        }

        public Criteria andLegalpersonLike(String value) {
            addCriterion("CO_LEGALPERSON like", value, "legalperson");
            return (Criteria) this;
        }

        public Criteria andLegalpersonNotLike(String value) {
            addCriterion("CO_LEGALPERSON not like", value, "legalperson");
            return (Criteria) this;
        }

        public Criteria andLegalpersonIn(List<String> values) {
            addCriterion("CO_LEGALPERSON in", values, "legalperson");
            return (Criteria) this;
        }

        public Criteria andLegalpersonNotIn(List<String> values) {
            addCriterion("CO_LEGALPERSON not in", values, "legalperson");
            return (Criteria) this;
        }

        public Criteria andLegalpersonBetween(String value1, String value2) {
            addCriterion("CO_LEGALPERSON between", value1, value2, "legalperson");
            return (Criteria) this;
        }

        public Criteria andLegalpersonNotBetween(String value1, String value2) {
            addCriterion("CO_LEGALPERSON not between", value1, value2, "legalperson");
            return (Criteria) this;
        }

        public Criteria andSubjectionIsNull() {
            addCriterion("CO_SUBJECTION is null");
            return (Criteria) this;
        }

        public Criteria andSubjectionIsNotNull() {
            addCriterion("CO_SUBJECTION is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectionEqualTo(String value) {
            addCriterion("CO_SUBJECTION =", value, "subjection");
            return (Criteria) this;
        }

        public Criteria andSubjectionNotEqualTo(String value) {
            addCriterion("CO_SUBJECTION <>", value, "subjection");
            return (Criteria) this;
        }

        public Criteria andSubjectionGreaterThan(String value) {
            addCriterion("CO_SUBJECTION >", value, "subjection");
            return (Criteria) this;
        }

        public Criteria andSubjectionGreaterThanOrEqualTo(String value) {
            addCriterion("CO_SUBJECTION >=", value, "subjection");
            return (Criteria) this;
        }

        public Criteria andSubjectionLessThan(String value) {
            addCriterion("CO_SUBJECTION <", value, "subjection");
            return (Criteria) this;
        }

        public Criteria andSubjectionLessThanOrEqualTo(String value) {
            addCriterion("CO_SUBJECTION <=", value, "subjection");
            return (Criteria) this;
        }

        public Criteria andSubjectionLike(String value) {
            addCriterion("CO_SUBJECTION like", value, "subjection");
            return (Criteria) this;
        }

        public Criteria andSubjectionNotLike(String value) {
            addCriterion("CO_SUBJECTION not like", value, "subjection");
            return (Criteria) this;
        }

        public Criteria andSubjectionIn(List<String> values) {
            addCriterion("CO_SUBJECTION in", values, "subjection");
            return (Criteria) this;
        }

        public Criteria andSubjectionNotIn(List<String> values) {
            addCriterion("CO_SUBJECTION not in", values, "subjection");
            return (Criteria) this;
        }

        public Criteria andSubjectionBetween(String value1, String value2) {
            addCriterion("CO_SUBJECTION between", value1, value2, "subjection");
            return (Criteria) this;
        }

        public Criteria andSubjectionNotBetween(String value1, String value2) {
            addCriterion("CO_SUBJECTION not between", value1, value2, "subjection");
            return (Criteria) this;
        }

        public Criteria andNaturetypeIsNull() {
            addCriterion("CO_NATURETYPE is null");
            return (Criteria) this;
        }

        public Criteria andNaturetypeIsNotNull() {
            addCriterion("CO_NATURETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andNaturetypeEqualTo(String value) {
            addCriterion("CO_NATURETYPE =", value, "naturetype");
            return (Criteria) this;
        }

        public Criteria andNaturetypeNotEqualTo(String value) {
            addCriterion("CO_NATURETYPE <>", value, "naturetype");
            return (Criteria) this;
        }

        public Criteria andNaturetypeGreaterThan(String value) {
            addCriterion("CO_NATURETYPE >", value, "naturetype");
            return (Criteria) this;
        }

        public Criteria andNaturetypeGreaterThanOrEqualTo(String value) {
            addCriterion("CO_NATURETYPE >=", value, "naturetype");
            return (Criteria) this;
        }

        public Criteria andNaturetypeLessThan(String value) {
            addCriterion("CO_NATURETYPE <", value, "naturetype");
            return (Criteria) this;
        }

        public Criteria andNaturetypeLessThanOrEqualTo(String value) {
            addCriterion("CO_NATURETYPE <=", value, "naturetype");
            return (Criteria) this;
        }

        public Criteria andNaturetypeLike(String value) {
            addCriterion("CO_NATURETYPE like", value, "naturetype");
            return (Criteria) this;
        }

        public Criteria andNaturetypeNotLike(String value) {
            addCriterion("CO_NATURETYPE not like", value, "naturetype");
            return (Criteria) this;
        }

        public Criteria andNaturetypeIn(List<String> values) {
            addCriterion("CO_NATURETYPE in", values, "naturetype");
            return (Criteria) this;
        }

        public Criteria andNaturetypeNotIn(List<String> values) {
            addCriterion("CO_NATURETYPE not in", values, "naturetype");
            return (Criteria) this;
        }

        public Criteria andNaturetypeBetween(String value1, String value2) {
            addCriterion("CO_NATURETYPE between", value1, value2, "naturetype");
            return (Criteria) this;
        }

        public Criteria andNaturetypeNotBetween(String value1, String value2) {
            addCriterion("CO_NATURETYPE not between", value1, value2, "naturetype");
            return (Criteria) this;
        }

        public Criteria andApprnumIsNull() {
            addCriterion("CO_APPRNUM is null");
            return (Criteria) this;
        }

        public Criteria andApprnumIsNotNull() {
            addCriterion("CO_APPRNUM is not null");
            return (Criteria) this;
        }

        public Criteria andApprnumEqualTo(String value) {
            addCriterion("CO_APPRNUM =", value, "apprnum");
            return (Criteria) this;
        }

        public Criteria andApprnumNotEqualTo(String value) {
            addCriterion("CO_APPRNUM <>", value, "apprnum");
            return (Criteria) this;
        }

        public Criteria andApprnumGreaterThan(String value) {
            addCriterion("CO_APPRNUM >", value, "apprnum");
            return (Criteria) this;
        }

        public Criteria andApprnumGreaterThanOrEqualTo(String value) {
            addCriterion("CO_APPRNUM >=", value, "apprnum");
            return (Criteria) this;
        }

        public Criteria andApprnumLessThan(String value) {
            addCriterion("CO_APPRNUM <", value, "apprnum");
            return (Criteria) this;
        }

        public Criteria andApprnumLessThanOrEqualTo(String value) {
            addCriterion("CO_APPRNUM <=", value, "apprnum");
            return (Criteria) this;
        }

        public Criteria andApprnumLike(String value) {
            addCriterion("CO_APPRNUM like", value, "apprnum");
            return (Criteria) this;
        }

        public Criteria andApprnumNotLike(String value) {
            addCriterion("CO_APPRNUM not like", value, "apprnum");
            return (Criteria) this;
        }

        public Criteria andApprnumIn(List<String> values) {
            addCriterion("CO_APPRNUM in", values, "apprnum");
            return (Criteria) this;
        }

        public Criteria andApprnumNotIn(List<String> values) {
            addCriterion("CO_APPRNUM not in", values, "apprnum");
            return (Criteria) this;
        }

        public Criteria andApprnumBetween(String value1, String value2) {
            addCriterion("CO_APPRNUM between", value1, value2, "apprnum");
            return (Criteria) this;
        }

        public Criteria andApprnumNotBetween(String value1, String value2) {
            addCriterion("CO_APPRNUM not between", value1, value2, "apprnum");
            return (Criteria) this;
        }

        public Criteria andPertotalnumIsNull() {
            addCriterion("CO_PERTOTALNUM is null");
            return (Criteria) this;
        }

        public Criteria andPertotalnumIsNotNull() {
            addCriterion("CO_PERTOTALNUM is not null");
            return (Criteria) this;
        }

        public Criteria andPertotalnumEqualTo(String value) {
            addCriterion("CO_PERTOTALNUM =", value, "pertotalnum");
            return (Criteria) this;
        }

        public Criteria andPertotalnumNotEqualTo(String value) {
            addCriterion("CO_PERTOTALNUM <>", value, "pertotalnum");
            return (Criteria) this;
        }

        public Criteria andPertotalnumGreaterThan(String value) {
            addCriterion("CO_PERTOTALNUM >", value, "pertotalnum");
            return (Criteria) this;
        }

        public Criteria andPertotalnumGreaterThanOrEqualTo(String value) {
            addCriterion("CO_PERTOTALNUM >=", value, "pertotalnum");
            return (Criteria) this;
        }

        public Criteria andPertotalnumLessThan(String value) {
            addCriterion("CO_PERTOTALNUM <", value, "pertotalnum");
            return (Criteria) this;
        }

        public Criteria andPertotalnumLessThanOrEqualTo(String value) {
            addCriterion("CO_PERTOTALNUM <=", value, "pertotalnum");
            return (Criteria) this;
        }

        public Criteria andPertotalnumLike(String value) {
            addCriterion("CO_PERTOTALNUM like", value, "pertotalnum");
            return (Criteria) this;
        }

        public Criteria andPertotalnumNotLike(String value) {
            addCriterion("CO_PERTOTALNUM not like", value, "pertotalnum");
            return (Criteria) this;
        }

        public Criteria andPertotalnumIn(List<String> values) {
            addCriterion("CO_PERTOTALNUM in", values, "pertotalnum");
            return (Criteria) this;
        }

        public Criteria andPertotalnumNotIn(List<String> values) {
            addCriterion("CO_PERTOTALNUM not in", values, "pertotalnum");
            return (Criteria) this;
        }

        public Criteria andPertotalnumBetween(String value1, String value2) {
            addCriterion("CO_PERTOTALNUM between", value1, value2, "pertotalnum");
            return (Criteria) this;
        }

        public Criteria andPertotalnumNotBetween(String value1, String value2) {
            addCriterion("CO_PERTOTALNUM not between", value1, value2, "pertotalnum");
            return (Criteria) this;
        }

        public Criteria andPersurlv1IsNull() {
            addCriterion("CO_PERSURLV1 is null");
            return (Criteria) this;
        }

        public Criteria andPersurlv1IsNotNull() {
            addCriterion("CO_PERSURLV1 is not null");
            return (Criteria) this;
        }

        public Criteria andPersurlv1EqualTo(Long value) {
            addCriterion("CO_PERSURLV1 =", value, "persurlv1");
            return (Criteria) this;
        }

        public Criteria andPersurlv1NotEqualTo(Long value) {
            addCriterion("CO_PERSURLV1 <>", value, "persurlv1");
            return (Criteria) this;
        }

        public Criteria andPersurlv1GreaterThan(Long value) {
            addCriterion("CO_PERSURLV1 >", value, "persurlv1");
            return (Criteria) this;
        }

        public Criteria andPersurlv1GreaterThanOrEqualTo(Long value) {
            addCriterion("CO_PERSURLV1 >=", value, "persurlv1");
            return (Criteria) this;
        }

        public Criteria andPersurlv1LessThan(Long value) {
            addCriterion("CO_PERSURLV1 <", value, "persurlv1");
            return (Criteria) this;
        }

        public Criteria andPersurlv1LessThanOrEqualTo(Long value) {
            addCriterion("CO_PERSURLV1 <=", value, "persurlv1");
            return (Criteria) this;
        }

        public Criteria andPersurlv1In(List<Long> values) {
            addCriterion("CO_PERSURLV1 in", values, "persurlv1");
            return (Criteria) this;
        }

        public Criteria andPersurlv1NotIn(List<Long> values) {
            addCriterion("CO_PERSURLV1 not in", values, "persurlv1");
            return (Criteria) this;
        }

        public Criteria andPersurlv1Between(Long value1, Long value2) {
            addCriterion("CO_PERSURLV1 between", value1, value2, "persurlv1");
            return (Criteria) this;
        }

        public Criteria andPersurlv1NotBetween(Long value1, Long value2) {
            addCriterion("CO_PERSURLV1 not between", value1, value2, "persurlv1");
            return (Criteria) this;
        }

        public Criteria andPersurlv2IsNull() {
            addCriterion("CO_PERSURLV2 is null");
            return (Criteria) this;
        }

        public Criteria andPersurlv2IsNotNull() {
            addCriterion("CO_PERSURLV2 is not null");
            return (Criteria) this;
        }

        public Criteria andPersurlv2EqualTo(Long value) {
            addCriterion("CO_PERSURLV2 =", value, "persurlv2");
            return (Criteria) this;
        }

        public Criteria andPersurlv2NotEqualTo(Long value) {
            addCriterion("CO_PERSURLV2 <>", value, "persurlv2");
            return (Criteria) this;
        }

        public Criteria andPersurlv2GreaterThan(Long value) {
            addCriterion("CO_PERSURLV2 >", value, "persurlv2");
            return (Criteria) this;
        }

        public Criteria andPersurlv2GreaterThanOrEqualTo(Long value) {
            addCriterion("CO_PERSURLV2 >=", value, "persurlv2");
            return (Criteria) this;
        }

        public Criteria andPersurlv2LessThan(Long value) {
            addCriterion("CO_PERSURLV2 <", value, "persurlv2");
            return (Criteria) this;
        }

        public Criteria andPersurlv2LessThanOrEqualTo(Long value) {
            addCriterion("CO_PERSURLV2 <=", value, "persurlv2");
            return (Criteria) this;
        }

        public Criteria andPersurlv2In(List<Long> values) {
            addCriterion("CO_PERSURLV2 in", values, "persurlv2");
            return (Criteria) this;
        }

        public Criteria andPersurlv2NotIn(List<Long> values) {
            addCriterion("CO_PERSURLV2 not in", values, "persurlv2");
            return (Criteria) this;
        }

        public Criteria andPersurlv2Between(Long value1, Long value2) {
            addCriterion("CO_PERSURLV2 between", value1, value2, "persurlv2");
            return (Criteria) this;
        }

        public Criteria andPersurlv2NotBetween(Long value1, Long value2) {
            addCriterion("CO_PERSURLV2 not between", value1, value2, "persurlv2");
            return (Criteria) this;
        }

        public Criteria andPersurlv3IsNull() {
            addCriterion("CO_PERSURLV3 is null");
            return (Criteria) this;
        }

        public Criteria andPersurlv3IsNotNull() {
            addCriterion("CO_PERSURLV3 is not null");
            return (Criteria) this;
        }

        public Criteria andPersurlv3EqualTo(Long value) {
            addCriterion("CO_PERSURLV3 =", value, "persurlv3");
            return (Criteria) this;
        }

        public Criteria andPersurlv3NotEqualTo(Long value) {
            addCriterion("CO_PERSURLV3 <>", value, "persurlv3");
            return (Criteria) this;
        }

        public Criteria andPersurlv3GreaterThan(Long value) {
            addCriterion("CO_PERSURLV3 >", value, "persurlv3");
            return (Criteria) this;
        }

        public Criteria andPersurlv3GreaterThanOrEqualTo(Long value) {
            addCriterion("CO_PERSURLV3 >=", value, "persurlv3");
            return (Criteria) this;
        }

        public Criteria andPersurlv3LessThan(Long value) {
            addCriterion("CO_PERSURLV3 <", value, "persurlv3");
            return (Criteria) this;
        }

        public Criteria andPersurlv3LessThanOrEqualTo(Long value) {
            addCriterion("CO_PERSURLV3 <=", value, "persurlv3");
            return (Criteria) this;
        }

        public Criteria andPersurlv3In(List<Long> values) {
            addCriterion("CO_PERSURLV3 in", values, "persurlv3");
            return (Criteria) this;
        }

        public Criteria andPersurlv3NotIn(List<Long> values) {
            addCriterion("CO_PERSURLV3 not in", values, "persurlv3");
            return (Criteria) this;
        }

        public Criteria andPersurlv3Between(Long value1, Long value2) {
            addCriterion("CO_PERSURLV3 between", value1, value2, "persurlv3");
            return (Criteria) this;
        }

        public Criteria andPersurlv3NotBetween(Long value1, Long value2) {
            addCriterion("CO_PERSURLV3 not between", value1, value2, "persurlv3");
            return (Criteria) this;
        }

        public Criteria andPersuroceanIsNull() {
            addCriterion("CO_PERSUROCEAN is null");
            return (Criteria) this;
        }

        public Criteria andPersuroceanIsNotNull() {
            addCriterion("CO_PERSUROCEAN is not null");
            return (Criteria) this;
        }

        public Criteria andPersuroceanEqualTo(Long value) {
            addCriterion("CO_PERSUROCEAN =", value, "persurocean");
            return (Criteria) this;
        }

        public Criteria andPersuroceanNotEqualTo(Long value) {
            addCriterion("CO_PERSUROCEAN <>", value, "persurocean");
            return (Criteria) this;
        }

        public Criteria andPersuroceanGreaterThan(Long value) {
            addCriterion("CO_PERSUROCEAN >", value, "persurocean");
            return (Criteria) this;
        }

        public Criteria andPersuroceanGreaterThanOrEqualTo(Long value) {
            addCriterion("CO_PERSUROCEAN >=", value, "persurocean");
            return (Criteria) this;
        }

        public Criteria andPersuroceanLessThan(Long value) {
            addCriterion("CO_PERSUROCEAN <", value, "persurocean");
            return (Criteria) this;
        }

        public Criteria andPersuroceanLessThanOrEqualTo(Long value) {
            addCriterion("CO_PERSUROCEAN <=", value, "persurocean");
            return (Criteria) this;
        }

        public Criteria andPersuroceanIn(List<Long> values) {
            addCriterion("CO_PERSUROCEAN in", values, "persurocean");
            return (Criteria) this;
        }

        public Criteria andPersuroceanNotIn(List<Long> values) {
            addCriterion("CO_PERSUROCEAN not in", values, "persurocean");
            return (Criteria) this;
        }

        public Criteria andPersuroceanBetween(Long value1, Long value2) {
            addCriterion("CO_PERSUROCEAN between", value1, value2, "persurocean");
            return (Criteria) this;
        }

        public Criteria andPersuroceanNotBetween(Long value1, Long value2) {
            addCriterion("CO_PERSUROCEAN not between", value1, value2, "persurocean");
            return (Criteria) this;
        }

        public Criteria andPersurdrawIsNull() {
            addCriterion("CO_PERSURDRAW is null");
            return (Criteria) this;
        }

        public Criteria andPersurdrawIsNotNull() {
            addCriterion("CO_PERSURDRAW is not null");
            return (Criteria) this;
        }

        public Criteria andPersurdrawEqualTo(Long value) {
            addCriterion("CO_PERSURDRAW =", value, "persurdraw");
            return (Criteria) this;
        }

        public Criteria andPersurdrawNotEqualTo(Long value) {
            addCriterion("CO_PERSURDRAW <>", value, "persurdraw");
            return (Criteria) this;
        }

        public Criteria andPersurdrawGreaterThan(Long value) {
            addCriterion("CO_PERSURDRAW >", value, "persurdraw");
            return (Criteria) this;
        }

        public Criteria andPersurdrawGreaterThanOrEqualTo(Long value) {
            addCriterion("CO_PERSURDRAW >=", value, "persurdraw");
            return (Criteria) this;
        }

        public Criteria andPersurdrawLessThan(Long value) {
            addCriterion("CO_PERSURDRAW <", value, "persurdraw");
            return (Criteria) this;
        }

        public Criteria andPersurdrawLessThanOrEqualTo(Long value) {
            addCriterion("CO_PERSURDRAW <=", value, "persurdraw");
            return (Criteria) this;
        }

        public Criteria andPersurdrawIn(List<Long> values) {
            addCriterion("CO_PERSURDRAW in", values, "persurdraw");
            return (Criteria) this;
        }

        public Criteria andPersurdrawNotIn(List<Long> values) {
            addCriterion("CO_PERSURDRAW not in", values, "persurdraw");
            return (Criteria) this;
        }

        public Criteria andPersurdrawBetween(Long value1, Long value2) {
            addCriterion("CO_PERSURDRAW between", value1, value2, "persurdraw");
            return (Criteria) this;
        }

        public Criteria andPersurdrawNotBetween(Long value1, Long value2) {
            addCriterion("CO_PERSURDRAW not between", value1, value2, "persurdraw");
            return (Criteria) this;
        }

        public Criteria andPersurproductIsNull() {
            addCriterion("CO_PERSURPRODUCT is null");
            return (Criteria) this;
        }

        public Criteria andPersurproductIsNotNull() {
            addCriterion("CO_PERSURPRODUCT is not null");
            return (Criteria) this;
        }

        public Criteria andPersurproductEqualTo(Long value) {
            addCriterion("CO_PERSURPRODUCT =", value, "persurproduct");
            return (Criteria) this;
        }

        public Criteria andPersurproductNotEqualTo(Long value) {
            addCriterion("CO_PERSURPRODUCT <>", value, "persurproduct");
            return (Criteria) this;
        }

        public Criteria andPersurproductGreaterThan(Long value) {
            addCriterion("CO_PERSURPRODUCT >", value, "persurproduct");
            return (Criteria) this;
        }

        public Criteria andPersurproductGreaterThanOrEqualTo(Long value) {
            addCriterion("CO_PERSURPRODUCT >=", value, "persurproduct");
            return (Criteria) this;
        }

        public Criteria andPersurproductLessThan(Long value) {
            addCriterion("CO_PERSURPRODUCT <", value, "persurproduct");
            return (Criteria) this;
        }

        public Criteria andPersurproductLessThanOrEqualTo(Long value) {
            addCriterion("CO_PERSURPRODUCT <=", value, "persurproduct");
            return (Criteria) this;
        }

        public Criteria andPersurproductIn(List<Long> values) {
            addCriterion("CO_PERSURPRODUCT in", values, "persurproduct");
            return (Criteria) this;
        }

        public Criteria andPersurproductNotIn(List<Long> values) {
            addCriterion("CO_PERSURPRODUCT not in", values, "persurproduct");
            return (Criteria) this;
        }

        public Criteria andPersurproductBetween(Long value1, Long value2) {
            addCriterion("CO_PERSURPRODUCT between", value1, value2, "persurproduct");
            return (Criteria) this;
        }

        public Criteria andPersurproductNotBetween(Long value1, Long value2) {
            addCriterion("CO_PERSURPRODUCT not between", value1, value2, "persurproduct");
            return (Criteria) this;
        }

        public Criteria andJuniordownIsNull() {
            addCriterion("CO_JUNIORDOWN is null");
            return (Criteria) this;
        }

        public Criteria andJuniordownIsNotNull() {
            addCriterion("CO_JUNIORDOWN is not null");
            return (Criteria) this;
        }

        public Criteria andJuniordownEqualTo(Long value) {
            addCriterion("CO_JUNIORDOWN =", value, "juniordown");
            return (Criteria) this;
        }

        public Criteria andJuniordownNotEqualTo(Long value) {
            addCriterion("CO_JUNIORDOWN <>", value, "juniordown");
            return (Criteria) this;
        }

        public Criteria andJuniordownGreaterThan(Long value) {
            addCriterion("CO_JUNIORDOWN >", value, "juniordown");
            return (Criteria) this;
        }

        public Criteria andJuniordownGreaterThanOrEqualTo(Long value) {
            addCriterion("CO_JUNIORDOWN >=", value, "juniordown");
            return (Criteria) this;
        }

        public Criteria andJuniordownLessThan(Long value) {
            addCriterion("CO_JUNIORDOWN <", value, "juniordown");
            return (Criteria) this;
        }

        public Criteria andJuniordownLessThanOrEqualTo(Long value) {
            addCriterion("CO_JUNIORDOWN <=", value, "juniordown");
            return (Criteria) this;
        }

        public Criteria andJuniordownIn(List<Long> values) {
            addCriterion("CO_JUNIORDOWN in", values, "juniordown");
            return (Criteria) this;
        }

        public Criteria andJuniordownNotIn(List<Long> values) {
            addCriterion("CO_JUNIORDOWN not in", values, "juniordown");
            return (Criteria) this;
        }

        public Criteria andJuniordownBetween(Long value1, Long value2) {
            addCriterion("CO_JUNIORDOWN between", value1, value2, "juniordown");
            return (Criteria) this;
        }

        public Criteria andJuniordownNotBetween(Long value1, Long value2) {
            addCriterion("CO_JUNIORDOWN not between", value1, value2, "juniordown");
            return (Criteria) this;
        }

        public Criteria andJuniorupIsNull() {
            addCriterion("CO_JUNIORUP is null");
            return (Criteria) this;
        }

        public Criteria andJuniorupIsNotNull() {
            addCriterion("CO_JUNIORUP is not null");
            return (Criteria) this;
        }

        public Criteria andJuniorupEqualTo(Long value) {
            addCriterion("CO_JUNIORUP =", value, "juniorup");
            return (Criteria) this;
        }

        public Criteria andJuniorupNotEqualTo(Long value) {
            addCriterion("CO_JUNIORUP <>", value, "juniorup");
            return (Criteria) this;
        }

        public Criteria andJuniorupGreaterThan(Long value) {
            addCriterion("CO_JUNIORUP >", value, "juniorup");
            return (Criteria) this;
        }

        public Criteria andJuniorupGreaterThanOrEqualTo(Long value) {
            addCriterion("CO_JUNIORUP >=", value, "juniorup");
            return (Criteria) this;
        }

        public Criteria andJuniorupLessThan(Long value) {
            addCriterion("CO_JUNIORUP <", value, "juniorup");
            return (Criteria) this;
        }

        public Criteria andJuniorupLessThanOrEqualTo(Long value) {
            addCriterion("CO_JUNIORUP <=", value, "juniorup");
            return (Criteria) this;
        }

        public Criteria andJuniorupIn(List<Long> values) {
            addCriterion("CO_JUNIORUP in", values, "juniorup");
            return (Criteria) this;
        }

        public Criteria andJuniorupNotIn(List<Long> values) {
            addCriterion("CO_JUNIORUP not in", values, "juniorup");
            return (Criteria) this;
        }

        public Criteria andJuniorupBetween(Long value1, Long value2) {
            addCriterion("CO_JUNIORUP between", value1, value2, "juniorup");
            return (Criteria) this;
        }

        public Criteria andJuniorupNotBetween(Long value1, Long value2) {
            addCriterion("CO_JUNIORUP not between", value1, value2, "juniorup");
            return (Criteria) this;
        }

        public Criteria andBachelorupIsNull() {
            addCriterion("CO_BACHELORUP is null");
            return (Criteria) this;
        }

        public Criteria andBachelorupIsNotNull() {
            addCriterion("CO_BACHELORUP is not null");
            return (Criteria) this;
        }

        public Criteria andBachelorupEqualTo(Long value) {
            addCriterion("CO_BACHELORUP =", value, "bachelorup");
            return (Criteria) this;
        }

        public Criteria andBachelorupNotEqualTo(Long value) {
            addCriterion("CO_BACHELORUP <>", value, "bachelorup");
            return (Criteria) this;
        }

        public Criteria andBachelorupGreaterThan(Long value) {
            addCriterion("CO_BACHELORUP >", value, "bachelorup");
            return (Criteria) this;
        }

        public Criteria andBachelorupGreaterThanOrEqualTo(Long value) {
            addCriterion("CO_BACHELORUP >=", value, "bachelorup");
            return (Criteria) this;
        }

        public Criteria andBachelorupLessThan(Long value) {
            addCriterion("CO_BACHELORUP <", value, "bachelorup");
            return (Criteria) this;
        }

        public Criteria andBachelorupLessThanOrEqualTo(Long value) {
            addCriterion("CO_BACHELORUP <=", value, "bachelorup");
            return (Criteria) this;
        }

        public Criteria andBachelorupIn(List<Long> values) {
            addCriterion("CO_BACHELORUP in", values, "bachelorup");
            return (Criteria) this;
        }

        public Criteria andBachelorupNotIn(List<Long> values) {
            addCriterion("CO_BACHELORUP not in", values, "bachelorup");
            return (Criteria) this;
        }

        public Criteria andBachelorupBetween(Long value1, Long value2) {
            addCriterion("CO_BACHELORUP between", value1, value2, "bachelorup");
            return (Criteria) this;
        }

        public Criteria andBachelorupNotBetween(Long value1, Long value2) {
            addCriterion("CO_BACHELORUP not between", value1, value2, "bachelorup");
            return (Criteria) this;
        }

        public Criteria andGraduateupIsNull() {
            addCriterion("CO_GRADUATEUP is null");
            return (Criteria) this;
        }

        public Criteria andGraduateupIsNotNull() {
            addCriterion("CO_GRADUATEUP is not null");
            return (Criteria) this;
        }

        public Criteria andGraduateupEqualTo(Long value) {
            addCriterion("CO_GRADUATEUP =", value, "graduateup");
            return (Criteria) this;
        }

        public Criteria andGraduateupNotEqualTo(Long value) {
            addCriterion("CO_GRADUATEUP <>", value, "graduateup");
            return (Criteria) this;
        }

        public Criteria andGraduateupGreaterThan(Long value) {
            addCriterion("CO_GRADUATEUP >", value, "graduateup");
            return (Criteria) this;
        }

        public Criteria andGraduateupGreaterThanOrEqualTo(Long value) {
            addCriterion("CO_GRADUATEUP >=", value, "graduateup");
            return (Criteria) this;
        }

        public Criteria andGraduateupLessThan(Long value) {
            addCriterion("CO_GRADUATEUP <", value, "graduateup");
            return (Criteria) this;
        }

        public Criteria andGraduateupLessThanOrEqualTo(Long value) {
            addCriterion("CO_GRADUATEUP <=", value, "graduateup");
            return (Criteria) this;
        }

        public Criteria andGraduateupIn(List<Long> values) {
            addCriterion("CO_GRADUATEUP in", values, "graduateup");
            return (Criteria) this;
        }

        public Criteria andGraduateupNotIn(List<Long> values) {
            addCriterion("CO_GRADUATEUP not in", values, "graduateup");
            return (Criteria) this;
        }

        public Criteria andGraduateupBetween(Long value1, Long value2) {
            addCriterion("CO_GRADUATEUP between", value1, value2, "graduateup");
            return (Criteria) this;
        }

        public Criteria andGraduateupNotBetween(Long value1, Long value2) {
            addCriterion("CO_GRADUATEUP not between", value1, value2, "graduateup");
            return (Criteria) this;
        }

        public Criteria andOfficeareaIsNull() {
            addCriterion("CO_OFFICEAREA is null");
            return (Criteria) this;
        }

        public Criteria andOfficeareaIsNotNull() {
            addCriterion("CO_OFFICEAREA is not null");
            return (Criteria) this;
        }

        public Criteria andOfficeareaEqualTo(String value) {
            addCriterion("CO_OFFICEAREA =", value, "officearea");
            return (Criteria) this;
        }

        public Criteria andOfficeareaNotEqualTo(String value) {
            addCriterion("CO_OFFICEAREA <>", value, "officearea");
            return (Criteria) this;
        }

        public Criteria andOfficeareaGreaterThan(String value) {
            addCriterion("CO_OFFICEAREA >", value, "officearea");
            return (Criteria) this;
        }

        public Criteria andOfficeareaGreaterThanOrEqualTo(String value) {
            addCriterion("CO_OFFICEAREA >=", value, "officearea");
            return (Criteria) this;
        }

        public Criteria andOfficeareaLessThan(String value) {
            addCriterion("CO_OFFICEAREA <", value, "officearea");
            return (Criteria) this;
        }

        public Criteria andOfficeareaLessThanOrEqualTo(String value) {
            addCriterion("CO_OFFICEAREA <=", value, "officearea");
            return (Criteria) this;
        }

        public Criteria andOfficeareaLike(String value) {
            addCriterion("CO_OFFICEAREA like", value, "officearea");
            return (Criteria) this;
        }

        public Criteria andOfficeareaNotLike(String value) {
            addCriterion("CO_OFFICEAREA not like", value, "officearea");
            return (Criteria) this;
        }

        public Criteria andOfficeareaIn(List<String> values) {
            addCriterion("CO_OFFICEAREA in", values, "officearea");
            return (Criteria) this;
        }

        public Criteria andOfficeareaNotIn(List<String> values) {
            addCriterion("CO_OFFICEAREA not in", values, "officearea");
            return (Criteria) this;
        }

        public Criteria andOfficeareaBetween(String value1, String value2) {
            addCriterion("CO_OFFICEAREA between", value1, value2, "officearea");
            return (Criteria) this;
        }

        public Criteria andOfficeareaNotBetween(String value1, String value2) {
            addCriterion("CO_OFFICEAREA not between", value1, value2, "officearea");
            return (Criteria) this;
        }

        public Criteria andDeviceIsNull() {
            addCriterion("CO_DEVICE is null");
            return (Criteria) this;
        }

        public Criteria andDeviceIsNotNull() {
            addCriterion("CO_DEVICE is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceEqualTo(Long value) {
            addCriterion("CO_DEVICE =", value, "device");
            return (Criteria) this;
        }

        public Criteria andDeviceNotEqualTo(Long value) {
            addCriterion("CO_DEVICE <>", value, "device");
            return (Criteria) this;
        }

        public Criteria andDeviceGreaterThan(Long value) {
            addCriterion("CO_DEVICE >", value, "device");
            return (Criteria) this;
        }

        public Criteria andDeviceGreaterThanOrEqualTo(Long value) {
            addCriterion("CO_DEVICE >=", value, "device");
            return (Criteria) this;
        }

        public Criteria andDeviceLessThan(Long value) {
            addCriterion("CO_DEVICE <", value, "device");
            return (Criteria) this;
        }

        public Criteria andDeviceLessThanOrEqualTo(Long value) {
            addCriterion("CO_DEVICE <=", value, "device");
            return (Criteria) this;
        }

        public Criteria andDeviceIn(List<Long> values) {
            addCriterion("CO_DEVICE in", values, "device");
            return (Criteria) this;
        }

        public Criteria andDeviceNotIn(List<Long> values) {
            addCriterion("CO_DEVICE not in", values, "device");
            return (Criteria) this;
        }

        public Criteria andDeviceBetween(Long value1, Long value2) {
            addCriterion("CO_DEVICE between", value1, value2, "device");
            return (Criteria) this;
        }

        public Criteria andDeviceNotBetween(Long value1, Long value2) {
            addCriterion("CO_DEVICE not between", value1, value2, "device");
            return (Criteria) this;
        }

        public Criteria andCarnumIsNull() {
            addCriterion("CO_CARNUM is null");
            return (Criteria) this;
        }

        public Criteria andCarnumIsNotNull() {
            addCriterion("CO_CARNUM is not null");
            return (Criteria) this;
        }

        public Criteria andCarnumEqualTo(Integer value) {
            addCriterion("CO_CARNUM =", value, "carnum");
            return (Criteria) this;
        }

        public Criteria andCarnumNotEqualTo(Integer value) {
            addCriterion("CO_CARNUM <>", value, "carnum");
            return (Criteria) this;
        }

        public Criteria andCarnumGreaterThan(Integer value) {
            addCriterion("CO_CARNUM >", value, "carnum");
            return (Criteria) this;
        }

        public Criteria andCarnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("CO_CARNUM >=", value, "carnum");
            return (Criteria) this;
        }

        public Criteria andCarnumLessThan(Integer value) {
            addCriterion("CO_CARNUM <", value, "carnum");
            return (Criteria) this;
        }

        public Criteria andCarnumLessThanOrEqualTo(Integer value) {
            addCriterion("CO_CARNUM <=", value, "carnum");
            return (Criteria) this;
        }

        public Criteria andCarnumIn(List<Integer> values) {
            addCriterion("CO_CARNUM in", values, "carnum");
            return (Criteria) this;
        }

        public Criteria andCarnumNotIn(List<Integer> values) {
            addCriterion("CO_CARNUM not in", values, "carnum");
            return (Criteria) this;
        }

        public Criteria andCarnumBetween(Integer value1, Integer value2) {
            addCriterion("CO_CARNUM between", value1, value2, "carnum");
            return (Criteria) this;
        }

        public Criteria andCarnumNotBetween(Integer value1, Integer value2) {
            addCriterion("CO_CARNUM not between", value1, value2, "carnum");
            return (Criteria) this;
        }

        public Criteria andCompunumIsNull() {
            addCriterion("CO_COMPUNUM is null");
            return (Criteria) this;
        }

        public Criteria andCompunumIsNotNull() {
            addCriterion("CO_COMPUNUM is not null");
            return (Criteria) this;
        }

        public Criteria andCompunumEqualTo(Long value) {
            addCriterion("CO_COMPUNUM =", value, "compunum");
            return (Criteria) this;
        }

        public Criteria andCompunumNotEqualTo(Long value) {
            addCriterion("CO_COMPUNUM <>", value, "compunum");
            return (Criteria) this;
        }

        public Criteria andCompunumGreaterThan(Long value) {
            addCriterion("CO_COMPUNUM >", value, "compunum");
            return (Criteria) this;
        }

        public Criteria andCompunumGreaterThanOrEqualTo(Long value) {
            addCriterion("CO_COMPUNUM >=", value, "compunum");
            return (Criteria) this;
        }

        public Criteria andCompunumLessThan(Long value) {
            addCriterion("CO_COMPUNUM <", value, "compunum");
            return (Criteria) this;
        }

        public Criteria andCompunumLessThanOrEqualTo(Long value) {
            addCriterion("CO_COMPUNUM <=", value, "compunum");
            return (Criteria) this;
        }

        public Criteria andCompunumIn(List<Long> values) {
            addCriterion("CO_COMPUNUM in", values, "compunum");
            return (Criteria) this;
        }

        public Criteria andCompunumNotIn(List<Long> values) {
            addCriterion("CO_COMPUNUM not in", values, "compunum");
            return (Criteria) this;
        }

        public Criteria andCompunumBetween(Long value1, Long value2) {
            addCriterion("CO_COMPUNUM between", value1, value2, "compunum");
            return (Criteria) this;
        }

        public Criteria andCompunumNotBetween(Long value1, Long value2) {
            addCriterion("CO_COMPUNUM not between", value1, value2, "compunum");
            return (Criteria) this;
        }

        public Criteria andShipnum7IsNull() {
            addCriterion("CO_SHIPNUM7 is null");
            return (Criteria) this;
        }

        public Criteria andShipnum7IsNotNull() {
            addCriterion("CO_SHIPNUM7 is not null");
            return (Criteria) this;
        }

        public Criteria andShipnum7EqualTo(Long value) {
            addCriterion("CO_SHIPNUM7 =", value, "shipnum7");
            return (Criteria) this;
        }

        public Criteria andShipnum7NotEqualTo(Long value) {
            addCriterion("CO_SHIPNUM7 <>", value, "shipnum7");
            return (Criteria) this;
        }

        public Criteria andShipnum7GreaterThan(Long value) {
            addCriterion("CO_SHIPNUM7 >", value, "shipnum7");
            return (Criteria) this;
        }

        public Criteria andShipnum7GreaterThanOrEqualTo(Long value) {
            addCriterion("CO_SHIPNUM7 >=", value, "shipnum7");
            return (Criteria) this;
        }

        public Criteria andShipnum7LessThan(Long value) {
            addCriterion("CO_SHIPNUM7 <", value, "shipnum7");
            return (Criteria) this;
        }

        public Criteria andShipnum7LessThanOrEqualTo(Long value) {
            addCriterion("CO_SHIPNUM7 <=", value, "shipnum7");
            return (Criteria) this;
        }

        public Criteria andShipnum7In(List<Long> values) {
            addCriterion("CO_SHIPNUM7 in", values, "shipnum7");
            return (Criteria) this;
        }

        public Criteria andShipnum7NotIn(List<Long> values) {
            addCriterion("CO_SHIPNUM7 not in", values, "shipnum7");
            return (Criteria) this;
        }

        public Criteria andShipnum7Between(Long value1, Long value2) {
            addCriterion("CO_SHIPNUM7 between", value1, value2, "shipnum7");
            return (Criteria) this;
        }

        public Criteria andShipnum7NotBetween(Long value1, Long value2) {
            addCriterion("CO_SHIPNUM7 not between", value1, value2, "shipnum7");
            return (Criteria) this;
        }

        public Criteria andShipnum7to12IsNull() {
            addCriterion("CO_SHIPNUM7TO12 is null");
            return (Criteria) this;
        }

        public Criteria andShipnum7to12IsNotNull() {
            addCriterion("CO_SHIPNUM7TO12 is not null");
            return (Criteria) this;
        }

        public Criteria andShipnum7to12EqualTo(Long value) {
            addCriterion("CO_SHIPNUM7TO12 =", value, "shipnum7to12");
            return (Criteria) this;
        }

        public Criteria andShipnum7to12NotEqualTo(Long value) {
            addCriterion("CO_SHIPNUM7TO12 <>", value, "shipnum7to12");
            return (Criteria) this;
        }

        public Criteria andShipnum7to12GreaterThan(Long value) {
            addCriterion("CO_SHIPNUM7TO12 >", value, "shipnum7to12");
            return (Criteria) this;
        }

        public Criteria andShipnum7to12GreaterThanOrEqualTo(Long value) {
            addCriterion("CO_SHIPNUM7TO12 >=", value, "shipnum7to12");
            return (Criteria) this;
        }

        public Criteria andShipnum7to12LessThan(Long value) {
            addCriterion("CO_SHIPNUM7TO12 <", value, "shipnum7to12");
            return (Criteria) this;
        }

        public Criteria andShipnum7to12LessThanOrEqualTo(Long value) {
            addCriterion("CO_SHIPNUM7TO12 <=", value, "shipnum7to12");
            return (Criteria) this;
        }

        public Criteria andShipnum7to12In(List<Long> values) {
            addCriterion("CO_SHIPNUM7TO12 in", values, "shipnum7to12");
            return (Criteria) this;
        }

        public Criteria andShipnum7to12NotIn(List<Long> values) {
            addCriterion("CO_SHIPNUM7TO12 not in", values, "shipnum7to12");
            return (Criteria) this;
        }

        public Criteria andShipnum7to12Between(Long value1, Long value2) {
            addCriterion("CO_SHIPNUM7TO12 between", value1, value2, "shipnum7to12");
            return (Criteria) this;
        }

        public Criteria andShipnum7to12NotBetween(Long value1, Long value2) {
            addCriterion("CO_SHIPNUM7TO12 not between", value1, value2, "shipnum7to12");
            return (Criteria) this;
        }

        public Criteria andShipnum12to24IsNull() {
            addCriterion("CO_SHIPNUM12TO24 is null");
            return (Criteria) this;
        }

        public Criteria andShipnum12to24IsNotNull() {
            addCriterion("CO_SHIPNUM12TO24 is not null");
            return (Criteria) this;
        }

        public Criteria andShipnum12to24EqualTo(Long value) {
            addCriterion("CO_SHIPNUM12TO24 =", value, "shipnum12to24");
            return (Criteria) this;
        }

        public Criteria andShipnum12to24NotEqualTo(Long value) {
            addCriterion("CO_SHIPNUM12TO24 <>", value, "shipnum12to24");
            return (Criteria) this;
        }

        public Criteria andShipnum12to24GreaterThan(Long value) {
            addCriterion("CO_SHIPNUM12TO24 >", value, "shipnum12to24");
            return (Criteria) this;
        }

        public Criteria andShipnum12to24GreaterThanOrEqualTo(Long value) {
            addCriterion("CO_SHIPNUM12TO24 >=", value, "shipnum12to24");
            return (Criteria) this;
        }

        public Criteria andShipnum12to24LessThan(Long value) {
            addCriterion("CO_SHIPNUM12TO24 <", value, "shipnum12to24");
            return (Criteria) this;
        }

        public Criteria andShipnum12to24LessThanOrEqualTo(Long value) {
            addCriterion("CO_SHIPNUM12TO24 <=", value, "shipnum12to24");
            return (Criteria) this;
        }

        public Criteria andShipnum12to24In(List<Long> values) {
            addCriterion("CO_SHIPNUM12TO24 in", values, "shipnum12to24");
            return (Criteria) this;
        }

        public Criteria andShipnum12to24NotIn(List<Long> values) {
            addCriterion("CO_SHIPNUM12TO24 not in", values, "shipnum12to24");
            return (Criteria) this;
        }

        public Criteria andShipnum12to24Between(Long value1, Long value2) {
            addCriterion("CO_SHIPNUM12TO24 between", value1, value2, "shipnum12to24");
            return (Criteria) this;
        }

        public Criteria andShipnum12to24NotBetween(Long value1, Long value2) {
            addCriterion("CO_SHIPNUM12TO24 not between", value1, value2, "shipnum12to24");
            return (Criteria) this;
        }

        public Criteria andShipnum24IsNull() {
            addCriterion("CO_SHIPNUM24 is null");
            return (Criteria) this;
        }

        public Criteria andShipnum24IsNotNull() {
            addCriterion("CO_SHIPNUM24 is not null");
            return (Criteria) this;
        }

        public Criteria andShipnum24EqualTo(Long value) {
            addCriterion("CO_SHIPNUM24 =", value, "shipnum24");
            return (Criteria) this;
        }

        public Criteria andShipnum24NotEqualTo(Long value) {
            addCriterion("CO_SHIPNUM24 <>", value, "shipnum24");
            return (Criteria) this;
        }

        public Criteria andShipnum24GreaterThan(Long value) {
            addCriterion("CO_SHIPNUM24 >", value, "shipnum24");
            return (Criteria) this;
        }

        public Criteria andShipnum24GreaterThanOrEqualTo(Long value) {
            addCriterion("CO_SHIPNUM24 >=", value, "shipnum24");
            return (Criteria) this;
        }

        public Criteria andShipnum24LessThan(Long value) {
            addCriterion("CO_SHIPNUM24 <", value, "shipnum24");
            return (Criteria) this;
        }

        public Criteria andShipnum24LessThanOrEqualTo(Long value) {
            addCriterion("CO_SHIPNUM24 <=", value, "shipnum24");
            return (Criteria) this;
        }

        public Criteria andShipnum24In(List<Long> values) {
            addCriterion("CO_SHIPNUM24 in", values, "shipnum24");
            return (Criteria) this;
        }

        public Criteria andShipnum24NotIn(List<Long> values) {
            addCriterion("CO_SHIPNUM24 not in", values, "shipnum24");
            return (Criteria) this;
        }

        public Criteria andShipnum24Between(Long value1, Long value2) {
            addCriterion("CO_SHIPNUM24 between", value1, value2, "shipnum24");
            return (Criteria) this;
        }

        public Criteria andShipnum24NotBetween(Long value1, Long value2) {
            addCriterion("CO_SHIPNUM24 not between", value1, value2, "shipnum24");
            return (Criteria) this;
        }

        public Criteria andOceshipnum5IsNull() {
            addCriterion("CO_OCESHIPNUM5 is null");
            return (Criteria) this;
        }

        public Criteria andOceshipnum5IsNotNull() {
            addCriterion("CO_OCESHIPNUM5 is not null");
            return (Criteria) this;
        }

        public Criteria andOceshipnum5EqualTo(Long value) {
            addCriterion("CO_OCESHIPNUM5 =", value, "oceshipnum5");
            return (Criteria) this;
        }

        public Criteria andOceshipnum5NotEqualTo(Long value) {
            addCriterion("CO_OCESHIPNUM5 <>", value, "oceshipnum5");
            return (Criteria) this;
        }

        public Criteria andOceshipnum5GreaterThan(Long value) {
            addCriterion("CO_OCESHIPNUM5 >", value, "oceshipnum5");
            return (Criteria) this;
        }

        public Criteria andOceshipnum5GreaterThanOrEqualTo(Long value) {
            addCriterion("CO_OCESHIPNUM5 >=", value, "oceshipnum5");
            return (Criteria) this;
        }

        public Criteria andOceshipnum5LessThan(Long value) {
            addCriterion("CO_OCESHIPNUM5 <", value, "oceshipnum5");
            return (Criteria) this;
        }

        public Criteria andOceshipnum5LessThanOrEqualTo(Long value) {
            addCriterion("CO_OCESHIPNUM5 <=", value, "oceshipnum5");
            return (Criteria) this;
        }

        public Criteria andOceshipnum5In(List<Long> values) {
            addCriterion("CO_OCESHIPNUM5 in", values, "oceshipnum5");
            return (Criteria) this;
        }

        public Criteria andOceshipnum5NotIn(List<Long> values) {
            addCriterion("CO_OCESHIPNUM5 not in", values, "oceshipnum5");
            return (Criteria) this;
        }

        public Criteria andOceshipnum5Between(Long value1, Long value2) {
            addCriterion("CO_OCESHIPNUM5 between", value1, value2, "oceshipnum5");
            return (Criteria) this;
        }

        public Criteria andOceshipnum5NotBetween(Long value1, Long value2) {
            addCriterion("CO_OCESHIPNUM5 not between", value1, value2, "oceshipnum5");
            return (Criteria) this;
        }

        public Criteria andOceshipnum5to12IsNull() {
            addCriterion("CO_OCESHIPNUM5TO12 is null");
            return (Criteria) this;
        }

        public Criteria andOceshipnum5to12IsNotNull() {
            addCriterion("CO_OCESHIPNUM5TO12 is not null");
            return (Criteria) this;
        }

        public Criteria andOceshipnum5to12EqualTo(Long value) {
            addCriterion("CO_OCESHIPNUM5TO12 =", value, "oceshipnum5to12");
            return (Criteria) this;
        }

        public Criteria andOceshipnum5to12NotEqualTo(Long value) {
            addCriterion("CO_OCESHIPNUM5TO12 <>", value, "oceshipnum5to12");
            return (Criteria) this;
        }

        public Criteria andOceshipnum5to12GreaterThan(Long value) {
            addCriterion("CO_OCESHIPNUM5TO12 >", value, "oceshipnum5to12");
            return (Criteria) this;
        }

        public Criteria andOceshipnum5to12GreaterThanOrEqualTo(Long value) {
            addCriterion("CO_OCESHIPNUM5TO12 >=", value, "oceshipnum5to12");
            return (Criteria) this;
        }

        public Criteria andOceshipnum5to12LessThan(Long value) {
            addCriterion("CO_OCESHIPNUM5TO12 <", value, "oceshipnum5to12");
            return (Criteria) this;
        }

        public Criteria andOceshipnum5to12LessThanOrEqualTo(Long value) {
            addCriterion("CO_OCESHIPNUM5TO12 <=", value, "oceshipnum5to12");
            return (Criteria) this;
        }

        public Criteria andOceshipnum5to12In(List<Long> values) {
            addCriterion("CO_OCESHIPNUM5TO12 in", values, "oceshipnum5to12");
            return (Criteria) this;
        }

        public Criteria andOceshipnum5to12NotIn(List<Long> values) {
            addCriterion("CO_OCESHIPNUM5TO12 not in", values, "oceshipnum5to12");
            return (Criteria) this;
        }

        public Criteria andOceshipnum5to12Between(Long value1, Long value2) {
            addCriterion("CO_OCESHIPNUM5TO12 between", value1, value2, "oceshipnum5to12");
            return (Criteria) this;
        }

        public Criteria andOceshipnum5to12NotBetween(Long value1, Long value2) {
            addCriterion("CO_OCESHIPNUM5TO12 not between", value1, value2, "oceshipnum5to12");
            return (Criteria) this;
        }

        public Criteria andOceshipnum12to24IsNull() {
            addCriterion("CO_OCESHIPNUM12TO24 is null");
            return (Criteria) this;
        }

        public Criteria andOceshipnum12to24IsNotNull() {
            addCriterion("CO_OCESHIPNUM12TO24 is not null");
            return (Criteria) this;
        }

        public Criteria andOceshipnum12to24EqualTo(Long value) {
            addCriterion("CO_OCESHIPNUM12TO24 =", value, "oceshipnum12to24");
            return (Criteria) this;
        }

        public Criteria andOceshipnum12to24NotEqualTo(Long value) {
            addCriterion("CO_OCESHIPNUM12TO24 <>", value, "oceshipnum12to24");
            return (Criteria) this;
        }

        public Criteria andOceshipnum12to24GreaterThan(Long value) {
            addCriterion("CO_OCESHIPNUM12TO24 >", value, "oceshipnum12to24");
            return (Criteria) this;
        }

        public Criteria andOceshipnum12to24GreaterThanOrEqualTo(Long value) {
            addCriterion("CO_OCESHIPNUM12TO24 >=", value, "oceshipnum12to24");
            return (Criteria) this;
        }

        public Criteria andOceshipnum12to24LessThan(Long value) {
            addCriterion("CO_OCESHIPNUM12TO24 <", value, "oceshipnum12to24");
            return (Criteria) this;
        }

        public Criteria andOceshipnum12to24LessThanOrEqualTo(Long value) {
            addCriterion("CO_OCESHIPNUM12TO24 <=", value, "oceshipnum12to24");
            return (Criteria) this;
        }

        public Criteria andOceshipnum12to24In(List<Long> values) {
            addCriterion("CO_OCESHIPNUM12TO24 in", values, "oceshipnum12to24");
            return (Criteria) this;
        }

        public Criteria andOceshipnum12to24NotIn(List<Long> values) {
            addCriterion("CO_OCESHIPNUM12TO24 not in", values, "oceshipnum12to24");
            return (Criteria) this;
        }

        public Criteria andOceshipnum12to24Between(Long value1, Long value2) {
            addCriterion("CO_OCESHIPNUM12TO24 between", value1, value2, "oceshipnum12to24");
            return (Criteria) this;
        }

        public Criteria andOceshipnum12to24NotBetween(Long value1, Long value2) {
            addCriterion("CO_OCESHIPNUM12TO24 not between", value1, value2, "oceshipnum12to24");
            return (Criteria) this;
        }

        public Criteria andOceshipnum24to45IsNull() {
            addCriterion("CO_OCESHIPNUM24TO45 is null");
            return (Criteria) this;
        }

        public Criteria andOceshipnum24to45IsNotNull() {
            addCriterion("CO_OCESHIPNUM24TO45 is not null");
            return (Criteria) this;
        }

        public Criteria andOceshipnum24to45EqualTo(Long value) {
            addCriterion("CO_OCESHIPNUM24TO45 =", value, "oceshipnum24to45");
            return (Criteria) this;
        }

        public Criteria andOceshipnum24to45NotEqualTo(Long value) {
            addCriterion("CO_OCESHIPNUM24TO45 <>", value, "oceshipnum24to45");
            return (Criteria) this;
        }

        public Criteria andOceshipnum24to45GreaterThan(Long value) {
            addCriterion("CO_OCESHIPNUM24TO45 >", value, "oceshipnum24to45");
            return (Criteria) this;
        }

        public Criteria andOceshipnum24to45GreaterThanOrEqualTo(Long value) {
            addCriterion("CO_OCESHIPNUM24TO45 >=", value, "oceshipnum24to45");
            return (Criteria) this;
        }

        public Criteria andOceshipnum24to45LessThan(Long value) {
            addCriterion("CO_OCESHIPNUM24TO45 <", value, "oceshipnum24to45");
            return (Criteria) this;
        }

        public Criteria andOceshipnum24to45LessThanOrEqualTo(Long value) {
            addCriterion("CO_OCESHIPNUM24TO45 <=", value, "oceshipnum24to45");
            return (Criteria) this;
        }

        public Criteria andOceshipnum24to45In(List<Long> values) {
            addCriterion("CO_OCESHIPNUM24TO45 in", values, "oceshipnum24to45");
            return (Criteria) this;
        }

        public Criteria andOceshipnum24to45NotIn(List<Long> values) {
            addCriterion("CO_OCESHIPNUM24TO45 not in", values, "oceshipnum24to45");
            return (Criteria) this;
        }

        public Criteria andOceshipnum24to45Between(Long value1, Long value2) {
            addCriterion("CO_OCESHIPNUM24TO45 between", value1, value2, "oceshipnum24to45");
            return (Criteria) this;
        }

        public Criteria andOceshipnum24to45NotBetween(Long value1, Long value2) {
            addCriterion("CO_OCESHIPNUM24TO45 not between", value1, value2, "oceshipnum24to45");
            return (Criteria) this;
        }

        public Criteria andOceshipnum45IsNull() {
            addCriterion("CO_OCESHIPNUM45 is null");
            return (Criteria) this;
        }

        public Criteria andOceshipnum45IsNotNull() {
            addCriterion("CO_OCESHIPNUM45 is not null");
            return (Criteria) this;
        }

        public Criteria andOceshipnum45EqualTo(Long value) {
            addCriterion("CO_OCESHIPNUM45 =", value, "oceshipnum45");
            return (Criteria) this;
        }

        public Criteria andOceshipnum45NotEqualTo(Long value) {
            addCriterion("CO_OCESHIPNUM45 <>", value, "oceshipnum45");
            return (Criteria) this;
        }

        public Criteria andOceshipnum45GreaterThan(Long value) {
            addCriterion("CO_OCESHIPNUM45 >", value, "oceshipnum45");
            return (Criteria) this;
        }

        public Criteria andOceshipnum45GreaterThanOrEqualTo(Long value) {
            addCriterion("CO_OCESHIPNUM45 >=", value, "oceshipnum45");
            return (Criteria) this;
        }

        public Criteria andOceshipnum45LessThan(Long value) {
            addCriterion("CO_OCESHIPNUM45 <", value, "oceshipnum45");
            return (Criteria) this;
        }

        public Criteria andOceshipnum45LessThanOrEqualTo(Long value) {
            addCriterion("CO_OCESHIPNUM45 <=", value, "oceshipnum45");
            return (Criteria) this;
        }

        public Criteria andOceshipnum45In(List<Long> values) {
            addCriterion("CO_OCESHIPNUM45 in", values, "oceshipnum45");
            return (Criteria) this;
        }

        public Criteria andOceshipnum45NotIn(List<Long> values) {
            addCriterion("CO_OCESHIPNUM45 not in", values, "oceshipnum45");
            return (Criteria) this;
        }

        public Criteria andOceshipnum45Between(Long value1, Long value2) {
            addCriterion("CO_OCESHIPNUM45 between", value1, value2, "oceshipnum45");
            return (Criteria) this;
        }

        public Criteria andOceshipnum45NotBetween(Long value1, Long value2) {
            addCriterion("CO_OCESHIPNUM45 not between", value1, value2, "oceshipnum45");
            return (Criteria) this;
        }

        public Criteria andOrgscopeIsNull() {
            addCriterion("CO_ORGSCOPE is null");
            return (Criteria) this;
        }

        public Criteria andOrgscopeIsNotNull() {
            addCriterion("CO_ORGSCOPE is not null");
            return (Criteria) this;
        }

        public Criteria andOrgscopeEqualTo(String value) {
            addCriterion("CO_ORGSCOPE =", value, "orgscope");
            return (Criteria) this;
        }

        public Criteria andOrgscopeNotEqualTo(String value) {
            addCriterion("CO_ORGSCOPE <>", value, "orgscope");
            return (Criteria) this;
        }

        public Criteria andOrgscopeGreaterThan(String value) {
            addCriterion("CO_ORGSCOPE >", value, "orgscope");
            return (Criteria) this;
        }

        public Criteria andOrgscopeGreaterThanOrEqualTo(String value) {
            addCriterion("CO_ORGSCOPE >=", value, "orgscope");
            return (Criteria) this;
        }

        public Criteria andOrgscopeLessThan(String value) {
            addCriterion("CO_ORGSCOPE <", value, "orgscope");
            return (Criteria) this;
        }

        public Criteria andOrgscopeLessThanOrEqualTo(String value) {
            addCriterion("CO_ORGSCOPE <=", value, "orgscope");
            return (Criteria) this;
        }

        public Criteria andOrgscopeLike(String value) {
            addCriterion("CO_ORGSCOPE like", value, "orgscope");
            return (Criteria) this;
        }

        public Criteria andOrgscopeNotLike(String value) {
            addCriterion("CO_ORGSCOPE not like", value, "orgscope");
            return (Criteria) this;
        }

        public Criteria andOrgscopeIn(List<String> values) {
            addCriterion("CO_ORGSCOPE in", values, "orgscope");
            return (Criteria) this;
        }

        public Criteria andOrgscopeNotIn(List<String> values) {
            addCriterion("CO_ORGSCOPE not in", values, "orgscope");
            return (Criteria) this;
        }

        public Criteria andOrgscopeBetween(String value1, String value2) {
            addCriterion("CO_ORGSCOPE between", value1, value2, "orgscope");
            return (Criteria) this;
        }

        public Criteria andOrgscopeNotBetween(String value1, String value2) {
            addCriterion("CO_ORGSCOPE not between", value1, value2, "orgscope");
            return (Criteria) this;
        }

        public Criteria andCheckscopeIsNull() {
            addCriterion("CO_CHECKSCOPE is null");
            return (Criteria) this;
        }

        public Criteria andCheckscopeIsNotNull() {
            addCriterion("CO_CHECKSCOPE is not null");
            return (Criteria) this;
        }

        public Criteria andCheckscopeEqualTo(String value) {
            addCriterion("CO_CHECKSCOPE =", value, "checkscope");
            return (Criteria) this;
        }

        public Criteria andCheckscopeNotEqualTo(String value) {
            addCriterion("CO_CHECKSCOPE <>", value, "checkscope");
            return (Criteria) this;
        }

        public Criteria andCheckscopeGreaterThan(String value) {
            addCriterion("CO_CHECKSCOPE >", value, "checkscope");
            return (Criteria) this;
        }

        public Criteria andCheckscopeGreaterThanOrEqualTo(String value) {
            addCriterion("CO_CHECKSCOPE >=", value, "checkscope");
            return (Criteria) this;
        }

        public Criteria andCheckscopeLessThan(String value) {
            addCriterion("CO_CHECKSCOPE <", value, "checkscope");
            return (Criteria) this;
        }

        public Criteria andCheckscopeLessThanOrEqualTo(String value) {
            addCriterion("CO_CHECKSCOPE <=", value, "checkscope");
            return (Criteria) this;
        }

        public Criteria andCheckscopeLike(String value) {
            addCriterion("CO_CHECKSCOPE like", value, "checkscope");
            return (Criteria) this;
        }

        public Criteria andCheckscopeNotLike(String value) {
            addCriterion("CO_CHECKSCOPE not like", value, "checkscope");
            return (Criteria) this;
        }

        public Criteria andCheckscopeIn(List<String> values) {
            addCriterion("CO_CHECKSCOPE in", values, "checkscope");
            return (Criteria) this;
        }

        public Criteria andCheckscopeNotIn(List<String> values) {
            addCriterion("CO_CHECKSCOPE not in", values, "checkscope");
            return (Criteria) this;
        }

        public Criteria andCheckscopeBetween(String value1, String value2) {
            addCriterion("CO_CHECKSCOPE between", value1, value2, "checkscope");
            return (Criteria) this;
        }

        public Criteria andCheckscopeNotBetween(String value1, String value2) {
            addCriterion("CO_CHECKSCOPE not between", value1, value2, "checkscope");
            return (Criteria) this;
        }

        public Criteria andOceanboatnumIsNull() {
            addCriterion("CO_OCEANBOATNUM is null");
            return (Criteria) this;
        }

        public Criteria andOceanboatnumIsNotNull() {
            addCriterion("CO_OCEANBOATNUM is not null");
            return (Criteria) this;
        }

        public Criteria andOceanboatnumEqualTo(Long value) {
            addCriterion("CO_OCEANBOATNUM =", value, "oceanboatnum");
            return (Criteria) this;
        }

        public Criteria andOceanboatnumNotEqualTo(Long value) {
            addCriterion("CO_OCEANBOATNUM <>", value, "oceanboatnum");
            return (Criteria) this;
        }

        public Criteria andOceanboatnumGreaterThan(Long value) {
            addCriterion("CO_OCEANBOATNUM >", value, "oceanboatnum");
            return (Criteria) this;
        }

        public Criteria andOceanboatnumGreaterThanOrEqualTo(Long value) {
            addCriterion("CO_OCEANBOATNUM >=", value, "oceanboatnum");
            return (Criteria) this;
        }

        public Criteria andOceanboatnumLessThan(Long value) {
            addCriterion("CO_OCEANBOATNUM <", value, "oceanboatnum");
            return (Criteria) this;
        }

        public Criteria andOceanboatnumLessThanOrEqualTo(Long value) {
            addCriterion("CO_OCEANBOATNUM <=", value, "oceanboatnum");
            return (Criteria) this;
        }

        public Criteria andOceanboatnumIn(List<Long> values) {
            addCriterion("CO_OCEANBOATNUM in", values, "oceanboatnum");
            return (Criteria) this;
        }

        public Criteria andOceanboatnumNotIn(List<Long> values) {
            addCriterion("CO_OCEANBOATNUM not in", values, "oceanboatnum");
            return (Criteria) this;
        }

        public Criteria andOceanboatnumBetween(Long value1, Long value2) {
            addCriterion("CO_OCEANBOATNUM between", value1, value2, "oceanboatnum");
            return (Criteria) this;
        }

        public Criteria andOceanboatnumNotBetween(Long value1, Long value2) {
            addCriterion("CO_OCEANBOATNUM not between", value1, value2, "oceanboatnum");
            return (Criteria) this;
        }

        public Criteria andEntreparenumIsNull() {
            addCriterion("CO_ENTREPARENUM is null");
            return (Criteria) this;
        }

        public Criteria andEntreparenumIsNotNull() {
            addCriterion("CO_ENTREPARENUM is not null");
            return (Criteria) this;
        }

        public Criteria andEntreparenumEqualTo(Long value) {
            addCriterion("CO_ENTREPARENUM =", value, "entreparenum");
            return (Criteria) this;
        }

        public Criteria andEntreparenumNotEqualTo(Long value) {
            addCriterion("CO_ENTREPARENUM <>", value, "entreparenum");
            return (Criteria) this;
        }

        public Criteria andEntreparenumGreaterThan(Long value) {
            addCriterion("CO_ENTREPARENUM >", value, "entreparenum");
            return (Criteria) this;
        }

        public Criteria andEntreparenumGreaterThanOrEqualTo(Long value) {
            addCriterion("CO_ENTREPARENUM >=", value, "entreparenum");
            return (Criteria) this;
        }

        public Criteria andEntreparenumLessThan(Long value) {
            addCriterion("CO_ENTREPARENUM <", value, "entreparenum");
            return (Criteria) this;
        }

        public Criteria andEntreparenumLessThanOrEqualTo(Long value) {
            addCriterion("CO_ENTREPARENUM <=", value, "entreparenum");
            return (Criteria) this;
        }

        public Criteria andEntreparenumIn(List<Long> values) {
            addCriterion("CO_ENTREPARENUM in", values, "entreparenum");
            return (Criteria) this;
        }

        public Criteria andEntreparenumNotIn(List<Long> values) {
            addCriterion("CO_ENTREPARENUM not in", values, "entreparenum");
            return (Criteria) this;
        }

        public Criteria andEntreparenumBetween(Long value1, Long value2) {
            addCriterion("CO_ENTREPARENUM between", value1, value2, "entreparenum");
            return (Criteria) this;
        }

        public Criteria andEntreparenumNotBetween(Long value1, Long value2) {
            addCriterion("CO_ENTREPARENUM not between", value1, value2, "entreparenum");
            return (Criteria) this;
        }

        public Criteria andEntproductnumIsNull() {
            addCriterion("CO_ENTPRODUCTNUM is null");
            return (Criteria) this;
        }

        public Criteria andEntproductnumIsNotNull() {
            addCriterion("CO_ENTPRODUCTNUM is not null");
            return (Criteria) this;
        }

        public Criteria andEntproductnumEqualTo(Long value) {
            addCriterion("CO_ENTPRODUCTNUM =", value, "entproductnum");
            return (Criteria) this;
        }

        public Criteria andEntproductnumNotEqualTo(Long value) {
            addCriterion("CO_ENTPRODUCTNUM <>", value, "entproductnum");
            return (Criteria) this;
        }

        public Criteria andEntproductnumGreaterThan(Long value) {
            addCriterion("CO_ENTPRODUCTNUM >", value, "entproductnum");
            return (Criteria) this;
        }

        public Criteria andEntproductnumGreaterThanOrEqualTo(Long value) {
            addCriterion("CO_ENTPRODUCTNUM >=", value, "entproductnum");
            return (Criteria) this;
        }

        public Criteria andEntproductnumLessThan(Long value) {
            addCriterion("CO_ENTPRODUCTNUM <", value, "entproductnum");
            return (Criteria) this;
        }

        public Criteria andEntproductnumLessThanOrEqualTo(Long value) {
            addCriterion("CO_ENTPRODUCTNUM <=", value, "entproductnum");
            return (Criteria) this;
        }

        public Criteria andEntproductnumIn(List<Long> values) {
            addCriterion("CO_ENTPRODUCTNUM in", values, "entproductnum");
            return (Criteria) this;
        }

        public Criteria andEntproductnumNotIn(List<Long> values) {
            addCriterion("CO_ENTPRODUCTNUM not in", values, "entproductnum");
            return (Criteria) this;
        }

        public Criteria andEntproductnumBetween(Long value1, Long value2) {
            addCriterion("CO_ENTPRODUCTNUM between", value1, value2, "entproductnum");
            return (Criteria) this;
        }

        public Criteria andEntproductnumNotBetween(Long value1, Long value2) {
            addCriterion("CO_ENTPRODUCTNUM not between", value1, value2, "entproductnum");
            return (Criteria) this;
        }

        public Criteria andEntdesinumIsNull() {
            addCriterion("CO_ENTDESINUM is null");
            return (Criteria) this;
        }

        public Criteria andEntdesinumIsNotNull() {
            addCriterion("CO_ENTDESINUM is not null");
            return (Criteria) this;
        }

        public Criteria andEntdesinumEqualTo(Long value) {
            addCriterion("CO_ENTDESINUM =", value, "entdesinum");
            return (Criteria) this;
        }

        public Criteria andEntdesinumNotEqualTo(Long value) {
            addCriterion("CO_ENTDESINUM <>", value, "entdesinum");
            return (Criteria) this;
        }

        public Criteria andEntdesinumGreaterThan(Long value) {
            addCriterion("CO_ENTDESINUM >", value, "entdesinum");
            return (Criteria) this;
        }

        public Criteria andEntdesinumGreaterThanOrEqualTo(Long value) {
            addCriterion("CO_ENTDESINUM >=", value, "entdesinum");
            return (Criteria) this;
        }

        public Criteria andEntdesinumLessThan(Long value) {
            addCriterion("CO_ENTDESINUM <", value, "entdesinum");
            return (Criteria) this;
        }

        public Criteria andEntdesinumLessThanOrEqualTo(Long value) {
            addCriterion("CO_ENTDESINUM <=", value, "entdesinum");
            return (Criteria) this;
        }

        public Criteria andEntdesinumIn(List<Long> values) {
            addCriterion("CO_ENTDESINUM in", values, "entdesinum");
            return (Criteria) this;
        }

        public Criteria andEntdesinumNotIn(List<Long> values) {
            addCriterion("CO_ENTDESINUM not in", values, "entdesinum");
            return (Criteria) this;
        }

        public Criteria andEntdesinumBetween(Long value1, Long value2) {
            addCriterion("CO_ENTDESINUM between", value1, value2, "entdesinum");
            return (Criteria) this;
        }

        public Criteria andEntdesinumNotBetween(Long value1, Long value2) {
            addCriterion("CO_ENTDESINUM not between", value1, value2, "entdesinum");
            return (Criteria) this;
        }

        public Criteria andAllboatnumIsNull() {
            addCriterion("CO_ALLBOATNUM is null");
            return (Criteria) this;
        }

        public Criteria andAllboatnumIsNotNull() {
            addCriterion("CO_ALLBOATNUM is not null");
            return (Criteria) this;
        }

        public Criteria andAllboatnumEqualTo(Long value) {
            addCriterion("CO_ALLBOATNUM =", value, "allboatnum");
            return (Criteria) this;
        }

        public Criteria andAllboatnumNotEqualTo(Long value) {
            addCriterion("CO_ALLBOATNUM <>", value, "allboatnum");
            return (Criteria) this;
        }

        public Criteria andAllboatnumGreaterThan(Long value) {
            addCriterion("CO_ALLBOATNUM >", value, "allboatnum");
            return (Criteria) this;
        }

        public Criteria andAllboatnumGreaterThanOrEqualTo(Long value) {
            addCriterion("CO_ALLBOATNUM >=", value, "allboatnum");
            return (Criteria) this;
        }

        public Criteria andAllboatnumLessThan(Long value) {
            addCriterion("CO_ALLBOATNUM <", value, "allboatnum");
            return (Criteria) this;
        }

        public Criteria andAllboatnumLessThanOrEqualTo(Long value) {
            addCriterion("CO_ALLBOATNUM <=", value, "allboatnum");
            return (Criteria) this;
        }

        public Criteria andAllboatnumIn(List<Long> values) {
            addCriterion("CO_ALLBOATNUM in", values, "allboatnum");
            return (Criteria) this;
        }

        public Criteria andAllboatnumNotIn(List<Long> values) {
            addCriterion("CO_ALLBOATNUM not in", values, "allboatnum");
            return (Criteria) this;
        }

        public Criteria andAllboatnumBetween(Long value1, Long value2) {
            addCriterion("CO_ALLBOATNUM between", value1, value2, "allboatnum");
            return (Criteria) this;
        }

        public Criteria andAllboatnumNotBetween(Long value1, Long value2) {
            addCriterion("CO_ALLBOATNUM not between", value1, value2, "allboatnum");
            return (Criteria) this;
        }

        public Criteria andIdLikeInsensitive(String value) {
            addCriterion("upper(CO_ID) like", value.toUpperCase(), "id");
            return (Criteria) this;
        }

        public Criteria andUidLikeInsensitive(String value) {
            addCriterion("upper(CO_UID) like", value.toUpperCase(), "uid");
            return (Criteria) this;
        }

        public Criteria andCertidLikeInsensitive(String value) {
            addCriterion("upper(CO_CERTID) like", value.toUpperCase(), "certid");
            return (Criteria) this;
        }

        public Criteria andOrgnameLikeInsensitive(String value) {
            addCriterion("upper(CO_ORGNAME) like", value.toUpperCase(), "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgcodeLikeInsensitive(String value) {
            addCriterion("upper(CO_ORGCODE) like", value.toUpperCase(), "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgaddrLikeInsensitive(String value) {
            addCriterion("upper(CO_ORGADDR) like", value.toUpperCase(), "orgaddr");
            return (Criteria) this;
        }

        public Criteria andFuntypeLikeInsensitive(String value) {
            addCriterion("upper(CO_FUNTYPE) like", value.toUpperCase(), "funtype");
            return (Criteria) this;
        }

        public Criteria andParttypeLikeInsensitive(String value) {
            addCriterion("upper(CO_PARTTYPE) like", value.toUpperCase(), "parttype");
            return (Criteria) this;
        }

        public Criteria andBustypeLikeInsensitive(String value) {
            addCriterion("upper(CO_BUSTYPE) like", value.toUpperCase(), "bustype");
            return (Criteria) this;
        }

        public Criteria andFunscopeLikeInsensitive(String value) {
            addCriterion("upper(CO_FUNSCOPE) like", value.toUpperCase(), "funscope");
            return (Criteria) this;
        }

        public Criteria andGeotypeLikeInsensitive(String value) {
            addCriterion("upper(CO_GEOTYPE) like", value.toUpperCase(), "geotype");
            return (Criteria) this;
        }

        public Criteria andProvcodeLikeInsensitive(String value) {
            addCriterion("upper(CO_PROVCODE) like", value.toUpperCase(), "provcode");
            return (Criteria) this;
        }

        public Criteria andProvnameLikeInsensitive(String value) {
            addCriterion("upper(CO_PROVNAME) like", value.toUpperCase(), "provname");
            return (Criteria) this;
        }

        public Criteria andTypelvLikeInsensitive(String value) {
            addCriterion("upper(CO_TYPELV) like", value.toUpperCase(), "typelv");
            return (Criteria) this;
        }

        public Criteria andOrgnameupLikeInsensitive(String value) {
            addCriterion("upper(CO_ORGNAMEUP) like", value.toUpperCase(), "orgnameup");
            return (Criteria) this;
        }

        public Criteria andOrgcodeupLikeInsensitive(String value) {
            addCriterion("upper(CO_ORGCODEUP) like", value.toUpperCase(), "orgcodeup");
            return (Criteria) this;
        }

        public Criteria andOrgareanameLikeInsensitive(String value) {
            addCriterion("upper(CO_ORGAREANAME) like", value.toUpperCase(), "orgareaname");
            return (Criteria) this;
        }

        public Criteria andOrgpostcodeLikeInsensitive(String value) {
            addCriterion("upper(CO_ORGPOSTCODE) like", value.toUpperCase(), "orgpostcode");
            return (Criteria) this;
        }

        public Criteria andAreacodeLikeInsensitive(String value) {
            addCriterion("upper(CO_AREACODE) like", value.toUpperCase(), "areacode");
            return (Criteria) this;
        }

        public Criteria andContactphoneLikeInsensitive(String value) {
            addCriterion("upper(CO_CONTACTPHONE) like", value.toUpperCase(), "contactphone");
            return (Criteria) this;
        }

        public Criteria andContactfaxLikeInsensitive(String value) {
            addCriterion("upper(CO_CONTACTFAX) like", value.toUpperCase(), "contactfax");
            return (Criteria) this;
        }

        public Criteria andContacttelLikeInsensitive(String value) {
            addCriterion("upper(CO_CONTACTTEL) like", value.toUpperCase(), "contacttel");
            return (Criteria) this;
        }

        public Criteria andContactemailLikeInsensitive(String value) {
            addCriterion("upper(CO_CONTACTEMAIL) like", value.toUpperCase(), "contactemail");
            return (Criteria) this;
        }

        public Criteria andBodertypeLikeInsensitive(String value) {
            addCriterion("upper(CO_BODERTYPE) like", value.toUpperCase(), "bodertype");
            return (Criteria) this;
        }

        public Criteria andHeadhasLikeInsensitive(String value) {
            addCriterion("upper(CO_HEADHAS) like", value.toUpperCase(), "headhas");
            return (Criteria) this;
        }

        public Criteria andFinasourceLikeInsensitive(String value) {
            addCriterion("upper(CO_FINASOURCE) like", value.toUpperCase(), "finasource");
            return (Criteria) this;
        }

        public Criteria andResppersonLikeInsensitive(String value) {
            addCriterion("upper(CO_RESPPERSON) like", value.toUpperCase(), "respperson");
            return (Criteria) this;
        }

        public Criteria andLegalpersonLikeInsensitive(String value) {
            addCriterion("upper(CO_LEGALPERSON) like", value.toUpperCase(), "legalperson");
            return (Criteria) this;
        }

        public Criteria andSubjectionLikeInsensitive(String value) {
            addCriterion("upper(CO_SUBJECTION) like", value.toUpperCase(), "subjection");
            return (Criteria) this;
        }

        public Criteria andNaturetypeLikeInsensitive(String value) {
            addCriterion("upper(CO_NATURETYPE) like", value.toUpperCase(), "naturetype");
            return (Criteria) this;
        }

        public Criteria andApprnumLikeInsensitive(String value) {
            addCriterion("upper(CO_APPRNUM) like", value.toUpperCase(), "apprnum");
            return (Criteria) this;
        }

        public Criteria andPertotalnumLikeInsensitive(String value) {
            addCriterion("upper(CO_PERTOTALNUM) like", value.toUpperCase(), "pertotalnum");
            return (Criteria) this;
        }

        public Criteria andOfficeareaLikeInsensitive(String value) {
            addCriterion("upper(CO_OFFICEAREA) like", value.toUpperCase(), "officearea");
            return (Criteria) this;
        }

        public Criteria andOrgscopeLikeInsensitive(String value) {
            addCriterion("upper(CO_ORGSCOPE) like", value.toUpperCase(), "orgscope");
            return (Criteria) this;
        }

        public Criteria andCheckscopeLikeInsensitive(String value) {
            addCriterion("upper(CO_CHECKSCOPE) like", value.toUpperCase(), "checkscope");
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