package com.chinasofti.domain;

import com.limp.framework.core.bean.Pager;

import java.util.ArrayList;
import java.util.List;

public class ThemProductJbxxExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Pager page;

    public ThemProductJbxxExample() {
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andProducttypeIsNull() {
            addCriterion("PRODUCTTYPE is null");
            return (Criteria) this;
        }

        public Criteria andProducttypeIsNotNull() {
            addCriterion("PRODUCTTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andProducttypeEqualTo(String value) {
            addCriterion("PRODUCTTYPE =", value, "producttype");
            return (Criteria) this;
        }

        public Criteria andProducttypeNotEqualTo(String value) {
            addCriterion("PRODUCTTYPE <>", value, "producttype");
            return (Criteria) this;
        }

        public Criteria andProducttypeGreaterThan(String value) {
            addCriterion("PRODUCTTYPE >", value, "producttype");
            return (Criteria) this;
        }

        public Criteria andProducttypeGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCTTYPE >=", value, "producttype");
            return (Criteria) this;
        }

        public Criteria andProducttypeLessThan(String value) {
            addCriterion("PRODUCTTYPE <", value, "producttype");
            return (Criteria) this;
        }

        public Criteria andProducttypeLessThanOrEqualTo(String value) {
            addCriterion("PRODUCTTYPE <=", value, "producttype");
            return (Criteria) this;
        }

        public Criteria andProducttypeLike(String value) {
            addCriterion("PRODUCTTYPE like", value, "producttype");
            return (Criteria) this;
        }

        public Criteria andProducttypeNotLike(String value) {
            addCriterion("PRODUCTTYPE not like", value, "producttype");
            return (Criteria) this;
        }

        public Criteria andProducttypeIn(List<String> values) {
            addCriterion("PRODUCTTYPE in", values, "producttype");
            return (Criteria) this;
        }

        public Criteria andProducttypeNotIn(List<String> values) {
            addCriterion("PRODUCTTYPE not in", values, "producttype");
            return (Criteria) this;
        }

        public Criteria andProducttypeBetween(String value1, String value2) {
            addCriterion("PRODUCTTYPE between", value1, value2, "producttype");
            return (Criteria) this;
        }

        public Criteria andProducttypeNotBetween(String value1, String value2) {
            addCriterion("PRODUCTTYPE not between", value1, value2, "producttype");
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

        public Criteria andShipidIsNull() {
            addCriterion("SHIPID is null");
            return (Criteria) this;
        }

        public Criteria andShipidIsNotNull() {
            addCriterion("SHIPID is not null");
            return (Criteria) this;
        }

        public Criteria andShipidEqualTo(String value) {
            addCriterion("SHIPID =", value, "shipid");
            return (Criteria) this;
        }

        public Criteria andShipidNotEqualTo(String value) {
            addCriterion("SHIPID <>", value, "shipid");
            return (Criteria) this;
        }

        public Criteria andShipidGreaterThan(String value) {
            addCriterion("SHIPID >", value, "shipid");
            return (Criteria) this;
        }

        public Criteria andShipidGreaterThanOrEqualTo(String value) {
            addCriterion("SHIPID >=", value, "shipid");
            return (Criteria) this;
        }

        public Criteria andShipidLessThan(String value) {
            addCriterion("SHIPID <", value, "shipid");
            return (Criteria) this;
        }

        public Criteria andShipidLessThanOrEqualTo(String value) {
            addCriterion("SHIPID <=", value, "shipid");
            return (Criteria) this;
        }

        public Criteria andShipidLike(String value) {
            addCriterion("SHIPID like", value, "shipid");
            return (Criteria) this;
        }

        public Criteria andShipidNotLike(String value) {
            addCriterion("SHIPID not like", value, "shipid");
            return (Criteria) this;
        }

        public Criteria andShipidIn(List<String> values) {
            addCriterion("SHIPID in", values, "shipid");
            return (Criteria) this;
        }

        public Criteria andShipidNotIn(List<String> values) {
            addCriterion("SHIPID not in", values, "shipid");
            return (Criteria) this;
        }

        public Criteria andShipidBetween(String value1, String value2) {
            addCriterion("SHIPID between", value1, value2, "shipid");
            return (Criteria) this;
        }

        public Criteria andShipidNotBetween(String value1, String value2) {
            addCriterion("SHIPID not between", value1, value2, "shipid");
            return (Criteria) this;
        }

        public Criteria andYearIsNull() {
            addCriterion("YEAR is null");
            return (Criteria) this;
        }

        public Criteria andYearIsNotNull() {
            addCriterion("YEAR is not null");
            return (Criteria) this;
        }

        public Criteria andYearEqualTo(String value) {
            addCriterion("YEAR =", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotEqualTo(String value) {
            addCriterion("YEAR <>", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThan(String value) {
            addCriterion("YEAR >", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThanOrEqualTo(String value) {
            addCriterion("YEAR >=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThan(String value) {
            addCriterion("YEAR <", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThanOrEqualTo(String value) {
            addCriterion("YEAR <=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLike(String value) {
            addCriterion("YEAR like", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotLike(String value) {
            addCriterion("YEAR not like", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearIn(List<String> values) {
            addCriterion("YEAR in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotIn(List<String> values) {
            addCriterion("YEAR not in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearBetween(String value1, String value2) {
            addCriterion("YEAR between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotBetween(String value1, String value2) {
            addCriterion("YEAR not between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andPrvcodeIsNull() {
            addCriterion("PRVCODE is null");
            return (Criteria) this;
        }

        public Criteria andPrvcodeIsNotNull() {
            addCriterion("PRVCODE is not null");
            return (Criteria) this;
        }

        public Criteria andPrvcodeEqualTo(String value) {
            addCriterion("PRVCODE =", value, "prvcode");
            return (Criteria) this;
        }

        public Criteria andPrvcodeNotEqualTo(String value) {
            addCriterion("PRVCODE <>", value, "prvcode");
            return (Criteria) this;
        }

        public Criteria andPrvcodeGreaterThan(String value) {
            addCriterion("PRVCODE >", value, "prvcode");
            return (Criteria) this;
        }

        public Criteria andPrvcodeGreaterThanOrEqualTo(String value) {
            addCriterion("PRVCODE >=", value, "prvcode");
            return (Criteria) this;
        }

        public Criteria andPrvcodeLessThan(String value) {
            addCriterion("PRVCODE <", value, "prvcode");
            return (Criteria) this;
        }

        public Criteria andPrvcodeLessThanOrEqualTo(String value) {
            addCriterion("PRVCODE <=", value, "prvcode");
            return (Criteria) this;
        }

        public Criteria andPrvcodeLike(String value) {
            addCriterion("PRVCODE like", value, "prvcode");
            return (Criteria) this;
        }

        public Criteria andPrvcodeNotLike(String value) {
            addCriterion("PRVCODE not like", value, "prvcode");
            return (Criteria) this;
        }

        public Criteria andPrvcodeIn(List<String> values) {
            addCriterion("PRVCODE in", values, "prvcode");
            return (Criteria) this;
        }

        public Criteria andPrvcodeNotIn(List<String> values) {
            addCriterion("PRVCODE not in", values, "prvcode");
            return (Criteria) this;
        }

        public Criteria andPrvcodeBetween(String value1, String value2) {
            addCriterion("PRVCODE between", value1, value2, "prvcode");
            return (Criteria) this;
        }

        public Criteria andPrvcodeNotBetween(String value1, String value2) {
            addCriterion("PRVCODE not between", value1, value2, "prvcode");
            return (Criteria) this;
        }

        public Criteria andChecktypeIsNull() {
            addCriterion("CHECKTYPE is null");
            return (Criteria) this;
        }

        public Criteria andChecktypeIsNotNull() {
            addCriterion("CHECKTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andChecktypeEqualTo(String value) {
            addCriterion("CHECKTYPE =", value, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeNotEqualTo(String value) {
            addCriterion("CHECKTYPE <>", value, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeGreaterThan(String value) {
            addCriterion("CHECKTYPE >", value, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeGreaterThanOrEqualTo(String value) {
            addCriterion("CHECKTYPE >=", value, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeLessThan(String value) {
            addCriterion("CHECKTYPE <", value, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeLessThanOrEqualTo(String value) {
            addCriterion("CHECKTYPE <=", value, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeLike(String value) {
            addCriterion("CHECKTYPE like", value, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeNotLike(String value) {
            addCriterion("CHECKTYPE not like", value, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeIn(List<String> values) {
            addCriterion("CHECKTYPE in", values, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeNotIn(List<String> values) {
            addCriterion("CHECKTYPE not in", values, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeBetween(String value1, String value2) {
            addCriterion("CHECKTYPE between", value1, value2, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeNotBetween(String value1, String value2) {
            addCriterion("CHECKTYPE not between", value1, value2, "checktype");
            return (Criteria) this;
        }

        public Criteria andOrginnameIsNull() {
            addCriterion("ORGINNAME is null");
            return (Criteria) this;
        }

        public Criteria andOrginnameIsNotNull() {
            addCriterion("ORGINNAME is not null");
            return (Criteria) this;
        }

        public Criteria andOrginnameEqualTo(String value) {
            addCriterion("ORGINNAME =", value, "orginname");
            return (Criteria) this;
        }

        public Criteria andOrginnameNotEqualTo(String value) {
            addCriterion("ORGINNAME <>", value, "orginname");
            return (Criteria) this;
        }

        public Criteria andOrginnameGreaterThan(String value) {
            addCriterion("ORGINNAME >", value, "orginname");
            return (Criteria) this;
        }

        public Criteria andOrginnameGreaterThanOrEqualTo(String value) {
            addCriterion("ORGINNAME >=", value, "orginname");
            return (Criteria) this;
        }

        public Criteria andOrginnameLessThan(String value) {
            addCriterion("ORGINNAME <", value, "orginname");
            return (Criteria) this;
        }

        public Criteria andOrginnameLessThanOrEqualTo(String value) {
            addCriterion("ORGINNAME <=", value, "orginname");
            return (Criteria) this;
        }

        public Criteria andOrginnameLike(String value) {
            addCriterion("ORGINNAME like", value, "orginname");
            return (Criteria) this;
        }

        public Criteria andOrginnameNotLike(String value) {
            addCriterion("ORGINNAME not like", value, "orginname");
            return (Criteria) this;
        }

        public Criteria andOrginnameIn(List<String> values) {
            addCriterion("ORGINNAME in", values, "orginname");
            return (Criteria) this;
        }

        public Criteria andOrginnameNotIn(List<String> values) {
            addCriterion("ORGINNAME not in", values, "orginname");
            return (Criteria) this;
        }

        public Criteria andOrginnameBetween(String value1, String value2) {
            addCriterion("ORGINNAME between", value1, value2, "orginname");
            return (Criteria) this;
        }

        public Criteria andOrginnameNotBetween(String value1, String value2) {
            addCriterion("ORGINNAME not between", value1, value2, "orginname");
            return (Criteria) this;
        }

        public Criteria andOrgcodeIsNull() {
            addCriterion("ORGCODE is null");
            return (Criteria) this;
        }

        public Criteria andOrgcodeIsNotNull() {
            addCriterion("ORGCODE is not null");
            return (Criteria) this;
        }

        public Criteria andOrgcodeEqualTo(String value) {
            addCriterion("ORGCODE =", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeNotEqualTo(String value) {
            addCriterion("ORGCODE <>", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeGreaterThan(String value) {
            addCriterion("ORGCODE >", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeGreaterThanOrEqualTo(String value) {
            addCriterion("ORGCODE >=", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeLessThan(String value) {
            addCriterion("ORGCODE <", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeLessThanOrEqualTo(String value) {
            addCriterion("ORGCODE <=", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeLike(String value) {
            addCriterion("ORGCODE like", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeNotLike(String value) {
            addCriterion("ORGCODE not like", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeIn(List<String> values) {
            addCriterion("ORGCODE in", values, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeNotIn(List<String> values) {
            addCriterion("ORGCODE not in", values, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeBetween(String value1, String value2) {
            addCriterion("ORGCODE between", value1, value2, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeNotBetween(String value1, String value2) {
            addCriterion("ORGCODE not between", value1, value2, "orgcode");
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

        public Criteria andAvgrateIsNull() {
            addCriterion("AVGRATE is null");
            return (Criteria) this;
        }

        public Criteria andAvgrateIsNotNull() {
            addCriterion("AVGRATE is not null");
            return (Criteria) this;
        }

        public Criteria andAvgrateEqualTo(String value) {
            addCriterion("AVGRATE =", value, "avgrate");
            return (Criteria) this;
        }

        public Criteria andAvgrateNotEqualTo(String value) {
            addCriterion("AVGRATE <>", value, "avgrate");
            return (Criteria) this;
        }

        public Criteria andAvgrateGreaterThan(String value) {
            addCriterion("AVGRATE >", value, "avgrate");
            return (Criteria) this;
        }

        public Criteria andAvgrateGreaterThanOrEqualTo(String value) {
            addCriterion("AVGRATE >=", value, "avgrate");
            return (Criteria) this;
        }

        public Criteria andAvgrateLessThan(String value) {
            addCriterion("AVGRATE <", value, "avgrate");
            return (Criteria) this;
        }

        public Criteria andAvgrateLessThanOrEqualTo(String value) {
            addCriterion("AVGRATE <=", value, "avgrate");
            return (Criteria) this;
        }

        public Criteria andAvgrateLike(String value) {
            addCriterion("AVGRATE like", value, "avgrate");
            return (Criteria) this;
        }

        public Criteria andAvgrateNotLike(String value) {
            addCriterion("AVGRATE not like", value, "avgrate");
            return (Criteria) this;
        }

        public Criteria andAvgrateIn(List<String> values) {
            addCriterion("AVGRATE in", values, "avgrate");
            return (Criteria) this;
        }

        public Criteria andAvgrateNotIn(List<String> values) {
            addCriterion("AVGRATE not in", values, "avgrate");
            return (Criteria) this;
        }

        public Criteria andAvgrateBetween(String value1, String value2) {
            addCriterion("AVGRATE between", value1, value2, "avgrate");
            return (Criteria) this;
        }

        public Criteria andAvgrateNotBetween(String value1, String value2) {
            addCriterion("AVGRATE not between", value1, value2, "avgrate");
            return (Criteria) this;
        }

        public Criteria andShipchecktypeIsNull() {
            addCriterion("SHIPCHECKTYPE is null");
            return (Criteria) this;
        }

        public Criteria andShipchecktypeIsNotNull() {
            addCriterion("SHIPCHECKTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andShipchecktypeEqualTo(String value) {
            addCriterion("SHIPCHECKTYPE =", value, "shipchecktype");
            return (Criteria) this;
        }

        public Criteria andShipchecktypeNotEqualTo(String value) {
            addCriterion("SHIPCHECKTYPE <>", value, "shipchecktype");
            return (Criteria) this;
        }

        public Criteria andShipchecktypeGreaterThan(String value) {
            addCriterion("SHIPCHECKTYPE >", value, "shipchecktype");
            return (Criteria) this;
        }

        public Criteria andShipchecktypeGreaterThanOrEqualTo(String value) {
            addCriterion("SHIPCHECKTYPE >=", value, "shipchecktype");
            return (Criteria) this;
        }

        public Criteria andShipchecktypeLessThan(String value) {
            addCriterion("SHIPCHECKTYPE <", value, "shipchecktype");
            return (Criteria) this;
        }

        public Criteria andShipchecktypeLessThanOrEqualTo(String value) {
            addCriterion("SHIPCHECKTYPE <=", value, "shipchecktype");
            return (Criteria) this;
        }

        public Criteria andShipchecktypeLike(String value) {
            addCriterion("SHIPCHECKTYPE like", value, "shipchecktype");
            return (Criteria) this;
        }

        public Criteria andShipchecktypeNotLike(String value) {
            addCriterion("SHIPCHECKTYPE not like", value, "shipchecktype");
            return (Criteria) this;
        }

        public Criteria andShipchecktypeIn(List<String> values) {
            addCriterion("SHIPCHECKTYPE in", values, "shipchecktype");
            return (Criteria) this;
        }

        public Criteria andShipchecktypeNotIn(List<String> values) {
            addCriterion("SHIPCHECKTYPE not in", values, "shipchecktype");
            return (Criteria) this;
        }

        public Criteria andShipchecktypeBetween(String value1, String value2) {
            addCriterion("SHIPCHECKTYPE between", value1, value2, "shipchecktype");
            return (Criteria) this;
        }

        public Criteria andShipchecktypeNotBetween(String value1, String value2) {
            addCriterion("SHIPCHECKTYPE not between", value1, value2, "shipchecktype");
            return (Criteria) this;
        }

        public Criteria andIdLikeInsensitive(String value) {
            addCriterion("upper(ID) like", value.toUpperCase(), "id");
            return (Criteria) this;
        }

        public Criteria andNameLikeInsensitive(String value) {
            addCriterion("upper(NAME) like", value.toUpperCase(), "name");
            return (Criteria) this;
        }

        public Criteria andProducttypeLikeInsensitive(String value) {
            addCriterion("upper(PRODUCTTYPE) like", value.toUpperCase(), "producttype");
            return (Criteria) this;
        }

        public Criteria andEntnameLikeInsensitive(String value) {
            addCriterion("upper(ENTNAME) like", value.toUpperCase(), "entname");
            return (Criteria) this;
        }

        public Criteria andShipidLikeInsensitive(String value) {
            addCriterion("upper(SHIPID) like", value.toUpperCase(), "shipid");
            return (Criteria) this;
        }

        public Criteria andYearLikeInsensitive(String value) {
            addCriterion("upper(YEAR) like", value.toUpperCase(), "year");
            return (Criteria) this;
        }

        public Criteria andPrvcodeLikeInsensitive(String value) {
            addCriterion("upper(PRVCODE) like", value.toUpperCase(), "prvcode");
            return (Criteria) this;
        }

        public Criteria andChecktypeLikeInsensitive(String value) {
            addCriterion("upper(CHECKTYPE) like", value.toUpperCase(), "checktype");
            return (Criteria) this;
        }

        public Criteria andOrginnameLikeInsensitive(String value) {
            addCriterion("upper(ORGINNAME) like", value.toUpperCase(), "orginname");
            return (Criteria) this;
        }

        public Criteria andOrgcodeLikeInsensitive(String value) {
            addCriterion("upper(ORGCODE) like", value.toUpperCase(), "orgcode");
            return (Criteria) this;
        }

        public Criteria andAreacodeLikeInsensitive(String value) {
            addCriterion("upper(AREACODE) like", value.toUpperCase(), "areacode");
            return (Criteria) this;
        }

        public Criteria andAvgrateLikeInsensitive(String value) {
            addCriterion("upper(AVGRATE) like", value.toUpperCase(), "avgrate");
            return (Criteria) this;
        }

        public Criteria andShipchecktypeLikeInsensitive(String value) {
            addCriterion("upper(SHIPCHECKTYPE) like", value.toUpperCase(), "shipchecktype");
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