package com.limp.framework.boss.domain;

import com.limp.framework.core.bean.Pager;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserSetExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Pager page;

    public UserSetExample() {
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

        public Criteria andUseridIsNull() {
            addCriterion("LUS_USERID is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("LUS_USERID is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(String value) {
            addCriterion("LUS_USERID =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("LUS_USERID <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("LUS_USERID >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("LUS_USERID >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("LUS_USERID <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("LUS_USERID <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("LUS_USERID like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("LUS_USERID not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("LUS_USERID in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("LUS_USERID not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("LUS_USERID between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("LUS_USERID not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andMenuidIsNull() {
            addCriterion("LUS_MENUID is null");
            return (Criteria) this;
        }

        public Criteria andMenuidIsNotNull() {
            addCriterion("LUS_MENUID is not null");
            return (Criteria) this;
        }

        public Criteria andMenuidEqualTo(String value) {
            addCriterion("LUS_MENUID =", value, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidNotEqualTo(String value) {
            addCriterion("LUS_MENUID <>", value, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidGreaterThan(String value) {
            addCriterion("LUS_MENUID >", value, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidGreaterThanOrEqualTo(String value) {
            addCriterion("LUS_MENUID >=", value, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidLessThan(String value) {
            addCriterion("LUS_MENUID <", value, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidLessThanOrEqualTo(String value) {
            addCriterion("LUS_MENUID <=", value, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidLike(String value) {
            addCriterion("LUS_MENUID like", value, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidNotLike(String value) {
            addCriterion("LUS_MENUID not like", value, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidIn(List<String> values) {
            addCriterion("LUS_MENUID in", values, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidNotIn(List<String> values) {
            addCriterion("LUS_MENUID not in", values, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidBetween(String value1, String value2) {
            addCriterion("LUS_MENUID between", value1, value2, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidNotBetween(String value1, String value2) {
            addCriterion("LUS_MENUID not between", value1, value2, "menuid");
            return (Criteria) this;
        }

        public Criteria andBegindateIsNull() {
            addCriterion("LUS_BEGINDATE is null");
            return (Criteria) this;
        }

        public Criteria andBegindateIsNotNull() {
            addCriterion("LUS_BEGINDATE is not null");
            return (Criteria) this;
        }

        public Criteria andBegindateEqualTo(Date value) {
            addCriterion("LUS_BEGINDATE =", value, "begindate");
            return (Criteria) this;
        }

        public Criteria andBegindateNotEqualTo(Date value) {
            addCriterion("LUS_BEGINDATE <>", value, "begindate");
            return (Criteria) this;
        }

        public Criteria andBegindateGreaterThan(Date value) {
            addCriterion("LUS_BEGINDATE >", value, "begindate");
            return (Criteria) this;
        }

        public Criteria andBegindateGreaterThanOrEqualTo(Date value) {
            addCriterion("LUS_BEGINDATE >=", value, "begindate");
            return (Criteria) this;
        }

        public Criteria andBegindateLessThan(Date value) {
            addCriterion("LUS_BEGINDATE <", value, "begindate");
            return (Criteria) this;
        }

        public Criteria andBegindateLessThanOrEqualTo(Date value) {
            addCriterion("LUS_BEGINDATE <=", value, "begindate");
            return (Criteria) this;
        }

        public Criteria andBegindateIn(List<Date> values) {
            addCriterion("LUS_BEGINDATE in", values, "begindate");
            return (Criteria) this;
        }

        public Criteria andBegindateNotIn(List<Date> values) {
            addCriterion("LUS_BEGINDATE not in", values, "begindate");
            return (Criteria) this;
        }

        public Criteria andBegindateBetween(Date value1, Date value2) {
            addCriterion("LUS_BEGINDATE between", value1, value2, "begindate");
            return (Criteria) this;
        }

        public Criteria andBegindateNotBetween(Date value1, Date value2) {
            addCriterion("LUS_BEGINDATE not between", value1, value2, "begindate");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNull() {
            addCriterion("LUS_ENDDATE is null");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNotNull() {
            addCriterion("LUS_ENDDATE is not null");
            return (Criteria) this;
        }

        public Criteria andEnddateEqualTo(Date value) {
            addCriterion("LUS_ENDDATE =", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotEqualTo(Date value) {
            addCriterion("LUS_ENDDATE <>", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThan(Date value) {
            addCriterion("LUS_ENDDATE >", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThanOrEqualTo(Date value) {
            addCriterion("LUS_ENDDATE >=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThan(Date value) {
            addCriterion("LUS_ENDDATE <", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThanOrEqualTo(Date value) {
            addCriterion("LUS_ENDDATE <=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateIn(List<Date> values) {
            addCriterion("LUS_ENDDATE in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotIn(List<Date> values) {
            addCriterion("LUS_ENDDATE not in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateBetween(Date value1, Date value2) {
            addCriterion("LUS_ENDDATE between", value1, value2, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotBetween(Date value1, Date value2) {
            addCriterion("LUS_ENDDATE not between", value1, value2, "enddate");
            return (Criteria) this;
        }

        public Criteria andShowLimitIsNull() {
            addCriterion("LUS_SHOW_LIMIT is null");
            return (Criteria) this;
        }

        public Criteria andShowLimitIsNotNull() {
            addCriterion("LUS_SHOW_LIMIT is not null");
            return (Criteria) this;
        }

        public Criteria andShowLimitEqualTo(Short value) {
            addCriterion("LUS_SHOW_LIMIT =", value, "showLimit");
            return (Criteria) this;
        }

        public Criteria andShowLimitNotEqualTo(Short value) {
            addCriterion("LUS_SHOW_LIMIT <>", value, "showLimit");
            return (Criteria) this;
        }

        public Criteria andShowLimitGreaterThan(Short value) {
            addCriterion("LUS_SHOW_LIMIT >", value, "showLimit");
            return (Criteria) this;
        }

        public Criteria andShowLimitGreaterThanOrEqualTo(Short value) {
            addCriterion("LUS_SHOW_LIMIT >=", value, "showLimit");
            return (Criteria) this;
        }

        public Criteria andShowLimitLessThan(Short value) {
            addCriterion("LUS_SHOW_LIMIT <", value, "showLimit");
            return (Criteria) this;
        }

        public Criteria andShowLimitLessThanOrEqualTo(Short value) {
            addCriterion("LUS_SHOW_LIMIT <=", value, "showLimit");
            return (Criteria) this;
        }

        public Criteria andShowLimitIn(List<Short> values) {
            addCriterion("LUS_SHOW_LIMIT in", values, "showLimit");
            return (Criteria) this;
        }

        public Criteria andShowLimitNotIn(List<Short> values) {
            addCriterion("LUS_SHOW_LIMIT not in", values, "showLimit");
            return (Criteria) this;
        }

        public Criteria andShowLimitBetween(Short value1, Short value2) {
            addCriterion("LUS_SHOW_LIMIT between", value1, value2, "showLimit");
            return (Criteria) this;
        }

        public Criteria andShowLimitNotBetween(Short value1, Short value2) {
            addCriterion("LUS_SHOW_LIMIT not between", value1, value2, "showLimit");
            return (Criteria) this;
        }

        public Criteria andSettypeIsNull() {
            addCriterion("LUS_SETTYPE is null");
            return (Criteria) this;
        }

        public Criteria andSettypeIsNotNull() {
            addCriterion("LUS_SETTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSettypeEqualTo(Short value) {
            addCriterion("LUS_SETTYPE =", value, "settype");
            return (Criteria) this;
        }

        public Criteria andSettypeNotEqualTo(Short value) {
            addCriterion("LUS_SETTYPE <>", value, "settype");
            return (Criteria) this;
        }

        public Criteria andSettypeGreaterThan(Short value) {
            addCriterion("LUS_SETTYPE >", value, "settype");
            return (Criteria) this;
        }

        public Criteria andSettypeGreaterThanOrEqualTo(Short value) {
            addCriterion("LUS_SETTYPE >=", value, "settype");
            return (Criteria) this;
        }

        public Criteria andSettypeLessThan(Short value) {
            addCriterion("LUS_SETTYPE <", value, "settype");
            return (Criteria) this;
        }

        public Criteria andSettypeLessThanOrEqualTo(Short value) {
            addCriterion("LUS_SETTYPE <=", value, "settype");
            return (Criteria) this;
        }

        public Criteria andSettypeIn(List<Short> values) {
            addCriterion("LUS_SETTYPE in", values, "settype");
            return (Criteria) this;
        }

        public Criteria andSettypeNotIn(List<Short> values) {
            addCriterion("LUS_SETTYPE not in", values, "settype");
            return (Criteria) this;
        }

        public Criteria andSettypeBetween(Short value1, Short value2) {
            addCriterion("LUS_SETTYPE between", value1, value2, "settype");
            return (Criteria) this;
        }

        public Criteria andSettypeNotBetween(Short value1, Short value2) {
            addCriterion("LUS_SETTYPE not between", value1, value2, "settype");
            return (Criteria) this;
        }

        public Criteria andTotalCountIsNull() {
            addCriterion("LUS_TOTAL_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andTotalCountIsNotNull() {
            addCriterion("LUS_TOTAL_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andTotalCountEqualTo(Short value) {
            addCriterion("LUS_TOTAL_COUNT =", value, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountNotEqualTo(Short value) {
            addCriterion("LUS_TOTAL_COUNT <>", value, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountGreaterThan(Short value) {
            addCriterion("LUS_TOTAL_COUNT >", value, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountGreaterThanOrEqualTo(Short value) {
            addCriterion("LUS_TOTAL_COUNT >=", value, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountLessThan(Short value) {
            addCriterion("LUS_TOTAL_COUNT <", value, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountLessThanOrEqualTo(Short value) {
            addCriterion("LUS_TOTAL_COUNT <=", value, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountIn(List<Short> values) {
            addCriterion("LUS_TOTAL_COUNT in", values, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountNotIn(List<Short> values) {
            addCriterion("LUS_TOTAL_COUNT not in", values, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountBetween(Short value1, Short value2) {
            addCriterion("LUS_TOTAL_COUNT between", value1, value2, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountNotBetween(Short value1, Short value2) {
            addCriterion("LUS_TOTAL_COUNT not between", value1, value2, "totalCount");
            return (Criteria) this;
        }

        public Criteria andUsedCountIsNull() {
            addCriterion("LUS_USED_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andUsedCountIsNotNull() {
            addCriterion("LUS_USED_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andUsedCountEqualTo(Short value) {
            addCriterion("LUS_USED_COUNT =", value, "usedCount");
            return (Criteria) this;
        }

        public Criteria andUsedCountNotEqualTo(Short value) {
            addCriterion("LUS_USED_COUNT <>", value, "usedCount");
            return (Criteria) this;
        }

        public Criteria andUsedCountGreaterThan(Short value) {
            addCriterion("LUS_USED_COUNT >", value, "usedCount");
            return (Criteria) this;
        }

        public Criteria andUsedCountGreaterThanOrEqualTo(Short value) {
            addCriterion("LUS_USED_COUNT >=", value, "usedCount");
            return (Criteria) this;
        }

        public Criteria andUsedCountLessThan(Short value) {
            addCriterion("LUS_USED_COUNT <", value, "usedCount");
            return (Criteria) this;
        }

        public Criteria andUsedCountLessThanOrEqualTo(Short value) {
            addCriterion("LUS_USED_COUNT <=", value, "usedCount");
            return (Criteria) this;
        }

        public Criteria andUsedCountIn(List<Short> values) {
            addCriterion("LUS_USED_COUNT in", values, "usedCount");
            return (Criteria) this;
        }

        public Criteria andUsedCountNotIn(List<Short> values) {
            addCriterion("LUS_USED_COUNT not in", values, "usedCount");
            return (Criteria) this;
        }

        public Criteria andUsedCountBetween(Short value1, Short value2) {
            addCriterion("LUS_USED_COUNT between", value1, value2, "usedCount");
            return (Criteria) this;
        }

        public Criteria andUsedCountNotBetween(Short value1, Short value2) {
            addCriterion("LUS_USED_COUNT not between", value1, value2, "usedCount");
            return (Criteria) this;
        }

        public Criteria andRetainCountIsNull() {
            addCriterion("LUS_RETAIN_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andRetainCountIsNotNull() {
            addCriterion("LUS_RETAIN_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andRetainCountEqualTo(Short value) {
            addCriterion("LUS_RETAIN_COUNT =", value, "retainCount");
            return (Criteria) this;
        }

        public Criteria andRetainCountNotEqualTo(Short value) {
            addCriterion("LUS_RETAIN_COUNT <>", value, "retainCount");
            return (Criteria) this;
        }

        public Criteria andRetainCountGreaterThan(Short value) {
            addCriterion("LUS_RETAIN_COUNT >", value, "retainCount");
            return (Criteria) this;
        }

        public Criteria andRetainCountGreaterThanOrEqualTo(Short value) {
            addCriterion("LUS_RETAIN_COUNT >=", value, "retainCount");
            return (Criteria) this;
        }

        public Criteria andRetainCountLessThan(Short value) {
            addCriterion("LUS_RETAIN_COUNT <", value, "retainCount");
            return (Criteria) this;
        }

        public Criteria andRetainCountLessThanOrEqualTo(Short value) {
            addCriterion("LUS_RETAIN_COUNT <=", value, "retainCount");
            return (Criteria) this;
        }

        public Criteria andRetainCountIn(List<Short> values) {
            addCriterion("LUS_RETAIN_COUNT in", values, "retainCount");
            return (Criteria) this;
        }

        public Criteria andRetainCountNotIn(List<Short> values) {
            addCriterion("LUS_RETAIN_COUNT not in", values, "retainCount");
            return (Criteria) this;
        }

        public Criteria andRetainCountBetween(Short value1, Short value2) {
            addCriterion("LUS_RETAIN_COUNT between", value1, value2, "retainCount");
            return (Criteria) this;
        }

        public Criteria andRetainCountNotBetween(Short value1, Short value2) {
            addCriterion("LUS_RETAIN_COUNT not between", value1, value2, "retainCount");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("LUS_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("LUS_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Short value) {
            addCriterion("LUS_STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Short value) {
            addCriterion("LUS_STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Short value) {
            addCriterion("LUS_STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("LUS_STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Short value) {
            addCriterion("LUS_STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Short value) {
            addCriterion("LUS_STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Short> values) {
            addCriterion("LUS_STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Short> values) {
            addCriterion("LUS_STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Short value1, Short value2) {
            addCriterion("LUS_STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Short value1, Short value2) {
            addCriterion("LUS_STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andRc1IsNull() {
            addCriterion("LUS_RC1 is null");
            return (Criteria) this;
        }

        public Criteria andRc1IsNotNull() {
            addCriterion("LUS_RC1 is not null");
            return (Criteria) this;
        }

        public Criteria andRc1EqualTo(Date value) {
            addCriterion("LUS_RC1 =", value, "rc1");
            return (Criteria) this;
        }

        public Criteria andRc1NotEqualTo(Date value) {
            addCriterion("LUS_RC1 <>", value, "rc1");
            return (Criteria) this;
        }

        public Criteria andRc1GreaterThan(Date value) {
            addCriterion("LUS_RC1 >", value, "rc1");
            return (Criteria) this;
        }

        public Criteria andRc1GreaterThanOrEqualTo(Date value) {
            addCriterion("LUS_RC1 >=", value, "rc1");
            return (Criteria) this;
        }

        public Criteria andRc1LessThan(Date value) {
            addCriterion("LUS_RC1 <", value, "rc1");
            return (Criteria) this;
        }

        public Criteria andRc1LessThanOrEqualTo(Date value) {
            addCriterion("LUS_RC1 <=", value, "rc1");
            return (Criteria) this;
        }

        public Criteria andRc1In(List<Date> values) {
            addCriterion("LUS_RC1 in", values, "rc1");
            return (Criteria) this;
        }

        public Criteria andRc1NotIn(List<Date> values) {
            addCriterion("LUS_RC1 not in", values, "rc1");
            return (Criteria) this;
        }

        public Criteria andRc1Between(Date value1, Date value2) {
            addCriterion("LUS_RC1 between", value1, value2, "rc1");
            return (Criteria) this;
        }

        public Criteria andRc1NotBetween(Date value1, Date value2) {
            addCriterion("LUS_RC1 not between", value1, value2, "rc1");
            return (Criteria) this;
        }

        public Criteria andRc2IsNull() {
            addCriterion("LUS_RC2 is null");
            return (Criteria) this;
        }

        public Criteria andRc2IsNotNull() {
            addCriterion("LUS_RC2 is not null");
            return (Criteria) this;
        }

        public Criteria andRc2EqualTo(Short value) {
            addCriterion("LUS_RC2 =", value, "rc2");
            return (Criteria) this;
        }

        public Criteria andRc2NotEqualTo(Short value) {
            addCriterion("LUS_RC2 <>", value, "rc2");
            return (Criteria) this;
        }

        public Criteria andRc2GreaterThan(Short value) {
            addCriterion("LUS_RC2 >", value, "rc2");
            return (Criteria) this;
        }

        public Criteria andRc2GreaterThanOrEqualTo(Short value) {
            addCriterion("LUS_RC2 >=", value, "rc2");
            return (Criteria) this;
        }

        public Criteria andRc2LessThan(Short value) {
            addCriterion("LUS_RC2 <", value, "rc2");
            return (Criteria) this;
        }

        public Criteria andRc2LessThanOrEqualTo(Short value) {
            addCriterion("LUS_RC2 <=", value, "rc2");
            return (Criteria) this;
        }

        public Criteria andRc2In(List<Short> values) {
            addCriterion("LUS_RC2 in", values, "rc2");
            return (Criteria) this;
        }

        public Criteria andRc2NotIn(List<Short> values) {
            addCriterion("LUS_RC2 not in", values, "rc2");
            return (Criteria) this;
        }

        public Criteria andRc2Between(Short value1, Short value2) {
            addCriterion("LUS_RC2 between", value1, value2, "rc2");
            return (Criteria) this;
        }

        public Criteria andRc2NotBetween(Short value1, Short value2) {
            addCriterion("LUS_RC2 not between", value1, value2, "rc2");
            return (Criteria) this;
        }

        public Criteria andRc3IsNull() {
            addCriterion("LUS_RC3 is null");
            return (Criteria) this;
        }

        public Criteria andRc3IsNotNull() {
            addCriterion("LUS_RC3 is not null");
            return (Criteria) this;
        }

        public Criteria andRc3EqualTo(Short value) {
            addCriterion("LUS_RC3 =", value, "rc3");
            return (Criteria) this;
        }

        public Criteria andRc3NotEqualTo(Short value) {
            addCriterion("LUS_RC3 <>", value, "rc3");
            return (Criteria) this;
        }

        public Criteria andRc3GreaterThan(Short value) {
            addCriterion("LUS_RC3 >", value, "rc3");
            return (Criteria) this;
        }

        public Criteria andRc3GreaterThanOrEqualTo(Short value) {
            addCriterion("LUS_RC3 >=", value, "rc3");
            return (Criteria) this;
        }

        public Criteria andRc3LessThan(Short value) {
            addCriterion("LUS_RC3 <", value, "rc3");
            return (Criteria) this;
        }

        public Criteria andRc3LessThanOrEqualTo(Short value) {
            addCriterion("LUS_RC3 <=", value, "rc3");
            return (Criteria) this;
        }

        public Criteria andRc3In(List<Short> values) {
            addCriterion("LUS_RC3 in", values, "rc3");
            return (Criteria) this;
        }

        public Criteria andRc3NotIn(List<Short> values) {
            addCriterion("LUS_RC3 not in", values, "rc3");
            return (Criteria) this;
        }

        public Criteria andRc3Between(Short value1, Short value2) {
            addCriterion("LUS_RC3 between", value1, value2, "rc3");
            return (Criteria) this;
        }

        public Criteria andRc3NotBetween(Short value1, Short value2) {
            addCriterion("LUS_RC3 not between", value1, value2, "rc3");
            return (Criteria) this;
        }

        public Criteria andRc4IsNull() {
            addCriterion("LUS_RC4 is null");
            return (Criteria) this;
        }

        public Criteria andRc4IsNotNull() {
            addCriterion("LUS_RC4 is not null");
            return (Criteria) this;
        }

        public Criteria andRc4EqualTo(String value) {
            addCriterion("LUS_RC4 =", value, "rc4");
            return (Criteria) this;
        }

        public Criteria andRc4NotEqualTo(String value) {
            addCriterion("LUS_RC4 <>", value, "rc4");
            return (Criteria) this;
        }

        public Criteria andRc4GreaterThan(String value) {
            addCriterion("LUS_RC4 >", value, "rc4");
            return (Criteria) this;
        }

        public Criteria andRc4GreaterThanOrEqualTo(String value) {
            addCriterion("LUS_RC4 >=", value, "rc4");
            return (Criteria) this;
        }

        public Criteria andRc4LessThan(String value) {
            addCriterion("LUS_RC4 <", value, "rc4");
            return (Criteria) this;
        }

        public Criteria andRc4LessThanOrEqualTo(String value) {
            addCriterion("LUS_RC4 <=", value, "rc4");
            return (Criteria) this;
        }

        public Criteria andRc4Like(String value) {
            addCriterion("LUS_RC4 like", value, "rc4");
            return (Criteria) this;
        }

        public Criteria andRc4NotLike(String value) {
            addCriterion("LUS_RC4 not like", value, "rc4");
            return (Criteria) this;
        }

        public Criteria andRc4In(List<String> values) {
            addCriterion("LUS_RC4 in", values, "rc4");
            return (Criteria) this;
        }

        public Criteria andRc4NotIn(List<String> values) {
            addCriterion("LUS_RC4 not in", values, "rc4");
            return (Criteria) this;
        }

        public Criteria andRc4Between(String value1, String value2) {
            addCriterion("LUS_RC4 between", value1, value2, "rc4");
            return (Criteria) this;
        }

        public Criteria andRc4NotBetween(String value1, String value2) {
            addCriterion("LUS_RC4 not between", value1, value2, "rc4");
            return (Criteria) this;
        }

        public Criteria andRc5IsNull() {
            addCriterion("LUS_RC5 is null");
            return (Criteria) this;
        }

        public Criteria andRc5IsNotNull() {
            addCriterion("LUS_RC5 is not null");
            return (Criteria) this;
        }

        public Criteria andRc5EqualTo(String value) {
            addCriterion("LUS_RC5 =", value, "rc5");
            return (Criteria) this;
        }

        public Criteria andRc5NotEqualTo(String value) {
            addCriterion("LUS_RC5 <>", value, "rc5");
            return (Criteria) this;
        }

        public Criteria andRc5GreaterThan(String value) {
            addCriterion("LUS_RC5 >", value, "rc5");
            return (Criteria) this;
        }

        public Criteria andRc5GreaterThanOrEqualTo(String value) {
            addCriterion("LUS_RC5 >=", value, "rc5");
            return (Criteria) this;
        }

        public Criteria andRc5LessThan(String value) {
            addCriterion("LUS_RC5 <", value, "rc5");
            return (Criteria) this;
        }

        public Criteria andRc5LessThanOrEqualTo(String value) {
            addCriterion("LUS_RC5 <=", value, "rc5");
            return (Criteria) this;
        }

        public Criteria andRc5Like(String value) {
            addCriterion("LUS_RC5 like", value, "rc5");
            return (Criteria) this;
        }

        public Criteria andRc5NotLike(String value) {
            addCriterion("LUS_RC5 not like", value, "rc5");
            return (Criteria) this;
        }

        public Criteria andRc5In(List<String> values) {
            addCriterion("LUS_RC5 in", values, "rc5");
            return (Criteria) this;
        }

        public Criteria andRc5NotIn(List<String> values) {
            addCriterion("LUS_RC5 not in", values, "rc5");
            return (Criteria) this;
        }

        public Criteria andRc5Between(String value1, String value2) {
            addCriterion("LUS_RC5 between", value1, value2, "rc5");
            return (Criteria) this;
        }

        public Criteria andRc5NotBetween(String value1, String value2) {
            addCriterion("LUS_RC5 not between", value1, value2, "rc5");
            return (Criteria) this;
        }

        public Criteria andIdtIsNull() {
            addCriterion("LUS_IDT is null");
            return (Criteria) this;
        }

        public Criteria andIdtIsNotNull() {
            addCriterion("LUS_IDT is not null");
            return (Criteria) this;
        }

        public Criteria andIdtEqualTo(Date value) {
            addCriterion("LUS_IDT =", value, "idt");
            return (Criteria) this;
        }

        public Criteria andIdtNotEqualTo(Date value) {
            addCriterion("LUS_IDT <>", value, "idt");
            return (Criteria) this;
        }

        public Criteria andIdtGreaterThan(Date value) {
            addCriterion("LUS_IDT >", value, "idt");
            return (Criteria) this;
        }

        public Criteria andIdtGreaterThanOrEqualTo(Date value) {
            addCriterion("LUS_IDT >=", value, "idt");
            return (Criteria) this;
        }

        public Criteria andIdtLessThan(Date value) {
            addCriterion("LUS_IDT <", value, "idt");
            return (Criteria) this;
        }

        public Criteria andIdtLessThanOrEqualTo(Date value) {
            addCriterion("LUS_IDT <=", value, "idt");
            return (Criteria) this;
        }

        public Criteria andIdtIn(List<Date> values) {
            addCriterion("LUS_IDT in", values, "idt");
            return (Criteria) this;
        }

        public Criteria andIdtNotIn(List<Date> values) {
            addCriterion("LUS_IDT not in", values, "idt");
            return (Criteria) this;
        }

        public Criteria andIdtBetween(Date value1, Date value2) {
            addCriterion("LUS_IDT between", value1, value2, "idt");
            return (Criteria) this;
        }

        public Criteria andIdtNotBetween(Date value1, Date value2) {
            addCriterion("LUS_IDT not between", value1, value2, "idt");
            return (Criteria) this;
        }

        public Criteria andUseridLikeInsensitive(String value) {
            addCriterion("upper(LUS_USERID) like", value.toUpperCase(), "userid");
            return (Criteria) this;
        }

        public Criteria andMenuidLikeInsensitive(String value) {
            addCriterion("upper(LUS_MENUID) like", value.toUpperCase(), "menuid");
            return (Criteria) this;
        }

        public Criteria andRc4LikeInsensitive(String value) {
            addCriterion("upper(LUS_RC4) like", value.toUpperCase(), "rc4");
            return (Criteria) this;
        }

        public Criteria andRc5LikeInsensitive(String value) {
            addCriterion("upper(LUS_RC5) like", value.toUpperCase(), "rc5");
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