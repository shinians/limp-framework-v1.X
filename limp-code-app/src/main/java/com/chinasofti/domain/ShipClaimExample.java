package com.chinasofti.domain;

import com.limp.framework.core.bean.Pager;

import java.util.ArrayList;
import java.util.List;

public class ShipClaimExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Pager page;

    public ShipClaimExample() {
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
            addCriterion("CSC_ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("CSC_ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("CSC_ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("CSC_ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("CSC_ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("CSC_ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("CSC_ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("CSC_ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("CSC_ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("CSC_ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("CSC_ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("CSC_ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("CSC_ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("CSC_ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andShipCodeIsNull() {
            addCriterion("CSC_SHIP_CODE is null");
            return (Criteria) this;
        }

        public Criteria andShipCodeIsNotNull() {
            addCriterion("CSC_SHIP_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andShipCodeEqualTo(String value) {
            addCriterion("CSC_SHIP_CODE =", value, "shipCode");
            return (Criteria) this;
        }

        public Criteria andShipCodeNotEqualTo(String value) {
            addCriterion("CSC_SHIP_CODE <>", value, "shipCode");
            return (Criteria) this;
        }

        public Criteria andShipCodeGreaterThan(String value) {
            addCriterion("CSC_SHIP_CODE >", value, "shipCode");
            return (Criteria) this;
        }

        public Criteria andShipCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CSC_SHIP_CODE >=", value, "shipCode");
            return (Criteria) this;
        }

        public Criteria andShipCodeLessThan(String value) {
            addCriterion("CSC_SHIP_CODE <", value, "shipCode");
            return (Criteria) this;
        }

        public Criteria andShipCodeLessThanOrEqualTo(String value) {
            addCriterion("CSC_SHIP_CODE <=", value, "shipCode");
            return (Criteria) this;
        }

        public Criteria andShipCodeLike(String value) {
            addCriterion("CSC_SHIP_CODE like", value, "shipCode");
            return (Criteria) this;
        }

        public Criteria andShipCodeNotLike(String value) {
            addCriterion("CSC_SHIP_CODE not like", value, "shipCode");
            return (Criteria) this;
        }

        public Criteria andShipCodeIn(List<String> values) {
            addCriterion("CSC_SHIP_CODE in", values, "shipCode");
            return (Criteria) this;
        }

        public Criteria andShipCodeNotIn(List<String> values) {
            addCriterion("CSC_SHIP_CODE not in", values, "shipCode");
            return (Criteria) this;
        }

        public Criteria andShipCodeBetween(String value1, String value2) {
            addCriterion("CSC_SHIP_CODE between", value1, value2, "shipCode");
            return (Criteria) this;
        }

        public Criteria andShipCodeNotBetween(String value1, String value2) {
            addCriterion("CSC_SHIP_CODE not between", value1, value2, "shipCode");
            return (Criteria) this;
        }

        public Criteria andShipNameIsNull() {
            addCriterion("CSC_SHIP_NAME is null");
            return (Criteria) this;
        }

        public Criteria andShipNameIsNotNull() {
            addCriterion("CSC_SHIP_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andShipNameEqualTo(String value) {
            addCriterion("CSC_SHIP_NAME =", value, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameNotEqualTo(String value) {
            addCriterion("CSC_SHIP_NAME <>", value, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameGreaterThan(String value) {
            addCriterion("CSC_SHIP_NAME >", value, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameGreaterThanOrEqualTo(String value) {
            addCriterion("CSC_SHIP_NAME >=", value, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameLessThan(String value) {
            addCriterion("CSC_SHIP_NAME <", value, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameLessThanOrEqualTo(String value) {
            addCriterion("CSC_SHIP_NAME <=", value, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameLike(String value) {
            addCriterion("CSC_SHIP_NAME like", value, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameNotLike(String value) {
            addCriterion("CSC_SHIP_NAME not like", value, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameIn(List<String> values) {
            addCriterion("CSC_SHIP_NAME in", values, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameNotIn(List<String> values) {
            addCriterion("CSC_SHIP_NAME not in", values, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameBetween(String value1, String value2) {
            addCriterion("CSC_SHIP_NAME between", value1, value2, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameNotBetween(String value1, String value2) {
            addCriterion("CSC_SHIP_NAME not between", value1, value2, "shipName");
            return (Criteria) this;
        }

        public Criteria andClaimFlagIsNull() {
            addCriterion("CSC_CLAIM_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andClaimFlagIsNotNull() {
            addCriterion("CSC_CLAIM_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andClaimFlagEqualTo(String value) {
            addCriterion("CSC_CLAIM_FLAG =", value, "claimFlag");
            return (Criteria) this;
        }

        public Criteria andClaimFlagNotEqualTo(String value) {
            addCriterion("CSC_CLAIM_FLAG <>", value, "claimFlag");
            return (Criteria) this;
        }

        public Criteria andClaimFlagGreaterThan(String value) {
            addCriterion("CSC_CLAIM_FLAG >", value, "claimFlag");
            return (Criteria) this;
        }

        public Criteria andClaimFlagGreaterThanOrEqualTo(String value) {
            addCriterion("CSC_CLAIM_FLAG >=", value, "claimFlag");
            return (Criteria) this;
        }

        public Criteria andClaimFlagLessThan(String value) {
            addCriterion("CSC_CLAIM_FLAG <", value, "claimFlag");
            return (Criteria) this;
        }

        public Criteria andClaimFlagLessThanOrEqualTo(String value) {
            addCriterion("CSC_CLAIM_FLAG <=", value, "claimFlag");
            return (Criteria) this;
        }

        public Criteria andClaimFlagLike(String value) {
            addCriterion("CSC_CLAIM_FLAG like", value, "claimFlag");
            return (Criteria) this;
        }

        public Criteria andClaimFlagNotLike(String value) {
            addCriterion("CSC_CLAIM_FLAG not like", value, "claimFlag");
            return (Criteria) this;
        }

        public Criteria andClaimFlagIn(List<String> values) {
            addCriterion("CSC_CLAIM_FLAG in", values, "claimFlag");
            return (Criteria) this;
        }

        public Criteria andClaimFlagNotIn(List<String> values) {
            addCriterion("CSC_CLAIM_FLAG not in", values, "claimFlag");
            return (Criteria) this;
        }

        public Criteria andClaimFlagBetween(String value1, String value2) {
            addCriterion("CSC_CLAIM_FLAG between", value1, value2, "claimFlag");
            return (Criteria) this;
        }

        public Criteria andClaimFlagNotBetween(String value1, String value2) {
            addCriterion("CSC_CLAIM_FLAG not between", value1, value2, "claimFlag");
            return (Criteria) this;
        }

        public Criteria andAccdntspotIsNull() {
            addCriterion("CSC_ACCDNTSPOT is null");
            return (Criteria) this;
        }

        public Criteria andAccdntspotIsNotNull() {
            addCriterion("CSC_ACCDNTSPOT is not null");
            return (Criteria) this;
        }

        public Criteria andAccdntspotEqualTo(String value) {
            addCriterion("CSC_ACCDNTSPOT =", value, "accdntspot");
            return (Criteria) this;
        }

        public Criteria andAccdntspotNotEqualTo(String value) {
            addCriterion("CSC_ACCDNTSPOT <>", value, "accdntspot");
            return (Criteria) this;
        }

        public Criteria andAccdntspotGreaterThan(String value) {
            addCriterion("CSC_ACCDNTSPOT >", value, "accdntspot");
            return (Criteria) this;
        }

        public Criteria andAccdntspotGreaterThanOrEqualTo(String value) {
            addCriterion("CSC_ACCDNTSPOT >=", value, "accdntspot");
            return (Criteria) this;
        }

        public Criteria andAccdntspotLessThan(String value) {
            addCriterion("CSC_ACCDNTSPOT <", value, "accdntspot");
            return (Criteria) this;
        }

        public Criteria andAccdntspotLessThanOrEqualTo(String value) {
            addCriterion("CSC_ACCDNTSPOT <=", value, "accdntspot");
            return (Criteria) this;
        }

        public Criteria andAccdntspotLike(String value) {
            addCriterion("CSC_ACCDNTSPOT like", value, "accdntspot");
            return (Criteria) this;
        }

        public Criteria andAccdntspotNotLike(String value) {
            addCriterion("CSC_ACCDNTSPOT not like", value, "accdntspot");
            return (Criteria) this;
        }

        public Criteria andAccdntspotIn(List<String> values) {
            addCriterion("CSC_ACCDNTSPOT in", values, "accdntspot");
            return (Criteria) this;
        }

        public Criteria andAccdntspotNotIn(List<String> values) {
            addCriterion("CSC_ACCDNTSPOT not in", values, "accdntspot");
            return (Criteria) this;
        }

        public Criteria andAccdntspotBetween(String value1, String value2) {
            addCriterion("CSC_ACCDNTSPOT between", value1, value2, "accdntspot");
            return (Criteria) this;
        }

        public Criteria andAccdntspotNotBetween(String value1, String value2) {
            addCriterion("CSC_ACCDNTSPOT not between", value1, value2, "accdntspot");
            return (Criteria) this;
        }

        public Criteria andAccdnttmIsNull() {
            addCriterion("CSC_ACCDNTTM is null");
            return (Criteria) this;
        }

        public Criteria andAccdnttmIsNotNull() {
            addCriterion("CSC_ACCDNTTM is not null");
            return (Criteria) this;
        }

        public Criteria andAccdnttmEqualTo(String value) {
            addCriterion("CSC_ACCDNTTM =", value, "accdnttm");
            return (Criteria) this;
        }

        public Criteria andAccdnttmNotEqualTo(String value) {
            addCriterion("CSC_ACCDNTTM <>", value, "accdnttm");
            return (Criteria) this;
        }

        public Criteria andAccdnttmGreaterThan(String value) {
            addCriterion("CSC_ACCDNTTM >", value, "accdnttm");
            return (Criteria) this;
        }

        public Criteria andAccdnttmGreaterThanOrEqualTo(String value) {
            addCriterion("CSC_ACCDNTTM >=", value, "accdnttm");
            return (Criteria) this;
        }

        public Criteria andAccdnttmLessThan(String value) {
            addCriterion("CSC_ACCDNTTM <", value, "accdnttm");
            return (Criteria) this;
        }

        public Criteria andAccdnttmLessThanOrEqualTo(String value) {
            addCriterion("CSC_ACCDNTTM <=", value, "accdnttm");
            return (Criteria) this;
        }

        public Criteria andAccdnttmLike(String value) {
            addCriterion("CSC_ACCDNTTM like", value, "accdnttm");
            return (Criteria) this;
        }

        public Criteria andAccdnttmNotLike(String value) {
            addCriterion("CSC_ACCDNTTM not like", value, "accdnttm");
            return (Criteria) this;
        }

        public Criteria andAccdnttmIn(List<String> values) {
            addCriterion("CSC_ACCDNTTM in", values, "accdnttm");
            return (Criteria) this;
        }

        public Criteria andAccdnttmNotIn(List<String> values) {
            addCriterion("CSC_ACCDNTTM not in", values, "accdnttm");
            return (Criteria) this;
        }

        public Criteria andAccdnttmBetween(String value1, String value2) {
            addCriterion("CSC_ACCDNTTM between", value1, value2, "accdnttm");
            return (Criteria) this;
        }

        public Criteria andAccdnttmNotBetween(String value1, String value2) {
            addCriterion("CSC_ACCDNTTM not between", value1, value2, "accdnttm");
            return (Criteria) this;
        }

        public Criteria andSrvyspotIsNull() {
            addCriterion("CSC_SRVYSPOT is null");
            return (Criteria) this;
        }

        public Criteria andSrvyspotIsNotNull() {
            addCriterion("CSC_SRVYSPOT is not null");
            return (Criteria) this;
        }

        public Criteria andSrvyspotEqualTo(String value) {
            addCriterion("CSC_SRVYSPOT =", value, "srvyspot");
            return (Criteria) this;
        }

        public Criteria andSrvyspotNotEqualTo(String value) {
            addCriterion("CSC_SRVYSPOT <>", value, "srvyspot");
            return (Criteria) this;
        }

        public Criteria andSrvyspotGreaterThan(String value) {
            addCriterion("CSC_SRVYSPOT >", value, "srvyspot");
            return (Criteria) this;
        }

        public Criteria andSrvyspotGreaterThanOrEqualTo(String value) {
            addCriterion("CSC_SRVYSPOT >=", value, "srvyspot");
            return (Criteria) this;
        }

        public Criteria andSrvyspotLessThan(String value) {
            addCriterion("CSC_SRVYSPOT <", value, "srvyspot");
            return (Criteria) this;
        }

        public Criteria andSrvyspotLessThanOrEqualTo(String value) {
            addCriterion("CSC_SRVYSPOT <=", value, "srvyspot");
            return (Criteria) this;
        }

        public Criteria andSrvyspotLike(String value) {
            addCriterion("CSC_SRVYSPOT like", value, "srvyspot");
            return (Criteria) this;
        }

        public Criteria andSrvyspotNotLike(String value) {
            addCriterion("CSC_SRVYSPOT not like", value, "srvyspot");
            return (Criteria) this;
        }

        public Criteria andSrvyspotIn(List<String> values) {
            addCriterion("CSC_SRVYSPOT in", values, "srvyspot");
            return (Criteria) this;
        }

        public Criteria andSrvyspotNotIn(List<String> values) {
            addCriterion("CSC_SRVYSPOT not in", values, "srvyspot");
            return (Criteria) this;
        }

        public Criteria andSrvyspotBetween(String value1, String value2) {
            addCriterion("CSC_SRVYSPOT between", value1, value2, "srvyspot");
            return (Criteria) this;
        }

        public Criteria andSrvyspotNotBetween(String value1, String value2) {
            addCriterion("CSC_SRVYSPOT not between", value1, value2, "srvyspot");
            return (Criteria) this;
        }

        public Criteria andSrvytmIsNull() {
            addCriterion("CSC_SRVYTM is null");
            return (Criteria) this;
        }

        public Criteria andSrvytmIsNotNull() {
            addCriterion("CSC_SRVYTM is not null");
            return (Criteria) this;
        }

        public Criteria andSrvytmEqualTo(String value) {
            addCriterion("CSC_SRVYTM =", value, "srvytm");
            return (Criteria) this;
        }

        public Criteria andSrvytmNotEqualTo(String value) {
            addCriterion("CSC_SRVYTM <>", value, "srvytm");
            return (Criteria) this;
        }

        public Criteria andSrvytmGreaterThan(String value) {
            addCriterion("CSC_SRVYTM >", value, "srvytm");
            return (Criteria) this;
        }

        public Criteria andSrvytmGreaterThanOrEqualTo(String value) {
            addCriterion("CSC_SRVYTM >=", value, "srvytm");
            return (Criteria) this;
        }

        public Criteria andSrvytmLessThan(String value) {
            addCriterion("CSC_SRVYTM <", value, "srvytm");
            return (Criteria) this;
        }

        public Criteria andSrvytmLessThanOrEqualTo(String value) {
            addCriterion("CSC_SRVYTM <=", value, "srvytm");
            return (Criteria) this;
        }

        public Criteria andSrvytmLike(String value) {
            addCriterion("CSC_SRVYTM like", value, "srvytm");
            return (Criteria) this;
        }

        public Criteria andSrvytmNotLike(String value) {
            addCriterion("CSC_SRVYTM not like", value, "srvytm");
            return (Criteria) this;
        }

        public Criteria andSrvytmIn(List<String> values) {
            addCriterion("CSC_SRVYTM in", values, "srvytm");
            return (Criteria) this;
        }

        public Criteria andSrvytmNotIn(List<String> values) {
            addCriterion("CSC_SRVYTM not in", values, "srvytm");
            return (Criteria) this;
        }

        public Criteria andSrvytmBetween(String value1, String value2) {
            addCriterion("CSC_SRVYTM between", value1, value2, "srvytm");
            return (Criteria) this;
        }

        public Criteria andSrvytmNotBetween(String value1, String value2) {
            addCriterion("CSC_SRVYTM not between", value1, value2, "srvytm");
            return (Criteria) this;
        }

        public Criteria andAccorgcnmIsNull() {
            addCriterion("CSC_ACCORGCNM is null");
            return (Criteria) this;
        }

        public Criteria andAccorgcnmIsNotNull() {
            addCriterion("CSC_ACCORGCNM is not null");
            return (Criteria) this;
        }

        public Criteria andAccorgcnmEqualTo(String value) {
            addCriterion("CSC_ACCORGCNM =", value, "accorgcnm");
            return (Criteria) this;
        }

        public Criteria andAccorgcnmNotEqualTo(String value) {
            addCriterion("CSC_ACCORGCNM <>", value, "accorgcnm");
            return (Criteria) this;
        }

        public Criteria andAccorgcnmGreaterThan(String value) {
            addCriterion("CSC_ACCORGCNM >", value, "accorgcnm");
            return (Criteria) this;
        }

        public Criteria andAccorgcnmGreaterThanOrEqualTo(String value) {
            addCriterion("CSC_ACCORGCNM >=", value, "accorgcnm");
            return (Criteria) this;
        }

        public Criteria andAccorgcnmLessThan(String value) {
            addCriterion("CSC_ACCORGCNM <", value, "accorgcnm");
            return (Criteria) this;
        }

        public Criteria andAccorgcnmLessThanOrEqualTo(String value) {
            addCriterion("CSC_ACCORGCNM <=", value, "accorgcnm");
            return (Criteria) this;
        }

        public Criteria andAccorgcnmLike(String value) {
            addCriterion("CSC_ACCORGCNM like", value, "accorgcnm");
            return (Criteria) this;
        }

        public Criteria andAccorgcnmNotLike(String value) {
            addCriterion("CSC_ACCORGCNM not like", value, "accorgcnm");
            return (Criteria) this;
        }

        public Criteria andAccorgcnmIn(List<String> values) {
            addCriterion("CSC_ACCORGCNM in", values, "accorgcnm");
            return (Criteria) this;
        }

        public Criteria andAccorgcnmNotIn(List<String> values) {
            addCriterion("CSC_ACCORGCNM not in", values, "accorgcnm");
            return (Criteria) this;
        }

        public Criteria andAccorgcnmBetween(String value1, String value2) {
            addCriterion("CSC_ACCORGCNM between", value1, value2, "accorgcnm");
            return (Criteria) this;
        }

        public Criteria andAccorgcnmNotBetween(String value1, String value2) {
            addCriterion("CSC_ACCORGCNM not between", value1, value2, "accorgcnm");
            return (Criteria) this;
        }

        public Criteria andAccrsncnmIsNull() {
            addCriterion("CSC_ACCRSNCNM is null");
            return (Criteria) this;
        }

        public Criteria andAccrsncnmIsNotNull() {
            addCriterion("CSC_ACCRSNCNM is not null");
            return (Criteria) this;
        }

        public Criteria andAccrsncnmEqualTo(String value) {
            addCriterion("CSC_ACCRSNCNM =", value, "accrsncnm");
            return (Criteria) this;
        }

        public Criteria andAccrsncnmNotEqualTo(String value) {
            addCriterion("CSC_ACCRSNCNM <>", value, "accrsncnm");
            return (Criteria) this;
        }

        public Criteria andAccrsncnmGreaterThan(String value) {
            addCriterion("CSC_ACCRSNCNM >", value, "accrsncnm");
            return (Criteria) this;
        }

        public Criteria andAccrsncnmGreaterThanOrEqualTo(String value) {
            addCriterion("CSC_ACCRSNCNM >=", value, "accrsncnm");
            return (Criteria) this;
        }

        public Criteria andAccrsncnmLessThan(String value) {
            addCriterion("CSC_ACCRSNCNM <", value, "accrsncnm");
            return (Criteria) this;
        }

        public Criteria andAccrsncnmLessThanOrEqualTo(String value) {
            addCriterion("CSC_ACCRSNCNM <=", value, "accrsncnm");
            return (Criteria) this;
        }

        public Criteria andAccrsncnmLike(String value) {
            addCriterion("CSC_ACCRSNCNM like", value, "accrsncnm");
            return (Criteria) this;
        }

        public Criteria andAccrsncnmNotLike(String value) {
            addCriterion("CSC_ACCRSNCNM not like", value, "accrsncnm");
            return (Criteria) this;
        }

        public Criteria andAccrsncnmIn(List<String> values) {
            addCriterion("CSC_ACCRSNCNM in", values, "accrsncnm");
            return (Criteria) this;
        }

        public Criteria andAccrsncnmNotIn(List<String> values) {
            addCriterion("CSC_ACCRSNCNM not in", values, "accrsncnm");
            return (Criteria) this;
        }

        public Criteria andAccrsncnmBetween(String value1, String value2) {
            addCriterion("CSC_ACCRSNCNM between", value1, value2, "accrsncnm");
            return (Criteria) this;
        }

        public Criteria andAccrsncnmNotBetween(String value1, String value2) {
            addCriterion("CSC_ACCRSNCNM not between", value1, value2, "accrsncnm");
            return (Criteria) this;
        }

        public Criteria andLostdegreecdeIsNull() {
            addCriterion("CSC_LOSTDEGREECDE is null");
            return (Criteria) this;
        }

        public Criteria andLostdegreecdeIsNotNull() {
            addCriterion("CSC_LOSTDEGREECDE is not null");
            return (Criteria) this;
        }

        public Criteria andLostdegreecdeEqualTo(String value) {
            addCriterion("CSC_LOSTDEGREECDE =", value, "lostdegreecde");
            return (Criteria) this;
        }

        public Criteria andLostdegreecdeNotEqualTo(String value) {
            addCriterion("CSC_LOSTDEGREECDE <>", value, "lostdegreecde");
            return (Criteria) this;
        }

        public Criteria andLostdegreecdeGreaterThan(String value) {
            addCriterion("CSC_LOSTDEGREECDE >", value, "lostdegreecde");
            return (Criteria) this;
        }

        public Criteria andLostdegreecdeGreaterThanOrEqualTo(String value) {
            addCriterion("CSC_LOSTDEGREECDE >=", value, "lostdegreecde");
            return (Criteria) this;
        }

        public Criteria andLostdegreecdeLessThan(String value) {
            addCriterion("CSC_LOSTDEGREECDE <", value, "lostdegreecde");
            return (Criteria) this;
        }

        public Criteria andLostdegreecdeLessThanOrEqualTo(String value) {
            addCriterion("CSC_LOSTDEGREECDE <=", value, "lostdegreecde");
            return (Criteria) this;
        }

        public Criteria andLostdegreecdeLike(String value) {
            addCriterion("CSC_LOSTDEGREECDE like", value, "lostdegreecde");
            return (Criteria) this;
        }

        public Criteria andLostdegreecdeNotLike(String value) {
            addCriterion("CSC_LOSTDEGREECDE not like", value, "lostdegreecde");
            return (Criteria) this;
        }

        public Criteria andLostdegreecdeIn(List<String> values) {
            addCriterion("CSC_LOSTDEGREECDE in", values, "lostdegreecde");
            return (Criteria) this;
        }

        public Criteria andLostdegreecdeNotIn(List<String> values) {
            addCriterion("CSC_LOSTDEGREECDE not in", values, "lostdegreecde");
            return (Criteria) this;
        }

        public Criteria andLostdegreecdeBetween(String value1, String value2) {
            addCriterion("CSC_LOSTDEGREECDE between", value1, value2, "lostdegreecde");
            return (Criteria) this;
        }

        public Criteria andLostdegreecdeNotBetween(String value1, String value2) {
            addCriterion("CSC_LOSTDEGREECDE not between", value1, value2, "lostdegreecde");
            return (Criteria) this;
        }

        public Criteria andDamagedtlIsNull() {
            addCriterion("CSC_DAMAGEDTL is null");
            return (Criteria) this;
        }

        public Criteria andDamagedtlIsNotNull() {
            addCriterion("CSC_DAMAGEDTL is not null");
            return (Criteria) this;
        }

        public Criteria andDamagedtlEqualTo(String value) {
            addCriterion("CSC_DAMAGEDTL =", value, "damagedtl");
            return (Criteria) this;
        }

        public Criteria andDamagedtlNotEqualTo(String value) {
            addCriterion("CSC_DAMAGEDTL <>", value, "damagedtl");
            return (Criteria) this;
        }

        public Criteria andDamagedtlGreaterThan(String value) {
            addCriterion("CSC_DAMAGEDTL >", value, "damagedtl");
            return (Criteria) this;
        }

        public Criteria andDamagedtlGreaterThanOrEqualTo(String value) {
            addCriterion("CSC_DAMAGEDTL >=", value, "damagedtl");
            return (Criteria) this;
        }

        public Criteria andDamagedtlLessThan(String value) {
            addCriterion("CSC_DAMAGEDTL <", value, "damagedtl");
            return (Criteria) this;
        }

        public Criteria andDamagedtlLessThanOrEqualTo(String value) {
            addCriterion("CSC_DAMAGEDTL <=", value, "damagedtl");
            return (Criteria) this;
        }

        public Criteria andDamagedtlLike(String value) {
            addCriterion("CSC_DAMAGEDTL like", value, "damagedtl");
            return (Criteria) this;
        }

        public Criteria andDamagedtlNotLike(String value) {
            addCriterion("CSC_DAMAGEDTL not like", value, "damagedtl");
            return (Criteria) this;
        }

        public Criteria andDamagedtlIn(List<String> values) {
            addCriterion("CSC_DAMAGEDTL in", values, "damagedtl");
            return (Criteria) this;
        }

        public Criteria andDamagedtlNotIn(List<String> values) {
            addCriterion("CSC_DAMAGEDTL not in", values, "damagedtl");
            return (Criteria) this;
        }

        public Criteria andDamagedtlBetween(String value1, String value2) {
            addCriterion("CSC_DAMAGEDTL between", value1, value2, "damagedtl");
            return (Criteria) this;
        }

        public Criteria andDamagedtlNotBetween(String value1, String value2) {
            addCriterion("CSC_DAMAGEDTL not between", value1, value2, "damagedtl");
            return (Criteria) this;
        }

        public Criteria andHelpflagIsNull() {
            addCriterion("CSC_HELPFLAG is null");
            return (Criteria) this;
        }

        public Criteria andHelpflagIsNotNull() {
            addCriterion("CSC_HELPFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andHelpflagEqualTo(String value) {
            addCriterion("CSC_HELPFLAG =", value, "helpflag");
            return (Criteria) this;
        }

        public Criteria andHelpflagNotEqualTo(String value) {
            addCriterion("CSC_HELPFLAG <>", value, "helpflag");
            return (Criteria) this;
        }

        public Criteria andHelpflagGreaterThan(String value) {
            addCriterion("CSC_HELPFLAG >", value, "helpflag");
            return (Criteria) this;
        }

        public Criteria andHelpflagGreaterThanOrEqualTo(String value) {
            addCriterion("CSC_HELPFLAG >=", value, "helpflag");
            return (Criteria) this;
        }

        public Criteria andHelpflagLessThan(String value) {
            addCriterion("CSC_HELPFLAG <", value, "helpflag");
            return (Criteria) this;
        }

        public Criteria andHelpflagLessThanOrEqualTo(String value) {
            addCriterion("CSC_HELPFLAG <=", value, "helpflag");
            return (Criteria) this;
        }

        public Criteria andHelpflagLike(String value) {
            addCriterion("CSC_HELPFLAG like", value, "helpflag");
            return (Criteria) this;
        }

        public Criteria andHelpflagNotLike(String value) {
            addCriterion("CSC_HELPFLAG not like", value, "helpflag");
            return (Criteria) this;
        }

        public Criteria andHelpflagIn(List<String> values) {
            addCriterion("CSC_HELPFLAG in", values, "helpflag");
            return (Criteria) this;
        }

        public Criteria andHelpflagNotIn(List<String> values) {
            addCriterion("CSC_HELPFLAG not in", values, "helpflag");
            return (Criteria) this;
        }

        public Criteria andHelpflagBetween(String value1, String value2) {
            addCriterion("CSC_HELPFLAG between", value1, value2, "helpflag");
            return (Criteria) this;
        }

        public Criteria andHelpflagNotBetween(String value1, String value2) {
            addCriterion("CSC_HELPFLAG not between", value1, value2, "helpflag");
            return (Criteria) this;
        }

        public Criteria andRescuestatecdeIsNull() {
            addCriterion("CSC_RESCUESTATECDE is null");
            return (Criteria) this;
        }

        public Criteria andRescuestatecdeIsNotNull() {
            addCriterion("CSC_RESCUESTATECDE is not null");
            return (Criteria) this;
        }

        public Criteria andRescuestatecdeEqualTo(String value) {
            addCriterion("CSC_RESCUESTATECDE =", value, "rescuestatecde");
            return (Criteria) this;
        }

        public Criteria andRescuestatecdeNotEqualTo(String value) {
            addCriterion("CSC_RESCUESTATECDE <>", value, "rescuestatecde");
            return (Criteria) this;
        }

        public Criteria andRescuestatecdeGreaterThan(String value) {
            addCriterion("CSC_RESCUESTATECDE >", value, "rescuestatecde");
            return (Criteria) this;
        }

        public Criteria andRescuestatecdeGreaterThanOrEqualTo(String value) {
            addCriterion("CSC_RESCUESTATECDE >=", value, "rescuestatecde");
            return (Criteria) this;
        }

        public Criteria andRescuestatecdeLessThan(String value) {
            addCriterion("CSC_RESCUESTATECDE <", value, "rescuestatecde");
            return (Criteria) this;
        }

        public Criteria andRescuestatecdeLessThanOrEqualTo(String value) {
            addCriterion("CSC_RESCUESTATECDE <=", value, "rescuestatecde");
            return (Criteria) this;
        }

        public Criteria andRescuestatecdeLike(String value) {
            addCriterion("CSC_RESCUESTATECDE like", value, "rescuestatecde");
            return (Criteria) this;
        }

        public Criteria andRescuestatecdeNotLike(String value) {
            addCriterion("CSC_RESCUESTATECDE not like", value, "rescuestatecde");
            return (Criteria) this;
        }

        public Criteria andRescuestatecdeIn(List<String> values) {
            addCriterion("CSC_RESCUESTATECDE in", values, "rescuestatecde");
            return (Criteria) this;
        }

        public Criteria andRescuestatecdeNotIn(List<String> values) {
            addCriterion("CSC_RESCUESTATECDE not in", values, "rescuestatecde");
            return (Criteria) this;
        }

        public Criteria andRescuestatecdeBetween(String value1, String value2) {
            addCriterion("CSC_RESCUESTATECDE between", value1, value2, "rescuestatecde");
            return (Criteria) this;
        }

        public Criteria andRescuestatecdeNotBetween(String value1, String value2) {
            addCriterion("CSC_RESCUESTATECDE not between", value1, value2, "rescuestatecde");
            return (Criteria) this;
        }

        public Criteria andRescuemodecdeIsNull() {
            addCriterion("CSC_RESCUEMODECDE is null");
            return (Criteria) this;
        }

        public Criteria andRescuemodecdeIsNotNull() {
            addCriterion("CSC_RESCUEMODECDE is not null");
            return (Criteria) this;
        }

        public Criteria andRescuemodecdeEqualTo(String value) {
            addCriterion("CSC_RESCUEMODECDE =", value, "rescuemodecde");
            return (Criteria) this;
        }

        public Criteria andRescuemodecdeNotEqualTo(String value) {
            addCriterion("CSC_RESCUEMODECDE <>", value, "rescuemodecde");
            return (Criteria) this;
        }

        public Criteria andRescuemodecdeGreaterThan(String value) {
            addCriterion("CSC_RESCUEMODECDE >", value, "rescuemodecde");
            return (Criteria) this;
        }

        public Criteria andRescuemodecdeGreaterThanOrEqualTo(String value) {
            addCriterion("CSC_RESCUEMODECDE >=", value, "rescuemodecde");
            return (Criteria) this;
        }

        public Criteria andRescuemodecdeLessThan(String value) {
            addCriterion("CSC_RESCUEMODECDE <", value, "rescuemodecde");
            return (Criteria) this;
        }

        public Criteria andRescuemodecdeLessThanOrEqualTo(String value) {
            addCriterion("CSC_RESCUEMODECDE <=", value, "rescuemodecde");
            return (Criteria) this;
        }

        public Criteria andRescuemodecdeLike(String value) {
            addCriterion("CSC_RESCUEMODECDE like", value, "rescuemodecde");
            return (Criteria) this;
        }

        public Criteria andRescuemodecdeNotLike(String value) {
            addCriterion("CSC_RESCUEMODECDE not like", value, "rescuemodecde");
            return (Criteria) this;
        }

        public Criteria andRescuemodecdeIn(List<String> values) {
            addCriterion("CSC_RESCUEMODECDE in", values, "rescuemodecde");
            return (Criteria) this;
        }

        public Criteria andRescuemodecdeNotIn(List<String> values) {
            addCriterion("CSC_RESCUEMODECDE not in", values, "rescuemodecde");
            return (Criteria) this;
        }

        public Criteria andRescuemodecdeBetween(String value1, String value2) {
            addCriterion("CSC_RESCUEMODECDE between", value1, value2, "rescuemodecde");
            return (Criteria) this;
        }

        public Criteria andRescuemodecdeNotBetween(String value1, String value2) {
            addCriterion("CSC_RESCUEMODECDE not between", value1, value2, "rescuemodecde");
            return (Criteria) this;
        }

        public Criteria andRepaddressIsNull() {
            addCriterion("CSC_REPADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andRepaddressIsNotNull() {
            addCriterion("CSC_REPADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andRepaddressEqualTo(String value) {
            addCriterion("CSC_REPADDRESS =", value, "repaddress");
            return (Criteria) this;
        }

        public Criteria andRepaddressNotEqualTo(String value) {
            addCriterion("CSC_REPADDRESS <>", value, "repaddress");
            return (Criteria) this;
        }

        public Criteria andRepaddressGreaterThan(String value) {
            addCriterion("CSC_REPADDRESS >", value, "repaddress");
            return (Criteria) this;
        }

        public Criteria andRepaddressGreaterThanOrEqualTo(String value) {
            addCriterion("CSC_REPADDRESS >=", value, "repaddress");
            return (Criteria) this;
        }

        public Criteria andRepaddressLessThan(String value) {
            addCriterion("CSC_REPADDRESS <", value, "repaddress");
            return (Criteria) this;
        }

        public Criteria andRepaddressLessThanOrEqualTo(String value) {
            addCriterion("CSC_REPADDRESS <=", value, "repaddress");
            return (Criteria) this;
        }

        public Criteria andRepaddressLike(String value) {
            addCriterion("CSC_REPADDRESS like", value, "repaddress");
            return (Criteria) this;
        }

        public Criteria andRepaddressNotLike(String value) {
            addCriterion("CSC_REPADDRESS not like", value, "repaddress");
            return (Criteria) this;
        }

        public Criteria andRepaddressIn(List<String> values) {
            addCriterion("CSC_REPADDRESS in", values, "repaddress");
            return (Criteria) this;
        }

        public Criteria andRepaddressNotIn(List<String> values) {
            addCriterion("CSC_REPADDRESS not in", values, "repaddress");
            return (Criteria) this;
        }

        public Criteria andRepaddressBetween(String value1, String value2) {
            addCriterion("CSC_REPADDRESS between", value1, value2, "repaddress");
            return (Criteria) this;
        }

        public Criteria andRepaddressNotBetween(String value1, String value2) {
            addCriterion("CSC_REPADDRESS not between", value1, value2, "repaddress");
            return (Criteria) this;
        }

        public Criteria andThdshipnameIsNull() {
            addCriterion("CSC_THDSHIPNAME is null");
            return (Criteria) this;
        }

        public Criteria andThdshipnameIsNotNull() {
            addCriterion("CSC_THDSHIPNAME is not null");
            return (Criteria) this;
        }

        public Criteria andThdshipnameEqualTo(String value) {
            addCriterion("CSC_THDSHIPNAME =", value, "thdshipname");
            return (Criteria) this;
        }

        public Criteria andThdshipnameNotEqualTo(String value) {
            addCriterion("CSC_THDSHIPNAME <>", value, "thdshipname");
            return (Criteria) this;
        }

        public Criteria andThdshipnameGreaterThan(String value) {
            addCriterion("CSC_THDSHIPNAME >", value, "thdshipname");
            return (Criteria) this;
        }

        public Criteria andThdshipnameGreaterThanOrEqualTo(String value) {
            addCriterion("CSC_THDSHIPNAME >=", value, "thdshipname");
            return (Criteria) this;
        }

        public Criteria andThdshipnameLessThan(String value) {
            addCriterion("CSC_THDSHIPNAME <", value, "thdshipname");
            return (Criteria) this;
        }

        public Criteria andThdshipnameLessThanOrEqualTo(String value) {
            addCriterion("CSC_THDSHIPNAME <=", value, "thdshipname");
            return (Criteria) this;
        }

        public Criteria andThdshipnameLike(String value) {
            addCriterion("CSC_THDSHIPNAME like", value, "thdshipname");
            return (Criteria) this;
        }

        public Criteria andThdshipnameNotLike(String value) {
            addCriterion("CSC_THDSHIPNAME not like", value, "thdshipname");
            return (Criteria) this;
        }

        public Criteria andThdshipnameIn(List<String> values) {
            addCriterion("CSC_THDSHIPNAME in", values, "thdshipname");
            return (Criteria) this;
        }

        public Criteria andThdshipnameNotIn(List<String> values) {
            addCriterion("CSC_THDSHIPNAME not in", values, "thdshipname");
            return (Criteria) this;
        }

        public Criteria andThdshipnameBetween(String value1, String value2) {
            addCriterion("CSC_THDSHIPNAME between", value1, value2, "thdshipname");
            return (Criteria) this;
        }

        public Criteria andThdshipnameNotBetween(String value1, String value2) {
            addCriterion("CSC_THDSHIPNAME not between", value1, value2, "thdshipname");
            return (Criteria) this;
        }

        public Criteria andThdunitIsNull() {
            addCriterion("CSC_THDUNIT is null");
            return (Criteria) this;
        }

        public Criteria andThdunitIsNotNull() {
            addCriterion("CSC_THDUNIT is not null");
            return (Criteria) this;
        }

        public Criteria andThdunitEqualTo(String value) {
            addCriterion("CSC_THDUNIT =", value, "thdunit");
            return (Criteria) this;
        }

        public Criteria andThdunitNotEqualTo(String value) {
            addCriterion("CSC_THDUNIT <>", value, "thdunit");
            return (Criteria) this;
        }

        public Criteria andThdunitGreaterThan(String value) {
            addCriterion("CSC_THDUNIT >", value, "thdunit");
            return (Criteria) this;
        }

        public Criteria andThdunitGreaterThanOrEqualTo(String value) {
            addCriterion("CSC_THDUNIT >=", value, "thdunit");
            return (Criteria) this;
        }

        public Criteria andThdunitLessThan(String value) {
            addCriterion("CSC_THDUNIT <", value, "thdunit");
            return (Criteria) this;
        }

        public Criteria andThdunitLessThanOrEqualTo(String value) {
            addCriterion("CSC_THDUNIT <=", value, "thdunit");
            return (Criteria) this;
        }

        public Criteria andThdunitLike(String value) {
            addCriterion("CSC_THDUNIT like", value, "thdunit");
            return (Criteria) this;
        }

        public Criteria andThdunitNotLike(String value) {
            addCriterion("CSC_THDUNIT not like", value, "thdunit");
            return (Criteria) this;
        }

        public Criteria andThdunitIn(List<String> values) {
            addCriterion("CSC_THDUNIT in", values, "thdunit");
            return (Criteria) this;
        }

        public Criteria andThdunitNotIn(List<String> values) {
            addCriterion("CSC_THDUNIT not in", values, "thdunit");
            return (Criteria) this;
        }

        public Criteria andThdunitBetween(String value1, String value2) {
            addCriterion("CSC_THDUNIT between", value1, value2, "thdunit");
            return (Criteria) this;
        }

        public Criteria andThdunitNotBetween(String value1, String value2) {
            addCriterion("CSC_THDUNIT not between", value1, value2, "thdunit");
            return (Criteria) this;
        }

        public Criteria andThdshipstatuscdeIsNull() {
            addCriterion("CSC_THDSHIPSTATUSCDE is null");
            return (Criteria) this;
        }

        public Criteria andThdshipstatuscdeIsNotNull() {
            addCriterion("CSC_THDSHIPSTATUSCDE is not null");
            return (Criteria) this;
        }

        public Criteria andThdshipstatuscdeEqualTo(String value) {
            addCriterion("CSC_THDSHIPSTATUSCDE =", value, "thdshipstatuscde");
            return (Criteria) this;
        }

        public Criteria andThdshipstatuscdeNotEqualTo(String value) {
            addCriterion("CSC_THDSHIPSTATUSCDE <>", value, "thdshipstatuscde");
            return (Criteria) this;
        }

        public Criteria andThdshipstatuscdeGreaterThan(String value) {
            addCriterion("CSC_THDSHIPSTATUSCDE >", value, "thdshipstatuscde");
            return (Criteria) this;
        }

        public Criteria andThdshipstatuscdeGreaterThanOrEqualTo(String value) {
            addCriterion("CSC_THDSHIPSTATUSCDE >=", value, "thdshipstatuscde");
            return (Criteria) this;
        }

        public Criteria andThdshipstatuscdeLessThan(String value) {
            addCriterion("CSC_THDSHIPSTATUSCDE <", value, "thdshipstatuscde");
            return (Criteria) this;
        }

        public Criteria andThdshipstatuscdeLessThanOrEqualTo(String value) {
            addCriterion("CSC_THDSHIPSTATUSCDE <=", value, "thdshipstatuscde");
            return (Criteria) this;
        }

        public Criteria andThdshipstatuscdeLike(String value) {
            addCriterion("CSC_THDSHIPSTATUSCDE like", value, "thdshipstatuscde");
            return (Criteria) this;
        }

        public Criteria andThdshipstatuscdeNotLike(String value) {
            addCriterion("CSC_THDSHIPSTATUSCDE not like", value, "thdshipstatuscde");
            return (Criteria) this;
        }

        public Criteria andThdshipstatuscdeIn(List<String> values) {
            addCriterion("CSC_THDSHIPSTATUSCDE in", values, "thdshipstatuscde");
            return (Criteria) this;
        }

        public Criteria andThdshipstatuscdeNotIn(List<String> values) {
            addCriterion("CSC_THDSHIPSTATUSCDE not in", values, "thdshipstatuscde");
            return (Criteria) this;
        }

        public Criteria andThdshipstatuscdeBetween(String value1, String value2) {
            addCriterion("CSC_THDSHIPSTATUSCDE between", value1, value2, "thdshipstatuscde");
            return (Criteria) this;
        }

        public Criteria andThdshipstatuscdeNotBetween(String value1, String value2) {
            addCriterion("CSC_THDSHIPSTATUSCDE not between", value1, value2, "thdshipstatuscde");
            return (Criteria) this;
        }

        public Criteria andThddamagedtlIsNull() {
            addCriterion("CSC_THDDAMAGEDTL is null");
            return (Criteria) this;
        }

        public Criteria andThddamagedtlIsNotNull() {
            addCriterion("CSC_THDDAMAGEDTL is not null");
            return (Criteria) this;
        }

        public Criteria andThddamagedtlEqualTo(String value) {
            addCriterion("CSC_THDDAMAGEDTL =", value, "thddamagedtl");
            return (Criteria) this;
        }

        public Criteria andThddamagedtlNotEqualTo(String value) {
            addCriterion("CSC_THDDAMAGEDTL <>", value, "thddamagedtl");
            return (Criteria) this;
        }

        public Criteria andThddamagedtlGreaterThan(String value) {
            addCriterion("CSC_THDDAMAGEDTL >", value, "thddamagedtl");
            return (Criteria) this;
        }

        public Criteria andThddamagedtlGreaterThanOrEqualTo(String value) {
            addCriterion("CSC_THDDAMAGEDTL >=", value, "thddamagedtl");
            return (Criteria) this;
        }

        public Criteria andThddamagedtlLessThan(String value) {
            addCriterion("CSC_THDDAMAGEDTL <", value, "thddamagedtl");
            return (Criteria) this;
        }

        public Criteria andThddamagedtlLessThanOrEqualTo(String value) {
            addCriterion("CSC_THDDAMAGEDTL <=", value, "thddamagedtl");
            return (Criteria) this;
        }

        public Criteria andThddamagedtlLike(String value) {
            addCriterion("CSC_THDDAMAGEDTL like", value, "thddamagedtl");
            return (Criteria) this;
        }

        public Criteria andThddamagedtlNotLike(String value) {
            addCriterion("CSC_THDDAMAGEDTL not like", value, "thddamagedtl");
            return (Criteria) this;
        }

        public Criteria andThddamagedtlIn(List<String> values) {
            addCriterion("CSC_THDDAMAGEDTL in", values, "thddamagedtl");
            return (Criteria) this;
        }

        public Criteria andThddamagedtlNotIn(List<String> values) {
            addCriterion("CSC_THDDAMAGEDTL not in", values, "thddamagedtl");
            return (Criteria) this;
        }

        public Criteria andThddamagedtlBetween(String value1, String value2) {
            addCriterion("CSC_THDDAMAGEDTL between", value1, value2, "thddamagedtl");
            return (Criteria) this;
        }

        public Criteria andThddamagedtlNotBetween(String value1, String value2) {
            addCriterion("CSC_THDDAMAGEDTL not between", value1, value2, "thddamagedtl");
            return (Criteria) this;
        }

        public Criteria andFiletypeIsNull() {
            addCriterion("CSC_FILETYPE is null");
            return (Criteria) this;
        }

        public Criteria andFiletypeIsNotNull() {
            addCriterion("CSC_FILETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andFiletypeEqualTo(String value) {
            addCriterion("CSC_FILETYPE =", value, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeNotEqualTo(String value) {
            addCriterion("CSC_FILETYPE <>", value, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeGreaterThan(String value) {
            addCriterion("CSC_FILETYPE >", value, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeGreaterThanOrEqualTo(String value) {
            addCriterion("CSC_FILETYPE >=", value, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeLessThan(String value) {
            addCriterion("CSC_FILETYPE <", value, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeLessThanOrEqualTo(String value) {
            addCriterion("CSC_FILETYPE <=", value, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeLike(String value) {
            addCriterion("CSC_FILETYPE like", value, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeNotLike(String value) {
            addCriterion("CSC_FILETYPE not like", value, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeIn(List<String> values) {
            addCriterion("CSC_FILETYPE in", values, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeNotIn(List<String> values) {
            addCriterion("CSC_FILETYPE not in", values, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeBetween(String value1, String value2) {
            addCriterion("CSC_FILETYPE between", value1, value2, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeNotBetween(String value1, String value2) {
            addCriterion("CSC_FILETYPE not between", value1, value2, "filetype");
            return (Criteria) this;
        }

        public Criteria andFilepathIsNull() {
            addCriterion("CSC_FILEPATH is null");
            return (Criteria) this;
        }

        public Criteria andFilepathIsNotNull() {
            addCriterion("CSC_FILEPATH is not null");
            return (Criteria) this;
        }

        public Criteria andFilepathEqualTo(String value) {
            addCriterion("CSC_FILEPATH =", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathNotEqualTo(String value) {
            addCriterion("CSC_FILEPATH <>", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathGreaterThan(String value) {
            addCriterion("CSC_FILEPATH >", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathGreaterThanOrEqualTo(String value) {
            addCriterion("CSC_FILEPATH >=", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathLessThan(String value) {
            addCriterion("CSC_FILEPATH <", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathLessThanOrEqualTo(String value) {
            addCriterion("CSC_FILEPATH <=", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathLike(String value) {
            addCriterion("CSC_FILEPATH like", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathNotLike(String value) {
            addCriterion("CSC_FILEPATH not like", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathIn(List<String> values) {
            addCriterion("CSC_FILEPATH in", values, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathNotIn(List<String> values) {
            addCriterion("CSC_FILEPATH not in", values, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathBetween(String value1, String value2) {
            addCriterion("CSC_FILEPATH between", value1, value2, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathNotBetween(String value1, String value2) {
            addCriterion("CSC_FILEPATH not between", value1, value2, "filepath");
            return (Criteria) this;
        }

        public Criteria andAccdntdtlIsNull() {
            addCriterion("CSC_ACCDNTDTL is null");
            return (Criteria) this;
        }

        public Criteria andAccdntdtlIsNotNull() {
            addCriterion("CSC_ACCDNTDTL is not null");
            return (Criteria) this;
        }

        public Criteria andAccdntdtlEqualTo(String value) {
            addCriterion("CSC_ACCDNTDTL =", value, "accdntdtl");
            return (Criteria) this;
        }

        public Criteria andAccdntdtlNotEqualTo(String value) {
            addCriterion("CSC_ACCDNTDTL <>", value, "accdntdtl");
            return (Criteria) this;
        }

        public Criteria andAccdntdtlGreaterThan(String value) {
            addCriterion("CSC_ACCDNTDTL >", value, "accdntdtl");
            return (Criteria) this;
        }

        public Criteria andAccdntdtlGreaterThanOrEqualTo(String value) {
            addCriterion("CSC_ACCDNTDTL >=", value, "accdntdtl");
            return (Criteria) this;
        }

        public Criteria andAccdntdtlLessThan(String value) {
            addCriterion("CSC_ACCDNTDTL <", value, "accdntdtl");
            return (Criteria) this;
        }

        public Criteria andAccdntdtlLessThanOrEqualTo(String value) {
            addCriterion("CSC_ACCDNTDTL <=", value, "accdntdtl");
            return (Criteria) this;
        }

        public Criteria andAccdntdtlLike(String value) {
            addCriterion("CSC_ACCDNTDTL like", value, "accdntdtl");
            return (Criteria) this;
        }

        public Criteria andAccdntdtlNotLike(String value) {
            addCriterion("CSC_ACCDNTDTL not like", value, "accdntdtl");
            return (Criteria) this;
        }

        public Criteria andAccdntdtlIn(List<String> values) {
            addCriterion("CSC_ACCDNTDTL in", values, "accdntdtl");
            return (Criteria) this;
        }

        public Criteria andAccdntdtlNotIn(List<String> values) {
            addCriterion("CSC_ACCDNTDTL not in", values, "accdntdtl");
            return (Criteria) this;
        }

        public Criteria andAccdntdtlBetween(String value1, String value2) {
            addCriterion("CSC_ACCDNTDTL between", value1, value2, "accdntdtl");
            return (Criteria) this;
        }

        public Criteria andAccdntdtlNotBetween(String value1, String value2) {
            addCriterion("CSC_ACCDNTDTL not between", value1, value2, "accdntdtl");
            return (Criteria) this;
        }

        public Criteria andSrvyopnIsNull() {
            addCriterion("CSC_SRVYOPN is null");
            return (Criteria) this;
        }

        public Criteria andSrvyopnIsNotNull() {
            addCriterion("CSC_SRVYOPN is not null");
            return (Criteria) this;
        }

        public Criteria andSrvyopnEqualTo(String value) {
            addCriterion("CSC_SRVYOPN =", value, "srvyopn");
            return (Criteria) this;
        }

        public Criteria andSrvyopnNotEqualTo(String value) {
            addCriterion("CSC_SRVYOPN <>", value, "srvyopn");
            return (Criteria) this;
        }

        public Criteria andSrvyopnGreaterThan(String value) {
            addCriterion("CSC_SRVYOPN >", value, "srvyopn");
            return (Criteria) this;
        }

        public Criteria andSrvyopnGreaterThanOrEqualTo(String value) {
            addCriterion("CSC_SRVYOPN >=", value, "srvyopn");
            return (Criteria) this;
        }

        public Criteria andSrvyopnLessThan(String value) {
            addCriterion("CSC_SRVYOPN <", value, "srvyopn");
            return (Criteria) this;
        }

        public Criteria andSrvyopnLessThanOrEqualTo(String value) {
            addCriterion("CSC_SRVYOPN <=", value, "srvyopn");
            return (Criteria) this;
        }

        public Criteria andSrvyopnLike(String value) {
            addCriterion("CSC_SRVYOPN like", value, "srvyopn");
            return (Criteria) this;
        }

        public Criteria andSrvyopnNotLike(String value) {
            addCriterion("CSC_SRVYOPN not like", value, "srvyopn");
            return (Criteria) this;
        }

        public Criteria andSrvyopnIn(List<String> values) {
            addCriterion("CSC_SRVYOPN in", values, "srvyopn");
            return (Criteria) this;
        }

        public Criteria andSrvyopnNotIn(List<String> values) {
            addCriterion("CSC_SRVYOPN not in", values, "srvyopn");
            return (Criteria) this;
        }

        public Criteria andSrvyopnBetween(String value1, String value2) {
            addCriterion("CSC_SRVYOPN between", value1, value2, "srvyopn");
            return (Criteria) this;
        }

        public Criteria andSrvyopnNotBetween(String value1, String value2) {
            addCriterion("CSC_SRVYOPN not between", value1, value2, "srvyopn");
            return (Criteria) this;
        }

        public Criteria andCclmnoIsNull() {
            addCriterion("CSC_CCLMNO is null");
            return (Criteria) this;
        }

        public Criteria andCclmnoIsNotNull() {
            addCriterion("CSC_CCLMNO is not null");
            return (Criteria) this;
        }

        public Criteria andCclmnoEqualTo(String value) {
            addCriterion("CSC_CCLMNO =", value, "cclmno");
            return (Criteria) this;
        }

        public Criteria andCclmnoNotEqualTo(String value) {
            addCriterion("CSC_CCLMNO <>", value, "cclmno");
            return (Criteria) this;
        }

        public Criteria andCclmnoGreaterThan(String value) {
            addCriterion("CSC_CCLMNO >", value, "cclmno");
            return (Criteria) this;
        }

        public Criteria andCclmnoGreaterThanOrEqualTo(String value) {
            addCriterion("CSC_CCLMNO >=", value, "cclmno");
            return (Criteria) this;
        }

        public Criteria andCclmnoLessThan(String value) {
            addCriterion("CSC_CCLMNO <", value, "cclmno");
            return (Criteria) this;
        }

        public Criteria andCclmnoLessThanOrEqualTo(String value) {
            addCriterion("CSC_CCLMNO <=", value, "cclmno");
            return (Criteria) this;
        }

        public Criteria andCclmnoLike(String value) {
            addCriterion("CSC_CCLMNO like", value, "cclmno");
            return (Criteria) this;
        }

        public Criteria andCclmnoNotLike(String value) {
            addCriterion("CSC_CCLMNO not like", value, "cclmno");
            return (Criteria) this;
        }

        public Criteria andCclmnoIn(List<String> values) {
            addCriterion("CSC_CCLMNO in", values, "cclmno");
            return (Criteria) this;
        }

        public Criteria andCclmnoNotIn(List<String> values) {
            addCriterion("CSC_CCLMNO not in", values, "cclmno");
            return (Criteria) this;
        }

        public Criteria andCclmnoBetween(String value1, String value2) {
            addCriterion("CSC_CCLMNO between", value1, value2, "cclmno");
            return (Criteria) this;
        }

        public Criteria andCclmnoNotBetween(String value1, String value2) {
            addCriterion("CSC_CCLMNO not between", value1, value2, "cclmno");
            return (Criteria) this;
        }

        public Criteria andIdLikeInsensitive(String value) {
            addCriterion("upper(CSC_ID) like", value.toUpperCase(), "id");
            return (Criteria) this;
        }

        public Criteria andShipCodeLikeInsensitive(String value) {
            addCriterion("upper(CSC_SHIP_CODE) like", value.toUpperCase(), "shipCode");
            return (Criteria) this;
        }

        public Criteria andShipNameLikeInsensitive(String value) {
            addCriterion("upper(CSC_SHIP_NAME) like", value.toUpperCase(), "shipName");
            return (Criteria) this;
        }

        public Criteria andClaimFlagLikeInsensitive(String value) {
            addCriterion("upper(CSC_CLAIM_FLAG) like", value.toUpperCase(), "claimFlag");
            return (Criteria) this;
        }

        public Criteria andAccdntspotLikeInsensitive(String value) {
            addCriterion("upper(CSC_ACCDNTSPOT) like", value.toUpperCase(), "accdntspot");
            return (Criteria) this;
        }

        public Criteria andAccdnttmLikeInsensitive(String value) {
            addCriterion("upper(CSC_ACCDNTTM) like", value.toUpperCase(), "accdnttm");
            return (Criteria) this;
        }

        public Criteria andSrvyspotLikeInsensitive(String value) {
            addCriterion("upper(CSC_SRVYSPOT) like", value.toUpperCase(), "srvyspot");
            return (Criteria) this;
        }

        public Criteria andSrvytmLikeInsensitive(String value) {
            addCriterion("upper(CSC_SRVYTM) like", value.toUpperCase(), "srvytm");
            return (Criteria) this;
        }

        public Criteria andAccorgcnmLikeInsensitive(String value) {
            addCriterion("upper(CSC_ACCORGCNM) like", value.toUpperCase(), "accorgcnm");
            return (Criteria) this;
        }

        public Criteria andAccrsncnmLikeInsensitive(String value) {
            addCriterion("upper(CSC_ACCRSNCNM) like", value.toUpperCase(), "accrsncnm");
            return (Criteria) this;
        }

        public Criteria andLostdegreecdeLikeInsensitive(String value) {
            addCriterion("upper(CSC_LOSTDEGREECDE) like", value.toUpperCase(), "lostdegreecde");
            return (Criteria) this;
        }

        public Criteria andDamagedtlLikeInsensitive(String value) {
            addCriterion("upper(CSC_DAMAGEDTL) like", value.toUpperCase(), "damagedtl");
            return (Criteria) this;
        }

        public Criteria andHelpflagLikeInsensitive(String value) {
            addCriterion("upper(CSC_HELPFLAG) like", value.toUpperCase(), "helpflag");
            return (Criteria) this;
        }

        public Criteria andRescuestatecdeLikeInsensitive(String value) {
            addCriterion("upper(CSC_RESCUESTATECDE) like", value.toUpperCase(), "rescuestatecde");
            return (Criteria) this;
        }

        public Criteria andRescuemodecdeLikeInsensitive(String value) {
            addCriterion("upper(CSC_RESCUEMODECDE) like", value.toUpperCase(), "rescuemodecde");
            return (Criteria) this;
        }

        public Criteria andRepaddressLikeInsensitive(String value) {
            addCriterion("upper(CSC_REPADDRESS) like", value.toUpperCase(), "repaddress");
            return (Criteria) this;
        }

        public Criteria andThdshipnameLikeInsensitive(String value) {
            addCriterion("upper(CSC_THDSHIPNAME) like", value.toUpperCase(), "thdshipname");
            return (Criteria) this;
        }

        public Criteria andThdunitLikeInsensitive(String value) {
            addCriterion("upper(CSC_THDUNIT) like", value.toUpperCase(), "thdunit");
            return (Criteria) this;
        }

        public Criteria andThdshipstatuscdeLikeInsensitive(String value) {
            addCriterion("upper(CSC_THDSHIPSTATUSCDE) like", value.toUpperCase(), "thdshipstatuscde");
            return (Criteria) this;
        }

        public Criteria andThddamagedtlLikeInsensitive(String value) {
            addCriterion("upper(CSC_THDDAMAGEDTL) like", value.toUpperCase(), "thddamagedtl");
            return (Criteria) this;
        }

        public Criteria andFiletypeLikeInsensitive(String value) {
            addCriterion("upper(CSC_FILETYPE) like", value.toUpperCase(), "filetype");
            return (Criteria) this;
        }

        public Criteria andFilepathLikeInsensitive(String value) {
            addCriterion("upper(CSC_FILEPATH) like", value.toUpperCase(), "filepath");
            return (Criteria) this;
        }

        public Criteria andAccdntdtlLikeInsensitive(String value) {
            addCriterion("upper(CSC_ACCDNTDTL) like", value.toUpperCase(), "accdntdtl");
            return (Criteria) this;
        }

        public Criteria andSrvyopnLikeInsensitive(String value) {
            addCriterion("upper(CSC_SRVYOPN) like", value.toUpperCase(), "srvyopn");
            return (Criteria) this;
        }

        public Criteria andCclmnoLikeInsensitive(String value) {
            addCriterion("upper(CSC_CCLMNO) like", value.toUpperCase(), "cclmno");
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