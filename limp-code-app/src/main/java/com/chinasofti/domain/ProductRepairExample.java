package com.chinasofti.domain;

import com.limp.framework.core.bean.Pager;

import java.util.ArrayList;
import java.util.List;

public class ProductRepairExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Pager page;

    public ProductRepairExample() {
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
            addCriterion("CPR_ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("CPR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("CPR_ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("CPR_ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("CPR_ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("CPR_ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("CPR_ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("CPR_ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("CPR_ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("CPR_ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("CPR_ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("CPR_ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("CPR_ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("CPR_ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andEntidIsNull() {
            addCriterion("CPR_ENTID is null");
            return (Criteria) this;
        }

        public Criteria andEntidIsNotNull() {
            addCriterion("CPR_ENTID is not null");
            return (Criteria) this;
        }

        public Criteria andEntidEqualTo(String value) {
            addCriterion("CPR_ENTID =", value, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidNotEqualTo(String value) {
            addCriterion("CPR_ENTID <>", value, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidGreaterThan(String value) {
            addCriterion("CPR_ENTID >", value, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidGreaterThanOrEqualTo(String value) {
            addCriterion("CPR_ENTID >=", value, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidLessThan(String value) {
            addCriterion("CPR_ENTID <", value, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidLessThanOrEqualTo(String value) {
            addCriterion("CPR_ENTID <=", value, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidLike(String value) {
            addCriterion("CPR_ENTID like", value, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidNotLike(String value) {
            addCriterion("CPR_ENTID not like", value, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidIn(List<String> values) {
            addCriterion("CPR_ENTID in", values, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidNotIn(List<String> values) {
            addCriterion("CPR_ENTID not in", values, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidBetween(String value1, String value2) {
            addCriterion("CPR_ENTID between", value1, value2, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidNotBetween(String value1, String value2) {
            addCriterion("CPR_ENTID not between", value1, value2, "entid");
            return (Criteria) this;
        }

        public Criteria andEntnameIsNull() {
            addCriterion("CPR_ENTNAME is null");
            return (Criteria) this;
        }

        public Criteria andEntnameIsNotNull() {
            addCriterion("CPR_ENTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andEntnameEqualTo(String value) {
            addCriterion("CPR_ENTNAME =", value, "entname");
            return (Criteria) this;
        }

        public Criteria andEntnameNotEqualTo(String value) {
            addCriterion("CPR_ENTNAME <>", value, "entname");
            return (Criteria) this;
        }

        public Criteria andEntnameGreaterThan(String value) {
            addCriterion("CPR_ENTNAME >", value, "entname");
            return (Criteria) this;
        }

        public Criteria andEntnameGreaterThanOrEqualTo(String value) {
            addCriterion("CPR_ENTNAME >=", value, "entname");
            return (Criteria) this;
        }

        public Criteria andEntnameLessThan(String value) {
            addCriterion("CPR_ENTNAME <", value, "entname");
            return (Criteria) this;
        }

        public Criteria andEntnameLessThanOrEqualTo(String value) {
            addCriterion("CPR_ENTNAME <=", value, "entname");
            return (Criteria) this;
        }

        public Criteria andEntnameLike(String value) {
            addCriterion("CPR_ENTNAME like", value, "entname");
            return (Criteria) this;
        }

        public Criteria andEntnameNotLike(String value) {
            addCriterion("CPR_ENTNAME not like", value, "entname");
            return (Criteria) this;
        }

        public Criteria andEntnameIn(List<String> values) {
            addCriterion("CPR_ENTNAME in", values, "entname");
            return (Criteria) this;
        }

        public Criteria andEntnameNotIn(List<String> values) {
            addCriterion("CPR_ENTNAME not in", values, "entname");
            return (Criteria) this;
        }

        public Criteria andEntnameBetween(String value1, String value2) {
            addCriterion("CPR_ENTNAME between", value1, value2, "entname");
            return (Criteria) this;
        }

        public Criteria andEntnameNotBetween(String value1, String value2) {
            addCriterion("CPR_ENTNAME not between", value1, value2, "entname");
            return (Criteria) this;
        }

        public Criteria andEnttypeIsNull() {
            addCriterion("CPR_ENTTYPE is null");
            return (Criteria) this;
        }

        public Criteria andEnttypeIsNotNull() {
            addCriterion("CPR_ENTTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andEnttypeEqualTo(String value) {
            addCriterion("CPR_ENTTYPE =", value, "enttype");
            return (Criteria) this;
        }

        public Criteria andEnttypeNotEqualTo(String value) {
            addCriterion("CPR_ENTTYPE <>", value, "enttype");
            return (Criteria) this;
        }

        public Criteria andEnttypeGreaterThan(String value) {
            addCriterion("CPR_ENTTYPE >", value, "enttype");
            return (Criteria) this;
        }

        public Criteria andEnttypeGreaterThanOrEqualTo(String value) {
            addCriterion("CPR_ENTTYPE >=", value, "enttype");
            return (Criteria) this;
        }

        public Criteria andEnttypeLessThan(String value) {
            addCriterion("CPR_ENTTYPE <", value, "enttype");
            return (Criteria) this;
        }

        public Criteria andEnttypeLessThanOrEqualTo(String value) {
            addCriterion("CPR_ENTTYPE <=", value, "enttype");
            return (Criteria) this;
        }

        public Criteria andEnttypeLike(String value) {
            addCriterion("CPR_ENTTYPE like", value, "enttype");
            return (Criteria) this;
        }

        public Criteria andEnttypeNotLike(String value) {
            addCriterion("CPR_ENTTYPE not like", value, "enttype");
            return (Criteria) this;
        }

        public Criteria andEnttypeIn(List<String> values) {
            addCriterion("CPR_ENTTYPE in", values, "enttype");
            return (Criteria) this;
        }

        public Criteria andEnttypeNotIn(List<String> values) {
            addCriterion("CPR_ENTTYPE not in", values, "enttype");
            return (Criteria) this;
        }

        public Criteria andEnttypeBetween(String value1, String value2) {
            addCriterion("CPR_ENTTYPE between", value1, value2, "enttype");
            return (Criteria) this;
        }

        public Criteria andEnttypeNotBetween(String value1, String value2) {
            addCriterion("CPR_ENTTYPE not between", value1, value2, "enttype");
            return (Criteria) this;
        }

        public Criteria andProtypeIsNull() {
            addCriterion("CPR_PROTYPE is null");
            return (Criteria) this;
        }

        public Criteria andProtypeIsNotNull() {
            addCriterion("CPR_PROTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andProtypeEqualTo(String value) {
            addCriterion("CPR_PROTYPE =", value, "protype");
            return (Criteria) this;
        }

        public Criteria andProtypeNotEqualTo(String value) {
            addCriterion("CPR_PROTYPE <>", value, "protype");
            return (Criteria) this;
        }

        public Criteria andProtypeGreaterThan(String value) {
            addCriterion("CPR_PROTYPE >", value, "protype");
            return (Criteria) this;
        }

        public Criteria andProtypeGreaterThanOrEqualTo(String value) {
            addCriterion("CPR_PROTYPE >=", value, "protype");
            return (Criteria) this;
        }

        public Criteria andProtypeLessThan(String value) {
            addCriterion("CPR_PROTYPE <", value, "protype");
            return (Criteria) this;
        }

        public Criteria andProtypeLessThanOrEqualTo(String value) {
            addCriterion("CPR_PROTYPE <=", value, "protype");
            return (Criteria) this;
        }

        public Criteria andProtypeLike(String value) {
            addCriterion("CPR_PROTYPE like", value, "protype");
            return (Criteria) this;
        }

        public Criteria andProtypeNotLike(String value) {
            addCriterion("CPR_PROTYPE not like", value, "protype");
            return (Criteria) this;
        }

        public Criteria andProtypeIn(List<String> values) {
            addCriterion("CPR_PROTYPE in", values, "protype");
            return (Criteria) this;
        }

        public Criteria andProtypeNotIn(List<String> values) {
            addCriterion("CPR_PROTYPE not in", values, "protype");
            return (Criteria) this;
        }

        public Criteria andProtypeBetween(String value1, String value2) {
            addCriterion("CPR_PROTYPE between", value1, value2, "protype");
            return (Criteria) this;
        }

        public Criteria andProtypeNotBetween(String value1, String value2) {
            addCriterion("CPR_PROTYPE not between", value1, value2, "protype");
            return (Criteria) this;
        }

        public Criteria andPronoIsNull() {
            addCriterion("CPR_PRONO is null");
            return (Criteria) this;
        }

        public Criteria andPronoIsNotNull() {
            addCriterion("CPR_PRONO is not null");
            return (Criteria) this;
        }

        public Criteria andPronoEqualTo(String value) {
            addCriterion("CPR_PRONO =", value, "prono");
            return (Criteria) this;
        }

        public Criteria andPronoNotEqualTo(String value) {
            addCriterion("CPR_PRONO <>", value, "prono");
            return (Criteria) this;
        }

        public Criteria andPronoGreaterThan(String value) {
            addCriterion("CPR_PRONO >", value, "prono");
            return (Criteria) this;
        }

        public Criteria andPronoGreaterThanOrEqualTo(String value) {
            addCriterion("CPR_PRONO >=", value, "prono");
            return (Criteria) this;
        }

        public Criteria andPronoLessThan(String value) {
            addCriterion("CPR_PRONO <", value, "prono");
            return (Criteria) this;
        }

        public Criteria andPronoLessThanOrEqualTo(String value) {
            addCriterion("CPR_PRONO <=", value, "prono");
            return (Criteria) this;
        }

        public Criteria andPronoLike(String value) {
            addCriterion("CPR_PRONO like", value, "prono");
            return (Criteria) this;
        }

        public Criteria andPronoNotLike(String value) {
            addCriterion("CPR_PRONO not like", value, "prono");
            return (Criteria) this;
        }

        public Criteria andPronoIn(List<String> values) {
            addCriterion("CPR_PRONO in", values, "prono");
            return (Criteria) this;
        }

        public Criteria andPronoNotIn(List<String> values) {
            addCriterion("CPR_PRONO not in", values, "prono");
            return (Criteria) this;
        }

        public Criteria andPronoBetween(String value1, String value2) {
            addCriterion("CPR_PRONO between", value1, value2, "prono");
            return (Criteria) this;
        }

        public Criteria andPronoNotBetween(String value1, String value2) {
            addCriterion("CPR_PRONO not between", value1, value2, "prono");
            return (Criteria) this;
        }

        public Criteria andPromodelnoIsNull() {
            addCriterion("CPR_PROMODELNO is null");
            return (Criteria) this;
        }

        public Criteria andPromodelnoIsNotNull() {
            addCriterion("CPR_PROMODELNO is not null");
            return (Criteria) this;
        }

        public Criteria andPromodelnoEqualTo(String value) {
            addCriterion("CPR_PROMODELNO =", value, "promodelno");
            return (Criteria) this;
        }

        public Criteria andPromodelnoNotEqualTo(String value) {
            addCriterion("CPR_PROMODELNO <>", value, "promodelno");
            return (Criteria) this;
        }

        public Criteria andPromodelnoGreaterThan(String value) {
            addCriterion("CPR_PROMODELNO >", value, "promodelno");
            return (Criteria) this;
        }

        public Criteria andPromodelnoGreaterThanOrEqualTo(String value) {
            addCriterion("CPR_PROMODELNO >=", value, "promodelno");
            return (Criteria) this;
        }

        public Criteria andPromodelnoLessThan(String value) {
            addCriterion("CPR_PROMODELNO <", value, "promodelno");
            return (Criteria) this;
        }

        public Criteria andPromodelnoLessThanOrEqualTo(String value) {
            addCriterion("CPR_PROMODELNO <=", value, "promodelno");
            return (Criteria) this;
        }

        public Criteria andPromodelnoLike(String value) {
            addCriterion("CPR_PROMODELNO like", value, "promodelno");
            return (Criteria) this;
        }

        public Criteria andPromodelnoNotLike(String value) {
            addCriterion("CPR_PROMODELNO not like", value, "promodelno");
            return (Criteria) this;
        }

        public Criteria andPromodelnoIn(List<String> values) {
            addCriterion("CPR_PROMODELNO in", values, "promodelno");
            return (Criteria) this;
        }

        public Criteria andPromodelnoNotIn(List<String> values) {
            addCriterion("CPR_PROMODELNO not in", values, "promodelno");
            return (Criteria) this;
        }

        public Criteria andPromodelnoBetween(String value1, String value2) {
            addCriterion("CPR_PROMODELNO between", value1, value2, "promodelno");
            return (Criteria) this;
        }

        public Criteria andPromodelnoNotBetween(String value1, String value2) {
            addCriterion("CPR_PROMODELNO not between", value1, value2, "promodelno");
            return (Criteria) this;
        }

        public Criteria andCertnoIsNull() {
            addCriterion("CPR_CERTNO is null");
            return (Criteria) this;
        }

        public Criteria andCertnoIsNotNull() {
            addCriterion("CPR_CERTNO is not null");
            return (Criteria) this;
        }

        public Criteria andCertnoEqualTo(String value) {
            addCriterion("CPR_CERTNO =", value, "certno");
            return (Criteria) this;
        }

        public Criteria andCertnoNotEqualTo(String value) {
            addCriterion("CPR_CERTNO <>", value, "certno");
            return (Criteria) this;
        }

        public Criteria andCertnoGreaterThan(String value) {
            addCriterion("CPR_CERTNO >", value, "certno");
            return (Criteria) this;
        }

        public Criteria andCertnoGreaterThanOrEqualTo(String value) {
            addCriterion("CPR_CERTNO >=", value, "certno");
            return (Criteria) this;
        }

        public Criteria andCertnoLessThan(String value) {
            addCriterion("CPR_CERTNO <", value, "certno");
            return (Criteria) this;
        }

        public Criteria andCertnoLessThanOrEqualTo(String value) {
            addCriterion("CPR_CERTNO <=", value, "certno");
            return (Criteria) this;
        }

        public Criteria andCertnoLike(String value) {
            addCriterion("CPR_CERTNO like", value, "certno");
            return (Criteria) this;
        }

        public Criteria andCertnoNotLike(String value) {
            addCriterion("CPR_CERTNO not like", value, "certno");
            return (Criteria) this;
        }

        public Criteria andCertnoIn(List<String> values) {
            addCriterion("CPR_CERTNO in", values, "certno");
            return (Criteria) this;
        }

        public Criteria andCertnoNotIn(List<String> values) {
            addCriterion("CPR_CERTNO not in", values, "certno");
            return (Criteria) this;
        }

        public Criteria andCertnoBetween(String value1, String value2) {
            addCriterion("CPR_CERTNO between", value1, value2, "certno");
            return (Criteria) this;
        }

        public Criteria andCertnoNotBetween(String value1, String value2) {
            addCriterion("CPR_CERTNO not between", value1, value2, "certno");
            return (Criteria) this;
        }

        public Criteria andQuetypeIsNull() {
            addCriterion("CPR_QUETYPE is null");
            return (Criteria) this;
        }

        public Criteria andQuetypeIsNotNull() {
            addCriterion("CPR_QUETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andQuetypeEqualTo(String value) {
            addCriterion("CPR_QUETYPE =", value, "quetype");
            return (Criteria) this;
        }

        public Criteria andQuetypeNotEqualTo(String value) {
            addCriterion("CPR_QUETYPE <>", value, "quetype");
            return (Criteria) this;
        }

        public Criteria andQuetypeGreaterThan(String value) {
            addCriterion("CPR_QUETYPE >", value, "quetype");
            return (Criteria) this;
        }

        public Criteria andQuetypeGreaterThanOrEqualTo(String value) {
            addCriterion("CPR_QUETYPE >=", value, "quetype");
            return (Criteria) this;
        }

        public Criteria andQuetypeLessThan(String value) {
            addCriterion("CPR_QUETYPE <", value, "quetype");
            return (Criteria) this;
        }

        public Criteria andQuetypeLessThanOrEqualTo(String value) {
            addCriterion("CPR_QUETYPE <=", value, "quetype");
            return (Criteria) this;
        }

        public Criteria andQuetypeLike(String value) {
            addCriterion("CPR_QUETYPE like", value, "quetype");
            return (Criteria) this;
        }

        public Criteria andQuetypeNotLike(String value) {
            addCriterion("CPR_QUETYPE not like", value, "quetype");
            return (Criteria) this;
        }

        public Criteria andQuetypeIn(List<String> values) {
            addCriterion("CPR_QUETYPE in", values, "quetype");
            return (Criteria) this;
        }

        public Criteria andQuetypeNotIn(List<String> values) {
            addCriterion("CPR_QUETYPE not in", values, "quetype");
            return (Criteria) this;
        }

        public Criteria andQuetypeBetween(String value1, String value2) {
            addCriterion("CPR_QUETYPE between", value1, value2, "quetype");
            return (Criteria) this;
        }

        public Criteria andQuetypeNotBetween(String value1, String value2) {
            addCriterion("CPR_QUETYPE not between", value1, value2, "quetype");
            return (Criteria) this;
        }

        public Criteria andQueincprIsNull() {
            addCriterion("CPR_QUEINCPR is null");
            return (Criteria) this;
        }

        public Criteria andQueincprIsNotNull() {
            addCriterion("CPR_QUEINCPR is not null");
            return (Criteria) this;
        }

        public Criteria andQueincprEqualTo(String value) {
            addCriterion("CPR_QUEINCPR =", value, "queincpr");
            return (Criteria) this;
        }

        public Criteria andQueincprNotEqualTo(String value) {
            addCriterion("CPR_QUEINCPR <>", value, "queincpr");
            return (Criteria) this;
        }

        public Criteria andQueincprGreaterThan(String value) {
            addCriterion("CPR_QUEINCPR >", value, "queincpr");
            return (Criteria) this;
        }

        public Criteria andQueincprGreaterThanOrEqualTo(String value) {
            addCriterion("CPR_QUEINCPR >=", value, "queincpr");
            return (Criteria) this;
        }

        public Criteria andQueincprLessThan(String value) {
            addCriterion("CPR_QUEINCPR <", value, "queincpr");
            return (Criteria) this;
        }

        public Criteria andQueincprLessThanOrEqualTo(String value) {
            addCriterion("CPR_QUEINCPR <=", value, "queincpr");
            return (Criteria) this;
        }

        public Criteria andQueincprLike(String value) {
            addCriterion("CPR_QUEINCPR like", value, "queincpr");
            return (Criteria) this;
        }

        public Criteria andQueincprNotLike(String value) {
            addCriterion("CPR_QUEINCPR not like", value, "queincpr");
            return (Criteria) this;
        }

        public Criteria andQueincprIn(List<String> values) {
            addCriterion("CPR_QUEINCPR in", values, "queincpr");
            return (Criteria) this;
        }

        public Criteria andQueincprNotIn(List<String> values) {
            addCriterion("CPR_QUEINCPR not in", values, "queincpr");
            return (Criteria) this;
        }

        public Criteria andQueincprBetween(String value1, String value2) {
            addCriterion("CPR_QUEINCPR between", value1, value2, "queincpr");
            return (Criteria) this;
        }

        public Criteria andQueincprNotBetween(String value1, String value2) {
            addCriterion("CPR_QUEINCPR not between", value1, value2, "queincpr");
            return (Criteria) this;
        }

        public Criteria andChecktimeIsNull() {
            addCriterion("CPR_CHECKTIME is null");
            return (Criteria) this;
        }

        public Criteria andChecktimeIsNotNull() {
            addCriterion("CPR_CHECKTIME is not null");
            return (Criteria) this;
        }

        public Criteria andChecktimeEqualTo(String value) {
            addCriterion("CPR_CHECKTIME =", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeNotEqualTo(String value) {
            addCriterion("CPR_CHECKTIME <>", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeGreaterThan(String value) {
            addCriterion("CPR_CHECKTIME >", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeGreaterThanOrEqualTo(String value) {
            addCriterion("CPR_CHECKTIME >=", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeLessThan(String value) {
            addCriterion("CPR_CHECKTIME <", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeLessThanOrEqualTo(String value) {
            addCriterion("CPR_CHECKTIME <=", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeLike(String value) {
            addCriterion("CPR_CHECKTIME like", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeNotLike(String value) {
            addCriterion("CPR_CHECKTIME not like", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeIn(List<String> values) {
            addCriterion("CPR_CHECKTIME in", values, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeNotIn(List<String> values) {
            addCriterion("CPR_CHECKTIME not in", values, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeBetween(String value1, String value2) {
            addCriterion("CPR_CHECKTIME between", value1, value2, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeNotBetween(String value1, String value2) {
            addCriterion("CPR_CHECKTIME not between", value1, value2, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimenextIsNull() {
            addCriterion("CPR_CHECKTIMENEXT is null");
            return (Criteria) this;
        }

        public Criteria andChecktimenextIsNotNull() {
            addCriterion("CPR_CHECKTIMENEXT is not null");
            return (Criteria) this;
        }

        public Criteria andChecktimenextEqualTo(String value) {
            addCriterion("CPR_CHECKTIMENEXT =", value, "checktimenext");
            return (Criteria) this;
        }

        public Criteria andChecktimenextNotEqualTo(String value) {
            addCriterion("CPR_CHECKTIMENEXT <>", value, "checktimenext");
            return (Criteria) this;
        }

        public Criteria andChecktimenextGreaterThan(String value) {
            addCriterion("CPR_CHECKTIMENEXT >", value, "checktimenext");
            return (Criteria) this;
        }

        public Criteria andChecktimenextGreaterThanOrEqualTo(String value) {
            addCriterion("CPR_CHECKTIMENEXT >=", value, "checktimenext");
            return (Criteria) this;
        }

        public Criteria andChecktimenextLessThan(String value) {
            addCriterion("CPR_CHECKTIMENEXT <", value, "checktimenext");
            return (Criteria) this;
        }

        public Criteria andChecktimenextLessThanOrEqualTo(String value) {
            addCriterion("CPR_CHECKTIMENEXT <=", value, "checktimenext");
            return (Criteria) this;
        }

        public Criteria andChecktimenextLike(String value) {
            addCriterion("CPR_CHECKTIMENEXT like", value, "checktimenext");
            return (Criteria) this;
        }

        public Criteria andChecktimenextNotLike(String value) {
            addCriterion("CPR_CHECKTIMENEXT not like", value, "checktimenext");
            return (Criteria) this;
        }

        public Criteria andChecktimenextIn(List<String> values) {
            addCriterion("CPR_CHECKTIMENEXT in", values, "checktimenext");
            return (Criteria) this;
        }

        public Criteria andChecktimenextNotIn(List<String> values) {
            addCriterion("CPR_CHECKTIMENEXT not in", values, "checktimenext");
            return (Criteria) this;
        }

        public Criteria andChecktimenextBetween(String value1, String value2) {
            addCriterion("CPR_CHECKTIMENEXT between", value1, value2, "checktimenext");
            return (Criteria) this;
        }

        public Criteria andChecktimenextNotBetween(String value1, String value2) {
            addCriterion("CPR_CHECKTIMENEXT not between", value1, value2, "checktimenext");
            return (Criteria) this;
        }

        public Criteria andChecktaddrIsNull() {
            addCriterion("CPR_CHECKTADDR is null");
            return (Criteria) this;
        }

        public Criteria andChecktaddrIsNotNull() {
            addCriterion("CPR_CHECKTADDR is not null");
            return (Criteria) this;
        }

        public Criteria andChecktaddrEqualTo(String value) {
            addCriterion("CPR_CHECKTADDR =", value, "checktaddr");
            return (Criteria) this;
        }

        public Criteria andChecktaddrNotEqualTo(String value) {
            addCriterion("CPR_CHECKTADDR <>", value, "checktaddr");
            return (Criteria) this;
        }

        public Criteria andChecktaddrGreaterThan(String value) {
            addCriterion("CPR_CHECKTADDR >", value, "checktaddr");
            return (Criteria) this;
        }

        public Criteria andChecktaddrGreaterThanOrEqualTo(String value) {
            addCriterion("CPR_CHECKTADDR >=", value, "checktaddr");
            return (Criteria) this;
        }

        public Criteria andChecktaddrLessThan(String value) {
            addCriterion("CPR_CHECKTADDR <", value, "checktaddr");
            return (Criteria) this;
        }

        public Criteria andChecktaddrLessThanOrEqualTo(String value) {
            addCriterion("CPR_CHECKTADDR <=", value, "checktaddr");
            return (Criteria) this;
        }

        public Criteria andChecktaddrLike(String value) {
            addCriterion("CPR_CHECKTADDR like", value, "checktaddr");
            return (Criteria) this;
        }

        public Criteria andChecktaddrNotLike(String value) {
            addCriterion("CPR_CHECKTADDR not like", value, "checktaddr");
            return (Criteria) this;
        }

        public Criteria andChecktaddrIn(List<String> values) {
            addCriterion("CPR_CHECKTADDR in", values, "checktaddr");
            return (Criteria) this;
        }

        public Criteria andChecktaddrNotIn(List<String> values) {
            addCriterion("CPR_CHECKTADDR not in", values, "checktaddr");
            return (Criteria) this;
        }

        public Criteria andChecktaddrBetween(String value1, String value2) {
            addCriterion("CPR_CHECKTADDR between", value1, value2, "checktaddr");
            return (Criteria) this;
        }

        public Criteria andChecktaddrNotBetween(String value1, String value2) {
            addCriterion("CPR_CHECKTADDR not between", value1, value2, "checktaddr");
            return (Criteria) this;
        }

        public Criteria andPronameIsNull() {
            addCriterion("CPR_PRONAME is null");
            return (Criteria) this;
        }

        public Criteria andPronameIsNotNull() {
            addCriterion("CPR_PRONAME is not null");
            return (Criteria) this;
        }

        public Criteria andPronameEqualTo(String value) {
            addCriterion("CPR_PRONAME =", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameNotEqualTo(String value) {
            addCriterion("CPR_PRONAME <>", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameGreaterThan(String value) {
            addCriterion("CPR_PRONAME >", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameGreaterThanOrEqualTo(String value) {
            addCriterion("CPR_PRONAME >=", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameLessThan(String value) {
            addCriterion("CPR_PRONAME <", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameLessThanOrEqualTo(String value) {
            addCriterion("CPR_PRONAME <=", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameLike(String value) {
            addCriterion("CPR_PRONAME like", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameNotLike(String value) {
            addCriterion("CPR_PRONAME not like", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameIn(List<String> values) {
            addCriterion("CPR_PRONAME in", values, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameNotIn(List<String> values) {
            addCriterion("CPR_PRONAME not in", values, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameBetween(String value1, String value2) {
            addCriterion("CPR_PRONAME between", value1, value2, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameNotBetween(String value1, String value2) {
            addCriterion("CPR_PRONAME not between", value1, value2, "proname");
            return (Criteria) this;
        }

        public Criteria andCheckuserIsNull() {
            addCriterion("CPR_CHECKUSER is null");
            return (Criteria) this;
        }

        public Criteria andCheckuserIsNotNull() {
            addCriterion("CPR_CHECKUSER is not null");
            return (Criteria) this;
        }

        public Criteria andCheckuserEqualTo(String value) {
            addCriterion("CPR_CHECKUSER =", value, "checkuser");
            return (Criteria) this;
        }

        public Criteria andCheckuserNotEqualTo(String value) {
            addCriterion("CPR_CHECKUSER <>", value, "checkuser");
            return (Criteria) this;
        }

        public Criteria andCheckuserGreaterThan(String value) {
            addCriterion("CPR_CHECKUSER >", value, "checkuser");
            return (Criteria) this;
        }

        public Criteria andCheckuserGreaterThanOrEqualTo(String value) {
            addCriterion("CPR_CHECKUSER >=", value, "checkuser");
            return (Criteria) this;
        }

        public Criteria andCheckuserLessThan(String value) {
            addCriterion("CPR_CHECKUSER <", value, "checkuser");
            return (Criteria) this;
        }

        public Criteria andCheckuserLessThanOrEqualTo(String value) {
            addCriterion("CPR_CHECKUSER <=", value, "checkuser");
            return (Criteria) this;
        }

        public Criteria andCheckuserLike(String value) {
            addCriterion("CPR_CHECKUSER like", value, "checkuser");
            return (Criteria) this;
        }

        public Criteria andCheckuserNotLike(String value) {
            addCriterion("CPR_CHECKUSER not like", value, "checkuser");
            return (Criteria) this;
        }

        public Criteria andCheckuserIn(List<String> values) {
            addCriterion("CPR_CHECKUSER in", values, "checkuser");
            return (Criteria) this;
        }

        public Criteria andCheckuserNotIn(List<String> values) {
            addCriterion("CPR_CHECKUSER not in", values, "checkuser");
            return (Criteria) this;
        }

        public Criteria andCheckuserBetween(String value1, String value2) {
            addCriterion("CPR_CHECKUSER between", value1, value2, "checkuser");
            return (Criteria) this;
        }

        public Criteria andCheckuserNotBetween(String value1, String value2) {
            addCriterion("CPR_CHECKUSER not between", value1, value2, "checkuser");
            return (Criteria) this;
        }

        public Criteria andCheckresultIsNull() {
            addCriterion("CPR_CHECKRESULT is null");
            return (Criteria) this;
        }

        public Criteria andCheckresultIsNotNull() {
            addCriterion("CPR_CHECKRESULT is not null");
            return (Criteria) this;
        }

        public Criteria andCheckresultEqualTo(String value) {
            addCriterion("CPR_CHECKRESULT =", value, "checkresult");
            return (Criteria) this;
        }

        public Criteria andCheckresultNotEqualTo(String value) {
            addCriterion("CPR_CHECKRESULT <>", value, "checkresult");
            return (Criteria) this;
        }

        public Criteria andCheckresultGreaterThan(String value) {
            addCriterion("CPR_CHECKRESULT >", value, "checkresult");
            return (Criteria) this;
        }

        public Criteria andCheckresultGreaterThanOrEqualTo(String value) {
            addCriterion("CPR_CHECKRESULT >=", value, "checkresult");
            return (Criteria) this;
        }

        public Criteria andCheckresultLessThan(String value) {
            addCriterion("CPR_CHECKRESULT <", value, "checkresult");
            return (Criteria) this;
        }

        public Criteria andCheckresultLessThanOrEqualTo(String value) {
            addCriterion("CPR_CHECKRESULT <=", value, "checkresult");
            return (Criteria) this;
        }

        public Criteria andCheckresultLike(String value) {
            addCriterion("CPR_CHECKRESULT like", value, "checkresult");
            return (Criteria) this;
        }

        public Criteria andCheckresultNotLike(String value) {
            addCriterion("CPR_CHECKRESULT not like", value, "checkresult");
            return (Criteria) this;
        }

        public Criteria andCheckresultIn(List<String> values) {
            addCriterion("CPR_CHECKRESULT in", values, "checkresult");
            return (Criteria) this;
        }

        public Criteria andCheckresultNotIn(List<String> values) {
            addCriterion("CPR_CHECKRESULT not in", values, "checkresult");
            return (Criteria) this;
        }

        public Criteria andCheckresultBetween(String value1, String value2) {
            addCriterion("CPR_CHECKRESULT between", value1, value2, "checkresult");
            return (Criteria) this;
        }

        public Criteria andCheckresultNotBetween(String value1, String value2) {
            addCriterion("CPR_CHECKRESULT not between", value1, value2, "checkresult");
            return (Criteria) this;
        }

        public Criteria andEntbuildIsNull() {
            addCriterion("CPR_ENTBUILD is null");
            return (Criteria) this;
        }

        public Criteria andEntbuildIsNotNull() {
            addCriterion("CPR_ENTBUILD is not null");
            return (Criteria) this;
        }

        public Criteria andEntbuildEqualTo(String value) {
            addCriterion("CPR_ENTBUILD =", value, "entbuild");
            return (Criteria) this;
        }

        public Criteria andEntbuildNotEqualTo(String value) {
            addCriterion("CPR_ENTBUILD <>", value, "entbuild");
            return (Criteria) this;
        }

        public Criteria andEntbuildGreaterThan(String value) {
            addCriterion("CPR_ENTBUILD >", value, "entbuild");
            return (Criteria) this;
        }

        public Criteria andEntbuildGreaterThanOrEqualTo(String value) {
            addCriterion("CPR_ENTBUILD >=", value, "entbuild");
            return (Criteria) this;
        }

        public Criteria andEntbuildLessThan(String value) {
            addCriterion("CPR_ENTBUILD <", value, "entbuild");
            return (Criteria) this;
        }

        public Criteria andEntbuildLessThanOrEqualTo(String value) {
            addCriterion("CPR_ENTBUILD <=", value, "entbuild");
            return (Criteria) this;
        }

        public Criteria andEntbuildLike(String value) {
            addCriterion("CPR_ENTBUILD like", value, "entbuild");
            return (Criteria) this;
        }

        public Criteria andEntbuildNotLike(String value) {
            addCriterion("CPR_ENTBUILD not like", value, "entbuild");
            return (Criteria) this;
        }

        public Criteria andEntbuildIn(List<String> values) {
            addCriterion("CPR_ENTBUILD in", values, "entbuild");
            return (Criteria) this;
        }

        public Criteria andEntbuildNotIn(List<String> values) {
            addCriterion("CPR_ENTBUILD not in", values, "entbuild");
            return (Criteria) this;
        }

        public Criteria andEntbuildBetween(String value1, String value2) {
            addCriterion("CPR_ENTBUILD between", value1, value2, "entbuild");
            return (Criteria) this;
        }

        public Criteria andEntbuildNotBetween(String value1, String value2) {
            addCriterion("CPR_ENTBUILD not between", value1, value2, "entbuild");
            return (Criteria) this;
        }

        public Criteria andShipcodeIsNull() {
            addCriterion("CPR_SHIPCODE is null");
            return (Criteria) this;
        }

        public Criteria andShipcodeIsNotNull() {
            addCriterion("CPR_SHIPCODE is not null");
            return (Criteria) this;
        }

        public Criteria andShipcodeEqualTo(String value) {
            addCriterion("CPR_SHIPCODE =", value, "shipcode");
            return (Criteria) this;
        }

        public Criteria andShipcodeNotEqualTo(String value) {
            addCriterion("CPR_SHIPCODE <>", value, "shipcode");
            return (Criteria) this;
        }

        public Criteria andShipcodeGreaterThan(String value) {
            addCriterion("CPR_SHIPCODE >", value, "shipcode");
            return (Criteria) this;
        }

        public Criteria andShipcodeGreaterThanOrEqualTo(String value) {
            addCriterion("CPR_SHIPCODE >=", value, "shipcode");
            return (Criteria) this;
        }

        public Criteria andShipcodeLessThan(String value) {
            addCriterion("CPR_SHIPCODE <", value, "shipcode");
            return (Criteria) this;
        }

        public Criteria andShipcodeLessThanOrEqualTo(String value) {
            addCriterion("CPR_SHIPCODE <=", value, "shipcode");
            return (Criteria) this;
        }

        public Criteria andShipcodeLike(String value) {
            addCriterion("CPR_SHIPCODE like", value, "shipcode");
            return (Criteria) this;
        }

        public Criteria andShipcodeNotLike(String value) {
            addCriterion("CPR_SHIPCODE not like", value, "shipcode");
            return (Criteria) this;
        }

        public Criteria andShipcodeIn(List<String> values) {
            addCriterion("CPR_SHIPCODE in", values, "shipcode");
            return (Criteria) this;
        }

        public Criteria andShipcodeNotIn(List<String> values) {
            addCriterion("CPR_SHIPCODE not in", values, "shipcode");
            return (Criteria) this;
        }

        public Criteria andShipcodeBetween(String value1, String value2) {
            addCriterion("CPR_SHIPCODE between", value1, value2, "shipcode");
            return (Criteria) this;
        }

        public Criteria andShipcodeNotBetween(String value1, String value2) {
            addCriterion("CPR_SHIPCODE not between", value1, value2, "shipcode");
            return (Criteria) this;
        }

        public Criteria andShipnameIsNull() {
            addCriterion("CPR_SHIPNAME is null");
            return (Criteria) this;
        }

        public Criteria andShipnameIsNotNull() {
            addCriterion("CPR_SHIPNAME is not null");
            return (Criteria) this;
        }

        public Criteria andShipnameEqualTo(String value) {
            addCriterion("CPR_SHIPNAME =", value, "shipname");
            return (Criteria) this;
        }

        public Criteria andShipnameNotEqualTo(String value) {
            addCriterion("CPR_SHIPNAME <>", value, "shipname");
            return (Criteria) this;
        }

        public Criteria andShipnameGreaterThan(String value) {
            addCriterion("CPR_SHIPNAME >", value, "shipname");
            return (Criteria) this;
        }

        public Criteria andShipnameGreaterThanOrEqualTo(String value) {
            addCriterion("CPR_SHIPNAME >=", value, "shipname");
            return (Criteria) this;
        }

        public Criteria andShipnameLessThan(String value) {
            addCriterion("CPR_SHIPNAME <", value, "shipname");
            return (Criteria) this;
        }

        public Criteria andShipnameLessThanOrEqualTo(String value) {
            addCriterion("CPR_SHIPNAME <=", value, "shipname");
            return (Criteria) this;
        }

        public Criteria andShipnameLike(String value) {
            addCriterion("CPR_SHIPNAME like", value, "shipname");
            return (Criteria) this;
        }

        public Criteria andShipnameNotLike(String value) {
            addCriterion("CPR_SHIPNAME not like", value, "shipname");
            return (Criteria) this;
        }

        public Criteria andShipnameIn(List<String> values) {
            addCriterion("CPR_SHIPNAME in", values, "shipname");
            return (Criteria) this;
        }

        public Criteria andShipnameNotIn(List<String> values) {
            addCriterion("CPR_SHIPNAME not in", values, "shipname");
            return (Criteria) this;
        }

        public Criteria andShipnameBetween(String value1, String value2) {
            addCriterion("CPR_SHIPNAME between", value1, value2, "shipname");
            return (Criteria) this;
        }

        public Criteria andShipnameNotBetween(String value1, String value2) {
            addCriterion("CPR_SHIPNAME not between", value1, value2, "shipname");
            return (Criteria) this;
        }

        public Criteria andIdLikeInsensitive(String value) {
            addCriterion("upper(CPR_ID) like", value.toUpperCase(), "id");
            return (Criteria) this;
        }

        public Criteria andEntidLikeInsensitive(String value) {
            addCriterion("upper(CPR_ENTID) like", value.toUpperCase(), "entid");
            return (Criteria) this;
        }

        public Criteria andEntnameLikeInsensitive(String value) {
            addCriterion("upper(CPR_ENTNAME) like", value.toUpperCase(), "entname");
            return (Criteria) this;
        }

        public Criteria andEnttypeLikeInsensitive(String value) {
            addCriterion("upper(CPR_ENTTYPE) like", value.toUpperCase(), "enttype");
            return (Criteria) this;
        }

        public Criteria andProtypeLikeInsensitive(String value) {
            addCriterion("upper(CPR_PROTYPE) like", value.toUpperCase(), "protype");
            return (Criteria) this;
        }

        public Criteria andPronoLikeInsensitive(String value) {
            addCriterion("upper(CPR_PRONO) like", value.toUpperCase(), "prono");
            return (Criteria) this;
        }

        public Criteria andPromodelnoLikeInsensitive(String value) {
            addCriterion("upper(CPR_PROMODELNO) like", value.toUpperCase(), "promodelno");
            return (Criteria) this;
        }

        public Criteria andCertnoLikeInsensitive(String value) {
            addCriterion("upper(CPR_CERTNO) like", value.toUpperCase(), "certno");
            return (Criteria) this;
        }

        public Criteria andQuetypeLikeInsensitive(String value) {
            addCriterion("upper(CPR_QUETYPE) like", value.toUpperCase(), "quetype");
            return (Criteria) this;
        }

        public Criteria andQueincprLikeInsensitive(String value) {
            addCriterion("upper(CPR_QUEINCPR) like", value.toUpperCase(), "queincpr");
            return (Criteria) this;
        }

        public Criteria andChecktimeLikeInsensitive(String value) {
            addCriterion("upper(CPR_CHECKTIME) like", value.toUpperCase(), "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimenextLikeInsensitive(String value) {
            addCriterion("upper(CPR_CHECKTIMENEXT) like", value.toUpperCase(), "checktimenext");
            return (Criteria) this;
        }

        public Criteria andChecktaddrLikeInsensitive(String value) {
            addCriterion("upper(CPR_CHECKTADDR) like", value.toUpperCase(), "checktaddr");
            return (Criteria) this;
        }

        public Criteria andPronameLikeInsensitive(String value) {
            addCriterion("upper(CPR_PRONAME) like", value.toUpperCase(), "proname");
            return (Criteria) this;
        }

        public Criteria andCheckuserLikeInsensitive(String value) {
            addCriterion("upper(CPR_CHECKUSER) like", value.toUpperCase(), "checkuser");
            return (Criteria) this;
        }

        public Criteria andCheckresultLikeInsensitive(String value) {
            addCriterion("upper(CPR_CHECKRESULT) like", value.toUpperCase(), "checkresult");
            return (Criteria) this;
        }

        public Criteria andEntbuildLikeInsensitive(String value) {
            addCriterion("upper(CPR_ENTBUILD) like", value.toUpperCase(), "entbuild");
            return (Criteria) this;
        }

        public Criteria andShipcodeLikeInsensitive(String value) {
            addCriterion("upper(CPR_SHIPCODE) like", value.toUpperCase(), "shipcode");
            return (Criteria) this;
        }

        public Criteria andShipnameLikeInsensitive(String value) {
            addCriterion("upper(CPR_SHIPNAME) like", value.toUpperCase(), "shipname");
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