package com.limp.framework.boss.domain;

import com.limp.framework.core.bean.Pager;

import java.util.ArrayList;
import java.util.List;

public class UserRoleMapExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Pager page;

    public UserRoleMapExample() {
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

        public Criteria andUrmUsrguidIsNull() {
            addCriterion("URM_USRGUID is null");
            return (Criteria) this;
        }

        public Criteria andUrmUsrguidIsNotNull() {
            addCriterion("URM_USRGUID is not null");
            return (Criteria) this;
        }

        public Criteria andUrmUsrguidEqualTo(String value) {
            addCriterion("URM_USRGUID =", value, "urmUsrguid");
            return (Criteria) this;
        }

        public Criteria andUrmUsrguidNotEqualTo(String value) {
            addCriterion("URM_USRGUID <>", value, "urmUsrguid");
            return (Criteria) this;
        }

        public Criteria andUrmUsrguidGreaterThan(String value) {
            addCriterion("URM_USRGUID >", value, "urmUsrguid");
            return (Criteria) this;
        }

        public Criteria andUrmUsrguidGreaterThanOrEqualTo(String value) {
            addCriterion("URM_USRGUID >=", value, "urmUsrguid");
            return (Criteria) this;
        }

        public Criteria andUrmUsrguidLessThan(String value) {
            addCriterion("URM_USRGUID <", value, "urmUsrguid");
            return (Criteria) this;
        }

        public Criteria andUrmUsrguidLessThanOrEqualTo(String value) {
            addCriterion("URM_USRGUID <=", value, "urmUsrguid");
            return (Criteria) this;
        }

        public Criteria andUrmUsrguidLike(String value) {
            addCriterion("URM_USRGUID like", value, "urmUsrguid");
            return (Criteria) this;
        }

        public Criteria andUrmUsrguidNotLike(String value) {
            addCriterion("URM_USRGUID not like", value, "urmUsrguid");
            return (Criteria) this;
        }

        public Criteria andUrmUsrguidIn(List<String> values) {
            addCriterion("URM_USRGUID in", values, "urmUsrguid");
            return (Criteria) this;
        }

        public Criteria andUrmUsrguidNotIn(List<String> values) {
            addCriterion("URM_USRGUID not in", values, "urmUsrguid");
            return (Criteria) this;
        }

        public Criteria andUrmUsrguidBetween(String value1, String value2) {
            addCriterion("URM_USRGUID between", value1, value2, "urmUsrguid");
            return (Criteria) this;
        }

        public Criteria andUrmUsrguidNotBetween(String value1, String value2) {
            addCriterion("URM_USRGUID not between", value1, value2, "urmUsrguid");
            return (Criteria) this;
        }

        public Criteria andUrmUreguidIsNull() {
            addCriterion("URM_UREGUID is null");
            return (Criteria) this;
        }

        public Criteria andUrmUreguidIsNotNull() {
            addCriterion("URM_UREGUID is not null");
            return (Criteria) this;
        }

        public Criteria andUrmUreguidEqualTo(String value) {
            addCriterion("URM_UREGUID =", value, "urmUreguid");
            return (Criteria) this;
        }

        public Criteria andUrmUreguidNotEqualTo(String value) {
            addCriterion("URM_UREGUID <>", value, "urmUreguid");
            return (Criteria) this;
        }

        public Criteria andUrmUreguidGreaterThan(String value) {
            addCriterion("URM_UREGUID >", value, "urmUreguid");
            return (Criteria) this;
        }

        public Criteria andUrmUreguidGreaterThanOrEqualTo(String value) {
            addCriterion("URM_UREGUID >=", value, "urmUreguid");
            return (Criteria) this;
        }

        public Criteria andUrmUreguidLessThan(String value) {
            addCriterion("URM_UREGUID <", value, "urmUreguid");
            return (Criteria) this;
        }

        public Criteria andUrmUreguidLessThanOrEqualTo(String value) {
            addCriterion("URM_UREGUID <=", value, "urmUreguid");
            return (Criteria) this;
        }

        public Criteria andUrmUreguidLike(String value) {
            addCriterion("URM_UREGUID like", value, "urmUreguid");
            return (Criteria) this;
        }

        public Criteria andUrmUreguidNotLike(String value) {
            addCriterion("URM_UREGUID not like", value, "urmUreguid");
            return (Criteria) this;
        }

        public Criteria andUrmUreguidIn(List<String> values) {
            addCriterion("URM_UREGUID in", values, "urmUreguid");
            return (Criteria) this;
        }

        public Criteria andUrmUreguidNotIn(List<String> values) {
            addCriterion("URM_UREGUID not in", values, "urmUreguid");
            return (Criteria) this;
        }

        public Criteria andUrmUreguidBetween(String value1, String value2) {
            addCriterion("URM_UREGUID between", value1, value2, "urmUreguid");
            return (Criteria) this;
        }

        public Criteria andUrmUreguidNotBetween(String value1, String value2) {
            addCriterion("URM_UREGUID not between", value1, value2, "urmUreguid");
            return (Criteria) this;
        }

        public Criteria andUrmUsrguidLikeInsensitive(String value) {
            addCriterion("upper(URM_USRGUID) like", value.toUpperCase(), "urmUsrguid");
            return (Criteria) this;
        }

        public Criteria andUrmUreguidLikeInsensitive(String value) {
            addCriterion("upper(URM_UREGUID) like", value.toUpperCase(), "urmUreguid");
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