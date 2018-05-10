package com.chinasofti.domain;

import com.limp.framework.core.bean.Pager;

import java.util.ArrayList;
import java.util.List;

public class DrawProc3Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Pager page;

    public DrawProc3Example() {
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

        public Criteria andAcceptcountIsNull() {
            addCriterion("CDP_ACCEPTCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andAcceptcountIsNotNull() {
            addCriterion("CDP_ACCEPTCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andAcceptcountEqualTo(String value) {
            addCriterion("CDP_ACCEPTCOUNT =", value, "acceptcount");
            return (Criteria) this;
        }

        public Criteria andAcceptcountNotEqualTo(String value) {
            addCriterion("CDP_ACCEPTCOUNT <>", value, "acceptcount");
            return (Criteria) this;
        }

        public Criteria andAcceptcountGreaterThan(String value) {
            addCriterion("CDP_ACCEPTCOUNT >", value, "acceptcount");
            return (Criteria) this;
        }

        public Criteria andAcceptcountGreaterThanOrEqualTo(String value) {
            addCriterion("CDP_ACCEPTCOUNT >=", value, "acceptcount");
            return (Criteria) this;
        }

        public Criteria andAcceptcountLessThan(String value) {
            addCriterion("CDP_ACCEPTCOUNT <", value, "acceptcount");
            return (Criteria) this;
        }

        public Criteria andAcceptcountLessThanOrEqualTo(String value) {
            addCriterion("CDP_ACCEPTCOUNT <=", value, "acceptcount");
            return (Criteria) this;
        }

        public Criteria andAcceptcountLike(String value) {
            addCriterion("CDP_ACCEPTCOUNT like", value, "acceptcount");
            return (Criteria) this;
        }

        public Criteria andAcceptcountNotLike(String value) {
            addCriterion("CDP_ACCEPTCOUNT not like", value, "acceptcount");
            return (Criteria) this;
        }

        public Criteria andAcceptcountIn(List<String> values) {
            addCriterion("CDP_ACCEPTCOUNT in", values, "acceptcount");
            return (Criteria) this;
        }

        public Criteria andAcceptcountNotIn(List<String> values) {
            addCriterion("CDP_ACCEPTCOUNT not in", values, "acceptcount");
            return (Criteria) this;
        }

        public Criteria andAcceptcountBetween(String value1, String value2) {
            addCriterion("CDP_ACCEPTCOUNT between", value1, value2, "acceptcount");
            return (Criteria) this;
        }

        public Criteria andAcceptcountNotBetween(String value1, String value2) {
            addCriterion("CDP_ACCEPTCOUNT not between", value1, value2, "acceptcount");
            return (Criteria) this;
        }

        public Criteria andFirsttimeIsNull() {
            addCriterion("CDP_FIRSTTIME is null");
            return (Criteria) this;
        }

        public Criteria andFirsttimeIsNotNull() {
            addCriterion("CDP_FIRSTTIME is not null");
            return (Criteria) this;
        }

        public Criteria andFirsttimeEqualTo(String value) {
            addCriterion("CDP_FIRSTTIME =", value, "firsttime");
            return (Criteria) this;
        }

        public Criteria andFirsttimeNotEqualTo(String value) {
            addCriterion("CDP_FIRSTTIME <>", value, "firsttime");
            return (Criteria) this;
        }

        public Criteria andFirsttimeGreaterThan(String value) {
            addCriterion("CDP_FIRSTTIME >", value, "firsttime");
            return (Criteria) this;
        }

        public Criteria andFirsttimeGreaterThanOrEqualTo(String value) {
            addCriterion("CDP_FIRSTTIME >=", value, "firsttime");
            return (Criteria) this;
        }

        public Criteria andFirsttimeLessThan(String value) {
            addCriterion("CDP_FIRSTTIME <", value, "firsttime");
            return (Criteria) this;
        }

        public Criteria andFirsttimeLessThanOrEqualTo(String value) {
            addCriterion("CDP_FIRSTTIME <=", value, "firsttime");
            return (Criteria) this;
        }

        public Criteria andFirsttimeLike(String value) {
            addCriterion("CDP_FIRSTTIME like", value, "firsttime");
            return (Criteria) this;
        }

        public Criteria andFirsttimeNotLike(String value) {
            addCriterion("CDP_FIRSTTIME not like", value, "firsttime");
            return (Criteria) this;
        }

        public Criteria andFirsttimeIn(List<String> values) {
            addCriterion("CDP_FIRSTTIME in", values, "firsttime");
            return (Criteria) this;
        }

        public Criteria andFirsttimeNotIn(List<String> values) {
            addCriterion("CDP_FIRSTTIME not in", values, "firsttime");
            return (Criteria) this;
        }

        public Criteria andFirsttimeBetween(String value1, String value2) {
            addCriterion("CDP_FIRSTTIME between", value1, value2, "firsttime");
            return (Criteria) this;
        }

        public Criteria andFirsttimeNotBetween(String value1, String value2) {
            addCriterion("CDP_FIRSTTIME not between", value1, value2, "firsttime");
            return (Criteria) this;
        }

        public Criteria andFirstsuggIsNull() {
            addCriterion("CDP_FIRSTSUGG is null");
            return (Criteria) this;
        }

        public Criteria andFirstsuggIsNotNull() {
            addCriterion("CDP_FIRSTSUGG is not null");
            return (Criteria) this;
        }

        public Criteria andFirstsuggEqualTo(String value) {
            addCriterion("CDP_FIRSTSUGG =", value, "firstsugg");
            return (Criteria) this;
        }

        public Criteria andFirstsuggNotEqualTo(String value) {
            addCriterion("CDP_FIRSTSUGG <>", value, "firstsugg");
            return (Criteria) this;
        }

        public Criteria andFirstsuggGreaterThan(String value) {
            addCriterion("CDP_FIRSTSUGG >", value, "firstsugg");
            return (Criteria) this;
        }

        public Criteria andFirstsuggGreaterThanOrEqualTo(String value) {
            addCriterion("CDP_FIRSTSUGG >=", value, "firstsugg");
            return (Criteria) this;
        }

        public Criteria andFirstsuggLessThan(String value) {
            addCriterion("CDP_FIRSTSUGG <", value, "firstsugg");
            return (Criteria) this;
        }

        public Criteria andFirstsuggLessThanOrEqualTo(String value) {
            addCriterion("CDP_FIRSTSUGG <=", value, "firstsugg");
            return (Criteria) this;
        }

        public Criteria andFirstsuggLike(String value) {
            addCriterion("CDP_FIRSTSUGG like", value, "firstsugg");
            return (Criteria) this;
        }

        public Criteria andFirstsuggNotLike(String value) {
            addCriterion("CDP_FIRSTSUGG not like", value, "firstsugg");
            return (Criteria) this;
        }

        public Criteria andFirstsuggIn(List<String> values) {
            addCriterion("CDP_FIRSTSUGG in", values, "firstsugg");
            return (Criteria) this;
        }

        public Criteria andFirstsuggNotIn(List<String> values) {
            addCriterion("CDP_FIRSTSUGG not in", values, "firstsugg");
            return (Criteria) this;
        }

        public Criteria andFirstsuggBetween(String value1, String value2) {
            addCriterion("CDP_FIRSTSUGG between", value1, value2, "firstsugg");
            return (Criteria) this;
        }

        public Criteria andFirstsuggNotBetween(String value1, String value2) {
            addCriterion("CDP_FIRSTSUGG not between", value1, value2, "firstsugg");
            return (Criteria) this;
        }

        public Criteria andRepeattimeIsNull() {
            addCriterion("CDP_REPEATTIME is null");
            return (Criteria) this;
        }

        public Criteria andRepeattimeIsNotNull() {
            addCriterion("CDP_REPEATTIME is not null");
            return (Criteria) this;
        }

        public Criteria andRepeattimeEqualTo(String value) {
            addCriterion("CDP_REPEATTIME =", value, "repeattime");
            return (Criteria) this;
        }

        public Criteria andRepeattimeNotEqualTo(String value) {
            addCriterion("CDP_REPEATTIME <>", value, "repeattime");
            return (Criteria) this;
        }

        public Criteria andRepeattimeGreaterThan(String value) {
            addCriterion("CDP_REPEATTIME >", value, "repeattime");
            return (Criteria) this;
        }

        public Criteria andRepeattimeGreaterThanOrEqualTo(String value) {
            addCriterion("CDP_REPEATTIME >=", value, "repeattime");
            return (Criteria) this;
        }

        public Criteria andRepeattimeLessThan(String value) {
            addCriterion("CDP_REPEATTIME <", value, "repeattime");
            return (Criteria) this;
        }

        public Criteria andRepeattimeLessThanOrEqualTo(String value) {
            addCriterion("CDP_REPEATTIME <=", value, "repeattime");
            return (Criteria) this;
        }

        public Criteria andRepeattimeLike(String value) {
            addCriterion("CDP_REPEATTIME like", value, "repeattime");
            return (Criteria) this;
        }

        public Criteria andRepeattimeNotLike(String value) {
            addCriterion("CDP_REPEATTIME not like", value, "repeattime");
            return (Criteria) this;
        }

        public Criteria andRepeattimeIn(List<String> values) {
            addCriterion("CDP_REPEATTIME in", values, "repeattime");
            return (Criteria) this;
        }

        public Criteria andRepeattimeNotIn(List<String> values) {
            addCriterion("CDP_REPEATTIME not in", values, "repeattime");
            return (Criteria) this;
        }

        public Criteria andRepeattimeBetween(String value1, String value2) {
            addCriterion("CDP_REPEATTIME between", value1, value2, "repeattime");
            return (Criteria) this;
        }

        public Criteria andRepeattimeNotBetween(String value1, String value2) {
            addCriterion("CDP_REPEATTIME not between", value1, value2, "repeattime");
            return (Criteria) this;
        }

        public Criteria andRepeatsuggIsNull() {
            addCriterion("CDP_REPEATSUGG is null");
            return (Criteria) this;
        }

        public Criteria andRepeatsuggIsNotNull() {
            addCriterion("CDP_REPEATSUGG is not null");
            return (Criteria) this;
        }

        public Criteria andRepeatsuggEqualTo(String value) {
            addCriterion("CDP_REPEATSUGG =", value, "repeatsugg");
            return (Criteria) this;
        }

        public Criteria andRepeatsuggNotEqualTo(String value) {
            addCriterion("CDP_REPEATSUGG <>", value, "repeatsugg");
            return (Criteria) this;
        }

        public Criteria andRepeatsuggGreaterThan(String value) {
            addCriterion("CDP_REPEATSUGG >", value, "repeatsugg");
            return (Criteria) this;
        }

        public Criteria andRepeatsuggGreaterThanOrEqualTo(String value) {
            addCriterion("CDP_REPEATSUGG >=", value, "repeatsugg");
            return (Criteria) this;
        }

        public Criteria andRepeatsuggLessThan(String value) {
            addCriterion("CDP_REPEATSUGG <", value, "repeatsugg");
            return (Criteria) this;
        }

        public Criteria andRepeatsuggLessThanOrEqualTo(String value) {
            addCriterion("CDP_REPEATSUGG <=", value, "repeatsugg");
            return (Criteria) this;
        }

        public Criteria andRepeatsuggLike(String value) {
            addCriterion("CDP_REPEATSUGG like", value, "repeatsugg");
            return (Criteria) this;
        }

        public Criteria andRepeatsuggNotLike(String value) {
            addCriterion("CDP_REPEATSUGG not like", value, "repeatsugg");
            return (Criteria) this;
        }

        public Criteria andRepeatsuggIn(List<String> values) {
            addCriterion("CDP_REPEATSUGG in", values, "repeatsugg");
            return (Criteria) this;
        }

        public Criteria andRepeatsuggNotIn(List<String> values) {
            addCriterion("CDP_REPEATSUGG not in", values, "repeatsugg");
            return (Criteria) this;
        }

        public Criteria andRepeatsuggBetween(String value1, String value2) {
            addCriterion("CDP_REPEATSUGG between", value1, value2, "repeatsugg");
            return (Criteria) this;
        }

        public Criteria andRepeatsuggNotBetween(String value1, String value2) {
            addCriterion("CDP_REPEATSUGG not between", value1, value2, "repeatsugg");
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

        public Criteria andAcceptcountLikeInsensitive(String value) {
            addCriterion("upper(CDP_ACCEPTCOUNT) like", value.toUpperCase(), "acceptcount");
            return (Criteria) this;
        }

        public Criteria andFirsttimeLikeInsensitive(String value) {
            addCriterion("upper(CDP_FIRSTTIME) like", value.toUpperCase(), "firsttime");
            return (Criteria) this;
        }

        public Criteria andFirstsuggLikeInsensitive(String value) {
            addCriterion("upper(CDP_FIRSTSUGG) like", value.toUpperCase(), "firstsugg");
            return (Criteria) this;
        }

        public Criteria andRepeattimeLikeInsensitive(String value) {
            addCriterion("upper(CDP_REPEATTIME) like", value.toUpperCase(), "repeattime");
            return (Criteria) this;
        }

        public Criteria andRepeatsuggLikeInsensitive(String value) {
            addCriterion("upper(CDP_REPEATSUGG) like", value.toUpperCase(), "repeatsugg");
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