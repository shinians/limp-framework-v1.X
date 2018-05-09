package com.chinasofti.domain;

import com.limp.framework.core.bean.Pager;

import java.util.ArrayList;
import java.util.List;

public class CertProHistoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Pager page;

    public CertProHistoryExample() {
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
            addCriterion("CCH_ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("CCH_ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("CCH_ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("CCH_ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("CCH_ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("CCH_ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("CCH_ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("CCH_ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("CCH_ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("CCH_ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("CCH_ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("CCH_ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("CCH_ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("CCH_ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCertidIsNull() {
            addCriterion("CCH_CERTID is null");
            return (Criteria) this;
        }

        public Criteria andCertidIsNotNull() {
            addCriterion("CCH_CERTID is not null");
            return (Criteria) this;
        }

        public Criteria andCertidEqualTo(String value) {
            addCriterion("CCH_CERTID =", value, "certid");
            return (Criteria) this;
        }

        public Criteria andCertidNotEqualTo(String value) {
            addCriterion("CCH_CERTID <>", value, "certid");
            return (Criteria) this;
        }

        public Criteria andCertidGreaterThan(String value) {
            addCriterion("CCH_CERTID >", value, "certid");
            return (Criteria) this;
        }

        public Criteria andCertidGreaterThanOrEqualTo(String value) {
            addCriterion("CCH_CERTID >=", value, "certid");
            return (Criteria) this;
        }

        public Criteria andCertidLessThan(String value) {
            addCriterion("CCH_CERTID <", value, "certid");
            return (Criteria) this;
        }

        public Criteria andCertidLessThanOrEqualTo(String value) {
            addCriterion("CCH_CERTID <=", value, "certid");
            return (Criteria) this;
        }

        public Criteria andCertidLike(String value) {
            addCriterion("CCH_CERTID like", value, "certid");
            return (Criteria) this;
        }

        public Criteria andCertidNotLike(String value) {
            addCriterion("CCH_CERTID not like", value, "certid");
            return (Criteria) this;
        }

        public Criteria andCertidIn(List<String> values) {
            addCriterion("CCH_CERTID in", values, "certid");
            return (Criteria) this;
        }

        public Criteria andCertidNotIn(List<String> values) {
            addCriterion("CCH_CERTID not in", values, "certid");
            return (Criteria) this;
        }

        public Criteria andCertidBetween(String value1, String value2) {
            addCriterion("CCH_CERTID between", value1, value2, "certid");
            return (Criteria) this;
        }

        public Criteria andCertidNotBetween(String value1, String value2) {
            addCriterion("CCH_CERTID not between", value1, value2, "certid");
            return (Criteria) this;
        }

        public Criteria andCheckunitIsNull() {
            addCriterion("CCH_CHECKUNIT is null");
            return (Criteria) this;
        }

        public Criteria andCheckunitIsNotNull() {
            addCriterion("CCH_CHECKUNIT is not null");
            return (Criteria) this;
        }

        public Criteria andCheckunitEqualTo(String value) {
            addCriterion("CCH_CHECKUNIT =", value, "checkunit");
            return (Criteria) this;
        }

        public Criteria andCheckunitNotEqualTo(String value) {
            addCriterion("CCH_CHECKUNIT <>", value, "checkunit");
            return (Criteria) this;
        }

        public Criteria andCheckunitGreaterThan(String value) {
            addCriterion("CCH_CHECKUNIT >", value, "checkunit");
            return (Criteria) this;
        }

        public Criteria andCheckunitGreaterThanOrEqualTo(String value) {
            addCriterion("CCH_CHECKUNIT >=", value, "checkunit");
            return (Criteria) this;
        }

        public Criteria andCheckunitLessThan(String value) {
            addCriterion("CCH_CHECKUNIT <", value, "checkunit");
            return (Criteria) this;
        }

        public Criteria andCheckunitLessThanOrEqualTo(String value) {
            addCriterion("CCH_CHECKUNIT <=", value, "checkunit");
            return (Criteria) this;
        }

        public Criteria andCheckunitLike(String value) {
            addCriterion("CCH_CHECKUNIT like", value, "checkunit");
            return (Criteria) this;
        }

        public Criteria andCheckunitNotLike(String value) {
            addCriterion("CCH_CHECKUNIT not like", value, "checkunit");
            return (Criteria) this;
        }

        public Criteria andCheckunitIn(List<String> values) {
            addCriterion("CCH_CHECKUNIT in", values, "checkunit");
            return (Criteria) this;
        }

        public Criteria andCheckunitNotIn(List<String> values) {
            addCriterion("CCH_CHECKUNIT not in", values, "checkunit");
            return (Criteria) this;
        }

        public Criteria andCheckunitBetween(String value1, String value2) {
            addCriterion("CCH_CHECKUNIT between", value1, value2, "checkunit");
            return (Criteria) this;
        }

        public Criteria andCheckunitNotBetween(String value1, String value2) {
            addCriterion("CCH_CHECKUNIT not between", value1, value2, "checkunit");
            return (Criteria) this;
        }

        public Criteria andOrgnameIsNull() {
            addCriterion("CCH_ORGNAME is null");
            return (Criteria) this;
        }

        public Criteria andOrgnameIsNotNull() {
            addCriterion("CCH_ORGNAME is not null");
            return (Criteria) this;
        }

        public Criteria andOrgnameEqualTo(String value) {
            addCriterion("CCH_ORGNAME =", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameNotEqualTo(String value) {
            addCriterion("CCH_ORGNAME <>", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameGreaterThan(String value) {
            addCriterion("CCH_ORGNAME >", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameGreaterThanOrEqualTo(String value) {
            addCriterion("CCH_ORGNAME >=", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameLessThan(String value) {
            addCriterion("CCH_ORGNAME <", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameLessThanOrEqualTo(String value) {
            addCriterion("CCH_ORGNAME <=", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameLike(String value) {
            addCriterion("CCH_ORGNAME like", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameNotLike(String value) {
            addCriterion("CCH_ORGNAME not like", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameIn(List<String> values) {
            addCriterion("CCH_ORGNAME in", values, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameNotIn(List<String> values) {
            addCriterion("CCH_ORGNAME not in", values, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameBetween(String value1, String value2) {
            addCriterion("CCH_ORGNAME between", value1, value2, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameNotBetween(String value1, String value2) {
            addCriterion("CCH_ORGNAME not between", value1, value2, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgidIsNull() {
            addCriterion("CCH_ORGID is null");
            return (Criteria) this;
        }

        public Criteria andOrgidIsNotNull() {
            addCriterion("CCH_ORGID is not null");
            return (Criteria) this;
        }

        public Criteria andOrgidEqualTo(String value) {
            addCriterion("CCH_ORGID =", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidNotEqualTo(String value) {
            addCriterion("CCH_ORGID <>", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidGreaterThan(String value) {
            addCriterion("CCH_ORGID >", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidGreaterThanOrEqualTo(String value) {
            addCriterion("CCH_ORGID >=", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidLessThan(String value) {
            addCriterion("CCH_ORGID <", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidLessThanOrEqualTo(String value) {
            addCriterion("CCH_ORGID <=", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidLike(String value) {
            addCriterion("CCH_ORGID like", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidNotLike(String value) {
            addCriterion("CCH_ORGID not like", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidIn(List<String> values) {
            addCriterion("CCH_ORGID in", values, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidNotIn(List<String> values) {
            addCriterion("CCH_ORGID not in", values, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidBetween(String value1, String value2) {
            addCriterion("CCH_ORGID between", value1, value2, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidNotBetween(String value1, String value2) {
            addCriterion("CCH_ORGID not between", value1, value2, "orgid");
            return (Criteria) this;
        }

        public Criteria andEntidIsNull() {
            addCriterion("CCH_ENTID is null");
            return (Criteria) this;
        }

        public Criteria andEntidIsNotNull() {
            addCriterion("CCH_ENTID is not null");
            return (Criteria) this;
        }

        public Criteria andEntidEqualTo(String value) {
            addCriterion("CCH_ENTID =", value, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidNotEqualTo(String value) {
            addCriterion("CCH_ENTID <>", value, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidGreaterThan(String value) {
            addCriterion("CCH_ENTID >", value, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidGreaterThanOrEqualTo(String value) {
            addCriterion("CCH_ENTID >=", value, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidLessThan(String value) {
            addCriterion("CCH_ENTID <", value, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidLessThanOrEqualTo(String value) {
            addCriterion("CCH_ENTID <=", value, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidLike(String value) {
            addCriterion("CCH_ENTID like", value, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidNotLike(String value) {
            addCriterion("CCH_ENTID not like", value, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidIn(List<String> values) {
            addCriterion("CCH_ENTID in", values, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidNotIn(List<String> values) {
            addCriterion("CCH_ENTID not in", values, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidBetween(String value1, String value2) {
            addCriterion("CCH_ENTID between", value1, value2, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidNotBetween(String value1, String value2) {
            addCriterion("CCH_ENTID not between", value1, value2, "entid");
            return (Criteria) this;
        }

        public Criteria andEntnameIsNull() {
            addCriterion("CCH_ENTNAME is null");
            return (Criteria) this;
        }

        public Criteria andEntnameIsNotNull() {
            addCriterion("CCH_ENTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andEntnameEqualTo(String value) {
            addCriterion("CCH_ENTNAME =", value, "entname");
            return (Criteria) this;
        }

        public Criteria andEntnameNotEqualTo(String value) {
            addCriterion("CCH_ENTNAME <>", value, "entname");
            return (Criteria) this;
        }

        public Criteria andEntnameGreaterThan(String value) {
            addCriterion("CCH_ENTNAME >", value, "entname");
            return (Criteria) this;
        }

        public Criteria andEntnameGreaterThanOrEqualTo(String value) {
            addCriterion("CCH_ENTNAME >=", value, "entname");
            return (Criteria) this;
        }

        public Criteria andEntnameLessThan(String value) {
            addCriterion("CCH_ENTNAME <", value, "entname");
            return (Criteria) this;
        }

        public Criteria andEntnameLessThanOrEqualTo(String value) {
            addCriterion("CCH_ENTNAME <=", value, "entname");
            return (Criteria) this;
        }

        public Criteria andEntnameLike(String value) {
            addCriterion("CCH_ENTNAME like", value, "entname");
            return (Criteria) this;
        }

        public Criteria andEntnameNotLike(String value) {
            addCriterion("CCH_ENTNAME not like", value, "entname");
            return (Criteria) this;
        }

        public Criteria andEntnameIn(List<String> values) {
            addCriterion("CCH_ENTNAME in", values, "entname");
            return (Criteria) this;
        }

        public Criteria andEntnameNotIn(List<String> values) {
            addCriterion("CCH_ENTNAME not in", values, "entname");
            return (Criteria) this;
        }

        public Criteria andEntnameBetween(String value1, String value2) {
            addCriterion("CCH_ENTNAME between", value1, value2, "entname");
            return (Criteria) this;
        }

        public Criteria andEntnameNotBetween(String value1, String value2) {
            addCriterion("CCH_ENTNAME not between", value1, value2, "entname");
            return (Criteria) this;
        }

        public Criteria andChecktypeIsNull() {
            addCriterion("CCH_CHECKTYPE is null");
            return (Criteria) this;
        }

        public Criteria andChecktypeIsNotNull() {
            addCriterion("CCH_CHECKTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andChecktypeEqualTo(String value) {
            addCriterion("CCH_CHECKTYPE =", value, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeNotEqualTo(String value) {
            addCriterion("CCH_CHECKTYPE <>", value, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeGreaterThan(String value) {
            addCriterion("CCH_CHECKTYPE >", value, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeGreaterThanOrEqualTo(String value) {
            addCriterion("CCH_CHECKTYPE >=", value, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeLessThan(String value) {
            addCriterion("CCH_CHECKTYPE <", value, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeLessThanOrEqualTo(String value) {
            addCriterion("CCH_CHECKTYPE <=", value, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeLike(String value) {
            addCriterion("CCH_CHECKTYPE like", value, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeNotLike(String value) {
            addCriterion("CCH_CHECKTYPE not like", value, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeIn(List<String> values) {
            addCriterion("CCH_CHECKTYPE in", values, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeNotIn(List<String> values) {
            addCriterion("CCH_CHECKTYPE not in", values, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeBetween(String value1, String value2) {
            addCriterion("CCH_CHECKTYPE between", value1, value2, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeNotBetween(String value1, String value2) {
            addCriterion("CCH_CHECKTYPE not between", value1, value2, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktimenextIsNull() {
            addCriterion("CCH_CHECKTIMENEXT is null");
            return (Criteria) this;
        }

        public Criteria andChecktimenextIsNotNull() {
            addCriterion("CCH_CHECKTIMENEXT is not null");
            return (Criteria) this;
        }

        public Criteria andChecktimenextEqualTo(String value) {
            addCriterion("CCH_CHECKTIMENEXT =", value, "checktimenext");
            return (Criteria) this;
        }

        public Criteria andChecktimenextNotEqualTo(String value) {
            addCriterion("CCH_CHECKTIMENEXT <>", value, "checktimenext");
            return (Criteria) this;
        }

        public Criteria andChecktimenextGreaterThan(String value) {
            addCriterion("CCH_CHECKTIMENEXT >", value, "checktimenext");
            return (Criteria) this;
        }

        public Criteria andChecktimenextGreaterThanOrEqualTo(String value) {
            addCriterion("CCH_CHECKTIMENEXT >=", value, "checktimenext");
            return (Criteria) this;
        }

        public Criteria andChecktimenextLessThan(String value) {
            addCriterion("CCH_CHECKTIMENEXT <", value, "checktimenext");
            return (Criteria) this;
        }

        public Criteria andChecktimenextLessThanOrEqualTo(String value) {
            addCriterion("CCH_CHECKTIMENEXT <=", value, "checktimenext");
            return (Criteria) this;
        }

        public Criteria andChecktimenextLike(String value) {
            addCriterion("CCH_CHECKTIMENEXT like", value, "checktimenext");
            return (Criteria) this;
        }

        public Criteria andChecktimenextNotLike(String value) {
            addCriterion("CCH_CHECKTIMENEXT not like", value, "checktimenext");
            return (Criteria) this;
        }

        public Criteria andChecktimenextIn(List<String> values) {
            addCriterion("CCH_CHECKTIMENEXT in", values, "checktimenext");
            return (Criteria) this;
        }

        public Criteria andChecktimenextNotIn(List<String> values) {
            addCriterion("CCH_CHECKTIMENEXT not in", values, "checktimenext");
            return (Criteria) this;
        }

        public Criteria andChecktimenextBetween(String value1, String value2) {
            addCriterion("CCH_CHECKTIMENEXT between", value1, value2, "checktimenext");
            return (Criteria) this;
        }

        public Criteria andChecktimenextNotBetween(String value1, String value2) {
            addCriterion("CCH_CHECKTIMENEXT not between", value1, value2, "checktimenext");
            return (Criteria) this;
        }

        public Criteria andChecktimeIsNull() {
            addCriterion("CCH_CHECKTIME is null");
            return (Criteria) this;
        }

        public Criteria andChecktimeIsNotNull() {
            addCriterion("CCH_CHECKTIME is not null");
            return (Criteria) this;
        }

        public Criteria andChecktimeEqualTo(String value) {
            addCriterion("CCH_CHECKTIME =", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeNotEqualTo(String value) {
            addCriterion("CCH_CHECKTIME <>", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeGreaterThan(String value) {
            addCriterion("CCH_CHECKTIME >", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeGreaterThanOrEqualTo(String value) {
            addCriterion("CCH_CHECKTIME >=", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeLessThan(String value) {
            addCriterion("CCH_CHECKTIME <", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeLessThanOrEqualTo(String value) {
            addCriterion("CCH_CHECKTIME <=", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeLike(String value) {
            addCriterion("CCH_CHECKTIME like", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeNotLike(String value) {
            addCriterion("CCH_CHECKTIME not like", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeIn(List<String> values) {
            addCriterion("CCH_CHECKTIME in", values, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeNotIn(List<String> values) {
            addCriterion("CCH_CHECKTIME not in", values, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeBetween(String value1, String value2) {
            addCriterion("CCH_CHECKTIME between", value1, value2, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeNotBetween(String value1, String value2) {
            addCriterion("CCH_CHECKTIME not between", value1, value2, "checktime");
            return (Criteria) this;
        }

        public Criteria andCertaddrIsNull() {
            addCriterion("CCH_CERTADDR is null");
            return (Criteria) this;
        }

        public Criteria andCertaddrIsNotNull() {
            addCriterion("CCH_CERTADDR is not null");
            return (Criteria) this;
        }

        public Criteria andCertaddrEqualTo(String value) {
            addCriterion("CCH_CERTADDR =", value, "certaddr");
            return (Criteria) this;
        }

        public Criteria andCertaddrNotEqualTo(String value) {
            addCriterion("CCH_CERTADDR <>", value, "certaddr");
            return (Criteria) this;
        }

        public Criteria andCertaddrGreaterThan(String value) {
            addCriterion("CCH_CERTADDR >", value, "certaddr");
            return (Criteria) this;
        }

        public Criteria andCertaddrGreaterThanOrEqualTo(String value) {
            addCriterion("CCH_CERTADDR >=", value, "certaddr");
            return (Criteria) this;
        }

        public Criteria andCertaddrLessThan(String value) {
            addCriterion("CCH_CERTADDR <", value, "certaddr");
            return (Criteria) this;
        }

        public Criteria andCertaddrLessThanOrEqualTo(String value) {
            addCriterion("CCH_CERTADDR <=", value, "certaddr");
            return (Criteria) this;
        }

        public Criteria andCertaddrLike(String value) {
            addCriterion("CCH_CERTADDR like", value, "certaddr");
            return (Criteria) this;
        }

        public Criteria andCertaddrNotLike(String value) {
            addCriterion("CCH_CERTADDR not like", value, "certaddr");
            return (Criteria) this;
        }

        public Criteria andCertaddrIn(List<String> values) {
            addCriterion("CCH_CERTADDR in", values, "certaddr");
            return (Criteria) this;
        }

        public Criteria andCertaddrNotIn(List<String> values) {
            addCriterion("CCH_CERTADDR not in", values, "certaddr");
            return (Criteria) this;
        }

        public Criteria andCertaddrBetween(String value1, String value2) {
            addCriterion("CCH_CERTADDR between", value1, value2, "certaddr");
            return (Criteria) this;
        }

        public Criteria andCertaddrNotBetween(String value1, String value2) {
            addCriterion("CCH_CERTADDR not between", value1, value2, "certaddr");
            return (Criteria) this;
        }

        public Criteria andCerttimeIsNull() {
            addCriterion("CCH_CERTTIME is null");
            return (Criteria) this;
        }

        public Criteria andCerttimeIsNotNull() {
            addCriterion("CCH_CERTTIME is not null");
            return (Criteria) this;
        }

        public Criteria andCerttimeEqualTo(String value) {
            addCriterion("CCH_CERTTIME =", value, "certtime");
            return (Criteria) this;
        }

        public Criteria andCerttimeNotEqualTo(String value) {
            addCriterion("CCH_CERTTIME <>", value, "certtime");
            return (Criteria) this;
        }

        public Criteria andCerttimeGreaterThan(String value) {
            addCriterion("CCH_CERTTIME >", value, "certtime");
            return (Criteria) this;
        }

        public Criteria andCerttimeGreaterThanOrEqualTo(String value) {
            addCriterion("CCH_CERTTIME >=", value, "certtime");
            return (Criteria) this;
        }

        public Criteria andCerttimeLessThan(String value) {
            addCriterion("CCH_CERTTIME <", value, "certtime");
            return (Criteria) this;
        }

        public Criteria andCerttimeLessThanOrEqualTo(String value) {
            addCriterion("CCH_CERTTIME <=", value, "certtime");
            return (Criteria) this;
        }

        public Criteria andCerttimeLike(String value) {
            addCriterion("CCH_CERTTIME like", value, "certtime");
            return (Criteria) this;
        }

        public Criteria andCerttimeNotLike(String value) {
            addCriterion("CCH_CERTTIME not like", value, "certtime");
            return (Criteria) this;
        }

        public Criteria andCerttimeIn(List<String> values) {
            addCriterion("CCH_CERTTIME in", values, "certtime");
            return (Criteria) this;
        }

        public Criteria andCerttimeNotIn(List<String> values) {
            addCriterion("CCH_CERTTIME not in", values, "certtime");
            return (Criteria) this;
        }

        public Criteria andCerttimeBetween(String value1, String value2) {
            addCriterion("CCH_CERTTIME between", value1, value2, "certtime");
            return (Criteria) this;
        }

        public Criteria andCerttimeNotBetween(String value1, String value2) {
            addCriterion("CCH_CERTTIME not between", value1, value2, "certtime");
            return (Criteria) this;
        }

        public Criteria andIdLikeInsensitive(String value) {
            addCriterion("upper(CCH_ID) like", value.toUpperCase(), "id");
            return (Criteria) this;
        }

        public Criteria andCertidLikeInsensitive(String value) {
            addCriterion("upper(CCH_CERTID) like", value.toUpperCase(), "certid");
            return (Criteria) this;
        }

        public Criteria andCheckunitLikeInsensitive(String value) {
            addCriterion("upper(CCH_CHECKUNIT) like", value.toUpperCase(), "checkunit");
            return (Criteria) this;
        }

        public Criteria andOrgnameLikeInsensitive(String value) {
            addCriterion("upper(CCH_ORGNAME) like", value.toUpperCase(), "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgidLikeInsensitive(String value) {
            addCriterion("upper(CCH_ORGID) like", value.toUpperCase(), "orgid");
            return (Criteria) this;
        }

        public Criteria andEntidLikeInsensitive(String value) {
            addCriterion("upper(CCH_ENTID) like", value.toUpperCase(), "entid");
            return (Criteria) this;
        }

        public Criteria andEntnameLikeInsensitive(String value) {
            addCriterion("upper(CCH_ENTNAME) like", value.toUpperCase(), "entname");
            return (Criteria) this;
        }

        public Criteria andChecktypeLikeInsensitive(String value) {
            addCriterion("upper(CCH_CHECKTYPE) like", value.toUpperCase(), "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktimenextLikeInsensitive(String value) {
            addCriterion("upper(CCH_CHECKTIMENEXT) like", value.toUpperCase(), "checktimenext");
            return (Criteria) this;
        }

        public Criteria andChecktimeLikeInsensitive(String value) {
            addCriterion("upper(CCH_CHECKTIME) like", value.toUpperCase(), "checktime");
            return (Criteria) this;
        }

        public Criteria andCertaddrLikeInsensitive(String value) {
            addCriterion("upper(CCH_CERTADDR) like", value.toUpperCase(), "certaddr");
            return (Criteria) this;
        }

        public Criteria andCerttimeLikeInsensitive(String value) {
            addCriterion("upper(CCH_CERTTIME) like", value.toUpperCase(), "certtime");
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