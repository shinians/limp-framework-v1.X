package com.chinasofti.domain;

import com.limp.framework.core.bean.Pager;

import java.util.ArrayList;
import java.util.List;

public class ShipRepairExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Pager page;

    public ShipRepairExample() {
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
            addCriterion("CSR_ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("CSR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("CSR_ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("CSR_ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("CSR_ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("CSR_ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("CSR_ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("CSR_ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("CSR_ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("CSR_ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("CSR_ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("CSR_ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("CSR_ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("CSR_ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andShipnameIsNull() {
            addCriterion("CSR_SHIPNAME is null");
            return (Criteria) this;
        }

        public Criteria andShipnameIsNotNull() {
            addCriterion("CSR_SHIPNAME is not null");
            return (Criteria) this;
        }

        public Criteria andShipnameEqualTo(String value) {
            addCriterion("CSR_SHIPNAME =", value, "shipname");
            return (Criteria) this;
        }

        public Criteria andShipnameNotEqualTo(String value) {
            addCriterion("CSR_SHIPNAME <>", value, "shipname");
            return (Criteria) this;
        }

        public Criteria andShipnameGreaterThan(String value) {
            addCriterion("CSR_SHIPNAME >", value, "shipname");
            return (Criteria) this;
        }

        public Criteria andShipnameGreaterThanOrEqualTo(String value) {
            addCriterion("CSR_SHIPNAME >=", value, "shipname");
            return (Criteria) this;
        }

        public Criteria andShipnameLessThan(String value) {
            addCriterion("CSR_SHIPNAME <", value, "shipname");
            return (Criteria) this;
        }

        public Criteria andShipnameLessThanOrEqualTo(String value) {
            addCriterion("CSR_SHIPNAME <=", value, "shipname");
            return (Criteria) this;
        }

        public Criteria andShipnameLike(String value) {
            addCriterion("CSR_SHIPNAME like", value, "shipname");
            return (Criteria) this;
        }

        public Criteria andShipnameNotLike(String value) {
            addCriterion("CSR_SHIPNAME not like", value, "shipname");
            return (Criteria) this;
        }

        public Criteria andShipnameIn(List<String> values) {
            addCriterion("CSR_SHIPNAME in", values, "shipname");
            return (Criteria) this;
        }

        public Criteria andShipnameNotIn(List<String> values) {
            addCriterion("CSR_SHIPNAME not in", values, "shipname");
            return (Criteria) this;
        }

        public Criteria andShipnameBetween(String value1, String value2) {
            addCriterion("CSR_SHIPNAME between", value1, value2, "shipname");
            return (Criteria) this;
        }

        public Criteria andShipnameNotBetween(String value1, String value2) {
            addCriterion("CSR_SHIPNAME not between", value1, value2, "shipname");
            return (Criteria) this;
        }

        public Criteria andShipidIsNull() {
            addCriterion("CSR_SHIPID is null");
            return (Criteria) this;
        }

        public Criteria andShipidIsNotNull() {
            addCriterion("CSR_SHIPID is not null");
            return (Criteria) this;
        }

        public Criteria andShipidEqualTo(String value) {
            addCriterion("CSR_SHIPID =", value, "shipid");
            return (Criteria) this;
        }

        public Criteria andShipidNotEqualTo(String value) {
            addCriterion("CSR_SHIPID <>", value, "shipid");
            return (Criteria) this;
        }

        public Criteria andShipidGreaterThan(String value) {
            addCriterion("CSR_SHIPID >", value, "shipid");
            return (Criteria) this;
        }

        public Criteria andShipidGreaterThanOrEqualTo(String value) {
            addCriterion("CSR_SHIPID >=", value, "shipid");
            return (Criteria) this;
        }

        public Criteria andShipidLessThan(String value) {
            addCriterion("CSR_SHIPID <", value, "shipid");
            return (Criteria) this;
        }

        public Criteria andShipidLessThanOrEqualTo(String value) {
            addCriterion("CSR_SHIPID <=", value, "shipid");
            return (Criteria) this;
        }

        public Criteria andShipidLike(String value) {
            addCriterion("CSR_SHIPID like", value, "shipid");
            return (Criteria) this;
        }

        public Criteria andShipidNotLike(String value) {
            addCriterion("CSR_SHIPID not like", value, "shipid");
            return (Criteria) this;
        }

        public Criteria andShipidIn(List<String> values) {
            addCriterion("CSR_SHIPID in", values, "shipid");
            return (Criteria) this;
        }

        public Criteria andShipidNotIn(List<String> values) {
            addCriterion("CSR_SHIPID not in", values, "shipid");
            return (Criteria) this;
        }

        public Criteria andShipidBetween(String value1, String value2) {
            addCriterion("CSR_SHIPID between", value1, value2, "shipid");
            return (Criteria) this;
        }

        public Criteria andShipidNotBetween(String value1, String value2) {
            addCriterion("CSR_SHIPID not between", value1, value2, "shipid");
            return (Criteria) this;
        }

        public Criteria andReptimeIsNull() {
            addCriterion("CSR_REPTIME is null");
            return (Criteria) this;
        }

        public Criteria andReptimeIsNotNull() {
            addCriterion("CSR_REPTIME is not null");
            return (Criteria) this;
        }

        public Criteria andReptimeEqualTo(String value) {
            addCriterion("CSR_REPTIME =", value, "reptime");
            return (Criteria) this;
        }

        public Criteria andReptimeNotEqualTo(String value) {
            addCriterion("CSR_REPTIME <>", value, "reptime");
            return (Criteria) this;
        }

        public Criteria andReptimeGreaterThan(String value) {
            addCriterion("CSR_REPTIME >", value, "reptime");
            return (Criteria) this;
        }

        public Criteria andReptimeGreaterThanOrEqualTo(String value) {
            addCriterion("CSR_REPTIME >=", value, "reptime");
            return (Criteria) this;
        }

        public Criteria andReptimeLessThan(String value) {
            addCriterion("CSR_REPTIME <", value, "reptime");
            return (Criteria) this;
        }

        public Criteria andReptimeLessThanOrEqualTo(String value) {
            addCriterion("CSR_REPTIME <=", value, "reptime");
            return (Criteria) this;
        }

        public Criteria andReptimeLike(String value) {
            addCriterion("CSR_REPTIME like", value, "reptime");
            return (Criteria) this;
        }

        public Criteria andReptimeNotLike(String value) {
            addCriterion("CSR_REPTIME not like", value, "reptime");
            return (Criteria) this;
        }

        public Criteria andReptimeIn(List<String> values) {
            addCriterion("CSR_REPTIME in", values, "reptime");
            return (Criteria) this;
        }

        public Criteria andReptimeNotIn(List<String> values) {
            addCriterion("CSR_REPTIME not in", values, "reptime");
            return (Criteria) this;
        }

        public Criteria andReptimeBetween(String value1, String value2) {
            addCriterion("CSR_REPTIME between", value1, value2, "reptime");
            return (Criteria) this;
        }

        public Criteria andReptimeNotBetween(String value1, String value2) {
            addCriterion("CSR_REPTIME not between", value1, value2, "reptime");
            return (Criteria) this;
        }

        public Criteria andRepitemsIsNull() {
            addCriterion("CSR_REPITEMS is null");
            return (Criteria) this;
        }

        public Criteria andRepitemsIsNotNull() {
            addCriterion("CSR_REPITEMS is not null");
            return (Criteria) this;
        }

        public Criteria andRepitemsEqualTo(String value) {
            addCriterion("CSR_REPITEMS =", value, "repitems");
            return (Criteria) this;
        }

        public Criteria andRepitemsNotEqualTo(String value) {
            addCriterion("CSR_REPITEMS <>", value, "repitems");
            return (Criteria) this;
        }

        public Criteria andRepitemsGreaterThan(String value) {
            addCriterion("CSR_REPITEMS >", value, "repitems");
            return (Criteria) this;
        }

        public Criteria andRepitemsGreaterThanOrEqualTo(String value) {
            addCriterion("CSR_REPITEMS >=", value, "repitems");
            return (Criteria) this;
        }

        public Criteria andRepitemsLessThan(String value) {
            addCriterion("CSR_REPITEMS <", value, "repitems");
            return (Criteria) this;
        }

        public Criteria andRepitemsLessThanOrEqualTo(String value) {
            addCriterion("CSR_REPITEMS <=", value, "repitems");
            return (Criteria) this;
        }

        public Criteria andRepitemsLike(String value) {
            addCriterion("CSR_REPITEMS like", value, "repitems");
            return (Criteria) this;
        }

        public Criteria andRepitemsNotLike(String value) {
            addCriterion("CSR_REPITEMS not like", value, "repitems");
            return (Criteria) this;
        }

        public Criteria andRepitemsIn(List<String> values) {
            addCriterion("CSR_REPITEMS in", values, "repitems");
            return (Criteria) this;
        }

        public Criteria andRepitemsNotIn(List<String> values) {
            addCriterion("CSR_REPITEMS not in", values, "repitems");
            return (Criteria) this;
        }

        public Criteria andRepitemsBetween(String value1, String value2) {
            addCriterion("CSR_REPITEMS between", value1, value2, "repitems");
            return (Criteria) this;
        }

        public Criteria andRepitemsNotBetween(String value1, String value2) {
            addCriterion("CSR_REPITEMS not between", value1, value2, "repitems");
            return (Criteria) this;
        }

        public Criteria andRepreasonIsNull() {
            addCriterion("CSR_REPREASON is null");
            return (Criteria) this;
        }

        public Criteria andRepreasonIsNotNull() {
            addCriterion("CSR_REPREASON is not null");
            return (Criteria) this;
        }

        public Criteria andRepreasonEqualTo(String value) {
            addCriterion("CSR_REPREASON =", value, "repreason");
            return (Criteria) this;
        }

        public Criteria andRepreasonNotEqualTo(String value) {
            addCriterion("CSR_REPREASON <>", value, "repreason");
            return (Criteria) this;
        }

        public Criteria andRepreasonGreaterThan(String value) {
            addCriterion("CSR_REPREASON >", value, "repreason");
            return (Criteria) this;
        }

        public Criteria andRepreasonGreaterThanOrEqualTo(String value) {
            addCriterion("CSR_REPREASON >=", value, "repreason");
            return (Criteria) this;
        }

        public Criteria andRepreasonLessThan(String value) {
            addCriterion("CSR_REPREASON <", value, "repreason");
            return (Criteria) this;
        }

        public Criteria andRepreasonLessThanOrEqualTo(String value) {
            addCriterion("CSR_REPREASON <=", value, "repreason");
            return (Criteria) this;
        }

        public Criteria andRepreasonLike(String value) {
            addCriterion("CSR_REPREASON like", value, "repreason");
            return (Criteria) this;
        }

        public Criteria andRepreasonNotLike(String value) {
            addCriterion("CSR_REPREASON not like", value, "repreason");
            return (Criteria) this;
        }

        public Criteria andRepreasonIn(List<String> values) {
            addCriterion("CSR_REPREASON in", values, "repreason");
            return (Criteria) this;
        }

        public Criteria andRepreasonNotIn(List<String> values) {
            addCriterion("CSR_REPREASON not in", values, "repreason");
            return (Criteria) this;
        }

        public Criteria andRepreasonBetween(String value1, String value2) {
            addCriterion("CSR_REPREASON between", value1, value2, "repreason");
            return (Criteria) this;
        }

        public Criteria andRepreasonNotBetween(String value1, String value2) {
            addCriterion("CSR_REPREASON not between", value1, value2, "repreason");
            return (Criteria) this;
        }

        public Criteria andRepcontentIsNull() {
            addCriterion("CSR_REPCONTENT is null");
            return (Criteria) this;
        }

        public Criteria andRepcontentIsNotNull() {
            addCriterion("CSR_REPCONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andRepcontentEqualTo(String value) {
            addCriterion("CSR_REPCONTENT =", value, "repcontent");
            return (Criteria) this;
        }

        public Criteria andRepcontentNotEqualTo(String value) {
            addCriterion("CSR_REPCONTENT <>", value, "repcontent");
            return (Criteria) this;
        }

        public Criteria andRepcontentGreaterThan(String value) {
            addCriterion("CSR_REPCONTENT >", value, "repcontent");
            return (Criteria) this;
        }

        public Criteria andRepcontentGreaterThanOrEqualTo(String value) {
            addCriterion("CSR_REPCONTENT >=", value, "repcontent");
            return (Criteria) this;
        }

        public Criteria andRepcontentLessThan(String value) {
            addCriterion("CSR_REPCONTENT <", value, "repcontent");
            return (Criteria) this;
        }

        public Criteria andRepcontentLessThanOrEqualTo(String value) {
            addCriterion("CSR_REPCONTENT <=", value, "repcontent");
            return (Criteria) this;
        }

        public Criteria andRepcontentLike(String value) {
            addCriterion("CSR_REPCONTENT like", value, "repcontent");
            return (Criteria) this;
        }

        public Criteria andRepcontentNotLike(String value) {
            addCriterion("CSR_REPCONTENT not like", value, "repcontent");
            return (Criteria) this;
        }

        public Criteria andRepcontentIn(List<String> values) {
            addCriterion("CSR_REPCONTENT in", values, "repcontent");
            return (Criteria) this;
        }

        public Criteria andRepcontentNotIn(List<String> values) {
            addCriterion("CSR_REPCONTENT not in", values, "repcontent");
            return (Criteria) this;
        }

        public Criteria andRepcontentBetween(String value1, String value2) {
            addCriterion("CSR_REPCONTENT between", value1, value2, "repcontent");
            return (Criteria) this;
        }

        public Criteria andRepcontentNotBetween(String value1, String value2) {
            addCriterion("CSR_REPCONTENT not between", value1, value2, "repcontent");
            return (Criteria) this;
        }

        public Criteria andReppersonIsNull() {
            addCriterion("CSR_REPPERSON is null");
            return (Criteria) this;
        }

        public Criteria andReppersonIsNotNull() {
            addCriterion("CSR_REPPERSON is not null");
            return (Criteria) this;
        }

        public Criteria andReppersonEqualTo(String value) {
            addCriterion("CSR_REPPERSON =", value, "repperson");
            return (Criteria) this;
        }

        public Criteria andReppersonNotEqualTo(String value) {
            addCriterion("CSR_REPPERSON <>", value, "repperson");
            return (Criteria) this;
        }

        public Criteria andReppersonGreaterThan(String value) {
            addCriterion("CSR_REPPERSON >", value, "repperson");
            return (Criteria) this;
        }

        public Criteria andReppersonGreaterThanOrEqualTo(String value) {
            addCriterion("CSR_REPPERSON >=", value, "repperson");
            return (Criteria) this;
        }

        public Criteria andReppersonLessThan(String value) {
            addCriterion("CSR_REPPERSON <", value, "repperson");
            return (Criteria) this;
        }

        public Criteria andReppersonLessThanOrEqualTo(String value) {
            addCriterion("CSR_REPPERSON <=", value, "repperson");
            return (Criteria) this;
        }

        public Criteria andReppersonLike(String value) {
            addCriterion("CSR_REPPERSON like", value, "repperson");
            return (Criteria) this;
        }

        public Criteria andReppersonNotLike(String value) {
            addCriterion("CSR_REPPERSON not like", value, "repperson");
            return (Criteria) this;
        }

        public Criteria andReppersonIn(List<String> values) {
            addCriterion("CSR_REPPERSON in", values, "repperson");
            return (Criteria) this;
        }

        public Criteria andReppersonNotIn(List<String> values) {
            addCriterion("CSR_REPPERSON not in", values, "repperson");
            return (Criteria) this;
        }

        public Criteria andReppersonBetween(String value1, String value2) {
            addCriterion("CSR_REPPERSON between", value1, value2, "repperson");
            return (Criteria) this;
        }

        public Criteria andReppersonNotBetween(String value1, String value2) {
            addCriterion("CSR_REPPERSON not between", value1, value2, "repperson");
            return (Criteria) this;
        }

        public Criteria andRepunitIsNull() {
            addCriterion("CSR_REPUNIT is null");
            return (Criteria) this;
        }

        public Criteria andRepunitIsNotNull() {
            addCriterion("CSR_REPUNIT is not null");
            return (Criteria) this;
        }

        public Criteria andRepunitEqualTo(String value) {
            addCriterion("CSR_REPUNIT =", value, "repunit");
            return (Criteria) this;
        }

        public Criteria andRepunitNotEqualTo(String value) {
            addCriterion("CSR_REPUNIT <>", value, "repunit");
            return (Criteria) this;
        }

        public Criteria andRepunitGreaterThan(String value) {
            addCriterion("CSR_REPUNIT >", value, "repunit");
            return (Criteria) this;
        }

        public Criteria andRepunitGreaterThanOrEqualTo(String value) {
            addCriterion("CSR_REPUNIT >=", value, "repunit");
            return (Criteria) this;
        }

        public Criteria andRepunitLessThan(String value) {
            addCriterion("CSR_REPUNIT <", value, "repunit");
            return (Criteria) this;
        }

        public Criteria andRepunitLessThanOrEqualTo(String value) {
            addCriterion("CSR_REPUNIT <=", value, "repunit");
            return (Criteria) this;
        }

        public Criteria andRepunitLike(String value) {
            addCriterion("CSR_REPUNIT like", value, "repunit");
            return (Criteria) this;
        }

        public Criteria andRepunitNotLike(String value) {
            addCriterion("CSR_REPUNIT not like", value, "repunit");
            return (Criteria) this;
        }

        public Criteria andRepunitIn(List<String> values) {
            addCriterion("CSR_REPUNIT in", values, "repunit");
            return (Criteria) this;
        }

        public Criteria andRepunitNotIn(List<String> values) {
            addCriterion("CSR_REPUNIT not in", values, "repunit");
            return (Criteria) this;
        }

        public Criteria andRepunitBetween(String value1, String value2) {
            addCriterion("CSR_REPUNIT between", value1, value2, "repunit");
            return (Criteria) this;
        }

        public Criteria andRepunitNotBetween(String value1, String value2) {
            addCriterion("CSR_REPUNIT not between", value1, value2, "repunit");
            return (Criteria) this;
        }

        public Criteria andEntidIsNull() {
            addCriterion("CSR_ENTID is null");
            return (Criteria) this;
        }

        public Criteria andEntidIsNotNull() {
            addCriterion("CSR_ENTID is not null");
            return (Criteria) this;
        }

        public Criteria andEntidEqualTo(String value) {
            addCriterion("CSR_ENTID =", value, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidNotEqualTo(String value) {
            addCriterion("CSR_ENTID <>", value, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidGreaterThan(String value) {
            addCriterion("CSR_ENTID >", value, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidGreaterThanOrEqualTo(String value) {
            addCriterion("CSR_ENTID >=", value, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidLessThan(String value) {
            addCriterion("CSR_ENTID <", value, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidLessThanOrEqualTo(String value) {
            addCriterion("CSR_ENTID <=", value, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidLike(String value) {
            addCriterion("CSR_ENTID like", value, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidNotLike(String value) {
            addCriterion("CSR_ENTID not like", value, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidIn(List<String> values) {
            addCriterion("CSR_ENTID in", values, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidNotIn(List<String> values) {
            addCriterion("CSR_ENTID not in", values, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidBetween(String value1, String value2) {
            addCriterion("CSR_ENTID between", value1, value2, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidNotBetween(String value1, String value2) {
            addCriterion("CSR_ENTID not between", value1, value2, "entid");
            return (Criteria) this;
        }

        public Criteria andEntnameIsNull() {
            addCriterion("CSR_ENTNAME is null");
            return (Criteria) this;
        }

        public Criteria andEntnameIsNotNull() {
            addCriterion("CSR_ENTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andEntnameEqualTo(String value) {
            addCriterion("CSR_ENTNAME =", value, "entname");
            return (Criteria) this;
        }

        public Criteria andEntnameNotEqualTo(String value) {
            addCriterion("CSR_ENTNAME <>", value, "entname");
            return (Criteria) this;
        }

        public Criteria andEntnameGreaterThan(String value) {
            addCriterion("CSR_ENTNAME >", value, "entname");
            return (Criteria) this;
        }

        public Criteria andEntnameGreaterThanOrEqualTo(String value) {
            addCriterion("CSR_ENTNAME >=", value, "entname");
            return (Criteria) this;
        }

        public Criteria andEntnameLessThan(String value) {
            addCriterion("CSR_ENTNAME <", value, "entname");
            return (Criteria) this;
        }

        public Criteria andEntnameLessThanOrEqualTo(String value) {
            addCriterion("CSR_ENTNAME <=", value, "entname");
            return (Criteria) this;
        }

        public Criteria andEntnameLike(String value) {
            addCriterion("CSR_ENTNAME like", value, "entname");
            return (Criteria) this;
        }

        public Criteria andEntnameNotLike(String value) {
            addCriterion("CSR_ENTNAME not like", value, "entname");
            return (Criteria) this;
        }

        public Criteria andEntnameIn(List<String> values) {
            addCriterion("CSR_ENTNAME in", values, "entname");
            return (Criteria) this;
        }

        public Criteria andEntnameNotIn(List<String> values) {
            addCriterion("CSR_ENTNAME not in", values, "entname");
            return (Criteria) this;
        }

        public Criteria andEntnameBetween(String value1, String value2) {
            addCriterion("CSR_ENTNAME between", value1, value2, "entname");
            return (Criteria) this;
        }

        public Criteria andEntnameNotBetween(String value1, String value2) {
            addCriterion("CSR_ENTNAME not between", value1, value2, "entname");
            return (Criteria) this;
        }

        public Criteria andIdLikeInsensitive(String value) {
            addCriterion("upper(CSR_ID) like", value.toUpperCase(), "id");
            return (Criteria) this;
        }

        public Criteria andShipnameLikeInsensitive(String value) {
            addCriterion("upper(CSR_SHIPNAME) like", value.toUpperCase(), "shipname");
            return (Criteria) this;
        }

        public Criteria andShipidLikeInsensitive(String value) {
            addCriterion("upper(CSR_SHIPID) like", value.toUpperCase(), "shipid");
            return (Criteria) this;
        }

        public Criteria andReptimeLikeInsensitive(String value) {
            addCriterion("upper(CSR_REPTIME) like", value.toUpperCase(), "reptime");
            return (Criteria) this;
        }

        public Criteria andRepitemsLikeInsensitive(String value) {
            addCriterion("upper(CSR_REPITEMS) like", value.toUpperCase(), "repitems");
            return (Criteria) this;
        }

        public Criteria andRepreasonLikeInsensitive(String value) {
            addCriterion("upper(CSR_REPREASON) like", value.toUpperCase(), "repreason");
            return (Criteria) this;
        }

        public Criteria andRepcontentLikeInsensitive(String value) {
            addCriterion("upper(CSR_REPCONTENT) like", value.toUpperCase(), "repcontent");
            return (Criteria) this;
        }

        public Criteria andReppersonLikeInsensitive(String value) {
            addCriterion("upper(CSR_REPPERSON) like", value.toUpperCase(), "repperson");
            return (Criteria) this;
        }

        public Criteria andRepunitLikeInsensitive(String value) {
            addCriterion("upper(CSR_REPUNIT) like", value.toUpperCase(), "repunit");
            return (Criteria) this;
        }

        public Criteria andEntidLikeInsensitive(String value) {
            addCriterion("upper(CSR_ENTID) like", value.toUpperCase(), "entid");
            return (Criteria) this;
        }

        public Criteria andEntnameLikeInsensitive(String value) {
            addCriterion("upper(CSR_ENTNAME) like", value.toUpperCase(), "entname");
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