package com.chinasofti.domain;

import com.limp.framework.core.bean.Pager;

import java.util.ArrayList;
import java.util.List;

public class ThemProductYwhzExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Pager page;

    public ThemProductYwhzExample() {
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

        public Criteria andEntcateIsNull() {
            addCriterion("ENTCATE is null");
            return (Criteria) this;
        }

        public Criteria andEntcateIsNotNull() {
            addCriterion("ENTCATE is not null");
            return (Criteria) this;
        }

        public Criteria andEntcateEqualTo(String value) {
            addCriterion("ENTCATE =", value, "entcate");
            return (Criteria) this;
        }

        public Criteria andEntcateNotEqualTo(String value) {
            addCriterion("ENTCATE <>", value, "entcate");
            return (Criteria) this;
        }

        public Criteria andEntcateGreaterThan(String value) {
            addCriterion("ENTCATE >", value, "entcate");
            return (Criteria) this;
        }

        public Criteria andEntcateGreaterThanOrEqualTo(String value) {
            addCriterion("ENTCATE >=", value, "entcate");
            return (Criteria) this;
        }

        public Criteria andEntcateLessThan(String value) {
            addCriterion("ENTCATE <", value, "entcate");
            return (Criteria) this;
        }

        public Criteria andEntcateLessThanOrEqualTo(String value) {
            addCriterion("ENTCATE <=", value, "entcate");
            return (Criteria) this;
        }

        public Criteria andEntcateLike(String value) {
            addCriterion("ENTCATE like", value, "entcate");
            return (Criteria) this;
        }

        public Criteria andEntcateNotLike(String value) {
            addCriterion("ENTCATE not like", value, "entcate");
            return (Criteria) this;
        }

        public Criteria andEntcateIn(List<String> values) {
            addCriterion("ENTCATE in", values, "entcate");
            return (Criteria) this;
        }

        public Criteria andEntcateNotIn(List<String> values) {
            addCriterion("ENTCATE not in", values, "entcate");
            return (Criteria) this;
        }

        public Criteria andEntcateBetween(String value1, String value2) {
            addCriterion("ENTCATE between", value1, value2, "entcate");
            return (Criteria) this;
        }

        public Criteria andEntcateNotBetween(String value1, String value2) {
            addCriterion("ENTCATE not between", value1, value2, "entcate");
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

        public Criteria andFirstapptimeIsNull() {
            addCriterion("FIRSTAPPTIME is null");
            return (Criteria) this;
        }

        public Criteria andFirstapptimeIsNotNull() {
            addCriterion("FIRSTAPPTIME is not null");
            return (Criteria) this;
        }

        public Criteria andFirstapptimeEqualTo(String value) {
            addCriterion("FIRSTAPPTIME =", value, "firstapptime");
            return (Criteria) this;
        }

        public Criteria andFirstapptimeNotEqualTo(String value) {
            addCriterion("FIRSTAPPTIME <>", value, "firstapptime");
            return (Criteria) this;
        }

        public Criteria andFirstapptimeGreaterThan(String value) {
            addCriterion("FIRSTAPPTIME >", value, "firstapptime");
            return (Criteria) this;
        }

        public Criteria andFirstapptimeGreaterThanOrEqualTo(String value) {
            addCriterion("FIRSTAPPTIME >=", value, "firstapptime");
            return (Criteria) this;
        }

        public Criteria andFirstapptimeLessThan(String value) {
            addCriterion("FIRSTAPPTIME <", value, "firstapptime");
            return (Criteria) this;
        }

        public Criteria andFirstapptimeLessThanOrEqualTo(String value) {
            addCriterion("FIRSTAPPTIME <=", value, "firstapptime");
            return (Criteria) this;
        }

        public Criteria andFirstapptimeLike(String value) {
            addCriterion("FIRSTAPPTIME like", value, "firstapptime");
            return (Criteria) this;
        }

        public Criteria andFirstapptimeNotLike(String value) {
            addCriterion("FIRSTAPPTIME not like", value, "firstapptime");
            return (Criteria) this;
        }

        public Criteria andFirstapptimeIn(List<String> values) {
            addCriterion("FIRSTAPPTIME in", values, "firstapptime");
            return (Criteria) this;
        }

        public Criteria andFirstapptimeNotIn(List<String> values) {
            addCriterion("FIRSTAPPTIME not in", values, "firstapptime");
            return (Criteria) this;
        }

        public Criteria andFirstapptimeBetween(String value1, String value2) {
            addCriterion("FIRSTAPPTIME between", value1, value2, "firstapptime");
            return (Criteria) this;
        }

        public Criteria andFirstapptimeNotBetween(String value1, String value2) {
            addCriterion("FIRSTAPPTIME not between", value1, value2, "firstapptime");
            return (Criteria) this;
        }

        public Criteria andRecapptimeIsNull() {
            addCriterion("RECAPPTIME is null");
            return (Criteria) this;
        }

        public Criteria andRecapptimeIsNotNull() {
            addCriterion("RECAPPTIME is not null");
            return (Criteria) this;
        }

        public Criteria andRecapptimeEqualTo(String value) {
            addCriterion("RECAPPTIME =", value, "recapptime");
            return (Criteria) this;
        }

        public Criteria andRecapptimeNotEqualTo(String value) {
            addCriterion("RECAPPTIME <>", value, "recapptime");
            return (Criteria) this;
        }

        public Criteria andRecapptimeGreaterThan(String value) {
            addCriterion("RECAPPTIME >", value, "recapptime");
            return (Criteria) this;
        }

        public Criteria andRecapptimeGreaterThanOrEqualTo(String value) {
            addCriterion("RECAPPTIME >=", value, "recapptime");
            return (Criteria) this;
        }

        public Criteria andRecapptimeLessThan(String value) {
            addCriterion("RECAPPTIME <", value, "recapptime");
            return (Criteria) this;
        }

        public Criteria andRecapptimeLessThanOrEqualTo(String value) {
            addCriterion("RECAPPTIME <=", value, "recapptime");
            return (Criteria) this;
        }

        public Criteria andRecapptimeLike(String value) {
            addCriterion("RECAPPTIME like", value, "recapptime");
            return (Criteria) this;
        }

        public Criteria andRecapptimeNotLike(String value) {
            addCriterion("RECAPPTIME not like", value, "recapptime");
            return (Criteria) this;
        }

        public Criteria andRecapptimeIn(List<String> values) {
            addCriterion("RECAPPTIME in", values, "recapptime");
            return (Criteria) this;
        }

        public Criteria andRecapptimeNotIn(List<String> values) {
            addCriterion("RECAPPTIME not in", values, "recapptime");
            return (Criteria) this;
        }

        public Criteria andRecapptimeBetween(String value1, String value2) {
            addCriterion("RECAPPTIME between", value1, value2, "recapptime");
            return (Criteria) this;
        }

        public Criteria andRecapptimeNotBetween(String value1, String value2) {
            addCriterion("RECAPPTIME not between", value1, value2, "recapptime");
            return (Criteria) this;
        }

        public Criteria andNextapptimeIsNull() {
            addCriterion("NEXTAPPTIME is null");
            return (Criteria) this;
        }

        public Criteria andNextapptimeIsNotNull() {
            addCriterion("NEXTAPPTIME is not null");
            return (Criteria) this;
        }

        public Criteria andNextapptimeEqualTo(String value) {
            addCriterion("NEXTAPPTIME =", value, "nextapptime");
            return (Criteria) this;
        }

        public Criteria andNextapptimeNotEqualTo(String value) {
            addCriterion("NEXTAPPTIME <>", value, "nextapptime");
            return (Criteria) this;
        }

        public Criteria andNextapptimeGreaterThan(String value) {
            addCriterion("NEXTAPPTIME >", value, "nextapptime");
            return (Criteria) this;
        }

        public Criteria andNextapptimeGreaterThanOrEqualTo(String value) {
            addCriterion("NEXTAPPTIME >=", value, "nextapptime");
            return (Criteria) this;
        }

        public Criteria andNextapptimeLessThan(String value) {
            addCriterion("NEXTAPPTIME <", value, "nextapptime");
            return (Criteria) this;
        }

        public Criteria andNextapptimeLessThanOrEqualTo(String value) {
            addCriterion("NEXTAPPTIME <=", value, "nextapptime");
            return (Criteria) this;
        }

        public Criteria andNextapptimeLike(String value) {
            addCriterion("NEXTAPPTIME like", value, "nextapptime");
            return (Criteria) this;
        }

        public Criteria andNextapptimeNotLike(String value) {
            addCriterion("NEXTAPPTIME not like", value, "nextapptime");
            return (Criteria) this;
        }

        public Criteria andNextapptimeIn(List<String> values) {
            addCriterion("NEXTAPPTIME in", values, "nextapptime");
            return (Criteria) this;
        }

        public Criteria andNextapptimeNotIn(List<String> values) {
            addCriterion("NEXTAPPTIME not in", values, "nextapptime");
            return (Criteria) this;
        }

        public Criteria andNextapptimeBetween(String value1, String value2) {
            addCriterion("NEXTAPPTIME between", value1, value2, "nextapptime");
            return (Criteria) this;
        }

        public Criteria andNextapptimeNotBetween(String value1, String value2) {
            addCriterion("NEXTAPPTIME not between", value1, value2, "nextapptime");
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

        public Criteria andEntcateLikeInsensitive(String value) {
            addCriterion("upper(ENTCATE) like", value.toUpperCase(), "entcate");
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

        public Criteria andFirstapptimeLikeInsensitive(String value) {
            addCriterion("upper(FIRSTAPPTIME) like", value.toUpperCase(), "firstapptime");
            return (Criteria) this;
        }

        public Criteria andRecapptimeLikeInsensitive(String value) {
            addCriterion("upper(RECAPPTIME) like", value.toUpperCase(), "recapptime");
            return (Criteria) this;
        }

        public Criteria andNextapptimeLikeInsensitive(String value) {
            addCriterion("upper(NEXTAPPTIME) like", value.toUpperCase(), "nextapptime");
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