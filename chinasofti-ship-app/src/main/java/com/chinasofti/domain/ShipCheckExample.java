package com.chinasofti.domain;

import com.limp.framework.core.bean.Pager;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ShipCheckExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Pager page;

    public ShipCheckExample() {
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

        public Criteria andUidIsNull() {
            addCriterion("CSC_UID is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("CSC_UID is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(String value) {
            addCriterion("CSC_UID =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(String value) {
            addCriterion("CSC_UID <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(String value) {
            addCriterion("CSC_UID >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(String value) {
            addCriterion("CSC_UID >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(String value) {
            addCriterion("CSC_UID <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(String value) {
            addCriterion("CSC_UID <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLike(String value) {
            addCriterion("CSC_UID like", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotLike(String value) {
            addCriterion("CSC_UID not like", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<String> values) {
            addCriterion("CSC_UID in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<String> values) {
            addCriterion("CSC_UID not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(String value1, String value2) {
            addCriterion("CSC_UID between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(String value1, String value2) {
            addCriterion("CSC_UID not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andSuridIsNull() {
            addCriterion("CSC_SURID is null");
            return (Criteria) this;
        }

        public Criteria andSuridIsNotNull() {
            addCriterion("CSC_SURID is not null");
            return (Criteria) this;
        }

        public Criteria andSuridEqualTo(String value) {
            addCriterion("CSC_SURID =", value, "surid");
            return (Criteria) this;
        }

        public Criteria andSuridNotEqualTo(String value) {
            addCriterion("CSC_SURID <>", value, "surid");
            return (Criteria) this;
        }

        public Criteria andSuridGreaterThan(String value) {
            addCriterion("CSC_SURID >", value, "surid");
            return (Criteria) this;
        }

        public Criteria andSuridGreaterThanOrEqualTo(String value) {
            addCriterion("CSC_SURID >=", value, "surid");
            return (Criteria) this;
        }

        public Criteria andSuridLessThan(String value) {
            addCriterion("CSC_SURID <", value, "surid");
            return (Criteria) this;
        }

        public Criteria andSuridLessThanOrEqualTo(String value) {
            addCriterion("CSC_SURID <=", value, "surid");
            return (Criteria) this;
        }

        public Criteria andSuridLike(String value) {
            addCriterion("CSC_SURID like", value, "surid");
            return (Criteria) this;
        }

        public Criteria andSuridNotLike(String value) {
            addCriterion("CSC_SURID not like", value, "surid");
            return (Criteria) this;
        }

        public Criteria andSuridIn(List<String> values) {
            addCriterion("CSC_SURID in", values, "surid");
            return (Criteria) this;
        }

        public Criteria andSuridNotIn(List<String> values) {
            addCriterion("CSC_SURID not in", values, "surid");
            return (Criteria) this;
        }

        public Criteria andSuridBetween(String value1, String value2) {
            addCriterion("CSC_SURID between", value1, value2, "surid");
            return (Criteria) this;
        }

        public Criteria andSuridNotBetween(String value1, String value2) {
            addCriterion("CSC_SURID not between", value1, value2, "surid");
            return (Criteria) this;
        }

        public Criteria andAreacodeIsNull() {
            addCriterion("CSC_AREACODE is null");
            return (Criteria) this;
        }

        public Criteria andAreacodeIsNotNull() {
            addCriterion("CSC_AREACODE is not null");
            return (Criteria) this;
        }

        public Criteria andAreacodeEqualTo(String value) {
            addCriterion("CSC_AREACODE =", value, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeNotEqualTo(String value) {
            addCriterion("CSC_AREACODE <>", value, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeGreaterThan(String value) {
            addCriterion("CSC_AREACODE >", value, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeGreaterThanOrEqualTo(String value) {
            addCriterion("CSC_AREACODE >=", value, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeLessThan(String value) {
            addCriterion("CSC_AREACODE <", value, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeLessThanOrEqualTo(String value) {
            addCriterion("CSC_AREACODE <=", value, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeLike(String value) {
            addCriterion("CSC_AREACODE like", value, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeNotLike(String value) {
            addCriterion("CSC_AREACODE not like", value, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeIn(List<String> values) {
            addCriterion("CSC_AREACODE in", values, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeNotIn(List<String> values) {
            addCriterion("CSC_AREACODE not in", values, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeBetween(String value1, String value2) {
            addCriterion("CSC_AREACODE between", value1, value2, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeNotBetween(String value1, String value2) {
            addCriterion("CSC_AREACODE not between", value1, value2, "areacode");
            return (Criteria) this;
        }

        public Criteria andYcbmIsNull() {
            addCriterion("CSC_YCBM is null");
            return (Criteria) this;
        }

        public Criteria andYcbmIsNotNull() {
            addCriterion("CSC_YCBM is not null");
            return (Criteria) this;
        }

        public Criteria andYcbmEqualTo(String value) {
            addCriterion("CSC_YCBM =", value, "ycbm");
            return (Criteria) this;
        }

        public Criteria andYcbmNotEqualTo(String value) {
            addCriterion("CSC_YCBM <>", value, "ycbm");
            return (Criteria) this;
        }

        public Criteria andYcbmGreaterThan(String value) {
            addCriterion("CSC_YCBM >", value, "ycbm");
            return (Criteria) this;
        }

        public Criteria andYcbmGreaterThanOrEqualTo(String value) {
            addCriterion("CSC_YCBM >=", value, "ycbm");
            return (Criteria) this;
        }

        public Criteria andYcbmLessThan(String value) {
            addCriterion("CSC_YCBM <", value, "ycbm");
            return (Criteria) this;
        }

        public Criteria andYcbmLessThanOrEqualTo(String value) {
            addCriterion("CSC_YCBM <=", value, "ycbm");
            return (Criteria) this;
        }

        public Criteria andYcbmLike(String value) {
            addCriterion("CSC_YCBM like", value, "ycbm");
            return (Criteria) this;
        }

        public Criteria andYcbmNotLike(String value) {
            addCriterion("CSC_YCBM not like", value, "ycbm");
            return (Criteria) this;
        }

        public Criteria andYcbmIn(List<String> values) {
            addCriterion("CSC_YCBM in", values, "ycbm");
            return (Criteria) this;
        }

        public Criteria andYcbmNotIn(List<String> values) {
            addCriterion("CSC_YCBM not in", values, "ycbm");
            return (Criteria) this;
        }

        public Criteria andYcbmBetween(String value1, String value2) {
            addCriterion("CSC_YCBM between", value1, value2, "ycbm");
            return (Criteria) this;
        }

        public Criteria andYcbmNotBetween(String value1, String value2) {
            addCriterion("CSC_YCBM not between", value1, value2, "ycbm");
            return (Criteria) this;
        }

        public Criteria andYcmcIsNull() {
            addCriterion("CSC_YCMC is null");
            return (Criteria) this;
        }

        public Criteria andYcmcIsNotNull() {
            addCriterion("CSC_YCMC is not null");
            return (Criteria) this;
        }

        public Criteria andYcmcEqualTo(String value) {
            addCriterion("CSC_YCMC =", value, "ycmc");
            return (Criteria) this;
        }

        public Criteria andYcmcNotEqualTo(String value) {
            addCriterion("CSC_YCMC <>", value, "ycmc");
            return (Criteria) this;
        }

        public Criteria andYcmcGreaterThan(String value) {
            addCriterion("CSC_YCMC >", value, "ycmc");
            return (Criteria) this;
        }

        public Criteria andYcmcGreaterThanOrEqualTo(String value) {
            addCriterion("CSC_YCMC >=", value, "ycmc");
            return (Criteria) this;
        }

        public Criteria andYcmcLessThan(String value) {
            addCriterion("CSC_YCMC <", value, "ycmc");
            return (Criteria) this;
        }

        public Criteria andYcmcLessThanOrEqualTo(String value) {
            addCriterion("CSC_YCMC <=", value, "ycmc");
            return (Criteria) this;
        }

        public Criteria andYcmcLike(String value) {
            addCriterion("CSC_YCMC like", value, "ycmc");
            return (Criteria) this;
        }

        public Criteria andYcmcNotLike(String value) {
            addCriterion("CSC_YCMC not like", value, "ycmc");
            return (Criteria) this;
        }

        public Criteria andYcmcIn(List<String> values) {
            addCriterion("CSC_YCMC in", values, "ycmc");
            return (Criteria) this;
        }

        public Criteria andYcmcNotIn(List<String> values) {
            addCriterion("CSC_YCMC not in", values, "ycmc");
            return (Criteria) this;
        }

        public Criteria andYcmcBetween(String value1, String value2) {
            addCriterion("CSC_YCMC between", value1, value2, "ycmc");
            return (Criteria) this;
        }

        public Criteria andYcmcNotBetween(String value1, String value2) {
            addCriterion("CSC_YCMC not between", value1, value2, "ycmc");
            return (Criteria) this;
        }

        public Criteria andCheckpassIsNull() {
            addCriterion("CSC_CHECKPASS is null");
            return (Criteria) this;
        }

        public Criteria andCheckpassIsNotNull() {
            addCriterion("CSC_CHECKPASS is not null");
            return (Criteria) this;
        }

        public Criteria andCheckpassEqualTo(BigDecimal value) {
            addCriterion("CSC_CHECKPASS =", value, "checkpass");
            return (Criteria) this;
        }

        public Criteria andCheckpassNotEqualTo(BigDecimal value) {
            addCriterion("CSC_CHECKPASS <>", value, "checkpass");
            return (Criteria) this;
        }

        public Criteria andCheckpassGreaterThan(BigDecimal value) {
            addCriterion("CSC_CHECKPASS >", value, "checkpass");
            return (Criteria) this;
        }

        public Criteria andCheckpassGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CSC_CHECKPASS >=", value, "checkpass");
            return (Criteria) this;
        }

        public Criteria andCheckpassLessThan(BigDecimal value) {
            addCriterion("CSC_CHECKPASS <", value, "checkpass");
            return (Criteria) this;
        }

        public Criteria andCheckpassLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CSC_CHECKPASS <=", value, "checkpass");
            return (Criteria) this;
        }

        public Criteria andCheckpassIn(List<BigDecimal> values) {
            addCriterion("CSC_CHECKPASS in", values, "checkpass");
            return (Criteria) this;
        }

        public Criteria andCheckpassNotIn(List<BigDecimal> values) {
            addCriterion("CSC_CHECKPASS not in", values, "checkpass");
            return (Criteria) this;
        }

        public Criteria andCheckpassBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CSC_CHECKPASS between", value1, value2, "checkpass");
            return (Criteria) this;
        }

        public Criteria andCheckpassNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CSC_CHECKPASS not between", value1, value2, "checkpass");
            return (Criteria) this;
        }

        public Criteria andChecktimeIsNull() {
            addCriterion("CSC_CHECKTIME is null");
            return (Criteria) this;
        }

        public Criteria andChecktimeIsNotNull() {
            addCriterion("CSC_CHECKTIME is not null");
            return (Criteria) this;
        }

        public Criteria andChecktimeEqualTo(String value) {
            addCriterion("CSC_CHECKTIME =", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeNotEqualTo(String value) {
            addCriterion("CSC_CHECKTIME <>", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeGreaterThan(String value) {
            addCriterion("CSC_CHECKTIME >", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeGreaterThanOrEqualTo(String value) {
            addCriterion("CSC_CHECKTIME >=", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeLessThan(String value) {
            addCriterion("CSC_CHECKTIME <", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeLessThanOrEqualTo(String value) {
            addCriterion("CSC_CHECKTIME <=", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeLike(String value) {
            addCriterion("CSC_CHECKTIME like", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeNotLike(String value) {
            addCriterion("CSC_CHECKTIME not like", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeIn(List<String> values) {
            addCriterion("CSC_CHECKTIME in", values, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeNotIn(List<String> values) {
            addCriterion("CSC_CHECKTIME not in", values, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeBetween(String value1, String value2) {
            addCriterion("CSC_CHECKTIME between", value1, value2, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeNotBetween(String value1, String value2) {
            addCriterion("CSC_CHECKTIME not between", value1, value2, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktypeIsNull() {
            addCriterion("CSC_CHECKTYPE is null");
            return (Criteria) this;
        }

        public Criteria andChecktypeIsNotNull() {
            addCriterion("CSC_CHECKTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andChecktypeEqualTo(String value) {
            addCriterion("CSC_CHECKTYPE =", value, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeNotEqualTo(String value) {
            addCriterion("CSC_CHECKTYPE <>", value, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeGreaterThan(String value) {
            addCriterion("CSC_CHECKTYPE >", value, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeGreaterThanOrEqualTo(String value) {
            addCriterion("CSC_CHECKTYPE >=", value, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeLessThan(String value) {
            addCriterion("CSC_CHECKTYPE <", value, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeLessThanOrEqualTo(String value) {
            addCriterion("CSC_CHECKTYPE <=", value, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeLike(String value) {
            addCriterion("CSC_CHECKTYPE like", value, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeNotLike(String value) {
            addCriterion("CSC_CHECKTYPE not like", value, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeIn(List<String> values) {
            addCriterion("CSC_CHECKTYPE in", values, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeNotIn(List<String> values) {
            addCriterion("CSC_CHECKTYPE not in", values, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeBetween(String value1, String value2) {
            addCriterion("CSC_CHECKTYPE between", value1, value2, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeNotBetween(String value1, String value2) {
            addCriterion("CSC_CHECKTYPE not between", value1, value2, "checktype");
            return (Criteria) this;
        }

        public Criteria andQuesttypeIsNull() {
            addCriterion("CSC_QUESTTYPE is null");
            return (Criteria) this;
        }

        public Criteria andQuesttypeIsNotNull() {
            addCriterion("CSC_QUESTTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andQuesttypeEqualTo(String value) {
            addCriterion("CSC_QUESTTYPE =", value, "questtype");
            return (Criteria) this;
        }

        public Criteria andQuesttypeNotEqualTo(String value) {
            addCriterion("CSC_QUESTTYPE <>", value, "questtype");
            return (Criteria) this;
        }

        public Criteria andQuesttypeGreaterThan(String value) {
            addCriterion("CSC_QUESTTYPE >", value, "questtype");
            return (Criteria) this;
        }

        public Criteria andQuesttypeGreaterThanOrEqualTo(String value) {
            addCriterion("CSC_QUESTTYPE >=", value, "questtype");
            return (Criteria) this;
        }

        public Criteria andQuesttypeLessThan(String value) {
            addCriterion("CSC_QUESTTYPE <", value, "questtype");
            return (Criteria) this;
        }

        public Criteria andQuesttypeLessThanOrEqualTo(String value) {
            addCriterion("CSC_QUESTTYPE <=", value, "questtype");
            return (Criteria) this;
        }

        public Criteria andQuesttypeLike(String value) {
            addCriterion("CSC_QUESTTYPE like", value, "questtype");
            return (Criteria) this;
        }

        public Criteria andQuesttypeNotLike(String value) {
            addCriterion("CSC_QUESTTYPE not like", value, "questtype");
            return (Criteria) this;
        }

        public Criteria andQuesttypeIn(List<String> values) {
            addCriterion("CSC_QUESTTYPE in", values, "questtype");
            return (Criteria) this;
        }

        public Criteria andQuesttypeNotIn(List<String> values) {
            addCriterion("CSC_QUESTTYPE not in", values, "questtype");
            return (Criteria) this;
        }

        public Criteria andQuesttypeBetween(String value1, String value2) {
            addCriterion("CSC_QUESTTYPE between", value1, value2, "questtype");
            return (Criteria) this;
        }

        public Criteria andQuesttypeNotBetween(String value1, String value2) {
            addCriterion("CSC_QUESTTYPE not between", value1, value2, "questtype");
            return (Criteria) this;
        }

        public Criteria andQuesintroIsNull() {
            addCriterion("CSC_QUESINTRO is null");
            return (Criteria) this;
        }

        public Criteria andQuesintroIsNotNull() {
            addCriterion("CSC_QUESINTRO is not null");
            return (Criteria) this;
        }

        public Criteria andQuesintroEqualTo(String value) {
            addCriterion("CSC_QUESINTRO =", value, "quesintro");
            return (Criteria) this;
        }

        public Criteria andQuesintroNotEqualTo(String value) {
            addCriterion("CSC_QUESINTRO <>", value, "quesintro");
            return (Criteria) this;
        }

        public Criteria andQuesintroGreaterThan(String value) {
            addCriterion("CSC_QUESINTRO >", value, "quesintro");
            return (Criteria) this;
        }

        public Criteria andQuesintroGreaterThanOrEqualTo(String value) {
            addCriterion("CSC_QUESINTRO >=", value, "quesintro");
            return (Criteria) this;
        }

        public Criteria andQuesintroLessThan(String value) {
            addCriterion("CSC_QUESINTRO <", value, "quesintro");
            return (Criteria) this;
        }

        public Criteria andQuesintroLessThanOrEqualTo(String value) {
            addCriterion("CSC_QUESINTRO <=", value, "quesintro");
            return (Criteria) this;
        }

        public Criteria andQuesintroLike(String value) {
            addCriterion("CSC_QUESINTRO like", value, "quesintro");
            return (Criteria) this;
        }

        public Criteria andQuesintroNotLike(String value) {
            addCriterion("CSC_QUESINTRO not like", value, "quesintro");
            return (Criteria) this;
        }

        public Criteria andQuesintroIn(List<String> values) {
            addCriterion("CSC_QUESINTRO in", values, "quesintro");
            return (Criteria) this;
        }

        public Criteria andQuesintroNotIn(List<String> values) {
            addCriterion("CSC_QUESINTRO not in", values, "quesintro");
            return (Criteria) this;
        }

        public Criteria andQuesintroBetween(String value1, String value2) {
            addCriterion("CSC_QUESINTRO between", value1, value2, "quesintro");
            return (Criteria) this;
        }

        public Criteria andQuesintroNotBetween(String value1, String value2) {
            addCriterion("CSC_QUESINTRO not between", value1, value2, "quesintro");
            return (Criteria) this;
        }

        public Criteria andCheckitemIsNull() {
            addCriterion("CSC_CHECKITEM is null");
            return (Criteria) this;
        }

        public Criteria andCheckitemIsNotNull() {
            addCriterion("CSC_CHECKITEM is not null");
            return (Criteria) this;
        }

        public Criteria andCheckitemEqualTo(String value) {
            addCriterion("CSC_CHECKITEM =", value, "checkitem");
            return (Criteria) this;
        }

        public Criteria andCheckitemNotEqualTo(String value) {
            addCriterion("CSC_CHECKITEM <>", value, "checkitem");
            return (Criteria) this;
        }

        public Criteria andCheckitemGreaterThan(String value) {
            addCriterion("CSC_CHECKITEM >", value, "checkitem");
            return (Criteria) this;
        }

        public Criteria andCheckitemGreaterThanOrEqualTo(String value) {
            addCriterion("CSC_CHECKITEM >=", value, "checkitem");
            return (Criteria) this;
        }

        public Criteria andCheckitemLessThan(String value) {
            addCriterion("CSC_CHECKITEM <", value, "checkitem");
            return (Criteria) this;
        }

        public Criteria andCheckitemLessThanOrEqualTo(String value) {
            addCriterion("CSC_CHECKITEM <=", value, "checkitem");
            return (Criteria) this;
        }

        public Criteria andCheckitemLike(String value) {
            addCriterion("CSC_CHECKITEM like", value, "checkitem");
            return (Criteria) this;
        }

        public Criteria andCheckitemNotLike(String value) {
            addCriterion("CSC_CHECKITEM not like", value, "checkitem");
            return (Criteria) this;
        }

        public Criteria andCheckitemIn(List<String> values) {
            addCriterion("CSC_CHECKITEM in", values, "checkitem");
            return (Criteria) this;
        }

        public Criteria andCheckitemNotIn(List<String> values) {
            addCriterion("CSC_CHECKITEM not in", values, "checkitem");
            return (Criteria) this;
        }

        public Criteria andCheckitemBetween(String value1, String value2) {
            addCriterion("CSC_CHECKITEM between", value1, value2, "checkitem");
            return (Criteria) this;
        }

        public Criteria andCheckitemNotBetween(String value1, String value2) {
            addCriterion("CSC_CHECKITEM not between", value1, value2, "checkitem");
            return (Criteria) this;
        }

        public Criteria andOrgcodeIsNull() {
            addCriterion("CSC_ORGCODE is null");
            return (Criteria) this;
        }

        public Criteria andOrgcodeIsNotNull() {
            addCriterion("CSC_ORGCODE is not null");
            return (Criteria) this;
        }

        public Criteria andOrgcodeEqualTo(String value) {
            addCriterion("CSC_ORGCODE =", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeNotEqualTo(String value) {
            addCriterion("CSC_ORGCODE <>", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeGreaterThan(String value) {
            addCriterion("CSC_ORGCODE >", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeGreaterThanOrEqualTo(String value) {
            addCriterion("CSC_ORGCODE >=", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeLessThan(String value) {
            addCriterion("CSC_ORGCODE <", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeLessThanOrEqualTo(String value) {
            addCriterion("CSC_ORGCODE <=", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeLike(String value) {
            addCriterion("CSC_ORGCODE like", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeNotLike(String value) {
            addCriterion("CSC_ORGCODE not like", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeIn(List<String> values) {
            addCriterion("CSC_ORGCODE in", values, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeNotIn(List<String> values) {
            addCriterion("CSC_ORGCODE not in", values, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeBetween(String value1, String value2) {
            addCriterion("CSC_ORGCODE between", value1, value2, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeNotBetween(String value1, String value2) {
            addCriterion("CSC_ORGCODE not between", value1, value2, "orgcode");
            return (Criteria) this;
        }

        public Criteria andYearIsNull() {
            addCriterion("CSC_YEAR is null");
            return (Criteria) this;
        }

        public Criteria andYearIsNotNull() {
            addCriterion("CSC_YEAR is not null");
            return (Criteria) this;
        }

        public Criteria andYearEqualTo(String value) {
            addCriterion("CSC_YEAR =", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotEqualTo(String value) {
            addCriterion("CSC_YEAR <>", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThan(String value) {
            addCriterion("CSC_YEAR >", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThanOrEqualTo(String value) {
            addCriterion("CSC_YEAR >=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThan(String value) {
            addCriterion("CSC_YEAR <", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThanOrEqualTo(String value) {
            addCriterion("CSC_YEAR <=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLike(String value) {
            addCriterion("CSC_YEAR like", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotLike(String value) {
            addCriterion("CSC_YEAR not like", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearIn(List<String> values) {
            addCriterion("CSC_YEAR in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotIn(List<String> values) {
            addCriterion("CSC_YEAR not in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearBetween(String value1, String value2) {
            addCriterion("CSC_YEAR between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotBetween(String value1, String value2) {
            addCriterion("CSC_YEAR not between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andRc1IsNull() {
            addCriterion("CSC_RC1 is null");
            return (Criteria) this;
        }

        public Criteria andRc1IsNotNull() {
            addCriterion("CSC_RC1 is not null");
            return (Criteria) this;
        }

        public Criteria andRc1EqualTo(String value) {
            addCriterion("CSC_RC1 =", value, "rc1");
            return (Criteria) this;
        }

        public Criteria andRc1NotEqualTo(String value) {
            addCriterion("CSC_RC1 <>", value, "rc1");
            return (Criteria) this;
        }

        public Criteria andRc1GreaterThan(String value) {
            addCriterion("CSC_RC1 >", value, "rc1");
            return (Criteria) this;
        }

        public Criteria andRc1GreaterThanOrEqualTo(String value) {
            addCriterion("CSC_RC1 >=", value, "rc1");
            return (Criteria) this;
        }

        public Criteria andRc1LessThan(String value) {
            addCriterion("CSC_RC1 <", value, "rc1");
            return (Criteria) this;
        }

        public Criteria andRc1LessThanOrEqualTo(String value) {
            addCriterion("CSC_RC1 <=", value, "rc1");
            return (Criteria) this;
        }

        public Criteria andRc1Like(String value) {
            addCriterion("CSC_RC1 like", value, "rc1");
            return (Criteria) this;
        }

        public Criteria andRc1NotLike(String value) {
            addCriterion("CSC_RC1 not like", value, "rc1");
            return (Criteria) this;
        }

        public Criteria andRc1In(List<String> values) {
            addCriterion("CSC_RC1 in", values, "rc1");
            return (Criteria) this;
        }

        public Criteria andRc1NotIn(List<String> values) {
            addCriterion("CSC_RC1 not in", values, "rc1");
            return (Criteria) this;
        }

        public Criteria andRc1Between(String value1, String value2) {
            addCriterion("CSC_RC1 between", value1, value2, "rc1");
            return (Criteria) this;
        }

        public Criteria andRc1NotBetween(String value1, String value2) {
            addCriterion("CSC_RC1 not between", value1, value2, "rc1");
            return (Criteria) this;
        }

        public Criteria andRc2IsNull() {
            addCriterion("CSC_RC2 is null");
            return (Criteria) this;
        }

        public Criteria andRc2IsNotNull() {
            addCriterion("CSC_RC2 is not null");
            return (Criteria) this;
        }

        public Criteria andRc2EqualTo(String value) {
            addCriterion("CSC_RC2 =", value, "rc2");
            return (Criteria) this;
        }

        public Criteria andRc2NotEqualTo(String value) {
            addCriterion("CSC_RC2 <>", value, "rc2");
            return (Criteria) this;
        }

        public Criteria andRc2GreaterThan(String value) {
            addCriterion("CSC_RC2 >", value, "rc2");
            return (Criteria) this;
        }

        public Criteria andRc2GreaterThanOrEqualTo(String value) {
            addCriterion("CSC_RC2 >=", value, "rc2");
            return (Criteria) this;
        }

        public Criteria andRc2LessThan(String value) {
            addCriterion("CSC_RC2 <", value, "rc2");
            return (Criteria) this;
        }

        public Criteria andRc2LessThanOrEqualTo(String value) {
            addCriterion("CSC_RC2 <=", value, "rc2");
            return (Criteria) this;
        }

        public Criteria andRc2Like(String value) {
            addCriterion("CSC_RC2 like", value, "rc2");
            return (Criteria) this;
        }

        public Criteria andRc2NotLike(String value) {
            addCriterion("CSC_RC2 not like", value, "rc2");
            return (Criteria) this;
        }

        public Criteria andRc2In(List<String> values) {
            addCriterion("CSC_RC2 in", values, "rc2");
            return (Criteria) this;
        }

        public Criteria andRc2NotIn(List<String> values) {
            addCriterion("CSC_RC2 not in", values, "rc2");
            return (Criteria) this;
        }

        public Criteria andRc2Between(String value1, String value2) {
            addCriterion("CSC_RC2 between", value1, value2, "rc2");
            return (Criteria) this;
        }

        public Criteria andRc2NotBetween(String value1, String value2) {
            addCriterion("CSC_RC2 not between", value1, value2, "rc2");
            return (Criteria) this;
        }

        public Criteria andRc3IsNull() {
            addCriterion("CSC_RC3 is null");
            return (Criteria) this;
        }

        public Criteria andRc3IsNotNull() {
            addCriterion("CSC_RC3 is not null");
            return (Criteria) this;
        }

        public Criteria andRc3EqualTo(String value) {
            addCriterion("CSC_RC3 =", value, "rc3");
            return (Criteria) this;
        }

        public Criteria andRc3NotEqualTo(String value) {
            addCriterion("CSC_RC3 <>", value, "rc3");
            return (Criteria) this;
        }

        public Criteria andRc3GreaterThan(String value) {
            addCriterion("CSC_RC3 >", value, "rc3");
            return (Criteria) this;
        }

        public Criteria andRc3GreaterThanOrEqualTo(String value) {
            addCriterion("CSC_RC3 >=", value, "rc3");
            return (Criteria) this;
        }

        public Criteria andRc3LessThan(String value) {
            addCriterion("CSC_RC3 <", value, "rc3");
            return (Criteria) this;
        }

        public Criteria andRc3LessThanOrEqualTo(String value) {
            addCriterion("CSC_RC3 <=", value, "rc3");
            return (Criteria) this;
        }

        public Criteria andRc3Like(String value) {
            addCriterion("CSC_RC3 like", value, "rc3");
            return (Criteria) this;
        }

        public Criteria andRc3NotLike(String value) {
            addCriterion("CSC_RC3 not like", value, "rc3");
            return (Criteria) this;
        }

        public Criteria andRc3In(List<String> values) {
            addCriterion("CSC_RC3 in", values, "rc3");
            return (Criteria) this;
        }

        public Criteria andRc3NotIn(List<String> values) {
            addCriterion("CSC_RC3 not in", values, "rc3");
            return (Criteria) this;
        }

        public Criteria andRc3Between(String value1, String value2) {
            addCriterion("CSC_RC3 between", value1, value2, "rc3");
            return (Criteria) this;
        }

        public Criteria andRc3NotBetween(String value1, String value2) {
            addCriterion("CSC_RC3 not between", value1, value2, "rc3");
            return (Criteria) this;
        }

        public Criteria andRc5IsNull() {
            addCriterion("CSC_RC5 is null");
            return (Criteria) this;
        }

        public Criteria andRc5IsNotNull() {
            addCriterion("CSC_RC5 is not null");
            return (Criteria) this;
        }

        public Criteria andRc5EqualTo(Short value) {
            addCriterion("CSC_RC5 =", value, "rc5");
            return (Criteria) this;
        }

        public Criteria andRc5NotEqualTo(Short value) {
            addCriterion("CSC_RC5 <>", value, "rc5");
            return (Criteria) this;
        }

        public Criteria andRc5GreaterThan(Short value) {
            addCriterion("CSC_RC5 >", value, "rc5");
            return (Criteria) this;
        }

        public Criteria andRc5GreaterThanOrEqualTo(Short value) {
            addCriterion("CSC_RC5 >=", value, "rc5");
            return (Criteria) this;
        }

        public Criteria andRc5LessThan(Short value) {
            addCriterion("CSC_RC5 <", value, "rc5");
            return (Criteria) this;
        }

        public Criteria andRc5LessThanOrEqualTo(Short value) {
            addCriterion("CSC_RC5 <=", value, "rc5");
            return (Criteria) this;
        }

        public Criteria andRc5In(List<Short> values) {
            addCriterion("CSC_RC5 in", values, "rc5");
            return (Criteria) this;
        }

        public Criteria andRc5NotIn(List<Short> values) {
            addCriterion("CSC_RC5 not in", values, "rc5");
            return (Criteria) this;
        }

        public Criteria andRc5Between(Short value1, Short value2) {
            addCriterion("CSC_RC5 between", value1, value2, "rc5");
            return (Criteria) this;
        }

        public Criteria andRc5NotBetween(Short value1, Short value2) {
            addCriterion("CSC_RC5 not between", value1, value2, "rc5");
            return (Criteria) this;
        }

        public Criteria andOrgnameIsNull() {
            addCriterion("CSC_ORGNAME is null");
            return (Criteria) this;
        }

        public Criteria andOrgnameIsNotNull() {
            addCriterion("CSC_ORGNAME is not null");
            return (Criteria) this;
        }

        public Criteria andOrgnameEqualTo(String value) {
            addCriterion("CSC_ORGNAME =", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameNotEqualTo(String value) {
            addCriterion("CSC_ORGNAME <>", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameGreaterThan(String value) {
            addCriterion("CSC_ORGNAME >", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameGreaterThanOrEqualTo(String value) {
            addCriterion("CSC_ORGNAME >=", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameLessThan(String value) {
            addCriterion("CSC_ORGNAME <", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameLessThanOrEqualTo(String value) {
            addCriterion("CSC_ORGNAME <=", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameLike(String value) {
            addCriterion("CSC_ORGNAME like", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameNotLike(String value) {
            addCriterion("CSC_ORGNAME not like", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameIn(List<String> values) {
            addCriterion("CSC_ORGNAME in", values, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameNotIn(List<String> values) {
            addCriterion("CSC_ORGNAME not in", values, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameBetween(String value1, String value2) {
            addCriterion("CSC_ORGNAME between", value1, value2, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameNotBetween(String value1, String value2) {
            addCriterion("CSC_ORGNAME not between", value1, value2, "orgname");
            return (Criteria) this;
        }

        public Criteria andYcsnameIsNull() {
            addCriterion("CSC_YCSNAME is null");
            return (Criteria) this;
        }

        public Criteria andYcsnameIsNotNull() {
            addCriterion("CSC_YCSNAME is not null");
            return (Criteria) this;
        }

        public Criteria andYcsnameEqualTo(String value) {
            addCriterion("CSC_YCSNAME =", value, "ycsname");
            return (Criteria) this;
        }

        public Criteria andYcsnameNotEqualTo(String value) {
            addCriterion("CSC_YCSNAME <>", value, "ycsname");
            return (Criteria) this;
        }

        public Criteria andYcsnameGreaterThan(String value) {
            addCriterion("CSC_YCSNAME >", value, "ycsname");
            return (Criteria) this;
        }

        public Criteria andYcsnameGreaterThanOrEqualTo(String value) {
            addCriterion("CSC_YCSNAME >=", value, "ycsname");
            return (Criteria) this;
        }

        public Criteria andYcsnameLessThan(String value) {
            addCriterion("CSC_YCSNAME <", value, "ycsname");
            return (Criteria) this;
        }

        public Criteria andYcsnameLessThanOrEqualTo(String value) {
            addCriterion("CSC_YCSNAME <=", value, "ycsname");
            return (Criteria) this;
        }

        public Criteria andYcsnameLike(String value) {
            addCriterion("CSC_YCSNAME like", value, "ycsname");
            return (Criteria) this;
        }

        public Criteria andYcsnameNotLike(String value) {
            addCriterion("CSC_YCSNAME not like", value, "ycsname");
            return (Criteria) this;
        }

        public Criteria andYcsnameIn(List<String> values) {
            addCriterion("CSC_YCSNAME in", values, "ycsname");
            return (Criteria) this;
        }

        public Criteria andYcsnameNotIn(List<String> values) {
            addCriterion("CSC_YCSNAME not in", values, "ycsname");
            return (Criteria) this;
        }

        public Criteria andYcsnameBetween(String value1, String value2) {
            addCriterion("CSC_YCSNAME between", value1, value2, "ycsname");
            return (Criteria) this;
        }

        public Criteria andYcsnameNotBetween(String value1, String value2) {
            addCriterion("CSC_YCSNAME not between", value1, value2, "ycsname");
            return (Criteria) this;
        }

        public Criteria andXdnameIsNull() {
            addCriterion("CSC_XDNAME is null");
            return (Criteria) this;
        }

        public Criteria andXdnameIsNotNull() {
            addCriterion("CSC_XDNAME is not null");
            return (Criteria) this;
        }

        public Criteria andXdnameEqualTo(String value) {
            addCriterion("CSC_XDNAME =", value, "xdname");
            return (Criteria) this;
        }

        public Criteria andXdnameNotEqualTo(String value) {
            addCriterion("CSC_XDNAME <>", value, "xdname");
            return (Criteria) this;
        }

        public Criteria andXdnameGreaterThan(String value) {
            addCriterion("CSC_XDNAME >", value, "xdname");
            return (Criteria) this;
        }

        public Criteria andXdnameGreaterThanOrEqualTo(String value) {
            addCriterion("CSC_XDNAME >=", value, "xdname");
            return (Criteria) this;
        }

        public Criteria andXdnameLessThan(String value) {
            addCriterion("CSC_XDNAME <", value, "xdname");
            return (Criteria) this;
        }

        public Criteria andXdnameLessThanOrEqualTo(String value) {
            addCriterion("CSC_XDNAME <=", value, "xdname");
            return (Criteria) this;
        }

        public Criteria andXdnameLike(String value) {
            addCriterion("CSC_XDNAME like", value, "xdname");
            return (Criteria) this;
        }

        public Criteria andXdnameNotLike(String value) {
            addCriterion("CSC_XDNAME not like", value, "xdname");
            return (Criteria) this;
        }

        public Criteria andXdnameIn(List<String> values) {
            addCriterion("CSC_XDNAME in", values, "xdname");
            return (Criteria) this;
        }

        public Criteria andXdnameNotIn(List<String> values) {
            addCriterion("CSC_XDNAME not in", values, "xdname");
            return (Criteria) this;
        }

        public Criteria andXdnameBetween(String value1, String value2) {
            addCriterion("CSC_XDNAME between", value1, value2, "xdname");
            return (Criteria) this;
        }

        public Criteria andXdnameNotBetween(String value1, String value2) {
            addCriterion("CSC_XDNAME not between", value1, value2, "xdname");
            return (Criteria) this;
        }

        public Criteria andGroupcodeIsNull() {
            addCriterion("CSC_GROUPCODE is null");
            return (Criteria) this;
        }

        public Criteria andGroupcodeIsNotNull() {
            addCriterion("CSC_GROUPCODE is not null");
            return (Criteria) this;
        }

        public Criteria andGroupcodeEqualTo(String value) {
            addCriterion("CSC_GROUPCODE =", value, "groupcode");
            return (Criteria) this;
        }

        public Criteria andGroupcodeNotEqualTo(String value) {
            addCriterion("CSC_GROUPCODE <>", value, "groupcode");
            return (Criteria) this;
        }

        public Criteria andGroupcodeGreaterThan(String value) {
            addCriterion("CSC_GROUPCODE >", value, "groupcode");
            return (Criteria) this;
        }

        public Criteria andGroupcodeGreaterThanOrEqualTo(String value) {
            addCriterion("CSC_GROUPCODE >=", value, "groupcode");
            return (Criteria) this;
        }

        public Criteria andGroupcodeLessThan(String value) {
            addCriterion("CSC_GROUPCODE <", value, "groupcode");
            return (Criteria) this;
        }

        public Criteria andGroupcodeLessThanOrEqualTo(String value) {
            addCriterion("CSC_GROUPCODE <=", value, "groupcode");
            return (Criteria) this;
        }

        public Criteria andGroupcodeLike(String value) {
            addCriterion("CSC_GROUPCODE like", value, "groupcode");
            return (Criteria) this;
        }

        public Criteria andGroupcodeNotLike(String value) {
            addCriterion("CSC_GROUPCODE not like", value, "groupcode");
            return (Criteria) this;
        }

        public Criteria andGroupcodeIn(List<String> values) {
            addCriterion("CSC_GROUPCODE in", values, "groupcode");
            return (Criteria) this;
        }

        public Criteria andGroupcodeNotIn(List<String> values) {
            addCriterion("CSC_GROUPCODE not in", values, "groupcode");
            return (Criteria) this;
        }

        public Criteria andGroupcodeBetween(String value1, String value2) {
            addCriterion("CSC_GROUPCODE between", value1, value2, "groupcode");
            return (Criteria) this;
        }

        public Criteria andGroupcodeNotBetween(String value1, String value2) {
            addCriterion("CSC_GROUPCODE not between", value1, value2, "groupcode");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("CSC_STATE is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("CSC_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("CSC_STATE =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("CSC_STATE <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("CSC_STATE >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("CSC_STATE >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("CSC_STATE <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("CSC_STATE <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("CSC_STATE like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("CSC_STATE not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("CSC_STATE in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("CSC_STATE not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("CSC_STATE between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("CSC_STATE not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andRc4IsNull() {
            addCriterion("CSC_RC4 is null");
            return (Criteria) this;
        }

        public Criteria andRc4IsNotNull() {
            addCriterion("CSC_RC4 is not null");
            return (Criteria) this;
        }

        public Criteria andRc4EqualTo(String value) {
            addCriterion("CSC_RC4 =", value, "rc4");
            return (Criteria) this;
        }

        public Criteria andRc4NotEqualTo(String value) {
            addCriterion("CSC_RC4 <>", value, "rc4");
            return (Criteria) this;
        }

        public Criteria andRc4GreaterThan(String value) {
            addCriterion("CSC_RC4 >", value, "rc4");
            return (Criteria) this;
        }

        public Criteria andRc4GreaterThanOrEqualTo(String value) {
            addCriterion("CSC_RC4 >=", value, "rc4");
            return (Criteria) this;
        }

        public Criteria andRc4LessThan(String value) {
            addCriterion("CSC_RC4 <", value, "rc4");
            return (Criteria) this;
        }

        public Criteria andRc4LessThanOrEqualTo(String value) {
            addCriterion("CSC_RC4 <=", value, "rc4");
            return (Criteria) this;
        }

        public Criteria andRc4Like(String value) {
            addCriterion("CSC_RC4 like", value, "rc4");
            return (Criteria) this;
        }

        public Criteria andRc4NotLike(String value) {
            addCriterion("CSC_RC4 not like", value, "rc4");
            return (Criteria) this;
        }

        public Criteria andRc4In(List<String> values) {
            addCriterion("CSC_RC4 in", values, "rc4");
            return (Criteria) this;
        }

        public Criteria andRc4NotIn(List<String> values) {
            addCriterion("CSC_RC4 not in", values, "rc4");
            return (Criteria) this;
        }

        public Criteria andRc4Between(String value1, String value2) {
            addCriterion("CSC_RC4 between", value1, value2, "rc4");
            return (Criteria) this;
        }

        public Criteria andRc4NotBetween(String value1, String value2) {
            addCriterion("CSC_RC4 not between", value1, value2, "rc4");
            return (Criteria) this;
        }

        public Criteria andNextVerifyTimeIsNull() {
            addCriterion("CSC_NEXT_VERIFY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andNextVerifyTimeIsNotNull() {
            addCriterion("CSC_NEXT_VERIFY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andNextVerifyTimeEqualTo(String value) {
            addCriterion("CSC_NEXT_VERIFY_TIME =", value, "nextVerifyTime");
            return (Criteria) this;
        }

        public Criteria andNextVerifyTimeNotEqualTo(String value) {
            addCriterion("CSC_NEXT_VERIFY_TIME <>", value, "nextVerifyTime");
            return (Criteria) this;
        }

        public Criteria andNextVerifyTimeGreaterThan(String value) {
            addCriterion("CSC_NEXT_VERIFY_TIME >", value, "nextVerifyTime");
            return (Criteria) this;
        }

        public Criteria andNextVerifyTimeGreaterThanOrEqualTo(String value) {
            addCriterion("CSC_NEXT_VERIFY_TIME >=", value, "nextVerifyTime");
            return (Criteria) this;
        }

        public Criteria andNextVerifyTimeLessThan(String value) {
            addCriterion("CSC_NEXT_VERIFY_TIME <", value, "nextVerifyTime");
            return (Criteria) this;
        }

        public Criteria andNextVerifyTimeLessThanOrEqualTo(String value) {
            addCriterion("CSC_NEXT_VERIFY_TIME <=", value, "nextVerifyTime");
            return (Criteria) this;
        }

        public Criteria andNextVerifyTimeLike(String value) {
            addCriterion("CSC_NEXT_VERIFY_TIME like", value, "nextVerifyTime");
            return (Criteria) this;
        }

        public Criteria andNextVerifyTimeNotLike(String value) {
            addCriterion("CSC_NEXT_VERIFY_TIME not like", value, "nextVerifyTime");
            return (Criteria) this;
        }

        public Criteria andNextVerifyTimeIn(List<String> values) {
            addCriterion("CSC_NEXT_VERIFY_TIME in", values, "nextVerifyTime");
            return (Criteria) this;
        }

        public Criteria andNextVerifyTimeNotIn(List<String> values) {
            addCriterion("CSC_NEXT_VERIFY_TIME not in", values, "nextVerifyTime");
            return (Criteria) this;
        }

        public Criteria andNextVerifyTimeBetween(String value1, String value2) {
            addCriterion("CSC_NEXT_VERIFY_TIME between", value1, value2, "nextVerifyTime");
            return (Criteria) this;
        }

        public Criteria andNextVerifyTimeNotBetween(String value1, String value2) {
            addCriterion("CSC_NEXT_VERIFY_TIME not between", value1, value2, "nextVerifyTime");
            return (Criteria) this;
        }

        public Criteria andSheetIdIsNull() {
            addCriterion("CSC_SHEET_ID is null");
            return (Criteria) this;
        }

        public Criteria andSheetIdIsNotNull() {
            addCriterion("CSC_SHEET_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSheetIdEqualTo(String value) {
            addCriterion("CSC_SHEET_ID =", value, "sheetId");
            return (Criteria) this;
        }

        public Criteria andSheetIdNotEqualTo(String value) {
            addCriterion("CSC_SHEET_ID <>", value, "sheetId");
            return (Criteria) this;
        }

        public Criteria andSheetIdGreaterThan(String value) {
            addCriterion("CSC_SHEET_ID >", value, "sheetId");
            return (Criteria) this;
        }

        public Criteria andSheetIdGreaterThanOrEqualTo(String value) {
            addCriterion("CSC_SHEET_ID >=", value, "sheetId");
            return (Criteria) this;
        }

        public Criteria andSheetIdLessThan(String value) {
            addCriterion("CSC_SHEET_ID <", value, "sheetId");
            return (Criteria) this;
        }

        public Criteria andSheetIdLessThanOrEqualTo(String value) {
            addCriterion("CSC_SHEET_ID <=", value, "sheetId");
            return (Criteria) this;
        }

        public Criteria andSheetIdLike(String value) {
            addCriterion("CSC_SHEET_ID like", value, "sheetId");
            return (Criteria) this;
        }

        public Criteria andSheetIdNotLike(String value) {
            addCriterion("CSC_SHEET_ID not like", value, "sheetId");
            return (Criteria) this;
        }

        public Criteria andSheetIdIn(List<String> values) {
            addCriterion("CSC_SHEET_ID in", values, "sheetId");
            return (Criteria) this;
        }

        public Criteria andSheetIdNotIn(List<String> values) {
            addCriterion("CSC_SHEET_ID not in", values, "sheetId");
            return (Criteria) this;
        }

        public Criteria andSheetIdBetween(String value1, String value2) {
            addCriterion("CSC_SHEET_ID between", value1, value2, "sheetId");
            return (Criteria) this;
        }

        public Criteria andSheetIdNotBetween(String value1, String value2) {
            addCriterion("CSC_SHEET_ID not between", value1, value2, "sheetId");
            return (Criteria) this;
        }

        public Criteria andApplyTimeIsNull() {
            addCriterion("CSC_APPLY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andApplyTimeIsNotNull() {
            addCriterion("CSC_APPLY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andApplyTimeEqualTo(String value) {
            addCriterion("CSC_APPLY_TIME =", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeNotEqualTo(String value) {
            addCriterion("CSC_APPLY_TIME <>", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeGreaterThan(String value) {
            addCriterion("CSC_APPLY_TIME >", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeGreaterThanOrEqualTo(String value) {
            addCriterion("CSC_APPLY_TIME >=", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeLessThan(String value) {
            addCriterion("CSC_APPLY_TIME <", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeLessThanOrEqualTo(String value) {
            addCriterion("CSC_APPLY_TIME <=", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeLike(String value) {
            addCriterion("CSC_APPLY_TIME like", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeNotLike(String value) {
            addCriterion("CSC_APPLY_TIME not like", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeIn(List<String> values) {
            addCriterion("CSC_APPLY_TIME in", values, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeNotIn(List<String> values) {
            addCriterion("CSC_APPLY_TIME not in", values, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeBetween(String value1, String value2) {
            addCriterion("CSC_APPLY_TIME between", value1, value2, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeNotBetween(String value1, String value2) {
            addCriterion("CSC_APPLY_TIME not between", value1, value2, "applyTime");
            return (Criteria) this;
        }

        public Criteria andIfstopapplyIsNull() {
            addCriterion("CSC_IFSTOPAPPLY is null");
            return (Criteria) this;
        }

        public Criteria andIfstopapplyIsNotNull() {
            addCriterion("CSC_IFSTOPAPPLY is not null");
            return (Criteria) this;
        }

        public Criteria andIfstopapplyEqualTo(String value) {
            addCriterion("CSC_IFSTOPAPPLY =", value, "ifstopapply");
            return (Criteria) this;
        }

        public Criteria andIfstopapplyNotEqualTo(String value) {
            addCriterion("CSC_IFSTOPAPPLY <>", value, "ifstopapply");
            return (Criteria) this;
        }

        public Criteria andIfstopapplyGreaterThan(String value) {
            addCriterion("CSC_IFSTOPAPPLY >", value, "ifstopapply");
            return (Criteria) this;
        }

        public Criteria andIfstopapplyGreaterThanOrEqualTo(String value) {
            addCriterion("CSC_IFSTOPAPPLY >=", value, "ifstopapply");
            return (Criteria) this;
        }

        public Criteria andIfstopapplyLessThan(String value) {
            addCriterion("CSC_IFSTOPAPPLY <", value, "ifstopapply");
            return (Criteria) this;
        }

        public Criteria andIfstopapplyLessThanOrEqualTo(String value) {
            addCriterion("CSC_IFSTOPAPPLY <=", value, "ifstopapply");
            return (Criteria) this;
        }

        public Criteria andIfstopapplyLike(String value) {
            addCriterion("CSC_IFSTOPAPPLY like", value, "ifstopapply");
            return (Criteria) this;
        }

        public Criteria andIfstopapplyNotLike(String value) {
            addCriterion("CSC_IFSTOPAPPLY not like", value, "ifstopapply");
            return (Criteria) this;
        }

        public Criteria andIfstopapplyIn(List<String> values) {
            addCriterion("CSC_IFSTOPAPPLY in", values, "ifstopapply");
            return (Criteria) this;
        }

        public Criteria andIfstopapplyNotIn(List<String> values) {
            addCriterion("CSC_IFSTOPAPPLY not in", values, "ifstopapply");
            return (Criteria) this;
        }

        public Criteria andIfstopapplyBetween(String value1, String value2) {
            addCriterion("CSC_IFSTOPAPPLY between", value1, value2, "ifstopapply");
            return (Criteria) this;
        }

        public Criteria andIfstopapplyNotBetween(String value1, String value2) {
            addCriterion("CSC_IFSTOPAPPLY not between", value1, value2, "ifstopapply");
            return (Criteria) this;
        }

        public Criteria andIdLikeInsensitive(String value) {
            addCriterion("upper(CSC_ID) like", value.toUpperCase(), "id");
            return (Criteria) this;
        }

        public Criteria andUidLikeInsensitive(String value) {
            addCriterion("upper(CSC_UID) like", value.toUpperCase(), "uid");
            return (Criteria) this;
        }

        public Criteria andSuridLikeInsensitive(String value) {
            addCriterion("upper(CSC_SURID) like", value.toUpperCase(), "surid");
            return (Criteria) this;
        }

        public Criteria andAreacodeLikeInsensitive(String value) {
            addCriterion("upper(CSC_AREACODE) like", value.toUpperCase(), "areacode");
            return (Criteria) this;
        }

        public Criteria andYcbmLikeInsensitive(String value) {
            addCriterion("upper(CSC_YCBM) like", value.toUpperCase(), "ycbm");
            return (Criteria) this;
        }

        public Criteria andYcmcLikeInsensitive(String value) {
            addCriterion("upper(CSC_YCMC) like", value.toUpperCase(), "ycmc");
            return (Criteria) this;
        }

        public Criteria andChecktimeLikeInsensitive(String value) {
            addCriterion("upper(CSC_CHECKTIME) like", value.toUpperCase(), "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktypeLikeInsensitive(String value) {
            addCriterion("upper(CSC_CHECKTYPE) like", value.toUpperCase(), "checktype");
            return (Criteria) this;
        }

        public Criteria andQuesttypeLikeInsensitive(String value) {
            addCriterion("upper(CSC_QUESTTYPE) like", value.toUpperCase(), "questtype");
            return (Criteria) this;
        }

        public Criteria andQuesintroLikeInsensitive(String value) {
            addCriterion("upper(CSC_QUESINTRO) like", value.toUpperCase(), "quesintro");
            return (Criteria) this;
        }

        public Criteria andCheckitemLikeInsensitive(String value) {
            addCriterion("upper(CSC_CHECKITEM) like", value.toUpperCase(), "checkitem");
            return (Criteria) this;
        }

        public Criteria andOrgcodeLikeInsensitive(String value) {
            addCriterion("upper(CSC_ORGCODE) like", value.toUpperCase(), "orgcode");
            return (Criteria) this;
        }

        public Criteria andYearLikeInsensitive(String value) {
            addCriterion("upper(CSC_YEAR) like", value.toUpperCase(), "year");
            return (Criteria) this;
        }

        public Criteria andRc1LikeInsensitive(String value) {
            addCriterion("upper(CSC_RC1) like", value.toUpperCase(), "rc1");
            return (Criteria) this;
        }

        public Criteria andRc2LikeInsensitive(String value) {
            addCriterion("upper(CSC_RC2) like", value.toUpperCase(), "rc2");
            return (Criteria) this;
        }

        public Criteria andRc3LikeInsensitive(String value) {
            addCriterion("upper(CSC_RC3) like", value.toUpperCase(), "rc3");
            return (Criteria) this;
        }

        public Criteria andOrgnameLikeInsensitive(String value) {
            addCriterion("upper(CSC_ORGNAME) like", value.toUpperCase(), "orgname");
            return (Criteria) this;
        }

        public Criteria andYcsnameLikeInsensitive(String value) {
            addCriterion("upper(CSC_YCSNAME) like", value.toUpperCase(), "ycsname");
            return (Criteria) this;
        }

        public Criteria andXdnameLikeInsensitive(String value) {
            addCriterion("upper(CSC_XDNAME) like", value.toUpperCase(), "xdname");
            return (Criteria) this;
        }

        public Criteria andGroupcodeLikeInsensitive(String value) {
            addCriterion("upper(CSC_GROUPCODE) like", value.toUpperCase(), "groupcode");
            return (Criteria) this;
        }

        public Criteria andStateLikeInsensitive(String value) {
            addCriterion("upper(CSC_STATE) like", value.toUpperCase(), "state");
            return (Criteria) this;
        }

        public Criteria andRc4LikeInsensitive(String value) {
            addCriterion("upper(CSC_RC4) like", value.toUpperCase(), "rc4");
            return (Criteria) this;
        }

        public Criteria andNextVerifyTimeLikeInsensitive(String value) {
            addCriterion("upper(CSC_NEXT_VERIFY_TIME) like", value.toUpperCase(), "nextVerifyTime");
            return (Criteria) this;
        }

        public Criteria andSheetIdLikeInsensitive(String value) {
            addCriterion("upper(CSC_SHEET_ID) like", value.toUpperCase(), "sheetId");
            return (Criteria) this;
        }

        public Criteria andApplyTimeLikeInsensitive(String value) {
            addCriterion("upper(CSC_APPLY_TIME) like", value.toUpperCase(), "applyTime");
            return (Criteria) this;
        }

        public Criteria andIfstopapplyLikeInsensitive(String value) {
            addCriterion("upper(CSC_IFSTOPAPPLY) like", value.toUpperCase(), "ifstopapply");
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