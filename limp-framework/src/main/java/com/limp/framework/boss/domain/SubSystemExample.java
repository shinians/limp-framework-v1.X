package com.limp.framework.boss.domain;

import com.limp.framework.core.bean.Pager;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SubSystemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Pager page;

    public SubSystemExample() {
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
        this.page = page;
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
            addCriterion("SSM_GUID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("SSM_GUID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("SSM_GUID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("SSM_GUID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("SSM_GUID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("SSM_GUID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("SSM_GUID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("SSM_GUID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("SSM_GUID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("SSM_GUID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("SSM_GUID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("SSM_GUID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("SSM_GUID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("SSM_GUID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSsmNameIsNull() {
            addCriterion("SSM_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSsmNameIsNotNull() {
            addCriterion("SSM_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSsmNameEqualTo(String value) {
            addCriterion("SSM_NAME =", value, "ssmName");
            return (Criteria) this;
        }

        public Criteria andSsmNameNotEqualTo(String value) {
            addCriterion("SSM_NAME <>", value, "ssmName");
            return (Criteria) this;
        }

        public Criteria andSsmNameGreaterThan(String value) {
            addCriterion("SSM_NAME >", value, "ssmName");
            return (Criteria) this;
        }

        public Criteria andSsmNameGreaterThanOrEqualTo(String value) {
            addCriterion("SSM_NAME >=", value, "ssmName");
            return (Criteria) this;
        }

        public Criteria andSsmNameLessThan(String value) {
            addCriterion("SSM_NAME <", value, "ssmName");
            return (Criteria) this;
        }

        public Criteria andSsmNameLessThanOrEqualTo(String value) {
            addCriterion("SSM_NAME <=", value, "ssmName");
            return (Criteria) this;
        }

        public Criteria andSsmNameLike(String value) {
            addCriterion("SSM_NAME like", value, "ssmName");
            return (Criteria) this;
        }

        public Criteria andSsmNameNotLike(String value) {
            addCriterion("SSM_NAME not like", value, "ssmName");
            return (Criteria) this;
        }

        public Criteria andSsmNameIn(List<String> values) {
            addCriterion("SSM_NAME in", values, "ssmName");
            return (Criteria) this;
        }

        public Criteria andSsmNameNotIn(List<String> values) {
            addCriterion("SSM_NAME not in", values, "ssmName");
            return (Criteria) this;
        }

        public Criteria andSsmNameBetween(String value1, String value2) {
            addCriterion("SSM_NAME between", value1, value2, "ssmName");
            return (Criteria) this;
        }

        public Criteria andSsmNameNotBetween(String value1, String value2) {
            addCriterion("SSM_NAME not between", value1, value2, "ssmName");
            return (Criteria) this;
        }

        public Criteria andSsmMenuapiIsNull() {
            addCriterion("SSM_MENUAPI is null");
            return (Criteria) this;
        }

        public Criteria andSsmMenuapiIsNotNull() {
            addCriterion("SSM_MENUAPI is not null");
            return (Criteria) this;
        }

        public Criteria andSsmMenuapiEqualTo(String value) {
            addCriterion("SSM_MENUAPI =", value, "ssmMenuapi");
            return (Criteria) this;
        }

        public Criteria andSsmMenuapiNotEqualTo(String value) {
            addCriterion("SSM_MENUAPI <>", value, "ssmMenuapi");
            return (Criteria) this;
        }

        public Criteria andSsmMenuapiGreaterThan(String value) {
            addCriterion("SSM_MENUAPI >", value, "ssmMenuapi");
            return (Criteria) this;
        }

        public Criteria andSsmMenuapiGreaterThanOrEqualTo(String value) {
            addCriterion("SSM_MENUAPI >=", value, "ssmMenuapi");
            return (Criteria) this;
        }

        public Criteria andSsmMenuapiLessThan(String value) {
            addCriterion("SSM_MENUAPI <", value, "ssmMenuapi");
            return (Criteria) this;
        }

        public Criteria andSsmMenuapiLessThanOrEqualTo(String value) {
            addCriterion("SSM_MENUAPI <=", value, "ssmMenuapi");
            return (Criteria) this;
        }

        public Criteria andSsmMenuapiLike(String value) {
            addCriterion("SSM_MENUAPI like", value, "ssmMenuapi");
            return (Criteria) this;
        }

        public Criteria andSsmMenuapiNotLike(String value) {
            addCriterion("SSM_MENUAPI not like", value, "ssmMenuapi");
            return (Criteria) this;
        }

        public Criteria andSsmMenuapiIn(List<String> values) {
            addCriterion("SSM_MENUAPI in", values, "ssmMenuapi");
            return (Criteria) this;
        }

        public Criteria andSsmMenuapiNotIn(List<String> values) {
            addCriterion("SSM_MENUAPI not in", values, "ssmMenuapi");
            return (Criteria) this;
        }

        public Criteria andSsmMenuapiBetween(String value1, String value2) {
            addCriterion("SSM_MENUAPI between", value1, value2, "ssmMenuapi");
            return (Criteria) this;
        }

        public Criteria andSsmMenuapiNotBetween(String value1, String value2) {
            addCriterion("SSM_MENUAPI not between", value1, value2, "ssmMenuapi");
            return (Criteria) this;
        }

        public Criteria andSsmDataapiIsNull() {
            addCriterion("SSM_DATAAPI is null");
            return (Criteria) this;
        }

        public Criteria andSsmDataapiIsNotNull() {
            addCriterion("SSM_DATAAPI is not null");
            return (Criteria) this;
        }

        public Criteria andSsmDataapiEqualTo(String value) {
            addCriterion("SSM_DATAAPI =", value, "ssmDataapi");
            return (Criteria) this;
        }

        public Criteria andSsmDataapiNotEqualTo(String value) {
            addCriterion("SSM_DATAAPI <>", value, "ssmDataapi");
            return (Criteria) this;
        }

        public Criteria andSsmDataapiGreaterThan(String value) {
            addCriterion("SSM_DATAAPI >", value, "ssmDataapi");
            return (Criteria) this;
        }

        public Criteria andSsmDataapiGreaterThanOrEqualTo(String value) {
            addCriterion("SSM_DATAAPI >=", value, "ssmDataapi");
            return (Criteria) this;
        }

        public Criteria andSsmDataapiLessThan(String value) {
            addCriterion("SSM_DATAAPI <", value, "ssmDataapi");
            return (Criteria) this;
        }

        public Criteria andSsmDataapiLessThanOrEqualTo(String value) {
            addCriterion("SSM_DATAAPI <=", value, "ssmDataapi");
            return (Criteria) this;
        }

        public Criteria andSsmDataapiLike(String value) {
            addCriterion("SSM_DATAAPI like", value, "ssmDataapi");
            return (Criteria) this;
        }

        public Criteria andSsmDataapiNotLike(String value) {
            addCriterion("SSM_DATAAPI not like", value, "ssmDataapi");
            return (Criteria) this;
        }

        public Criteria andSsmDataapiIn(List<String> values) {
            addCriterion("SSM_DATAAPI in", values, "ssmDataapi");
            return (Criteria) this;
        }

        public Criteria andSsmDataapiNotIn(List<String> values) {
            addCriterion("SSM_DATAAPI not in", values, "ssmDataapi");
            return (Criteria) this;
        }

        public Criteria andSsmDataapiBetween(String value1, String value2) {
            addCriterion("SSM_DATAAPI between", value1, value2, "ssmDataapi");
            return (Criteria) this;
        }

        public Criteria andSsmDataapiNotBetween(String value1, String value2) {
            addCriterion("SSM_DATAAPI not between", value1, value2, "ssmDataapi");
            return (Criteria) this;
        }

        public Criteria andSsmElementapiIsNull() {
            addCriterion("SSM_ELEMENTAPI is null");
            return (Criteria) this;
        }

        public Criteria andSsmElementapiIsNotNull() {
            addCriterion("SSM_ELEMENTAPI is not null");
            return (Criteria) this;
        }

        public Criteria andSsmElementapiEqualTo(String value) {
            addCriterion("SSM_ELEMENTAPI =", value, "ssmElementapi");
            return (Criteria) this;
        }

        public Criteria andSsmElementapiNotEqualTo(String value) {
            addCriterion("SSM_ELEMENTAPI <>", value, "ssmElementapi");
            return (Criteria) this;
        }

        public Criteria andSsmElementapiGreaterThan(String value) {
            addCriterion("SSM_ELEMENTAPI >", value, "ssmElementapi");
            return (Criteria) this;
        }

        public Criteria andSsmElementapiGreaterThanOrEqualTo(String value) {
            addCriterion("SSM_ELEMENTAPI >=", value, "ssmElementapi");
            return (Criteria) this;
        }

        public Criteria andSsmElementapiLessThan(String value) {
            addCriterion("SSM_ELEMENTAPI <", value, "ssmElementapi");
            return (Criteria) this;
        }

        public Criteria andSsmElementapiLessThanOrEqualTo(String value) {
            addCriterion("SSM_ELEMENTAPI <=", value, "ssmElementapi");
            return (Criteria) this;
        }

        public Criteria andSsmElementapiLike(String value) {
            addCriterion("SSM_ELEMENTAPI like", value, "ssmElementapi");
            return (Criteria) this;
        }

        public Criteria andSsmElementapiNotLike(String value) {
            addCriterion("SSM_ELEMENTAPI not like", value, "ssmElementapi");
            return (Criteria) this;
        }

        public Criteria andSsmElementapiIn(List<String> values) {
            addCriterion("SSM_ELEMENTAPI in", values, "ssmElementapi");
            return (Criteria) this;
        }

        public Criteria andSsmElementapiNotIn(List<String> values) {
            addCriterion("SSM_ELEMENTAPI not in", values, "ssmElementapi");
            return (Criteria) this;
        }

        public Criteria andSsmElementapiBetween(String value1, String value2) {
            addCriterion("SSM_ELEMENTAPI between", value1, value2, "ssmElementapi");
            return (Criteria) this;
        }

        public Criteria andSsmElementapiNotBetween(String value1, String value2) {
            addCriterion("SSM_ELEMENTAPI not between", value1, value2, "ssmElementapi");
            return (Criteria) this;
        }

        public Criteria andSsmCreatedateIsNull() {
            addCriterion("SSM_CREATEDATE is null");
            return (Criteria) this;
        }

        public Criteria andSsmCreatedateIsNotNull() {
            addCriterion("SSM_CREATEDATE is not null");
            return (Criteria) this;
        }

        public Criteria andSsmCreatedateEqualTo(Date value) {
            addCriterionForJDBCDate("SSM_CREATEDATE =", value, "ssmCreatedate");
            return (Criteria) this;
        }

        public Criteria andSsmCreatedateNotEqualTo(Date value) {
            addCriterionForJDBCDate("SSM_CREATEDATE <>", value, "ssmCreatedate");
            return (Criteria) this;
        }

        public Criteria andSsmCreatedateGreaterThan(Date value) {
            addCriterionForJDBCDate("SSM_CREATEDATE >", value, "ssmCreatedate");
            return (Criteria) this;
        }

        public Criteria andSsmCreatedateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SSM_CREATEDATE >=", value, "ssmCreatedate");
            return (Criteria) this;
        }

        public Criteria andSsmCreatedateLessThan(Date value) {
            addCriterionForJDBCDate("SSM_CREATEDATE <", value, "ssmCreatedate");
            return (Criteria) this;
        }

        public Criteria andSsmCreatedateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SSM_CREATEDATE <=", value, "ssmCreatedate");
            return (Criteria) this;
        }

        public Criteria andSsmCreatedateIn(List<Date> values) {
            addCriterionForJDBCDate("SSM_CREATEDATE in", values, "ssmCreatedate");
            return (Criteria) this;
        }

        public Criteria andSsmCreatedateNotIn(List<Date> values) {
            addCriterionForJDBCDate("SSM_CREATEDATE not in", values, "ssmCreatedate");
            return (Criteria) this;
        }

        public Criteria andSsmCreatedateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SSM_CREATEDATE between", value1, value2, "ssmCreatedate");
            return (Criteria) this;
        }

        public Criteria andSsmCreatedateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SSM_CREATEDATE not between", value1, value2, "ssmCreatedate");
            return (Criteria) this;
        }

        public Criteria andSsmUpdatetimeIsNull() {
            addCriterion("SSM_UPDATETIME is null");
            return (Criteria) this;
        }

        public Criteria andSsmUpdatetimeIsNotNull() {
            addCriterion("SSM_UPDATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andSsmUpdatetimeEqualTo(Date value) {
            addCriterionForJDBCDate("SSM_UPDATETIME =", value, "ssmUpdatetime");
            return (Criteria) this;
        }

        public Criteria andSsmUpdatetimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("SSM_UPDATETIME <>", value, "ssmUpdatetime");
            return (Criteria) this;
        }

        public Criteria andSsmUpdatetimeGreaterThan(Date value) {
            addCriterionForJDBCDate("SSM_UPDATETIME >", value, "ssmUpdatetime");
            return (Criteria) this;
        }

        public Criteria andSsmUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SSM_UPDATETIME >=", value, "ssmUpdatetime");
            return (Criteria) this;
        }

        public Criteria andSsmUpdatetimeLessThan(Date value) {
            addCriterionForJDBCDate("SSM_UPDATETIME <", value, "ssmUpdatetime");
            return (Criteria) this;
        }

        public Criteria andSsmUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SSM_UPDATETIME <=", value, "ssmUpdatetime");
            return (Criteria) this;
        }

        public Criteria andSsmUpdatetimeIn(List<Date> values) {
            addCriterionForJDBCDate("SSM_UPDATETIME in", values, "ssmUpdatetime");
            return (Criteria) this;
        }

        public Criteria andSsmUpdatetimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("SSM_UPDATETIME not in", values, "ssmUpdatetime");
            return (Criteria) this;
        }

        public Criteria andSsmUpdatetimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SSM_UPDATETIME between", value1, value2, "ssmUpdatetime");
            return (Criteria) this;
        }

        public Criteria andSsmUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SSM_UPDATETIME not between", value1, value2, "ssmUpdatetime");
            return (Criteria) this;
        }

        public Criteria andSsmStateIsNull() {
            addCriterion("SSM_STATE is null");
            return (Criteria) this;
        }

        public Criteria andSsmStateIsNotNull() {
            addCriterion("SSM_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andSsmStateEqualTo(Integer value) {
            addCriterion("SSM_STATE =", value, "ssmState");
            return (Criteria) this;
        }

        public Criteria andSsmStateNotEqualTo(Integer value) {
            addCriterion("SSM_STATE <>", value, "ssmState");
            return (Criteria) this;
        }

        public Criteria andSsmStateGreaterThan(Integer value) {
            addCriterion("SSM_STATE >", value, "ssmState");
            return (Criteria) this;
        }

        public Criteria andSsmStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("SSM_STATE >=", value, "ssmState");
            return (Criteria) this;
        }

        public Criteria andSsmStateLessThan(Integer value) {
            addCriterion("SSM_STATE <", value, "ssmState");
            return (Criteria) this;
        }

        public Criteria andSsmStateLessThanOrEqualTo(Integer value) {
            addCriterion("SSM_STATE <=", value, "ssmState");
            return (Criteria) this;
        }

        public Criteria andSsmStateIn(List<Integer> values) {
            addCriterion("SSM_STATE in", values, "ssmState");
            return (Criteria) this;
        }

        public Criteria andSsmStateNotIn(List<Integer> values) {
            addCriterion("SSM_STATE not in", values, "ssmState");
            return (Criteria) this;
        }

        public Criteria andSsmStateBetween(Integer value1, Integer value2) {
            addCriterion("SSM_STATE between", value1, value2, "ssmState");
            return (Criteria) this;
        }

        public Criteria andSsmStateNotBetween(Integer value1, Integer value2) {
            addCriterion("SSM_STATE not between", value1, value2, "ssmState");
            return (Criteria) this;
        }

        public Criteria andMudRc0IsNull() {
            addCriterion("MUD_RC0 is null");
            return (Criteria) this;
        }

        public Criteria andMudRc0IsNotNull() {
            addCriterion("MUD_RC0 is not null");
            return (Criteria) this;
        }

        public Criteria andMudRc0EqualTo(String value) {
            addCriterion("MUD_RC0 =", value, "mudRc0");
            return (Criteria) this;
        }

        public Criteria andMudRc0NotEqualTo(String value) {
            addCriterion("MUD_RC0 <>", value, "mudRc0");
            return (Criteria) this;
        }

        public Criteria andMudRc0GreaterThan(String value) {
            addCriterion("MUD_RC0 >", value, "mudRc0");
            return (Criteria) this;
        }

        public Criteria andMudRc0GreaterThanOrEqualTo(String value) {
            addCriterion("MUD_RC0 >=", value, "mudRc0");
            return (Criteria) this;
        }

        public Criteria andMudRc0LessThan(String value) {
            addCriterion("MUD_RC0 <", value, "mudRc0");
            return (Criteria) this;
        }

        public Criteria andMudRc0LessThanOrEqualTo(String value) {
            addCriterion("MUD_RC0 <=", value, "mudRc0");
            return (Criteria) this;
        }

        public Criteria andMudRc0Like(String value) {
            addCriterion("MUD_RC0 like", value, "mudRc0");
            return (Criteria) this;
        }

        public Criteria andMudRc0NotLike(String value) {
            addCriterion("MUD_RC0 not like", value, "mudRc0");
            return (Criteria) this;
        }

        public Criteria andMudRc0In(List<String> values) {
            addCriterion("MUD_RC0 in", values, "mudRc0");
            return (Criteria) this;
        }

        public Criteria andMudRc0NotIn(List<String> values) {
            addCriterion("MUD_RC0 not in", values, "mudRc0");
            return (Criteria) this;
        }

        public Criteria andMudRc0Between(String value1, String value2) {
            addCriterion("MUD_RC0 between", value1, value2, "mudRc0");
            return (Criteria) this;
        }

        public Criteria andMudRc0NotBetween(String value1, String value2) {
            addCriterion("MUD_RC0 not between", value1, value2, "mudRc0");
            return (Criteria) this;
        }

        public Criteria andMudRc1IsNull() {
            addCriterion("MUD_RC1 is null");
            return (Criteria) this;
        }

        public Criteria andMudRc1IsNotNull() {
            addCriterion("MUD_RC1 is not null");
            return (Criteria) this;
        }

        public Criteria andMudRc1EqualTo(String value) {
            addCriterion("MUD_RC1 =", value, "mudRc1");
            return (Criteria) this;
        }

        public Criteria andMudRc1NotEqualTo(String value) {
            addCriterion("MUD_RC1 <>", value, "mudRc1");
            return (Criteria) this;
        }

        public Criteria andMudRc1GreaterThan(String value) {
            addCriterion("MUD_RC1 >", value, "mudRc1");
            return (Criteria) this;
        }

        public Criteria andMudRc1GreaterThanOrEqualTo(String value) {
            addCriterion("MUD_RC1 >=", value, "mudRc1");
            return (Criteria) this;
        }

        public Criteria andMudRc1LessThan(String value) {
            addCriterion("MUD_RC1 <", value, "mudRc1");
            return (Criteria) this;
        }

        public Criteria andMudRc1LessThanOrEqualTo(String value) {
            addCriterion("MUD_RC1 <=", value, "mudRc1");
            return (Criteria) this;
        }

        public Criteria andMudRc1Like(String value) {
            addCriterion("MUD_RC1 like", value, "mudRc1");
            return (Criteria) this;
        }

        public Criteria andMudRc1NotLike(String value) {
            addCriterion("MUD_RC1 not like", value, "mudRc1");
            return (Criteria) this;
        }

        public Criteria andMudRc1In(List<String> values) {
            addCriterion("MUD_RC1 in", values, "mudRc1");
            return (Criteria) this;
        }

        public Criteria andMudRc1NotIn(List<String> values) {
            addCriterion("MUD_RC1 not in", values, "mudRc1");
            return (Criteria) this;
        }

        public Criteria andMudRc1Between(String value1, String value2) {
            addCriterion("MUD_RC1 between", value1, value2, "mudRc1");
            return (Criteria) this;
        }

        public Criteria andMudRc1NotBetween(String value1, String value2) {
            addCriterion("MUD_RC1 not between", value1, value2, "mudRc1");
            return (Criteria) this;
        }

        public Criteria andMudRc2IsNull() {
            addCriterion("MUD_RC2 is null");
            return (Criteria) this;
        }

        public Criteria andMudRc2IsNotNull() {
            addCriterion("MUD_RC2 is not null");
            return (Criteria) this;
        }

        public Criteria andMudRc2EqualTo(String value) {
            addCriterion("MUD_RC2 =", value, "mudRc2");
            return (Criteria) this;
        }

        public Criteria andMudRc2NotEqualTo(String value) {
            addCriterion("MUD_RC2 <>", value, "mudRc2");
            return (Criteria) this;
        }

        public Criteria andMudRc2GreaterThan(String value) {
            addCriterion("MUD_RC2 >", value, "mudRc2");
            return (Criteria) this;
        }

        public Criteria andMudRc2GreaterThanOrEqualTo(String value) {
            addCriterion("MUD_RC2 >=", value, "mudRc2");
            return (Criteria) this;
        }

        public Criteria andMudRc2LessThan(String value) {
            addCriterion("MUD_RC2 <", value, "mudRc2");
            return (Criteria) this;
        }

        public Criteria andMudRc2LessThanOrEqualTo(String value) {
            addCriterion("MUD_RC2 <=", value, "mudRc2");
            return (Criteria) this;
        }

        public Criteria andMudRc2Like(String value) {
            addCriterion("MUD_RC2 like", value, "mudRc2");
            return (Criteria) this;
        }

        public Criteria andMudRc2NotLike(String value) {
            addCriterion("MUD_RC2 not like", value, "mudRc2");
            return (Criteria) this;
        }

        public Criteria andMudRc2In(List<String> values) {
            addCriterion("MUD_RC2 in", values, "mudRc2");
            return (Criteria) this;
        }

        public Criteria andMudRc2NotIn(List<String> values) {
            addCriterion("MUD_RC2 not in", values, "mudRc2");
            return (Criteria) this;
        }

        public Criteria andMudRc2Between(String value1, String value2) {
            addCriterion("MUD_RC2 between", value1, value2, "mudRc2");
            return (Criteria) this;
        }

        public Criteria andMudRc2NotBetween(String value1, String value2) {
            addCriterion("MUD_RC2 not between", value1, value2, "mudRc2");
            return (Criteria) this;
        }

        public Criteria andMudRc3IsNull() {
            addCriterion("MUD_RC3 is null");
            return (Criteria) this;
        }

        public Criteria andMudRc3IsNotNull() {
            addCriterion("MUD_RC3 is not null");
            return (Criteria) this;
        }

        public Criteria andMudRc3EqualTo(Integer value) {
            addCriterion("MUD_RC3 =", value, "mudRc3");
            return (Criteria) this;
        }

        public Criteria andMudRc3NotEqualTo(Integer value) {
            addCriterion("MUD_RC3 <>", value, "mudRc3");
            return (Criteria) this;
        }

        public Criteria andMudRc3GreaterThan(Integer value) {
            addCriterion("MUD_RC3 >", value, "mudRc3");
            return (Criteria) this;
        }

        public Criteria andMudRc3GreaterThanOrEqualTo(Integer value) {
            addCriterion("MUD_RC3 >=", value, "mudRc3");
            return (Criteria) this;
        }

        public Criteria andMudRc3LessThan(Integer value) {
            addCriterion("MUD_RC3 <", value, "mudRc3");
            return (Criteria) this;
        }

        public Criteria andMudRc3LessThanOrEqualTo(Integer value) {
            addCriterion("MUD_RC3 <=", value, "mudRc3");
            return (Criteria) this;
        }

        public Criteria andMudRc3In(List<Integer> values) {
            addCriterion("MUD_RC3 in", values, "mudRc3");
            return (Criteria) this;
        }

        public Criteria andMudRc3NotIn(List<Integer> values) {
            addCriterion("MUD_RC3 not in", values, "mudRc3");
            return (Criteria) this;
        }

        public Criteria andMudRc3Between(Integer value1, Integer value2) {
            addCriterion("MUD_RC3 between", value1, value2, "mudRc3");
            return (Criteria) this;
        }

        public Criteria andMudRc3NotBetween(Integer value1, Integer value2) {
            addCriterion("MUD_RC3 not between", value1, value2, "mudRc3");
            return (Criteria) this;
        }

        public Criteria andMudRc4IsNull() {
            addCriterion("MUD_RC4 is null");
            return (Criteria) this;
        }

        public Criteria andMudRc4IsNotNull() {
            addCriterion("MUD_RC4 is not null");
            return (Criteria) this;
        }

        public Criteria andMudRc4EqualTo(Integer value) {
            addCriterion("MUD_RC4 =", value, "mudRc4");
            return (Criteria) this;
        }

        public Criteria andMudRc4NotEqualTo(Integer value) {
            addCriterion("MUD_RC4 <>", value, "mudRc4");
            return (Criteria) this;
        }

        public Criteria andMudRc4GreaterThan(Integer value) {
            addCriterion("MUD_RC4 >", value, "mudRc4");
            return (Criteria) this;
        }

        public Criteria andMudRc4GreaterThanOrEqualTo(Integer value) {
            addCriterion("MUD_RC4 >=", value, "mudRc4");
            return (Criteria) this;
        }

        public Criteria andMudRc4LessThan(Integer value) {
            addCriterion("MUD_RC4 <", value, "mudRc4");
            return (Criteria) this;
        }

        public Criteria andMudRc4LessThanOrEqualTo(Integer value) {
            addCriterion("MUD_RC4 <=", value, "mudRc4");
            return (Criteria) this;
        }

        public Criteria andMudRc4In(List<Integer> values) {
            addCriterion("MUD_RC4 in", values, "mudRc4");
            return (Criteria) this;
        }

        public Criteria andMudRc4NotIn(List<Integer> values) {
            addCriterion("MUD_RC4 not in", values, "mudRc4");
            return (Criteria) this;
        }

        public Criteria andMudRc4Between(Integer value1, Integer value2) {
            addCriterion("MUD_RC4 between", value1, value2, "mudRc4");
            return (Criteria) this;
        }

        public Criteria andMudRc4NotBetween(Integer value1, Integer value2) {
            addCriterion("MUD_RC4 not between", value1, value2, "mudRc4");
            return (Criteria) this;
        }

        public Criteria andMudRc5IsNull() {
            addCriterion("MUD_RC5 is null");
            return (Criteria) this;
        }

        public Criteria andMudRc5IsNotNull() {
            addCriterion("MUD_RC5 is not null");
            return (Criteria) this;
        }

        public Criteria andMudRc5EqualTo(Date value) {
            addCriterionForJDBCDate("MUD_RC5 =", value, "mudRc5");
            return (Criteria) this;
        }

        public Criteria andMudRc5NotEqualTo(Date value) {
            addCriterionForJDBCDate("MUD_RC5 <>", value, "mudRc5");
            return (Criteria) this;
        }

        public Criteria andMudRc5GreaterThan(Date value) {
            addCriterionForJDBCDate("MUD_RC5 >", value, "mudRc5");
            return (Criteria) this;
        }

        public Criteria andMudRc5GreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("MUD_RC5 >=", value, "mudRc5");
            return (Criteria) this;
        }

        public Criteria andMudRc5LessThan(Date value) {
            addCriterionForJDBCDate("MUD_RC5 <", value, "mudRc5");
            return (Criteria) this;
        }

        public Criteria andMudRc5LessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("MUD_RC5 <=", value, "mudRc5");
            return (Criteria) this;
        }

        public Criteria andMudRc5In(List<Date> values) {
            addCriterionForJDBCDate("MUD_RC5 in", values, "mudRc5");
            return (Criteria) this;
        }

        public Criteria andMudRc5NotIn(List<Date> values) {
            addCriterionForJDBCDate("MUD_RC5 not in", values, "mudRc5");
            return (Criteria) this;
        }

        public Criteria andMudRc5Between(Date value1, Date value2) {
            addCriterionForJDBCDate("MUD_RC5 between", value1, value2, "mudRc5");
            return (Criteria) this;
        }

        public Criteria andMudRc5NotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("MUD_RC5 not between", value1, value2, "mudRc5");
            return (Criteria) this;
        }

        public Criteria andSsmNameLikeInsensitive(String value) {
            addCriterion("upper(SSM_NAME) like", value.toUpperCase(), "ssmName");
            return (Criteria) this;
        }

        public Criteria andSsmMenuapiLikeInsensitive(String value) {
            addCriterion("upper(SSM_MENUAPI) like", value.toUpperCase(), "ssmMenuapi");
            return (Criteria) this;
        }

        public Criteria andSsmDataapiLikeInsensitive(String value) {
            addCriterion("upper(SSM_DATAAPI) like", value.toUpperCase(), "ssmDataapi");
            return (Criteria) this;
        }

        public Criteria andSsmElementapiLikeInsensitive(String value) {
            addCriterion("upper(SSM_ELEMENTAPI) like", value.toUpperCase(), "ssmElementapi");
            return (Criteria) this;
        }

        public Criteria andMudRc0LikeInsensitive(String value) {
            addCriterion("upper(MUD_RC0) like", value.toUpperCase(), "mudRc0");
            return (Criteria) this;
        }

        public Criteria andMudRc1LikeInsensitive(String value) {
            addCriterion("upper(MUD_RC1) like", value.toUpperCase(), "mudRc1");
            return (Criteria) this;
        }

        public Criteria andMudRc2LikeInsensitive(String value) {
            addCriterion("upper(MUD_RC2) like", value.toUpperCase(), "mudRc2");
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