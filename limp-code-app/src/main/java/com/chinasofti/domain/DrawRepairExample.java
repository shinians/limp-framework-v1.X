package com.chinasofti.domain;

import com.limp.framework.core.bean.Pager;

import java.util.ArrayList;
import java.util.List;

public class DrawRepairExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Pager page;

    public DrawRepairExample() {
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
            addCriterion("CDR_ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("CDR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("CDR_ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("CDR_ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("CDR_ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("CDR_ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("CDR_ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("CDR_ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("CDR_ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("CDR_ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("CDR_ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("CDR_ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("CDR_ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("CDR_ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUidIsNull() {
            addCriterion("CDR_UID is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("CDR_UID is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(String value) {
            addCriterion("CDR_UID =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(String value) {
            addCriterion("CDR_UID <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(String value) {
            addCriterion("CDR_UID >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(String value) {
            addCriterion("CDR_UID >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(String value) {
            addCriterion("CDR_UID <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(String value) {
            addCriterion("CDR_UID <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLike(String value) {
            addCriterion("CDR_UID like", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotLike(String value) {
            addCriterion("CDR_UID not like", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<String> values) {
            addCriterion("CDR_UID in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<String> values) {
            addCriterion("CDR_UID not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(String value1, String value2) {
            addCriterion("CDR_UID between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(String value1, String value2) {
            addCriterion("CDR_UID not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andReptypeIsNull() {
            addCriterion("CDR_REPTYPE is null");
            return (Criteria) this;
        }

        public Criteria andReptypeIsNotNull() {
            addCriterion("CDR_REPTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andReptypeEqualTo(String value) {
            addCriterion("CDR_REPTYPE =", value, "reptype");
            return (Criteria) this;
        }

        public Criteria andReptypeNotEqualTo(String value) {
            addCriterion("CDR_REPTYPE <>", value, "reptype");
            return (Criteria) this;
        }

        public Criteria andReptypeGreaterThan(String value) {
            addCriterion("CDR_REPTYPE >", value, "reptype");
            return (Criteria) this;
        }

        public Criteria andReptypeGreaterThanOrEqualTo(String value) {
            addCriterion("CDR_REPTYPE >=", value, "reptype");
            return (Criteria) this;
        }

        public Criteria andReptypeLessThan(String value) {
            addCriterion("CDR_REPTYPE <", value, "reptype");
            return (Criteria) this;
        }

        public Criteria andReptypeLessThanOrEqualTo(String value) {
            addCriterion("CDR_REPTYPE <=", value, "reptype");
            return (Criteria) this;
        }

        public Criteria andReptypeLike(String value) {
            addCriterion("CDR_REPTYPE like", value, "reptype");
            return (Criteria) this;
        }

        public Criteria andReptypeNotLike(String value) {
            addCriterion("CDR_REPTYPE not like", value, "reptype");
            return (Criteria) this;
        }

        public Criteria andReptypeIn(List<String> values) {
            addCriterion("CDR_REPTYPE in", values, "reptype");
            return (Criteria) this;
        }

        public Criteria andReptypeNotIn(List<String> values) {
            addCriterion("CDR_REPTYPE not in", values, "reptype");
            return (Criteria) this;
        }

        public Criteria andReptypeBetween(String value1, String value2) {
            addCriterion("CDR_REPTYPE between", value1, value2, "reptype");
            return (Criteria) this;
        }

        public Criteria andReptypeNotBetween(String value1, String value2) {
            addCriterion("CDR_REPTYPE not between", value1, value2, "reptype");
            return (Criteria) this;
        }

        public Criteria andReptimeIsNull() {
            addCriterion("CDR_REPTIME is null");
            return (Criteria) this;
        }

        public Criteria andReptimeIsNotNull() {
            addCriterion("CDR_REPTIME is not null");
            return (Criteria) this;
        }

        public Criteria andReptimeEqualTo(String value) {
            addCriterion("CDR_REPTIME =", value, "reptime");
            return (Criteria) this;
        }

        public Criteria andReptimeNotEqualTo(String value) {
            addCriterion("CDR_REPTIME <>", value, "reptime");
            return (Criteria) this;
        }

        public Criteria andReptimeGreaterThan(String value) {
            addCriterion("CDR_REPTIME >", value, "reptime");
            return (Criteria) this;
        }

        public Criteria andReptimeGreaterThanOrEqualTo(String value) {
            addCriterion("CDR_REPTIME >=", value, "reptime");
            return (Criteria) this;
        }

        public Criteria andReptimeLessThan(String value) {
            addCriterion("CDR_REPTIME <", value, "reptime");
            return (Criteria) this;
        }

        public Criteria andReptimeLessThanOrEqualTo(String value) {
            addCriterion("CDR_REPTIME <=", value, "reptime");
            return (Criteria) this;
        }

        public Criteria andReptimeLike(String value) {
            addCriterion("CDR_REPTIME like", value, "reptime");
            return (Criteria) this;
        }

        public Criteria andReptimeNotLike(String value) {
            addCriterion("CDR_REPTIME not like", value, "reptime");
            return (Criteria) this;
        }

        public Criteria andReptimeIn(List<String> values) {
            addCriterion("CDR_REPTIME in", values, "reptime");
            return (Criteria) this;
        }

        public Criteria andReptimeNotIn(List<String> values) {
            addCriterion("CDR_REPTIME not in", values, "reptime");
            return (Criteria) this;
        }

        public Criteria andReptimeBetween(String value1, String value2) {
            addCriterion("CDR_REPTIME between", value1, value2, "reptime");
            return (Criteria) this;
        }

        public Criteria andReptimeNotBetween(String value1, String value2) {
            addCriterion("CDR_REPTIME not between", value1, value2, "reptime");
            return (Criteria) this;
        }

        public Criteria andQusitemIsNull() {
            addCriterion("CDR_QUSITEM is null");
            return (Criteria) this;
        }

        public Criteria andQusitemIsNotNull() {
            addCriterion("CDR_QUSITEM is not null");
            return (Criteria) this;
        }

        public Criteria andQusitemEqualTo(String value) {
            addCriterion("CDR_QUSITEM =", value, "qusitem");
            return (Criteria) this;
        }

        public Criteria andQusitemNotEqualTo(String value) {
            addCriterion("CDR_QUSITEM <>", value, "qusitem");
            return (Criteria) this;
        }

        public Criteria andQusitemGreaterThan(String value) {
            addCriterion("CDR_QUSITEM >", value, "qusitem");
            return (Criteria) this;
        }

        public Criteria andQusitemGreaterThanOrEqualTo(String value) {
            addCriterion("CDR_QUSITEM >=", value, "qusitem");
            return (Criteria) this;
        }

        public Criteria andQusitemLessThan(String value) {
            addCriterion("CDR_QUSITEM <", value, "qusitem");
            return (Criteria) this;
        }

        public Criteria andQusitemLessThanOrEqualTo(String value) {
            addCriterion("CDR_QUSITEM <=", value, "qusitem");
            return (Criteria) this;
        }

        public Criteria andQusitemLike(String value) {
            addCriterion("CDR_QUSITEM like", value, "qusitem");
            return (Criteria) this;
        }

        public Criteria andQusitemNotLike(String value) {
            addCriterion("CDR_QUSITEM not like", value, "qusitem");
            return (Criteria) this;
        }

        public Criteria andQusitemIn(List<String> values) {
            addCriterion("CDR_QUSITEM in", values, "qusitem");
            return (Criteria) this;
        }

        public Criteria andQusitemNotIn(List<String> values) {
            addCriterion("CDR_QUSITEM not in", values, "qusitem");
            return (Criteria) this;
        }

        public Criteria andQusitemBetween(String value1, String value2) {
            addCriterion("CDR_QUSITEM between", value1, value2, "qusitem");
            return (Criteria) this;
        }

        public Criteria andQusitemNotBetween(String value1, String value2) {
            addCriterion("CDR_QUSITEM not between", value1, value2, "qusitem");
            return (Criteria) this;
        }

        public Criteria andCheckitemIsNull() {
            addCriterion("CDR_CHECKITEM is null");
            return (Criteria) this;
        }

        public Criteria andCheckitemIsNotNull() {
            addCriterion("CDR_CHECKITEM is not null");
            return (Criteria) this;
        }

        public Criteria andCheckitemEqualTo(String value) {
            addCriterion("CDR_CHECKITEM =", value, "checkitem");
            return (Criteria) this;
        }

        public Criteria andCheckitemNotEqualTo(String value) {
            addCriterion("CDR_CHECKITEM <>", value, "checkitem");
            return (Criteria) this;
        }

        public Criteria andCheckitemGreaterThan(String value) {
            addCriterion("CDR_CHECKITEM >", value, "checkitem");
            return (Criteria) this;
        }

        public Criteria andCheckitemGreaterThanOrEqualTo(String value) {
            addCriterion("CDR_CHECKITEM >=", value, "checkitem");
            return (Criteria) this;
        }

        public Criteria andCheckitemLessThan(String value) {
            addCriterion("CDR_CHECKITEM <", value, "checkitem");
            return (Criteria) this;
        }

        public Criteria andCheckitemLessThanOrEqualTo(String value) {
            addCriterion("CDR_CHECKITEM <=", value, "checkitem");
            return (Criteria) this;
        }

        public Criteria andCheckitemLike(String value) {
            addCriterion("CDR_CHECKITEM like", value, "checkitem");
            return (Criteria) this;
        }

        public Criteria andCheckitemNotLike(String value) {
            addCriterion("CDR_CHECKITEM not like", value, "checkitem");
            return (Criteria) this;
        }

        public Criteria andCheckitemIn(List<String> values) {
            addCriterion("CDR_CHECKITEM in", values, "checkitem");
            return (Criteria) this;
        }

        public Criteria andCheckitemNotIn(List<String> values) {
            addCriterion("CDR_CHECKITEM not in", values, "checkitem");
            return (Criteria) this;
        }

        public Criteria andCheckitemBetween(String value1, String value2) {
            addCriterion("CDR_CHECKITEM between", value1, value2, "checkitem");
            return (Criteria) this;
        }

        public Criteria andCheckitemNotBetween(String value1, String value2) {
            addCriterion("CDR_CHECKITEM not between", value1, value2, "checkitem");
            return (Criteria) this;
        }

        public Criteria andCheckpersionIsNull() {
            addCriterion("CDR_CHECKPERSION is null");
            return (Criteria) this;
        }

        public Criteria andCheckpersionIsNotNull() {
            addCriterion("CDR_CHECKPERSION is not null");
            return (Criteria) this;
        }

        public Criteria andCheckpersionEqualTo(String value) {
            addCriterion("CDR_CHECKPERSION =", value, "checkpersion");
            return (Criteria) this;
        }

        public Criteria andCheckpersionNotEqualTo(String value) {
            addCriterion("CDR_CHECKPERSION <>", value, "checkpersion");
            return (Criteria) this;
        }

        public Criteria andCheckpersionGreaterThan(String value) {
            addCriterion("CDR_CHECKPERSION >", value, "checkpersion");
            return (Criteria) this;
        }

        public Criteria andCheckpersionGreaterThanOrEqualTo(String value) {
            addCriterion("CDR_CHECKPERSION >=", value, "checkpersion");
            return (Criteria) this;
        }

        public Criteria andCheckpersionLessThan(String value) {
            addCriterion("CDR_CHECKPERSION <", value, "checkpersion");
            return (Criteria) this;
        }

        public Criteria andCheckpersionLessThanOrEqualTo(String value) {
            addCriterion("CDR_CHECKPERSION <=", value, "checkpersion");
            return (Criteria) this;
        }

        public Criteria andCheckpersionLike(String value) {
            addCriterion("CDR_CHECKPERSION like", value, "checkpersion");
            return (Criteria) this;
        }

        public Criteria andCheckpersionNotLike(String value) {
            addCriterion("CDR_CHECKPERSION not like", value, "checkpersion");
            return (Criteria) this;
        }

        public Criteria andCheckpersionIn(List<String> values) {
            addCriterion("CDR_CHECKPERSION in", values, "checkpersion");
            return (Criteria) this;
        }

        public Criteria andCheckpersionNotIn(List<String> values) {
            addCriterion("CDR_CHECKPERSION not in", values, "checkpersion");
            return (Criteria) this;
        }

        public Criteria andCheckpersionBetween(String value1, String value2) {
            addCriterion("CDR_CHECKPERSION between", value1, value2, "checkpersion");
            return (Criteria) this;
        }

        public Criteria andCheckpersionNotBetween(String value1, String value2) {
            addCriterion("CDR_CHECKPERSION not between", value1, value2, "checkpersion");
            return (Criteria) this;
        }

        public Criteria andSubpersionIsNull() {
            addCriterion("CDR_SUBPERSION is null");
            return (Criteria) this;
        }

        public Criteria andSubpersionIsNotNull() {
            addCriterion("CDR_SUBPERSION is not null");
            return (Criteria) this;
        }

        public Criteria andSubpersionEqualTo(String value) {
            addCriterion("CDR_SUBPERSION =", value, "subpersion");
            return (Criteria) this;
        }

        public Criteria andSubpersionNotEqualTo(String value) {
            addCriterion("CDR_SUBPERSION <>", value, "subpersion");
            return (Criteria) this;
        }

        public Criteria andSubpersionGreaterThan(String value) {
            addCriterion("CDR_SUBPERSION >", value, "subpersion");
            return (Criteria) this;
        }

        public Criteria andSubpersionGreaterThanOrEqualTo(String value) {
            addCriterion("CDR_SUBPERSION >=", value, "subpersion");
            return (Criteria) this;
        }

        public Criteria andSubpersionLessThan(String value) {
            addCriterion("CDR_SUBPERSION <", value, "subpersion");
            return (Criteria) this;
        }

        public Criteria andSubpersionLessThanOrEqualTo(String value) {
            addCriterion("CDR_SUBPERSION <=", value, "subpersion");
            return (Criteria) this;
        }

        public Criteria andSubpersionLike(String value) {
            addCriterion("CDR_SUBPERSION like", value, "subpersion");
            return (Criteria) this;
        }

        public Criteria andSubpersionNotLike(String value) {
            addCriterion("CDR_SUBPERSION not like", value, "subpersion");
            return (Criteria) this;
        }

        public Criteria andSubpersionIn(List<String> values) {
            addCriterion("CDR_SUBPERSION in", values, "subpersion");
            return (Criteria) this;
        }

        public Criteria andSubpersionNotIn(List<String> values) {
            addCriterion("CDR_SUBPERSION not in", values, "subpersion");
            return (Criteria) this;
        }

        public Criteria andSubpersionBetween(String value1, String value2) {
            addCriterion("CDR_SUBPERSION between", value1, value2, "subpersion");
            return (Criteria) this;
        }

        public Criteria andSubpersionNotBetween(String value1, String value2) {
            addCriterion("CDR_SUBPERSION not between", value1, value2, "subpersion");
            return (Criteria) this;
        }

        public Criteria andDrawnoIsNull() {
            addCriterion("CDR_DRAWNO is null");
            return (Criteria) this;
        }

        public Criteria andDrawnoIsNotNull() {
            addCriterion("CDR_DRAWNO is not null");
            return (Criteria) this;
        }

        public Criteria andDrawnoEqualTo(String value) {
            addCriterion("CDR_DRAWNO =", value, "drawno");
            return (Criteria) this;
        }

        public Criteria andDrawnoNotEqualTo(String value) {
            addCriterion("CDR_DRAWNO <>", value, "drawno");
            return (Criteria) this;
        }

        public Criteria andDrawnoGreaterThan(String value) {
            addCriterion("CDR_DRAWNO >", value, "drawno");
            return (Criteria) this;
        }

        public Criteria andDrawnoGreaterThanOrEqualTo(String value) {
            addCriterion("CDR_DRAWNO >=", value, "drawno");
            return (Criteria) this;
        }

        public Criteria andDrawnoLessThan(String value) {
            addCriterion("CDR_DRAWNO <", value, "drawno");
            return (Criteria) this;
        }

        public Criteria andDrawnoLessThanOrEqualTo(String value) {
            addCriterion("CDR_DRAWNO <=", value, "drawno");
            return (Criteria) this;
        }

        public Criteria andDrawnoLike(String value) {
            addCriterion("CDR_DRAWNO like", value, "drawno");
            return (Criteria) this;
        }

        public Criteria andDrawnoNotLike(String value) {
            addCriterion("CDR_DRAWNO not like", value, "drawno");
            return (Criteria) this;
        }

        public Criteria andDrawnoIn(List<String> values) {
            addCriterion("CDR_DRAWNO in", values, "drawno");
            return (Criteria) this;
        }

        public Criteria andDrawnoNotIn(List<String> values) {
            addCriterion("CDR_DRAWNO not in", values, "drawno");
            return (Criteria) this;
        }

        public Criteria andDrawnoBetween(String value1, String value2) {
            addCriterion("CDR_DRAWNO between", value1, value2, "drawno");
            return (Criteria) this;
        }

        public Criteria andDrawnoNotBetween(String value1, String value2) {
            addCriterion("CDR_DRAWNO not between", value1, value2, "drawno");
            return (Criteria) this;
        }

        public Criteria andDownloadIsNull() {
            addCriterion("CDR_DOWNLOAD is null");
            return (Criteria) this;
        }

        public Criteria andDownloadIsNotNull() {
            addCriterion("CDR_DOWNLOAD is not null");
            return (Criteria) this;
        }

        public Criteria andDownloadEqualTo(String value) {
            addCriterion("CDR_DOWNLOAD =", value, "download");
            return (Criteria) this;
        }

        public Criteria andDownloadNotEqualTo(String value) {
            addCriterion("CDR_DOWNLOAD <>", value, "download");
            return (Criteria) this;
        }

        public Criteria andDownloadGreaterThan(String value) {
            addCriterion("CDR_DOWNLOAD >", value, "download");
            return (Criteria) this;
        }

        public Criteria andDownloadGreaterThanOrEqualTo(String value) {
            addCriterion("CDR_DOWNLOAD >=", value, "download");
            return (Criteria) this;
        }

        public Criteria andDownloadLessThan(String value) {
            addCriterion("CDR_DOWNLOAD <", value, "download");
            return (Criteria) this;
        }

        public Criteria andDownloadLessThanOrEqualTo(String value) {
            addCriterion("CDR_DOWNLOAD <=", value, "download");
            return (Criteria) this;
        }

        public Criteria andDownloadLike(String value) {
            addCriterion("CDR_DOWNLOAD like", value, "download");
            return (Criteria) this;
        }

        public Criteria andDownloadNotLike(String value) {
            addCriterion("CDR_DOWNLOAD not like", value, "download");
            return (Criteria) this;
        }

        public Criteria andDownloadIn(List<String> values) {
            addCriterion("CDR_DOWNLOAD in", values, "download");
            return (Criteria) this;
        }

        public Criteria andDownloadNotIn(List<String> values) {
            addCriterion("CDR_DOWNLOAD not in", values, "download");
            return (Criteria) this;
        }

        public Criteria andDownloadBetween(String value1, String value2) {
            addCriterion("CDR_DOWNLOAD between", value1, value2, "download");
            return (Criteria) this;
        }

        public Criteria andDownloadNotBetween(String value1, String value2) {
            addCriterion("CDR_DOWNLOAD not between", value1, value2, "download");
            return (Criteria) this;
        }

        public Criteria andApprotimeIsNull() {
            addCriterion("CDR_APPROTIME is null");
            return (Criteria) this;
        }

        public Criteria andApprotimeIsNotNull() {
            addCriterion("CDR_APPROTIME is not null");
            return (Criteria) this;
        }

        public Criteria andApprotimeEqualTo(String value) {
            addCriterion("CDR_APPROTIME =", value, "approtime");
            return (Criteria) this;
        }

        public Criteria andApprotimeNotEqualTo(String value) {
            addCriterion("CDR_APPROTIME <>", value, "approtime");
            return (Criteria) this;
        }

        public Criteria andApprotimeGreaterThan(String value) {
            addCriterion("CDR_APPROTIME >", value, "approtime");
            return (Criteria) this;
        }

        public Criteria andApprotimeGreaterThanOrEqualTo(String value) {
            addCriterion("CDR_APPROTIME >=", value, "approtime");
            return (Criteria) this;
        }

        public Criteria andApprotimeLessThan(String value) {
            addCriterion("CDR_APPROTIME <", value, "approtime");
            return (Criteria) this;
        }

        public Criteria andApprotimeLessThanOrEqualTo(String value) {
            addCriterion("CDR_APPROTIME <=", value, "approtime");
            return (Criteria) this;
        }

        public Criteria andApprotimeLike(String value) {
            addCriterion("CDR_APPROTIME like", value, "approtime");
            return (Criteria) this;
        }

        public Criteria andApprotimeNotLike(String value) {
            addCriterion("CDR_APPROTIME not like", value, "approtime");
            return (Criteria) this;
        }

        public Criteria andApprotimeIn(List<String> values) {
            addCriterion("CDR_APPROTIME in", values, "approtime");
            return (Criteria) this;
        }

        public Criteria andApprotimeNotIn(List<String> values) {
            addCriterion("CDR_APPROTIME not in", values, "approtime");
            return (Criteria) this;
        }

        public Criteria andApprotimeBetween(String value1, String value2) {
            addCriterion("CDR_APPROTIME between", value1, value2, "approtime");
            return (Criteria) this;
        }

        public Criteria andApprotimeNotBetween(String value1, String value2) {
            addCriterion("CDR_APPROTIME not between", value1, value2, "approtime");
            return (Criteria) this;
        }

        public Criteria andAppromsgIsNull() {
            addCriterion("CDR_APPROMSG is null");
            return (Criteria) this;
        }

        public Criteria andAppromsgIsNotNull() {
            addCriterion("CDR_APPROMSG is not null");
            return (Criteria) this;
        }

        public Criteria andAppromsgEqualTo(String value) {
            addCriterion("CDR_APPROMSG =", value, "appromsg");
            return (Criteria) this;
        }

        public Criteria andAppromsgNotEqualTo(String value) {
            addCriterion("CDR_APPROMSG <>", value, "appromsg");
            return (Criteria) this;
        }

        public Criteria andAppromsgGreaterThan(String value) {
            addCriterion("CDR_APPROMSG >", value, "appromsg");
            return (Criteria) this;
        }

        public Criteria andAppromsgGreaterThanOrEqualTo(String value) {
            addCriterion("CDR_APPROMSG >=", value, "appromsg");
            return (Criteria) this;
        }

        public Criteria andAppromsgLessThan(String value) {
            addCriterion("CDR_APPROMSG <", value, "appromsg");
            return (Criteria) this;
        }

        public Criteria andAppromsgLessThanOrEqualTo(String value) {
            addCriterion("CDR_APPROMSG <=", value, "appromsg");
            return (Criteria) this;
        }

        public Criteria andAppromsgLike(String value) {
            addCriterion("CDR_APPROMSG like", value, "appromsg");
            return (Criteria) this;
        }

        public Criteria andAppromsgNotLike(String value) {
            addCriterion("CDR_APPROMSG not like", value, "appromsg");
            return (Criteria) this;
        }

        public Criteria andAppromsgIn(List<String> values) {
            addCriterion("CDR_APPROMSG in", values, "appromsg");
            return (Criteria) this;
        }

        public Criteria andAppromsgNotIn(List<String> values) {
            addCriterion("CDR_APPROMSG not in", values, "appromsg");
            return (Criteria) this;
        }

        public Criteria andAppromsgBetween(String value1, String value2) {
            addCriterion("CDR_APPROMSG between", value1, value2, "appromsg");
            return (Criteria) this;
        }

        public Criteria andAppromsgNotBetween(String value1, String value2) {
            addCriterion("CDR_APPROMSG not between", value1, value2, "appromsg");
            return (Criteria) this;
        }

        public Criteria andProcuidIsNull() {
            addCriterion("CDR_PROCUID is null");
            return (Criteria) this;
        }

        public Criteria andProcuidIsNotNull() {
            addCriterion("CDR_PROCUID is not null");
            return (Criteria) this;
        }

        public Criteria andProcuidEqualTo(String value) {
            addCriterion("CDR_PROCUID =", value, "procuid");
            return (Criteria) this;
        }

        public Criteria andProcuidNotEqualTo(String value) {
            addCriterion("CDR_PROCUID <>", value, "procuid");
            return (Criteria) this;
        }

        public Criteria andProcuidGreaterThan(String value) {
            addCriterion("CDR_PROCUID >", value, "procuid");
            return (Criteria) this;
        }

        public Criteria andProcuidGreaterThanOrEqualTo(String value) {
            addCriterion("CDR_PROCUID >=", value, "procuid");
            return (Criteria) this;
        }

        public Criteria andProcuidLessThan(String value) {
            addCriterion("CDR_PROCUID <", value, "procuid");
            return (Criteria) this;
        }

        public Criteria andProcuidLessThanOrEqualTo(String value) {
            addCriterion("CDR_PROCUID <=", value, "procuid");
            return (Criteria) this;
        }

        public Criteria andProcuidLike(String value) {
            addCriterion("CDR_PROCUID like", value, "procuid");
            return (Criteria) this;
        }

        public Criteria andProcuidNotLike(String value) {
            addCriterion("CDR_PROCUID not like", value, "procuid");
            return (Criteria) this;
        }

        public Criteria andProcuidIn(List<String> values) {
            addCriterion("CDR_PROCUID in", values, "procuid");
            return (Criteria) this;
        }

        public Criteria andProcuidNotIn(List<String> values) {
            addCriterion("CDR_PROCUID not in", values, "procuid");
            return (Criteria) this;
        }

        public Criteria andProcuidBetween(String value1, String value2) {
            addCriterion("CDR_PROCUID between", value1, value2, "procuid");
            return (Criteria) this;
        }

        public Criteria andProcuidNotBetween(String value1, String value2) {
            addCriterion("CDR_PROCUID not between", value1, value2, "procuid");
            return (Criteria) this;
        }

        public Criteria andIdLikeInsensitive(String value) {
            addCriterion("upper(CDR_ID) like", value.toUpperCase(), "id");
            return (Criteria) this;
        }

        public Criteria andUidLikeInsensitive(String value) {
            addCriterion("upper(CDR_UID) like", value.toUpperCase(), "uid");
            return (Criteria) this;
        }

        public Criteria andReptypeLikeInsensitive(String value) {
            addCriterion("upper(CDR_REPTYPE) like", value.toUpperCase(), "reptype");
            return (Criteria) this;
        }

        public Criteria andReptimeLikeInsensitive(String value) {
            addCriterion("upper(CDR_REPTIME) like", value.toUpperCase(), "reptime");
            return (Criteria) this;
        }

        public Criteria andQusitemLikeInsensitive(String value) {
            addCriterion("upper(CDR_QUSITEM) like", value.toUpperCase(), "qusitem");
            return (Criteria) this;
        }

        public Criteria andCheckitemLikeInsensitive(String value) {
            addCriterion("upper(CDR_CHECKITEM) like", value.toUpperCase(), "checkitem");
            return (Criteria) this;
        }

        public Criteria andCheckpersionLikeInsensitive(String value) {
            addCriterion("upper(CDR_CHECKPERSION) like", value.toUpperCase(), "checkpersion");
            return (Criteria) this;
        }

        public Criteria andSubpersionLikeInsensitive(String value) {
            addCriterion("upper(CDR_SUBPERSION) like", value.toUpperCase(), "subpersion");
            return (Criteria) this;
        }

        public Criteria andDrawnoLikeInsensitive(String value) {
            addCriterion("upper(CDR_DRAWNO) like", value.toUpperCase(), "drawno");
            return (Criteria) this;
        }

        public Criteria andDownloadLikeInsensitive(String value) {
            addCriterion("upper(CDR_DOWNLOAD) like", value.toUpperCase(), "download");
            return (Criteria) this;
        }

        public Criteria andApprotimeLikeInsensitive(String value) {
            addCriterion("upper(CDR_APPROTIME) like", value.toUpperCase(), "approtime");
            return (Criteria) this;
        }

        public Criteria andAppromsgLikeInsensitive(String value) {
            addCriterion("upper(CDR_APPROMSG) like", value.toUpperCase(), "appromsg");
            return (Criteria) this;
        }

        public Criteria andProcuidLikeInsensitive(String value) {
            addCriterion("upper(CDR_PROCUID) like", value.toUpperCase(), "procuid");
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