package com.chinasofti.domain;

import com.limp.framework.core.bean.Pager;

import java.util.ArrayList;
import java.util.List;

public class DrawProc2Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Pager page;

    public DrawProc2Example() {
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
            addCriterion("CDP_ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("CDP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("CDP_ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("CDP_ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("CDP_ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("CDP_ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("CDP_ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("CDP_ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("CDP_ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("CDP_ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("CDP_ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("CDP_ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("CDP_ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("CDP_ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUidIsNull() {
            addCriterion("CDP_UID is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("CDP_UID is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(String value) {
            addCriterion("CDP_UID =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(String value) {
            addCriterion("CDP_UID <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(String value) {
            addCriterion("CDP_UID >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(String value) {
            addCriterion("CDP_UID >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(String value) {
            addCriterion("CDP_UID <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(String value) {
            addCriterion("CDP_UID <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLike(String value) {
            addCriterion("CDP_UID like", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotLike(String value) {
            addCriterion("CDP_UID not like", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<String> values) {
            addCriterion("CDP_UID in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<String> values) {
            addCriterion("CDP_UID not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(String value1, String value2) {
            addCriterion("CDP_UID between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(String value1, String value2) {
            addCriterion("CDP_UID not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andProcuidIsNull() {
            addCriterion("CDP_PROCUID is null");
            return (Criteria) this;
        }

        public Criteria andProcuidIsNotNull() {
            addCriterion("CDP_PROCUID is not null");
            return (Criteria) this;
        }

        public Criteria andProcuidEqualTo(String value) {
            addCriterion("CDP_PROCUID =", value, "procuid");
            return (Criteria) this;
        }

        public Criteria andProcuidNotEqualTo(String value) {
            addCriterion("CDP_PROCUID <>", value, "procuid");
            return (Criteria) this;
        }

        public Criteria andProcuidGreaterThan(String value) {
            addCriterion("CDP_PROCUID >", value, "procuid");
            return (Criteria) this;
        }

        public Criteria andProcuidGreaterThanOrEqualTo(String value) {
            addCriterion("CDP_PROCUID >=", value, "procuid");
            return (Criteria) this;
        }

        public Criteria andProcuidLessThan(String value) {
            addCriterion("CDP_PROCUID <", value, "procuid");
            return (Criteria) this;
        }

        public Criteria andProcuidLessThanOrEqualTo(String value) {
            addCriterion("CDP_PROCUID <=", value, "procuid");
            return (Criteria) this;
        }

        public Criteria andProcuidLike(String value) {
            addCriterion("CDP_PROCUID like", value, "procuid");
            return (Criteria) this;
        }

        public Criteria andProcuidNotLike(String value) {
            addCriterion("CDP_PROCUID not like", value, "procuid");
            return (Criteria) this;
        }

        public Criteria andProcuidIn(List<String> values) {
            addCriterion("CDP_PROCUID in", values, "procuid");
            return (Criteria) this;
        }

        public Criteria andProcuidNotIn(List<String> values) {
            addCriterion("CDP_PROCUID not in", values, "procuid");
            return (Criteria) this;
        }

        public Criteria andProcuidBetween(String value1, String value2) {
            addCriterion("CDP_PROCUID between", value1, value2, "procuid");
            return (Criteria) this;
        }

        public Criteria andProcuidNotBetween(String value1, String value2) {
            addCriterion("CDP_PROCUID not between", value1, value2, "procuid");
            return (Criteria) this;
        }

        public Criteria andDrawnoIsNull() {
            addCriterion("CDP_DRAWNO is null");
            return (Criteria) this;
        }

        public Criteria andDrawnoIsNotNull() {
            addCriterion("CDP_DRAWNO is not null");
            return (Criteria) this;
        }

        public Criteria andDrawnoEqualTo(String value) {
            addCriterion("CDP_DRAWNO =", value, "drawno");
            return (Criteria) this;
        }

        public Criteria andDrawnoNotEqualTo(String value) {
            addCriterion("CDP_DRAWNO <>", value, "drawno");
            return (Criteria) this;
        }

        public Criteria andDrawnoGreaterThan(String value) {
            addCriterion("CDP_DRAWNO >", value, "drawno");
            return (Criteria) this;
        }

        public Criteria andDrawnoGreaterThanOrEqualTo(String value) {
            addCriterion("CDP_DRAWNO >=", value, "drawno");
            return (Criteria) this;
        }

        public Criteria andDrawnoLessThan(String value) {
            addCriterion("CDP_DRAWNO <", value, "drawno");
            return (Criteria) this;
        }

        public Criteria andDrawnoLessThanOrEqualTo(String value) {
            addCriterion("CDP_DRAWNO <=", value, "drawno");
            return (Criteria) this;
        }

        public Criteria andDrawnoLike(String value) {
            addCriterion("CDP_DRAWNO like", value, "drawno");
            return (Criteria) this;
        }

        public Criteria andDrawnoNotLike(String value) {
            addCriterion("CDP_DRAWNO not like", value, "drawno");
            return (Criteria) this;
        }

        public Criteria andDrawnoIn(List<String> values) {
            addCriterion("CDP_DRAWNO in", values, "drawno");
            return (Criteria) this;
        }

        public Criteria andDrawnoNotIn(List<String> values) {
            addCriterion("CDP_DRAWNO not in", values, "drawno");
            return (Criteria) this;
        }

        public Criteria andDrawnoBetween(String value1, String value2) {
            addCriterion("CDP_DRAWNO between", value1, value2, "drawno");
            return (Criteria) this;
        }

        public Criteria andDrawnoNotBetween(String value1, String value2) {
            addCriterion("CDP_DRAWNO not between", value1, value2, "drawno");
            return (Criteria) this;
        }

        public Criteria andAcceptcountIsNull() {
            addCriterion("CDP_ACCEPTCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andAcceptcountIsNotNull() {
            addCriterion("CDP_ACCEPTCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andAcceptcountEqualTo(String value) {
            addCriterion("CDP_ACCEPTCOUNT =", value, "acceptcount");
            return (Criteria) this;
        }

        public Criteria andAcceptcountNotEqualTo(String value) {
            addCriterion("CDP_ACCEPTCOUNT <>", value, "acceptcount");
            return (Criteria) this;
        }

        public Criteria andAcceptcountGreaterThan(String value) {
            addCriterion("CDP_ACCEPTCOUNT >", value, "acceptcount");
            return (Criteria) this;
        }

        public Criteria andAcceptcountGreaterThanOrEqualTo(String value) {
            addCriterion("CDP_ACCEPTCOUNT >=", value, "acceptcount");
            return (Criteria) this;
        }

        public Criteria andAcceptcountLessThan(String value) {
            addCriterion("CDP_ACCEPTCOUNT <", value, "acceptcount");
            return (Criteria) this;
        }

        public Criteria andAcceptcountLessThanOrEqualTo(String value) {
            addCriterion("CDP_ACCEPTCOUNT <=", value, "acceptcount");
            return (Criteria) this;
        }

        public Criteria andAcceptcountLike(String value) {
            addCriterion("CDP_ACCEPTCOUNT like", value, "acceptcount");
            return (Criteria) this;
        }

        public Criteria andAcceptcountNotLike(String value) {
            addCriterion("CDP_ACCEPTCOUNT not like", value, "acceptcount");
            return (Criteria) this;
        }

        public Criteria andAcceptcountIn(List<String> values) {
            addCriterion("CDP_ACCEPTCOUNT in", values, "acceptcount");
            return (Criteria) this;
        }

        public Criteria andAcceptcountNotIn(List<String> values) {
            addCriterion("CDP_ACCEPTCOUNT not in", values, "acceptcount");
            return (Criteria) this;
        }

        public Criteria andAcceptcountBetween(String value1, String value2) {
            addCriterion("CDP_ACCEPTCOUNT between", value1, value2, "acceptcount");
            return (Criteria) this;
        }

        public Criteria andAcceptcountNotBetween(String value1, String value2) {
            addCriterion("CDP_ACCEPTCOUNT not between", value1, value2, "acceptcount");
            return (Criteria) this;
        }

        public Criteria andAcceptsuggIsNull() {
            addCriterion("CDP_ACCEPTSUGG is null");
            return (Criteria) this;
        }

        public Criteria andAcceptsuggIsNotNull() {
            addCriterion("CDP_ACCEPTSUGG is not null");
            return (Criteria) this;
        }

        public Criteria andAcceptsuggEqualTo(String value) {
            addCriterion("CDP_ACCEPTSUGG =", value, "acceptsugg");
            return (Criteria) this;
        }

        public Criteria andAcceptsuggNotEqualTo(String value) {
            addCriterion("CDP_ACCEPTSUGG <>", value, "acceptsugg");
            return (Criteria) this;
        }

        public Criteria andAcceptsuggGreaterThan(String value) {
            addCriterion("CDP_ACCEPTSUGG >", value, "acceptsugg");
            return (Criteria) this;
        }

        public Criteria andAcceptsuggGreaterThanOrEqualTo(String value) {
            addCriterion("CDP_ACCEPTSUGG >=", value, "acceptsugg");
            return (Criteria) this;
        }

        public Criteria andAcceptsuggLessThan(String value) {
            addCriterion("CDP_ACCEPTSUGG <", value, "acceptsugg");
            return (Criteria) this;
        }

        public Criteria andAcceptsuggLessThanOrEqualTo(String value) {
            addCriterion("CDP_ACCEPTSUGG <=", value, "acceptsugg");
            return (Criteria) this;
        }

        public Criteria andAcceptsuggLike(String value) {
            addCriterion("CDP_ACCEPTSUGG like", value, "acceptsugg");
            return (Criteria) this;
        }

        public Criteria andAcceptsuggNotLike(String value) {
            addCriterion("CDP_ACCEPTSUGG not like", value, "acceptsugg");
            return (Criteria) this;
        }

        public Criteria andAcceptsuggIn(List<String> values) {
            addCriterion("CDP_ACCEPTSUGG in", values, "acceptsugg");
            return (Criteria) this;
        }

        public Criteria andAcceptsuggNotIn(List<String> values) {
            addCriterion("CDP_ACCEPTSUGG not in", values, "acceptsugg");
            return (Criteria) this;
        }

        public Criteria andAcceptsuggBetween(String value1, String value2) {
            addCriterion("CDP_ACCEPTSUGG between", value1, value2, "acceptsugg");
            return (Criteria) this;
        }

        public Criteria andAcceptsuggNotBetween(String value1, String value2) {
            addCriterion("CDP_ACCEPTSUGG not between", value1, value2, "acceptsugg");
            return (Criteria) this;
        }

        public Criteria andAccepttimeIsNull() {
            addCriterion("CDP_ACCEPTTIME is null");
            return (Criteria) this;
        }

        public Criteria andAccepttimeIsNotNull() {
            addCriterion("CDP_ACCEPTTIME is not null");
            return (Criteria) this;
        }

        public Criteria andAccepttimeEqualTo(String value) {
            addCriterion("CDP_ACCEPTTIME =", value, "accepttime");
            return (Criteria) this;
        }

        public Criteria andAccepttimeNotEqualTo(String value) {
            addCriterion("CDP_ACCEPTTIME <>", value, "accepttime");
            return (Criteria) this;
        }

        public Criteria andAccepttimeGreaterThan(String value) {
            addCriterion("CDP_ACCEPTTIME >", value, "accepttime");
            return (Criteria) this;
        }

        public Criteria andAccepttimeGreaterThanOrEqualTo(String value) {
            addCriterion("CDP_ACCEPTTIME >=", value, "accepttime");
            return (Criteria) this;
        }

        public Criteria andAccepttimeLessThan(String value) {
            addCriterion("CDP_ACCEPTTIME <", value, "accepttime");
            return (Criteria) this;
        }

        public Criteria andAccepttimeLessThanOrEqualTo(String value) {
            addCriterion("CDP_ACCEPTTIME <=", value, "accepttime");
            return (Criteria) this;
        }

        public Criteria andAccepttimeLike(String value) {
            addCriterion("CDP_ACCEPTTIME like", value, "accepttime");
            return (Criteria) this;
        }

        public Criteria andAccepttimeNotLike(String value) {
            addCriterion("CDP_ACCEPTTIME not like", value, "accepttime");
            return (Criteria) this;
        }

        public Criteria andAccepttimeIn(List<String> values) {
            addCriterion("CDP_ACCEPTTIME in", values, "accepttime");
            return (Criteria) this;
        }

        public Criteria andAccepttimeNotIn(List<String> values) {
            addCriterion("CDP_ACCEPTTIME not in", values, "accepttime");
            return (Criteria) this;
        }

        public Criteria andAccepttimeBetween(String value1, String value2) {
            addCriterion("CDP_ACCEPTTIME between", value1, value2, "accepttime");
            return (Criteria) this;
        }

        public Criteria andAccepttimeNotBetween(String value1, String value2) {
            addCriterion("CDP_ACCEPTTIME not between", value1, value2, "accepttime");
            return (Criteria) this;
        }

        public Criteria andNeedapproIsNull() {
            addCriterion("CDP_NEEDAPPRO is null");
            return (Criteria) this;
        }

        public Criteria andNeedapproIsNotNull() {
            addCriterion("CDP_NEEDAPPRO is not null");
            return (Criteria) this;
        }

        public Criteria andNeedapproEqualTo(String value) {
            addCriterion("CDP_NEEDAPPRO =", value, "needappro");
            return (Criteria) this;
        }

        public Criteria andNeedapproNotEqualTo(String value) {
            addCriterion("CDP_NEEDAPPRO <>", value, "needappro");
            return (Criteria) this;
        }

        public Criteria andNeedapproGreaterThan(String value) {
            addCriterion("CDP_NEEDAPPRO >", value, "needappro");
            return (Criteria) this;
        }

        public Criteria andNeedapproGreaterThanOrEqualTo(String value) {
            addCriterion("CDP_NEEDAPPRO >=", value, "needappro");
            return (Criteria) this;
        }

        public Criteria andNeedapproLessThan(String value) {
            addCriterion("CDP_NEEDAPPRO <", value, "needappro");
            return (Criteria) this;
        }

        public Criteria andNeedapproLessThanOrEqualTo(String value) {
            addCriterion("CDP_NEEDAPPRO <=", value, "needappro");
            return (Criteria) this;
        }

        public Criteria andNeedapproLike(String value) {
            addCriterion("CDP_NEEDAPPRO like", value, "needappro");
            return (Criteria) this;
        }

        public Criteria andNeedapproNotLike(String value) {
            addCriterion("CDP_NEEDAPPRO not like", value, "needappro");
            return (Criteria) this;
        }

        public Criteria andNeedapproIn(List<String> values) {
            addCriterion("CDP_NEEDAPPRO in", values, "needappro");
            return (Criteria) this;
        }

        public Criteria andNeedapproNotIn(List<String> values) {
            addCriterion("CDP_NEEDAPPRO not in", values, "needappro");
            return (Criteria) this;
        }

        public Criteria andNeedapproBetween(String value1, String value2) {
            addCriterion("CDP_NEEDAPPRO between", value1, value2, "needappro");
            return (Criteria) this;
        }

        public Criteria andNeedapproNotBetween(String value1, String value2) {
            addCriterion("CDP_NEEDAPPRO not between", value1, value2, "needappro");
            return (Criteria) this;
        }

        public Criteria andApprosuggIsNull() {
            addCriterion("CDP_APPROSUGG is null");
            return (Criteria) this;
        }

        public Criteria andApprosuggIsNotNull() {
            addCriterion("CDP_APPROSUGG is not null");
            return (Criteria) this;
        }

        public Criteria andApprosuggEqualTo(String value) {
            addCriterion("CDP_APPROSUGG =", value, "approsugg");
            return (Criteria) this;
        }

        public Criteria andApprosuggNotEqualTo(String value) {
            addCriterion("CDP_APPROSUGG <>", value, "approsugg");
            return (Criteria) this;
        }

        public Criteria andApprosuggGreaterThan(String value) {
            addCriterion("CDP_APPROSUGG >", value, "approsugg");
            return (Criteria) this;
        }

        public Criteria andApprosuggGreaterThanOrEqualTo(String value) {
            addCriterion("CDP_APPROSUGG >=", value, "approsugg");
            return (Criteria) this;
        }

        public Criteria andApprosuggLessThan(String value) {
            addCriterion("CDP_APPROSUGG <", value, "approsugg");
            return (Criteria) this;
        }

        public Criteria andApprosuggLessThanOrEqualTo(String value) {
            addCriterion("CDP_APPROSUGG <=", value, "approsugg");
            return (Criteria) this;
        }

        public Criteria andApprosuggLike(String value) {
            addCriterion("CDP_APPROSUGG like", value, "approsugg");
            return (Criteria) this;
        }

        public Criteria andApprosuggNotLike(String value) {
            addCriterion("CDP_APPROSUGG not like", value, "approsugg");
            return (Criteria) this;
        }

        public Criteria andApprosuggIn(List<String> values) {
            addCriterion("CDP_APPROSUGG in", values, "approsugg");
            return (Criteria) this;
        }

        public Criteria andApprosuggNotIn(List<String> values) {
            addCriterion("CDP_APPROSUGG not in", values, "approsugg");
            return (Criteria) this;
        }

        public Criteria andApprosuggBetween(String value1, String value2) {
            addCriterion("CDP_APPROSUGG between", value1, value2, "approsugg");
            return (Criteria) this;
        }

        public Criteria andApprosuggNotBetween(String value1, String value2) {
            addCriterion("CDP_APPROSUGG not between", value1, value2, "approsugg");
            return (Criteria) this;
        }


        public Criteria andIdLikeInsensitive(String value) {
            addCriterion("upper(CDP_ID) like", value.toUpperCase(), "id");
            return (Criteria) this;
        }

        public Criteria andUidLikeInsensitive(String value) {
            addCriterion("upper(CDP_UID) like", value.toUpperCase(), "uid");
            return (Criteria) this;
        }

        public Criteria andProcuidLikeInsensitive(String value) {
            addCriterion("upper(CDP_PROCUID) like", value.toUpperCase(), "procuid");
            return (Criteria) this;
        }

        public Criteria andDrawnoLikeInsensitive(String value) {
            addCriterion("upper(CDP_DRAWNO) like", value.toUpperCase(), "drawno");
            return (Criteria) this;
        }

        public Criteria andAcceptcountLikeInsensitive(String value) {
            addCriterion("upper(CDP_ACCEPTCOUNT) like", value.toUpperCase(), "acceptcount");
            return (Criteria) this;
        }

        public Criteria andAcceptsuggLikeInsensitive(String value) {
            addCriterion("upper(CDP_ACCEPTSUGG) like", value.toUpperCase(), "acceptsugg");
            return (Criteria) this;
        }

        public Criteria andAccepttimeLikeInsensitive(String value) {
            addCriterion("upper(CDP_ACCEPTTIME) like", value.toUpperCase(), "accepttime");
            return (Criteria) this;
        }

        public Criteria andNeedapproLikeInsensitive(String value) {
            addCriterion("upper(CDP_NEEDAPPRO) like", value.toUpperCase(), "needappro");
            return (Criteria) this;
        }

        public Criteria andApprosuggLikeInsensitive(String value) {
            addCriterion("upper(CDP_APPROSUGG) like", value.toUpperCase(), "approsugg");
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