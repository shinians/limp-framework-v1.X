package com.chinasofti.domain;

import com.limp.framework.core.bean.Pager;

import java.util.ArrayList;
import java.util.List;

public class ShipInsuranceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Pager page;

    public ShipInsuranceExample() {
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
            addCriterion("CIS_ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("CIS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("CIS_ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("CIS_ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("CIS_ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("CIS_ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("CIS_ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("CIS_ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("CIS_ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("CIS_ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("CIS_ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("CIS_ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("CIS_ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("CIS_ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andShipCodeIsNull() {
            addCriterion("CIS_SHIP_CODE is null");
            return (Criteria) this;
        }

        public Criteria andShipCodeIsNotNull() {
            addCriterion("CIS_SHIP_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andShipCodeEqualTo(String value) {
            addCriterion("CIS_SHIP_CODE =", value, "shipCode");
            return (Criteria) this;
        }

        public Criteria andShipCodeNotEqualTo(String value) {
            addCriterion("CIS_SHIP_CODE <>", value, "shipCode");
            return (Criteria) this;
        }

        public Criteria andShipCodeGreaterThan(String value) {
            addCriterion("CIS_SHIP_CODE >", value, "shipCode");
            return (Criteria) this;
        }

        public Criteria andShipCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CIS_SHIP_CODE >=", value, "shipCode");
            return (Criteria) this;
        }

        public Criteria andShipCodeLessThan(String value) {
            addCriterion("CIS_SHIP_CODE <", value, "shipCode");
            return (Criteria) this;
        }

        public Criteria andShipCodeLessThanOrEqualTo(String value) {
            addCriterion("CIS_SHIP_CODE <=", value, "shipCode");
            return (Criteria) this;
        }

        public Criteria andShipCodeLike(String value) {
            addCriterion("CIS_SHIP_CODE like", value, "shipCode");
            return (Criteria) this;
        }

        public Criteria andShipCodeNotLike(String value) {
            addCriterion("CIS_SHIP_CODE not like", value, "shipCode");
            return (Criteria) this;
        }

        public Criteria andShipCodeIn(List<String> values) {
            addCriterion("CIS_SHIP_CODE in", values, "shipCode");
            return (Criteria) this;
        }

        public Criteria andShipCodeNotIn(List<String> values) {
            addCriterion("CIS_SHIP_CODE not in", values, "shipCode");
            return (Criteria) this;
        }

        public Criteria andShipCodeBetween(String value1, String value2) {
            addCriterion("CIS_SHIP_CODE between", value1, value2, "shipCode");
            return (Criteria) this;
        }

        public Criteria andShipCodeNotBetween(String value1, String value2) {
            addCriterion("CIS_SHIP_CODE not between", value1, value2, "shipCode");
            return (Criteria) this;
        }

        public Criteria andShipNameIsNull() {
            addCriterion("CIS_SHIP_NAME is null");
            return (Criteria) this;
        }

        public Criteria andShipNameIsNotNull() {
            addCriterion("CIS_SHIP_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andShipNameEqualTo(String value) {
            addCriterion("CIS_SHIP_NAME =", value, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameNotEqualTo(String value) {
            addCriterion("CIS_SHIP_NAME <>", value, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameGreaterThan(String value) {
            addCriterion("CIS_SHIP_NAME >", value, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameGreaterThanOrEqualTo(String value) {
            addCriterion("CIS_SHIP_NAME >=", value, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameLessThan(String value) {
            addCriterion("CIS_SHIP_NAME <", value, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameLessThanOrEqualTo(String value) {
            addCriterion("CIS_SHIP_NAME <=", value, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameLike(String value) {
            addCriterion("CIS_SHIP_NAME like", value, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameNotLike(String value) {
            addCriterion("CIS_SHIP_NAME not like", value, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameIn(List<String> values) {
            addCriterion("CIS_SHIP_NAME in", values, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameNotIn(List<String> values) {
            addCriterion("CIS_SHIP_NAME not in", values, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameBetween(String value1, String value2) {
            addCriterion("CIS_SHIP_NAME between", value1, value2, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameNotBetween(String value1, String value2) {
            addCriterion("CIS_SHIP_NAME not between", value1, value2, "shipName");
            return (Criteria) this;
        }

        public Criteria andPoliyFlagIsNull() {
            addCriterion("CIS_POLIY_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andPoliyFlagIsNotNull() {
            addCriterion("CIS_POLIY_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andPoliyFlagEqualTo(String value) {
            addCriterion("CIS_POLIY_FLAG =", value, "poliyFlag");
            return (Criteria) this;
        }

        public Criteria andPoliyFlagNotEqualTo(String value) {
            addCriterion("CIS_POLIY_FLAG <>", value, "poliyFlag");
            return (Criteria) this;
        }

        public Criteria andPoliyFlagGreaterThan(String value) {
            addCriterion("CIS_POLIY_FLAG >", value, "poliyFlag");
            return (Criteria) this;
        }

        public Criteria andPoliyFlagGreaterThanOrEqualTo(String value) {
            addCriterion("CIS_POLIY_FLAG >=", value, "poliyFlag");
            return (Criteria) this;
        }

        public Criteria andPoliyFlagLessThan(String value) {
            addCriterion("CIS_POLIY_FLAG <", value, "poliyFlag");
            return (Criteria) this;
        }

        public Criteria andPoliyFlagLessThanOrEqualTo(String value) {
            addCriterion("CIS_POLIY_FLAG <=", value, "poliyFlag");
            return (Criteria) this;
        }

        public Criteria andPoliyFlagLike(String value) {
            addCriterion("CIS_POLIY_FLAG like", value, "poliyFlag");
            return (Criteria) this;
        }

        public Criteria andPoliyFlagNotLike(String value) {
            addCriterion("CIS_POLIY_FLAG not like", value, "poliyFlag");
            return (Criteria) this;
        }

        public Criteria andPoliyFlagIn(List<String> values) {
            addCriterion("CIS_POLIY_FLAG in", values, "poliyFlag");
            return (Criteria) this;
        }

        public Criteria andPoliyFlagNotIn(List<String> values) {
            addCriterion("CIS_POLIY_FLAG not in", values, "poliyFlag");
            return (Criteria) this;
        }

        public Criteria andPoliyFlagBetween(String value1, String value2) {
            addCriterion("CIS_POLIY_FLAG between", value1, value2, "poliyFlag");
            return (Criteria) this;
        }

        public Criteria andPoliyFlagNotBetween(String value1, String value2) {
            addCriterion("CIS_POLIY_FLAG not between", value1, value2, "poliyFlag");
            return (Criteria) this;
        }

        public Criteria andAssTypeIsNull() {
            addCriterion("CIS_ASS_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andAssTypeIsNotNull() {
            addCriterion("CIS_ASS_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andAssTypeEqualTo(String value) {
            addCriterion("CIS_ASS_TYPE =", value, "assType");
            return (Criteria) this;
        }

        public Criteria andAssTypeNotEqualTo(String value) {
            addCriterion("CIS_ASS_TYPE <>", value, "assType");
            return (Criteria) this;
        }

        public Criteria andAssTypeGreaterThan(String value) {
            addCriterion("CIS_ASS_TYPE >", value, "assType");
            return (Criteria) this;
        }

        public Criteria andAssTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CIS_ASS_TYPE >=", value, "assType");
            return (Criteria) this;
        }

        public Criteria andAssTypeLessThan(String value) {
            addCriterion("CIS_ASS_TYPE <", value, "assType");
            return (Criteria) this;
        }

        public Criteria andAssTypeLessThanOrEqualTo(String value) {
            addCriterion("CIS_ASS_TYPE <=", value, "assType");
            return (Criteria) this;
        }

        public Criteria andAssTypeLike(String value) {
            addCriterion("CIS_ASS_TYPE like", value, "assType");
            return (Criteria) this;
        }

        public Criteria andAssTypeNotLike(String value) {
            addCriterion("CIS_ASS_TYPE not like", value, "assType");
            return (Criteria) this;
        }

        public Criteria andAssTypeIn(List<String> values) {
            addCriterion("CIS_ASS_TYPE in", values, "assType");
            return (Criteria) this;
        }

        public Criteria andAssTypeNotIn(List<String> values) {
            addCriterion("CIS_ASS_TYPE not in", values, "assType");
            return (Criteria) this;
        }

        public Criteria andAssTypeBetween(String value1, String value2) {
            addCriterion("CIS_ASS_TYPE between", value1, value2, "assType");
            return (Criteria) this;
        }

        public Criteria andAssTypeNotBetween(String value1, String value2) {
            addCriterion("CIS_ASS_TYPE not between", value1, value2, "assType");
            return (Criteria) this;
        }

        public Criteria andInsrntcdeIsNull() {
            addCriterion("CIS_INSRNTCDE is null");
            return (Criteria) this;
        }

        public Criteria andInsrntcdeIsNotNull() {
            addCriterion("CIS_INSRNTCDE is not null");
            return (Criteria) this;
        }

        public Criteria andInsrntcdeEqualTo(String value) {
            addCriterion("CIS_INSRNTCDE =", value, "insrntcde");
            return (Criteria) this;
        }

        public Criteria andInsrntcdeNotEqualTo(String value) {
            addCriterion("CIS_INSRNTCDE <>", value, "insrntcde");
            return (Criteria) this;
        }

        public Criteria andInsrntcdeGreaterThan(String value) {
            addCriterion("CIS_INSRNTCDE >", value, "insrntcde");
            return (Criteria) this;
        }

        public Criteria andInsrntcdeGreaterThanOrEqualTo(String value) {
            addCriterion("CIS_INSRNTCDE >=", value, "insrntcde");
            return (Criteria) this;
        }

        public Criteria andInsrntcdeLessThan(String value) {
            addCriterion("CIS_INSRNTCDE <", value, "insrntcde");
            return (Criteria) this;
        }

        public Criteria andInsrntcdeLessThanOrEqualTo(String value) {
            addCriterion("CIS_INSRNTCDE <=", value, "insrntcde");
            return (Criteria) this;
        }

        public Criteria andInsrntcdeLike(String value) {
            addCriterion("CIS_INSRNTCDE like", value, "insrntcde");
            return (Criteria) this;
        }

        public Criteria andInsrntcdeNotLike(String value) {
            addCriterion("CIS_INSRNTCDE not like", value, "insrntcde");
            return (Criteria) this;
        }

        public Criteria andInsrntcdeIn(List<String> values) {
            addCriterion("CIS_INSRNTCDE in", values, "insrntcde");
            return (Criteria) this;
        }

        public Criteria andInsrntcdeNotIn(List<String> values) {
            addCriterion("CIS_INSRNTCDE not in", values, "insrntcde");
            return (Criteria) this;
        }

        public Criteria andInsrntcdeBetween(String value1, String value2) {
            addCriterion("CIS_INSRNTCDE between", value1, value2, "insrntcde");
            return (Criteria) this;
        }

        public Criteria andInsrntcdeNotBetween(String value1, String value2) {
            addCriterion("CIS_INSRNTCDE not between", value1, value2, "insrntcde");
            return (Criteria) this;
        }

        public Criteria andAssCnmIsNull() {
            addCriterion("CIS_ASS_CNM is null");
            return (Criteria) this;
        }

        public Criteria andAssCnmIsNotNull() {
            addCriterion("CIS_ASS_CNM is not null");
            return (Criteria) this;
        }

        public Criteria andAssCnmEqualTo(String value) {
            addCriterion("CIS_ASS_CNM =", value, "assCnm");
            return (Criteria) this;
        }

        public Criteria andAssCnmNotEqualTo(String value) {
            addCriterion("CIS_ASS_CNM <>", value, "assCnm");
            return (Criteria) this;
        }

        public Criteria andAssCnmGreaterThan(String value) {
            addCriterion("CIS_ASS_CNM >", value, "assCnm");
            return (Criteria) this;
        }

        public Criteria andAssCnmGreaterThanOrEqualTo(String value) {
            addCriterion("CIS_ASS_CNM >=", value, "assCnm");
            return (Criteria) this;
        }

        public Criteria andAssCnmLessThan(String value) {
            addCriterion("CIS_ASS_CNM <", value, "assCnm");
            return (Criteria) this;
        }

        public Criteria andAssCnmLessThanOrEqualTo(String value) {
            addCriterion("CIS_ASS_CNM <=", value, "assCnm");
            return (Criteria) this;
        }

        public Criteria andAssCnmLike(String value) {
            addCriterion("CIS_ASS_CNM like", value, "assCnm");
            return (Criteria) this;
        }

        public Criteria andAssCnmNotLike(String value) {
            addCriterion("CIS_ASS_CNM not like", value, "assCnm");
            return (Criteria) this;
        }

        public Criteria andAssCnmIn(List<String> values) {
            addCriterion("CIS_ASS_CNM in", values, "assCnm");
            return (Criteria) this;
        }

        public Criteria andAssCnmNotIn(List<String> values) {
            addCriterion("CIS_ASS_CNM not in", values, "assCnm");
            return (Criteria) this;
        }

        public Criteria andAssCnmBetween(String value1, String value2) {
            addCriterion("CIS_ASS_CNM between", value1, value2, "assCnm");
            return (Criteria) this;
        }

        public Criteria andAssCnmNotBetween(String value1, String value2) {
            addCriterion("CIS_ASS_CNM not between", value1, value2, "assCnm");
            return (Criteria) this;
        }

        public Criteria andInsrntTelIsNull() {
            addCriterion("CIS_INSRNT_TEL is null");
            return (Criteria) this;
        }

        public Criteria andInsrntTelIsNotNull() {
            addCriterion("CIS_INSRNT_TEL is not null");
            return (Criteria) this;
        }

        public Criteria andInsrntTelEqualTo(String value) {
            addCriterion("CIS_INSRNT_TEL =", value, "insrntTel");
            return (Criteria) this;
        }

        public Criteria andInsrntTelNotEqualTo(String value) {
            addCriterion("CIS_INSRNT_TEL <>", value, "insrntTel");
            return (Criteria) this;
        }

        public Criteria andInsrntTelGreaterThan(String value) {
            addCriterion("CIS_INSRNT_TEL >", value, "insrntTel");
            return (Criteria) this;
        }

        public Criteria andInsrntTelGreaterThanOrEqualTo(String value) {
            addCriterion("CIS_INSRNT_TEL >=", value, "insrntTel");
            return (Criteria) this;
        }

        public Criteria andInsrntTelLessThan(String value) {
            addCriterion("CIS_INSRNT_TEL <", value, "insrntTel");
            return (Criteria) this;
        }

        public Criteria andInsrntTelLessThanOrEqualTo(String value) {
            addCriterion("CIS_INSRNT_TEL <=", value, "insrntTel");
            return (Criteria) this;
        }

        public Criteria andInsrntTelLike(String value) {
            addCriterion("CIS_INSRNT_TEL like", value, "insrntTel");
            return (Criteria) this;
        }

        public Criteria andInsrntTelNotLike(String value) {
            addCriterion("CIS_INSRNT_TEL not like", value, "insrntTel");
            return (Criteria) this;
        }

        public Criteria andInsrntTelIn(List<String> values) {
            addCriterion("CIS_INSRNT_TEL in", values, "insrntTel");
            return (Criteria) this;
        }

        public Criteria andInsrntTelNotIn(List<String> values) {
            addCriterion("CIS_INSRNT_TEL not in", values, "insrntTel");
            return (Criteria) this;
        }

        public Criteria andInsrntTelBetween(String value1, String value2) {
            addCriterion("CIS_INSRNT_TEL between", value1, value2, "insrntTel");
            return (Criteria) this;
        }

        public Criteria andInsrntTelNotBetween(String value1, String value2) {
            addCriterion("CIS_INSRNT_TEL not between", value1, value2, "insrntTel");
            return (Criteria) this;
        }

        public Criteria andAssAddrIsNull() {
            addCriterion("CIS_ASS_ADDR is null");
            return (Criteria) this;
        }

        public Criteria andAssAddrIsNotNull() {
            addCriterion("CIS_ASS_ADDR is not null");
            return (Criteria) this;
        }

        public Criteria andAssAddrEqualTo(String value) {
            addCriterion("CIS_ASS_ADDR =", value, "assAddr");
            return (Criteria) this;
        }

        public Criteria andAssAddrNotEqualTo(String value) {
            addCriterion("CIS_ASS_ADDR <>", value, "assAddr");
            return (Criteria) this;
        }

        public Criteria andAssAddrGreaterThan(String value) {
            addCriterion("CIS_ASS_ADDR >", value, "assAddr");
            return (Criteria) this;
        }

        public Criteria andAssAddrGreaterThanOrEqualTo(String value) {
            addCriterion("CIS_ASS_ADDR >=", value, "assAddr");
            return (Criteria) this;
        }

        public Criteria andAssAddrLessThan(String value) {
            addCriterion("CIS_ASS_ADDR <", value, "assAddr");
            return (Criteria) this;
        }

        public Criteria andAssAddrLessThanOrEqualTo(String value) {
            addCriterion("CIS_ASS_ADDR <=", value, "assAddr");
            return (Criteria) this;
        }

        public Criteria andAssAddrLike(String value) {
            addCriterion("CIS_ASS_ADDR like", value, "assAddr");
            return (Criteria) this;
        }

        public Criteria andAssAddrNotLike(String value) {
            addCriterion("CIS_ASS_ADDR not like", value, "assAddr");
            return (Criteria) this;
        }

        public Criteria andAssAddrIn(List<String> values) {
            addCriterion("CIS_ASS_ADDR in", values, "assAddr");
            return (Criteria) this;
        }

        public Criteria andAssAddrNotIn(List<String> values) {
            addCriterion("CIS_ASS_ADDR not in", values, "assAddr");
            return (Criteria) this;
        }

        public Criteria andAssAddrBetween(String value1, String value2) {
            addCriterion("CIS_ASS_ADDR between", value1, value2, "assAddr");
            return (Criteria) this;
        }

        public Criteria andAssAddrNotBetween(String value1, String value2) {
            addCriterion("CIS_ASS_ADDR not between", value1, value2, "assAddr");
            return (Criteria) this;
        }

        public Criteria andPortOfRegistryIsNull() {
            addCriterion("CIS_PORT_OF_REGISTRY is null");
            return (Criteria) this;
        }

        public Criteria andPortOfRegistryIsNotNull() {
            addCriterion("CIS_PORT_OF_REGISTRY is not null");
            return (Criteria) this;
        }

        public Criteria andPortOfRegistryEqualTo(String value) {
            addCriterion("CIS_PORT_OF_REGISTRY =", value, "portOfRegistry");
            return (Criteria) this;
        }

        public Criteria andPortOfRegistryNotEqualTo(String value) {
            addCriterion("CIS_PORT_OF_REGISTRY <>", value, "portOfRegistry");
            return (Criteria) this;
        }

        public Criteria andPortOfRegistryGreaterThan(String value) {
            addCriterion("CIS_PORT_OF_REGISTRY >", value, "portOfRegistry");
            return (Criteria) this;
        }

        public Criteria andPortOfRegistryGreaterThanOrEqualTo(String value) {
            addCriterion("CIS_PORT_OF_REGISTRY >=", value, "portOfRegistry");
            return (Criteria) this;
        }

        public Criteria andPortOfRegistryLessThan(String value) {
            addCriterion("CIS_PORT_OF_REGISTRY <", value, "portOfRegistry");
            return (Criteria) this;
        }

        public Criteria andPortOfRegistryLessThanOrEqualTo(String value) {
            addCriterion("CIS_PORT_OF_REGISTRY <=", value, "portOfRegistry");
            return (Criteria) this;
        }

        public Criteria andPortOfRegistryLike(String value) {
            addCriterion("CIS_PORT_OF_REGISTRY like", value, "portOfRegistry");
            return (Criteria) this;
        }

        public Criteria andPortOfRegistryNotLike(String value) {
            addCriterion("CIS_PORT_OF_REGISTRY not like", value, "portOfRegistry");
            return (Criteria) this;
        }

        public Criteria andPortOfRegistryIn(List<String> values) {
            addCriterion("CIS_PORT_OF_REGISTRY in", values, "portOfRegistry");
            return (Criteria) this;
        }

        public Criteria andPortOfRegistryNotIn(List<String> values) {
            addCriterion("CIS_PORT_OF_REGISTRY not in", values, "portOfRegistry");
            return (Criteria) this;
        }

        public Criteria andPortOfRegistryBetween(String value1, String value2) {
            addCriterion("CIS_PORT_OF_REGISTRY between", value1, value2, "portOfRegistry");
            return (Criteria) this;
        }

        public Criteria andPortOfRegistryNotBetween(String value1, String value2) {
            addCriterion("CIS_PORT_OF_REGISTRY not between", value1, value2, "portOfRegistry");
            return (Criteria) this;
        }

        public Criteria andShipLongIsNull() {
            addCriterion("CIS_SHIP_LONG is null");
            return (Criteria) this;
        }

        public Criteria andShipLongIsNotNull() {
            addCriterion("CIS_SHIP_LONG is not null");
            return (Criteria) this;
        }

        public Criteria andShipLongEqualTo(String value) {
            addCriterion("CIS_SHIP_LONG =", value, "shipLong");
            return (Criteria) this;
        }

        public Criteria andShipLongNotEqualTo(String value) {
            addCriterion("CIS_SHIP_LONG <>", value, "shipLong");
            return (Criteria) this;
        }

        public Criteria andShipLongGreaterThan(String value) {
            addCriterion("CIS_SHIP_LONG >", value, "shipLong");
            return (Criteria) this;
        }

        public Criteria andShipLongGreaterThanOrEqualTo(String value) {
            addCriterion("CIS_SHIP_LONG >=", value, "shipLong");
            return (Criteria) this;
        }

        public Criteria andShipLongLessThan(String value) {
            addCriterion("CIS_SHIP_LONG <", value, "shipLong");
            return (Criteria) this;
        }

        public Criteria andShipLongLessThanOrEqualTo(String value) {
            addCriterion("CIS_SHIP_LONG <=", value, "shipLong");
            return (Criteria) this;
        }

        public Criteria andShipLongLike(String value) {
            addCriterion("CIS_SHIP_LONG like", value, "shipLong");
            return (Criteria) this;
        }

        public Criteria andShipLongNotLike(String value) {
            addCriterion("CIS_SHIP_LONG not like", value, "shipLong");
            return (Criteria) this;
        }

        public Criteria andShipLongIn(List<String> values) {
            addCriterion("CIS_SHIP_LONG in", values, "shipLong");
            return (Criteria) this;
        }

        public Criteria andShipLongNotIn(List<String> values) {
            addCriterion("CIS_SHIP_LONG not in", values, "shipLong");
            return (Criteria) this;
        }

        public Criteria andShipLongBetween(String value1, String value2) {
            addCriterion("CIS_SHIP_LONG between", value1, value2, "shipLong");
            return (Criteria) this;
        }

        public Criteria andShipLongNotBetween(String value1, String value2) {
            addCriterion("CIS_SHIP_LONG not between", value1, value2, "shipLong");
            return (Criteria) this;
        }

        public Criteria andBuildTmIsNull() {
            addCriterion("CIS_BUILD_TM is null");
            return (Criteria) this;
        }

        public Criteria andBuildTmIsNotNull() {
            addCriterion("CIS_BUILD_TM is not null");
            return (Criteria) this;
        }

        public Criteria andBuildTmEqualTo(String value) {
            addCriterion("CIS_BUILD_TM =", value, "buildTm");
            return (Criteria) this;
        }

        public Criteria andBuildTmNotEqualTo(String value) {
            addCriterion("CIS_BUILD_TM <>", value, "buildTm");
            return (Criteria) this;
        }

        public Criteria andBuildTmGreaterThan(String value) {
            addCriterion("CIS_BUILD_TM >", value, "buildTm");
            return (Criteria) this;
        }

        public Criteria andBuildTmGreaterThanOrEqualTo(String value) {
            addCriterion("CIS_BUILD_TM >=", value, "buildTm");
            return (Criteria) this;
        }

        public Criteria andBuildTmLessThan(String value) {
            addCriterion("CIS_BUILD_TM <", value, "buildTm");
            return (Criteria) this;
        }

        public Criteria andBuildTmLessThanOrEqualTo(String value) {
            addCriterion("CIS_BUILD_TM <=", value, "buildTm");
            return (Criteria) this;
        }

        public Criteria andBuildTmLike(String value) {
            addCriterion("CIS_BUILD_TM like", value, "buildTm");
            return (Criteria) this;
        }

        public Criteria andBuildTmNotLike(String value) {
            addCriterion("CIS_BUILD_TM not like", value, "buildTm");
            return (Criteria) this;
        }

        public Criteria andBuildTmIn(List<String> values) {
            addCriterion("CIS_BUILD_TM in", values, "buildTm");
            return (Criteria) this;
        }

        public Criteria andBuildTmNotIn(List<String> values) {
            addCriterion("CIS_BUILD_TM not in", values, "buildTm");
            return (Criteria) this;
        }

        public Criteria andBuildTmBetween(String value1, String value2) {
            addCriterion("CIS_BUILD_TM between", value1, value2, "buildTm");
            return (Criteria) this;
        }

        public Criteria andBuildTmNotBetween(String value1, String value2) {
            addCriterion("CIS_BUILD_TM not between", value1, value2, "buildTm");
            return (Criteria) this;
        }

        public Criteria andShipmaterialCdeIsNull() {
            addCriterion("CIS_SHIPMATERIAL_CDE is null");
            return (Criteria) this;
        }

        public Criteria andShipmaterialCdeIsNotNull() {
            addCriterion("CIS_SHIPMATERIAL_CDE is not null");
            return (Criteria) this;
        }

        public Criteria andShipmaterialCdeEqualTo(String value) {
            addCriterion("CIS_SHIPMATERIAL_CDE =", value, "shipmaterialCde");
            return (Criteria) this;
        }

        public Criteria andShipmaterialCdeNotEqualTo(String value) {
            addCriterion("CIS_SHIPMATERIAL_CDE <>", value, "shipmaterialCde");
            return (Criteria) this;
        }

        public Criteria andShipmaterialCdeGreaterThan(String value) {
            addCriterion("CIS_SHIPMATERIAL_CDE >", value, "shipmaterialCde");
            return (Criteria) this;
        }

        public Criteria andShipmaterialCdeGreaterThanOrEqualTo(String value) {
            addCriterion("CIS_SHIPMATERIAL_CDE >=", value, "shipmaterialCde");
            return (Criteria) this;
        }

        public Criteria andShipmaterialCdeLessThan(String value) {
            addCriterion("CIS_SHIPMATERIAL_CDE <", value, "shipmaterialCde");
            return (Criteria) this;
        }

        public Criteria andShipmaterialCdeLessThanOrEqualTo(String value) {
            addCriterion("CIS_SHIPMATERIAL_CDE <=", value, "shipmaterialCde");
            return (Criteria) this;
        }

        public Criteria andShipmaterialCdeLike(String value) {
            addCriterion("CIS_SHIPMATERIAL_CDE like", value, "shipmaterialCde");
            return (Criteria) this;
        }

        public Criteria andShipmaterialCdeNotLike(String value) {
            addCriterion("CIS_SHIPMATERIAL_CDE not like", value, "shipmaterialCde");
            return (Criteria) this;
        }

        public Criteria andShipmaterialCdeIn(List<String> values) {
            addCriterion("CIS_SHIPMATERIAL_CDE in", values, "shipmaterialCde");
            return (Criteria) this;
        }

        public Criteria andShipmaterialCdeNotIn(List<String> values) {
            addCriterion("CIS_SHIPMATERIAL_CDE not in", values, "shipmaterialCde");
            return (Criteria) this;
        }

        public Criteria andShipmaterialCdeBetween(String value1, String value2) {
            addCriterion("CIS_SHIPMATERIAL_CDE between", value1, value2, "shipmaterialCde");
            return (Criteria) this;
        }

        public Criteria andShipmaterialCdeNotBetween(String value1, String value2) {
            addCriterion("CIS_SHIPMATERIAL_CDE not between", value1, value2, "shipmaterialCde");
            return (Criteria) this;
        }

        public Criteria andPowerIsNull() {
            addCriterion("CIS_POWER is null");
            return (Criteria) this;
        }

        public Criteria andPowerIsNotNull() {
            addCriterion("CIS_POWER is not null");
            return (Criteria) this;
        }

        public Criteria andPowerEqualTo(String value) {
            addCriterion("CIS_POWER =", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerNotEqualTo(String value) {
            addCriterion("CIS_POWER <>", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerGreaterThan(String value) {
            addCriterion("CIS_POWER >", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerGreaterThanOrEqualTo(String value) {
            addCriterion("CIS_POWER >=", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerLessThan(String value) {
            addCriterion("CIS_POWER <", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerLessThanOrEqualTo(String value) {
            addCriterion("CIS_POWER <=", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerLike(String value) {
            addCriterion("CIS_POWER like", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerNotLike(String value) {
            addCriterion("CIS_POWER not like", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerIn(List<String> values) {
            addCriterion("CIS_POWER in", values, "power");
            return (Criteria) this;
        }

        public Criteria andPowerNotIn(List<String> values) {
            addCriterion("CIS_POWER not in", values, "power");
            return (Criteria) this;
        }

        public Criteria andPowerBetween(String value1, String value2) {
            addCriterion("CIS_POWER between", value1, value2, "power");
            return (Criteria) this;
        }

        public Criteria andPowerNotBetween(String value1, String value2) {
            addCriterion("CIS_POWER not between", value1, value2, "power");
            return (Criteria) this;
        }

        public Criteria andShiptypCdeIsNull() {
            addCriterion("CIS_SHIPTYP_CDE is null");
            return (Criteria) this;
        }

        public Criteria andShiptypCdeIsNotNull() {
            addCriterion("CIS_SHIPTYP_CDE is not null");
            return (Criteria) this;
        }

        public Criteria andShiptypCdeEqualTo(String value) {
            addCriterion("CIS_SHIPTYP_CDE =", value, "shiptypCde");
            return (Criteria) this;
        }

        public Criteria andShiptypCdeNotEqualTo(String value) {
            addCriterion("CIS_SHIPTYP_CDE <>", value, "shiptypCde");
            return (Criteria) this;
        }

        public Criteria andShiptypCdeGreaterThan(String value) {
            addCriterion("CIS_SHIPTYP_CDE >", value, "shiptypCde");
            return (Criteria) this;
        }

        public Criteria andShiptypCdeGreaterThanOrEqualTo(String value) {
            addCriterion("CIS_SHIPTYP_CDE >=", value, "shiptypCde");
            return (Criteria) this;
        }

        public Criteria andShiptypCdeLessThan(String value) {
            addCriterion("CIS_SHIPTYP_CDE <", value, "shiptypCde");
            return (Criteria) this;
        }

        public Criteria andShiptypCdeLessThanOrEqualTo(String value) {
            addCriterion("CIS_SHIPTYP_CDE <=", value, "shiptypCde");
            return (Criteria) this;
        }

        public Criteria andShiptypCdeLike(String value) {
            addCriterion("CIS_SHIPTYP_CDE like", value, "shiptypCde");
            return (Criteria) this;
        }

        public Criteria andShiptypCdeNotLike(String value) {
            addCriterion("CIS_SHIPTYP_CDE not like", value, "shiptypCde");
            return (Criteria) this;
        }

        public Criteria andShiptypCdeIn(List<String> values) {
            addCriterion("CIS_SHIPTYP_CDE in", values, "shiptypCde");
            return (Criteria) this;
        }

        public Criteria andShiptypCdeNotIn(List<String> values) {
            addCriterion("CIS_SHIPTYP_CDE not in", values, "shiptypCde");
            return (Criteria) this;
        }

        public Criteria andShiptypCdeBetween(String value1, String value2) {
            addCriterion("CIS_SHIPTYP_CDE between", value1, value2, "shiptypCde");
            return (Criteria) this;
        }

        public Criteria andShiptypCdeNotBetween(String value1, String value2) {
            addCriterion("CIS_SHIPTYP_CDE not between", value1, value2, "shiptypCde");
            return (Criteria) this;
        }

        public Criteria andSailareaCdeIsNull() {
            addCriterion("CIS_SAILAREA_CDE is null");
            return (Criteria) this;
        }

        public Criteria andSailareaCdeIsNotNull() {
            addCriterion("CIS_SAILAREA_CDE is not null");
            return (Criteria) this;
        }

        public Criteria andSailareaCdeEqualTo(String value) {
            addCriterion("CIS_SAILAREA_CDE =", value, "sailareaCde");
            return (Criteria) this;
        }

        public Criteria andSailareaCdeNotEqualTo(String value) {
            addCriterion("CIS_SAILAREA_CDE <>", value, "sailareaCde");
            return (Criteria) this;
        }

        public Criteria andSailareaCdeGreaterThan(String value) {
            addCriterion("CIS_SAILAREA_CDE >", value, "sailareaCde");
            return (Criteria) this;
        }

        public Criteria andSailareaCdeGreaterThanOrEqualTo(String value) {
            addCriterion("CIS_SAILAREA_CDE >=", value, "sailareaCde");
            return (Criteria) this;
        }

        public Criteria andSailareaCdeLessThan(String value) {
            addCriterion("CIS_SAILAREA_CDE <", value, "sailareaCde");
            return (Criteria) this;
        }

        public Criteria andSailareaCdeLessThanOrEqualTo(String value) {
            addCriterion("CIS_SAILAREA_CDE <=", value, "sailareaCde");
            return (Criteria) this;
        }

        public Criteria andSailareaCdeLike(String value) {
            addCriterion("CIS_SAILAREA_CDE like", value, "sailareaCde");
            return (Criteria) this;
        }

        public Criteria andSailareaCdeNotLike(String value) {
            addCriterion("CIS_SAILAREA_CDE not like", value, "sailareaCde");
            return (Criteria) this;
        }

        public Criteria andSailareaCdeIn(List<String> values) {
            addCriterion("CIS_SAILAREA_CDE in", values, "sailareaCde");
            return (Criteria) this;
        }

        public Criteria andSailareaCdeNotIn(List<String> values) {
            addCriterion("CIS_SAILAREA_CDE not in", values, "sailareaCde");
            return (Criteria) this;
        }

        public Criteria andSailareaCdeBetween(String value1, String value2) {
            addCriterion("CIS_SAILAREA_CDE between", value1, value2, "sailareaCde");
            return (Criteria) this;
        }

        public Criteria andSailareaCdeNotBetween(String value1, String value2) {
            addCriterion("CIS_SAILAREA_CDE not between", value1, value2, "sailareaCde");
            return (Criteria) this;
        }

        public Criteria andShipTonnageIsNull() {
            addCriterion("CIS_SHIP_TONNAGE is null");
            return (Criteria) this;
        }

        public Criteria andShipTonnageIsNotNull() {
            addCriterion("CIS_SHIP_TONNAGE is not null");
            return (Criteria) this;
        }

        public Criteria andShipTonnageEqualTo(String value) {
            addCriterion("CIS_SHIP_TONNAGE =", value, "shipTonnage");
            return (Criteria) this;
        }

        public Criteria andShipTonnageNotEqualTo(String value) {
            addCriterion("CIS_SHIP_TONNAGE <>", value, "shipTonnage");
            return (Criteria) this;
        }

        public Criteria andShipTonnageGreaterThan(String value) {
            addCriterion("CIS_SHIP_TONNAGE >", value, "shipTonnage");
            return (Criteria) this;
        }

        public Criteria andShipTonnageGreaterThanOrEqualTo(String value) {
            addCriterion("CIS_SHIP_TONNAGE >=", value, "shipTonnage");
            return (Criteria) this;
        }

        public Criteria andShipTonnageLessThan(String value) {
            addCriterion("CIS_SHIP_TONNAGE <", value, "shipTonnage");
            return (Criteria) this;
        }

        public Criteria andShipTonnageLessThanOrEqualTo(String value) {
            addCriterion("CIS_SHIP_TONNAGE <=", value, "shipTonnage");
            return (Criteria) this;
        }

        public Criteria andShipTonnageLike(String value) {
            addCriterion("CIS_SHIP_TONNAGE like", value, "shipTonnage");
            return (Criteria) this;
        }

        public Criteria andShipTonnageNotLike(String value) {
            addCriterion("CIS_SHIP_TONNAGE not like", value, "shipTonnage");
            return (Criteria) this;
        }

        public Criteria andShipTonnageIn(List<String> values) {
            addCriterion("CIS_SHIP_TONNAGE in", values, "shipTonnage");
            return (Criteria) this;
        }

        public Criteria andShipTonnageNotIn(List<String> values) {
            addCriterion("CIS_SHIP_TONNAGE not in", values, "shipTonnage");
            return (Criteria) this;
        }

        public Criteria andShipTonnageBetween(String value1, String value2) {
            addCriterion("CIS_SHIP_TONNAGE between", value1, value2, "shipTonnage");
            return (Criteria) this;
        }

        public Criteria andShipTonnageNotBetween(String value1, String value2) {
            addCriterion("CIS_SHIP_TONNAGE not between", value1, value2, "shipTonnage");
            return (Criteria) this;
        }

        public Criteria andInsrncBgnTmIsNull() {
            addCriterion("CIS_INSRNC_BGN_TM is null");
            return (Criteria) this;
        }

        public Criteria andInsrncBgnTmIsNotNull() {
            addCriterion("CIS_INSRNC_BGN_TM is not null");
            return (Criteria) this;
        }

        public Criteria andInsrncBgnTmEqualTo(String value) {
            addCriterion("CIS_INSRNC_BGN_TM =", value, "insrncBgnTm");
            return (Criteria) this;
        }

        public Criteria andInsrncBgnTmNotEqualTo(String value) {
            addCriterion("CIS_INSRNC_BGN_TM <>", value, "insrncBgnTm");
            return (Criteria) this;
        }

        public Criteria andInsrncBgnTmGreaterThan(String value) {
            addCriterion("CIS_INSRNC_BGN_TM >", value, "insrncBgnTm");
            return (Criteria) this;
        }

        public Criteria andInsrncBgnTmGreaterThanOrEqualTo(String value) {
            addCriterion("CIS_INSRNC_BGN_TM >=", value, "insrncBgnTm");
            return (Criteria) this;
        }

        public Criteria andInsrncBgnTmLessThan(String value) {
            addCriterion("CIS_INSRNC_BGN_TM <", value, "insrncBgnTm");
            return (Criteria) this;
        }

        public Criteria andInsrncBgnTmLessThanOrEqualTo(String value) {
            addCriterion("CIS_INSRNC_BGN_TM <=", value, "insrncBgnTm");
            return (Criteria) this;
        }

        public Criteria andInsrncBgnTmLike(String value) {
            addCriterion("CIS_INSRNC_BGN_TM like", value, "insrncBgnTm");
            return (Criteria) this;
        }

        public Criteria andInsrncBgnTmNotLike(String value) {
            addCriterion("CIS_INSRNC_BGN_TM not like", value, "insrncBgnTm");
            return (Criteria) this;
        }

        public Criteria andInsrncBgnTmIn(List<String> values) {
            addCriterion("CIS_INSRNC_BGN_TM in", values, "insrncBgnTm");
            return (Criteria) this;
        }

        public Criteria andInsrncBgnTmNotIn(List<String> values) {
            addCriterion("CIS_INSRNC_BGN_TM not in", values, "insrncBgnTm");
            return (Criteria) this;
        }

        public Criteria andInsrncBgnTmBetween(String value1, String value2) {
            addCriterion("CIS_INSRNC_BGN_TM between", value1, value2, "insrncBgnTm");
            return (Criteria) this;
        }

        public Criteria andInsrncBgnTmNotBetween(String value1, String value2) {
            addCriterion("CIS_INSRNC_BGN_TM not between", value1, value2, "insrncBgnTm");
            return (Criteria) this;
        }

        public Criteria andInsrncEndTmIsNull() {
            addCriterion("CIS_INSRNC_END_TM is null");
            return (Criteria) this;
        }

        public Criteria andInsrncEndTmIsNotNull() {
            addCriterion("CIS_INSRNC_END_TM is not null");
            return (Criteria) this;
        }

        public Criteria andInsrncEndTmEqualTo(String value) {
            addCriterion("CIS_INSRNC_END_TM =", value, "insrncEndTm");
            return (Criteria) this;
        }

        public Criteria andInsrncEndTmNotEqualTo(String value) {
            addCriterion("CIS_INSRNC_END_TM <>", value, "insrncEndTm");
            return (Criteria) this;
        }

        public Criteria andInsrncEndTmGreaterThan(String value) {
            addCriterion("CIS_INSRNC_END_TM >", value, "insrncEndTm");
            return (Criteria) this;
        }

        public Criteria andInsrncEndTmGreaterThanOrEqualTo(String value) {
            addCriterion("CIS_INSRNC_END_TM >=", value, "insrncEndTm");
            return (Criteria) this;
        }

        public Criteria andInsrncEndTmLessThan(String value) {
            addCriterion("CIS_INSRNC_END_TM <", value, "insrncEndTm");
            return (Criteria) this;
        }

        public Criteria andInsrncEndTmLessThanOrEqualTo(String value) {
            addCriterion("CIS_INSRNC_END_TM <=", value, "insrncEndTm");
            return (Criteria) this;
        }

        public Criteria andInsrncEndTmLike(String value) {
            addCriterion("CIS_INSRNC_END_TM like", value, "insrncEndTm");
            return (Criteria) this;
        }

        public Criteria andInsrncEndTmNotLike(String value) {
            addCriterion("CIS_INSRNC_END_TM not like", value, "insrncEndTm");
            return (Criteria) this;
        }

        public Criteria andInsrncEndTmIn(List<String> values) {
            addCriterion("CIS_INSRNC_END_TM in", values, "insrncEndTm");
            return (Criteria) this;
        }

        public Criteria andInsrncEndTmNotIn(List<String> values) {
            addCriterion("CIS_INSRNC_END_TM not in", values, "insrncEndTm");
            return (Criteria) this;
        }

        public Criteria andInsrncEndTmBetween(String value1, String value2) {
            addCriterion("CIS_INSRNC_END_TM between", value1, value2, "insrncEndTm");
            return (Criteria) this;
        }

        public Criteria andInsrncEndTmNotBetween(String value1, String value2) {
            addCriterion("CIS_INSRNC_END_TM not between", value1, value2, "insrncEndTm");
            return (Criteria) this;
        }

        public Criteria andInputTmIsNull() {
            addCriterion("CIS_INPUT_TM is null");
            return (Criteria) this;
        }

        public Criteria andInputTmIsNotNull() {
            addCriterion("CIS_INPUT_TM is not null");
            return (Criteria) this;
        }

        public Criteria andInputTmEqualTo(String value) {
            addCriterion("CIS_INPUT_TM =", value, "inputTm");
            return (Criteria) this;
        }

        public Criteria andInputTmNotEqualTo(String value) {
            addCriterion("CIS_INPUT_TM <>", value, "inputTm");
            return (Criteria) this;
        }

        public Criteria andInputTmGreaterThan(String value) {
            addCriterion("CIS_INPUT_TM >", value, "inputTm");
            return (Criteria) this;
        }

        public Criteria andInputTmGreaterThanOrEqualTo(String value) {
            addCriterion("CIS_INPUT_TM >=", value, "inputTm");
            return (Criteria) this;
        }

        public Criteria andInputTmLessThan(String value) {
            addCriterion("CIS_INPUT_TM <", value, "inputTm");
            return (Criteria) this;
        }

        public Criteria andInputTmLessThanOrEqualTo(String value) {
            addCriterion("CIS_INPUT_TM <=", value, "inputTm");
            return (Criteria) this;
        }

        public Criteria andInputTmLike(String value) {
            addCriterion("CIS_INPUT_TM like", value, "inputTm");
            return (Criteria) this;
        }

        public Criteria andInputTmNotLike(String value) {
            addCriterion("CIS_INPUT_TM not like", value, "inputTm");
            return (Criteria) this;
        }

        public Criteria andInputTmIn(List<String> values) {
            addCriterion("CIS_INPUT_TM in", values, "inputTm");
            return (Criteria) this;
        }

        public Criteria andInputTmNotIn(List<String> values) {
            addCriterion("CIS_INPUT_TM not in", values, "inputTm");
            return (Criteria) this;
        }

        public Criteria andInputTmBetween(String value1, String value2) {
            addCriterion("CIS_INPUT_TM between", value1, value2, "inputTm");
            return (Criteria) this;
        }

        public Criteria andInputTmNotBetween(String value1, String value2) {
            addCriterion("CIS_INPUT_TM not between", value1, value2, "inputTm");
            return (Criteria) this;
        }

        public Criteria andRdrCnmIsNull() {
            addCriterion("CIS_RDR_CNM is null");
            return (Criteria) this;
        }

        public Criteria andRdrCnmIsNotNull() {
            addCriterion("CIS_RDR_CNM is not null");
            return (Criteria) this;
        }

        public Criteria andRdrCnmEqualTo(String value) {
            addCriterion("CIS_RDR_CNM =", value, "rdrCnm");
            return (Criteria) this;
        }

        public Criteria andRdrCnmNotEqualTo(String value) {
            addCriterion("CIS_RDR_CNM <>", value, "rdrCnm");
            return (Criteria) this;
        }

        public Criteria andRdrCnmGreaterThan(String value) {
            addCriterion("CIS_RDR_CNM >", value, "rdrCnm");
            return (Criteria) this;
        }

        public Criteria andRdrCnmGreaterThanOrEqualTo(String value) {
            addCriterion("CIS_RDR_CNM >=", value, "rdrCnm");
            return (Criteria) this;
        }

        public Criteria andRdrCnmLessThan(String value) {
            addCriterion("CIS_RDR_CNM <", value, "rdrCnm");
            return (Criteria) this;
        }

        public Criteria andRdrCnmLessThanOrEqualTo(String value) {
            addCriterion("CIS_RDR_CNM <=", value, "rdrCnm");
            return (Criteria) this;
        }

        public Criteria andRdrCnmLike(String value) {
            addCriterion("CIS_RDR_CNM like", value, "rdrCnm");
            return (Criteria) this;
        }

        public Criteria andRdrCnmNotLike(String value) {
            addCriterion("CIS_RDR_CNM not like", value, "rdrCnm");
            return (Criteria) this;
        }

        public Criteria andRdrCnmIn(List<String> values) {
            addCriterion("CIS_RDR_CNM in", values, "rdrCnm");
            return (Criteria) this;
        }

        public Criteria andRdrCnmNotIn(List<String> values) {
            addCriterion("CIS_RDR_CNM not in", values, "rdrCnm");
            return (Criteria) this;
        }

        public Criteria andRdrCnmBetween(String value1, String value2) {
            addCriterion("CIS_RDR_CNM between", value1, value2, "rdrCnm");
            return (Criteria) this;
        }

        public Criteria andRdrCnmNotBetween(String value1, String value2) {
            addCriterion("CIS_RDR_CNM not between", value1, value2, "rdrCnm");
            return (Criteria) this;
        }

        public Criteria andAmtIsNull() {
            addCriterion("CIS_AMT is null");
            return (Criteria) this;
        }

        public Criteria andAmtIsNotNull() {
            addCriterion("CIS_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andAmtEqualTo(String value) {
            addCriterion("CIS_AMT =", value, "amt");
            return (Criteria) this;
        }

        public Criteria andAmtNotEqualTo(String value) {
            addCriterion("CIS_AMT <>", value, "amt");
            return (Criteria) this;
        }

        public Criteria andAmtGreaterThan(String value) {
            addCriterion("CIS_AMT >", value, "amt");
            return (Criteria) this;
        }

        public Criteria andAmtGreaterThanOrEqualTo(String value) {
            addCriterion("CIS_AMT >=", value, "amt");
            return (Criteria) this;
        }

        public Criteria andAmtLessThan(String value) {
            addCriterion("CIS_AMT <", value, "amt");
            return (Criteria) this;
        }

        public Criteria andAmtLessThanOrEqualTo(String value) {
            addCriterion("CIS_AMT <=", value, "amt");
            return (Criteria) this;
        }

        public Criteria andAmtLike(String value) {
            addCriterion("CIS_AMT like", value, "amt");
            return (Criteria) this;
        }

        public Criteria andAmtNotLike(String value) {
            addCriterion("CIS_AMT not like", value, "amt");
            return (Criteria) this;
        }

        public Criteria andAmtIn(List<String> values) {
            addCriterion("CIS_AMT in", values, "amt");
            return (Criteria) this;
        }

        public Criteria andAmtNotIn(List<String> values) {
            addCriterion("CIS_AMT not in", values, "amt");
            return (Criteria) this;
        }

        public Criteria andAmtBetween(String value1, String value2) {
            addCriterion("CIS_AMT between", value1, value2, "amt");
            return (Criteria) this;
        }

        public Criteria andAmtNotBetween(String value1, String value2) {
            addCriterion("CIS_AMT not between", value1, value2, "amt");
            return (Criteria) this;
        }

        public Criteria andPlyRateIsNull() {
            addCriterion("CIS_PLY_RATE is null");
            return (Criteria) this;
        }

        public Criteria andPlyRateIsNotNull() {
            addCriterion("CIS_PLY_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andPlyRateEqualTo(String value) {
            addCriterion("CIS_PLY_RATE =", value, "plyRate");
            return (Criteria) this;
        }

        public Criteria andPlyRateNotEqualTo(String value) {
            addCriterion("CIS_PLY_RATE <>", value, "plyRate");
            return (Criteria) this;
        }

        public Criteria andPlyRateGreaterThan(String value) {
            addCriterion("CIS_PLY_RATE >", value, "plyRate");
            return (Criteria) this;
        }

        public Criteria andPlyRateGreaterThanOrEqualTo(String value) {
            addCriterion("CIS_PLY_RATE >=", value, "plyRate");
            return (Criteria) this;
        }

        public Criteria andPlyRateLessThan(String value) {
            addCriterion("CIS_PLY_RATE <", value, "plyRate");
            return (Criteria) this;
        }

        public Criteria andPlyRateLessThanOrEqualTo(String value) {
            addCriterion("CIS_PLY_RATE <=", value, "plyRate");
            return (Criteria) this;
        }

        public Criteria andPlyRateLike(String value) {
            addCriterion("CIS_PLY_RATE like", value, "plyRate");
            return (Criteria) this;
        }

        public Criteria andPlyRateNotLike(String value) {
            addCriterion("CIS_PLY_RATE not like", value, "plyRate");
            return (Criteria) this;
        }

        public Criteria andPlyRateIn(List<String> values) {
            addCriterion("CIS_PLY_RATE in", values, "plyRate");
            return (Criteria) this;
        }

        public Criteria andPlyRateNotIn(List<String> values) {
            addCriterion("CIS_PLY_RATE not in", values, "plyRate");
            return (Criteria) this;
        }

        public Criteria andPlyRateBetween(String value1, String value2) {
            addCriterion("CIS_PLY_RATE between", value1, value2, "plyRate");
            return (Criteria) this;
        }

        public Criteria andPlyRateNotBetween(String value1, String value2) {
            addCriterion("CIS_PLY_RATE not between", value1, value2, "plyRate");
            return (Criteria) this;
        }

        public Criteria andRateIsNull() {
            addCriterion("CIS_RATE is null");
            return (Criteria) this;
        }

        public Criteria andRateIsNotNull() {
            addCriterion("CIS_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andRateEqualTo(String value) {
            addCriterion("CIS_RATE =", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotEqualTo(String value) {
            addCriterion("CIS_RATE <>", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateGreaterThan(String value) {
            addCriterion("CIS_RATE >", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateGreaterThanOrEqualTo(String value) {
            addCriterion("CIS_RATE >=", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLessThan(String value) {
            addCriterion("CIS_RATE <", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLessThanOrEqualTo(String value) {
            addCriterion("CIS_RATE <=", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLike(String value) {
            addCriterion("CIS_RATE like", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotLike(String value) {
            addCriterion("CIS_RATE not like", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateIn(List<String> values) {
            addCriterion("CIS_RATE in", values, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotIn(List<String> values) {
            addCriterion("CIS_RATE not in", values, "rate");
            return (Criteria) this;
        }

        public Criteria andRateBetween(String value1, String value2) {
            addCriterion("CIS_RATE between", value1, value2, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotBetween(String value1, String value2) {
            addCriterion("CIS_RATE not between", value1, value2, "rate");
            return (Criteria) this;
        }

        public Criteria andPrmIsNull() {
            addCriterion("CIS_PRM is null");
            return (Criteria) this;
        }

        public Criteria andPrmIsNotNull() {
            addCriterion("CIS_PRM is not null");
            return (Criteria) this;
        }

        public Criteria andPrmEqualTo(String value) {
            addCriterion("CIS_PRM =", value, "prm");
            return (Criteria) this;
        }

        public Criteria andPrmNotEqualTo(String value) {
            addCriterion("CIS_PRM <>", value, "prm");
            return (Criteria) this;
        }

        public Criteria andPrmGreaterThan(String value) {
            addCriterion("CIS_PRM >", value, "prm");
            return (Criteria) this;
        }

        public Criteria andPrmGreaterThanOrEqualTo(String value) {
            addCriterion("CIS_PRM >=", value, "prm");
            return (Criteria) this;
        }

        public Criteria andPrmLessThan(String value) {
            addCriterion("CIS_PRM <", value, "prm");
            return (Criteria) this;
        }

        public Criteria andPrmLessThanOrEqualTo(String value) {
            addCriterion("CIS_PRM <=", value, "prm");
            return (Criteria) this;
        }

        public Criteria andPrmLike(String value) {
            addCriterion("CIS_PRM like", value, "prm");
            return (Criteria) this;
        }

        public Criteria andPrmNotLike(String value) {
            addCriterion("CIS_PRM not like", value, "prm");
            return (Criteria) this;
        }

        public Criteria andPrmIn(List<String> values) {
            addCriterion("CIS_PRM in", values, "prm");
            return (Criteria) this;
        }

        public Criteria andPrmNotIn(List<String> values) {
            addCriterion("CIS_PRM not in", values, "prm");
            return (Criteria) this;
        }

        public Criteria andPrmBetween(String value1, String value2) {
            addCriterion("CIS_PRM between", value1, value2, "prm");
            return (Criteria) this;
        }

        public Criteria andPrmNotBetween(String value1, String value2) {
            addCriterion("CIS_PRM not between", value1, value2, "prm");
            return (Criteria) this;
        }

        public Criteria andSumAmtIsNull() {
            addCriterion("CIS_SUM_AMT is null");
            return (Criteria) this;
        }

        public Criteria andSumAmtIsNotNull() {
            addCriterion("CIS_SUM_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andSumAmtEqualTo(String value) {
            addCriterion("CIS_SUM_AMT =", value, "sumAmt");
            return (Criteria) this;
        }

        public Criteria andSumAmtNotEqualTo(String value) {
            addCriterion("CIS_SUM_AMT <>", value, "sumAmt");
            return (Criteria) this;
        }

        public Criteria andSumAmtGreaterThan(String value) {
            addCriterion("CIS_SUM_AMT >", value, "sumAmt");
            return (Criteria) this;
        }

        public Criteria andSumAmtGreaterThanOrEqualTo(String value) {
            addCriterion("CIS_SUM_AMT >=", value, "sumAmt");
            return (Criteria) this;
        }

        public Criteria andSumAmtLessThan(String value) {
            addCriterion("CIS_SUM_AMT <", value, "sumAmt");
            return (Criteria) this;
        }

        public Criteria andSumAmtLessThanOrEqualTo(String value) {
            addCriterion("CIS_SUM_AMT <=", value, "sumAmt");
            return (Criteria) this;
        }

        public Criteria andSumAmtLike(String value) {
            addCriterion("CIS_SUM_AMT like", value, "sumAmt");
            return (Criteria) this;
        }

        public Criteria andSumAmtNotLike(String value) {
            addCriterion("CIS_SUM_AMT not like", value, "sumAmt");
            return (Criteria) this;
        }

        public Criteria andSumAmtIn(List<String> values) {
            addCriterion("CIS_SUM_AMT in", values, "sumAmt");
            return (Criteria) this;
        }

        public Criteria andSumAmtNotIn(List<String> values) {
            addCriterion("CIS_SUM_AMT not in", values, "sumAmt");
            return (Criteria) this;
        }

        public Criteria andSumAmtBetween(String value1, String value2) {
            addCriterion("CIS_SUM_AMT between", value1, value2, "sumAmt");
            return (Criteria) this;
        }

        public Criteria andSumAmtNotBetween(String value1, String value2) {
            addCriterion("CIS_SUM_AMT not between", value1, value2, "sumAmt");
            return (Criteria) this;
        }

        public Criteria andSumPrmIsNull() {
            addCriterion("CIS_SUM_PRM is null");
            return (Criteria) this;
        }

        public Criteria andSumPrmIsNotNull() {
            addCriterion("CIS_SUM_PRM is not null");
            return (Criteria) this;
        }

        public Criteria andSumPrmEqualTo(String value) {
            addCriterion("CIS_SUM_PRM =", value, "sumPrm");
            return (Criteria) this;
        }

        public Criteria andSumPrmNotEqualTo(String value) {
            addCriterion("CIS_SUM_PRM <>", value, "sumPrm");
            return (Criteria) this;
        }

        public Criteria andSumPrmGreaterThan(String value) {
            addCriterion("CIS_SUM_PRM >", value, "sumPrm");
            return (Criteria) this;
        }

        public Criteria andSumPrmGreaterThanOrEqualTo(String value) {
            addCriterion("CIS_SUM_PRM >=", value, "sumPrm");
            return (Criteria) this;
        }

        public Criteria andSumPrmLessThan(String value) {
            addCriterion("CIS_SUM_PRM <", value, "sumPrm");
            return (Criteria) this;
        }

        public Criteria andSumPrmLessThanOrEqualTo(String value) {
            addCriterion("CIS_SUM_PRM <=", value, "sumPrm");
            return (Criteria) this;
        }

        public Criteria andSumPrmLike(String value) {
            addCriterion("CIS_SUM_PRM like", value, "sumPrm");
            return (Criteria) this;
        }

        public Criteria andSumPrmNotLike(String value) {
            addCriterion("CIS_SUM_PRM not like", value, "sumPrm");
            return (Criteria) this;
        }

        public Criteria andSumPrmIn(List<String> values) {
            addCriterion("CIS_SUM_PRM in", values, "sumPrm");
            return (Criteria) this;
        }

        public Criteria andSumPrmNotIn(List<String> values) {
            addCriterion("CIS_SUM_PRM not in", values, "sumPrm");
            return (Criteria) this;
        }

        public Criteria andSumPrmBetween(String value1, String value2) {
            addCriterion("CIS_SUM_PRM between", value1, value2, "sumPrm");
            return (Criteria) this;
        }

        public Criteria andSumPrmNotBetween(String value1, String value2) {
            addCriterion("CIS_SUM_PRM not between", value1, value2, "sumPrm");
            return (Criteria) this;
        }

        public Criteria andNclmSumIsNull() {
            addCriterion("CIS_NCLM_SUM is null");
            return (Criteria) this;
        }

        public Criteria andNclmSumIsNotNull() {
            addCriterion("CIS_NCLM_SUM is not null");
            return (Criteria) this;
        }

        public Criteria andNclmSumEqualTo(String value) {
            addCriterion("CIS_NCLM_SUM =", value, "nclmSum");
            return (Criteria) this;
        }

        public Criteria andNclmSumNotEqualTo(String value) {
            addCriterion("CIS_NCLM_SUM <>", value, "nclmSum");
            return (Criteria) this;
        }

        public Criteria andNclmSumGreaterThan(String value) {
            addCriterion("CIS_NCLM_SUM >", value, "nclmSum");
            return (Criteria) this;
        }

        public Criteria andNclmSumGreaterThanOrEqualTo(String value) {
            addCriterion("CIS_NCLM_SUM >=", value, "nclmSum");
            return (Criteria) this;
        }

        public Criteria andNclmSumLessThan(String value) {
            addCriterion("CIS_NCLM_SUM <", value, "nclmSum");
            return (Criteria) this;
        }

        public Criteria andNclmSumLessThanOrEqualTo(String value) {
            addCriterion("CIS_NCLM_SUM <=", value, "nclmSum");
            return (Criteria) this;
        }

        public Criteria andNclmSumLike(String value) {
            addCriterion("CIS_NCLM_SUM like", value, "nclmSum");
            return (Criteria) this;
        }

        public Criteria andNclmSumNotLike(String value) {
            addCriterion("CIS_NCLM_SUM not like", value, "nclmSum");
            return (Criteria) this;
        }

        public Criteria andNclmSumIn(List<String> values) {
            addCriterion("CIS_NCLM_SUM in", values, "nclmSum");
            return (Criteria) this;
        }

        public Criteria andNclmSumNotIn(List<String> values) {
            addCriterion("CIS_NCLM_SUM not in", values, "nclmSum");
            return (Criteria) this;
        }

        public Criteria andNclmSumBetween(String value1, String value2) {
            addCriterion("CIS_NCLM_SUM between", value1, value2, "nclmSum");
            return (Criteria) this;
        }

        public Criteria andNclmSumNotBetween(String value1, String value2) {
            addCriterion("CIS_NCLM_SUM not between", value1, value2, "nclmSum");
            return (Criteria) this;
        }

        public Criteria andPayablePrmIsNull() {
            addCriterion("CIS_PAYABLE_PRM is null");
            return (Criteria) this;
        }

        public Criteria andPayablePrmIsNotNull() {
            addCriterion("CIS_PAYABLE_PRM is not null");
            return (Criteria) this;
        }

        public Criteria andPayablePrmEqualTo(String value) {
            addCriterion("CIS_PAYABLE_PRM =", value, "payablePrm");
            return (Criteria) this;
        }

        public Criteria andPayablePrmNotEqualTo(String value) {
            addCriterion("CIS_PAYABLE_PRM <>", value, "payablePrm");
            return (Criteria) this;
        }

        public Criteria andPayablePrmGreaterThan(String value) {
            addCriterion("CIS_PAYABLE_PRM >", value, "payablePrm");
            return (Criteria) this;
        }

        public Criteria andPayablePrmGreaterThanOrEqualTo(String value) {
            addCriterion("CIS_PAYABLE_PRM >=", value, "payablePrm");
            return (Criteria) this;
        }

        public Criteria andPayablePrmLessThan(String value) {
            addCriterion("CIS_PAYABLE_PRM <", value, "payablePrm");
            return (Criteria) this;
        }

        public Criteria andPayablePrmLessThanOrEqualTo(String value) {
            addCriterion("CIS_PAYABLE_PRM <=", value, "payablePrm");
            return (Criteria) this;
        }

        public Criteria andPayablePrmLike(String value) {
            addCriterion("CIS_PAYABLE_PRM like", value, "payablePrm");
            return (Criteria) this;
        }

        public Criteria andPayablePrmNotLike(String value) {
            addCriterion("CIS_PAYABLE_PRM not like", value, "payablePrm");
            return (Criteria) this;
        }

        public Criteria andPayablePrmIn(List<String> values) {
            addCriterion("CIS_PAYABLE_PRM in", values, "payablePrm");
            return (Criteria) this;
        }

        public Criteria andPayablePrmNotIn(List<String> values) {
            addCriterion("CIS_PAYABLE_PRM not in", values, "payablePrm");
            return (Criteria) this;
        }

        public Criteria andPayablePrmBetween(String value1, String value2) {
            addCriterion("CIS_PAYABLE_PRM between", value1, value2, "payablePrm");
            return (Criteria) this;
        }

        public Criteria andPayablePrmNotBetween(String value1, String value2) {
            addCriterion("CIS_PAYABLE_PRM not between", value1, value2, "payablePrm");
            return (Criteria) this;
        }

        public Criteria andRealityPrmIsNull() {
            addCriterion("CIS_REALITY_PRM is null");
            return (Criteria) this;
        }

        public Criteria andRealityPrmIsNotNull() {
            addCriterion("CIS_REALITY_PRM is not null");
            return (Criteria) this;
        }

        public Criteria andRealityPrmEqualTo(String value) {
            addCriterion("CIS_REALITY_PRM =", value, "realityPrm");
            return (Criteria) this;
        }

        public Criteria andRealityPrmNotEqualTo(String value) {
            addCriterion("CIS_REALITY_PRM <>", value, "realityPrm");
            return (Criteria) this;
        }

        public Criteria andRealityPrmGreaterThan(String value) {
            addCriterion("CIS_REALITY_PRM >", value, "realityPrm");
            return (Criteria) this;
        }

        public Criteria andRealityPrmGreaterThanOrEqualTo(String value) {
            addCriterion("CIS_REALITY_PRM >=", value, "realityPrm");
            return (Criteria) this;
        }

        public Criteria andRealityPrmLessThan(String value) {
            addCriterion("CIS_REALITY_PRM <", value, "realityPrm");
            return (Criteria) this;
        }

        public Criteria andRealityPrmLessThanOrEqualTo(String value) {
            addCriterion("CIS_REALITY_PRM <=", value, "realityPrm");
            return (Criteria) this;
        }

        public Criteria andRealityPrmLike(String value) {
            addCriterion("CIS_REALITY_PRM like", value, "realityPrm");
            return (Criteria) this;
        }

        public Criteria andRealityPrmNotLike(String value) {
            addCriterion("CIS_REALITY_PRM not like", value, "realityPrm");
            return (Criteria) this;
        }

        public Criteria andRealityPrmIn(List<String> values) {
            addCriterion("CIS_REALITY_PRM in", values, "realityPrm");
            return (Criteria) this;
        }

        public Criteria andRealityPrmNotIn(List<String> values) {
            addCriterion("CIS_REALITY_PRM not in", values, "realityPrm");
            return (Criteria) this;
        }

        public Criteria andRealityPrmBetween(String value1, String value2) {
            addCriterion("CIS_REALITY_PRM between", value1, value2, "realityPrm");
            return (Criteria) this;
        }

        public Criteria andRealityPrmNotBetween(String value1, String value2) {
            addCriterion("CIS_REALITY_PRM not between", value1, value2, "realityPrm");
            return (Criteria) this;
        }

        public Criteria andPolicynumIsNull() {
            addCriterion("CIS_POLICYNUM is null");
            return (Criteria) this;
        }

        public Criteria andPolicynumIsNotNull() {
            addCriterion("CIS_POLICYNUM is not null");
            return (Criteria) this;
        }

        public Criteria andPolicynumEqualTo(String value) {
            addCriterion("CIS_POLICYNUM =", value, "policynum");
            return (Criteria) this;
        }

        public Criteria andPolicynumNotEqualTo(String value) {
            addCriterion("CIS_POLICYNUM <>", value, "policynum");
            return (Criteria) this;
        }

        public Criteria andPolicynumGreaterThan(String value) {
            addCriterion("CIS_POLICYNUM >", value, "policynum");
            return (Criteria) this;
        }

        public Criteria andPolicynumGreaterThanOrEqualTo(String value) {
            addCriterion("CIS_POLICYNUM >=", value, "policynum");
            return (Criteria) this;
        }

        public Criteria andPolicynumLessThan(String value) {
            addCriterion("CIS_POLICYNUM <", value, "policynum");
            return (Criteria) this;
        }

        public Criteria andPolicynumLessThanOrEqualTo(String value) {
            addCriterion("CIS_POLICYNUM <=", value, "policynum");
            return (Criteria) this;
        }

        public Criteria andPolicynumLike(String value) {
            addCriterion("CIS_POLICYNUM like", value, "policynum");
            return (Criteria) this;
        }

        public Criteria andPolicynumNotLike(String value) {
            addCriterion("CIS_POLICYNUM not like", value, "policynum");
            return (Criteria) this;
        }

        public Criteria andPolicynumIn(List<String> values) {
            addCriterion("CIS_POLICYNUM in", values, "policynum");
            return (Criteria) this;
        }

        public Criteria andPolicynumNotIn(List<String> values) {
            addCriterion("CIS_POLICYNUM not in", values, "policynum");
            return (Criteria) this;
        }

        public Criteria andPolicynumBetween(String value1, String value2) {
            addCriterion("CIS_POLICYNUM between", value1, value2, "policynum");
            return (Criteria) this;
        }

        public Criteria andPolicynumNotBetween(String value1, String value2) {
            addCriterion("CIS_POLICYNUM not between", value1, value2, "policynum");
            return (Criteria) this;
        }

        public Criteria andIdLikeInsensitive(String value) {
            addCriterion("upper(CIS_ID) like", value.toUpperCase(), "id");
            return (Criteria) this;
        }

        public Criteria andShipCodeLikeInsensitive(String value) {
            addCriterion("upper(CIS_SHIP_CODE) like", value.toUpperCase(), "shipCode");
            return (Criteria) this;
        }

        public Criteria andShipNameLikeInsensitive(String value) {
            addCriterion("upper(CIS_SHIP_NAME) like", value.toUpperCase(), "shipName");
            return (Criteria) this;
        }

        public Criteria andPoliyFlagLikeInsensitive(String value) {
            addCriterion("upper(CIS_POLIY_FLAG) like", value.toUpperCase(), "poliyFlag");
            return (Criteria) this;
        }

        public Criteria andAssTypeLikeInsensitive(String value) {
            addCriterion("upper(CIS_ASS_TYPE) like", value.toUpperCase(), "assType");
            return (Criteria) this;
        }

        public Criteria andInsrntcdeLikeInsensitive(String value) {
            addCriterion("upper(CIS_INSRNTCDE) like", value.toUpperCase(), "insrntcde");
            return (Criteria) this;
        }

        public Criteria andAssCnmLikeInsensitive(String value) {
            addCriterion("upper(CIS_ASS_CNM) like", value.toUpperCase(), "assCnm");
            return (Criteria) this;
        }

        public Criteria andInsrntTelLikeInsensitive(String value) {
            addCriterion("upper(CIS_INSRNT_TEL) like", value.toUpperCase(), "insrntTel");
            return (Criteria) this;
        }

        public Criteria andAssAddrLikeInsensitive(String value) {
            addCriterion("upper(CIS_ASS_ADDR) like", value.toUpperCase(), "assAddr");
            return (Criteria) this;
        }

        public Criteria andPortOfRegistryLikeInsensitive(String value) {
            addCriterion("upper(CIS_PORT_OF_REGISTRY) like", value.toUpperCase(), "portOfRegistry");
            return (Criteria) this;
        }

        public Criteria andShipLongLikeInsensitive(String value) {
            addCriterion("upper(CIS_SHIP_LONG) like", value.toUpperCase(), "shipLong");
            return (Criteria) this;
        }

        public Criteria andBuildTmLikeInsensitive(String value) {
            addCriterion("upper(CIS_BUILD_TM) like", value.toUpperCase(), "buildTm");
            return (Criteria) this;
        }

        public Criteria andShipmaterialCdeLikeInsensitive(String value) {
            addCriterion("upper(CIS_SHIPMATERIAL_CDE) like", value.toUpperCase(), "shipmaterialCde");
            return (Criteria) this;
        }

        public Criteria andPowerLikeInsensitive(String value) {
            addCriterion("upper(CIS_POWER) like", value.toUpperCase(), "power");
            return (Criteria) this;
        }

        public Criteria andShiptypCdeLikeInsensitive(String value) {
            addCriterion("upper(CIS_SHIPTYP_CDE) like", value.toUpperCase(), "shiptypCde");
            return (Criteria) this;
        }

        public Criteria andSailareaCdeLikeInsensitive(String value) {
            addCriterion("upper(CIS_SAILAREA_CDE) like", value.toUpperCase(), "sailareaCde");
            return (Criteria) this;
        }

        public Criteria andShipTonnageLikeInsensitive(String value) {
            addCriterion("upper(CIS_SHIP_TONNAGE) like", value.toUpperCase(), "shipTonnage");
            return (Criteria) this;
        }

        public Criteria andInsrncBgnTmLikeInsensitive(String value) {
            addCriterion("upper(CIS_INSRNC_BGN_TM) like", value.toUpperCase(), "insrncBgnTm");
            return (Criteria) this;
        }

        public Criteria andInsrncEndTmLikeInsensitive(String value) {
            addCriterion("upper(CIS_INSRNC_END_TM) like", value.toUpperCase(), "insrncEndTm");
            return (Criteria) this;
        }

        public Criteria andInputTmLikeInsensitive(String value) {
            addCriterion("upper(CIS_INPUT_TM) like", value.toUpperCase(), "inputTm");
            return (Criteria) this;
        }

        public Criteria andRdrCnmLikeInsensitive(String value) {
            addCriterion("upper(CIS_RDR_CNM) like", value.toUpperCase(), "rdrCnm");
            return (Criteria) this;
        }

        public Criteria andAmtLikeInsensitive(String value) {
            addCriterion("upper(CIS_AMT) like", value.toUpperCase(), "amt");
            return (Criteria) this;
        }

        public Criteria andPlyRateLikeInsensitive(String value) {
            addCriterion("upper(CIS_PLY_RATE) like", value.toUpperCase(), "plyRate");
            return (Criteria) this;
        }

        public Criteria andRateLikeInsensitive(String value) {
            addCriterion("upper(CIS_RATE) like", value.toUpperCase(), "rate");
            return (Criteria) this;
        }

        public Criteria andPrmLikeInsensitive(String value) {
            addCriterion("upper(CIS_PRM) like", value.toUpperCase(), "prm");
            return (Criteria) this;
        }

        public Criteria andSumAmtLikeInsensitive(String value) {
            addCriterion("upper(CIS_SUM_AMT) like", value.toUpperCase(), "sumAmt");
            return (Criteria) this;
        }

        public Criteria andSumPrmLikeInsensitive(String value) {
            addCriterion("upper(CIS_SUM_PRM) like", value.toUpperCase(), "sumPrm");
            return (Criteria) this;
        }

        public Criteria andNclmSumLikeInsensitive(String value) {
            addCriterion("upper(CIS_NCLM_SUM) like", value.toUpperCase(), "nclmSum");
            return (Criteria) this;
        }

        public Criteria andPayablePrmLikeInsensitive(String value) {
            addCriterion("upper(CIS_PAYABLE_PRM) like", value.toUpperCase(), "payablePrm");
            return (Criteria) this;
        }

        public Criteria andRealityPrmLikeInsensitive(String value) {
            addCriterion("upper(CIS_REALITY_PRM) like", value.toUpperCase(), "realityPrm");
            return (Criteria) this;
        }

        public Criteria andPolicynumLikeInsensitive(String value) {
            addCriterion("upper(CIS_POLICYNUM) like", value.toUpperCase(), "policynum");
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