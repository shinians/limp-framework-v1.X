package com.chinasofti.domain;

import com.limp.framework.core.bean.Pager;

import java.util.ArrayList;
import java.util.List;

public class DrawProc4Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Pager page;

    public DrawProc4Example() {
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

        public Criteria andPeopleIsNull() {
            addCriterion("CDP_PEOPLE is null");
            return (Criteria) this;
        }

        public Criteria andPeopleIsNotNull() {
            addCriterion("CDP_PEOPLE is not null");
            return (Criteria) this;
        }

        public Criteria andPeopleEqualTo(String value) {
            addCriterion("CDP_PEOPLE =", value, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleNotEqualTo(String value) {
            addCriterion("CDP_PEOPLE <>", value, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleGreaterThan(String value) {
            addCriterion("CDP_PEOPLE >", value, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleGreaterThanOrEqualTo(String value) {
            addCriterion("CDP_PEOPLE >=", value, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleLessThan(String value) {
            addCriterion("CDP_PEOPLE <", value, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleLessThanOrEqualTo(String value) {
            addCriterion("CDP_PEOPLE <=", value, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleLike(String value) {
            addCriterion("CDP_PEOPLE like", value, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleNotLike(String value) {
            addCriterion("CDP_PEOPLE not like", value, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleIn(List<String> values) {
            addCriterion("CDP_PEOPLE in", values, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleNotIn(List<String> values) {
            addCriterion("CDP_PEOPLE not in", values, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleBetween(String value1, String value2) {
            addCriterion("CDP_PEOPLE between", value1, value2, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleNotBetween(String value1, String value2) {
            addCriterion("CDP_PEOPLE not between", value1, value2, "people");
            return (Criteria) this;
        }

        public Criteria andAccepttimeIsNull() {
            addCriterion("CDP_ACCEPTTIME is null");
            return (Criteria) this;
        }

        public Criteria andAccepttimeIsNotNull() {
            addCriterion("CDP_ACCEPTTIME is not null");
            return (Criteria) this;
        }

        public Criteria andAccepttimeEqualTo(String value) {
            addCriterion("CDP_ACCEPTTIME =", value, "accepttime");
            return (Criteria) this;
        }

        public Criteria andAccepttimeNotEqualTo(String value) {
            addCriterion("CDP_ACCEPTTIME <>", value, "accepttime");
            return (Criteria) this;
        }

        public Criteria andAccepttimeGreaterThan(String value) {
            addCriterion("CDP_ACCEPTTIME >", value, "accepttime");
            return (Criteria) this;
        }

        public Criteria andAccepttimeGreaterThanOrEqualTo(String value) {
            addCriterion("CDP_ACCEPTTIME >=", value, "accepttime");
            return (Criteria) this;
        }

        public Criteria andAccepttimeLessThan(String value) {
            addCriterion("CDP_ACCEPTTIME <", value, "accepttime");
            return (Criteria) this;
        }

        public Criteria andAccepttimeLessThanOrEqualTo(String value) {
            addCriterion("CDP_ACCEPTTIME <=", value, "accepttime");
            return (Criteria) this;
        }

        public Criteria andAccepttimeLike(String value) {
            addCriterion("CDP_ACCEPTTIME like", value, "accepttime");
            return (Criteria) this;
        }

        public Criteria andAccepttimeNotLike(String value) {
            addCriterion("CDP_ACCEPTTIME not like", value, "accepttime");
            return (Criteria) this;
        }

        public Criteria andAccepttimeIn(List<String> values) {
            addCriterion("CDP_ACCEPTTIME in", values, "accepttime");
            return (Criteria) this;
        }

        public Criteria andAccepttimeNotIn(List<String> values) {
            addCriterion("CDP_ACCEPTTIME not in", values, "accepttime");
            return (Criteria) this;
        }

        public Criteria andAccepttimeBetween(String value1, String value2) {
            addCriterion("CDP_ACCEPTTIME between", value1, value2, "accepttime");
            return (Criteria) this;
        }

        public Criteria andAccepttimeNotBetween(String value1, String value2) {
            addCriterion("CDP_ACCEPTTIME not between", value1, value2, "accepttime");
            return (Criteria) this;
        }

        public Criteria andAcceptsuggIsNull() {
            addCriterion("CDP_ACCEPTSUGG is null");
            return (Criteria) this;
        }

        public Criteria andAcceptsuggIsNotNull() {
            addCriterion("CDP_ACCEPTSUGG is not null");
            return (Criteria) this;
        }

        public Criteria andAcceptsuggEqualTo(String value) {
            addCriterion("CDP_ACCEPTSUGG =", value, "acceptsugg");
            return (Criteria) this;
        }

        public Criteria andAcceptsuggNotEqualTo(String value) {
            addCriterion("CDP_ACCEPTSUGG <>", value, "acceptsugg");
            return (Criteria) this;
        }

        public Criteria andAcceptsuggGreaterThan(String value) {
            addCriterion("CDP_ACCEPTSUGG >", value, "acceptsugg");
            return (Criteria) this;
        }

        public Criteria andAcceptsuggGreaterThanOrEqualTo(String value) {
            addCriterion("CDP_ACCEPTSUGG >=", value, "acceptsugg");
            return (Criteria) this;
        }

        public Criteria andAcceptsuggLessThan(String value) {
            addCriterion("CDP_ACCEPTSUGG <", value, "acceptsugg");
            return (Criteria) this;
        }

        public Criteria andAcceptsuggLessThanOrEqualTo(String value) {
            addCriterion("CDP_ACCEPTSUGG <=", value, "acceptsugg");
            return (Criteria) this;
        }

        public Criteria andAcceptsuggLike(String value) {
            addCriterion("CDP_ACCEPTSUGG like", value, "acceptsugg");
            return (Criteria) this;
        }

        public Criteria andAcceptsuggNotLike(String value) {
            addCriterion("CDP_ACCEPTSUGG not like", value, "acceptsugg");
            return (Criteria) this;
        }

        public Criteria andAcceptsuggIn(List<String> values) {
            addCriterion("CDP_ACCEPTSUGG in", values, "acceptsugg");
            return (Criteria) this;
        }

        public Criteria andAcceptsuggNotIn(List<String> values) {
            addCriterion("CDP_ACCEPTSUGG not in", values, "acceptsugg");
            return (Criteria) this;
        }

        public Criteria andAcceptsuggBetween(String value1, String value2) {
            addCriterion("CDP_ACCEPTSUGG between", value1, value2, "acceptsugg");
            return (Criteria) this;
        }

        public Criteria andAcceptsuggNotBetween(String value1, String value2) {
            addCriterion("CDP_ACCEPTSUGG not between", value1, value2, "acceptsugg");
            return (Criteria) this;
        }

        public Criteria andAcceptintimeEndIsNull() {
            addCriterion("CDP_ACCEPTINTIME_END is null");
            return (Criteria) this;
        }

        public Criteria andAcceptintimeEndIsNotNull() {
            addCriterion("CDP_ACCEPTINTIME_END is not null");
            return (Criteria) this;
        }

        public Criteria andAcceptintimeEndEqualTo(String value) {
            addCriterion("CDP_ACCEPTINTIME_END =", value, "acceptintimeEnd");
            return (Criteria) this;
        }

        public Criteria andAcceptintimeEndNotEqualTo(String value) {
            addCriterion("CDP_ACCEPTINTIME_END <>", value, "acceptintimeEnd");
            return (Criteria) this;
        }

        public Criteria andAcceptintimeEndGreaterThan(String value) {
            addCriterion("CDP_ACCEPTINTIME_END >", value, "acceptintimeEnd");
            return (Criteria) this;
        }

        public Criteria andAcceptintimeEndGreaterThanOrEqualTo(String value) {
            addCriterion("CDP_ACCEPTINTIME_END >=", value, "acceptintimeEnd");
            return (Criteria) this;
        }

        public Criteria andAcceptintimeEndLessThan(String value) {
            addCriterion("CDP_ACCEPTINTIME_END <", value, "acceptintimeEnd");
            return (Criteria) this;
        }

        public Criteria andAcceptintimeEndLessThanOrEqualTo(String value) {
            addCriterion("CDP_ACCEPTINTIME_END <=", value, "acceptintimeEnd");
            return (Criteria) this;
        }

        public Criteria andAcceptintimeEndLike(String value) {
            addCriterion("CDP_ACCEPTINTIME_END like", value, "acceptintimeEnd");
            return (Criteria) this;
        }

        public Criteria andAcceptintimeEndNotLike(String value) {
            addCriterion("CDP_ACCEPTINTIME_END not like", value, "acceptintimeEnd");
            return (Criteria) this;
        }

        public Criteria andAcceptintimeEndIn(List<String> values) {
            addCriterion("CDP_ACCEPTINTIME_END in", values, "acceptintimeEnd");
            return (Criteria) this;
        }

        public Criteria andAcceptintimeEndNotIn(List<String> values) {
            addCriterion("CDP_ACCEPTINTIME_END not in", values, "acceptintimeEnd");
            return (Criteria) this;
        }

        public Criteria andAcceptintimeEndBetween(String value1, String value2) {
            addCriterion("CDP_ACCEPTINTIME_END between", value1, value2, "acceptintimeEnd");
            return (Criteria) this;
        }

        public Criteria andAcceptintimeEndNotBetween(String value1, String value2) {
            addCriterion("CDP_ACCEPTINTIME_END not between", value1, value2, "acceptintimeEnd");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNull() {
            addCriterion("CDP_MONEY is null");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNotNull() {
            addCriterion("CDP_MONEY is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyEqualTo(String value) {
            addCriterion("CDP_MONEY =", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotEqualTo(String value) {
            addCriterion("CDP_MONEY <>", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThan(String value) {
            addCriterion("CDP_MONEY >", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThanOrEqualTo(String value) {
            addCriterion("CDP_MONEY >=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThan(String value) {
            addCriterion("CDP_MONEY <", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThanOrEqualTo(String value) {
            addCriterion("CDP_MONEY <=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLike(String value) {
            addCriterion("CDP_MONEY like", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotLike(String value) {
            addCriterion("CDP_MONEY not like", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyIn(List<String> values) {
            addCriterion("CDP_MONEY in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotIn(List<String> values) {
            addCriterion("CDP_MONEY not in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyBetween(String value1, String value2) {
            addCriterion("CDP_MONEY between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotBetween(String value1, String value2) {
            addCriterion("CDP_MONEY not between", value1, value2, "money");
            return (Criteria) this;
        }


        public Criteria andAcceptintimeStartIsNull() {
            addCriterion("CDP_ACCEPTINTIME_START is null");
            return (Criteria) this;
        }

        public Criteria andAcceptintimeStartIsNotNull() {
            addCriterion("CDP_ACCEPTINTIME_START is not null");
            return (Criteria) this;
        }

        public Criteria andAcceptintimeStartEqualTo(String value) {
            addCriterion("CDP_ACCEPTINTIME_START =", value, "acceptintimeStart");
            return (Criteria) this;
        }

        public Criteria andAcceptintimeStartNotEqualTo(String value) {
            addCriterion("CDP_ACCEPTINTIME_START <>", value, "acceptintimeStart");
            return (Criteria) this;
        }

        public Criteria andAcceptintimeStartGreaterThan(String value) {
            addCriterion("CDP_ACCEPTINTIME_START >", value, "acceptintimeStart");
            return (Criteria) this;
        }

        public Criteria andAcceptintimeStartGreaterThanOrEqualTo(String value) {
            addCriterion("CDP_ACCEPTINTIME_START >=", value, "acceptintimeStart");
            return (Criteria) this;
        }

        public Criteria andAcceptintimeStartLessThan(String value) {
            addCriterion("CDP_ACCEPTINTIME_START <", value, "acceptintimeStart");
            return (Criteria) this;
        }

        public Criteria andAcceptintimeStartLessThanOrEqualTo(String value) {
            addCriterion("CDP_ACCEPTINTIME_START <=", value, "acceptintimeStart");
            return (Criteria) this;
        }

        public Criteria andAcceptintimeStartLike(String value) {
            addCriterion("CDP_ACCEPTINTIME_START like", value, "acceptintimeStart");
            return (Criteria) this;
        }

        public Criteria andAcceptintimeStartNotLike(String value) {
            addCriterion("CDP_ACCEPTINTIME_START not like", value, "acceptintimeStart");
            return (Criteria) this;
        }

        public Criteria andAcceptintimeStartIn(List<String> values) {
            addCriterion("CDP_ACCEPTINTIME_START in", values, "acceptintimeStart");
            return (Criteria) this;
        }

        public Criteria andAcceptintimeStartNotIn(List<String> values) {
            addCriterion("CDP_ACCEPTINTIME_START not in", values, "acceptintimeStart");
            return (Criteria) this;
        }

        public Criteria andAcceptintimeStartBetween(String value1, String value2) {
            addCriterion("CDP_ACCEPTINTIME_START between", value1, value2, "acceptintimeStart");
            return (Criteria) this;
        }

        public Criteria andAcceptintimeStartNotBetween(String value1, String value2) {
            addCriterion("CDP_ACCEPTINTIME_START not between", value1, value2, "acceptintimeStart");
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

        public Criteria andPeopleLikeInsensitive(String value) {
            addCriterion("upper(CDP_PEOPLE) like", value.toUpperCase(), "people");
            return (Criteria) this;
        }

        public Criteria andAccepttimeLikeInsensitive(String value) {
            addCriterion("upper(CDP_ACCEPTTIME) like", value.toUpperCase(), "accepttime");
            return (Criteria) this;
        }

        public Criteria andAcceptsuggLikeInsensitive(String value) {
            addCriterion("upper(CDP_ACCEPTSUGG) like", value.toUpperCase(), "acceptsugg");
            return (Criteria) this;
        }

        public Criteria andAcceptintimeEndLikeInsensitive(String value) {
            addCriterion("upper(CDP_ACCEPTINTIME_END) like", value.toUpperCase(), "acceptintimeEnd");
            return (Criteria) this;
        }

        public Criteria andMoneyLikeInsensitive(String value) {
            addCriterion("upper(CDP_MONEY) like", value.toUpperCase(), "money");
            return (Criteria) this;
        }

        public Criteria andAcceptintimeStartLikeInsensitive(String value) {
            addCriterion("upper(CDP_ACCEPTINTIME_START) like", value.toUpperCase(), "acceptintimeStart");
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