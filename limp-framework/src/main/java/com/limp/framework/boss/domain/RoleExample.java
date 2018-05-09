package com.limp.framework.boss.domain;

import com.limp.framework.core.bean.Pager;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class RoleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Pager page;

    public RoleExample() {
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
            addCriterion("URE_GUID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("URE_GUID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("URE_GUID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("URE_GUID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("URE_GUID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("URE_GUID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("URE_GUID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("URE_GUID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("URE_GUID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("URE_GUID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("URE_GUID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("URE_GUID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("URE_GUID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("URE_GUID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUreNameIsNull() {
            addCriterion("URE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUreNameIsNotNull() {
            addCriterion("URE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUreNameEqualTo(String value) {
            addCriterion("URE_NAME =", value, "ureName");
            return (Criteria) this;
        }

        public Criteria andUreNameNotEqualTo(String value) {
            addCriterion("URE_NAME <>", value, "ureName");
            return (Criteria) this;
        }

        public Criteria andUreNameGreaterThan(String value) {
            addCriterion("URE_NAME >", value, "ureName");
            return (Criteria) this;
        }

        public Criteria andUreNameGreaterThanOrEqualTo(String value) {
            addCriterion("URE_NAME >=", value, "ureName");
            return (Criteria) this;
        }

        public Criteria andUreNameLessThan(String value) {
            addCriterion("URE_NAME <", value, "ureName");
            return (Criteria) this;
        }

        public Criteria andUreNameLessThanOrEqualTo(String value) {
            addCriterion("URE_NAME <=", value, "ureName");
            return (Criteria) this;
        }

        public Criteria andUreNameLike(String value) {
            addCriterion("URE_NAME like", value, "ureName");
            return (Criteria) this;
        }

        public Criteria andUreNameNotLike(String value) {
            addCriterion("URE_NAME not like", value, "ureName");
            return (Criteria) this;
        }

        public Criteria andUreNameIn(List<String> values) {
            addCriterion("URE_NAME in", values, "ureName");
            return (Criteria) this;
        }

        public Criteria andUreNameNotIn(List<String> values) {
            addCriterion("URE_NAME not in", values, "ureName");
            return (Criteria) this;
        }

        public Criteria andUreNameBetween(String value1, String value2) {
            addCriterion("URE_NAME between", value1, value2, "ureName");
            return (Criteria) this;
        }

        public Criteria andUreNameNotBetween(String value1, String value2) {
            addCriterion("URE_NAME not between", value1, value2, "ureName");
            return (Criteria) this;
        }

        public Criteria andUreRemarksIsNull() {
            addCriterion("URE_REMARKS is null");
            return (Criteria) this;
        }

        public Criteria andUreRemarksIsNotNull() {
            addCriterion("URE_REMARKS is not null");
            return (Criteria) this;
        }

        public Criteria andUreRemarksEqualTo(String value) {
            addCriterion("URE_REMARKS =", value, "ureRemarks");
            return (Criteria) this;
        }

        public Criteria andUreRemarksNotEqualTo(String value) {
            addCriterion("URE_REMARKS <>", value, "ureRemarks");
            return (Criteria) this;
        }

        public Criteria andUreRemarksGreaterThan(String value) {
            addCriterion("URE_REMARKS >", value, "ureRemarks");
            return (Criteria) this;
        }

        public Criteria andUreRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("URE_REMARKS >=", value, "ureRemarks");
            return (Criteria) this;
        }

        public Criteria andUreRemarksLessThan(String value) {
            addCriterion("URE_REMARKS <", value, "ureRemarks");
            return (Criteria) this;
        }

        public Criteria andUreRemarksLessThanOrEqualTo(String value) {
            addCriterion("URE_REMARKS <=", value, "ureRemarks");
            return (Criteria) this;
        }

        public Criteria andUreRemarksLike(String value) {
            addCriterion("URE_REMARKS like", value, "ureRemarks");
            return (Criteria) this;
        }

        public Criteria andUreRemarksNotLike(String value) {
            addCriterion("URE_REMARKS not like", value, "ureRemarks");
            return (Criteria) this;
        }

        public Criteria andUreRemarksIn(List<String> values) {
            addCriterion("URE_REMARKS in", values, "ureRemarks");
            return (Criteria) this;
        }

        public Criteria andUreRemarksNotIn(List<String> values) {
            addCriterion("URE_REMARKS not in", values, "ureRemarks");
            return (Criteria) this;
        }

        public Criteria andUreRemarksBetween(String value1, String value2) {
            addCriterion("URE_REMARKS between", value1, value2, "ureRemarks");
            return (Criteria) this;
        }

        public Criteria andUreRemarksNotBetween(String value1, String value2) {
            addCriterion("URE_REMARKS not between", value1, value2, "ureRemarks");
            return (Criteria) this;
        }

        public Criteria andUreStateIsNull() {
            addCriterion("URE_STATE is null");
            return (Criteria) this;
        }

        public Criteria andUreStateIsNotNull() {
            addCriterion("URE_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andUreStateEqualTo(Integer value) {
            addCriterion("URE_STATE =", value, "ureState");
            return (Criteria) this;
        }

        public Criteria andUreStateNotEqualTo(Integer value) {
            addCriterion("URE_STATE <>", value, "ureState");
            return (Criteria) this;
        }

        public Criteria andUreStateGreaterThan(Integer value) {
            addCriterion("URE_STATE >", value, "ureState");
            return (Criteria) this;
        }

        public Criteria andUreStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("URE_STATE >=", value, "ureState");
            return (Criteria) this;
        }

        public Criteria andUreStateLessThan(Integer value) {
            addCriterion("URE_STATE <", value, "ureState");
            return (Criteria) this;
        }

        public Criteria andUreStateLessThanOrEqualTo(Integer value) {
            addCriterion("URE_STATE <=", value, "ureState");
            return (Criteria) this;
        }

        public Criteria andUreStateIn(List<Integer> values) {
            addCriterion("URE_STATE in", values, "ureState");
            return (Criteria) this;
        }

        public Criteria andUreStateNotIn(List<Integer> values) {
            addCriterion("URE_STATE not in", values, "ureState");
            return (Criteria) this;
        }

        public Criteria andUreStateBetween(Integer value1, Integer value2) {
            addCriterion("URE_STATE between", value1, value2, "ureState");
            return (Criteria) this;
        }

        public Criteria andUreStateNotBetween(Integer value1, Integer value2) {
            addCriterion("URE_STATE not between", value1, value2, "ureState");
            return (Criteria) this;
        }

        public Criteria andUreRc0IsNull() {
            addCriterion("URE_RC0 is null");
            return (Criteria) this;
        }

        public Criteria andUreRc0IsNotNull() {
            addCriterion("URE_RC0 is not null");
            return (Criteria) this;
        }

        public Criteria andUreRc0EqualTo(String value) {
            addCriterion("URE_RC0 =", value, "ureRc0");
            return (Criteria) this;
        }

        public Criteria andUreRc0NotEqualTo(String value) {
            addCriterion("URE_RC0 <>", value, "ureRc0");
            return (Criteria) this;
        }

        public Criteria andUreRc0GreaterThan(String value) {
            addCriterion("URE_RC0 >", value, "ureRc0");
            return (Criteria) this;
        }

        public Criteria andUreRc0GreaterThanOrEqualTo(String value) {
            addCriterion("URE_RC0 >=", value, "ureRc0");
            return (Criteria) this;
        }

        public Criteria andUreRc0LessThan(String value) {
            addCriterion("URE_RC0 <", value, "ureRc0");
            return (Criteria) this;
        }

        public Criteria andUreRc0LessThanOrEqualTo(String value) {
            addCriterion("URE_RC0 <=", value, "ureRc0");
            return (Criteria) this;
        }

        public Criteria andUreRc0Like(String value) {
            addCriterion("URE_RC0 like", value, "ureRc0");
            return (Criteria) this;
        }

        public Criteria andUreRc0NotLike(String value) {
            addCriterion("URE_RC0 not like", value, "ureRc0");
            return (Criteria) this;
        }

        public Criteria andUreRc0In(List<String> values) {
            addCriterion("URE_RC0 in", values, "ureRc0");
            return (Criteria) this;
        }

        public Criteria andUreRc0NotIn(List<String> values) {
            addCriterion("URE_RC0 not in", values, "ureRc0");
            return (Criteria) this;
        }

        public Criteria andUreRc0Between(String value1, String value2) {
            addCriterion("URE_RC0 between", value1, value2, "ureRc0");
            return (Criteria) this;
        }

        public Criteria andUreRc0NotBetween(String value1, String value2) {
            addCriterion("URE_RC0 not between", value1, value2, "ureRc0");
            return (Criteria) this;
        }

        public Criteria andUreRc1IsNull() {
            addCriterion("URE_RC1 is null");
            return (Criteria) this;
        }

        public Criteria andUreRc1IsNotNull() {
            addCriterion("URE_RC1 is not null");
            return (Criteria) this;
        }

        public Criteria andUreRc1EqualTo(String value) {
            addCriterion("URE_RC1 =", value, "ureRc1");
            return (Criteria) this;
        }

        public Criteria andUreRc1NotEqualTo(String value) {
            addCriterion("URE_RC1 <>", value, "ureRc1");
            return (Criteria) this;
        }

        public Criteria andUreRc1GreaterThan(String value) {
            addCriterion("URE_RC1 >", value, "ureRc1");
            return (Criteria) this;
        }

        public Criteria andUreRc1GreaterThanOrEqualTo(String value) {
            addCriterion("URE_RC1 >=", value, "ureRc1");
            return (Criteria) this;
        }

        public Criteria andUreRc1LessThan(String value) {
            addCriterion("URE_RC1 <", value, "ureRc1");
            return (Criteria) this;
        }

        public Criteria andUreRc1LessThanOrEqualTo(String value) {
            addCriterion("URE_RC1 <=", value, "ureRc1");
            return (Criteria) this;
        }

        public Criteria andUreRc1Like(String value) {
            addCriterion("URE_RC1 like", value, "ureRc1");
            return (Criteria) this;
        }

        public Criteria andUreRc1NotLike(String value) {
            addCriterion("URE_RC1 not like", value, "ureRc1");
            return (Criteria) this;
        }

        public Criteria andUreRc1In(List<String> values) {
            addCriterion("URE_RC1 in", values, "ureRc1");
            return (Criteria) this;
        }

        public Criteria andUreRc1NotIn(List<String> values) {
            addCriterion("URE_RC1 not in", values, "ureRc1");
            return (Criteria) this;
        }

        public Criteria andUreRc1Between(String value1, String value2) {
            addCriterion("URE_RC1 between", value1, value2, "ureRc1");
            return (Criteria) this;
        }

        public Criteria andUreRc1NotBetween(String value1, String value2) {
            addCriterion("URE_RC1 not between", value1, value2, "ureRc1");
            return (Criteria) this;
        }

        public Criteria andUreRc2IsNull() {
            addCriterion("URE_RC2 is null");
            return (Criteria) this;
        }

        public Criteria andUreRc2IsNotNull() {
            addCriterion("URE_RC2 is not null");
            return (Criteria) this;
        }

        public Criteria andUreRc2EqualTo(String value) {
            addCriterion("URE_RC2 =", value, "ureRc2");
            return (Criteria) this;
        }

        public Criteria andUreRc2NotEqualTo(String value) {
            addCriterion("URE_RC2 <>", value, "ureRc2");
            return (Criteria) this;
        }

        public Criteria andUreRc2GreaterThan(String value) {
            addCriterion("URE_RC2 >", value, "ureRc2");
            return (Criteria) this;
        }

        public Criteria andUreRc2GreaterThanOrEqualTo(String value) {
            addCriterion("URE_RC2 >=", value, "ureRc2");
            return (Criteria) this;
        }

        public Criteria andUreRc2LessThan(String value) {
            addCriterion("URE_RC2 <", value, "ureRc2");
            return (Criteria) this;
        }

        public Criteria andUreRc2LessThanOrEqualTo(String value) {
            addCriterion("URE_RC2 <=", value, "ureRc2");
            return (Criteria) this;
        }

        public Criteria andUreRc2Like(String value) {
            addCriterion("URE_RC2 like", value, "ureRc2");
            return (Criteria) this;
        }

        public Criteria andUreRc2NotLike(String value) {
            addCriterion("URE_RC2 not like", value, "ureRc2");
            return (Criteria) this;
        }

        public Criteria andUreRc2In(List<String> values) {
            addCriterion("URE_RC2 in", values, "ureRc2");
            return (Criteria) this;
        }

        public Criteria andUreRc2NotIn(List<String> values) {
            addCriterion("URE_RC2 not in", values, "ureRc2");
            return (Criteria) this;
        }

        public Criteria andUreRc2Between(String value1, String value2) {
            addCriterion("URE_RC2 between", value1, value2, "ureRc2");
            return (Criteria) this;
        }

        public Criteria andUreRc2NotBetween(String value1, String value2) {
            addCriterion("URE_RC2 not between", value1, value2, "ureRc2");
            return (Criteria) this;
        }

        public Criteria andUreRc3IsNull() {
            addCriterion("URE_RC3 is null");
            return (Criteria) this;
        }

        public Criteria andUreRc3IsNotNull() {
            addCriterion("URE_RC3 is not null");
            return (Criteria) this;
        }

        public Criteria andUreRc3EqualTo(BigDecimal value) {
            addCriterion("URE_RC3 =", value, "ureRc3");
            return (Criteria) this;
        }

        public Criteria andUreRc3NotEqualTo(BigDecimal value) {
            addCriterion("URE_RC3 <>", value, "ureRc3");
            return (Criteria) this;
        }

        public Criteria andUreRc3GreaterThan(BigDecimal value) {
            addCriterion("URE_RC3 >", value, "ureRc3");
            return (Criteria) this;
        }

        public Criteria andUreRc3GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("URE_RC3 >=", value, "ureRc3");
            return (Criteria) this;
        }

        public Criteria andUreRc3LessThan(BigDecimal value) {
            addCriterion("URE_RC3 <", value, "ureRc3");
            return (Criteria) this;
        }

        public Criteria andUreRc3LessThanOrEqualTo(BigDecimal value) {
            addCriterion("URE_RC3 <=", value, "ureRc3");
            return (Criteria) this;
        }

        public Criteria andUreRc3In(List<BigDecimal> values) {
            addCriterion("URE_RC3 in", values, "ureRc3");
            return (Criteria) this;
        }

        public Criteria andUreRc3NotIn(List<BigDecimal> values) {
            addCriterion("URE_RC3 not in", values, "ureRc3");
            return (Criteria) this;
        }

        public Criteria andUreRc3Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("URE_RC3 between", value1, value2, "ureRc3");
            return (Criteria) this;
        }

        public Criteria andUreRc3NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("URE_RC3 not between", value1, value2, "ureRc3");
            return (Criteria) this;
        }

        public Criteria andUreRc4IsNull() {
            addCriterion("URE_RC4 is null");
            return (Criteria) this;
        }

        public Criteria andUreRc4IsNotNull() {
            addCriterion("URE_RC4 is not null");
            return (Criteria) this;
        }

        public Criteria andUreRc4EqualTo(BigDecimal value) {
            addCriterion("URE_RC4 =", value, "ureRc4");
            return (Criteria) this;
        }

        public Criteria andUreRc4NotEqualTo(BigDecimal value) {
            addCriterion("URE_RC4 <>", value, "ureRc4");
            return (Criteria) this;
        }

        public Criteria andUreRc4GreaterThan(BigDecimal value) {
            addCriterion("URE_RC4 >", value, "ureRc4");
            return (Criteria) this;
        }

        public Criteria andUreRc4GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("URE_RC4 >=", value, "ureRc4");
            return (Criteria) this;
        }

        public Criteria andUreRc4LessThan(BigDecimal value) {
            addCriterion("URE_RC4 <", value, "ureRc4");
            return (Criteria) this;
        }

        public Criteria andUreRc4LessThanOrEqualTo(BigDecimal value) {
            addCriterion("URE_RC4 <=", value, "ureRc4");
            return (Criteria) this;
        }

        public Criteria andUreRc4In(List<BigDecimal> values) {
            addCriterion("URE_RC4 in", values, "ureRc4");
            return (Criteria) this;
        }

        public Criteria andUreRc4NotIn(List<BigDecimal> values) {
            addCriterion("URE_RC4 not in", values, "ureRc4");
            return (Criteria) this;
        }

        public Criteria andUreRc4Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("URE_RC4 between", value1, value2, "ureRc4");
            return (Criteria) this;
        }

        public Criteria andUreRc4NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("URE_RC4 not between", value1, value2, "ureRc4");
            return (Criteria) this;
        }

        public Criteria andUreRc5IsNull() {
            addCriterion("URE_RC5 is null");
            return (Criteria) this;
        }

        public Criteria andUreRc5IsNotNull() {
            addCriterion("URE_RC5 is not null");
            return (Criteria) this;
        }

        public Criteria andUreRc5EqualTo(Date value) {
            addCriterionForJDBCDate("URE_RC5 =", value, "ureRc5");
            return (Criteria) this;
        }

        public Criteria andUreRc5NotEqualTo(Date value) {
            addCriterionForJDBCDate("URE_RC5 <>", value, "ureRc5");
            return (Criteria) this;
        }

        public Criteria andUreRc5GreaterThan(Date value) {
            addCriterionForJDBCDate("URE_RC5 >", value, "ureRc5");
            return (Criteria) this;
        }

        public Criteria andUreRc5GreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("URE_RC5 >=", value, "ureRc5");
            return (Criteria) this;
        }

        public Criteria andUreRc5LessThan(Date value) {
            addCriterionForJDBCDate("URE_RC5 <", value, "ureRc5");
            return (Criteria) this;
        }

        public Criteria andUreRc5LessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("URE_RC5 <=", value, "ureRc5");
            return (Criteria) this;
        }

        public Criteria andUreRc5In(List<Date> values) {
            addCriterionForJDBCDate("URE_RC5 in", values, "ureRc5");
            return (Criteria) this;
        }

        public Criteria andUreRc5NotIn(List<Date> values) {
            addCriterionForJDBCDate("URE_RC5 not in", values, "ureRc5");
            return (Criteria) this;
        }

        public Criteria andUreRc5Between(Date value1, Date value2) {
            addCriterionForJDBCDate("URE_RC5 between", value1, value2, "ureRc5");
            return (Criteria) this;
        }

        public Criteria andUreRc5NotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("URE_RC5 not between", value1, value2, "ureRc5");
            return (Criteria) this;
        }

        public Criteria andUreNameLikeInsensitive(String value) {
            addCriterion("upper(URE_NAME) like", value.toUpperCase(), "ureName");
            return (Criteria) this;
        }

        public Criteria andUreRemarksLikeInsensitive(String value) {
            addCriterion("upper(URE_REMARKS) like", value.toUpperCase(), "ureRemarks");
            return (Criteria) this;
        }

        public Criteria andUreRc0LikeInsensitive(String value) {
            addCriterion("upper(URE_RC0) like", value.toUpperCase(), "ureRc0");
            return (Criteria) this;
        }

        public Criteria andUreRc1LikeInsensitive(String value) {
            addCriterion("upper(URE_RC1) like", value.toUpperCase(), "ureRc1");
            return (Criteria) this;
        }

        public Criteria andUreRc2LikeInsensitive(String value) {
            addCriterion("upper(URE_RC2) like", value.toUpperCase(), "ureRc2");
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