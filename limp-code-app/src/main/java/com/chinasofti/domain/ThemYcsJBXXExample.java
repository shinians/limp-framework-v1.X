package com.chinasofti.domain;

import com.limp.framework.core.bean.Pager;

import java.util.ArrayList;
import java.util.List;

public class ThemYcsJBXXExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Pager page;

    public ThemYcsJBXXExample() {
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andOrgnameIsNull() {
            addCriterion("ORGNAME is null");
            return (Criteria) this;
        }

        public Criteria andOrgnameIsNotNull() {
            addCriterion("ORGNAME is not null");
            return (Criteria) this;
        }

        public Criteria andOrgnameEqualTo(String value) {
            addCriterion("ORGNAME =", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameNotEqualTo(String value) {
            addCriterion("ORGNAME <>", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameGreaterThan(String value) {
            addCriterion("ORGNAME >", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameGreaterThanOrEqualTo(String value) {
            addCriterion("ORGNAME >=", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameLessThan(String value) {
            addCriterion("ORGNAME <", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameLessThanOrEqualTo(String value) {
            addCriterion("ORGNAME <=", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameLike(String value) {
            addCriterion("ORGNAME like", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameNotLike(String value) {
            addCriterion("ORGNAME not like", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameIn(List<String> values) {
            addCriterion("ORGNAME in", values, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameNotIn(List<String> values) {
            addCriterion("ORGNAME not in", values, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameBetween(String value1, String value2) {
            addCriterion("ORGNAME between", value1, value2, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameNotBetween(String value1, String value2) {
            addCriterion("ORGNAME not between", value1, value2, "orgname");
            return (Criteria) this;
        }

        public Criteria andProvcodeIsNull() {
            addCriterion("PROVCODE is null");
            return (Criteria) this;
        }

        public Criteria andProvcodeIsNotNull() {
            addCriterion("PROVCODE is not null");
            return (Criteria) this;
        }

        public Criteria andProvcodeEqualTo(String value) {
            addCriterion("PROVCODE =", value, "provcode");
            return (Criteria) this;
        }

        public Criteria andProvcodeNotEqualTo(String value) {
            addCriterion("PROVCODE <>", value, "provcode");
            return (Criteria) this;
        }

        public Criteria andProvcodeGreaterThan(String value) {
            addCriterion("PROVCODE >", value, "provcode");
            return (Criteria) this;
        }

        public Criteria andProvcodeGreaterThanOrEqualTo(String value) {
            addCriterion("PROVCODE >=", value, "provcode");
            return (Criteria) this;
        }

        public Criteria andProvcodeLessThan(String value) {
            addCriterion("PROVCODE <", value, "provcode");
            return (Criteria) this;
        }

        public Criteria andProvcodeLessThanOrEqualTo(String value) {
            addCriterion("PROVCODE <=", value, "provcode");
            return (Criteria) this;
        }

        public Criteria andProvcodeLike(String value) {
            addCriterion("PROVCODE like", value, "provcode");
            return (Criteria) this;
        }

        public Criteria andProvcodeNotLike(String value) {
            addCriterion("PROVCODE not like", value, "provcode");
            return (Criteria) this;
        }

        public Criteria andProvcodeIn(List<String> values) {
            addCriterion("PROVCODE in", values, "provcode");
            return (Criteria) this;
        }

        public Criteria andProvcodeNotIn(List<String> values) {
            addCriterion("PROVCODE not in", values, "provcode");
            return (Criteria) this;
        }

        public Criteria andProvcodeBetween(String value1, String value2) {
            addCriterion("PROVCODE between", value1, value2, "provcode");
            return (Criteria) this;
        }

        public Criteria andProvcodeNotBetween(String value1, String value2) {
            addCriterion("PROVCODE not between", value1, value2, "provcode");
            return (Criteria) this;
        }

        public Criteria andLvIsNull() {
            addCriterion("LV is null");
            return (Criteria) this;
        }

        public Criteria andLvIsNotNull() {
            addCriterion("LV is not null");
            return (Criteria) this;
        }

        public Criteria andLvEqualTo(String value) {
            addCriterion("LV =", value, "lv");
            return (Criteria) this;
        }

        public Criteria andLvNotEqualTo(String value) {
            addCriterion("LV <>", value, "lv");
            return (Criteria) this;
        }

        public Criteria andLvGreaterThan(String value) {
            addCriterion("LV >", value, "lv");
            return (Criteria) this;
        }

        public Criteria andLvGreaterThanOrEqualTo(String value) {
            addCriterion("LV >=", value, "lv");
            return (Criteria) this;
        }

        public Criteria andLvLessThan(String value) {
            addCriterion("LV <", value, "lv");
            return (Criteria) this;
        }

        public Criteria andLvLessThanOrEqualTo(String value) {
            addCriterion("LV <=", value, "lv");
            return (Criteria) this;
        }

        public Criteria andLvLike(String value) {
            addCriterion("LV like", value, "lv");
            return (Criteria) this;
        }

        public Criteria andLvNotLike(String value) {
            addCriterion("LV not like", value, "lv");
            return (Criteria) this;
        }

        public Criteria andLvIn(List<String> values) {
            addCriterion("LV in", values, "lv");
            return (Criteria) this;
        }

        public Criteria andLvNotIn(List<String> values) {
            addCriterion("LV not in", values, "lv");
            return (Criteria) this;
        }

        public Criteria andLvBetween(String value1, String value2) {
            addCriterion("LV between", value1, value2, "lv");
            return (Criteria) this;
        }

        public Criteria andLvNotBetween(String value1, String value2) {
            addCriterion("LV not between", value1, value2, "lv");
            return (Criteria) this;
        }

        public Criteria andEducertcodeIsNull() {
            addCriterion("EDUCERTCODE is null");
            return (Criteria) this;
        }

        public Criteria andEducertcodeIsNotNull() {
            addCriterion("EDUCERTCODE is not null");
            return (Criteria) this;
        }

        public Criteria andEducertcodeEqualTo(String value) {
            addCriterion("EDUCERTCODE =", value, "educertcode");
            return (Criteria) this;
        }

        public Criteria andEducertcodeNotEqualTo(String value) {
            addCriterion("EDUCERTCODE <>", value, "educertcode");
            return (Criteria) this;
        }

        public Criteria andEducertcodeGreaterThan(String value) {
            addCriterion("EDUCERTCODE >", value, "educertcode");
            return (Criteria) this;
        }

        public Criteria andEducertcodeGreaterThanOrEqualTo(String value) {
            addCriterion("EDUCERTCODE >=", value, "educertcode");
            return (Criteria) this;
        }

        public Criteria andEducertcodeLessThan(String value) {
            addCriterion("EDUCERTCODE <", value, "educertcode");
            return (Criteria) this;
        }

        public Criteria andEducertcodeLessThanOrEqualTo(String value) {
            addCriterion("EDUCERTCODE <=", value, "educertcode");
            return (Criteria) this;
        }

        public Criteria andEducertcodeLike(String value) {
            addCriterion("EDUCERTCODE like", value, "educertcode");
            return (Criteria) this;
        }

        public Criteria andEducertcodeNotLike(String value) {
            addCriterion("EDUCERTCODE not like", value, "educertcode");
            return (Criteria) this;
        }

        public Criteria andEducertcodeIn(List<String> values) {
            addCriterion("EDUCERTCODE in", values, "educertcode");
            return (Criteria) this;
        }

        public Criteria andEducertcodeNotIn(List<String> values) {
            addCriterion("EDUCERTCODE not in", values, "educertcode");
            return (Criteria) this;
        }

        public Criteria andEducertcodeBetween(String value1, String value2) {
            addCriterion("EDUCERTCODE between", value1, value2, "educertcode");
            return (Criteria) this;
        }

        public Criteria andEducertcodeNotBetween(String value1, String value2) {
            addCriterion("EDUCERTCODE not between", value1, value2, "educertcode");
            return (Criteria) this;
        }

        public Criteria andPositionIsNull() {
            addCriterion("POSITION is null");
            return (Criteria) this;
        }

        public Criteria andPositionIsNotNull() {
            addCriterion("POSITION is not null");
            return (Criteria) this;
        }

        public Criteria andPositionEqualTo(String value) {
            addCriterion("POSITION =", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotEqualTo(String value) {
            addCriterion("POSITION <>", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThan(String value) {
            addCriterion("POSITION >", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThanOrEqualTo(String value) {
            addCriterion("POSITION >=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThan(String value) {
            addCriterion("POSITION <", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThanOrEqualTo(String value) {
            addCriterion("POSITION <=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLike(String value) {
            addCriterion("POSITION like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotLike(String value) {
            addCriterion("POSITION not like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionIn(List<String> values) {
            addCriterion("POSITION in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotIn(List<String> values) {
            addCriterion("POSITION not in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionBetween(String value1, String value2) {
            addCriterion("POSITION between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotBetween(String value1, String value2) {
            addCriterion("POSITION not between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andCerttimeIsNull() {
            addCriterion("CERTTIME is null");
            return (Criteria) this;
        }

        public Criteria andCerttimeIsNotNull() {
            addCriterion("CERTTIME is not null");
            return (Criteria) this;
        }

        public Criteria andCerttimeEqualTo(String value) {
            addCriterion("CERTTIME =", value, "certtime");
            return (Criteria) this;
        }

        public Criteria andCerttimeNotEqualTo(String value) {
            addCriterion("CERTTIME <>", value, "certtime");
            return (Criteria) this;
        }

        public Criteria andCerttimeGreaterThan(String value) {
            addCriterion("CERTTIME >", value, "certtime");
            return (Criteria) this;
        }

        public Criteria andCerttimeGreaterThanOrEqualTo(String value) {
            addCriterion("CERTTIME >=", value, "certtime");
            return (Criteria) this;
        }

        public Criteria andCerttimeLessThan(String value) {
            addCriterion("CERTTIME <", value, "certtime");
            return (Criteria) this;
        }

        public Criteria andCerttimeLessThanOrEqualTo(String value) {
            addCriterion("CERTTIME <=", value, "certtime");
            return (Criteria) this;
        }

        public Criteria andCerttimeLike(String value) {
            addCriterion("CERTTIME like", value, "certtime");
            return (Criteria) this;
        }

        public Criteria andCerttimeNotLike(String value) {
            addCriterion("CERTTIME not like", value, "certtime");
            return (Criteria) this;
        }

        public Criteria andCerttimeIn(List<String> values) {
            addCriterion("CERTTIME in", values, "certtime");
            return (Criteria) this;
        }

        public Criteria andCerttimeNotIn(List<String> values) {
            addCriterion("CERTTIME not in", values, "certtime");
            return (Criteria) this;
        }

        public Criteria andCerttimeBetween(String value1, String value2) {
            addCriterion("CERTTIME between", value1, value2, "certtime");
            return (Criteria) this;
        }

        public Criteria andCerttimeNotBetween(String value1, String value2) {
            addCriterion("CERTTIME not between", value1, value2, "certtime");
            return (Criteria) this;
        }

        public Criteria andMajorcodeIsNull() {
            addCriterion("MAJORCODE is null");
            return (Criteria) this;
        }

        public Criteria andMajorcodeIsNotNull() {
            addCriterion("MAJORCODE is not null");
            return (Criteria) this;
        }

        public Criteria andMajorcodeEqualTo(String value) {
            addCriterion("MAJORCODE =", value, "majorcode");
            return (Criteria) this;
        }

        public Criteria andMajorcodeNotEqualTo(String value) {
            addCriterion("MAJORCODE <>", value, "majorcode");
            return (Criteria) this;
        }

        public Criteria andMajorcodeGreaterThan(String value) {
            addCriterion("MAJORCODE >", value, "majorcode");
            return (Criteria) this;
        }

        public Criteria andMajorcodeGreaterThanOrEqualTo(String value) {
            addCriterion("MAJORCODE >=", value, "majorcode");
            return (Criteria) this;
        }

        public Criteria andMajorcodeLessThan(String value) {
            addCriterion("MAJORCODE <", value, "majorcode");
            return (Criteria) this;
        }

        public Criteria andMajorcodeLessThanOrEqualTo(String value) {
            addCriterion("MAJORCODE <=", value, "majorcode");
            return (Criteria) this;
        }

        public Criteria andMajorcodeLike(String value) {
            addCriterion("MAJORCODE like", value, "majorcode");
            return (Criteria) this;
        }

        public Criteria andMajorcodeNotLike(String value) {
            addCriterion("MAJORCODE not like", value, "majorcode");
            return (Criteria) this;
        }

        public Criteria andMajorcodeIn(List<String> values) {
            addCriterion("MAJORCODE in", values, "majorcode");
            return (Criteria) this;
        }

        public Criteria andMajorcodeNotIn(List<String> values) {
            addCriterion("MAJORCODE not in", values, "majorcode");
            return (Criteria) this;
        }

        public Criteria andMajorcodeBetween(String value1, String value2) {
            addCriterion("MAJORCODE between", value1, value2, "majorcode");
            return (Criteria) this;
        }

        public Criteria andMajorcodeNotBetween(String value1, String value2) {
            addCriterion("MAJORCODE not between", value1, value2, "majorcode");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("SEX is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("SEX is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("SEX =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("SEX <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("SEX >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("SEX >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("SEX <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("SEX <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("SEX like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("SEX not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("SEX in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("SEX not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("SEX between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("SEX not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andPxnumIsNull() {
            addCriterion("PXNUM is null");
            return (Criteria) this;
        }

        public Criteria andPxnumIsNotNull() {
            addCriterion("PXNUM is not null");
            return (Criteria) this;
        }

        public Criteria andPxnumEqualTo(Long value) {
            addCriterion("PXNUM =", value, "pxnum");
            return (Criteria) this;
        }

        public Criteria andPxnumNotEqualTo(Long value) {
            addCriterion("PXNUM <>", value, "pxnum");
            return (Criteria) this;
        }

        public Criteria andPxnumGreaterThan(Long value) {
            addCriterion("PXNUM >", value, "pxnum");
            return (Criteria) this;
        }

        public Criteria andPxnumGreaterThanOrEqualTo(Long value) {
            addCriterion("PXNUM >=", value, "pxnum");
            return (Criteria) this;
        }

        public Criteria andPxnumLessThan(Long value) {
            addCriterion("PXNUM <", value, "pxnum");
            return (Criteria) this;
        }

        public Criteria andPxnumLessThanOrEqualTo(Long value) {
            addCriterion("PXNUM <=", value, "pxnum");
            return (Criteria) this;
        }

        public Criteria andPxnumIn(List<Long> values) {
            addCriterion("PXNUM in", values, "pxnum");
            return (Criteria) this;
        }

        public Criteria andPxnumNotIn(List<Long> values) {
            addCriterion("PXNUM not in", values, "pxnum");
            return (Criteria) this;
        }

        public Criteria andPxnumBetween(Long value1, Long value2) {
            addCriterion("PXNUM between", value1, value2, "pxnum");
            return (Criteria) this;
        }

        public Criteria andPxnumNotBetween(Long value1, Long value2) {
            addCriterion("PXNUM not between", value1, value2, "pxnum");
            return (Criteria) this;
        }

        public Criteria andShipnumIsNull() {
            addCriterion("SHIPNUM is null");
            return (Criteria) this;
        }

        public Criteria andShipnumIsNotNull() {
            addCriterion("SHIPNUM is not null");
            return (Criteria) this;
        }

        public Criteria andShipnumEqualTo(Long value) {
            addCriterion("SHIPNUM =", value, "shipnum");
            return (Criteria) this;
        }

        public Criteria andShipnumNotEqualTo(Long value) {
            addCriterion("SHIPNUM <>", value, "shipnum");
            return (Criteria) this;
        }

        public Criteria andShipnumGreaterThan(Long value) {
            addCriterion("SHIPNUM >", value, "shipnum");
            return (Criteria) this;
        }

        public Criteria andShipnumGreaterThanOrEqualTo(Long value) {
            addCriterion("SHIPNUM >=", value, "shipnum");
            return (Criteria) this;
        }

        public Criteria andShipnumLessThan(Long value) {
            addCriterion("SHIPNUM <", value, "shipnum");
            return (Criteria) this;
        }

        public Criteria andShipnumLessThanOrEqualTo(Long value) {
            addCriterion("SHIPNUM <=", value, "shipnum");
            return (Criteria) this;
        }

        public Criteria andShipnumIn(List<Long> values) {
            addCriterion("SHIPNUM in", values, "shipnum");
            return (Criteria) this;
        }

        public Criteria andShipnumNotIn(List<Long> values) {
            addCriterion("SHIPNUM not in", values, "shipnum");
            return (Criteria) this;
        }

        public Criteria andShipnumBetween(Long value1, Long value2) {
            addCriterion("SHIPNUM between", value1, value2, "shipnum");
            return (Criteria) this;
        }

        public Criteria andShipnumNotBetween(Long value1, Long value2) {
            addCriterion("SHIPNUM not between", value1, value2, "shipnum");
            return (Criteria) this;
        }

        public Criteria andDrawnumIsNull() {
            addCriterion("DRAWNUM is null");
            return (Criteria) this;
        }

        public Criteria andDrawnumIsNotNull() {
            addCriterion("DRAWNUM is not null");
            return (Criteria) this;
        }

        public Criteria andDrawnumEqualTo(Long value) {
            addCriterion("DRAWNUM =", value, "drawnum");
            return (Criteria) this;
        }

        public Criteria andDrawnumNotEqualTo(Long value) {
            addCriterion("DRAWNUM <>", value, "drawnum");
            return (Criteria) this;
        }

        public Criteria andDrawnumGreaterThan(Long value) {
            addCriterion("DRAWNUM >", value, "drawnum");
            return (Criteria) this;
        }

        public Criteria andDrawnumGreaterThanOrEqualTo(Long value) {
            addCriterion("DRAWNUM >=", value, "drawnum");
            return (Criteria) this;
        }

        public Criteria andDrawnumLessThan(Long value) {
            addCriterion("DRAWNUM <", value, "drawnum");
            return (Criteria) this;
        }

        public Criteria andDrawnumLessThanOrEqualTo(Long value) {
            addCriterion("DRAWNUM <=", value, "drawnum");
            return (Criteria) this;
        }

        public Criteria andDrawnumIn(List<Long> values) {
            addCriterion("DRAWNUM in", values, "drawnum");
            return (Criteria) this;
        }

        public Criteria andDrawnumNotIn(List<Long> values) {
            addCriterion("DRAWNUM not in", values, "drawnum");
            return (Criteria) this;
        }

        public Criteria andDrawnumBetween(Long value1, Long value2) {
            addCriterion("DRAWNUM between", value1, value2, "drawnum");
            return (Criteria) this;
        }

        public Criteria andDrawnumNotBetween(Long value1, Long value2) {
            addCriterion("DRAWNUM not between", value1, value2, "drawnum");
            return (Criteria) this;
        }

        public Criteria andProductnumIsNull() {
            addCriterion("PRODUCTNUM is null");
            return (Criteria) this;
        }

        public Criteria andProductnumIsNotNull() {
            addCriterion("PRODUCTNUM is not null");
            return (Criteria) this;
        }

        public Criteria andProductnumEqualTo(Long value) {
            addCriterion("PRODUCTNUM =", value, "productnum");
            return (Criteria) this;
        }

        public Criteria andProductnumNotEqualTo(Long value) {
            addCriterion("PRODUCTNUM <>", value, "productnum");
            return (Criteria) this;
        }

        public Criteria andProductnumGreaterThan(Long value) {
            addCriterion("PRODUCTNUM >", value, "productnum");
            return (Criteria) this;
        }

        public Criteria andProductnumGreaterThanOrEqualTo(Long value) {
            addCriterion("PRODUCTNUM >=", value, "productnum");
            return (Criteria) this;
        }

        public Criteria andProductnumLessThan(Long value) {
            addCriterion("PRODUCTNUM <", value, "productnum");
            return (Criteria) this;
        }

        public Criteria andProductnumLessThanOrEqualTo(Long value) {
            addCriterion("PRODUCTNUM <=", value, "productnum");
            return (Criteria) this;
        }

        public Criteria andProductnumIn(List<Long> values) {
            addCriterion("PRODUCTNUM in", values, "productnum");
            return (Criteria) this;
        }

        public Criteria andProductnumNotIn(List<Long> values) {
            addCriterion("PRODUCTNUM not in", values, "productnum");
            return (Criteria) this;
        }

        public Criteria andProductnumBetween(Long value1, Long value2) {
            addCriterion("PRODUCTNUM between", value1, value2, "productnum");
            return (Criteria) this;
        }

        public Criteria andProductnumNotBetween(Long value1, Long value2) {
            addCriterion("PRODUCTNUM not between", value1, value2, "productnum");
            return (Criteria) this;
        }

        public Criteria andYearIsNull() {
            addCriterion("YEAR is null");
            return (Criteria) this;
        }

        public Criteria andYearIsNotNull() {
            addCriterion("YEAR is not null");
            return (Criteria) this;
        }

        public Criteria andYearEqualTo(String value) {
            addCriterion("YEAR =", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotEqualTo(String value) {
            addCriterion("YEAR <>", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThan(String value) {
            addCriterion("YEAR >", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThanOrEqualTo(String value) {
            addCriterion("YEAR >=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThan(String value) {
            addCriterion("YEAR <", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThanOrEqualTo(String value) {
            addCriterion("YEAR <=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLike(String value) {
            addCriterion("YEAR like", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotLike(String value) {
            addCriterion("YEAR not like", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearIn(List<String> values) {
            addCriterion("YEAR in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotIn(List<String> values) {
            addCriterion("YEAR not in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearBetween(String value1, String value2) {
            addCriterion("YEAR between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotBetween(String value1, String value2) {
            addCriterion("YEAR not between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andRangetypeIsNull() {
            addCriterion("RANGETYPE is null");
            return (Criteria) this;
        }

        public Criteria andRangetypeIsNotNull() {
            addCriterion("RANGETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andRangetypeEqualTo(String value) {
            addCriterion("RANGETYPE =", value, "rangetype");
            return (Criteria) this;
        }

        public Criteria andRangetypeNotEqualTo(String value) {
            addCriterion("RANGETYPE <>", value, "rangetype");
            return (Criteria) this;
        }

        public Criteria andRangetypeGreaterThan(String value) {
            addCriterion("RANGETYPE >", value, "rangetype");
            return (Criteria) this;
        }

        public Criteria andRangetypeGreaterThanOrEqualTo(String value) {
            addCriterion("RANGETYPE >=", value, "rangetype");
            return (Criteria) this;
        }

        public Criteria andRangetypeLessThan(String value) {
            addCriterion("RANGETYPE <", value, "rangetype");
            return (Criteria) this;
        }

        public Criteria andRangetypeLessThanOrEqualTo(String value) {
            addCriterion("RANGETYPE <=", value, "rangetype");
            return (Criteria) this;
        }

        public Criteria andRangetypeLike(String value) {
            addCriterion("RANGETYPE like", value, "rangetype");
            return (Criteria) this;
        }

        public Criteria andRangetypeNotLike(String value) {
            addCriterion("RANGETYPE not like", value, "rangetype");
            return (Criteria) this;
        }

        public Criteria andRangetypeIn(List<String> values) {
            addCriterion("RANGETYPE in", values, "rangetype");
            return (Criteria) this;
        }

        public Criteria andRangetypeNotIn(List<String> values) {
            addCriterion("RANGETYPE not in", values, "rangetype");
            return (Criteria) this;
        }

        public Criteria andRangetypeBetween(String value1, String value2) {
            addCriterion("RANGETYPE between", value1, value2, "rangetype");
            return (Criteria) this;
        }

        public Criteria andRangetypeNotBetween(String value1, String value2) {
            addCriterion("RANGETYPE not between", value1, value2, "rangetype");
            return (Criteria) this;
        }

        public Criteria andIdLikeInsensitive(String value) {
            addCriterion("upper(ID) like", value.toUpperCase(), "id");
            return (Criteria) this;
        }

        public Criteria andNameLikeInsensitive(String value) {
            addCriterion("upper(NAME) like", value.toUpperCase(), "name");
            return (Criteria) this;
        }

        public Criteria andOrgnameLikeInsensitive(String value) {
            addCriterion("upper(ORGNAME) like", value.toUpperCase(), "orgname");
            return (Criteria) this;
        }

        public Criteria andProvcodeLikeInsensitive(String value) {
            addCriterion("upper(PROVCODE) like", value.toUpperCase(), "provcode");
            return (Criteria) this;
        }

        public Criteria andLvLikeInsensitive(String value) {
            addCriterion("upper(LV) like", value.toUpperCase(), "lv");
            return (Criteria) this;
        }

        public Criteria andEducertcodeLikeInsensitive(String value) {
            addCriterion("upper(EDUCERTCODE) like", value.toUpperCase(), "educertcode");
            return (Criteria) this;
        }

        public Criteria andPositionLikeInsensitive(String value) {
            addCriterion("upper(POSITION) like", value.toUpperCase(), "position");
            return (Criteria) this;
        }

        public Criteria andCerttimeLikeInsensitive(String value) {
            addCriterion("upper(CERTTIME) like", value.toUpperCase(), "certtime");
            return (Criteria) this;
        }

        public Criteria andMajorcodeLikeInsensitive(String value) {
            addCriterion("upper(MAJORCODE) like", value.toUpperCase(), "majorcode");
            return (Criteria) this;
        }

        public Criteria andSexLikeInsensitive(String value) {
            addCriterion("upper(SEX) like", value.toUpperCase(), "sex");
            return (Criteria) this;
        }

        public Criteria andYearLikeInsensitive(String value) {
            addCriterion("upper(YEAR) like", value.toUpperCase(), "year");
            return (Criteria) this;
        }

        public Criteria andRangetypeLikeInsensitive(String value) {
            addCriterion("upper(RANGETYPE) like", value.toUpperCase(), "rangetype");
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