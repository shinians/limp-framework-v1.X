package com.chinasofti.domain;

import com.limp.framework.core.bean.Pager;

import java.util.ArrayList;
import java.util.List;

public class EntClassExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Pager page;

    public EntClassExample() {
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

        public Criteria andUidIsNull() {
            addCriterion("CE_UID is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("CE_UID is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(String value) {
            addCriterion("CE_UID =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(String value) {
            addCriterion("CE_UID <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(String value) {
            addCriterion("CE_UID >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(String value) {
            addCriterion("CE_UID >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(String value) {
            addCriterion("CE_UID <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(String value) {
            addCriterion("CE_UID <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLike(String value) {
            addCriterion("CE_UID like", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotLike(String value) {
            addCriterion("CE_UID not like", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<String> values) {
            addCriterion("CE_UID in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<String> values) {
            addCriterion("CE_UID not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(String value1, String value2) {
            addCriterion("CE_UID between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(String value1, String value2) {
            addCriterion("CE_UID not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andEntidIsNull() {
            addCriterion("CE_ENTID is null");
            return (Criteria) this;
        }

        public Criteria andEntidIsNotNull() {
            addCriterion("CE_ENTID is not null");
            return (Criteria) this;
        }

        public Criteria andEntidEqualTo(String value) {
            addCriterion("CE_ENTID =", value, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidNotEqualTo(String value) {
            addCriterion("CE_ENTID <>", value, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidGreaterThan(String value) {
            addCriterion("CE_ENTID >", value, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidGreaterThanOrEqualTo(String value) {
            addCriterion("CE_ENTID >=", value, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidLessThan(String value) {
            addCriterion("CE_ENTID <", value, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidLessThanOrEqualTo(String value) {
            addCriterion("CE_ENTID <=", value, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidLike(String value) {
            addCriterion("CE_ENTID like", value, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidNotLike(String value) {
            addCriterion("CE_ENTID not like", value, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidIn(List<String> values) {
            addCriterion("CE_ENTID in", values, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidNotIn(List<String> values) {
            addCriterion("CE_ENTID not in", values, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidBetween(String value1, String value2) {
            addCriterion("CE_ENTID between", value1, value2, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidNotBetween(String value1, String value2) {
            addCriterion("CE_ENTID not between", value1, value2, "entid");
            return (Criteria) this;
        }

        public Criteria andEvaluatorIsNull() {
            addCriterion("CE_EVALUATOR is null");
            return (Criteria) this;
        }

        public Criteria andEvaluatorIsNotNull() {
            addCriterion("CE_EVALUATOR is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluatorEqualTo(String value) {
            addCriterion("CE_EVALUATOR =", value, "evaluator");
            return (Criteria) this;
        }

        public Criteria andEvaluatorNotEqualTo(String value) {
            addCriterion("CE_EVALUATOR <>", value, "evaluator");
            return (Criteria) this;
        }

        public Criteria andEvaluatorGreaterThan(String value) {
            addCriterion("CE_EVALUATOR >", value, "evaluator");
            return (Criteria) this;
        }

        public Criteria andEvaluatorGreaterThanOrEqualTo(String value) {
            addCriterion("CE_EVALUATOR >=", value, "evaluator");
            return (Criteria) this;
        }

        public Criteria andEvaluatorLessThan(String value) {
            addCriterion("CE_EVALUATOR <", value, "evaluator");
            return (Criteria) this;
        }

        public Criteria andEvaluatorLessThanOrEqualTo(String value) {
            addCriterion("CE_EVALUATOR <=", value, "evaluator");
            return (Criteria) this;
        }

        public Criteria andEvaluatorLike(String value) {
            addCriterion("CE_EVALUATOR like", value, "evaluator");
            return (Criteria) this;
        }

        public Criteria andEvaluatorNotLike(String value) {
            addCriterion("CE_EVALUATOR not like", value, "evaluator");
            return (Criteria) this;
        }

        public Criteria andEvaluatorIn(List<String> values) {
            addCriterion("CE_EVALUATOR in", values, "evaluator");
            return (Criteria) this;
        }

        public Criteria andEvaluatorNotIn(List<String> values) {
            addCriterion("CE_EVALUATOR not in", values, "evaluator");
            return (Criteria) this;
        }

        public Criteria andEvaluatorBetween(String value1, String value2) {
            addCriterion("CE_EVALUATOR between", value1, value2, "evaluator");
            return (Criteria) this;
        }

        public Criteria andEvaluatorNotBetween(String value1, String value2) {
            addCriterion("CE_EVALUATOR not between", value1, value2, "evaluator");
            return (Criteria) this;
        }

        public Criteria andEvaluattimeIsNull() {
            addCriterion("CE_EVALUATTIME is null");
            return (Criteria) this;
        }

        public Criteria andEvaluattimeIsNotNull() {
            addCriterion("CE_EVALUATTIME is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluattimeEqualTo(String value) {
            addCriterion("CE_EVALUATTIME =", value, "evaluattime");
            return (Criteria) this;
        }

        public Criteria andEvaluattimeNotEqualTo(String value) {
            addCriterion("CE_EVALUATTIME <>", value, "evaluattime");
            return (Criteria) this;
        }

        public Criteria andEvaluattimeGreaterThan(String value) {
            addCriterion("CE_EVALUATTIME >", value, "evaluattime");
            return (Criteria) this;
        }

        public Criteria andEvaluattimeGreaterThanOrEqualTo(String value) {
            addCriterion("CE_EVALUATTIME >=", value, "evaluattime");
            return (Criteria) this;
        }

        public Criteria andEvaluattimeLessThan(String value) {
            addCriterion("CE_EVALUATTIME <", value, "evaluattime");
            return (Criteria) this;
        }

        public Criteria andEvaluattimeLessThanOrEqualTo(String value) {
            addCriterion("CE_EVALUATTIME <=", value, "evaluattime");
            return (Criteria) this;
        }

        public Criteria andEvaluattimeLike(String value) {
            addCriterion("CE_EVALUATTIME like", value, "evaluattime");
            return (Criteria) this;
        }

        public Criteria andEvaluattimeNotLike(String value) {
            addCriterion("CE_EVALUATTIME not like", value, "evaluattime");
            return (Criteria) this;
        }

        public Criteria andEvaluattimeIn(List<String> values) {
            addCriterion("CE_EVALUATTIME in", values, "evaluattime");
            return (Criteria) this;
        }

        public Criteria andEvaluattimeNotIn(List<String> values) {
            addCriterion("CE_EVALUATTIME not in", values, "evaluattime");
            return (Criteria) this;
        }

        public Criteria andEvaluattimeBetween(String value1, String value2) {
            addCriterion("CE_EVALUATTIME between", value1, value2, "evaluattime");
            return (Criteria) this;
        }

        public Criteria andEvaluattimeNotBetween(String value1, String value2) {
            addCriterion("CE_EVALUATTIME not between", value1, value2, "evaluattime");
            return (Criteria) this;
        }

        public Criteria andDetailIsNull() {
            addCriterion("CE_DETAIL is null");
            return (Criteria) this;
        }

        public Criteria andDetailIsNotNull() {
            addCriterion("CE_DETAIL is not null");
            return (Criteria) this;
        }

        public Criteria andDetailEqualTo(String value) {
            addCriterion("CE_DETAIL =", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailNotEqualTo(String value) {
            addCriterion("CE_DETAIL <>", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailGreaterThan(String value) {
            addCriterion("CE_DETAIL >", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailGreaterThanOrEqualTo(String value) {
            addCriterion("CE_DETAIL >=", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailLessThan(String value) {
            addCriterion("CE_DETAIL <", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailLessThanOrEqualTo(String value) {
            addCriterion("CE_DETAIL <=", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailLike(String value) {
            addCriterion("CE_DETAIL like", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailNotLike(String value) {
            addCriterion("CE_DETAIL not like", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailIn(List<String> values) {
            addCriterion("CE_DETAIL in", values, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailNotIn(List<String> values) {
            addCriterion("CE_DETAIL not in", values, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailBetween(String value1, String value2) {
            addCriterion("CE_DETAIL between", value1, value2, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailNotBetween(String value1, String value2) {
            addCriterion("CE_DETAIL not between", value1, value2, "detail");
            return (Criteria) this;
        }

        public Criteria andStandartIsNull() {
            addCriterion("CE_STANDART is null");
            return (Criteria) this;
        }

        public Criteria andStandartIsNotNull() {
            addCriterion("CE_STANDART is not null");
            return (Criteria) this;
        }

        public Criteria andStandartEqualTo(String value) {
            addCriterion("CE_STANDART =", value, "standart");
            return (Criteria) this;
        }

        public Criteria andStandartNotEqualTo(String value) {
            addCriterion("CE_STANDART <>", value, "standart");
            return (Criteria) this;
        }

        public Criteria andStandartGreaterThan(String value) {
            addCriterion("CE_STANDART >", value, "standart");
            return (Criteria) this;
        }

        public Criteria andStandartGreaterThanOrEqualTo(String value) {
            addCriterion("CE_STANDART >=", value, "standart");
            return (Criteria) this;
        }

        public Criteria andStandartLessThan(String value) {
            addCriterion("CE_STANDART <", value, "standart");
            return (Criteria) this;
        }

        public Criteria andStandartLessThanOrEqualTo(String value) {
            addCriterion("CE_STANDART <=", value, "standart");
            return (Criteria) this;
        }

        public Criteria andStandartLike(String value) {
            addCriterion("CE_STANDART like", value, "standart");
            return (Criteria) this;
        }

        public Criteria andStandartNotLike(String value) {
            addCriterion("CE_STANDART not like", value, "standart");
            return (Criteria) this;
        }

        public Criteria andStandartIn(List<String> values) {
            addCriterion("CE_STANDART in", values, "standart");
            return (Criteria) this;
        }

        public Criteria andStandartNotIn(List<String> values) {
            addCriterion("CE_STANDART not in", values, "standart");
            return (Criteria) this;
        }

        public Criteria andStandartBetween(String value1, String value2) {
            addCriterion("CE_STANDART between", value1, value2, "standart");
            return (Criteria) this;
        }

        public Criteria andStandartNotBetween(String value1, String value2) {
            addCriterion("CE_STANDART not between", value1, value2, "standart");
            return (Criteria) this;
        }

        public Criteria andEntvalueIsNull() {
            addCriterion("CE_ENTVALUE is null");
            return (Criteria) this;
        }

        public Criteria andEntvalueIsNotNull() {
            addCriterion("CE_ENTVALUE is not null");
            return (Criteria) this;
        }

        public Criteria andEntvalueEqualTo(String value) {
            addCriterion("CE_ENTVALUE =", value, "entvalue");
            return (Criteria) this;
        }

        public Criteria andEntvalueNotEqualTo(String value) {
            addCriterion("CE_ENTVALUE <>", value, "entvalue");
            return (Criteria) this;
        }

        public Criteria andEntvalueGreaterThan(String value) {
            addCriterion("CE_ENTVALUE >", value, "entvalue");
            return (Criteria) this;
        }

        public Criteria andEntvalueGreaterThanOrEqualTo(String value) {
            addCriterion("CE_ENTVALUE >=", value, "entvalue");
            return (Criteria) this;
        }

        public Criteria andEntvalueLessThan(String value) {
            addCriterion("CE_ENTVALUE <", value, "entvalue");
            return (Criteria) this;
        }

        public Criteria andEntvalueLessThanOrEqualTo(String value) {
            addCriterion("CE_ENTVALUE <=", value, "entvalue");
            return (Criteria) this;
        }

        public Criteria andEntvalueLike(String value) {
            addCriterion("CE_ENTVALUE like", value, "entvalue");
            return (Criteria) this;
        }

        public Criteria andEntvalueNotLike(String value) {
            addCriterion("CE_ENTVALUE not like", value, "entvalue");
            return (Criteria) this;
        }

        public Criteria andEntvalueIn(List<String> values) {
            addCriterion("CE_ENTVALUE in", values, "entvalue");
            return (Criteria) this;
        }

        public Criteria andEntvalueNotIn(List<String> values) {
            addCriterion("CE_ENTVALUE not in", values, "entvalue");
            return (Criteria) this;
        }

        public Criteria andEntvalueBetween(String value1, String value2) {
            addCriterion("CE_ENTVALUE between", value1, value2, "entvalue");
            return (Criteria) this;
        }

        public Criteria andEntvalueNotBetween(String value1, String value2) {
            addCriterion("CE_ENTVALUE not between", value1, value2, "entvalue");
            return (Criteria) this;
        }

        public Criteria andUidLikeInsensitive(String value) {
            addCriterion("upper(CE_UID) like", value.toUpperCase(), "uid");
            return (Criteria) this;
        }

        public Criteria andEntidLikeInsensitive(String value) {
            addCriterion("upper(CE_ENTID) like", value.toUpperCase(), "entid");
            return (Criteria) this;
        }

        public Criteria andEvaluatorLikeInsensitive(String value) {
            addCriterion("upper(CE_EVALUATOR) like", value.toUpperCase(), "evaluator");
            return (Criteria) this;
        }

        public Criteria andEvaluattimeLikeInsensitive(String value) {
            addCriterion("upper(CE_EVALUATTIME) like", value.toUpperCase(), "evaluattime");
            return (Criteria) this;
        }

        public Criteria andDetailLikeInsensitive(String value) {
            addCriterion("upper(CE_DETAIL) like", value.toUpperCase(), "detail");
            return (Criteria) this;
        }

        public Criteria andStandartLikeInsensitive(String value) {
            addCriterion("upper(CE_STANDART) like", value.toUpperCase(), "standart");
            return (Criteria) this;
        }

        public Criteria andEntvalueLikeInsensitive(String value) {
            addCriterion("upper(CE_ENTVALUE) like", value.toUpperCase(), "entvalue");
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