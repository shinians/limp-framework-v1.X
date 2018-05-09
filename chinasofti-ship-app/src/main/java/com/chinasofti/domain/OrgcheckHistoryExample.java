package com.chinasofti.domain;

import com.limp.framework.core.bean.Pager;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrgcheckHistoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Pager page;

    public OrgcheckHistoryExample() {
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
            addCriterion("COH_ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("COH_ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("COH_ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("COH_ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("COH_ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("COH_ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("COH_ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("COH_ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("COH_ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("COH_ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("COH_ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("COH_ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("COH_ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("COH_ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUidIsNull() {
            addCriterion("COH_UID is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("COH_UID is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(String value) {
            addCriterion("COH_UID =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(String value) {
            addCriterion("COH_UID <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(String value) {
            addCriterion("COH_UID >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(String value) {
            addCriterion("COH_UID >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(String value) {
            addCriterion("COH_UID <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(String value) {
            addCriterion("COH_UID <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLike(String value) {
            addCriterion("COH_UID like", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotLike(String value) {
            addCriterion("COH_UID not like", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<String> values) {
            addCriterion("COH_UID in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<String> values) {
            addCriterion("COH_UID not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(String value1, String value2) {
            addCriterion("COH_UID between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(String value1, String value2) {
            addCriterion("COH_UID not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andCheckunitIsNull() {
            addCriterion("COH_CHECKUNIT is null");
            return (Criteria) this;
        }

        public Criteria andCheckunitIsNotNull() {
            addCriterion("COH_CHECKUNIT is not null");
            return (Criteria) this;
        }

        public Criteria andCheckunitEqualTo(String value) {
            addCriterion("COH_CHECKUNIT =", value, "checkunit");
            return (Criteria) this;
        }

        public Criteria andCheckunitNotEqualTo(String value) {
            addCriterion("COH_CHECKUNIT <>", value, "checkunit");
            return (Criteria) this;
        }

        public Criteria andCheckunitGreaterThan(String value) {
            addCriterion("COH_CHECKUNIT >", value, "checkunit");
            return (Criteria) this;
        }

        public Criteria andCheckunitGreaterThanOrEqualTo(String value) {
            addCriterion("COH_CHECKUNIT >=", value, "checkunit");
            return (Criteria) this;
        }

        public Criteria andCheckunitLessThan(String value) {
            addCriterion("COH_CHECKUNIT <", value, "checkunit");
            return (Criteria) this;
        }

        public Criteria andCheckunitLessThanOrEqualTo(String value) {
            addCriterion("COH_CHECKUNIT <=", value, "checkunit");
            return (Criteria) this;
        }

        public Criteria andCheckunitLike(String value) {
            addCriterion("COH_CHECKUNIT like", value, "checkunit");
            return (Criteria) this;
        }

        public Criteria andCheckunitNotLike(String value) {
            addCriterion("COH_CHECKUNIT not like", value, "checkunit");
            return (Criteria) this;
        }

        public Criteria andCheckunitIn(List<String> values) {
            addCriterion("COH_CHECKUNIT in", values, "checkunit");
            return (Criteria) this;
        }

        public Criteria andCheckunitNotIn(List<String> values) {
            addCriterion("COH_CHECKUNIT not in", values, "checkunit");
            return (Criteria) this;
        }

        public Criteria andCheckunitBetween(String value1, String value2) {
            addCriterion("COH_CHECKUNIT between", value1, value2, "checkunit");
            return (Criteria) this;
        }

        public Criteria andCheckunitNotBetween(String value1, String value2) {
            addCriterion("COH_CHECKUNIT not between", value1, value2, "checkunit");
            return (Criteria) this;
        }

        public Criteria andCheckpersonIsNull() {
            addCriterion("COH_CHECKPERSON is null");
            return (Criteria) this;
        }

        public Criteria andCheckpersonIsNotNull() {
            addCriterion("COH_CHECKPERSON is not null");
            return (Criteria) this;
        }

        public Criteria andCheckpersonEqualTo(String value) {
            addCriterion("COH_CHECKPERSON =", value, "checkperson");
            return (Criteria) this;
        }

        public Criteria andCheckpersonNotEqualTo(String value) {
            addCriterion("COH_CHECKPERSON <>", value, "checkperson");
            return (Criteria) this;
        }

        public Criteria andCheckpersonGreaterThan(String value) {
            addCriterion("COH_CHECKPERSON >", value, "checkperson");
            return (Criteria) this;
        }

        public Criteria andCheckpersonGreaterThanOrEqualTo(String value) {
            addCriterion("COH_CHECKPERSON >=", value, "checkperson");
            return (Criteria) this;
        }

        public Criteria andCheckpersonLessThan(String value) {
            addCriterion("COH_CHECKPERSON <", value, "checkperson");
            return (Criteria) this;
        }

        public Criteria andCheckpersonLessThanOrEqualTo(String value) {
            addCriterion("COH_CHECKPERSON <=", value, "checkperson");
            return (Criteria) this;
        }

        public Criteria andCheckpersonLike(String value) {
            addCriterion("COH_CHECKPERSON like", value, "checkperson");
            return (Criteria) this;
        }

        public Criteria andCheckpersonNotLike(String value) {
            addCriterion("COH_CHECKPERSON not like", value, "checkperson");
            return (Criteria) this;
        }

        public Criteria andCheckpersonIn(List<String> values) {
            addCriterion("COH_CHECKPERSON in", values, "checkperson");
            return (Criteria) this;
        }

        public Criteria andCheckpersonNotIn(List<String> values) {
            addCriterion("COH_CHECKPERSON not in", values, "checkperson");
            return (Criteria) this;
        }

        public Criteria andCheckpersonBetween(String value1, String value2) {
            addCriterion("COH_CHECKPERSON between", value1, value2, "checkperson");
            return (Criteria) this;
        }

        public Criteria andCheckpersonNotBetween(String value1, String value2) {
            addCriterion("COH_CHECKPERSON not between", value1, value2, "checkperson");
            return (Criteria) this;
        }

        public Criteria andCheckoptionsIsNull() {
            addCriterion("COH_CHECKOPTIONS is null");
            return (Criteria) this;
        }

        public Criteria andCheckoptionsIsNotNull() {
            addCriterion("COH_CHECKOPTIONS is not null");
            return (Criteria) this;
        }

        public Criteria andCheckoptionsEqualTo(String value) {
            addCriterion("COH_CHECKOPTIONS =", value, "checkoptions");
            return (Criteria) this;
        }

        public Criteria andCheckoptionsNotEqualTo(String value) {
            addCriterion("COH_CHECKOPTIONS <>", value, "checkoptions");
            return (Criteria) this;
        }

        public Criteria andCheckoptionsGreaterThan(String value) {
            addCriterion("COH_CHECKOPTIONS >", value, "checkoptions");
            return (Criteria) this;
        }

        public Criteria andCheckoptionsGreaterThanOrEqualTo(String value) {
            addCriterion("COH_CHECKOPTIONS >=", value, "checkoptions");
            return (Criteria) this;
        }

        public Criteria andCheckoptionsLessThan(String value) {
            addCriterion("COH_CHECKOPTIONS <", value, "checkoptions");
            return (Criteria) this;
        }

        public Criteria andCheckoptionsLessThanOrEqualTo(String value) {
            addCriterion("COH_CHECKOPTIONS <=", value, "checkoptions");
            return (Criteria) this;
        }

        public Criteria andCheckoptionsLike(String value) {
            addCriterion("COH_CHECKOPTIONS like", value, "checkoptions");
            return (Criteria) this;
        }

        public Criteria andCheckoptionsNotLike(String value) {
            addCriterion("COH_CHECKOPTIONS not like", value, "checkoptions");
            return (Criteria) this;
        }

        public Criteria andCheckoptionsIn(List<String> values) {
            addCriterion("COH_CHECKOPTIONS in", values, "checkoptions");
            return (Criteria) this;
        }

        public Criteria andCheckoptionsNotIn(List<String> values) {
            addCriterion("COH_CHECKOPTIONS not in", values, "checkoptions");
            return (Criteria) this;
        }

        public Criteria andCheckoptionsBetween(String value1, String value2) {
            addCriterion("COH_CHECKOPTIONS between", value1, value2, "checkoptions");
            return (Criteria) this;
        }

        public Criteria andCheckoptionsNotBetween(String value1, String value2) {
            addCriterion("COH_CHECKOPTIONS not between", value1, value2, "checkoptions");
            return (Criteria) this;
        }

        public Criteria andChecktypeIsNull() {
            addCriterion("COH_CHECKTYPE is null");
            return (Criteria) this;
        }

        public Criteria andChecktypeIsNotNull() {
            addCriterion("COH_CHECKTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andChecktypeEqualTo(String value) {
            addCriterion("COH_CHECKTYPE =", value, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeNotEqualTo(String value) {
            addCriterion("COH_CHECKTYPE <>", value, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeGreaterThan(String value) {
            addCriterion("COH_CHECKTYPE >", value, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeGreaterThanOrEqualTo(String value) {
            addCriterion("COH_CHECKTYPE >=", value, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeLessThan(String value) {
            addCriterion("COH_CHECKTYPE <", value, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeLessThanOrEqualTo(String value) {
            addCriterion("COH_CHECKTYPE <=", value, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeLike(String value) {
            addCriterion("COH_CHECKTYPE like", value, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeNotLike(String value) {
            addCriterion("COH_CHECKTYPE not like", value, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeIn(List<String> values) {
            addCriterion("COH_CHECKTYPE in", values, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeNotIn(List<String> values) {
            addCriterion("COH_CHECKTYPE not in", values, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeBetween(String value1, String value2) {
            addCriterion("COH_CHECKTYPE between", value1, value2, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeNotBetween(String value1, String value2) {
            addCriterion("COH_CHECKTYPE not between", value1, value2, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktimenextIsNull() {
            addCriterion("COH_CHECKTIMENEXT is null");
            return (Criteria) this;
        }

        public Criteria andChecktimenextIsNotNull() {
            addCriterion("COH_CHECKTIMENEXT is not null");
            return (Criteria) this;
        }

        public Criteria andChecktimenextEqualTo(String value) {
            addCriterion("COH_CHECKTIMENEXT =", value, "checktimenext");
            return (Criteria) this;
        }

        public Criteria andChecktimenextNotEqualTo(String value) {
            addCriterion("COH_CHECKTIMENEXT <>", value, "checktimenext");
            return (Criteria) this;
        }

        public Criteria andChecktimenextGreaterThan(String value) {
            addCriterion("COH_CHECKTIMENEXT >", value, "checktimenext");
            return (Criteria) this;
        }

        public Criteria andChecktimenextGreaterThanOrEqualTo(String value) {
            addCriterion("COH_CHECKTIMENEXT >=", value, "checktimenext");
            return (Criteria) this;
        }

        public Criteria andChecktimenextLessThan(String value) {
            addCriterion("COH_CHECKTIMENEXT <", value, "checktimenext");
            return (Criteria) this;
        }

        public Criteria andChecktimenextLessThanOrEqualTo(String value) {
            addCriterion("COH_CHECKTIMENEXT <=", value, "checktimenext");
            return (Criteria) this;
        }

        public Criteria andChecktimenextLike(String value) {
            addCriterion("COH_CHECKTIMENEXT like", value, "checktimenext");
            return (Criteria) this;
        }

        public Criteria andChecktimenextNotLike(String value) {
            addCriterion("COH_CHECKTIMENEXT not like", value, "checktimenext");
            return (Criteria) this;
        }

        public Criteria andChecktimenextIn(List<String> values) {
            addCriterion("COH_CHECKTIMENEXT in", values, "checktimenext");
            return (Criteria) this;
        }

        public Criteria andChecktimenextNotIn(List<String> values) {
            addCriterion("COH_CHECKTIMENEXT not in", values, "checktimenext");
            return (Criteria) this;
        }

        public Criteria andChecktimenextBetween(String value1, String value2) {
            addCriterion("COH_CHECKTIMENEXT between", value1, value2, "checktimenext");
            return (Criteria) this;
        }

        public Criteria andChecktimenextNotBetween(String value1, String value2) {
            addCriterion("COH_CHECKTIMENEXT not between", value1, value2, "checktimenext");
            return (Criteria) this;
        }

        public Criteria andChecktimeIsNull() {
            addCriterion("COH_CHECKTIME is null");
            return (Criteria) this;
        }

        public Criteria andChecktimeIsNotNull() {
            addCriterion("COH_CHECKTIME is not null");
            return (Criteria) this;
        }

        public Criteria andChecktimeEqualTo(String value) {
            addCriterion("COH_CHECKTIME =", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeNotEqualTo(String value) {
            addCriterion("COH_CHECKTIME <>", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeGreaterThan(String value) {
            addCriterion("COH_CHECKTIME >", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeGreaterThanOrEqualTo(String value) {
            addCriterion("COH_CHECKTIME >=", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeLessThan(String value) {
            addCriterion("COH_CHECKTIME <", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeLessThanOrEqualTo(String value) {
            addCriterion("COH_CHECKTIME <=", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeLike(String value) {
            addCriterion("COH_CHECKTIME like", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeNotLike(String value) {
            addCriterion("COH_CHECKTIME not like", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeIn(List<String> values) {
            addCriterion("COH_CHECKTIME in", values, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeNotIn(List<String> values) {
            addCriterion("COH_CHECKTIME not in", values, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeBetween(String value1, String value2) {
            addCriterion("COH_CHECKTIME between", value1, value2, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeNotBetween(String value1, String value2) {
            addCriterion("COH_CHECKTIME not between", value1, value2, "checktime");
            return (Criteria) this;
        }

        public Criteria andOrgnameIsNull() {
            addCriterion("COH_ORGNAME is null");
            return (Criteria) this;
        }

        public Criteria andOrgnameIsNotNull() {
            addCriterion("COH_ORGNAME is not null");
            return (Criteria) this;
        }

        public Criteria andOrgnameEqualTo(String value) {
            addCriterion("COH_ORGNAME =", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameNotEqualTo(String value) {
            addCriterion("COH_ORGNAME <>", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameGreaterThan(String value) {
            addCriterion("COH_ORGNAME >", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameGreaterThanOrEqualTo(String value) {
            addCriterion("COH_ORGNAME >=", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameLessThan(String value) {
            addCriterion("COH_ORGNAME <", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameLessThanOrEqualTo(String value) {
            addCriterion("COH_ORGNAME <=", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameLike(String value) {
            addCriterion("COH_ORGNAME like", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameNotLike(String value) {
            addCriterion("COH_ORGNAME not like", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameIn(List<String> values) {
            addCriterion("COH_ORGNAME in", values, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameNotIn(List<String> values) {
            addCriterion("COH_ORGNAME not in", values, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameBetween(String value1, String value2) {
            addCriterion("COH_ORGNAME between", value1, value2, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameNotBetween(String value1, String value2) {
            addCriterion("COH_ORGNAME not between", value1, value2, "orgname");
            return (Criteria) this;
        }

        public Criteria andScopeIsNull() {
            addCriterion("COH_SCOPE is null");
            return (Criteria) this;
        }

        public Criteria andScopeIsNotNull() {
            addCriterion("COH_SCOPE is not null");
            return (Criteria) this;
        }

        public Criteria andScopeEqualTo(String value) {
            addCriterion("COH_SCOPE =", value, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeNotEqualTo(String value) {
            addCriterion("COH_SCOPE <>", value, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeGreaterThan(String value) {
            addCriterion("COH_SCOPE >", value, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeGreaterThanOrEqualTo(String value) {
            addCriterion("COH_SCOPE >=", value, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeLessThan(String value) {
            addCriterion("COH_SCOPE <", value, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeLessThanOrEqualTo(String value) {
            addCriterion("COH_SCOPE <=", value, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeLike(String value) {
            addCriterion("COH_SCOPE like", value, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeNotLike(String value) {
            addCriterion("COH_SCOPE not like", value, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeIn(List<String> values) {
            addCriterion("COH_SCOPE in", values, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeNotIn(List<String> values) {
            addCriterion("COH_SCOPE not in", values, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeBetween(String value1, String value2) {
            addCriterion("COH_SCOPE between", value1, value2, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeNotBetween(String value1, String value2) {
            addCriterion("COH_SCOPE not between", value1, value2, "scope");
            return (Criteria) this;
        }

        public Criteria andRc1IsNull() {
            addCriterion("COH_RC1 is null");
            return (Criteria) this;
        }

        public Criteria andRc1IsNotNull() {
            addCriterion("COH_RC1 is not null");
            return (Criteria) this;
        }

        public Criteria andRc1EqualTo(String value) {
            addCriterion("COH_RC1 =", value, "rc1");
            return (Criteria) this;
        }

        public Criteria andRc1NotEqualTo(String value) {
            addCriterion("COH_RC1 <>", value, "rc1");
            return (Criteria) this;
        }

        public Criteria andRc1GreaterThan(String value) {
            addCriterion("COH_RC1 >", value, "rc1");
            return (Criteria) this;
        }

        public Criteria andRc1GreaterThanOrEqualTo(String value) {
            addCriterion("COH_RC1 >=", value, "rc1");
            return (Criteria) this;
        }

        public Criteria andRc1LessThan(String value) {
            addCriterion("COH_RC1 <", value, "rc1");
            return (Criteria) this;
        }

        public Criteria andRc1LessThanOrEqualTo(String value) {
            addCriterion("COH_RC1 <=", value, "rc1");
            return (Criteria) this;
        }

        public Criteria andRc1Like(String value) {
            addCriterion("COH_RC1 like", value, "rc1");
            return (Criteria) this;
        }

        public Criteria andRc1NotLike(String value) {
            addCriterion("COH_RC1 not like", value, "rc1");
            return (Criteria) this;
        }

        public Criteria andRc1In(List<String> values) {
            addCriterion("COH_RC1 in", values, "rc1");
            return (Criteria) this;
        }

        public Criteria andRc1NotIn(List<String> values) {
            addCriterion("COH_RC1 not in", values, "rc1");
            return (Criteria) this;
        }

        public Criteria andRc1Between(String value1, String value2) {
            addCriterion("COH_RC1 between", value1, value2, "rc1");
            return (Criteria) this;
        }

        public Criteria andRc1NotBetween(String value1, String value2) {
            addCriterion("COH_RC1 not between", value1, value2, "rc1");
            return (Criteria) this;
        }

        public Criteria andRc2IsNull() {
            addCriterion("COH_RC2 is null");
            return (Criteria) this;
        }

        public Criteria andRc2IsNotNull() {
            addCriterion("COH_RC2 is not null");
            return (Criteria) this;
        }

        public Criteria andRc2EqualTo(String value) {
            addCriterion("COH_RC2 =", value, "rc2");
            return (Criteria) this;
        }

        public Criteria andRc2NotEqualTo(String value) {
            addCriterion("COH_RC2 <>", value, "rc2");
            return (Criteria) this;
        }

        public Criteria andRc2GreaterThan(String value) {
            addCriterion("COH_RC2 >", value, "rc2");
            return (Criteria) this;
        }

        public Criteria andRc2GreaterThanOrEqualTo(String value) {
            addCriterion("COH_RC2 >=", value, "rc2");
            return (Criteria) this;
        }

        public Criteria andRc2LessThan(String value) {
            addCriterion("COH_RC2 <", value, "rc2");
            return (Criteria) this;
        }

        public Criteria andRc2LessThanOrEqualTo(String value) {
            addCriterion("COH_RC2 <=", value, "rc2");
            return (Criteria) this;
        }

        public Criteria andRc2Like(String value) {
            addCriterion("COH_RC2 like", value, "rc2");
            return (Criteria) this;
        }

        public Criteria andRc2NotLike(String value) {
            addCriterion("COH_RC2 not like", value, "rc2");
            return (Criteria) this;
        }

        public Criteria andRc2In(List<String> values) {
            addCriterion("COH_RC2 in", values, "rc2");
            return (Criteria) this;
        }

        public Criteria andRc2NotIn(List<String> values) {
            addCriterion("COH_RC2 not in", values, "rc2");
            return (Criteria) this;
        }

        public Criteria andRc2Between(String value1, String value2) {
            addCriterion("COH_RC2 between", value1, value2, "rc2");
            return (Criteria) this;
        }

        public Criteria andRc2NotBetween(String value1, String value2) {
            addCriterion("COH_RC2 not between", value1, value2, "rc2");
            return (Criteria) this;
        }

        public Criteria andRc3IsNull() {
            addCriterion("COH_RC3 is null");
            return (Criteria) this;
        }

        public Criteria andRc3IsNotNull() {
            addCriterion("COH_RC3 is not null");
            return (Criteria) this;
        }

        public Criteria andRc3EqualTo(Short value) {
            addCriterion("COH_RC3 =", value, "rc3");
            return (Criteria) this;
        }

        public Criteria andRc3NotEqualTo(Short value) {
            addCriterion("COH_RC3 <>", value, "rc3");
            return (Criteria) this;
        }

        public Criteria andRc3GreaterThan(Short value) {
            addCriterion("COH_RC3 >", value, "rc3");
            return (Criteria) this;
        }

        public Criteria andRc3GreaterThanOrEqualTo(Short value) {
            addCriterion("COH_RC3 >=", value, "rc3");
            return (Criteria) this;
        }

        public Criteria andRc3LessThan(Short value) {
            addCriterion("COH_RC3 <", value, "rc3");
            return (Criteria) this;
        }

        public Criteria andRc3LessThanOrEqualTo(Short value) {
            addCriterion("COH_RC3 <=", value, "rc3");
            return (Criteria) this;
        }

        public Criteria andRc3In(List<Short> values) {
            addCriterion("COH_RC3 in", values, "rc3");
            return (Criteria) this;
        }

        public Criteria andRc3NotIn(List<Short> values) {
            addCriterion("COH_RC3 not in", values, "rc3");
            return (Criteria) this;
        }

        public Criteria andRc3Between(Short value1, Short value2) {
            addCriterion("COH_RC3 between", value1, value2, "rc3");
            return (Criteria) this;
        }

        public Criteria andRc3NotBetween(Short value1, Short value2) {
            addCriterion("COH_RC3 not between", value1, value2, "rc3");
            return (Criteria) this;
        }

        public Criteria andRc4IsNull() {
            addCriterion("COH_RC4 is null");
            return (Criteria) this;
        }

        public Criteria andRc4IsNotNull() {
            addCriterion("COH_RC4 is not null");
            return (Criteria) this;
        }

        public Criteria andRc4EqualTo(Date value) {
            addCriterion("COH_RC4 =", value, "rc4");
            return (Criteria) this;
        }

        public Criteria andRc4NotEqualTo(Date value) {
            addCriterion("COH_RC4 <>", value, "rc4");
            return (Criteria) this;
        }

        public Criteria andRc4GreaterThan(Date value) {
            addCriterion("COH_RC4 >", value, "rc4");
            return (Criteria) this;
        }

        public Criteria andRc4GreaterThanOrEqualTo(Date value) {
            addCriterion("COH_RC4 >=", value, "rc4");
            return (Criteria) this;
        }

        public Criteria andRc4LessThan(Date value) {
            addCriterion("COH_RC4 <", value, "rc4");
            return (Criteria) this;
        }

        public Criteria andRc4LessThanOrEqualTo(Date value) {
            addCriterion("COH_RC4 <=", value, "rc4");
            return (Criteria) this;
        }

        public Criteria andRc4In(List<Date> values) {
            addCriterion("COH_RC4 in", values, "rc4");
            return (Criteria) this;
        }

        public Criteria andRc4NotIn(List<Date> values) {
            addCriterion("COH_RC4 not in", values, "rc4");
            return (Criteria) this;
        }

        public Criteria andRc4Between(Date value1, Date value2) {
            addCriterion("COH_RC4 between", value1, value2, "rc4");
            return (Criteria) this;
        }

        public Criteria andRc4NotBetween(Date value1, Date value2) {
            addCriterion("COH_RC4 not between", value1, value2, "rc4");
            return (Criteria) this;
        }

        public Criteria andRc5IsNull() {
            addCriterion("COH_RC5 is null");
            return (Criteria) this;
        }

        public Criteria andRc5IsNotNull() {
            addCriterion("COH_RC5 is not null");
            return (Criteria) this;
        }

        public Criteria andRc5EqualTo(String value) {
            addCriterion("COH_RC5 =", value, "rc5");
            return (Criteria) this;
        }

        public Criteria andRc5NotEqualTo(String value) {
            addCriterion("COH_RC5 <>", value, "rc5");
            return (Criteria) this;
        }

        public Criteria andRc5GreaterThan(String value) {
            addCriterion("COH_RC5 >", value, "rc5");
            return (Criteria) this;
        }

        public Criteria andRc5GreaterThanOrEqualTo(String value) {
            addCriterion("COH_RC5 >=", value, "rc5");
            return (Criteria) this;
        }

        public Criteria andRc5LessThan(String value) {
            addCriterion("COH_RC5 <", value, "rc5");
            return (Criteria) this;
        }

        public Criteria andRc5LessThanOrEqualTo(String value) {
            addCriterion("COH_RC5 <=", value, "rc5");
            return (Criteria) this;
        }

        public Criteria andRc5Like(String value) {
            addCriterion("COH_RC5 like", value, "rc5");
            return (Criteria) this;
        }

        public Criteria andRc5NotLike(String value) {
            addCriterion("COH_RC5 not like", value, "rc5");
            return (Criteria) this;
        }

        public Criteria andRc5In(List<String> values) {
            addCriterion("COH_RC5 in", values, "rc5");
            return (Criteria) this;
        }

        public Criteria andRc5NotIn(List<String> values) {
            addCriterion("COH_RC5 not in", values, "rc5");
            return (Criteria) this;
        }

        public Criteria andRc5Between(String value1, String value2) {
            addCriterion("COH_RC5 between", value1, value2, "rc5");
            return (Criteria) this;
        }

        public Criteria andRc5NotBetween(String value1, String value2) {
            addCriterion("COH_RC5 not between", value1, value2, "rc5");
            return (Criteria) this;
        }

        public Criteria andIdtIsNull() {
            addCriterion("COH_IDT is null");
            return (Criteria) this;
        }

        public Criteria andIdtIsNotNull() {
            addCriterion("COH_IDT is not null");
            return (Criteria) this;
        }

        public Criteria andIdtEqualTo(Date value) {
            addCriterion("COH_IDT =", value, "idt");
            return (Criteria) this;
        }

        public Criteria andIdtNotEqualTo(Date value) {
            addCriterion("COH_IDT <>", value, "idt");
            return (Criteria) this;
        }

        public Criteria andIdtGreaterThan(Date value) {
            addCriterion("COH_IDT >", value, "idt");
            return (Criteria) this;
        }

        public Criteria andIdtGreaterThanOrEqualTo(Date value) {
            addCriterion("COH_IDT >=", value, "idt");
            return (Criteria) this;
        }

        public Criteria andIdtLessThan(Date value) {
            addCriterion("COH_IDT <", value, "idt");
            return (Criteria) this;
        }

        public Criteria andIdtLessThanOrEqualTo(Date value) {
            addCriterion("COH_IDT <=", value, "idt");
            return (Criteria) this;
        }

        public Criteria andIdtIn(List<Date> values) {
            addCriterion("COH_IDT in", values, "idt");
            return (Criteria) this;
        }

        public Criteria andIdtNotIn(List<Date> values) {
            addCriterion("COH_IDT not in", values, "idt");
            return (Criteria) this;
        }

        public Criteria andIdtBetween(Date value1, Date value2) {
            addCriterion("COH_IDT between", value1, value2, "idt");
            return (Criteria) this;
        }

        public Criteria andIdtNotBetween(Date value1, Date value2) {
            addCriterion("COH_IDT not between", value1, value2, "idt");
            return (Criteria) this;
        }

        public Criteria andIdLikeInsensitive(String value) {
            addCriterion("upper(COH_ID) like", value.toUpperCase(), "id");
            return (Criteria) this;
        }

        public Criteria andUidLikeInsensitive(String value) {
            addCriterion("upper(COH_UID) like", value.toUpperCase(), "uid");
            return (Criteria) this;
        }

        public Criteria andCheckunitLikeInsensitive(String value) {
            addCriterion("upper(COH_CHECKUNIT) like", value.toUpperCase(), "checkunit");
            return (Criteria) this;
        }

        public Criteria andCheckpersonLikeInsensitive(String value) {
            addCriterion("upper(COH_CHECKPERSON) like", value.toUpperCase(), "checkperson");
            return (Criteria) this;
        }

        public Criteria andCheckoptionsLikeInsensitive(String value) {
            addCriterion("upper(COH_CHECKOPTIONS) like", value.toUpperCase(), "checkoptions");
            return (Criteria) this;
        }

        public Criteria andChecktypeLikeInsensitive(String value) {
            addCriterion("upper(COH_CHECKTYPE) like", value.toUpperCase(), "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktimenextLikeInsensitive(String value) {
            addCriterion("upper(COH_CHECKTIMENEXT) like", value.toUpperCase(), "checktimenext");
            return (Criteria) this;
        }

        public Criteria andChecktimeLikeInsensitive(String value) {
            addCriterion("upper(COH_CHECKTIME) like", value.toUpperCase(), "checktime");
            return (Criteria) this;
        }

        public Criteria andOrgnameLikeInsensitive(String value) {
            addCriterion("upper(COH_ORGNAME) like", value.toUpperCase(), "orgname");
            return (Criteria) this;
        }

        public Criteria andScopeLikeInsensitive(String value) {
            addCriterion("upper(COH_SCOPE) like", value.toUpperCase(), "scope");
            return (Criteria) this;
        }

        public Criteria andRc1LikeInsensitive(String value) {
            addCriterion("upper(COH_RC1) like", value.toUpperCase(), "rc1");
            return (Criteria) this;
        }

        public Criteria andRc2LikeInsensitive(String value) {
            addCriterion("upper(COH_RC2) like", value.toUpperCase(), "rc2");
            return (Criteria) this;
        }

        public Criteria andRc5LikeInsensitive(String value) {
            addCriterion("upper(COH_RC5) like", value.toUpperCase(), "rc5");
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