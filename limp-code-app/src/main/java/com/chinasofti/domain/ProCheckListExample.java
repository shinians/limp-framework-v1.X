package com.chinasofti.domain;

import com.limp.framework.core.bean.Pager;

import java.util.ArrayList;
import java.util.List;

public class ProCheckListExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Pager page;

    public ProCheckListExample() {
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
            addCriterion("CPL_ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("CPL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("CPL_ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("CPL_ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("CPL_ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("CPL_ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("CPL_ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("CPL_ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("CPL_ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("CPL_ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("CPL_ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("CPL_ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("CPL_ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("CPL_ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andEntnameIsNull() {
            addCriterion("CPL_ENTNAME is null");
            return (Criteria) this;
        }

        public Criteria andEntnameIsNotNull() {
            addCriterion("CPL_ENTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andEntnameEqualTo(String value) {
            addCriterion("CPL_ENTNAME =", value, "entname");
            return (Criteria) this;
        }

        public Criteria andEntnameNotEqualTo(String value) {
            addCriterion("CPL_ENTNAME <>", value, "entname");
            return (Criteria) this;
        }

        public Criteria andEntnameGreaterThan(String value) {
            addCriterion("CPL_ENTNAME >", value, "entname");
            return (Criteria) this;
        }

        public Criteria andEntnameGreaterThanOrEqualTo(String value) {
            addCriterion("CPL_ENTNAME >=", value, "entname");
            return (Criteria) this;
        }

        public Criteria andEntnameLessThan(String value) {
            addCriterion("CPL_ENTNAME <", value, "entname");
            return (Criteria) this;
        }

        public Criteria andEntnameLessThanOrEqualTo(String value) {
            addCriterion("CPL_ENTNAME <=", value, "entname");
            return (Criteria) this;
        }

        public Criteria andEntnameLike(String value) {
            addCriterion("CPL_ENTNAME like", value, "entname");
            return (Criteria) this;
        }

        public Criteria andEntnameNotLike(String value) {
            addCriterion("CPL_ENTNAME not like", value, "entname");
            return (Criteria) this;
        }

        public Criteria andEntnameIn(List<String> values) {
            addCriterion("CPL_ENTNAME in", values, "entname");
            return (Criteria) this;
        }

        public Criteria andEntnameNotIn(List<String> values) {
            addCriterion("CPL_ENTNAME not in", values, "entname");
            return (Criteria) this;
        }

        public Criteria andEntnameBetween(String value1, String value2) {
            addCriterion("CPL_ENTNAME between", value1, value2, "entname");
            return (Criteria) this;
        }

        public Criteria andEntnameNotBetween(String value1, String value2) {
            addCriterion("CPL_ENTNAME not between", value1, value2, "entname");
            return (Criteria) this;
        }

        public Criteria andEntidIsNull() {
            addCriterion("CPL_ENTID is null");
            return (Criteria) this;
        }

        public Criteria andEntidIsNotNull() {
            addCriterion("CPL_ENTID is not null");
            return (Criteria) this;
        }

        public Criteria andEntidEqualTo(String value) {
            addCriterion("CPL_ENTID =", value, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidNotEqualTo(String value) {
            addCriterion("CPL_ENTID <>", value, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidGreaterThan(String value) {
            addCriterion("CPL_ENTID >", value, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidGreaterThanOrEqualTo(String value) {
            addCriterion("CPL_ENTID >=", value, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidLessThan(String value) {
            addCriterion("CPL_ENTID <", value, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidLessThanOrEqualTo(String value) {
            addCriterion("CPL_ENTID <=", value, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidLike(String value) {
            addCriterion("CPL_ENTID like", value, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidNotLike(String value) {
            addCriterion("CPL_ENTID not like", value, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidIn(List<String> values) {
            addCriterion("CPL_ENTID in", values, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidNotIn(List<String> values) {
            addCriterion("CPL_ENTID not in", values, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidBetween(String value1, String value2) {
            addCriterion("CPL_ENTID between", value1, value2, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidNotBetween(String value1, String value2) {
            addCriterion("CPL_ENTID not between", value1, value2, "entid");
            return (Criteria) this;
        }

        public Criteria andUidIsNull() {
            addCriterion("CPL_UID is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("CPL_UID is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(String value) {
            addCriterion("CPL_UID =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(String value) {
            addCriterion("CPL_UID <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(String value) {
            addCriterion("CPL_UID >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(String value) {
            addCriterion("CPL_UID >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(String value) {
            addCriterion("CPL_UID <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(String value) {
            addCriterion("CPL_UID <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLike(String value) {
            addCriterion("CPL_UID like", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotLike(String value) {
            addCriterion("CPL_UID not like", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<String> values) {
            addCriterion("CPL_UID in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<String> values) {
            addCriterion("CPL_UID not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(String value1, String value2) {
            addCriterion("CPL_UID between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(String value1, String value2) {
            addCriterion("CPL_UID not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andProtypeIsNull() {
            addCriterion("CPL_PROTYPE is null");
            return (Criteria) this;
        }

        public Criteria andProtypeIsNotNull() {
            addCriterion("CPL_PROTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andProtypeEqualTo(String value) {
            addCriterion("CPL_PROTYPE =", value, "protype");
            return (Criteria) this;
        }

        public Criteria andProtypeNotEqualTo(String value) {
            addCriterion("CPL_PROTYPE <>", value, "protype");
            return (Criteria) this;
        }

        public Criteria andProtypeGreaterThan(String value) {
            addCriterion("CPL_PROTYPE >", value, "protype");
            return (Criteria) this;
        }

        public Criteria andProtypeGreaterThanOrEqualTo(String value) {
            addCriterion("CPL_PROTYPE >=", value, "protype");
            return (Criteria) this;
        }

        public Criteria andProtypeLessThan(String value) {
            addCriterion("CPL_PROTYPE <", value, "protype");
            return (Criteria) this;
        }

        public Criteria andProtypeLessThanOrEqualTo(String value) {
            addCriterion("CPL_PROTYPE <=", value, "protype");
            return (Criteria) this;
        }

        public Criteria andProtypeLike(String value) {
            addCriterion("CPL_PROTYPE like", value, "protype");
            return (Criteria) this;
        }

        public Criteria andProtypeNotLike(String value) {
            addCriterion("CPL_PROTYPE not like", value, "protype");
            return (Criteria) this;
        }

        public Criteria andProtypeIn(List<String> values) {
            addCriterion("CPL_PROTYPE in", values, "protype");
            return (Criteria) this;
        }

        public Criteria andProtypeNotIn(List<String> values) {
            addCriterion("CPL_PROTYPE not in", values, "protype");
            return (Criteria) this;
        }

        public Criteria andProtypeBetween(String value1, String value2) {
            addCriterion("CPL_PROTYPE between", value1, value2, "protype");
            return (Criteria) this;
        }

        public Criteria andProtypeNotBetween(String value1, String value2) {
            addCriterion("CPL_PROTYPE not between", value1, value2, "protype");
            return (Criteria) this;
        }

        public Criteria andCernoIsNull() {
            addCriterion("CPL_CERNO is null");
            return (Criteria) this;
        }

        public Criteria andCernoIsNotNull() {
            addCriterion("CPL_CERNO is not null");
            return (Criteria) this;
        }

        public Criteria andCernoEqualTo(String value) {
            addCriterion("CPL_CERNO =", value, "cerno");
            return (Criteria) this;
        }

        public Criteria andCernoNotEqualTo(String value) {
            addCriterion("CPL_CERNO <>", value, "cerno");
            return (Criteria) this;
        }

        public Criteria andCernoGreaterThan(String value) {
            addCriterion("CPL_CERNO >", value, "cerno");
            return (Criteria) this;
        }

        public Criteria andCernoGreaterThanOrEqualTo(String value) {
            addCriterion("CPL_CERNO >=", value, "cerno");
            return (Criteria) this;
        }

        public Criteria andCernoLessThan(String value) {
            addCriterion("CPL_CERNO <", value, "cerno");
            return (Criteria) this;
        }

        public Criteria andCernoLessThanOrEqualTo(String value) {
            addCriterion("CPL_CERNO <=", value, "cerno");
            return (Criteria) this;
        }

        public Criteria andCernoLike(String value) {
            addCriterion("CPL_CERNO like", value, "cerno");
            return (Criteria) this;
        }

        public Criteria andCernoNotLike(String value) {
            addCriterion("CPL_CERNO not like", value, "cerno");
            return (Criteria) this;
        }

        public Criteria andCernoIn(List<String> values) {
            addCriterion("CPL_CERNO in", values, "cerno");
            return (Criteria) this;
        }

        public Criteria andCernoNotIn(List<String> values) {
            addCriterion("CPL_CERNO not in", values, "cerno");
            return (Criteria) this;
        }

        public Criteria andCernoBetween(String value1, String value2) {
            addCriterion("CPL_CERNO between", value1, value2, "cerno");
            return (Criteria) this;
        }

        public Criteria andCernoNotBetween(String value1, String value2) {
            addCriterion("CPL_CERNO not between", value1, value2, "cerno");
            return (Criteria) this;
        }

        public Criteria andPromodelIsNull() {
            addCriterion("CPL_PROMODEL is null");
            return (Criteria) this;
        }

        public Criteria andPromodelIsNotNull() {
            addCriterion("CPL_PROMODEL is not null");
            return (Criteria) this;
        }

        public Criteria andPromodelEqualTo(String value) {
            addCriterion("CPL_PROMODEL =", value, "promodel");
            return (Criteria) this;
        }

        public Criteria andPromodelNotEqualTo(String value) {
            addCriterion("CPL_PROMODEL <>", value, "promodel");
            return (Criteria) this;
        }

        public Criteria andPromodelGreaterThan(String value) {
            addCriterion("CPL_PROMODEL >", value, "promodel");
            return (Criteria) this;
        }

        public Criteria andPromodelGreaterThanOrEqualTo(String value) {
            addCriterion("CPL_PROMODEL >=", value, "promodel");
            return (Criteria) this;
        }

        public Criteria andPromodelLessThan(String value) {
            addCriterion("CPL_PROMODEL <", value, "promodel");
            return (Criteria) this;
        }

        public Criteria andPromodelLessThanOrEqualTo(String value) {
            addCriterion("CPL_PROMODEL <=", value, "promodel");
            return (Criteria) this;
        }

        public Criteria andPromodelLike(String value) {
            addCriterion("CPL_PROMODEL like", value, "promodel");
            return (Criteria) this;
        }

        public Criteria andPromodelNotLike(String value) {
            addCriterion("CPL_PROMODEL not like", value, "promodel");
            return (Criteria) this;
        }

        public Criteria andPromodelIn(List<String> values) {
            addCriterion("CPL_PROMODEL in", values, "promodel");
            return (Criteria) this;
        }

        public Criteria andPromodelNotIn(List<String> values) {
            addCriterion("CPL_PROMODEL not in", values, "promodel");
            return (Criteria) this;
        }

        public Criteria andPromodelBetween(String value1, String value2) {
            addCriterion("CPL_PROMODEL between", value1, value2, "promodel");
            return (Criteria) this;
        }

        public Criteria andPromodelNotBetween(String value1, String value2) {
            addCriterion("CPL_PROMODEL not between", value1, value2, "promodel");
            return (Criteria) this;
        }

        public Criteria andPronameIsNull() {
            addCriterion("CPL_PRONAME is null");
            return (Criteria) this;
        }

        public Criteria andPronameIsNotNull() {
            addCriterion("CPL_PRONAME is not null");
            return (Criteria) this;
        }

        public Criteria andPronameEqualTo(String value) {
            addCriterion("CPL_PRONAME =", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameNotEqualTo(String value) {
            addCriterion("CPL_PRONAME <>", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameGreaterThan(String value) {
            addCriterion("CPL_PRONAME >", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameGreaterThanOrEqualTo(String value) {
            addCriterion("CPL_PRONAME >=", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameLessThan(String value) {
            addCriterion("CPL_PRONAME <", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameLessThanOrEqualTo(String value) {
            addCriterion("CPL_PRONAME <=", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameLike(String value) {
            addCriterion("CPL_PRONAME like", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameNotLike(String value) {
            addCriterion("CPL_PRONAME not like", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameIn(List<String> values) {
            addCriterion("CPL_PRONAME in", values, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameNotIn(List<String> values) {
            addCriterion("CPL_PRONAME not in", values, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameBetween(String value1, String value2) {
            addCriterion("CPL_PRONAME between", value1, value2, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameNotBetween(String value1, String value2) {
            addCriterion("CPL_PRONAME not between", value1, value2, "proname");
            return (Criteria) this;
        }

        public Criteria andCheckunitIsNull() {
            addCriterion("CPL_CHECKUNIT is null");
            return (Criteria) this;
        }

        public Criteria andCheckunitIsNotNull() {
            addCriterion("CPL_CHECKUNIT is not null");
            return (Criteria) this;
        }

        public Criteria andCheckunitEqualTo(String value) {
            addCriterion("CPL_CHECKUNIT =", value, "checkunit");
            return (Criteria) this;
        }

        public Criteria andCheckunitNotEqualTo(String value) {
            addCriterion("CPL_CHECKUNIT <>", value, "checkunit");
            return (Criteria) this;
        }

        public Criteria andCheckunitGreaterThan(String value) {
            addCriterion("CPL_CHECKUNIT >", value, "checkunit");
            return (Criteria) this;
        }

        public Criteria andCheckunitGreaterThanOrEqualTo(String value) {
            addCriterion("CPL_CHECKUNIT >=", value, "checkunit");
            return (Criteria) this;
        }

        public Criteria andCheckunitLessThan(String value) {
            addCriterion("CPL_CHECKUNIT <", value, "checkunit");
            return (Criteria) this;
        }

        public Criteria andCheckunitLessThanOrEqualTo(String value) {
            addCriterion("CPL_CHECKUNIT <=", value, "checkunit");
            return (Criteria) this;
        }

        public Criteria andCheckunitLike(String value) {
            addCriterion("CPL_CHECKUNIT like", value, "checkunit");
            return (Criteria) this;
        }

        public Criteria andCheckunitNotLike(String value) {
            addCriterion("CPL_CHECKUNIT not like", value, "checkunit");
            return (Criteria) this;
        }

        public Criteria andCheckunitIn(List<String> values) {
            addCriterion("CPL_CHECKUNIT in", values, "checkunit");
            return (Criteria) this;
        }

        public Criteria andCheckunitNotIn(List<String> values) {
            addCriterion("CPL_CHECKUNIT not in", values, "checkunit");
            return (Criteria) this;
        }

        public Criteria andCheckunitBetween(String value1, String value2) {
            addCriterion("CPL_CHECKUNIT between", value1, value2, "checkunit");
            return (Criteria) this;
        }

        public Criteria andCheckunitNotBetween(String value1, String value2) {
            addCriterion("CPL_CHECKUNIT not between", value1, value2, "checkunit");
            return (Criteria) this;
        }

        public Criteria andCheckpersionIsNull() {
            addCriterion("CPL_CHECKPERSION is null");
            return (Criteria) this;
        }

        public Criteria andCheckpersionIsNotNull() {
            addCriterion("CPL_CHECKPERSION is not null");
            return (Criteria) this;
        }

        public Criteria andCheckpersionEqualTo(String value) {
            addCriterion("CPL_CHECKPERSION =", value, "checkpersion");
            return (Criteria) this;
        }

        public Criteria andCheckpersionNotEqualTo(String value) {
            addCriterion("CPL_CHECKPERSION <>", value, "checkpersion");
            return (Criteria) this;
        }

        public Criteria andCheckpersionGreaterThan(String value) {
            addCriterion("CPL_CHECKPERSION >", value, "checkpersion");
            return (Criteria) this;
        }

        public Criteria andCheckpersionGreaterThanOrEqualTo(String value) {
            addCriterion("CPL_CHECKPERSION >=", value, "checkpersion");
            return (Criteria) this;
        }

        public Criteria andCheckpersionLessThan(String value) {
            addCriterion("CPL_CHECKPERSION <", value, "checkpersion");
            return (Criteria) this;
        }

        public Criteria andCheckpersionLessThanOrEqualTo(String value) {
            addCriterion("CPL_CHECKPERSION <=", value, "checkpersion");
            return (Criteria) this;
        }

        public Criteria andCheckpersionLike(String value) {
            addCriterion("CPL_CHECKPERSION like", value, "checkpersion");
            return (Criteria) this;
        }

        public Criteria andCheckpersionNotLike(String value) {
            addCriterion("CPL_CHECKPERSION not like", value, "checkpersion");
            return (Criteria) this;
        }

        public Criteria andCheckpersionIn(List<String> values) {
            addCriterion("CPL_CHECKPERSION in", values, "checkpersion");
            return (Criteria) this;
        }

        public Criteria andCheckpersionNotIn(List<String> values) {
            addCriterion("CPL_CHECKPERSION not in", values, "checkpersion");
            return (Criteria) this;
        }

        public Criteria andCheckpersionBetween(String value1, String value2) {
            addCriterion("CPL_CHECKPERSION between", value1, value2, "checkpersion");
            return (Criteria) this;
        }

        public Criteria andCheckpersionNotBetween(String value1, String value2) {
            addCriterion("CPL_CHECKPERSION not between", value1, value2, "checkpersion");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNull() {
            addCriterion("CPL_ENDTIME is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNotNull() {
            addCriterion("CPL_ENDTIME is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeEqualTo(String value) {
            addCriterion("CPL_ENDTIME =", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotEqualTo(String value) {
            addCriterion("CPL_ENDTIME <>", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThan(String value) {
            addCriterion("CPL_ENDTIME >", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThanOrEqualTo(String value) {
            addCriterion("CPL_ENDTIME >=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThan(String value) {
            addCriterion("CPL_ENDTIME <", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThanOrEqualTo(String value) {
            addCriterion("CPL_ENDTIME <=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLike(String value) {
            addCriterion("CPL_ENDTIME like", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotLike(String value) {
            addCriterion("CPL_ENDTIME not like", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIn(List<String> values) {
            addCriterion("CPL_ENDTIME in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotIn(List<String> values) {
            addCriterion("CPL_ENDTIME not in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeBetween(String value1, String value2) {
            addCriterion("CPL_ENDTIME between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotBetween(String value1, String value2) {
            addCriterion("CPL_ENDTIME not between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andChecktimeIsNull() {
            addCriterion("CPL_CHECKTIME is null");
            return (Criteria) this;
        }

        public Criteria andChecktimeIsNotNull() {
            addCriterion("CPL_CHECKTIME is not null");
            return (Criteria) this;
        }

        public Criteria andChecktimeEqualTo(String value) {
            addCriterion("CPL_CHECKTIME =", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeNotEqualTo(String value) {
            addCriterion("CPL_CHECKTIME <>", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeGreaterThan(String value) {
            addCriterion("CPL_CHECKTIME >", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeGreaterThanOrEqualTo(String value) {
            addCriterion("CPL_CHECKTIME >=", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeLessThan(String value) {
            addCriterion("CPL_CHECKTIME <", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeLessThanOrEqualTo(String value) {
            addCriterion("CPL_CHECKTIME <=", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeLike(String value) {
            addCriterion("CPL_CHECKTIME like", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeNotLike(String value) {
            addCriterion("CPL_CHECKTIME not like", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeIn(List<String> values) {
            addCriterion("CPL_CHECKTIME in", values, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeNotIn(List<String> values) {
            addCriterion("CPL_CHECKTIME not in", values, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeBetween(String value1, String value2) {
            addCriterion("CPL_CHECKTIME between", value1, value2, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeNotBetween(String value1, String value2) {
            addCriterion("CPL_CHECKTIME not between", value1, value2, "checktime");
            return (Criteria) this;
        }

        public Criteria andIdLikeInsensitive(String value) {
            addCriterion("upper(CPL_ID) like", value.toUpperCase(), "id");
            return (Criteria) this;
        }

        public Criteria andEntnameLikeInsensitive(String value) {
            addCriterion("upper(CPL_ENTNAME) like", value.toUpperCase(), "entname");
            return (Criteria) this;
        }

        public Criteria andEntidLikeInsensitive(String value) {
            addCriterion("upper(CPL_ENTID) like", value.toUpperCase(), "entid");
            return (Criteria) this;
        }

        public Criteria andUidLikeInsensitive(String value) {
            addCriterion("upper(CPL_UID) like", value.toUpperCase(), "uid");
            return (Criteria) this;
        }

        public Criteria andProtypeLikeInsensitive(String value) {
            addCriterion("upper(CPL_PROTYPE) like", value.toUpperCase(), "protype");
            return (Criteria) this;
        }

        public Criteria andCernoLikeInsensitive(String value) {
            addCriterion("upper(CPL_CERNO) like", value.toUpperCase(), "cerno");
            return (Criteria) this;
        }

        public Criteria andPromodelLikeInsensitive(String value) {
            addCriterion("upper(CPL_PROMODEL) like", value.toUpperCase(), "promodel");
            return (Criteria) this;
        }

        public Criteria andPronameLikeInsensitive(String value) {
            addCriterion("upper(CPL_PRONAME) like", value.toUpperCase(), "proname");
            return (Criteria) this;
        }

        public Criteria andCheckunitLikeInsensitive(String value) {
            addCriterion("upper(CPL_CHECKUNIT) like", value.toUpperCase(), "checkunit");
            return (Criteria) this;
        }

        public Criteria andCheckpersionLikeInsensitive(String value) {
            addCriterion("upper(CPL_CHECKPERSION) like", value.toUpperCase(), "checkpersion");
            return (Criteria) this;
        }

        public Criteria andEndtimeLikeInsensitive(String value) {
            addCriterion("upper(CPL_ENDTIME) like", value.toUpperCase(), "endtime");
            return (Criteria) this;
        }

        public Criteria andChecktimeLikeInsensitive(String value) {
            addCriterion("upper(CPL_CHECKTIME) like", value.toUpperCase(), "checktime");
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