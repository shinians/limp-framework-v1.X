package com.chinasofti.domain;

import com.limp.framework.core.bean.Pager;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductCheckExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Pager page;

    public ProductCheckExample() {
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
            addCriterion("CPC_ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("CPC_ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("CPC_ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("CPC_ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("CPC_ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("CPC_ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("CPC_ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("CPC_ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("CPC_ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("CPC_ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("CPC_ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("CPC_ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("CPC_ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("CPC_ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUidIsNull() {
            addCriterion("CPC_UID is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("CPC_UID is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(String value) {
            addCriterion("CPC_UID =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(String value) {
            addCriterion("CPC_UID <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(String value) {
            addCriterion("CPC_UID >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(String value) {
            addCriterion("CPC_UID >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(String value) {
            addCriterion("CPC_UID <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(String value) {
            addCriterion("CPC_UID <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLike(String value) {
            addCriterion("CPC_UID like", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotLike(String value) {
            addCriterion("CPC_UID not like", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<String> values) {
            addCriterion("CPC_UID in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<String> values) {
            addCriterion("CPC_UID not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(String value1, String value2) {
            addCriterion("CPC_UID between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(String value1, String value2) {
            addCriterion("CPC_UID not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andEntidIsNull() {
            addCriterion("CPC_ENTID is null");
            return (Criteria) this;
        }

        public Criteria andEntidIsNotNull() {
            addCriterion("CPC_ENTID is not null");
            return (Criteria) this;
        }

        public Criteria andEntidEqualTo(String value) {
            addCriterion("CPC_ENTID =", value, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidNotEqualTo(String value) {
            addCriterion("CPC_ENTID <>", value, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidGreaterThan(String value) {
            addCriterion("CPC_ENTID >", value, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidGreaterThanOrEqualTo(String value) {
            addCriterion("CPC_ENTID >=", value, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidLessThan(String value) {
            addCriterion("CPC_ENTID <", value, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidLessThanOrEqualTo(String value) {
            addCriterion("CPC_ENTID <=", value, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidLike(String value) {
            addCriterion("CPC_ENTID like", value, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidNotLike(String value) {
            addCriterion("CPC_ENTID not like", value, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidIn(List<String> values) {
            addCriterion("CPC_ENTID in", values, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidNotIn(List<String> values) {
            addCriterion("CPC_ENTID not in", values, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidBetween(String value1, String value2) {
            addCriterion("CPC_ENTID between", value1, value2, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidNotBetween(String value1, String value2) {
            addCriterion("CPC_ENTID not between", value1, value2, "entid");
            return (Criteria) this;
        }

        public Criteria andSuridIsNull() {
            addCriterion("CPC_SURID is null");
            return (Criteria) this;
        }

        public Criteria andSuridIsNotNull() {
            addCriterion("CPC_SURID is not null");
            return (Criteria) this;
        }

        public Criteria andSuridEqualTo(String value) {
            addCriterion("CPC_SURID =", value, "surid");
            return (Criteria) this;
        }

        public Criteria andSuridNotEqualTo(String value) {
            addCriterion("CPC_SURID <>", value, "surid");
            return (Criteria) this;
        }

        public Criteria andSuridGreaterThan(String value) {
            addCriterion("CPC_SURID >", value, "surid");
            return (Criteria) this;
        }

        public Criteria andSuridGreaterThanOrEqualTo(String value) {
            addCriterion("CPC_SURID >=", value, "surid");
            return (Criteria) this;
        }

        public Criteria andSuridLessThan(String value) {
            addCriterion("CPC_SURID <", value, "surid");
            return (Criteria) this;
        }

        public Criteria andSuridLessThanOrEqualTo(String value) {
            addCriterion("CPC_SURID <=", value, "surid");
            return (Criteria) this;
        }

        public Criteria andSuridLike(String value) {
            addCriterion("CPC_SURID like", value, "surid");
            return (Criteria) this;
        }

        public Criteria andSuridNotLike(String value) {
            addCriterion("CPC_SURID not like", value, "surid");
            return (Criteria) this;
        }

        public Criteria andSuridIn(List<String> values) {
            addCriterion("CPC_SURID in", values, "surid");
            return (Criteria) this;
        }

        public Criteria andSuridNotIn(List<String> values) {
            addCriterion("CPC_SURID not in", values, "surid");
            return (Criteria) this;
        }

        public Criteria andSuridBetween(String value1, String value2) {
            addCriterion("CPC_SURID between", value1, value2, "surid");
            return (Criteria) this;
        }

        public Criteria andSuridNotBetween(String value1, String value2) {
            addCriterion("CPC_SURID not between", value1, value2, "surid");
            return (Criteria) this;
        }

        public Criteria andShipnameIsNull() {
            addCriterion("CPC_SHIPNAME is null");
            return (Criteria) this;
        }

        public Criteria andShipnameIsNotNull() {
            addCriterion("CPC_SHIPNAME is not null");
            return (Criteria) this;
        }

        public Criteria andShipnameEqualTo(String value) {
            addCriterion("CPC_SHIPNAME =", value, "shipname");
            return (Criteria) this;
        }

        public Criteria andShipnameNotEqualTo(String value) {
            addCriterion("CPC_SHIPNAME <>", value, "shipname");
            return (Criteria) this;
        }

        public Criteria andShipnameGreaterThan(String value) {
            addCriterion("CPC_SHIPNAME >", value, "shipname");
            return (Criteria) this;
        }

        public Criteria andShipnameGreaterThanOrEqualTo(String value) {
            addCriterion("CPC_SHIPNAME >=", value, "shipname");
            return (Criteria) this;
        }

        public Criteria andShipnameLessThan(String value) {
            addCriterion("CPC_SHIPNAME <", value, "shipname");
            return (Criteria) this;
        }

        public Criteria andShipnameLessThanOrEqualTo(String value) {
            addCriterion("CPC_SHIPNAME <=", value, "shipname");
            return (Criteria) this;
        }

        public Criteria andShipnameLike(String value) {
            addCriterion("CPC_SHIPNAME like", value, "shipname");
            return (Criteria) this;
        }

        public Criteria andShipnameNotLike(String value) {
            addCriterion("CPC_SHIPNAME not like", value, "shipname");
            return (Criteria) this;
        }

        public Criteria andShipnameIn(List<String> values) {
            addCriterion("CPC_SHIPNAME in", values, "shipname");
            return (Criteria) this;
        }

        public Criteria andShipnameNotIn(List<String> values) {
            addCriterion("CPC_SHIPNAME not in", values, "shipname");
            return (Criteria) this;
        }

        public Criteria andShipnameBetween(String value1, String value2) {
            addCriterion("CPC_SHIPNAME between", value1, value2, "shipname");
            return (Criteria) this;
        }

        public Criteria andShipnameNotBetween(String value1, String value2) {
            addCriterion("CPC_SHIPNAME not between", value1, value2, "shipname");
            return (Criteria) this;
        }

        public Criteria andResppersonIsNull() {
            addCriterion("CPC_RESPPERSON is null");
            return (Criteria) this;
        }

        public Criteria andResppersonIsNotNull() {
            addCriterion("CPC_RESPPERSON is not null");
            return (Criteria) this;
        }

        public Criteria andResppersonEqualTo(String value) {
            addCriterion("CPC_RESPPERSON =", value, "respperson");
            return (Criteria) this;
        }

        public Criteria andResppersonNotEqualTo(String value) {
            addCriterion("CPC_RESPPERSON <>", value, "respperson");
            return (Criteria) this;
        }

        public Criteria andResppersonGreaterThan(String value) {
            addCriterion("CPC_RESPPERSON >", value, "respperson");
            return (Criteria) this;
        }

        public Criteria andResppersonGreaterThanOrEqualTo(String value) {
            addCriterion("CPC_RESPPERSON >=", value, "respperson");
            return (Criteria) this;
        }

        public Criteria andResppersonLessThan(String value) {
            addCriterion("CPC_RESPPERSON <", value, "respperson");
            return (Criteria) this;
        }

        public Criteria andResppersonLessThanOrEqualTo(String value) {
            addCriterion("CPC_RESPPERSON <=", value, "respperson");
            return (Criteria) this;
        }

        public Criteria andResppersonLike(String value) {
            addCriterion("CPC_RESPPERSON like", value, "respperson");
            return (Criteria) this;
        }

        public Criteria andResppersonNotLike(String value) {
            addCriterion("CPC_RESPPERSON not like", value, "respperson");
            return (Criteria) this;
        }

        public Criteria andResppersonIn(List<String> values) {
            addCriterion("CPC_RESPPERSON in", values, "respperson");
            return (Criteria) this;
        }

        public Criteria andResppersonNotIn(List<String> values) {
            addCriterion("CPC_RESPPERSON not in", values, "respperson");
            return (Criteria) this;
        }

        public Criteria andResppersonBetween(String value1, String value2) {
            addCriterion("CPC_RESPPERSON between", value1, value2, "respperson");
            return (Criteria) this;
        }

        public Criteria andResppersonNotBetween(String value1, String value2) {
            addCriterion("CPC_RESPPERSON not between", value1, value2, "respperson");
            return (Criteria) this;
        }

        public Criteria andChecktimeIsNull() {
            addCriterion("CPC_CHECKTIME is null");
            return (Criteria) this;
        }

        public Criteria andChecktimeIsNotNull() {
            addCriterion("CPC_CHECKTIME is not null");
            return (Criteria) this;
        }

        public Criteria andChecktimeEqualTo(String value) {
            addCriterion("CPC_CHECKTIME =", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeNotEqualTo(String value) {
            addCriterion("CPC_CHECKTIME <>", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeGreaterThan(String value) {
            addCriterion("CPC_CHECKTIME >", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeGreaterThanOrEqualTo(String value) {
            addCriterion("CPC_CHECKTIME >=", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeLessThan(String value) {
            addCriterion("CPC_CHECKTIME <", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeLessThanOrEqualTo(String value) {
            addCriterion("CPC_CHECKTIME <=", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeLike(String value) {
            addCriterion("CPC_CHECKTIME like", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeNotLike(String value) {
            addCriterion("CPC_CHECKTIME not like", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeIn(List<String> values) {
            addCriterion("CPC_CHECKTIME in", values, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeNotIn(List<String> values) {
            addCriterion("CPC_CHECKTIME not in", values, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeBetween(String value1, String value2) {
            addCriterion("CPC_CHECKTIME between", value1, value2, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeNotBetween(String value1, String value2) {
            addCriterion("CPC_CHECKTIME not between", value1, value2, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimenextIsNull() {
            addCriterion("CPC_CHECKTIMENEXT is null");
            return (Criteria) this;
        }

        public Criteria andChecktimenextIsNotNull() {
            addCriterion("CPC_CHECKTIMENEXT is not null");
            return (Criteria) this;
        }

        public Criteria andChecktimenextEqualTo(String value) {
            addCriterion("CPC_CHECKTIMENEXT =", value, "checktimenext");
            return (Criteria) this;
        }

        public Criteria andChecktimenextNotEqualTo(String value) {
            addCriterion("CPC_CHECKTIMENEXT <>", value, "checktimenext");
            return (Criteria) this;
        }

        public Criteria andChecktimenextGreaterThan(String value) {
            addCriterion("CPC_CHECKTIMENEXT >", value, "checktimenext");
            return (Criteria) this;
        }

        public Criteria andChecktimenextGreaterThanOrEqualTo(String value) {
            addCriterion("CPC_CHECKTIMENEXT >=", value, "checktimenext");
            return (Criteria) this;
        }

        public Criteria andChecktimenextLessThan(String value) {
            addCriterion("CPC_CHECKTIMENEXT <", value, "checktimenext");
            return (Criteria) this;
        }

        public Criteria andChecktimenextLessThanOrEqualTo(String value) {
            addCriterion("CPC_CHECKTIMENEXT <=", value, "checktimenext");
            return (Criteria) this;
        }

        public Criteria andChecktimenextLike(String value) {
            addCriterion("CPC_CHECKTIMENEXT like", value, "checktimenext");
            return (Criteria) this;
        }

        public Criteria andChecktimenextNotLike(String value) {
            addCriterion("CPC_CHECKTIMENEXT not like", value, "checktimenext");
            return (Criteria) this;
        }

        public Criteria andChecktimenextIn(List<String> values) {
            addCriterion("CPC_CHECKTIMENEXT in", values, "checktimenext");
            return (Criteria) this;
        }

        public Criteria andChecktimenextNotIn(List<String> values) {
            addCriterion("CPC_CHECKTIMENEXT not in", values, "checktimenext");
            return (Criteria) this;
        }

        public Criteria andChecktimenextBetween(String value1, String value2) {
            addCriterion("CPC_CHECKTIMENEXT between", value1, value2, "checktimenext");
            return (Criteria) this;
        }

        public Criteria andChecktimenextNotBetween(String value1, String value2) {
            addCriterion("CPC_CHECKTIMENEXT not between", value1, value2, "checktimenext");
            return (Criteria) this;
        }

        public Criteria andProducttypeIsNull() {
            addCriterion("CPC_PRODUCTTYPE is null");
            return (Criteria) this;
        }

        public Criteria andProducttypeIsNotNull() {
            addCriterion("CPC_PRODUCTTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andProducttypeEqualTo(String value) {
            addCriterion("CPC_PRODUCTTYPE =", value, "producttype");
            return (Criteria) this;
        }

        public Criteria andProducttypeNotEqualTo(String value) {
            addCriterion("CPC_PRODUCTTYPE <>", value, "producttype");
            return (Criteria) this;
        }

        public Criteria andProducttypeGreaterThan(String value) {
            addCriterion("CPC_PRODUCTTYPE >", value, "producttype");
            return (Criteria) this;
        }

        public Criteria andProducttypeGreaterThanOrEqualTo(String value) {
            addCriterion("CPC_PRODUCTTYPE >=", value, "producttype");
            return (Criteria) this;
        }

        public Criteria andProducttypeLessThan(String value) {
            addCriterion("CPC_PRODUCTTYPE <", value, "producttype");
            return (Criteria) this;
        }

        public Criteria andProducttypeLessThanOrEqualTo(String value) {
            addCriterion("CPC_PRODUCTTYPE <=", value, "producttype");
            return (Criteria) this;
        }

        public Criteria andProducttypeLike(String value) {
            addCriterion("CPC_PRODUCTTYPE like", value, "producttype");
            return (Criteria) this;
        }

        public Criteria andProducttypeNotLike(String value) {
            addCriterion("CPC_PRODUCTTYPE not like", value, "producttype");
            return (Criteria) this;
        }

        public Criteria andProducttypeIn(List<String> values) {
            addCriterion("CPC_PRODUCTTYPE in", values, "producttype");
            return (Criteria) this;
        }

        public Criteria andProducttypeNotIn(List<String> values) {
            addCriterion("CPC_PRODUCTTYPE not in", values, "producttype");
            return (Criteria) this;
        }

        public Criteria andProducttypeBetween(String value1, String value2) {
            addCriterion("CPC_PRODUCTTYPE between", value1, value2, "producttype");
            return (Criteria) this;
        }

        public Criteria andProducttypeNotBetween(String value1, String value2) {
            addCriterion("CPC_PRODUCTTYPE not between", value1, value2, "producttype");
            return (Criteria) this;
        }

        public Criteria andProductnumIsNull() {
            addCriterion("CPC_PRODUCTNUM is null");
            return (Criteria) this;
        }

        public Criteria andProductnumIsNotNull() {
            addCriterion("CPC_PRODUCTNUM is not null");
            return (Criteria) this;
        }

        public Criteria andProductnumEqualTo(String value) {
            addCriterion("CPC_PRODUCTNUM =", value, "productnum");
            return (Criteria) this;
        }

        public Criteria andProductnumNotEqualTo(String value) {
            addCriterion("CPC_PRODUCTNUM <>", value, "productnum");
            return (Criteria) this;
        }

        public Criteria andProductnumGreaterThan(String value) {
            addCriterion("CPC_PRODUCTNUM >", value, "productnum");
            return (Criteria) this;
        }

        public Criteria andProductnumGreaterThanOrEqualTo(String value) {
            addCriterion("CPC_PRODUCTNUM >=", value, "productnum");
            return (Criteria) this;
        }

        public Criteria andProductnumLessThan(String value) {
            addCriterion("CPC_PRODUCTNUM <", value, "productnum");
            return (Criteria) this;
        }

        public Criteria andProductnumLessThanOrEqualTo(String value) {
            addCriterion("CPC_PRODUCTNUM <=", value, "productnum");
            return (Criteria) this;
        }

        public Criteria andProductnumLike(String value) {
            addCriterion("CPC_PRODUCTNUM like", value, "productnum");
            return (Criteria) this;
        }

        public Criteria andProductnumNotLike(String value) {
            addCriterion("CPC_PRODUCTNUM not like", value, "productnum");
            return (Criteria) this;
        }

        public Criteria andProductnumIn(List<String> values) {
            addCriterion("CPC_PRODUCTNUM in", values, "productnum");
            return (Criteria) this;
        }

        public Criteria andProductnumNotIn(List<String> values) {
            addCriterion("CPC_PRODUCTNUM not in", values, "productnum");
            return (Criteria) this;
        }

        public Criteria andProductnumBetween(String value1, String value2) {
            addCriterion("CPC_PRODUCTNUM between", value1, value2, "productnum");
            return (Criteria) this;
        }

        public Criteria andProductnumNotBetween(String value1, String value2) {
            addCriterion("CPC_PRODUCTNUM not between", value1, value2, "productnum");
            return (Criteria) this;
        }

        public Criteria andProdutmodelIsNull() {
            addCriterion("CPC_PRODUTMODEL is null");
            return (Criteria) this;
        }

        public Criteria andProdutmodelIsNotNull() {
            addCriterion("CPC_PRODUTMODEL is not null");
            return (Criteria) this;
        }

        public Criteria andProdutmodelEqualTo(String value) {
            addCriterion("CPC_PRODUTMODEL =", value, "produtmodel");
            return (Criteria) this;
        }

        public Criteria andProdutmodelNotEqualTo(String value) {
            addCriterion("CPC_PRODUTMODEL <>", value, "produtmodel");
            return (Criteria) this;
        }

        public Criteria andProdutmodelGreaterThan(String value) {
            addCriterion("CPC_PRODUTMODEL >", value, "produtmodel");
            return (Criteria) this;
        }

        public Criteria andProdutmodelGreaterThanOrEqualTo(String value) {
            addCriterion("CPC_PRODUTMODEL >=", value, "produtmodel");
            return (Criteria) this;
        }

        public Criteria andProdutmodelLessThan(String value) {
            addCriterion("CPC_PRODUTMODEL <", value, "produtmodel");
            return (Criteria) this;
        }

        public Criteria andProdutmodelLessThanOrEqualTo(String value) {
            addCriterion("CPC_PRODUTMODEL <=", value, "produtmodel");
            return (Criteria) this;
        }

        public Criteria andProdutmodelLike(String value) {
            addCriterion("CPC_PRODUTMODEL like", value, "produtmodel");
            return (Criteria) this;
        }

        public Criteria andProdutmodelNotLike(String value) {
            addCriterion("CPC_PRODUTMODEL not like", value, "produtmodel");
            return (Criteria) this;
        }

        public Criteria andProdutmodelIn(List<String> values) {
            addCriterion("CPC_PRODUTMODEL in", values, "produtmodel");
            return (Criteria) this;
        }

        public Criteria andProdutmodelNotIn(List<String> values) {
            addCriterion("CPC_PRODUTMODEL not in", values, "produtmodel");
            return (Criteria) this;
        }

        public Criteria andProdutmodelBetween(String value1, String value2) {
            addCriterion("CPC_PRODUTMODEL between", value1, value2, "produtmodel");
            return (Criteria) this;
        }

        public Criteria andProdutmodelNotBetween(String value1, String value2) {
            addCriterion("CPC_PRODUTMODEL not between", value1, value2, "produtmodel");
            return (Criteria) this;
        }

        public Criteria andProductcertIsNull() {
            addCriterion("CPC_PRODUCTCERT is null");
            return (Criteria) this;
        }

        public Criteria andProductcertIsNotNull() {
            addCriterion("CPC_PRODUCTCERT is not null");
            return (Criteria) this;
        }

        public Criteria andProductcertEqualTo(String value) {
            addCriterion("CPC_PRODUCTCERT =", value, "productcert");
            return (Criteria) this;
        }

        public Criteria andProductcertNotEqualTo(String value) {
            addCriterion("CPC_PRODUCTCERT <>", value, "productcert");
            return (Criteria) this;
        }

        public Criteria andProductcertGreaterThan(String value) {
            addCriterion("CPC_PRODUCTCERT >", value, "productcert");
            return (Criteria) this;
        }

        public Criteria andProductcertGreaterThanOrEqualTo(String value) {
            addCriterion("CPC_PRODUCTCERT >=", value, "productcert");
            return (Criteria) this;
        }

        public Criteria andProductcertLessThan(String value) {
            addCriterion("CPC_PRODUCTCERT <", value, "productcert");
            return (Criteria) this;
        }

        public Criteria andProductcertLessThanOrEqualTo(String value) {
            addCriterion("CPC_PRODUCTCERT <=", value, "productcert");
            return (Criteria) this;
        }

        public Criteria andProductcertLike(String value) {
            addCriterion("CPC_PRODUCTCERT like", value, "productcert");
            return (Criteria) this;
        }

        public Criteria andProductcertNotLike(String value) {
            addCriterion("CPC_PRODUCTCERT not like", value, "productcert");
            return (Criteria) this;
        }

        public Criteria andProductcertIn(List<String> values) {
            addCriterion("CPC_PRODUCTCERT in", values, "productcert");
            return (Criteria) this;
        }

        public Criteria andProductcertNotIn(List<String> values) {
            addCriterion("CPC_PRODUCTCERT not in", values, "productcert");
            return (Criteria) this;
        }

        public Criteria andProductcertBetween(String value1, String value2) {
            addCriterion("CPC_PRODUCTCERT between", value1, value2, "productcert");
            return (Criteria) this;
        }

        public Criteria andProductcertNotBetween(String value1, String value2) {
            addCriterion("CPC_PRODUCTCERT not between", value1, value2, "productcert");
            return (Criteria) this;
        }

        public Criteria andCheckpassIsNull() {
            addCriterion("CPC_CHECKPASS is null");
            return (Criteria) this;
        }

        public Criteria andCheckpassIsNotNull() {
            addCriterion("CPC_CHECKPASS is not null");
            return (Criteria) this;
        }

        public Criteria andCheckpassEqualTo(Short value) {
            addCriterion("CPC_CHECKPASS =", value, "checkpass");
            return (Criteria) this;
        }

        public Criteria andCheckpassNotEqualTo(Short value) {
            addCriterion("CPC_CHECKPASS <>", value, "checkpass");
            return (Criteria) this;
        }

        public Criteria andCheckpassGreaterThan(Short value) {
            addCriterion("CPC_CHECKPASS >", value, "checkpass");
            return (Criteria) this;
        }

        public Criteria andCheckpassGreaterThanOrEqualTo(Short value) {
            addCriterion("CPC_CHECKPASS >=", value, "checkpass");
            return (Criteria) this;
        }

        public Criteria andCheckpassLessThan(Short value) {
            addCriterion("CPC_CHECKPASS <", value, "checkpass");
            return (Criteria) this;
        }

        public Criteria andCheckpassLessThanOrEqualTo(Short value) {
            addCriterion("CPC_CHECKPASS <=", value, "checkpass");
            return (Criteria) this;
        }

        public Criteria andCheckpassIn(List<Short> values) {
            addCriterion("CPC_CHECKPASS in", values, "checkpass");
            return (Criteria) this;
        }

        public Criteria andCheckpassNotIn(List<Short> values) {
            addCriterion("CPC_CHECKPASS not in", values, "checkpass");
            return (Criteria) this;
        }

        public Criteria andCheckpassBetween(Short value1, Short value2) {
            addCriterion("CPC_CHECKPASS between", value1, value2, "checkpass");
            return (Criteria) this;
        }

        public Criteria andCheckpassNotBetween(Short value1, Short value2) {
            addCriterion("CPC_CHECKPASS not between", value1, value2, "checkpass");
            return (Criteria) this;
        }

        public Criteria andShipportIsNull() {
            addCriterion("CPC_SHIPPORT is null");
            return (Criteria) this;
        }

        public Criteria andShipportIsNotNull() {
            addCriterion("CPC_SHIPPORT is not null");
            return (Criteria) this;
        }

        public Criteria andShipportEqualTo(String value) {
            addCriterion("CPC_SHIPPORT =", value, "shipport");
            return (Criteria) this;
        }

        public Criteria andShipportNotEqualTo(String value) {
            addCriterion("CPC_SHIPPORT <>", value, "shipport");
            return (Criteria) this;
        }

        public Criteria andShipportGreaterThan(String value) {
            addCriterion("CPC_SHIPPORT >", value, "shipport");
            return (Criteria) this;
        }

        public Criteria andShipportGreaterThanOrEqualTo(String value) {
            addCriterion("CPC_SHIPPORT >=", value, "shipport");
            return (Criteria) this;
        }

        public Criteria andShipportLessThan(String value) {
            addCriterion("CPC_SHIPPORT <", value, "shipport");
            return (Criteria) this;
        }

        public Criteria andShipportLessThanOrEqualTo(String value) {
            addCriterion("CPC_SHIPPORT <=", value, "shipport");
            return (Criteria) this;
        }

        public Criteria andShipportLike(String value) {
            addCriterion("CPC_SHIPPORT like", value, "shipport");
            return (Criteria) this;
        }

        public Criteria andShipportNotLike(String value) {
            addCriterion("CPC_SHIPPORT not like", value, "shipport");
            return (Criteria) this;
        }

        public Criteria andShipportIn(List<String> values) {
            addCriterion("CPC_SHIPPORT in", values, "shipport");
            return (Criteria) this;
        }

        public Criteria andShipportNotIn(List<String> values) {
            addCriterion("CPC_SHIPPORT not in", values, "shipport");
            return (Criteria) this;
        }

        public Criteria andShipportBetween(String value1, String value2) {
            addCriterion("CPC_SHIPPORT between", value1, value2, "shipport");
            return (Criteria) this;
        }

        public Criteria andShipportNotBetween(String value1, String value2) {
            addCriterion("CPC_SHIPPORT not between", value1, value2, "shipport");
            return (Criteria) this;
        }

        public Criteria andChecktypeIsNull() {
            addCriterion("CPC_CHECKTYPE is null");
            return (Criteria) this;
        }

        public Criteria andChecktypeIsNotNull() {
            addCriterion("CPC_CHECKTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andChecktypeEqualTo(String value) {
            addCriterion("CPC_CHECKTYPE =", value, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeNotEqualTo(String value) {
            addCriterion("CPC_CHECKTYPE <>", value, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeGreaterThan(String value) {
            addCriterion("CPC_CHECKTYPE >", value, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeGreaterThanOrEqualTo(String value) {
            addCriterion("CPC_CHECKTYPE >=", value, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeLessThan(String value) {
            addCriterion("CPC_CHECKTYPE <", value, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeLessThanOrEqualTo(String value) {
            addCriterion("CPC_CHECKTYPE <=", value, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeLike(String value) {
            addCriterion("CPC_CHECKTYPE like", value, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeNotLike(String value) {
            addCriterion("CPC_CHECKTYPE not like", value, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeIn(List<String> values) {
            addCriterion("CPC_CHECKTYPE in", values, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeNotIn(List<String> values) {
            addCriterion("CPC_CHECKTYPE not in", values, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeBetween(String value1, String value2) {
            addCriterion("CPC_CHECKTYPE between", value1, value2, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeNotBetween(String value1, String value2) {
            addCriterion("CPC_CHECKTYPE not between", value1, value2, "checktype");
            return (Criteria) this;
        }

        public Criteria andShipcodeIsNull() {
            addCriterion("CPC_SHIPCODE is null");
            return (Criteria) this;
        }

        public Criteria andShipcodeIsNotNull() {
            addCriterion("CPC_SHIPCODE is not null");
            return (Criteria) this;
        }

        public Criteria andShipcodeEqualTo(String value) {
            addCriterion("CPC_SHIPCODE =", value, "shipcode");
            return (Criteria) this;
        }

        public Criteria andShipcodeNotEqualTo(String value) {
            addCriterion("CPC_SHIPCODE <>", value, "shipcode");
            return (Criteria) this;
        }

        public Criteria andShipcodeGreaterThan(String value) {
            addCriterion("CPC_SHIPCODE >", value, "shipcode");
            return (Criteria) this;
        }

        public Criteria andShipcodeGreaterThanOrEqualTo(String value) {
            addCriterion("CPC_SHIPCODE >=", value, "shipcode");
            return (Criteria) this;
        }

        public Criteria andShipcodeLessThan(String value) {
            addCriterion("CPC_SHIPCODE <", value, "shipcode");
            return (Criteria) this;
        }

        public Criteria andShipcodeLessThanOrEqualTo(String value) {
            addCriterion("CPC_SHIPCODE <=", value, "shipcode");
            return (Criteria) this;
        }

        public Criteria andShipcodeLike(String value) {
            addCriterion("CPC_SHIPCODE like", value, "shipcode");
            return (Criteria) this;
        }

        public Criteria andShipcodeNotLike(String value) {
            addCriterion("CPC_SHIPCODE not like", value, "shipcode");
            return (Criteria) this;
        }

        public Criteria andShipcodeIn(List<String> values) {
            addCriterion("CPC_SHIPCODE in", values, "shipcode");
            return (Criteria) this;
        }

        public Criteria andShipcodeNotIn(List<String> values) {
            addCriterion("CPC_SHIPCODE not in", values, "shipcode");
            return (Criteria) this;
        }

        public Criteria andShipcodeBetween(String value1, String value2) {
            addCriterion("CPC_SHIPCODE between", value1, value2, "shipcode");
            return (Criteria) this;
        }

        public Criteria andShipcodeNotBetween(String value1, String value2) {
            addCriterion("CPC_SHIPCODE not between", value1, value2, "shipcode");
            return (Criteria) this;
        }

        public Criteria andRc1IsNull() {
            addCriterion("CPC_RC1 is null");
            return (Criteria) this;
        }

        public Criteria andRc1IsNotNull() {
            addCriterion("CPC_RC1 is not null");
            return (Criteria) this;
        }

        public Criteria andRc1EqualTo(String value) {
            addCriterion("CPC_RC1 =", value, "rc1");
            return (Criteria) this;
        }

        public Criteria andRc1NotEqualTo(String value) {
            addCriterion("CPC_RC1 <>", value, "rc1");
            return (Criteria) this;
        }

        public Criteria andRc1GreaterThan(String value) {
            addCriterion("CPC_RC1 >", value, "rc1");
            return (Criteria) this;
        }

        public Criteria andRc1GreaterThanOrEqualTo(String value) {
            addCriterion("CPC_RC1 >=", value, "rc1");
            return (Criteria) this;
        }

        public Criteria andRc1LessThan(String value) {
            addCriterion("CPC_RC1 <", value, "rc1");
            return (Criteria) this;
        }

        public Criteria andRc1LessThanOrEqualTo(String value) {
            addCriterion("CPC_RC1 <=", value, "rc1");
            return (Criteria) this;
        }

        public Criteria andRc1Like(String value) {
            addCriterion("CPC_RC1 like", value, "rc1");
            return (Criteria) this;
        }

        public Criteria andRc1NotLike(String value) {
            addCriterion("CPC_RC1 not like", value, "rc1");
            return (Criteria) this;
        }

        public Criteria andRc1In(List<String> values) {
            addCriterion("CPC_RC1 in", values, "rc1");
            return (Criteria) this;
        }

        public Criteria andRc1NotIn(List<String> values) {
            addCriterion("CPC_RC1 not in", values, "rc1");
            return (Criteria) this;
        }

        public Criteria andRc1Between(String value1, String value2) {
            addCriterion("CPC_RC1 between", value1, value2, "rc1");
            return (Criteria) this;
        }

        public Criteria andRc1NotBetween(String value1, String value2) {
            addCriterion("CPC_RC1 not between", value1, value2, "rc1");
            return (Criteria) this;
        }

        public Criteria andRc2IsNull() {
            addCriterion("CPC_RC2 is null");
            return (Criteria) this;
        }

        public Criteria andRc2IsNotNull() {
            addCriterion("CPC_RC2 is not null");
            return (Criteria) this;
        }

        public Criteria andRc2EqualTo(String value) {
            addCriterion("CPC_RC2 =", value, "rc2");
            return (Criteria) this;
        }

        public Criteria andRc2NotEqualTo(String value) {
            addCriterion("CPC_RC2 <>", value, "rc2");
            return (Criteria) this;
        }

        public Criteria andRc2GreaterThan(String value) {
            addCriterion("CPC_RC2 >", value, "rc2");
            return (Criteria) this;
        }

        public Criteria andRc2GreaterThanOrEqualTo(String value) {
            addCriterion("CPC_RC2 >=", value, "rc2");
            return (Criteria) this;
        }

        public Criteria andRc2LessThan(String value) {
            addCriterion("CPC_RC2 <", value, "rc2");
            return (Criteria) this;
        }

        public Criteria andRc2LessThanOrEqualTo(String value) {
            addCriterion("CPC_RC2 <=", value, "rc2");
            return (Criteria) this;
        }

        public Criteria andRc2Like(String value) {
            addCriterion("CPC_RC2 like", value, "rc2");
            return (Criteria) this;
        }

        public Criteria andRc2NotLike(String value) {
            addCriterion("CPC_RC2 not like", value, "rc2");
            return (Criteria) this;
        }

        public Criteria andRc2In(List<String> values) {
            addCriterion("CPC_RC2 in", values, "rc2");
            return (Criteria) this;
        }

        public Criteria andRc2NotIn(List<String> values) {
            addCriterion("CPC_RC2 not in", values, "rc2");
            return (Criteria) this;
        }

        public Criteria andRc2Between(String value1, String value2) {
            addCriterion("CPC_RC2 between", value1, value2, "rc2");
            return (Criteria) this;
        }

        public Criteria andRc2NotBetween(String value1, String value2) {
            addCriterion("CPC_RC2 not between", value1, value2, "rc2");
            return (Criteria) this;
        }

        public Criteria andRc3IsNull() {
            addCriterion("CPC_RC3 is null");
            return (Criteria) this;
        }

        public Criteria andRc3IsNotNull() {
            addCriterion("CPC_RC3 is not null");
            return (Criteria) this;
        }

        public Criteria andRc3EqualTo(Long value) {
            addCriterion("CPC_RC3 =", value, "rc3");
            return (Criteria) this;
        }

        public Criteria andRc3NotEqualTo(Long value) {
            addCriterion("CPC_RC3 <>", value, "rc3");
            return (Criteria) this;
        }

        public Criteria andRc3GreaterThan(Long value) {
            addCriterion("CPC_RC3 >", value, "rc3");
            return (Criteria) this;
        }

        public Criteria andRc3GreaterThanOrEqualTo(Long value) {
            addCriterion("CPC_RC3 >=", value, "rc3");
            return (Criteria) this;
        }

        public Criteria andRc3LessThan(Long value) {
            addCriterion("CPC_RC3 <", value, "rc3");
            return (Criteria) this;
        }

        public Criteria andRc3LessThanOrEqualTo(Long value) {
            addCriterion("CPC_RC3 <=", value, "rc3");
            return (Criteria) this;
        }

        public Criteria andRc3In(List<Long> values) {
            addCriterion("CPC_RC3 in", values, "rc3");
            return (Criteria) this;
        }

        public Criteria andRc3NotIn(List<Long> values) {
            addCriterion("CPC_RC3 not in", values, "rc3");
            return (Criteria) this;
        }

        public Criteria andRc3Between(Long value1, Long value2) {
            addCriterion("CPC_RC3 between", value1, value2, "rc3");
            return (Criteria) this;
        }

        public Criteria andRc3NotBetween(Long value1, Long value2) {
            addCriterion("CPC_RC3 not between", value1, value2, "rc3");
            return (Criteria) this;
        }

        public Criteria andRc4IsNull() {
            addCriterion("CPC_RC4 is null");
            return (Criteria) this;
        }

        public Criteria andRc4IsNotNull() {
            addCriterion("CPC_RC4 is not null");
            return (Criteria) this;
        }

        public Criteria andRc4EqualTo(Date value) {
            addCriterion("CPC_RC4 =", value, "rc4");
            return (Criteria) this;
        }

        public Criteria andRc4NotEqualTo(Date value) {
            addCriterion("CPC_RC4 <>", value, "rc4");
            return (Criteria) this;
        }

        public Criteria andRc4GreaterThan(Date value) {
            addCriterion("CPC_RC4 >", value, "rc4");
            return (Criteria) this;
        }

        public Criteria andRc4GreaterThanOrEqualTo(Date value) {
            addCriterion("CPC_RC4 >=", value, "rc4");
            return (Criteria) this;
        }

        public Criteria andRc4LessThan(Date value) {
            addCriterion("CPC_RC4 <", value, "rc4");
            return (Criteria) this;
        }

        public Criteria andRc4LessThanOrEqualTo(Date value) {
            addCriterion("CPC_RC4 <=", value, "rc4");
            return (Criteria) this;
        }

        public Criteria andRc4In(List<Date> values) {
            addCriterion("CPC_RC4 in", values, "rc4");
            return (Criteria) this;
        }

        public Criteria andRc4NotIn(List<Date> values) {
            addCriterion("CPC_RC4 not in", values, "rc4");
            return (Criteria) this;
        }

        public Criteria andRc4Between(Date value1, Date value2) {
            addCriterion("CPC_RC4 between", value1, value2, "rc4");
            return (Criteria) this;
        }

        public Criteria andRc4NotBetween(Date value1, Date value2) {
            addCriterion("CPC_RC4 not between", value1, value2, "rc4");
            return (Criteria) this;
        }

        public Criteria andReportNoIsNull() {
            addCriterion("CPC_REPORT_NO is null");
            return (Criteria) this;
        }

        public Criteria andReportNoIsNotNull() {
            addCriterion("CPC_REPORT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andReportNoEqualTo(String value) {
            addCriterion("CPC_REPORT_NO =", value, "reportNo");
            return (Criteria) this;
        }

        public Criteria andReportNoNotEqualTo(String value) {
            addCriterion("CPC_REPORT_NO <>", value, "reportNo");
            return (Criteria) this;
        }

        public Criteria andReportNoGreaterThan(String value) {
            addCriterion("CPC_REPORT_NO >", value, "reportNo");
            return (Criteria) this;
        }

        public Criteria andReportNoGreaterThanOrEqualTo(String value) {
            addCriterion("CPC_REPORT_NO >=", value, "reportNo");
            return (Criteria) this;
        }

        public Criteria andReportNoLessThan(String value) {
            addCriterion("CPC_REPORT_NO <", value, "reportNo");
            return (Criteria) this;
        }

        public Criteria andReportNoLessThanOrEqualTo(String value) {
            addCriterion("CPC_REPORT_NO <=", value, "reportNo");
            return (Criteria) this;
        }

        public Criteria andReportNoLike(String value) {
            addCriterion("CPC_REPORT_NO like", value, "reportNo");
            return (Criteria) this;
        }

        public Criteria andReportNoNotLike(String value) {
            addCriterion("CPC_REPORT_NO not like", value, "reportNo");
            return (Criteria) this;
        }

        public Criteria andReportNoIn(List<String> values) {
            addCriterion("CPC_REPORT_NO in", values, "reportNo");
            return (Criteria) this;
        }

        public Criteria andReportNoNotIn(List<String> values) {
            addCriterion("CPC_REPORT_NO not in", values, "reportNo");
            return (Criteria) this;
        }

        public Criteria andReportNoBetween(String value1, String value2) {
            addCriterion("CPC_REPORT_NO between", value1, value2, "reportNo");
            return (Criteria) this;
        }

        public Criteria andReportNoNotBetween(String value1, String value2) {
            addCriterion("CPC_REPORT_NO not between", value1, value2, "reportNo");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("CPC_STATE is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("CPC_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("CPC_STATE =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("CPC_STATE <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("CPC_STATE >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("CPC_STATE >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("CPC_STATE <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("CPC_STATE <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("CPC_STATE like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("CPC_STATE not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("CPC_STATE in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("CPC_STATE not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("CPC_STATE between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("CPC_STATE not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andShipcheckTypeIsNull() {
            addCriterion("CPC_SHIPCHECK_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andShipcheckTypeIsNotNull() {
            addCriterion("CPC_SHIPCHECK_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andShipcheckTypeEqualTo(String value) {
            addCriterion("CPC_SHIPCHECK_TYPE =", value, "shipcheckType");
            return (Criteria) this;
        }

        public Criteria andShipcheckTypeNotEqualTo(String value) {
            addCriterion("CPC_SHIPCHECK_TYPE <>", value, "shipcheckType");
            return (Criteria) this;
        }

        public Criteria andShipcheckTypeGreaterThan(String value) {
            addCriterion("CPC_SHIPCHECK_TYPE >", value, "shipcheckType");
            return (Criteria) this;
        }

        public Criteria andShipcheckTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CPC_SHIPCHECK_TYPE >=", value, "shipcheckType");
            return (Criteria) this;
        }

        public Criteria andShipcheckTypeLessThan(String value) {
            addCriterion("CPC_SHIPCHECK_TYPE <", value, "shipcheckType");
            return (Criteria) this;
        }

        public Criteria andShipcheckTypeLessThanOrEqualTo(String value) {
            addCriterion("CPC_SHIPCHECK_TYPE <=", value, "shipcheckType");
            return (Criteria) this;
        }

        public Criteria andShipcheckTypeLike(String value) {
            addCriterion("CPC_SHIPCHECK_TYPE like", value, "shipcheckType");
            return (Criteria) this;
        }

        public Criteria andShipcheckTypeNotLike(String value) {
            addCriterion("CPC_SHIPCHECK_TYPE not like", value, "shipcheckType");
            return (Criteria) this;
        }

        public Criteria andShipcheckTypeIn(List<String> values) {
            addCriterion("CPC_SHIPCHECK_TYPE in", values, "shipcheckType");
            return (Criteria) this;
        }

        public Criteria andShipcheckTypeNotIn(List<String> values) {
            addCriterion("CPC_SHIPCHECK_TYPE not in", values, "shipcheckType");
            return (Criteria) this;
        }

        public Criteria andShipcheckTypeBetween(String value1, String value2) {
            addCriterion("CPC_SHIPCHECK_TYPE between", value1, value2, "shipcheckType");
            return (Criteria) this;
        }

        public Criteria andShipcheckTypeNotBetween(String value1, String value2) {
            addCriterion("CPC_SHIPCHECK_TYPE not between", value1, value2, "shipcheckType");
            return (Criteria) this;
        }

        public Criteria andChecknumberIsNull() {
            addCriterion("CPC_CHECKNUMBER is null");
            return (Criteria) this;
        }

        public Criteria andChecknumberIsNotNull() {
            addCriterion("CPC_CHECKNUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andChecknumberEqualTo(String value) {
            addCriterion("CPC_CHECKNUMBER =", value, "checknumber");
            return (Criteria) this;
        }

        public Criteria andChecknumberNotEqualTo(String value) {
            addCriterion("CPC_CHECKNUMBER <>", value, "checknumber");
            return (Criteria) this;
        }

        public Criteria andChecknumberGreaterThan(String value) {
            addCriterion("CPC_CHECKNUMBER >", value, "checknumber");
            return (Criteria) this;
        }

        public Criteria andChecknumberGreaterThanOrEqualTo(String value) {
            addCriterion("CPC_CHECKNUMBER >=", value, "checknumber");
            return (Criteria) this;
        }

        public Criteria andChecknumberLessThan(String value) {
            addCriterion("CPC_CHECKNUMBER <", value, "checknumber");
            return (Criteria) this;
        }

        public Criteria andChecknumberLessThanOrEqualTo(String value) {
            addCriterion("CPC_CHECKNUMBER <=", value, "checknumber");
            return (Criteria) this;
        }

        public Criteria andChecknumberLike(String value) {
            addCriterion("CPC_CHECKNUMBER like", value, "checknumber");
            return (Criteria) this;
        }

        public Criteria andChecknumberNotLike(String value) {
            addCriterion("CPC_CHECKNUMBER not like", value, "checknumber");
            return (Criteria) this;
        }

        public Criteria andChecknumberIn(List<String> values) {
            addCriterion("CPC_CHECKNUMBER in", values, "checknumber");
            return (Criteria) this;
        }

        public Criteria andChecknumberNotIn(List<String> values) {
            addCriterion("CPC_CHECKNUMBER not in", values, "checknumber");
            return (Criteria) this;
        }

        public Criteria andChecknumberBetween(String value1, String value2) {
            addCriterion("CPC_CHECKNUMBER between", value1, value2, "checknumber");
            return (Criteria) this;
        }

        public Criteria andChecknumberNotBetween(String value1, String value2) {
            addCriterion("CPC_CHECKNUMBER not between", value1, value2, "checknumber");
            return (Criteria) this;
        }

        public Criteria andIdLikeInsensitive(String value) {
            addCriterion("upper(CPC_ID) like", value.toUpperCase(), "id");
            return (Criteria) this;
        }

        public Criteria andUidLikeInsensitive(String value) {
            addCriterion("upper(CPC_UID) like", value.toUpperCase(), "uid");
            return (Criteria) this;
        }

        public Criteria andEntidLikeInsensitive(String value) {
            addCriterion("upper(CPC_ENTID) like", value.toUpperCase(), "entid");
            return (Criteria) this;
        }

        public Criteria andSuridLikeInsensitive(String value) {
            addCriterion("upper(CPC_SURID) like", value.toUpperCase(), "surid");
            return (Criteria) this;
        }

        public Criteria andShipnameLikeInsensitive(String value) {
            addCriterion("upper(CPC_SHIPNAME) like", value.toUpperCase(), "shipname");
            return (Criteria) this;
        }

        public Criteria andResppersonLikeInsensitive(String value) {
            addCriterion("upper(CPC_RESPPERSON) like", value.toUpperCase(), "respperson");
            return (Criteria) this;
        }

        public Criteria andChecktimeLikeInsensitive(String value) {
            addCriterion("upper(CPC_CHECKTIME) like", value.toUpperCase(), "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimenextLikeInsensitive(String value) {
            addCriterion("upper(CPC_CHECKTIMENEXT) like", value.toUpperCase(), "checktimenext");
            return (Criteria) this;
        }

        public Criteria andProducttypeLikeInsensitive(String value) {
            addCriterion("upper(CPC_PRODUCTTYPE) like", value.toUpperCase(), "producttype");
            return (Criteria) this;
        }

        public Criteria andProductnumLikeInsensitive(String value) {
            addCriterion("upper(CPC_PRODUCTNUM) like", value.toUpperCase(), "productnum");
            return (Criteria) this;
        }

        public Criteria andProdutmodelLikeInsensitive(String value) {
            addCriterion("upper(CPC_PRODUTMODEL) like", value.toUpperCase(), "produtmodel");
            return (Criteria) this;
        }

        public Criteria andProductcertLikeInsensitive(String value) {
            addCriterion("upper(CPC_PRODUCTCERT) like", value.toUpperCase(), "productcert");
            return (Criteria) this;
        }

        public Criteria andShipportLikeInsensitive(String value) {
            addCriterion("upper(CPC_SHIPPORT) like", value.toUpperCase(), "shipport");
            return (Criteria) this;
        }

        public Criteria andChecktypeLikeInsensitive(String value) {
            addCriterion("upper(CPC_CHECKTYPE) like", value.toUpperCase(), "checktype");
            return (Criteria) this;
        }

        public Criteria andShipcodeLikeInsensitive(String value) {
            addCriterion("upper(CPC_SHIPCODE) like", value.toUpperCase(), "shipcode");
            return (Criteria) this;
        }

        public Criteria andRc1LikeInsensitive(String value) {
            addCriterion("upper(CPC_RC1) like", value.toUpperCase(), "rc1");
            return (Criteria) this;
        }

        public Criteria andRc2LikeInsensitive(String value) {
            addCriterion("upper(CPC_RC2) like", value.toUpperCase(), "rc2");
            return (Criteria) this;
        }

        public Criteria andReportNoLikeInsensitive(String value) {
            addCriterion("upper(CPC_REPORT_NO) like", value.toUpperCase(), "reportNo");
            return (Criteria) this;
        }

        public Criteria andStateLikeInsensitive(String value) {
            addCriterion("upper(CPC_STATE) like", value.toUpperCase(), "state");
            return (Criteria) this;
        }

        public Criteria andShipcheckTypeLikeInsensitive(String value) {
            addCriterion("upper(CPC_SHIPCHECK_TYPE) like", value.toUpperCase(), "shipcheckType");
            return (Criteria) this;
        }

        public Criteria andChecknumberLikeInsensitive(String value) {
            addCriterion("upper(CPC_CHECKNUMBER) like", value.toUpperCase(), "checknumber");
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