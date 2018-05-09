package com.limp.framework.boss.domain;

import com.limp.framework.core.bean.Pager;

import java.util.ArrayList;
import java.util.List;

public class UserPermissionMapExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Pager page;

    public UserPermissionMapExample() {
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

        public Criteria andUsridIsNull() {
            addCriterion("SUPM_USRID is null");
            return (Criteria) this;
        }

        public Criteria andUsridIsNotNull() {
            addCriterion("SUPM_USRID is not null");
            return (Criteria) this;
        }

        public Criteria andUsridEqualTo(String value) {
            addCriterion("SUPM_USRID =", value, "usrid");
            return (Criteria) this;
        }

        public Criteria andUsridNotEqualTo(String value) {
            addCriterion("SUPM_USRID <>", value, "usrid");
            return (Criteria) this;
        }

        public Criteria andUsridGreaterThan(String value) {
            addCriterion("SUPM_USRID >", value, "usrid");
            return (Criteria) this;
        }

        public Criteria andUsridGreaterThanOrEqualTo(String value) {
            addCriterion("SUPM_USRID >=", value, "usrid");
            return (Criteria) this;
        }

        public Criteria andUsridLessThan(String value) {
            addCriterion("SUPM_USRID <", value, "usrid");
            return (Criteria) this;
        }

        public Criteria andUsridLessThanOrEqualTo(String value) {
            addCriterion("SUPM_USRID <=", value, "usrid");
            return (Criteria) this;
        }

        public Criteria andUsridLike(String value) {
            addCriterion("SUPM_USRID like", value, "usrid");
            return (Criteria) this;
        }

        public Criteria andUsridNotLike(String value) {
            addCriterion("SUPM_USRID not like", value, "usrid");
            return (Criteria) this;
        }

        public Criteria andUsridIn(List<String> values) {
            addCriterion("SUPM_USRID in", values, "usrid");
            return (Criteria) this;
        }

        public Criteria andUsridNotIn(List<String> values) {
            addCriterion("SUPM_USRID not in", values, "usrid");
            return (Criteria) this;
        }

        public Criteria andUsridBetween(String value1, String value2) {
            addCriterion("SUPM_USRID between", value1, value2, "usrid");
            return (Criteria) this;
        }

        public Criteria andUsridNotBetween(String value1, String value2) {
            addCriterion("SUPM_USRID not between", value1, value2, "usrid");
            return (Criteria) this;
        }

        public Criteria andPeridIsNull() {
            addCriterion("SUPM_PERID is null");
            return (Criteria) this;
        }

        public Criteria andPeridIsNotNull() {
            addCriterion("SUPM_PERID is not null");
            return (Criteria) this;
        }

        public Criteria andPeridEqualTo(String value) {
            addCriterion("SUPM_PERID =", value, "perid");
            return (Criteria) this;
        }

        public Criteria andPeridNotEqualTo(String value) {
            addCriterion("SUPM_PERID <>", value, "perid");
            return (Criteria) this;
        }

        public Criteria andPeridGreaterThan(String value) {
            addCriterion("SUPM_PERID >", value, "perid");
            return (Criteria) this;
        }

        public Criteria andPeridGreaterThanOrEqualTo(String value) {
            addCriterion("SUPM_PERID >=", value, "perid");
            return (Criteria) this;
        }

        public Criteria andPeridLessThan(String value) {
            addCriterion("SUPM_PERID <", value, "perid");
            return (Criteria) this;
        }

        public Criteria andPeridLessThanOrEqualTo(String value) {
            addCriterion("SUPM_PERID <=", value, "perid");
            return (Criteria) this;
        }

        public Criteria andPeridLike(String value) {
            addCriterion("SUPM_PERID like", value, "perid");
            return (Criteria) this;
        }

        public Criteria andPeridNotLike(String value) {
            addCriterion("SUPM_PERID not like", value, "perid");
            return (Criteria) this;
        }

        public Criteria andPeridIn(List<String> values) {
            addCriterion("SUPM_PERID in", values, "perid");
            return (Criteria) this;
        }

        public Criteria andPeridNotIn(List<String> values) {
            addCriterion("SUPM_PERID not in", values, "perid");
            return (Criteria) this;
        }

        public Criteria andPeridBetween(String value1, String value2) {
            addCriterion("SUPM_PERID between", value1, value2, "perid");
            return (Criteria) this;
        }

        public Criteria andPeridNotBetween(String value1, String value2) {
            addCriterion("SUPM_PERID not between", value1, value2, "perid");
            return (Criteria) this;
        }

        public Criteria andUsridLikeInsensitive(String value) {
            addCriterion("upper(SUPM_USRID) like", value.toUpperCase(), "usrid");
            return (Criteria) this;
        }

        public Criteria andPeridLikeInsensitive(String value) {
            addCriterion("upper(SUPM_PERID) like", value.toUpperCase(), "perid");
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