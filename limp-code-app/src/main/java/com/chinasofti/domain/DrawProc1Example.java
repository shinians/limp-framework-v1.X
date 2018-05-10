package com.chinasofti.domain;

import com.limp.framework.core.bean.Pager;

import java.util.ArrayList;
import java.util.List;

public class DrawProc1Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Pager page;

    public DrawProc1Example() {
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
            addCriterion("CDP_ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("CDP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("CDP_ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("CDP_ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("CDP_ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("CDP_ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("CDP_ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("CDP_ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("CDP_ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("CDP_ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("CDP_ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("CDP_ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("CDP_ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("CDP_ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUidIsNull() {
            addCriterion("CDP_UID is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("CDP_UID is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(String value) {
            addCriterion("CDP_UID =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(String value) {
            addCriterion("CDP_UID <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(String value) {
            addCriterion("CDP_UID >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(String value) {
            addCriterion("CDP_UID >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(String value) {
            addCriterion("CDP_UID <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(String value) {
            addCriterion("CDP_UID <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLike(String value) {
            addCriterion("CDP_UID like", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotLike(String value) {
            addCriterion("CDP_UID not like", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<String> values) {
            addCriterion("CDP_UID in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<String> values) {
            addCriterion("CDP_UID not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(String value1, String value2) {
            addCriterion("CDP_UID between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(String value1, String value2) {
            addCriterion("CDP_UID not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andProcuidIsNull() {
            addCriterion("CDP_PROCUID is null");
            return (Criteria) this;
        }

        public Criteria andProcuidIsNotNull() {
            addCriterion("CDP_PROCUID is not null");
            return (Criteria) this;
        }

        public Criteria andProcuidEqualTo(String value) {
            addCriterion("CDP_PROCUID =", value, "procuid");
            return (Criteria) this;
        }

        public Criteria andProcuidNotEqualTo(String value) {
            addCriterion("CDP_PROCUID <>", value, "procuid");
            return (Criteria) this;
        }

        public Criteria andProcuidGreaterThan(String value) {
            addCriterion("CDP_PROCUID >", value, "procuid");
            return (Criteria) this;
        }

        public Criteria andProcuidGreaterThanOrEqualTo(String value) {
            addCriterion("CDP_PROCUID >=", value, "procuid");
            return (Criteria) this;
        }

        public Criteria andProcuidLessThan(String value) {
            addCriterion("CDP_PROCUID <", value, "procuid");
            return (Criteria) this;
        }

        public Criteria andProcuidLessThanOrEqualTo(String value) {
            addCriterion("CDP_PROCUID <=", value, "procuid");
            return (Criteria) this;
        }

        public Criteria andProcuidLike(String value) {
            addCriterion("CDP_PROCUID like", value, "procuid");
            return (Criteria) this;
        }

        public Criteria andProcuidNotLike(String value) {
            addCriterion("CDP_PROCUID not like", value, "procuid");
            return (Criteria) this;
        }

        public Criteria andProcuidIn(List<String> values) {
            addCriterion("CDP_PROCUID in", values, "procuid");
            return (Criteria) this;
        }

        public Criteria andProcuidNotIn(List<String> values) {
            addCriterion("CDP_PROCUID not in", values, "procuid");
            return (Criteria) this;
        }

        public Criteria andProcuidBetween(String value1, String value2) {
            addCriterion("CDP_PROCUID between", value1, value2, "procuid");
            return (Criteria) this;
        }

        public Criteria andProcuidNotBetween(String value1, String value2) {
            addCriterion("CDP_PROCUID not between", value1, value2, "procuid");
            return (Criteria) this;
        }

        public Criteria andDrawnoIsNull() {
            addCriterion("CDP_DRAWNO is null");
            return (Criteria) this;
        }

        public Criteria andDrawnoIsNotNull() {
            addCriterion("CDP_DRAWNO is not null");
            return (Criteria) this;
        }

        public Criteria andDrawnoEqualTo(String value) {
            addCriterion("CDP_DRAWNO =", value, "drawno");
            return (Criteria) this;
        }

        public Criteria andDrawnoNotEqualTo(String value) {
            addCriterion("CDP_DRAWNO <>", value, "drawno");
            return (Criteria) this;
        }

        public Criteria andDrawnoGreaterThan(String value) {
            addCriterion("CDP_DRAWNO >", value, "drawno");
            return (Criteria) this;
        }

        public Criteria andDrawnoGreaterThanOrEqualTo(String value) {
            addCriterion("CDP_DRAWNO >=", value, "drawno");
            return (Criteria) this;
        }

        public Criteria andDrawnoLessThan(String value) {
            addCriterion("CDP_DRAWNO <", value, "drawno");
            return (Criteria) this;
        }

        public Criteria andDrawnoLessThanOrEqualTo(String value) {
            addCriterion("CDP_DRAWNO <=", value, "drawno");
            return (Criteria) this;
        }

        public Criteria andDrawnoLike(String value) {
            addCriterion("CDP_DRAWNO like", value, "drawno");
            return (Criteria) this;
        }

        public Criteria andDrawnoNotLike(String value) {
            addCriterion("CDP_DRAWNO not like", value, "drawno");
            return (Criteria) this;
        }

        public Criteria andDrawnoIn(List<String> values) {
            addCriterion("CDP_DRAWNO in", values, "drawno");
            return (Criteria) this;
        }

        public Criteria andDrawnoNotIn(List<String> values) {
            addCriterion("CDP_DRAWNO not in", values, "drawno");
            return (Criteria) this;
        }

        public Criteria andDrawnoBetween(String value1, String value2) {
            addCriterion("CDP_DRAWNO between", value1, value2, "drawno");
            return (Criteria) this;
        }

        public Criteria andDrawnoNotBetween(String value1, String value2) {
            addCriterion("CDP_DRAWNO not between", value1, value2, "drawno");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNull() {
            addCriterion("CDP_COMPANY is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNotNull() {
            addCriterion("CDP_COMPANY is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyEqualTo(String value) {
            addCriterion("CDP_COMPANY =", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotEqualTo(String value) {
            addCriterion("CDP_COMPANY <>", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThan(String value) {
            addCriterion("CDP_COMPANY >", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("CDP_COMPANY >=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThan(String value) {
            addCriterion("CDP_COMPANY <", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThanOrEqualTo(String value) {
            addCriterion("CDP_COMPANY <=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLike(String value) {
            addCriterion("CDP_COMPANY like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotLike(String value) {
            addCriterion("CDP_COMPANY not like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyIn(List<String> values) {
            addCriterion("CDP_COMPANY in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotIn(List<String> values) {
            addCriterion("CDP_COMPANY not in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyBetween(String value1, String value2) {
            addCriterion("CDP_COMPANY between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotBetween(String value1, String value2) {
            addCriterion("CDP_COMPANY not between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("CDP_TIME is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("CDP_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(String value) {
            addCriterion("CDP_TIME =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(String value) {
            addCriterion("CDP_TIME <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(String value) {
            addCriterion("CDP_TIME >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(String value) {
            addCriterion("CDP_TIME >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(String value) {
            addCriterion("CDP_TIME <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(String value) {
            addCriterion("CDP_TIME <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLike(String value) {
            addCriterion("CDP_TIME like", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotLike(String value) {
            addCriterion("CDP_TIME not like", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<String> values) {
            addCriterion("CDP_TIME in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<String> values) {
            addCriterion("CDP_TIME not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(String value1, String value2) {
            addCriterion("CDP_TIME between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(String value1, String value2) {
            addCriterion("CDP_TIME not between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andApprocompanyIsNull() {
            addCriterion("CDP_APPROCOMPANY is null");
            return (Criteria) this;
        }

        public Criteria andApprocompanyIsNotNull() {
            addCriterion("CDP_APPROCOMPANY is not null");
            return (Criteria) this;
        }

        public Criteria andApprocompanyEqualTo(String value) {
            addCriterion("CDP_APPROCOMPANY =", value, "approcompany");
            return (Criteria) this;
        }

        public Criteria andApprocompanyNotEqualTo(String value) {
            addCriterion("CDP_APPROCOMPANY <>", value, "approcompany");
            return (Criteria) this;
        }

        public Criteria andApprocompanyGreaterThan(String value) {
            addCriterion("CDP_APPROCOMPANY >", value, "approcompany");
            return (Criteria) this;
        }

        public Criteria andApprocompanyGreaterThanOrEqualTo(String value) {
            addCriterion("CDP_APPROCOMPANY >=", value, "approcompany");
            return (Criteria) this;
        }

        public Criteria andApprocompanyLessThan(String value) {
            addCriterion("CDP_APPROCOMPANY <", value, "approcompany");
            return (Criteria) this;
        }

        public Criteria andApprocompanyLessThanOrEqualTo(String value) {
            addCriterion("CDP_APPROCOMPANY <=", value, "approcompany");
            return (Criteria) this;
        }

        public Criteria andApprocompanyLike(String value) {
            addCriterion("CDP_APPROCOMPANY like", value, "approcompany");
            return (Criteria) this;
        }

        public Criteria andApprocompanyNotLike(String value) {
            addCriterion("CDP_APPROCOMPANY not like", value, "approcompany");
            return (Criteria) this;
        }

        public Criteria andApprocompanyIn(List<String> values) {
            addCriterion("CDP_APPROCOMPANY in", values, "approcompany");
            return (Criteria) this;
        }

        public Criteria andApprocompanyNotIn(List<String> values) {
            addCriterion("CDP_APPROCOMPANY not in", values, "approcompany");
            return (Criteria) this;
        }

        public Criteria andApprocompanyBetween(String value1, String value2) {
            addCriterion("CDP_APPROCOMPANY between", value1, value2, "approcompany");
            return (Criteria) this;
        }

        public Criteria andApprocompanyNotBetween(String value1, String value2) {
            addCriterion("CDP_APPROCOMPANY not between", value1, value2, "approcompany");
            return (Criteria) this;
        }

        public Criteria andInturnIsNull() {
            addCriterion("CDP_INTURN is null");
            return (Criteria) this;
        }

        public Criteria andInturnIsNotNull() {
            addCriterion("CDP_INTURN is not null");
            return (Criteria) this;
        }

        public Criteria andInturnEqualTo(String value) {
            addCriterion("CDP_INTURN =", value, "inturn");
            return (Criteria) this;
        }

        public Criteria andInturnNotEqualTo(String value) {
            addCriterion("CDP_INTURN <>", value, "inturn");
            return (Criteria) this;
        }

        public Criteria andInturnGreaterThan(String value) {
            addCriterion("CDP_INTURN >", value, "inturn");
            return (Criteria) this;
        }

        public Criteria andInturnGreaterThanOrEqualTo(String value) {
            addCriterion("CDP_INTURN >=", value, "inturn");
            return (Criteria) this;
        }

        public Criteria andInturnLessThan(String value) {
            addCriterion("CDP_INTURN <", value, "inturn");
            return (Criteria) this;
        }

        public Criteria andInturnLessThanOrEqualTo(String value) {
            addCriterion("CDP_INTURN <=", value, "inturn");
            return (Criteria) this;
        }

        public Criteria andInturnLike(String value) {
            addCriterion("CDP_INTURN like", value, "inturn");
            return (Criteria) this;
        }

        public Criteria andInturnNotLike(String value) {
            addCriterion("CDP_INTURN not like", value, "inturn");
            return (Criteria) this;
        }

        public Criteria andInturnIn(List<String> values) {
            addCriterion("CDP_INTURN in", values, "inturn");
            return (Criteria) this;
        }

        public Criteria andInturnNotIn(List<String> values) {
            addCriterion("CDP_INTURN not in", values, "inturn");
            return (Criteria) this;
        }

        public Criteria andInturnBetween(String value1, String value2) {
            addCriterion("CDP_INTURN between", value1, value2, "inturn");
            return (Criteria) this;
        }

        public Criteria andInturnNotBetween(String value1, String value2) {
            addCriterion("CDP_INTURN not between", value1, value2, "inturn");
            return (Criteria) this;
        }

        public Criteria andBigchangeIsNull() {
            addCriterion("CDP_BIGCHANGE is null");
            return (Criteria) this;
        }

        public Criteria andBigchangeIsNotNull() {
            addCriterion("CDP_BIGCHANGE is not null");
            return (Criteria) this;
        }

        public Criteria andBigchangeEqualTo(String value) {
            addCriterion("CDP_BIGCHANGE =", value, "bigchange");
            return (Criteria) this;
        }

        public Criteria andBigchangeNotEqualTo(String value) {
            addCriterion("CDP_BIGCHANGE <>", value, "bigchange");
            return (Criteria) this;
        }

        public Criteria andBigchangeGreaterThan(String value) {
            addCriterion("CDP_BIGCHANGE >", value, "bigchange");
            return (Criteria) this;
        }

        public Criteria andBigchangeGreaterThanOrEqualTo(String value) {
            addCriterion("CDP_BIGCHANGE >=", value, "bigchange");
            return (Criteria) this;
        }

        public Criteria andBigchangeLessThan(String value) {
            addCriterion("CDP_BIGCHANGE <", value, "bigchange");
            return (Criteria) this;
        }

        public Criteria andBigchangeLessThanOrEqualTo(String value) {
            addCriterion("CDP_BIGCHANGE <=", value, "bigchange");
            return (Criteria) this;
        }

        public Criteria andBigchangeLike(String value) {
            addCriterion("CDP_BIGCHANGE like", value, "bigchange");
            return (Criteria) this;
        }

        public Criteria andBigchangeNotLike(String value) {
            addCriterion("CDP_BIGCHANGE not like", value, "bigchange");
            return (Criteria) this;
        }

        public Criteria andBigchangeIn(List<String> values) {
            addCriterion("CDP_BIGCHANGE in", values, "bigchange");
            return (Criteria) this;
        }

        public Criteria andBigchangeNotIn(List<String> values) {
            addCriterion("CDP_BIGCHANGE not in", values, "bigchange");
            return (Criteria) this;
        }

        public Criteria andBigchangeBetween(String value1, String value2) {
            addCriterion("CDP_BIGCHANGE between", value1, value2, "bigchange");
            return (Criteria) this;
        }

        public Criteria andBigchangeNotBetween(String value1, String value2) {
            addCriterion("CDP_BIGCHANGE not between", value1, value2, "bigchange");
            return (Criteria) this;
        }

        public Criteria andBigchangetypeIsNull() {
            addCriterion("CDP_BIGCHANGETYPE is null");
            return (Criteria) this;
        }

        public Criteria andBigchangetypeIsNotNull() {
            addCriterion("CDP_BIGCHANGETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andBigchangetypeEqualTo(String value) {
            addCriterion("CDP_BIGCHANGETYPE =", value, "bigchangetype");
            return (Criteria) this;
        }

        public Criteria andBigchangetypeNotEqualTo(String value) {
            addCriterion("CDP_BIGCHANGETYPE <>", value, "bigchangetype");
            return (Criteria) this;
        }

        public Criteria andBigchangetypeGreaterThan(String value) {
            addCriterion("CDP_BIGCHANGETYPE >", value, "bigchangetype");
            return (Criteria) this;
        }

        public Criteria andBigchangetypeGreaterThanOrEqualTo(String value) {
            addCriterion("CDP_BIGCHANGETYPE >=", value, "bigchangetype");
            return (Criteria) this;
        }

        public Criteria andBigchangetypeLessThan(String value) {
            addCriterion("CDP_BIGCHANGETYPE <", value, "bigchangetype");
            return (Criteria) this;
        }

        public Criteria andBigchangetypeLessThanOrEqualTo(String value) {
            addCriterion("CDP_BIGCHANGETYPE <=", value, "bigchangetype");
            return (Criteria) this;
        }

        public Criteria andBigchangetypeLike(String value) {
            addCriterion("CDP_BIGCHANGETYPE like", value, "bigchangetype");
            return (Criteria) this;
        }

        public Criteria andBigchangetypeNotLike(String value) {
            addCriterion("CDP_BIGCHANGETYPE not like", value, "bigchangetype");
            return (Criteria) this;
        }

        public Criteria andBigchangetypeIn(List<String> values) {
            addCriterion("CDP_BIGCHANGETYPE in", values, "bigchangetype");
            return (Criteria) this;
        }

        public Criteria andBigchangetypeNotIn(List<String> values) {
            addCriterion("CDP_BIGCHANGETYPE not in", values, "bigchangetype");
            return (Criteria) this;
        }

        public Criteria andBigchangetypeBetween(String value1, String value2) {
            addCriterion("CDP_BIGCHANGETYPE between", value1, value2, "bigchangetype");
            return (Criteria) this;
        }

        public Criteria andBigchangetypeNotBetween(String value1, String value2) {
            addCriterion("CDP_BIGCHANGETYPE not between", value1, value2, "bigchangetype");
            return (Criteria) this;
        }


        public Criteria andIdLikeInsensitive(String value) {
            addCriterion("upper(CDP_ID) like", value.toUpperCase(), "id");
            return (Criteria) this;
        }

        public Criteria andUidLikeInsensitive(String value) {
            addCriterion("upper(CDP_UID) like", value.toUpperCase(), "uid");
            return (Criteria) this;
        }

        public Criteria andProcuidLikeInsensitive(String value) {
            addCriterion("upper(CDP_PROCUID) like", value.toUpperCase(), "procuid");
            return (Criteria) this;
        }

        public Criteria andDrawnoLikeInsensitive(String value) {
            addCriterion("upper(CDP_DRAWNO) like", value.toUpperCase(), "drawno");
            return (Criteria) this;
        }

        public Criteria andCompanyLikeInsensitive(String value) {
            addCriterion("upper(CDP_COMPANY) like", value.toUpperCase(), "company");
            return (Criteria) this;
        }

        public Criteria andTimeLikeInsensitive(String value) {
            addCriterion("upper(CDP_TIME) like", value.toUpperCase(), "time");
            return (Criteria) this;
        }

        public Criteria andApprocompanyLikeInsensitive(String value) {
            addCriterion("upper(CDP_APPROCOMPANY) like", value.toUpperCase(), "approcompany");
            return (Criteria) this;
        }

        public Criteria andInturnLikeInsensitive(String value) {
            addCriterion("upper(CDP_INTURN) like", value.toUpperCase(), "inturn");
            return (Criteria) this;
        }

        public Criteria andBigchangeLikeInsensitive(String value) {
            addCriterion("upper(CDP_BIGCHANGE) like", value.toUpperCase(), "bigchange");
            return (Criteria) this;
        }

        public Criteria andBigchangetypeLikeInsensitive(String value) {
            addCriterion("upper(CDP_BIGCHANGETYPE) like", value.toUpperCase(), "bigchangetype");
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