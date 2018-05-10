package com.chinasofti.domain;

import com.limp.framework.core.bean.Pager;

import java.util.ArrayList;
import java.util.List;

public class DrawInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Pager page;

    public DrawInfoExample() {
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
            addCriterion("CD_ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("CD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("CD_ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("CD_ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("CD_ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("CD_ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("CD_ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("CD_ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("CD_ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("CD_ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("CD_ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("CD_ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("CD_ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("CD_ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andDrawnoIsNull() {
            addCriterion("CD_DRAWNO is null");
            return (Criteria) this;
        }

        public Criteria andDrawnoIsNotNull() {
            addCriterion("CD_DRAWNO is not null");
            return (Criteria) this;
        }

        public Criteria andDrawnoEqualTo(String value) {
            addCriterion("CD_DRAWNO =", value, "drawno");
            return (Criteria) this;
        }

        public Criteria andDrawnoNotEqualTo(String value) {
            addCriterion("CD_DRAWNO <>", value, "drawno");
            return (Criteria) this;
        }

        public Criteria andDrawnoGreaterThan(String value) {
            addCriterion("CD_DRAWNO >", value, "drawno");
            return (Criteria) this;
        }

        public Criteria andDrawnoGreaterThanOrEqualTo(String value) {
            addCriterion("CD_DRAWNO >=", value, "drawno");
            return (Criteria) this;
        }

        public Criteria andDrawnoLessThan(String value) {
            addCriterion("CD_DRAWNO <", value, "drawno");
            return (Criteria) this;
        }

        public Criteria andDrawnoLessThanOrEqualTo(String value) {
            addCriterion("CD_DRAWNO <=", value, "drawno");
            return (Criteria) this;
        }

        public Criteria andDrawnoLike(String value) {
            addCriterion("CD_DRAWNO like", value, "drawno");
            return (Criteria) this;
        }

        public Criteria andDrawnoNotLike(String value) {
            addCriterion("CD_DRAWNO not like", value, "drawno");
            return (Criteria) this;
        }

        public Criteria andDrawnoIn(List<String> values) {
            addCriterion("CD_DRAWNO in", values, "drawno");
            return (Criteria) this;
        }

        public Criteria andDrawnoNotIn(List<String> values) {
            addCriterion("CD_DRAWNO not in", values, "drawno");
            return (Criteria) this;
        }

        public Criteria andDrawnoBetween(String value1, String value2) {
            addCriterion("CD_DRAWNO between", value1, value2, "drawno");
            return (Criteria) this;
        }

        public Criteria andDrawnoNotBetween(String value1, String value2) {
            addCriterion("CD_DRAWNO not between", value1, value2, "drawno");
            return (Criteria) this;
        }

        public Criteria andApprtimeIsNull() {
            addCriterion("CD_APPRTIME is null");
            return (Criteria) this;
        }

        public Criteria andApprtimeIsNotNull() {
            addCriterion("CD_APPRTIME is not null");
            return (Criteria) this;
        }

        public Criteria andApprtimeEqualTo(String value) {
            addCriterion("CD_APPRTIME =", value, "apprtime");
            return (Criteria) this;
        }

        public Criteria andApprtimeNotEqualTo(String value) {
            addCriterion("CD_APPRTIME <>", value, "apprtime");
            return (Criteria) this;
        }

        public Criteria andApprtimeGreaterThan(String value) {
            addCriterion("CD_APPRTIME >", value, "apprtime");
            return (Criteria) this;
        }

        public Criteria andApprtimeGreaterThanOrEqualTo(String value) {
            addCriterion("CD_APPRTIME >=", value, "apprtime");
            return (Criteria) this;
        }

        public Criteria andApprtimeLessThan(String value) {
            addCriterion("CD_APPRTIME <", value, "apprtime");
            return (Criteria) this;
        }

        public Criteria andApprtimeLessThanOrEqualTo(String value) {
            addCriterion("CD_APPRTIME <=", value, "apprtime");
            return (Criteria) this;
        }

        public Criteria andApprtimeLike(String value) {
            addCriterion("CD_APPRTIME like", value, "apprtime");
            return (Criteria) this;
        }

        public Criteria andApprtimeNotLike(String value) {
            addCriterion("CD_APPRTIME not like", value, "apprtime");
            return (Criteria) this;
        }

        public Criteria andApprtimeIn(List<String> values) {
            addCriterion("CD_APPRTIME in", values, "apprtime");
            return (Criteria) this;
        }

        public Criteria andApprtimeNotIn(List<String> values) {
            addCriterion("CD_APPRTIME not in", values, "apprtime");
            return (Criteria) this;
        }

        public Criteria andApprtimeBetween(String value1, String value2) {
            addCriterion("CD_APPRTIME between", value1, value2, "apprtime");
            return (Criteria) this;
        }

        public Criteria andApprtimeNotBetween(String value1, String value2) {
            addCriterion("CD_APPRTIME not between", value1, value2, "apprtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNull() {
            addCriterion("CD_ENDTIME is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNotNull() {
            addCriterion("CD_ENDTIME is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeEqualTo(String value) {
            addCriterion("CD_ENDTIME =", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotEqualTo(String value) {
            addCriterion("CD_ENDTIME <>", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThan(String value) {
            addCriterion("CD_ENDTIME >", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThanOrEqualTo(String value) {
            addCriterion("CD_ENDTIME >=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThan(String value) {
            addCriterion("CD_ENDTIME <", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThanOrEqualTo(String value) {
            addCriterion("CD_ENDTIME <=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLike(String value) {
            addCriterion("CD_ENDTIME like", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotLike(String value) {
            addCriterion("CD_ENDTIME not like", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIn(List<String> values) {
            addCriterion("CD_ENDTIME in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotIn(List<String> values) {
            addCriterion("CD_ENDTIME not in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeBetween(String value1, String value2) {
            addCriterion("CD_ENDTIME between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotBetween(String value1, String value2) {
            addCriterion("CD_ENDTIME not between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andDesunitIsNull() {
            addCriterion("CD_DESUNIT is null");
            return (Criteria) this;
        }

        public Criteria andDesunitIsNotNull() {
            addCriterion("CD_DESUNIT is not null");
            return (Criteria) this;
        }

        public Criteria andDesunitEqualTo(String value) {
            addCriterion("CD_DESUNIT =", value, "desunit");
            return (Criteria) this;
        }

        public Criteria andDesunitNotEqualTo(String value) {
            addCriterion("CD_DESUNIT <>", value, "desunit");
            return (Criteria) this;
        }

        public Criteria andDesunitGreaterThan(String value) {
            addCriterion("CD_DESUNIT >", value, "desunit");
            return (Criteria) this;
        }

        public Criteria andDesunitGreaterThanOrEqualTo(String value) {
            addCriterion("CD_DESUNIT >=", value, "desunit");
            return (Criteria) this;
        }

        public Criteria andDesunitLessThan(String value) {
            addCriterion("CD_DESUNIT <", value, "desunit");
            return (Criteria) this;
        }

        public Criteria andDesunitLessThanOrEqualTo(String value) {
            addCriterion("CD_DESUNIT <=", value, "desunit");
            return (Criteria) this;
        }

        public Criteria andDesunitLike(String value) {
            addCriterion("CD_DESUNIT like", value, "desunit");
            return (Criteria) this;
        }

        public Criteria andDesunitNotLike(String value) {
            addCriterion("CD_DESUNIT not like", value, "desunit");
            return (Criteria) this;
        }

        public Criteria andDesunitIn(List<String> values) {
            addCriterion("CD_DESUNIT in", values, "desunit");
            return (Criteria) this;
        }

        public Criteria andDesunitNotIn(List<String> values) {
            addCriterion("CD_DESUNIT not in", values, "desunit");
            return (Criteria) this;
        }

        public Criteria andDesunitBetween(String value1, String value2) {
            addCriterion("CD_DESUNIT between", value1, value2, "desunit");
            return (Criteria) this;
        }

        public Criteria andDesunitNotBetween(String value1, String value2) {
            addCriterion("CD_DESUNIT not between", value1, value2, "desunit");
            return (Criteria) this;
        }

        public Criteria andEntidIsNull() {
            addCriterion("CD_ENTID is null");
            return (Criteria) this;
        }

        public Criteria andEntidIsNotNull() {
            addCriterion("CD_ENTID is not null");
            return (Criteria) this;
        }

        public Criteria andEntidEqualTo(String value) {
            addCriterion("CD_ENTID =", value, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidNotEqualTo(String value) {
            addCriterion("CD_ENTID <>", value, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidGreaterThan(String value) {
            addCriterion("CD_ENTID >", value, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidGreaterThanOrEqualTo(String value) {
            addCriterion("CD_ENTID >=", value, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidLessThan(String value) {
            addCriterion("CD_ENTID <", value, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidLessThanOrEqualTo(String value) {
            addCriterion("CD_ENTID <=", value, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidLike(String value) {
            addCriterion("CD_ENTID like", value, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidNotLike(String value) {
            addCriterion("CD_ENTID not like", value, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidIn(List<String> values) {
            addCriterion("CD_ENTID in", values, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidNotIn(List<String> values) {
            addCriterion("CD_ENTID not in", values, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidBetween(String value1, String value2) {
            addCriterion("CD_ENTID between", value1, value2, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidNotBetween(String value1, String value2) {
            addCriterion("CD_ENTID not between", value1, value2, "entid");
            return (Criteria) this;
        }

        public Criteria andResppersionIsNull() {
            addCriterion("CD_RESPPERSION is null");
            return (Criteria) this;
        }

        public Criteria andResppersionIsNotNull() {
            addCriterion("CD_RESPPERSION is not null");
            return (Criteria) this;
        }

        public Criteria andResppersionEqualTo(String value) {
            addCriterion("CD_RESPPERSION =", value, "resppersion");
            return (Criteria) this;
        }

        public Criteria andResppersionNotEqualTo(String value) {
            addCriterion("CD_RESPPERSION <>", value, "resppersion");
            return (Criteria) this;
        }

        public Criteria andResppersionGreaterThan(String value) {
            addCriterion("CD_RESPPERSION >", value, "resppersion");
            return (Criteria) this;
        }

        public Criteria andResppersionGreaterThanOrEqualTo(String value) {
            addCriterion("CD_RESPPERSION >=", value, "resppersion");
            return (Criteria) this;
        }

        public Criteria andResppersionLessThan(String value) {
            addCriterion("CD_RESPPERSION <", value, "resppersion");
            return (Criteria) this;
        }

        public Criteria andResppersionLessThanOrEqualTo(String value) {
            addCriterion("CD_RESPPERSION <=", value, "resppersion");
            return (Criteria) this;
        }

        public Criteria andResppersionLike(String value) {
            addCriterion("CD_RESPPERSION like", value, "resppersion");
            return (Criteria) this;
        }

        public Criteria andResppersionNotLike(String value) {
            addCriterion("CD_RESPPERSION not like", value, "resppersion");
            return (Criteria) this;
        }

        public Criteria andResppersionIn(List<String> values) {
            addCriterion("CD_RESPPERSION in", values, "resppersion");
            return (Criteria) this;
        }

        public Criteria andResppersionNotIn(List<String> values) {
            addCriterion("CD_RESPPERSION not in", values, "resppersion");
            return (Criteria) this;
        }

        public Criteria andResppersionBetween(String value1, String value2) {
            addCriterion("CD_RESPPERSION between", value1, value2, "resppersion");
            return (Criteria) this;
        }

        public Criteria andResppersionNotBetween(String value1, String value2) {
            addCriterion("CD_RESPPERSION not between", value1, value2, "resppersion");
            return (Criteria) this;
        }

        public Criteria andShipnoIsNull() {
            addCriterion("CD_SHIPNO is null");
            return (Criteria) this;
        }

        public Criteria andShipnoIsNotNull() {
            addCriterion("CD_SHIPNO is not null");
            return (Criteria) this;
        }

        public Criteria andShipnoEqualTo(String value) {
            addCriterion("CD_SHIPNO =", value, "shipno");
            return (Criteria) this;
        }

        public Criteria andShipnoNotEqualTo(String value) {
            addCriterion("CD_SHIPNO <>", value, "shipno");
            return (Criteria) this;
        }

        public Criteria andShipnoGreaterThan(String value) {
            addCriterion("CD_SHIPNO >", value, "shipno");
            return (Criteria) this;
        }

        public Criteria andShipnoGreaterThanOrEqualTo(String value) {
            addCriterion("CD_SHIPNO >=", value, "shipno");
            return (Criteria) this;
        }

        public Criteria andShipnoLessThan(String value) {
            addCriterion("CD_SHIPNO <", value, "shipno");
            return (Criteria) this;
        }

        public Criteria andShipnoLessThanOrEqualTo(String value) {
            addCriterion("CD_SHIPNO <=", value, "shipno");
            return (Criteria) this;
        }

        public Criteria andShipnoLike(String value) {
            addCriterion("CD_SHIPNO like", value, "shipno");
            return (Criteria) this;
        }

        public Criteria andShipnoNotLike(String value) {
            addCriterion("CD_SHIPNO not like", value, "shipno");
            return (Criteria) this;
        }

        public Criteria andShipnoIn(List<String> values) {
            addCriterion("CD_SHIPNO in", values, "shipno");
            return (Criteria) this;
        }

        public Criteria andShipnoNotIn(List<String> values) {
            addCriterion("CD_SHIPNO not in", values, "shipno");
            return (Criteria) this;
        }

        public Criteria andShipnoBetween(String value1, String value2) {
            addCriterion("CD_SHIPNO between", value1, value2, "shipno");
            return (Criteria) this;
        }

        public Criteria andShipnoNotBetween(String value1, String value2) {
            addCriterion("CD_SHIPNO not between", value1, value2, "shipno");
            return (Criteria) this;
        }

        public Criteria andRebshipnumIsNull() {
            addCriterion("CD_REBSHIPNUM is null");
            return (Criteria) this;
        }

        public Criteria andRebshipnumIsNotNull() {
            addCriterion("CD_REBSHIPNUM is not null");
            return (Criteria) this;
        }

        public Criteria andRebshipnumEqualTo(Long value) {
            addCriterion("CD_REBSHIPNUM =", value, "rebshipnum");
            return (Criteria) this;
        }

        public Criteria andRebshipnumNotEqualTo(Long value) {
            addCriterion("CD_REBSHIPNUM <>", value, "rebshipnum");
            return (Criteria) this;
        }

        public Criteria andRebshipnumGreaterThan(Long value) {
            addCriterion("CD_REBSHIPNUM >", value, "rebshipnum");
            return (Criteria) this;
        }

        public Criteria andRebshipnumGreaterThanOrEqualTo(Long value) {
            addCriterion("CD_REBSHIPNUM >=", value, "rebshipnum");
            return (Criteria) this;
        }

        public Criteria andRebshipnumLessThan(Long value) {
            addCriterion("CD_REBSHIPNUM <", value, "rebshipnum");
            return (Criteria) this;
        }

        public Criteria andRebshipnumLessThanOrEqualTo(Long value) {
            addCriterion("CD_REBSHIPNUM <=", value, "rebshipnum");
            return (Criteria) this;
        }

        public Criteria andRebshipnumIn(List<Long> values) {
            addCriterion("CD_REBSHIPNUM in", values, "rebshipnum");
            return (Criteria) this;
        }

        public Criteria andRebshipnumNotIn(List<Long> values) {
            addCriterion("CD_REBSHIPNUM not in", values, "rebshipnum");
            return (Criteria) this;
        }

        public Criteria andRebshipnumBetween(Long value1, Long value2) {
            addCriterion("CD_REBSHIPNUM between", value1, value2, "rebshipnum");
            return (Criteria) this;
        }

        public Criteria andRebshipnumNotBetween(Long value1, Long value2) {
            addCriterion("CD_REBSHIPNUM not between", value1, value2, "rebshipnum");
            return (Criteria) this;
        }

        public Criteria andShiplengthIsNull() {
            addCriterion("CD_SHIPLENGTH is null");
            return (Criteria) this;
        }

        public Criteria andShiplengthIsNotNull() {
            addCriterion("CD_SHIPLENGTH is not null");
            return (Criteria) this;
        }

        public Criteria andShiplengthEqualTo(String value) {
            addCriterion("CD_SHIPLENGTH =", value, "shiplength");
            return (Criteria) this;
        }

        public Criteria andShiplengthNotEqualTo(String value) {
            addCriterion("CD_SHIPLENGTH <>", value, "shiplength");
            return (Criteria) this;
        }

        public Criteria andShiplengthGreaterThan(String value) {
            addCriterion("CD_SHIPLENGTH >", value, "shiplength");
            return (Criteria) this;
        }

        public Criteria andShiplengthGreaterThanOrEqualTo(String value) {
            addCriterion("CD_SHIPLENGTH >=", value, "shiplength");
            return (Criteria) this;
        }

        public Criteria andShiplengthLessThan(String value) {
            addCriterion("CD_SHIPLENGTH <", value, "shiplength");
            return (Criteria) this;
        }

        public Criteria andShiplengthLessThanOrEqualTo(String value) {
            addCriterion("CD_SHIPLENGTH <=", value, "shiplength");
            return (Criteria) this;
        }

        public Criteria andShiplengthLike(String value) {
            addCriterion("CD_SHIPLENGTH like", value, "shiplength");
            return (Criteria) this;
        }

        public Criteria andShiplengthNotLike(String value) {
            addCriterion("CD_SHIPLENGTH not like", value, "shiplength");
            return (Criteria) this;
        }

        public Criteria andShiplengthIn(List<String> values) {
            addCriterion("CD_SHIPLENGTH in", values, "shiplength");
            return (Criteria) this;
        }

        public Criteria andShiplengthNotIn(List<String> values) {
            addCriterion("CD_SHIPLENGTH not in", values, "shiplength");
            return (Criteria) this;
        }

        public Criteria andShiplengthBetween(String value1, String value2) {
            addCriterion("CD_SHIPLENGTH between", value1, value2, "shiplength");
            return (Criteria) this;
        }

        public Criteria andShiplengthNotBetween(String value1, String value2) {
            addCriterion("CD_SHIPLENGTH not between", value1, value2, "shiplength");
            return (Criteria) this;
        }

        public Criteria andTonnageIsNull() {
            addCriterion("CD_TONNAGE is null");
            return (Criteria) this;
        }

        public Criteria andTonnageIsNotNull() {
            addCriterion("CD_TONNAGE is not null");
            return (Criteria) this;
        }

        public Criteria andTonnageEqualTo(String value) {
            addCriterion("CD_TONNAGE =", value, "tonnage");
            return (Criteria) this;
        }

        public Criteria andTonnageNotEqualTo(String value) {
            addCriterion("CD_TONNAGE <>", value, "tonnage");
            return (Criteria) this;
        }

        public Criteria andTonnageGreaterThan(String value) {
            addCriterion("CD_TONNAGE >", value, "tonnage");
            return (Criteria) this;
        }

        public Criteria andTonnageGreaterThanOrEqualTo(String value) {
            addCriterion("CD_TONNAGE >=", value, "tonnage");
            return (Criteria) this;
        }

        public Criteria andTonnageLessThan(String value) {
            addCriterion("CD_TONNAGE <", value, "tonnage");
            return (Criteria) this;
        }

        public Criteria andTonnageLessThanOrEqualTo(String value) {
            addCriterion("CD_TONNAGE <=", value, "tonnage");
            return (Criteria) this;
        }

        public Criteria andTonnageLike(String value) {
            addCriterion("CD_TONNAGE like", value, "tonnage");
            return (Criteria) this;
        }

        public Criteria andTonnageNotLike(String value) {
            addCriterion("CD_TONNAGE not like", value, "tonnage");
            return (Criteria) this;
        }

        public Criteria andTonnageIn(List<String> values) {
            addCriterion("CD_TONNAGE in", values, "tonnage");
            return (Criteria) this;
        }

        public Criteria andTonnageNotIn(List<String> values) {
            addCriterion("CD_TONNAGE not in", values, "tonnage");
            return (Criteria) this;
        }

        public Criteria andTonnageBetween(String value1, String value2) {
            addCriterion("CD_TONNAGE between", value1, value2, "tonnage");
            return (Criteria) this;
        }

        public Criteria andTonnageNotBetween(String value1, String value2) {
            addCriterion("CD_TONNAGE not between", value1, value2, "tonnage");
            return (Criteria) this;
        }

        public Criteria andPowerIsNull() {
            addCriterion("CD_POWER is null");
            return (Criteria) this;
        }

        public Criteria andPowerIsNotNull() {
            addCriterion("CD_POWER is not null");
            return (Criteria) this;
        }

        public Criteria andPowerEqualTo(String value) {
            addCriterion("CD_POWER =", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerNotEqualTo(String value) {
            addCriterion("CD_POWER <>", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerGreaterThan(String value) {
            addCriterion("CD_POWER >", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerGreaterThanOrEqualTo(String value) {
            addCriterion("CD_POWER >=", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerLessThan(String value) {
            addCriterion("CD_POWER <", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerLessThanOrEqualTo(String value) {
            addCriterion("CD_POWER <=", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerLike(String value) {
            addCriterion("CD_POWER like", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerNotLike(String value) {
            addCriterion("CD_POWER not like", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerIn(List<String> values) {
            addCriterion("CD_POWER in", values, "power");
            return (Criteria) this;
        }

        public Criteria andPowerNotIn(List<String> values) {
            addCriterion("CD_POWER not in", values, "power");
            return (Criteria) this;
        }

        public Criteria andPowerBetween(String value1, String value2) {
            addCriterion("CD_POWER between", value1, value2, "power");
            return (Criteria) this;
        }

        public Criteria andPowerNotBetween(String value1, String value2) {
            addCriterion("CD_POWER not between", value1, value2, "power");
            return (Criteria) this;
        }

        public Criteria andSpeedIsNull() {
            addCriterion("CD_SPEED is null");
            return (Criteria) this;
        }

        public Criteria andSpeedIsNotNull() {
            addCriterion("CD_SPEED is not null");
            return (Criteria) this;
        }

        public Criteria andSpeedEqualTo(String value) {
            addCriterion("CD_SPEED =", value, "speed");
            return (Criteria) this;
        }

        public Criteria andSpeedNotEqualTo(String value) {
            addCriterion("CD_SPEED <>", value, "speed");
            return (Criteria) this;
        }

        public Criteria andSpeedGreaterThan(String value) {
            addCriterion("CD_SPEED >", value, "speed");
            return (Criteria) this;
        }

        public Criteria andSpeedGreaterThanOrEqualTo(String value) {
            addCriterion("CD_SPEED >=", value, "speed");
            return (Criteria) this;
        }

        public Criteria andSpeedLessThan(String value) {
            addCriterion("CD_SPEED <", value, "speed");
            return (Criteria) this;
        }

        public Criteria andSpeedLessThanOrEqualTo(String value) {
            addCriterion("CD_SPEED <=", value, "speed");
            return (Criteria) this;
        }

        public Criteria andSpeedLike(String value) {
            addCriterion("CD_SPEED like", value, "speed");
            return (Criteria) this;
        }

        public Criteria andSpeedNotLike(String value) {
            addCriterion("CD_SPEED not like", value, "speed");
            return (Criteria) this;
        }

        public Criteria andSpeedIn(List<String> values) {
            addCriterion("CD_SPEED in", values, "speed");
            return (Criteria) this;
        }

        public Criteria andSpeedNotIn(List<String> values) {
            addCriterion("CD_SPEED not in", values, "speed");
            return (Criteria) this;
        }

        public Criteria andSpeedBetween(String value1, String value2) {
            addCriterion("CD_SPEED between", value1, value2, "speed");
            return (Criteria) this;
        }

        public Criteria andSpeedNotBetween(String value1, String value2) {
            addCriterion("CD_SPEED not between", value1, value2, "speed");
            return (Criteria) this;
        }

        public Criteria andWaterIsNull() {
            addCriterion("CD_WATER is null");
            return (Criteria) this;
        }

        public Criteria andWaterIsNotNull() {
            addCriterion("CD_WATER is not null");
            return (Criteria) this;
        }

        public Criteria andWaterEqualTo(String value) {
            addCriterion("CD_WATER =", value, "water");
            return (Criteria) this;
        }

        public Criteria andWaterNotEqualTo(String value) {
            addCriterion("CD_WATER <>", value, "water");
            return (Criteria) this;
        }

        public Criteria andWaterGreaterThan(String value) {
            addCriterion("CD_WATER >", value, "water");
            return (Criteria) this;
        }

        public Criteria andWaterGreaterThanOrEqualTo(String value) {
            addCriterion("CD_WATER >=", value, "water");
            return (Criteria) this;
        }

        public Criteria andWaterLessThan(String value) {
            addCriterion("CD_WATER <", value, "water");
            return (Criteria) this;
        }

        public Criteria andWaterLessThanOrEqualTo(String value) {
            addCriterion("CD_WATER <=", value, "water");
            return (Criteria) this;
        }

        public Criteria andWaterLike(String value) {
            addCriterion("CD_WATER like", value, "water");
            return (Criteria) this;
        }

        public Criteria andWaterNotLike(String value) {
            addCriterion("CD_WATER not like", value, "water");
            return (Criteria) this;
        }

        public Criteria andWaterIn(List<String> values) {
            addCriterion("CD_WATER in", values, "water");
            return (Criteria) this;
        }

        public Criteria andWaterNotIn(List<String> values) {
            addCriterion("CD_WATER not in", values, "water");
            return (Criteria) this;
        }

        public Criteria andWaterBetween(String value1, String value2) {
            addCriterion("CD_WATER between", value1, value2, "water");
            return (Criteria) this;
        }

        public Criteria andWaterNotBetween(String value1, String value2) {
            addCriterion("CD_WATER not between", value1, value2, "water");
            return (Criteria) this;
        }

        public Criteria andShiptypeIsNull() {
            addCriterion("CD_SHIPTYPE is null");
            return (Criteria) this;
        }

        public Criteria andShiptypeIsNotNull() {
            addCriterion("CD_SHIPTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andShiptypeEqualTo(String value) {
            addCriterion("CD_SHIPTYPE =", value, "shiptype");
            return (Criteria) this;
        }

        public Criteria andShiptypeNotEqualTo(String value) {
            addCriterion("CD_SHIPTYPE <>", value, "shiptype");
            return (Criteria) this;
        }

        public Criteria andShiptypeGreaterThan(String value) {
            addCriterion("CD_SHIPTYPE >", value, "shiptype");
            return (Criteria) this;
        }

        public Criteria andShiptypeGreaterThanOrEqualTo(String value) {
            addCriterion("CD_SHIPTYPE >=", value, "shiptype");
            return (Criteria) this;
        }

        public Criteria andShiptypeLessThan(String value) {
            addCriterion("CD_SHIPTYPE <", value, "shiptype");
            return (Criteria) this;
        }

        public Criteria andShiptypeLessThanOrEqualTo(String value) {
            addCriterion("CD_SHIPTYPE <=", value, "shiptype");
            return (Criteria) this;
        }

        public Criteria andShiptypeLike(String value) {
            addCriterion("CD_SHIPTYPE like", value, "shiptype");
            return (Criteria) this;
        }

        public Criteria andShiptypeNotLike(String value) {
            addCriterion("CD_SHIPTYPE not like", value, "shiptype");
            return (Criteria) this;
        }

        public Criteria andShiptypeIn(List<String> values) {
            addCriterion("CD_SHIPTYPE in", values, "shiptype");
            return (Criteria) this;
        }

        public Criteria andShiptypeNotIn(List<String> values) {
            addCriterion("CD_SHIPTYPE not in", values, "shiptype");
            return (Criteria) this;
        }

        public Criteria andShiptypeBetween(String value1, String value2) {
            addCriterion("CD_SHIPTYPE between", value1, value2, "shiptype");
            return (Criteria) this;
        }

        public Criteria andShiptypeNotBetween(String value1, String value2) {
            addCriterion("CD_SHIPTYPE not between", value1, value2, "shiptype");
            return (Criteria) this;
        }

        public Criteria andShiptypeidIsNull() {
            addCriterion("CD_SHIPTYPEID is null");
            return (Criteria) this;
        }

        public Criteria andShiptypeidIsNotNull() {
            addCriterion("CD_SHIPTYPEID is not null");
            return (Criteria) this;
        }

        public Criteria andShiptypeidEqualTo(String value) {
            addCriterion("CD_SHIPTYPEID =", value, "shiptypeid");
            return (Criteria) this;
        }

        public Criteria andShiptypeidNotEqualTo(String value) {
            addCriterion("CD_SHIPTYPEID <>", value, "shiptypeid");
            return (Criteria) this;
        }

        public Criteria andShiptypeidGreaterThan(String value) {
            addCriterion("CD_SHIPTYPEID >", value, "shiptypeid");
            return (Criteria) this;
        }

        public Criteria andShiptypeidGreaterThanOrEqualTo(String value) {
            addCriterion("CD_SHIPTYPEID >=", value, "shiptypeid");
            return (Criteria) this;
        }

        public Criteria andShiptypeidLessThan(String value) {
            addCriterion("CD_SHIPTYPEID <", value, "shiptypeid");
            return (Criteria) this;
        }

        public Criteria andShiptypeidLessThanOrEqualTo(String value) {
            addCriterion("CD_SHIPTYPEID <=", value, "shiptypeid");
            return (Criteria) this;
        }

        public Criteria andShiptypeidLike(String value) {
            addCriterion("CD_SHIPTYPEID like", value, "shiptypeid");
            return (Criteria) this;
        }

        public Criteria andShiptypeidNotLike(String value) {
            addCriterion("CD_SHIPTYPEID not like", value, "shiptypeid");
            return (Criteria) this;
        }

        public Criteria andShiptypeidIn(List<String> values) {
            addCriterion("CD_SHIPTYPEID in", values, "shiptypeid");
            return (Criteria) this;
        }

        public Criteria andShiptypeidNotIn(List<String> values) {
            addCriterion("CD_SHIPTYPEID not in", values, "shiptypeid");
            return (Criteria) this;
        }

        public Criteria andShiptypeidBetween(String value1, String value2) {
            addCriterion("CD_SHIPTYPEID between", value1, value2, "shiptypeid");
            return (Criteria) this;
        }

        public Criteria andShiptypeidNotBetween(String value1, String value2) {
            addCriterion("CD_SHIPTYPEID not between", value1, value2, "shiptypeid");
            return (Criteria) this;
        }

        public Criteria andShipareaIsNull() {
            addCriterion("CD_SHIPAREA is null");
            return (Criteria) this;
        }

        public Criteria andShipareaIsNotNull() {
            addCriterion("CD_SHIPAREA is not null");
            return (Criteria) this;
        }

        public Criteria andShipareaEqualTo(String value) {
            addCriterion("CD_SHIPAREA =", value, "shiparea");
            return (Criteria) this;
        }

        public Criteria andShipareaNotEqualTo(String value) {
            addCriterion("CD_SHIPAREA <>", value, "shiparea");
            return (Criteria) this;
        }

        public Criteria andShipareaGreaterThan(String value) {
            addCriterion("CD_SHIPAREA >", value, "shiparea");
            return (Criteria) this;
        }

        public Criteria andShipareaGreaterThanOrEqualTo(String value) {
            addCriterion("CD_SHIPAREA >=", value, "shiparea");
            return (Criteria) this;
        }

        public Criteria andShipareaLessThan(String value) {
            addCriterion("CD_SHIPAREA <", value, "shiparea");
            return (Criteria) this;
        }

        public Criteria andShipareaLessThanOrEqualTo(String value) {
            addCriterion("CD_SHIPAREA <=", value, "shiparea");
            return (Criteria) this;
        }

        public Criteria andShipareaLike(String value) {
            addCriterion("CD_SHIPAREA like", value, "shiparea");
            return (Criteria) this;
        }

        public Criteria andShipareaNotLike(String value) {
            addCriterion("CD_SHIPAREA not like", value, "shiparea");
            return (Criteria) this;
        }

        public Criteria andShipareaIn(List<String> values) {
            addCriterion("CD_SHIPAREA in", values, "shiparea");
            return (Criteria) this;
        }

        public Criteria andShipareaNotIn(List<String> values) {
            addCriterion("CD_SHIPAREA not in", values, "shiparea");
            return (Criteria) this;
        }

        public Criteria andShipareaBetween(String value1, String value2) {
            addCriterion("CD_SHIPAREA between", value1, value2, "shiparea");
            return (Criteria) this;
        }

        public Criteria andShipareaNotBetween(String value1, String value2) {
            addCriterion("CD_SHIPAREA not between", value1, value2, "shiparea");
            return (Criteria) this;
        }

        public Criteria andShipareaidIsNull() {
            addCriterion("CD_SHIPAREAID is null");
            return (Criteria) this;
        }

        public Criteria andShipareaidIsNotNull() {
            addCriterion("CD_SHIPAREAID is not null");
            return (Criteria) this;
        }

        public Criteria andShipareaidEqualTo(String value) {
            addCriterion("CD_SHIPAREAID =", value, "shipareaid");
            return (Criteria) this;
        }

        public Criteria andShipareaidNotEqualTo(String value) {
            addCriterion("CD_SHIPAREAID <>", value, "shipareaid");
            return (Criteria) this;
        }

        public Criteria andShipareaidGreaterThan(String value) {
            addCriterion("CD_SHIPAREAID >", value, "shipareaid");
            return (Criteria) this;
        }

        public Criteria andShipareaidGreaterThanOrEqualTo(String value) {
            addCriterion("CD_SHIPAREAID >=", value, "shipareaid");
            return (Criteria) this;
        }

        public Criteria andShipareaidLessThan(String value) {
            addCriterion("CD_SHIPAREAID <", value, "shipareaid");
            return (Criteria) this;
        }

        public Criteria andShipareaidLessThanOrEqualTo(String value) {
            addCriterion("CD_SHIPAREAID <=", value, "shipareaid");
            return (Criteria) this;
        }

        public Criteria andShipareaidLike(String value) {
            addCriterion("CD_SHIPAREAID like", value, "shipareaid");
            return (Criteria) this;
        }

        public Criteria andShipareaidNotLike(String value) {
            addCriterion("CD_SHIPAREAID not like", value, "shipareaid");
            return (Criteria) this;
        }

        public Criteria andShipareaidIn(List<String> values) {
            addCriterion("CD_SHIPAREAID in", values, "shipareaid");
            return (Criteria) this;
        }

        public Criteria andShipareaidNotIn(List<String> values) {
            addCriterion("CD_SHIPAREAID not in", values, "shipareaid");
            return (Criteria) this;
        }

        public Criteria andShipareaidBetween(String value1, String value2) {
            addCriterion("CD_SHIPAREAID between", value1, value2, "shipareaid");
            return (Criteria) this;
        }

        public Criteria andShipareaidNotBetween(String value1, String value2) {
            addCriterion("CD_SHIPAREAID not between", value1, value2, "shipareaid");
            return (Criteria) this;
        }

        public Criteria andPeoplecountIsNull() {
            addCriterion("CD_PEOPLECOUNT is null");
            return (Criteria) this;
        }

        public Criteria andPeoplecountIsNotNull() {
            addCriterion("CD_PEOPLECOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andPeoplecountEqualTo(String value) {
            addCriterion("CD_PEOPLECOUNT =", value, "peoplecount");
            return (Criteria) this;
        }

        public Criteria andPeoplecountNotEqualTo(String value) {
            addCriterion("CD_PEOPLECOUNT <>", value, "peoplecount");
            return (Criteria) this;
        }

        public Criteria andPeoplecountGreaterThan(String value) {
            addCriterion("CD_PEOPLECOUNT >", value, "peoplecount");
            return (Criteria) this;
        }

        public Criteria andPeoplecountGreaterThanOrEqualTo(String value) {
            addCriterion("CD_PEOPLECOUNT >=", value, "peoplecount");
            return (Criteria) this;
        }

        public Criteria andPeoplecountLessThan(String value) {
            addCriterion("CD_PEOPLECOUNT <", value, "peoplecount");
            return (Criteria) this;
        }

        public Criteria andPeoplecountLessThanOrEqualTo(String value) {
            addCriterion("CD_PEOPLECOUNT <=", value, "peoplecount");
            return (Criteria) this;
        }

        public Criteria andPeoplecountLike(String value) {
            addCriterion("CD_PEOPLECOUNT like", value, "peoplecount");
            return (Criteria) this;
        }

        public Criteria andPeoplecountNotLike(String value) {
            addCriterion("CD_PEOPLECOUNT not like", value, "peoplecount");
            return (Criteria) this;
        }

        public Criteria andPeoplecountIn(List<String> values) {
            addCriterion("CD_PEOPLECOUNT in", values, "peoplecount");
            return (Criteria) this;
        }

        public Criteria andPeoplecountNotIn(List<String> values) {
            addCriterion("CD_PEOPLECOUNT not in", values, "peoplecount");
            return (Criteria) this;
        }

        public Criteria andPeoplecountBetween(String value1, String value2) {
            addCriterion("CD_PEOPLECOUNT between", value1, value2, "peoplecount");
            return (Criteria) this;
        }

        public Criteria andPeoplecountNotBetween(String value1, String value2) {
            addCriterion("CD_PEOPLECOUNT not between", value1, value2, "peoplecount");
            return (Criteria) this;
        }

        public Criteria andJobareaIsNull() {
            addCriterion("CD_JOBAREA is null");
            return (Criteria) this;
        }

        public Criteria andJobareaIsNotNull() {
            addCriterion("CD_JOBAREA is not null");
            return (Criteria) this;
        }

        public Criteria andJobareaEqualTo(String value) {
            addCriterion("CD_JOBAREA =", value, "jobarea");
            return (Criteria) this;
        }

        public Criteria andJobareaNotEqualTo(String value) {
            addCriterion("CD_JOBAREA <>", value, "jobarea");
            return (Criteria) this;
        }

        public Criteria andJobareaGreaterThan(String value) {
            addCriterion("CD_JOBAREA >", value, "jobarea");
            return (Criteria) this;
        }

        public Criteria andJobareaGreaterThanOrEqualTo(String value) {
            addCriterion("CD_JOBAREA >=", value, "jobarea");
            return (Criteria) this;
        }

        public Criteria andJobareaLessThan(String value) {
            addCriterion("CD_JOBAREA <", value, "jobarea");
            return (Criteria) this;
        }

        public Criteria andJobareaLessThanOrEqualTo(String value) {
            addCriterion("CD_JOBAREA <=", value, "jobarea");
            return (Criteria) this;
        }

        public Criteria andJobareaLike(String value) {
            addCriterion("CD_JOBAREA like", value, "jobarea");
            return (Criteria) this;
        }

        public Criteria andJobareaNotLike(String value) {
            addCriterion("CD_JOBAREA not like", value, "jobarea");
            return (Criteria) this;
        }

        public Criteria andJobareaIn(List<String> values) {
            addCriterion("CD_JOBAREA in", values, "jobarea");
            return (Criteria) this;
        }

        public Criteria andJobareaNotIn(List<String> values) {
            addCriterion("CD_JOBAREA not in", values, "jobarea");
            return (Criteria) this;
        }

        public Criteria andJobareaBetween(String value1, String value2) {
            addCriterion("CD_JOBAREA between", value1, value2, "jobarea");
            return (Criteria) this;
        }

        public Criteria andJobareaNotBetween(String value1, String value2) {
            addCriterion("CD_JOBAREA not between", value1, value2, "jobarea");
            return (Criteria) this;
        }

        public Criteria andApplyunitIsNull() {
            addCriterion("CD_APPLYUNIT is null");
            return (Criteria) this;
        }

        public Criteria andApplyunitIsNotNull() {
            addCriterion("CD_APPLYUNIT is not null");
            return (Criteria) this;
        }

        public Criteria andApplyunitEqualTo(String value) {
            addCriterion("CD_APPLYUNIT =", value, "applyunit");
            return (Criteria) this;
        }

        public Criteria andApplyunitNotEqualTo(String value) {
            addCriterion("CD_APPLYUNIT <>", value, "applyunit");
            return (Criteria) this;
        }

        public Criteria andApplyunitGreaterThan(String value) {
            addCriterion("CD_APPLYUNIT >", value, "applyunit");
            return (Criteria) this;
        }

        public Criteria andApplyunitGreaterThanOrEqualTo(String value) {
            addCriterion("CD_APPLYUNIT >=", value, "applyunit");
            return (Criteria) this;
        }

        public Criteria andApplyunitLessThan(String value) {
            addCriterion("CD_APPLYUNIT <", value, "applyunit");
            return (Criteria) this;
        }

        public Criteria andApplyunitLessThanOrEqualTo(String value) {
            addCriterion("CD_APPLYUNIT <=", value, "applyunit");
            return (Criteria) this;
        }

        public Criteria andApplyunitLike(String value) {
            addCriterion("CD_APPLYUNIT like", value, "applyunit");
            return (Criteria) this;
        }

        public Criteria andApplyunitNotLike(String value) {
            addCriterion("CD_APPLYUNIT not like", value, "applyunit");
            return (Criteria) this;
        }

        public Criteria andApplyunitIn(List<String> values) {
            addCriterion("CD_APPLYUNIT in", values, "applyunit");
            return (Criteria) this;
        }

        public Criteria andApplyunitNotIn(List<String> values) {
            addCriterion("CD_APPLYUNIT not in", values, "applyunit");
            return (Criteria) this;
        }

        public Criteria andApplyunitBetween(String value1, String value2) {
            addCriterion("CD_APPLYUNIT between", value1, value2, "applyunit");
            return (Criteria) this;
        }

        public Criteria andApplyunitNotBetween(String value1, String value2) {
            addCriterion("CD_APPLYUNIT not between", value1, value2, "applyunit");
            return (Criteria) this;
        }

        public Criteria andApplyunitIdIsNull() {
            addCriterion("CD_APPLYUNIT_ID is null");
            return (Criteria) this;
        }

        public Criteria andApplyunitIdIsNotNull() {
            addCriterion("CD_APPLYUNIT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andApplyunitIdEqualTo(String value) {
            addCriterion("CD_APPLYUNIT_ID =", value, "applyunitId");
            return (Criteria) this;
        }

        public Criteria andApplyunitIdNotEqualTo(String value) {
            addCriterion("CD_APPLYUNIT_ID <>", value, "applyunitId");
            return (Criteria) this;
        }

        public Criteria andApplyunitIdGreaterThan(String value) {
            addCriterion("CD_APPLYUNIT_ID >", value, "applyunitId");
            return (Criteria) this;
        }

        public Criteria andApplyunitIdGreaterThanOrEqualTo(String value) {
            addCriterion("CD_APPLYUNIT_ID >=", value, "applyunitId");
            return (Criteria) this;
        }

        public Criteria andApplyunitIdLessThan(String value) {
            addCriterion("CD_APPLYUNIT_ID <", value, "applyunitId");
            return (Criteria) this;
        }

        public Criteria andApplyunitIdLessThanOrEqualTo(String value) {
            addCriterion("CD_APPLYUNIT_ID <=", value, "applyunitId");
            return (Criteria) this;
        }

        public Criteria andApplyunitIdLike(String value) {
            addCriterion("CD_APPLYUNIT_ID like", value, "applyunitId");
            return (Criteria) this;
        }

        public Criteria andApplyunitIdNotLike(String value) {
            addCriterion("CD_APPLYUNIT_ID not like", value, "applyunitId");
            return (Criteria) this;
        }

        public Criteria andApplyunitIdIn(List<String> values) {
            addCriterion("CD_APPLYUNIT_ID in", values, "applyunitId");
            return (Criteria) this;
        }

        public Criteria andApplyunitIdNotIn(List<String> values) {
            addCriterion("CD_APPLYUNIT_ID not in", values, "applyunitId");
            return (Criteria) this;
        }

        public Criteria andApplyunitIdBetween(String value1, String value2) {
            addCriterion("CD_APPLYUNIT_ID between", value1, value2, "applyunitId");
            return (Criteria) this;
        }

        public Criteria andApplyunitIdNotBetween(String value1, String value2) {
            addCriterion("CD_APPLYUNIT_ID not between", value1, value2, "applyunitId");
            return (Criteria) this;
        }

        public Criteria andDramshipnameIsNull() {
            addCriterion("CD_DRAMSHIPNAME is null");
            return (Criteria) this;
        }

        public Criteria andDramshipnameIsNotNull() {
            addCriterion("CD_DRAMSHIPNAME is not null");
            return (Criteria) this;
        }

        public Criteria andDramshipnameEqualTo(String value) {
            addCriterion("CD_DRAMSHIPNAME =", value, "dramshipname");
            return (Criteria) this;
        }

        public Criteria andDramshipnameNotEqualTo(String value) {
            addCriterion("CD_DRAMSHIPNAME <>", value, "dramshipname");
            return (Criteria) this;
        }

        public Criteria andDramshipnameGreaterThan(String value) {
            addCriterion("CD_DRAMSHIPNAME >", value, "dramshipname");
            return (Criteria) this;
        }

        public Criteria andDramshipnameGreaterThanOrEqualTo(String value) {
            addCriterion("CD_DRAMSHIPNAME >=", value, "dramshipname");
            return (Criteria) this;
        }

        public Criteria andDramshipnameLessThan(String value) {
            addCriterion("CD_DRAMSHIPNAME <", value, "dramshipname");
            return (Criteria) this;
        }

        public Criteria andDramshipnameLessThanOrEqualTo(String value) {
            addCriterion("CD_DRAMSHIPNAME <=", value, "dramshipname");
            return (Criteria) this;
        }

        public Criteria andDramshipnameLike(String value) {
            addCriterion("CD_DRAMSHIPNAME like", value, "dramshipname");
            return (Criteria) this;
        }

        public Criteria andDramshipnameNotLike(String value) {
            addCriterion("CD_DRAMSHIPNAME not like", value, "dramshipname");
            return (Criteria) this;
        }

        public Criteria andDramshipnameIn(List<String> values) {
            addCriterion("CD_DRAMSHIPNAME in", values, "dramshipname");
            return (Criteria) this;
        }

        public Criteria andDramshipnameNotIn(List<String> values) {
            addCriterion("CD_DRAMSHIPNAME not in", values, "dramshipname");
            return (Criteria) this;
        }

        public Criteria andDramshipnameBetween(String value1, String value2) {
            addCriterion("CD_DRAMSHIPNAME between", value1, value2, "dramshipname");
            return (Criteria) this;
        }

        public Criteria andDramshipnameNotBetween(String value1, String value2) {
            addCriterion("CD_DRAMSHIPNAME not between", value1, value2, "dramshipname");
            return (Criteria) this;
        }

        public Criteria andEngineroomTypeIsNull() {
            addCriterion("CD_ENGINEROOM_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andEngineroomTypeIsNotNull() {
            addCriterion("CD_ENGINEROOM_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andEngineroomTypeEqualTo(String value) {
            addCriterion("CD_ENGINEROOM_TYPE =", value, "engineroomType");
            return (Criteria) this;
        }

        public Criteria andEngineroomTypeNotEqualTo(String value) {
            addCriterion("CD_ENGINEROOM_TYPE <>", value, "engineroomType");
            return (Criteria) this;
        }

        public Criteria andEngineroomTypeGreaterThan(String value) {
            addCriterion("CD_ENGINEROOM_TYPE >", value, "engineroomType");
            return (Criteria) this;
        }

        public Criteria andEngineroomTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CD_ENGINEROOM_TYPE >=", value, "engineroomType");
            return (Criteria) this;
        }

        public Criteria andEngineroomTypeLessThan(String value) {
            addCriterion("CD_ENGINEROOM_TYPE <", value, "engineroomType");
            return (Criteria) this;
        }

        public Criteria andEngineroomTypeLessThanOrEqualTo(String value) {
            addCriterion("CD_ENGINEROOM_TYPE <=", value, "engineroomType");
            return (Criteria) this;
        }

        public Criteria andEngineroomTypeLike(String value) {
            addCriterion("CD_ENGINEROOM_TYPE like", value, "engineroomType");
            return (Criteria) this;
        }

        public Criteria andEngineroomTypeNotLike(String value) {
            addCriterion("CD_ENGINEROOM_TYPE not like", value, "engineroomType");
            return (Criteria) this;
        }

        public Criteria andEngineroomTypeIn(List<String> values) {
            addCriterion("CD_ENGINEROOM_TYPE in", values, "engineroomType");
            return (Criteria) this;
        }

        public Criteria andEngineroomTypeNotIn(List<String> values) {
            addCriterion("CD_ENGINEROOM_TYPE not in", values, "engineroomType");
            return (Criteria) this;
        }

        public Criteria andEngineroomTypeBetween(String value1, String value2) {
            addCriterion("CD_ENGINEROOM_TYPE between", value1, value2, "engineroomType");
            return (Criteria) this;
        }

        public Criteria andEngineroomTypeNotBetween(String value1, String value2) {
            addCriterion("CD_ENGINEROOM_TYPE not between", value1, value2, "engineroomType");
            return (Criteria) this;
        }

        public Criteria andIdLikeInsensitive(String value) {
            addCriterion("upper(CD_ID) like", value.toUpperCase(), "id");
            return (Criteria) this;
        }

        public Criteria andDrawnoLikeInsensitive(String value) {
            addCriterion("upper(CD_DRAWNO) like", value.toUpperCase(), "drawno");
            return (Criteria) this;
        }

        public Criteria andApprtimeLikeInsensitive(String value) {
            addCriterion("upper(CD_APPRTIME) like", value.toUpperCase(), "apprtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLikeInsensitive(String value) {
            addCriterion("upper(CD_ENDTIME) like", value.toUpperCase(), "endtime");
            return (Criteria) this;
        }

        public Criteria andDesunitLikeInsensitive(String value) {
            addCriterion("upper(CD_DESUNIT) like", value.toUpperCase(), "desunit");
            return (Criteria) this;
        }

        public Criteria andEntidLikeInsensitive(String value) {
            addCriterion("upper(CD_ENTID) like", value.toUpperCase(), "entid");
            return (Criteria) this;
        }

        public Criteria andResppersionLikeInsensitive(String value) {
            addCriterion("upper(CD_RESPPERSION) like", value.toUpperCase(), "resppersion");
            return (Criteria) this;
        }

        public Criteria andShipnoLikeInsensitive(String value) {
            addCriterion("upper(CD_SHIPNO) like", value.toUpperCase(), "shipno");
            return (Criteria) this;
        }

        public Criteria andShiplengthLikeInsensitive(String value) {
            addCriterion("upper(CD_SHIPLENGTH) like", value.toUpperCase(), "shiplength");
            return (Criteria) this;
        }

        public Criteria andTonnageLikeInsensitive(String value) {
            addCriterion("upper(CD_TONNAGE) like", value.toUpperCase(), "tonnage");
            return (Criteria) this;
        }

        public Criteria andPowerLikeInsensitive(String value) {
            addCriterion("upper(CD_POWER) like", value.toUpperCase(), "power");
            return (Criteria) this;
        }

        public Criteria andSpeedLikeInsensitive(String value) {
            addCriterion("upper(CD_SPEED) like", value.toUpperCase(), "speed");
            return (Criteria) this;
        }

        public Criteria andWaterLikeInsensitive(String value) {
            addCriterion("upper(CD_WATER) like", value.toUpperCase(), "water");
            return (Criteria) this;
        }

        public Criteria andShiptypeLikeInsensitive(String value) {
            addCriterion("upper(CD_SHIPTYPE) like", value.toUpperCase(), "shiptype");
            return (Criteria) this;
        }

        public Criteria andShiptypeidLikeInsensitive(String value) {
            addCriterion("upper(CD_SHIPTYPEID) like", value.toUpperCase(), "shiptypeid");
            return (Criteria) this;
        }

        public Criteria andShipareaLikeInsensitive(String value) {
            addCriterion("upper(CD_SHIPAREA) like", value.toUpperCase(), "shiparea");
            return (Criteria) this;
        }

        public Criteria andShipareaidLikeInsensitive(String value) {
            addCriterion("upper(CD_SHIPAREAID) like", value.toUpperCase(), "shipareaid");
            return (Criteria) this;
        }

        public Criteria andPeoplecountLikeInsensitive(String value) {
            addCriterion("upper(CD_PEOPLECOUNT) like", value.toUpperCase(), "peoplecount");
            return (Criteria) this;
        }

        public Criteria andJobareaLikeInsensitive(String value) {
            addCriterion("upper(CD_JOBAREA) like", value.toUpperCase(), "jobarea");
            return (Criteria) this;
        }

        public Criteria andApplyunitLikeInsensitive(String value) {
            addCriterion("upper(CD_APPLYUNIT) like", value.toUpperCase(), "applyunit");
            return (Criteria) this;
        }

        public Criteria andApplyunitIdLikeInsensitive(String value) {
            addCriterion("upper(CD_APPLYUNIT_ID) like", value.toUpperCase(), "applyunitId");
            return (Criteria) this;
        }

        public Criteria andDramshipnameLikeInsensitive(String value) {
            addCriterion("upper(CD_DRAMSHIPNAME) like", value.toUpperCase(), "dramshipname");
            return (Criteria) this;
        }

        public Criteria andEngineroomTypeLikeInsensitive(String value) {
            addCriterion("upper(CD_ENGINEROOM_TYPE) like", value.toUpperCase(), "engineroomType");
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