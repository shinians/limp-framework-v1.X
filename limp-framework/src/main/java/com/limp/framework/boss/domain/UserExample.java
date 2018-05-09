package com.limp.framework.boss.domain;

import com.limp.framework.core.bean.Pager;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Pager page;

    public UserExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("USR_GUID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("USR_GUID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("USR_GUID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("USR_GUID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("USR_GUID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("USR_GUID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("USR_GUID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("USR_GUID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("USR_GUID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("USR_GUID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("USR_GUID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("USR_GUID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("USR_GUID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("USR_GUID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUsrAccountIsNull() {
            addCriterion("USR_ACCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andUsrAccountIsNotNull() {
            addCriterion("USR_ACCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andUsrAccountEqualTo(String value) {
            addCriterion("USR_ACCOUNT =", value, "usrAccount");
            return (Criteria) this;
        }

        public Criteria andUsrAccountNotEqualTo(String value) {
            addCriterion("USR_ACCOUNT <>", value, "usrAccount");
            return (Criteria) this;
        }

        public Criteria andUsrAccountGreaterThan(String value) {
            addCriterion("USR_ACCOUNT >", value, "usrAccount");
            return (Criteria) this;
        }

        public Criteria andUsrAccountGreaterThanOrEqualTo(String value) {
            addCriterion("USR_ACCOUNT >=", value, "usrAccount");
            return (Criteria) this;
        }

        public Criteria andUsrAccountLessThan(String value) {
            addCriterion("USR_ACCOUNT <", value, "usrAccount");
            return (Criteria) this;
        }

        public Criteria andUsrAccountLessThanOrEqualTo(String value) {
            addCriterion("USR_ACCOUNT <=", value, "usrAccount");
            return (Criteria) this;
        }

        public Criteria andUsrAccountLike(String value) {
            addCriterion("USR_ACCOUNT like", value, "usrAccount");
            return (Criteria) this;
        }

        public Criteria andUsrAccountNotLike(String value) {
            addCriterion("USR_ACCOUNT not like", value, "usrAccount");
            return (Criteria) this;
        }

        public Criteria andUsrAccountIn(List<String> values) {
            addCriterion("USR_ACCOUNT in", values, "usrAccount");
            return (Criteria) this;
        }

        public Criteria andUsrAccountNotIn(List<String> values) {
            addCriterion("USR_ACCOUNT not in", values, "usrAccount");
            return (Criteria) this;
        }

        public Criteria andUsrAccountBetween(String value1, String value2) {
            addCriterion("USR_ACCOUNT between", value1, value2, "usrAccount");
            return (Criteria) this;
        }

        public Criteria andUsrAccountNotBetween(String value1, String value2) {
            addCriterion("USR_ACCOUNT not between", value1, value2, "usrAccount");
            return (Criteria) this;
        }

        public Criteria andUsrNameIsNull() {
            addCriterion("USR_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUsrNameIsNotNull() {
            addCriterion("USR_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUsrNameEqualTo(String value) {
            addCriterion("USR_NAME =", value, "usrName");
            return (Criteria) this;
        }

        public Criteria andUsrNameNotEqualTo(String value) {
            addCriterion("USR_NAME <>", value, "usrName");
            return (Criteria) this;
        }

        public Criteria andUsrNameGreaterThan(String value) {
            addCriterion("USR_NAME >", value, "usrName");
            return (Criteria) this;
        }

        public Criteria andUsrNameGreaterThanOrEqualTo(String value) {
            addCriterion("USR_NAME >=", value, "usrName");
            return (Criteria) this;
        }

        public Criteria andUsrNameLessThan(String value) {
            addCriterion("USR_NAME <", value, "usrName");
            return (Criteria) this;
        }

        public Criteria andUsrNameLessThanOrEqualTo(String value) {
            addCriterion("USR_NAME <=", value, "usrName");
            return (Criteria) this;
        }

        public Criteria andUsrNameLike(String value) {
            addCriterion("USR_NAME like", value, "usrName");
            return (Criteria) this;
        }

        public Criteria andUsrNameNotLike(String value) {
            addCriterion("USR_NAME not like", value, "usrName");
            return (Criteria) this;
        }

        public Criteria andUsrNameIn(List<String> values) {
            addCriterion("USR_NAME in", values, "usrName");
            return (Criteria) this;
        }

        public Criteria andUsrNameNotIn(List<String> values) {
            addCriterion("USR_NAME not in", values, "usrName");
            return (Criteria) this;
        }

        public Criteria andUsrNameBetween(String value1, String value2) {
            addCriterion("USR_NAME between", value1, value2, "usrName");
            return (Criteria) this;
        }

        public Criteria andUsrNameNotBetween(String value1, String value2) {
            addCriterion("USR_NAME not between", value1, value2, "usrName");
            return (Criteria) this;
        }

        public Criteria andUsrRemarksIsNull() {
            addCriterion("USR_REMARKS is null");
            return (Criteria) this;
        }

        public Criteria andUsrRemarksIsNotNull() {
            addCriterion("USR_REMARKS is not null");
            return (Criteria) this;
        }

        public Criteria andUsrRemarksEqualTo(String value) {
            addCriterion("USR_REMARKS =", value, "usrRemarks");
            return (Criteria) this;
        }

        public Criteria andUsrRemarksNotEqualTo(String value) {
            addCriterion("USR_REMARKS <>", value, "usrRemarks");
            return (Criteria) this;
        }

        public Criteria andUsrRemarksGreaterThan(String value) {
            addCriterion("USR_REMARKS >", value, "usrRemarks");
            return (Criteria) this;
        }

        public Criteria andUsrRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("USR_REMARKS >=", value, "usrRemarks");
            return (Criteria) this;
        }

        public Criteria andUsrRemarksLessThan(String value) {
            addCriterion("USR_REMARKS <", value, "usrRemarks");
            return (Criteria) this;
        }

        public Criteria andUsrRemarksLessThanOrEqualTo(String value) {
            addCriterion("USR_REMARKS <=", value, "usrRemarks");
            return (Criteria) this;
        }

        public Criteria andUsrRemarksLike(String value) {
            addCriterion("USR_REMARKS like", value, "usrRemarks");
            return (Criteria) this;
        }

        public Criteria andUsrRemarksNotLike(String value) {
            addCriterion("USR_REMARKS not like", value, "usrRemarks");
            return (Criteria) this;
        }

        public Criteria andUsrRemarksIn(List<String> values) {
            addCriterion("USR_REMARKS in", values, "usrRemarks");
            return (Criteria) this;
        }

        public Criteria andUsrRemarksNotIn(List<String> values) {
            addCriterion("USR_REMARKS not in", values, "usrRemarks");
            return (Criteria) this;
        }

        public Criteria andUsrRemarksBetween(String value1, String value2) {
            addCriterion("USR_REMARKS between", value1, value2, "usrRemarks");
            return (Criteria) this;
        }

        public Criteria andUsrRemarksNotBetween(String value1, String value2) {
            addCriterion("USR_REMARKS not between", value1, value2, "usrRemarks");
            return (Criteria) this;
        }

        public Criteria andUsrPasswordIsNull() {
            addCriterion("USR_PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andUsrPasswordIsNotNull() {
            addCriterion("USR_PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andUsrPasswordEqualTo(String value) {
            addCriterion("USR_PASSWORD =", value, "usrPassword");
            return (Criteria) this;
        }

        public Criteria andUsrPasswordNotEqualTo(String value) {
            addCriterion("USR_PASSWORD <>", value, "usrPassword");
            return (Criteria) this;
        }

        public Criteria andUsrPasswordGreaterThan(String value) {
            addCriterion("USR_PASSWORD >", value, "usrPassword");
            return (Criteria) this;
        }

        public Criteria andUsrPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("USR_PASSWORD >=", value, "usrPassword");
            return (Criteria) this;
        }

        public Criteria andUsrPasswordLessThan(String value) {
            addCriterion("USR_PASSWORD <", value, "usrPassword");
            return (Criteria) this;
        }

        public Criteria andUsrPasswordLessThanOrEqualTo(String value) {
            addCriterion("USR_PASSWORD <=", value, "usrPassword");
            return (Criteria) this;
        }

        public Criteria andUsrPasswordLike(String value) {
            addCriterion("USR_PASSWORD like", value, "usrPassword");
            return (Criteria) this;
        }

        public Criteria andUsrPasswordNotLike(String value) {
            addCriterion("USR_PASSWORD not like", value, "usrPassword");
            return (Criteria) this;
        }

        public Criteria andUsrPasswordIn(List<String> values) {
            addCriterion("USR_PASSWORD in", values, "usrPassword");
            return (Criteria) this;
        }

        public Criteria andUsrPasswordNotIn(List<String> values) {
            addCriterion("USR_PASSWORD not in", values, "usrPassword");
            return (Criteria) this;
        }

        public Criteria andUsrPasswordBetween(String value1, String value2) {
            addCriterion("USR_PASSWORD between", value1, value2, "usrPassword");
            return (Criteria) this;
        }

        public Criteria andUsrPasswordNotBetween(String value1, String value2) {
            addCriterion("USR_PASSWORD not between", value1, value2, "usrPassword");
            return (Criteria) this;
        }

        public Criteria andUsrIpIsNull() {
            addCriterion("USR_IP is null");
            return (Criteria) this;
        }

        public Criteria andUsrIpIsNotNull() {
            addCriterion("USR_IP is not null");
            return (Criteria) this;
        }

        public Criteria andUsrIpEqualTo(String value) {
            addCriterion("USR_IP =", value, "usrIp");
            return (Criteria) this;
        }
        public Criteria orUsrEmailEqualTo(String value) {
            addCriterion("1=1 OR USR_EMAIL =", value, "USR_EMAIL");
            return (Criteria) this;
        }

        public Criteria andUsrIpNotEqualTo(String value) {
            addCriterion("USR_IP <>", value, "usrIp");
            return (Criteria) this;
        }

        public Criteria andUsrIpGreaterThan(String value) {
            addCriterion("USR_IP >", value, "usrIp");
            return (Criteria) this;
        }

        public Criteria andUsrIpGreaterThanOrEqualTo(String value) {
            addCriterion("USR_IP >=", value, "usrIp");
            return (Criteria) this;
        }

        public Criteria andUsrIpLessThan(String value) {
            addCriterion("USR_IP <", value, "usrIp");
            return (Criteria) this;
        }

        public Criteria andUsrIpLessThanOrEqualTo(String value) {
            addCriterion("USR_IP <=", value, "usrIp");
            return (Criteria) this;
        }

        public Criteria andUsrIpLike(String value) {
            addCriterion("USR_IP like", value, "usrIp");
            return (Criteria) this;
        }

        public Criteria andUsrIpNotLike(String value) {
            addCriterion("USR_IP not like", value, "usrIp");
            return (Criteria) this;
        }

        public Criteria andUsrIpIn(List<String> values) {
            addCriterion("USR_IP in", values, "usrIp");
            return (Criteria) this;
        }

        public Criteria andUsrIpNotIn(List<String> values) {
            addCriterion("USR_IP not in", values, "usrIp");
            return (Criteria) this;
        }

        public Criteria andUsrIpBetween(String value1, String value2) {
            addCriterion("USR_IP between", value1, value2, "usrIp");
            return (Criteria) this;
        }

        public Criteria andUsrIpNotBetween(String value1, String value2) {
            addCriterion("USR_IP not between", value1, value2, "usrIp");
            return (Criteria) this;
        }

        public Criteria andUsrMacIsNull() {
            addCriterion("USR_MAC is null");
            return (Criteria) this;
        }

        public Criteria andUsrMacIsNotNull() {
            addCriterion("USR_MAC is not null");
            return (Criteria) this;
        }

        public Criteria andUsrMacEqualTo(String value) {
            addCriterion("USR_MAC =", value, "usrMac");
            return (Criteria) this;
        }

        public Criteria andUsrMacNotEqualTo(String value) {
            addCriterion("USR_MAC <>", value, "usrMac");
            return (Criteria) this;
        }

        public Criteria andUsrMacGreaterThan(String value) {
            addCriterion("USR_MAC >", value, "usrMac");
            return (Criteria) this;
        }

        public Criteria andUsrMacGreaterThanOrEqualTo(String value) {
            addCriterion("USR_MAC >=", value, "usrMac");
            return (Criteria) this;
        }

        public Criteria andUsrMacLessThan(String value) {
            addCriterion("USR_MAC <", value, "usrMac");
            return (Criteria) this;
        }

        public Criteria andUsrMacLessThanOrEqualTo(String value) {
            addCriterion("USR_MAC <=", value, "usrMac");
            return (Criteria) this;
        }

        public Criteria andUsrMacLike(String value) {
            addCriterion("USR_MAC like", value, "usrMac");
            return (Criteria) this;
        }

        public Criteria andUsrMacNotLike(String value) {
            addCriterion("USR_MAC not like", value, "usrMac");
            return (Criteria) this;
        }

        public Criteria andUsrMacIn(List<String> values) {
            addCriterion("USR_MAC in", values, "usrMac");
            return (Criteria) this;
        }

        public Criteria andUsrMacNotIn(List<String> values) {
            addCriterion("USR_MAC not in", values, "usrMac");
            return (Criteria) this;
        }

        public Criteria andUsrMacBetween(String value1, String value2) {
            addCriterion("USR_MAC between", value1, value2, "usrMac");
            return (Criteria) this;
        }

        public Criteria andUsrMacNotBetween(String value1, String value2) {
            addCriterion("USR_MAC not between", value1, value2, "usrMac");
            return (Criteria) this;
        }

        public Criteria andUsrIsautoexpireIsNull() {
            addCriterion("USR_ISAUTOEXPIRE is null");
            return (Criteria) this;
        }

        public Criteria andUsrIsautoexpireIsNotNull() {
            addCriterion("USR_ISAUTOEXPIRE is not null");
            return (Criteria) this;
        }

        public Criteria andUsrIsautoexpireEqualTo(Integer value) {
            addCriterion("USR_ISAUTOEXPIRE =", value, "usrIsautoexpire");
            return (Criteria) this;
        }

        public Criteria andUsrIsautoexpireNotEqualTo(Integer value) {
            addCriterion("USR_ISAUTOEXPIRE <>", value, "usrIsautoexpire");
            return (Criteria) this;
        }

        public Criteria andUsrIsautoexpireGreaterThan(Integer value) {
            addCriterion("USR_ISAUTOEXPIRE >", value, "usrIsautoexpire");
            return (Criteria) this;
        }

        public Criteria andUsrIsautoexpireGreaterThanOrEqualTo(Integer value) {
            addCriterion("USR_ISAUTOEXPIRE >=", value, "usrIsautoexpire");
            return (Criteria) this;
        }

        public Criteria andUsrIsautoexpireLessThan(Integer value) {
            addCriterion("USR_ISAUTOEXPIRE <", value, "usrIsautoexpire");
            return (Criteria) this;
        }

        public Criteria andUsrIsautoexpireLessThanOrEqualTo(Integer value) {
            addCriterion("USR_ISAUTOEXPIRE <=", value, "usrIsautoexpire");
            return (Criteria) this;
        }

        public Criteria andUsrIsautoexpireIn(List<Integer> values) {
            addCriterion("USR_ISAUTOEXPIRE in", values, "usrIsautoexpire");
            return (Criteria) this;
        }

        public Criteria andUsrIsautoexpireNotIn(List<Integer> values) {
            addCriterion("USR_ISAUTOEXPIRE not in", values, "usrIsautoexpire");
            return (Criteria) this;
        }

        public Criteria andUsrIsautoexpireBetween(Integer value1, Integer value2) {
            addCriterion("USR_ISAUTOEXPIRE between", value1, value2, "usrIsautoexpire");
            return (Criteria) this;
        }

        public Criteria andUsrIsautoexpireNotBetween(Integer value1, Integer value2) {
            addCriterion("USR_ISAUTOEXPIRE not between", value1, value2, "usrIsautoexpire");
            return (Criteria) this;
        }

        public Criteria andUsrIsbindipIsNull() {
            addCriterion("USR_ISBINDIP is null");
            return (Criteria) this;
        }

        public Criteria andUsrIsbindipIsNotNull() {
            addCriterion("USR_ISBINDIP is not null");
            return (Criteria) this;
        }

        public Criteria andUsrIsbindipEqualTo(Integer value) {
            addCriterion("USR_ISBINDIP =", value, "usrIsbindip");
            return (Criteria) this;
        }

        public Criteria andUsrIsbindipNotEqualTo(Integer value) {
            addCriterion("USR_ISBINDIP <>", value, "usrIsbindip");
            return (Criteria) this;
        }

        public Criteria andUsrIsbindipGreaterThan(Integer value) {
            addCriterion("USR_ISBINDIP >", value, "usrIsbindip");
            return (Criteria) this;
        }

        public Criteria andUsrIsbindipGreaterThanOrEqualTo(Integer value) {
            addCriterion("USR_ISBINDIP >=", value, "usrIsbindip");
            return (Criteria) this;
        }

        public Criteria andUsrIsbindipLessThan(Integer value) {
            addCriterion("USR_ISBINDIP <", value, "usrIsbindip");
            return (Criteria) this;
        }

        public Criteria andUsrIsbindipLessThanOrEqualTo(Integer value) {
            addCriterion("USR_ISBINDIP <=", value, "usrIsbindip");
            return (Criteria) this;
        }

        public Criteria andUsrIsbindipIn(List<Integer> values) {
            addCriterion("USR_ISBINDIP in", values, "usrIsbindip");
            return (Criteria) this;
        }

        public Criteria andUsrIsbindipNotIn(List<Integer> values) {
            addCriterion("USR_ISBINDIP not in", values, "usrIsbindip");
            return (Criteria) this;
        }

        public Criteria andUsrIsbindipBetween(Integer value1, Integer value2) {
            addCriterion("USR_ISBINDIP between", value1, value2, "usrIsbindip");
            return (Criteria) this;
        }

        public Criteria andUsrIsbindipNotBetween(Integer value1, Integer value2) {
            addCriterion("USR_ISBINDIP not between", value1, value2, "usrIsbindip");
            return (Criteria) this;
        }

        public Criteria andUsrIsbindmacIsNull() {
            addCriterion("USR_ISBINDMAC is null");
            return (Criteria) this;
        }

        public Criteria andUsrIsbindmacIsNotNull() {
            addCriterion("USR_ISBINDMAC is not null");
            return (Criteria) this;
        }

        public Criteria andUsrIsbindmacEqualTo(Integer value) {
            addCriterion("USR_ISBINDMAC =", value, "usrIsbindmac");
            return (Criteria) this;
        }

        public Criteria andUsrIsbindmacNotEqualTo(Integer value) {
            addCriterion("USR_ISBINDMAC <>", value, "usrIsbindmac");
            return (Criteria) this;
        }

        public Criteria andUsrIsbindmacGreaterThan(Integer value) {
            addCriterion("USR_ISBINDMAC >", value, "usrIsbindmac");
            return (Criteria) this;
        }

        public Criteria andUsrIsbindmacGreaterThanOrEqualTo(Integer value) {
            addCriterion("USR_ISBINDMAC >=", value, "usrIsbindmac");
            return (Criteria) this;
        }

        public Criteria andUsrIsbindmacLessThan(Integer value) {
            addCriterion("USR_ISBINDMAC <", value, "usrIsbindmac");
            return (Criteria) this;
        }

        public Criteria andUsrIsbindmacLessThanOrEqualTo(Integer value) {
            addCriterion("USR_ISBINDMAC <=", value, "usrIsbindmac");
            return (Criteria) this;
        }

        public Criteria andUsrIsbindmacIn(List<Integer> values) {
            addCriterion("USR_ISBINDMAC in", values, "usrIsbindmac");
            return (Criteria) this;
        }

        public Criteria andUsrIsbindmacNotIn(List<Integer> values) {
            addCriterion("USR_ISBINDMAC not in", values, "usrIsbindmac");
            return (Criteria) this;
        }

        public Criteria andUsrIsbindmacBetween(Integer value1, Integer value2) {
            addCriterion("USR_ISBINDMAC between", value1, value2, "usrIsbindmac");
            return (Criteria) this;
        }

        public Criteria andUsrIsbindmacNotBetween(Integer value1, Integer value2) {
            addCriterion("USR_ISBINDMAC not between", value1, value2, "usrIsbindmac");
            return (Criteria) this;
        }

        public Criteria andUsrLasttimeIsNull() {
            addCriterion("USR_LASTTIME is null");
            return (Criteria) this;
        }

        public Criteria andUsrLasttimeIsNotNull() {
            addCriterion("USR_LASTTIME is not null");
            return (Criteria) this;
        }

        public Criteria andUsrLasttimeEqualTo(Date value) {
            addCriterionForJDBCDate("USR_LASTTIME =", value, "usrLasttime");
            return (Criteria) this;
        }

        public Criteria andUsrLasttimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("USR_LASTTIME <>", value, "usrLasttime");
            return (Criteria) this;
        }

        public Criteria andUsrLasttimeGreaterThan(Date value) {
            addCriterionForJDBCDate("USR_LASTTIME >", value, "usrLasttime");
            return (Criteria) this;
        }

        public Criteria andUsrLasttimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("USR_LASTTIME >=", value, "usrLasttime");
            return (Criteria) this;
        }

        public Criteria andUsrLasttimeLessThan(Date value) {
            addCriterionForJDBCDate("USR_LASTTIME <", value, "usrLasttime");
            return (Criteria) this;
        }

        public Criteria andUsrLasttimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("USR_LASTTIME <=", value, "usrLasttime");
            return (Criteria) this;
        }

        public Criteria andUsrLasttimeIn(List<Date> values) {
            addCriterionForJDBCDate("USR_LASTTIME in", values, "usrLasttime");
            return (Criteria) this;
        }

        public Criteria andUsrLasttimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("USR_LASTTIME not in", values, "usrLasttime");
            return (Criteria) this;
        }

        public Criteria andUsrLasttimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("USR_LASTTIME between", value1, value2, "usrLasttime");
            return (Criteria) this;
        }

        public Criteria andUsrLasttimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("USR_LASTTIME not between", value1, value2, "usrLasttime");
            return (Criteria) this;
        }

        public Criteria andUsrLastipIsNull() {
            addCriterion("USR_LASTIP is null");
            return (Criteria) this;
        }

        public Criteria andUsrLastipIsNotNull() {
            addCriterion("USR_LASTIP is not null");
            return (Criteria) this;
        }

        public Criteria andUsrLastipEqualTo(String value) {
            addCriterion("USR_LASTIP =", value, "usrLastip");
            return (Criteria) this;
        }

        public Criteria andUsrLastipNotEqualTo(String value) {
            addCriterion("USR_LASTIP <>", value, "usrLastip");
            return (Criteria) this;
        }

        public Criteria andUsrLastipGreaterThan(String value) {
            addCriterion("USR_LASTIP >", value, "usrLastip");
            return (Criteria) this;
        }

        public Criteria andUsrLastipGreaterThanOrEqualTo(String value) {
            addCriterion("USR_LASTIP >=", value, "usrLastip");
            return (Criteria) this;
        }

        public Criteria andUsrLastipLessThan(String value) {
            addCriterion("USR_LASTIP <", value, "usrLastip");
            return (Criteria) this;
        }

        public Criteria andUsrLastipLessThanOrEqualTo(String value) {
            addCriterion("USR_LASTIP <=", value, "usrLastip");
            return (Criteria) this;
        }

        public Criteria andUsrLastipLike(String value) {
            addCriterion("USR_LASTIP like", value, "usrLastip");
            return (Criteria) this;
        }

        public Criteria andUsrLastipNotLike(String value) {
            addCriterion("USR_LASTIP not like", value, "usrLastip");
            return (Criteria) this;
        }

        public Criteria andUsrLastipIn(List<String> values) {
            addCriterion("USR_LASTIP in", values, "usrLastip");
            return (Criteria) this;
        }

        public Criteria andUsrLastipNotIn(List<String> values) {
            addCriterion("USR_LASTIP not in", values, "usrLastip");
            return (Criteria) this;
        }

        public Criteria andUsrLastipBetween(String value1, String value2) {
            addCriterion("USR_LASTIP between", value1, value2, "usrLastip");
            return (Criteria) this;
        }

        public Criteria andUsrLastipNotBetween(String value1, String value2) {
            addCriterion("USR_LASTIP not between", value1, value2, "usrLastip");
            return (Criteria) this;
        }

        public Criteria andUsrLastmacIsNull() {
            addCriterion("USR_LASTMAC is null");
            return (Criteria) this;
        }

        public Criteria andUsrLastmacIsNotNull() {
            addCriterion("USR_LASTMAC is not null");
            return (Criteria) this;
        }

        public Criteria andUsrLastmacEqualTo(String value) {
            addCriterion("USR_LASTMAC =", value, "usrLastmac");
            return (Criteria) this;
        }

        public Criteria andUsrLastmacNotEqualTo(String value) {
            addCriterion("USR_LASTMAC <>", value, "usrLastmac");
            return (Criteria) this;
        }

        public Criteria andUsrLastmacGreaterThan(String value) {
            addCriterion("USR_LASTMAC >", value, "usrLastmac");
            return (Criteria) this;
        }

        public Criteria andUsrLastmacGreaterThanOrEqualTo(String value) {
            addCriterion("USR_LASTMAC >=", value, "usrLastmac");
            return (Criteria) this;
        }

        public Criteria andUsrLastmacLessThan(String value) {
            addCriterion("USR_LASTMAC <", value, "usrLastmac");
            return (Criteria) this;
        }

        public Criteria andUsrLastmacLessThanOrEqualTo(String value) {
            addCriterion("USR_LASTMAC <=", value, "usrLastmac");
            return (Criteria) this;
        }

        public Criteria andUsrLastmacLike(String value) {
            addCriterion("USR_LASTMAC like", value, "usrLastmac");
            return (Criteria) this;
        }

        public Criteria andUsrLastmacNotLike(String value) {
            addCriterion("USR_LASTMAC not like", value, "usrLastmac");
            return (Criteria) this;
        }

        public Criteria andUsrLastmacIn(List<String> values) {
            addCriterion("USR_LASTMAC in", values, "usrLastmac");
            return (Criteria) this;
        }

        public Criteria andUsrLastmacNotIn(List<String> values) {
            addCriterion("USR_LASTMAC not in", values, "usrLastmac");
            return (Criteria) this;
        }

        public Criteria andUsrLastmacBetween(String value1, String value2) {
            addCriterion("USR_LASTMAC between", value1, value2, "usrLastmac");
            return (Criteria) this;
        }

        public Criteria andUsrLastmacNotBetween(String value1, String value2) {
            addCriterion("USR_LASTMAC not between", value1, value2, "usrLastmac");
            return (Criteria) this;
        }

        public Criteria andUsrLogincountIsNull() {
            addCriterion("USR_LOGINCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andUsrLogincountIsNotNull() {
            addCriterion("USR_LOGINCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andUsrLogincountEqualTo(Integer value) {
            addCriterion("USR_LOGINCOUNT =", value, "usrLogincount");
            return (Criteria) this;
        }

        public Criteria andUsrLogincountNotEqualTo(Integer value) {
            addCriterion("USR_LOGINCOUNT <>", value, "usrLogincount");
            return (Criteria) this;
        }

        public Criteria andUsrLogincountGreaterThan(Integer value) {
            addCriterion("USR_LOGINCOUNT >", value, "usrLogincount");
            return (Criteria) this;
        }

        public Criteria andUsrLogincountGreaterThanOrEqualTo(Integer value) {
            addCriterion("USR_LOGINCOUNT >=", value, "usrLogincount");
            return (Criteria) this;
        }

        public Criteria andUsrLogincountLessThan(Integer value) {
            addCriterion("USR_LOGINCOUNT <", value, "usrLogincount");
            return (Criteria) this;
        }

        public Criteria andUsrLogincountLessThanOrEqualTo(Integer value) {
            addCriterion("USR_LOGINCOUNT <=", value, "usrLogincount");
            return (Criteria) this;
        }

        public Criteria andUsrLogincountIn(List<Integer> values) {
            addCriterion("USR_LOGINCOUNT in", values, "usrLogincount");
            return (Criteria) this;
        }

        public Criteria andUsrLogincountNotIn(List<Integer> values) {
            addCriterion("USR_LOGINCOUNT not in", values, "usrLogincount");
            return (Criteria) this;
        }

        public Criteria andUsrLogincountBetween(Integer value1, Integer value2) {
            addCriterion("USR_LOGINCOUNT between", value1, value2, "usrLogincount");
            return (Criteria) this;
        }

        public Criteria andUsrLogincountNotBetween(Integer value1, Integer value2) {
            addCriterion("USR_LOGINCOUNT not between", value1, value2, "usrLogincount");
            return (Criteria) this;
        }

        public Criteria andUsrCreatedateIsNull() {
            addCriterion("USR_CREATEDATE is null");
            return (Criteria) this;
        }

        public Criteria andUsrCreatedateIsNotNull() {
            addCriterion("USR_CREATEDATE is not null");
            return (Criteria) this;
        }

        public Criteria andUsrCreatedateEqualTo(Date value) {
            addCriterionForJDBCDate("USR_CREATEDATE =", value, "usrCreatedate");
            return (Criteria) this;
        }

        public Criteria andUsrCreatedateNotEqualTo(Date value) {
            addCriterionForJDBCDate("USR_CREATEDATE <>", value, "usrCreatedate");
            return (Criteria) this;
        }

        public Criteria andUsrCreatedateGreaterThan(Date value) {
            addCriterionForJDBCDate("USR_CREATEDATE >", value, "usrCreatedate");
            return (Criteria) this;
        }

        public Criteria andUsrCreatedateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("USR_CREATEDATE >=", value, "usrCreatedate");
            return (Criteria) this;
        }

        public Criteria andUsrCreatedateLessThan(Date value) {
            addCriterionForJDBCDate("USR_CREATEDATE <", value, "usrCreatedate");
            return (Criteria) this;
        }

        public Criteria andUsrCreatedateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("USR_CREATEDATE <=", value, "usrCreatedate");
            return (Criteria) this;
        }

        public Criteria andUsrCreatedateIn(List<Date> values) {
            addCriterionForJDBCDate("USR_CREATEDATE in", values, "usrCreatedate");
            return (Criteria) this;
        }

        public Criteria andUsrCreatedateNotIn(List<Date> values) {
            addCriterionForJDBCDate("USR_CREATEDATE not in", values, "usrCreatedate");
            return (Criteria) this;
        }

        public Criteria andUsrCreatedateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("USR_CREATEDATE between", value1, value2, "usrCreatedate");
            return (Criteria) this;
        }

        public Criteria andUsrCreatedateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("USR_CREATEDATE not between", value1, value2, "usrCreatedate");
            return (Criteria) this;
        }

        public Criteria andUsrUpdatetimeIsNull() {
            addCriterion("USR_UPDATETIME is null");
            return (Criteria) this;
        }

        public Criteria andUsrUpdatetimeIsNotNull() {
            addCriterion("USR_UPDATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andUsrUpdatetimeEqualTo(Date value) {
            addCriterionForJDBCDate("USR_UPDATETIME =", value, "usrUpdatetime");
            return (Criteria) this;
        }

        public Criteria andUsrUpdatetimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("USR_UPDATETIME <>", value, "usrUpdatetime");
            return (Criteria) this;
        }

        public Criteria andUsrUpdatetimeGreaterThan(Date value) {
            addCriterionForJDBCDate("USR_UPDATETIME >", value, "usrUpdatetime");
            return (Criteria) this;
        }

        public Criteria andUsrUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("USR_UPDATETIME >=", value, "usrUpdatetime");
            return (Criteria) this;
        }

        public Criteria andUsrUpdatetimeLessThan(Date value) {
            addCriterionForJDBCDate("USR_UPDATETIME <", value, "usrUpdatetime");
            return (Criteria) this;
        }

        public Criteria andUsrUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("USR_UPDATETIME <=", value, "usrUpdatetime");
            return (Criteria) this;
        }

        public Criteria andUsrUpdatetimeIn(List<Date> values) {
            addCriterionForJDBCDate("USR_UPDATETIME in", values, "usrUpdatetime");
            return (Criteria) this;
        }

        public Criteria andUsrUpdatetimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("USR_UPDATETIME not in", values, "usrUpdatetime");
            return (Criteria) this;
        }

        public Criteria andUsrUpdatetimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("USR_UPDATETIME between", value1, value2, "usrUpdatetime");
            return (Criteria) this;
        }

        public Criteria andUsrUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("USR_UPDATETIME not between", value1, value2, "usrUpdatetime");
            return (Criteria) this;
        }

        public Criteria andUsrStateIsNull() {
            addCriterion("USR_STATE is null");
            return (Criteria) this;
        }

        public Criteria andUsrStateIsNotNull() {
            addCriterion("USR_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andUsrStateEqualTo(Integer value) {
            addCriterion("USR_STATE =", value, "usrState");
            return (Criteria) this;
        }

        public Criteria andUsrStateNotEqualTo(Integer value) {
            addCriterion("USR_STATE <>", value, "usrState");
            return (Criteria) this;
        }

        public Criteria andUsrStateGreaterThan(Integer value) {
            addCriterion("USR_STATE >", value, "usrState");
            return (Criteria) this;
        }

        public Criteria andUsrStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("USR_STATE >=", value, "usrState");
            return (Criteria) this;
        }

        public Criteria andUsrStateLessThan(Integer value) {
            addCriterion("USR_STATE <", value, "usrState");
            return (Criteria) this;
        }

        public Criteria andUsrStateLessThanOrEqualTo(Integer value) {
            addCriterion("USR_STATE <=", value, "usrState");
            return (Criteria) this;
        }

        public Criteria andUsrStateIn(List<Integer> values) {
            addCriterion("USR_STATE in", values, "usrState");
            return (Criteria) this;
        }

        public Criteria andUsrStateNotIn(List<Integer> values) {
            addCriterion("USR_STATE not in", values, "usrState");
            return (Criteria) this;
        }

        public Criteria andUsrStateBetween(Integer value1, Integer value2) {
            addCriterion("USR_STATE between", value1, value2, "usrState");
            return (Criteria) this;
        }

        public Criteria andUsrStateNotBetween(Integer value1, Integer value2) {
            addCriterion("USR_STATE not between", value1, value2, "usrState");
            return (Criteria) this;
        }

        public Criteria andUsrRc0IsNull() {
            addCriterion("USR_RC0 is null");
            return (Criteria) this;
        }

        public Criteria andUsrRc0IsNotNull() {
            addCriterion("USR_RC0 is not null");
            return (Criteria) this;
        }

        public Criteria andUsrRc0EqualTo(String value) {
            addCriterion("USR_RC0 =", value, "usrRc0");
            return (Criteria) this;
        }

        public Criteria andUsrRc0NotEqualTo(String value) {
            addCriterion("USR_RC0 <>", value, "usrRc0");
            return (Criteria) this;
        }

        public Criteria andUsrRc0GreaterThan(String value) {
            addCriterion("USR_RC0 >", value, "usrRc0");
            return (Criteria) this;
        }

        public Criteria andUsrRc0GreaterThanOrEqualTo(String value) {
            addCriterion("USR_RC0 >=", value, "usrRc0");
            return (Criteria) this;
        }

        public Criteria andUsrRc0LessThan(String value) {
            addCriterion("USR_RC0 <", value, "usrRc0");
            return (Criteria) this;
        }

        public Criteria andUsrRc0LessThanOrEqualTo(String value) {
            addCriterion("USR_RC0 <=", value, "usrRc0");
            return (Criteria) this;
        }

        public Criteria andUsrRc0Like(String value) {
            addCriterion("USR_RC0 like", value, "usrRc0");
            return (Criteria) this;
        }

        public Criteria andUsrRc0NotLike(String value) {
            addCriterion("USR_RC0 not like", value, "usrRc0");
            return (Criteria) this;
        }

        public Criteria andUsrRc0In(List<String> values) {
            addCriterion("USR_RC0 in", values, "usrRc0");
            return (Criteria) this;
        }

        public Criteria andUsrRc0NotIn(List<String> values) {
            addCriterion("USR_RC0 not in", values, "usrRc0");
            return (Criteria) this;
        }

        public Criteria andUsrRc0Between(String value1, String value2) {
            addCriterion("USR_RC0 between", value1, value2, "usrRc0");
            return (Criteria) this;
        }

        public Criteria andUsrRc0NotBetween(String value1, String value2) {
            addCriterion("USR_RC0 not between", value1, value2, "usrRc0");
            return (Criteria) this;
        }

        public Criteria andUsrRc1IsNull() {
            addCriterion("USR_RC1 is null");
            return (Criteria) this;
        }

        public Criteria andUsrRc1IsNotNull() {
            addCriterion("USR_RC1 is not null");
            return (Criteria) this;
        }

        public Criteria andUsrRc1EqualTo(String value) {
            addCriterion("USR_RC1 =", value, "usrRc1");
            return (Criteria) this;
        }

        public Criteria andUsrRc1NotEqualTo(String value) {
            addCriterion("USR_RC1 <>", value, "usrRc1");
            return (Criteria) this;
        }

        public Criteria andUsrRc1GreaterThan(String value) {
            addCriterion("USR_RC1 >", value, "usrRc1");
            return (Criteria) this;
        }

        public Criteria andUsrRc1GreaterThanOrEqualTo(String value) {
            addCriterion("USR_RC1 >=", value, "usrRc1");
            return (Criteria) this;
        }

        public Criteria andUsrRc1LessThan(String value) {
            addCriterion("USR_RC1 <", value, "usrRc1");
            return (Criteria) this;
        }

        public Criteria andUsrRc1LessThanOrEqualTo(String value) {
            addCriterion("USR_RC1 <=", value, "usrRc1");
            return (Criteria) this;
        }

        public Criteria andUsrRc1Like(String value) {
            addCriterion("USR_RC1 like", value, "usrRc1");
            return (Criteria) this;
        }

        public Criteria andUsrRc1NotLike(String value) {
            addCriterion("USR_RC1 not like", value, "usrRc1");
            return (Criteria) this;
        }

        public Criteria andUsrRc1In(List<String> values) {
            addCriterion("USR_RC1 in", values, "usrRc1");
            return (Criteria) this;
        }

        public Criteria andUsrRc1NotIn(List<String> values) {
            addCriterion("USR_RC1 not in", values, "usrRc1");
            return (Criteria) this;
        }

        public Criteria andUsrRc1Between(String value1, String value2) {
            addCriterion("USR_RC1 between", value1, value2, "usrRc1");
            return (Criteria) this;
        }

        public Criteria andUsrRc1NotBetween(String value1, String value2) {
            addCriterion("USR_RC1 not between", value1, value2, "usrRc1");
            return (Criteria) this;
        }

        public Criteria andUsrRc2IsNull() {
            addCriterion("USR_RC2 is null");
            return (Criteria) this;
        }

        public Criteria andUsrRc2IsNotNull() {
            addCriterion("USR_RC2 is not null");
            return (Criteria) this;
        }

        public Criteria andUsrRc2EqualTo(String value) {
            addCriterion("USR_RC2 =", value, "usrRc2");
            return (Criteria) this;
        }
        public Criteria orUsrRc2EqualTo(String value) {
            addCriterion("1=1 OR USR_RC2 =", value, "usrRc2");
            return (Criteria) this;
        }

        public Criteria andUsrRc2NotEqualTo(String value) {
            addCriterion("USR_RC2 <>", value, "usrRc2");
            return (Criteria) this;
        }

        public Criteria andUsrRc2GreaterThan(String value) {
            addCriterion("USR_RC2 >", value, "usrRc2");
            return (Criteria) this;
        }

        public Criteria andUsrRc2GreaterThanOrEqualTo(String value) {
            addCriterion("USR_RC2 >=", value, "usrRc2");
            return (Criteria) this;
        }

        public Criteria andUsrRc2LessThan(String value) {
            addCriterion("USR_RC2 <", value, "usrRc2");
            return (Criteria) this;
        }

        public Criteria andUsrRc2LessThanOrEqualTo(String value) {
            addCriterion("USR_RC2 <=", value, "usrRc2");
            return (Criteria) this;
        }

        public Criteria andUsrRc2Like(String value) {
            addCriterion("USR_RC2 like", value, "usrRc2");
            return (Criteria) this;
        }

        public Criteria andUsrRc2NotLike(String value) {
            addCriterion("USR_RC2 not like", value, "usrRc2");
            return (Criteria) this;
        }

        public Criteria andUsrRc2In(List<String> values) {
            addCriterion("USR_RC2 in", values, "usrRc2");
            return (Criteria) this;
        }

        public Criteria andUsrRc2NotIn(List<String> values) {
            addCriterion("USR_RC2 not in", values, "usrRc2");
            return (Criteria) this;
        }

        public Criteria andUsrRc2Between(String value1, String value2) {
            addCriterion("USR_RC2 between", value1, value2, "usrRc2");
            return (Criteria) this;
        }

        public Criteria andUsrRc2NotBetween(String value1, String value2) {
            addCriterion("USR_RC2 not between", value1, value2, "usrRc2");
            return (Criteria) this;
        }

        public Criteria andUsrRc3IsNull() {
            addCriterion("USR_RC3 is null");
            return (Criteria) this;
        }

        public Criteria andUsrRc3IsNotNull() {
            addCriterion("USR_RC3 is not null");
            return (Criteria) this;
        }

        public Criteria andUsrRc3EqualTo(Integer value) {
            addCriterion("USR_RC3 =", value, "usrRc3");
            return (Criteria) this;
        }

        public Criteria andUsrRc3NotEqualTo(Integer value) {
            addCriterion("USR_RC3 <>", value, "usrRc3");
            return (Criteria) this;
        }

        public Criteria andUsrRc3GreaterThan(Integer value) {
            addCriterion("USR_RC3 >", value, "usrRc3");
            return (Criteria) this;
        }

        public Criteria andUsrRc3GreaterThanOrEqualTo(Integer value) {
            addCriterion("USR_RC3 >=", value, "usrRc3");
            return (Criteria) this;
        }

        public Criteria andUsrRc3LessThan(Integer value) {
            addCriterion("USR_RC3 <", value, "usrRc3");
            return (Criteria) this;
        }

        public Criteria andUsrRc3LessThanOrEqualTo(Integer value) {
            addCriterion("USR_RC3 <=", value, "usrRc3");
            return (Criteria) this;
        }

        public Criteria andUsrRc3In(List<Integer> values) {
            addCriterion("USR_RC3 in", values, "usrRc3");
            return (Criteria) this;
        }

        public Criteria andUsrRc3NotIn(List<Integer> values) {
            addCriterion("USR_RC3 not in", values, "usrRc3");
            return (Criteria) this;
        }

        public Criteria andUsrRc3Between(Integer value1, Integer value2) {
            addCriterion("USR_RC3 between", value1, value2, "usrRc3");
            return (Criteria) this;
        }

        public Criteria andUsrRc3NotBetween(Integer value1, Integer value2) {
            addCriterion("USR_RC3 not between", value1, value2, "usrRc3");
            return (Criteria) this;
        }

        public Criteria andUsrRc4IsNull() {
            addCriterion("USR_RC4 is null");
            return (Criteria) this;
        }

        public Criteria andUsrRc4IsNotNull() {
            addCriterion("USR_RC4 is not null");
            return (Criteria) this;
        }

        public Criteria andUsrRc4EqualTo(Integer value) {
            addCriterion("USR_RC4 =", value, "usrRc4");
            return (Criteria) this;
        }

        public Criteria andUsrRc4NotEqualTo(Integer value) {
            addCriterion("USR_RC4 <>", value, "usrRc4");
            return (Criteria) this;
        }

        public Criteria andUsrRc4GreaterThan(Integer value) {
            addCriterion("USR_RC4 >", value, "usrRc4");
            return (Criteria) this;
        }

        public Criteria andUsrRc4GreaterThanOrEqualTo(Integer value) {
            addCriterion("USR_RC4 >=", value, "usrRc4");
            return (Criteria) this;
        }

        public Criteria andUsrRc4LessThan(Integer value) {
            addCriterion("USR_RC4 <", value, "usrRc4");
            return (Criteria) this;
        }

        public Criteria andUsrRc4LessThanOrEqualTo(Integer value) {
            addCriterion("USR_RC4 <=", value, "usrRc4");
            return (Criteria) this;
        }

        public Criteria andUsrRc4In(List<Integer> values) {
            addCriterion("USR_RC4 in", values, "usrRc4");
            return (Criteria) this;
        }

        public Criteria andUsrRc4NotIn(List<Integer> values) {
            addCriterion("USR_RC4 not in", values, "usrRc4");
            return (Criteria) this;
        }

        public Criteria andUsrRc4Between(Integer value1, Integer value2) {
            addCriterion("USR_RC4 between", value1, value2, "usrRc4");
            return (Criteria) this;
        }

        public Criteria andUsrRc4NotBetween(Integer value1, Integer value2) {
            addCriterion("USR_RC4 not between", value1, value2, "usrRc4");
            return (Criteria) this;
        }

        public Criteria andUsrRc5IsNull() {
            addCriterion("USR_RC5 is null");
            return (Criteria) this;
        }

        public Criteria andUsrRc5IsNotNull() {
            addCriterion("USR_RC5 is not null");
            return (Criteria) this;
        }

        public Criteria andUsrRc5EqualTo(Date value) {
            addCriterionForJDBCDate("USR_RC5 =", value, "usrRc5");
            return (Criteria) this;
        }

        public Criteria andUsrRc5NotEqualTo(Date value) {
            addCriterionForJDBCDate("USR_RC5 <>", value, "usrRc5");
            return (Criteria) this;
        }

        public Criteria andUsrRc5GreaterThan(Date value) {
            addCriterionForJDBCDate("USR_RC5 >", value, "usrRc5");
            return (Criteria) this;
        }

        public Criteria andUsrRc5GreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("USR_RC5 >=", value, "usrRc5");
            return (Criteria) this;
        }

        public Criteria andUsrRc5LessThan(Date value) {
            addCriterionForJDBCDate("USR_RC5 <", value, "usrRc5");
            return (Criteria) this;
        }

        public Criteria andUsrRc5LessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("USR_RC5 <=", value, "usrRc5");
            return (Criteria) this;
        }

        public Criteria andUsrRc5In(List<Date> values) {
            addCriterionForJDBCDate("USR_RC5 in", values, "usrRc5");
            return (Criteria) this;
        }

        public Criteria andUsrRc5NotIn(List<Date> values) {
            addCriterionForJDBCDate("USR_RC5 not in", values, "usrRc5");
            return (Criteria) this;
        }

        public Criteria andUsrRc5Between(Date value1, Date value2) {
            addCriterionForJDBCDate("USR_RC5 between", value1, value2, "usrRc5");
            return (Criteria) this;
        }

        public Criteria andUsrRc5NotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("USR_RC5 not between", value1, value2, "usrRc5");
            return (Criteria) this;
        }

        public Criteria andUsrAccountLikeInsensitive(String value) {
            addCriterion("upper(USR_ACCOUNT) like", value.toUpperCase(), "usrAccount");
            return (Criteria) this;
        }

        public Criteria andUsrNameLikeInsensitive(String value) {
            addCriterion("upper(USR_NAME) like", value.toUpperCase(), "usrName");
            return (Criteria) this;
        }

        public Criteria andUsrRemarksLikeInsensitive(String value) {
            addCriterion("upper(USR_REMARKS) like", value.toUpperCase(), "usrRemarks");
            return (Criteria) this;
        }

        public Criteria andUsrPasswordLikeInsensitive(String value) {
            addCriterion("upper(USR_PASSWORD) like", value.toUpperCase(), "usrPassword");
            return (Criteria) this;
        }

        public Criteria andUsrIpLikeInsensitive(String value) {
            addCriterion("upper(USR_IP) like", value.toUpperCase(), "usrIp");
            return (Criteria) this;
        }

        public Criteria andUsrMacLikeInsensitive(String value) {
            addCriterion("upper(USR_MAC) like", value.toUpperCase(), "usrMac");
            return (Criteria) this;
        }

        public Criteria andUsrLastipLikeInsensitive(String value) {
            addCriterion("upper(USR_LASTIP) like", value.toUpperCase(), "usrLastip");
            return (Criteria) this;
        }

        public Criteria andUsrLastmacLikeInsensitive(String value) {
            addCriterion("upper(USR_LASTMAC) like", value.toUpperCase(), "usrLastmac");
            return (Criteria) this;
        }

        public Criteria andUsrRc0LikeInsensitive(String value) {
            addCriterion("upper(USR_RC0) like", value.toUpperCase(), "usrRc0");
            return (Criteria) this;
        }

        public Criteria andUsrRc1LikeInsensitive(String value) {
            addCriterion("upper(USR_RC1) like", value.toUpperCase(), "usrRc1");
            return (Criteria) this;
        }

        public Criteria andUsrRc2LikeInsensitive(String value) {
            addCriterion("upper(USR_RC2) like", value.toUpperCase(), "usrRc2");
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