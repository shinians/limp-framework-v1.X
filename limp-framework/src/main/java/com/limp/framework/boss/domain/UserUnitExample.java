package com.limp.framework.boss.domain;

import com.limp.framework.core.bean.Pager;

import java.util.ArrayList;
import java.util.List;

public class UserUnitExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Pager page;

    public UserUnitExample() {
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
            addCriterion("SU_ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("SU_ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("SU_ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("SU_ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("SU_ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("SU_ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("SU_ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("SU_ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("SU_ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("SU_ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("SU_ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("SU_ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("SU_ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("SU_ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("SU_NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("SU_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("SU_NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("SU_NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("SU_NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("SU_NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("SU_NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("SU_NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("SU_NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("SU_NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("SU_NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("SU_NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("SU_NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("SU_NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andKeycodeIsNull() {
            addCriterion("SU_KEYCODE is null");
            return (Criteria) this;
        }

        public Criteria andKeycodeIsNotNull() {
            addCriterion("SU_KEYCODE is not null");
            return (Criteria) this;
        }

        public Criteria andKeycodeEqualTo(String value) {
            addCriterion("SU_KEYCODE =", value, "keycode");
            return (Criteria) this;
        }

        public Criteria andKeycodeNotEqualTo(String value) {
            addCriterion("SU_KEYCODE <>", value, "keycode");
            return (Criteria) this;
        }

        public Criteria andKeycodeGreaterThan(String value) {
            addCriterion("SU_KEYCODE >", value, "keycode");
            return (Criteria) this;
        }

        public Criteria andKeycodeGreaterThanOrEqualTo(String value) {
            addCriterion("SU_KEYCODE >=", value, "keycode");
            return (Criteria) this;
        }

        public Criteria andKeycodeLessThan(String value) {
            addCriterion("SU_KEYCODE <", value, "keycode");
            return (Criteria) this;
        }

        public Criteria andKeycodeLessThanOrEqualTo(String value) {
            addCriterion("SU_KEYCODE <=", value, "keycode");
            return (Criteria) this;
        }

        public Criteria andKeycodeLike(String value) {
            addCriterion("SU_KEYCODE like", value, "keycode");
            return (Criteria) this;
        }

        public Criteria andKeycodeNotLike(String value) {
            addCriterion("SU_KEYCODE not like", value, "keycode");
            return (Criteria) this;
        }

        public Criteria andKeycodeIn(List<String> values) {
            addCriterion("SU_KEYCODE in", values, "keycode");
            return (Criteria) this;
        }

        public Criteria andKeycodeNotIn(List<String> values) {
            addCriterion("SU_KEYCODE not in", values, "keycode");
            return (Criteria) this;
        }

        public Criteria andKeycodeBetween(String value1, String value2) {
            addCriterion("SU_KEYCODE between", value1, value2, "keycode");
            return (Criteria) this;
        }

        public Criteria andKeycodeNotBetween(String value1, String value2) {
            addCriterion("SU_KEYCODE not between", value1, value2, "keycode");
            return (Criteria) this;
        }

        public Criteria andAreacodeIsNull() {
            addCriterion("SU_AREACODE is null");
            return (Criteria) this;
        }

        public Criteria andAreacodeIsNotNull() {
            addCriterion("SU_AREACODE is not null");
            return (Criteria) this;
        }

        public Criteria andAreacodeEqualTo(String value) {
            addCriterion("SU_AREACODE =", value, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeNotEqualTo(String value) {
            addCriterion("SU_AREACODE <>", value, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeGreaterThan(String value) {
            addCriterion("SU_AREACODE >", value, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeGreaterThanOrEqualTo(String value) {
            addCriterion("SU_AREACODE >=", value, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeLessThan(String value) {
            addCriterion("SU_AREACODE <", value, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeLessThanOrEqualTo(String value) {
            addCriterion("SU_AREACODE <=", value, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeLike(String value) {
            addCriterion("SU_AREACODE like", value, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeNotLike(String value) {
            addCriterion("SU_AREACODE not like", value, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeIn(List<String> values) {
            addCriterion("SU_AREACODE in", values, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeNotIn(List<String> values) {
            addCriterion("SU_AREACODE not in", values, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeBetween(String value1, String value2) {
            addCriterion("SU_AREACODE between", value1, value2, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeNotBetween(String value1, String value2) {
            addCriterion("SU_AREACODE not between", value1, value2, "areacode");
            return (Criteria) this;
        }

        public Criteria andFatheridIsNull() {
            addCriterion("SU_FATHERID is null");
            return (Criteria) this;
        }

        public Criteria andFatheridIsNotNull() {
            addCriterion("SU_FATHERID is not null");
            return (Criteria) this;
        }

        public Criteria andFatheridEqualTo(String value) {
            addCriterion("SU_FATHERID =", value, "fatherid");
            return (Criteria) this;
        }

        public Criteria andFatheridNotEqualTo(String value) {
            addCriterion("SU_FATHERID <>", value, "fatherid");
            return (Criteria) this;
        }

        public Criteria andFatheridGreaterThan(String value) {
            addCriterion("SU_FATHERID >", value, "fatherid");
            return (Criteria) this;
        }

        public Criteria andFatheridGreaterThanOrEqualTo(String value) {
            addCriterion("SU_FATHERID >=", value, "fatherid");
            return (Criteria) this;
        }

        public Criteria andFatheridLessThan(String value) {
            addCriterion("SU_FATHERID <", value, "fatherid");
            return (Criteria) this;
        }

        public Criteria andFatheridLessThanOrEqualTo(String value) {
            addCriterion("SU_FATHERID <=", value, "fatherid");
            return (Criteria) this;
        }

        public Criteria andFatheridLike(String value) {
            addCriterion("SU_FATHERID like", value, "fatherid");
            return (Criteria) this;
        }

        public Criteria andFatheridNotLike(String value) {
            addCriterion("SU_FATHERID not like", value, "fatherid");
            return (Criteria) this;
        }

        public Criteria andFatheridIn(List<String> values) {
            addCriterion("SU_FATHERID in", values, "fatherid");
            return (Criteria) this;
        }

        public Criteria andFatheridNotIn(List<String> values) {
            addCriterion("SU_FATHERID not in", values, "fatherid");
            return (Criteria) this;
        }

        public Criteria andFatheridBetween(String value1, String value2) {
            addCriterion("SU_FATHERID between", value1, value2, "fatherid");
            return (Criteria) this;
        }

        public Criteria andFatheridNotBetween(String value1, String value2) {
            addCriterion("SU_FATHERID not between", value1, value2, "fatherid");
            return (Criteria) this;
        }

        public Criteria andFatherareaIsNull() {
            addCriterion("SU_FATHERAREA is null");
            return (Criteria) this;
        }

        public Criteria andFatherareaIsNotNull() {
            addCriterion("SU_FATHERAREA is not null");
            return (Criteria) this;
        }

        public Criteria andFatherareaEqualTo(String value) {
            addCriterion("SU_FATHERAREA =", value, "fatherarea");
            return (Criteria) this;
        }

        public Criteria andFatherareaNotEqualTo(String value) {
            addCriterion("SU_FATHERAREA <>", value, "fatherarea");
            return (Criteria) this;
        }

        public Criteria andFatherareaGreaterThan(String value) {
            addCriterion("SU_FATHERAREA >", value, "fatherarea");
            return (Criteria) this;
        }

        public Criteria andFatherareaGreaterThanOrEqualTo(String value) {
            addCriterion("SU_FATHERAREA >=", value, "fatherarea");
            return (Criteria) this;
        }

        public Criteria andFatherareaLessThan(String value) {
            addCriterion("SU_FATHERAREA <", value, "fatherarea");
            return (Criteria) this;
        }

        public Criteria andFatherareaLessThanOrEqualTo(String value) {
            addCriterion("SU_FATHERAREA <=", value, "fatherarea");
            return (Criteria) this;
        }

        public Criteria andFatherareaLike(String value) {
            addCriterion("SU_FATHERAREA like", value, "fatherarea");
            return (Criteria) this;
        }

        public Criteria andFatherareaNotLike(String value) {
            addCriterion("SU_FATHERAREA not like", value, "fatherarea");
            return (Criteria) this;
        }

        public Criteria andFatherareaIn(List<String> values) {
            addCriterion("SU_FATHERAREA in", values, "fatherarea");
            return (Criteria) this;
        }

        public Criteria andFatherareaNotIn(List<String> values) {
            addCriterion("SU_FATHERAREA not in", values, "fatherarea");
            return (Criteria) this;
        }

        public Criteria andFatherareaBetween(String value1, String value2) {
            addCriterion("SU_FATHERAREA between", value1, value2, "fatherarea");
            return (Criteria) this;
        }

        public Criteria andFatherareaNotBetween(String value1, String value2) {
            addCriterion("SU_FATHERAREA not between", value1, value2, "fatherarea");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("SU_STATE is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("SU_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Short value) {
            addCriterion("SU_STATE =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Short value) {
            addCriterion("SU_STATE <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Short value) {
            addCriterion("SU_STATE >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Short value) {
            addCriterion("SU_STATE >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Short value) {
            addCriterion("SU_STATE <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Short value) {
            addCriterion("SU_STATE <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Short> values) {
            addCriterion("SU_STATE in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Short> values) {
            addCriterion("SU_STATE not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Short value1, Short value2) {
            addCriterion("SU_STATE between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Short value1, Short value2) {
            addCriterion("SU_STATE not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andRc1IsNull() {
            addCriterion("SU_RC1 is null");
            return (Criteria) this;
        }

        public Criteria andRc1IsNotNull() {
            addCriterion("SU_RC1 is not null");
            return (Criteria) this;
        }

        public Criteria andRc1EqualTo(String value) {
            addCriterion("SU_RC1 =", value, "rc1");
            return (Criteria) this;
        }

        public Criteria andRc1NotEqualTo(String value) {
            addCriterion("SU_RC1 <>", value, "rc1");
            return (Criteria) this;
        }

        public Criteria andRc1GreaterThan(String value) {
            addCriterion("SU_RC1 >", value, "rc1");
            return (Criteria) this;
        }

        public Criteria andRc1GreaterThanOrEqualTo(String value) {
            addCriterion("SU_RC1 >=", value, "rc1");
            return (Criteria) this;
        }

        public Criteria andRc1LessThan(String value) {
            addCriterion("SU_RC1 <", value, "rc1");
            return (Criteria) this;
        }

        public Criteria andRc1LessThanOrEqualTo(String value) {
            addCriterion("SU_RC1 <=", value, "rc1");
            return (Criteria) this;
        }

        public Criteria andRc1Like(String value) {
            addCriterion("SU_RC1 like", value, "rc1");
            return (Criteria) this;
        }

        public Criteria andRc1NotLike(String value) {
            addCriterion("SU_RC1 not like", value, "rc1");
            return (Criteria) this;
        }

        public Criteria andRc1In(List<String> values) {
            addCriterion("SU_RC1 in", values, "rc1");
            return (Criteria) this;
        }

        public Criteria andRc1NotIn(List<String> values) {
            addCriterion("SU_RC1 not in", values, "rc1");
            return (Criteria) this;
        }

        public Criteria andRc1Between(String value1, String value2) {
            addCriterion("SU_RC1 between", value1, value2, "rc1");
            return (Criteria) this;
        }

        public Criteria andRc1NotBetween(String value1, String value2) {
            addCriterion("SU_RC1 not between", value1, value2, "rc1");
            return (Criteria) this;
        }

        public Criteria andRc2IsNull() {
            addCriterion("SU_RC2 is null");
            return (Criteria) this;
        }

        public Criteria andRc2IsNotNull() {
            addCriterion("SU_RC2 is not null");
            return (Criteria) this;
        }

        public Criteria andRc2EqualTo(String value) {
            addCriterion("SU_RC2 =", value, "rc2");
            return (Criteria) this;
        }

        public Criteria andRc2NotEqualTo(String value) {
            addCriterion("SU_RC2 <>", value, "rc2");
            return (Criteria) this;
        }

        public Criteria andRc2GreaterThan(String value) {
            addCriterion("SU_RC2 >", value, "rc2");
            return (Criteria) this;
        }

        public Criteria andRc2GreaterThanOrEqualTo(String value) {
            addCriterion("SU_RC2 >=", value, "rc2");
            return (Criteria) this;
        }

        public Criteria andRc2LessThan(String value) {
            addCriterion("SU_RC2 <", value, "rc2");
            return (Criteria) this;
        }

        public Criteria andRc2LessThanOrEqualTo(String value) {
            addCriterion("SU_RC2 <=", value, "rc2");
            return (Criteria) this;
        }

        public Criteria andRc2Like(String value) {
            addCriterion("SU_RC2 like", value, "rc2");
            return (Criteria) this;
        }

        public Criteria andRc2NotLike(String value) {
            addCriterion("SU_RC2 not like", value, "rc2");
            return (Criteria) this;
        }

        public Criteria andRc2In(List<String> values) {
            addCriterion("SU_RC2 in", values, "rc2");
            return (Criteria) this;
        }

        public Criteria andRc2NotIn(List<String> values) {
            addCriterion("SU_RC2 not in", values, "rc2");
            return (Criteria) this;
        }

        public Criteria andRc2Between(String value1, String value2) {
            addCriterion("SU_RC2 between", value1, value2, "rc2");
            return (Criteria) this;
        }

        public Criteria andRc2NotBetween(String value1, String value2) {
            addCriterion("SU_RC2 not between", value1, value2, "rc2");
            return (Criteria) this;
        }

        public Criteria andRc3IsNull() {
            addCriterion("SU_RC3 is null");
            return (Criteria) this;
        }

        public Criteria andRc3IsNotNull() {
            addCriterion("SU_RC3 is not null");
            return (Criteria) this;
        }

        public Criteria andRc3EqualTo(Long value) {
            addCriterion("SU_RC3 =", value, "rc3");
            return (Criteria) this;
        }

        public Criteria andRc3NotEqualTo(Long value) {
            addCriterion("SU_RC3 <>", value, "rc3");
            return (Criteria) this;
        }

        public Criteria andRc3GreaterThan(Long value) {
            addCriterion("SU_RC3 >", value, "rc3");
            return (Criteria) this;
        }

        public Criteria andRc3GreaterThanOrEqualTo(Long value) {
            addCriterion("SU_RC3 >=", value, "rc3");
            return (Criteria) this;
        }

        public Criteria andRc3LessThan(Long value) {
            addCriterion("SU_RC3 <", value, "rc3");
            return (Criteria) this;
        }

        public Criteria andRc3LessThanOrEqualTo(Long value) {
            addCriterion("SU_RC3 <=", value, "rc3");
            return (Criteria) this;
        }

        public Criteria andRc3In(List<Long> values) {
            addCriterion("SU_RC3 in", values, "rc3");
            return (Criteria) this;
        }

        public Criteria andRc3NotIn(List<Long> values) {
            addCriterion("SU_RC3 not in", values, "rc3");
            return (Criteria) this;
        }

        public Criteria andRc3Between(Long value1, Long value2) {
            addCriterion("SU_RC3 between", value1, value2, "rc3");
            return (Criteria) this;
        }

        public Criteria andRc3NotBetween(Long value1, Long value2) {
            addCriterion("SU_RC3 not between", value1, value2, "rc3");
            return (Criteria) this;
        }

        public Criteria andRc4IsNull() {
            addCriterion("SU_RC4 is null");
            return (Criteria) this;
        }

        public Criteria andRc4IsNotNull() {
            addCriterion("SU_RC4 is not null");
            return (Criteria) this;
        }

        public Criteria andRc4EqualTo(Long value) {
            addCriterion("SU_RC4 =", value, "rc4");
            return (Criteria) this;
        }

        public Criteria andRc4NotEqualTo(Long value) {
            addCriterion("SU_RC4 <>", value, "rc4");
            return (Criteria) this;
        }

        public Criteria andRc4GreaterThan(Long value) {
            addCriterion("SU_RC4 >", value, "rc4");
            return (Criteria) this;
        }

        public Criteria andRc4GreaterThanOrEqualTo(Long value) {
            addCriterion("SU_RC4 >=", value, "rc4");
            return (Criteria) this;
        }

        public Criteria andRc4LessThan(Long value) {
            addCriterion("SU_RC4 <", value, "rc4");
            return (Criteria) this;
        }

        public Criteria andRc4LessThanOrEqualTo(Long value) {
            addCriterion("SU_RC4 <=", value, "rc4");
            return (Criteria) this;
        }

        public Criteria andRc4In(List<Long> values) {
            addCriterion("SU_RC4 in", values, "rc4");
            return (Criteria) this;
        }

        public Criteria andRc4NotIn(List<Long> values) {
            addCriterion("SU_RC4 not in", values, "rc4");
            return (Criteria) this;
        }

        public Criteria andRc4Between(Long value1, Long value2) {
            addCriterion("SU_RC4 between", value1, value2, "rc4");
            return (Criteria) this;
        }

        public Criteria andRc4NotBetween(Long value1, Long value2) {
            addCriterion("SU_RC4 not between", value1, value2, "rc4");
            return (Criteria) this;
        }

        public Criteria andRc5IsNull() {
            addCriterion("SU_RC5 is null");
            return (Criteria) this;
        }

        public Criteria andRc5IsNotNull() {
            addCriterion("SU_RC5 is not null");
            return (Criteria) this;
        }

        public Criteria andRc5EqualTo(Long value) {
            addCriterion("SU_RC5 =", value, "rc5");
            return (Criteria) this;
        }

        public Criteria andRc5NotEqualTo(Long value) {
            addCriterion("SU_RC5 <>", value, "rc5");
            return (Criteria) this;
        }

        public Criteria andRc5GreaterThan(Long value) {
            addCriterion("SU_RC5 >", value, "rc5");
            return (Criteria) this;
        }

        public Criteria andRc5GreaterThanOrEqualTo(Long value) {
            addCriterion("SU_RC5 >=", value, "rc5");
            return (Criteria) this;
        }

        public Criteria andRc5LessThan(Long value) {
            addCriterion("SU_RC5 <", value, "rc5");
            return (Criteria) this;
        }

        public Criteria andRc5LessThanOrEqualTo(Long value) {
            addCriterion("SU_RC5 <=", value, "rc5");
            return (Criteria) this;
        }

        public Criteria andRc5In(List<Long> values) {
            addCriterion("SU_RC5 in", values, "rc5");
            return (Criteria) this;
        }

        public Criteria andRc5NotIn(List<Long> values) {
            addCriterion("SU_RC5 not in", values, "rc5");
            return (Criteria) this;
        }

        public Criteria andRc5Between(Long value1, Long value2) {
            addCriterion("SU_RC5 between", value1, value2, "rc5");
            return (Criteria) this;
        }

        public Criteria andRc5NotBetween(Long value1, Long value2) {
            addCriterion("SU_RC5 not between", value1, value2, "rc5");
            return (Criteria) this;
        }

        public Criteria andRc6IsNull() {
            addCriterion("SU_RC6 is null");
            return (Criteria) this;
        }

        public Criteria andRc6IsNotNull() {
            addCriterion("SU_RC6 is not null");
            return (Criteria) this;
        }

        public Criteria andRc6EqualTo(String value) {
            addCriterion("SU_RC6 =", value, "rc6");
            return (Criteria) this;
        }

        public Criteria andRc6NotEqualTo(String value) {
            addCriterion("SU_RC6 <>", value, "rc6");
            return (Criteria) this;
        }

        public Criteria andRc6GreaterThan(String value) {
            addCriterion("SU_RC6 >", value, "rc6");
            return (Criteria) this;
        }

        public Criteria andRc6GreaterThanOrEqualTo(String value) {
            addCriterion("SU_RC6 >=", value, "rc6");
            return (Criteria) this;
        }

        public Criteria andRc6LessThan(String value) {
            addCriterion("SU_RC6 <", value, "rc6");
            return (Criteria) this;
        }

        public Criteria andRc6LessThanOrEqualTo(String value) {
            addCriterion("SU_RC6 <=", value, "rc6");
            return (Criteria) this;
        }

        public Criteria andRc6Like(String value) {
            addCriterion("SU_RC6 like", value, "rc6");
            return (Criteria) this;
        }

        public Criteria andRc6NotLike(String value) {
            addCriterion("SU_RC6 not like", value, "rc6");
            return (Criteria) this;
        }

        public Criteria andRc6In(List<String> values) {
            addCriterion("SU_RC6 in", values, "rc6");
            return (Criteria) this;
        }

        public Criteria andRc6NotIn(List<String> values) {
            addCriterion("SU_RC6 not in", values, "rc6");
            return (Criteria) this;
        }

        public Criteria andRc6Between(String value1, String value2) {
            addCriterion("SU_RC6 between", value1, value2, "rc6");
            return (Criteria) this;
        }

        public Criteria andRc6NotBetween(String value1, String value2) {
            addCriterion("SU_RC6 not between", value1, value2, "rc6");
            return (Criteria) this;
        }

        public Criteria andIdLikeInsensitive(String value) {
            addCriterion("upper(SU_ID) like", value.toUpperCase(), "id");
            return (Criteria) this;
        }

        public Criteria andNameLikeInsensitive(String value) {
            addCriterion("upper(SU_NAME) like", value.toUpperCase(), "name");
            return (Criteria) this;
        }

        public Criteria andKeycodeLikeInsensitive(String value) {
            addCriterion("upper(SU_KEYCODE) like", value.toUpperCase(), "keycode");
            return (Criteria) this;
        }

        public Criteria andAreacodeLikeInsensitive(String value) {
            addCriterion("upper(SU_AREACODE) like", value.toUpperCase(), "areacode");
            return (Criteria) this;
        }

        public Criteria andFatheridLikeInsensitive(String value) {
            addCriterion("upper(SU_FATHERID) like", value.toUpperCase(), "fatherid");
            return (Criteria) this;
        }

        public Criteria andFatherareaLikeInsensitive(String value) {
            addCriterion("upper(SU_FATHERAREA) like", value.toUpperCase(), "fatherarea");
            return (Criteria) this;
        }

        public Criteria andRc1LikeInsensitive(String value) {
            addCriterion("upper(SU_RC1) like", value.toUpperCase(), "rc1");
            return (Criteria) this;
        }

        public Criteria andRc2LikeInsensitive(String value) {
            addCriterion("upper(SU_RC2) like", value.toUpperCase(), "rc2");
            return (Criteria) this;
        }

        public Criteria andRc6LikeInsensitive(String value) {
            addCriterion("upper(SU_RC6) like", value.toUpperCase(), "rc6");
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