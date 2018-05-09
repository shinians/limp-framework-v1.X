package com.chinasofti.domain;

import com.limp.framework.core.bean.Pager;

import java.util.ArrayList;
import java.util.List;

public class EntInfoExtRepairBuildExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Pager page;

    public EntInfoExtRepairBuildExample() {
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
            addCriterion("CEQ_ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("CEQ_ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("CEQ_ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("CEQ_ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("CEQ_ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("CEQ_ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("CEQ_ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("CEQ_ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("CEQ_ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("CEQ_ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("CEQ_ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("CEQ_ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("CEQ_ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("CEQ_ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andPostalcodeIsNull() {
            addCriterion("CEQ_POSTALCODE is null");
            return (Criteria) this;
        }

        public Criteria andPostalcodeIsNotNull() {
            addCriterion("CEQ_POSTALCODE is not null");
            return (Criteria) this;
        }

        public Criteria andPostalcodeEqualTo(String value) {
            addCriterion("CEQ_POSTALCODE =", value, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeNotEqualTo(String value) {
            addCriterion("CEQ_POSTALCODE <>", value, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeGreaterThan(String value) {
            addCriterion("CEQ_POSTALCODE >", value, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeGreaterThanOrEqualTo(String value) {
            addCriterion("CEQ_POSTALCODE >=", value, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeLessThan(String value) {
            addCriterion("CEQ_POSTALCODE <", value, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeLessThanOrEqualTo(String value) {
            addCriterion("CEQ_POSTALCODE <=", value, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeLike(String value) {
            addCriterion("CEQ_POSTALCODE like", value, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeNotLike(String value) {
            addCriterion("CEQ_POSTALCODE not like", value, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeIn(List<String> values) {
            addCriterion("CEQ_POSTALCODE in", values, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeNotIn(List<String> values) {
            addCriterion("CEQ_POSTALCODE not in", values, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeBetween(String value1, String value2) {
            addCriterion("CEQ_POSTALCODE between", value1, value2, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeNotBetween(String value1, String value2) {
            addCriterion("CEQ_POSTALCODE not between", value1, value2, "postalcode");
            return (Criteria) this;
        }

        public Criteria andRegcapitalIsNull() {
            addCriterion("CEQ_REGCAPITAL is null");
            return (Criteria) this;
        }

        public Criteria andRegcapitalIsNotNull() {
            addCriterion("CEQ_REGCAPITAL is not null");
            return (Criteria) this;
        }

        public Criteria andRegcapitalEqualTo(String value) {
            addCriterion("CEQ_REGCAPITAL =", value, "regcapital");
            return (Criteria) this;
        }

        public Criteria andRegcapitalNotEqualTo(String value) {
            addCriterion("CEQ_REGCAPITAL <>", value, "regcapital");
            return (Criteria) this;
        }

        public Criteria andRegcapitalGreaterThan(String value) {
            addCriterion("CEQ_REGCAPITAL >", value, "regcapital");
            return (Criteria) this;
        }

        public Criteria andRegcapitalGreaterThanOrEqualTo(String value) {
            addCriterion("CEQ_REGCAPITAL >=", value, "regcapital");
            return (Criteria) this;
        }

        public Criteria andRegcapitalLessThan(String value) {
            addCriterion("CEQ_REGCAPITAL <", value, "regcapital");
            return (Criteria) this;
        }

        public Criteria andRegcapitalLessThanOrEqualTo(String value) {
            addCriterion("CEQ_REGCAPITAL <=", value, "regcapital");
            return (Criteria) this;
        }

        public Criteria andRegcapitalLike(String value) {
            addCriterion("CEQ_REGCAPITAL like", value, "regcapital");
            return (Criteria) this;
        }

        public Criteria andRegcapitalNotLike(String value) {
            addCriterion("CEQ_REGCAPITAL not like", value, "regcapital");
            return (Criteria) this;
        }

        public Criteria andRegcapitalIn(List<String> values) {
            addCriterion("CEQ_REGCAPITAL in", values, "regcapital");
            return (Criteria) this;
        }

        public Criteria andRegcapitalNotIn(List<String> values) {
            addCriterion("CEQ_REGCAPITAL not in", values, "regcapital");
            return (Criteria) this;
        }

        public Criteria andRegcapitalBetween(String value1, String value2) {
            addCriterion("CEQ_REGCAPITAL between", value1, value2, "regcapital");
            return (Criteria) this;
        }

        public Criteria andRegcapitalNotBetween(String value1, String value2) {
            addCriterion("CEQ_REGCAPITAL not between", value1, value2, "regcapital");
            return (Criteria) this;
        }

        public Criteria andAreaspaceIsNull() {
            addCriterion("CEQ_AREASPACE is null");
            return (Criteria) this;
        }

        public Criteria andAreaspaceIsNotNull() {
            addCriterion("CEQ_AREASPACE is not null");
            return (Criteria) this;
        }

        public Criteria andAreaspaceEqualTo(String value) {
            addCriterion("CEQ_AREASPACE =", value, "areaspace");
            return (Criteria) this;
        }

        public Criteria andAreaspaceNotEqualTo(String value) {
            addCriterion("CEQ_AREASPACE <>", value, "areaspace");
            return (Criteria) this;
        }

        public Criteria andAreaspaceGreaterThan(String value) {
            addCriterion("CEQ_AREASPACE >", value, "areaspace");
            return (Criteria) this;
        }

        public Criteria andAreaspaceGreaterThanOrEqualTo(String value) {
            addCriterion("CEQ_AREASPACE >=", value, "areaspace");
            return (Criteria) this;
        }

        public Criteria andAreaspaceLessThan(String value) {
            addCriterion("CEQ_AREASPACE <", value, "areaspace");
            return (Criteria) this;
        }

        public Criteria andAreaspaceLessThanOrEqualTo(String value) {
            addCriterion("CEQ_AREASPACE <=", value, "areaspace");
            return (Criteria) this;
        }

        public Criteria andAreaspaceLike(String value) {
            addCriterion("CEQ_AREASPACE like", value, "areaspace");
            return (Criteria) this;
        }

        public Criteria andAreaspaceNotLike(String value) {
            addCriterion("CEQ_AREASPACE not like", value, "areaspace");
            return (Criteria) this;
        }

        public Criteria andAreaspaceIn(List<String> values) {
            addCriterion("CEQ_AREASPACE in", values, "areaspace");
            return (Criteria) this;
        }

        public Criteria andAreaspaceNotIn(List<String> values) {
            addCriterion("CEQ_AREASPACE not in", values, "areaspace");
            return (Criteria) this;
        }

        public Criteria andAreaspaceBetween(String value1, String value2) {
            addCriterion("CEQ_AREASPACE between", value1, value2, "areaspace");
            return (Criteria) this;
        }

        public Criteria andAreaspaceNotBetween(String value1, String value2) {
            addCriterion("CEQ_AREASPACE not between", value1, value2, "areaspace");
            return (Criteria) this;
        }

        public Criteria andCoastlineIsNull() {
            addCriterion("CEQ_COASTLINE is null");
            return (Criteria) this;
        }

        public Criteria andCoastlineIsNotNull() {
            addCriterion("CEQ_COASTLINE is not null");
            return (Criteria) this;
        }

        public Criteria andCoastlineEqualTo(String value) {
            addCriterion("CEQ_COASTLINE =", value, "coastline");
            return (Criteria) this;
        }

        public Criteria andCoastlineNotEqualTo(String value) {
            addCriterion("CEQ_COASTLINE <>", value, "coastline");
            return (Criteria) this;
        }

        public Criteria andCoastlineGreaterThan(String value) {
            addCriterion("CEQ_COASTLINE >", value, "coastline");
            return (Criteria) this;
        }

        public Criteria andCoastlineGreaterThanOrEqualTo(String value) {
            addCriterion("CEQ_COASTLINE >=", value, "coastline");
            return (Criteria) this;
        }

        public Criteria andCoastlineLessThan(String value) {
            addCriterion("CEQ_COASTLINE <", value, "coastline");
            return (Criteria) this;
        }

        public Criteria andCoastlineLessThanOrEqualTo(String value) {
            addCriterion("CEQ_COASTLINE <=", value, "coastline");
            return (Criteria) this;
        }

        public Criteria andCoastlineLike(String value) {
            addCriterion("CEQ_COASTLINE like", value, "coastline");
            return (Criteria) this;
        }

        public Criteria andCoastlineNotLike(String value) {
            addCriterion("CEQ_COASTLINE not like", value, "coastline");
            return (Criteria) this;
        }

        public Criteria andCoastlineIn(List<String> values) {
            addCriterion("CEQ_COASTLINE in", values, "coastline");
            return (Criteria) this;
        }

        public Criteria andCoastlineNotIn(List<String> values) {
            addCriterion("CEQ_COASTLINE not in", values, "coastline");
            return (Criteria) this;
        }

        public Criteria andCoastlineBetween(String value1, String value2) {
            addCriterion("CEQ_COASTLINE between", value1, value2, "coastline");
            return (Criteria) this;
        }

        public Criteria andCoastlineNotBetween(String value1, String value2) {
            addCriterion("CEQ_COASTLINE not between", value1, value2, "coastline");
            return (Criteria) this;
        }

        public Criteria andWorkshopareaIsNull() {
            addCriterion("CEQ_WORKSHOPAREA is null");
            return (Criteria) this;
        }

        public Criteria andWorkshopareaIsNotNull() {
            addCriterion("CEQ_WORKSHOPAREA is not null");
            return (Criteria) this;
        }

        public Criteria andWorkshopareaEqualTo(String value) {
            addCriterion("CEQ_WORKSHOPAREA =", value, "workshoparea");
            return (Criteria) this;
        }

        public Criteria andWorkshopareaNotEqualTo(String value) {
            addCriterion("CEQ_WORKSHOPAREA <>", value, "workshoparea");
            return (Criteria) this;
        }

        public Criteria andWorkshopareaGreaterThan(String value) {
            addCriterion("CEQ_WORKSHOPAREA >", value, "workshoparea");
            return (Criteria) this;
        }

        public Criteria andWorkshopareaGreaterThanOrEqualTo(String value) {
            addCriterion("CEQ_WORKSHOPAREA >=", value, "workshoparea");
            return (Criteria) this;
        }

        public Criteria andWorkshopareaLessThan(String value) {
            addCriterion("CEQ_WORKSHOPAREA <", value, "workshoparea");
            return (Criteria) this;
        }

        public Criteria andWorkshopareaLessThanOrEqualTo(String value) {
            addCriterion("CEQ_WORKSHOPAREA <=", value, "workshoparea");
            return (Criteria) this;
        }

        public Criteria andWorkshopareaLike(String value) {
            addCriterion("CEQ_WORKSHOPAREA like", value, "workshoparea");
            return (Criteria) this;
        }

        public Criteria andWorkshopareaNotLike(String value) {
            addCriterion("CEQ_WORKSHOPAREA not like", value, "workshoparea");
            return (Criteria) this;
        }

        public Criteria andWorkshopareaIn(List<String> values) {
            addCriterion("CEQ_WORKSHOPAREA in", values, "workshoparea");
            return (Criteria) this;
        }

        public Criteria andWorkshopareaNotIn(List<String> values) {
            addCriterion("CEQ_WORKSHOPAREA not in", values, "workshoparea");
            return (Criteria) this;
        }

        public Criteria andWorkshopareaBetween(String value1, String value2) {
            addCriterion("CEQ_WORKSHOPAREA between", value1, value2, "workshoparea");
            return (Criteria) this;
        }

        public Criteria andWorkshopareaNotBetween(String value1, String value2) {
            addCriterion("CEQ_WORKSHOPAREA not between", value1, value2, "workshoparea");
            return (Criteria) this;
        }

        public Criteria andWorkersnumIsNull() {
            addCriterion("CEQ_WORKERSNUM is null");
            return (Criteria) this;
        }

        public Criteria andWorkersnumIsNotNull() {
            addCriterion("CEQ_WORKERSNUM is not null");
            return (Criteria) this;
        }

        public Criteria andWorkersnumEqualTo(String value) {
            addCriterion("CEQ_WORKERSNUM =", value, "workersnum");
            return (Criteria) this;
        }

        public Criteria andWorkersnumNotEqualTo(String value) {
            addCriterion("CEQ_WORKERSNUM <>", value, "workersnum");
            return (Criteria) this;
        }

        public Criteria andWorkersnumGreaterThan(String value) {
            addCriterion("CEQ_WORKERSNUM >", value, "workersnum");
            return (Criteria) this;
        }

        public Criteria andWorkersnumGreaterThanOrEqualTo(String value) {
            addCriterion("CEQ_WORKERSNUM >=", value, "workersnum");
            return (Criteria) this;
        }

        public Criteria andWorkersnumLessThan(String value) {
            addCriterion("CEQ_WORKERSNUM <", value, "workersnum");
            return (Criteria) this;
        }

        public Criteria andWorkersnumLessThanOrEqualTo(String value) {
            addCriterion("CEQ_WORKERSNUM <=", value, "workersnum");
            return (Criteria) this;
        }

        public Criteria andWorkersnumLike(String value) {
            addCriterion("CEQ_WORKERSNUM like", value, "workersnum");
            return (Criteria) this;
        }

        public Criteria andWorkersnumNotLike(String value) {
            addCriterion("CEQ_WORKERSNUM not like", value, "workersnum");
            return (Criteria) this;
        }

        public Criteria andWorkersnumIn(List<String> values) {
            addCriterion("CEQ_WORKERSNUM in", values, "workersnum");
            return (Criteria) this;
        }

        public Criteria andWorkersnumNotIn(List<String> values) {
            addCriterion("CEQ_WORKERSNUM not in", values, "workersnum");
            return (Criteria) this;
        }

        public Criteria andWorkersnumBetween(String value1, String value2) {
            addCriterion("CEQ_WORKERSNUM between", value1, value2, "workersnum");
            return (Criteria) this;
        }

        public Criteria andWorkersnumNotBetween(String value1, String value2) {
            addCriterion("CEQ_WORKERSNUM not between", value1, value2, "workersnum");
            return (Criteria) this;
        }

        public Criteria andProfworkersnumIsNull() {
            addCriterion("CEQ_PROFWORKERSNUM is null");
            return (Criteria) this;
        }

        public Criteria andProfworkersnumIsNotNull() {
            addCriterion("CEQ_PROFWORKERSNUM is not null");
            return (Criteria) this;
        }

        public Criteria andProfworkersnumEqualTo(String value) {
            addCriterion("CEQ_PROFWORKERSNUM =", value, "profworkersnum");
            return (Criteria) this;
        }

        public Criteria andProfworkersnumNotEqualTo(String value) {
            addCriterion("CEQ_PROFWORKERSNUM <>", value, "profworkersnum");
            return (Criteria) this;
        }

        public Criteria andProfworkersnumGreaterThan(String value) {
            addCriterion("CEQ_PROFWORKERSNUM >", value, "profworkersnum");
            return (Criteria) this;
        }

        public Criteria andProfworkersnumGreaterThanOrEqualTo(String value) {
            addCriterion("CEQ_PROFWORKERSNUM >=", value, "profworkersnum");
            return (Criteria) this;
        }

        public Criteria andProfworkersnumLessThan(String value) {
            addCriterion("CEQ_PROFWORKERSNUM <", value, "profworkersnum");
            return (Criteria) this;
        }

        public Criteria andProfworkersnumLessThanOrEqualTo(String value) {
            addCriterion("CEQ_PROFWORKERSNUM <=", value, "profworkersnum");
            return (Criteria) this;
        }

        public Criteria andProfworkersnumLike(String value) {
            addCriterion("CEQ_PROFWORKERSNUM like", value, "profworkersnum");
            return (Criteria) this;
        }

        public Criteria andProfworkersnumNotLike(String value) {
            addCriterion("CEQ_PROFWORKERSNUM not like", value, "profworkersnum");
            return (Criteria) this;
        }

        public Criteria andProfworkersnumIn(List<String> values) {
            addCriterion("CEQ_PROFWORKERSNUM in", values, "profworkersnum");
            return (Criteria) this;
        }

        public Criteria andProfworkersnumNotIn(List<String> values) {
            addCriterion("CEQ_PROFWORKERSNUM not in", values, "profworkersnum");
            return (Criteria) this;
        }

        public Criteria andProfworkersnumBetween(String value1, String value2) {
            addCriterion("CEQ_PROFWORKERSNUM between", value1, value2, "profworkersnum");
            return (Criteria) this;
        }

        public Criteria andProfworkersnumNotBetween(String value1, String value2) {
            addCriterion("CEQ_PROFWORKERSNUM not between", value1, value2, "profworkersnum");
            return (Criteria) this;
        }

        public Criteria andWeldworkernumIsNull() {
            addCriterion("CEQ_WELDWORKERNUM is null");
            return (Criteria) this;
        }

        public Criteria andWeldworkernumIsNotNull() {
            addCriterion("CEQ_WELDWORKERNUM is not null");
            return (Criteria) this;
        }

        public Criteria andWeldworkernumEqualTo(String value) {
            addCriterion("CEQ_WELDWORKERNUM =", value, "weldworkernum");
            return (Criteria) this;
        }

        public Criteria andWeldworkernumNotEqualTo(String value) {
            addCriterion("CEQ_WELDWORKERNUM <>", value, "weldworkernum");
            return (Criteria) this;
        }

        public Criteria andWeldworkernumGreaterThan(String value) {
            addCriterion("CEQ_WELDWORKERNUM >", value, "weldworkernum");
            return (Criteria) this;
        }

        public Criteria andWeldworkernumGreaterThanOrEqualTo(String value) {
            addCriterion("CEQ_WELDWORKERNUM >=", value, "weldworkernum");
            return (Criteria) this;
        }

        public Criteria andWeldworkernumLessThan(String value) {
            addCriterion("CEQ_WELDWORKERNUM <", value, "weldworkernum");
            return (Criteria) this;
        }

        public Criteria andWeldworkernumLessThanOrEqualTo(String value) {
            addCriterion("CEQ_WELDWORKERNUM <=", value, "weldworkernum");
            return (Criteria) this;
        }

        public Criteria andWeldworkernumLike(String value) {
            addCriterion("CEQ_WELDWORKERNUM like", value, "weldworkernum");
            return (Criteria) this;
        }

        public Criteria andWeldworkernumNotLike(String value) {
            addCriterion("CEQ_WELDWORKERNUM not like", value, "weldworkernum");
            return (Criteria) this;
        }

        public Criteria andWeldworkernumIn(List<String> values) {
            addCriterion("CEQ_WELDWORKERNUM in", values, "weldworkernum");
            return (Criteria) this;
        }

        public Criteria andWeldworkernumNotIn(List<String> values) {
            addCriterion("CEQ_WELDWORKERNUM not in", values, "weldworkernum");
            return (Criteria) this;
        }

        public Criteria andWeldworkernumBetween(String value1, String value2) {
            addCriterion("CEQ_WELDWORKERNUM between", value1, value2, "weldworkernum");
            return (Criteria) this;
        }

        public Criteria andWeldworkernumNotBetween(String value1, String value2) {
            addCriterion("CEQ_WELDWORKERNUM not between", value1, value2, "weldworkernum");
            return (Criteria) this;
        }

        public Criteria andCarpentrynumIsNull() {
            addCriterion("CEQ_CARPENTRYNUM is null");
            return (Criteria) this;
        }

        public Criteria andCarpentrynumIsNotNull() {
            addCriterion("CEQ_CARPENTRYNUM is not null");
            return (Criteria) this;
        }

        public Criteria andCarpentrynumEqualTo(String value) {
            addCriterion("CEQ_CARPENTRYNUM =", value, "carpentrynum");
            return (Criteria) this;
        }

        public Criteria andCarpentrynumNotEqualTo(String value) {
            addCriterion("CEQ_CARPENTRYNUM <>", value, "carpentrynum");
            return (Criteria) this;
        }

        public Criteria andCarpentrynumGreaterThan(String value) {
            addCriterion("CEQ_CARPENTRYNUM >", value, "carpentrynum");
            return (Criteria) this;
        }

        public Criteria andCarpentrynumGreaterThanOrEqualTo(String value) {
            addCriterion("CEQ_CARPENTRYNUM >=", value, "carpentrynum");
            return (Criteria) this;
        }

        public Criteria andCarpentrynumLessThan(String value) {
            addCriterion("CEQ_CARPENTRYNUM <", value, "carpentrynum");
            return (Criteria) this;
        }

        public Criteria andCarpentrynumLessThanOrEqualTo(String value) {
            addCriterion("CEQ_CARPENTRYNUM <=", value, "carpentrynum");
            return (Criteria) this;
        }

        public Criteria andCarpentrynumLike(String value) {
            addCriterion("CEQ_CARPENTRYNUM like", value, "carpentrynum");
            return (Criteria) this;
        }

        public Criteria andCarpentrynumNotLike(String value) {
            addCriterion("CEQ_CARPENTRYNUM not like", value, "carpentrynum");
            return (Criteria) this;
        }

        public Criteria andCarpentrynumIn(List<String> values) {
            addCriterion("CEQ_CARPENTRYNUM in", values, "carpentrynum");
            return (Criteria) this;
        }

        public Criteria andCarpentrynumNotIn(List<String> values) {
            addCriterion("CEQ_CARPENTRYNUM not in", values, "carpentrynum");
            return (Criteria) this;
        }

        public Criteria andCarpentrynumBetween(String value1, String value2) {
            addCriterion("CEQ_CARPENTRYNUM between", value1, value2, "carpentrynum");
            return (Criteria) this;
        }

        public Criteria andCarpentrynumNotBetween(String value1, String value2) {
            addCriterion("CEQ_CARPENTRYNUM not between", value1, value2, "carpentrynum");
            return (Criteria) this;
        }

        public Criteria andCzngnumIsNull() {
            addCriterion("CEQ_CZNGNUM is null");
            return (Criteria) this;
        }

        public Criteria andCzngnumIsNotNull() {
            addCriterion("CEQ_CZNGNUM is not null");
            return (Criteria) this;
        }

        public Criteria andCzngnumEqualTo(String value) {
            addCriterion("CEQ_CZNGNUM =", value, "czngnum");
            return (Criteria) this;
        }

        public Criteria andCzngnumNotEqualTo(String value) {
            addCriterion("CEQ_CZNGNUM <>", value, "czngnum");
            return (Criteria) this;
        }

        public Criteria andCzngnumGreaterThan(String value) {
            addCriterion("CEQ_CZNGNUM >", value, "czngnum");
            return (Criteria) this;
        }

        public Criteria andCzngnumGreaterThanOrEqualTo(String value) {
            addCriterion("CEQ_CZNGNUM >=", value, "czngnum");
            return (Criteria) this;
        }

        public Criteria andCzngnumLessThan(String value) {
            addCriterion("CEQ_CZNGNUM <", value, "czngnum");
            return (Criteria) this;
        }

        public Criteria andCzngnumLessThanOrEqualTo(String value) {
            addCriterion("CEQ_CZNGNUM <=", value, "czngnum");
            return (Criteria) this;
        }

        public Criteria andCzngnumLike(String value) {
            addCriterion("CEQ_CZNGNUM like", value, "czngnum");
            return (Criteria) this;
        }

        public Criteria andCzngnumNotLike(String value) {
            addCriterion("CEQ_CZNGNUM not like", value, "czngnum");
            return (Criteria) this;
        }

        public Criteria andCzngnumIn(List<String> values) {
            addCriterion("CEQ_CZNGNUM in", values, "czngnum");
            return (Criteria) this;
        }

        public Criteria andCzngnumNotIn(List<String> values) {
            addCriterion("CEQ_CZNGNUM not in", values, "czngnum");
            return (Criteria) this;
        }

        public Criteria andCzngnumBetween(String value1, String value2) {
            addCriterion("CEQ_CZNGNUM between", value1, value2, "czngnum");
            return (Criteria) this;
        }

        public Criteria andCzngnumNotBetween(String value1, String value2) {
            addCriterion("CEQ_CZNGNUM not between", value1, value2, "czngnum");
            return (Criteria) this;
        }

        public Criteria andTwistnumIsNull() {
            addCriterion("CEQ_TWISTNUM is null");
            return (Criteria) this;
        }

        public Criteria andTwistnumIsNotNull() {
            addCriterion("CEQ_TWISTNUM is not null");
            return (Criteria) this;
        }

        public Criteria andTwistnumEqualTo(String value) {
            addCriterion("CEQ_TWISTNUM =", value, "twistnum");
            return (Criteria) this;
        }

        public Criteria andTwistnumNotEqualTo(String value) {
            addCriterion("CEQ_TWISTNUM <>", value, "twistnum");
            return (Criteria) this;
        }

        public Criteria andTwistnumGreaterThan(String value) {
            addCriterion("CEQ_TWISTNUM >", value, "twistnum");
            return (Criteria) this;
        }

        public Criteria andTwistnumGreaterThanOrEqualTo(String value) {
            addCriterion("CEQ_TWISTNUM >=", value, "twistnum");
            return (Criteria) this;
        }

        public Criteria andTwistnumLessThan(String value) {
            addCriterion("CEQ_TWISTNUM <", value, "twistnum");
            return (Criteria) this;
        }

        public Criteria andTwistnumLessThanOrEqualTo(String value) {
            addCriterion("CEQ_TWISTNUM <=", value, "twistnum");
            return (Criteria) this;
        }

        public Criteria andTwistnumLike(String value) {
            addCriterion("CEQ_TWISTNUM like", value, "twistnum");
            return (Criteria) this;
        }

        public Criteria andTwistnumNotLike(String value) {
            addCriterion("CEQ_TWISTNUM not like", value, "twistnum");
            return (Criteria) this;
        }

        public Criteria andTwistnumIn(List<String> values) {
            addCriterion("CEQ_TWISTNUM in", values, "twistnum");
            return (Criteria) this;
        }

        public Criteria andTwistnumNotIn(List<String> values) {
            addCriterion("CEQ_TWISTNUM not in", values, "twistnum");
            return (Criteria) this;
        }

        public Criteria andTwistnumBetween(String value1, String value2) {
            addCriterion("CEQ_TWISTNUM between", value1, value2, "twistnum");
            return (Criteria) this;
        }

        public Criteria andTwistnumNotBetween(String value1, String value2) {
            addCriterion("CEQ_TWISTNUM not between", value1, value2, "twistnum");
            return (Criteria) this;
        }

        public Criteria andSeniorengineernumIsNull() {
            addCriterion("CEQ_SENIORENGINEERNUM is null");
            return (Criteria) this;
        }

        public Criteria andSeniorengineernumIsNotNull() {
            addCriterion("CEQ_SENIORENGINEERNUM is not null");
            return (Criteria) this;
        }

        public Criteria andSeniorengineernumEqualTo(String value) {
            addCriterion("CEQ_SENIORENGINEERNUM =", value, "seniorengineernum");
            return (Criteria) this;
        }

        public Criteria andSeniorengineernumNotEqualTo(String value) {
            addCriterion("CEQ_SENIORENGINEERNUM <>", value, "seniorengineernum");
            return (Criteria) this;
        }

        public Criteria andSeniorengineernumGreaterThan(String value) {
            addCriterion("CEQ_SENIORENGINEERNUM >", value, "seniorengineernum");
            return (Criteria) this;
        }

        public Criteria andSeniorengineernumGreaterThanOrEqualTo(String value) {
            addCriterion("CEQ_SENIORENGINEERNUM >=", value, "seniorengineernum");
            return (Criteria) this;
        }

        public Criteria andSeniorengineernumLessThan(String value) {
            addCriterion("CEQ_SENIORENGINEERNUM <", value, "seniorengineernum");
            return (Criteria) this;
        }

        public Criteria andSeniorengineernumLessThanOrEqualTo(String value) {
            addCriterion("CEQ_SENIORENGINEERNUM <=", value, "seniorengineernum");
            return (Criteria) this;
        }

        public Criteria andSeniorengineernumLike(String value) {
            addCriterion("CEQ_SENIORENGINEERNUM like", value, "seniorengineernum");
            return (Criteria) this;
        }

        public Criteria andSeniorengineernumNotLike(String value) {
            addCriterion("CEQ_SENIORENGINEERNUM not like", value, "seniorengineernum");
            return (Criteria) this;
        }

        public Criteria andSeniorengineernumIn(List<String> values) {
            addCriterion("CEQ_SENIORENGINEERNUM in", values, "seniorengineernum");
            return (Criteria) this;
        }

        public Criteria andSeniorengineernumNotIn(List<String> values) {
            addCriterion("CEQ_SENIORENGINEERNUM not in", values, "seniorengineernum");
            return (Criteria) this;
        }

        public Criteria andSeniorengineernumBetween(String value1, String value2) {
            addCriterion("CEQ_SENIORENGINEERNUM between", value1, value2, "seniorengineernum");
            return (Criteria) this;
        }

        public Criteria andSeniorengineernumNotBetween(String value1, String value2) {
            addCriterion("CEQ_SENIORENGINEERNUM not between", value1, value2, "seniorengineernum");
            return (Criteria) this;
        }

        public Criteria andEngineernumIsNull() {
            addCriterion("CEQ_ENGINEERNUM is null");
            return (Criteria) this;
        }

        public Criteria andEngineernumIsNotNull() {
            addCriterion("CEQ_ENGINEERNUM is not null");
            return (Criteria) this;
        }

        public Criteria andEngineernumEqualTo(String value) {
            addCriterion("CEQ_ENGINEERNUM =", value, "engineernum");
            return (Criteria) this;
        }

        public Criteria andEngineernumNotEqualTo(String value) {
            addCriterion("CEQ_ENGINEERNUM <>", value, "engineernum");
            return (Criteria) this;
        }

        public Criteria andEngineernumGreaterThan(String value) {
            addCriterion("CEQ_ENGINEERNUM >", value, "engineernum");
            return (Criteria) this;
        }

        public Criteria andEngineernumGreaterThanOrEqualTo(String value) {
            addCriterion("CEQ_ENGINEERNUM >=", value, "engineernum");
            return (Criteria) this;
        }

        public Criteria andEngineernumLessThan(String value) {
            addCriterion("CEQ_ENGINEERNUM <", value, "engineernum");
            return (Criteria) this;
        }

        public Criteria andEngineernumLessThanOrEqualTo(String value) {
            addCriterion("CEQ_ENGINEERNUM <=", value, "engineernum");
            return (Criteria) this;
        }

        public Criteria andEngineernumLike(String value) {
            addCriterion("CEQ_ENGINEERNUM like", value, "engineernum");
            return (Criteria) this;
        }

        public Criteria andEngineernumNotLike(String value) {
            addCriterion("CEQ_ENGINEERNUM not like", value, "engineernum");
            return (Criteria) this;
        }

        public Criteria andEngineernumIn(List<String> values) {
            addCriterion("CEQ_ENGINEERNUM in", values, "engineernum");
            return (Criteria) this;
        }

        public Criteria andEngineernumNotIn(List<String> values) {
            addCriterion("CEQ_ENGINEERNUM not in", values, "engineernum");
            return (Criteria) this;
        }

        public Criteria andEngineernumBetween(String value1, String value2) {
            addCriterion("CEQ_ENGINEERNUM between", value1, value2, "engineernum");
            return (Criteria) this;
        }

        public Criteria andEngineernumNotBetween(String value1, String value2) {
            addCriterion("CEQ_ENGINEERNUM not between", value1, value2, "engineernum");
            return (Criteria) this;
        }

        public Criteria andAssengineernumIsNull() {
            addCriterion("CEQ_ASSENGINEERNUM is null");
            return (Criteria) this;
        }

        public Criteria andAssengineernumIsNotNull() {
            addCriterion("CEQ_ASSENGINEERNUM is not null");
            return (Criteria) this;
        }

        public Criteria andAssengineernumEqualTo(String value) {
            addCriterion("CEQ_ASSENGINEERNUM =", value, "assengineernum");
            return (Criteria) this;
        }

        public Criteria andAssengineernumNotEqualTo(String value) {
            addCriterion("CEQ_ASSENGINEERNUM <>", value, "assengineernum");
            return (Criteria) this;
        }

        public Criteria andAssengineernumGreaterThan(String value) {
            addCriterion("CEQ_ASSENGINEERNUM >", value, "assengineernum");
            return (Criteria) this;
        }

        public Criteria andAssengineernumGreaterThanOrEqualTo(String value) {
            addCriterion("CEQ_ASSENGINEERNUM >=", value, "assengineernum");
            return (Criteria) this;
        }

        public Criteria andAssengineernumLessThan(String value) {
            addCriterion("CEQ_ASSENGINEERNUM <", value, "assengineernum");
            return (Criteria) this;
        }

        public Criteria andAssengineernumLessThanOrEqualTo(String value) {
            addCriterion("CEQ_ASSENGINEERNUM <=", value, "assengineernum");
            return (Criteria) this;
        }

        public Criteria andAssengineernumLike(String value) {
            addCriterion("CEQ_ASSENGINEERNUM like", value, "assengineernum");
            return (Criteria) this;
        }

        public Criteria andAssengineernumNotLike(String value) {
            addCriterion("CEQ_ASSENGINEERNUM not like", value, "assengineernum");
            return (Criteria) this;
        }

        public Criteria andAssengineernumIn(List<String> values) {
            addCriterion("CEQ_ASSENGINEERNUM in", values, "assengineernum");
            return (Criteria) this;
        }

        public Criteria andAssengineernumNotIn(List<String> values) {
            addCriterion("CEQ_ASSENGINEERNUM not in", values, "assengineernum");
            return (Criteria) this;
        }

        public Criteria andAssengineernumBetween(String value1, String value2) {
            addCriterion("CEQ_ASSENGINEERNUM between", value1, value2, "assengineernum");
            return (Criteria) this;
        }

        public Criteria andAssengineernumNotBetween(String value1, String value2) {
            addCriterion("CEQ_ASSENGINEERNUM not between", value1, value2, "assengineernum");
            return (Criteria) this;
        }

        public Criteria andCheckworkersnumIsNull() {
            addCriterion("CEQ_CHECKWORKERSNUM is null");
            return (Criteria) this;
        }

        public Criteria andCheckworkersnumIsNotNull() {
            addCriterion("CEQ_CHECKWORKERSNUM is not null");
            return (Criteria) this;
        }

        public Criteria andCheckworkersnumEqualTo(String value) {
            addCriterion("CEQ_CHECKWORKERSNUM =", value, "checkworkersnum");
            return (Criteria) this;
        }

        public Criteria andCheckworkersnumNotEqualTo(String value) {
            addCriterion("CEQ_CHECKWORKERSNUM <>", value, "checkworkersnum");
            return (Criteria) this;
        }

        public Criteria andCheckworkersnumGreaterThan(String value) {
            addCriterion("CEQ_CHECKWORKERSNUM >", value, "checkworkersnum");
            return (Criteria) this;
        }

        public Criteria andCheckworkersnumGreaterThanOrEqualTo(String value) {
            addCriterion("CEQ_CHECKWORKERSNUM >=", value, "checkworkersnum");
            return (Criteria) this;
        }

        public Criteria andCheckworkersnumLessThan(String value) {
            addCriterion("CEQ_CHECKWORKERSNUM <", value, "checkworkersnum");
            return (Criteria) this;
        }

        public Criteria andCheckworkersnumLessThanOrEqualTo(String value) {
            addCriterion("CEQ_CHECKWORKERSNUM <=", value, "checkworkersnum");
            return (Criteria) this;
        }

        public Criteria andCheckworkersnumLike(String value) {
            addCriterion("CEQ_CHECKWORKERSNUM like", value, "checkworkersnum");
            return (Criteria) this;
        }

        public Criteria andCheckworkersnumNotLike(String value) {
            addCriterion("CEQ_CHECKWORKERSNUM not like", value, "checkworkersnum");
            return (Criteria) this;
        }

        public Criteria andCheckworkersnumIn(List<String> values) {
            addCriterion("CEQ_CHECKWORKERSNUM in", values, "checkworkersnum");
            return (Criteria) this;
        }

        public Criteria andCheckworkersnumNotIn(List<String> values) {
            addCriterion("CEQ_CHECKWORKERSNUM not in", values, "checkworkersnum");
            return (Criteria) this;
        }

        public Criteria andCheckworkersnumBetween(String value1, String value2) {
            addCriterion("CEQ_CHECKWORKERSNUM between", value1, value2, "checkworkersnum");
            return (Criteria) this;
        }

        public Criteria andCheckworkersnumNotBetween(String value1, String value2) {
            addCriterion("CEQ_CHECKWORKERSNUM not between", value1, value2, "checkworkersnum");
            return (Criteria) this;
        }

        public Criteria andSetdateIsNull() {
            addCriterion("CEQ_SETDATE is null");
            return (Criteria) this;
        }

        public Criteria andSetdateIsNotNull() {
            addCriterion("CEQ_SETDATE is not null");
            return (Criteria) this;
        }

        public Criteria andSetdateEqualTo(String value) {
            addCriterion("CEQ_SETDATE =", value, "setdate");
            return (Criteria) this;
        }

        public Criteria andSetdateNotEqualTo(String value) {
            addCriterion("CEQ_SETDATE <>", value, "setdate");
            return (Criteria) this;
        }

        public Criteria andSetdateGreaterThan(String value) {
            addCriterion("CEQ_SETDATE >", value, "setdate");
            return (Criteria) this;
        }

        public Criteria andSetdateGreaterThanOrEqualTo(String value) {
            addCriterion("CEQ_SETDATE >=", value, "setdate");
            return (Criteria) this;
        }

        public Criteria andSetdateLessThan(String value) {
            addCriterion("CEQ_SETDATE <", value, "setdate");
            return (Criteria) this;
        }

        public Criteria andSetdateLessThanOrEqualTo(String value) {
            addCriterion("CEQ_SETDATE <=", value, "setdate");
            return (Criteria) this;
        }

        public Criteria andSetdateLike(String value) {
            addCriterion("CEQ_SETDATE like", value, "setdate");
            return (Criteria) this;
        }

        public Criteria andSetdateNotLike(String value) {
            addCriterion("CEQ_SETDATE not like", value, "setdate");
            return (Criteria) this;
        }

        public Criteria andSetdateIn(List<String> values) {
            addCriterion("CEQ_SETDATE in", values, "setdate");
            return (Criteria) this;
        }

        public Criteria andSetdateNotIn(List<String> values) {
            addCriterion("CEQ_SETDATE not in", values, "setdate");
            return (Criteria) this;
        }

        public Criteria andSetdateBetween(String value1, String value2) {
            addCriterion("CEQ_SETDATE between", value1, value2, "setdate");
            return (Criteria) this;
        }

        public Criteria andSetdateNotBetween(String value1, String value2) {
            addCriterion("CEQ_SETDATE not between", value1, value2, "setdate");
            return (Criteria) this;
        }

        public Criteria andEntmanageIsNull() {
            addCriterion("CEQ_ENTMANAGE is null");
            return (Criteria) this;
        }

        public Criteria andEntmanageIsNotNull() {
            addCriterion("CEQ_ENTMANAGE is not null");
            return (Criteria) this;
        }

        public Criteria andEntmanageEqualTo(String value) {
            addCriterion("CEQ_ENTMANAGE =", value, "entmanage");
            return (Criteria) this;
        }

        public Criteria andEntmanageNotEqualTo(String value) {
            addCriterion("CEQ_ENTMANAGE <>", value, "entmanage");
            return (Criteria) this;
        }

        public Criteria andEntmanageGreaterThan(String value) {
            addCriterion("CEQ_ENTMANAGE >", value, "entmanage");
            return (Criteria) this;
        }

        public Criteria andEntmanageGreaterThanOrEqualTo(String value) {
            addCriterion("CEQ_ENTMANAGE >=", value, "entmanage");
            return (Criteria) this;
        }

        public Criteria andEntmanageLessThan(String value) {
            addCriterion("CEQ_ENTMANAGE <", value, "entmanage");
            return (Criteria) this;
        }

        public Criteria andEntmanageLessThanOrEqualTo(String value) {
            addCriterion("CEQ_ENTMANAGE <=", value, "entmanage");
            return (Criteria) this;
        }

        public Criteria andEntmanageLike(String value) {
            addCriterion("CEQ_ENTMANAGE like", value, "entmanage");
            return (Criteria) this;
        }

        public Criteria andEntmanageNotLike(String value) {
            addCriterion("CEQ_ENTMANAGE not like", value, "entmanage");
            return (Criteria) this;
        }

        public Criteria andEntmanageIn(List<String> values) {
            addCriterion("CEQ_ENTMANAGE in", values, "entmanage");
            return (Criteria) this;
        }

        public Criteria andEntmanageNotIn(List<String> values) {
            addCriterion("CEQ_ENTMANAGE not in", values, "entmanage");
            return (Criteria) this;
        }

        public Criteria andEntmanageBetween(String value1, String value2) {
            addCriterion("CEQ_ENTMANAGE between", value1, value2, "entmanage");
            return (Criteria) this;
        }

        public Criteria andEntmanageNotBetween(String value1, String value2) {
            addCriterion("CEQ_ENTMANAGE not between", value1, value2, "entmanage");
            return (Criteria) this;
        }

        public Criteria andEntpidIsNull() {
            addCriterion("CEQ_ENTPID is null");
            return (Criteria) this;
        }

        public Criteria andEntpidIsNotNull() {
            addCriterion("CEQ_ENTPID is not null");
            return (Criteria) this;
        }

        public Criteria andEntpidEqualTo(String value) {
            addCriterion("CEQ_ENTPID =", value, "entpid");
            return (Criteria) this;
        }

        public Criteria andEntpidNotEqualTo(String value) {
            addCriterion("CEQ_ENTPID <>", value, "entpid");
            return (Criteria) this;
        }

        public Criteria andEntpidGreaterThan(String value) {
            addCriterion("CEQ_ENTPID >", value, "entpid");
            return (Criteria) this;
        }

        public Criteria andEntpidGreaterThanOrEqualTo(String value) {
            addCriterion("CEQ_ENTPID >=", value, "entpid");
            return (Criteria) this;
        }

        public Criteria andEntpidLessThan(String value) {
            addCriterion("CEQ_ENTPID <", value, "entpid");
            return (Criteria) this;
        }

        public Criteria andEntpidLessThanOrEqualTo(String value) {
            addCriterion("CEQ_ENTPID <=", value, "entpid");
            return (Criteria) this;
        }

        public Criteria andEntpidLike(String value) {
            addCriterion("CEQ_ENTPID like", value, "entpid");
            return (Criteria) this;
        }

        public Criteria andEntpidNotLike(String value) {
            addCriterion("CEQ_ENTPID not like", value, "entpid");
            return (Criteria) this;
        }

        public Criteria andEntpidIn(List<String> values) {
            addCriterion("CEQ_ENTPID in", values, "entpid");
            return (Criteria) this;
        }

        public Criteria andEntpidNotIn(List<String> values) {
            addCriterion("CEQ_ENTPID not in", values, "entpid");
            return (Criteria) this;
        }

        public Criteria andEntpidBetween(String value1, String value2) {
            addCriterion("CEQ_ENTPID between", value1, value2, "entpid");
            return (Criteria) this;
        }

        public Criteria andEntpidNotBetween(String value1, String value2) {
            addCriterion("CEQ_ENTPID not between", value1, value2, "entpid");
            return (Criteria) this;
        }

        public Criteria andOrgnameIsNull() {
            addCriterion("CEQ_ORGNAME is null");
            return (Criteria) this;
        }

        public Criteria andOrgnameIsNotNull() {
            addCriterion("CEQ_ORGNAME is not null");
            return (Criteria) this;
        }

        public Criteria andOrgnameEqualTo(String value) {
            addCriterion("CEQ_ORGNAME =", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameNotEqualTo(String value) {
            addCriterion("CEQ_ORGNAME <>", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameGreaterThan(String value) {
            addCriterion("CEQ_ORGNAME >", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameGreaterThanOrEqualTo(String value) {
            addCriterion("CEQ_ORGNAME >=", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameLessThan(String value) {
            addCriterion("CEQ_ORGNAME <", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameLessThanOrEqualTo(String value) {
            addCriterion("CEQ_ORGNAME <=", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameLike(String value) {
            addCriterion("CEQ_ORGNAME like", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameNotLike(String value) {
            addCriterion("CEQ_ORGNAME not like", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameIn(List<String> values) {
            addCriterion("CEQ_ORGNAME in", values, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameNotIn(List<String> values) {
            addCriterion("CEQ_ORGNAME not in", values, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameBetween(String value1, String value2) {
            addCriterion("CEQ_ORGNAME between", value1, value2, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameNotBetween(String value1, String value2) {
            addCriterion("CEQ_ORGNAME not between", value1, value2, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgcodeIsNull() {
            addCriterion("CEQ_ORGCODE is null");
            return (Criteria) this;
        }

        public Criteria andOrgcodeIsNotNull() {
            addCriterion("CEQ_ORGCODE is not null");
            return (Criteria) this;
        }

        public Criteria andOrgcodeEqualTo(String value) {
            addCriterion("CEQ_ORGCODE =", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeNotEqualTo(String value) {
            addCriterion("CEQ_ORGCODE <>", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeGreaterThan(String value) {
            addCriterion("CEQ_ORGCODE >", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeGreaterThanOrEqualTo(String value) {
            addCriterion("CEQ_ORGCODE >=", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeLessThan(String value) {
            addCriterion("CEQ_ORGCODE <", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeLessThanOrEqualTo(String value) {
            addCriterion("CEQ_ORGCODE <=", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeLike(String value) {
            addCriterion("CEQ_ORGCODE like", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeNotLike(String value) {
            addCriterion("CEQ_ORGCODE not like", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeIn(List<String> values) {
            addCriterion("CEQ_ORGCODE in", values, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeNotIn(List<String> values) {
            addCriterion("CEQ_ORGCODE not in", values, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeBetween(String value1, String value2) {
            addCriterion("CEQ_ORGCODE between", value1, value2, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeNotBetween(String value1, String value2) {
            addCriterion("CEQ_ORGCODE not between", value1, value2, "orgcode");
            return (Criteria) this;
        }

        public Criteria andEntlevelIsNull() {
            addCriterion("CEQ_ENTLEVEL is null");
            return (Criteria) this;
        }

        public Criteria andEntlevelIsNotNull() {
            addCriterion("CEQ_ENTLEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andEntlevelEqualTo(String value) {
            addCriterion("CEQ_ENTLEVEL =", value, "entlevel");
            return (Criteria) this;
        }

        public Criteria andEntlevelNotEqualTo(String value) {
            addCriterion("CEQ_ENTLEVEL <>", value, "entlevel");
            return (Criteria) this;
        }

        public Criteria andEntlevelGreaterThan(String value) {
            addCriterion("CEQ_ENTLEVEL >", value, "entlevel");
            return (Criteria) this;
        }

        public Criteria andEntlevelGreaterThanOrEqualTo(String value) {
            addCriterion("CEQ_ENTLEVEL >=", value, "entlevel");
            return (Criteria) this;
        }

        public Criteria andEntlevelLessThan(String value) {
            addCriterion("CEQ_ENTLEVEL <", value, "entlevel");
            return (Criteria) this;
        }

        public Criteria andEntlevelLessThanOrEqualTo(String value) {
            addCriterion("CEQ_ENTLEVEL <=", value, "entlevel");
            return (Criteria) this;
        }

        public Criteria andEntlevelLike(String value) {
            addCriterion("CEQ_ENTLEVEL like", value, "entlevel");
            return (Criteria) this;
        }

        public Criteria andEntlevelNotLike(String value) {
            addCriterion("CEQ_ENTLEVEL not like", value, "entlevel");
            return (Criteria) this;
        }

        public Criteria andEntlevelIn(List<String> values) {
            addCriterion("CEQ_ENTLEVEL in", values, "entlevel");
            return (Criteria) this;
        }

        public Criteria andEntlevelNotIn(List<String> values) {
            addCriterion("CEQ_ENTLEVEL not in", values, "entlevel");
            return (Criteria) this;
        }

        public Criteria andEntlevelBetween(String value1, String value2) {
            addCriterion("CEQ_ENTLEVEL between", value1, value2, "entlevel");
            return (Criteria) this;
        }

        public Criteria andEntlevelNotBetween(String value1, String value2) {
            addCriterion("CEQ_ENTLEVEL not between", value1, value2, "entlevel");
            return (Criteria) this;
        }

        public Criteria andBusinesslimitIsNull() {
            addCriterion("CEQ_BUSINESSLIMIT is null");
            return (Criteria) this;
        }

        public Criteria andBusinesslimitIsNotNull() {
            addCriterion("CEQ_BUSINESSLIMIT is not null");
            return (Criteria) this;
        }

        public Criteria andBusinesslimitEqualTo(String value) {
            addCriterion("CEQ_BUSINESSLIMIT =", value, "businesslimit");
            return (Criteria) this;
        }

        public Criteria andBusinesslimitNotEqualTo(String value) {
            addCriterion("CEQ_BUSINESSLIMIT <>", value, "businesslimit");
            return (Criteria) this;
        }

        public Criteria andBusinesslimitGreaterThan(String value) {
            addCriterion("CEQ_BUSINESSLIMIT >", value, "businesslimit");
            return (Criteria) this;
        }

        public Criteria andBusinesslimitGreaterThanOrEqualTo(String value) {
            addCriterion("CEQ_BUSINESSLIMIT >=", value, "businesslimit");
            return (Criteria) this;
        }

        public Criteria andBusinesslimitLessThan(String value) {
            addCriterion("CEQ_BUSINESSLIMIT <", value, "businesslimit");
            return (Criteria) this;
        }

        public Criteria andBusinesslimitLessThanOrEqualTo(String value) {
            addCriterion("CEQ_BUSINESSLIMIT <=", value, "businesslimit");
            return (Criteria) this;
        }

        public Criteria andBusinesslimitLike(String value) {
            addCriterion("CEQ_BUSINESSLIMIT like", value, "businesslimit");
            return (Criteria) this;
        }

        public Criteria andBusinesslimitNotLike(String value) {
            addCriterion("CEQ_BUSINESSLIMIT not like", value, "businesslimit");
            return (Criteria) this;
        }

        public Criteria andBusinesslimitIn(List<String> values) {
            addCriterion("CEQ_BUSINESSLIMIT in", values, "businesslimit");
            return (Criteria) this;
        }

        public Criteria andBusinesslimitNotIn(List<String> values) {
            addCriterion("CEQ_BUSINESSLIMIT not in", values, "businesslimit");
            return (Criteria) this;
        }

        public Criteria andBusinesslimitBetween(String value1, String value2) {
            addCriterion("CEQ_BUSINESSLIMIT between", value1, value2, "businesslimit");
            return (Criteria) this;
        }

        public Criteria andBusinesslimitNotBetween(String value1, String value2) {
            addCriterion("CEQ_BUSINESSLIMIT not between", value1, value2, "businesslimit");
            return (Criteria) this;
        }

        public Criteria andBuildlevelIsNull() {
            addCriterion("CEQ_BUILDLEVEL is null");
            return (Criteria) this;
        }

        public Criteria andBuildlevelIsNotNull() {
            addCriterion("CEQ_BUILDLEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andBuildlevelEqualTo(String value) {
            addCriterion("CEQ_BUILDLEVEL =", value, "buildlevel");
            return (Criteria) this;
        }

        public Criteria andBuildlevelNotEqualTo(String value) {
            addCriterion("CEQ_BUILDLEVEL <>", value, "buildlevel");
            return (Criteria) this;
        }

        public Criteria andBuildlevelGreaterThan(String value) {
            addCriterion("CEQ_BUILDLEVEL >", value, "buildlevel");
            return (Criteria) this;
        }

        public Criteria andBuildlevelGreaterThanOrEqualTo(String value) {
            addCriterion("CEQ_BUILDLEVEL >=", value, "buildlevel");
            return (Criteria) this;
        }

        public Criteria andBuildlevelLessThan(String value) {
            addCriterion("CEQ_BUILDLEVEL <", value, "buildlevel");
            return (Criteria) this;
        }

        public Criteria andBuildlevelLessThanOrEqualTo(String value) {
            addCriterion("CEQ_BUILDLEVEL <=", value, "buildlevel");
            return (Criteria) this;
        }

        public Criteria andBuildlevelLike(String value) {
            addCriterion("CEQ_BUILDLEVEL like", value, "buildlevel");
            return (Criteria) this;
        }

        public Criteria andBuildlevelNotLike(String value) {
            addCriterion("CEQ_BUILDLEVEL not like", value, "buildlevel");
            return (Criteria) this;
        }

        public Criteria andBuildlevelIn(List<String> values) {
            addCriterion("CEQ_BUILDLEVEL in", values, "buildlevel");
            return (Criteria) this;
        }

        public Criteria andBuildlevelNotIn(List<String> values) {
            addCriterion("CEQ_BUILDLEVEL not in", values, "buildlevel");
            return (Criteria) this;
        }

        public Criteria andBuildlevelBetween(String value1, String value2) {
            addCriterion("CEQ_BUILDLEVEL between", value1, value2, "buildlevel");
            return (Criteria) this;
        }

        public Criteria andBuildlevelNotBetween(String value1, String value2) {
            addCriterion("CEQ_BUILDLEVEL not between", value1, value2, "buildlevel");
            return (Criteria) this;
        }

        public Criteria andIdLikeInsensitive(String value) {
            addCriterion("upper(CEQ_ID) like", value.toUpperCase(), "id");
            return (Criteria) this;
        }

        public Criteria andPostalcodeLikeInsensitive(String value) {
            addCriterion("upper(CEQ_POSTALCODE) like", value.toUpperCase(), "postalcode");
            return (Criteria) this;
        }

        public Criteria andRegcapitalLikeInsensitive(String value) {
            addCriterion("upper(CEQ_REGCAPITAL) like", value.toUpperCase(), "regcapital");
            return (Criteria) this;
        }

        public Criteria andAreaspaceLikeInsensitive(String value) {
            addCriterion("upper(CEQ_AREASPACE) like", value.toUpperCase(), "areaspace");
            return (Criteria) this;
        }

        public Criteria andCoastlineLikeInsensitive(String value) {
            addCriterion("upper(CEQ_COASTLINE) like", value.toUpperCase(), "coastline");
            return (Criteria) this;
        }

        public Criteria andWorkshopareaLikeInsensitive(String value) {
            addCriterion("upper(CEQ_WORKSHOPAREA) like", value.toUpperCase(), "workshoparea");
            return (Criteria) this;
        }

        public Criteria andWorkersnumLikeInsensitive(String value) {
            addCriterion("upper(CEQ_WORKERSNUM) like", value.toUpperCase(), "workersnum");
            return (Criteria) this;
        }

        public Criteria andProfworkersnumLikeInsensitive(String value) {
            addCriterion("upper(CEQ_PROFWORKERSNUM) like", value.toUpperCase(), "profworkersnum");
            return (Criteria) this;
        }

        public Criteria andWeldworkernumLikeInsensitive(String value) {
            addCriterion("upper(CEQ_WELDWORKERNUM) like", value.toUpperCase(), "weldworkernum");
            return (Criteria) this;
        }

        public Criteria andCarpentrynumLikeInsensitive(String value) {
            addCriterion("upper(CEQ_CARPENTRYNUM) like", value.toUpperCase(), "carpentrynum");
            return (Criteria) this;
        }

        public Criteria andCzngnumLikeInsensitive(String value) {
            addCriterion("upper(CEQ_CZNGNUM) like", value.toUpperCase(), "czngnum");
            return (Criteria) this;
        }

        public Criteria andTwistnumLikeInsensitive(String value) {
            addCriterion("upper(CEQ_TWISTNUM) like", value.toUpperCase(), "twistnum");
            return (Criteria) this;
        }

        public Criteria andSeniorengineernumLikeInsensitive(String value) {
            addCriterion("upper(CEQ_SENIORENGINEERNUM) like", value.toUpperCase(), "seniorengineernum");
            return (Criteria) this;
        }

        public Criteria andEngineernumLikeInsensitive(String value) {
            addCriterion("upper(CEQ_ENGINEERNUM) like", value.toUpperCase(), "engineernum");
            return (Criteria) this;
        }

        public Criteria andAssengineernumLikeInsensitive(String value) {
            addCriterion("upper(CEQ_ASSENGINEERNUM) like", value.toUpperCase(), "assengineernum");
            return (Criteria) this;
        }

        public Criteria andCheckworkersnumLikeInsensitive(String value) {
            addCriterion("upper(CEQ_CHECKWORKERSNUM) like", value.toUpperCase(), "checkworkersnum");
            return (Criteria) this;
        }

        public Criteria andSetdateLikeInsensitive(String value) {
            addCriterion("upper(CEQ_SETDATE) like", value.toUpperCase(), "setdate");
            return (Criteria) this;
        }

        public Criteria andEntmanageLikeInsensitive(String value) {
            addCriterion("upper(CEQ_ENTMANAGE) like", value.toUpperCase(), "entmanage");
            return (Criteria) this;
        }

        public Criteria andEntpidLikeInsensitive(String value) {
            addCriterion("upper(CEQ_ENTPID) like", value.toUpperCase(), "entpid");
            return (Criteria) this;
        }

        public Criteria andOrgnameLikeInsensitive(String value) {
            addCriterion("upper(CEQ_ORGNAME) like", value.toUpperCase(), "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgcodeLikeInsensitive(String value) {
            addCriterion("upper(CEQ_ORGCODE) like", value.toUpperCase(), "orgcode");
            return (Criteria) this;
        }

        public Criteria andEntlevelLikeInsensitive(String value) {
            addCriterion("upper(CEQ_ENTLEVEL) like", value.toUpperCase(), "entlevel");
            return (Criteria) this;
        }

        public Criteria andBusinesslimitLikeInsensitive(String value) {
            addCriterion("upper(CEQ_BUSINESSLIMIT) like", value.toUpperCase(), "businesslimit");
            return (Criteria) this;
        }

        public Criteria andBuildlevelLikeInsensitive(String value) {
            addCriterion("upper(CEQ_BUILDLEVEL) like", value.toUpperCase(), "buildlevel");
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