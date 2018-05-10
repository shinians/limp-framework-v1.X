package com.chinasofti.domain;

import com.limp.framework.core.bean.Pager;

import java.util.ArrayList;
import java.util.List;

public class DrawProcExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Pager page;

    public DrawProcExample() {
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

        public Criteria andApprtimeIsNull() {
            addCriterion("CDP_APPRTIME is null");
            return (Criteria) this;
        }

        public Criteria andApprtimeIsNotNull() {
            addCriterion("CDP_APPRTIME is not null");
            return (Criteria) this;
        }

        public Criteria andApprtimeEqualTo(String value) {
            addCriterion("CDP_APPRTIME =", value, "apprtime");
            return (Criteria) this;
        }

        public Criteria andApprtimeNotEqualTo(String value) {
            addCriterion("CDP_APPRTIME <>", value, "apprtime");
            return (Criteria) this;
        }

        public Criteria andApprtimeGreaterThan(String value) {
            addCriterion("CDP_APPRTIME >", value, "apprtime");
            return (Criteria) this;
        }

        public Criteria andApprtimeGreaterThanOrEqualTo(String value) {
            addCriterion("CDP_APPRTIME >=", value, "apprtime");
            return (Criteria) this;
        }

        public Criteria andApprtimeLessThan(String value) {
            addCriterion("CDP_APPRTIME <", value, "apprtime");
            return (Criteria) this;
        }

        public Criteria andApprtimeLessThanOrEqualTo(String value) {
            addCriterion("CDP_APPRTIME <=", value, "apprtime");
            return (Criteria) this;
        }

        public Criteria andApprtimeLike(String value) {
            addCriterion("CDP_APPRTIME like", value, "apprtime");
            return (Criteria) this;
        }

        public Criteria andApprtimeNotLike(String value) {
            addCriterion("CDP_APPRTIME not like", value, "apprtime");
            return (Criteria) this;
        }

        public Criteria andApprtimeIn(List<String> values) {
            addCriterion("CDP_APPRTIME in", values, "apprtime");
            return (Criteria) this;
        }

        public Criteria andApprtimeNotIn(List<String> values) {
            addCriterion("CDP_APPRTIME not in", values, "apprtime");
            return (Criteria) this;
        }

        public Criteria andApprtimeBetween(String value1, String value2) {
            addCriterion("CDP_APPRTIME between", value1, value2, "apprtime");
            return (Criteria) this;
        }

        public Criteria andApprtimeNotBetween(String value1, String value2) {
            addCriterion("CDP_APPRTIME not between", value1, value2, "apprtime");
            return (Criteria) this;
        }

        public Criteria andCheckpersionIsNull() {
            addCriterion("CDP_CHECKPERSION is null");
            return (Criteria) this;
        }

        public Criteria andCheckpersionIsNotNull() {
            addCriterion("CDP_CHECKPERSION is not null");
            return (Criteria) this;
        }

        public Criteria andCheckpersionEqualTo(String value) {
            addCriterion("CDP_CHECKPERSION =", value, "checkpersion");
            return (Criteria) this;
        }

        public Criteria andCheckpersionNotEqualTo(String value) {
            addCriterion("CDP_CHECKPERSION <>", value, "checkpersion");
            return (Criteria) this;
        }

        public Criteria andCheckpersionGreaterThan(String value) {
            addCriterion("CDP_CHECKPERSION >", value, "checkpersion");
            return (Criteria) this;
        }

        public Criteria andCheckpersionGreaterThanOrEqualTo(String value) {
            addCriterion("CDP_CHECKPERSION >=", value, "checkpersion");
            return (Criteria) this;
        }

        public Criteria andCheckpersionLessThan(String value) {
            addCriterion("CDP_CHECKPERSION <", value, "checkpersion");
            return (Criteria) this;
        }

        public Criteria andCheckpersionLessThanOrEqualTo(String value) {
            addCriterion("CDP_CHECKPERSION <=", value, "checkpersion");
            return (Criteria) this;
        }

        public Criteria andCheckpersionLike(String value) {
            addCriterion("CDP_CHECKPERSION like", value, "checkpersion");
            return (Criteria) this;
        }

        public Criteria andCheckpersionNotLike(String value) {
            addCriterion("CDP_CHECKPERSION not like", value, "checkpersion");
            return (Criteria) this;
        }

        public Criteria andCheckpersionIn(List<String> values) {
            addCriterion("CDP_CHECKPERSION in", values, "checkpersion");
            return (Criteria) this;
        }

        public Criteria andCheckpersionNotIn(List<String> values) {
            addCriterion("CDP_CHECKPERSION not in", values, "checkpersion");
            return (Criteria) this;
        }

        public Criteria andCheckpersionBetween(String value1, String value2) {
            addCriterion("CDP_CHECKPERSION between", value1, value2, "checkpersion");
            return (Criteria) this;
        }

        public Criteria andCheckpersionNotBetween(String value1, String value2) {
            addCriterion("CDP_CHECKPERSION not between", value1, value2, "checkpersion");
            return (Criteria) this;
        }

        public Criteria andChecksuggestIsNull() {
            addCriterion("CDP_CHECKSUGGEST is null");
            return (Criteria) this;
        }

        public Criteria andChecksuggestIsNotNull() {
            addCriterion("CDP_CHECKSUGGEST is not null");
            return (Criteria) this;
        }

        public Criteria andChecksuggestEqualTo(String value) {
            addCriterion("CDP_CHECKSUGGEST =", value, "checksuggest");
            return (Criteria) this;
        }

        public Criteria andChecksuggestNotEqualTo(String value) {
            addCriterion("CDP_CHECKSUGGEST <>", value, "checksuggest");
            return (Criteria) this;
        }

        public Criteria andChecksuggestGreaterThan(String value) {
            addCriterion("CDP_CHECKSUGGEST >", value, "checksuggest");
            return (Criteria) this;
        }

        public Criteria andChecksuggestGreaterThanOrEqualTo(String value) {
            addCriterion("CDP_CHECKSUGGEST >=", value, "checksuggest");
            return (Criteria) this;
        }

        public Criteria andChecksuggestLessThan(String value) {
            addCriterion("CDP_CHECKSUGGEST <", value, "checksuggest");
            return (Criteria) this;
        }

        public Criteria andChecksuggestLessThanOrEqualTo(String value) {
            addCriterion("CDP_CHECKSUGGEST <=", value, "checksuggest");
            return (Criteria) this;
        }

        public Criteria andChecksuggestLike(String value) {
            addCriterion("CDP_CHECKSUGGEST like", value, "checksuggest");
            return (Criteria) this;
        }

        public Criteria andChecksuggestNotLike(String value) {
            addCriterion("CDP_CHECKSUGGEST not like", value, "checksuggest");
            return (Criteria) this;
        }

        public Criteria andChecksuggestIn(List<String> values) {
            addCriterion("CDP_CHECKSUGGEST in", values, "checksuggest");
            return (Criteria) this;
        }

        public Criteria andChecksuggestNotIn(List<String> values) {
            addCriterion("CDP_CHECKSUGGEST not in", values, "checksuggest");
            return (Criteria) this;
        }

        public Criteria andChecksuggestBetween(String value1, String value2) {
            addCriterion("CDP_CHECKSUGGEST between", value1, value2, "checksuggest");
            return (Criteria) this;
        }

        public Criteria andChecksuggestNotBetween(String value1, String value2) {
            addCriterion("CDP_CHECKSUGGEST not between", value1, value2, "checksuggest");
            return (Criteria) this;
        }

        public Criteria andSenderIsNull() {
            addCriterion("CDP_SENDER is null");
            return (Criteria) this;
        }

        public Criteria andSenderIsNotNull() {
            addCriterion("CDP_SENDER is not null");
            return (Criteria) this;
        }

        public Criteria andSenderEqualTo(String value) {
            addCriterion("CDP_SENDER =", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderNotEqualTo(String value) {
            addCriterion("CDP_SENDER <>", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderGreaterThan(String value) {
            addCriterion("CDP_SENDER >", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderGreaterThanOrEqualTo(String value) {
            addCriterion("CDP_SENDER >=", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderLessThan(String value) {
            addCriterion("CDP_SENDER <", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderLessThanOrEqualTo(String value) {
            addCriterion("CDP_SENDER <=", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderLike(String value) {
            addCriterion("CDP_SENDER like", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderNotLike(String value) {
            addCriterion("CDP_SENDER not like", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderIn(List<String> values) {
            addCriterion("CDP_SENDER in", values, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderNotIn(List<String> values) {
            addCriterion("CDP_SENDER not in", values, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderBetween(String value1, String value2) {
            addCriterion("CDP_SENDER between", value1, value2, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderNotBetween(String value1, String value2) {
            addCriterion("CDP_SENDER not between", value1, value2, "sender");
            return (Criteria) this;
        }

        public Criteria andReceiverIsNull() {
            addCriterion("CDP_RECEIVER is null");
            return (Criteria) this;
        }

        public Criteria andReceiverIsNotNull() {
            addCriterion("CDP_RECEIVER is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverEqualTo(String value) {
            addCriterion("CDP_RECEIVER =", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverNotEqualTo(String value) {
            addCriterion("CDP_RECEIVER <>", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverGreaterThan(String value) {
            addCriterion("CDP_RECEIVER >", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverGreaterThanOrEqualTo(String value) {
            addCriterion("CDP_RECEIVER >=", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverLessThan(String value) {
            addCriterion("CDP_RECEIVER <", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverLessThanOrEqualTo(String value) {
            addCriterion("CDP_RECEIVER <=", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverLike(String value) {
            addCriterion("CDP_RECEIVER like", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverNotLike(String value) {
            addCriterion("CDP_RECEIVER not like", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverIn(List<String> values) {
            addCriterion("CDP_RECEIVER in", values, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverNotIn(List<String> values) {
            addCriterion("CDP_RECEIVER not in", values, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverBetween(String value1, String value2) {
            addCriterion("CDP_RECEIVER between", value1, value2, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverNotBetween(String value1, String value2) {
            addCriterion("CDP_RECEIVER not between", value1, value2, "receiver");
            return (Criteria) this;
        }

        public Criteria andChecktypeIsNull() {
            addCriterion("CDP_CHECKTYPE is null");
            return (Criteria) this;
        }

        public Criteria andChecktypeIsNotNull() {
            addCriterion("CDP_CHECKTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andChecktypeEqualTo(String value) {
            addCriterion("CDP_CHECKTYPE =", value, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeNotEqualTo(String value) {
            addCriterion("CDP_CHECKTYPE <>", value, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeGreaterThan(String value) {
            addCriterion("CDP_CHECKTYPE >", value, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeGreaterThanOrEqualTo(String value) {
            addCriterion("CDP_CHECKTYPE >=", value, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeLessThan(String value) {
            addCriterion("CDP_CHECKTYPE <", value, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeLessThanOrEqualTo(String value) {
            addCriterion("CDP_CHECKTYPE <=", value, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeLike(String value) {
            addCriterion("CDP_CHECKTYPE like", value, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeNotLike(String value) {
            addCriterion("CDP_CHECKTYPE not like", value, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeIn(List<String> values) {
            addCriterion("CDP_CHECKTYPE in", values, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeNotIn(List<String> values) {
            addCriterion("CDP_CHECKTYPE not in", values, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeBetween(String value1, String value2) {
            addCriterion("CDP_CHECKTYPE between", value1, value2, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeNotBetween(String value1, String value2) {
            addCriterion("CDP_CHECKTYPE not between", value1, value2, "checktype");
            return (Criteria) this;
        }

        public Criteria andLssuetimeIsNull() {
            addCriterion("CDP_LSSUETIME is null");
            return (Criteria) this;
        }

        public Criteria andLssuetimeIsNotNull() {
            addCriterion("CDP_LSSUETIME is not null");
            return (Criteria) this;
        }

        public Criteria andLssuetimeEqualTo(String value) {
            addCriterion("CDP_LSSUETIME =", value, "lssuetime");
            return (Criteria) this;
        }

        public Criteria andLssuetimeNotEqualTo(String value) {
            addCriterion("CDP_LSSUETIME <>", value, "lssuetime");
            return (Criteria) this;
        }

        public Criteria andLssuetimeGreaterThan(String value) {
            addCriterion("CDP_LSSUETIME >", value, "lssuetime");
            return (Criteria) this;
        }

        public Criteria andLssuetimeGreaterThanOrEqualTo(String value) {
            addCriterion("CDP_LSSUETIME >=", value, "lssuetime");
            return (Criteria) this;
        }

        public Criteria andLssuetimeLessThan(String value) {
            addCriterion("CDP_LSSUETIME <", value, "lssuetime");
            return (Criteria) this;
        }

        public Criteria andLssuetimeLessThanOrEqualTo(String value) {
            addCriterion("CDP_LSSUETIME <=", value, "lssuetime");
            return (Criteria) this;
        }

        public Criteria andLssuetimeLike(String value) {
            addCriterion("CDP_LSSUETIME like", value, "lssuetime");
            return (Criteria) this;
        }

        public Criteria andLssuetimeNotLike(String value) {
            addCriterion("CDP_LSSUETIME not like", value, "lssuetime");
            return (Criteria) this;
        }

        public Criteria andLssuetimeIn(List<String> values) {
            addCriterion("CDP_LSSUETIME in", values, "lssuetime");
            return (Criteria) this;
        }

        public Criteria andLssuetimeNotIn(List<String> values) {
            addCriterion("CDP_LSSUETIME not in", values, "lssuetime");
            return (Criteria) this;
        }

        public Criteria andLssuetimeBetween(String value1, String value2) {
            addCriterion("CDP_LSSUETIME between", value1, value2, "lssuetime");
            return (Criteria) this;
        }

        public Criteria andLssuetimeNotBetween(String value1, String value2) {
            addCriterion("CDP_LSSUETIME not between", value1, value2, "lssuetime");
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

        public Criteria andIdLikeInsensitive(String value) {
            addCriterion("upper(CDP_ID) like", value.toUpperCase(), "id");
            return (Criteria) this;
        }

        public Criteria andUidLikeInsensitive(String value) {
            addCriterion("upper(CDP_UID) like", value.toUpperCase(), "uid");
            return (Criteria) this;
        }

        public Criteria andApprtimeLikeInsensitive(String value) {
            addCriterion("upper(CDP_APPRTIME) like", value.toUpperCase(), "apprtime");
            return (Criteria) this;
        }

        public Criteria andCheckpersionLikeInsensitive(String value) {
            addCriterion("upper(CDP_CHECKPERSION) like", value.toUpperCase(), "checkpersion");
            return (Criteria) this;
        }

        public Criteria andChecksuggestLikeInsensitive(String value) {
            addCriterion("upper(CDP_CHECKSUGGEST) like", value.toUpperCase(), "checksuggest");
            return (Criteria) this;
        }

        public Criteria andSenderLikeInsensitive(String value) {
            addCriterion("upper(CDP_SENDER) like", value.toUpperCase(), "sender");
            return (Criteria) this;
        }

        public Criteria andReceiverLikeInsensitive(String value) {
            addCriterion("upper(CDP_RECEIVER) like", value.toUpperCase(), "receiver");
            return (Criteria) this;
        }

        public Criteria andChecktypeLikeInsensitive(String value) {
            addCriterion("upper(CDP_CHECKTYPE) like", value.toUpperCase(), "checktype");
            return (Criteria) this;
        }

        public Criteria andLssuetimeLikeInsensitive(String value) {
            addCriterion("upper(CDP_LSSUETIME) like", value.toUpperCase(), "lssuetime");
            return (Criteria) this;
        }

        public Criteria andDrawnoLikeInsensitive(String value) {
            addCriterion("upper(CDP_DRAWNO) like", value.toUpperCase(), "drawno");
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