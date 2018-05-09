package com.chinasofti.domain;

import com.limp.framework.core.bean.Pager;

import java.util.ArrayList;
import java.util.List;

public class ThemDrawJbxxExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Pager page;

    public ThemDrawJbxxExample() {
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

        public Criteria andEntidIsNull() {
            addCriterion("ENTID is null");
            return (Criteria) this;
        }

        public Criteria andEntidIsNotNull() {
            addCriterion("ENTID is not null");
            return (Criteria) this;
        }

        public Criteria andEntidEqualTo(String value) {
            addCriterion("ENTID =", value, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidNotEqualTo(String value) {
            addCriterion("ENTID <>", value, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidGreaterThan(String value) {
            addCriterion("ENTID >", value, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidGreaterThanOrEqualTo(String value) {
            addCriterion("ENTID >=", value, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidLessThan(String value) {
            addCriterion("ENTID <", value, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidLessThanOrEqualTo(String value) {
            addCriterion("ENTID <=", value, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidLike(String value) {
            addCriterion("ENTID like", value, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidNotLike(String value) {
            addCriterion("ENTID not like", value, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidIn(List<String> values) {
            addCriterion("ENTID in", values, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidNotIn(List<String> values) {
            addCriterion("ENTID not in", values, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidBetween(String value1, String value2) {
            addCriterion("ENTID between", value1, value2, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidNotBetween(String value1, String value2) {
            addCriterion("ENTID not between", value1, value2, "entid");
            return (Criteria) this;
        }

        public Criteria andEntnameIsNull() {
            addCriterion("ENTNAME is null");
            return (Criteria) this;
        }

        public Criteria andEntnameIsNotNull() {
            addCriterion("ENTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andEntnameEqualTo(String value) {
            addCriterion("ENTNAME =", value, "entname");
            return (Criteria) this;
        }

        public Criteria andEntnameNotEqualTo(String value) {
            addCriterion("ENTNAME <>", value, "entname");
            return (Criteria) this;
        }

        public Criteria andEntnameGreaterThan(String value) {
            addCriterion("ENTNAME >", value, "entname");
            return (Criteria) this;
        }

        public Criteria andEntnameGreaterThanOrEqualTo(String value) {
            addCriterion("ENTNAME >=", value, "entname");
            return (Criteria) this;
        }

        public Criteria andEntnameLessThan(String value) {
            addCriterion("ENTNAME <", value, "entname");
            return (Criteria) this;
        }

        public Criteria andEntnameLessThanOrEqualTo(String value) {
            addCriterion("ENTNAME <=", value, "entname");
            return (Criteria) this;
        }

        public Criteria andEntnameLike(String value) {
            addCriterion("ENTNAME like", value, "entname");
            return (Criteria) this;
        }

        public Criteria andEntnameNotLike(String value) {
            addCriterion("ENTNAME not like", value, "entname");
            return (Criteria) this;
        }

        public Criteria andEntnameIn(List<String> values) {
            addCriterion("ENTNAME in", values, "entname");
            return (Criteria) this;
        }

        public Criteria andEntnameNotIn(List<String> values) {
            addCriterion("ENTNAME not in", values, "entname");
            return (Criteria) this;
        }

        public Criteria andEntnameBetween(String value1, String value2) {
            addCriterion("ENTNAME between", value1, value2, "entname");
            return (Criteria) this;
        }

        public Criteria andEntnameNotBetween(String value1, String value2) {
            addCriterion("ENTNAME not between", value1, value2, "entname");
            return (Criteria) this;
        }

        public Criteria andEnttypeIsNull() {
            addCriterion("ENTTYPE is null");
            return (Criteria) this;
        }

        public Criteria andEnttypeIsNotNull() {
            addCriterion("ENTTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andEnttypeEqualTo(String value) {
            addCriterion("ENTTYPE =", value, "enttype");
            return (Criteria) this;
        }

        public Criteria andEnttypeNotEqualTo(String value) {
            addCriterion("ENTTYPE <>", value, "enttype");
            return (Criteria) this;
        }

        public Criteria andEnttypeGreaterThan(String value) {
            addCriterion("ENTTYPE >", value, "enttype");
            return (Criteria) this;
        }

        public Criteria andEnttypeGreaterThanOrEqualTo(String value) {
            addCriterion("ENTTYPE >=", value, "enttype");
            return (Criteria) this;
        }

        public Criteria andEnttypeLessThan(String value) {
            addCriterion("ENTTYPE <", value, "enttype");
            return (Criteria) this;
        }

        public Criteria andEnttypeLessThanOrEqualTo(String value) {
            addCriterion("ENTTYPE <=", value, "enttype");
            return (Criteria) this;
        }

        public Criteria andEnttypeLike(String value) {
            addCriterion("ENTTYPE like", value, "enttype");
            return (Criteria) this;
        }

        public Criteria andEnttypeNotLike(String value) {
            addCriterion("ENTTYPE not like", value, "enttype");
            return (Criteria) this;
        }

        public Criteria andEnttypeIn(List<String> values) {
            addCriterion("ENTTYPE in", values, "enttype");
            return (Criteria) this;
        }

        public Criteria andEnttypeNotIn(List<String> values) {
            addCriterion("ENTTYPE not in", values, "enttype");
            return (Criteria) this;
        }

        public Criteria andEnttypeBetween(String value1, String value2) {
            addCriterion("ENTTYPE between", value1, value2, "enttype");
            return (Criteria) this;
        }

        public Criteria andEnttypeNotBetween(String value1, String value2) {
            addCriterion("ENTTYPE not between", value1, value2, "enttype");
            return (Criteria) this;
        }

        public Criteria andAreacodeIsNull() {
            addCriterion("AREACODE is null");
            return (Criteria) this;
        }

        public Criteria andAreacodeIsNotNull() {
            addCriterion("AREACODE is not null");
            return (Criteria) this;
        }

        public Criteria andAreacodeEqualTo(String value) {
            addCriterion("AREACODE =", value, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeNotEqualTo(String value) {
            addCriterion("AREACODE <>", value, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeGreaterThan(String value) {
            addCriterion("AREACODE >", value, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeGreaterThanOrEqualTo(String value) {
            addCriterion("AREACODE >=", value, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeLessThan(String value) {
            addCriterion("AREACODE <", value, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeLessThanOrEqualTo(String value) {
            addCriterion("AREACODE <=", value, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeLike(String value) {
            addCriterion("AREACODE like", value, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeNotLike(String value) {
            addCriterion("AREACODE not like", value, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeIn(List<String> values) {
            addCriterion("AREACODE in", values, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeNotIn(List<String> values) {
            addCriterion("AREACODE not in", values, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeBetween(String value1, String value2) {
            addCriterion("AREACODE between", value1, value2, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeNotBetween(String value1, String value2) {
            addCriterion("AREACODE not between", value1, value2, "areacode");
            return (Criteria) this;
        }

        public Criteria andDrawidIsNull() {
            addCriterion("DRAWID is null");
            return (Criteria) this;
        }

        public Criteria andDrawidIsNotNull() {
            addCriterion("DRAWID is not null");
            return (Criteria) this;
        }

        public Criteria andDrawidEqualTo(String value) {
            addCriterion("DRAWID =", value, "drawid");
            return (Criteria) this;
        }

        public Criteria andDrawidNotEqualTo(String value) {
            addCriterion("DRAWID <>", value, "drawid");
            return (Criteria) this;
        }

        public Criteria andDrawidGreaterThan(String value) {
            addCriterion("DRAWID >", value, "drawid");
            return (Criteria) this;
        }

        public Criteria andDrawidGreaterThanOrEqualTo(String value) {
            addCriterion("DRAWID >=", value, "drawid");
            return (Criteria) this;
        }

        public Criteria andDrawidLessThan(String value) {
            addCriterion("DRAWID <", value, "drawid");
            return (Criteria) this;
        }

        public Criteria andDrawidLessThanOrEqualTo(String value) {
            addCriterion("DRAWID <=", value, "drawid");
            return (Criteria) this;
        }

        public Criteria andDrawidLike(String value) {
            addCriterion("DRAWID like", value, "drawid");
            return (Criteria) this;
        }

        public Criteria andDrawidNotLike(String value) {
            addCriterion("DRAWID not like", value, "drawid");
            return (Criteria) this;
        }

        public Criteria andDrawidIn(List<String> values) {
            addCriterion("DRAWID in", values, "drawid");
            return (Criteria) this;
        }

        public Criteria andDrawidNotIn(List<String> values) {
            addCriterion("DRAWID not in", values, "drawid");
            return (Criteria) this;
        }

        public Criteria andDrawidBetween(String value1, String value2) {
            addCriterion("DRAWID between", value1, value2, "drawid");
            return (Criteria) this;
        }

        public Criteria andDrawidNotBetween(String value1, String value2) {
            addCriterion("DRAWID not between", value1, value2, "drawid");
            return (Criteria) this;
        }

        public Criteria andReplytimeIsNull() {
            addCriterion("REPLYTIME is null");
            return (Criteria) this;
        }

        public Criteria andReplytimeIsNotNull() {
            addCriterion("REPLYTIME is not null");
            return (Criteria) this;
        }

        public Criteria andReplytimeEqualTo(String value) {
            addCriterion("REPLYTIME =", value, "replytime");
            return (Criteria) this;
        }

        public Criteria andReplytimeNotEqualTo(String value) {
            addCriterion("REPLYTIME <>", value, "replytime");
            return (Criteria) this;
        }

        public Criteria andReplytimeGreaterThan(String value) {
            addCriterion("REPLYTIME >", value, "replytime");
            return (Criteria) this;
        }

        public Criteria andReplytimeGreaterThanOrEqualTo(String value) {
            addCriterion("REPLYTIME >=", value, "replytime");
            return (Criteria) this;
        }

        public Criteria andReplytimeLessThan(String value) {
            addCriterion("REPLYTIME <", value, "replytime");
            return (Criteria) this;
        }

        public Criteria andReplytimeLessThanOrEqualTo(String value) {
            addCriterion("REPLYTIME <=", value, "replytime");
            return (Criteria) this;
        }

        public Criteria andReplytimeLike(String value) {
            addCriterion("REPLYTIME like", value, "replytime");
            return (Criteria) this;
        }

        public Criteria andReplytimeNotLike(String value) {
            addCriterion("REPLYTIME not like", value, "replytime");
            return (Criteria) this;
        }

        public Criteria andReplytimeIn(List<String> values) {
            addCriterion("REPLYTIME in", values, "replytime");
            return (Criteria) this;
        }

        public Criteria andReplytimeNotIn(List<String> values) {
            addCriterion("REPLYTIME not in", values, "replytime");
            return (Criteria) this;
        }

        public Criteria andReplytimeBetween(String value1, String value2) {
            addCriterion("REPLYTIME between", value1, value2, "replytime");
            return (Criteria) this;
        }

        public Criteria andReplytimeNotBetween(String value1, String value2) {
            addCriterion("REPLYTIME not between", value1, value2, "replytime");
            return (Criteria) this;
        }

        public Criteria andChecknumIsNull() {
            addCriterion("CHECKNUM is null");
            return (Criteria) this;
        }

        public Criteria andChecknumIsNotNull() {
            addCriterion("CHECKNUM is not null");
            return (Criteria) this;
        }

        public Criteria andChecknumEqualTo(String value) {
            addCriterion("CHECKNUM =", value, "checknum");
            return (Criteria) this;
        }

        public Criteria andChecknumNotEqualTo(String value) {
            addCriterion("CHECKNUM <>", value, "checknum");
            return (Criteria) this;
        }

        public Criteria andChecknumGreaterThan(String value) {
            addCriterion("CHECKNUM >", value, "checknum");
            return (Criteria) this;
        }

        public Criteria andChecknumGreaterThanOrEqualTo(String value) {
            addCriterion("CHECKNUM >=", value, "checknum");
            return (Criteria) this;
        }

        public Criteria andChecknumLessThan(String value) {
            addCriterion("CHECKNUM <", value, "checknum");
            return (Criteria) this;
        }

        public Criteria andChecknumLessThanOrEqualTo(String value) {
            addCriterion("CHECKNUM <=", value, "checknum");
            return (Criteria) this;
        }

        public Criteria andChecknumLike(String value) {
            addCriterion("CHECKNUM like", value, "checknum");
            return (Criteria) this;
        }

        public Criteria andChecknumNotLike(String value) {
            addCriterion("CHECKNUM not like", value, "checknum");
            return (Criteria) this;
        }

        public Criteria andChecknumIn(List<String> values) {
            addCriterion("CHECKNUM in", values, "checknum");
            return (Criteria) this;
        }

        public Criteria andChecknumNotIn(List<String> values) {
            addCriterion("CHECKNUM not in", values, "checknum");
            return (Criteria) this;
        }

        public Criteria andChecknumBetween(String value1, String value2) {
            addCriterion("CHECKNUM between", value1, value2, "checknum");
            return (Criteria) this;
        }

        public Criteria andChecknumNotBetween(String value1, String value2) {
            addCriterion("CHECKNUM not between", value1, value2, "checknum");
            return (Criteria) this;
        }

        public Criteria andWorkareaIsNull() {
            addCriterion("WORKAREA is null");
            return (Criteria) this;
        }

        public Criteria andWorkareaIsNotNull() {
            addCriterion("WORKAREA is not null");
            return (Criteria) this;
        }

        public Criteria andWorkareaEqualTo(String value) {
            addCriterion("WORKAREA =", value, "workarea");
            return (Criteria) this;
        }

        public Criteria andWorkareaNotEqualTo(String value) {
            addCriterion("WORKAREA <>", value, "workarea");
            return (Criteria) this;
        }

        public Criteria andWorkareaGreaterThan(String value) {
            addCriterion("WORKAREA >", value, "workarea");
            return (Criteria) this;
        }

        public Criteria andWorkareaGreaterThanOrEqualTo(String value) {
            addCriterion("WORKAREA >=", value, "workarea");
            return (Criteria) this;
        }

        public Criteria andWorkareaLessThan(String value) {
            addCriterion("WORKAREA <", value, "workarea");
            return (Criteria) this;
        }

        public Criteria andWorkareaLessThanOrEqualTo(String value) {
            addCriterion("WORKAREA <=", value, "workarea");
            return (Criteria) this;
        }

        public Criteria andWorkareaLike(String value) {
            addCriterion("WORKAREA like", value, "workarea");
            return (Criteria) this;
        }

        public Criteria andWorkareaNotLike(String value) {
            addCriterion("WORKAREA not like", value, "workarea");
            return (Criteria) this;
        }

        public Criteria andWorkareaIn(List<String> values) {
            addCriterion("WORKAREA in", values, "workarea");
            return (Criteria) this;
        }

        public Criteria andWorkareaNotIn(List<String> values) {
            addCriterion("WORKAREA not in", values, "workarea");
            return (Criteria) this;
        }

        public Criteria andWorkareaBetween(String value1, String value2) {
            addCriterion("WORKAREA between", value1, value2, "workarea");
            return (Criteria) this;
        }

        public Criteria andWorkareaNotBetween(String value1, String value2) {
            addCriterion("WORKAREA not between", value1, value2, "workarea");
            return (Criteria) this;
        }

        public Criteria andEntidLikeInsensitive(String value) {
            addCriterion("upper(ENTID) like", value.toUpperCase(), "entid");
            return (Criteria) this;
        }

        public Criteria andEntnameLikeInsensitive(String value) {
            addCriterion("upper(ENTNAME) like", value.toUpperCase(), "entname");
            return (Criteria) this;
        }

        public Criteria andEnttypeLikeInsensitive(String value) {
            addCriterion("upper(ENTTYPE) like", value.toUpperCase(), "enttype");
            return (Criteria) this;
        }

        public Criteria andAreacodeLikeInsensitive(String value) {
            addCriterion("upper(AREACODE) like", value.toUpperCase(), "areacode");
            return (Criteria) this;
        }

        public Criteria andDrawidLikeInsensitive(String value) {
            addCriterion("upper(DRAWID) like", value.toUpperCase(), "drawid");
            return (Criteria) this;
        }

        public Criteria andReplytimeLikeInsensitive(String value) {
            addCriterion("upper(REPLYTIME) like", value.toUpperCase(), "replytime");
            return (Criteria) this;
        }

        public Criteria andChecknumLikeInsensitive(String value) {
            addCriterion("upper(CHECKNUM) like", value.toUpperCase(), "checknum");
            return (Criteria) this;
        }

        public Criteria andWorkareaLikeInsensitive(String value) {
            addCriterion("upper(WORKAREA) like", value.toUpperCase(), "workarea");
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