package com.chinasofti.domain;

import com.limp.framework.core.bean.Pager;

import java.util.ArrayList;
import java.util.List;

public class CommentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Pager page;

    public CommentExample() {
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
            addCriterion("CC_ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("CC_ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("CC_ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("CC_ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("CC_ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("CC_ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("CC_ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("CC_ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("CC_ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("CC_ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("CC_ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("CC_ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("CC_ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("CC_ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("CC_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("CC_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("CC_CONTENT =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("CC_CONTENT <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("CC_CONTENT >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("CC_CONTENT >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("CC_CONTENT <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("CC_CONTENT <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("CC_CONTENT like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("CC_CONTENT not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("CC_CONTENT in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("CC_CONTENT not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("CC_CONTENT between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("CC_CONTENT not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andTargetnameIsNull() {
            addCriterion("CC_TARGETNAME is null");
            return (Criteria) this;
        }

        public Criteria andTargetnameIsNotNull() {
            addCriterion("CC_TARGETNAME is not null");
            return (Criteria) this;
        }

        public Criteria andTargetnameEqualTo(String value) {
            addCriterion("CC_TARGETNAME =", value, "targetname");
            return (Criteria) this;
        }

        public Criteria andTargetnameNotEqualTo(String value) {
            addCriterion("CC_TARGETNAME <>", value, "targetname");
            return (Criteria) this;
        }

        public Criteria andTargetnameGreaterThan(String value) {
            addCriterion("CC_TARGETNAME >", value, "targetname");
            return (Criteria) this;
        }

        public Criteria andTargetnameGreaterThanOrEqualTo(String value) {
            addCriterion("CC_TARGETNAME >=", value, "targetname");
            return (Criteria) this;
        }

        public Criteria andTargetnameLessThan(String value) {
            addCriterion("CC_TARGETNAME <", value, "targetname");
            return (Criteria) this;
        }

        public Criteria andTargetnameLessThanOrEqualTo(String value) {
            addCriterion("CC_TARGETNAME <=", value, "targetname");
            return (Criteria) this;
        }

        public Criteria andTargetnameLike(String value) {
            addCriterion("CC_TARGETNAME like", value, "targetname");
            return (Criteria) this;
        }

        public Criteria andTargetnameNotLike(String value) {
            addCriterion("CC_TARGETNAME not like", value, "targetname");
            return (Criteria) this;
        }

        public Criteria andTargetnameIn(List<String> values) {
            addCriterion("CC_TARGETNAME in", values, "targetname");
            return (Criteria) this;
        }

        public Criteria andTargetnameNotIn(List<String> values) {
            addCriterion("CC_TARGETNAME not in", values, "targetname");
            return (Criteria) this;
        }

        public Criteria andTargetnameBetween(String value1, String value2) {
            addCriterion("CC_TARGETNAME between", value1, value2, "targetname");
            return (Criteria) this;
        }

        public Criteria andTargetnameNotBetween(String value1, String value2) {
            addCriterion("CC_TARGETNAME not between", value1, value2, "targetname");
            return (Criteria) this;
        }

        public Criteria andTargetidIsNull() {
            addCriterion("CC_TARGETID is null");
            return (Criteria) this;
        }

        public Criteria andTargetidIsNotNull() {
            addCriterion("CC_TARGETID is not null");
            return (Criteria) this;
        }

        public Criteria andTargetidEqualTo(String value) {
            addCriterion("CC_TARGETID =", value, "targetid");
            return (Criteria) this;
        }

        public Criteria andTargetidNotEqualTo(String value) {
            addCriterion("CC_TARGETID <>", value, "targetid");
            return (Criteria) this;
        }

        public Criteria andTargetidGreaterThan(String value) {
            addCriterion("CC_TARGETID >", value, "targetid");
            return (Criteria) this;
        }

        public Criteria andTargetidGreaterThanOrEqualTo(String value) {
            addCriterion("CC_TARGETID >=", value, "targetid");
            return (Criteria) this;
        }

        public Criteria andTargetidLessThan(String value) {
            addCriterion("CC_TARGETID <", value, "targetid");
            return (Criteria) this;
        }

        public Criteria andTargetidLessThanOrEqualTo(String value) {
            addCriterion("CC_TARGETID <=", value, "targetid");
            return (Criteria) this;
        }

        public Criteria andTargetidLike(String value) {
            addCriterion("CC_TARGETID like", value, "targetid");
            return (Criteria) this;
        }

        public Criteria andTargetidNotLike(String value) {
            addCriterion("CC_TARGETID not like", value, "targetid");
            return (Criteria) this;
        }

        public Criteria andTargetidIn(List<String> values) {
            addCriterion("CC_TARGETID in", values, "targetid");
            return (Criteria) this;
        }

        public Criteria andTargetidNotIn(List<String> values) {
            addCriterion("CC_TARGETID not in", values, "targetid");
            return (Criteria) this;
        }

        public Criteria andTargetidBetween(String value1, String value2) {
            addCriterion("CC_TARGETID between", value1, value2, "targetid");
            return (Criteria) this;
        }

        public Criteria andTargetidNotBetween(String value1, String value2) {
            addCriterion("CC_TARGETID not between", value1, value2, "targetid");
            return (Criteria) this;
        }

        public Criteria andEntidIsNull() {
            addCriterion("CC_ENTID is null");
            return (Criteria) this;
        }

        public Criteria andEntidIsNotNull() {
            addCriterion("CC_ENTID is not null");
            return (Criteria) this;
        }

        public Criteria andEntidEqualTo(String value) {
            addCriterion("CC_ENTID =", value, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidNotEqualTo(String value) {
            addCriterion("CC_ENTID <>", value, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidGreaterThan(String value) {
            addCriterion("CC_ENTID >", value, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidGreaterThanOrEqualTo(String value) {
            addCriterion("CC_ENTID >=", value, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidLessThan(String value) {
            addCriterion("CC_ENTID <", value, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidLessThanOrEqualTo(String value) {
            addCriterion("CC_ENTID <=", value, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidLike(String value) {
            addCriterion("CC_ENTID like", value, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidNotLike(String value) {
            addCriterion("CC_ENTID not like", value, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidIn(List<String> values) {
            addCriterion("CC_ENTID in", values, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidNotIn(List<String> values) {
            addCriterion("CC_ENTID not in", values, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidBetween(String value1, String value2) {
            addCriterion("CC_ENTID between", value1, value2, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidNotBetween(String value1, String value2) {
            addCriterion("CC_ENTID not between", value1, value2, "entid");
            return (Criteria) this;
        }

        public Criteria andEntnameIsNull() {
            addCriterion("CC_ENTNAME is null");
            return (Criteria) this;
        }

        public Criteria andEntnameIsNotNull() {
            addCriterion("CC_ENTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andEntnameEqualTo(String value) {
            addCriterion("CC_ENTNAME =", value, "entname");
            return (Criteria) this;
        }

        public Criteria andEntnameNotEqualTo(String value) {
            addCriterion("CC_ENTNAME <>", value, "entname");
            return (Criteria) this;
        }

        public Criteria andEntnameGreaterThan(String value) {
            addCriterion("CC_ENTNAME >", value, "entname");
            return (Criteria) this;
        }

        public Criteria andEntnameGreaterThanOrEqualTo(String value) {
            addCriterion("CC_ENTNAME >=", value, "entname");
            return (Criteria) this;
        }

        public Criteria andEntnameLessThan(String value) {
            addCriterion("CC_ENTNAME <", value, "entname");
            return (Criteria) this;
        }

        public Criteria andEntnameLessThanOrEqualTo(String value) {
            addCriterion("CC_ENTNAME <=", value, "entname");
            return (Criteria) this;
        }

        public Criteria andEntnameLike(String value) {
            addCriterion("CC_ENTNAME like", value, "entname");
            return (Criteria) this;
        }

        public Criteria andEntnameNotLike(String value) {
            addCriterion("CC_ENTNAME not like", value, "entname");
            return (Criteria) this;
        }

        public Criteria andEntnameIn(List<String> values) {
            addCriterion("CC_ENTNAME in", values, "entname");
            return (Criteria) this;
        }

        public Criteria andEntnameNotIn(List<String> values) {
            addCriterion("CC_ENTNAME not in", values, "entname");
            return (Criteria) this;
        }

        public Criteria andEntnameBetween(String value1, String value2) {
            addCriterion("CC_ENTNAME between", value1, value2, "entname");
            return (Criteria) this;
        }

        public Criteria andEntnameNotBetween(String value1, String value2) {
            addCriterion("CC_ENTNAME not between", value1, value2, "entname");
            return (Criteria) this;
        }

        public Criteria andCommcateIsNull() {
            addCriterion("CC_COMMCATE is null");
            return (Criteria) this;
        }

        public Criteria andCommcateIsNotNull() {
            addCriterion("CC_COMMCATE is not null");
            return (Criteria) this;
        }

        public Criteria andCommcateEqualTo(Short value) {
            addCriterion("CC_COMMCATE =", value, "commcate");
            return (Criteria) this;
        }

        public Criteria andCommcateNotEqualTo(Short value) {
            addCriterion("CC_COMMCATE <>", value, "commcate");
            return (Criteria) this;
        }

        public Criteria andCommcateGreaterThan(Short value) {
            addCriterion("CC_COMMCATE >", value, "commcate");
            return (Criteria) this;
        }

        public Criteria andCommcateGreaterThanOrEqualTo(Short value) {
            addCriterion("CC_COMMCATE >=", value, "commcate");
            return (Criteria) this;
        }

        public Criteria andCommcateLessThan(Short value) {
            addCriterion("CC_COMMCATE <", value, "commcate");
            return (Criteria) this;
        }

        public Criteria andCommcateLessThanOrEqualTo(Short value) {
            addCriterion("CC_COMMCATE <=", value, "commcate");
            return (Criteria) this;
        }

        public Criteria andCommcateIn(List<Short> values) {
            addCriterion("CC_COMMCATE in", values, "commcate");
            return (Criteria) this;
        }

        public Criteria andCommcateNotIn(List<Short> values) {
            addCriterion("CC_COMMCATE not in", values, "commcate");
            return (Criteria) this;
        }

        public Criteria andCommcateBetween(Short value1, Short value2) {
            addCriterion("CC_COMMCATE between", value1, value2, "commcate");
            return (Criteria) this;
        }

        public Criteria andCommcateNotBetween(Short value1, Short value2) {
            addCriterion("CC_COMMCATE not between", value1, value2, "commcate");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("CC_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("CC_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("CC_TYPE =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("CC_TYPE <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("CC_TYPE >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CC_TYPE >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("CC_TYPE <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("CC_TYPE <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("CC_TYPE like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("CC_TYPE not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("CC_TYPE in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("CC_TYPE not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("CC_TYPE between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("CC_TYPE not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andCommtimeIsNull() {
            addCriterion("CC_COMMTIME is null");
            return (Criteria) this;
        }

        public Criteria andCommtimeIsNotNull() {
            addCriterion("CC_COMMTIME is not null");
            return (Criteria) this;
        }

        public Criteria andCommtimeEqualTo(String value) {
            addCriterion("CC_COMMTIME =", value, "commtime");
            return (Criteria) this;
        }

        public Criteria andCommtimeNotEqualTo(String value) {
            addCriterion("CC_COMMTIME <>", value, "commtime");
            return (Criteria) this;
        }

        public Criteria andCommtimeGreaterThan(String value) {
            addCriterion("CC_COMMTIME >", value, "commtime");
            return (Criteria) this;
        }

        public Criteria andCommtimeGreaterThanOrEqualTo(String value) {
            addCriterion("CC_COMMTIME >=", value, "commtime");
            return (Criteria) this;
        }

        public Criteria andCommtimeLessThan(String value) {
            addCriterion("CC_COMMTIME <", value, "commtime");
            return (Criteria) this;
        }

        public Criteria andCommtimeLessThanOrEqualTo(String value) {
            addCriterion("CC_COMMTIME <=", value, "commtime");
            return (Criteria) this;
        }

        public Criteria andCommtimeLike(String value) {
            addCriterion("CC_COMMTIME like", value, "commtime");
            return (Criteria) this;
        }

        public Criteria andCommtimeNotLike(String value) {
            addCriterion("CC_COMMTIME not like", value, "commtime");
            return (Criteria) this;
        }

        public Criteria andCommtimeIn(List<String> values) {
            addCriterion("CC_COMMTIME in", values, "commtime");
            return (Criteria) this;
        }

        public Criteria andCommtimeNotIn(List<String> values) {
            addCriterion("CC_COMMTIME not in", values, "commtime");
            return (Criteria) this;
        }

        public Criteria andCommtimeBetween(String value1, String value2) {
            addCriterion("CC_COMMTIME between", value1, value2, "commtime");
            return (Criteria) this;
        }

        public Criteria andCommtimeNotBetween(String value1, String value2) {
            addCriterion("CC_COMMTIME not between", value1, value2, "commtime");
            return (Criteria) this;
        }

        public Criteria andCriticnameIsNull() {
            addCriterion("CC_CRITICNAME is null");
            return (Criteria) this;
        }

        public Criteria andCriticnameIsNotNull() {
            addCriterion("CC_CRITICNAME is not null");
            return (Criteria) this;
        }

        public Criteria andCriticnameEqualTo(String value) {
            addCriterion("CC_CRITICNAME =", value, "criticname");
            return (Criteria) this;
        }

        public Criteria andCriticnameNotEqualTo(String value) {
            addCriterion("CC_CRITICNAME <>", value, "criticname");
            return (Criteria) this;
        }

        public Criteria andCriticnameGreaterThan(String value) {
            addCriterion("CC_CRITICNAME >", value, "criticname");
            return (Criteria) this;
        }

        public Criteria andCriticnameGreaterThanOrEqualTo(String value) {
            addCriterion("CC_CRITICNAME >=", value, "criticname");
            return (Criteria) this;
        }

        public Criteria andCriticnameLessThan(String value) {
            addCriterion("CC_CRITICNAME <", value, "criticname");
            return (Criteria) this;
        }

        public Criteria andCriticnameLessThanOrEqualTo(String value) {
            addCriterion("CC_CRITICNAME <=", value, "criticname");
            return (Criteria) this;
        }

        public Criteria andCriticnameLike(String value) {
            addCriterion("CC_CRITICNAME like", value, "criticname");
            return (Criteria) this;
        }

        public Criteria andCriticnameNotLike(String value) {
            addCriterion("CC_CRITICNAME not like", value, "criticname");
            return (Criteria) this;
        }

        public Criteria andCriticnameIn(List<String> values) {
            addCriterion("CC_CRITICNAME in", values, "criticname");
            return (Criteria) this;
        }

        public Criteria andCriticnameNotIn(List<String> values) {
            addCriterion("CC_CRITICNAME not in", values, "criticname");
            return (Criteria) this;
        }

        public Criteria andCriticnameBetween(String value1, String value2) {
            addCriterion("CC_CRITICNAME between", value1, value2, "criticname");
            return (Criteria) this;
        }

        public Criteria andCriticnameNotBetween(String value1, String value2) {
            addCriterion("CC_CRITICNAME not between", value1, value2, "criticname");
            return (Criteria) this;
        }

        public Criteria andCritictypeIsNull() {
            addCriterion("CC_CRITICTYPE is null");
            return (Criteria) this;
        }

        public Criteria andCritictypeIsNotNull() {
            addCriterion("CC_CRITICTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCritictypeEqualTo(Short value) {
            addCriterion("CC_CRITICTYPE =", value, "critictype");
            return (Criteria) this;
        }

        public Criteria andCritictypeNotEqualTo(Short value) {
            addCriterion("CC_CRITICTYPE <>", value, "critictype");
            return (Criteria) this;
        }

        public Criteria andCritictypeGreaterThan(Short value) {
            addCriterion("CC_CRITICTYPE >", value, "critictype");
            return (Criteria) this;
        }

        public Criteria andCritictypeGreaterThanOrEqualTo(Short value) {
            addCriterion("CC_CRITICTYPE >=", value, "critictype");
            return (Criteria) this;
        }

        public Criteria andCritictypeLessThan(Short value) {
            addCriterion("CC_CRITICTYPE <", value, "critictype");
            return (Criteria) this;
        }

        public Criteria andCritictypeLessThanOrEqualTo(Short value) {
            addCriterion("CC_CRITICTYPE <=", value, "critictype");
            return (Criteria) this;
        }

        public Criteria andCritictypeIn(List<Short> values) {
            addCriterion("CC_CRITICTYPE in", values, "critictype");
            return (Criteria) this;
        }

        public Criteria andCritictypeNotIn(List<Short> values) {
            addCriterion("CC_CRITICTYPE not in", values, "critictype");
            return (Criteria) this;
        }

        public Criteria andCritictypeBetween(Short value1, Short value2) {
            addCriterion("CC_CRITICTYPE between", value1, value2, "critictype");
            return (Criteria) this;
        }

        public Criteria andCritictypeNotBetween(Short value1, Short value2) {
            addCriterion("CC_CRITICTYPE not between", value1, value2, "critictype");
            return (Criteria) this;
        }

        public Criteria andCriticidIsNull() {
            addCriterion("CC_CRITICID is null");
            return (Criteria) this;
        }

        public Criteria andCriticidIsNotNull() {
            addCriterion("CC_CRITICID is not null");
            return (Criteria) this;
        }

        public Criteria andCriticidEqualTo(String value) {
            addCriterion("CC_CRITICID =", value, "criticid");
            return (Criteria) this;
        }

        public Criteria andCriticidNotEqualTo(String value) {
            addCriterion("CC_CRITICID <>", value, "criticid");
            return (Criteria) this;
        }

        public Criteria andCriticidGreaterThan(String value) {
            addCriterion("CC_CRITICID >", value, "criticid");
            return (Criteria) this;
        }

        public Criteria andCriticidGreaterThanOrEqualTo(String value) {
            addCriterion("CC_CRITICID >=", value, "criticid");
            return (Criteria) this;
        }

        public Criteria andCriticidLessThan(String value) {
            addCriterion("CC_CRITICID <", value, "criticid");
            return (Criteria) this;
        }

        public Criteria andCriticidLessThanOrEqualTo(String value) {
            addCriterion("CC_CRITICID <=", value, "criticid");
            return (Criteria) this;
        }

        public Criteria andCriticidLike(String value) {
            addCriterion("CC_CRITICID like", value, "criticid");
            return (Criteria) this;
        }

        public Criteria andCriticidNotLike(String value) {
            addCriterion("CC_CRITICID not like", value, "criticid");
            return (Criteria) this;
        }

        public Criteria andCriticidIn(List<String> values) {
            addCriterion("CC_CRITICID in", values, "criticid");
            return (Criteria) this;
        }

        public Criteria andCriticidNotIn(List<String> values) {
            addCriterion("CC_CRITICID not in", values, "criticid");
            return (Criteria) this;
        }

        public Criteria andCriticidBetween(String value1, String value2) {
            addCriterion("CC_CRITICID between", value1, value2, "criticid");
            return (Criteria) this;
        }

        public Criteria andCriticidNotBetween(String value1, String value2) {
            addCriterion("CC_CRITICID not between", value1, value2, "criticid");
            return (Criteria) this;
        }

        public Criteria andIdLikeInsensitive(String value) {
            addCriterion("upper(CC_ID) like", value.toUpperCase(), "id");
            return (Criteria) this;
        }

        public Criteria andContentLikeInsensitive(String value) {
            addCriterion("upper(CC_CONTENT) like", value.toUpperCase(), "content");
            return (Criteria) this;
        }

        public Criteria andTargetnameLikeInsensitive(String value) {
            addCriterion("upper(CC_TARGETNAME) like", value.toUpperCase(), "targetname");
            return (Criteria) this;
        }

        public Criteria andTargetidLikeInsensitive(String value) {
            addCriterion("upper(CC_TARGETID) like", value.toUpperCase(), "targetid");
            return (Criteria) this;
        }

        public Criteria andEntidLikeInsensitive(String value) {
            addCriterion("upper(CC_ENTID) like", value.toUpperCase(), "entid");
            return (Criteria) this;
        }

        public Criteria andEntnameLikeInsensitive(String value) {
            addCriterion("upper(CC_ENTNAME) like", value.toUpperCase(), "entname");
            return (Criteria) this;
        }

        public Criteria andTypeLikeInsensitive(String value) {
            addCriterion("upper(CC_TYPE) like", value.toUpperCase(), "type");
            return (Criteria) this;
        }

        public Criteria andCommtimeLikeInsensitive(String value) {
            addCriterion("upper(CC_COMMTIME) like", value.toUpperCase(), "commtime");
            return (Criteria) this;
        }

        public Criteria andCriticnameLikeInsensitive(String value) {
            addCriterion("upper(CC_CRITICNAME) like", value.toUpperCase(), "criticname");
            return (Criteria) this;
        }

        public Criteria andCriticidLikeInsensitive(String value) {
            addCriterion("upper(CC_CRITICID) like", value.toUpperCase(), "criticid");
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