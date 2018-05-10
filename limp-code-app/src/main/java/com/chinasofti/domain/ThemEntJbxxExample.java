package com.chinasofti.domain;

import com.limp.framework.core.bean.Pager;

import java.util.ArrayList;
import java.util.List;

public class ThemEntJbxxExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Pager page;

    public ThemEntJbxxExample() {
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

        public Criteria andPersontypeIsNull() {
            addCriterion("PERSONTYPE is null");
            return (Criteria) this;
        }

        public Criteria andPersontypeIsNotNull() {
            addCriterion("PERSONTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPersontypeEqualTo(String value) {
            addCriterion("PERSONTYPE =", value, "persontype");
            return (Criteria) this;
        }

        public Criteria andPersontypeNotEqualTo(String value) {
            addCriterion("PERSONTYPE <>", value, "persontype");
            return (Criteria) this;
        }

        public Criteria andPersontypeGreaterThan(String value) {
            addCriterion("PERSONTYPE >", value, "persontype");
            return (Criteria) this;
        }

        public Criteria andPersontypeGreaterThanOrEqualTo(String value) {
            addCriterion("PERSONTYPE >=", value, "persontype");
            return (Criteria) this;
        }

        public Criteria andPersontypeLessThan(String value) {
            addCriterion("PERSONTYPE <", value, "persontype");
            return (Criteria) this;
        }

        public Criteria andPersontypeLessThanOrEqualTo(String value) {
            addCriterion("PERSONTYPE <=", value, "persontype");
            return (Criteria) this;
        }

        public Criteria andPersontypeLike(String value) {
            addCriterion("PERSONTYPE like", value, "persontype");
            return (Criteria) this;
        }

        public Criteria andPersontypeNotLike(String value) {
            addCriterion("PERSONTYPE not like", value, "persontype");
            return (Criteria) this;
        }

        public Criteria andPersontypeIn(List<String> values) {
            addCriterion("PERSONTYPE in", values, "persontype");
            return (Criteria) this;
        }

        public Criteria andPersontypeNotIn(List<String> values) {
            addCriterion("PERSONTYPE not in", values, "persontype");
            return (Criteria) this;
        }

        public Criteria andPersontypeBetween(String value1, String value2) {
            addCriterion("PERSONTYPE between", value1, value2, "persontype");
            return (Criteria) this;
        }

        public Criteria andPersontypeNotBetween(String value1, String value2) {
            addCriterion("PERSONTYPE not between", value1, value2, "persontype");
            return (Criteria) this;
        }

        public Criteria andDrawnumIsNull() {
            addCriterion("DRAWNUM is null");
            return (Criteria) this;
        }

        public Criteria andDrawnumIsNotNull() {
            addCriterion("DRAWNUM is not null");
            return (Criteria) this;
        }

        public Criteria andDrawnumEqualTo(String value) {
            addCriterion("DRAWNUM =", value, "drawnum");
            return (Criteria) this;
        }

        public Criteria andDrawnumNotEqualTo(String value) {
            addCriterion("DRAWNUM <>", value, "drawnum");
            return (Criteria) this;
        }

        public Criteria andDrawnumGreaterThan(String value) {
            addCriterion("DRAWNUM >", value, "drawnum");
            return (Criteria) this;
        }

        public Criteria andDrawnumGreaterThanOrEqualTo(String value) {
            addCriterion("DRAWNUM >=", value, "drawnum");
            return (Criteria) this;
        }

        public Criteria andDrawnumLessThan(String value) {
            addCriterion("DRAWNUM <", value, "drawnum");
            return (Criteria) this;
        }

        public Criteria andDrawnumLessThanOrEqualTo(String value) {
            addCriterion("DRAWNUM <=", value, "drawnum");
            return (Criteria) this;
        }

        public Criteria andDrawnumLike(String value) {
            addCriterion("DRAWNUM like", value, "drawnum");
            return (Criteria) this;
        }

        public Criteria andDrawnumNotLike(String value) {
            addCriterion("DRAWNUM not like", value, "drawnum");
            return (Criteria) this;
        }

        public Criteria andDrawnumIn(List<String> values) {
            addCriterion("DRAWNUM in", values, "drawnum");
            return (Criteria) this;
        }

        public Criteria andDrawnumNotIn(List<String> values) {
            addCriterion("DRAWNUM not in", values, "drawnum");
            return (Criteria) this;
        }

        public Criteria andDrawnumBetween(String value1, String value2) {
            addCriterion("DRAWNUM between", value1, value2, "drawnum");
            return (Criteria) this;
        }

        public Criteria andDrawnumNotBetween(String value1, String value2) {
            addCriterion("DRAWNUM not between", value1, value2, "drawnum");
            return (Criteria) this;
        }

        public Criteria andDrawrateIsNull() {
            addCriterion("DRAWRATE is null");
            return (Criteria) this;
        }

        public Criteria andDrawrateIsNotNull() {
            addCriterion("DRAWRATE is not null");
            return (Criteria) this;
        }

        public Criteria andDrawrateEqualTo(String value) {
            addCriterion("DRAWRATE =", value, "drawrate");
            return (Criteria) this;
        }

        public Criteria andDrawrateNotEqualTo(String value) {
            addCriterion("DRAWRATE <>", value, "drawrate");
            return (Criteria) this;
        }

        public Criteria andDrawrateGreaterThan(String value) {
            addCriterion("DRAWRATE >", value, "drawrate");
            return (Criteria) this;
        }

        public Criteria andDrawrateGreaterThanOrEqualTo(String value) {
            addCriterion("DRAWRATE >=", value, "drawrate");
            return (Criteria) this;
        }

        public Criteria andDrawrateLessThan(String value) {
            addCriterion("DRAWRATE <", value, "drawrate");
            return (Criteria) this;
        }

        public Criteria andDrawrateLessThanOrEqualTo(String value) {
            addCriterion("DRAWRATE <=", value, "drawrate");
            return (Criteria) this;
        }

        public Criteria andDrawrateLike(String value) {
            addCriterion("DRAWRATE like", value, "drawrate");
            return (Criteria) this;
        }

        public Criteria andDrawrateNotLike(String value) {
            addCriterion("DRAWRATE not like", value, "drawrate");
            return (Criteria) this;
        }

        public Criteria andDrawrateIn(List<String> values) {
            addCriterion("DRAWRATE in", values, "drawrate");
            return (Criteria) this;
        }

        public Criteria andDrawrateNotIn(List<String> values) {
            addCriterion("DRAWRATE not in", values, "drawrate");
            return (Criteria) this;
        }

        public Criteria andDrawrateBetween(String value1, String value2) {
            addCriterion("DRAWRATE between", value1, value2, "drawrate");
            return (Criteria) this;
        }

        public Criteria andDrawrateNotBetween(String value1, String value2) {
            addCriterion("DRAWRATE not between", value1, value2, "drawrate");
            return (Criteria) this;
        }

        public Criteria andReparenumIsNull() {
            addCriterion("REPARENUM is null");
            return (Criteria) this;
        }

        public Criteria andReparenumIsNotNull() {
            addCriterion("REPARENUM is not null");
            return (Criteria) this;
        }

        public Criteria andReparenumEqualTo(String value) {
            addCriterion("REPARENUM =", value, "reparenum");
            return (Criteria) this;
        }

        public Criteria andReparenumNotEqualTo(String value) {
            addCriterion("REPARENUM <>", value, "reparenum");
            return (Criteria) this;
        }

        public Criteria andReparenumGreaterThan(String value) {
            addCriterion("REPARENUM >", value, "reparenum");
            return (Criteria) this;
        }

        public Criteria andReparenumGreaterThanOrEqualTo(String value) {
            addCriterion("REPARENUM >=", value, "reparenum");
            return (Criteria) this;
        }

        public Criteria andReparenumLessThan(String value) {
            addCriterion("REPARENUM <", value, "reparenum");
            return (Criteria) this;
        }

        public Criteria andReparenumLessThanOrEqualTo(String value) {
            addCriterion("REPARENUM <=", value, "reparenum");
            return (Criteria) this;
        }

        public Criteria andReparenumLike(String value) {
            addCriterion("REPARENUM like", value, "reparenum");
            return (Criteria) this;
        }

        public Criteria andReparenumNotLike(String value) {
            addCriterion("REPARENUM not like", value, "reparenum");
            return (Criteria) this;
        }

        public Criteria andReparenumIn(List<String> values) {
            addCriterion("REPARENUM in", values, "reparenum");
            return (Criteria) this;
        }

        public Criteria andReparenumNotIn(List<String> values) {
            addCriterion("REPARENUM not in", values, "reparenum");
            return (Criteria) this;
        }

        public Criteria andReparenumBetween(String value1, String value2) {
            addCriterion("REPARENUM between", value1, value2, "reparenum");
            return (Criteria) this;
        }

        public Criteria andReparenumNotBetween(String value1, String value2) {
            addCriterion("REPARENUM not between", value1, value2, "reparenum");
            return (Criteria) this;
        }

        public Criteria andRebunumIsNull() {
            addCriterion("REBUNUM is null");
            return (Criteria) this;
        }

        public Criteria andRebunumIsNotNull() {
            addCriterion("REBUNUM is not null");
            return (Criteria) this;
        }

        public Criteria andRebunumEqualTo(String value) {
            addCriterion("REBUNUM =", value, "rebunum");
            return (Criteria) this;
        }

        public Criteria andRebunumNotEqualTo(String value) {
            addCriterion("REBUNUM <>", value, "rebunum");
            return (Criteria) this;
        }

        public Criteria andRebunumGreaterThan(String value) {
            addCriterion("REBUNUM >", value, "rebunum");
            return (Criteria) this;
        }

        public Criteria andRebunumGreaterThanOrEqualTo(String value) {
            addCriterion("REBUNUM >=", value, "rebunum");
            return (Criteria) this;
        }

        public Criteria andRebunumLessThan(String value) {
            addCriterion("REBUNUM <", value, "rebunum");
            return (Criteria) this;
        }

        public Criteria andRebunumLessThanOrEqualTo(String value) {
            addCriterion("REBUNUM <=", value, "rebunum");
            return (Criteria) this;
        }

        public Criteria andRebunumLike(String value) {
            addCriterion("REBUNUM like", value, "rebunum");
            return (Criteria) this;
        }

        public Criteria andRebunumNotLike(String value) {
            addCriterion("REBUNUM not like", value, "rebunum");
            return (Criteria) this;
        }

        public Criteria andRebunumIn(List<String> values) {
            addCriterion("REBUNUM in", values, "rebunum");
            return (Criteria) this;
        }

        public Criteria andRebunumNotIn(List<String> values) {
            addCriterion("REBUNUM not in", values, "rebunum");
            return (Criteria) this;
        }

        public Criteria andRebunumBetween(String value1, String value2) {
            addCriterion("REBUNUM between", value1, value2, "rebunum");
            return (Criteria) this;
        }

        public Criteria andRebunumNotBetween(String value1, String value2) {
            addCriterion("REBUNUM not between", value1, value2, "rebunum");
            return (Criteria) this;
        }

        public Criteria andPrvnameIsNull() {
            addCriterion("PRVNAME is null");
            return (Criteria) this;
        }

        public Criteria andPrvnameIsNotNull() {
            addCriterion("PRVNAME is not null");
            return (Criteria) this;
        }

        public Criteria andPrvnameEqualTo(String value) {
            addCriterion("PRVNAME =", value, "prvname");
            return (Criteria) this;
        }

        public Criteria andPrvnameNotEqualTo(String value) {
            addCriterion("PRVNAME <>", value, "prvname");
            return (Criteria) this;
        }

        public Criteria andPrvnameGreaterThan(String value) {
            addCriterion("PRVNAME >", value, "prvname");
            return (Criteria) this;
        }

        public Criteria andPrvnameGreaterThanOrEqualTo(String value) {
            addCriterion("PRVNAME >=", value, "prvname");
            return (Criteria) this;
        }

        public Criteria andPrvnameLessThan(String value) {
            addCriterion("PRVNAME <", value, "prvname");
            return (Criteria) this;
        }

        public Criteria andPrvnameLessThanOrEqualTo(String value) {
            addCriterion("PRVNAME <=", value, "prvname");
            return (Criteria) this;
        }

        public Criteria andPrvnameLike(String value) {
            addCriterion("PRVNAME like", value, "prvname");
            return (Criteria) this;
        }

        public Criteria andPrvnameNotLike(String value) {
            addCriterion("PRVNAME not like", value, "prvname");
            return (Criteria) this;
        }

        public Criteria andPrvnameIn(List<String> values) {
            addCriterion("PRVNAME in", values, "prvname");
            return (Criteria) this;
        }

        public Criteria andPrvnameNotIn(List<String> values) {
            addCriterion("PRVNAME not in", values, "prvname");
            return (Criteria) this;
        }

        public Criteria andPrvnameBetween(String value1, String value2) {
            addCriterion("PRVNAME between", value1, value2, "prvname");
            return (Criteria) this;
        }

        public Criteria andPrvnameNotBetween(String value1, String value2) {
            addCriterion("PRVNAME not between", value1, value2, "prvname");
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

        public Criteria andPersonnumLikeInsensitive(String value) {
            addCriterion("upper(PERSONNUM) like", value.toUpperCase(), "personnum");
            return (Criteria) this;
        }

        public Criteria andPersontypeLikeInsensitive(String value) {
            addCriterion("upper(PERSONTYPE) like", value.toUpperCase(), "persontype");
            return (Criteria) this;
        }

        public Criteria andDrawnumLikeInsensitive(String value) {
            addCriterion("upper(DRAWNUM) like", value.toUpperCase(), "drawnum");
            return (Criteria) this;
        }

        public Criteria andDrawrateLikeInsensitive(String value) {
            addCriterion("upper(DRAWRATE) like", value.toUpperCase(), "drawrate");
            return (Criteria) this;
        }

        public Criteria andReparenumLikeInsensitive(String value) {
            addCriterion("upper(REPARENUM) like", value.toUpperCase(), "reparenum");
            return (Criteria) this;
        }

        public Criteria andRebunumLikeInsensitive(String value) {
            addCriterion("upper(REBUNUM) like", value.toUpperCase(), "rebunum");
            return (Criteria) this;
        }

        public Criteria andPrvnameLikeInsensitive(String value) {
            addCriterion("upper(PRVNAME) like", value.toUpperCase(), "prvname");
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