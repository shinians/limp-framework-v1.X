package com.limp.framework.boss.domain;

import com.limp.framework.core.bean.Pager;

import java.util.ArrayList;
import java.util.List;

public class RolePermissionMapExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Pager page;

    public RolePermissionMapExample() {
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

        public Criteria andRoleidIsNull() {
            addCriterion("SRPM_ROLEID is null");
            return (Criteria) this;
        }

        public Criteria andRoleidIsNotNull() {
            addCriterion("SRPM_ROLEID is not null");
            return (Criteria) this;
        }

        public Criteria andRoleidEqualTo(String value) {
            addCriterion("SRPM_ROLEID =", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidNotEqualTo(String value) {
            addCriterion("SRPM_ROLEID <>", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidGreaterThan(String value) {
            addCriterion("SRPM_ROLEID >", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidGreaterThanOrEqualTo(String value) {
            addCriterion("SRPM_ROLEID >=", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidLessThan(String value) {
            addCriterion("SRPM_ROLEID <", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidLessThanOrEqualTo(String value) {
            addCriterion("SRPM_ROLEID <=", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidLike(String value) {
            addCriterion("SRPM_ROLEID like", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidNotLike(String value) {
            addCriterion("SRPM_ROLEID not like", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidIn(List<String> values) {
            addCriterion("SRPM_ROLEID in", values, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidNotIn(List<String> values) {
            addCriterion("SRPM_ROLEID not in", values, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidBetween(String value1, String value2) {
            addCriterion("SRPM_ROLEID between", value1, value2, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidNotBetween(String value1, String value2) {
            addCriterion("SRPM_ROLEID not between", value1, value2, "roleid");
            return (Criteria) this;
        }

        public Criteria andSprmPeridIsNull() {
            addCriterion("SPRM_PERID is null");
            return (Criteria) this;
        }

        public Criteria andSprmPeridIsNotNull() {
            addCriterion("SPRM_PERID is not null");
            return (Criteria) this;
        }

        public Criteria andSprmPeridEqualTo(String value) {
            addCriterion("SPRM_PERID =", value, "sprmPerid");
            return (Criteria) this;
        }

        public Criteria andSprmPeridNotEqualTo(String value) {
            addCriterion("SPRM_PERID <>", value, "sprmPerid");
            return (Criteria) this;
        }

        public Criteria andSprmPeridGreaterThan(String value) {
            addCriterion("SPRM_PERID >", value, "sprmPerid");
            return (Criteria) this;
        }

        public Criteria andSprmPeridGreaterThanOrEqualTo(String value) {
            addCriterion("SPRM_PERID >=", value, "sprmPerid");
            return (Criteria) this;
        }

        public Criteria andSprmPeridLessThan(String value) {
            addCriterion("SPRM_PERID <", value, "sprmPerid");
            return (Criteria) this;
        }

        public Criteria andSprmPeridLessThanOrEqualTo(String value) {
            addCriterion("SPRM_PERID <=", value, "sprmPerid");
            return (Criteria) this;
        }

        public Criteria andSprmPeridLike(String value) {
            addCriterion("SPRM_PERID like", value, "sprmPerid");
            return (Criteria) this;
        }

        public Criteria andSprmPeridNotLike(String value) {
            addCriterion("SPRM_PERID not like", value, "sprmPerid");
            return (Criteria) this;
        }

        public Criteria andSprmPeridIn(List<String> values) {
            addCriterion("SPRM_PERID in", values, "sprmPerid");
            return (Criteria) this;
        }

        public Criteria andSprmPeridNotIn(List<String> values) {
            addCriterion("SPRM_PERID not in", values, "sprmPerid");
            return (Criteria) this;
        }

        public Criteria andSprmPeridBetween(String value1, String value2) {
            addCriterion("SPRM_PERID between", value1, value2, "sprmPerid");
            return (Criteria) this;
        }

        public Criteria andSprmPeridNotBetween(String value1, String value2) {
            addCriterion("SPRM_PERID not between", value1, value2, "sprmPerid");
            return (Criteria) this;
        }

        public Criteria andRoleidLikeInsensitive(String value) {
            addCriterion("upper(SRPM_ROLEID) like", value.toUpperCase(), "roleid");
            return (Criteria) this;
        }

        public Criteria andSprmPeridLikeInsensitive(String value) {
            addCriterion("upper(SPRM_PERID) like", value.toUpperCase(), "sprmPerid");
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