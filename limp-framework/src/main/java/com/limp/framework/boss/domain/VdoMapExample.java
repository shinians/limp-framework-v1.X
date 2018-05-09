package com.limp.framework.boss.domain;

import com.limp.framework.core.bean.Pager;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class VdoMapExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Pager page;

    public VdoMapExample() {
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

        public Criteria andUdmUreguidIsNull() {
            addCriterion("UDM_UREGUID is null");
            return (Criteria) this;
        }

        public Criteria andUdmUreguidIsNotNull() {
            addCriterion("UDM_UREGUID is not null");
            return (Criteria) this;
        }

        public Criteria andUdmUreguidEqualTo(String value) {
            addCriterion("UDM_UREGUID =", value, "udmUreguid");
            return (Criteria) this;
        }

        public Criteria andUdmUreguidNotEqualTo(String value) {
            addCriterion("UDM_UREGUID <>", value, "udmUreguid");
            return (Criteria) this;
        }

        public Criteria andUdmUreguidGreaterThan(String value) {
            addCriterion("UDM_UREGUID >", value, "udmUreguid");
            return (Criteria) this;
        }

        public Criteria andUdmUreguidGreaterThanOrEqualTo(String value) {
            addCriterion("UDM_UREGUID >=", value, "udmUreguid");
            return (Criteria) this;
        }

        public Criteria andUdmUreguidLessThan(String value) {
            addCriterion("UDM_UREGUID <", value, "udmUreguid");
            return (Criteria) this;
        }

        public Criteria andUdmUreguidLessThanOrEqualTo(String value) {
            addCriterion("UDM_UREGUID <=", value, "udmUreguid");
            return (Criteria) this;
        }

        public Criteria andUdmUreguidLike(String value) {
            addCriterion("UDM_UREGUID like", value, "udmUreguid");
            return (Criteria) this;
        }

        public Criteria andUdmUreguidNotLike(String value) {
            addCriterion("UDM_UREGUID not like", value, "udmUreguid");
            return (Criteria) this;
        }

        public Criteria andUdmUreguidIn(List<String> values) {
            addCriterion("UDM_UREGUID in", values, "udmUreguid");
            return (Criteria) this;
        }

        public Criteria andUdmUreguidNotIn(List<String> values) {
            addCriterion("UDM_UREGUID not in", values, "udmUreguid");
            return (Criteria) this;
        }

        public Criteria andUdmUreguidBetween(String value1, String value2) {
            addCriterion("UDM_UREGUID between", value1, value2, "udmUreguid");
            return (Criteria) this;
        }

        public Criteria andUdmUreguidNotBetween(String value1, String value2) {
            addCriterion("UDM_UREGUID not between", value1, value2, "udmUreguid");
            return (Criteria) this;
        }

        public Criteria andUdmSsmguidIsNull() {
            addCriterion("UDM_SSMGUID is null");
            return (Criteria) this;
        }

        public Criteria andUdmSsmguidIsNotNull() {
            addCriterion("UDM_SSMGUID is not null");
            return (Criteria) this;
        }

        public Criteria andUdmSsmguidEqualTo(String value) {
            addCriterion("UDM_SSMGUID =", value, "udmSsmguid");
            return (Criteria) this;
        }

        public Criteria andUdmSsmguidNotEqualTo(String value) {
            addCriterion("UDM_SSMGUID <>", value, "udmSsmguid");
            return (Criteria) this;
        }

        public Criteria andUdmSsmguidGreaterThan(String value) {
            addCriterion("UDM_SSMGUID >", value, "udmSsmguid");
            return (Criteria) this;
        }

        public Criteria andUdmSsmguidGreaterThanOrEqualTo(String value) {
            addCriterion("UDM_SSMGUID >=", value, "udmSsmguid");
            return (Criteria) this;
        }

        public Criteria andUdmSsmguidLessThan(String value) {
            addCriterion("UDM_SSMGUID <", value, "udmSsmguid");
            return (Criteria) this;
        }

        public Criteria andUdmSsmguidLessThanOrEqualTo(String value) {
            addCriterion("UDM_SSMGUID <=", value, "udmSsmguid");
            return (Criteria) this;
        }

        public Criteria andUdmSsmguidLike(String value) {
            addCriterion("UDM_SSMGUID like", value, "udmSsmguid");
            return (Criteria) this;
        }

        public Criteria andUdmSsmguidNotLike(String value) {
            addCriterion("UDM_SSMGUID not like", value, "udmSsmguid");
            return (Criteria) this;
        }

        public Criteria andUdmSsmguidIn(List<String> values) {
            addCriterion("UDM_SSMGUID in", values, "udmSsmguid");
            return (Criteria) this;
        }

        public Criteria andUdmSsmguidNotIn(List<String> values) {
            addCriterion("UDM_SSMGUID not in", values, "udmSsmguid");
            return (Criteria) this;
        }

        public Criteria andUdmSsmguidBetween(String value1, String value2) {
            addCriterion("UDM_SSMGUID between", value1, value2, "udmSsmguid");
            return (Criteria) this;
        }

        public Criteria andUdmSsmguidNotBetween(String value1, String value2) {
            addCriterion("UDM_SSMGUID not between", value1, value2, "udmSsmguid");
            return (Criteria) this;
        }

        public Criteria andUdmSsmdtguidIsNull() {
            addCriterion("UDM_SSMDTGUID is null");
            return (Criteria) this;
        }

        public Criteria andUdmSsmdtguidIsNotNull() {
            addCriterion("UDM_SSMDTGUID is not null");
            return (Criteria) this;
        }

        public Criteria andUdmSsmdtguidEqualTo(String value) {
            addCriterion("UDM_SSMDTGUID =", value, "udmSsmdtguid");
            return (Criteria) this;
        }

        public Criteria andUdmSsmdtguidNotEqualTo(String value) {
            addCriterion("UDM_SSMDTGUID <>", value, "udmSsmdtguid");
            return (Criteria) this;
        }

        public Criteria andUdmSsmdtguidGreaterThan(String value) {
            addCriterion("UDM_SSMDTGUID >", value, "udmSsmdtguid");
            return (Criteria) this;
        }

        public Criteria andUdmSsmdtguidGreaterThanOrEqualTo(String value) {
            addCriterion("UDM_SSMDTGUID >=", value, "udmSsmdtguid");
            return (Criteria) this;
        }

        public Criteria andUdmSsmdtguidLessThan(String value) {
            addCriterion("UDM_SSMDTGUID <", value, "udmSsmdtguid");
            return (Criteria) this;
        }

        public Criteria andUdmSsmdtguidLessThanOrEqualTo(String value) {
            addCriterion("UDM_SSMDTGUID <=", value, "udmSsmdtguid");
            return (Criteria) this;
        }

        public Criteria andUdmSsmdtguidLike(String value) {
            addCriterion("UDM_SSMDTGUID like", value, "udmSsmdtguid");
            return (Criteria) this;
        }

        public Criteria andUdmSsmdtguidNotLike(String value) {
            addCriterion("UDM_SSMDTGUID not like", value, "udmSsmdtguid");
            return (Criteria) this;
        }

        public Criteria andUdmSsmdtguidIn(List<String> values) {
            addCriterion("UDM_SSMDTGUID in", values, "udmSsmdtguid");
            return (Criteria) this;
        }

        public Criteria andUdmSsmdtguidNotIn(List<String> values) {
            addCriterion("UDM_SSMDTGUID not in", values, "udmSsmdtguid");
            return (Criteria) this;
        }

        public Criteria andUdmSsmdtguidBetween(String value1, String value2) {
            addCriterion("UDM_SSMDTGUID between", value1, value2, "udmSsmdtguid");
            return (Criteria) this;
        }

        public Criteria andUdmSsmdtguidNotBetween(String value1, String value2) {
            addCriterion("UDM_SSMDTGUID not between", value1, value2, "udmSsmdtguid");
            return (Criteria) this;
        }

        public Criteria andUdmValueIsNull() {
            addCriterion("UDM_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andUdmValueIsNotNull() {
            addCriterion("UDM_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andUdmValueEqualTo(String value) {
            addCriterion("UDM_VALUE =", value, "udmValue");
            return (Criteria) this;
        }

        public Criteria andUdmValueNotEqualTo(String value) {
            addCriterion("UDM_VALUE <>", value, "udmValue");
            return (Criteria) this;
        }

        public Criteria andUdmValueGreaterThan(String value) {
            addCriterion("UDM_VALUE >", value, "udmValue");
            return (Criteria) this;
        }

        public Criteria andUdmValueGreaterThanOrEqualTo(String value) {
            addCriterion("UDM_VALUE >=", value, "udmValue");
            return (Criteria) this;
        }

        public Criteria andUdmValueLessThan(String value) {
            addCriterion("UDM_VALUE <", value, "udmValue");
            return (Criteria) this;
        }

        public Criteria andUdmValueLessThanOrEqualTo(String value) {
            addCriterion("UDM_VALUE <=", value, "udmValue");
            return (Criteria) this;
        }

        public Criteria andUdmValueLike(String value) {
            addCriterion("UDM_VALUE like", value, "udmValue");
            return (Criteria) this;
        }

        public Criteria andUdmValueNotLike(String value) {
            addCriterion("UDM_VALUE not like", value, "udmValue");
            return (Criteria) this;
        }

        public Criteria andUdmValueIn(List<String> values) {
            addCriterion("UDM_VALUE in", values, "udmValue");
            return (Criteria) this;
        }

        public Criteria andUdmValueNotIn(List<String> values) {
            addCriterion("UDM_VALUE not in", values, "udmValue");
            return (Criteria) this;
        }

        public Criteria andUdmValueBetween(String value1, String value2) {
            addCriterion("UDM_VALUE between", value1, value2, "udmValue");
            return (Criteria) this;
        }

        public Criteria andUdmValueNotBetween(String value1, String value2) {
            addCriterion("UDM_VALUE not between", value1, value2, "udmValue");
            return (Criteria) this;
        }

        public Criteria andUdmIncludeIsNull() {
            addCriterion("UDM_INCLUDE is null");
            return (Criteria) this;
        }

        public Criteria andUdmIncludeIsNotNull() {
            addCriterion("UDM_INCLUDE is not null");
            return (Criteria) this;
        }

        public Criteria andUdmIncludeEqualTo(BigDecimal value) {
            addCriterion("UDM_INCLUDE =", value, "udmInclude");
            return (Criteria) this;
        }

        public Criteria andUdmIncludeNotEqualTo(BigDecimal value) {
            addCriterion("UDM_INCLUDE <>", value, "udmInclude");
            return (Criteria) this;
        }

        public Criteria andUdmIncludeGreaterThan(BigDecimal value) {
            addCriterion("UDM_INCLUDE >", value, "udmInclude");
            return (Criteria) this;
        }

        public Criteria andUdmIncludeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("UDM_INCLUDE >=", value, "udmInclude");
            return (Criteria) this;
        }

        public Criteria andUdmIncludeLessThan(BigDecimal value) {
            addCriterion("UDM_INCLUDE <", value, "udmInclude");
            return (Criteria) this;
        }

        public Criteria andUdmIncludeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("UDM_INCLUDE <=", value, "udmInclude");
            return (Criteria) this;
        }

        public Criteria andUdmIncludeIn(List<BigDecimal> values) {
            addCriterion("UDM_INCLUDE in", values, "udmInclude");
            return (Criteria) this;
        }

        public Criteria andUdmIncludeNotIn(List<BigDecimal> values) {
            addCriterion("UDM_INCLUDE not in", values, "udmInclude");
            return (Criteria) this;
        }

        public Criteria andUdmIncludeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UDM_INCLUDE between", value1, value2, "udmInclude");
            return (Criteria) this;
        }

        public Criteria andUdmIncludeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UDM_INCLUDE not between", value1, value2, "udmInclude");
            return (Criteria) this;
        }

        public Criteria andUdmIsremoveIsNull() {
            addCriterion("UDM_ISREMOVE is null");
            return (Criteria) this;
        }

        public Criteria andUdmIsremoveIsNotNull() {
            addCriterion("UDM_ISREMOVE is not null");
            return (Criteria) this;
        }

        public Criteria andUdmIsremoveEqualTo(BigDecimal value) {
            addCriterion("UDM_ISREMOVE =", value, "udmIsremove");
            return (Criteria) this;
        }

        public Criteria andUdmIsremoveNotEqualTo(BigDecimal value) {
            addCriterion("UDM_ISREMOVE <>", value, "udmIsremove");
            return (Criteria) this;
        }

        public Criteria andUdmIsremoveGreaterThan(BigDecimal value) {
            addCriterion("UDM_ISREMOVE >", value, "udmIsremove");
            return (Criteria) this;
        }

        public Criteria andUdmIsremoveGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("UDM_ISREMOVE >=", value, "udmIsremove");
            return (Criteria) this;
        }

        public Criteria andUdmIsremoveLessThan(BigDecimal value) {
            addCriterion("UDM_ISREMOVE <", value, "udmIsremove");
            return (Criteria) this;
        }

        public Criteria andUdmIsremoveLessThanOrEqualTo(BigDecimal value) {
            addCriterion("UDM_ISREMOVE <=", value, "udmIsremove");
            return (Criteria) this;
        }

        public Criteria andUdmIsremoveIn(List<BigDecimal> values) {
            addCriterion("UDM_ISREMOVE in", values, "udmIsremove");
            return (Criteria) this;
        }

        public Criteria andUdmIsremoveNotIn(List<BigDecimal> values) {
            addCriterion("UDM_ISREMOVE not in", values, "udmIsremove");
            return (Criteria) this;
        }

        public Criteria andUdmIsremoveBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UDM_ISREMOVE between", value1, value2, "udmIsremove");
            return (Criteria) this;
        }

        public Criteria andUdmIsremoveNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UDM_ISREMOVE not between", value1, value2, "udmIsremove");
            return (Criteria) this;
        }

        public Criteria andUdmStateIsNull() {
            addCriterion("UDM_STATE is null");
            return (Criteria) this;
        }

        public Criteria andUdmStateIsNotNull() {
            addCriterion("UDM_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andUdmStateEqualTo(BigDecimal value) {
            addCriterion("UDM_STATE =", value, "udmState");
            return (Criteria) this;
        }

        public Criteria andUdmStateNotEqualTo(BigDecimal value) {
            addCriterion("UDM_STATE <>", value, "udmState");
            return (Criteria) this;
        }

        public Criteria andUdmStateGreaterThan(BigDecimal value) {
            addCriterion("UDM_STATE >", value, "udmState");
            return (Criteria) this;
        }

        public Criteria andUdmStateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("UDM_STATE >=", value, "udmState");
            return (Criteria) this;
        }

        public Criteria andUdmStateLessThan(BigDecimal value) {
            addCriterion("UDM_STATE <", value, "udmState");
            return (Criteria) this;
        }

        public Criteria andUdmStateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("UDM_STATE <=", value, "udmState");
            return (Criteria) this;
        }

        public Criteria andUdmStateIn(List<BigDecimal> values) {
            addCriterion("UDM_STATE in", values, "udmState");
            return (Criteria) this;
        }

        public Criteria andUdmStateNotIn(List<BigDecimal> values) {
            addCriterion("UDM_STATE not in", values, "udmState");
            return (Criteria) this;
        }

        public Criteria andUdmStateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UDM_STATE between", value1, value2, "udmState");
            return (Criteria) this;
        }

        public Criteria andUdmStateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UDM_STATE not between", value1, value2, "udmState");
            return (Criteria) this;
        }

        public Criteria andUdmRc0IsNull() {
            addCriterion("UDM_RC0 is null");
            return (Criteria) this;
        }

        public Criteria andUdmRc0IsNotNull() {
            addCriterion("UDM_RC0 is not null");
            return (Criteria) this;
        }

        public Criteria andUdmRc0EqualTo(String value) {
            addCriterion("UDM_RC0 =", value, "udmRc0");
            return (Criteria) this;
        }

        public Criteria andUdmRc0NotEqualTo(String value) {
            addCriterion("UDM_RC0 <>", value, "udmRc0");
            return (Criteria) this;
        }

        public Criteria andUdmRc0GreaterThan(String value) {
            addCriterion("UDM_RC0 >", value, "udmRc0");
            return (Criteria) this;
        }

        public Criteria andUdmRc0GreaterThanOrEqualTo(String value) {
            addCriterion("UDM_RC0 >=", value, "udmRc0");
            return (Criteria) this;
        }

        public Criteria andUdmRc0LessThan(String value) {
            addCriterion("UDM_RC0 <", value, "udmRc0");
            return (Criteria) this;
        }

        public Criteria andUdmRc0LessThanOrEqualTo(String value) {
            addCriterion("UDM_RC0 <=", value, "udmRc0");
            return (Criteria) this;
        }

        public Criteria andUdmRc0Like(String value) {
            addCriterion("UDM_RC0 like", value, "udmRc0");
            return (Criteria) this;
        }

        public Criteria andUdmRc0NotLike(String value) {
            addCriterion("UDM_RC0 not like", value, "udmRc0");
            return (Criteria) this;
        }

        public Criteria andUdmRc0In(List<String> values) {
            addCriterion("UDM_RC0 in", values, "udmRc0");
            return (Criteria) this;
        }

        public Criteria andUdmRc0NotIn(List<String> values) {
            addCriterion("UDM_RC0 not in", values, "udmRc0");
            return (Criteria) this;
        }

        public Criteria andUdmRc0Between(String value1, String value2) {
            addCriterion("UDM_RC0 between", value1, value2, "udmRc0");
            return (Criteria) this;
        }

        public Criteria andUdmRc0NotBetween(String value1, String value2) {
            addCriterion("UDM_RC0 not between", value1, value2, "udmRc0");
            return (Criteria) this;
        }

        public Criteria andUdmRc1IsNull() {
            addCriterion("UDM_RC1 is null");
            return (Criteria) this;
        }

        public Criteria andUdmRc1IsNotNull() {
            addCriterion("UDM_RC1 is not null");
            return (Criteria) this;
        }

        public Criteria andUdmRc1EqualTo(String value) {
            addCriterion("UDM_RC1 =", value, "udmRc1");
            return (Criteria) this;
        }

        public Criteria andUdmRc1NotEqualTo(String value) {
            addCriterion("UDM_RC1 <>", value, "udmRc1");
            return (Criteria) this;
        }

        public Criteria andUdmRc1GreaterThan(String value) {
            addCriterion("UDM_RC1 >", value, "udmRc1");
            return (Criteria) this;
        }

        public Criteria andUdmRc1GreaterThanOrEqualTo(String value) {
            addCriterion("UDM_RC1 >=", value, "udmRc1");
            return (Criteria) this;
        }

        public Criteria andUdmRc1LessThan(String value) {
            addCriterion("UDM_RC1 <", value, "udmRc1");
            return (Criteria) this;
        }

        public Criteria andUdmRc1LessThanOrEqualTo(String value) {
            addCriterion("UDM_RC1 <=", value, "udmRc1");
            return (Criteria) this;
        }

        public Criteria andUdmRc1Like(String value) {
            addCriterion("UDM_RC1 like", value, "udmRc1");
            return (Criteria) this;
        }

        public Criteria andUdmRc1NotLike(String value) {
            addCriterion("UDM_RC1 not like", value, "udmRc1");
            return (Criteria) this;
        }

        public Criteria andUdmRc1In(List<String> values) {
            addCriterion("UDM_RC1 in", values, "udmRc1");
            return (Criteria) this;
        }

        public Criteria andUdmRc1NotIn(List<String> values) {
            addCriterion("UDM_RC1 not in", values, "udmRc1");
            return (Criteria) this;
        }

        public Criteria andUdmRc1Between(String value1, String value2) {
            addCriterion("UDM_RC1 between", value1, value2, "udmRc1");
            return (Criteria) this;
        }

        public Criteria andUdmRc1NotBetween(String value1, String value2) {
            addCriterion("UDM_RC1 not between", value1, value2, "udmRc1");
            return (Criteria) this;
        }

        public Criteria andUdmRc2IsNull() {
            addCriterion("UDM_RC2 is null");
            return (Criteria) this;
        }

        public Criteria andUdmRc2IsNotNull() {
            addCriterion("UDM_RC2 is not null");
            return (Criteria) this;
        }

        public Criteria andUdmRc2EqualTo(String value) {
            addCriterion("UDM_RC2 =", value, "udmRc2");
            return (Criteria) this;
        }

        public Criteria andUdmRc2NotEqualTo(String value) {
            addCriterion("UDM_RC2 <>", value, "udmRc2");
            return (Criteria) this;
        }

        public Criteria andUdmRc2GreaterThan(String value) {
            addCriterion("UDM_RC2 >", value, "udmRc2");
            return (Criteria) this;
        }

        public Criteria andUdmRc2GreaterThanOrEqualTo(String value) {
            addCriterion("UDM_RC2 >=", value, "udmRc2");
            return (Criteria) this;
        }

        public Criteria andUdmRc2LessThan(String value) {
            addCriterion("UDM_RC2 <", value, "udmRc2");
            return (Criteria) this;
        }

        public Criteria andUdmRc2LessThanOrEqualTo(String value) {
            addCriterion("UDM_RC2 <=", value, "udmRc2");
            return (Criteria) this;
        }

        public Criteria andUdmRc2Like(String value) {
            addCriterion("UDM_RC2 like", value, "udmRc2");
            return (Criteria) this;
        }

        public Criteria andUdmRc2NotLike(String value) {
            addCriterion("UDM_RC2 not like", value, "udmRc2");
            return (Criteria) this;
        }

        public Criteria andUdmRc2In(List<String> values) {
            addCriterion("UDM_RC2 in", values, "udmRc2");
            return (Criteria) this;
        }

        public Criteria andUdmRc2NotIn(List<String> values) {
            addCriterion("UDM_RC2 not in", values, "udmRc2");
            return (Criteria) this;
        }

        public Criteria andUdmRc2Between(String value1, String value2) {
            addCriterion("UDM_RC2 between", value1, value2, "udmRc2");
            return (Criteria) this;
        }

        public Criteria andUdmRc2NotBetween(String value1, String value2) {
            addCriterion("UDM_RC2 not between", value1, value2, "udmRc2");
            return (Criteria) this;
        }

        public Criteria andUdmRc3IsNull() {
            addCriterion("UDM_RC3 is null");
            return (Criteria) this;
        }

        public Criteria andUdmRc3IsNotNull() {
            addCriterion("UDM_RC3 is not null");
            return (Criteria) this;
        }

        public Criteria andUdmRc3EqualTo(String value) {
            addCriterion("UDM_RC3 =", value, "udmRc3");
            return (Criteria) this;
        }

        public Criteria andUdmRc3NotEqualTo(String value) {
            addCriterion("UDM_RC3 <>", value, "udmRc3");
            return (Criteria) this;
        }

        public Criteria andUdmRc3GreaterThan(String value) {
            addCriterion("UDM_RC3 >", value, "udmRc3");
            return (Criteria) this;
        }

        public Criteria andUdmRc3GreaterThanOrEqualTo(String value) {
            addCriterion("UDM_RC3 >=", value, "udmRc3");
            return (Criteria) this;
        }

        public Criteria andUdmRc3LessThan(String value) {
            addCriterion("UDM_RC3 <", value, "udmRc3");
            return (Criteria) this;
        }

        public Criteria andUdmRc3LessThanOrEqualTo(String value) {
            addCriterion("UDM_RC3 <=", value, "udmRc3");
            return (Criteria) this;
        }

        public Criteria andUdmRc3Like(String value) {
            addCriterion("UDM_RC3 like", value, "udmRc3");
            return (Criteria) this;
        }

        public Criteria andUdmRc3NotLike(String value) {
            addCriterion("UDM_RC3 not like", value, "udmRc3");
            return (Criteria) this;
        }

        public Criteria andUdmRc3In(List<String> values) {
            addCriterion("UDM_RC3 in", values, "udmRc3");
            return (Criteria) this;
        }

        public Criteria andUdmRc3NotIn(List<String> values) {
            addCriterion("UDM_RC3 not in", values, "udmRc3");
            return (Criteria) this;
        }

        public Criteria andUdmRc3Between(String value1, String value2) {
            addCriterion("UDM_RC3 between", value1, value2, "udmRc3");
            return (Criteria) this;
        }

        public Criteria andUdmRc3NotBetween(String value1, String value2) {
            addCriterion("UDM_RC3 not between", value1, value2, "udmRc3");
            return (Criteria) this;
        }

        public Criteria andUdmRc4IsNull() {
            addCriterion("UDM_RC4 is null");
            return (Criteria) this;
        }

        public Criteria andUdmRc4IsNotNull() {
            addCriterion("UDM_RC4 is not null");
            return (Criteria) this;
        }

        public Criteria andUdmRc4EqualTo(String value) {
            addCriterion("UDM_RC4 =", value, "udmRc4");
            return (Criteria) this;
        }

        public Criteria andUdmRc4NotEqualTo(String value) {
            addCriterion("UDM_RC4 <>", value, "udmRc4");
            return (Criteria) this;
        }

        public Criteria andUdmRc4GreaterThan(String value) {
            addCriterion("UDM_RC4 >", value, "udmRc4");
            return (Criteria) this;
        }

        public Criteria andUdmRc4GreaterThanOrEqualTo(String value) {
            addCriterion("UDM_RC4 >=", value, "udmRc4");
            return (Criteria) this;
        }

        public Criteria andUdmRc4LessThan(String value) {
            addCriterion("UDM_RC4 <", value, "udmRc4");
            return (Criteria) this;
        }

        public Criteria andUdmRc4LessThanOrEqualTo(String value) {
            addCriterion("UDM_RC4 <=", value, "udmRc4");
            return (Criteria) this;
        }

        public Criteria andUdmRc4Like(String value) {
            addCriterion("UDM_RC4 like", value, "udmRc4");
            return (Criteria) this;
        }

        public Criteria andUdmRc4NotLike(String value) {
            addCriterion("UDM_RC4 not like", value, "udmRc4");
            return (Criteria) this;
        }

        public Criteria andUdmRc4In(List<String> values) {
            addCriterion("UDM_RC4 in", values, "udmRc4");
            return (Criteria) this;
        }

        public Criteria andUdmRc4NotIn(List<String> values) {
            addCriterion("UDM_RC4 not in", values, "udmRc4");
            return (Criteria) this;
        }

        public Criteria andUdmRc4Between(String value1, String value2) {
            addCriterion("UDM_RC4 between", value1, value2, "udmRc4");
            return (Criteria) this;
        }

        public Criteria andUdmRc4NotBetween(String value1, String value2) {
            addCriterion("UDM_RC4 not between", value1, value2, "udmRc4");
            return (Criteria) this;
        }

        public Criteria andUdmRc5IsNull() {
            addCriterion("UDM_RC5 is null");
            return (Criteria) this;
        }

        public Criteria andUdmRc5IsNotNull() {
            addCriterion("UDM_RC5 is not null");
            return (Criteria) this;
        }

        public Criteria andUdmRc5EqualTo(String value) {
            addCriterion("UDM_RC5 =", value, "udmRc5");
            return (Criteria) this;
        }

        public Criteria andUdmRc5NotEqualTo(String value) {
            addCriterion("UDM_RC5 <>", value, "udmRc5");
            return (Criteria) this;
        }

        public Criteria andUdmRc5GreaterThan(String value) {
            addCriterion("UDM_RC5 >", value, "udmRc5");
            return (Criteria) this;
        }

        public Criteria andUdmRc5GreaterThanOrEqualTo(String value) {
            addCriterion("UDM_RC5 >=", value, "udmRc5");
            return (Criteria) this;
        }

        public Criteria andUdmRc5LessThan(String value) {
            addCriterion("UDM_RC5 <", value, "udmRc5");
            return (Criteria) this;
        }

        public Criteria andUdmRc5LessThanOrEqualTo(String value) {
            addCriterion("UDM_RC5 <=", value, "udmRc5");
            return (Criteria) this;
        }

        public Criteria andUdmRc5Like(String value) {
            addCriterion("UDM_RC5 like", value, "udmRc5");
            return (Criteria) this;
        }

        public Criteria andUdmRc5NotLike(String value) {
            addCriterion("UDM_RC5 not like", value, "udmRc5");
            return (Criteria) this;
        }

        public Criteria andUdmRc5In(List<String> values) {
            addCriterion("UDM_RC5 in", values, "udmRc5");
            return (Criteria) this;
        }

        public Criteria andUdmRc5NotIn(List<String> values) {
            addCriterion("UDM_RC5 not in", values, "udmRc5");
            return (Criteria) this;
        }

        public Criteria andUdmRc5Between(String value1, String value2) {
            addCriterion("UDM_RC5 between", value1, value2, "udmRc5");
            return (Criteria) this;
        }

        public Criteria andUdmRc5NotBetween(String value1, String value2) {
            addCriterion("UDM_RC5 not between", value1, value2, "udmRc5");
            return (Criteria) this;
        }

        public Criteria andUdmRc6IsNull() {
            addCriterion("UDM_RC6 is null");
            return (Criteria) this;
        }

        public Criteria andUdmRc6IsNotNull() {
            addCriterion("UDM_RC6 is not null");
            return (Criteria) this;
        }

        public Criteria andUdmRc6EqualTo(BigDecimal value) {
            addCriterion("UDM_RC6 =", value, "udmRc6");
            return (Criteria) this;
        }

        public Criteria andUdmRc6NotEqualTo(BigDecimal value) {
            addCriterion("UDM_RC6 <>", value, "udmRc6");
            return (Criteria) this;
        }

        public Criteria andUdmRc6GreaterThan(BigDecimal value) {
            addCriterion("UDM_RC6 >", value, "udmRc6");
            return (Criteria) this;
        }

        public Criteria andUdmRc6GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("UDM_RC6 >=", value, "udmRc6");
            return (Criteria) this;
        }

        public Criteria andUdmRc6LessThan(BigDecimal value) {
            addCriterion("UDM_RC6 <", value, "udmRc6");
            return (Criteria) this;
        }

        public Criteria andUdmRc6LessThanOrEqualTo(BigDecimal value) {
            addCriterion("UDM_RC6 <=", value, "udmRc6");
            return (Criteria) this;
        }

        public Criteria andUdmRc6In(List<BigDecimal> values) {
            addCriterion("UDM_RC6 in", values, "udmRc6");
            return (Criteria) this;
        }

        public Criteria andUdmRc6NotIn(List<BigDecimal> values) {
            addCriterion("UDM_RC6 not in", values, "udmRc6");
            return (Criteria) this;
        }

        public Criteria andUdmRc6Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("UDM_RC6 between", value1, value2, "udmRc6");
            return (Criteria) this;
        }

        public Criteria andUdmRc6NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UDM_RC6 not between", value1, value2, "udmRc6");
            return (Criteria) this;
        }

        public Criteria andUdmRc7IsNull() {
            addCriterion("UDM_RC7 is null");
            return (Criteria) this;
        }

        public Criteria andUdmRc7IsNotNull() {
            addCriterion("UDM_RC7 is not null");
            return (Criteria) this;
        }

        public Criteria andUdmRc7EqualTo(BigDecimal value) {
            addCriterion("UDM_RC7 =", value, "udmRc7");
            return (Criteria) this;
        }

        public Criteria andUdmRc7NotEqualTo(BigDecimal value) {
            addCriterion("UDM_RC7 <>", value, "udmRc7");
            return (Criteria) this;
        }

        public Criteria andUdmRc7GreaterThan(BigDecimal value) {
            addCriterion("UDM_RC7 >", value, "udmRc7");
            return (Criteria) this;
        }

        public Criteria andUdmRc7GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("UDM_RC7 >=", value, "udmRc7");
            return (Criteria) this;
        }

        public Criteria andUdmRc7LessThan(BigDecimal value) {
            addCriterion("UDM_RC7 <", value, "udmRc7");
            return (Criteria) this;
        }

        public Criteria andUdmRc7LessThanOrEqualTo(BigDecimal value) {
            addCriterion("UDM_RC7 <=", value, "udmRc7");
            return (Criteria) this;
        }

        public Criteria andUdmRc7In(List<BigDecimal> values) {
            addCriterion("UDM_RC7 in", values, "udmRc7");
            return (Criteria) this;
        }

        public Criteria andUdmRc7NotIn(List<BigDecimal> values) {
            addCriterion("UDM_RC7 not in", values, "udmRc7");
            return (Criteria) this;
        }

        public Criteria andUdmRc7Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("UDM_RC7 between", value1, value2, "udmRc7");
            return (Criteria) this;
        }

        public Criteria andUdmRc7NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UDM_RC7 not between", value1, value2, "udmRc7");
            return (Criteria) this;
        }

        public Criteria andUdmRc8IsNull() {
            addCriterion("UDM_RC8 is null");
            return (Criteria) this;
        }

        public Criteria andUdmRc8IsNotNull() {
            addCriterion("UDM_RC8 is not null");
            return (Criteria) this;
        }

        public Criteria andUdmRc8EqualTo(Date value) {
            addCriterionForJDBCDate("UDM_RC8 =", value, "udmRc8");
            return (Criteria) this;
        }

        public Criteria andUdmRc8NotEqualTo(Date value) {
            addCriterionForJDBCDate("UDM_RC8 <>", value, "udmRc8");
            return (Criteria) this;
        }

        public Criteria andUdmRc8GreaterThan(Date value) {
            addCriterionForJDBCDate("UDM_RC8 >", value, "udmRc8");
            return (Criteria) this;
        }

        public Criteria andUdmRc8GreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("UDM_RC8 >=", value, "udmRc8");
            return (Criteria) this;
        }

        public Criteria andUdmRc8LessThan(Date value) {
            addCriterionForJDBCDate("UDM_RC8 <", value, "udmRc8");
            return (Criteria) this;
        }

        public Criteria andUdmRc8LessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("UDM_RC8 <=", value, "udmRc8");
            return (Criteria) this;
        }

        public Criteria andUdmRc8In(List<Date> values) {
            addCriterionForJDBCDate("UDM_RC8 in", values, "udmRc8");
            return (Criteria) this;
        }

        public Criteria andUdmRc8NotIn(List<Date> values) {
            addCriterionForJDBCDate("UDM_RC8 not in", values, "udmRc8");
            return (Criteria) this;
        }

        public Criteria andUdmRc8Between(Date value1, Date value2) {
            addCriterionForJDBCDate("UDM_RC8 between", value1, value2, "udmRc8");
            return (Criteria) this;
        }

        public Criteria andUdmRc8NotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("UDM_RC8 not between", value1, value2, "udmRc8");
            return (Criteria) this;
        }

        public Criteria andUdmRc9IsNull() {
            addCriterion("UDM_RC9 is null");
            return (Criteria) this;
        }

        public Criteria andUdmRc9IsNotNull() {
            addCriterion("UDM_RC9 is not null");
            return (Criteria) this;
        }

        public Criteria andUdmRc9EqualTo(Date value) {
            addCriterionForJDBCDate("UDM_RC9 =", value, "udmRc9");
            return (Criteria) this;
        }

        public Criteria andUdmRc9NotEqualTo(Date value) {
            addCriterionForJDBCDate("UDM_RC9 <>", value, "udmRc9");
            return (Criteria) this;
        }

        public Criteria andUdmRc9GreaterThan(Date value) {
            addCriterionForJDBCDate("UDM_RC9 >", value, "udmRc9");
            return (Criteria) this;
        }

        public Criteria andUdmRc9GreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("UDM_RC9 >=", value, "udmRc9");
            return (Criteria) this;
        }

        public Criteria andUdmRc9LessThan(Date value) {
            addCriterionForJDBCDate("UDM_RC9 <", value, "udmRc9");
            return (Criteria) this;
        }

        public Criteria andUdmRc9LessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("UDM_RC9 <=", value, "udmRc9");
            return (Criteria) this;
        }

        public Criteria andUdmRc9In(List<Date> values) {
            addCriterionForJDBCDate("UDM_RC9 in", values, "udmRc9");
            return (Criteria) this;
        }

        public Criteria andUdmRc9NotIn(List<Date> values) {
            addCriterionForJDBCDate("UDM_RC9 not in", values, "udmRc9");
            return (Criteria) this;
        }

        public Criteria andUdmRc9Between(Date value1, Date value2) {
            addCriterionForJDBCDate("UDM_RC9 between", value1, value2, "udmRc9");
            return (Criteria) this;
        }

        public Criteria andUdmRc9NotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("UDM_RC9 not between", value1, value2, "udmRc9");
            return (Criteria) this;
        }

        public Criteria andUdmUreguidLikeInsensitive(String value) {
            addCriterion("upper(UDM_UREGUID) like", value.toUpperCase(), "udmUreguid");
            return (Criteria) this;
        }

        public Criteria andUdmSsmguidLikeInsensitive(String value) {
            addCriterion("upper(UDM_SSMGUID) like", value.toUpperCase(), "udmSsmguid");
            return (Criteria) this;
        }

        public Criteria andUdmSsmdtguidLikeInsensitive(String value) {
            addCriterion("upper(UDM_SSMDTGUID) like", value.toUpperCase(), "udmSsmdtguid");
            return (Criteria) this;
        }

        public Criteria andUdmValueLikeInsensitive(String value) {
            addCriterion("upper(UDM_VALUE) like", value.toUpperCase(), "udmValue");
            return (Criteria) this;
        }

        public Criteria andUdmRc0LikeInsensitive(String value) {
            addCriterion("upper(UDM_RC0) like", value.toUpperCase(), "udmRc0");
            return (Criteria) this;
        }

        public Criteria andUdmRc1LikeInsensitive(String value) {
            addCriterion("upper(UDM_RC1) like", value.toUpperCase(), "udmRc1");
            return (Criteria) this;
        }

        public Criteria andUdmRc2LikeInsensitive(String value) {
            addCriterion("upper(UDM_RC2) like", value.toUpperCase(), "udmRc2");
            return (Criteria) this;
        }

        public Criteria andUdmRc3LikeInsensitive(String value) {
            addCriterion("upper(UDM_RC3) like", value.toUpperCase(), "udmRc3");
            return (Criteria) this;
        }

        public Criteria andUdmRc4LikeInsensitive(String value) {
            addCriterion("upper(UDM_RC4) like", value.toUpperCase(), "udmRc4");
            return (Criteria) this;
        }

        public Criteria andUdmRc5LikeInsensitive(String value) {
            addCriterion("upper(UDM_RC5) like", value.toUpperCase(), "udmRc5");
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