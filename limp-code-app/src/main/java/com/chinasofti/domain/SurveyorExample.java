package com.chinasofti.domain;

import com.limp.framework.core.bean.Pager;

import java.util.ArrayList;
import java.util.List;

public class SurveyorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Pager page;

    public SurveyorExample() {
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
            addCriterion("CS_ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("CS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("CS_ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("CS_ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("CS_ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("CS_ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("CS_ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("CS_ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("CS_ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("CS_ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("CS_ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("CS_ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("CS_ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("CS_ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUidIsNull() {
            addCriterion("CS_UID is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("CS_UID is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(String value) {
            addCriterion("CS_UID =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(String value) {
            addCriterion("CS_UID <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(String value) {
            addCriterion("CS_UID >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(String value) {
            addCriterion("CS_UID >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(String value) {
            addCriterion("CS_UID <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(String value) {
            addCriterion("CS_UID <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLike(String value) {
            addCriterion("CS_UID like", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotLike(String value) {
            addCriterion("CS_UID not like", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<String> values) {
            addCriterion("CS_UID in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<String> values) {
            addCriterion("CS_UID not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(String value1, String value2) {
            addCriterion("CS_UID between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(String value1, String value2) {
            addCriterion("CS_UID not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andOrganidIsNull() {
            addCriterion("CS_ORGANID is null");
            return (Criteria) this;
        }

        public Criteria andOrganidIsNotNull() {
            addCriterion("CS_ORGANID is not null");
            return (Criteria) this;
        }

        public Criteria andOrganidEqualTo(String value) {
            addCriterion("CS_ORGANID =", value, "organid");
            return (Criteria) this;
        }

        public Criteria andOrganidNotEqualTo(String value) {
            addCriterion("CS_ORGANID <>", value, "organid");
            return (Criteria) this;
        }

        public Criteria andOrganidGreaterThan(String value) {
            addCriterion("CS_ORGANID >", value, "organid");
            return (Criteria) this;
        }

        public Criteria andOrganidGreaterThanOrEqualTo(String value) {
            addCriterion("CS_ORGANID >=", value, "organid");
            return (Criteria) this;
        }

        public Criteria andOrganidLessThan(String value) {
            addCriterion("CS_ORGANID <", value, "organid");
            return (Criteria) this;
        }

        public Criteria andOrganidLessThanOrEqualTo(String value) {
            addCriterion("CS_ORGANID <=", value, "organid");
            return (Criteria) this;
        }

        public Criteria andOrganidLike(String value) {
            addCriterion("CS_ORGANID like", value, "organid");
            return (Criteria) this;
        }

        public Criteria andOrganidNotLike(String value) {
            addCriterion("CS_ORGANID not like", value, "organid");
            return (Criteria) this;
        }

        public Criteria andOrganidIn(List<String> values) {
            addCriterion("CS_ORGANID in", values, "organid");
            return (Criteria) this;
        }

        public Criteria andOrganidNotIn(List<String> values) {
            addCriterion("CS_ORGANID not in", values, "organid");
            return (Criteria) this;
        }

        public Criteria andOrganidBetween(String value1, String value2) {
            addCriterion("CS_ORGANID between", value1, value2, "organid");
            return (Criteria) this;
        }

        public Criteria andOrganidNotBetween(String value1, String value2) {
            addCriterion("CS_ORGANID not between", value1, value2, "organid");
            return (Criteria) this;
        }

        public Criteria andCertidIsNull() {
            addCriterion("CS_CERTID is null");
            return (Criteria) this;
        }

        public Criteria andCertidIsNotNull() {
            addCriterion("CS_CERTID is not null");
            return (Criteria) this;
        }

        public Criteria andCertidEqualTo(String value) {
            addCriterion("CS_CERTID =", value, "certid");
            return (Criteria) this;
        }

        public Criteria andCertidNotEqualTo(String value) {
            addCriterion("CS_CERTID <>", value, "certid");
            return (Criteria) this;
        }

        public Criteria andCertidGreaterThan(String value) {
            addCriterion("CS_CERTID >", value, "certid");
            return (Criteria) this;
        }

        public Criteria andCertidGreaterThanOrEqualTo(String value) {
            addCriterion("CS_CERTID >=", value, "certid");
            return (Criteria) this;
        }

        public Criteria andCertidLessThan(String value) {
            addCriterion("CS_CERTID <", value, "certid");
            return (Criteria) this;
        }

        public Criteria andCertidLessThanOrEqualTo(String value) {
            addCriterion("CS_CERTID <=", value, "certid");
            return (Criteria) this;
        }

        public Criteria andCertidLike(String value) {
            addCriterion("CS_CERTID like", value, "certid");
            return (Criteria) this;
        }

        public Criteria andCertidNotLike(String value) {
            addCriterion("CS_CERTID not like", value, "certid");
            return (Criteria) this;
        }

        public Criteria andCertidIn(List<String> values) {
            addCriterion("CS_CERTID in", values, "certid");
            return (Criteria) this;
        }

        public Criteria andCertidNotIn(List<String> values) {
            addCriterion("CS_CERTID not in", values, "certid");
            return (Criteria) this;
        }

        public Criteria andCertidBetween(String value1, String value2) {
            addCriterion("CS_CERTID between", value1, value2, "certid");
            return (Criteria) this;
        }

        public Criteria andCertidNotBetween(String value1, String value2) {
            addCriterion("CS_CERTID not between", value1, value2, "certid");
            return (Criteria) this;
        }

        public Criteria andOrgannameIsNull() {
            addCriterion("CS_ORGANNAME is null");
            return (Criteria) this;
        }

        public Criteria andOrgannameIsNotNull() {
            addCriterion("CS_ORGANNAME is not null");
            return (Criteria) this;
        }

        public Criteria andOrgannameEqualTo(String value) {
            addCriterion("CS_ORGANNAME =", value, "organname");
            return (Criteria) this;
        }

        public Criteria andOrgannameNotEqualTo(String value) {
            addCriterion("CS_ORGANNAME <>", value, "organname");
            return (Criteria) this;
        }

        public Criteria andOrgannameGreaterThan(String value) {
            addCriterion("CS_ORGANNAME >", value, "organname");
            return (Criteria) this;
        }

        public Criteria andOrgannameGreaterThanOrEqualTo(String value) {
            addCriterion("CS_ORGANNAME >=", value, "organname");
            return (Criteria) this;
        }

        public Criteria andOrgannameLessThan(String value) {
            addCriterion("CS_ORGANNAME <", value, "organname");
            return (Criteria) this;
        }

        public Criteria andOrgannameLessThanOrEqualTo(String value) {
            addCriterion("CS_ORGANNAME <=", value, "organname");
            return (Criteria) this;
        }

        public Criteria andOrgannameLike(String value) {
            addCriterion("CS_ORGANNAME like", value, "organname");
            return (Criteria) this;
        }

        public Criteria andOrgannameNotLike(String value) {
            addCriterion("CS_ORGANNAME not like", value, "organname");
            return (Criteria) this;
        }

        public Criteria andOrgannameIn(List<String> values) {
            addCriterion("CS_ORGANNAME in", values, "organname");
            return (Criteria) this;
        }

        public Criteria andOrgannameNotIn(List<String> values) {
            addCriterion("CS_ORGANNAME not in", values, "organname");
            return (Criteria) this;
        }

        public Criteria andOrgannameBetween(String value1, String value2) {
            addCriterion("CS_ORGANNAME between", value1, value2, "organname");
            return (Criteria) this;
        }

        public Criteria andOrgannameNotBetween(String value1, String value2) {
            addCriterion("CS_ORGANNAME not between", value1, value2, "organname");
            return (Criteria) this;
        }

        public Criteria andYcsnameIsNull() {
            addCriterion("CS_YCSNAME is null");
            return (Criteria) this;
        }

        public Criteria andYcsnameIsNotNull() {
            addCriterion("CS_YCSNAME is not null");
            return (Criteria) this;
        }

        public Criteria andYcsnameEqualTo(String value) {
            addCriterion("CS_YCSNAME =", value, "ycsname");
            return (Criteria) this;
        }

        public Criteria andYcsnameNotEqualTo(String value) {
            addCriterion("CS_YCSNAME <>", value, "ycsname");
            return (Criteria) this;
        }

        public Criteria andYcsnameGreaterThan(String value) {
            addCriterion("CS_YCSNAME >", value, "ycsname");
            return (Criteria) this;
        }

        public Criteria andYcsnameGreaterThanOrEqualTo(String value) {
            addCriterion("CS_YCSNAME >=", value, "ycsname");
            return (Criteria) this;
        }

        public Criteria andYcsnameLessThan(String value) {
            addCriterion("CS_YCSNAME <", value, "ycsname");
            return (Criteria) this;
        }

        public Criteria andYcsnameLessThanOrEqualTo(String value) {
            addCriterion("CS_YCSNAME <=", value, "ycsname");
            return (Criteria) this;
        }

        public Criteria andYcsnameLike(String value) {
            addCriterion("CS_YCSNAME like", value, "ycsname");
            return (Criteria) this;
        }

        public Criteria andYcsnameNotLike(String value) {
            addCriterion("CS_YCSNAME not like", value, "ycsname");
            return (Criteria) this;
        }

        public Criteria andYcsnameIn(List<String> values) {
            addCriterion("CS_YCSNAME in", values, "ycsname");
            return (Criteria) this;
        }

        public Criteria andYcsnameNotIn(List<String> values) {
            addCriterion("CS_YCSNAME not in", values, "ycsname");
            return (Criteria) this;
        }

        public Criteria andYcsnameBetween(String value1, String value2) {
            addCriterion("CS_YCSNAME between", value1, value2, "ycsname");
            return (Criteria) this;
        }

        public Criteria andYcsnameNotBetween(String value1, String value2) {
            addCriterion("CS_YCSNAME not between", value1, value2, "ycsname");
            return (Criteria) this;
        }

        public Criteria andYcscertnumIsNull() {
            addCriterion("CS_YCSCERTNUM is null");
            return (Criteria) this;
        }

        public Criteria andYcscertnumIsNotNull() {
            addCriterion("CS_YCSCERTNUM is not null");
            return (Criteria) this;
        }

        public Criteria andYcscertnumEqualTo(String value) {
            addCriterion("CS_YCSCERTNUM =", value, "ycscertnum");
            return (Criteria) this;
        }

        public Criteria andYcscertnumNotEqualTo(String value) {
            addCriterion("CS_YCSCERTNUM <>", value, "ycscertnum");
            return (Criteria) this;
        }

        public Criteria andYcscertnumGreaterThan(String value) {
            addCriterion("CS_YCSCERTNUM >", value, "ycscertnum");
            return (Criteria) this;
        }

        public Criteria andYcscertnumGreaterThanOrEqualTo(String value) {
            addCriterion("CS_YCSCERTNUM >=", value, "ycscertnum");
            return (Criteria) this;
        }

        public Criteria andYcscertnumLessThan(String value) {
            addCriterion("CS_YCSCERTNUM <", value, "ycscertnum");
            return (Criteria) this;
        }

        public Criteria andYcscertnumLessThanOrEqualTo(String value) {
            addCriterion("CS_YCSCERTNUM <=", value, "ycscertnum");
            return (Criteria) this;
        }

        public Criteria andYcscertnumLike(String value) {
            addCriterion("CS_YCSCERTNUM like", value, "ycscertnum");
            return (Criteria) this;
        }

        public Criteria andYcscertnumNotLike(String value) {
            addCriterion("CS_YCSCERTNUM not like", value, "ycscertnum");
            return (Criteria) this;
        }

        public Criteria andYcscertnumIn(List<String> values) {
            addCriterion("CS_YCSCERTNUM in", values, "ycscertnum");
            return (Criteria) this;
        }

        public Criteria andYcscertnumNotIn(List<String> values) {
            addCriterion("CS_YCSCERTNUM not in", values, "ycscertnum");
            return (Criteria) this;
        }

        public Criteria andYcscertnumBetween(String value1, String value2) {
            addCriterion("CS_YCSCERTNUM between", value1, value2, "ycscertnum");
            return (Criteria) this;
        }

        public Criteria andYcscertnumNotBetween(String value1, String value2) {
            addCriterion("CS_YCSCERTNUM not between", value1, value2, "ycscertnum");
            return (Criteria) this;
        }

        public Criteria andShipchecktimeIsNull() {
            addCriterion("CS_SHIPCHECKTIME is null");
            return (Criteria) this;
        }

        public Criteria andShipchecktimeIsNotNull() {
            addCriterion("CS_SHIPCHECKTIME is not null");
            return (Criteria) this;
        }

        public Criteria andShipchecktimeEqualTo(String value) {
            addCriterion("CS_SHIPCHECKTIME =", value, "shipchecktime");
            return (Criteria) this;
        }

        public Criteria andShipchecktimeNotEqualTo(String value) {
            addCriterion("CS_SHIPCHECKTIME <>", value, "shipchecktime");
            return (Criteria) this;
        }

        public Criteria andShipchecktimeGreaterThan(String value) {
            addCriterion("CS_SHIPCHECKTIME >", value, "shipchecktime");
            return (Criteria) this;
        }

        public Criteria andShipchecktimeGreaterThanOrEqualTo(String value) {
            addCriterion("CS_SHIPCHECKTIME >=", value, "shipchecktime");
            return (Criteria) this;
        }

        public Criteria andShipchecktimeLessThan(String value) {
            addCriterion("CS_SHIPCHECKTIME <", value, "shipchecktime");
            return (Criteria) this;
        }

        public Criteria andShipchecktimeLessThanOrEqualTo(String value) {
            addCriterion("CS_SHIPCHECKTIME <=", value, "shipchecktime");
            return (Criteria) this;
        }

        public Criteria andShipchecktimeLike(String value) {
            addCriterion("CS_SHIPCHECKTIME like", value, "shipchecktime");
            return (Criteria) this;
        }

        public Criteria andShipchecktimeNotLike(String value) {
            addCriterion("CS_SHIPCHECKTIME not like", value, "shipchecktime");
            return (Criteria) this;
        }

        public Criteria andShipchecktimeIn(List<String> values) {
            addCriterion("CS_SHIPCHECKTIME in", values, "shipchecktime");
            return (Criteria) this;
        }

        public Criteria andShipchecktimeNotIn(List<String> values) {
            addCriterion("CS_SHIPCHECKTIME not in", values, "shipchecktime");
            return (Criteria) this;
        }

        public Criteria andShipchecktimeBetween(String value1, String value2) {
            addCriterion("CS_SHIPCHECKTIME between", value1, value2, "shipchecktime");
            return (Criteria) this;
        }

        public Criteria andShipchecktimeNotBetween(String value1, String value2) {
            addCriterion("CS_SHIPCHECKTIME not between", value1, value2, "shipchecktime");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("CS_SEX is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("CS_SEX is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("CS_SEX =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("CS_SEX <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("CS_SEX >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("CS_SEX >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("CS_SEX <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("CS_SEX <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("CS_SEX like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("CS_SEX not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("CS_SEX in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("CS_SEX not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("CS_SEX between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("CS_SEX not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andBirthdateIsNull() {
            addCriterion("CS_BIRTHDATE is null");
            return (Criteria) this;
        }

        public Criteria andBirthdateIsNotNull() {
            addCriterion("CS_BIRTHDATE is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdateEqualTo(String value) {
            addCriterion("CS_BIRTHDATE =", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateNotEqualTo(String value) {
            addCriterion("CS_BIRTHDATE <>", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateGreaterThan(String value) {
            addCriterion("CS_BIRTHDATE >", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateGreaterThanOrEqualTo(String value) {
            addCriterion("CS_BIRTHDATE >=", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateLessThan(String value) {
            addCriterion("CS_BIRTHDATE <", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateLessThanOrEqualTo(String value) {
            addCriterion("CS_BIRTHDATE <=", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateLike(String value) {
            addCriterion("CS_BIRTHDATE like", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateNotLike(String value) {
            addCriterion("CS_BIRTHDATE not like", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateIn(List<String> values) {
            addCriterion("CS_BIRTHDATE in", values, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateNotIn(List<String> values) {
            addCriterion("CS_BIRTHDATE not in", values, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateBetween(String value1, String value2) {
            addCriterion("CS_BIRTHDATE between", value1, value2, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateNotBetween(String value1, String value2) {
            addCriterion("CS_BIRTHDATE not between", value1, value2, "birthdate");
            return (Criteria) this;
        }

        public Criteria andProvcodeIsNull() {
            addCriterion("CS_PROVCODE is null");
            return (Criteria) this;
        }

        public Criteria andProvcodeIsNotNull() {
            addCriterion("CS_PROVCODE is not null");
            return (Criteria) this;
        }

        public Criteria andProvcodeEqualTo(String value) {
            addCriterion("CS_PROVCODE =", value, "provcode");
            return (Criteria) this;
        }

        public Criteria andProvcodeNotEqualTo(String value) {
            addCriterion("CS_PROVCODE <>", value, "provcode");
            return (Criteria) this;
        }

        public Criteria andProvcodeGreaterThan(String value) {
            addCriterion("CS_PROVCODE >", value, "provcode");
            return (Criteria) this;
        }

        public Criteria andProvcodeGreaterThanOrEqualTo(String value) {
            addCriterion("CS_PROVCODE >=", value, "provcode");
            return (Criteria) this;
        }

        public Criteria andProvcodeLessThan(String value) {
            addCriterion("CS_PROVCODE <", value, "provcode");
            return (Criteria) this;
        }

        public Criteria andProvcodeLessThanOrEqualTo(String value) {
            addCriterion("CS_PROVCODE <=", value, "provcode");
            return (Criteria) this;
        }

        public Criteria andProvcodeLike(String value) {
            addCriterion("CS_PROVCODE like", value, "provcode");
            return (Criteria) this;
        }

        public Criteria andProvcodeNotLike(String value) {
            addCriterion("CS_PROVCODE not like", value, "provcode");
            return (Criteria) this;
        }

        public Criteria andProvcodeIn(List<String> values) {
            addCriterion("CS_PROVCODE in", values, "provcode");
            return (Criteria) this;
        }

        public Criteria andProvcodeNotIn(List<String> values) {
            addCriterion("CS_PROVCODE not in", values, "provcode");
            return (Criteria) this;
        }

        public Criteria andProvcodeBetween(String value1, String value2) {
            addCriterion("CS_PROVCODE between", value1, value2, "provcode");
            return (Criteria) this;
        }

        public Criteria andProvcodeNotBetween(String value1, String value2) {
            addCriterion("CS_PROVCODE not between", value1, value2, "provcode");
            return (Criteria) this;
        }

        public Criteria andEducertcodeIsNull() {
            addCriterion("CS_EDUCERTCODE is null");
            return (Criteria) this;
        }

        public Criteria andEducertcodeIsNotNull() {
            addCriterion("CS_EDUCERTCODE is not null");
            return (Criteria) this;
        }

        public Criteria andEducertcodeEqualTo(String value) {
            addCriterion("CS_EDUCERTCODE =", value, "educertcode");
            return (Criteria) this;
        }

        public Criteria andEducertcodeNotEqualTo(String value) {
            addCriterion("CS_EDUCERTCODE <>", value, "educertcode");
            return (Criteria) this;
        }

        public Criteria andEducertcodeGreaterThan(String value) {
            addCriterion("CS_EDUCERTCODE >", value, "educertcode");
            return (Criteria) this;
        }

        public Criteria andEducertcodeGreaterThanOrEqualTo(String value) {
            addCriterion("CS_EDUCERTCODE >=", value, "educertcode");
            return (Criteria) this;
        }

        public Criteria andEducertcodeLessThan(String value) {
            addCriterion("CS_EDUCERTCODE <", value, "educertcode");
            return (Criteria) this;
        }

        public Criteria andEducertcodeLessThanOrEqualTo(String value) {
            addCriterion("CS_EDUCERTCODE <=", value, "educertcode");
            return (Criteria) this;
        }

        public Criteria andEducertcodeLike(String value) {
            addCriterion("CS_EDUCERTCODE like", value, "educertcode");
            return (Criteria) this;
        }

        public Criteria andEducertcodeNotLike(String value) {
            addCriterion("CS_EDUCERTCODE not like", value, "educertcode");
            return (Criteria) this;
        }

        public Criteria andEducertcodeIn(List<String> values) {
            addCriterion("CS_EDUCERTCODE in", values, "educertcode");
            return (Criteria) this;
        }

        public Criteria andEducertcodeNotIn(List<String> values) {
            addCriterion("CS_EDUCERTCODE not in", values, "educertcode");
            return (Criteria) this;
        }

        public Criteria andEducertcodeBetween(String value1, String value2) {
            addCriterion("CS_EDUCERTCODE between", value1, value2, "educertcode");
            return (Criteria) this;
        }

        public Criteria andEducertcodeNotBetween(String value1, String value2) {
            addCriterion("CS_EDUCERTCODE not between", value1, value2, "educertcode");
            return (Criteria) this;
        }

        public Criteria andMajornameIsNull() {
            addCriterion("CS_MAJORNAME is null");
            return (Criteria) this;
        }

        public Criteria andMajornameIsNotNull() {
            addCriterion("CS_MAJORNAME is not null");
            return (Criteria) this;
        }

        public Criteria andMajornameEqualTo(String value) {
            addCriterion("CS_MAJORNAME =", value, "majorname");
            return (Criteria) this;
        }

        public Criteria andMajornameNotEqualTo(String value) {
            addCriterion("CS_MAJORNAME <>", value, "majorname");
            return (Criteria) this;
        }

        public Criteria andMajornameGreaterThan(String value) {
            addCriterion("CS_MAJORNAME >", value, "majorname");
            return (Criteria) this;
        }

        public Criteria andMajornameGreaterThanOrEqualTo(String value) {
            addCriterion("CS_MAJORNAME >=", value, "majorname");
            return (Criteria) this;
        }

        public Criteria andMajornameLessThan(String value) {
            addCriterion("CS_MAJORNAME <", value, "majorname");
            return (Criteria) this;
        }

        public Criteria andMajornameLessThanOrEqualTo(String value) {
            addCriterion("CS_MAJORNAME <=", value, "majorname");
            return (Criteria) this;
        }

        public Criteria andMajornameLike(String value) {
            addCriterion("CS_MAJORNAME like", value, "majorname");
            return (Criteria) this;
        }

        public Criteria andMajornameNotLike(String value) {
            addCriterion("CS_MAJORNAME not like", value, "majorname");
            return (Criteria) this;
        }

        public Criteria andMajornameIn(List<String> values) {
            addCriterion("CS_MAJORNAME in", values, "majorname");
            return (Criteria) this;
        }

        public Criteria andMajornameNotIn(List<String> values) {
            addCriterion("CS_MAJORNAME not in", values, "majorname");
            return (Criteria) this;
        }

        public Criteria andMajornameBetween(String value1, String value2) {
            addCriterion("CS_MAJORNAME between", value1, value2, "majorname");
            return (Criteria) this;
        }

        public Criteria andMajornameNotBetween(String value1, String value2) {
            addCriterion("CS_MAJORNAME not between", value1, value2, "majorname");
            return (Criteria) this;
        }

        public Criteria andEducertcode1IsNull() {
            addCriterion("CS_EDUCERTCODE1 is null");
            return (Criteria) this;
        }

        public Criteria andEducertcode1IsNotNull() {
            addCriterion("CS_EDUCERTCODE1 is not null");
            return (Criteria) this;
        }

        public Criteria andEducertcode1EqualTo(String value) {
            addCriterion("CS_EDUCERTCODE1 =", value, "educertcode1");
            return (Criteria) this;
        }

        public Criteria andEducertcode1NotEqualTo(String value) {
            addCriterion("CS_EDUCERTCODE1 <>", value, "educertcode1");
            return (Criteria) this;
        }

        public Criteria andEducertcode1GreaterThan(String value) {
            addCriterion("CS_EDUCERTCODE1 >", value, "educertcode1");
            return (Criteria) this;
        }

        public Criteria andEducertcode1GreaterThanOrEqualTo(String value) {
            addCriterion("CS_EDUCERTCODE1 >=", value, "educertcode1");
            return (Criteria) this;
        }

        public Criteria andEducertcode1LessThan(String value) {
            addCriterion("CS_EDUCERTCODE1 <", value, "educertcode1");
            return (Criteria) this;
        }

        public Criteria andEducertcode1LessThanOrEqualTo(String value) {
            addCriterion("CS_EDUCERTCODE1 <=", value, "educertcode1");
            return (Criteria) this;
        }

        public Criteria andEducertcode1Like(String value) {
            addCriterion("CS_EDUCERTCODE1 like", value, "educertcode1");
            return (Criteria) this;
        }

        public Criteria andEducertcode1NotLike(String value) {
            addCriterion("CS_EDUCERTCODE1 not like", value, "educertcode1");
            return (Criteria) this;
        }

        public Criteria andEducertcode1In(List<String> values) {
            addCriterion("CS_EDUCERTCODE1 in", values, "educertcode1");
            return (Criteria) this;
        }

        public Criteria andEducertcode1NotIn(List<String> values) {
            addCriterion("CS_EDUCERTCODE1 not in", values, "educertcode1");
            return (Criteria) this;
        }

        public Criteria andEducertcode1Between(String value1, String value2) {
            addCriterion("CS_EDUCERTCODE1 between", value1, value2, "educertcode1");
            return (Criteria) this;
        }

        public Criteria andEducertcode1NotBetween(String value1, String value2) {
            addCriterion("CS_EDUCERTCODE1 not between", value1, value2, "educertcode1");
            return (Criteria) this;
        }

        public Criteria andMajorname1IsNull() {
            addCriterion("CS_MAJORNAME1 is null");
            return (Criteria) this;
        }

        public Criteria andMajorname1IsNotNull() {
            addCriterion("CS_MAJORNAME1 is not null");
            return (Criteria) this;
        }

        public Criteria andMajorname1EqualTo(String value) {
            addCriterion("CS_MAJORNAME1 =", value, "majorname1");
            return (Criteria) this;
        }

        public Criteria andMajorname1NotEqualTo(String value) {
            addCriterion("CS_MAJORNAME1 <>", value, "majorname1");
            return (Criteria) this;
        }

        public Criteria andMajorname1GreaterThan(String value) {
            addCriterion("CS_MAJORNAME1 >", value, "majorname1");
            return (Criteria) this;
        }

        public Criteria andMajorname1GreaterThanOrEqualTo(String value) {
            addCriterion("CS_MAJORNAME1 >=", value, "majorname1");
            return (Criteria) this;
        }

        public Criteria andMajorname1LessThan(String value) {
            addCriterion("CS_MAJORNAME1 <", value, "majorname1");
            return (Criteria) this;
        }

        public Criteria andMajorname1LessThanOrEqualTo(String value) {
            addCriterion("CS_MAJORNAME1 <=", value, "majorname1");
            return (Criteria) this;
        }

        public Criteria andMajorname1Like(String value) {
            addCriterion("CS_MAJORNAME1 like", value, "majorname1");
            return (Criteria) this;
        }

        public Criteria andMajorname1NotLike(String value) {
            addCriterion("CS_MAJORNAME1 not like", value, "majorname1");
            return (Criteria) this;
        }

        public Criteria andMajorname1In(List<String> values) {
            addCriterion("CS_MAJORNAME1 in", values, "majorname1");
            return (Criteria) this;
        }

        public Criteria andMajorname1NotIn(List<String> values) {
            addCriterion("CS_MAJORNAME1 not in", values, "majorname1");
            return (Criteria) this;
        }

        public Criteria andMajorname1Between(String value1, String value2) {
            addCriterion("CS_MAJORNAME1 between", value1, value2, "majorname1");
            return (Criteria) this;
        }

        public Criteria andMajorname1NotBetween(String value1, String value2) {
            addCriterion("CS_MAJORNAME1 not between", value1, value2, "majorname1");
            return (Criteria) this;
        }

        public Criteria andPositionnameIsNull() {
            addCriterion("CS_POSITIONNAME is null");
            return (Criteria) this;
        }

        public Criteria andPositionnameIsNotNull() {
            addCriterion("CS_POSITIONNAME is not null");
            return (Criteria) this;
        }

        public Criteria andPositionnameEqualTo(String value) {
            addCriterion("CS_POSITIONNAME =", value, "positionname");
            return (Criteria) this;
        }

        public Criteria andPositionnameNotEqualTo(String value) {
            addCriterion("CS_POSITIONNAME <>", value, "positionname");
            return (Criteria) this;
        }

        public Criteria andPositionnameGreaterThan(String value) {
            addCriterion("CS_POSITIONNAME >", value, "positionname");
            return (Criteria) this;
        }

        public Criteria andPositionnameGreaterThanOrEqualTo(String value) {
            addCriterion("CS_POSITIONNAME >=", value, "positionname");
            return (Criteria) this;
        }

        public Criteria andPositionnameLessThan(String value) {
            addCriterion("CS_POSITIONNAME <", value, "positionname");
            return (Criteria) this;
        }

        public Criteria andPositionnameLessThanOrEqualTo(String value) {
            addCriterion("CS_POSITIONNAME <=", value, "positionname");
            return (Criteria) this;
        }

        public Criteria andPositionnameLike(String value) {
            addCriterion("CS_POSITIONNAME like", value, "positionname");
            return (Criteria) this;
        }

        public Criteria andPositionnameNotLike(String value) {
            addCriterion("CS_POSITIONNAME not like", value, "positionname");
            return (Criteria) this;
        }

        public Criteria andPositionnameIn(List<String> values) {
            addCriterion("CS_POSITIONNAME in", values, "positionname");
            return (Criteria) this;
        }

        public Criteria andPositionnameNotIn(List<String> values) {
            addCriterion("CS_POSITIONNAME not in", values, "positionname");
            return (Criteria) this;
        }

        public Criteria andPositionnameBetween(String value1, String value2) {
            addCriterion("CS_POSITIONNAME between", value1, value2, "positionname");
            return (Criteria) this;
        }

        public Criteria andPositionnameNotBetween(String value1, String value2) {
            addCriterion("CS_POSITIONNAME not between", value1, value2, "positionname");
            return (Criteria) this;
        }

        public Criteria andApplyTypeIsNull() {
            addCriterion("CS_APPLY_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andApplyTypeIsNotNull() {
            addCriterion("CS_APPLY_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andApplyTypeEqualTo(String value) {
            addCriterion("CS_APPLY_TYPE =", value, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeNotEqualTo(String value) {
            addCriterion("CS_APPLY_TYPE <>", value, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeGreaterThan(String value) {
            addCriterion("CS_APPLY_TYPE >", value, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CS_APPLY_TYPE >=", value, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeLessThan(String value) {
            addCriterion("CS_APPLY_TYPE <", value, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeLessThanOrEqualTo(String value) {
            addCriterion("CS_APPLY_TYPE <=", value, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeLike(String value) {
            addCriterion("CS_APPLY_TYPE like", value, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeNotLike(String value) {
            addCriterion("CS_APPLY_TYPE not like", value, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeIn(List<String> values) {
            addCriterion("CS_APPLY_TYPE in", values, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeNotIn(List<String> values) {
            addCriterion("CS_APPLY_TYPE not in", values, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeBetween(String value1, String value2) {
            addCriterion("CS_APPLY_TYPE between", value1, value2, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeNotBetween(String value1, String value2) {
            addCriterion("CS_APPLY_TYPE not between", value1, value2, "applyType");
            return (Criteria) this;
        }

        public Criteria andLeaderstatusIsNull() {
            addCriterion("CS_LEADERSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andLeaderstatusIsNotNull() {
            addCriterion("CS_LEADERSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andLeaderstatusEqualTo(String value) {
            addCriterion("CS_LEADERSTATUS =", value, "leaderstatus");
            return (Criteria) this;
        }

        public Criteria andLeaderstatusNotEqualTo(String value) {
            addCriterion("CS_LEADERSTATUS <>", value, "leaderstatus");
            return (Criteria) this;
        }

        public Criteria andLeaderstatusGreaterThan(String value) {
            addCriterion("CS_LEADERSTATUS >", value, "leaderstatus");
            return (Criteria) this;
        }

        public Criteria andLeaderstatusGreaterThanOrEqualTo(String value) {
            addCriterion("CS_LEADERSTATUS >=", value, "leaderstatus");
            return (Criteria) this;
        }

        public Criteria andLeaderstatusLessThan(String value) {
            addCriterion("CS_LEADERSTATUS <", value, "leaderstatus");
            return (Criteria) this;
        }

        public Criteria andLeaderstatusLessThanOrEqualTo(String value) {
            addCriterion("CS_LEADERSTATUS <=", value, "leaderstatus");
            return (Criteria) this;
        }

        public Criteria andLeaderstatusLike(String value) {
            addCriterion("CS_LEADERSTATUS like", value, "leaderstatus");
            return (Criteria) this;
        }

        public Criteria andLeaderstatusNotLike(String value) {
            addCriterion("CS_LEADERSTATUS not like", value, "leaderstatus");
            return (Criteria) this;
        }

        public Criteria andLeaderstatusIn(List<String> values) {
            addCriterion("CS_LEADERSTATUS in", values, "leaderstatus");
            return (Criteria) this;
        }

        public Criteria andLeaderstatusNotIn(List<String> values) {
            addCriterion("CS_LEADERSTATUS not in", values, "leaderstatus");
            return (Criteria) this;
        }

        public Criteria andLeaderstatusBetween(String value1, String value2) {
            addCriterion("CS_LEADERSTATUS between", value1, value2, "leaderstatus");
            return (Criteria) this;
        }

        public Criteria andLeaderstatusNotBetween(String value1, String value2) {
            addCriterion("CS_LEADERSTATUS not between", value1, value2, "leaderstatus");
            return (Criteria) this;
        }

        public Criteria andOceanyearIsNull() {
            addCriterion("CS_OCEANYEAR is null");
            return (Criteria) this;
        }

        public Criteria andOceanyearIsNotNull() {
            addCriterion("CS_OCEANYEAR is not null");
            return (Criteria) this;
        }

        public Criteria andOceanyearEqualTo(String value) {
            addCriterion("CS_OCEANYEAR =", value, "oceanyear");
            return (Criteria) this;
        }

        public Criteria andOceanyearNotEqualTo(String value) {
            addCriterion("CS_OCEANYEAR <>", value, "oceanyear");
            return (Criteria) this;
        }

        public Criteria andOceanyearGreaterThan(String value) {
            addCriterion("CS_OCEANYEAR >", value, "oceanyear");
            return (Criteria) this;
        }

        public Criteria andOceanyearGreaterThanOrEqualTo(String value) {
            addCriterion("CS_OCEANYEAR >=", value, "oceanyear");
            return (Criteria) this;
        }

        public Criteria andOceanyearLessThan(String value) {
            addCriterion("CS_OCEANYEAR <", value, "oceanyear");
            return (Criteria) this;
        }

        public Criteria andOceanyearLessThanOrEqualTo(String value) {
            addCriterion("CS_OCEANYEAR <=", value, "oceanyear");
            return (Criteria) this;
        }

        public Criteria andOceanyearLike(String value) {
            addCriterion("CS_OCEANYEAR like", value, "oceanyear");
            return (Criteria) this;
        }

        public Criteria andOceanyearNotLike(String value) {
            addCriterion("CS_OCEANYEAR not like", value, "oceanyear");
            return (Criteria) this;
        }

        public Criteria andOceanyearIn(List<String> values) {
            addCriterion("CS_OCEANYEAR in", values, "oceanyear");
            return (Criteria) this;
        }

        public Criteria andOceanyearNotIn(List<String> values) {
            addCriterion("CS_OCEANYEAR not in", values, "oceanyear");
            return (Criteria) this;
        }

        public Criteria andOceanyearBetween(String value1, String value2) {
            addCriterion("CS_OCEANYEAR between", value1, value2, "oceanyear");
            return (Criteria) this;
        }

        public Criteria andOceanyearNotBetween(String value1, String value2) {
            addCriterion("CS_OCEANYEAR not between", value1, value2, "oceanyear");
            return (Criteria) this;
        }

        public Criteria andAcceptunitIsNull() {
            addCriterion("CS_ACCEPTUNIT is null");
            return (Criteria) this;
        }

        public Criteria andAcceptunitIsNotNull() {
            addCriterion("CS_ACCEPTUNIT is not null");
            return (Criteria) this;
        }

        public Criteria andAcceptunitEqualTo(String value) {
            addCriterion("CS_ACCEPTUNIT =", value, "acceptunit");
            return (Criteria) this;
        }

        public Criteria andAcceptunitNotEqualTo(String value) {
            addCriterion("CS_ACCEPTUNIT <>", value, "acceptunit");
            return (Criteria) this;
        }

        public Criteria andAcceptunitGreaterThan(String value) {
            addCriterion("CS_ACCEPTUNIT >", value, "acceptunit");
            return (Criteria) this;
        }

        public Criteria andAcceptunitGreaterThanOrEqualTo(String value) {
            addCriterion("CS_ACCEPTUNIT >=", value, "acceptunit");
            return (Criteria) this;
        }

        public Criteria andAcceptunitLessThan(String value) {
            addCriterion("CS_ACCEPTUNIT <", value, "acceptunit");
            return (Criteria) this;
        }

        public Criteria andAcceptunitLessThanOrEqualTo(String value) {
            addCriterion("CS_ACCEPTUNIT <=", value, "acceptunit");
            return (Criteria) this;
        }

        public Criteria andAcceptunitLike(String value) {
            addCriterion("CS_ACCEPTUNIT like", value, "acceptunit");
            return (Criteria) this;
        }

        public Criteria andAcceptunitNotLike(String value) {
            addCriterion("CS_ACCEPTUNIT not like", value, "acceptunit");
            return (Criteria) this;
        }

        public Criteria andAcceptunitIn(List<String> values) {
            addCriterion("CS_ACCEPTUNIT in", values, "acceptunit");
            return (Criteria) this;
        }

        public Criteria andAcceptunitNotIn(List<String> values) {
            addCriterion("CS_ACCEPTUNIT not in", values, "acceptunit");
            return (Criteria) this;
        }

        public Criteria andAcceptunitBetween(String value1, String value2) {
            addCriterion("CS_ACCEPTUNIT between", value1, value2, "acceptunit");
            return (Criteria) this;
        }

        public Criteria andAcceptunitNotBetween(String value1, String value2) {
            addCriterion("CS_ACCEPTUNIT not between", value1, value2, "acceptunit");
            return (Criteria) this;
        }

        public Criteria andAcceptpeopleIsNull() {
            addCriterion("CS_ACCEPTPEOPLE is null");
            return (Criteria) this;
        }

        public Criteria andAcceptpeopleIsNotNull() {
            addCriterion("CS_ACCEPTPEOPLE is not null");
            return (Criteria) this;
        }

        public Criteria andAcceptpeopleEqualTo(String value) {
            addCriterion("CS_ACCEPTPEOPLE =", value, "acceptpeople");
            return (Criteria) this;
        }

        public Criteria andAcceptpeopleNotEqualTo(String value) {
            addCriterion("CS_ACCEPTPEOPLE <>", value, "acceptpeople");
            return (Criteria) this;
        }

        public Criteria andAcceptpeopleGreaterThan(String value) {
            addCriterion("CS_ACCEPTPEOPLE >", value, "acceptpeople");
            return (Criteria) this;
        }

        public Criteria andAcceptpeopleGreaterThanOrEqualTo(String value) {
            addCriterion("CS_ACCEPTPEOPLE >=", value, "acceptpeople");
            return (Criteria) this;
        }

        public Criteria andAcceptpeopleLessThan(String value) {
            addCriterion("CS_ACCEPTPEOPLE <", value, "acceptpeople");
            return (Criteria) this;
        }

        public Criteria andAcceptpeopleLessThanOrEqualTo(String value) {
            addCriterion("CS_ACCEPTPEOPLE <=", value, "acceptpeople");
            return (Criteria) this;
        }

        public Criteria andAcceptpeopleLike(String value) {
            addCriterion("CS_ACCEPTPEOPLE like", value, "acceptpeople");
            return (Criteria) this;
        }

        public Criteria andAcceptpeopleNotLike(String value) {
            addCriterion("CS_ACCEPTPEOPLE not like", value, "acceptpeople");
            return (Criteria) this;
        }

        public Criteria andAcceptpeopleIn(List<String> values) {
            addCriterion("CS_ACCEPTPEOPLE in", values, "acceptpeople");
            return (Criteria) this;
        }

        public Criteria andAcceptpeopleNotIn(List<String> values) {
            addCriterion("CS_ACCEPTPEOPLE not in", values, "acceptpeople");
            return (Criteria) this;
        }

        public Criteria andAcceptpeopleBetween(String value1, String value2) {
            addCriterion("CS_ACCEPTPEOPLE between", value1, value2, "acceptpeople");
            return (Criteria) this;
        }

        public Criteria andAcceptpeopleNotBetween(String value1, String value2) {
            addCriterion("CS_ACCEPTPEOPLE not between", value1, value2, "acceptpeople");
            return (Criteria) this;
        }

        public Criteria andAcceptpopptionIsNull() {
            addCriterion("CS_ACCEPTPOPPTION is null");
            return (Criteria) this;
        }

        public Criteria andAcceptpopptionIsNotNull() {
            addCriterion("CS_ACCEPTPOPPTION is not null");
            return (Criteria) this;
        }

        public Criteria andAcceptpopptionEqualTo(String value) {
            addCriterion("CS_ACCEPTPOPPTION =", value, "acceptpopption");
            return (Criteria) this;
        }

        public Criteria andAcceptpopptionNotEqualTo(String value) {
            addCriterion("CS_ACCEPTPOPPTION <>", value, "acceptpopption");
            return (Criteria) this;
        }

        public Criteria andAcceptpopptionGreaterThan(String value) {
            addCriterion("CS_ACCEPTPOPPTION >", value, "acceptpopption");
            return (Criteria) this;
        }

        public Criteria andAcceptpopptionGreaterThanOrEqualTo(String value) {
            addCriterion("CS_ACCEPTPOPPTION >=", value, "acceptpopption");
            return (Criteria) this;
        }

        public Criteria andAcceptpopptionLessThan(String value) {
            addCriterion("CS_ACCEPTPOPPTION <", value, "acceptpopption");
            return (Criteria) this;
        }

        public Criteria andAcceptpopptionLessThanOrEqualTo(String value) {
            addCriterion("CS_ACCEPTPOPPTION <=", value, "acceptpopption");
            return (Criteria) this;
        }

        public Criteria andAcceptpopptionLike(String value) {
            addCriterion("CS_ACCEPTPOPPTION like", value, "acceptpopption");
            return (Criteria) this;
        }

        public Criteria andAcceptpopptionNotLike(String value) {
            addCriterion("CS_ACCEPTPOPPTION not like", value, "acceptpopption");
            return (Criteria) this;
        }

        public Criteria andAcceptpopptionIn(List<String> values) {
            addCriterion("CS_ACCEPTPOPPTION in", values, "acceptpopption");
            return (Criteria) this;
        }

        public Criteria andAcceptpopptionNotIn(List<String> values) {
            addCriterion("CS_ACCEPTPOPPTION not in", values, "acceptpopption");
            return (Criteria) this;
        }

        public Criteria andAcceptpopptionBetween(String value1, String value2) {
            addCriterion("CS_ACCEPTPOPPTION between", value1, value2, "acceptpopption");
            return (Criteria) this;
        }

        public Criteria andAcceptpopptionNotBetween(String value1, String value2) {
            addCriterion("CS_ACCEPTPOPPTION not between", value1, value2, "acceptpopption");
            return (Criteria) this;
        }

        public Criteria andIdtIsNull() {
            addCriterion("CS_IDT is null");
            return (Criteria) this;
        }

        public Criteria andIdtIsNotNull() {
            addCriterion("CS_IDT is not null");
            return (Criteria) this;
        }

        public Criteria andIdtEqualTo(Object value) {
            addCriterion("CS_IDT =", value, "idt");
            return (Criteria) this;
        }

        public Criteria andIdtNotEqualTo(Object value) {
            addCriterion("CS_IDT <>", value, "idt");
            return (Criteria) this;
        }

        public Criteria andIdtGreaterThan(Object value) {
            addCriterion("CS_IDT >", value, "idt");
            return (Criteria) this;
        }

        public Criteria andIdtGreaterThanOrEqualTo(Object value) {
            addCriterion("CS_IDT >=", value, "idt");
            return (Criteria) this;
        }

        public Criteria andIdtLessThan(Object value) {
            addCriterion("CS_IDT <", value, "idt");
            return (Criteria) this;
        }

        public Criteria andIdtLessThanOrEqualTo(Object value) {
            addCriterion("CS_IDT <=", value, "idt");
            return (Criteria) this;
        }

        public Criteria andIdtIn(List<Object> values) {
            addCriterion("CS_IDT in", values, "idt");
            return (Criteria) this;
        }

        public Criteria andIdtNotIn(List<Object> values) {
            addCriterion("CS_IDT not in", values, "idt");
            return (Criteria) this;
        }

        public Criteria andIdtBetween(Object value1, Object value2) {
            addCriterion("CS_IDT between", value1, value2, "idt");
            return (Criteria) this;
        }

        public Criteria andIdtNotBetween(Object value1, Object value2) {
            addCriterion("CS_IDT not between", value1, value2, "idt");
            return (Criteria) this;
        }

        public Criteria andUdtIsNull() {
            addCriterion("CS_UDT is null");
            return (Criteria) this;
        }

        public Criteria andUdtIsNotNull() {
            addCriterion("CS_UDT is not null");
            return (Criteria) this;
        }

        public Criteria andUdtEqualTo(Object value) {
            addCriterion("CS_UDT =", value, "udt");
            return (Criteria) this;
        }

        public Criteria andUdtNotEqualTo(Object value) {
            addCriterion("CS_UDT <>", value, "udt");
            return (Criteria) this;
        }

        public Criteria andUdtGreaterThan(Object value) {
            addCriterion("CS_UDT >", value, "udt");
            return (Criteria) this;
        }

        public Criteria andUdtGreaterThanOrEqualTo(Object value) {
            addCriterion("CS_UDT >=", value, "udt");
            return (Criteria) this;
        }

        public Criteria andUdtLessThan(Object value) {
            addCriterion("CS_UDT <", value, "udt");
            return (Criteria) this;
        }

        public Criteria andUdtLessThanOrEqualTo(Object value) {
            addCriterion("CS_UDT <=", value, "udt");
            return (Criteria) this;
        }

        public Criteria andUdtIn(List<Object> values) {
            addCriterion("CS_UDT in", values, "udt");
            return (Criteria) this;
        }

        public Criteria andUdtNotIn(List<Object> values) {
            addCriterion("CS_UDT not in", values, "udt");
            return (Criteria) this;
        }

        public Criteria andUdtBetween(Object value1, Object value2) {
            addCriterion("CS_UDT between", value1, value2, "udt");
            return (Criteria) this;
        }

        public Criteria andUdtNotBetween(Object value1, Object value2) {
            addCriterion("CS_UDT not between", value1, value2, "udt");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("CS_STATE is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("CS_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("CS_STATE =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("CS_STATE <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("CS_STATE >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("CS_STATE >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("CS_STATE <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("CS_STATE <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("CS_STATE like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("CS_STATE not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("CS_STATE in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("CS_STATE not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("CS_STATE between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("CS_STATE not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andProvnameIsNull() {
            addCriterion("CS_PROVNAME is null");
            return (Criteria) this;
        }

        public Criteria andProvnameIsNotNull() {
            addCriterion("CS_PROVNAME is not null");
            return (Criteria) this;
        }

        public Criteria andProvnameEqualTo(String value) {
            addCriterion("CS_PROVNAME =", value, "provname");
            return (Criteria) this;
        }

        public Criteria andProvnameNotEqualTo(String value) {
            addCriterion("CS_PROVNAME <>", value, "provname");
            return (Criteria) this;
        }

        public Criteria andProvnameGreaterThan(String value) {
            addCriterion("CS_PROVNAME >", value, "provname");
            return (Criteria) this;
        }

        public Criteria andProvnameGreaterThanOrEqualTo(String value) {
            addCriterion("CS_PROVNAME >=", value, "provname");
            return (Criteria) this;
        }

        public Criteria andProvnameLessThan(String value) {
            addCriterion("CS_PROVNAME <", value, "provname");
            return (Criteria) this;
        }

        public Criteria andProvnameLessThanOrEqualTo(String value) {
            addCriterion("CS_PROVNAME <=", value, "provname");
            return (Criteria) this;
        }

        public Criteria andProvnameLike(String value) {
            addCriterion("CS_PROVNAME like", value, "provname");
            return (Criteria) this;
        }

        public Criteria andProvnameNotLike(String value) {
            addCriterion("CS_PROVNAME not like", value, "provname");
            return (Criteria) this;
        }

        public Criteria andProvnameIn(List<String> values) {
            addCriterion("CS_PROVNAME in", values, "provname");
            return (Criteria) this;
        }

        public Criteria andProvnameNotIn(List<String> values) {
            addCriterion("CS_PROVNAME not in", values, "provname");
            return (Criteria) this;
        }

        public Criteria andProvnameBetween(String value1, String value2) {
            addCriterion("CS_PROVNAME between", value1, value2, "provname");
            return (Criteria) this;
        }

        public Criteria andProvnameNotBetween(String value1, String value2) {
            addCriterion("CS_PROVNAME not between", value1, value2, "provname");
            return (Criteria) this;
        }

        public Criteria andTelphoneIsNull() {
            addCriterion("CS_TELPHONE is null");
            return (Criteria) this;
        }

        public Criteria andTelphoneIsNotNull() {
            addCriterion("CS_TELPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andTelphoneEqualTo(String value) {
            addCriterion("CS_TELPHONE =", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneNotEqualTo(String value) {
            addCriterion("CS_TELPHONE <>", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneGreaterThan(String value) {
            addCriterion("CS_TELPHONE >", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneGreaterThanOrEqualTo(String value) {
            addCriterion("CS_TELPHONE >=", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneLessThan(String value) {
            addCriterion("CS_TELPHONE <", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneLessThanOrEqualTo(String value) {
            addCriterion("CS_TELPHONE <=", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneLike(String value) {
            addCriterion("CS_TELPHONE like", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneNotLike(String value) {
            addCriterion("CS_TELPHONE not like", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneIn(List<String> values) {
            addCriterion("CS_TELPHONE in", values, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneNotIn(List<String> values) {
            addCriterion("CS_TELPHONE not in", values, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneBetween(String value1, String value2) {
            addCriterion("CS_TELPHONE between", value1, value2, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneNotBetween(String value1, String value2) {
            addCriterion("CS_TELPHONE not between", value1, value2, "telphone");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("CS_EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("CS_EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("CS_EMAIL =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("CS_EMAIL <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("CS_EMAIL >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("CS_EMAIL >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("CS_EMAIL <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("CS_EMAIL <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("CS_EMAIL like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("CS_EMAIL not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("CS_EMAIL in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("CS_EMAIL not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("CS_EMAIL between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("CS_EMAIL not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andIdLikeInsensitive(String value) {
            addCriterion("upper(CS_ID) like", value.toUpperCase(), "id");
            return (Criteria) this;
        }

        public Criteria andUidLikeInsensitive(String value) {
            addCriterion("upper(CS_UID) like", value.toUpperCase(), "uid");
            return (Criteria) this;
        }

        public Criteria andOrganidLikeInsensitive(String value) {
            addCriterion("upper(CS_ORGANID) like", value.toUpperCase(), "organid");
            return (Criteria) this;
        }

        public Criteria andCertidLikeInsensitive(String value) {
            addCriterion("upper(CS_CERTID) like", value.toUpperCase(), "certid");
            return (Criteria) this;
        }

        public Criteria andOrgannameLikeInsensitive(String value) {
            addCriterion("upper(CS_ORGANNAME) like", value.toUpperCase(), "organname");
            return (Criteria) this;
        }

        public Criteria andYcsnameLikeInsensitive(String value) {
            addCriterion("upper(CS_YCSNAME) like", value.toUpperCase(), "ycsname");
            return (Criteria) this;
        }

        public Criteria andYcscertnumLikeInsensitive(String value) {
            addCriterion("upper(CS_YCSCERTNUM) like", value.toUpperCase(), "ycscertnum");
            return (Criteria) this;
        }

        public Criteria andShipchecktimeLikeInsensitive(String value) {
            addCriterion("upper(CS_SHIPCHECKTIME) like", value.toUpperCase(), "shipchecktime");
            return (Criteria) this;
        }

        public Criteria andSexLikeInsensitive(String value) {
            addCriterion("upper(CS_SEX) like", value.toUpperCase(), "sex");
            return (Criteria) this;
        }

        public Criteria andBirthdateLikeInsensitive(String value) {
            addCriterion("upper(CS_BIRTHDATE) like", value.toUpperCase(), "birthdate");
            return (Criteria) this;
        }

        public Criteria andProvcodeLikeInsensitive(String value) {
            addCriterion("upper(CS_PROVCODE) like", value.toUpperCase(), "provcode");
            return (Criteria) this;
        }

        public Criteria andEducertcodeLikeInsensitive(String value) {
            addCriterion("upper(CS_EDUCERTCODE) like", value.toUpperCase(), "educertcode");
            return (Criteria) this;
        }

        public Criteria andMajornameLikeInsensitive(String value) {
            addCriterion("upper(CS_MAJORNAME) like", value.toUpperCase(), "majorname");
            return (Criteria) this;
        }

        public Criteria andEducertcode1LikeInsensitive(String value) {
            addCriterion("upper(CS_EDUCERTCODE1) like", value.toUpperCase(), "educertcode1");
            return (Criteria) this;
        }

        public Criteria andMajorname1LikeInsensitive(String value) {
            addCriterion("upper(CS_MAJORNAME1) like", value.toUpperCase(), "majorname1");
            return (Criteria) this;
        }

        public Criteria andPositionnameLikeInsensitive(String value) {
            addCriterion("upper(CS_POSITIONNAME) like", value.toUpperCase(), "positionname");
            return (Criteria) this;
        }

        public Criteria andApplyTypeLikeInsensitive(String value) {
            addCriterion("upper(CS_APPLY_TYPE) like", value.toUpperCase(), "applyType");
            return (Criteria) this;
        }

        public Criteria andLeaderstatusLikeInsensitive(String value) {
            addCriterion("upper(CS_LEADERSTATUS) like", value.toUpperCase(), "leaderstatus");
            return (Criteria) this;
        }

        public Criteria andOceanyearLikeInsensitive(String value) {
            addCriterion("upper(CS_OCEANYEAR) like", value.toUpperCase(), "oceanyear");
            return (Criteria) this;
        }

        public Criteria andAcceptunitLikeInsensitive(String value) {
            addCriterion("upper(CS_ACCEPTUNIT) like", value.toUpperCase(), "acceptunit");
            return (Criteria) this;
        }

        public Criteria andAcceptpeopleLikeInsensitive(String value) {
            addCriterion("upper(CS_ACCEPTPEOPLE) like", value.toUpperCase(), "acceptpeople");
            return (Criteria) this;
        }

        public Criteria andAcceptpopptionLikeInsensitive(String value) {
            addCriterion("upper(CS_ACCEPTPOPPTION) like", value.toUpperCase(), "acceptpopption");
            return (Criteria) this;
        }

        public Criteria andStateLikeInsensitive(String value) {
            addCriterion("upper(CS_STATE) like", value.toUpperCase(), "state");
            return (Criteria) this;
        }

        public Criteria andProvnameLikeInsensitive(String value) {
            addCriterion("upper(CS_PROVNAME) like", value.toUpperCase(), "provname");
            return (Criteria) this;
        }

        public Criteria andTelphoneLikeInsensitive(String value) {
            addCriterion("upper(CS_TELPHONE) like", value.toUpperCase(), "telphone");
            return (Criteria) this;
        }

        public Criteria andEmailLikeInsensitive(String value) {
            addCriterion("upper(CS_EMAIL) like", value.toUpperCase(), "email");
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