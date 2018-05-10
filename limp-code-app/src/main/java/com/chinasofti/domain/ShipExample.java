package com.chinasofti.domain;

import com.limp.framework.core.bean.Pager;

import java.util.ArrayList;
import java.util.List;

public class ShipExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Pager page;

    public ShipExample() {
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
            addCriterion("CS_ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("CS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("CS_ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("CS_ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("CS_ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("CS_ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("CS_ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("CS_ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("CS_ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("CS_ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("CS_ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("CS_ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("CS_ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("CS_ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andShipnameIsNull() {
            addCriterion("CS_SHIPNAME is null");
            return (Criteria) this;
        }

        public Criteria andShipnameIsNotNull() {
            addCriterion("CS_SHIPNAME is not null");
            return (Criteria) this;
        }

        public Criteria andShipnameEqualTo(String value) {
            addCriterion("CS_SHIPNAME =", value, "shipname");
            return (Criteria) this;
        }

        public Criteria andShipnameNotEqualTo(String value) {
            addCriterion("CS_SHIPNAME <>", value, "shipname");
            return (Criteria) this;
        }

        public Criteria andShipnameGreaterThan(String value) {
            addCriterion("CS_SHIPNAME >", value, "shipname");
            return (Criteria) this;
        }

        public Criteria andShipnameGreaterThanOrEqualTo(String value) {
            addCriterion("CS_SHIPNAME >=", value, "shipname");
            return (Criteria) this;
        }

        public Criteria andShipnameLessThan(String value) {
            addCriterion("CS_SHIPNAME <", value, "shipname");
            return (Criteria) this;
        }

        public Criteria andShipnameLessThanOrEqualTo(String value) {
            addCriterion("CS_SHIPNAME <=", value, "shipname");
            return (Criteria) this;
        }

        public Criteria andShipnameLike(String value) {
            addCriterion("CS_SHIPNAME like", value, "shipname");
            return (Criteria) this;
        }

        public Criteria andShipnameNotLike(String value) {
            addCriterion("CS_SHIPNAME not like", value, "shipname");
            return (Criteria) this;
        }

        public Criteria andShipnameIn(List<String> values) {
            addCriterion("CS_SHIPNAME in", values, "shipname");
            return (Criteria) this;
        }

        public Criteria andShipnameNotIn(List<String> values) {
            addCriterion("CS_SHIPNAME not in", values, "shipname");
            return (Criteria) this;
        }

        public Criteria andShipnameBetween(String value1, String value2) {
            addCriterion("CS_SHIPNAME between", value1, value2, "shipname");
            return (Criteria) this;
        }

        public Criteria andShipnameNotBetween(String value1, String value2) {
            addCriterion("CS_SHIPNAME not between", value1, value2, "shipname");
            return (Criteria) this;
        }

        public Criteria andCallsignIsNull() {
            addCriterion("CS_CALLSIGN is null");
            return (Criteria) this;
        }

        public Criteria andCallsignIsNotNull() {
            addCriterion("CS_CALLSIGN is not null");
            return (Criteria) this;
        }

        public Criteria andCallsignEqualTo(String value) {
            addCriterion("CS_CALLSIGN =", value, "callsign");
            return (Criteria) this;
        }

        public Criteria andCallsignNotEqualTo(String value) {
            addCriterion("CS_CALLSIGN <>", value, "callsign");
            return (Criteria) this;
        }

        public Criteria andCallsignGreaterThan(String value) {
            addCriterion("CS_CALLSIGN >", value, "callsign");
            return (Criteria) this;
        }

        public Criteria andCallsignGreaterThanOrEqualTo(String value) {
            addCriterion("CS_CALLSIGN >=", value, "callsign");
            return (Criteria) this;
        }

        public Criteria andCallsignLessThan(String value) {
            addCriterion("CS_CALLSIGN <", value, "callsign");
            return (Criteria) this;
        }

        public Criteria andCallsignLessThanOrEqualTo(String value) {
            addCriterion("CS_CALLSIGN <=", value, "callsign");
            return (Criteria) this;
        }

        public Criteria andCallsignLike(String value) {
            addCriterion("CS_CALLSIGN like", value, "callsign");
            return (Criteria) this;
        }

        public Criteria andCallsignNotLike(String value) {
            addCriterion("CS_CALLSIGN not like", value, "callsign");
            return (Criteria) this;
        }

        public Criteria andCallsignIn(List<String> values) {
            addCriterion("CS_CALLSIGN in", values, "callsign");
            return (Criteria) this;
        }

        public Criteria andCallsignNotIn(List<String> values) {
            addCriterion("CS_CALLSIGN not in", values, "callsign");
            return (Criteria) this;
        }

        public Criteria andCallsignBetween(String value1, String value2) {
            addCriterion("CS_CALLSIGN between", value1, value2, "callsign");
            return (Criteria) this;
        }

        public Criteria andCallsignNotBetween(String value1, String value2) {
            addCriterion("CS_CALLSIGN not between", value1, value2, "callsign");
            return (Criteria) this;
        }

        public Criteria andShipmaterialIsNull() {
            addCriterion("CS_SHIPMATERIAL is null");
            return (Criteria) this;
        }

        public Criteria andShipmaterialIsNotNull() {
            addCriterion("CS_SHIPMATERIAL is not null");
            return (Criteria) this;
        }

        public Criteria andShipmaterialEqualTo(String value) {
            addCriterion("CS_SHIPMATERIAL =", value, "shipmaterial");
            return (Criteria) this;
        }

        public Criteria andShipmaterialNotEqualTo(String value) {
            addCriterion("CS_SHIPMATERIAL <>", value, "shipmaterial");
            return (Criteria) this;
        }

        public Criteria andShipmaterialGreaterThan(String value) {
            addCriterion("CS_SHIPMATERIAL >", value, "shipmaterial");
            return (Criteria) this;
        }

        public Criteria andShipmaterialGreaterThanOrEqualTo(String value) {
            addCriterion("CS_SHIPMATERIAL >=", value, "shipmaterial");
            return (Criteria) this;
        }

        public Criteria andShipmaterialLessThan(String value) {
            addCriterion("CS_SHIPMATERIAL <", value, "shipmaterial");
            return (Criteria) this;
        }

        public Criteria andShipmaterialLessThanOrEqualTo(String value) {
            addCriterion("CS_SHIPMATERIAL <=", value, "shipmaterial");
            return (Criteria) this;
        }

        public Criteria andShipmaterialLike(String value) {
            addCriterion("CS_SHIPMATERIAL like", value, "shipmaterial");
            return (Criteria) this;
        }

        public Criteria andShipmaterialNotLike(String value) {
            addCriterion("CS_SHIPMATERIAL not like", value, "shipmaterial");
            return (Criteria) this;
        }

        public Criteria andShipmaterialIn(List<String> values) {
            addCriterion("CS_SHIPMATERIAL in", values, "shipmaterial");
            return (Criteria) this;
        }

        public Criteria andShipmaterialNotIn(List<String> values) {
            addCriterion("CS_SHIPMATERIAL not in", values, "shipmaterial");
            return (Criteria) this;
        }

        public Criteria andShipmaterialBetween(String value1, String value2) {
            addCriterion("CS_SHIPMATERIAL between", value1, value2, "shipmaterial");
            return (Criteria) this;
        }

        public Criteria andShipmaterialNotBetween(String value1, String value2) {
            addCriterion("CS_SHIPMATERIAL not between", value1, value2, "shipmaterial");
            return (Criteria) this;
        }

        public Criteria andShipnameplanIsNull() {
            addCriterion("CS_SHIPNAMEPLAN is null");
            return (Criteria) this;
        }

        public Criteria andShipnameplanIsNotNull() {
            addCriterion("CS_SHIPNAMEPLAN is not null");
            return (Criteria) this;
        }

        public Criteria andShipnameplanEqualTo(String value) {
            addCriterion("CS_SHIPNAMEPLAN =", value, "shipnameplan");
            return (Criteria) this;
        }

        public Criteria andShipnameplanNotEqualTo(String value) {
            addCriterion("CS_SHIPNAMEPLAN <>", value, "shipnameplan");
            return (Criteria) this;
        }

        public Criteria andShipnameplanGreaterThan(String value) {
            addCriterion("CS_SHIPNAMEPLAN >", value, "shipnameplan");
            return (Criteria) this;
        }

        public Criteria andShipnameplanGreaterThanOrEqualTo(String value) {
            addCriterion("CS_SHIPNAMEPLAN >=", value, "shipnameplan");
            return (Criteria) this;
        }

        public Criteria andShipnameplanLessThan(String value) {
            addCriterion("CS_SHIPNAMEPLAN <", value, "shipnameplan");
            return (Criteria) this;
        }

        public Criteria andShipnameplanLessThanOrEqualTo(String value) {
            addCriterion("CS_SHIPNAMEPLAN <=", value, "shipnameplan");
            return (Criteria) this;
        }

        public Criteria andShipnameplanLike(String value) {
            addCriterion("CS_SHIPNAMEPLAN like", value, "shipnameplan");
            return (Criteria) this;
        }

        public Criteria andShipnameplanNotLike(String value) {
            addCriterion("CS_SHIPNAMEPLAN not like", value, "shipnameplan");
            return (Criteria) this;
        }

        public Criteria andShipnameplanIn(List<String> values) {
            addCriterion("CS_SHIPNAMEPLAN in", values, "shipnameplan");
            return (Criteria) this;
        }

        public Criteria andShipnameplanNotIn(List<String> values) {
            addCriterion("CS_SHIPNAMEPLAN not in", values, "shipnameplan");
            return (Criteria) this;
        }

        public Criteria andShipnameplanBetween(String value1, String value2) {
            addCriterion("CS_SHIPNAMEPLAN between", value1, value2, "shipnameplan");
            return (Criteria) this;
        }

        public Criteria andShipnameplanNotBetween(String value1, String value2) {
            addCriterion("CS_SHIPNAMEPLAN not between", value1, value2, "shipnameplan");
            return (Criteria) this;
        }

        public Criteria andModelwidthIsNull() {
            addCriterion("CS_MODELWIDTH is null");
            return (Criteria) this;
        }

        public Criteria andModelwidthIsNotNull() {
            addCriterion("CS_MODELWIDTH is not null");
            return (Criteria) this;
        }

        public Criteria andModelwidthEqualTo(String value) {
            addCriterion("CS_MODELWIDTH =", value, "modelwidth");
            return (Criteria) this;
        }

        public Criteria andModelwidthNotEqualTo(String value) {
            addCriterion("CS_MODELWIDTH <>", value, "modelwidth");
            return (Criteria) this;
        }

        public Criteria andModelwidthGreaterThan(String value) {
            addCriterion("CS_MODELWIDTH >", value, "modelwidth");
            return (Criteria) this;
        }

        public Criteria andModelwidthGreaterThanOrEqualTo(String value) {
            addCriterion("CS_MODELWIDTH >=", value, "modelwidth");
            return (Criteria) this;
        }

        public Criteria andModelwidthLessThan(String value) {
            addCriterion("CS_MODELWIDTH <", value, "modelwidth");
            return (Criteria) this;
        }

        public Criteria andModelwidthLessThanOrEqualTo(String value) {
            addCriterion("CS_MODELWIDTH <=", value, "modelwidth");
            return (Criteria) this;
        }

        public Criteria andModelwidthLike(String value) {
            addCriterion("CS_MODELWIDTH like", value, "modelwidth");
            return (Criteria) this;
        }

        public Criteria andModelwidthNotLike(String value) {
            addCriterion("CS_MODELWIDTH not like", value, "modelwidth");
            return (Criteria) this;
        }

        public Criteria andModelwidthIn(List<String> values) {
            addCriterion("CS_MODELWIDTH in", values, "modelwidth");
            return (Criteria) this;
        }

        public Criteria andModelwidthNotIn(List<String> values) {
            addCriterion("CS_MODELWIDTH not in", values, "modelwidth");
            return (Criteria) this;
        }

        public Criteria andModelwidthBetween(String value1, String value2) {
            addCriterion("CS_MODELWIDTH between", value1, value2, "modelwidth");
            return (Criteria) this;
        }

        public Criteria andModelwidthNotBetween(String value1, String value2) {
            addCriterion("CS_MODELWIDTH not between", value1, value2, "modelwidth");
            return (Criteria) this;
        }

        public Criteria andModeldepthIsNull() {
            addCriterion("CS_MODELDEPTH is null");
            return (Criteria) this;
        }

        public Criteria andModeldepthIsNotNull() {
            addCriterion("CS_MODELDEPTH is not null");
            return (Criteria) this;
        }

        public Criteria andModeldepthEqualTo(String value) {
            addCriterion("CS_MODELDEPTH =", value, "modeldepth");
            return (Criteria) this;
        }

        public Criteria andModeldepthNotEqualTo(String value) {
            addCriterion("CS_MODELDEPTH <>", value, "modeldepth");
            return (Criteria) this;
        }

        public Criteria andModeldepthGreaterThan(String value) {
            addCriterion("CS_MODELDEPTH >", value, "modeldepth");
            return (Criteria) this;
        }

        public Criteria andModeldepthGreaterThanOrEqualTo(String value) {
            addCriterion("CS_MODELDEPTH >=", value, "modeldepth");
            return (Criteria) this;
        }

        public Criteria andModeldepthLessThan(String value) {
            addCriterion("CS_MODELDEPTH <", value, "modeldepth");
            return (Criteria) this;
        }

        public Criteria andModeldepthLessThanOrEqualTo(String value) {
            addCriterion("CS_MODELDEPTH <=", value, "modeldepth");
            return (Criteria) this;
        }

        public Criteria andModeldepthLike(String value) {
            addCriterion("CS_MODELDEPTH like", value, "modeldepth");
            return (Criteria) this;
        }

        public Criteria andModeldepthNotLike(String value) {
            addCriterion("CS_MODELDEPTH not like", value, "modeldepth");
            return (Criteria) this;
        }

        public Criteria andModeldepthIn(List<String> values) {
            addCriterion("CS_MODELDEPTH in", values, "modeldepth");
            return (Criteria) this;
        }

        public Criteria andModeldepthNotIn(List<String> values) {
            addCriterion("CS_MODELDEPTH not in", values, "modeldepth");
            return (Criteria) this;
        }

        public Criteria andModeldepthBetween(String value1, String value2) {
            addCriterion("CS_MODELDEPTH between", value1, value2, "modeldepth");
            return (Criteria) this;
        }

        public Criteria andModeldepthNotBetween(String value1, String value2) {
            addCriterion("CS_MODELDEPTH not between", value1, value2, "modeldepth");
            return (Criteria) this;
        }

        public Criteria andFreshwatervIsNull() {
            addCriterion("CS_FRESHWATERV is null");
            return (Criteria) this;
        }

        public Criteria andFreshwatervIsNotNull() {
            addCriterion("CS_FRESHWATERV is not null");
            return (Criteria) this;
        }

        public Criteria andFreshwatervEqualTo(String value) {
            addCriterion("CS_FRESHWATERV =", value, "freshwaterv");
            return (Criteria) this;
        }

        public Criteria andFreshwatervNotEqualTo(String value) {
            addCriterion("CS_FRESHWATERV <>", value, "freshwaterv");
            return (Criteria) this;
        }

        public Criteria andFreshwatervGreaterThan(String value) {
            addCriterion("CS_FRESHWATERV >", value, "freshwaterv");
            return (Criteria) this;
        }

        public Criteria andFreshwatervGreaterThanOrEqualTo(String value) {
            addCriterion("CS_FRESHWATERV >=", value, "freshwaterv");
            return (Criteria) this;
        }

        public Criteria andFreshwatervLessThan(String value) {
            addCriterion("CS_FRESHWATERV <", value, "freshwaterv");
            return (Criteria) this;
        }

        public Criteria andFreshwatervLessThanOrEqualTo(String value) {
            addCriterion("CS_FRESHWATERV <=", value, "freshwaterv");
            return (Criteria) this;
        }

        public Criteria andFreshwatervLike(String value) {
            addCriterion("CS_FRESHWATERV like", value, "freshwaterv");
            return (Criteria) this;
        }

        public Criteria andFreshwatervNotLike(String value) {
            addCriterion("CS_FRESHWATERV not like", value, "freshwaterv");
            return (Criteria) this;
        }

        public Criteria andFreshwatervIn(List<String> values) {
            addCriterion("CS_FRESHWATERV in", values, "freshwaterv");
            return (Criteria) this;
        }

        public Criteria andFreshwatervNotIn(List<String> values) {
            addCriterion("CS_FRESHWATERV not in", values, "freshwaterv");
            return (Criteria) this;
        }

        public Criteria andFreshwatervBetween(String value1, String value2) {
            addCriterion("CS_FRESHWATERV between", value1, value2, "freshwaterv");
            return (Criteria) this;
        }

        public Criteria andFreshwatervNotBetween(String value1, String value2) {
            addCriterion("CS_FRESHWATERV not between", value1, value2, "freshwaterv");
            return (Criteria) this;
        }

        public Criteria andBollardpullIsNull() {
            addCriterion("CS_BOLLARDPULL is null");
            return (Criteria) this;
        }

        public Criteria andBollardpullIsNotNull() {
            addCriterion("CS_BOLLARDPULL is not null");
            return (Criteria) this;
        }

        public Criteria andBollardpullEqualTo(String value) {
            addCriterion("CS_BOLLARDPULL =", value, "bollardpull");
            return (Criteria) this;
        }

        public Criteria andBollardpullNotEqualTo(String value) {
            addCriterion("CS_BOLLARDPULL <>", value, "bollardpull");
            return (Criteria) this;
        }

        public Criteria andBollardpullGreaterThan(String value) {
            addCriterion("CS_BOLLARDPULL >", value, "bollardpull");
            return (Criteria) this;
        }

        public Criteria andBollardpullGreaterThanOrEqualTo(String value) {
            addCriterion("CS_BOLLARDPULL >=", value, "bollardpull");
            return (Criteria) this;
        }

        public Criteria andBollardpullLessThan(String value) {
            addCriterion("CS_BOLLARDPULL <", value, "bollardpull");
            return (Criteria) this;
        }

        public Criteria andBollardpullLessThanOrEqualTo(String value) {
            addCriterion("CS_BOLLARDPULL <=", value, "bollardpull");
            return (Criteria) this;
        }

        public Criteria andBollardpullLike(String value) {
            addCriterion("CS_BOLLARDPULL like", value, "bollardpull");
            return (Criteria) this;
        }

        public Criteria andBollardpullNotLike(String value) {
            addCriterion("CS_BOLLARDPULL not like", value, "bollardpull");
            return (Criteria) this;
        }

        public Criteria andBollardpullIn(List<String> values) {
            addCriterion("CS_BOLLARDPULL in", values, "bollardpull");
            return (Criteria) this;
        }

        public Criteria andBollardpullNotIn(List<String> values) {
            addCriterion("CS_BOLLARDPULL not in", values, "bollardpull");
            return (Criteria) this;
        }

        public Criteria andBollardpullBetween(String value1, String value2) {
            addCriterion("CS_BOLLARDPULL between", value1, value2, "bollardpull");
            return (Criteria) this;
        }

        public Criteria andBollardpullNotBetween(String value1, String value2) {
            addCriterion("CS_BOLLARDPULL not between", value1, value2, "bollardpull");
            return (Criteria) this;
        }

        public Criteria andPowerIsNull() {
            addCriterion("CS_POWER is null");
            return (Criteria) this;
        }

        public Criteria andPowerIsNotNull() {
            addCriterion("CS_POWER is not null");
            return (Criteria) this;
        }

        public Criteria andPowerEqualTo(String value) {
            addCriterion("CS_POWER =", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerNotEqualTo(String value) {
            addCriterion("CS_POWER <>", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerGreaterThan(String value) {
            addCriterion("CS_POWER >", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerGreaterThanOrEqualTo(String value) {
            addCriterion("CS_POWER >=", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerLessThan(String value) {
            addCriterion("CS_POWER <", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerLessThanOrEqualTo(String value) {
            addCriterion("CS_POWER <=", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerLike(String value) {
            addCriterion("CS_POWER like", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerNotLike(String value) {
            addCriterion("CS_POWER not like", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerIn(List<String> values) {
            addCriterion("CS_POWER in", values, "power");
            return (Criteria) this;
        }

        public Criteria andPowerNotIn(List<String> values) {
            addCriterion("CS_POWER not in", values, "power");
            return (Criteria) this;
        }

        public Criteria andPowerBetween(float value1, float value2) {
            addCriterion("to_number(CS_POWER) between", value1, value2, "power");
            return (Criteria) this;
        }

        public Criteria andPowerNotBetween(String value1, String value2) {
            addCriterion("CS_POWER not between", value1, value2, "power");
            return (Criteria) this;
        }

        public Criteria andCompletdateIsNull() {
            addCriterion("CS_COMPLETDATE is null");
            return (Criteria) this;
        }

        public Criteria andCompletdateIsNotNull() {
            addCriterion("CS_COMPLETDATE is not null");
            return (Criteria) this;
        }

        public Criteria andCompletdateEqualTo(String value) {
            addCriterion("CS_COMPLETDATE =", value, "completdate");
            return (Criteria) this;
        }

        public Criteria andCompletdateNotEqualTo(String value) {
            addCriterion("CS_COMPLETDATE <>", value, "completdate");
            return (Criteria) this;
        }

        public Criteria andCompletdateGreaterThan(String value) {
            addCriterion("CS_COMPLETDATE >", value, "completdate");
            return (Criteria) this;
        }

        public Criteria andCompletdateGreaterThanOrEqualTo(String value) {
            addCriterion("CS_COMPLETDATE >=", value, "completdate");
            return (Criteria) this;
        }

        public Criteria andCompletdateLessThan(String value) {
            addCriterion("CS_COMPLETDATE <", value, "completdate");
            return (Criteria) this;
        }

        public Criteria andCompletdateLessThanOrEqualTo(String value) {
            addCriterion("CS_COMPLETDATE <=", value, "completdate");
            return (Criteria) this;
        }

        public Criteria andCompletdateLike(String value) {
            addCriterion("CS_COMPLETDATE like", value, "completdate");
            return (Criteria) this;
        }

        public Criteria andCompletdateNotLike(String value) {
            addCriterion("CS_COMPLETDATE not like", value, "completdate");
            return (Criteria) this;
        }

        public Criteria andCompletdateIn(List<String> values) {
            addCriterion("CS_COMPLETDATE in", values, "completdate");
            return (Criteria) this;
        }

        public Criteria andCompletdateNotIn(List<String> values) {
            addCriterion("CS_COMPLETDATE not in", values, "completdate");
            return (Criteria) this;
        }

        public Criteria andCompletdateBetween(String value1, String value2) {
            addCriterion("CS_COMPLETDATE between", value1, value2, "completdate");
            return (Criteria) this;
        }

        public Criteria andCompletdateNotBetween(String value1, String value2) {
            addCriterion("CS_COMPLETDATE not between", value1, value2, "completdate");
            return (Criteria) this;
        }

        public Criteria andDrawnoIsNull() {
            addCriterion("CS_DRAWNO is null");
            return (Criteria) this;
        }

        public Criteria andDrawnoIsNotNull() {
            addCriterion("CS_DRAWNO is not null");
            return (Criteria) this;
        }

        public Criteria andDrawnoEqualTo(String value) {
            addCriterion("CS_DRAWNO =", value, "drawno");
            return (Criteria) this;
        }

        public Criteria andDrawnoNotEqualTo(String value) {
            addCriterion("CS_DRAWNO <>", value, "drawno");
            return (Criteria) this;
        }

        public Criteria andDrawnoGreaterThan(String value) {
            addCriterion("CS_DRAWNO >", value, "drawno");
            return (Criteria) this;
        }

        public Criteria andDrawnoGreaterThanOrEqualTo(String value) {
            addCriterion("CS_DRAWNO >=", value, "drawno");
            return (Criteria) this;
        }

        public Criteria andDrawnoLessThan(String value) {
            addCriterion("CS_DRAWNO <", value, "drawno");
            return (Criteria) this;
        }

        public Criteria andDrawnoLessThanOrEqualTo(String value) {
            addCriterion("CS_DRAWNO <=", value, "drawno");
            return (Criteria) this;
        }

        public Criteria andDrawnoLike(String value) {
            addCriterion("CS_DRAWNO like", value, "drawno");
            return (Criteria) this;
        }

        public Criteria andDrawnoNotLike(String value) {
            addCriterion("CS_DRAWNO not like", value, "drawno");
            return (Criteria) this;
        }

        public Criteria andDrawnoIn(List<String> values) {
            addCriterion("CS_DRAWNO in", values, "drawno");
            return (Criteria) this;
        }

        public Criteria andDrawnoNotIn(List<String> values) {
            addCriterion("CS_DRAWNO not in", values, "drawno");
            return (Criteria) this;
        }

        public Criteria andDrawnoBetween(String value1, String value2) {
            addCriterion("CS_DRAWNO between", value1, value2, "drawno");
            return (Criteria) this;
        }

        public Criteria andDrawnoNotBetween(String value1, String value2) {
            addCriterion("CS_DRAWNO not between", value1, value2, "drawno");
            return (Criteria) this;
        }

        public Criteria andFreshkeepIsNull() {
            addCriterion("CS_FRESHKEEP is null");
            return (Criteria) this;
        }

        public Criteria andFreshkeepIsNotNull() {
            addCriterion("CS_FRESHKEEP is not null");
            return (Criteria) this;
        }

        public Criteria andFreshkeepEqualTo(String value) {
            addCriterion("CS_FRESHKEEP =", value, "freshkeep");
            return (Criteria) this;
        }

        public Criteria andFreshkeepNotEqualTo(String value) {
            addCriterion("CS_FRESHKEEP <>", value, "freshkeep");
            return (Criteria) this;
        }

        public Criteria andFreshkeepGreaterThan(String value) {
            addCriterion("CS_FRESHKEEP >", value, "freshkeep");
            return (Criteria) this;
        }

        public Criteria andFreshkeepGreaterThanOrEqualTo(String value) {
            addCriterion("CS_FRESHKEEP >=", value, "freshkeep");
            return (Criteria) this;
        }

        public Criteria andFreshkeepLessThan(String value) {
            addCriterion("CS_FRESHKEEP <", value, "freshkeep");
            return (Criteria) this;
        }

        public Criteria andFreshkeepLessThanOrEqualTo(String value) {
            addCriterion("CS_FRESHKEEP <=", value, "freshkeep");
            return (Criteria) this;
        }

        public Criteria andFreshkeepLike(String value) {
            addCriterion("CS_FRESHKEEP like", value, "freshkeep");
            return (Criteria) this;
        }

        public Criteria andFreshkeepNotLike(String value) {
            addCriterion("CS_FRESHKEEP not like", value, "freshkeep");
            return (Criteria) this;
        }

        public Criteria andFreshkeepIn(List<String> values) {
            addCriterion("CS_FRESHKEEP in", values, "freshkeep");
            return (Criteria) this;
        }

        public Criteria andFreshkeepNotIn(List<String> values) {
            addCriterion("CS_FRESHKEEP not in", values, "freshkeep");
            return (Criteria) this;
        }

        public Criteria andFreshkeepBetween(String value1, String value2) {
            addCriterion("CS_FRESHKEEP between", value1, value2, "freshkeep");
            return (Criteria) this;
        }

        public Criteria andFreshkeepNotBetween(String value1, String value2) {
            addCriterion("CS_FRESHKEEP not between", value1, value2, "freshkeep");
            return (Criteria) this;
        }

        public Criteria andDesspeedIsNull() {
            addCriterion("CS_DESSPEED is null");
            return (Criteria) this;
        }

        public Criteria andDesspeedIsNotNull() {
            addCriterion("CS_DESSPEED is not null");
            return (Criteria) this;
        }

        public Criteria andDesspeedEqualTo(String value) {
            addCriterion("CS_DESSPEED =", value, "desspeed");
            return (Criteria) this;
        }

        public Criteria andDesspeedNotEqualTo(String value) {
            addCriterion("CS_DESSPEED <>", value, "desspeed");
            return (Criteria) this;
        }

        public Criteria andDesspeedGreaterThan(String value) {
            addCriterion("CS_DESSPEED >", value, "desspeed");
            return (Criteria) this;
        }

        public Criteria andDesspeedGreaterThanOrEqualTo(String value) {
            addCriterion("CS_DESSPEED >=", value, "desspeed");
            return (Criteria) this;
        }

        public Criteria andDesspeedLessThan(String value) {
            addCriterion("CS_DESSPEED <", value, "desspeed");
            return (Criteria) this;
        }

        public Criteria andDesspeedLessThanOrEqualTo(String value) {
            addCriterion("CS_DESSPEED <=", value, "desspeed");
            return (Criteria) this;
        }

        public Criteria andDesspeedLike(String value) {
            addCriterion("CS_DESSPEED like", value, "desspeed");
            return (Criteria) this;
        }

        public Criteria andDesspeedNotLike(String value) {
            addCriterion("CS_DESSPEED not like", value, "desspeed");
            return (Criteria) this;
        }

        public Criteria andDesspeedIn(List<String> values) {
            addCriterion("CS_DESSPEED in", values, "desspeed");
            return (Criteria) this;
        }

        public Criteria andDesspeedNotIn(List<String> values) {
            addCriterion("CS_DESSPEED not in", values, "desspeed");
            return (Criteria) this;
        }

        public Criteria andDesspeedBetween(String value1, String value2) {
            addCriterion("CS_DESSPEED between", value1, value2, "desspeed");
            return (Criteria) this;
        }

        public Criteria andDesspeedNotBetween(String value1, String value2) {
            addCriterion("CS_DESSPEED not between", value1, value2, "desspeed");
            return (Criteria) this;
        }

        public Criteria andCrewquotaIsNull() {
            addCriterion("CS_CREWQUOTA is null");
            return (Criteria) this;
        }

        public Criteria andCrewquotaIsNotNull() {
            addCriterion("CS_CREWQUOTA is not null");
            return (Criteria) this;
        }

        public Criteria andCrewquotaEqualTo(String value) {
            addCriterion("CS_CREWQUOTA =", value, "crewquota");
            return (Criteria) this;
        }

        public Criteria andCrewquotaNotEqualTo(String value) {
            addCriterion("CS_CREWQUOTA <>", value, "crewquota");
            return (Criteria) this;
        }

        public Criteria andCrewquotaGreaterThan(String value) {
            addCriterion("CS_CREWQUOTA >", value, "crewquota");
            return (Criteria) this;
        }

        public Criteria andCrewquotaGreaterThanOrEqualTo(String value) {
            addCriterion("CS_CREWQUOTA >=", value, "crewquota");
            return (Criteria) this;
        }

        public Criteria andCrewquotaLessThan(String value) {
            addCriterion("CS_CREWQUOTA <", value, "crewquota");
            return (Criteria) this;
        }

        public Criteria andCrewquotaLessThanOrEqualTo(String value) {
            addCriterion("CS_CREWQUOTA <=", value, "crewquota");
            return (Criteria) this;
        }

        public Criteria andCrewquotaLike(String value) {
            addCriterion("CS_CREWQUOTA like", value, "crewquota");
            return (Criteria) this;
        }

        public Criteria andCrewquotaNotLike(String value) {
            addCriterion("CS_CREWQUOTA not like", value, "crewquota");
            return (Criteria) this;
        }

        public Criteria andCrewquotaIn(List<String> values) {
            addCriterion("CS_CREWQUOTA in", values, "crewquota");
            return (Criteria) this;
        }

        public Criteria andCrewquotaNotIn(List<String> values) {
            addCriterion("CS_CREWQUOTA not in", values, "crewquota");
            return (Criteria) this;
        }

        public Criteria andCrewquotaBetween(String value1, String value2) {
            addCriterion("CS_CREWQUOTA between", value1, value2, "crewquota");
            return (Criteria) this;
        }

        public Criteria andCrewquotaNotBetween(String value1, String value2) {
            addCriterion("CS_CREWQUOTA not between", value1, value2, "crewquota");
            return (Criteria) this;
        }

        public Criteria andFishcubIsNull() {
            addCriterion("CS_FISHCUB is null");
            return (Criteria) this;
        }

        public Criteria andFishcubIsNotNull() {
            addCriterion("CS_FISHCUB is not null");
            return (Criteria) this;
        }

        public Criteria andFishcubEqualTo(String value) {
            addCriterion("CS_FISHCUB =", value, "fishcub");
            return (Criteria) this;
        }

        public Criteria andFishcubNotEqualTo(String value) {
            addCriterion("CS_FISHCUB <>", value, "fishcub");
            return (Criteria) this;
        }

        public Criteria andFishcubGreaterThan(String value) {
            addCriterion("CS_FISHCUB >", value, "fishcub");
            return (Criteria) this;
        }

        public Criteria andFishcubGreaterThanOrEqualTo(String value) {
            addCriterion("CS_FISHCUB >=", value, "fishcub");
            return (Criteria) this;
        }

        public Criteria andFishcubLessThan(String value) {
            addCriterion("CS_FISHCUB <", value, "fishcub");
            return (Criteria) this;
        }

        public Criteria andFishcubLessThanOrEqualTo(String value) {
            addCriterion("CS_FISHCUB <=", value, "fishcub");
            return (Criteria) this;
        }

        public Criteria andFishcubLike(String value) {
            addCriterion("CS_FISHCUB like", value, "fishcub");
            return (Criteria) this;
        }

        public Criteria andFishcubNotLike(String value) {
            addCriterion("CS_FISHCUB not like", value, "fishcub");
            return (Criteria) this;
        }

        public Criteria andFishcubIn(List<String> values) {
            addCriterion("CS_FISHCUB in", values, "fishcub");
            return (Criteria) this;
        }

        public Criteria andFishcubNotIn(List<String> values) {
            addCriterion("CS_FISHCUB not in", values, "fishcub");
            return (Criteria) this;
        }

        public Criteria andFishcubBetween(String value1, String value2) {
            addCriterion("CS_FISHCUB between", value1, value2, "fishcub");
            return (Criteria) this;
        }

        public Criteria andFishcubNotBetween(String value1, String value2) {
            addCriterion("CS_FISHCUB not between", value1, value2, "fishcub");
            return (Criteria) this;
        }

        public Criteria andPropellereffIsNull() {
            addCriterion("CS_PROPELLEREFF is null");
            return (Criteria) this;
        }

        public Criteria andPropellereffIsNotNull() {
            addCriterion("CS_PROPELLEREFF is not null");
            return (Criteria) this;
        }

        public Criteria andPropellereffEqualTo(String value) {
            addCriterion("CS_PROPELLEREFF =", value, "propellereff");
            return (Criteria) this;
        }

        public Criteria andPropellereffNotEqualTo(String value) {
            addCriterion("CS_PROPELLEREFF <>", value, "propellereff");
            return (Criteria) this;
        }

        public Criteria andPropellereffGreaterThan(String value) {
            addCriterion("CS_PROPELLEREFF >", value, "propellereff");
            return (Criteria) this;
        }

        public Criteria andPropellereffGreaterThanOrEqualTo(String value) {
            addCriterion("CS_PROPELLEREFF >=", value, "propellereff");
            return (Criteria) this;
        }

        public Criteria andPropellereffLessThan(String value) {
            addCriterion("CS_PROPELLEREFF <", value, "propellereff");
            return (Criteria) this;
        }

        public Criteria andPropellereffLessThanOrEqualTo(String value) {
            addCriterion("CS_PROPELLEREFF <=", value, "propellereff");
            return (Criteria) this;
        }

        public Criteria andPropellereffLike(String value) {
            addCriterion("CS_PROPELLEREFF like", value, "propellereff");
            return (Criteria) this;
        }

        public Criteria andPropellereffNotLike(String value) {
            addCriterion("CS_PROPELLEREFF not like", value, "propellereff");
            return (Criteria) this;
        }

        public Criteria andPropellereffIn(List<String> values) {
            addCriterion("CS_PROPELLEREFF in", values, "propellereff");
            return (Criteria) this;
        }

        public Criteria andPropellereffNotIn(List<String> values) {
            addCriterion("CS_PROPELLEREFF not in", values, "propellereff");
            return (Criteria) this;
        }

        public Criteria andPropellereffBetween(String value1, String value2) {
            addCriterion("CS_PROPELLEREFF between", value1, value2, "propellereff");
            return (Criteria) this;
        }

        public Criteria andPropellereffNotBetween(String value1, String value2) {
            addCriterion("CS_PROPELLEREFF not between", value1, value2, "propellereff");
            return (Criteria) this;
        }

        public Criteria andPitchstatusIsNull() {
            addCriterion("CS_PITCHSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andPitchstatusIsNotNull() {
            addCriterion("CS_PITCHSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andPitchstatusEqualTo(String value) {
            addCriterion("CS_PITCHSTATUS =", value, "pitchstatus");
            return (Criteria) this;
        }

        public Criteria andPitchstatusNotEqualTo(String value) {
            addCriterion("CS_PITCHSTATUS <>", value, "pitchstatus");
            return (Criteria) this;
        }

        public Criteria andPitchstatusGreaterThan(String value) {
            addCriterion("CS_PITCHSTATUS >", value, "pitchstatus");
            return (Criteria) this;
        }

        public Criteria andPitchstatusGreaterThanOrEqualTo(String value) {
            addCriterion("CS_PITCHSTATUS >=", value, "pitchstatus");
            return (Criteria) this;
        }

        public Criteria andPitchstatusLessThan(String value) {
            addCriterion("CS_PITCHSTATUS <", value, "pitchstatus");
            return (Criteria) this;
        }

        public Criteria andPitchstatusLessThanOrEqualTo(String value) {
            addCriterion("CS_PITCHSTATUS <=", value, "pitchstatus");
            return (Criteria) this;
        }

        public Criteria andPitchstatusLike(String value) {
            addCriterion("CS_PITCHSTATUS like", value, "pitchstatus");
            return (Criteria) this;
        }

        public Criteria andPitchstatusNotLike(String value) {
            addCriterion("CS_PITCHSTATUS not like", value, "pitchstatus");
            return (Criteria) this;
        }

        public Criteria andPitchstatusIn(List<String> values) {
            addCriterion("CS_PITCHSTATUS in", values, "pitchstatus");
            return (Criteria) this;
        }

        public Criteria andPitchstatusNotIn(List<String> values) {
            addCriterion("CS_PITCHSTATUS not in", values, "pitchstatus");
            return (Criteria) this;
        }

        public Criteria andPitchstatusBetween(String value1, String value2) {
            addCriterion("CS_PITCHSTATUS between", value1, value2, "pitchstatus");
            return (Criteria) this;
        }

        public Criteria andPitchstatusNotBetween(String value1, String value2) {
            addCriterion("CS_PITCHSTATUS not between", value1, value2, "pitchstatus");
            return (Criteria) this;
        }

        public Criteria andShipcodeIsNull() {
            addCriterion("CS_SHIPCODE is null");
            return (Criteria) this;
        }

        public Criteria andShipcodeIsNotNull() {
            addCriterion("CS_SHIPCODE is not null");
            return (Criteria) this;
        }

        public Criteria andShipcodeEqualTo(String value) {
            addCriterion("CS_SHIPCODE =", value, "shipcode");
            return (Criteria) this;
        }

        public Criteria andShipcodeNotEqualTo(String value) {
            addCriterion("CS_SHIPCODE <>", value, "shipcode");
            return (Criteria) this;
        }

        public Criteria andShipcodeGreaterThan(String value) {
            addCriterion("CS_SHIPCODE >", value, "shipcode");
            return (Criteria) this;
        }

        public Criteria andShipcodeGreaterThanOrEqualTo(String value) {
            addCriterion("CS_SHIPCODE >=", value, "shipcode");
            return (Criteria) this;
        }

        public Criteria andShipcodeLessThan(String value) {
            addCriterion("CS_SHIPCODE <", value, "shipcode");
            return (Criteria) this;
        }

        public Criteria andShipcodeLessThanOrEqualTo(String value) {
            addCriterion("CS_SHIPCODE <=", value, "shipcode");
            return (Criteria) this;
        }

        public Criteria andShipcodeLike(String value) {
            addCriterion("CS_SHIPCODE like", value, "shipcode");
            return (Criteria) this;
        }

        public Criteria andShipcodeNotLike(String value) {
            addCriterion("CS_SHIPCODE not like", value, "shipcode");
            return (Criteria) this;
        }

        public Criteria andShipcodeIn(List<String> values) {
            addCriterion("CS_SHIPCODE in", values, "shipcode");
            return (Criteria) this;
        }

        public Criteria andShipcodeNotIn(List<String> values) {
            addCriterion("CS_SHIPCODE not in", values, "shipcode");
            return (Criteria) this;
        }

        public Criteria andShipcodeBetween(String value1, String value2) {
            addCriterion("CS_SHIPCODE between", value1, value2, "shipcode");
            return (Criteria) this;
        }

        public Criteria andShipcodeNotBetween(String value1, String value2) {
            addCriterion("CS_SHIPCODE not between", value1, value2, "shipcode");
            return (Criteria) this;
        }

        public Criteria andShiptypeIsNull() {
            addCriterion("CS_SHIPTYPE is null");
            return (Criteria) this;
        }

        public Criteria andShiptypeIsNotNull() {
            addCriterion("CS_SHIPTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andShiptypeEqualTo(String value) {
            addCriterion("CS_SHIPTYPE =", value, "shiptype");
            return (Criteria) this;
        }

        public Criteria andShiptypeNotEqualTo(String value) {
            addCriterion("CS_SHIPTYPE <>", value, "shiptype");
            return (Criteria) this;
        }

        public Criteria andShiptypeGreaterThan(String value) {
            addCriterion("CS_SHIPTYPE >", value, "shiptype");
            return (Criteria) this;
        }

        public Criteria andShiptypeGreaterThanOrEqualTo(String value) {
            addCriterion("CS_SHIPTYPE >=", value, "shiptype");
            return (Criteria) this;
        }

        public Criteria andShiptypeLessThan(String value) {
            addCriterion("CS_SHIPTYPE <", value, "shiptype");
            return (Criteria) this;
        }

        public Criteria andShiptypeLessThanOrEqualTo(String value) {
            addCriterion("CS_SHIPTYPE <=", value, "shiptype");
            return (Criteria) this;
        }

        public Criteria andShiptypeLike(String value) {
            addCriterion("CS_SHIPTYPE like", value, "shiptype");
            return (Criteria) this;
        }

        public Criteria andShiptypeNotLike(String value) {
            addCriterion("CS_SHIPTYPE not like", value, "shiptype");
            return (Criteria) this;
        }

        public Criteria andShiptypeIn(List<String> values) {
            addCriterion("CS_SHIPTYPE in", values, "shiptype");
            return (Criteria) this;
        }

        public Criteria andShiptypeNotIn(List<String> values) {
            addCriterion("CS_SHIPTYPE not in", values, "shiptype");
            return (Criteria) this;
        }

        public Criteria andShiptypeBetween(String value1, String value2) {
            addCriterion("CS_SHIPTYPE between", value1, value2, "shiptype");
            return (Criteria) this;
        }

        public Criteria andShiptypeNotBetween(String value1, String value2) {
            addCriterion("CS_SHIPTYPE not between", value1, value2, "shiptype");
            return (Criteria) this;
        }

        public Criteria andNavzoneIsNull() {
            addCriterion("CS_NAVZONE is null");
            return (Criteria) this;
        }

        public Criteria andNavzoneIsNotNull() {
            addCriterion("CS_NAVZONE is not null");
            return (Criteria) this;
        }

        public Criteria andNavzoneEqualTo(String value) {
            addCriterion("CS_NAVZONE =", value, "navzone");
            return (Criteria) this;
        }

        public Criteria andNavzoneNotEqualTo(String value) {
            addCriterion("CS_NAVZONE <>", value, "navzone");
            return (Criteria) this;
        }

        public Criteria andNavzoneGreaterThan(String value) {
            addCriterion("CS_NAVZONE >", value, "navzone");
            return (Criteria) this;
        }

        public Criteria andNavzoneGreaterThanOrEqualTo(String value) {
            addCriterion("CS_NAVZONE >=", value, "navzone");
            return (Criteria) this;
        }

        public Criteria andNavzoneLessThan(String value) {
            addCriterion("CS_NAVZONE <", value, "navzone");
            return (Criteria) this;
        }

        public Criteria andNavzoneLessThanOrEqualTo(String value) {
            addCriterion("CS_NAVZONE <=", value, "navzone");
            return (Criteria) this;
        }

        public Criteria andNavzoneLike(String value) {
            addCriterion("CS_NAVZONE like", value, "navzone");
            return (Criteria) this;
        }

        public Criteria andNavzoneNotLike(String value) {
            addCriterion("CS_NAVZONE not like", value, "navzone");
            return (Criteria) this;
        }

        public Criteria andNavzoneIn(List<String> values) {
            addCriterion("CS_NAVZONE in", values, "navzone");
            return (Criteria) this;
        }

        public Criteria andNavzoneNotIn(List<String> values) {
            addCriterion("CS_NAVZONE not in", values, "navzone");
            return (Criteria) this;
        }

        public Criteria andNavzoneBetween(String value1, String value2) {
            addCriterion("CS_NAVZONE between", value1, value2, "navzone");
            return (Criteria) this;
        }

        public Criteria andNavzoneNotBetween(String value1, String value2) {
            addCriterion("CS_NAVZONE not between", value1, value2, "navzone");
            return (Criteria) this;
        }

        public Criteria andShiplengthIsNull() {
            addCriterion("CS_SHIPLENGTH is null");
            return (Criteria) this;
        }

        public Criteria andShiplengthIsNotNull() {
            addCriterion("CS_SHIPLENGTH is not null");
            return (Criteria) this;
        }

        public Criteria andShiplengthEqualTo(String value) {
            addCriterion("CS_SHIPLENGTH =", value, "shiplength");
            return (Criteria) this;
        }

        public Criteria andShiplengthNotEqualTo(String value) {
            addCriterion("CS_SHIPLENGTH <>", value, "shiplength");
            return (Criteria) this;
        }

        public Criteria andShiplengthGreaterThan(int value) {
            addCriterion("to_number(CS_SHIPLENGTH) >", value, "shiplength");
            return (Criteria) this;
        }

        public Criteria andShiplengthGreaterThanOrEqualTo(String value) {
            addCriterion("CS_SHIPLENGTH >=", value, "shiplength");
            return (Criteria) this;
        }

        public Criteria andShiplengthLessThan(String value) {
            addCriterion("CS_SHIPLENGTH <", value, "shiplength");
            return (Criteria) this;
        }

        public Criteria andShiplengthLessThanOrEqualTo(String value) {
            addCriterion("CS_SHIPLENGTH <=", value, "shiplength");
            return (Criteria) this;
        }

        public Criteria andShiplengthLike(String value) {
            addCriterion("CS_SHIPLENGTH like", value, "shiplength");
            return (Criteria) this;
        }

        public Criteria andShiplengthNotLike(String value) {
            addCriterion("CS_SHIPLENGTH not like", value, "shiplength");
            return (Criteria) this;
        }

        public Criteria andShiplengthIn(List<String> values) {
            addCriterion("CS_SHIPLENGTH in", values, "shiplength");
            return (Criteria) this;
        }

        public Criteria andShiplengthNotIn(List<String> values) {
            addCriterion("CS_SHIPLENGTH not in", values, "shiplength");
            return (Criteria) this;
        }

        public Criteria andShiplengthBetween(int value1, int value2) {
            addCriterion("to_number(CS_SHIPLENGTH) between", value1, value2, "shiplength");
            return (Criteria) this;
        }

        public Criteria andShiplengthNotBetween(String value1, String value2) {
            addCriterion("CS_SHIPLENGTH not between", value1, value2, "shiplength");
            return (Criteria) this;
        }

        public Criteria andDesdraftIsNull() {
            addCriterion("CS_DESDRAFT is null");
            return (Criteria) this;
        }

        public Criteria andDesdraftIsNotNull() {
            addCriterion("CS_DESDRAFT is not null");
            return (Criteria) this;
        }

        public Criteria andDesdraftEqualTo(String value) {
            addCriterion("CS_DESDRAFT =", value, "desdraft");
            return (Criteria) this;
        }

        public Criteria andDesdraftNotEqualTo(String value) {
            addCriterion("CS_DESDRAFT <>", value, "desdraft");
            return (Criteria) this;
        }

        public Criteria andDesdraftGreaterThan(String value) {
            addCriterion("CS_DESDRAFT >", value, "desdraft");
            return (Criteria) this;
        }

        public Criteria andDesdraftGreaterThanOrEqualTo(String value) {
            addCriterion("CS_DESDRAFT >=", value, "desdraft");
            return (Criteria) this;
        }

        public Criteria andDesdraftLessThan(String value) {
            addCriterion("CS_DESDRAFT <", value, "desdraft");
            return (Criteria) this;
        }

        public Criteria andDesdraftLessThanOrEqualTo(String value) {
            addCriterion("CS_DESDRAFT <=", value, "desdraft");
            return (Criteria) this;
        }

        public Criteria andDesdraftLike(String value) {
            addCriterion("CS_DESDRAFT like", value, "desdraft");
            return (Criteria) this;
        }

        public Criteria andDesdraftNotLike(String value) {
            addCriterion("CS_DESDRAFT not like", value, "desdraft");
            return (Criteria) this;
        }

        public Criteria andDesdraftIn(List<String> values) {
            addCriterion("CS_DESDRAFT in", values, "desdraft");
            return (Criteria) this;
        }

        public Criteria andDesdraftNotIn(List<String> values) {
            addCriterion("CS_DESDRAFT not in", values, "desdraft");
            return (Criteria) this;
        }

        public Criteria andDesdraftBetween(String value1, String value2) {
            addCriterion("CS_DESDRAFT between", value1, value2, "desdraft");
            return (Criteria) this;
        }

        public Criteria andDesdraftNotBetween(String value1, String value2) {
            addCriterion("CS_DESDRAFT not between", value1, value2, "desdraft");
            return (Criteria) this;
        }

        public Criteria andFreeboardIsNull() {
            addCriterion("CS_FREEBOARD is null");
            return (Criteria) this;
        }

        public Criteria andFreeboardIsNotNull() {
            addCriterion("CS_FREEBOARD is not null");
            return (Criteria) this;
        }

        public Criteria andFreeboardEqualTo(String value) {
            addCriterion("CS_FREEBOARD =", value, "freeboard");
            return (Criteria) this;
        }

        public Criteria andFreeboardNotEqualTo(String value) {
            addCriterion("CS_FREEBOARD <>", value, "freeboard");
            return (Criteria) this;
        }

        public Criteria andFreeboardGreaterThan(String value) {
            addCriterion("CS_FREEBOARD >", value, "freeboard");
            return (Criteria) this;
        }

        public Criteria andFreeboardGreaterThanOrEqualTo(String value) {
            addCriterion("CS_FREEBOARD >=", value, "freeboard");
            return (Criteria) this;
        }

        public Criteria andFreeboardLessThan(String value) {
            addCriterion("CS_FREEBOARD <", value, "freeboard");
            return (Criteria) this;
        }

        public Criteria andFreeboardLessThanOrEqualTo(String value) {
            addCriterion("CS_FREEBOARD <=", value, "freeboard");
            return (Criteria) this;
        }

        public Criteria andFreeboardLike(String value) {
            addCriterion("CS_FREEBOARD like", value, "freeboard");
            return (Criteria) this;
        }

        public Criteria andFreeboardNotLike(String value) {
            addCriterion("CS_FREEBOARD not like", value, "freeboard");
            return (Criteria) this;
        }

        public Criteria andFreeboardIn(List<String> values) {
            addCriterion("CS_FREEBOARD in", values, "freeboard");
            return (Criteria) this;
        }

        public Criteria andFreeboardNotIn(List<String> values) {
            addCriterion("CS_FREEBOARD not in", values, "freeboard");
            return (Criteria) this;
        }

        public Criteria andFreeboardBetween(String value1, String value2) {
            addCriterion("CS_FREEBOARD between", value1, value2, "freeboard");
            return (Criteria) this;
        }

        public Criteria andFreeboardNotBetween(String value1, String value2) {
            addCriterion("CS_FREEBOARD not between", value1, value2, "freeboard");
            return (Criteria) this;
        }

        public Criteria andShipweightIsNull() {
            addCriterion("CS_SHIPWEIGHT is null");
            return (Criteria) this;
        }

        public Criteria andShipweightIsNotNull() {
            addCriterion("CS_SHIPWEIGHT is not null");
            return (Criteria) this;
        }

        public Criteria andShipweightEqualTo(String value) {
            addCriterion("CS_SHIPWEIGHT =", value, "shipweight");
            return (Criteria) this;
        }

        public Criteria andShipweightNotEqualTo(String value) {
            addCriterion("CS_SHIPWEIGHT <>", value, "shipweight");
            return (Criteria) this;
        }

        public Criteria andShipweightGreaterThan(String value) {
            addCriterion("CS_SHIPWEIGHT >", value, "shipweight");
            return (Criteria) this;
        }

        public Criteria andShipweightGreaterThanOrEqualTo(String value) {
            addCriterion("CS_SHIPWEIGHT >=", value, "shipweight");
            return (Criteria) this;
        }

        public Criteria andShipweightLessThan(String value) {
            addCriterion("CS_SHIPWEIGHT <", value, "shipweight");
            return (Criteria) this;
        }

        public Criteria andShipweightLessThanOrEqualTo(String value) {
            addCriterion("CS_SHIPWEIGHT <=", value, "shipweight");
            return (Criteria) this;
        }

        public Criteria andShipweightLike(String value) {
            addCriterion("CS_SHIPWEIGHT like", value, "shipweight");
            return (Criteria) this;
        }

        public Criteria andShipweightNotLike(String value) {
            addCriterion("CS_SHIPWEIGHT not like", value, "shipweight");
            return (Criteria) this;
        }

        public Criteria andShipweightIn(List<String> values) {
            addCriterion("CS_SHIPWEIGHT in", values, "shipweight");
            return (Criteria) this;
        }

        public Criteria andShipweightNotIn(List<String> values) {
            addCriterion("CS_SHIPWEIGHT not in", values, "shipweight");
            return (Criteria) this;
        }

        public Criteria andShipweightBetween(String value1, String value2) {
            addCriterion("CS_SHIPWEIGHT between", value1, value2, "shipweight");
            return (Criteria) this;
        }

        public Criteria andShipweightNotBetween(String value1, String value2) {
            addCriterion("CS_SHIPWEIGHT not between", value1, value2, "shipweight");
            return (Criteria) this;
        }

        public Criteria andTonnageIsNull() {
            addCriterion("CS_TONNAGE is null");
            return (Criteria) this;
        }

        public Criteria andTonnageIsNotNull() {
            addCriterion("CS_TONNAGE is not null");
            return (Criteria) this;
        }

        public Criteria andTonnageEqualTo(String value) {
            addCriterion("CS_TONNAGE =", value, "tonnage");
            return (Criteria) this;
        }

        public Criteria andTonnageNotEqualTo(String value) {
            addCriterion("CS_TONNAGE <>", value, "tonnage");
            return (Criteria) this;
        }

        public Criteria andTonnageGreaterThan(String value) {
            addCriterion("CS_TONNAGE >", value, "tonnage");
            return (Criteria) this;
        }

        public Criteria andTonnageGreaterThanOrEqualTo(String value) {
            addCriterion("CS_TONNAGE >=", value, "tonnage");
            return (Criteria) this;
        }

        public Criteria andTonnageLessThan(String value) {
            addCriterion("CS_TONNAGE <", value, "tonnage");
            return (Criteria) this;
        }

        public Criteria andTonnageLessThanOrEqualTo(String value) {
            addCriterion("CS_TONNAGE <=", value, "tonnage");
            return (Criteria) this;
        }

        public Criteria andTonnageLike(String value) {
            addCriterion("CS_TONNAGE like", value, "tonnage");
            return (Criteria) this;
        }

        public Criteria andTonnageNotLike(String value) {
            addCriterion("CS_TONNAGE not like", value, "tonnage");
            return (Criteria) this;
        }

        public Criteria andTonnageIn(List<String> values) {
            addCriterion("CS_TONNAGE in", values, "tonnage");
            return (Criteria) this;
        }

        public Criteria andTonnageNotIn(List<String> values) {
            addCriterion("CS_TONNAGE not in", values, "tonnage");
            return (Criteria) this;
        }

        public Criteria andTonnageBetween(String value1, String value2) {
            addCriterion("CS_TONNAGE between", value1, value2, "tonnage");
            return (Criteria) this;
        }

        public Criteria andTonnageNotBetween(String value1, String value2) {
            addCriterion("CS_TONNAGE not between", value1, value2, "tonnage");
            return (Criteria) this;
        }

        public Criteria andEntnamedesIsNull() {
            addCriterion("CS_ENTNAMEDES is null");
            return (Criteria) this;
        }

        public Criteria andEntnamedesIsNotNull() {
            addCriterion("CS_ENTNAMEDES is not null");
            return (Criteria) this;
        }

        public Criteria andEntnamedesEqualTo(String value) {
            addCriterion("CS_ENTNAMEDES =", value, "entnamedes");
            return (Criteria) this;
        }

        public Criteria andEntnamedesNotEqualTo(String value) {
            addCriterion("CS_ENTNAMEDES <>", value, "entnamedes");
            return (Criteria) this;
        }

        public Criteria andEntnamedesGreaterThan(String value) {
            addCriterion("CS_ENTNAMEDES >", value, "entnamedes");
            return (Criteria) this;
        }

        public Criteria andEntnamedesGreaterThanOrEqualTo(String value) {
            addCriterion("CS_ENTNAMEDES >=", value, "entnamedes");
            return (Criteria) this;
        }

        public Criteria andEntnamedesLessThan(String value) {
            addCriterion("CS_ENTNAMEDES <", value, "entnamedes");
            return (Criteria) this;
        }

        public Criteria andEntnamedesLessThanOrEqualTo(String value) {
            addCriterion("CS_ENTNAMEDES <=", value, "entnamedes");
            return (Criteria) this;
        }

        public Criteria andEntnamedesLike(String value) {
            addCriterion("CS_ENTNAMEDES like", value, "entnamedes");
            return (Criteria) this;
        }

        public Criteria andEntnamedesNotLike(String value) {
            addCriterion("CS_ENTNAMEDES not like", value, "entnamedes");
            return (Criteria) this;
        }

        public Criteria andEntnamedesIn(List<String> values) {
            addCriterion("CS_ENTNAMEDES in", values, "entnamedes");
            return (Criteria) this;
        }

        public Criteria andEntnamedesNotIn(List<String> values) {
            addCriterion("CS_ENTNAMEDES not in", values, "entnamedes");
            return (Criteria) this;
        }

        public Criteria andEntnamedesBetween(String value1, String value2) {
            addCriterion("CS_ENTNAMEDES between", value1, value2, "entnamedes");
            return (Criteria) this;
        }

        public Criteria andEntnamedesNotBetween(String value1, String value2) {
            addCriterion("CS_ENTNAMEDES not between", value1, value2, "entnamedes");
            return (Criteria) this;
        }

        public Criteria andEntdesidIsNull() {
            addCriterion("CS_ENTDESID is null");
            return (Criteria) this;
        }

        public Criteria andEntdesidIsNotNull() {
            addCriterion("CS_ENTDESID is not null");
            return (Criteria) this;
        }

        public Criteria andEntdesidEqualTo(String value) {
            addCriterion("CS_ENTDESID =", value, "entdesid");
            return (Criteria) this;
        }

        public Criteria andEntdesidNotEqualTo(String value) {
            addCriterion("CS_ENTDESID <>", value, "entdesid");
            return (Criteria) this;
        }

        public Criteria andEntdesidGreaterThan(String value) {
            addCriterion("CS_ENTDESID >", value, "entdesid");
            return (Criteria) this;
        }

        public Criteria andEntdesidGreaterThanOrEqualTo(String value) {
            addCriterion("CS_ENTDESID >=", value, "entdesid");
            return (Criteria) this;
        }

        public Criteria andEntdesidLessThan(String value) {
            addCriterion("CS_ENTDESID <", value, "entdesid");
            return (Criteria) this;
        }

        public Criteria andEntdesidLessThanOrEqualTo(String value) {
            addCriterion("CS_ENTDESID <=", value, "entdesid");
            return (Criteria) this;
        }

        public Criteria andEntdesidLike(String value) {
            addCriterion("CS_ENTDESID like", value, "entdesid");
            return (Criteria) this;
        }

        public Criteria andEntdesidNotLike(String value) {
            addCriterion("CS_ENTDESID not like", value, "entdesid");
            return (Criteria) this;
        }

        public Criteria andEntdesidIn(List<String> values) {
            addCriterion("CS_ENTDESID in", values, "entdesid");
            return (Criteria) this;
        }

        public Criteria andEntdesidNotIn(List<String> values) {
            addCriterion("CS_ENTDESID not in", values, "entdesid");
            return (Criteria) this;
        }

        public Criteria andEntdesidBetween(String value1, String value2) {
            addCriterion("CS_ENTDESID between", value1, value2, "entdesid");
            return (Criteria) this;
        }

        public Criteria andEntdesidNotBetween(String value1, String value2) {
            addCriterion("CS_ENTDESID not between", value1, value2, "entdesid");
            return (Criteria) this;
        }

        public Criteria andShipportIsNull() {
            addCriterion("CS_SHIPPORT is null");
            return (Criteria) this;
        }

        public Criteria andShipportIsNotNull() {
            addCriterion("CS_SHIPPORT is not null");
            return (Criteria) this;
        }

        public Criteria andShipportEqualTo(String value) {
            addCriterion("CS_SHIPPORT =", value, "shipport");
            return (Criteria) this;
        }

        public Criteria andShipportNotEqualTo(String value) {
            addCriterion("CS_SHIPPORT <>", value, "shipport");
            return (Criteria) this;
        }

        public Criteria andShipportGreaterThan(String value) {
            addCriterion("CS_SHIPPORT >", value, "shipport");
            return (Criteria) this;
        }

        public Criteria andShipportGreaterThanOrEqualTo(String value) {
            addCriterion("CS_SHIPPORT >=", value, "shipport");
            return (Criteria) this;
        }

        public Criteria andShipportLessThan(String value) {
            addCriterion("CS_SHIPPORT <", value, "shipport");
            return (Criteria) this;
        }

        public Criteria andShipportLessThanOrEqualTo(String value) {
            addCriterion("CS_SHIPPORT <=", value, "shipport");
            return (Criteria) this;
        }

        public Criteria andShipportLike(String value) {
            addCriterion("CS_SHIPPORT like", value, "shipport");
            return (Criteria) this;
        }

        public Criteria andShipportNotLike(String value) {
            addCriterion("CS_SHIPPORT not like", value, "shipport");
            return (Criteria) this;
        }

        public Criteria andShipportIn(List<String> values) {
            addCriterion("CS_SHIPPORT in", values, "shipport");
            return (Criteria) this;
        }

        public Criteria andShipportNotIn(List<String> values) {
            addCriterion("CS_SHIPPORT not in", values, "shipport");
            return (Criteria) this;
        }

        public Criteria andShipportBetween(String value1, String value2) {
            addCriterion("CS_SHIPPORT between", value1, value2, "shipport");
            return (Criteria) this;
        }

        public Criteria andShipportNotBetween(String value1, String value2) {
            addCriterion("CS_SHIPPORT not between", value1, value2, "shipport");
            return (Criteria) this;
        }

        public Criteria andDecksIsNull() {
            addCriterion("CS_DECKS is null");
            return (Criteria) this;
        }

        public Criteria andDecksIsNotNull() {
            addCriterion("CS_DECKS is not null");
            return (Criteria) this;
        }

        public Criteria andDecksEqualTo(String value) {
            addCriterion("CS_DECKS =", value, "decks");
            return (Criteria) this;
        }

        public Criteria andDecksNotEqualTo(String value) {
            addCriterion("CS_DECKS <>", value, "decks");
            return (Criteria) this;
        }

        public Criteria andDecksGreaterThan(String value) {
            addCriterion("CS_DECKS >", value, "decks");
            return (Criteria) this;
        }

        public Criteria andDecksGreaterThanOrEqualTo(String value) {
            addCriterion("CS_DECKS >=", value, "decks");
            return (Criteria) this;
        }

        public Criteria andDecksLessThan(String value) {
            addCriterion("CS_DECKS <", value, "decks");
            return (Criteria) this;
        }

        public Criteria andDecksLessThanOrEqualTo(String value) {
            addCriterion("CS_DECKS <=", value, "decks");
            return (Criteria) this;
        }

        public Criteria andDecksLike(String value) {
            addCriterion("CS_DECKS like", value, "decks");
            return (Criteria) this;
        }

        public Criteria andDecksNotLike(String value) {
            addCriterion("CS_DECKS not like", value, "decks");
            return (Criteria) this;
        }

        public Criteria andDecksIn(List<String> values) {
            addCriterion("CS_DECKS in", values, "decks");
            return (Criteria) this;
        }

        public Criteria andDecksNotIn(List<String> values) {
            addCriterion("CS_DECKS not in", values, "decks");
            return (Criteria) this;
        }

        public Criteria andDecksBetween(String value1, String value2) {
            addCriterion("CS_DECKS between", value1, value2, "decks");
            return (Criteria) this;
        }

        public Criteria andDecksNotBetween(String value1, String value2) {
            addCriterion("CS_DECKS not between", value1, value2, "decks");
            return (Criteria) this;
        }

        public Criteria andCovshiplengthIsNull() {
            addCriterion("CS_COVSHIPLENGTH is null");
            return (Criteria) this;
        }

        public Criteria andCovshiplengthIsNotNull() {
            addCriterion("CS_COVSHIPLENGTH is not null");
            return (Criteria) this;
        }

        public Criteria andCovshiplengthEqualTo(String value) {
            addCriterion("CS_COVSHIPLENGTH =", value, "covshiplength");
            return (Criteria) this;
        }

        public Criteria andCovshiplengthNotEqualTo(String value) {
            addCriterion("CS_COVSHIPLENGTH <>", value, "covshiplength");
            return (Criteria) this;
        }

        public Criteria andCovshiplengthGreaterThan(String value) {
            addCriterion("CS_COVSHIPLENGTH >", value, "covshiplength");
            return (Criteria) this;
        }

        public Criteria andCovshiplengthGreaterThanOrEqualTo(String value) {
            addCriterion("CS_COVSHIPLENGTH >=", value, "covshiplength");
            return (Criteria) this;
        }

        public Criteria andCovshiplengthLessThan(String value) {
            addCriterion("CS_COVSHIPLENGTH <", value, "covshiplength");
            return (Criteria) this;
        }

        public Criteria andCovshiplengthLessThanOrEqualTo(String value) {
            addCriterion("CS_COVSHIPLENGTH <=", value, "covshiplength");
            return (Criteria) this;
        }

        public Criteria andCovshiplengthLike(String value) {
            addCriterion("CS_COVSHIPLENGTH like", value, "covshiplength");
            return (Criteria) this;
        }

        public Criteria andCovshiplengthNotLike(String value) {
            addCriterion("CS_COVSHIPLENGTH not like", value, "covshiplength");
            return (Criteria) this;
        }

        public Criteria andCovshiplengthIn(List<String> values) {
            addCriterion("CS_COVSHIPLENGTH in", values, "covshiplength");
            return (Criteria) this;
        }

        public Criteria andCovshiplengthNotIn(List<String> values) {
            addCriterion("CS_COVSHIPLENGTH not in", values, "covshiplength");
            return (Criteria) this;
        }

        public Criteria andCovshiplengthBetween(String value1, String value2) {
            addCriterion("CS_COVSHIPLENGTH between", value1, value2, "covshiplength");
            return (Criteria) this;
        }

        public Criteria andCovshiplengthNotBetween(String value1, String value2) {
            addCriterion("CS_COVSHIPLENGTH not between", value1, value2, "covshiplength");
            return (Criteria) this;
        }

        public Criteria andDeswaterIsNull() {
            addCriterion("CS_DESWATER is null");
            return (Criteria) this;
        }

        public Criteria andDeswaterIsNotNull() {
            addCriterion("CS_DESWATER is not null");
            return (Criteria) this;
        }

        public Criteria andDeswaterEqualTo(String value) {
            addCriterion("CS_DESWATER =", value, "deswater");
            return (Criteria) this;
        }

        public Criteria andDeswaterNotEqualTo(String value) {
            addCriterion("CS_DESWATER <>", value, "deswater");
            return (Criteria) this;
        }

        public Criteria andDeswaterGreaterThan(String value) {
            addCriterion("CS_DESWATER >", value, "deswater");
            return (Criteria) this;
        }

        public Criteria andDeswaterGreaterThanOrEqualTo(String value) {
            addCriterion("CS_DESWATER >=", value, "deswater");
            return (Criteria) this;
        }

        public Criteria andDeswaterLessThan(String value) {
            addCriterion("CS_DESWATER <", value, "deswater");
            return (Criteria) this;
        }

        public Criteria andDeswaterLessThanOrEqualTo(String value) {
            addCriterion("CS_DESWATER <=", value, "deswater");
            return (Criteria) this;
        }

        public Criteria andDeswaterLike(String value) {
            addCriterion("CS_DESWATER like", value, "deswater");
            return (Criteria) this;
        }

        public Criteria andDeswaterNotLike(String value) {
            addCriterion("CS_DESWATER not like", value, "deswater");
            return (Criteria) this;
        }

        public Criteria andDeswaterIn(List<String> values) {
            addCriterion("CS_DESWATER in", values, "deswater");
            return (Criteria) this;
        }

        public Criteria andDeswaterNotIn(List<String> values) {
            addCriterion("CS_DESWATER not in", values, "deswater");
            return (Criteria) this;
        }

        public Criteria andDeswaterBetween(String value1, String value2) {
            addCriterion("CS_DESWATER between", value1, value2, "deswater");
            return (Criteria) this;
        }

        public Criteria andDeswaterNotBetween(String value1, String value2) {
            addCriterion("CS_DESWATER not between", value1, value2, "deswater");
            return (Criteria) this;
        }

        public Criteria andOilvIsNull() {
            addCriterion("CS_OILV is null");
            return (Criteria) this;
        }

        public Criteria andOilvIsNotNull() {
            addCriterion("CS_OILV is not null");
            return (Criteria) this;
        }

        public Criteria andOilvEqualTo(String value) {
            addCriterion("CS_OILV =", value, "oilv");
            return (Criteria) this;
        }

        public Criteria andOilvNotEqualTo(String value) {
            addCriterion("CS_OILV <>", value, "oilv");
            return (Criteria) this;
        }

        public Criteria andOilvGreaterThan(String value) {
            addCriterion("CS_OILV >", value, "oilv");
            return (Criteria) this;
        }

        public Criteria andOilvGreaterThanOrEqualTo(String value) {
            addCriterion("CS_OILV >=", value, "oilv");
            return (Criteria) this;
        }

        public Criteria andOilvLessThan(String value) {
            addCriterion("CS_OILV <", value, "oilv");
            return (Criteria) this;
        }

        public Criteria andOilvLessThanOrEqualTo(String value) {
            addCriterion("CS_OILV <=", value, "oilv");
            return (Criteria) this;
        }

        public Criteria andOilvLike(String value) {
            addCriterion("CS_OILV like", value, "oilv");
            return (Criteria) this;
        }

        public Criteria andOilvNotLike(String value) {
            addCriterion("CS_OILV not like", value, "oilv");
            return (Criteria) this;
        }

        public Criteria andOilvIn(List<String> values) {
            addCriterion("CS_OILV in", values, "oilv");
            return (Criteria) this;
        }

        public Criteria andOilvNotIn(List<String> values) {
            addCriterion("CS_OILV not in", values, "oilv");
            return (Criteria) this;
        }

        public Criteria andOilvBetween(String value1, String value2) {
            addCriterion("CS_OILV between", value1, value2, "oilv");
            return (Criteria) this;
        }

        public Criteria andOilvNotBetween(String value1, String value2) {
            addCriterion("CS_OILV not between", value1, value2, "oilv");
            return (Criteria) this;
        }

        public Criteria andBallastIsNull() {
            addCriterion("CS_BALLAST is null");
            return (Criteria) this;
        }

        public Criteria andBallastIsNotNull() {
            addCriterion("CS_BALLAST is not null");
            return (Criteria) this;
        }

        public Criteria andBallastEqualTo(String value) {
            addCriterion("CS_BALLAST =", value, "ballast");
            return (Criteria) this;
        }

        public Criteria andBallastNotEqualTo(String value) {
            addCriterion("CS_BALLAST <>", value, "ballast");
            return (Criteria) this;
        }

        public Criteria andBallastGreaterThan(String value) {
            addCriterion("CS_BALLAST >", value, "ballast");
            return (Criteria) this;
        }

        public Criteria andBallastGreaterThanOrEqualTo(String value) {
            addCriterion("CS_BALLAST >=", value, "ballast");
            return (Criteria) this;
        }

        public Criteria andBallastLessThan(String value) {
            addCriterion("CS_BALLAST <", value, "ballast");
            return (Criteria) this;
        }

        public Criteria andBallastLessThanOrEqualTo(String value) {
            addCriterion("CS_BALLAST <=", value, "ballast");
            return (Criteria) this;
        }

        public Criteria andBallastLike(String value) {
            addCriterion("CS_BALLAST like", value, "ballast");
            return (Criteria) this;
        }

        public Criteria andBallastNotLike(String value) {
            addCriterion("CS_BALLAST not like", value, "ballast");
            return (Criteria) this;
        }

        public Criteria andBallastIn(List<String> values) {
            addCriterion("CS_BALLAST in", values, "ballast");
            return (Criteria) this;
        }

        public Criteria andBallastNotIn(List<String> values) {
            addCriterion("CS_BALLAST not in", values, "ballast");
            return (Criteria) this;
        }

        public Criteria andBallastBetween(String value1, String value2) {
            addCriterion("CS_BALLAST between", value1, value2, "ballast");
            return (Criteria) this;
        }

        public Criteria andBallastNotBetween(String value1, String value2) {
            addCriterion("CS_BALLAST not between", value1, value2, "ballast");
            return (Criteria) this;
        }

        public Criteria andNettonnageIsNull() {
            addCriterion("CS_NETTONNAGE is null");
            return (Criteria) this;
        }

        public Criteria andNettonnageIsNotNull() {
            addCriterion("CS_NETTONNAGE is not null");
            return (Criteria) this;
        }

        public Criteria andNettonnageEqualTo(String value) {
            addCriterion("CS_NETTONNAGE =", value, "nettonnage");
            return (Criteria) this;
        }

        public Criteria andNettonnageNotEqualTo(String value) {
            addCriterion("CS_NETTONNAGE <>", value, "nettonnage");
            return (Criteria) this;
        }

        public Criteria andNettonnageGreaterThan(String value) {
            addCriterion("CS_NETTONNAGE >", value, "nettonnage");
            return (Criteria) this;
        }

        public Criteria andNettonnageGreaterThanOrEqualTo(String value) {
            addCriterion("CS_NETTONNAGE >=", value, "nettonnage");
            return (Criteria) this;
        }

        public Criteria andNettonnageLessThan(String value) {
            addCriterion("CS_NETTONNAGE <", value, "nettonnage");
            return (Criteria) this;
        }

        public Criteria andNettonnageLessThanOrEqualTo(String value) {
            addCriterion("CS_NETTONNAGE <=", value, "nettonnage");
            return (Criteria) this;
        }

        public Criteria andNettonnageLike(String value) {
            addCriterion("CS_NETTONNAGE like", value, "nettonnage");
            return (Criteria) this;
        }

        public Criteria andNettonnageNotLike(String value) {
            addCriterion("CS_NETTONNAGE not like", value, "nettonnage");
            return (Criteria) this;
        }

        public Criteria andNettonnageIn(List<String> values) {
            addCriterion("CS_NETTONNAGE in", values, "nettonnage");
            return (Criteria) this;
        }

        public Criteria andNettonnageNotIn(List<String> values) {
            addCriterion("CS_NETTONNAGE not in", values, "nettonnage");
            return (Criteria) this;
        }

        public Criteria andNettonnageBetween(String value1, String value2) {
            addCriterion("CS_NETTONNAGE between", value1, value2, "nettonnage");
            return (Criteria) this;
        }

        public Criteria andNettonnageNotBetween(String value1, String value2) {
            addCriterion("CS_NETTONNAGE not between", value1, value2, "nettonnage");
            return (Criteria) this;
        }

        public Criteria andEntnamebulIsNull() {
            addCriterion("CS_ENTNAMEBUL is null");
            return (Criteria) this;
        }

        public Criteria andEntnamebulIsNotNull() {
            addCriterion("CS_ENTNAMEBUL is not null");
            return (Criteria) this;
        }

        public Criteria andEntnamebulEqualTo(String value) {
            addCriterion("CS_ENTNAMEBUL =", value, "entnamebul");
            return (Criteria) this;
        }

        public Criteria andEntnamebulNotEqualTo(String value) {
            addCriterion("CS_ENTNAMEBUL <>", value, "entnamebul");
            return (Criteria) this;
        }

        public Criteria andEntnamebulGreaterThan(String value) {
            addCriterion("CS_ENTNAMEBUL >", value, "entnamebul");
            return (Criteria) this;
        }

        public Criteria andEntnamebulGreaterThanOrEqualTo(String value) {
            addCriterion("CS_ENTNAMEBUL >=", value, "entnamebul");
            return (Criteria) this;
        }

        public Criteria andEntnamebulLessThan(String value) {
            addCriterion("CS_ENTNAMEBUL <", value, "entnamebul");
            return (Criteria) this;
        }

        public Criteria andEntnamebulLessThanOrEqualTo(String value) {
            addCriterion("CS_ENTNAMEBUL <=", value, "entnamebul");
            return (Criteria) this;
        }

        public Criteria andEntnamebulLike(String value) {
            addCriterion("CS_ENTNAMEBUL like", value, "entnamebul");
            return (Criteria) this;
        }

        public Criteria andEntnamebulNotLike(String value) {
            addCriterion("CS_ENTNAMEBUL not like", value, "entnamebul");
            return (Criteria) this;
        }

        public Criteria andEntnamebulIn(List<String> values) {
            addCriterion("CS_ENTNAMEBUL in", values, "entnamebul");
            return (Criteria) this;
        }

        public Criteria andEntnamebulNotIn(List<String> values) {
            addCriterion("CS_ENTNAMEBUL not in", values, "entnamebul");
            return (Criteria) this;
        }

        public Criteria andEntnamebulBetween(String value1, String value2) {
            addCriterion("CS_ENTNAMEBUL between", value1, value2, "entnamebul");
            return (Criteria) this;
        }

        public Criteria andEntnamebulNotBetween(String value1, String value2) {
            addCriterion("CS_ENTNAMEBUL not between", value1, value2, "entnamebul");
            return (Criteria) this;
        }

        public Criteria andEntbulidIsNull() {
            addCriterion("CS_ENTBULID is null");
            return (Criteria) this;
        }

        public Criteria andEntbulidIsNotNull() {
            addCriterion("CS_ENTBULID is not null");
            return (Criteria) this;
        }

        public Criteria andEntbulidEqualTo(String value) {
            addCriterion("CS_ENTBULID =", value, "entbulid");
            return (Criteria) this;
        }

        public Criteria andEntbulidNotEqualTo(String value) {
            addCriterion("CS_ENTBULID <>", value, "entbulid");
            return (Criteria) this;
        }

        public Criteria andEntbulidGreaterThan(String value) {
            addCriterion("CS_ENTBULID >", value, "entbulid");
            return (Criteria) this;
        }

        public Criteria andEntbulidGreaterThanOrEqualTo(String value) {
            addCriterion("CS_ENTBULID >=", value, "entbulid");
            return (Criteria) this;
        }

        public Criteria andEntbulidLessThan(String value) {
            addCriterion("CS_ENTBULID <", value, "entbulid");
            return (Criteria) this;
        }

        public Criteria andEntbulidLessThanOrEqualTo(String value) {
            addCriterion("CS_ENTBULID <=", value, "entbulid");
            return (Criteria) this;
        }

        public Criteria andEntbulidLike(String value) {
            addCriterion("CS_ENTBULID like", value, "entbulid");
            return (Criteria) this;
        }

        public Criteria andEntbulidNotLike(String value) {
            addCriterion("CS_ENTBULID not like", value, "entbulid");
            return (Criteria) this;
        }

        public Criteria andEntbulidIn(List<String> values) {
            addCriterion("CS_ENTBULID in", values, "entbulid");
            return (Criteria) this;
        }

        public Criteria andEntbulidNotIn(List<String> values) {
            addCriterion("CS_ENTBULID not in", values, "entbulid");
            return (Criteria) this;
        }

        public Criteria andEntbulidBetween(String value1, String value2) {
            addCriterion("CS_ENTBULID between", value1, value2, "entbulid");
            return (Criteria) this;
        }

        public Criteria andEntbulidNotBetween(String value1, String value2) {
            addCriterion("CS_ENTBULID not between", value1, value2, "entbulid");
            return (Criteria) this;
        }

        public Criteria andOrgidIsNull() {
            addCriterion("CS_ORGID is null");
            return (Criteria) this;
        }

        public Criteria andOrgidIsNotNull() {
            addCriterion("CS_ORGID is not null");
            return (Criteria) this;
        }

        public Criteria andOrgidEqualTo(String value) {
            addCriterion("CS_ORGID =", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidNotEqualTo(String value) {
            addCriterion("CS_ORGID <>", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidGreaterThan(String value) {
            addCriterion("CS_ORGID >", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidGreaterThanOrEqualTo(String value) {
            addCriterion("CS_ORGID >=", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidLessThan(String value) {
            addCriterion("CS_ORGID <", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidLessThanOrEqualTo(String value) {
            addCriterion("CS_ORGID <=", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidLike(String value) {
            addCriterion("CS_ORGID like", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidNotLike(String value) {
            addCriterion("CS_ORGID not like", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidIn(List<String> values) {
            addCriterion("CS_ORGID in", values, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidNotIn(List<String> values) {
            addCriterion("CS_ORGID not in", values, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidBetween(String value1, String value2) {
            addCriterion("CS_ORGID between", value1, value2, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidNotBetween(String value1, String value2) {
            addCriterion("CS_ORGID not between", value1, value2, "orgid");
            return (Criteria) this;
        }

        public Criteria andShiprovnameIsNull() {
            addCriterion("CS_SHIPROVNAME is null");
            return (Criteria) this;
        }

        public Criteria andShiprovnameIsNotNull() {
            addCriterion("CS_SHIPROVNAME is not null");
            return (Criteria) this;
        }

        public Criteria andShiprovnameEqualTo(String value) {
            addCriterion("CS_SHIPROVNAME =", value, "shiprovname");
            return (Criteria) this;
        }

        public Criteria andShiprovnameNotEqualTo(String value) {
            addCriterion("CS_SHIPROVNAME <>", value, "shiprovname");
            return (Criteria) this;
        }

        public Criteria andShiprovnameGreaterThan(String value) {
            addCriterion("CS_SHIPROVNAME >", value, "shiprovname");
            return (Criteria) this;
        }

        public Criteria andShiprovnameGreaterThanOrEqualTo(String value) {
            addCriterion("CS_SHIPROVNAME >=", value, "shiprovname");
            return (Criteria) this;
        }

        public Criteria andShiprovnameLessThan(String value) {
            addCriterion("CS_SHIPROVNAME <", value, "shiprovname");
            return (Criteria) this;
        }

        public Criteria andShiprovnameLessThanOrEqualTo(String value) {
            addCriterion("CS_SHIPROVNAME <=", value, "shiprovname");
            return (Criteria) this;
        }

        public Criteria andShiprovnameLike(String value) {
            addCriterion("CS_SHIPROVNAME like", value, "shiprovname");
            return (Criteria) this;
        }

        public Criteria andShiprovnameNotLike(String value) {
            addCriterion("CS_SHIPROVNAME not like", value, "shiprovname");
            return (Criteria) this;
        }

        public Criteria andShiprovnameIn(List<String> values) {
            addCriterion("CS_SHIPROVNAME in", values, "shiprovname");
            return (Criteria) this;
        }

        public Criteria andShiprovnameNotIn(List<String> values) {
            addCriterion("CS_SHIPROVNAME not in", values, "shiprovname");
            return (Criteria) this;
        }

        public Criteria andShiprovnameBetween(String value1, String value2) {
            addCriterion("CS_SHIPROVNAME between", value1, value2, "shiprovname");
            return (Criteria) this;
        }

        public Criteria andShiprovnameNotBetween(String value1, String value2) {
            addCriterion("CS_SHIPROVNAME not between", value1, value2, "shiprovname");
            return (Criteria) this;
        }

        public Criteria andHostmodel1IsNull() {
            addCriterion("CS_HOSTMODEL1 is null");
            return (Criteria) this;
        }

        public Criteria andHostmodel1IsNotNull() {
            addCriterion("CS_HOSTMODEL1 is not null");
            return (Criteria) this;
        }

        public Criteria andHostmodel1EqualTo(String value) {
            addCriterion("CS_HOSTMODEL1 =", value, "hostmodel1");
            return (Criteria) this;
        }

        public Criteria andHostmodel1NotEqualTo(String value) {
            addCriterion("CS_HOSTMODEL1 <>", value, "hostmodel1");
            return (Criteria) this;
        }

        public Criteria andHostmodel1GreaterThan(String value) {
            addCriterion("CS_HOSTMODEL1 >", value, "hostmodel1");
            return (Criteria) this;
        }

        public Criteria andHostmodel1GreaterThanOrEqualTo(String value) {
            addCriterion("CS_HOSTMODEL1 >=", value, "hostmodel1");
            return (Criteria) this;
        }

        public Criteria andHostmodel1LessThan(String value) {
            addCriterion("CS_HOSTMODEL1 <", value, "hostmodel1");
            return (Criteria) this;
        }

        public Criteria andHostmodel1LessThanOrEqualTo(String value) {
            addCriterion("CS_HOSTMODEL1 <=", value, "hostmodel1");
            return (Criteria) this;
        }

        public Criteria andHostmodel1Like(String value) {
            addCriterion("CS_HOSTMODEL1 like", value, "hostmodel1");
            return (Criteria) this;
        }

        public Criteria andHostmodel1NotLike(String value) {
            addCriterion("CS_HOSTMODEL1 not like", value, "hostmodel1");
            return (Criteria) this;
        }

        public Criteria andHostmodel1In(List<String> values) {
            addCriterion("CS_HOSTMODEL1 in", values, "hostmodel1");
            return (Criteria) this;
        }

        public Criteria andHostmodel1NotIn(List<String> values) {
            addCriterion("CS_HOSTMODEL1 not in", values, "hostmodel1");
            return (Criteria) this;
        }

        public Criteria andHostmodel1Between(String value1, String value2) {
            addCriterion("CS_HOSTMODEL1 between", value1, value2, "hostmodel1");
            return (Criteria) this;
        }

        public Criteria andHostmodel1NotBetween(String value1, String value2) {
            addCriterion("CS_HOSTMODEL1 not between", value1, value2, "hostmodel1");
            return (Criteria) this;
        }

        public Criteria andHostmodel2IsNull() {
            addCriterion("CS_HOSTMODEL2 is null");
            return (Criteria) this;
        }

        public Criteria andHostmodel2IsNotNull() {
            addCriterion("CS_HOSTMODEL2 is not null");
            return (Criteria) this;
        }

        public Criteria andHostmodel2EqualTo(String value) {
            addCriterion("CS_HOSTMODEL2 =", value, "hostmodel2");
            return (Criteria) this;
        }

        public Criteria andHostmodel2NotEqualTo(String value) {
            addCriterion("CS_HOSTMODEL2 <>", value, "hostmodel2");
            return (Criteria) this;
        }

        public Criteria andHostmodel2GreaterThan(String value) {
            addCriterion("CS_HOSTMODEL2 >", value, "hostmodel2");
            return (Criteria) this;
        }

        public Criteria andHostmodel2GreaterThanOrEqualTo(String value) {
            addCriterion("CS_HOSTMODEL2 >=", value, "hostmodel2");
            return (Criteria) this;
        }

        public Criteria andHostmodel2LessThan(String value) {
            addCriterion("CS_HOSTMODEL2 <", value, "hostmodel2");
            return (Criteria) this;
        }

        public Criteria andHostmodel2LessThanOrEqualTo(String value) {
            addCriterion("CS_HOSTMODEL2 <=", value, "hostmodel2");
            return (Criteria) this;
        }

        public Criteria andHostmodel2Like(String value) {
            addCriterion("CS_HOSTMODEL2 like", value, "hostmodel2");
            return (Criteria) this;
        }

        public Criteria andHostmodel2NotLike(String value) {
            addCriterion("CS_HOSTMODEL2 not like", value, "hostmodel2");
            return (Criteria) this;
        }

        public Criteria andHostmodel2In(List<String> values) {
            addCriterion("CS_HOSTMODEL2 in", values, "hostmodel2");
            return (Criteria) this;
        }

        public Criteria andHostmodel2NotIn(List<String> values) {
            addCriterion("CS_HOSTMODEL2 not in", values, "hostmodel2");
            return (Criteria) this;
        }

        public Criteria andHostmodel2Between(String value1, String value2) {
            addCriterion("CS_HOSTMODEL2 between", value1, value2, "hostmodel2");
            return (Criteria) this;
        }

        public Criteria andHostmodel2NotBetween(String value1, String value2) {
            addCriterion("CS_HOSTMODEL2 not between", value1, value2, "hostmodel2");
            return (Criteria) this;
        }

        public Criteria andHostmodel3IsNull() {
            addCriterion("CS_HOSTMODEL3 is null");
            return (Criteria) this;
        }

        public Criteria andHostmodel3IsNotNull() {
            addCriterion("CS_HOSTMODEL3 is not null");
            return (Criteria) this;
        }

        public Criteria andHostmodel3EqualTo(String value) {
            addCriterion("CS_HOSTMODEL3 =", value, "hostmodel3");
            return (Criteria) this;
        }

        public Criteria andHostmodel3NotEqualTo(String value) {
            addCriterion("CS_HOSTMODEL3 <>", value, "hostmodel3");
            return (Criteria) this;
        }

        public Criteria andHostmodel3GreaterThan(String value) {
            addCriterion("CS_HOSTMODEL3 >", value, "hostmodel3");
            return (Criteria) this;
        }

        public Criteria andHostmodel3GreaterThanOrEqualTo(String value) {
            addCriterion("CS_HOSTMODEL3 >=", value, "hostmodel3");
            return (Criteria) this;
        }

        public Criteria andHostmodel3LessThan(String value) {
            addCriterion("CS_HOSTMODEL3 <", value, "hostmodel3");
            return (Criteria) this;
        }

        public Criteria andHostmodel3LessThanOrEqualTo(String value) {
            addCriterion("CS_HOSTMODEL3 <=", value, "hostmodel3");
            return (Criteria) this;
        }

        public Criteria andHostmodel3Like(String value) {
            addCriterion("CS_HOSTMODEL3 like", value, "hostmodel3");
            return (Criteria) this;
        }

        public Criteria andHostmodel3NotLike(String value) {
            addCriterion("CS_HOSTMODEL3 not like", value, "hostmodel3");
            return (Criteria) this;
        }

        public Criteria andHostmodel3In(List<String> values) {
            addCriterion("CS_HOSTMODEL3 in", values, "hostmodel3");
            return (Criteria) this;
        }

        public Criteria andHostmodel3NotIn(List<String> values) {
            addCriterion("CS_HOSTMODEL3 not in", values, "hostmodel3");
            return (Criteria) this;
        }

        public Criteria andHostmodel3Between(String value1, String value2) {
            addCriterion("CS_HOSTMODEL3 between", value1, value2, "hostmodel3");
            return (Criteria) this;
        }

        public Criteria andHostmodel3NotBetween(String value1, String value2) {
            addCriterion("CS_HOSTMODEL3 not between", value1, value2, "hostmodel3");
            return (Criteria) this;
        }

        public Criteria andHostpower1IsNull() {
            addCriterion("CS_HOSTPOWER1 is null");
            return (Criteria) this;
        }

        public Criteria andHostpower1IsNotNull() {
            addCriterion("CS_HOSTPOWER1 is not null");
            return (Criteria) this;
        }

        public Criteria andHostpower1EqualTo(String value) {
            addCriterion("CS_HOSTPOWER1 =", value, "hostpower1");
            return (Criteria) this;
        }

        public Criteria andHostpower1NotEqualTo(String value) {
            addCriterion("CS_HOSTPOWER1 <>", value, "hostpower1");
            return (Criteria) this;
        }

        public Criteria andHostpower1GreaterThan(String value) {
            addCriterion("CS_HOSTPOWER1 >", value, "hostpower1");
            return (Criteria) this;
        }

        public Criteria andHostpower1GreaterThanOrEqualTo(String value) {
            addCriterion("CS_HOSTPOWER1 >=", value, "hostpower1");
            return (Criteria) this;
        }

        public Criteria andHostpower1LessThan(String value) {
            addCriterion("CS_HOSTPOWER1 <", value, "hostpower1");
            return (Criteria) this;
        }

        public Criteria andHostpower1LessThanOrEqualTo(String value) {
            addCriterion("CS_HOSTPOWER1 <=", value, "hostpower1");
            return (Criteria) this;
        }

        public Criteria andHostpower1Like(String value) {
            addCriterion("CS_HOSTPOWER1 like", value, "hostpower1");
            return (Criteria) this;
        }

        public Criteria andHostpower1NotLike(String value) {
            addCriterion("CS_HOSTPOWER1 not like", value, "hostpower1");
            return (Criteria) this;
        }

        public Criteria andHostpower1In(List<String> values) {
            addCriterion("CS_HOSTPOWER1 in", values, "hostpower1");
            return (Criteria) this;
        }

        public Criteria andHostpower1NotIn(List<String> values) {
            addCriterion("CS_HOSTPOWER1 not in", values, "hostpower1");
            return (Criteria) this;
        }

        public Criteria andHostpower1Between(String value1, String value2) {
            addCriterion("CS_HOSTPOWER1 between", value1, value2, "hostpower1");
            return (Criteria) this;
        }

        public Criteria andHostpower1NotBetween(String value1, String value2) {
            addCriterion("CS_HOSTPOWER1 not between", value1, value2, "hostpower1");
            return (Criteria) this;
        }

        public Criteria andHostpower2IsNull() {
            addCriterion("CS_HOSTPOWER2 is null");
            return (Criteria) this;
        }

        public Criteria andHostpower2IsNotNull() {
            addCriterion("CS_HOSTPOWER2 is not null");
            return (Criteria) this;
        }

        public Criteria andHostpower2EqualTo(String value) {
            addCriterion("CS_HOSTPOWER2 =", value, "hostpower2");
            return (Criteria) this;
        }

        public Criteria andHostpower2NotEqualTo(String value) {
            addCriterion("CS_HOSTPOWER2 <>", value, "hostpower2");
            return (Criteria) this;
        }

        public Criteria andHostpower2GreaterThan(String value) {
            addCriterion("CS_HOSTPOWER2 >", value, "hostpower2");
            return (Criteria) this;
        }

        public Criteria andHostpower2GreaterThanOrEqualTo(String value) {
            addCriterion("CS_HOSTPOWER2 >=", value, "hostpower2");
            return (Criteria) this;
        }

        public Criteria andHostpower2LessThan(String value) {
            addCriterion("CS_HOSTPOWER2 <", value, "hostpower2");
            return (Criteria) this;
        }

        public Criteria andHostpower2LessThanOrEqualTo(String value) {
            addCriterion("CS_HOSTPOWER2 <=", value, "hostpower2");
            return (Criteria) this;
        }

        public Criteria andHostpower2Like(String value) {
            addCriterion("CS_HOSTPOWER2 like", value, "hostpower2");
            return (Criteria) this;
        }

        public Criteria andHostpower2NotLike(String value) {
            addCriterion("CS_HOSTPOWER2 not like", value, "hostpower2");
            return (Criteria) this;
        }

        public Criteria andHostpower2In(List<String> values) {
            addCriterion("CS_HOSTPOWER2 in", values, "hostpower2");
            return (Criteria) this;
        }

        public Criteria andHostpower2NotIn(List<String> values) {
            addCriterion("CS_HOSTPOWER2 not in", values, "hostpower2");
            return (Criteria) this;
        }

        public Criteria andHostpower2Between(String value1, String value2) {
            addCriterion("CS_HOSTPOWER2 between", value1, value2, "hostpower2");
            return (Criteria) this;
        }

        public Criteria andHostpower2NotBetween(String value1, String value2) {
            addCriterion("CS_HOSTPOWER2 not between", value1, value2, "hostpower2");
            return (Criteria) this;
        }

        public Criteria andHostpower3IsNull() {
            addCriterion("CS_HOSTPOWER3 is null");
            return (Criteria) this;
        }

        public Criteria andHostpower3IsNotNull() {
            addCriterion("CS_HOSTPOWER3 is not null");
            return (Criteria) this;
        }

        public Criteria andHostpower3EqualTo(String value) {
            addCriterion("CS_HOSTPOWER3 =", value, "hostpower3");
            return (Criteria) this;
        }

        public Criteria andHostpower3NotEqualTo(String value) {
            addCriterion("CS_HOSTPOWER3 <>", value, "hostpower3");
            return (Criteria) this;
        }

        public Criteria andHostpower3GreaterThan(String value) {
            addCriterion("CS_HOSTPOWER3 >", value, "hostpower3");
            return (Criteria) this;
        }

        public Criteria andHostpower3GreaterThanOrEqualTo(String value) {
            addCriterion("CS_HOSTPOWER3 >=", value, "hostpower3");
            return (Criteria) this;
        }

        public Criteria andHostpower3LessThan(String value) {
            addCriterion("CS_HOSTPOWER3 <", value, "hostpower3");
            return (Criteria) this;
        }

        public Criteria andHostpower3LessThanOrEqualTo(String value) {
            addCriterion("CS_HOSTPOWER3 <=", value, "hostpower3");
            return (Criteria) this;
        }

        public Criteria andHostpower3Like(String value) {
            addCriterion("CS_HOSTPOWER3 like", value, "hostpower3");
            return (Criteria) this;
        }

        public Criteria andHostpower3NotLike(String value) {
            addCriterion("CS_HOSTPOWER3 not like", value, "hostpower3");
            return (Criteria) this;
        }

        public Criteria andHostpower3In(List<String> values) {
            addCriterion("CS_HOSTPOWER3 in", values, "hostpower3");
            return (Criteria) this;
        }

        public Criteria andHostpower3NotIn(List<String> values) {
            addCriterion("CS_HOSTPOWER3 not in", values, "hostpower3");
            return (Criteria) this;
        }

        public Criteria andHostpower3Between(String value1, String value2) {
            addCriterion("CS_HOSTPOWER3 between", value1, value2, "hostpower3");
            return (Criteria) this;
        }

        public Criteria andHostpower3NotBetween(String value1, String value2) {
            addCriterion("CS_HOSTPOWER3 not between", value1, value2, "hostpower3");
            return (Criteria) this;
        }

        public Criteria andOwnernoIsNull() {
            addCriterion("CS_OWNERNO is null");
            return (Criteria) this;
        }

        public Criteria andOwnernoIsNotNull() {
            addCriterion("CS_OWNERNO is not null");
            return (Criteria) this;
        }

        public Criteria andOwnernoEqualTo(String value) {
            addCriterion("CS_OWNERNO =", value, "ownerno");
            return (Criteria) this;
        }

        public Criteria andOwnernoNotEqualTo(String value) {
            addCriterion("CS_OWNERNO <>", value, "ownerno");
            return (Criteria) this;
        }

        public Criteria andOwnernoGreaterThan(String value) {
            addCriterion("CS_OWNERNO >", value, "ownerno");
            return (Criteria) this;
        }

        public Criteria andOwnernoGreaterThanOrEqualTo(String value) {
            addCriterion("CS_OWNERNO >=", value, "ownerno");
            return (Criteria) this;
        }

        public Criteria andOwnernoLessThan(String value) {
            addCriterion("CS_OWNERNO <", value, "ownerno");
            return (Criteria) this;
        }

        public Criteria andOwnernoLessThanOrEqualTo(String value) {
            addCriterion("CS_OWNERNO <=", value, "ownerno");
            return (Criteria) this;
        }

        public Criteria andOwnernoLike(String value) {
            addCriterion("CS_OWNERNO like", value, "ownerno");
            return (Criteria) this;
        }

        public Criteria andOwnernoNotLike(String value) {
            addCriterion("CS_OWNERNO not like", value, "ownerno");
            return (Criteria) this;
        }

        public Criteria andOwnernoIn(List<String> values) {
            addCriterion("CS_OWNERNO in", values, "ownerno");
            return (Criteria) this;
        }

        public Criteria andOwnernoNotIn(List<String> values) {
            addCriterion("CS_OWNERNO not in", values, "ownerno");
            return (Criteria) this;
        }

        public Criteria andOwnernoBetween(String value1, String value2) {
            addCriterion("CS_OWNERNO between", value1, value2, "ownerno");
            return (Criteria) this;
        }

        public Criteria andOwnernoNotBetween(String value1, String value2) {
            addCriterion("CS_OWNERNO not between", value1, value2, "ownerno");
            return (Criteria) this;
        }

        public Criteria andFishroomnumIsNull() {
            addCriterion("CS_FISHROOMNUM is null");
            return (Criteria) this;
        }

        public Criteria andFishroomnumIsNotNull() {
            addCriterion("CS_FISHROOMNUM is not null");
            return (Criteria) this;
        }

        public Criteria andFishroomnumEqualTo(String value) {
            addCriterion("CS_FISHROOMNUM =", value, "fishroomnum");
            return (Criteria) this;
        }

        public Criteria andFishroomnumNotEqualTo(String value) {
            addCriterion("CS_FISHROOMNUM <>", value, "fishroomnum");
            return (Criteria) this;
        }

        public Criteria andFishroomnumGreaterThan(String value) {
            addCriterion("CS_FISHROOMNUM >", value, "fishroomnum");
            return (Criteria) this;
        }

        public Criteria andFishroomnumGreaterThanOrEqualTo(String value) {
            addCriterion("CS_FISHROOMNUM >=", value, "fishroomnum");
            return (Criteria) this;
        }

        public Criteria andFishroomnumLessThan(String value) {
            addCriterion("CS_FISHROOMNUM <", value, "fishroomnum");
            return (Criteria) this;
        }

        public Criteria andFishroomnumLessThanOrEqualTo(String value) {
            addCriterion("CS_FISHROOMNUM <=", value, "fishroomnum");
            return (Criteria) this;
        }

        public Criteria andFishroomnumLike(String value) {
            addCriterion("CS_FISHROOMNUM like", value, "fishroomnum");
            return (Criteria) this;
        }

        public Criteria andFishroomnumNotLike(String value) {
            addCriterion("CS_FISHROOMNUM not like", value, "fishroomnum");
            return (Criteria) this;
        }

        public Criteria andFishroomnumIn(List<String> values) {
            addCriterion("CS_FISHROOMNUM in", values, "fishroomnum");
            return (Criteria) this;
        }

        public Criteria andFishroomnumNotIn(List<String> values) {
            addCriterion("CS_FISHROOMNUM not in", values, "fishroomnum");
            return (Criteria) this;
        }

        public Criteria andFishroomnumBetween(String value1, String value2) {
            addCriterion("CS_FISHROOMNUM between", value1, value2, "fishroomnum");
            return (Criteria) this;
        }

        public Criteria andFishroomnumNotBetween(String value1, String value2) {
            addCriterion("CS_FISHROOMNUM not between", value1, value2, "fishroomnum");
            return (Criteria) this;
        }

        public Criteria andHostnumIsNull() {
            addCriterion("CS_HOSTNUM is null");
            return (Criteria) this;
        }

        public Criteria andHostnumIsNotNull() {
            addCriterion("CS_HOSTNUM is not null");
            return (Criteria) this;
        }

        public Criteria andHostnumEqualTo(String value) {
            addCriterion("CS_HOSTNUM =", value, "hostnum");
            return (Criteria) this;
        }

        public Criteria andHostnumNotEqualTo(String value) {
            addCriterion("CS_HOSTNUM <>", value, "hostnum");
            return (Criteria) this;
        }

        public Criteria andHostnumGreaterThan(String value) {
            addCriterion("CS_HOSTNUM >", value, "hostnum");
            return (Criteria) this;
        }

        public Criteria andHostnumGreaterThanOrEqualTo(String value) {
            addCriterion("CS_HOSTNUM >=", value, "hostnum");
            return (Criteria) this;
        }

        public Criteria andHostnumLessThan(String value) {
            addCriterion("CS_HOSTNUM <", value, "hostnum");
            return (Criteria) this;
        }

        public Criteria andHostnumLessThanOrEqualTo(String value) {
            addCriterion("CS_HOSTNUM <=", value, "hostnum");
            return (Criteria) this;
        }

        public Criteria andHostnumLike(String value) {
            addCriterion("CS_HOSTNUM like", value, "hostnum");
            return (Criteria) this;
        }

        public Criteria andHostnumNotLike(String value) {
            addCriterion("CS_HOSTNUM not like", value, "hostnum");
            return (Criteria) this;
        }

        public Criteria andHostnumIn(List<String> values) {
            addCriterion("CS_HOSTNUM in", values, "hostnum");
            return (Criteria) this;
        }

        public Criteria andHostnumNotIn(List<String> values) {
            addCriterion("CS_HOSTNUM not in", values, "hostnum");
            return (Criteria) this;
        }

        public Criteria andHostnumBetween(String value1, String value2) {
            addCriterion("CS_HOSTNUM between", value1, value2, "hostnum");
            return (Criteria) this;
        }

        public Criteria andHostnumNotBetween(String value1, String value2) {
            addCriterion("CS_HOSTNUM not between", value1, value2, "hostnum");
            return (Criteria) this;
        }

        public Criteria andJobtypeIsNull() {
            addCriterion("CS_JOBTYPE is null");
            return (Criteria) this;
        }

        public Criteria andJobtypeIsNotNull() {
            addCriterion("CS_JOBTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andJobtypeEqualTo(String value) {
            addCriterion("CS_JOBTYPE =", value, "jobtype");
            return (Criteria) this;
        }

        public Criteria andJobtypeNotEqualTo(String value) {
            addCriterion("CS_JOBTYPE <>", value, "jobtype");
            return (Criteria) this;
        }

        public Criteria andJobtypeGreaterThan(String value) {
            addCriterion("CS_JOBTYPE >", value, "jobtype");
            return (Criteria) this;
        }

        public Criteria andJobtypeGreaterThanOrEqualTo(String value) {
            addCriterion("CS_JOBTYPE >=", value, "jobtype");
            return (Criteria) this;
        }

        public Criteria andJobtypeLessThan(String value) {
            addCriterion("CS_JOBTYPE <", value, "jobtype");
            return (Criteria) this;
        }

        public Criteria andJobtypeLessThanOrEqualTo(String value) {
            addCriterion("CS_JOBTYPE <=", value, "jobtype");
            return (Criteria) this;
        }

        public Criteria andJobtypeLike(String value) {
            addCriterion("CS_JOBTYPE like", value, "jobtype");
            return (Criteria) this;
        }

        public Criteria andJobtypeNotLike(String value) {
            addCriterion("CS_JOBTYPE not like", value, "jobtype");
            return (Criteria) this;
        }

        public Criteria andJobtypeIn(List<String> values) {
            addCriterion("CS_JOBTYPE in", values, "jobtype");
            return (Criteria) this;
        }

        public Criteria andJobtypeNotIn(List<String> values) {
            addCriterion("CS_JOBTYPE not in", values, "jobtype");
            return (Criteria) this;
        }

        public Criteria andJobtypeBetween(String value1, String value2) {
            addCriterion("CS_JOBTYPE between", value1, value2, "jobtype");
            return (Criteria) this;
        }

        public Criteria andJobtypeNotBetween(String value1, String value2) {
            addCriterion("CS_JOBTYPE not between", value1, value2, "jobtype");
            return (Criteria) this;
        }

        public Criteria andOpemodeIsNull() {
            addCriterion("CS_OPEMODE is null");
            return (Criteria) this;
        }

        public Criteria andOpemodeIsNotNull() {
            addCriterion("CS_OPEMODE is not null");
            return (Criteria) this;
        }

        public Criteria andOpemodeEqualTo(String value) {
            addCriterion("CS_OPEMODE =", value, "opemode");
            return (Criteria) this;
        }

        public Criteria andOpemodeNotEqualTo(String value) {
            addCriterion("CS_OPEMODE <>", value, "opemode");
            return (Criteria) this;
        }

        public Criteria andOpemodeGreaterThan(String value) {
            addCriterion("CS_OPEMODE >", value, "opemode");
            return (Criteria) this;
        }

        public Criteria andOpemodeGreaterThanOrEqualTo(String value) {
            addCriterion("CS_OPEMODE >=", value, "opemode");
            return (Criteria) this;
        }

        public Criteria andOpemodeLessThan(String value) {
            addCriterion("CS_OPEMODE <", value, "opemode");
            return (Criteria) this;
        }

        public Criteria andOpemodeLessThanOrEqualTo(String value) {
            addCriterion("CS_OPEMODE <=", value, "opemode");
            return (Criteria) this;
        }

        public Criteria andOpemodeLike(String value) {
            addCriterion("CS_OPEMODE like", value, "opemode");
            return (Criteria) this;
        }

        public Criteria andOpemodeNotLike(String value) {
            addCriterion("CS_OPEMODE not like", value, "opemode");
            return (Criteria) this;
        }

        public Criteria andOpemodeIn(List<String> values) {
            addCriterion("CS_OPEMODE in", values, "opemode");
            return (Criteria) this;
        }

        public Criteria andOpemodeNotIn(List<String> values) {
            addCriterion("CS_OPEMODE not in", values, "opemode");
            return (Criteria) this;
        }

        public Criteria andOpemodeBetween(String value1, String value2) {
            addCriterion("CS_OPEMODE between", value1, value2, "opemode");
            return (Criteria) this;
        }

        public Criteria andOpemodeNotBetween(String value1, String value2) {
            addCriterion("CS_OPEMODE not between", value1, value2, "opemode");
            return (Criteria) this;
        }

        public Criteria andJobtype2IsNull() {
            addCriterion("CS_JOBTYPE2 is null");
            return (Criteria) this;
        }

        public Criteria andJobtype2IsNotNull() {
            addCriterion("CS_JOBTYPE2 is not null");
            return (Criteria) this;
        }

        public Criteria andJobtype2EqualTo(String value) {
            addCriterion("CS_JOBTYPE2 =", value, "jobtype2");
            return (Criteria) this;
        }

        public Criteria andJobtype2NotEqualTo(String value) {
            addCriterion("CS_JOBTYPE2 <>", value, "jobtype2");
            return (Criteria) this;
        }

        public Criteria andJobtype2GreaterThan(String value) {
            addCriterion("CS_JOBTYPE2 >", value, "jobtype2");
            return (Criteria) this;
        }

        public Criteria andJobtype2GreaterThanOrEqualTo(String value) {
            addCriterion("CS_JOBTYPE2 >=", value, "jobtype2");
            return (Criteria) this;
        }

        public Criteria andJobtype2LessThan(String value) {
            addCriterion("CS_JOBTYPE2 <", value, "jobtype2");
            return (Criteria) this;
        }

        public Criteria andJobtype2LessThanOrEqualTo(String value) {
            addCriterion("CS_JOBTYPE2 <=", value, "jobtype2");
            return (Criteria) this;
        }

        public Criteria andJobtype2Like(String value) {
            addCriterion("CS_JOBTYPE2 like", value, "jobtype2");
            return (Criteria) this;
        }

        public Criteria andJobtype2NotLike(String value) {
            addCriterion("CS_JOBTYPE2 not like", value, "jobtype2");
            return (Criteria) this;
        }

        public Criteria andJobtype2In(List<String> values) {
            addCriterion("CS_JOBTYPE2 in", values, "jobtype2");
            return (Criteria) this;
        }

        public Criteria andJobtype2NotIn(List<String> values) {
            addCriterion("CS_JOBTYPE2 not in", values, "jobtype2");
            return (Criteria) this;
        }

        public Criteria andJobtype2Between(String value1, String value2) {
            addCriterion("CS_JOBTYPE2 between", value1, value2, "jobtype2");
            return (Criteria) this;
        }

        public Criteria andJobtype2NotBetween(String value1, String value2) {
            addCriterion("CS_JOBTYPE2 not between", value1, value2, "jobtype2");
            return (Criteria) this;
        }

        public Criteria andOpemode2IsNull() {
            addCriterion("CS_OPEMODE2 is null");
            return (Criteria) this;
        }

        public Criteria andOpemode2IsNotNull() {
            addCriterion("CS_OPEMODE2 is not null");
            return (Criteria) this;
        }

        public Criteria andOpemode2EqualTo(String value) {
            addCriterion("CS_OPEMODE2 =", value, "opemode2");
            return (Criteria) this;
        }

        public Criteria andOpemode2NotEqualTo(String value) {
            addCriterion("CS_OPEMODE2 <>", value, "opemode2");
            return (Criteria) this;
        }

        public Criteria andOpemode2GreaterThan(String value) {
            addCriterion("CS_OPEMODE2 >", value, "opemode2");
            return (Criteria) this;
        }

        public Criteria andOpemode2GreaterThanOrEqualTo(String value) {
            addCriterion("CS_OPEMODE2 >=", value, "opemode2");
            return (Criteria) this;
        }

        public Criteria andOpemode2LessThan(String value) {
            addCriterion("CS_OPEMODE2 <", value, "opemode2");
            return (Criteria) this;
        }

        public Criteria andOpemode2LessThanOrEqualTo(String value) {
            addCriterion("CS_OPEMODE2 <=", value, "opemode2");
            return (Criteria) this;
        }

        public Criteria andOpemode2Like(String value) {
            addCriterion("CS_OPEMODE2 like", value, "opemode2");
            return (Criteria) this;
        }

        public Criteria andOpemode2NotLike(String value) {
            addCriterion("CS_OPEMODE2 not like", value, "opemode2");
            return (Criteria) this;
        }

        public Criteria andOpemode2In(List<String> values) {
            addCriterion("CS_OPEMODE2 in", values, "opemode2");
            return (Criteria) this;
        }

        public Criteria andOpemode2NotIn(List<String> values) {
            addCriterion("CS_OPEMODE2 not in", values, "opemode2");
            return (Criteria) this;
        }

        public Criteria andOpemode2Between(String value1, String value2) {
            addCriterion("CS_OPEMODE2 between", value1, value2, "opemode2");
            return (Criteria) this;
        }

        public Criteria andOpemode2NotBetween(String value1, String value2) {
            addCriterion("CS_OPEMODE2 not between", value1, value2, "opemode2");
            return (Criteria) this;
        }

        public Criteria andAutopemodeIsNull() {
            addCriterion("CS_AUTOPEMODE is null");
            return (Criteria) this;
        }

        public Criteria andAutopemodeIsNotNull() {
            addCriterion("CS_AUTOPEMODE is not null");
            return (Criteria) this;
        }

        public Criteria andAutopemodeEqualTo(String value) {
            addCriterion("CS_AUTOPEMODE =", value, "autopemode");
            return (Criteria) this;
        }

        public Criteria andAutopemodeNotEqualTo(String value) {
            addCriterion("CS_AUTOPEMODE <>", value, "autopemode");
            return (Criteria) this;
        }

        public Criteria andAutopemodeGreaterThan(String value) {
            addCriterion("CS_AUTOPEMODE >", value, "autopemode");
            return (Criteria) this;
        }

        public Criteria andAutopemodeGreaterThanOrEqualTo(String value) {
            addCriterion("CS_AUTOPEMODE >=", value, "autopemode");
            return (Criteria) this;
        }

        public Criteria andAutopemodeLessThan(String value) {
            addCriterion("CS_AUTOPEMODE <", value, "autopemode");
            return (Criteria) this;
        }

        public Criteria andAutopemodeLessThanOrEqualTo(String value) {
            addCriterion("CS_AUTOPEMODE <=", value, "autopemode");
            return (Criteria) this;
        }

        public Criteria andAutopemodeLike(String value) {
            addCriterion("CS_AUTOPEMODE like", value, "autopemode");
            return (Criteria) this;
        }

        public Criteria andAutopemodeNotLike(String value) {
            addCriterion("CS_AUTOPEMODE not like", value, "autopemode");
            return (Criteria) this;
        }

        public Criteria andAutopemodeIn(List<String> values) {
            addCriterion("CS_AUTOPEMODE in", values, "autopemode");
            return (Criteria) this;
        }

        public Criteria andAutopemodeNotIn(List<String> values) {
            addCriterion("CS_AUTOPEMODE not in", values, "autopemode");
            return (Criteria) this;
        }

        public Criteria andAutopemodeBetween(String value1, String value2) {
            addCriterion("CS_AUTOPEMODE between", value1, value2, "autopemode");
            return (Criteria) this;
        }

        public Criteria andAutopemodeNotBetween(String value1, String value2) {
            addCriterion("CS_AUTOPEMODE not between", value1, value2, "autopemode");
            return (Criteria) this;
        }

        public Criteria andWorkplaceIsNull() {
            addCriterion("CS_WORKPLACE is null");
            return (Criteria) this;
        }

        public Criteria andWorkplaceIsNotNull() {
            addCriterion("CS_WORKPLACE is not null");
            return (Criteria) this;
        }

        public Criteria andWorkplaceEqualTo(String value) {
            addCriterion("CS_WORKPLACE =", value, "workplace");
            return (Criteria) this;
        }

        public Criteria andWorkplaceNotEqualTo(String value) {
            addCriterion("CS_WORKPLACE <>", value, "workplace");
            return (Criteria) this;
        }

        public Criteria andWorkplaceGreaterThan(String value) {
            addCriterion("CS_WORKPLACE >", value, "workplace");
            return (Criteria) this;
        }

        public Criteria andWorkplaceGreaterThanOrEqualTo(String value) {
            addCriterion("CS_WORKPLACE >=", value, "workplace");
            return (Criteria) this;
        }

        public Criteria andWorkplaceLessThan(String value) {
            addCriterion("CS_WORKPLACE <", value, "workplace");
            return (Criteria) this;
        }

        public Criteria andWorkplaceLessThanOrEqualTo(String value) {
            addCriterion("CS_WORKPLACE <=", value, "workplace");
            return (Criteria) this;
        }

        public Criteria andWorkplaceLike(String value) {
            addCriterion("CS_WORKPLACE like", value, "workplace");
            return (Criteria) this;
        }

        public Criteria andWorkplaceNotLike(String value) {
            addCriterion("CS_WORKPLACE not like", value, "workplace");
            return (Criteria) this;
        }

        public Criteria andWorkplaceIn(List<String> values) {
            addCriterion("CS_WORKPLACE in", values, "workplace");
            return (Criteria) this;
        }

        public Criteria andWorkplaceNotIn(List<String> values) {
            addCriterion("CS_WORKPLACE not in", values, "workplace");
            return (Criteria) this;
        }

        public Criteria andWorkplaceBetween(String value1, String value2) {
            addCriterion("CS_WORKPLACE between", value1, value2, "workplace");
            return (Criteria) this;
        }

        public Criteria andWorkplaceNotBetween(String value1, String value2) {
            addCriterion("CS_WORKPLACE not between", value1, value2, "workplace");
            return (Criteria) this;
        }

        public Criteria andOwnernameIsNull() {
            addCriterion("CS_OWNERNAME is null");
            return (Criteria) this;
        }

        public Criteria andOwnernameIsNotNull() {
            addCriterion("CS_OWNERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andOwnernameEqualTo(String value) {
            addCriterion("CS_OWNERNAME =", value, "ownername");
            return (Criteria) this;
        }

        public Criteria andOwnernameNotEqualTo(String value) {
            addCriterion("CS_OWNERNAME <>", value, "ownername");
            return (Criteria) this;
        }

        public Criteria andOwnernameGreaterThan(String value) {
            addCriterion("CS_OWNERNAME >", value, "ownername");
            return (Criteria) this;
        }

        public Criteria andOwnernameGreaterThanOrEqualTo(String value) {
            addCriterion("CS_OWNERNAME >=", value, "ownername");
            return (Criteria) this;
        }

        public Criteria andOwnernameLessThan(String value) {
            addCriterion("CS_OWNERNAME <", value, "ownername");
            return (Criteria) this;
        }

        public Criteria andOwnernameLessThanOrEqualTo(String value) {
            addCriterion("CS_OWNERNAME <=", value, "ownername");
            return (Criteria) this;
        }

        public Criteria andOwnernameLike(String value) {
            addCriterion("CS_OWNERNAME like", value, "ownername");
            return (Criteria) this;
        }

        public Criteria andOwnernameNotLike(String value) {
            addCriterion("CS_OWNERNAME not like", value, "ownername");
            return (Criteria) this;
        }

        public Criteria andOwnernameIn(List<String> values) {
            addCriterion("CS_OWNERNAME in", values, "ownername");
            return (Criteria) this;
        }

        public Criteria andOwnernameNotIn(List<String> values) {
            addCriterion("CS_OWNERNAME not in", values, "ownername");
            return (Criteria) this;
        }

        public Criteria andOwnernameBetween(String value1, String value2) {
            addCriterion("CS_OWNERNAME between", value1, value2, "ownername");
            return (Criteria) this;
        }

        public Criteria andOwnernameNotBetween(String value1, String value2) {
            addCriterion("CS_OWNERNAME not between", value1, value2, "ownername");
            return (Criteria) this;
        }

        public Criteria andOwneraddrIsNull() {
            addCriterion("CS_OWNERADDR is null");
            return (Criteria) this;
        }

        public Criteria andOwneraddrIsNotNull() {
            addCriterion("CS_OWNERADDR is not null");
            return (Criteria) this;
        }

        public Criteria andOwneraddrEqualTo(String value) {
            addCriterion("CS_OWNERADDR =", value, "owneraddr");
            return (Criteria) this;
        }

        public Criteria andOwneraddrNotEqualTo(String value) {
            addCriterion("CS_OWNERADDR <>", value, "owneraddr");
            return (Criteria) this;
        }

        public Criteria andOwneraddrGreaterThan(String value) {
            addCriterion("CS_OWNERADDR >", value, "owneraddr");
            return (Criteria) this;
        }

        public Criteria andOwneraddrGreaterThanOrEqualTo(String value) {
            addCriterion("CS_OWNERADDR >=", value, "owneraddr");
            return (Criteria) this;
        }

        public Criteria andOwneraddrLessThan(String value) {
            addCriterion("CS_OWNERADDR <", value, "owneraddr");
            return (Criteria) this;
        }

        public Criteria andOwneraddrLessThanOrEqualTo(String value) {
            addCriterion("CS_OWNERADDR <=", value, "owneraddr");
            return (Criteria) this;
        }

        public Criteria andOwneraddrLike(String value) {
            addCriterion("CS_OWNERADDR like", value, "owneraddr");
            return (Criteria) this;
        }

        public Criteria andOwneraddrNotLike(String value) {
            addCriterion("CS_OWNERADDR not like", value, "owneraddr");
            return (Criteria) this;
        }

        public Criteria andOwneraddrIn(List<String> values) {
            addCriterion("CS_OWNERADDR in", values, "owneraddr");
            return (Criteria) this;
        }

        public Criteria andOwneraddrNotIn(List<String> values) {
            addCriterion("CS_OWNERADDR not in", values, "owneraddr");
            return (Criteria) this;
        }

        public Criteria andOwneraddrBetween(String value1, String value2) {
            addCriterion("CS_OWNERADDR between", value1, value2, "owneraddr");
            return (Criteria) this;
        }

        public Criteria andOwneraddrNotBetween(String value1, String value2) {
            addCriterion("CS_OWNERADDR not between", value1, value2, "owneraddr");
            return (Criteria) this;
        }

        public Criteria andOwnertelIsNull() {
            addCriterion("CS_OWNERTEL is null");
            return (Criteria) this;
        }

        public Criteria andOwnertelIsNotNull() {
            addCriterion("CS_OWNERTEL is not null");
            return (Criteria) this;
        }

        public Criteria andOwnertelEqualTo(String value) {
            addCriterion("CS_OWNERTEL =", value, "ownertel");
            return (Criteria) this;
        }

        public Criteria andOwnertelNotEqualTo(String value) {
            addCriterion("CS_OWNERTEL <>", value, "ownertel");
            return (Criteria) this;
        }

        public Criteria andOwnertelGreaterThan(String value) {
            addCriterion("CS_OWNERTEL >", value, "ownertel");
            return (Criteria) this;
        }

        public Criteria andOwnertelGreaterThanOrEqualTo(String value) {
            addCriterion("CS_OWNERTEL >=", value, "ownertel");
            return (Criteria) this;
        }

        public Criteria andOwnertelLessThan(String value) {
            addCriterion("CS_OWNERTEL <", value, "ownertel");
            return (Criteria) this;
        }

        public Criteria andOwnertelLessThanOrEqualTo(String value) {
            addCriterion("CS_OWNERTEL <=", value, "ownertel");
            return (Criteria) this;
        }

        public Criteria andOwnertelLike(String value) {
            addCriterion("CS_OWNERTEL like", value, "ownertel");
            return (Criteria) this;
        }

        public Criteria andOwnertelNotLike(String value) {
            addCriterion("CS_OWNERTEL not like", value, "ownertel");
            return (Criteria) this;
        }

        public Criteria andOwnertelIn(List<String> values) {
            addCriterion("CS_OWNERTEL in", values, "ownertel");
            return (Criteria) this;
        }

        public Criteria andOwnertelNotIn(List<String> values) {
            addCriterion("CS_OWNERTEL not in", values, "ownertel");
            return (Criteria) this;
        }

        public Criteria andOwnertelBetween(String value1, String value2) {
            addCriterion("CS_OWNERTEL between", value1, value2, "ownertel");
            return (Criteria) this;
        }

        public Criteria andOwnertelNotBetween(String value1, String value2) {
            addCriterion("CS_OWNERTEL not between", value1, value2, "ownertel");
            return (Criteria) this;
        }

        public Criteria andPostcodeIsNull() {
            addCriterion("CS_POSTCODE is null");
            return (Criteria) this;
        }

        public Criteria andPostcodeIsNotNull() {
            addCriterion("CS_POSTCODE is not null");
            return (Criteria) this;
        }

        public Criteria andPostcodeEqualTo(String value) {
            addCriterion("CS_POSTCODE =", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotEqualTo(String value) {
            addCriterion("CS_POSTCODE <>", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeGreaterThan(String value) {
            addCriterion("CS_POSTCODE >", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeGreaterThanOrEqualTo(String value) {
            addCriterion("CS_POSTCODE >=", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeLessThan(String value) {
            addCriterion("CS_POSTCODE <", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeLessThanOrEqualTo(String value) {
            addCriterion("CS_POSTCODE <=", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeLike(String value) {
            addCriterion("CS_POSTCODE like", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotLike(String value) {
            addCriterion("CS_POSTCODE not like", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeIn(List<String> values) {
            addCriterion("CS_POSTCODE in", values, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotIn(List<String> values) {
            addCriterion("CS_POSTCODE not in", values, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeBetween(String value1, String value2) {
            addCriterion("CS_POSTCODE between", value1, value2, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotBetween(String value1, String value2) {
            addCriterion("CS_POSTCODE not between", value1, value2, "postcode");
            return (Criteria) this;
        }

        public Criteria andPeriodfishlicIsNull() {
            addCriterion("CS_PERIODFISHLIC is null");
            return (Criteria) this;
        }

        public Criteria andPeriodfishlicIsNotNull() {
            addCriterion("CS_PERIODFISHLIC is not null");
            return (Criteria) this;
        }

        public Criteria andPeriodfishlicEqualTo(String value) {
            addCriterion("CS_PERIODFISHLIC =", value, "periodfishlic");
            return (Criteria) this;
        }

        public Criteria andPeriodfishlicNotEqualTo(String value) {
            addCriterion("CS_PERIODFISHLIC <>", value, "periodfishlic");
            return (Criteria) this;
        }

        public Criteria andPeriodfishlicGreaterThan(String value) {
            addCriterion("CS_PERIODFISHLIC >", value, "periodfishlic");
            return (Criteria) this;
        }

        public Criteria andPeriodfishlicGreaterThanOrEqualTo(String value) {
            addCriterion("CS_PERIODFISHLIC >=", value, "periodfishlic");
            return (Criteria) this;
        }

        public Criteria andPeriodfishlicLessThan(String value) {
            addCriterion("CS_PERIODFISHLIC <", value, "periodfishlic");
            return (Criteria) this;
        }

        public Criteria andPeriodfishlicLessThanOrEqualTo(String value) {
            addCriterion("CS_PERIODFISHLIC <=", value, "periodfishlic");
            return (Criteria) this;
        }

        public Criteria andPeriodfishlicLike(String value) {
            addCriterion("CS_PERIODFISHLIC like", value, "periodfishlic");
            return (Criteria) this;
        }

        public Criteria andPeriodfishlicNotLike(String value) {
            addCriterion("CS_PERIODFISHLIC not like", value, "periodfishlic");
            return (Criteria) this;
        }

        public Criteria andPeriodfishlicIn(List<String> values) {
            addCriterion("CS_PERIODFISHLIC in", values, "periodfishlic");
            return (Criteria) this;
        }

        public Criteria andPeriodfishlicNotIn(List<String> values) {
            addCriterion("CS_PERIODFISHLIC not in", values, "periodfishlic");
            return (Criteria) this;
        }

        public Criteria andPeriodfishlicBetween(String value1, String value2) {
            addCriterion("CS_PERIODFISHLIC between", value1, value2, "periodfishlic");
            return (Criteria) this;
        }

        public Criteria andPeriodfishlicNotBetween(String value1, String value2) {
            addCriterion("CS_PERIODFISHLIC not between", value1, value2, "periodfishlic");
            return (Criteria) this;
        }

        public Criteria andFishlicnoIsNull() {
            addCriterion("CS_FISHLICNO is null");
            return (Criteria) this;
        }

        public Criteria andFishlicnoIsNotNull() {
            addCriterion("CS_FISHLICNO is not null");
            return (Criteria) this;
        }

        public Criteria andFishlicnoEqualTo(String value) {
            addCriterion("CS_FISHLICNO =", value, "fishlicno");
            return (Criteria) this;
        }

        public Criteria andFishlicnoNotEqualTo(String value) {
            addCriterion("CS_FISHLICNO <>", value, "fishlicno");
            return (Criteria) this;
        }

        public Criteria andFishlicnoGreaterThan(String value) {
            addCriterion("CS_FISHLICNO >", value, "fishlicno");
            return (Criteria) this;
        }

        public Criteria andFishlicnoGreaterThanOrEqualTo(String value) {
            addCriterion("CS_FISHLICNO >=", value, "fishlicno");
            return (Criteria) this;
        }

        public Criteria andFishlicnoLessThan(String value) {
            addCriterion("CS_FISHLICNO <", value, "fishlicno");
            return (Criteria) this;
        }

        public Criteria andFishlicnoLessThanOrEqualTo(String value) {
            addCriterion("CS_FISHLICNO <=", value, "fishlicno");
            return (Criteria) this;
        }

        public Criteria andFishlicnoLike(String value) {
            addCriterion("CS_FISHLICNO like", value, "fishlicno");
            return (Criteria) this;
        }

        public Criteria andFishlicnoNotLike(String value) {
            addCriterion("CS_FISHLICNO not like", value, "fishlicno");
            return (Criteria) this;
        }

        public Criteria andFishlicnoIn(List<String> values) {
            addCriterion("CS_FISHLICNO in", values, "fishlicno");
            return (Criteria) this;
        }

        public Criteria andFishlicnoNotIn(List<String> values) {
            addCriterion("CS_FISHLICNO not in", values, "fishlicno");
            return (Criteria) this;
        }

        public Criteria andFishlicnoBetween(String value1, String value2) {
            addCriterion("CS_FISHLICNO between", value1, value2, "fishlicno");
            return (Criteria) this;
        }

        public Criteria andFishlicnoNotBetween(String value1, String value2) {
            addCriterion("CS_FISHLICNO not between", value1, value2, "fishlicno");
            return (Criteria) this;
        }

        public Criteria andShipcertvalIsNull() {
            addCriterion("CS_SHIPCERTVAL is null");
            return (Criteria) this;
        }

        public Criteria andShipcertvalIsNotNull() {
            addCriterion("CS_SHIPCERTVAL is not null");
            return (Criteria) this;
        }

        public Criteria andShipcertvalEqualTo(String value) {
            addCriterion("CS_SHIPCERTVAL =", value, "shipcertval");
            return (Criteria) this;
        }

        public Criteria andShipcertvalNotEqualTo(String value) {
            addCriterion("CS_SHIPCERTVAL <>", value, "shipcertval");
            return (Criteria) this;
        }

        public Criteria andShipcertvalGreaterThan(String value) {
            addCriterion("CS_SHIPCERTVAL >", value, "shipcertval");
            return (Criteria) this;
        }

        public Criteria andShipcertvalGreaterThanOrEqualTo(String value) {
            addCriterion("CS_SHIPCERTVAL >=", value, "shipcertval");
            return (Criteria) this;
        }

        public Criteria andShipcertvalLessThan(String value) {
            addCriterion("CS_SHIPCERTVAL <", value, "shipcertval");
            return (Criteria) this;
        }

        public Criteria andShipcertvalLessThanOrEqualTo(String value) {
            addCriterion("CS_SHIPCERTVAL <=", value, "shipcertval");
            return (Criteria) this;
        }

        public Criteria andShipcertvalLike(String value) {
            addCriterion("CS_SHIPCERTVAL like", value, "shipcertval");
            return (Criteria) this;
        }

        public Criteria andShipcertvalNotLike(String value) {
            addCriterion("CS_SHIPCERTVAL not like", value, "shipcertval");
            return (Criteria) this;
        }

        public Criteria andShipcertvalIn(List<String> values) {
            addCriterion("CS_SHIPCERTVAL in", values, "shipcertval");
            return (Criteria) this;
        }

        public Criteria andShipcertvalNotIn(List<String> values) {
            addCriterion("CS_SHIPCERTVAL not in", values, "shipcertval");
            return (Criteria) this;
        }

        public Criteria andShipcertvalBetween(String value1, String value2) {
            addCriterion("CS_SHIPCERTVAL between", value1, value2, "shipcertval");
            return (Criteria) this;
        }

        public Criteria andShipcertvalNotBetween(String value1, String value2) {
            addCriterion("CS_SHIPCERTVAL not between", value1, value2, "shipcertval");
            return (Criteria) this;
        }

        public Criteria andShipcertnoIsNull() {
            addCriterion("CS_SHIPCERTNO is null");
            return (Criteria) this;
        }

        public Criteria andShipcertnoIsNotNull() {
            addCriterion("CS_SHIPCERTNO is not null");
            return (Criteria) this;
        }

        public Criteria andShipcertnoEqualTo(String value) {
            addCriterion("CS_SHIPCERTNO =", value, "shipcertno");
            return (Criteria) this;
        }

        public Criteria andShipcertnoNotEqualTo(String value) {
            addCriterion("CS_SHIPCERTNO <>", value, "shipcertno");
            return (Criteria) this;
        }

        public Criteria andShipcertnoGreaterThan(String value) {
            addCriterion("CS_SHIPCERTNO >", value, "shipcertno");
            return (Criteria) this;
        }

        public Criteria andShipcertnoGreaterThanOrEqualTo(String value) {
            addCriterion("CS_SHIPCERTNO >=", value, "shipcertno");
            return (Criteria) this;
        }

        public Criteria andShipcertnoLessThan(String value) {
            addCriterion("CS_SHIPCERTNO <", value, "shipcertno");
            return (Criteria) this;
        }

        public Criteria andShipcertnoLessThanOrEqualTo(String value) {
            addCriterion("CS_SHIPCERTNO <=", value, "shipcertno");
            return (Criteria) this;
        }

        public Criteria andShipcertnoLike(String value) {
            addCriterion("CS_SHIPCERTNO like", value, "shipcertno");
            return (Criteria) this;
        }

        public Criteria andShipcertnoNotLike(String value) {
            addCriterion("CS_SHIPCERTNO not like", value, "shipcertno");
            return (Criteria) this;
        }

        public Criteria andShipcertnoIn(List<String> values) {
            addCriterion("CS_SHIPCERTNO in", values, "shipcertno");
            return (Criteria) this;
        }

        public Criteria andShipcertnoNotIn(List<String> values) {
            addCriterion("CS_SHIPCERTNO not in", values, "shipcertno");
            return (Criteria) this;
        }

        public Criteria andShipcertnoBetween(String value1, String value2) {
            addCriterion("CS_SHIPCERTNO between", value1, value2, "shipcertno");
            return (Criteria) this;
        }

        public Criteria andShipcertnoNotBetween(String value1, String value2) {
            addCriterion("CS_SHIPCERTNO not between", value1, value2, "shipcertno");
            return (Criteria) this;
        }

        public Criteria andRegcertdateIsNull() {
            addCriterion("CS_REGCERTDATE is null");
            return (Criteria) this;
        }

        public Criteria andRegcertdateIsNotNull() {
            addCriterion("CS_REGCERTDATE is not null");
            return (Criteria) this;
        }

        public Criteria andRegcertdateEqualTo(String value) {
            addCriterion("CS_REGCERTDATE =", value, "regcertdate");
            return (Criteria) this;
        }

        public Criteria andRegcertdateNotEqualTo(String value) {
            addCriterion("CS_REGCERTDATE <>", value, "regcertdate");
            return (Criteria) this;
        }

        public Criteria andRegcertdateGreaterThan(String value) {
            addCriterion("CS_REGCERTDATE >", value, "regcertdate");
            return (Criteria) this;
        }

        public Criteria andRegcertdateGreaterThanOrEqualTo(String value) {
            addCriterion("CS_REGCERTDATE >=", value, "regcertdate");
            return (Criteria) this;
        }

        public Criteria andRegcertdateLessThan(String value) {
            addCriterion("CS_REGCERTDATE <", value, "regcertdate");
            return (Criteria) this;
        }

        public Criteria andRegcertdateLessThanOrEqualTo(String value) {
            addCriterion("CS_REGCERTDATE <=", value, "regcertdate");
            return (Criteria) this;
        }

        public Criteria andRegcertdateLike(String value) {
            addCriterion("CS_REGCERTDATE like", value, "regcertdate");
            return (Criteria) this;
        }

        public Criteria andRegcertdateNotLike(String value) {
            addCriterion("CS_REGCERTDATE not like", value, "regcertdate");
            return (Criteria) this;
        }

        public Criteria andRegcertdateIn(List<String> values) {
            addCriterion("CS_REGCERTDATE in", values, "regcertdate");
            return (Criteria) this;
        }

        public Criteria andRegcertdateNotIn(List<String> values) {
            addCriterion("CS_REGCERTDATE not in", values, "regcertdate");
            return (Criteria) this;
        }

        public Criteria andRegcertdateBetween(String value1, String value2) {
            addCriterion("CS_REGCERTDATE between", value1, value2, "regcertdate");
            return (Criteria) this;
        }

        public Criteria andRegcertdateNotBetween(String value1, String value2) {
            addCriterion("CS_REGCERTDATE not between", value1, value2, "regcertdate");
            return (Criteria) this;
        }

        public Criteria andRegcertnoIsNull() {
            addCriterion("CS_REGCERTNO is null");
            return (Criteria) this;
        }

        public Criteria andRegcertnoIsNotNull() {
            addCriterion("CS_REGCERTNO is not null");
            return (Criteria) this;
        }

        public Criteria andRegcertnoEqualTo(String value) {
            addCriterion("CS_REGCERTNO =", value, "regcertno");
            return (Criteria) this;
        }

        public Criteria andRegcertnoNotEqualTo(String value) {
            addCriterion("CS_REGCERTNO <>", value, "regcertno");
            return (Criteria) this;
        }

        public Criteria andRegcertnoGreaterThan(String value) {
            addCriterion("CS_REGCERTNO >", value, "regcertno");
            return (Criteria) this;
        }

        public Criteria andRegcertnoGreaterThanOrEqualTo(String value) {
            addCriterion("CS_REGCERTNO >=", value, "regcertno");
            return (Criteria) this;
        }

        public Criteria andRegcertnoLessThan(String value) {
            addCriterion("CS_REGCERTNO <", value, "regcertno");
            return (Criteria) this;
        }

        public Criteria andRegcertnoLessThanOrEqualTo(String value) {
            addCriterion("CS_REGCERTNO <=", value, "regcertno");
            return (Criteria) this;
        }

        public Criteria andRegcertnoLike(String value) {
            addCriterion("CS_REGCERTNO like", value, "regcertno");
            return (Criteria) this;
        }

        public Criteria andRegcertnoNotLike(String value) {
            addCriterion("CS_REGCERTNO not like", value, "regcertno");
            return (Criteria) this;
        }

        public Criteria andRegcertnoIn(List<String> values) {
            addCriterion("CS_REGCERTNO in", values, "regcertno");
            return (Criteria) this;
        }

        public Criteria andRegcertnoNotIn(List<String> values) {
            addCriterion("CS_REGCERTNO not in", values, "regcertno");
            return (Criteria) this;
        }

        public Criteria andRegcertnoBetween(String value1, String value2) {
            addCriterion("CS_REGCERTNO between", value1, value2, "regcertno");
            return (Criteria) this;
        }

        public Criteria andRegcertnoNotBetween(String value1, String value2) {
            addCriterion("CS_REGCERTNO not between", value1, value2, "regcertno");
            return (Criteria) this;
        }

        public Criteria andOwnerobtdateIsNull() {
            addCriterion("CS_OWNEROBTDATE is null");
            return (Criteria) this;
        }

        public Criteria andOwnerobtdateIsNotNull() {
            addCriterion("CS_OWNEROBTDATE is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerobtdateEqualTo(String value) {
            addCriterion("CS_OWNEROBTDATE =", value, "ownerobtdate");
            return (Criteria) this;
        }

        public Criteria andOwnerobtdateNotEqualTo(String value) {
            addCriterion("CS_OWNEROBTDATE <>", value, "ownerobtdate");
            return (Criteria) this;
        }

        public Criteria andOwnerobtdateGreaterThan(String value) {
            addCriterion("CS_OWNEROBTDATE >", value, "ownerobtdate");
            return (Criteria) this;
        }

        public Criteria andOwnerobtdateGreaterThanOrEqualTo(String value) {
            addCriterion("CS_OWNEROBTDATE >=", value, "ownerobtdate");
            return (Criteria) this;
        }

        public Criteria andOwnerobtdateLessThan(String value) {
            addCriterion("CS_OWNEROBTDATE <", value, "ownerobtdate");
            return (Criteria) this;
        }

        public Criteria andOwnerobtdateLessThanOrEqualTo(String value) {
            addCriterion("CS_OWNEROBTDATE <=", value, "ownerobtdate");
            return (Criteria) this;
        }

        public Criteria andOwnerobtdateLike(String value) {
            addCriterion("CS_OWNEROBTDATE like", value, "ownerobtdate");
            return (Criteria) this;
        }

        public Criteria andOwnerobtdateNotLike(String value) {
            addCriterion("CS_OWNEROBTDATE not like", value, "ownerobtdate");
            return (Criteria) this;
        }

        public Criteria andOwnerobtdateIn(List<String> values) {
            addCriterion("CS_OWNEROBTDATE in", values, "ownerobtdate");
            return (Criteria) this;
        }

        public Criteria andOwnerobtdateNotIn(List<String> values) {
            addCriterion("CS_OWNEROBTDATE not in", values, "ownerobtdate");
            return (Criteria) this;
        }

        public Criteria andOwnerobtdateBetween(String value1, String value2) {
            addCriterion("CS_OWNEROBTDATE between", value1, value2, "ownerobtdate");
            return (Criteria) this;
        }

        public Criteria andOwnerobtdateNotBetween(String value1, String value2) {
            addCriterion("CS_OWNEROBTDATE not between", value1, value2, "ownerobtdate");
            return (Criteria) this;
        }

        public Criteria andEndregcertnoIsNull() {
            addCriterion("CS_ENDREGCERTNO is null");
            return (Criteria) this;
        }

        public Criteria andEndregcertnoIsNotNull() {
            addCriterion("CS_ENDREGCERTNO is not null");
            return (Criteria) this;
        }

        public Criteria andEndregcertnoEqualTo(String value) {
            addCriterion("CS_ENDREGCERTNO =", value, "endregcertno");
            return (Criteria) this;
        }

        public Criteria andEndregcertnoNotEqualTo(String value) {
            addCriterion("CS_ENDREGCERTNO <>", value, "endregcertno");
            return (Criteria) this;
        }

        public Criteria andEndregcertnoGreaterThan(String value) {
            addCriterion("CS_ENDREGCERTNO >", value, "endregcertno");
            return (Criteria) this;
        }

        public Criteria andEndregcertnoGreaterThanOrEqualTo(String value) {
            addCriterion("CS_ENDREGCERTNO >=", value, "endregcertno");
            return (Criteria) this;
        }

        public Criteria andEndregcertnoLessThan(String value) {
            addCriterion("CS_ENDREGCERTNO <", value, "endregcertno");
            return (Criteria) this;
        }

        public Criteria andEndregcertnoLessThanOrEqualTo(String value) {
            addCriterion("CS_ENDREGCERTNO <=", value, "endregcertno");
            return (Criteria) this;
        }

        public Criteria andEndregcertnoLike(String value) {
            addCriterion("CS_ENDREGCERTNO like", value, "endregcertno");
            return (Criteria) this;
        }

        public Criteria andEndregcertnoNotLike(String value) {
            addCriterion("CS_ENDREGCERTNO not like", value, "endregcertno");
            return (Criteria) this;
        }

        public Criteria andEndregcertnoIn(List<String> values) {
            addCriterion("CS_ENDREGCERTNO in", values, "endregcertno");
            return (Criteria) this;
        }

        public Criteria andEndregcertnoNotIn(List<String> values) {
            addCriterion("CS_ENDREGCERTNO not in", values, "endregcertno");
            return (Criteria) this;
        }

        public Criteria andEndregcertnoBetween(String value1, String value2) {
            addCriterion("CS_ENDREGCERTNO between", value1, value2, "endregcertno");
            return (Criteria) this;
        }

        public Criteria andEndregcertnoNotBetween(String value1, String value2) {
            addCriterion("CS_ENDREGCERTNO not between", value1, value2, "endregcertno");
            return (Criteria) this;
        }

        public Criteria andShipinsappIsNull() {
            addCriterion("CS_SHIPINSAPP is null");
            return (Criteria) this;
        }

        public Criteria andShipinsappIsNotNull() {
            addCriterion("CS_SHIPINSAPP is not null");
            return (Criteria) this;
        }

        public Criteria andShipinsappEqualTo(String value) {
            addCriterion("CS_SHIPINSAPP =", value, "shipinsapp");
            return (Criteria) this;
        }

        public Criteria andShipinsappNotEqualTo(String value) {
            addCriterion("CS_SHIPINSAPP <>", value, "shipinsapp");
            return (Criteria) this;
        }

        public Criteria andShipinsappGreaterThan(String value) {
            addCriterion("CS_SHIPINSAPP >", value, "shipinsapp");
            return (Criteria) this;
        }

        public Criteria andShipinsappGreaterThanOrEqualTo(String value) {
            addCriterion("CS_SHIPINSAPP >=", value, "shipinsapp");
            return (Criteria) this;
        }

        public Criteria andShipinsappLessThan(String value) {
            addCriterion("CS_SHIPINSAPP <", value, "shipinsapp");
            return (Criteria) this;
        }

        public Criteria andShipinsappLessThanOrEqualTo(String value) {
            addCriterion("CS_SHIPINSAPP <=", value, "shipinsapp");
            return (Criteria) this;
        }

        public Criteria andShipinsappLike(String value) {
            addCriterion("CS_SHIPINSAPP like", value, "shipinsapp");
            return (Criteria) this;
        }

        public Criteria andShipinsappNotLike(String value) {
            addCriterion("CS_SHIPINSAPP not like", value, "shipinsapp");
            return (Criteria) this;
        }

        public Criteria andShipinsappIn(List<String> values) {
            addCriterion("CS_SHIPINSAPP in", values, "shipinsapp");
            return (Criteria) this;
        }

        public Criteria andShipinsappNotIn(List<String> values) {
            addCriterion("CS_SHIPINSAPP not in", values, "shipinsapp");
            return (Criteria) this;
        }

        public Criteria andShipinsappBetween(String value1, String value2) {
            addCriterion("CS_SHIPINSAPP between", value1, value2, "shipinsapp");
            return (Criteria) this;
        }

        public Criteria andShipinsappNotBetween(String value1, String value2) {
            addCriterion("CS_SHIPINSAPP not between", value1, value2, "shipinsapp");
            return (Criteria) this;
        }

        public Criteria andRegareaIsNull() {
            addCriterion("CS_REGAREA is null");
            return (Criteria) this;
        }

        public Criteria andRegareaIsNotNull() {
            addCriterion("CS_REGAREA is not null");
            return (Criteria) this;
        }

        public Criteria andRegareaEqualTo(String value) {
            addCriterion("CS_REGAREA =", value, "regarea");
            return (Criteria) this;
        }

        public Criteria andRegareaNotEqualTo(String value) {
            addCriterion("CS_REGAREA <>", value, "regarea");
            return (Criteria) this;
        }

        public Criteria andRegareaGreaterThan(String value) {
            addCriterion("CS_REGAREA >", value, "regarea");
            return (Criteria) this;
        }

        public Criteria andRegareaGreaterThanOrEqualTo(String value) {
            addCriterion("CS_REGAREA >=", value, "regarea");
            return (Criteria) this;
        }

        public Criteria andRegareaLessThan(String value) {
            addCriterion("CS_REGAREA <", value, "regarea");
            return (Criteria) this;
        }

        public Criteria andRegareaLessThanOrEqualTo(String value) {
            addCriterion("CS_REGAREA <=", value, "regarea");
            return (Criteria) this;
        }

        public Criteria andRegareaLike(String value) {
            addCriterion("CS_REGAREA like", value, "regarea");
            return (Criteria) this;
        }

        public Criteria andRegareaNotLike(String value) {
            addCriterion("CS_REGAREA not like", value, "regarea");
            return (Criteria) this;
        }

        public Criteria andRegareaIn(List<String> values) {
            addCriterion("CS_REGAREA in", values, "regarea");
            return (Criteria) this;
        }

        public Criteria andRegareaNotIn(List<String> values) {
            addCriterion("CS_REGAREA not in", values, "regarea");
            return (Criteria) this;
        }

        public Criteria andRegareaBetween(String value1, String value2) {
            addCriterion("CS_REGAREA between", value1, value2, "regarea");
            return (Criteria) this;
        }

        public Criteria andRegareaNotBetween(String value1, String value2) {
            addCriterion("CS_REGAREA not between", value1, value2, "regarea");
            return (Criteria) this;
        }

        public Criteria andPosxIsNull() {
            addCriterion("CS_POSX is null");
            return (Criteria) this;
        }

        public Criteria andPosxIsNotNull() {
            addCriterion("CS_POSX is not null");
            return (Criteria) this;
        }

        public Criteria andPosxEqualTo(String value) {
            addCriterion("CS_POSX =", value, "posx");
            return (Criteria) this;
        }

        public Criteria andPosxNotEqualTo(String value) {
            addCriterion("CS_POSX <>", value, "posx");
            return (Criteria) this;
        }

        public Criteria andPosxGreaterThan(String value) {
            addCriterion("CS_POSX >", value, "posx");
            return (Criteria) this;
        }

        public Criteria andPosxGreaterThanOrEqualTo(String value) {
            addCriterion("CS_POSX >=", value, "posx");
            return (Criteria) this;
        }

        public Criteria andPosxLessThan(String value) {
            addCriterion("CS_POSX <", value, "posx");
            return (Criteria) this;
        }

        public Criteria andPosxLessThanOrEqualTo(String value) {
            addCriterion("CS_POSX <=", value, "posx");
            return (Criteria) this;
        }

        public Criteria andPosxLike(String value) {
            addCriterion("CS_POSX like", value, "posx");
            return (Criteria) this;
        }

        public Criteria andPosxNotLike(String value) {
            addCriterion("CS_POSX not like", value, "posx");
            return (Criteria) this;
        }

        public Criteria andPosxIn(List<String> values) {
            addCriterion("CS_POSX in", values, "posx");
            return (Criteria) this;
        }

        public Criteria andPosxNotIn(List<String> values) {
            addCriterion("CS_POSX not in", values, "posx");
            return (Criteria) this;
        }

        public Criteria andPosxBetween(String value1, String value2) {
            addCriterion("CS_POSX between", value1, value2, "posx");
            return (Criteria) this;
        }

        public Criteria andPosxNotBetween(String value1, String value2) {
            addCriterion("CS_POSX not between", value1, value2, "posx");
            return (Criteria) this;
        }

        public Criteria andPosyIsNull() {
            addCriterion("CS_POSY is null");
            return (Criteria) this;
        }

        public Criteria andPosyIsNotNull() {
            addCriterion("CS_POSY is not null");
            return (Criteria) this;
        }

        public Criteria andPosyEqualTo(String value) {
            addCriterion("CS_POSY =", value, "posy");
            return (Criteria) this;
        }

        public Criteria andPosyNotEqualTo(String value) {
            addCriterion("CS_POSY <>", value, "posy");
            return (Criteria) this;
        }

        public Criteria andPosyGreaterThan(String value) {
            addCriterion("CS_POSY >", value, "posy");
            return (Criteria) this;
        }

        public Criteria andPosyGreaterThanOrEqualTo(String value) {
            addCriterion("CS_POSY >=", value, "posy");
            return (Criteria) this;
        }

        public Criteria andPosyLessThan(String value) {
            addCriterion("CS_POSY <", value, "posy");
            return (Criteria) this;
        }

        public Criteria andPosyLessThanOrEqualTo(String value) {
            addCriterion("CS_POSY <=", value, "posy");
            return (Criteria) this;
        }

        public Criteria andPosyLike(String value) {
            addCriterion("CS_POSY like", value, "posy");
            return (Criteria) this;
        }

        public Criteria andPosyNotLike(String value) {
            addCriterion("CS_POSY not like", value, "posy");
            return (Criteria) this;
        }

        public Criteria andPosyIn(List<String> values) {
            addCriterion("CS_POSY in", values, "posy");
            return (Criteria) this;
        }

        public Criteria andPosyNotIn(List<String> values) {
            addCriterion("CS_POSY not in", values, "posy");
            return (Criteria) this;
        }

        public Criteria andPosyBetween(String value1, String value2) {
            addCriterion("CS_POSY between", value1, value2, "posy");
            return (Criteria) this;
        }

        public Criteria andPosyNotBetween(String value1, String value2) {
            addCriterion("CS_POSY not between", value1, value2, "posy");
            return (Criteria) this;
        }

        public Criteria andPostimeIsNull() {
            addCriterion("CS_POSTIME is null");
            return (Criteria) this;
        }

        public Criteria andPostimeIsNotNull() {
            addCriterion("CS_POSTIME is not null");
            return (Criteria) this;
        }

        public Criteria andPostimeEqualTo(String value) {
            addCriterion("CS_POSTIME =", value, "postime");
            return (Criteria) this;
        }

        public Criteria andPostimeNotEqualTo(String value) {
            addCriterion("CS_POSTIME <>", value, "postime");
            return (Criteria) this;
        }

        public Criteria andPostimeGreaterThan(String value) {
            addCriterion("CS_POSTIME >", value, "postime");
            return (Criteria) this;
        }

        public Criteria andPostimeGreaterThanOrEqualTo(String value) {
            addCriterion("CS_POSTIME >=", value, "postime");
            return (Criteria) this;
        }

        public Criteria andPostimeLessThan(String value) {
            addCriterion("CS_POSTIME <", value, "postime");
            return (Criteria) this;
        }

        public Criteria andPostimeLessThanOrEqualTo(String value) {
            addCriterion("CS_POSTIME <=", value, "postime");
            return (Criteria) this;
        }

        public Criteria andPostimeLike(String value) {
            addCriterion("CS_POSTIME like", value, "postime");
            return (Criteria) this;
        }

        public Criteria andPostimeNotLike(String value) {
            addCriterion("CS_POSTIME not like", value, "postime");
            return (Criteria) this;
        }

        public Criteria andPostimeIn(List<String> values) {
            addCriterion("CS_POSTIME in", values, "postime");
            return (Criteria) this;
        }

        public Criteria andPostimeNotIn(List<String> values) {
            addCriterion("CS_POSTIME not in", values, "postime");
            return (Criteria) this;
        }

        public Criteria andPostimeBetween(String value1, String value2) {
            addCriterion("CS_POSTIME between", value1, value2, "postime");
            return (Criteria) this;
        }

        public Criteria andPostimeNotBetween(String value1, String value2) {
            addCriterion("CS_POSTIME not between", value1, value2, "postime");
            return (Criteria) this;
        }

        public Criteria andJobareaIsNull() {
            addCriterion("CS_JOBAREA is null");
            return (Criteria) this;
        }

        public Criteria andJobareaIsNotNull() {
            addCriterion("CS_JOBAREA is not null");
            return (Criteria) this;
        }

        public Criteria andJobareaEqualTo(String value) {
            addCriterion("CS_JOBAREA =", value, "jobarea");
            return (Criteria) this;
        }

        public Criteria andJobareaNotEqualTo(String value) {
            addCriterion("CS_JOBAREA <>", value, "jobarea");
            return (Criteria) this;
        }

        public Criteria andJobareaGreaterThan(String value) {
            addCriterion("CS_JOBAREA >", value, "jobarea");
            return (Criteria) this;
        }

        public Criteria andJobareaGreaterThanOrEqualTo(String value) {
            addCriterion("CS_JOBAREA >=", value, "jobarea");
            return (Criteria) this;
        }

        public Criteria andJobareaLessThan(String value) {
            addCriterion("CS_JOBAREA <", value, "jobarea");
            return (Criteria) this;
        }

        public Criteria andJobareaLessThanOrEqualTo(String value) {
            addCriterion("CS_JOBAREA <=", value, "jobarea");
            return (Criteria) this;
        }

        public Criteria andJobareaLike(String value) {
            addCriterion("CS_JOBAREA like", value, "jobarea");
            return (Criteria) this;
        }

        public Criteria andJobareaNotLike(String value) {
            addCriterion("CS_JOBAREA not like", value, "jobarea");
            return (Criteria) this;
        }

        public Criteria andJobareaIn(List<String> values) {
            addCriterion("CS_JOBAREA in", values, "jobarea");
            return (Criteria) this;
        }

        public Criteria andJobareaNotIn(List<String> values) {
            addCriterion("CS_JOBAREA not in", values, "jobarea");
            return (Criteria) this;
        }

        public Criteria andJobareaBetween(String value1, String value2) {
            addCriterion("CS_JOBAREA between", value1, value2, "jobarea");
            return (Criteria) this;
        }

        public Criteria andJobareaNotBetween(String value1, String value2) {
            addCriterion("CS_JOBAREA not between", value1, value2, "jobarea");
            return (Criteria) this;
        }

        public Criteria andDatastatusIsNull() {
            addCriterion("CS_DATASTATUS is null");
            return (Criteria) this;
        }

        public Criteria andDatastatusIsNotNull() {
            addCriterion("CS_DATASTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andDatastatusEqualTo(String value) {
            addCriterion("CS_DATASTATUS =", value, "datastatus");
            return (Criteria) this;
        }

        public Criteria andDatastatusNotEqualTo(String value) {
            addCriterion("CS_DATASTATUS <>", value, "datastatus");
            return (Criteria) this;
        }

        public Criteria andDatastatusGreaterThan(String value) {
            addCriterion("CS_DATASTATUS >", value, "datastatus");
            return (Criteria) this;
        }

        public Criteria andDatastatusGreaterThanOrEqualTo(String value) {
            addCriterion("CS_DATASTATUS >=", value, "datastatus");
            return (Criteria) this;
        }

        public Criteria andDatastatusLessThan(String value) {
            addCriterion("CS_DATASTATUS <", value, "datastatus");
            return (Criteria) this;
        }

        public Criteria andDatastatusLessThanOrEqualTo(String value) {
            addCriterion("CS_DATASTATUS <=", value, "datastatus");
            return (Criteria) this;
        }

        public Criteria andDatastatusLike(String value) {
            addCriterion("CS_DATASTATUS like", value, "datastatus");
            return (Criteria) this;
        }

        public Criteria andDatastatusNotLike(String value) {
            addCriterion("CS_DATASTATUS not like", value, "datastatus");
            return (Criteria) this;
        }

        public Criteria andDatastatusIn(List<String> values) {
            addCriterion("CS_DATASTATUS in", values, "datastatus");
            return (Criteria) this;
        }

        public Criteria andDatastatusNotIn(List<String> values) {
            addCriterion("CS_DATASTATUS not in", values, "datastatus");
            return (Criteria) this;
        }

        public Criteria andDatastatusBetween(String value1, String value2) {
            addCriterion("CS_DATASTATUS between", value1, value2, "datastatus");
            return (Criteria) this;
        }

        public Criteria andDatastatusNotBetween(String value1, String value2) {
            addCriterion("CS_DATASTATUS not between", value1, value2, "datastatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusIsNull() {
            addCriterion("CS_CHECKSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andCheckstatusIsNotNull() {
            addCriterion("CS_CHECKSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andCheckstatusEqualTo(String value) {
            addCriterion("CS_CHECKSTATUS =", value, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusNotEqualTo(String value) {
            addCriterion("CS_CHECKSTATUS <>", value, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusGreaterThan(String value) {
            addCriterion("CS_CHECKSTATUS >", value, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusGreaterThanOrEqualTo(String value) {
            addCriterion("CS_CHECKSTATUS >=", value, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusLessThan(String value) {
            addCriterion("CS_CHECKSTATUS <", value, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusLessThanOrEqualTo(String value) {
            addCriterion("CS_CHECKSTATUS <=", value, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusLike(String value) {
            addCriterion("CS_CHECKSTATUS like", value, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusNotLike(String value) {
            addCriterion("CS_CHECKSTATUS not like", value, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusIn(List<String> values) {
            addCriterion("CS_CHECKSTATUS in", values, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusNotIn(List<String> values) {
            addCriterion("CS_CHECKSTATUS not in", values, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusBetween(String value1, String value2) {
            addCriterion("CS_CHECKSTATUS between", value1, value2, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusNotBetween(String value1, String value2) {
            addCriterion("CS_CHECKSTATUS not between", value1, value2, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andMmsiIsNull() {
            addCriterion("CS_MMSI is null");
            return (Criteria) this;
        }

        public Criteria andMmsiIsNotNull() {
            addCriterion("CS_MMSI is not null");
            return (Criteria) this;
        }

        public Criteria andMmsiEqualTo(String value) {
            addCriterion("CS_MMSI =", value, "mmsi");
            return (Criteria) this;
        }

        public Criteria andMmsiNotEqualTo(String value) {
            addCriterion("CS_MMSI <>", value, "mmsi");
            return (Criteria) this;
        }

        public Criteria andMmsiGreaterThan(String value) {
            addCriterion("CS_MMSI >", value, "mmsi");
            return (Criteria) this;
        }

        public Criteria andMmsiGreaterThanOrEqualTo(String value) {
            addCriterion("CS_MMSI >=", value, "mmsi");
            return (Criteria) this;
        }

        public Criteria andMmsiLessThan(String value) {
            addCriterion("CS_MMSI <", value, "mmsi");
            return (Criteria) this;
        }

        public Criteria andMmsiLessThanOrEqualTo(String value) {
            addCriterion("CS_MMSI <=", value, "mmsi");
            return (Criteria) this;
        }

        public Criteria andMmsiLike(String value) {
            addCriterion("CS_MMSI like", value, "mmsi");
            return (Criteria) this;
        }

        public Criteria andMmsiNotLike(String value) {
            addCriterion("CS_MMSI not like", value, "mmsi");
            return (Criteria) this;
        }

        public Criteria andMmsiIn(List<String> values) {
            addCriterion("CS_MMSI in", values, "mmsi");
            return (Criteria) this;
        }

        public Criteria andMmsiNotIn(List<String> values) {
            addCriterion("CS_MMSI not in", values, "mmsi");
            return (Criteria) this;
        }

        public Criteria andMmsiBetween(String value1, String value2) {
            addCriterion("CS_MMSI between", value1, value2, "mmsi");
            return (Criteria) this;
        }

        public Criteria andMmsiNotBetween(String value1, String value2) {
            addCriterion("CS_MMSI not between", value1, value2, "mmsi");
            return (Criteria) this;
        }

        public Criteria andIdLikeInsensitive(String value) {
            addCriterion("upper(CS_ID) like", value.toUpperCase(), "id");
            return (Criteria) this;
        }

        public Criteria andShipnameLikeInsensitive(String value) {
            addCriterion("upper(CS_SHIPNAME) like", value.toUpperCase(), "shipname");
            return (Criteria) this;
        }

        public Criteria andCallsignLikeInsensitive(String value) {
            addCriterion("upper(CS_CALLSIGN) like", value.toUpperCase(), "callsign");
            return (Criteria) this;
        }

        public Criteria andShipmaterialLikeInsensitive(String value) {
            addCriterion("upper(CS_SHIPMATERIAL) like", value.toUpperCase(), "shipmaterial");
            return (Criteria) this;
        }

        public Criteria andShipnameplanLikeInsensitive(String value) {
            addCriterion("upper(CS_SHIPNAMEPLAN) like", value.toUpperCase(), "shipnameplan");
            return (Criteria) this;
        }

        public Criteria andModelwidthLikeInsensitive(String value) {
            addCriterion("upper(CS_MODELWIDTH) like", value.toUpperCase(), "modelwidth");
            return (Criteria) this;
        }

        public Criteria andModeldepthLikeInsensitive(String value) {
            addCriterion("upper(CS_MODELDEPTH) like", value.toUpperCase(), "modeldepth");
            return (Criteria) this;
        }

        public Criteria andFreshwatervLikeInsensitive(String value) {
            addCriterion("upper(CS_FRESHWATERV) like", value.toUpperCase(), "freshwaterv");
            return (Criteria) this;
        }

        public Criteria andBollardpullLikeInsensitive(String value) {
            addCriterion("upper(CS_BOLLARDPULL) like", value.toUpperCase(), "bollardpull");
            return (Criteria) this;
        }

        public Criteria andPowerLikeInsensitive(String value) {
            addCriterion("upper(CS_POWER) like", value.toUpperCase(), "power");
            return (Criteria) this;
        }

        public Criteria andCompletdateLikeInsensitive(String value) {
            addCriterion("upper(CS_COMPLETDATE) like", value.toUpperCase(), "completdate");
            return (Criteria) this;
        }

        public Criteria andDrawnoLikeInsensitive(String value) {
            addCriterion("upper(CS_DRAWNO) like", value.toUpperCase(), "drawno");
            return (Criteria) this;
        }

        public Criteria andFreshkeepLikeInsensitive(String value) {
            addCriterion("upper(CS_FRESHKEEP) like", value.toUpperCase(), "freshkeep");
            return (Criteria) this;
        }

        public Criteria andDesspeedLikeInsensitive(String value) {
            addCriterion("upper(CS_DESSPEED) like", value.toUpperCase(), "desspeed");
            return (Criteria) this;
        }

        public Criteria andCrewquotaLikeInsensitive(String value) {
            addCriterion("upper(CS_CREWQUOTA) like", value.toUpperCase(), "crewquota");
            return (Criteria) this;
        }

        public Criteria andFishcubLikeInsensitive(String value) {
            addCriterion("upper(CS_FISHCUB) like", value.toUpperCase(), "fishcub");
            return (Criteria) this;
        }

        public Criteria andPropellereffLikeInsensitive(String value) {
            addCriterion("upper(CS_PROPELLEREFF) like", value.toUpperCase(), "propellereff");
            return (Criteria) this;
        }

        public Criteria andPitchstatusLikeInsensitive(String value) {
            addCriterion("upper(CS_PITCHSTATUS) like", value.toUpperCase(), "pitchstatus");
            return (Criteria) this;
        }

        public Criteria andShipcodeLikeInsensitive(String value) {
            addCriterion("upper(CS_SHIPCODE) like", value.toUpperCase(), "shipcode");
            return (Criteria) this;
        }

        public Criteria andShiptypeLikeInsensitive(String value) {
            addCriterion("upper(CS_SHIPTYPE) like", value.toUpperCase(), "shiptype");
            return (Criteria) this;
        }

        public Criteria andNavzoneLikeInsensitive(String value) {
            addCriterion("upper(CS_NAVZONE) like", value.toUpperCase(), "navzone");
            return (Criteria) this;
        }

        public Criteria andShiplengthLikeInsensitive(String value) {
            addCriterion("upper(CS_SHIPLENGTH) like", value.toUpperCase(), "shiplength");
            return (Criteria) this;
        }

        public Criteria andDesdraftLikeInsensitive(String value) {
            addCriterion("upper(CS_DESDRAFT) like", value.toUpperCase(), "desdraft");
            return (Criteria) this;
        }

        public Criteria andFreeboardLikeInsensitive(String value) {
            addCriterion("upper(CS_FREEBOARD) like", value.toUpperCase(), "freeboard");
            return (Criteria) this;
        }

        public Criteria andShipweightLikeInsensitive(String value) {
            addCriterion("upper(CS_SHIPWEIGHT) like", value.toUpperCase(), "shipweight");
            return (Criteria) this;
        }

        public Criteria andTonnageLikeInsensitive(String value) {
            addCriterion("upper(CS_TONNAGE) like", value.toUpperCase(), "tonnage");
            return (Criteria) this;
        }

        public Criteria andEntnamedesLikeInsensitive(String value) {
            addCriterion("upper(CS_ENTNAMEDES) like", value.toUpperCase(), "entnamedes");
            return (Criteria) this;
        }

        public Criteria andEntdesidLikeInsensitive(String value) {
            addCriterion("upper(CS_ENTDESID) like", value.toUpperCase(), "entdesid");
            return (Criteria) this;
        }

        public Criteria andShipportLikeInsensitive(String value) {
            addCriterion("upper(CS_SHIPPORT) like", value.toUpperCase(), "shipport");
            return (Criteria) this;
        }

        public Criteria andDecksLikeInsensitive(String value) {
            addCriterion("upper(CS_DECKS) like", value.toUpperCase(), "decks");
            return (Criteria) this;
        }

        public Criteria andCovshiplengthLikeInsensitive(String value) {
            addCriterion("upper(CS_COVSHIPLENGTH) like", value.toUpperCase(), "covshiplength");
            return (Criteria) this;
        }

        public Criteria andDeswaterLikeInsensitive(String value) {
            addCriterion("upper(CS_DESWATER) like", value.toUpperCase(), "deswater");
            return (Criteria) this;
        }

        public Criteria andOilvLikeInsensitive(String value) {
            addCriterion("upper(CS_OILV) like", value.toUpperCase(), "oilv");
            return (Criteria) this;
        }

        public Criteria andBallastLikeInsensitive(String value) {
            addCriterion("upper(CS_BALLAST) like", value.toUpperCase(), "ballast");
            return (Criteria) this;
        }

        public Criteria andNettonnageLikeInsensitive(String value) {
            addCriterion("upper(CS_NETTONNAGE) like", value.toUpperCase(), "nettonnage");
            return (Criteria) this;
        }

        public Criteria andEntnamebulLikeInsensitive(String value) {
            addCriterion("upper(CS_ENTNAMEBUL) like", value.toUpperCase(), "entnamebul");
            return (Criteria) this;
        }

        public Criteria andEntbulidLikeInsensitive(String value) {
            addCriterion("upper(CS_ENTBULID) like", value.toUpperCase(), "entbulid");
            return (Criteria) this;
        }

        public Criteria andOrgidLikeInsensitive(String value) {
            addCriterion("upper(CS_ORGID) like", value.toUpperCase(), "orgid");
            return (Criteria) this;
        }

        public Criteria andShiprovnameLikeInsensitive(String value) {
            addCriterion("upper(CS_SHIPROVNAME) like", value.toUpperCase(), "shiprovname");
            return (Criteria) this;
        }

        public Criteria andHostmodel1LikeInsensitive(String value) {
            addCriterion("upper(CS_HOSTMODEL1) like", value.toUpperCase(), "hostmodel1");
            return (Criteria) this;
        }

        public Criteria andHostmodel2LikeInsensitive(String value) {
            addCriterion("upper(CS_HOSTMODEL2) like", value.toUpperCase(), "hostmodel2");
            return (Criteria) this;
        }

        public Criteria andHostmodel3LikeInsensitive(String value) {
            addCriterion("upper(CS_HOSTMODEL3) like", value.toUpperCase(), "hostmodel3");
            return (Criteria) this;
        }

        public Criteria andHostpower1LikeInsensitive(String value) {
            addCriterion("upper(CS_HOSTPOWER1) like", value.toUpperCase(), "hostpower1");
            return (Criteria) this;
        }

        public Criteria andHostpower2LikeInsensitive(String value) {
            addCriterion("upper(CS_HOSTPOWER2) like", value.toUpperCase(), "hostpower2");
            return (Criteria) this;
        }

        public Criteria andHostpower3LikeInsensitive(String value) {
            addCriterion("upper(CS_HOSTPOWER3) like", value.toUpperCase(), "hostpower3");
            return (Criteria) this;
        }

        public Criteria andOwnernoLikeInsensitive(String value) {
            addCriterion("upper(CS_OWNERNO) like", value.toUpperCase(), "ownerno");
            return (Criteria) this;
        }

        public Criteria andFishroomnumLikeInsensitive(String value) {
            addCriterion("upper(CS_FISHROOMNUM) like", value.toUpperCase(), "fishroomnum");
            return (Criteria) this;
        }

        public Criteria andHostnumLikeInsensitive(String value) {
            addCriterion("upper(CS_HOSTNUM) like", value.toUpperCase(), "hostnum");
            return (Criteria) this;
        }

        public Criteria andJobtypeLikeInsensitive(String value) {
            addCriterion("upper(CS_JOBTYPE) like", value.toUpperCase(), "jobtype");
            return (Criteria) this;
        }

        public Criteria andOpemodeLikeInsensitive(String value) {
            addCriterion("upper(CS_OPEMODE) like", value.toUpperCase(), "opemode");
            return (Criteria) this;
        }

        public Criteria andJobtype2LikeInsensitive(String value) {
            addCriterion("upper(CS_JOBTYPE2) like", value.toUpperCase(), "jobtype2");
            return (Criteria) this;
        }

        public Criteria andOpemode2LikeInsensitive(String value) {
            addCriterion("upper(CS_OPEMODE2) like", value.toUpperCase(), "opemode2");
            return (Criteria) this;
        }

        public Criteria andAutopemodeLikeInsensitive(String value) {
            addCriterion("upper(CS_AUTOPEMODE) like", value.toUpperCase(), "autopemode");
            return (Criteria) this;
        }

        public Criteria andWorkplaceLikeInsensitive(String value) {
            addCriterion("upper(CS_WORKPLACE) like", value.toUpperCase(), "workplace");
            return (Criteria) this;
        }

        public Criteria andOwnernameLikeInsensitive(String value) {
            addCriterion("upper(CS_OWNERNAME) like", value.toUpperCase(), "ownername");
            return (Criteria) this;
        }

        public Criteria andOwneraddrLikeInsensitive(String value) {
            addCriterion("upper(CS_OWNERADDR) like", value.toUpperCase(), "owneraddr");
            return (Criteria) this;
        }

        public Criteria andOwnertelLikeInsensitive(String value) {
            addCriterion("upper(CS_OWNERTEL) like", value.toUpperCase(), "ownertel");
            return (Criteria) this;
        }

        public Criteria andPostcodeLikeInsensitive(String value) {
            addCriterion("upper(CS_POSTCODE) like", value.toUpperCase(), "postcode");
            return (Criteria) this;
        }

        public Criteria andPeriodfishlicLikeInsensitive(String value) {
            addCriterion("upper(CS_PERIODFISHLIC) like", value.toUpperCase(), "periodfishlic");
            return (Criteria) this;
        }

        public Criteria andFishlicnoLikeInsensitive(String value) {
            addCriterion("upper(CS_FISHLICNO) like", value.toUpperCase(), "fishlicno");
            return (Criteria) this;
        }

        public Criteria andShipcertvalLikeInsensitive(String value) {
            addCriterion("upper(CS_SHIPCERTVAL) like", value.toUpperCase(), "shipcertval");
            return (Criteria) this;
        }

        public Criteria andShipcertnoLikeInsensitive(String value) {
            addCriterion("upper(CS_SHIPCERTNO) like", value.toUpperCase(), "shipcertno");
            return (Criteria) this;
        }

        public Criteria andRegcertdateLikeInsensitive(String value) {
            addCriterion("upper(CS_REGCERTDATE) like", value.toUpperCase(), "regcertdate");
            return (Criteria) this;
        }

        public Criteria andRegcertnoLikeInsensitive(String value) {
            addCriterion("upper(CS_REGCERTNO) like", value.toUpperCase(), "regcertno");
            return (Criteria) this;
        }

        public Criteria andOwnerobtdateLikeInsensitive(String value) {
            addCriterion("upper(CS_OWNEROBTDATE) like", value.toUpperCase(), "ownerobtdate");
            return (Criteria) this;
        }

        public Criteria andEndregcertnoLikeInsensitive(String value) {
            addCriterion("upper(CS_ENDREGCERTNO) like", value.toUpperCase(), "endregcertno");
            return (Criteria) this;
        }

        public Criteria andShipinsappLikeInsensitive(String value) {
            addCriterion("upper(CS_SHIPINSAPP) like", value.toUpperCase(), "shipinsapp");
            return (Criteria) this;
        }

        public Criteria andRegareaLikeInsensitive(String value) {
            addCriterion("upper(CS_REGAREA) like", value.toUpperCase(), "regarea");
            return (Criteria) this;
        }

        public Criteria andPosxLikeInsensitive(String value) {
            addCriterion("upper(CS_POSX) like", value.toUpperCase(), "posx");
            return (Criteria) this;
        }

        public Criteria andPosyLikeInsensitive(String value) {
            addCriterion("upper(CS_POSY) like", value.toUpperCase(), "posy");
            return (Criteria) this;
        }

        public Criteria andPostimeLikeInsensitive(String value) {
            addCriterion("upper(CS_POSTIME) like", value.toUpperCase(), "postime");
            return (Criteria) this;
        }

        public Criteria andJobareaLikeInsensitive(String value) {
            addCriterion("upper(CS_JOBAREA) like", value.toUpperCase(), "jobarea");
            return (Criteria) this;
        }

        public Criteria andDatastatusLikeInsensitive(String value) {
            addCriterion("upper(CS_DATASTATUS) like", value.toUpperCase(), "datastatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusLikeInsensitive(String value) {
            addCriterion("upper(CS_CHECKSTATUS) like", value.toUpperCase(), "checkstatus");
            return (Criteria) this;
        }

        public Criteria addCondition(String value) {
            addCriterion(value);
            return (Criteria) this;
        }

        public Criteria andMmsiLikeInsensitive(String value) {
            addCriterion("upper(CS_MMSI) like", value.toUpperCase(), "mmsi");
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