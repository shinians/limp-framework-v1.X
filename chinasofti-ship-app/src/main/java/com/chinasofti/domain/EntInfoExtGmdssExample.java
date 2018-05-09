package com.chinasofti.domain;

import com.limp.framework.core.bean.Pager;

import java.util.ArrayList;
import java.util.List;

public class EntInfoExtGmdssExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Pager page;

    public EntInfoExtGmdssExample() {
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
            addCriterion("CEQ_ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("CEQ_ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("CEQ_ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("CEQ_ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("CEQ_ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("CEQ_ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("CEQ_ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("CEQ_ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("CEQ_ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("CEQ_ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("CEQ_ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("CEQ_ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("CEQ_ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("CEQ_ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andPidIsNull() {
            addCriterion("CEQ_PID is null");
            return (Criteria) this;
        }

        public Criteria andPidIsNotNull() {
            addCriterion("CEQ_PID is not null");
            return (Criteria) this;
        }

        public Criteria andPidEqualTo(String value) {
            addCriterion("CEQ_PID =", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotEqualTo(String value) {
            addCriterion("CEQ_PID <>", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThan(String value) {
            addCriterion("CEQ_PID >", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThanOrEqualTo(String value) {
            addCriterion("CEQ_PID >=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThan(String value) {
            addCriterion("CEQ_PID <", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThanOrEqualTo(String value) {
            addCriterion("CEQ_PID <=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLike(String value) {
            addCriterion("CEQ_PID like", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotLike(String value) {
            addCriterion("CEQ_PID not like", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidIn(List<String> values) {
            addCriterion("CEQ_PID in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotIn(List<String> values) {
            addCriterion("CEQ_PID not in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidBetween(String value1, String value2) {
            addCriterion("CEQ_PID between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotBetween(String value1, String value2) {
            addCriterion("CEQ_PID not between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andCertnumIsNull() {
            addCriterion("CEQ_CERTNUM is null");
            return (Criteria) this;
        }

        public Criteria andCertnumIsNotNull() {
            addCriterion("CEQ_CERTNUM is not null");
            return (Criteria) this;
        }

        public Criteria andCertnumEqualTo(String value) {
            addCriterion("CEQ_CERTNUM =", value, "certnum");
            return (Criteria) this;
        }

        public Criteria andCertnumNotEqualTo(String value) {
            addCriterion("CEQ_CERTNUM <>", value, "certnum");
            return (Criteria) this;
        }

        public Criteria andCertnumGreaterThan(String value) {
            addCriterion("CEQ_CERTNUM >", value, "certnum");
            return (Criteria) this;
        }

        public Criteria andCertnumGreaterThanOrEqualTo(String value) {
            addCriterion("CEQ_CERTNUM >=", value, "certnum");
            return (Criteria) this;
        }

        public Criteria andCertnumLessThan(String value) {
            addCriterion("CEQ_CERTNUM <", value, "certnum");
            return (Criteria) this;
        }

        public Criteria andCertnumLessThanOrEqualTo(String value) {
            addCriterion("CEQ_CERTNUM <=", value, "certnum");
            return (Criteria) this;
        }

        public Criteria andCertnumLike(String value) {
            addCriterion("CEQ_CERTNUM like", value, "certnum");
            return (Criteria) this;
        }

        public Criteria andCertnumNotLike(String value) {
            addCriterion("CEQ_CERTNUM not like", value, "certnum");
            return (Criteria) this;
        }

        public Criteria andCertnumIn(List<String> values) {
            addCriterion("CEQ_CERTNUM in", values, "certnum");
            return (Criteria) this;
        }

        public Criteria andCertnumNotIn(List<String> values) {
            addCriterion("CEQ_CERTNUM not in", values, "certnum");
            return (Criteria) this;
        }

        public Criteria andCertnumBetween(String value1, String value2) {
            addCriterion("CEQ_CERTNUM between", value1, value2, "certnum");
            return (Criteria) this;
        }

        public Criteria andCertnumNotBetween(String value1, String value2) {
            addCriterion("CEQ_CERTNUM not between", value1, value2, "certnum");
            return (Criteria) this;
        }

        public Criteria andCerttermIsNull() {
            addCriterion("CEQ_CERTTERM is null");
            return (Criteria) this;
        }

        public Criteria andCerttermIsNotNull() {
            addCriterion("CEQ_CERTTERM is not null");
            return (Criteria) this;
        }

        public Criteria andCerttermEqualTo(String value) {
            addCriterion("CEQ_CERTTERM =", value, "certterm");
            return (Criteria) this;
        }

        public Criteria andCerttermNotEqualTo(String value) {
            addCriterion("CEQ_CERTTERM <>", value, "certterm");
            return (Criteria) this;
        }

        public Criteria andCerttermGreaterThan(String value) {
            addCriterion("CEQ_CERTTERM >", value, "certterm");
            return (Criteria) this;
        }

        public Criteria andCerttermGreaterThanOrEqualTo(String value) {
            addCriterion("CEQ_CERTTERM >=", value, "certterm");
            return (Criteria) this;
        }

        public Criteria andCerttermLessThan(String value) {
            addCriterion("CEQ_CERTTERM <", value, "certterm");
            return (Criteria) this;
        }

        public Criteria andCerttermLessThanOrEqualTo(String value) {
            addCriterion("CEQ_CERTTERM <=", value, "certterm");
            return (Criteria) this;
        }

        public Criteria andCerttermLike(String value) {
            addCriterion("CEQ_CERTTERM like", value, "certterm");
            return (Criteria) this;
        }

        public Criteria andCerttermNotLike(String value) {
            addCriterion("CEQ_CERTTERM not like", value, "certterm");
            return (Criteria) this;
        }

        public Criteria andCerttermIn(List<String> values) {
            addCriterion("CEQ_CERTTERM in", values, "certterm");
            return (Criteria) this;
        }

        public Criteria andCerttermNotIn(List<String> values) {
            addCriterion("CEQ_CERTTERM not in", values, "certterm");
            return (Criteria) this;
        }

        public Criteria andCerttermBetween(String value1, String value2) {
            addCriterion("CEQ_CERTTERM between", value1, value2, "certterm");
            return (Criteria) this;
        }

        public Criteria andCerttermNotBetween(String value1, String value2) {
            addCriterion("CEQ_CERTTERM not between", value1, value2, "certterm");
            return (Criteria) this;
        }

        public Criteria andEntemailIsNull() {
            addCriterion("CEQ_ENTEMAIL is null");
            return (Criteria) this;
        }

        public Criteria andEntemailIsNotNull() {
            addCriterion("CEQ_ENTEMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEntemailEqualTo(String value) {
            addCriterion("CEQ_ENTEMAIL =", value, "entemail");
            return (Criteria) this;
        }

        public Criteria andEntemailNotEqualTo(String value) {
            addCriterion("CEQ_ENTEMAIL <>", value, "entemail");
            return (Criteria) this;
        }

        public Criteria andEntemailGreaterThan(String value) {
            addCriterion("CEQ_ENTEMAIL >", value, "entemail");
            return (Criteria) this;
        }

        public Criteria andEntemailGreaterThanOrEqualTo(String value) {
            addCriterion("CEQ_ENTEMAIL >=", value, "entemail");
            return (Criteria) this;
        }

        public Criteria andEntemailLessThan(String value) {
            addCriterion("CEQ_ENTEMAIL <", value, "entemail");
            return (Criteria) this;
        }

        public Criteria andEntemailLessThanOrEqualTo(String value) {
            addCriterion("CEQ_ENTEMAIL <=", value, "entemail");
            return (Criteria) this;
        }

        public Criteria andEntemailLike(String value) {
            addCriterion("CEQ_ENTEMAIL like", value, "entemail");
            return (Criteria) this;
        }

        public Criteria andEntemailNotLike(String value) {
            addCriterion("CEQ_ENTEMAIL not like", value, "entemail");
            return (Criteria) this;
        }

        public Criteria andEntemailIn(List<String> values) {
            addCriterion("CEQ_ENTEMAIL in", values, "entemail");
            return (Criteria) this;
        }

        public Criteria andEntemailNotIn(List<String> values) {
            addCriterion("CEQ_ENTEMAIL not in", values, "entemail");
            return (Criteria) this;
        }

        public Criteria andEntemailBetween(String value1, String value2) {
            addCriterion("CEQ_ENTEMAIL between", value1, value2, "entemail");
            return (Criteria) this;
        }

        public Criteria andEntemailNotBetween(String value1, String value2) {
            addCriterion("CEQ_ENTEMAIL not between", value1, value2, "entemail");
            return (Criteria) this;
        }

        public Criteria andSetdateIsNull() {
            addCriterion("CEQ_SETDATE is null");
            return (Criteria) this;
        }

        public Criteria andSetdateIsNotNull() {
            addCriterion("CEQ_SETDATE is not null");
            return (Criteria) this;
        }

        public Criteria andSetdateEqualTo(String value) {
            addCriterion("CEQ_SETDATE =", value, "setdate");
            return (Criteria) this;
        }

        public Criteria andSetdateNotEqualTo(String value) {
            addCriterion("CEQ_SETDATE <>", value, "setdate");
            return (Criteria) this;
        }

        public Criteria andSetdateGreaterThan(String value) {
            addCriterion("CEQ_SETDATE >", value, "setdate");
            return (Criteria) this;
        }

        public Criteria andSetdateGreaterThanOrEqualTo(String value) {
            addCriterion("CEQ_SETDATE >=", value, "setdate");
            return (Criteria) this;
        }

        public Criteria andSetdateLessThan(String value) {
            addCriterion("CEQ_SETDATE <", value, "setdate");
            return (Criteria) this;
        }

        public Criteria andSetdateLessThanOrEqualTo(String value) {
            addCriterion("CEQ_SETDATE <=", value, "setdate");
            return (Criteria) this;
        }

        public Criteria andSetdateLike(String value) {
            addCriterion("CEQ_SETDATE like", value, "setdate");
            return (Criteria) this;
        }

        public Criteria andSetdateNotLike(String value) {
            addCriterion("CEQ_SETDATE not like", value, "setdate");
            return (Criteria) this;
        }

        public Criteria andSetdateIn(List<String> values) {
            addCriterion("CEQ_SETDATE in", values, "setdate");
            return (Criteria) this;
        }

        public Criteria andSetdateNotIn(List<String> values) {
            addCriterion("CEQ_SETDATE not in", values, "setdate");
            return (Criteria) this;
        }

        public Criteria andSetdateBetween(String value1, String value2) {
            addCriterion("CEQ_SETDATE between", value1, value2, "setdate");
            return (Criteria) this;
        }

        public Criteria andSetdateNotBetween(String value1, String value2) {
            addCriterion("CEQ_SETDATE not between", value1, value2, "setdate");
            return (Criteria) this;
        }

        public Criteria andCrettimeIsNull() {
            addCriterion("CEQ_CRETTIME is null");
            return (Criteria) this;
        }

        public Criteria andCrettimeIsNotNull() {
            addCriterion("CEQ_CRETTIME is not null");
            return (Criteria) this;
        }

        public Criteria andCrettimeEqualTo(String value) {
            addCriterion("CEQ_CRETTIME =", value, "crettime");
            return (Criteria) this;
        }

        public Criteria andCrettimeNotEqualTo(String value) {
            addCriterion("CEQ_CRETTIME <>", value, "crettime");
            return (Criteria) this;
        }

        public Criteria andCrettimeGreaterThan(String value) {
            addCriterion("CEQ_CRETTIME >", value, "crettime");
            return (Criteria) this;
        }

        public Criteria andCrettimeGreaterThanOrEqualTo(String value) {
            addCriterion("CEQ_CRETTIME >=", value, "crettime");
            return (Criteria) this;
        }

        public Criteria andCrettimeLessThan(String value) {
            addCriterion("CEQ_CRETTIME <", value, "crettime");
            return (Criteria) this;
        }

        public Criteria andCrettimeLessThanOrEqualTo(String value) {
            addCriterion("CEQ_CRETTIME <=", value, "crettime");
            return (Criteria) this;
        }

        public Criteria andCrettimeLike(String value) {
            addCriterion("CEQ_CRETTIME like", value, "crettime");
            return (Criteria) this;
        }

        public Criteria andCrettimeNotLike(String value) {
            addCriterion("CEQ_CRETTIME not like", value, "crettime");
            return (Criteria) this;
        }

        public Criteria andCrettimeIn(List<String> values) {
            addCriterion("CEQ_CRETTIME in", values, "crettime");
            return (Criteria) this;
        }

        public Criteria andCrettimeNotIn(List<String> values) {
            addCriterion("CEQ_CRETTIME not in", values, "crettime");
            return (Criteria) this;
        }

        public Criteria andCrettimeBetween(String value1, String value2) {
            addCriterion("CEQ_CRETTIME between", value1, value2, "crettime");
            return (Criteria) this;
        }

        public Criteria andCrettimeNotBetween(String value1, String value2) {
            addCriterion("CEQ_CRETTIME not between", value1, value2, "crettime");
            return (Criteria) this;
        }

        public Criteria andPostalcodeIsNull() {
            addCriterion("CEQ_POSTALCODE is null");
            return (Criteria) this;
        }

        public Criteria andPostalcodeIsNotNull() {
            addCriterion("CEQ_POSTALCODE is not null");
            return (Criteria) this;
        }

        public Criteria andPostalcodeEqualTo(String value) {
            addCriterion("CEQ_POSTALCODE =", value, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeNotEqualTo(String value) {
            addCriterion("CEQ_POSTALCODE <>", value, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeGreaterThan(String value) {
            addCriterion("CEQ_POSTALCODE >", value, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeGreaterThanOrEqualTo(String value) {
            addCriterion("CEQ_POSTALCODE >=", value, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeLessThan(String value) {
            addCriterion("CEQ_POSTALCODE <", value, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeLessThanOrEqualTo(String value) {
            addCriterion("CEQ_POSTALCODE <=", value, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeLike(String value) {
            addCriterion("CEQ_POSTALCODE like", value, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeNotLike(String value) {
            addCriterion("CEQ_POSTALCODE not like", value, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeIn(List<String> values) {
            addCriterion("CEQ_POSTALCODE in", values, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeNotIn(List<String> values) {
            addCriterion("CEQ_POSTALCODE not in", values, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeBetween(String value1, String value2) {
            addCriterion("CEQ_POSTALCODE between", value1, value2, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeNotBetween(String value1, String value2) {
            addCriterion("CEQ_POSTALCODE not between", value1, value2, "postalcode");
            return (Criteria) this;
        }

        public Criteria andTelphoneIsNull() {
            addCriterion("CEQ_TELPHONE is null");
            return (Criteria) this;
        }

        public Criteria andTelphoneIsNotNull() {
            addCriterion("CEQ_TELPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andTelphoneEqualTo(String value) {
            addCriterion("CEQ_TELPHONE =", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneNotEqualTo(String value) {
            addCriterion("CEQ_TELPHONE <>", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneGreaterThan(String value) {
            addCriterion("CEQ_TELPHONE >", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneGreaterThanOrEqualTo(String value) {
            addCriterion("CEQ_TELPHONE >=", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneLessThan(String value) {
            addCriterion("CEQ_TELPHONE <", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneLessThanOrEqualTo(String value) {
            addCriterion("CEQ_TELPHONE <=", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneLike(String value) {
            addCriterion("CEQ_TELPHONE like", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneNotLike(String value) {
            addCriterion("CEQ_TELPHONE not like", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneIn(List<String> values) {
            addCriterion("CEQ_TELPHONE in", values, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneNotIn(List<String> values) {
            addCriterion("CEQ_TELPHONE not in", values, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneBetween(String value1, String value2) {
            addCriterion("CEQ_TELPHONE between", value1, value2, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneNotBetween(String value1, String value2) {
            addCriterion("CEQ_TELPHONE not between", value1, value2, "telphone");
            return (Criteria) this;
        }

        public Criteria andWorkesnumIsNull() {
            addCriterion("CEQ_WORKESNUM is null");
            return (Criteria) this;
        }

        public Criteria andWorkesnumIsNotNull() {
            addCriterion("CEQ_WORKESNUM is not null");
            return (Criteria) this;
        }

        public Criteria andWorkesnumEqualTo(String value) {
            addCriterion("CEQ_WORKESNUM =", value, "workesnum");
            return (Criteria) this;
        }

        public Criteria andWorkesnumNotEqualTo(String value) {
            addCriterion("CEQ_WORKESNUM <>", value, "workesnum");
            return (Criteria) this;
        }

        public Criteria andWorkesnumGreaterThan(String value) {
            addCriterion("CEQ_WORKESNUM >", value, "workesnum");
            return (Criteria) this;
        }

        public Criteria andWorkesnumGreaterThanOrEqualTo(String value) {
            addCriterion("CEQ_WORKESNUM >=", value, "workesnum");
            return (Criteria) this;
        }

        public Criteria andWorkesnumLessThan(String value) {
            addCriterion("CEQ_WORKESNUM <", value, "workesnum");
            return (Criteria) this;
        }

        public Criteria andWorkesnumLessThanOrEqualTo(String value) {
            addCriterion("CEQ_WORKESNUM <=", value, "workesnum");
            return (Criteria) this;
        }

        public Criteria andWorkesnumLike(String value) {
            addCriterion("CEQ_WORKESNUM like", value, "workesnum");
            return (Criteria) this;
        }

        public Criteria andWorkesnumNotLike(String value) {
            addCriterion("CEQ_WORKESNUM not like", value, "workesnum");
            return (Criteria) this;
        }

        public Criteria andWorkesnumIn(List<String> values) {
            addCriterion("CEQ_WORKESNUM in", values, "workesnum");
            return (Criteria) this;
        }

        public Criteria andWorkesnumNotIn(List<String> values) {
            addCriterion("CEQ_WORKESNUM not in", values, "workesnum");
            return (Criteria) this;
        }

        public Criteria andWorkesnumBetween(String value1, String value2) {
            addCriterion("CEQ_WORKESNUM between", value1, value2, "workesnum");
            return (Criteria) this;
        }

        public Criteria andWorkesnumNotBetween(String value1, String value2) {
            addCriterion("CEQ_WORKESNUM not between", value1, value2, "workesnum");
            return (Criteria) this;
        }

        public Criteria andCertwokernumIsNull() {
            addCriterion("CEQ_CERTWOKERNUM is null");
            return (Criteria) this;
        }

        public Criteria andCertwokernumIsNotNull() {
            addCriterion("CEQ_CERTWOKERNUM is not null");
            return (Criteria) this;
        }

        public Criteria andCertwokernumEqualTo(String value) {
            addCriterion("CEQ_CERTWOKERNUM =", value, "certwokernum");
            return (Criteria) this;
        }

        public Criteria andCertwokernumNotEqualTo(String value) {
            addCriterion("CEQ_CERTWOKERNUM <>", value, "certwokernum");
            return (Criteria) this;
        }

        public Criteria andCertwokernumGreaterThan(String value) {
            addCriterion("CEQ_CERTWOKERNUM >", value, "certwokernum");
            return (Criteria) this;
        }

        public Criteria andCertwokernumGreaterThanOrEqualTo(String value) {
            addCriterion("CEQ_CERTWOKERNUM >=", value, "certwokernum");
            return (Criteria) this;
        }

        public Criteria andCertwokernumLessThan(String value) {
            addCriterion("CEQ_CERTWOKERNUM <", value, "certwokernum");
            return (Criteria) this;
        }

        public Criteria andCertwokernumLessThanOrEqualTo(String value) {
            addCriterion("CEQ_CERTWOKERNUM <=", value, "certwokernum");
            return (Criteria) this;
        }

        public Criteria andCertwokernumLike(String value) {
            addCriterion("CEQ_CERTWOKERNUM like", value, "certwokernum");
            return (Criteria) this;
        }

        public Criteria andCertwokernumNotLike(String value) {
            addCriterion("CEQ_CERTWOKERNUM not like", value, "certwokernum");
            return (Criteria) this;
        }

        public Criteria andCertwokernumIn(List<String> values) {
            addCriterion("CEQ_CERTWOKERNUM in", values, "certwokernum");
            return (Criteria) this;
        }

        public Criteria andCertwokernumNotIn(List<String> values) {
            addCriterion("CEQ_CERTWOKERNUM not in", values, "certwokernum");
            return (Criteria) this;
        }

        public Criteria andCertwokernumBetween(String value1, String value2) {
            addCriterion("CEQ_CERTWOKERNUM between", value1, value2, "certwokernum");
            return (Criteria) this;
        }

        public Criteria andCertwokernumNotBetween(String value1, String value2) {
            addCriterion("CEQ_CERTWOKERNUM not between", value1, value2, "certwokernum");
            return (Criteria) this;
        }

        public Criteria andIdtIsNull() {
            addCriterion("CEQ_IDT is null");
            return (Criteria) this;
        }

        public Criteria andIdtIsNotNull() {
            addCriterion("CEQ_IDT is not null");
            return (Criteria) this;
        }

        public Criteria andIdtEqualTo(Object value) {
            addCriterion("CEQ_IDT =", value, "idt");
            return (Criteria) this;
        }

        public Criteria andIdtNotEqualTo(Object value) {
            addCriterion("CEQ_IDT <>", value, "idt");
            return (Criteria) this;
        }

        public Criteria andIdtGreaterThan(Object value) {
            addCriterion("CEQ_IDT >", value, "idt");
            return (Criteria) this;
        }

        public Criteria andIdtGreaterThanOrEqualTo(Object value) {
            addCriterion("CEQ_IDT >=", value, "idt");
            return (Criteria) this;
        }

        public Criteria andIdtLessThan(Object value) {
            addCriterion("CEQ_IDT <", value, "idt");
            return (Criteria) this;
        }

        public Criteria andIdtLessThanOrEqualTo(Object value) {
            addCriterion("CEQ_IDT <=", value, "idt");
            return (Criteria) this;
        }

        public Criteria andIdtIn(List<Object> values) {
            addCriterion("CEQ_IDT in", values, "idt");
            return (Criteria) this;
        }

        public Criteria andIdtNotIn(List<Object> values) {
            addCriterion("CEQ_IDT not in", values, "idt");
            return (Criteria) this;
        }

        public Criteria andIdtBetween(Object value1, Object value2) {
            addCriterion("CEQ_IDT between", value1, value2, "idt");
            return (Criteria) this;
        }

        public Criteria andIdtNotBetween(Object value1, Object value2) {
            addCriterion("CEQ_IDT not between", value1, value2, "idt");
            return (Criteria) this;
        }

        public Criteria andRepairtypeIsNull() {
            addCriterion("CEQ_REPAIRTYPE is null");
            return (Criteria) this;
        }

        public Criteria andRepairtypeIsNotNull() {
            addCriterion("CEQ_REPAIRTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andRepairtypeEqualTo(String value) {
            addCriterion("CEQ_REPAIRTYPE =", value, "repairtype");
            return (Criteria) this;
        }

        public Criteria andRepairtypeNotEqualTo(String value) {
            addCriterion("CEQ_REPAIRTYPE <>", value, "repairtype");
            return (Criteria) this;
        }

        public Criteria andRepairtypeGreaterThan(String value) {
            addCriterion("CEQ_REPAIRTYPE >", value, "repairtype");
            return (Criteria) this;
        }

        public Criteria andRepairtypeGreaterThanOrEqualTo(String value) {
            addCriterion("CEQ_REPAIRTYPE >=", value, "repairtype");
            return (Criteria) this;
        }

        public Criteria andRepairtypeLessThan(String value) {
            addCriterion("CEQ_REPAIRTYPE <", value, "repairtype");
            return (Criteria) this;
        }

        public Criteria andRepairtypeLessThanOrEqualTo(String value) {
            addCriterion("CEQ_REPAIRTYPE <=", value, "repairtype");
            return (Criteria) this;
        }

        public Criteria andRepairtypeLike(String value) {
            addCriterion("CEQ_REPAIRTYPE like", value, "repairtype");
            return (Criteria) this;
        }

        public Criteria andRepairtypeNotLike(String value) {
            addCriterion("CEQ_REPAIRTYPE not like", value, "repairtype");
            return (Criteria) this;
        }

        public Criteria andRepairtypeIn(List<String> values) {
            addCriterion("CEQ_REPAIRTYPE in", values, "repairtype");
            return (Criteria) this;
        }

        public Criteria andRepairtypeNotIn(List<String> values) {
            addCriterion("CEQ_REPAIRTYPE not in", values, "repairtype");
            return (Criteria) this;
        }

        public Criteria andRepairtypeBetween(String value1, String value2) {
            addCriterion("CEQ_REPAIRTYPE between", value1, value2, "repairtype");
            return (Criteria) this;
        }

        public Criteria andRepairtypeNotBetween(String value1, String value2) {
            addCriterion("CEQ_REPAIRTYPE not between", value1, value2, "repairtype");
            return (Criteria) this;
        }

        public Criteria andIdLikeInsensitive(String value) {
            addCriterion("upper(CEQ_ID) like", value.toUpperCase(), "id");
            return (Criteria) this;
        }

        public Criteria andPidLikeInsensitive(String value) {
            addCriterion("upper(CEQ_PID) like", value.toUpperCase(), "pid");
            return (Criteria) this;
        }

        public Criteria andCertnumLikeInsensitive(String value) {
            addCriterion("upper(CEQ_CERTNUM) like", value.toUpperCase(), "certnum");
            return (Criteria) this;
        }

        public Criteria andCerttermLikeInsensitive(String value) {
            addCriterion("upper(CEQ_CERTTERM) like", value.toUpperCase(), "certterm");
            return (Criteria) this;
        }

        public Criteria andEntemailLikeInsensitive(String value) {
            addCriterion("upper(CEQ_ENTEMAIL) like", value.toUpperCase(), "entemail");
            return (Criteria) this;
        }

        public Criteria andSetdateLikeInsensitive(String value) {
            addCriterion("upper(CEQ_SETDATE) like", value.toUpperCase(), "setdate");
            return (Criteria) this;
        }

        public Criteria andCrettimeLikeInsensitive(String value) {
            addCriterion("upper(CEQ_CRETTIME) like", value.toUpperCase(), "crettime");
            return (Criteria) this;
        }

        public Criteria andPostalcodeLikeInsensitive(String value) {
            addCriterion("upper(CEQ_POSTALCODE) like", value.toUpperCase(), "postalcode");
            return (Criteria) this;
        }

        public Criteria andTelphoneLikeInsensitive(String value) {
            addCriterion("upper(CEQ_TELPHONE) like", value.toUpperCase(), "telphone");
            return (Criteria) this;
        }

        public Criteria andWorkesnumLikeInsensitive(String value) {
            addCriterion("upper(CEQ_WORKESNUM) like", value.toUpperCase(), "workesnum");
            return (Criteria) this;
        }

        public Criteria andCertwokernumLikeInsensitive(String value) {
            addCriterion("upper(CEQ_CERTWOKERNUM) like", value.toUpperCase(), "certwokernum");
            return (Criteria) this;
        }

        public Criteria andRepairtypeLikeInsensitive(String value) {
            addCriterion("upper(CEQ_REPAIRTYPE) like", value.toUpperCase(), "repairtype");
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