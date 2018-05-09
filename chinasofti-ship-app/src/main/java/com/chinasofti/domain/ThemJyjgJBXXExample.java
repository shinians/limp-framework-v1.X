package com.chinasofti.domain;

import com.limp.framework.core.bean.Pager;

import java.util.ArrayList;
import java.util.List;

public class ThemJyjgJBXXExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Pager page;

    public ThemJyjgJBXXExample() {
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

        public Criteria andOrgnameIsNull() {
            addCriterion("ORGNAME is null");
            return (Criteria) this;
        }

        public Criteria andOrgnameIsNotNull() {
            addCriterion("ORGNAME is not null");
            return (Criteria) this;
        }

        public Criteria andOrgnameEqualTo(String value) {
            addCriterion("ORGNAME =", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameNotEqualTo(String value) {
            addCriterion("ORGNAME <>", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameGreaterThan(String value) {
            addCriterion("ORGNAME >", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameGreaterThanOrEqualTo(String value) {
            addCriterion("ORGNAME >=", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameLessThan(String value) {
            addCriterion("ORGNAME <", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameLessThanOrEqualTo(String value) {
            addCriterion("ORGNAME <=", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameLike(String value) {
            addCriterion("ORGNAME like", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameNotLike(String value) {
            addCriterion("ORGNAME not like", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameIn(List<String> values) {
            addCriterion("ORGNAME in", values, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameNotIn(List<String> values) {
            addCriterion("ORGNAME not in", values, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameBetween(String value1, String value2) {
            addCriterion("ORGNAME between", value1, value2, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameNotBetween(String value1, String value2) {
            addCriterion("ORGNAME not between", value1, value2, "orgname");
            return (Criteria) this;
        }

        public Criteria andNaturetypeIsNull() {
            addCriterion("NATURETYPE is null");
            return (Criteria) this;
        }

        public Criteria andNaturetypeIsNotNull() {
            addCriterion("NATURETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andNaturetypeEqualTo(String value) {
            addCriterion("NATURETYPE =", value, "naturetype");
            return (Criteria) this;
        }

        public Criteria andNaturetypeNotEqualTo(String value) {
            addCriterion("NATURETYPE <>", value, "naturetype");
            return (Criteria) this;
        }

        public Criteria andNaturetypeGreaterThan(String value) {
            addCriterion("NATURETYPE >", value, "naturetype");
            return (Criteria) this;
        }

        public Criteria andNaturetypeGreaterThanOrEqualTo(String value) {
            addCriterion("NATURETYPE >=", value, "naturetype");
            return (Criteria) this;
        }

        public Criteria andNaturetypeLessThan(String value) {
            addCriterion("NATURETYPE <", value, "naturetype");
            return (Criteria) this;
        }

        public Criteria andNaturetypeLessThanOrEqualTo(String value) {
            addCriterion("NATURETYPE <=", value, "naturetype");
            return (Criteria) this;
        }

        public Criteria andNaturetypeLike(String value) {
            addCriterion("NATURETYPE like", value, "naturetype");
            return (Criteria) this;
        }

        public Criteria andNaturetypeNotLike(String value) {
            addCriterion("NATURETYPE not like", value, "naturetype");
            return (Criteria) this;
        }

        public Criteria andNaturetypeIn(List<String> values) {
            addCriterion("NATURETYPE in", values, "naturetype");
            return (Criteria) this;
        }

        public Criteria andNaturetypeNotIn(List<String> values) {
            addCriterion("NATURETYPE not in", values, "naturetype");
            return (Criteria) this;
        }

        public Criteria andNaturetypeBetween(String value1, String value2) {
            addCriterion("NATURETYPE between", value1, value2, "naturetype");
            return (Criteria) this;
        }

        public Criteria andNaturetypeNotBetween(String value1, String value2) {
            addCriterion("NATURETYPE not between", value1, value2, "naturetype");
            return (Criteria) this;
        }

        public Criteria andParttypeIsNull() {
            addCriterion("PARTTYPE is null");
            return (Criteria) this;
        }

        public Criteria andParttypeIsNotNull() {
            addCriterion("PARTTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andParttypeEqualTo(String value) {
            addCriterion("PARTTYPE =", value, "parttype");
            return (Criteria) this;
        }

        public Criteria andParttypeNotEqualTo(String value) {
            addCriterion("PARTTYPE <>", value, "parttype");
            return (Criteria) this;
        }

        public Criteria andParttypeGreaterThan(String value) {
            addCriterion("PARTTYPE >", value, "parttype");
            return (Criteria) this;
        }

        public Criteria andParttypeGreaterThanOrEqualTo(String value) {
            addCriterion("PARTTYPE >=", value, "parttype");
            return (Criteria) this;
        }

        public Criteria andParttypeLessThan(String value) {
            addCriterion("PARTTYPE <", value, "parttype");
            return (Criteria) this;
        }

        public Criteria andParttypeLessThanOrEqualTo(String value) {
            addCriterion("PARTTYPE <=", value, "parttype");
            return (Criteria) this;
        }

        public Criteria andParttypeLike(String value) {
            addCriterion("PARTTYPE like", value, "parttype");
            return (Criteria) this;
        }

        public Criteria andParttypeNotLike(String value) {
            addCriterion("PARTTYPE not like", value, "parttype");
            return (Criteria) this;
        }

        public Criteria andParttypeIn(List<String> values) {
            addCriterion("PARTTYPE in", values, "parttype");
            return (Criteria) this;
        }

        public Criteria andParttypeNotIn(List<String> values) {
            addCriterion("PARTTYPE not in", values, "parttype");
            return (Criteria) this;
        }

        public Criteria andParttypeBetween(String value1, String value2) {
            addCriterion("PARTTYPE between", value1, value2, "parttype");
            return (Criteria) this;
        }

        public Criteria andParttypeNotBetween(String value1, String value2) {
            addCriterion("PARTTYPE not between", value1, value2, "parttype");
            return (Criteria) this;
        }

        public Criteria andFuntypeIsNull() {
            addCriterion("FUNTYPE is null");
            return (Criteria) this;
        }

        public Criteria andFuntypeIsNotNull() {
            addCriterion("FUNTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andFuntypeEqualTo(String value) {
            addCriterion("FUNTYPE =", value, "funtype");
            return (Criteria) this;
        }

        public Criteria andFuntypeNotEqualTo(String value) {
            addCriterion("FUNTYPE <>", value, "funtype");
            return (Criteria) this;
        }

        public Criteria andFuntypeGreaterThan(String value) {
            addCriterion("FUNTYPE >", value, "funtype");
            return (Criteria) this;
        }

        public Criteria andFuntypeGreaterThanOrEqualTo(String value) {
            addCriterion("FUNTYPE >=", value, "funtype");
            return (Criteria) this;
        }

        public Criteria andFuntypeLessThan(String value) {
            addCriterion("FUNTYPE <", value, "funtype");
            return (Criteria) this;
        }

        public Criteria andFuntypeLessThanOrEqualTo(String value) {
            addCriterion("FUNTYPE <=", value, "funtype");
            return (Criteria) this;
        }

        public Criteria andFuntypeLike(String value) {
            addCriterion("FUNTYPE like", value, "funtype");
            return (Criteria) this;
        }

        public Criteria andFuntypeNotLike(String value) {
            addCriterion("FUNTYPE not like", value, "funtype");
            return (Criteria) this;
        }

        public Criteria andFuntypeIn(List<String> values) {
            addCriterion("FUNTYPE in", values, "funtype");
            return (Criteria) this;
        }

        public Criteria andFuntypeNotIn(List<String> values) {
            addCriterion("FUNTYPE not in", values, "funtype");
            return (Criteria) this;
        }

        public Criteria andFuntypeBetween(String value1, String value2) {
            addCriterion("FUNTYPE between", value1, value2, "funtype");
            return (Criteria) this;
        }

        public Criteria andFuntypeNotBetween(String value1, String value2) {
            addCriterion("FUNTYPE not between", value1, value2, "funtype");
            return (Criteria) this;
        }

        public Criteria andFinasourceIsNull() {
            addCriterion("FINASOURCE is null");
            return (Criteria) this;
        }

        public Criteria andFinasourceIsNotNull() {
            addCriterion("FINASOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andFinasourceEqualTo(String value) {
            addCriterion("FINASOURCE =", value, "finasource");
            return (Criteria) this;
        }

        public Criteria andFinasourceNotEqualTo(String value) {
            addCriterion("FINASOURCE <>", value, "finasource");
            return (Criteria) this;
        }

        public Criteria andFinasourceGreaterThan(String value) {
            addCriterion("FINASOURCE >", value, "finasource");
            return (Criteria) this;
        }

        public Criteria andFinasourceGreaterThanOrEqualTo(String value) {
            addCriterion("FINASOURCE >=", value, "finasource");
            return (Criteria) this;
        }

        public Criteria andFinasourceLessThan(String value) {
            addCriterion("FINASOURCE <", value, "finasource");
            return (Criteria) this;
        }

        public Criteria andFinasourceLessThanOrEqualTo(String value) {
            addCriterion("FINASOURCE <=", value, "finasource");
            return (Criteria) this;
        }

        public Criteria andFinasourceLike(String value) {
            addCriterion("FINASOURCE like", value, "finasource");
            return (Criteria) this;
        }

        public Criteria andFinasourceNotLike(String value) {
            addCriterion("FINASOURCE not like", value, "finasource");
            return (Criteria) this;
        }

        public Criteria andFinasourceIn(List<String> values) {
            addCriterion("FINASOURCE in", values, "finasource");
            return (Criteria) this;
        }

        public Criteria andFinasourceNotIn(List<String> values) {
            addCriterion("FINASOURCE not in", values, "finasource");
            return (Criteria) this;
        }

        public Criteria andFinasourceBetween(String value1, String value2) {
            addCriterion("FINASOURCE between", value1, value2, "finasource");
            return (Criteria) this;
        }

        public Criteria andFinasourceNotBetween(String value1, String value2) {
            addCriterion("FINASOURCE not between", value1, value2, "finasource");
            return (Criteria) this;
        }

        public Criteria andProvcodeIsNull() {
            addCriterion("PROVCODE is null");
            return (Criteria) this;
        }

        public Criteria andProvcodeIsNotNull() {
            addCriterion("PROVCODE is not null");
            return (Criteria) this;
        }

        public Criteria andProvcodeEqualTo(String value) {
            addCriterion("PROVCODE =", value, "provcode");
            return (Criteria) this;
        }

        public Criteria andProvcodeNotEqualTo(String value) {
            addCriterion("PROVCODE <>", value, "provcode");
            return (Criteria) this;
        }

        public Criteria andProvcodeGreaterThan(String value) {
            addCriterion("PROVCODE >", value, "provcode");
            return (Criteria) this;
        }

        public Criteria andProvcodeGreaterThanOrEqualTo(String value) {
            addCriterion("PROVCODE >=", value, "provcode");
            return (Criteria) this;
        }

        public Criteria andProvcodeLessThan(String value) {
            addCriterion("PROVCODE <", value, "provcode");
            return (Criteria) this;
        }

        public Criteria andProvcodeLessThanOrEqualTo(String value) {
            addCriterion("PROVCODE <=", value, "provcode");
            return (Criteria) this;
        }

        public Criteria andProvcodeLike(String value) {
            addCriterion("PROVCODE like", value, "provcode");
            return (Criteria) this;
        }

        public Criteria andProvcodeNotLike(String value) {
            addCriterion("PROVCODE not like", value, "provcode");
            return (Criteria) this;
        }

        public Criteria andProvcodeIn(List<String> values) {
            addCriterion("PROVCODE in", values, "provcode");
            return (Criteria) this;
        }

        public Criteria andProvcodeNotIn(List<String> values) {
            addCriterion("PROVCODE not in", values, "provcode");
            return (Criteria) this;
        }

        public Criteria andProvcodeBetween(String value1, String value2) {
            addCriterion("PROVCODE between", value1, value2, "provcode");
            return (Criteria) this;
        }

        public Criteria andProvcodeNotBetween(String value1, String value2) {
            addCriterion("PROVCODE not between", value1, value2, "provcode");
            return (Criteria) this;
        }

        public Criteria andRegdateIsNull() {
            addCriterion("REGDATE is null");
            return (Criteria) this;
        }

        public Criteria andRegdateIsNotNull() {
            addCriterion("REGDATE is not null");
            return (Criteria) this;
        }

        public Criteria andRegdateEqualTo(String value) {
            addCriterion("REGDATE =", value, "regdate");
            return (Criteria) this;
        }

        public Criteria andRegdateNotEqualTo(String value) {
            addCriterion("REGDATE <>", value, "regdate");
            return (Criteria) this;
        }

        public Criteria andRegdateGreaterThan(String value) {
            addCriterion("REGDATE >", value, "regdate");
            return (Criteria) this;
        }

        public Criteria andRegdateGreaterThanOrEqualTo(String value) {
            addCriterion("REGDATE >=", value, "regdate");
            return (Criteria) this;
        }

        public Criteria andRegdateLessThan(String value) {
            addCriterion("REGDATE <", value, "regdate");
            return (Criteria) this;
        }

        public Criteria andRegdateLessThanOrEqualTo(String value) {
            addCriterion("REGDATE <=", value, "regdate");
            return (Criteria) this;
        }

        public Criteria andRegdateLike(String value) {
            addCriterion("REGDATE like", value, "regdate");
            return (Criteria) this;
        }

        public Criteria andRegdateNotLike(String value) {
            addCriterion("REGDATE not like", value, "regdate");
            return (Criteria) this;
        }

        public Criteria andRegdateIn(List<String> values) {
            addCriterion("REGDATE in", values, "regdate");
            return (Criteria) this;
        }

        public Criteria andRegdateNotIn(List<String> values) {
            addCriterion("REGDATE not in", values, "regdate");
            return (Criteria) this;
        }

        public Criteria andRegdateBetween(String value1, String value2) {
            addCriterion("REGDATE between", value1, value2, "regdate");
            return (Criteria) this;
        }

        public Criteria andRegdateNotBetween(String value1, String value2) {
            addCriterion("REGDATE not between", value1, value2, "regdate");
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

        public Criteria andPersonnumIsNull() {
            addCriterion("PERSONNUM is null");
            return (Criteria) this;
        }

        public Criteria andPersonnumIsNotNull() {
            addCriterion("PERSONNUM is not null");
            return (Criteria) this;
        }

        public Criteria andPersonnumEqualTo(String value) {
            addCriterion("PERSONNUM =", value, "personnum");
            return (Criteria) this;
        }

        public Criteria andPersonnumNotEqualTo(String value) {
            addCriterion("PERSONNUM <>", value, "personnum");
            return (Criteria) this;
        }

        public Criteria andPersonnumGreaterThan(String value) {
            addCriterion("PERSONNUM >", value, "personnum");
            return (Criteria) this;
        }

        public Criteria andPersonnumGreaterThanOrEqualTo(String value) {
            addCriterion("PERSONNUM >=", value, "personnum");
            return (Criteria) this;
        }

        public Criteria andPersonnumLessThan(String value) {
            addCriterion("PERSONNUM <", value, "personnum");
            return (Criteria) this;
        }

        public Criteria andPersonnumLessThanOrEqualTo(String value) {
            addCriterion("PERSONNUM <=", value, "personnum");
            return (Criteria) this;
        }

        public Criteria andPersonnumLike(String value) {
            addCriterion("PERSONNUM like", value, "personnum");
            return (Criteria) this;
        }

        public Criteria andPersonnumNotLike(String value) {
            addCriterion("PERSONNUM not like", value, "personnum");
            return (Criteria) this;
        }

        public Criteria andPersonnumIn(List<String> values) {
            addCriterion("PERSONNUM in", values, "personnum");
            return (Criteria) this;
        }

        public Criteria andPersonnumNotIn(List<String> values) {
            addCriterion("PERSONNUM not in", values, "personnum");
            return (Criteria) this;
        }

        public Criteria andPersonnumBetween(String value1, String value2) {
            addCriterion("PERSONNUM between", value1, value2, "personnum");
            return (Criteria) this;
        }

        public Criteria andPersonnumNotBetween(String value1, String value2) {
            addCriterion("PERSONNUM not between", value1, value2, "personnum");
            return (Criteria) this;
        }

        public Criteria andMajortypeIsNull() {
            addCriterion("MAJORTYPE is null");
            return (Criteria) this;
        }

        public Criteria andMajortypeIsNotNull() {
            addCriterion("MAJORTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andMajortypeEqualTo(String value) {
            addCriterion("MAJORTYPE =", value, "majortype");
            return (Criteria) this;
        }

        public Criteria andMajortypeNotEqualTo(String value) {
            addCriterion("MAJORTYPE <>", value, "majortype");
            return (Criteria) this;
        }

        public Criteria andMajortypeGreaterThan(String value) {
            addCriterion("MAJORTYPE >", value, "majortype");
            return (Criteria) this;
        }

        public Criteria andMajortypeGreaterThanOrEqualTo(String value) {
            addCriterion("MAJORTYPE >=", value, "majortype");
            return (Criteria) this;
        }

        public Criteria andMajortypeLessThan(String value) {
            addCriterion("MAJORTYPE <", value, "majortype");
            return (Criteria) this;
        }

        public Criteria andMajortypeLessThanOrEqualTo(String value) {
            addCriterion("MAJORTYPE <=", value, "majortype");
            return (Criteria) this;
        }

        public Criteria andMajortypeLike(String value) {
            addCriterion("MAJORTYPE like", value, "majortype");
            return (Criteria) this;
        }

        public Criteria andMajortypeNotLike(String value) {
            addCriterion("MAJORTYPE not like", value, "majortype");
            return (Criteria) this;
        }

        public Criteria andMajortypeIn(List<String> values) {
            addCriterion("MAJORTYPE in", values, "majortype");
            return (Criteria) this;
        }

        public Criteria andMajortypeNotIn(List<String> values) {
            addCriterion("MAJORTYPE not in", values, "majortype");
            return (Criteria) this;
        }

        public Criteria andMajortypeBetween(String value1, String value2) {
            addCriterion("MAJORTYPE between", value1, value2, "majortype");
            return (Criteria) this;
        }

        public Criteria andMajortypeNotBetween(String value1, String value2) {
            addCriterion("MAJORTYPE not between", value1, value2, "majortype");
            return (Criteria) this;
        }

        public Criteria andProvnameIsNull() {
            addCriterion("PROVNAME is null");
            return (Criteria) this;
        }

        public Criteria andProvnameIsNotNull() {
            addCriterion("PROVNAME is not null");
            return (Criteria) this;
        }

        public Criteria andProvnameEqualTo(String value) {
            addCriterion("PROVNAME =", value, "provname");
            return (Criteria) this;
        }

        public Criteria andProvnameNotEqualTo(String value) {
            addCriterion("PROVNAME <>", value, "provname");
            return (Criteria) this;
        }

        public Criteria andProvnameGreaterThan(String value) {
            addCriterion("PROVNAME >", value, "provname");
            return (Criteria) this;
        }

        public Criteria andProvnameGreaterThanOrEqualTo(String value) {
            addCriterion("PROVNAME >=", value, "provname");
            return (Criteria) this;
        }

        public Criteria andProvnameLessThan(String value) {
            addCriterion("PROVNAME <", value, "provname");
            return (Criteria) this;
        }

        public Criteria andProvnameLessThanOrEqualTo(String value) {
            addCriterion("PROVNAME <=", value, "provname");
            return (Criteria) this;
        }

        public Criteria andProvnameLike(String value) {
            addCriterion("PROVNAME like", value, "provname");
            return (Criteria) this;
        }

        public Criteria andProvnameNotLike(String value) {
            addCriterion("PROVNAME not like", value, "provname");
            return (Criteria) this;
        }

        public Criteria andProvnameIn(List<String> values) {
            addCriterion("PROVNAME in", values, "provname");
            return (Criteria) this;
        }

        public Criteria andProvnameNotIn(List<String> values) {
            addCriterion("PROVNAME not in", values, "provname");
            return (Criteria) this;
        }

        public Criteria andProvnameBetween(String value1, String value2) {
            addCriterion("PROVNAME between", value1, value2, "provname");
            return (Criteria) this;
        }

        public Criteria andProvnameNotBetween(String value1, String value2) {
            addCriterion("PROVNAME not between", value1, value2, "provname");
            return (Criteria) this;
        }

        public Criteria andFinishrateoneIsNull() {
            addCriterion("FINISHRATEONE is null");
            return (Criteria) this;
        }

        public Criteria andFinishrateoneIsNotNull() {
            addCriterion("FINISHRATEONE is not null");
            return (Criteria) this;
        }

        public Criteria andFinishrateoneEqualTo(String value) {
            addCriterion("FINISHRATEONE =", value, "finishrateone");
            return (Criteria) this;
        }

        public Criteria andFinishrateoneNotEqualTo(String value) {
            addCriterion("FINISHRATEONE <>", value, "finishrateone");
            return (Criteria) this;
        }

        public Criteria andFinishrateoneGreaterThan(String value) {
            addCriterion("FINISHRATEONE >", value, "finishrateone");
            return (Criteria) this;
        }

        public Criteria andFinishrateoneGreaterThanOrEqualTo(String value) {
            addCriterion("FINISHRATEONE >=", value, "finishrateone");
            return (Criteria) this;
        }

        public Criteria andFinishrateoneLessThan(String value) {
            addCriterion("FINISHRATEONE <", value, "finishrateone");
            return (Criteria) this;
        }

        public Criteria andFinishrateoneLessThanOrEqualTo(String value) {
            addCriterion("FINISHRATEONE <=", value, "finishrateone");
            return (Criteria) this;
        }

        public Criteria andFinishrateoneLike(String value) {
            addCriterion("FINISHRATEONE like", value, "finishrateone");
            return (Criteria) this;
        }

        public Criteria andFinishrateoneNotLike(String value) {
            addCriterion("FINISHRATEONE not like", value, "finishrateone");
            return (Criteria) this;
        }

        public Criteria andFinishrateoneIn(List<String> values) {
            addCriterion("FINISHRATEONE in", values, "finishrateone");
            return (Criteria) this;
        }

        public Criteria andFinishrateoneNotIn(List<String> values) {
            addCriterion("FINISHRATEONE not in", values, "finishrateone");
            return (Criteria) this;
        }

        public Criteria andFinishrateoneBetween(String value1, String value2) {
            addCriterion("FINISHRATEONE between", value1, value2, "finishrateone");
            return (Criteria) this;
        }

        public Criteria andFinishrateoneNotBetween(String value1, String value2) {
            addCriterion("FINISHRATEONE not between", value1, value2, "finishrateone");
            return (Criteria) this;
        }

        public Criteria andCheckshipnumIsNull() {
            addCriterion("CHECKSHIPNUM is null");
            return (Criteria) this;
        }

        public Criteria andCheckshipnumIsNotNull() {
            addCriterion("CHECKSHIPNUM is not null");
            return (Criteria) this;
        }

        public Criteria andCheckshipnumEqualTo(Integer value) {
            addCriterion("CHECKSHIPNUM =", value, "checkshipnum");
            return (Criteria) this;
        }

        public Criteria andCheckshipnumNotEqualTo(Integer value) {
            addCriterion("CHECKSHIPNUM <>", value, "checkshipnum");
            return (Criteria) this;
        }

        public Criteria andCheckshipnumGreaterThan(Integer value) {
            addCriterion("CHECKSHIPNUM >", value, "checkshipnum");
            return (Criteria) this;
        }

        public Criteria andCheckshipnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("CHECKSHIPNUM >=", value, "checkshipnum");
            return (Criteria) this;
        }

        public Criteria andCheckshipnumLessThan(Integer value) {
            addCriterion("CHECKSHIPNUM <", value, "checkshipnum");
            return (Criteria) this;
        }

        public Criteria andCheckshipnumLessThanOrEqualTo(Integer value) {
            addCriterion("CHECKSHIPNUM <=", value, "checkshipnum");
            return (Criteria) this;
        }

        public Criteria andCheckshipnumIn(List<Integer> values) {
            addCriterion("CHECKSHIPNUM in", values, "checkshipnum");
            return (Criteria) this;
        }

        public Criteria andCheckshipnumNotIn(List<Integer> values) {
            addCriterion("CHECKSHIPNUM not in", values, "checkshipnum");
            return (Criteria) this;
        }

        public Criteria andCheckshipnumBetween(Integer value1, Integer value2) {
            addCriterion("CHECKSHIPNUM between", value1, value2, "checkshipnum");
            return (Criteria) this;
        }

        public Criteria andCheckshipnumNotBetween(Integer value1, Integer value2) {
            addCriterion("CHECKSHIPNUM not between", value1, value2, "checkshipnum");
            return (Criteria) this;
        }

        public Criteria andIdLikeInsensitive(String value) {
            addCriterion("upper(ID) like", value.toUpperCase(), "id");
            return (Criteria) this;
        }

        public Criteria andOrgnameLikeInsensitive(String value) {
            addCriterion("upper(ORGNAME) like", value.toUpperCase(), "orgname");
            return (Criteria) this;
        }

        public Criteria andNaturetypeLikeInsensitive(String value) {
            addCriterion("upper(NATURETYPE) like", value.toUpperCase(), "naturetype");
            return (Criteria) this;
        }

        public Criteria andParttypeLikeInsensitive(String value) {
            addCriterion("upper(PARTTYPE) like", value.toUpperCase(), "parttype");
            return (Criteria) this;
        }

        public Criteria andFuntypeLikeInsensitive(String value) {
            addCriterion("upper(FUNTYPE) like", value.toUpperCase(), "funtype");
            return (Criteria) this;
        }

        public Criteria andFinasourceLikeInsensitive(String value) {
            addCriterion("upper(FINASOURCE) like", value.toUpperCase(), "finasource");
            return (Criteria) this;
        }

        public Criteria andProvcodeLikeInsensitive(String value) {
            addCriterion("upper(PROVCODE) like", value.toUpperCase(), "provcode");
            return (Criteria) this;
        }

        public Criteria andRegdateLikeInsensitive(String value) {
            addCriterion("upper(REGDATE) like", value.toUpperCase(), "regdate");
            return (Criteria) this;
        }

        public Criteria andYearLikeInsensitive(String value) {
            addCriterion("upper(YEAR) like", value.toUpperCase(), "year");
            return (Criteria) this;
        }

        public Criteria andPersonnumLikeInsensitive(String value) {
            addCriterion("upper(PERSONNUM) like", value.toUpperCase(), "personnum");
            return (Criteria) this;
        }

        public Criteria andMajortypeLikeInsensitive(String value) {
            addCriterion("upper(MAJORTYPE) like", value.toUpperCase(), "majortype");
            return (Criteria) this;
        }

        public Criteria andProvnameLikeInsensitive(String value) {
            addCriterion("upper(PROVNAME) like", value.toUpperCase(), "provname");
            return (Criteria) this;
        }

        public Criteria andFinishrateoneLikeInsensitive(String value) {
            addCriterion("upper(FINISHRATEONE) like", value.toUpperCase(), "finishrateone");
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