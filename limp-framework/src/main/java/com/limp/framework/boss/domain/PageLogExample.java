package com.limp.framework.boss.domain;

import com.limp.framework.core.bean.Pager;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PageLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Pager page;

    public PageLogExample() {
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
            addCriterion("OTL_GUID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("OTL_GUID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("OTL_GUID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("OTL_GUID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("OTL_GUID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("OTL_GUID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("OTL_GUID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("OTL_GUID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("OTL_GUID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("OTL_GUID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("OTL_GUID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("OTL_GUID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("OTL_GUID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("OTL_GUID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andOtlUsrguidIsNull() {
            addCriterion("OTL_USRGUID is null");
            return (Criteria) this;
        }

        public Criteria andOtlUsrguidIsNotNull() {
            addCriterion("OTL_USRGUID is not null");
            return (Criteria) this;
        }

        public Criteria andOtlUsrguidEqualTo(String value) {
            addCriterion("OTL_USRGUID =", value, "otlUsrguid");
            return (Criteria) this;
        }

        public Criteria andOtlUsrguidNotEqualTo(String value) {
            addCriterion("OTL_USRGUID <>", value, "otlUsrguid");
            return (Criteria) this;
        }

        public Criteria andOtlUsrguidGreaterThan(String value) {
            addCriterion("OTL_USRGUID >", value, "otlUsrguid");
            return (Criteria) this;
        }

        public Criteria andOtlUsrguidGreaterThanOrEqualTo(String value) {
            addCriterion("OTL_USRGUID >=", value, "otlUsrguid");
            return (Criteria) this;
        }

        public Criteria andOtlUsrguidLessThan(String value) {
            addCriterion("OTL_USRGUID <", value, "otlUsrguid");
            return (Criteria) this;
        }

        public Criteria andOtlUsrguidLessThanOrEqualTo(String value) {
            addCriterion("OTL_USRGUID <=", value, "otlUsrguid");
            return (Criteria) this;
        }

        public Criteria andOtlUsrguidLike(String value) {
            addCriterion("OTL_USRGUID like", value, "otlUsrguid");
            return (Criteria) this;
        }

        public Criteria andOtlUsrguidNotLike(String value) {
            addCriterion("OTL_USRGUID not like", value, "otlUsrguid");
            return (Criteria) this;
        }

        public Criteria andOtlUsrguidIn(List<String> values) {
            addCriterion("OTL_USRGUID in", values, "otlUsrguid");
            return (Criteria) this;
        }

        public Criteria andOtlUsrguidNotIn(List<String> values) {
            addCriterion("OTL_USRGUID not in", values, "otlUsrguid");
            return (Criteria) this;
        }

        public Criteria andOtlUsrguidBetween(String value1, String value2) {
            addCriterion("OTL_USRGUID between", value1, value2, "otlUsrguid");
            return (Criteria) this;
        }

        public Criteria andOtlUsrguidNotBetween(String value1, String value2) {
            addCriterion("OTL_USRGUID not between", value1, value2, "otlUsrguid");
            return (Criteria) this;
        }

        public Criteria andOtlTypeIsNull() {
            addCriterion("OTL_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andOtlTypeIsNotNull() {
            addCriterion("OTL_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andOtlTypeEqualTo(String value) {
            addCriterion("OTL_TYPE =", value, "otlType");
            return (Criteria) this;
        }
        public Criteria andAccountEqualTo(String value) {
            addCriterion("usr_account =", value, "account");
            return (Criteria) this;
        }

        public Criteria andOtlTypeNotEqualTo(String value) {
            addCriterion("OTL_TYPE <>", value, "otlType");
            return (Criteria) this;
        }

        public Criteria andOtlTypeGreaterThan(String value) {
            addCriterion("OTL_TYPE >", value, "otlType");
            return (Criteria) this;
        }

        public Criteria andOtlTypeGreaterThanOrEqualTo(String value) {
            addCriterion("OTL_TYPE >=", value, "otlType");
            return (Criteria) this;
        }

        public Criteria andOtlTypeLessThan(String value) {
            addCriterion("OTL_TYPE <", value, "otlType");
            return (Criteria) this;
        }

        public Criteria andOtlTypeLessThanOrEqualTo(String value) {
            addCriterion("OTL_TYPE <=", value, "otlType");
            return (Criteria) this;
        }

        public Criteria andOtlTypeLike(String value) {
            addCriterion("OTL_TYPE like", value, "otlType");
            return (Criteria) this;
        }

        public Criteria andOtlTypeNotLike(String value) {
            addCriterion("OTL_TYPE not like", value, "otlType");
            return (Criteria) this;
        }

        public Criteria andOtlTypeIn(List<String> values) {
            addCriterion("OTL_TYPE in", values, "otlType");
            return (Criteria) this;
        }

        public Criteria andOtlTypeNotIn(List<String> values) {
            addCriterion("OTL_TYPE not in", values, "otlType");
            return (Criteria) this;
        }

        public Criteria andOtlTypeBetween(String value1, String value2) {
            addCriterion("OTL_TYPE between", value1, value2, "otlType");
            return (Criteria) this;
        }

        public Criteria andOtlTypeNotBetween(String value1, String value2) {
            addCriterion("OTL_TYPE not between", value1, value2, "otlType");
            return (Criteria) this;
        }

        public Criteria andOtlMenguidIsNull() {
            addCriterion("OTL_MENGUID is null");
            return (Criteria) this;
        }

        public Criteria andOtlMenguidIsNotNull() {
            addCriterion("OTL_MENGUID is not null");
            return (Criteria) this;
        }

        public Criteria andOtlMenguidEqualTo(String value) {
            addCriterion("OTL_MENGUID =", value, "otlMenguid");
            return (Criteria) this;
        }

        public Criteria andOtlMenguidNotEqualTo(String value) {
            addCriterion("OTL_MENGUID <>", value, "otlMenguid");
            return (Criteria) this;
        }

        public Criteria andOtlMenguidGreaterThan(String value) {
            addCriterion("OTL_MENGUID >", value, "otlMenguid");
            return (Criteria) this;
        }

        public Criteria andOtlMenguidGreaterThanOrEqualTo(String value) {
            addCriterion("OTL_MENGUID >=", value, "otlMenguid");
            return (Criteria) this;
        }

        public Criteria andOtlMenguidLessThan(String value) {
            addCriterion("OTL_MENGUID <", value, "otlMenguid");
            return (Criteria) this;
        }

        public Criteria andOtlMenguidLessThanOrEqualTo(String value) {
            addCriterion("OTL_MENGUID <=", value, "otlMenguid");
            return (Criteria) this;
        }

        public Criteria andOtlMenguidLike(String value) {
            addCriterion("OTL_MENGUID like", value, "otlMenguid");
            return (Criteria) this;
        }

        public Criteria andOtlMenguidNotLike(String value) {
            addCriterion("OTL_MENGUID not like", value, "otlMenguid");
            return (Criteria) this;
        }

        public Criteria andOtlMenguidIn(List<String> values) {
            addCriterion("OTL_MENGUID in", values, "otlMenguid");
            return (Criteria) this;
        }

        public Criteria andOtlMenguidNotIn(List<String> values) {
            addCriterion("OTL_MENGUID not in", values, "otlMenguid");
            return (Criteria) this;
        }

        public Criteria andOtlMenguidBetween(String value1, String value2) {
            addCriterion("OTL_MENGUID between", value1, value2, "otlMenguid");
            return (Criteria) this;
        }

        public Criteria andOtlMenguidNotBetween(String value1, String value2) {
            addCriterion("OTL_MENGUID not between", value1, value2, "otlMenguid");
            return (Criteria) this;
        }

        public Criteria andOtlUrlIsNull() {
            addCriterion("OTL_URL is null");
            return (Criteria) this;
        }

        public Criteria andOtlUrlIsNotNull() {
            addCriterion("OTL_URL is not null");
            return (Criteria) this;
        }

        public Criteria andOtlUrlEqualTo(String value) {
            addCriterion("OTL_URL =", value, "otlUrl");
            return (Criteria) this;
        }

        public Criteria andOtlUrlNotEqualTo(String value) {
            addCriterion("OTL_URL <>", value, "otlUrl");
            return (Criteria) this;
        }

        public Criteria andOtlUrlGreaterThan(String value) {
            addCriterion("OTL_URL >", value, "otlUrl");
            return (Criteria) this;
        }

        public Criteria andOtlUrlGreaterThanOrEqualTo(String value) {
            addCriterion("OTL_URL >=", value, "otlUrl");
            return (Criteria) this;
        }

        public Criteria andOtlUrlLessThan(String value) {
            addCriterion("OTL_URL <", value, "otlUrl");
            return (Criteria) this;
        }

        public Criteria andOtlUrlLessThanOrEqualTo(String value) {
            addCriterion("OTL_URL <=", value, "otlUrl");
            return (Criteria) this;
        }

        public Criteria andOtlUrlLike(String value) {
            addCriterion("OTL_URL like", value, "otlUrl");
            return (Criteria) this;
        }

        public Criteria andOtlUrlNotLike(String value) {
            addCriterion("OTL_URL not like", value, "otlUrl");
            return (Criteria) this;
        }

        public Criteria andOtlUrlIn(List<String> values) {
            addCriterion("OTL_URL in", values, "otlUrl");
            return (Criteria) this;
        }

        public Criteria andOtlUrlNotIn(List<String> values) {
            addCriterion("OTL_URL not in", values, "otlUrl");
            return (Criteria) this;
        }

        public Criteria andOtlUrlBetween(String value1, String value2) {
            addCriterion("OTL_URL between", value1, value2, "otlUrl");
            return (Criteria) this;
        }

        public Criteria andOtlUrlNotBetween(String value1, String value2) {
            addCriterion("OTL_URL not between", value1, value2, "otlUrl");
            return (Criteria) this;
        }

        public Criteria andOtlParamsIsNull() {
            addCriterion("OTL_PARAMS is null");
            return (Criteria) this;
        }

        public Criteria andOtlParamsIsNotNull() {
            addCriterion("OTL_PARAMS is not null");
            return (Criteria) this;
        }

        public Criteria andOtlParamsEqualTo(String value) {
            addCriterion("OTL_PARAMS =", value, "otlParams");
            return (Criteria) this;
        }

        public Criteria andOtlParamsNotEqualTo(String value) {
            addCriterion("OTL_PARAMS <>", value, "otlParams");
            return (Criteria) this;
        }

        public Criteria andOtlParamsGreaterThan(String value) {
            addCriterion("OTL_PARAMS >", value, "otlParams");
            return (Criteria) this;
        }

        public Criteria andOtlParamsGreaterThanOrEqualTo(String value) {
            addCriterion("OTL_PARAMS >=", value, "otlParams");
            return (Criteria) this;
        }

        public Criteria andOtlParamsLessThan(String value) {
            addCriterion("OTL_PARAMS <", value, "otlParams");
            return (Criteria) this;
        }

        public Criteria andOtlParamsLessThanOrEqualTo(String value) {
            addCriterion("OTL_PARAMS <=", value, "otlParams");
            return (Criteria) this;
        }

        public Criteria andOtlParamsLike(String value) {
            addCriterion("OTL_PARAMS like", value, "otlParams");
            return (Criteria) this;
        }

        public Criteria andOtlParamsNotLike(String value) {
            addCriterion("OTL_PARAMS not like", value, "otlParams");
            return (Criteria) this;
        }

        public Criteria andOtlParamsIn(List<String> values) {
            addCriterion("OTL_PARAMS in", values, "otlParams");
            return (Criteria) this;
        }

        public Criteria andOtlParamsNotIn(List<String> values) {
            addCriterion("OTL_PARAMS not in", values, "otlParams");
            return (Criteria) this;
        }

        public Criteria andOtlParamsBetween(String value1, String value2) {
            addCriterion("OTL_PARAMS between", value1, value2, "otlParams");
            return (Criteria) this;
        }

        public Criteria andOtlParamsNotBetween(String value1, String value2) {
            addCriterion("OTL_PARAMS not between", value1, value2, "otlParams");
            return (Criteria) this;
        }

        public Criteria andOtlRemarksIsNull() {
            addCriterion("OTL_REMARKS is null");
            return (Criteria) this;
        }

        public Criteria andOtlRemarksIsNotNull() {
            addCriterion("OTL_REMARKS is not null");
            return (Criteria) this;
        }

        public Criteria andOtlRemarksEqualTo(String value) {
            addCriterion("OTL_REMARKS =", value, "otlRemarks");
            return (Criteria) this;
        }

        public Criteria andOtlRemarksNotEqualTo(String value) {
            addCriterion("OTL_REMARKS <>", value, "otlRemarks");
            return (Criteria) this;
        }

        public Criteria andOtlRemarksGreaterThan(String value) {
            addCriterion("OTL_REMARKS >", value, "otlRemarks");
            return (Criteria) this;
        }

        public Criteria andOtlRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("OTL_REMARKS >=", value, "otlRemarks");
            return (Criteria) this;
        }

        public Criteria andOtlRemarksLessThan(String value) {
            addCriterion("OTL_REMARKS <", value, "otlRemarks");
            return (Criteria) this;
        }

        public Criteria andOtlRemarksLessThanOrEqualTo(String value) {
            addCriterion("OTL_REMARKS <=", value, "otlRemarks");
            return (Criteria) this;
        }

        public Criteria andOtlRemarksLike(String value) {
            addCriterion("OTL_REMARKS like", value, "otlRemarks");
            return (Criteria) this;
        }

        public Criteria andOtlRemarksNotLike(String value) {
            addCriterion("OTL_REMARKS not like", value, "otlRemarks");
            return (Criteria) this;
        }

        public Criteria andOtlRemarksIn(List<String> values) {
            addCriterion("OTL_REMARKS in", values, "otlRemarks");
            return (Criteria) this;
        }

        public Criteria andOtlRemarksNotIn(List<String> values) {
            addCriterion("OTL_REMARKS not in", values, "otlRemarks");
            return (Criteria) this;
        }

        public Criteria andOtlRemarksBetween(String value1, String value2) {
            addCriterion("OTL_REMARKS between", value1, value2, "otlRemarks");
            return (Criteria) this;
        }

        public Criteria andOtlRemarksNotBetween(String value1, String value2) {
            addCriterion("OTL_REMARKS not between", value1, value2, "otlRemarks");
            return (Criteria) this;
        }

        public Criteria andOtlStateIsNull() {
            addCriterion("OTL_STATE is null");
            return (Criteria) this;
        }

        public Criteria andOtlStateIsNotNull() {
            addCriterion("OTL_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andOtlStateEqualTo(BigDecimal value) {
            addCriterion("OTL_STATE =", value, "otlState");
            return (Criteria) this;
        }

        public Criteria andOtlStateNotEqualTo(BigDecimal value) {
            addCriterion("OTL_STATE <>", value, "otlState");
            return (Criteria) this;
        }

        public Criteria andOtlStateGreaterThan(BigDecimal value) {
            addCriterion("OTL_STATE >", value, "otlState");
            return (Criteria) this;
        }

        public Criteria andOtlStateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("OTL_STATE >=", value, "otlState");
            return (Criteria) this;
        }

        public Criteria andOtlStateLessThan(BigDecimal value) {
            addCriterion("OTL_STATE <", value, "otlState");
            return (Criteria) this;
        }

        public Criteria andOtlStateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("OTL_STATE <=", value, "otlState");
            return (Criteria) this;
        }

        public Criteria andOtlStateIn(List<BigDecimal> values) {
            addCriterion("OTL_STATE in", values, "otlState");
            return (Criteria) this;
        }

        public Criteria andOtlStateNotIn(List<BigDecimal> values) {
            addCriterion("OTL_STATE not in", values, "otlState");
            return (Criteria) this;
        }

        public Criteria andOtlStateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OTL_STATE between", value1, value2, "otlState");
            return (Criteria) this;
        }

        public Criteria andOtlStateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OTL_STATE not between", value1, value2, "otlState");
            return (Criteria) this;
        }

        public Criteria andOtlTimeIsNull() {
            addCriterion("OTL_TIME is null");
            return (Criteria) this;
        }

        public Criteria andOtlTimeIsNotNull() {
            addCriterion("OTL_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andOtlTimeEqualTo(Date value) {
            addCriterionForJDBCDate("OTL_TIME =", value, "otlTime");
            return (Criteria) this;
        }

        public Criteria andOtlTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("OTL_TIME <>", value, "otlTime");
            return (Criteria) this;
        }

        public Criteria andOtlTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("OTL_TIME >", value, "otlTime");
            return (Criteria) this;
        }

        public Criteria andOtlTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("OTL_TIME >=", value, "otlTime");
            return (Criteria) this;
        }

        public Criteria andOtlTimeLessThan(Date value) {
            addCriterionForJDBCDate("OTL_TIME <", value, "otlTime");
            return (Criteria) this;
        }

        public Criteria andOtlTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("OTL_TIME <=", value, "otlTime");
            return (Criteria) this;
        }

        public Criteria andOtlTimeIn(List<Date> values) {
            addCriterionForJDBCDate("OTL_TIME in", values, "otlTime");
            return (Criteria) this;
        }

        public Criteria andOtlTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("OTL_TIME not in", values, "otlTime");
            return (Criteria) this;
        }

        public Criteria andOtlTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("OTL_TIME between", value1, value2, "otlTime");
            return (Criteria) this;
        }

        public Criteria andOtlTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("OTL_TIME not between", value1, value2, "otlTime");
            return (Criteria) this;
        }

        public Criteria andOtlRc0IsNull() {
            addCriterion("OTL_RC0 is null");
            return (Criteria) this;
        }

        public Criteria andOtlRc0IsNotNull() {
            addCriterion("OTL_RC0 is not null");
            return (Criteria) this;
        }

        public Criteria andOtlRc0EqualTo(String value) {
            addCriterion("OTL_RC0 =", value, "otlRc0");
            return (Criteria) this;
        }

        public Criteria andOtlRc0NotEqualTo(String value) {
            addCriterion("OTL_RC0 <>", value, "otlRc0");
            return (Criteria) this;
        }

        public Criteria andOtlRc0GreaterThan(String value) {
            addCriterion("OTL_RC0 >", value, "otlRc0");
            return (Criteria) this;
        }

        public Criteria andOtlRc0GreaterThanOrEqualTo(String value) {
            addCriterion("OTL_RC0 >=", value, "otlRc0");
            return (Criteria) this;
        }

        public Criteria andOtlRc0LessThan(String value) {
            addCriterion("OTL_RC0 <", value, "otlRc0");
            return (Criteria) this;
        }

        public Criteria andOtlRc0LessThanOrEqualTo(String value) {
            addCriterion("OTL_RC0 <=", value, "otlRc0");
            return (Criteria) this;
        }

        public Criteria andOtlRc0Like(String value) {
            addCriterion("OTL_RC0 like", value, "otlRc0");
            return (Criteria) this;
        }

        public Criteria andOtlRc0NotLike(String value) {
            addCriterion("OTL_RC0 not like", value, "otlRc0");
            return (Criteria) this;
        }

        public Criteria andOtlRc0In(List<String> values) {
            addCriterion("OTL_RC0 in", values, "otlRc0");
            return (Criteria) this;
        }

        public Criteria andOtlRc0NotIn(List<String> values) {
            addCriterion("OTL_RC0 not in", values, "otlRc0");
            return (Criteria) this;
        }

        public Criteria andOtlRc0Between(String value1, String value2) {
            addCriterion("OTL_RC0 between", value1, value2, "otlRc0");
            return (Criteria) this;
        }

        public Criteria andOtlRc0NotBetween(String value1, String value2) {
            addCriterion("OTL_RC0 not between", value1, value2, "otlRc0");
            return (Criteria) this;
        }

        public Criteria andOtlRc1IsNull() {
            addCriterion("OTL_RC1 is null");
            return (Criteria) this;
        }

        public Criteria andOtlRc1IsNotNull() {
            addCriterion("OTL_RC1 is not null");
            return (Criteria) this;
        }

        public Criteria andOtlRc1EqualTo(String value) {
            addCriterion("OTL_RC1 =", value, "otlRc1");
            return (Criteria) this;
        }

        public Criteria andOtlRc1NotEqualTo(String value) {
            addCriterion("OTL_RC1 <>", value, "otlRc1");
            return (Criteria) this;
        }

        public Criteria andOtlRc1GreaterThan(String value) {
            addCriterion("OTL_RC1 >", value, "otlRc1");
            return (Criteria) this;
        }

        public Criteria andOtlRc1GreaterThanOrEqualTo(String value) {
            addCriterion("OTL_RC1 >=", value, "otlRc1");
            return (Criteria) this;
        }

        public Criteria andOtlRc1LessThan(String value) {
            addCriterion("OTL_RC1 <", value, "otlRc1");
            return (Criteria) this;
        }

        public Criteria andOtlRc1LessThanOrEqualTo(String value) {
            addCriterion("OTL_RC1 <=", value, "otlRc1");
            return (Criteria) this;
        }

        public Criteria andOtlRc1Like(String value) {
            addCriterion("OTL_RC1 like", value, "otlRc1");
            return (Criteria) this;
        }

        public Criteria andOtlRc1NotLike(String value) {
            addCriterion("OTL_RC1 not like", value, "otlRc1");
            return (Criteria) this;
        }

        public Criteria andOtlRc1In(List<String> values) {
            addCriterion("OTL_RC1 in", values, "otlRc1");
            return (Criteria) this;
        }

        public Criteria andOtlRc1NotIn(List<String> values) {
            addCriterion("OTL_RC1 not in", values, "otlRc1");
            return (Criteria) this;
        }

        public Criteria andOtlRc1Between(String value1, String value2) {
            addCriterion("OTL_RC1 between", value1, value2, "otlRc1");
            return (Criteria) this;
        }

        public Criteria andOtlRc1NotBetween(String value1, String value2) {
            addCriterion("OTL_RC1 not between", value1, value2, "otlRc1");
            return (Criteria) this;
        }

        public Criteria andOtlRc2IsNull() {
            addCriterion("OTL_RC2 is null");
            return (Criteria) this;
        }

        public Criteria andOtlRc2IsNotNull() {
            addCriterion("OTL_RC2 is not null");
            return (Criteria) this;
        }

        public Criteria andOtlRc2EqualTo(String value) {
            addCriterion("OTL_RC2 =", value, "otlRc2");
            return (Criteria) this;
        }

        public Criteria andOtlRc2NotEqualTo(String value) {
            addCriterion("OTL_RC2 <>", value, "otlRc2");
            return (Criteria) this;
        }

        public Criteria andOtlRc2GreaterThan(String value) {
            addCriterion("OTL_RC2 >", value, "otlRc2");
            return (Criteria) this;
        }

        public Criteria andOtlRc2GreaterThanOrEqualTo(String value) {
            addCriterion("OTL_RC2 >=", value, "otlRc2");
            return (Criteria) this;
        }

        public Criteria andOtlRc2LessThan(String value) {
            addCriterion("OTL_RC2 <", value, "otlRc2");
            return (Criteria) this;
        }

        public Criteria andOtlRc2LessThanOrEqualTo(String value) {
            addCriterion("OTL_RC2 <=", value, "otlRc2");
            return (Criteria) this;
        }

        public Criteria andOtlRc2Like(String value) {
            addCriterion("OTL_RC2 like", value, "otlRc2");
            return (Criteria) this;
        }

        public Criteria andOtlRc2NotLike(String value) {
            addCriterion("OTL_RC2 not like", value, "otlRc2");
            return (Criteria) this;
        }

        public Criteria andOtlRc2In(List<String> values) {
            addCriterion("OTL_RC2 in", values, "otlRc2");
            return (Criteria) this;
        }

        public Criteria andOtlRc2NotIn(List<String> values) {
            addCriterion("OTL_RC2 not in", values, "otlRc2");
            return (Criteria) this;
        }

        public Criteria andOtlRc2Between(String value1, String value2) {
            addCriterion("OTL_RC2 between", value1, value2, "otlRc2");
            return (Criteria) this;
        }

        public Criteria andOtlRc2NotBetween(String value1, String value2) {
            addCriterion("OTL_RC2 not between", value1, value2, "otlRc2");
            return (Criteria) this;
        }

        public Criteria andOtlRc3IsNull() {
            addCriterion("OTL_RC3 is null");
            return (Criteria) this;
        }

        public Criteria andOtlRc3IsNotNull() {
            addCriterion("OTL_RC3 is not null");
            return (Criteria) this;
        }

        public Criteria andOtlRc3EqualTo(BigDecimal value) {
            addCriterion("OTL_RC3 =", value, "otlRc3");
            return (Criteria) this;
        }

        public Criteria andOtlRc3NotEqualTo(BigDecimal value) {
            addCriterion("OTL_RC3 <>", value, "otlRc3");
            return (Criteria) this;
        }

        public Criteria andOtlRc3GreaterThan(BigDecimal value) {
            addCriterion("OTL_RC3 >", value, "otlRc3");
            return (Criteria) this;
        }

        public Criteria andOtlRc3GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("OTL_RC3 >=", value, "otlRc3");
            return (Criteria) this;
        }

        public Criteria andOtlRc3LessThan(BigDecimal value) {
            addCriterion("OTL_RC3 <", value, "otlRc3");
            return (Criteria) this;
        }

        public Criteria andOtlRc3LessThanOrEqualTo(BigDecimal value) {
            addCriterion("OTL_RC3 <=", value, "otlRc3");
            return (Criteria) this;
        }

        public Criteria andOtlRc3In(List<BigDecimal> values) {
            addCriterion("OTL_RC3 in", values, "otlRc3");
            return (Criteria) this;
        }

        public Criteria andOtlRc3NotIn(List<BigDecimal> values) {
            addCriterion("OTL_RC3 not in", values, "otlRc3");
            return (Criteria) this;
        }

        public Criteria andOtlRc3Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("OTL_RC3 between", value1, value2, "otlRc3");
            return (Criteria) this;
        }

        public Criteria andOtlRc3NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OTL_RC3 not between", value1, value2, "otlRc3");
            return (Criteria) this;
        }

        public Criteria andOtlRc4IsNull() {
            addCriterion("OTL_RC4 is null");
            return (Criteria) this;
        }

        public Criteria andOtlRc4IsNotNull() {
            addCriterion("OTL_RC4 is not null");
            return (Criteria) this;
        }

        public Criteria andOtlRc4EqualTo(BigDecimal value) {
            addCriterion("OTL_RC4 =", value, "otlRc4");
            return (Criteria) this;
        }

        public Criteria andOtlRc4NotEqualTo(BigDecimal value) {
            addCriterion("OTL_RC4 <>", value, "otlRc4");
            return (Criteria) this;
        }

        public Criteria andOtlRc4GreaterThan(BigDecimal value) {
            addCriterion("OTL_RC4 >", value, "otlRc4");
            return (Criteria) this;
        }

        public Criteria andOtlRc4GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("OTL_RC4 >=", value, "otlRc4");
            return (Criteria) this;
        }

        public Criteria andOtlRc4LessThan(BigDecimal value) {
            addCriterion("OTL_RC4 <", value, "otlRc4");
            return (Criteria) this;
        }

        public Criteria andOtlRc4LessThanOrEqualTo(BigDecimal value) {
            addCriterion("OTL_RC4 <=", value, "otlRc4");
            return (Criteria) this;
        }

        public Criteria andOtlRc4In(List<BigDecimal> values) {
            addCriterion("OTL_RC4 in", values, "otlRc4");
            return (Criteria) this;
        }

        public Criteria andOtlRc4NotIn(List<BigDecimal> values) {
            addCriterion("OTL_RC4 not in", values, "otlRc4");
            return (Criteria) this;
        }

        public Criteria andOtlRc4Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("OTL_RC4 between", value1, value2, "otlRc4");
            return (Criteria) this;
        }

        public Criteria andOtlRc4NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OTL_RC4 not between", value1, value2, "otlRc4");
            return (Criteria) this;
        }

        public Criteria andOtlRc5IsNull() {
            addCriterion("OTL_RC5 is null");
            return (Criteria) this;
        }

        public Criteria andOtlRc5IsNotNull() {
            addCriterion("OTL_RC5 is not null");
            return (Criteria) this;
        }

        public Criteria andOtlRc5EqualTo(Date value) {
            addCriterionForJDBCDate("OTL_RC5 =", value, "otlRc5");
            return (Criteria) this;
        }

        public Criteria andOtlRc5NotEqualTo(Date value) {
            addCriterionForJDBCDate("OTL_RC5 <>", value, "otlRc5");
            return (Criteria) this;
        }

        public Criteria andOtlRc5GreaterThan(Date value) {
            addCriterionForJDBCDate("OTL_RC5 >", value, "otlRc5");
            return (Criteria) this;
        }

        public Criteria andOtlRc5GreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("OTL_RC5 >=", value, "otlRc5");
            return (Criteria) this;
        }

        public Criteria andOtlRc5LessThan(Date value) {
            addCriterionForJDBCDate("OTL_RC5 <", value, "otlRc5");
            return (Criteria) this;
        }

        public Criteria andOtlRc5LessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("OTL_RC5 <=", value, "otlRc5");
            return (Criteria) this;
        }

        public Criteria andOtlRc5In(List<Date> values) {
            addCriterionForJDBCDate("OTL_RC5 in", values, "otlRc5");
            return (Criteria) this;
        }

        public Criteria andOtlRc5NotIn(List<Date> values) {
            addCriterionForJDBCDate("OTL_RC5 not in", values, "otlRc5");
            return (Criteria) this;
        }

        public Criteria andOtlRc5Between(Date value1, Date value2) {
            addCriterionForJDBCDate("OTL_RC5 between", value1, value2, "otlRc5");
            return (Criteria) this;
        }

        public Criteria andOtlRc5NotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("OTL_RC5 not between", value1, value2, "otlRc5");
            return (Criteria) this;
        }

        public Criteria andOtlUsrguidLikeInsensitive(String value) {
            addCriterion("upper(OTL_USRGUID) like", value.toUpperCase(), "otlUsrguid");
            return (Criteria) this;
        }

        public Criteria andOtlTypeLikeInsensitive(String value) {
            addCriterion("upper(OTL_TYPE) like", value.toUpperCase(), "otlType");
            return (Criteria) this;
        }

        public Criteria andOtlMenguidLikeInsensitive(String value) {
            addCriterion("upper(OTL_MENGUID) like", value.toUpperCase(), "otlMenguid");
            return (Criteria) this;
        }

        public Criteria andOtlUrlLikeInsensitive(String value) {
            addCriterion("upper(OTL_URL) like", value.toUpperCase(), "otlUrl");
            return (Criteria) this;
        }

        public Criteria andOtlParamsLikeInsensitive(String value) {
            addCriterion("upper(OTL_PARAMS) like", value.toUpperCase(), "otlParams");
            return (Criteria) this;
        }

        public Criteria andOtlRemarksLikeInsensitive(String value) {
            addCriterion("upper(OTL_REMARKS) like", value.toUpperCase(), "otlRemarks");
            return (Criteria) this;
        }

        public Criteria andOtlRc0LikeInsensitive(String value) {
            addCriterion("upper(OTL_RC0) like", value.toUpperCase(), "otlRc0");
            return (Criteria) this;
        }

        public Criteria andOtlRc1LikeInsensitive(String value) {
            addCriterion("upper(OTL_RC1) like", value.toUpperCase(), "otlRc1");
            return (Criteria) this;
        }

        public Criteria andOtlRc2LikeInsensitive(String value) {
            addCriterion("upper(OTL_RC2) like", value.toUpperCase(), "otlRc2");
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