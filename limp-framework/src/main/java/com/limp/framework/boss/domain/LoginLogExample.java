package com.limp.framework.boss.domain;


import com.limp.framework.core.bean.Pager;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class LoginLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Pager page;

    public LoginLogExample() {
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
            addCriterion("ULL_GUID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ULL_GUID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ULL_GUID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ULL_GUID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ULL_GUID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ULL_GUID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ULL_GUID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ULL_GUID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ULL_GUID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ULL_GUID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ULL_GUID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ULL_GUID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ULL_GUID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ULL_GUID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("ULL_USRGUID is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("ULL_USRGUID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("ULL_USRGUID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("ULL_USRGUID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("ULL_USRGUID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("ULL_USRGUID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("ULL_USRGUID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("ULL_USRGUID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("ULL_USRGUID like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("ULL_USRGUID not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("ULL_USRGUID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("ULL_USRGUID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("ULL_USRGUID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("ULL_USRGUID not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUllAccountIsNull() {
            addCriterion("ULL_ACCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andUllAccountIsNotNull() {
            addCriterion("ULL_ACCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andUllAccountEqualTo(String value) {
            addCriterion("ULL_ACCOUNT =", value, "ullAccount");
            return (Criteria) this;
        }

        public Criteria andUllAccountNotEqualTo(String value) {
            addCriterion("ULL_ACCOUNT <>", value, "ullAccount");
            return (Criteria) this;
        }

        public Criteria andUllAccountGreaterThan(String value) {
            addCriterion("ULL_ACCOUNT >", value, "ullAccount");
            return (Criteria) this;
        }

        public Criteria andUllAccountGreaterThanOrEqualTo(String value) {
            addCriterion("ULL_ACCOUNT >=", value, "ullAccount");
            return (Criteria) this;
        }

        public Criteria andUllAccountLessThan(String value) {
            addCriterion("ULL_ACCOUNT <", value, "ullAccount");
            return (Criteria) this;
        }

        public Criteria andUllAccountLessThanOrEqualTo(String value) {
            addCriterion("ULL_ACCOUNT <=", value, "ullAccount");
            return (Criteria) this;
        }

        public Criteria andUllAccountLike(String value) {
            addCriterion("ULL_ACCOUNT like", value, "ullAccount");
            return (Criteria) this;
        }

        public Criteria andUllAccountNotLike(String value) {
            addCriterion("ULL_ACCOUNT not like", value, "ullAccount");
            return (Criteria) this;
        }

        public Criteria andUllAccountIn(List<String> values) {
            addCriterion("ULL_ACCOUNT in", values, "ullAccount");
            return (Criteria) this;
        }

        public Criteria andUllAccountNotIn(List<String> values) {
            addCriterion("ULL_ACCOUNT not in", values, "ullAccount");
            return (Criteria) this;
        }

        public Criteria andUllAccountBetween(String value1, String value2) {
            addCriterion("ULL_ACCOUNT between", value1, value2, "ullAccount");
            return (Criteria) this;
        }

        public Criteria andUllAccountNotBetween(String value1, String value2) {
            addCriterion("ULL_ACCOUNT not between", value1, value2, "ullAccount");
            return (Criteria) this;
        }

        public Criteria andUllLogstateIsNull() {
            addCriterion("ULL_LOGSTATE is null");
            return (Criteria) this;
        }

        public Criteria andUllLogstateIsNotNull() {
            addCriterion("ULL_LOGSTATE is not null");
            return (Criteria) this;
        }

        public Criteria andUllLogstateEqualTo(Integer value) {
            addCriterion("ULL_LOGSTATE =", value, "ullLogstate");
            return (Criteria) this;
        }

        public Criteria andUllLogstateNotEqualTo(Integer value) {
            addCriterion("ULL_LOGSTATE <>", value, "ullLogstate");
            return (Criteria) this;
        }

        public Criteria andUllLogstateGreaterThan(Integer value) {
            addCriterion("ULL_LOGSTATE >", value, "ullLogstate");
            return (Criteria) this;
        }

        public Criteria andUllLogstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("ULL_LOGSTATE >=", value, "ullLogstate");
            return (Criteria) this;
        }

        public Criteria andUllLogstateLessThan(Integer value) {
            addCriterion("ULL_LOGSTATE <", value, "ullLogstate");
            return (Criteria) this;
        }

        public Criteria andUllLogstateLessThanOrEqualTo(Integer value) {
            addCriterion("ULL_LOGSTATE <=", value, "ullLogstate");
            return (Criteria) this;
        }

        public Criteria andUllLogstateIn(List<Integer> values) {
            addCriterion("ULL_LOGSTATE in", values, "ullLogstate");
            return (Criteria) this;
        }

        public Criteria andUllLogstateNotIn(List<Integer> values) {
            addCriterion("ULL_LOGSTATE not in", values, "ullLogstate");
            return (Criteria) this;
        }

        public Criteria andUllLogstateBetween(Integer value1, Integer value2) {
            addCriterion("ULL_LOGSTATE between", value1, value2, "ullLogstate");
            return (Criteria) this;
        }

        public Criteria andUllLogstateNotBetween(Integer value1, Integer value2) {
            addCriterion("ULL_LOGSTATE not between", value1, value2, "ullLogstate");
            return (Criteria) this;
        }

        public Criteria andUllMacIsNull() {
            addCriterion("ULL_MAC is null");
            return (Criteria) this;
        }

        public Criteria andUllMacIsNotNull() {
            addCriterion("ULL_MAC is not null");
            return (Criteria) this;
        }

        public Criteria andUllMacEqualTo(String value) {
            addCriterion("ULL_MAC =", value, "ullMac");
            return (Criteria) this;
        }

        public Criteria andUllMacNotEqualTo(String value) {
            addCriterion("ULL_MAC <>", value, "ullMac");
            return (Criteria) this;
        }

        public Criteria andUllMacGreaterThan(String value) {
            addCriterion("ULL_MAC >", value, "ullMac");
            return (Criteria) this;
        }

        public Criteria andUllMacGreaterThanOrEqualTo(String value) {
            addCriterion("ULL_MAC >=", value, "ullMac");
            return (Criteria) this;
        }

        public Criteria andUllMacLessThan(String value) {
            addCriterion("ULL_MAC <", value, "ullMac");
            return (Criteria) this;
        }

        public Criteria andUllMacLessThanOrEqualTo(String value) {
            addCriterion("ULL_MAC <=", value, "ullMac");
            return (Criteria) this;
        }

        public Criteria andUllMacLike(String value) {
            addCriterion("ULL_MAC like", value, "ullMac");
            return (Criteria) this;
        }

        public Criteria andUllMacNotLike(String value) {
            addCriterion("ULL_MAC not like", value, "ullMac");
            return (Criteria) this;
        }

        public Criteria andUllMacIn(List<String> values) {
            addCriterion("ULL_MAC in", values, "ullMac");
            return (Criteria) this;
        }

        public Criteria andUllMacNotIn(List<String> values) {
            addCriterion("ULL_MAC not in", values, "ullMac");
            return (Criteria) this;
        }

        public Criteria andUllMacBetween(String value1, String value2) {
            addCriterion("ULL_MAC between", value1, value2, "ullMac");
            return (Criteria) this;
        }

        public Criteria andUllMacNotBetween(String value1, String value2) {
            addCriterion("ULL_MAC not between", value1, value2, "ullMac");
            return (Criteria) this;
        }

        public Criteria andUllIpIsNull() {
            addCriterion("ULL_IP is null");
            return (Criteria) this;
        }

        public Criteria andUllIpIsNotNull() {
            addCriterion("ULL_IP is not null");
            return (Criteria) this;
        }

        public Criteria andUllIpEqualTo(String value) {
            addCriterion("ULL_IP =", value, "ullIp");
            return (Criteria) this;
        }

        public Criteria andUllIpNotEqualTo(String value) {
            addCriterion("ULL_IP <>", value, "ullIp");
            return (Criteria) this;
        }

        public Criteria andUllIpGreaterThan(String value) {
            addCriterion("ULL_IP >", value, "ullIp");
            return (Criteria) this;
        }

        public Criteria andUllIpGreaterThanOrEqualTo(String value) {
            addCriterion("ULL_IP >=", value, "ullIp");
            return (Criteria) this;
        }

        public Criteria andUllIpLessThan(String value) {
            addCriterion("ULL_IP <", value, "ullIp");
            return (Criteria) this;
        }

        public Criteria andUllIpLessThanOrEqualTo(String value) {
            addCriterion("ULL_IP <=", value, "ullIp");
            return (Criteria) this;
        }

        public Criteria andUllIpLike(String value) {
            addCriterion("ULL_IP like", value, "ullIp");
            return (Criteria) this;
        }

        public Criteria andUllIpNotLike(String value) {
            addCriterion("ULL_IP not like", value, "ullIp");
            return (Criteria) this;
        }

        public Criteria andUllIpIn(List<String> values) {
            addCriterion("ULL_IP in", values, "ullIp");
            return (Criteria) this;
        }

        public Criteria andUllIpNotIn(List<String> values) {
            addCriterion("ULL_IP not in", values, "ullIp");
            return (Criteria) this;
        }

        public Criteria andUllIpBetween(String value1, String value2) {
            addCriterion("ULL_IP between", value1, value2, "ullIp");
            return (Criteria) this;
        }

        public Criteria andUllIpNotBetween(String value1, String value2) {
            addCriterion("ULL_IP not between", value1, value2, "ullIp");
            return (Criteria) this;
        }

        public Criteria andUllTimeIsNull() {
            addCriterion("ULL_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUllTimeIsNotNull() {
            addCriterion("ULL_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUllTimeEqualTo(Date value) {
            addCriterionForJDBCDate("ULL_TIME =", value, "ullTime");
            return (Criteria) this;
        }

        public Criteria andUllTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("ULL_TIME <>", value, "ullTime");
            return (Criteria) this;
        }

        public Criteria andUllTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("ULL_TIME >", value, "ullTime");
            return (Criteria) this;
        }

        public Criteria andUllTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ULL_TIME >=", value, "ullTime");
            return (Criteria) this;
        }

        public Criteria andUllTimeLessThan(Date value) {
            addCriterionForJDBCDate("ULL_TIME <", value, "ullTime");
            return (Criteria) this;
        }

        public Criteria andUllTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ULL_TIME <=", value, "ullTime");
            return (Criteria) this;
        }

        public Criteria andUllTimeIn(List<Date> values) {
            addCriterionForJDBCDate("ULL_TIME in", values, "ullTime");
            return (Criteria) this;
        }

        public Criteria andUllTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("ULL_TIME not in", values, "ullTime");
            return (Criteria) this;
        }

        public Criteria andUllTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ULL_TIME between", value1, value2, "ullTime");
            return (Criteria) this;
        }

        public Criteria andUllTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ULL_TIME not between", value1, value2, "ullTime");
            return (Criteria) this;
        }

        public Criteria andUllTypeIsNull() {
            addCriterion("ULL_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andUllTypeIsNotNull() {
            addCriterion("ULL_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andUllTypeEqualTo(Integer value) {
            addCriterion("ULL_TYPE =", value, "ullType");
            return (Criteria) this;
        }

        public Criteria andUllTypeNotEqualTo(Integer value) {
            addCriterion("ULL_TYPE <>", value, "ullType");
            return (Criteria) this;
        }

        public Criteria andUllTypeGreaterThan(Integer value) {
            addCriterion("ULL_TYPE >", value, "ullType");
            return (Criteria) this;
        }

        public Criteria andUllTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("ULL_TYPE >=", value, "ullType");
            return (Criteria) this;
        }

        public Criteria andUllTypeLessThan(Integer value) {
            addCriterion("ULL_TYPE <", value, "ullType");
            return (Criteria) this;
        }

        public Criteria andUllTypeLessThanOrEqualTo(Integer value) {
            addCriterion("ULL_TYPE <=", value, "ullType");
            return (Criteria) this;
        }

        public Criteria andUllTypeIn(List<Integer> values) {
            addCriterion("ULL_TYPE in", values, "ullType");
            return (Criteria) this;
        }

        public Criteria andUllTypeNotIn(List<Integer> values) {
            addCriterion("ULL_TYPE not in", values, "ullType");
            return (Criteria) this;
        }

        public Criteria andUllTypeBetween(Integer value1, Integer value2) {
            addCriterion("ULL_TYPE between", value1, value2, "ullType");
            return (Criteria) this;
        }

        public Criteria andUllTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("ULL_TYPE not between", value1, value2, "ullType");
            return (Criteria) this;
        }

        public Criteria andUllStateIsNull() {
            addCriterion("ULL_STATE is null");
            return (Criteria) this;
        }

        public Criteria andUllStateIsNotNull() {
            addCriterion("ULL_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andUllStateEqualTo(Integer value) {
            addCriterion("ULL_STATE =", value, "ullState");
            return (Criteria) this;
        }

        public Criteria andUllStateNotEqualTo(Integer value) {
            addCriterion("ULL_STATE <>", value, "ullState");
            return (Criteria) this;
        }

        public Criteria andUllStateGreaterThan(Integer value) {
            addCriterion("ULL_STATE >", value, "ullState");
            return (Criteria) this;
        }

        public Criteria andUllStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("ULL_STATE >=", value, "ullState");
            return (Criteria) this;
        }

        public Criteria andUllStateLessThan(Integer value) {
            addCriterion("ULL_STATE <", value, "ullState");
            return (Criteria) this;
        }

        public Criteria andUllStateLessThanOrEqualTo(Integer value) {
            addCriterion("ULL_STATE <=", value, "ullState");
            return (Criteria) this;
        }

        public Criteria andUllStateIn(List<Integer> values) {
            addCriterion("ULL_STATE in", values, "ullState");
            return (Criteria) this;
        }

        public Criteria andUllStateNotIn(List<Integer> values) {
            addCriterion("ULL_STATE not in", values, "ullState");
            return (Criteria) this;
        }

        public Criteria andUllStateBetween(Integer value1, Integer value2) {
            addCriterion("ULL_STATE between", value1, value2, "ullState");
            return (Criteria) this;
        }

        public Criteria andUllStateNotBetween(Integer value1, Integer value2) {
            addCriterion("ULL_STATE not between", value1, value2, "ullState");
            return (Criteria) this;
        }

        public Criteria andUllRc0IsNull() {
            addCriterion("ULL_RC0 is null");
            return (Criteria) this;
        }

        public Criteria andUllRc0IsNotNull() {
            addCriterion("ULL_RC0 is not null");
            return (Criteria) this;
        }

        public Criteria andUllRc0EqualTo(String value) {
            addCriterion("ULL_RC0 =", value, "ullRc0");
            return (Criteria) this;
        }

        public Criteria andUllRc0NotEqualTo(String value) {
            addCriterion("ULL_RC0 <>", value, "ullRc0");
            return (Criteria) this;
        }

        public Criteria andUllRc0GreaterThan(String value) {
            addCriterion("ULL_RC0 >", value, "ullRc0");
            return (Criteria) this;
        }

        public Criteria andUllRc0GreaterThanOrEqualTo(String value) {
            addCriterion("ULL_RC0 >=", value, "ullRc0");
            return (Criteria) this;
        }

        public Criteria andUllRc0LessThan(String value) {
            addCriterion("ULL_RC0 <", value, "ullRc0");
            return (Criteria) this;
        }

        public Criteria andUllRc0LessThanOrEqualTo(String value) {
            addCriterion("ULL_RC0 <=", value, "ullRc0");
            return (Criteria) this;
        }

        public Criteria andUllRc0Like(String value) {
            addCriterion("ULL_RC0 like", value, "ullRc0");
            return (Criteria) this;
        }

        public Criteria andUllRc0NotLike(String value) {
            addCriterion("ULL_RC0 not like", value, "ullRc0");
            return (Criteria) this;
        }

        public Criteria andUllRc0In(List<String> values) {
            addCriterion("ULL_RC0 in", values, "ullRc0");
            return (Criteria) this;
        }

        public Criteria andUllRc0NotIn(List<String> values) {
            addCriterion("ULL_RC0 not in", values, "ullRc0");
            return (Criteria) this;
        }

        public Criteria andUllRc0Between(String value1, String value2) {
            addCriterion("ULL_RC0 between", value1, value2, "ullRc0");
            return (Criteria) this;
        }

        public Criteria andUllRc0NotBetween(String value1, String value2) {
            addCriterion("ULL_RC0 not between", value1, value2, "ullRc0");
            return (Criteria) this;
        }

        public Criteria andUllRc1IsNull() {
            addCriterion("ULL_RC1 is null");
            return (Criteria) this;
        }

        public Criteria andUllRc1IsNotNull() {
            addCriterion("ULL_RC1 is not null");
            return (Criteria) this;
        }

        public Criteria andUllRc1EqualTo(String value) {
            addCriterion("ULL_RC1 =", value, "ullRc1");
            return (Criteria) this;
        }

        public Criteria andUllRc1NotEqualTo(String value) {
            addCriterion("ULL_RC1 <>", value, "ullRc1");
            return (Criteria) this;
        }

        public Criteria andUllRc1GreaterThan(String value) {
            addCriterion("ULL_RC1 >", value, "ullRc1");
            return (Criteria) this;
        }

        public Criteria andUllRc1GreaterThanOrEqualTo(String value) {
            addCriterion("ULL_RC1 >=", value, "ullRc1");
            return (Criteria) this;
        }

        public Criteria andUllRc1LessThan(String value) {
            addCriterion("ULL_RC1 <", value, "ullRc1");
            return (Criteria) this;
        }

        public Criteria andUllRc1LessThanOrEqualTo(String value) {
            addCriterion("ULL_RC1 <=", value, "ullRc1");
            return (Criteria) this;
        }

        public Criteria andUllRc1Like(String value) {
            addCriterion("ULL_RC1 like", value, "ullRc1");
            return (Criteria) this;
        }

        public Criteria andUllRc1NotLike(String value) {
            addCriterion("ULL_RC1 not like", value, "ullRc1");
            return (Criteria) this;
        }

        public Criteria andUllRc1In(List<String> values) {
            addCriterion("ULL_RC1 in", values, "ullRc1");
            return (Criteria) this;
        }

        public Criteria andUllRc1NotIn(List<String> values) {
            addCriterion("ULL_RC1 not in", values, "ullRc1");
            return (Criteria) this;
        }

        public Criteria andUllRc1Between(String value1, String value2) {
            addCriterion("ULL_RC1 between", value1, value2, "ullRc1");
            return (Criteria) this;
        }

        public Criteria andUllRc1NotBetween(String value1, String value2) {
            addCriterion("ULL_RC1 not between", value1, value2, "ullRc1");
            return (Criteria) this;
        }

        public Criteria andUllRc2IsNull() {
            addCriterion("ULL_RC2 is null");
            return (Criteria) this;
        }

        public Criteria andUllRc2IsNotNull() {
            addCriterion("ULL_RC2 is not null");
            return (Criteria) this;
        }

        public Criteria andUllRc2EqualTo(String value) {
            addCriterion("ULL_RC2 =", value, "ullRc2");
            return (Criteria) this;
        }

        public Criteria andUllRc2NotEqualTo(String value) {
            addCriterion("ULL_RC2 <>", value, "ullRc2");
            return (Criteria) this;
        }

        public Criteria andUllRc2GreaterThan(String value) {
            addCriterion("ULL_RC2 >", value, "ullRc2");
            return (Criteria) this;
        }

        public Criteria andUllRc2GreaterThanOrEqualTo(String value) {
            addCriterion("ULL_RC2 >=", value, "ullRc2");
            return (Criteria) this;
        }

        public Criteria andUllRc2LessThan(String value) {
            addCriterion("ULL_RC2 <", value, "ullRc2");
            return (Criteria) this;
        }

        public Criteria andUllRc2LessThanOrEqualTo(String value) {
            addCriterion("ULL_RC2 <=", value, "ullRc2");
            return (Criteria) this;
        }

        public Criteria andUllRc2Like(String value) {
            addCriterion("ULL_RC2 like", value, "ullRc2");
            return (Criteria) this;
        }

        public Criteria andUllRc2NotLike(String value) {
            addCriterion("ULL_RC2 not like", value, "ullRc2");
            return (Criteria) this;
        }

        public Criteria andUllRc2In(List<String> values) {
            addCriterion("ULL_RC2 in", values, "ullRc2");
            return (Criteria) this;
        }

        public Criteria andUllRc2NotIn(List<String> values) {
            addCriterion("ULL_RC2 not in", values, "ullRc2");
            return (Criteria) this;
        }

        public Criteria andUllRc2Between(String value1, String value2) {
            addCriterion("ULL_RC2 between", value1, value2, "ullRc2");
            return (Criteria) this;
        }

        public Criteria andUllRc2NotBetween(String value1, String value2) {
            addCriterion("ULL_RC2 not between", value1, value2, "ullRc2");
            return (Criteria) this;
        }

        public Criteria andUllRc3IsNull() {
            addCriterion("ULL_RC3 is null");
            return (Criteria) this;
        }

        public Criteria andUllRc3IsNotNull() {
            addCriterion("ULL_RC3 is not null");
            return (Criteria) this;
        }

        public Criteria andUllRc3EqualTo(Integer value) {
            addCriterion("ULL_RC3 =", value, "ullRc3");
            return (Criteria) this;
        }

        public Criteria andUllRc3NotEqualTo(Integer value) {
            addCriterion("ULL_RC3 <>", value, "ullRc3");
            return (Criteria) this;
        }

        public Criteria andUllRc3GreaterThan(Integer value) {
            addCriterion("ULL_RC3 >", value, "ullRc3");
            return (Criteria) this;
        }

        public Criteria andUllRc3GreaterThanOrEqualTo(Integer value) {
            addCriterion("ULL_RC3 >=", value, "ullRc3");
            return (Criteria) this;
        }

        public Criteria andUllRc3LessThan(Integer value) {
            addCriterion("ULL_RC3 <", value, "ullRc3");
            return (Criteria) this;
        }

        public Criteria andUllRc3LessThanOrEqualTo(Integer value) {
            addCriterion("ULL_RC3 <=", value, "ullRc3");
            return (Criteria) this;
        }

        public Criteria andUllRc3In(List<Integer> values) {
            addCriterion("ULL_RC3 in", values, "ullRc3");
            return (Criteria) this;
        }

        public Criteria andUllRc3NotIn(List<Integer> values) {
            addCriterion("ULL_RC3 not in", values, "ullRc3");
            return (Criteria) this;
        }

        public Criteria andUllRc3Between(Integer value1, Integer value2) {
            addCriterion("ULL_RC3 between", value1, value2, "ullRc3");
            return (Criteria) this;
        }

        public Criteria andUllRc3NotBetween(Integer value1, Integer value2) {
            addCriterion("ULL_RC3 not between", value1, value2, "ullRc3");
            return (Criteria) this;
        }

        public Criteria andUllRc4IsNull() {
            addCriterion("ULL_RC4 is null");
            return (Criteria) this;
        }

        public Criteria andUllRc4IsNotNull() {
            addCriterion("ULL_RC4 is not null");
            return (Criteria) this;
        }

        public Criteria andUllRc4EqualTo(Integer value) {
            addCriterion("ULL_RC4 =", value, "ullRc4");
            return (Criteria) this;
        }

        public Criteria andUllRc4NotEqualTo(Integer value) {
            addCriterion("ULL_RC4 <>", value, "ullRc4");
            return (Criteria) this;
        }

        public Criteria andUllRc4GreaterThan(Integer value) {
            addCriterion("ULL_RC4 >", value, "ullRc4");
            return (Criteria) this;
        }

        public Criteria andUllRc4GreaterThanOrEqualTo(Integer value) {
            addCriterion("ULL_RC4 >=", value, "ullRc4");
            return (Criteria) this;
        }

        public Criteria andUllRc4LessThan(Integer value) {
            addCriterion("ULL_RC4 <", value, "ullRc4");
            return (Criteria) this;
        }

        public Criteria andUllRc4LessThanOrEqualTo(Integer value) {
            addCriterion("ULL_RC4 <=", value, "ullRc4");
            return (Criteria) this;
        }

        public Criteria andUllRc4In(List<Integer> values) {
            addCriterion("ULL_RC4 in", values, "ullRc4");
            return (Criteria) this;
        }

        public Criteria andUllRc4NotIn(List<Integer> values) {
            addCriterion("ULL_RC4 not in", values, "ullRc4");
            return (Criteria) this;
        }

        public Criteria andUllRc4Between(Integer value1, Integer value2) {
            addCriterion("ULL_RC4 between", value1, value2, "ullRc4");
            return (Criteria) this;
        }

        public Criteria andUllRc4NotBetween(Integer value1, Integer value2) {
            addCriterion("ULL_RC4 not between", value1, value2, "ullRc4");
            return (Criteria) this;
        }

        public Criteria andUllRc5IsNull() {
            addCriterion("ULL_RC5 is null");
            return (Criteria) this;
        }

        public Criteria andUllRc5IsNotNull() {
            addCriterion("ULL_RC5 is not null");
            return (Criteria) this;
        }

        public Criteria andUllRc5EqualTo(Date value) {
            addCriterionForJDBCDate("ULL_RC5 =", value, "ullRc5");
            return (Criteria) this;
        }

        public Criteria andUllRc5NotEqualTo(Date value) {
            addCriterionForJDBCDate("ULL_RC5 <>", value, "ullRc5");
            return (Criteria) this;
        }

        public Criteria andUllRc5GreaterThan(Date value) {
            addCriterionForJDBCDate("ULL_RC5 >", value, "ullRc5");
            return (Criteria) this;
        }

        public Criteria andUllRc5GreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ULL_RC5 >=", value, "ullRc5");
            return (Criteria) this;
        }

        public Criteria andUllRc5LessThan(Date value) {
            addCriterionForJDBCDate("ULL_RC5 <", value, "ullRc5");
            return (Criteria) this;
        }

        public Criteria andUllRc5LessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ULL_RC5 <=", value, "ullRc5");
            return (Criteria) this;
        }

        public Criteria andUllRc5In(List<Date> values) {
            addCriterionForJDBCDate("ULL_RC5 in", values, "ullRc5");
            return (Criteria) this;
        }

        public Criteria andUllRc5NotIn(List<Date> values) {
            addCriterionForJDBCDate("ULL_RC5 not in", values, "ullRc5");
            return (Criteria) this;
        }

        public Criteria andUllRc5Between(Date value1, Date value2) {
            addCriterionForJDBCDate("ULL_RC5 between", value1, value2, "ullRc5");
            return (Criteria) this;
        }

        public Criteria andUllRc5NotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ULL_RC5 not between", value1, value2, "ullRc5");
            return (Criteria) this;
        }

        public Criteria andUllAccountLikeInsensitive(String value) {
            addCriterion("upper(ULL_ACCOUNT) like", value.toUpperCase(), "ullAccount");
            return (Criteria) this;
        }

        public Criteria andUllMacLikeInsensitive(String value) {
            addCriterion("upper(ULL_MAC) like", value.toUpperCase(), "ullMac");
            return (Criteria) this;
        }

        public Criteria andUllIpLikeInsensitive(String value) {
            addCriterion("upper(ULL_IP) like", value.toUpperCase(), "ullIp");
            return (Criteria) this;
        }

        public Criteria andUllRc0LikeInsensitive(String value) {
            addCriterion("upper(ULL_RC0) like", value.toUpperCase(), "ullRc0");
            return (Criteria) this;
        }

        public Criteria andUllRc1LikeInsensitive(String value) {
            addCriterion("upper(ULL_RC1) like", value.toUpperCase(), "ullRc1");
            return (Criteria) this;
        }

        public Criteria andUllRc2LikeInsensitive(String value) {
            addCriterion("upper(ULL_RC2) like", value.toUpperCase(), "ullRc2");
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