package com.chinasofti.domain;

import com.limp.framework.core.bean.Pager;

import java.util.ArrayList;
import java.util.List;

public class TrainExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Pager page;

    public TrainExample() {
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
            addCriterion("CT_ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("CT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("CT_ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("CT_ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("CT_ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("CT_ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("CT_ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("CT_ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("CT_ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("CT_ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("CT_ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("CT_ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("CT_ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("CT_ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUidIsNull() {
            addCriterion("CT_UID is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("CT_UID is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(String value) {
            addCriterion("CT_UID =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(String value) {
            addCriterion("CT_UID <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(String value) {
            addCriterion("CT_UID >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(String value) {
            addCriterion("CT_UID >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(String value) {
            addCriterion("CT_UID <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(String value) {
            addCriterion("CT_UID <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLike(String value) {
            addCriterion("CT_UID like", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotLike(String value) {
            addCriterion("CT_UID not like", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<String> values) {
            addCriterion("CT_UID in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<String> values) {
            addCriterion("CT_UID not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(String value1, String value2) {
            addCriterion("CT_UID between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(String value1, String value2) {
            addCriterion("CT_UID not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andTrainnameIsNull() {
            addCriterion("CT_TRAINNAME is null");
            return (Criteria) this;
        }

        public Criteria andTrainnameIsNotNull() {
            addCriterion("CT_TRAINNAME is not null");
            return (Criteria) this;
        }

        public Criteria andTrainnameEqualTo(String value) {
            addCriterion("CT_TRAINNAME =", value, "trainname");
            return (Criteria) this;
        }

        public Criteria andTrainnameNotEqualTo(String value) {
            addCriterion("CT_TRAINNAME <>", value, "trainname");
            return (Criteria) this;
        }

        public Criteria andTrainnameGreaterThan(String value) {
            addCriterion("CT_TRAINNAME >", value, "trainname");
            return (Criteria) this;
        }

        public Criteria andTrainnameGreaterThanOrEqualTo(String value) {
            addCriterion("CT_TRAINNAME >=", value, "trainname");
            return (Criteria) this;
        }

        public Criteria andTrainnameLessThan(String value) {
            addCriterion("CT_TRAINNAME <", value, "trainname");
            return (Criteria) this;
        }

        public Criteria andTrainnameLessThanOrEqualTo(String value) {
            addCriterion("CT_TRAINNAME <=", value, "trainname");
            return (Criteria) this;
        }

        public Criteria andTrainnameLike(String value) {
            addCriterion("CT_TRAINNAME like", value, "trainname");
            return (Criteria) this;
        }

        public Criteria andTrainnameNotLike(String value) {
            addCriterion("CT_TRAINNAME not like", value, "trainname");
            return (Criteria) this;
        }

        public Criteria andTrainnameIn(List<String> values) {
            addCriterion("CT_TRAINNAME in", values, "trainname");
            return (Criteria) this;
        }

        public Criteria andTrainnameNotIn(List<String> values) {
            addCriterion("CT_TRAINNAME not in", values, "trainname");
            return (Criteria) this;
        }

        public Criteria andTrainnameBetween(String value1, String value2) {
            addCriterion("CT_TRAINNAME between", value1, value2, "trainname");
            return (Criteria) this;
        }

        public Criteria andTrainnameNotBetween(String value1, String value2) {
            addCriterion("CT_TRAINNAME not between", value1, value2, "trainname");
            return (Criteria) this;
        }

        public Criteria andTrainintroIsNull() {
            addCriterion("CT_TRAININTRO is null");
            return (Criteria) this;
        }

        public Criteria andTrainintroIsNotNull() {
            addCriterion("CT_TRAININTRO is not null");
            return (Criteria) this;
        }

        public Criteria andTrainintroEqualTo(String value) {
            addCriterion("CT_TRAININTRO =", value, "trainintro");
            return (Criteria) this;
        }

        public Criteria andTrainintroNotEqualTo(String value) {
            addCriterion("CT_TRAININTRO <>", value, "trainintro");
            return (Criteria) this;
        }

        public Criteria andTrainintroGreaterThan(String value) {
            addCriterion("CT_TRAININTRO >", value, "trainintro");
            return (Criteria) this;
        }

        public Criteria andTrainintroGreaterThanOrEqualTo(String value) {
            addCriterion("CT_TRAININTRO >=", value, "trainintro");
            return (Criteria) this;
        }

        public Criteria andTrainintroLessThan(String value) {
            addCriterion("CT_TRAININTRO <", value, "trainintro");
            return (Criteria) this;
        }

        public Criteria andTrainintroLessThanOrEqualTo(String value) {
            addCriterion("CT_TRAININTRO <=", value, "trainintro");
            return (Criteria) this;
        }

        public Criteria andTrainintroLike(String value) {
            addCriterion("CT_TRAININTRO like", value, "trainintro");
            return (Criteria) this;
        }

        public Criteria andTrainintroNotLike(String value) {
            addCriterion("CT_TRAININTRO not like", value, "trainintro");
            return (Criteria) this;
        }

        public Criteria andTrainintroIn(List<String> values) {
            addCriterion("CT_TRAININTRO in", values, "trainintro");
            return (Criteria) this;
        }

        public Criteria andTrainintroNotIn(List<String> values) {
            addCriterion("CT_TRAININTRO not in", values, "trainintro");
            return (Criteria) this;
        }

        public Criteria andTrainintroBetween(String value1, String value2) {
            addCriterion("CT_TRAININTRO between", value1, value2, "trainintro");
            return (Criteria) this;
        }

        public Criteria andTrainintroNotBetween(String value1, String value2) {
            addCriterion("CT_TRAININTRO not between", value1, value2, "trainintro");
            return (Criteria) this;
        }

        public Criteria andInitiateTimeIsNull() {
            addCriterion("CT_INITIATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andInitiateTimeIsNotNull() {
            addCriterion("CT_INITIATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andInitiateTimeEqualTo(String value) {
            addCriterion("CT_INITIATE_TIME =", value, "initiateTime");
            return (Criteria) this;
        }

        public Criteria andInitiateTimeNotEqualTo(String value) {
            addCriterion("CT_INITIATE_TIME <>", value, "initiateTime");
            return (Criteria) this;
        }

        public Criteria andInitiateTimeGreaterThan(String value) {
            addCriterion("CT_INITIATE_TIME >", value, "initiateTime");
            return (Criteria) this;
        }

        public Criteria andInitiateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("CT_INITIATE_TIME >=", value, "initiateTime");
            return (Criteria) this;
        }

        public Criteria andInitiateTimeLessThan(String value) {
            addCriterion("CT_INITIATE_TIME <", value, "initiateTime");
            return (Criteria) this;
        }

        public Criteria andInitiateTimeLessThanOrEqualTo(String value) {
            addCriterion("CT_INITIATE_TIME <=", value, "initiateTime");
            return (Criteria) this;
        }

        public Criteria andInitiateTimeLike(String value) {
            addCriterion("CT_INITIATE_TIME like", value, "initiateTime");
            return (Criteria) this;
        }

        public Criteria andInitiateTimeNotLike(String value) {
            addCriterion("CT_INITIATE_TIME not like", value, "initiateTime");
            return (Criteria) this;
        }

        public Criteria andInitiateTimeIn(List<String> values) {
            addCriterion("CT_INITIATE_TIME in", values, "initiateTime");
            return (Criteria) this;
        }

        public Criteria andInitiateTimeNotIn(List<String> values) {
            addCriterion("CT_INITIATE_TIME not in", values, "initiateTime");
            return (Criteria) this;
        }

        public Criteria andInitiateTimeBetween(String value1, String value2) {
            addCriterion("CT_INITIATE_TIME between", value1, value2, "initiateTime");
            return (Criteria) this;
        }

        public Criteria andInitiateTimeNotBetween(String value1, String value2) {
            addCriterion("CT_INITIATE_TIME not between", value1, value2, "initiateTime");
            return (Criteria) this;
        }

        public Criteria andInitiateUnitsIsNull() {
            addCriterion("CT_INITIATE_UNITS is null");
            return (Criteria) this;
        }

        public Criteria andInitiateUnitsIsNotNull() {
            addCriterion("CT_INITIATE_UNITS is not null");
            return (Criteria) this;
        }

        public Criteria andInitiateUnitsEqualTo(String value) {
            addCriterion("CT_INITIATE_UNITS =", value, "initiateUnits");
            return (Criteria) this;
        }

        public Criteria andInitiateUnitsNotEqualTo(String value) {
            addCriterion("CT_INITIATE_UNITS <>", value, "initiateUnits");
            return (Criteria) this;
        }

        public Criteria andInitiateUnitsGreaterThan(String value) {
            addCriterion("CT_INITIATE_UNITS >", value, "initiateUnits");
            return (Criteria) this;
        }

        public Criteria andInitiateUnitsGreaterThanOrEqualTo(String value) {
            addCriterion("CT_INITIATE_UNITS >=", value, "initiateUnits");
            return (Criteria) this;
        }

        public Criteria andInitiateUnitsLessThan(String value) {
            addCriterion("CT_INITIATE_UNITS <", value, "initiateUnits");
            return (Criteria) this;
        }

        public Criteria andInitiateUnitsLessThanOrEqualTo(String value) {
            addCriterion("CT_INITIATE_UNITS <=", value, "initiateUnits");
            return (Criteria) this;
        }

        public Criteria andInitiateUnitsLike(String value) {
            addCriterion("CT_INITIATE_UNITS like", value, "initiateUnits");
            return (Criteria) this;
        }

        public Criteria andInitiateUnitsNotLike(String value) {
            addCriterion("CT_INITIATE_UNITS not like", value, "initiateUnits");
            return (Criteria) this;
        }

        public Criteria andInitiateUnitsIn(List<String> values) {
            addCriterion("CT_INITIATE_UNITS in", values, "initiateUnits");
            return (Criteria) this;
        }

        public Criteria andInitiateUnitsNotIn(List<String> values) {
            addCriterion("CT_INITIATE_UNITS not in", values, "initiateUnits");
            return (Criteria) this;
        }

        public Criteria andInitiateUnitsBetween(String value1, String value2) {
            addCriterion("CT_INITIATE_UNITS between", value1, value2, "initiateUnits");
            return (Criteria) this;
        }

        public Criteria andInitiateUnitsNotBetween(String value1, String value2) {
            addCriterion("CT_INITIATE_UNITS not between", value1, value2, "initiateUnits");
            return (Criteria) this;
        }

        public Criteria andTrainplaceIsNull() {
            addCriterion("CT_TRAINPLACE is null");
            return (Criteria) this;
        }

        public Criteria andTrainplaceIsNotNull() {
            addCriterion("CT_TRAINPLACE is not null");
            return (Criteria) this;
        }

        public Criteria andTrainplaceEqualTo(String value) {
            addCriterion("CT_TRAINPLACE =", value, "trainplace");
            return (Criteria) this;
        }

        public Criteria andTrainplaceNotEqualTo(String value) {
            addCriterion("CT_TRAINPLACE <>", value, "trainplace");
            return (Criteria) this;
        }

        public Criteria andTrainplaceGreaterThan(String value) {
            addCriterion("CT_TRAINPLACE >", value, "trainplace");
            return (Criteria) this;
        }

        public Criteria andTrainplaceGreaterThanOrEqualTo(String value) {
            addCriterion("CT_TRAINPLACE >=", value, "trainplace");
            return (Criteria) this;
        }

        public Criteria andTrainplaceLessThan(String value) {
            addCriterion("CT_TRAINPLACE <", value, "trainplace");
            return (Criteria) this;
        }

        public Criteria andTrainplaceLessThanOrEqualTo(String value) {
            addCriterion("CT_TRAINPLACE <=", value, "trainplace");
            return (Criteria) this;
        }

        public Criteria andTrainplaceLike(String value) {
            addCriterion("CT_TRAINPLACE like", value, "trainplace");
            return (Criteria) this;
        }

        public Criteria andTrainplaceNotLike(String value) {
            addCriterion("CT_TRAINPLACE not like", value, "trainplace");
            return (Criteria) this;
        }

        public Criteria andTrainplaceIn(List<String> values) {
            addCriterion("CT_TRAINPLACE in", values, "trainplace");
            return (Criteria) this;
        }

        public Criteria andTrainplaceNotIn(List<String> values) {
            addCriterion("CT_TRAINPLACE not in", values, "trainplace");
            return (Criteria) this;
        }

        public Criteria andTrainplaceBetween(String value1, String value2) {
            addCriterion("CT_TRAINPLACE between", value1, value2, "trainplace");
            return (Criteria) this;
        }

        public Criteria andTrainplaceNotBetween(String value1, String value2) {
            addCriterion("CT_TRAINPLACE not between", value1, value2, "trainplace");
            return (Criteria) this;
        }

        public Criteria andBegintimeIsNull() {
            addCriterion("CT_BEGINTIME is null");
            return (Criteria) this;
        }

        public Criteria andBegintimeIsNotNull() {
            addCriterion("CT_BEGINTIME is not null");
            return (Criteria) this;
        }

        public Criteria andBegintimeEqualTo(String value) {
            addCriterion("CT_BEGINTIME =", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeNotEqualTo(String value) {
            addCriterion("CT_BEGINTIME <>", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeGreaterThan(String value) {
            addCriterion("CT_BEGINTIME >", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeGreaterThanOrEqualTo(String value) {
            addCriterion("CT_BEGINTIME >=", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeLessThan(String value) {
            addCriterion("CT_BEGINTIME <", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeLessThanOrEqualTo(String value) {
            addCriterion("CT_BEGINTIME <=", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeLike(String value) {
            addCriterion("CT_BEGINTIME like", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeNotLike(String value) {
            addCriterion("CT_BEGINTIME not like", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeIn(List<String> values) {
            addCriterion("CT_BEGINTIME in", values, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeNotIn(List<String> values) {
            addCriterion("CT_BEGINTIME not in", values, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeBetween(String value1, String value2) {
            addCriterion("CT_BEGINTIME between", value1, value2, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeNotBetween(String value1, String value2) {
            addCriterion("CT_BEGINTIME not between", value1, value2, "begintime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNull() {
            addCriterion("CT_ENDTIME is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNotNull() {
            addCriterion("CT_ENDTIME is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeEqualTo(String value) {
            addCriterion("CT_ENDTIME =", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotEqualTo(String value) {
            addCriterion("CT_ENDTIME <>", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThan(String value) {
            addCriterion("CT_ENDTIME >", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThanOrEqualTo(String value) {
            addCriterion("CT_ENDTIME >=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThan(String value) {
            addCriterion("CT_ENDTIME <", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThanOrEqualTo(String value) {
            addCriterion("CT_ENDTIME <=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLike(String value) {
            addCriterion("CT_ENDTIME like", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotLike(String value) {
            addCriterion("CT_ENDTIME not like", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIn(List<String> values) {
            addCriterion("CT_ENDTIME in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotIn(List<String> values) {
            addCriterion("CT_ENDTIME not in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeBetween(String value1, String value2) {
            addCriterion("CT_ENDTIME between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotBetween(String value1, String value2) {
            addCriterion("CT_ENDTIME not between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andLssueplaceIsNull() {
            addCriterion("CT_LSSUEPLACE is null");
            return (Criteria) this;
        }

        public Criteria andLssueplaceIsNotNull() {
            addCriterion("CT_LSSUEPLACE is not null");
            return (Criteria) this;
        }

        public Criteria andLssueplaceEqualTo(String value) {
            addCriterion("CT_LSSUEPLACE =", value, "lssueplace");
            return (Criteria) this;
        }

        public Criteria andLssueplaceNotEqualTo(String value) {
            addCriterion("CT_LSSUEPLACE <>", value, "lssueplace");
            return (Criteria) this;
        }

        public Criteria andLssueplaceGreaterThan(String value) {
            addCriterion("CT_LSSUEPLACE >", value, "lssueplace");
            return (Criteria) this;
        }

        public Criteria andLssueplaceGreaterThanOrEqualTo(String value) {
            addCriterion("CT_LSSUEPLACE >=", value, "lssueplace");
            return (Criteria) this;
        }

        public Criteria andLssueplaceLessThan(String value) {
            addCriterion("CT_LSSUEPLACE <", value, "lssueplace");
            return (Criteria) this;
        }

        public Criteria andLssueplaceLessThanOrEqualTo(String value) {
            addCriterion("CT_LSSUEPLACE <=", value, "lssueplace");
            return (Criteria) this;
        }

        public Criteria andLssueplaceLike(String value) {
            addCriterion("CT_LSSUEPLACE like", value, "lssueplace");
            return (Criteria) this;
        }

        public Criteria andLssueplaceNotLike(String value) {
            addCriterion("CT_LSSUEPLACE not like", value, "lssueplace");
            return (Criteria) this;
        }

        public Criteria andLssueplaceIn(List<String> values) {
            addCriterion("CT_LSSUEPLACE in", values, "lssueplace");
            return (Criteria) this;
        }

        public Criteria andLssueplaceNotIn(List<String> values) {
            addCriterion("CT_LSSUEPLACE not in", values, "lssueplace");
            return (Criteria) this;
        }

        public Criteria andLssueplaceBetween(String value1, String value2) {
            addCriterion("CT_LSSUEPLACE between", value1, value2, "lssueplace");
            return (Criteria) this;
        }

        public Criteria andLssueplaceNotBetween(String value1, String value2) {
            addCriterion("CT_LSSUEPLACE not between", value1, value2, "lssueplace");
            return (Criteria) this;
        }

        public Criteria andSurcertificateIsNull() {
            addCriterion("CT_SURCERTIFICATE is null");
            return (Criteria) this;
        }

        public Criteria andSurcertificateIsNotNull() {
            addCriterion("CT_SURCERTIFICATE is not null");
            return (Criteria) this;
        }

        public Criteria andSurcertificateEqualTo(String value) {
            addCriterion("CT_SURCERTIFICATE =", value, "surcertificate");
            return (Criteria) this;
        }

        public Criteria andSurcertificateNotEqualTo(String value) {
            addCriterion("CT_SURCERTIFICATE <>", value, "surcertificate");
            return (Criteria) this;
        }

        public Criteria andSurcertificateGreaterThan(String value) {
            addCriterion("CT_SURCERTIFICATE >", value, "surcertificate");
            return (Criteria) this;
        }

        public Criteria andSurcertificateGreaterThanOrEqualTo(String value) {
            addCriterion("CT_SURCERTIFICATE >=", value, "surcertificate");
            return (Criteria) this;
        }

        public Criteria andSurcertificateLessThan(String value) {
            addCriterion("CT_SURCERTIFICATE <", value, "surcertificate");
            return (Criteria) this;
        }

        public Criteria andSurcertificateLessThanOrEqualTo(String value) {
            addCriterion("CT_SURCERTIFICATE <=", value, "surcertificate");
            return (Criteria) this;
        }

        public Criteria andSurcertificateLike(String value) {
            addCriterion("CT_SURCERTIFICATE like", value, "surcertificate");
            return (Criteria) this;
        }

        public Criteria andSurcertificateNotLike(String value) {
            addCriterion("CT_SURCERTIFICATE not like", value, "surcertificate");
            return (Criteria) this;
        }

        public Criteria andSurcertificateIn(List<String> values) {
            addCriterion("CT_SURCERTIFICATE in", values, "surcertificate");
            return (Criteria) this;
        }

        public Criteria andSurcertificateNotIn(List<String> values) {
            addCriterion("CT_SURCERTIFICATE not in", values, "surcertificate");
            return (Criteria) this;
        }

        public Criteria andSurcertificateBetween(String value1, String value2) {
            addCriterion("CT_SURCERTIFICATE between", value1, value2, "surcertificate");
            return (Criteria) this;
        }

        public Criteria andSurcertificateNotBetween(String value1, String value2) {
            addCriterion("CT_SURCERTIFICATE not between", value1, value2, "surcertificate");
            return (Criteria) this;
        }

        public Criteria andTraintypeIsNull() {
            addCriterion("CT_TRAINTYPE is null");
            return (Criteria) this;
        }

        public Criteria andTraintypeIsNotNull() {
            addCriterion("CT_TRAINTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTraintypeEqualTo(String value) {
            addCriterion("CT_TRAINTYPE =", value, "traintype");
            return (Criteria) this;
        }

        public Criteria andTraintypeNotEqualTo(String value) {
            addCriterion("CT_TRAINTYPE <>", value, "traintype");
            return (Criteria) this;
        }

        public Criteria andTraintypeGreaterThan(String value) {
            addCriterion("CT_TRAINTYPE >", value, "traintype");
            return (Criteria) this;
        }

        public Criteria andTraintypeGreaterThanOrEqualTo(String value) {
            addCriterion("CT_TRAINTYPE >=", value, "traintype");
            return (Criteria) this;
        }

        public Criteria andTraintypeLessThan(String value) {
            addCriterion("CT_TRAINTYPE <", value, "traintype");
            return (Criteria) this;
        }

        public Criteria andTraintypeLessThanOrEqualTo(String value) {
            addCriterion("CT_TRAINTYPE <=", value, "traintype");
            return (Criteria) this;
        }

        public Criteria andTraintypeLike(String value) {
            addCriterion("CT_TRAINTYPE like", value, "traintype");
            return (Criteria) this;
        }

        public Criteria andTraintypeNotLike(String value) {
            addCriterion("CT_TRAINTYPE not like", value, "traintype");
            return (Criteria) this;
        }

        public Criteria andTraintypeIn(List<String> values) {
            addCriterion("CT_TRAINTYPE in", values, "traintype");
            return (Criteria) this;
        }

        public Criteria andTraintypeNotIn(List<String> values) {
            addCriterion("CT_TRAINTYPE not in", values, "traintype");
            return (Criteria) this;
        }

        public Criteria andTraintypeBetween(String value1, String value2) {
            addCriterion("CT_TRAINTYPE between", value1, value2, "traintype");
            return (Criteria) this;
        }

        public Criteria andTraintypeNotBetween(String value1, String value2) {
            addCriterion("CT_TRAINTYPE not between", value1, value2, "traintype");
            return (Criteria) this;
        }

        public Criteria andTrainbathIsNull() {
            addCriterion("CT_TRAINBATH is null");
            return (Criteria) this;
        }

        public Criteria andTrainbathIsNotNull() {
            addCriterion("CT_TRAINBATH is not null");
            return (Criteria) this;
        }

        public Criteria andTrainbathEqualTo(String value) {
            addCriterion("CT_TRAINBATH =", value, "trainbath");
            return (Criteria) this;
        }

        public Criteria andTrainbathNotEqualTo(String value) {
            addCriterion("CT_TRAINBATH <>", value, "trainbath");
            return (Criteria) this;
        }

        public Criteria andTrainbathGreaterThan(String value) {
            addCriterion("CT_TRAINBATH >", value, "trainbath");
            return (Criteria) this;
        }

        public Criteria andTrainbathGreaterThanOrEqualTo(String value) {
            addCriterion("CT_TRAINBATH >=", value, "trainbath");
            return (Criteria) this;
        }

        public Criteria andTrainbathLessThan(String value) {
            addCriterion("CT_TRAINBATH <", value, "trainbath");
            return (Criteria) this;
        }

        public Criteria andTrainbathLessThanOrEqualTo(String value) {
            addCriterion("CT_TRAINBATH <=", value, "trainbath");
            return (Criteria) this;
        }

        public Criteria andTrainbathLike(String value) {
            addCriterion("CT_TRAINBATH like", value, "trainbath");
            return (Criteria) this;
        }

        public Criteria andTrainbathNotLike(String value) {
            addCriterion("CT_TRAINBATH not like", value, "trainbath");
            return (Criteria) this;
        }

        public Criteria andTrainbathIn(List<String> values) {
            addCriterion("CT_TRAINBATH in", values, "trainbath");
            return (Criteria) this;
        }

        public Criteria andTrainbathNotIn(List<String> values) {
            addCriterion("CT_TRAINBATH not in", values, "trainbath");
            return (Criteria) this;
        }

        public Criteria andTrainbathBetween(String value1, String value2) {
            addCriterion("CT_TRAINBATH between", value1, value2, "trainbath");
            return (Criteria) this;
        }

        public Criteria andTrainbathNotBetween(String value1, String value2) {
            addCriterion("CT_TRAINBATH not between", value1, value2, "trainbath");
            return (Criteria) this;
        }

        public Criteria andIdtIsNull() {
            addCriterion("CT_IDT is null");
            return (Criteria) this;
        }

        public Criteria andIdtIsNotNull() {
            addCriterion("CT_IDT is not null");
            return (Criteria) this;
        }

        public Criteria andIdtEqualTo(Object value) {
            addCriterion("CT_IDT =", value, "idt");
            return (Criteria) this;
        }

        public Criteria andIdtNotEqualTo(Object value) {
            addCriterion("CT_IDT <>", value, "idt");
            return (Criteria) this;
        }

        public Criteria andIdtGreaterThan(Object value) {
            addCriterion("CT_IDT >", value, "idt");
            return (Criteria) this;
        }

        public Criteria andIdtGreaterThanOrEqualTo(Object value) {
            addCriterion("CT_IDT >=", value, "idt");
            return (Criteria) this;
        }

        public Criteria andIdtLessThan(Object value) {
            addCriterion("CT_IDT <", value, "idt");
            return (Criteria) this;
        }

        public Criteria andIdtLessThanOrEqualTo(Object value) {
            addCriterion("CT_IDT <=", value, "idt");
            return (Criteria) this;
        }

        public Criteria andIdtIn(List<Object> values) {
            addCriterion("CT_IDT in", values, "idt");
            return (Criteria) this;
        }

        public Criteria andIdtNotIn(List<Object> values) {
            addCriterion("CT_IDT not in", values, "idt");
            return (Criteria) this;
        }

        public Criteria andIdtBetween(Object value1, Object value2) {
            addCriterion("CT_IDT between", value1, value2, "idt");
            return (Criteria) this;
        }

        public Criteria andIdtNotBetween(Object value1, Object value2) {
            addCriterion("CT_IDT not between", value1, value2, "idt");
            return (Criteria) this;
        }

        public Criteria andUdtIsNull() {
            addCriterion("CT_UDT is null");
            return (Criteria) this;
        }

        public Criteria andUdtIsNotNull() {
            addCriterion("CT_UDT is not null");
            return (Criteria) this;
        }

        public Criteria andUdtEqualTo(Object value) {
            addCriterion("CT_UDT =", value, "udt");
            return (Criteria) this;
        }

        public Criteria andUdtNotEqualTo(Object value) {
            addCriterion("CT_UDT <>", value, "udt");
            return (Criteria) this;
        }

        public Criteria andUdtGreaterThan(Object value) {
            addCriterion("CT_UDT >", value, "udt");
            return (Criteria) this;
        }

        public Criteria andUdtGreaterThanOrEqualTo(Object value) {
            addCriterion("CT_UDT >=", value, "udt");
            return (Criteria) this;
        }

        public Criteria andUdtLessThan(Object value) {
            addCriterion("CT_UDT <", value, "udt");
            return (Criteria) this;
        }

        public Criteria andUdtLessThanOrEqualTo(Object value) {
            addCriterion("CT_UDT <=", value, "udt");
            return (Criteria) this;
        }

        public Criteria andUdtIn(List<Object> values) {
            addCriterion("CT_UDT in", values, "udt");
            return (Criteria) this;
        }

        public Criteria andUdtNotIn(List<Object> values) {
            addCriterion("CT_UDT not in", values, "udt");
            return (Criteria) this;
        }

        public Criteria andUdtBetween(Object value1, Object value2) {
            addCriterion("CT_UDT between", value1, value2, "udt");
            return (Criteria) this;
        }

        public Criteria andUdtNotBetween(Object value1, Object value2) {
            addCriterion("CT_UDT not between", value1, value2, "udt");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("CT_STATE is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("CT_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("CT_STATE =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("CT_STATE <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("CT_STATE >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("CT_STATE >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("CT_STATE <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("CT_STATE <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("CT_STATE like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("CT_STATE not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("CT_STATE in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("CT_STATE not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("CT_STATE between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("CT_STATE not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andExamtypeIsNull() {
            addCriterion("CT_EXAMTYPE is null");
            return (Criteria) this;
        }

        public Criteria andExamtypeIsNotNull() {
            addCriterion("CT_EXAMTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andExamtypeEqualTo(String value) {
            addCriterion("CT_EXAMTYPE =", value, "examtype");
            return (Criteria) this;
        }

        public Criteria andExamtypeNotEqualTo(String value) {
            addCriterion("CT_EXAMTYPE <>", value, "examtype");
            return (Criteria) this;
        }

        public Criteria andExamtypeGreaterThan(String value) {
            addCriterion("CT_EXAMTYPE >", value, "examtype");
            return (Criteria) this;
        }

        public Criteria andExamtypeGreaterThanOrEqualTo(String value) {
            addCriterion("CT_EXAMTYPE >=", value, "examtype");
            return (Criteria) this;
        }

        public Criteria andExamtypeLessThan(String value) {
            addCriterion("CT_EXAMTYPE <", value, "examtype");
            return (Criteria) this;
        }

        public Criteria andExamtypeLessThanOrEqualTo(String value) {
            addCriterion("CT_EXAMTYPE <=", value, "examtype");
            return (Criteria) this;
        }

        public Criteria andExamtypeLike(String value) {
            addCriterion("CT_EXAMTYPE like", value, "examtype");
            return (Criteria) this;
        }

        public Criteria andExamtypeNotLike(String value) {
            addCriterion("CT_EXAMTYPE not like", value, "examtype");
            return (Criteria) this;
        }

        public Criteria andExamtypeIn(List<String> values) {
            addCriterion("CT_EXAMTYPE in", values, "examtype");
            return (Criteria) this;
        }

        public Criteria andExamtypeNotIn(List<String> values) {
            addCriterion("CT_EXAMTYPE not in", values, "examtype");
            return (Criteria) this;
        }

        public Criteria andExamtypeBetween(String value1, String value2) {
            addCriterion("CT_EXAMTYPE between", value1, value2, "examtype");
            return (Criteria) this;
        }

        public Criteria andExamtypeNotBetween(String value1, String value2) {
            addCriterion("CT_EXAMTYPE not between", value1, value2, "examtype");
            return (Criteria) this;
        }

        public Criteria andIdLikeInsensitive(String value) {
            addCriterion("upper(CT_ID) like", value.toUpperCase(), "id");
            return (Criteria) this;
        }

        public Criteria andUidLikeInsensitive(String value) {
            addCriterion("upper(CT_UID) like", value.toUpperCase(), "uid");
            return (Criteria) this;
        }

        public Criteria andTrainnameLikeInsensitive(String value) {
            addCriterion("upper(CT_TRAINNAME) like", value.toUpperCase(), "trainname");
            return (Criteria) this;
        }

        public Criteria andTrainintroLikeInsensitive(String value) {
            addCriterion("upper(CT_TRAININTRO) like", value.toUpperCase(), "trainintro");
            return (Criteria) this;
        }

        public Criteria andInitiateTimeLikeInsensitive(String value) {
            addCriterion("upper(CT_INITIATE_TIME) like", value.toUpperCase(), "initiateTime");
            return (Criteria) this;
        }

        public Criteria andInitiateUnitsLikeInsensitive(String value) {
            addCriterion("upper(CT_INITIATE_UNITS) like", value.toUpperCase(), "initiateUnits");
            return (Criteria) this;
        }

        public Criteria andTrainplaceLikeInsensitive(String value) {
            addCriterion("upper(CT_TRAINPLACE) like", value.toUpperCase(), "trainplace");
            return (Criteria) this;
        }

        public Criteria andBegintimeLikeInsensitive(String value) {
            addCriterion("upper(CT_BEGINTIME) like", value.toUpperCase(), "begintime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLikeInsensitive(String value) {
            addCriterion("upper(CT_ENDTIME) like", value.toUpperCase(), "endtime");
            return (Criteria) this;
        }

        public Criteria andLssueplaceLikeInsensitive(String value) {
            addCriterion("upper(CT_LSSUEPLACE) like", value.toUpperCase(), "lssueplace");
            return (Criteria) this;
        }

        public Criteria andSurcertificateLikeInsensitive(String value) {
            addCriterion("upper(CT_SURCERTIFICATE) like", value.toUpperCase(), "surcertificate");
            return (Criteria) this;
        }

        public Criteria andTraintypeLikeInsensitive(String value) {
            addCriterion("upper(CT_TRAINTYPE) like", value.toUpperCase(), "traintype");
            return (Criteria) this;
        }

        public Criteria andTrainbathLikeInsensitive(String value) {
            addCriterion("upper(CT_TRAINBATH) like", value.toUpperCase(), "trainbath");
            return (Criteria) this;
        }

        public Criteria andStateLikeInsensitive(String value) {
            addCriterion("upper(CT_STATE) like", value.toUpperCase(), "state");
            return (Criteria) this;
        }

        public Criteria andExamtypeLikeInsensitive(String value) {
            addCriterion("upper(CT_EXAMTYPE) like", value.toUpperCase(), "examtype");
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