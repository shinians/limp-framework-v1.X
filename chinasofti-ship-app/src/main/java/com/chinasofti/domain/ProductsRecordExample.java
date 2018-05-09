package com.chinasofti.domain;

import com.limp.framework.core.bean.Pager;

import java.util.ArrayList;
import java.util.List;

public class ProductsRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Pager page;

    public ProductsRecordExample() {
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
            addCriterion("CPR_ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("CPR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("CPR_ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("CPR_ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("CPR_ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("CPR_ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("CPR_ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("CPR_ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("CPR_ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("CPR_ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("CPR_ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("CPR_ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("CPR_ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("CPR_ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andPronameIsNull() {
            addCriterion("CPR_PRONAME is null");
            return (Criteria) this;
        }

        public Criteria andPronameIsNotNull() {
            addCriterion("CPR_PRONAME is not null");
            return (Criteria) this;
        }

        public Criteria andPronameEqualTo(String value) {
            addCriterion("CPR_PRONAME =", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameNotEqualTo(String value) {
            addCriterion("CPR_PRONAME <>", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameGreaterThan(String value) {
            addCriterion("CPR_PRONAME >", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameGreaterThanOrEqualTo(String value) {
            addCriterion("CPR_PRONAME >=", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameLessThan(String value) {
            addCriterion("CPR_PRONAME <", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameLessThanOrEqualTo(String value) {
            addCriterion("CPR_PRONAME <=", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameLike(String value) {
            addCriterion("CPR_PRONAME like", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameNotLike(String value) {
            addCriterion("CPR_PRONAME not like", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameIn(List<String> values) {
            addCriterion("CPR_PRONAME in", values, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameNotIn(List<String> values) {
            addCriterion("CPR_PRONAME not in", values, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameBetween(String value1, String value2) {
            addCriterion("CPR_PRONAME between", value1, value2, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameNotBetween(String value1, String value2) {
            addCriterion("CPR_PRONAME not between", value1, value2, "proname");
            return (Criteria) this;
        }

        public Criteria andPronumberIsNull() {
            addCriterion("CPR_PRONUMBER is null");
            return (Criteria) this;
        }

        public Criteria andPronumberIsNotNull() {
            addCriterion("CPR_PRONUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andPronumberEqualTo(String value) {
            addCriterion("CPR_PRONUMBER =", value, "pronumber");
            return (Criteria) this;
        }

        public Criteria andPronumberNotEqualTo(String value) {
            addCriterion("CPR_PRONUMBER <>", value, "pronumber");
            return (Criteria) this;
        }

        public Criteria andPronumberGreaterThan(String value) {
            addCriterion("CPR_PRONUMBER >", value, "pronumber");
            return (Criteria) this;
        }

        public Criteria andPronumberGreaterThanOrEqualTo(String value) {
            addCriterion("CPR_PRONUMBER >=", value, "pronumber");
            return (Criteria) this;
        }

        public Criteria andPronumberLessThan(String value) {
            addCriterion("CPR_PRONUMBER <", value, "pronumber");
            return (Criteria) this;
        }

        public Criteria andPronumberLessThanOrEqualTo(String value) {
            addCriterion("CPR_PRONUMBER <=", value, "pronumber");
            return (Criteria) this;
        }

        public Criteria andPronumberLike(String value) {
            addCriterion("CPR_PRONUMBER like", value, "pronumber");
            return (Criteria) this;
        }

        public Criteria andPronumberNotLike(String value) {
            addCriterion("CPR_PRONUMBER not like", value, "pronumber");
            return (Criteria) this;
        }

        public Criteria andPronumberIn(List<String> values) {
            addCriterion("CPR_PRONUMBER in", values, "pronumber");
            return (Criteria) this;
        }

        public Criteria andPronumberNotIn(List<String> values) {
            addCriterion("CPR_PRONUMBER not in", values, "pronumber");
            return (Criteria) this;
        }

        public Criteria andPronumberBetween(String value1, String value2) {
            addCriterion("CPR_PRONUMBER between", value1, value2, "pronumber");
            return (Criteria) this;
        }

        public Criteria andPronumberNotBetween(String value1, String value2) {
            addCriterion("CPR_PRONUMBER not between", value1, value2, "pronumber");
            return (Criteria) this;
        }

        public Criteria andCertnumberIsNull() {
            addCriterion("CPR_CERTNUMBER is null");
            return (Criteria) this;
        }

        public Criteria andCertnumberIsNotNull() {
            addCriterion("CPR_CERTNUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andCertnumberEqualTo(String value) {
            addCriterion("CPR_CERTNUMBER =", value, "certnumber");
            return (Criteria) this;
        }

        public Criteria andCertnumberNotEqualTo(String value) {
            addCriterion("CPR_CERTNUMBER <>", value, "certnumber");
            return (Criteria) this;
        }

        public Criteria andCertnumberGreaterThan(String value) {
            addCriterion("CPR_CERTNUMBER >", value, "certnumber");
            return (Criteria) this;
        }

        public Criteria andCertnumberGreaterThanOrEqualTo(String value) {
            addCriterion("CPR_CERTNUMBER >=", value, "certnumber");
            return (Criteria) this;
        }

        public Criteria andCertnumberLessThan(String value) {
            addCriterion("CPR_CERTNUMBER <", value, "certnumber");
            return (Criteria) this;
        }

        public Criteria andCertnumberLessThanOrEqualTo(String value) {
            addCriterion("CPR_CERTNUMBER <=", value, "certnumber");
            return (Criteria) this;
        }

        public Criteria andCertnumberLike(String value) {
            addCriterion("CPR_CERTNUMBER like", value, "certnumber");
            return (Criteria) this;
        }

        public Criteria andCertnumberNotLike(String value) {
            addCriterion("CPR_CERTNUMBER not like", value, "certnumber");
            return (Criteria) this;
        }

        public Criteria andCertnumberIn(List<String> values) {
            addCriterion("CPR_CERTNUMBER in", values, "certnumber");
            return (Criteria) this;
        }

        public Criteria andCertnumberNotIn(List<String> values) {
            addCriterion("CPR_CERTNUMBER not in", values, "certnumber");
            return (Criteria) this;
        }

        public Criteria andCertnumberBetween(String value1, String value2) {
            addCriterion("CPR_CERTNUMBER between", value1, value2, "certnumber");
            return (Criteria) this;
        }

        public Criteria andCertnumberNotBetween(String value1, String value2) {
            addCriterion("CPR_CERTNUMBER not between", value1, value2, "certnumber");
            return (Criteria) this;
        }

        public Criteria andChecktimeIsNull() {
            addCriterion("CPR_CHECKTIME is null");
            return (Criteria) this;
        }

        public Criteria andChecktimeIsNotNull() {
            addCriterion("CPR_CHECKTIME is not null");
            return (Criteria) this;
        }

        public Criteria andChecktimeEqualTo(String value) {
            addCriterion("CPR_CHECKTIME =", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeNotEqualTo(String value) {
            addCriterion("CPR_CHECKTIME <>", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeGreaterThan(String value) {
            addCriterion("CPR_CHECKTIME >", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeGreaterThanOrEqualTo(String value) {
            addCriterion("CPR_CHECKTIME >=", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeLessThan(String value) {
            addCriterion("CPR_CHECKTIME <", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeLessThanOrEqualTo(String value) {
            addCriterion("CPR_CHECKTIME <=", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeLike(String value) {
            addCriterion("CPR_CHECKTIME like", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeNotLike(String value) {
            addCriterion("CPR_CHECKTIME not like", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeIn(List<String> values) {
            addCriterion("CPR_CHECKTIME in", values, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeNotIn(List<String> values) {
            addCriterion("CPR_CHECKTIME not in", values, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeBetween(String value1, String value2) {
            addCriterion("CPR_CHECKTIME between", value1, value2, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeNotBetween(String value1, String value2) {
            addCriterion("CPR_CHECKTIME not between", value1, value2, "checktime");
            return (Criteria) this;
        }

        public Criteria andShipnameIsNull() {
            addCriterion("CPR_SHIPNAME is null");
            return (Criteria) this;
        }

        public Criteria andShipnameIsNotNull() {
            addCriterion("CPR_SHIPNAME is not null");
            return (Criteria) this;
        }

        public Criteria andShipnameEqualTo(String value) {
            addCriterion("CPR_SHIPNAME =", value, "shipname");
            return (Criteria) this;
        }

        public Criteria andShipnameNotEqualTo(String value) {
            addCriterion("CPR_SHIPNAME <>", value, "shipname");
            return (Criteria) this;
        }

        public Criteria andShipnameGreaterThan(String value) {
            addCriterion("CPR_SHIPNAME >", value, "shipname");
            return (Criteria) this;
        }

        public Criteria andShipnameGreaterThanOrEqualTo(String value) {
            addCriterion("CPR_SHIPNAME >=", value, "shipname");
            return (Criteria) this;
        }

        public Criteria andShipnameLessThan(String value) {
            addCriterion("CPR_SHIPNAME <", value, "shipname");
            return (Criteria) this;
        }

        public Criteria andShipnameLessThanOrEqualTo(String value) {
            addCriterion("CPR_SHIPNAME <=", value, "shipname");
            return (Criteria) this;
        }

        public Criteria andShipnameLike(String value) {
            addCriterion("CPR_SHIPNAME like", value, "shipname");
            return (Criteria) this;
        }

        public Criteria andShipnameNotLike(String value) {
            addCriterion("CPR_SHIPNAME not like", value, "shipname");
            return (Criteria) this;
        }

        public Criteria andShipnameIn(List<String> values) {
            addCriterion("CPR_SHIPNAME in", values, "shipname");
            return (Criteria) this;
        }

        public Criteria andShipnameNotIn(List<String> values) {
            addCriterion("CPR_SHIPNAME not in", values, "shipname");
            return (Criteria) this;
        }

        public Criteria andShipnameBetween(String value1, String value2) {
            addCriterion("CPR_SHIPNAME between", value1, value2, "shipname");
            return (Criteria) this;
        }

        public Criteria andShipnameNotBetween(String value1, String value2) {
            addCriterion("CPR_SHIPNAME not between", value1, value2, "shipname");
            return (Criteria) this;
        }

        public Criteria andShipidIsNull() {
            addCriterion("CPR_SHIPID is null");
            return (Criteria) this;
        }

        public Criteria andShipidIsNotNull() {
            addCriterion("CPR_SHIPID is not null");
            return (Criteria) this;
        }

        public Criteria andShipidEqualTo(String value) {
            addCriterion("CPR_SHIPID =", value, "shipid");
            return (Criteria) this;
        }

        public Criteria andShipidNotEqualTo(String value) {
            addCriterion("CPR_SHIPID <>", value, "shipid");
            return (Criteria) this;
        }

        public Criteria andShipidGreaterThan(String value) {
            addCriterion("CPR_SHIPID >", value, "shipid");
            return (Criteria) this;
        }

        public Criteria andShipidGreaterThanOrEqualTo(String value) {
            addCriterion("CPR_SHIPID >=", value, "shipid");
            return (Criteria) this;
        }

        public Criteria andShipidLessThan(String value) {
            addCriterion("CPR_SHIPID <", value, "shipid");
            return (Criteria) this;
        }

        public Criteria andShipidLessThanOrEqualTo(String value) {
            addCriterion("CPR_SHIPID <=", value, "shipid");
            return (Criteria) this;
        }

        public Criteria andShipidLike(String value) {
            addCriterion("CPR_SHIPID like", value, "shipid");
            return (Criteria) this;
        }

        public Criteria andShipidNotLike(String value) {
            addCriterion("CPR_SHIPID not like", value, "shipid");
            return (Criteria) this;
        }

        public Criteria andShipidIn(List<String> values) {
            addCriterion("CPR_SHIPID in", values, "shipid");
            return (Criteria) this;
        }

        public Criteria andShipidNotIn(List<String> values) {
            addCriterion("CPR_SHIPID not in", values, "shipid");
            return (Criteria) this;
        }

        public Criteria andShipidBetween(String value1, String value2) {
            addCriterion("CPR_SHIPID between", value1, value2, "shipid");
            return (Criteria) this;
        }

        public Criteria andShipidNotBetween(String value1, String value2) {
            addCriterion("CPR_SHIPID not between", value1, value2, "shipid");
            return (Criteria) this;
        }

        public Criteria andCate1IsNull() {
            addCriterion("CPR_CATE1 is null");
            return (Criteria) this;
        }

        public Criteria andCate1IsNotNull() {
            addCriterion("CPR_CATE1 is not null");
            return (Criteria) this;
        }

        public Criteria andCate1EqualTo(String value) {
            addCriterion("CPR_CATE1 =", value, "cate1");
            return (Criteria) this;
        }

        public Criteria andCate1NotEqualTo(String value) {
            addCriterion("CPR_CATE1 <>", value, "cate1");
            return (Criteria) this;
        }

        public Criteria andCate1GreaterThan(String value) {
            addCriterion("CPR_CATE1 >", value, "cate1");
            return (Criteria) this;
        }

        public Criteria andCate1GreaterThanOrEqualTo(String value) {
            addCriterion("CPR_CATE1 >=", value, "cate1");
            return (Criteria) this;
        }

        public Criteria andCate1LessThan(String value) {
            addCriterion("CPR_CATE1 <", value, "cate1");
            return (Criteria) this;
        }

        public Criteria andCate1LessThanOrEqualTo(String value) {
            addCriterion("CPR_CATE1 <=", value, "cate1");
            return (Criteria) this;
        }

        public Criteria andCate1Like(String value) {
            addCriterion("CPR_CATE1 like", value, "cate1");
            return (Criteria) this;
        }

        public Criteria andCate1NotLike(String value) {
            addCriterion("CPR_CATE1 not like", value, "cate1");
            return (Criteria) this;
        }

        public Criteria andCate1In(List<String> values) {
            addCriterion("CPR_CATE1 in", values, "cate1");
            return (Criteria) this;
        }

        public Criteria andCate1NotIn(List<String> values) {
            addCriterion("CPR_CATE1 not in", values, "cate1");
            return (Criteria) this;
        }

        public Criteria andCate1Between(String value1, String value2) {
            addCriterion("CPR_CATE1 between", value1, value2, "cate1");
            return (Criteria) this;
        }

        public Criteria andCate1NotBetween(String value1, String value2) {
            addCriterion("CPR_CATE1 not between", value1, value2, "cate1");
            return (Criteria) this;
        }

        public Criteria andCate2IsNull() {
            addCriterion("CPR_CATE2 is null");
            return (Criteria) this;
        }

        public Criteria andCate2IsNotNull() {
            addCriterion("CPR_CATE2 is not null");
            return (Criteria) this;
        }

        public Criteria andCate2EqualTo(String value) {
            addCriterion("CPR_CATE2 =", value, "cate2");
            return (Criteria) this;
        }

        public Criteria andCate2NotEqualTo(String value) {
            addCriterion("CPR_CATE2 <>", value, "cate2");
            return (Criteria) this;
        }

        public Criteria andCate2GreaterThan(String value) {
            addCriterion("CPR_CATE2 >", value, "cate2");
            return (Criteria) this;
        }

        public Criteria andCate2GreaterThanOrEqualTo(String value) {
            addCriterion("CPR_CATE2 >=", value, "cate2");
            return (Criteria) this;
        }

        public Criteria andCate2LessThan(String value) {
            addCriterion("CPR_CATE2 <", value, "cate2");
            return (Criteria) this;
        }

        public Criteria andCate2LessThanOrEqualTo(String value) {
            addCriterion("CPR_CATE2 <=", value, "cate2");
            return (Criteria) this;
        }

        public Criteria andCate2Like(String value) {
            addCriterion("CPR_CATE2 like", value, "cate2");
            return (Criteria) this;
        }

        public Criteria andCate2NotLike(String value) {
            addCriterion("CPR_CATE2 not like", value, "cate2");
            return (Criteria) this;
        }

        public Criteria andCate2In(List<String> values) {
            addCriterion("CPR_CATE2 in", values, "cate2");
            return (Criteria) this;
        }

        public Criteria andCate2NotIn(List<String> values) {
            addCriterion("CPR_CATE2 not in", values, "cate2");
            return (Criteria) this;
        }

        public Criteria andCate2Between(String value1, String value2) {
            addCriterion("CPR_CATE2 between", value1, value2, "cate2");
            return (Criteria) this;
        }

        public Criteria andCate2NotBetween(String value1, String value2) {
            addCriterion("CPR_CATE2 not between", value1, value2, "cate2");
            return (Criteria) this;
        }

        public Criteria andCate3IsNull() {
            addCriterion("CPR_CATE3 is null");
            return (Criteria) this;
        }

        public Criteria andCate3IsNotNull() {
            addCriterion("CPR_CATE3 is not null");
            return (Criteria) this;
        }

        public Criteria andCate3EqualTo(String value) {
            addCriterion("CPR_CATE3 =", value, "cate3");
            return (Criteria) this;
        }

        public Criteria andCate3NotEqualTo(String value) {
            addCriterion("CPR_CATE3 <>", value, "cate3");
            return (Criteria) this;
        }

        public Criteria andCate3GreaterThan(String value) {
            addCriterion("CPR_CATE3 >", value, "cate3");
            return (Criteria) this;
        }

        public Criteria andCate3GreaterThanOrEqualTo(String value) {
            addCriterion("CPR_CATE3 >=", value, "cate3");
            return (Criteria) this;
        }

        public Criteria andCate3LessThan(String value) {
            addCriterion("CPR_CATE3 <", value, "cate3");
            return (Criteria) this;
        }

        public Criteria andCate3LessThanOrEqualTo(String value) {
            addCriterion("CPR_CATE3 <=", value, "cate3");
            return (Criteria) this;
        }

        public Criteria andCate3Like(String value) {
            addCriterion("CPR_CATE3 like", value, "cate3");
            return (Criteria) this;
        }

        public Criteria andCate3NotLike(String value) {
            addCriterion("CPR_CATE3 not like", value, "cate3");
            return (Criteria) this;
        }

        public Criteria andCate3In(List<String> values) {
            addCriterion("CPR_CATE3 in", values, "cate3");
            return (Criteria) this;
        }

        public Criteria andCate3NotIn(List<String> values) {
            addCriterion("CPR_CATE3 not in", values, "cate3");
            return (Criteria) this;
        }

        public Criteria andCate3Between(String value1, String value2) {
            addCriterion("CPR_CATE3 between", value1, value2, "cate3");
            return (Criteria) this;
        }

        public Criteria andCate3NotBetween(String value1, String value2) {
            addCriterion("CPR_CATE3 not between", value1, value2, "cate3");
            return (Criteria) this;
        }

        public Criteria andProducttimeIsNull() {
            addCriterion("CPR_PRODUCTTIME is null");
            return (Criteria) this;
        }

        public Criteria andProducttimeIsNotNull() {
            addCriterion("CPR_PRODUCTTIME is not null");
            return (Criteria) this;
        }

        public Criteria andProducttimeEqualTo(String value) {
            addCriterion("CPR_PRODUCTTIME =", value, "producttime");
            return (Criteria) this;
        }

        public Criteria andProducttimeNotEqualTo(String value) {
            addCriterion("CPR_PRODUCTTIME <>", value, "producttime");
            return (Criteria) this;
        }

        public Criteria andProducttimeGreaterThan(String value) {
            addCriterion("CPR_PRODUCTTIME >", value, "producttime");
            return (Criteria) this;
        }

        public Criteria andProducttimeGreaterThanOrEqualTo(String value) {
            addCriterion("CPR_PRODUCTTIME >=", value, "producttime");
            return (Criteria) this;
        }

        public Criteria andProducttimeLessThan(String value) {
            addCriterion("CPR_PRODUCTTIME <", value, "producttime");
            return (Criteria) this;
        }

        public Criteria andProducttimeLessThanOrEqualTo(String value) {
            addCriterion("CPR_PRODUCTTIME <=", value, "producttime");
            return (Criteria) this;
        }

        public Criteria andProducttimeLike(String value) {
            addCriterion("CPR_PRODUCTTIME like", value, "producttime");
            return (Criteria) this;
        }

        public Criteria andProducttimeNotLike(String value) {
            addCriterion("CPR_PRODUCTTIME not like", value, "producttime");
            return (Criteria) this;
        }

        public Criteria andProducttimeIn(List<String> values) {
            addCriterion("CPR_PRODUCTTIME in", values, "producttime");
            return (Criteria) this;
        }

        public Criteria andProducttimeNotIn(List<String> values) {
            addCriterion("CPR_PRODUCTTIME not in", values, "producttime");
            return (Criteria) this;
        }

        public Criteria andProducttimeBetween(String value1, String value2) {
            addCriterion("CPR_PRODUCTTIME between", value1, value2, "producttime");
            return (Criteria) this;
        }

        public Criteria andProducttimeNotBetween(String value1, String value2) {
            addCriterion("CPR_PRODUCTTIME not between", value1, value2, "producttime");
            return (Criteria) this;
        }

        public Criteria andProducttypeIsNull() {
            addCriterion("CPR_PRODUCTTYPE is null");
            return (Criteria) this;
        }

        public Criteria andProducttypeIsNotNull() {
            addCriterion("CPR_PRODUCTTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andProducttypeEqualTo(String value) {
            addCriterion("CPR_PRODUCTTYPE =", value, "producttype");
            return (Criteria) this;
        }

        public Criteria andProducttypeNotEqualTo(String value) {
            addCriterion("CPR_PRODUCTTYPE <>", value, "producttype");
            return (Criteria) this;
        }

        public Criteria andProducttypeGreaterThan(String value) {
            addCriterion("CPR_PRODUCTTYPE >", value, "producttype");
            return (Criteria) this;
        }

        public Criteria andProducttypeGreaterThanOrEqualTo(String value) {
            addCriterion("CPR_PRODUCTTYPE >=", value, "producttype");
            return (Criteria) this;
        }

        public Criteria andProducttypeLessThan(String value) {
            addCriterion("CPR_PRODUCTTYPE <", value, "producttype");
            return (Criteria) this;
        }

        public Criteria andProducttypeLessThanOrEqualTo(String value) {
            addCriterion("CPR_PRODUCTTYPE <=", value, "producttype");
            return (Criteria) this;
        }

        public Criteria andProducttypeLike(String value) {
            addCriterion("CPR_PRODUCTTYPE like", value, "producttype");
            return (Criteria) this;
        }

        public Criteria andProducttypeNotLike(String value) {
            addCriterion("CPR_PRODUCTTYPE not like", value, "producttype");
            return (Criteria) this;
        }

        public Criteria andProducttypeIn(List<String> values) {
            addCriterion("CPR_PRODUCTTYPE in", values, "producttype");
            return (Criteria) this;
        }

        public Criteria andProducttypeNotIn(List<String> values) {
            addCriterion("CPR_PRODUCTTYPE not in", values, "producttype");
            return (Criteria) this;
        }

        public Criteria andProducttypeBetween(String value1, String value2) {
            addCriterion("CPR_PRODUCTTYPE between", value1, value2, "producttype");
            return (Criteria) this;
        }

        public Criteria andProducttypeNotBetween(String value1, String value2) {
            addCriterion("CPR_PRODUCTTYPE not between", value1, value2, "producttype");
            return (Criteria) this;
        }

        public Criteria andSurverIsNull() {
            addCriterion("CPR_SURVER is null");
            return (Criteria) this;
        }

        public Criteria andSurverIsNotNull() {
            addCriterion("CPR_SURVER is not null");
            return (Criteria) this;
        }

        public Criteria andSurverEqualTo(String value) {
            addCriterion("CPR_SURVER =", value, "surver");
            return (Criteria) this;
        }

        public Criteria andSurverNotEqualTo(String value) {
            addCriterion("CPR_SURVER <>", value, "surver");
            return (Criteria) this;
        }

        public Criteria andSurverGreaterThan(String value) {
            addCriterion("CPR_SURVER >", value, "surver");
            return (Criteria) this;
        }

        public Criteria andSurverGreaterThanOrEqualTo(String value) {
            addCriterion("CPR_SURVER >=", value, "surver");
            return (Criteria) this;
        }

        public Criteria andSurverLessThan(String value) {
            addCriterion("CPR_SURVER <", value, "surver");
            return (Criteria) this;
        }

        public Criteria andSurverLessThanOrEqualTo(String value) {
            addCriterion("CPR_SURVER <=", value, "surver");
            return (Criteria) this;
        }

        public Criteria andSurverLike(String value) {
            addCriterion("CPR_SURVER like", value, "surver");
            return (Criteria) this;
        }

        public Criteria andSurverNotLike(String value) {
            addCriterion("CPR_SURVER not like", value, "surver");
            return (Criteria) this;
        }

        public Criteria andSurverIn(List<String> values) {
            addCriterion("CPR_SURVER in", values, "surver");
            return (Criteria) this;
        }

        public Criteria andSurverNotIn(List<String> values) {
            addCriterion("CPR_SURVER not in", values, "surver");
            return (Criteria) this;
        }

        public Criteria andSurverBetween(String value1, String value2) {
            addCriterion("CPR_SURVER between", value1, value2, "surver");
            return (Criteria) this;
        }

        public Criteria andSurverNotBetween(String value1, String value2) {
            addCriterion("CPR_SURVER not between", value1, value2, "surver");
            return (Criteria) this;
        }

        public Criteria andEntidIsNull() {
            addCriterion("CPR_ENTID is null");
            return (Criteria) this;
        }

        public Criteria andEntidIsNotNull() {
            addCriterion("CPR_ENTID is not null");
            return (Criteria) this;
        }

        public Criteria andEntidEqualTo(String value) {
            addCriterion("CPR_ENTID =", value, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidNotEqualTo(String value) {
            addCriterion("CPR_ENTID <>", value, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidGreaterThan(String value) {
            addCriterion("CPR_ENTID >", value, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidGreaterThanOrEqualTo(String value) {
            addCriterion("CPR_ENTID >=", value, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidLessThan(String value) {
            addCriterion("CPR_ENTID <", value, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidLessThanOrEqualTo(String value) {
            addCriterion("CPR_ENTID <=", value, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidLike(String value) {
            addCriterion("CPR_ENTID like", value, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidNotLike(String value) {
            addCriterion("CPR_ENTID not like", value, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidIn(List<String> values) {
            addCriterion("CPR_ENTID in", values, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidNotIn(List<String> values) {
            addCriterion("CPR_ENTID not in", values, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidBetween(String value1, String value2) {
            addCriterion("CPR_ENTID between", value1, value2, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidNotBetween(String value1, String value2) {
            addCriterion("CPR_ENTID not between", value1, value2, "entid");
            return (Criteria) this;
        }

        public Criteria andEntnameIsNull() {
            addCriterion("CPR_ENTNAME is null");
            return (Criteria) this;
        }

        public Criteria andEntnameIsNotNull() {
            addCriterion("CPR_ENTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andEntnameEqualTo(String value) {
            addCriterion("CPR_ENTNAME =", value, "entname");
            return (Criteria) this;
        }

        public Criteria andEntnameNotEqualTo(String value) {
            addCriterion("CPR_ENTNAME <>", value, "entname");
            return (Criteria) this;
        }

        public Criteria andEntnameGreaterThan(String value) {
            addCriterion("CPR_ENTNAME >", value, "entname");
            return (Criteria) this;
        }

        public Criteria andEntnameGreaterThanOrEqualTo(String value) {
            addCriterion("CPR_ENTNAME >=", value, "entname");
            return (Criteria) this;
        }

        public Criteria andEntnameLessThan(String value) {
            addCriterion("CPR_ENTNAME <", value, "entname");
            return (Criteria) this;
        }

        public Criteria andEntnameLessThanOrEqualTo(String value) {
            addCriterion("CPR_ENTNAME <=", value, "entname");
            return (Criteria) this;
        }

        public Criteria andEntnameLike(String value) {
            addCriterion("CPR_ENTNAME like", value, "entname");
            return (Criteria) this;
        }

        public Criteria andEntnameNotLike(String value) {
            addCriterion("CPR_ENTNAME not like", value, "entname");
            return (Criteria) this;
        }

        public Criteria andEntnameIn(List<String> values) {
            addCriterion("CPR_ENTNAME in", values, "entname");
            return (Criteria) this;
        }

        public Criteria andEntnameNotIn(List<String> values) {
            addCriterion("CPR_ENTNAME not in", values, "entname");
            return (Criteria) this;
        }

        public Criteria andEntnameBetween(String value1, String value2) {
            addCriterion("CPR_ENTNAME between", value1, value2, "entname");
            return (Criteria) this;
        }

        public Criteria andEntnameNotBetween(String value1, String value2) {
            addCriterion("CPR_ENTNAME not between", value1, value2, "entname");
            return (Criteria) this;
        }

        public Criteria andYesornoIsNull() {
            addCriterion("CPR_YESORNO is null");
            return (Criteria) this;
        }

        public Criteria andYesornoIsNotNull() {
            addCriterion("CPR_YESORNO is not null");
            return (Criteria) this;
        }

        public Criteria andYesornoEqualTo(String value) {
            addCriterion("CPR_YESORNO =", value, "yesorno");
            return (Criteria) this;
        }

        public Criteria andYesornoNotEqualTo(String value) {
            addCriterion("CPR_YESORNO <>", value, "yesorno");
            return (Criteria) this;
        }

        public Criteria andYesornoGreaterThan(String value) {
            addCriterion("CPR_YESORNO >", value, "yesorno");
            return (Criteria) this;
        }

        public Criteria andYesornoGreaterThanOrEqualTo(String value) {
            addCriterion("CPR_YESORNO >=", value, "yesorno");
            return (Criteria) this;
        }

        public Criteria andYesornoLessThan(String value) {
            addCriterion("CPR_YESORNO <", value, "yesorno");
            return (Criteria) this;
        }

        public Criteria andYesornoLessThanOrEqualTo(String value) {
            addCriterion("CPR_YESORNO <=", value, "yesorno");
            return (Criteria) this;
        }

        public Criteria andYesornoLike(String value) {
            addCriterion("CPR_YESORNO like", value, "yesorno");
            return (Criteria) this;
        }

        public Criteria andYesornoNotLike(String value) {
            addCriterion("CPR_YESORNO not like", value, "yesorno");
            return (Criteria) this;
        }

        public Criteria andYesornoIn(List<String> values) {
            addCriterion("CPR_YESORNO in", values, "yesorno");
            return (Criteria) this;
        }

        public Criteria andYesornoNotIn(List<String> values) {
            addCriterion("CPR_YESORNO not in", values, "yesorno");
            return (Criteria) this;
        }

        public Criteria andYesornoBetween(String value1, String value2) {
            addCriterion("CPR_YESORNO between", value1, value2, "yesorno");
            return (Criteria) this;
        }

        public Criteria andYesornoNotBetween(String value1, String value2) {
            addCriterion("CPR_YESORNO not between", value1, value2, "yesorno");
            return (Criteria) this;
        }

        public Criteria andDownloadIsNull() {
            addCriterion("CPR_DOWNLOAD is null");
            return (Criteria) this;
        }

        public Criteria andDownloadIsNotNull() {
            addCriterion("CPR_DOWNLOAD is not null");
            return (Criteria) this;
        }

        public Criteria andDownloadEqualTo(String value) {
            addCriterion("CPR_DOWNLOAD =", value, "download");
            return (Criteria) this;
        }

        public Criteria andDownloadNotEqualTo(String value) {
            addCriterion("CPR_DOWNLOAD <>", value, "download");
            return (Criteria) this;
        }

        public Criteria andDownloadGreaterThan(String value) {
            addCriterion("CPR_DOWNLOAD >", value, "download");
            return (Criteria) this;
        }

        public Criteria andDownloadGreaterThanOrEqualTo(String value) {
            addCriterion("CPR_DOWNLOAD >=", value, "download");
            return (Criteria) this;
        }

        public Criteria andDownloadLessThan(String value) {
            addCriterion("CPR_DOWNLOAD <", value, "download");
            return (Criteria) this;
        }

        public Criteria andDownloadLessThanOrEqualTo(String value) {
            addCriterion("CPR_DOWNLOAD <=", value, "download");
            return (Criteria) this;
        }

        public Criteria andDownloadLike(String value) {
            addCriterion("CPR_DOWNLOAD like", value, "download");
            return (Criteria) this;
        }

        public Criteria andDownloadNotLike(String value) {
            addCriterion("CPR_DOWNLOAD not like", value, "download");
            return (Criteria) this;
        }

        public Criteria andDownloadIn(List<String> values) {
            addCriterion("CPR_DOWNLOAD in", values, "download");
            return (Criteria) this;
        }

        public Criteria andDownloadNotIn(List<String> values) {
            addCriterion("CPR_DOWNLOAD not in", values, "download");
            return (Criteria) this;
        }

        public Criteria andDownloadBetween(String value1, String value2) {
            addCriterion("CPR_DOWNLOAD between", value1, value2, "download");
            return (Criteria) this;
        }

        public Criteria andDownloadNotBetween(String value1, String value2) {
            addCriterion("CPR_DOWNLOAD not between", value1, value2, "download");
            return (Criteria) this;
        }

        public Criteria andObg1IsNull() {
            addCriterion("CPR_OBG1 is null");
            return (Criteria) this;
        }

        public Criteria andObg1IsNotNull() {
            addCriterion("CPR_OBG1 is not null");
            return (Criteria) this;
        }

        public Criteria andObg1EqualTo(String value) {
            addCriterion("CPR_OBG1 =", value, "obg1");
            return (Criteria) this;
        }

        public Criteria andObg1NotEqualTo(String value) {
            addCriterion("CPR_OBG1 <>", value, "obg1");
            return (Criteria) this;
        }

        public Criteria andObg1GreaterThan(String value) {
            addCriterion("CPR_OBG1 >", value, "obg1");
            return (Criteria) this;
        }

        public Criteria andObg1GreaterThanOrEqualTo(String value) {
            addCriterion("CPR_OBG1 >=", value, "obg1");
            return (Criteria) this;
        }

        public Criteria andObg1LessThan(String value) {
            addCriterion("CPR_OBG1 <", value, "obg1");
            return (Criteria) this;
        }

        public Criteria andObg1LessThanOrEqualTo(String value) {
            addCriterion("CPR_OBG1 <=", value, "obg1");
            return (Criteria) this;
        }

        public Criteria andObg1Like(String value) {
            addCriterion("CPR_OBG1 like", value, "obg1");
            return (Criteria) this;
        }

        public Criteria andObg1NotLike(String value) {
            addCriterion("CPR_OBG1 not like", value, "obg1");
            return (Criteria) this;
        }

        public Criteria andObg1In(List<String> values) {
            addCriterion("CPR_OBG1 in", values, "obg1");
            return (Criteria) this;
        }

        public Criteria andObg1NotIn(List<String> values) {
            addCriterion("CPR_OBG1 not in", values, "obg1");
            return (Criteria) this;
        }

        public Criteria andObg1Between(String value1, String value2) {
            addCriterion("CPR_OBG1 between", value1, value2, "obg1");
            return (Criteria) this;
        }

        public Criteria andObg1NotBetween(String value1, String value2) {
            addCriterion("CPR_OBG1 not between", value1, value2, "obg1");
            return (Criteria) this;
        }

        public Criteria andObg2IsNull() {
            addCriterion("CPR_OBG2 is null");
            return (Criteria) this;
        }

        public Criteria andObg2IsNotNull() {
            addCriterion("CPR_OBG2 is not null");
            return (Criteria) this;
        }

        public Criteria andObg2EqualTo(String value) {
            addCriterion("CPR_OBG2 =", value, "obg2");
            return (Criteria) this;
        }

        public Criteria andObg2NotEqualTo(String value) {
            addCriterion("CPR_OBG2 <>", value, "obg2");
            return (Criteria) this;
        }

        public Criteria andObg2GreaterThan(String value) {
            addCriterion("CPR_OBG2 >", value, "obg2");
            return (Criteria) this;
        }

        public Criteria andObg2GreaterThanOrEqualTo(String value) {
            addCriterion("CPR_OBG2 >=", value, "obg2");
            return (Criteria) this;
        }

        public Criteria andObg2LessThan(String value) {
            addCriterion("CPR_OBG2 <", value, "obg2");
            return (Criteria) this;
        }

        public Criteria andObg2LessThanOrEqualTo(String value) {
            addCriterion("CPR_OBG2 <=", value, "obg2");
            return (Criteria) this;
        }

        public Criteria andObg2Like(String value) {
            addCriterion("CPR_OBG2 like", value, "obg2");
            return (Criteria) this;
        }

        public Criteria andObg2NotLike(String value) {
            addCriterion("CPR_OBG2 not like", value, "obg2");
            return (Criteria) this;
        }

        public Criteria andObg2In(List<String> values) {
            addCriterion("CPR_OBG2 in", values, "obg2");
            return (Criteria) this;
        }

        public Criteria andObg2NotIn(List<String> values) {
            addCriterion("CPR_OBG2 not in", values, "obg2");
            return (Criteria) this;
        }

        public Criteria andObg2Between(String value1, String value2) {
            addCriterion("CPR_OBG2 between", value1, value2, "obg2");
            return (Criteria) this;
        }

        public Criteria andObg2NotBetween(String value1, String value2) {
            addCriterion("CPR_OBG2 not between", value1, value2, "obg2");
            return (Criteria) this;
        }

        public Criteria andObg3IsNull() {
            addCriterion("CPR_OBG3 is null");
            return (Criteria) this;
        }

        public Criteria andObg3IsNotNull() {
            addCriterion("CPR_OBG3 is not null");
            return (Criteria) this;
        }

        public Criteria andObg3EqualTo(String value) {
            addCriterion("CPR_OBG3 =", value, "obg3");
            return (Criteria) this;
        }

        public Criteria andObg3NotEqualTo(String value) {
            addCriterion("CPR_OBG3 <>", value, "obg3");
            return (Criteria) this;
        }

        public Criteria andObg3GreaterThan(String value) {
            addCriterion("CPR_OBG3 >", value, "obg3");
            return (Criteria) this;
        }

        public Criteria andObg3GreaterThanOrEqualTo(String value) {
            addCriterion("CPR_OBG3 >=", value, "obg3");
            return (Criteria) this;
        }

        public Criteria andObg3LessThan(String value) {
            addCriterion("CPR_OBG3 <", value, "obg3");
            return (Criteria) this;
        }

        public Criteria andObg3LessThanOrEqualTo(String value) {
            addCriterion("CPR_OBG3 <=", value, "obg3");
            return (Criteria) this;
        }

        public Criteria andObg3Like(String value) {
            addCriterion("CPR_OBG3 like", value, "obg3");
            return (Criteria) this;
        }

        public Criteria andObg3NotLike(String value) {
            addCriterion("CPR_OBG3 not like", value, "obg3");
            return (Criteria) this;
        }

        public Criteria andObg3In(List<String> values) {
            addCriterion("CPR_OBG3 in", values, "obg3");
            return (Criteria) this;
        }

        public Criteria andObg3NotIn(List<String> values) {
            addCriterion("CPR_OBG3 not in", values, "obg3");
            return (Criteria) this;
        }

        public Criteria andObg3Between(String value1, String value2) {
            addCriterion("CPR_OBG3 between", value1, value2, "obg3");
            return (Criteria) this;
        }

        public Criteria andObg3NotBetween(String value1, String value2) {
            addCriterion("CPR_OBG3 not between", value1, value2, "obg3");
            return (Criteria) this;
        }

        public Criteria andObg4IsNull() {
            addCriterion("CPR_OBG4 is null");
            return (Criteria) this;
        }

        public Criteria andObg4IsNotNull() {
            addCriterion("CPR_OBG4 is not null");
            return (Criteria) this;
        }

        public Criteria andObg4EqualTo(String value) {
            addCriterion("CPR_OBG4 =", value, "obg4");
            return (Criteria) this;
        }

        public Criteria andObg4NotEqualTo(String value) {
            addCriterion("CPR_OBG4 <>", value, "obg4");
            return (Criteria) this;
        }

        public Criteria andObg4GreaterThan(String value) {
            addCriterion("CPR_OBG4 >", value, "obg4");
            return (Criteria) this;
        }

        public Criteria andObg4GreaterThanOrEqualTo(String value) {
            addCriterion("CPR_OBG4 >=", value, "obg4");
            return (Criteria) this;
        }

        public Criteria andObg4LessThan(String value) {
            addCriterion("CPR_OBG4 <", value, "obg4");
            return (Criteria) this;
        }

        public Criteria andObg4LessThanOrEqualTo(String value) {
            addCriterion("CPR_OBG4 <=", value, "obg4");
            return (Criteria) this;
        }

        public Criteria andObg4Like(String value) {
            addCriterion("CPR_OBG4 like", value, "obg4");
            return (Criteria) this;
        }

        public Criteria andObg4NotLike(String value) {
            addCriterion("CPR_OBG4 not like", value, "obg4");
            return (Criteria) this;
        }

        public Criteria andObg4In(List<String> values) {
            addCriterion("CPR_OBG4 in", values, "obg4");
            return (Criteria) this;
        }

        public Criteria andObg4NotIn(List<String> values) {
            addCriterion("CPR_OBG4 not in", values, "obg4");
            return (Criteria) this;
        }

        public Criteria andObg4Between(String value1, String value2) {
            addCriterion("CPR_OBG4 between", value1, value2, "obg4");
            return (Criteria) this;
        }

        public Criteria andObg4NotBetween(String value1, String value2) {
            addCriterion("CPR_OBG4 not between", value1, value2, "obg4");
            return (Criteria) this;
        }

        public Criteria andIdLikeInsensitive(String value) {
            addCriterion("upper(CPR_ID) like", value.toUpperCase(), "id");
            return (Criteria) this;
        }

        public Criteria andPronameLikeInsensitive(String value) {
            addCriterion("upper(CPR_PRONAME) like", value.toUpperCase(), "proname");
            return (Criteria) this;
        }

        public Criteria andPronumberLikeInsensitive(String value) {
            addCriterion("upper(CPR_PRONUMBER) like", value.toUpperCase(), "pronumber");
            return (Criteria) this;
        }

        public Criteria andCertnumberLikeInsensitive(String value) {
            addCriterion("upper(CPR_CERTNUMBER) like", value.toUpperCase(), "certnumber");
            return (Criteria) this;
        }

        public Criteria andChecktimeLikeInsensitive(String value) {
            addCriterion("upper(CPR_CHECKTIME) like", value.toUpperCase(), "checktime");
            return (Criteria) this;
        }

        public Criteria andShipnameLikeInsensitive(String value) {
            addCriterion("upper(CPR_SHIPNAME) like", value.toUpperCase(), "shipname");
            return (Criteria) this;
        }

        public Criteria andShipidLikeInsensitive(String value) {
            addCriterion("upper(CPR_SHIPID) like", value.toUpperCase(), "shipid");
            return (Criteria) this;
        }

        public Criteria andCate1LikeInsensitive(String value) {
            addCriterion("upper(CPR_CATE1) like", value.toUpperCase(), "cate1");
            return (Criteria) this;
        }

        public Criteria andCate2LikeInsensitive(String value) {
            addCriterion("upper(CPR_CATE2) like", value.toUpperCase(), "cate2");
            return (Criteria) this;
        }

        public Criteria andCate3LikeInsensitive(String value) {
            addCriterion("upper(CPR_CATE3) like", value.toUpperCase(), "cate3");
            return (Criteria) this;
        }

        public Criteria andProducttimeLikeInsensitive(String value) {
            addCriterion("upper(CPR_PRODUCTTIME) like", value.toUpperCase(), "producttime");
            return (Criteria) this;
        }

        public Criteria andProducttypeLikeInsensitive(String value) {
            addCriterion("upper(CPR_PRODUCTTYPE) like", value.toUpperCase(), "producttype");
            return (Criteria) this;
        }

        public Criteria andSurverLikeInsensitive(String value) {
            addCriterion("upper(CPR_SURVER) like", value.toUpperCase(), "surver");
            return (Criteria) this;
        }

        public Criteria andEntidLikeInsensitive(String value) {
            addCriterion("upper(CPR_ENTID) like", value.toUpperCase(), "entid");
            return (Criteria) this;
        }

        public Criteria andEntnameLikeInsensitive(String value) {
            addCriterion("upper(CPR_ENTNAME) like", value.toUpperCase(), "entname");
            return (Criteria) this;
        }

        public Criteria andYesornoLikeInsensitive(String value) {
            addCriterion("upper(CPR_YESORNO) like", value.toUpperCase(), "yesorno");
            return (Criteria) this;
        }

        public Criteria andDownloadLikeInsensitive(String value) {
            addCriterion("upper(CPR_DOWNLOAD) like", value.toUpperCase(), "download");
            return (Criteria) this;
        }

        public Criteria andObg1LikeInsensitive(String value) {
            addCriterion("upper(CPR_OBG1) like", value.toUpperCase(), "obg1");
            return (Criteria) this;
        }

        public Criteria andObg2LikeInsensitive(String value) {
            addCriterion("upper(CPR_OBG2) like", value.toUpperCase(), "obg2");
            return (Criteria) this;
        }

        public Criteria andObg3LikeInsensitive(String value) {
            addCriterion("upper(CPR_OBG3) like", value.toUpperCase(), "obg3");
            return (Criteria) this;
        }

        public Criteria andObg4LikeInsensitive(String value) {
            addCriterion("upper(CPR_OBG4) like", value.toUpperCase(), "obg4");
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