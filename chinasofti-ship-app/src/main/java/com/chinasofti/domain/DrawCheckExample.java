package com.chinasofti.domain;

import com.limp.framework.core.bean.Pager;
import java.util.ArrayList;
import java.util.List;

public class DrawCheckExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Pager page;

    public DrawCheckExample() {
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
            addCriterion("CDC_ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("CDC_ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("CDC_ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("CDC_ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("CDC_ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("CDC_ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("CDC_ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("CDC_ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("CDC_ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("CDC_ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("CDC_ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("CDC_ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("CDC_ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("CDC_ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andDrawnoIsNull() {
            addCriterion("CDC_DRAWNO is null");
            return (Criteria) this;
        }

        public Criteria andDrawnoIsNotNull() {
            addCriterion("CDC_DRAWNO is not null");
            return (Criteria) this;
        }

        public Criteria andDrawnoEqualTo(String value) {
            addCriterion("CDC_DRAWNO =", value, "drawno");
            return (Criteria) this;
        }

        public Criteria andDrawnoNotEqualTo(String value) {
            addCriterion("CDC_DRAWNO <>", value, "drawno");
            return (Criteria) this;
        }

        public Criteria andDrawnoGreaterThan(String value) {
            addCriterion("CDC_DRAWNO >", value, "drawno");
            return (Criteria) this;
        }

        public Criteria andDrawnoGreaterThanOrEqualTo(String value) {
            addCriterion("CDC_DRAWNO >=", value, "drawno");
            return (Criteria) this;
        }

        public Criteria andDrawnoLessThan(String value) {
            addCriterion("CDC_DRAWNO <", value, "drawno");
            return (Criteria) this;
        }

        public Criteria andDrawnoLessThanOrEqualTo(String value) {
            addCriterion("CDC_DRAWNO <=", value, "drawno");
            return (Criteria) this;
        }

        public Criteria andDrawnoLike(String value) {
            addCriterion("CDC_DRAWNO like", value, "drawno");
            return (Criteria) this;
        }

        public Criteria andDrawnoNotLike(String value) {
            addCriterion("CDC_DRAWNO not like", value, "drawno");
            return (Criteria) this;
        }

        public Criteria andDrawnoIn(List<String> values) {
            addCriterion("CDC_DRAWNO in", values, "drawno");
            return (Criteria) this;
        }

        public Criteria andDrawnoNotIn(List<String> values) {
            addCriterion("CDC_DRAWNO not in", values, "drawno");
            return (Criteria) this;
        }

        public Criteria andDrawnoBetween(String value1, String value2) {
            addCriterion("CDC_DRAWNO between", value1, value2, "drawno");
            return (Criteria) this;
        }

        public Criteria andDrawnoNotBetween(String value1, String value2) {
            addCriterion("CDC_DRAWNO not between", value1, value2, "drawno");
            return (Criteria) this;
        }

        public Criteria andYcsnameIsNull() {
            addCriterion("CDC_YCSNAME is null");
            return (Criteria) this;
        }

        public Criteria andYcsnameIsNotNull() {
            addCriterion("CDC_YCSNAME is not null");
            return (Criteria) this;
        }

        public Criteria andYcsnameEqualTo(String value) {
            addCriterion("CDC_YCSNAME =", value, "ycsname");
            return (Criteria) this;
        }

        public Criteria andYcsnameNotEqualTo(String value) {
            addCriterion("CDC_YCSNAME <>", value, "ycsname");
            return (Criteria) this;
        }

        public Criteria andYcsnameGreaterThan(String value) {
            addCriterion("CDC_YCSNAME >", value, "ycsname");
            return (Criteria) this;
        }

        public Criteria andYcsnameGreaterThanOrEqualTo(String value) {
            addCriterion("CDC_YCSNAME >=", value, "ycsname");
            return (Criteria) this;
        }

        public Criteria andYcsnameLessThan(String value) {
            addCriterion("CDC_YCSNAME <", value, "ycsname");
            return (Criteria) this;
        }

        public Criteria andYcsnameLessThanOrEqualTo(String value) {
            addCriterion("CDC_YCSNAME <=", value, "ycsname");
            return (Criteria) this;
        }

        public Criteria andYcsnameLike(String value) {
            addCriterion("CDC_YCSNAME like", value, "ycsname");
            return (Criteria) this;
        }

        public Criteria andYcsnameNotLike(String value) {
            addCriterion("CDC_YCSNAME not like", value, "ycsname");
            return (Criteria) this;
        }

        public Criteria andYcsnameIn(List<String> values) {
            addCriterion("CDC_YCSNAME in", values, "ycsname");
            return (Criteria) this;
        }

        public Criteria andYcsnameNotIn(List<String> values) {
            addCriterion("CDC_YCSNAME not in", values, "ycsname");
            return (Criteria) this;
        }

        public Criteria andYcsnameBetween(String value1, String value2) {
            addCriterion("CDC_YCSNAME between", value1, value2, "ycsname");
            return (Criteria) this;
        }

        public Criteria andYcsnameNotBetween(String value1, String value2) {
            addCriterion("CDC_YCSNAME not between", value1, value2, "ycsname");
            return (Criteria) this;
        }

        public Criteria andYcscertnumIsNull() {
            addCriterion("CDC_YCSCERTNUM is null");
            return (Criteria) this;
        }

        public Criteria andYcscertnumIsNotNull() {
            addCriterion("CDC_YCSCERTNUM is not null");
            return (Criteria) this;
        }

        public Criteria andYcscertnumEqualTo(String value) {
            addCriterion("CDC_YCSCERTNUM =", value, "ycscertnum");
            return (Criteria) this;
        }

        public Criteria andYcscertnumNotEqualTo(String value) {
            addCriterion("CDC_YCSCERTNUM <>", value, "ycscertnum");
            return (Criteria) this;
        }

        public Criteria andYcscertnumGreaterThan(String value) {
            addCriterion("CDC_YCSCERTNUM >", value, "ycscertnum");
            return (Criteria) this;
        }

        public Criteria andYcscertnumGreaterThanOrEqualTo(String value) {
            addCriterion("CDC_YCSCERTNUM >=", value, "ycscertnum");
            return (Criteria) this;
        }

        public Criteria andYcscertnumLessThan(String value) {
            addCriterion("CDC_YCSCERTNUM <", value, "ycscertnum");
            return (Criteria) this;
        }

        public Criteria andYcscertnumLessThanOrEqualTo(String value) {
            addCriterion("CDC_YCSCERTNUM <=", value, "ycscertnum");
            return (Criteria) this;
        }

        public Criteria andYcscertnumLike(String value) {
            addCriterion("CDC_YCSCERTNUM like", value, "ycscertnum");
            return (Criteria) this;
        }

        public Criteria andYcscertnumNotLike(String value) {
            addCriterion("CDC_YCSCERTNUM not like", value, "ycscertnum");
            return (Criteria) this;
        }

        public Criteria andYcscertnumIn(List<String> values) {
            addCriterion("CDC_YCSCERTNUM in", values, "ycscertnum");
            return (Criteria) this;
        }

        public Criteria andYcscertnumNotIn(List<String> values) {
            addCriterion("CDC_YCSCERTNUM not in", values, "ycscertnum");
            return (Criteria) this;
        }

        public Criteria andYcscertnumBetween(String value1, String value2) {
            addCriterion("CDC_YCSCERTNUM between", value1, value2, "ycscertnum");
            return (Criteria) this;
        }

        public Criteria andYcscertnumNotBetween(String value1, String value2) {
            addCriterion("CDC_YCSCERTNUM not between", value1, value2, "ycscertnum");
            return (Criteria) this;
        }

        public Criteria andChecktypeIsNull() {
            addCriterion("CDC_CHECKTYPE is null");
            return (Criteria) this;
        }

        public Criteria andChecktypeIsNotNull() {
            addCriterion("CDC_CHECKTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andChecktypeEqualTo(String value) {
            addCriterion("CDC_CHECKTYPE =", value, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeNotEqualTo(String value) {
            addCriterion("CDC_CHECKTYPE <>", value, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeGreaterThan(String value) {
            addCriterion("CDC_CHECKTYPE >", value, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeGreaterThanOrEqualTo(String value) {
            addCriterion("CDC_CHECKTYPE >=", value, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeLessThan(String value) {
            addCriterion("CDC_CHECKTYPE <", value, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeLessThanOrEqualTo(String value) {
            addCriterion("CDC_CHECKTYPE <=", value, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeLike(String value) {
            addCriterion("CDC_CHECKTYPE like", value, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeNotLike(String value) {
            addCriterion("CDC_CHECKTYPE not like", value, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeIn(List<String> values) {
            addCriterion("CDC_CHECKTYPE in", values, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeNotIn(List<String> values) {
            addCriterion("CDC_CHECKTYPE not in", values, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeBetween(String value1, String value2) {
            addCriterion("CDC_CHECKTYPE between", value1, value2, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeNotBetween(String value1, String value2) {
            addCriterion("CDC_CHECKTYPE not between", value1, value2, "checktype");
            return (Criteria) this;
        }

        public Criteria andCheckpassIsNull() {
            addCriterion("CDC_CHECKPASS is null");
            return (Criteria) this;
        }

        public Criteria andCheckpassIsNotNull() {
            addCriterion("CDC_CHECKPASS is not null");
            return (Criteria) this;
        }

        public Criteria andCheckpassEqualTo(String value) {
            addCriterion("CDC_CHECKPASS =", value, "checkpass");
            return (Criteria) this;
        }

        public Criteria andCheckpassNotEqualTo(String value) {
            addCriterion("CDC_CHECKPASS <>", value, "checkpass");
            return (Criteria) this;
        }

        public Criteria andCheckpassGreaterThan(String value) {
            addCriterion("CDC_CHECKPASS >", value, "checkpass");
            return (Criteria) this;
        }

        public Criteria andCheckpassGreaterThanOrEqualTo(String value) {
            addCriterion("CDC_CHECKPASS >=", value, "checkpass");
            return (Criteria) this;
        }

        public Criteria andCheckpassLessThan(String value) {
            addCriterion("CDC_CHECKPASS <", value, "checkpass");
            return (Criteria) this;
        }

        public Criteria andCheckpassLessThanOrEqualTo(String value) {
            addCriterion("CDC_CHECKPASS <=", value, "checkpass");
            return (Criteria) this;
        }

        public Criteria andCheckpassLike(String value) {
            addCriterion("CDC_CHECKPASS like", value, "checkpass");
            return (Criteria) this;
        }

        public Criteria andCheckpassNotLike(String value) {
            addCriterion("CDC_CHECKPASS not like", value, "checkpass");
            return (Criteria) this;
        }

        public Criteria andCheckpassIn(List<String> values) {
            addCriterion("CDC_CHECKPASS in", values, "checkpass");
            return (Criteria) this;
        }

        public Criteria andCheckpassNotIn(List<String> values) {
            addCriterion("CDC_CHECKPASS not in", values, "checkpass");
            return (Criteria) this;
        }

        public Criteria andCheckpassBetween(String value1, String value2) {
            addCriterion("CDC_CHECKPASS between", value1, value2, "checkpass");
            return (Criteria) this;
        }

        public Criteria andCheckpassNotBetween(String value1, String value2) {
            addCriterion("CDC_CHECKPASS not between", value1, value2, "checkpass");
            return (Criteria) this;
        }

        public Criteria andChecktimeIsNull() {
            addCriterion("CDC_CHECKTIME is null");
            return (Criteria) this;
        }

        public Criteria andChecktimeIsNotNull() {
            addCriterion("CDC_CHECKTIME is not null");
            return (Criteria) this;
        }

        public Criteria andChecktimeEqualTo(String value) {
            addCriterion("CDC_CHECKTIME =", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeNotEqualTo(String value) {
            addCriterion("CDC_CHECKTIME <>", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeGreaterThan(String value) {
            addCriterion("CDC_CHECKTIME >", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeGreaterThanOrEqualTo(String value) {
            addCriterion("CDC_CHECKTIME >=", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeLessThan(String value) {
            addCriterion("CDC_CHECKTIME <", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeLessThanOrEqualTo(String value) {
            addCriterion("CDC_CHECKTIME <=", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeLike(String value) {
            addCriterion("CDC_CHECKTIME like", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeNotLike(String value) {
            addCriterion("CDC_CHECKTIME not like", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeIn(List<String> values) {
            addCriterion("CDC_CHECKTIME in", values, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeNotIn(List<String> values) {
            addCriterion("CDC_CHECKTIME not in", values, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeBetween(String value1, String value2) {
            addCriterion("CDC_CHECKTIME between", value1, value2, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeNotBetween(String value1, String value2) {
            addCriterion("CDC_CHECKTIME not between", value1, value2, "checktime");
            return (Criteria) this;
        }

        public Criteria andEntidIsNull() {
            addCriterion("CDC_ENTID is null");
            return (Criteria) this;
        }

        public Criteria andEntidIsNotNull() {
            addCriterion("CDC_ENTID is not null");
            return (Criteria) this;
        }

        public Criteria andEntidEqualTo(String value) {
            addCriterion("CDC_ENTID =", value, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidNotEqualTo(String value) {
            addCriterion("CDC_ENTID <>", value, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidGreaterThan(String value) {
            addCriterion("CDC_ENTID >", value, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidGreaterThanOrEqualTo(String value) {
            addCriterion("CDC_ENTID >=", value, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidLessThan(String value) {
            addCriterion("CDC_ENTID <", value, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidLessThanOrEqualTo(String value) {
            addCriterion("CDC_ENTID <=", value, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidLike(String value) {
            addCriterion("CDC_ENTID like", value, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidNotLike(String value) {
            addCriterion("CDC_ENTID not like", value, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidIn(List<String> values) {
            addCriterion("CDC_ENTID in", values, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidNotIn(List<String> values) {
            addCriterion("CDC_ENTID not in", values, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidBetween(String value1, String value2) {
            addCriterion("CDC_ENTID between", value1, value2, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidNotBetween(String value1, String value2) {
            addCriterion("CDC_ENTID not between", value1, value2, "entid");
            return (Criteria) this;
        }

        public Criteria andIdtIsNull() {
            addCriterion("CDC_IDT is null");
            return (Criteria) this;
        }

        public Criteria andIdtIsNotNull() {
            addCriterion("CDC_IDT is not null");
            return (Criteria) this;
        }

        public Criteria andIdtEqualTo(String value) {
            addCriterion("CDC_IDT =", value, "idt");
            return (Criteria) this;
        }

        public Criteria andIdtNotEqualTo(String value) {
            addCriterion("CDC_IDT <>", value, "idt");
            return (Criteria) this;
        }

        public Criteria andIdtGreaterThan(String value) {
            addCriterion("CDC_IDT >", value, "idt");
            return (Criteria) this;
        }

        public Criteria andIdtGreaterThanOrEqualTo(String value) {
            addCriterion("CDC_IDT >=", value, "idt");
            return (Criteria) this;
        }

        public Criteria andIdtLessThan(String value) {
            addCriterion("CDC_IDT <", value, "idt");
            return (Criteria) this;
        }

        public Criteria andIdtLessThanOrEqualTo(String value) {
            addCriterion("CDC_IDT <=", value, "idt");
            return (Criteria) this;
        }

        public Criteria andIdtLike(String value) {
            addCriterion("CDC_IDT like", value, "idt");
            return (Criteria) this;
        }

        public Criteria andIdtNotLike(String value) {
            addCriterion("CDC_IDT not like", value, "idt");
            return (Criteria) this;
        }

        public Criteria andIdtIn(List<String> values) {
            addCriterion("CDC_IDT in", values, "idt");
            return (Criteria) this;
        }

        public Criteria andIdtNotIn(List<String> values) {
            addCriterion("CDC_IDT not in", values, "idt");
            return (Criteria) this;
        }

        public Criteria andIdtBetween(String value1, String value2) {
            addCriterion("CDC_IDT between", value1, value2, "idt");
            return (Criteria) this;
        }

        public Criteria andIdtNotBetween(String value1, String value2) {
            addCriterion("CDC_IDT not between", value1, value2, "idt");
            return (Criteria) this;
        }

        public Criteria andWorkareaIsNull() {
            addCriterion("CDC_WORKAREA is null");
            return (Criteria) this;
        }

        public Criteria andWorkareaIsNotNull() {
            addCriterion("CDC_WORKAREA is not null");
            return (Criteria) this;
        }

        public Criteria andWorkareaEqualTo(String value) {
            addCriterion("CDC_WORKAREA =", value, "workarea");
            return (Criteria) this;
        }

        public Criteria andWorkareaNotEqualTo(String value) {
            addCriterion("CDC_WORKAREA <>", value, "workarea");
            return (Criteria) this;
        }

        public Criteria andWorkareaGreaterThan(String value) {
            addCriterion("CDC_WORKAREA >", value, "workarea");
            return (Criteria) this;
        }

        public Criteria andWorkareaGreaterThanOrEqualTo(String value) {
            addCriterion("CDC_WORKAREA >=", value, "workarea");
            return (Criteria) this;
        }

        public Criteria andWorkareaLessThan(String value) {
            addCriterion("CDC_WORKAREA <", value, "workarea");
            return (Criteria) this;
        }

        public Criteria andWorkareaLessThanOrEqualTo(String value) {
            addCriterion("CDC_WORKAREA <=", value, "workarea");
            return (Criteria) this;
        }

        public Criteria andWorkareaLike(String value) {
            addCriterion("CDC_WORKAREA like", value, "workarea");
            return (Criteria) this;
        }

        public Criteria andWorkareaNotLike(String value) {
            addCriterion("CDC_WORKAREA not like", value, "workarea");
            return (Criteria) this;
        }

        public Criteria andWorkareaIn(List<String> values) {
            addCriterion("CDC_WORKAREA in", values, "workarea");
            return (Criteria) this;
        }

        public Criteria andWorkareaNotIn(List<String> values) {
            addCriterion("CDC_WORKAREA not in", values, "workarea");
            return (Criteria) this;
        }

        public Criteria andWorkareaBetween(String value1, String value2) {
            addCriterion("CDC_WORKAREA between", value1, value2, "workarea");
            return (Criteria) this;
        }

        public Criteria andWorkareaNotBetween(String value1, String value2) {
            addCriterion("CDC_WORKAREA not between", value1, value2, "workarea");
            return (Criteria) this;
        }

        public Criteria andOrgcodeIsNull() {
            addCriterion("CDC_ORGCODE is null");
            return (Criteria) this;
        }

        public Criteria andOrgcodeIsNotNull() {
            addCriterion("CDC_ORGCODE is not null");
            return (Criteria) this;
        }

        public Criteria andOrgcodeEqualTo(String value) {
            addCriterion("CDC_ORGCODE =", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeNotEqualTo(String value) {
            addCriterion("CDC_ORGCODE <>", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeGreaterThan(String value) {
            addCriterion("CDC_ORGCODE >", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeGreaterThanOrEqualTo(String value) {
            addCriterion("CDC_ORGCODE >=", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeLessThan(String value) {
            addCriterion("CDC_ORGCODE <", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeLessThanOrEqualTo(String value) {
            addCriterion("CDC_ORGCODE <=", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeLike(String value) {
            addCriterion("CDC_ORGCODE like", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeNotLike(String value) {
            addCriterion("CDC_ORGCODE not like", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeIn(List<String> values) {
            addCriterion("CDC_ORGCODE in", values, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeNotIn(List<String> values) {
            addCriterion("CDC_ORGCODE not in", values, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeBetween(String value1, String value2) {
            addCriterion("CDC_ORGCODE between", value1, value2, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeNotBetween(String value1, String value2) {
            addCriterion("CDC_ORGCODE not between", value1, value2, "orgcode");
            return (Criteria) this;
        }

        public Criteria andYcsnameDqIsNull() {
            addCriterion("CDC_YCSNAME_DQ is null");
            return (Criteria) this;
        }

        public Criteria andYcsnameDqIsNotNull() {
            addCriterion("CDC_YCSNAME_DQ is not null");
            return (Criteria) this;
        }

        public Criteria andYcsnameDqEqualTo(String value) {
            addCriterion("CDC_YCSNAME_DQ =", value, "ycsnameDq");
            return (Criteria) this;
        }

        public Criteria andYcsnameDqNotEqualTo(String value) {
            addCriterion("CDC_YCSNAME_DQ <>", value, "ycsnameDq");
            return (Criteria) this;
        }

        public Criteria andYcsnameDqGreaterThan(String value) {
            addCriterion("CDC_YCSNAME_DQ >", value, "ycsnameDq");
            return (Criteria) this;
        }

        public Criteria andYcsnameDqGreaterThanOrEqualTo(String value) {
            addCriterion("CDC_YCSNAME_DQ >=", value, "ycsnameDq");
            return (Criteria) this;
        }

        public Criteria andYcsnameDqLessThan(String value) {
            addCriterion("CDC_YCSNAME_DQ <", value, "ycsnameDq");
            return (Criteria) this;
        }

        public Criteria andYcsnameDqLessThanOrEqualTo(String value) {
            addCriterion("CDC_YCSNAME_DQ <=", value, "ycsnameDq");
            return (Criteria) this;
        }

        public Criteria andYcsnameDqLike(String value) {
            addCriterion("CDC_YCSNAME_DQ like", value, "ycsnameDq");
            return (Criteria) this;
        }

        public Criteria andYcsnameDqNotLike(String value) {
            addCriterion("CDC_YCSNAME_DQ not like", value, "ycsnameDq");
            return (Criteria) this;
        }

        public Criteria andYcsnameDqIn(List<String> values) {
            addCriterion("CDC_YCSNAME_DQ in", values, "ycsnameDq");
            return (Criteria) this;
        }

        public Criteria andYcsnameDqNotIn(List<String> values) {
            addCriterion("CDC_YCSNAME_DQ not in", values, "ycsnameDq");
            return (Criteria) this;
        }

        public Criteria andYcsnameDqBetween(String value1, String value2) {
            addCriterion("CDC_YCSNAME_DQ between", value1, value2, "ycsnameDq");
            return (Criteria) this;
        }

        public Criteria andYcsnameDqNotBetween(String value1, String value2) {
            addCriterion("CDC_YCSNAME_DQ not between", value1, value2, "ycsnameDq");
            return (Criteria) this;
        }

        public Criteria andYcscertnumDqIsNull() {
            addCriterion("CDC_YCSCERTNUM_DQ is null");
            return (Criteria) this;
        }

        public Criteria andYcscertnumDqIsNotNull() {
            addCriterion("CDC_YCSCERTNUM_DQ is not null");
            return (Criteria) this;
        }

        public Criteria andYcscertnumDqEqualTo(String value) {
            addCriterion("CDC_YCSCERTNUM_DQ =", value, "ycscertnumDq");
            return (Criteria) this;
        }

        public Criteria andYcscertnumDqNotEqualTo(String value) {
            addCriterion("CDC_YCSCERTNUM_DQ <>", value, "ycscertnumDq");
            return (Criteria) this;
        }

        public Criteria andYcscertnumDqGreaterThan(String value) {
            addCriterion("CDC_YCSCERTNUM_DQ >", value, "ycscertnumDq");
            return (Criteria) this;
        }

        public Criteria andYcscertnumDqGreaterThanOrEqualTo(String value) {
            addCriterion("CDC_YCSCERTNUM_DQ >=", value, "ycscertnumDq");
            return (Criteria) this;
        }

        public Criteria andYcscertnumDqLessThan(String value) {
            addCriterion("CDC_YCSCERTNUM_DQ <", value, "ycscertnumDq");
            return (Criteria) this;
        }

        public Criteria andYcscertnumDqLessThanOrEqualTo(String value) {
            addCriterion("CDC_YCSCERTNUM_DQ <=", value, "ycscertnumDq");
            return (Criteria) this;
        }

        public Criteria andYcscertnumDqLike(String value) {
            addCriterion("CDC_YCSCERTNUM_DQ like", value, "ycscertnumDq");
            return (Criteria) this;
        }

        public Criteria andYcscertnumDqNotLike(String value) {
            addCriterion("CDC_YCSCERTNUM_DQ not like", value, "ycscertnumDq");
            return (Criteria) this;
        }

        public Criteria andYcscertnumDqIn(List<String> values) {
            addCriterion("CDC_YCSCERTNUM_DQ in", values, "ycscertnumDq");
            return (Criteria) this;
        }

        public Criteria andYcscertnumDqNotIn(List<String> values) {
            addCriterion("CDC_YCSCERTNUM_DQ not in", values, "ycscertnumDq");
            return (Criteria) this;
        }

        public Criteria andYcscertnumDqBetween(String value1, String value2) {
            addCriterion("CDC_YCSCERTNUM_DQ between", value1, value2, "ycscertnumDq");
            return (Criteria) this;
        }

        public Criteria andYcscertnumDqNotBetween(String value1, String value2) {
            addCriterion("CDC_YCSCERTNUM_DQ not between", value1, value2, "ycscertnumDq");
            return (Criteria) this;
        }

        public Criteria andYcsnameLjIsNull() {
            addCriterion("CDC_YCSNAME_LJ is null");
            return (Criteria) this;
        }

        public Criteria andYcsnameLjIsNotNull() {
            addCriterion("CDC_YCSNAME_LJ is not null");
            return (Criteria) this;
        }

        public Criteria andYcsnameLjEqualTo(String value) {
            addCriterion("CDC_YCSNAME_LJ =", value, "ycsnameLj");
            return (Criteria) this;
        }

        public Criteria andYcsnameLjNotEqualTo(String value) {
            addCriterion("CDC_YCSNAME_LJ <>", value, "ycsnameLj");
            return (Criteria) this;
        }

        public Criteria andYcsnameLjGreaterThan(String value) {
            addCriterion("CDC_YCSNAME_LJ >", value, "ycsnameLj");
            return (Criteria) this;
        }

        public Criteria andYcsnameLjGreaterThanOrEqualTo(String value) {
            addCriterion("CDC_YCSNAME_LJ >=", value, "ycsnameLj");
            return (Criteria) this;
        }

        public Criteria andYcsnameLjLessThan(String value) {
            addCriterion("CDC_YCSNAME_LJ <", value, "ycsnameLj");
            return (Criteria) this;
        }

        public Criteria andYcsnameLjLessThanOrEqualTo(String value) {
            addCriterion("CDC_YCSNAME_LJ <=", value, "ycsnameLj");
            return (Criteria) this;
        }

        public Criteria andYcsnameLjLike(String value) {
            addCriterion("CDC_YCSNAME_LJ like", value, "ycsnameLj");
            return (Criteria) this;
        }

        public Criteria andYcsnameLjNotLike(String value) {
            addCriterion("CDC_YCSNAME_LJ not like", value, "ycsnameLj");
            return (Criteria) this;
        }

        public Criteria andYcsnameLjIn(List<String> values) {
            addCriterion("CDC_YCSNAME_LJ in", values, "ycsnameLj");
            return (Criteria) this;
        }

        public Criteria andYcsnameLjNotIn(List<String> values) {
            addCriterion("CDC_YCSNAME_LJ not in", values, "ycsnameLj");
            return (Criteria) this;
        }

        public Criteria andYcsnameLjBetween(String value1, String value2) {
            addCriterion("CDC_YCSNAME_LJ between", value1, value2, "ycsnameLj");
            return (Criteria) this;
        }

        public Criteria andYcsnameLjNotBetween(String value1, String value2) {
            addCriterion("CDC_YCSNAME_LJ not between", value1, value2, "ycsnameLj");
            return (Criteria) this;
        }

        public Criteria andYcscertnumLjIsNull() {
            addCriterion("CDC_YCSCERTNUM_LJ is null");
            return (Criteria) this;
        }

        public Criteria andYcscertnumLjIsNotNull() {
            addCriterion("CDC_YCSCERTNUM_LJ is not null");
            return (Criteria) this;
        }

        public Criteria andYcscertnumLjEqualTo(String value) {
            addCriterion("CDC_YCSCERTNUM_LJ =", value, "ycscertnumLj");
            return (Criteria) this;
        }

        public Criteria andYcscertnumLjNotEqualTo(String value) {
            addCriterion("CDC_YCSCERTNUM_LJ <>", value, "ycscertnumLj");
            return (Criteria) this;
        }

        public Criteria andYcscertnumLjGreaterThan(String value) {
            addCriterion("CDC_YCSCERTNUM_LJ >", value, "ycscertnumLj");
            return (Criteria) this;
        }

        public Criteria andYcscertnumLjGreaterThanOrEqualTo(String value) {
            addCriterion("CDC_YCSCERTNUM_LJ >=", value, "ycscertnumLj");
            return (Criteria) this;
        }

        public Criteria andYcscertnumLjLessThan(String value) {
            addCriterion("CDC_YCSCERTNUM_LJ <", value, "ycscertnumLj");
            return (Criteria) this;
        }

        public Criteria andYcscertnumLjLessThanOrEqualTo(String value) {
            addCriterion("CDC_YCSCERTNUM_LJ <=", value, "ycscertnumLj");
            return (Criteria) this;
        }

        public Criteria andYcscertnumLjLike(String value) {
            addCriterion("CDC_YCSCERTNUM_LJ like", value, "ycscertnumLj");
            return (Criteria) this;
        }

        public Criteria andYcscertnumLjNotLike(String value) {
            addCriterion("CDC_YCSCERTNUM_LJ not like", value, "ycscertnumLj");
            return (Criteria) this;
        }

        public Criteria andYcscertnumLjIn(List<String> values) {
            addCriterion("CDC_YCSCERTNUM_LJ in", values, "ycscertnumLj");
            return (Criteria) this;
        }

        public Criteria andYcscertnumLjNotIn(List<String> values) {
            addCriterion("CDC_YCSCERTNUM_LJ not in", values, "ycscertnumLj");
            return (Criteria) this;
        }

        public Criteria andYcscertnumLjBetween(String value1, String value2) {
            addCriterion("CDC_YCSCERTNUM_LJ between", value1, value2, "ycscertnumLj");
            return (Criteria) this;
        }

        public Criteria andYcscertnumLjNotBetween(String value1, String value2) {
            addCriterion("CDC_YCSCERTNUM_LJ not between", value1, value2, "ycscertnumLj");
            return (Criteria) this;
        }

        public Criteria andYcsnameZlIsNull() {
            addCriterion("CDC_YCSNAME_ZL is null");
            return (Criteria) this;
        }

        public Criteria andYcsnameZlIsNotNull() {
            addCriterion("CDC_YCSNAME_ZL is not null");
            return (Criteria) this;
        }

        public Criteria andYcsnameZlEqualTo(String value) {
            addCriterion("CDC_YCSNAME_ZL =", value, "ycsnameZl");
            return (Criteria) this;
        }

        public Criteria andYcsnameZlNotEqualTo(String value) {
            addCriterion("CDC_YCSNAME_ZL <>", value, "ycsnameZl");
            return (Criteria) this;
        }

        public Criteria andYcsnameZlGreaterThan(String value) {
            addCriterion("CDC_YCSNAME_ZL >", value, "ycsnameZl");
            return (Criteria) this;
        }

        public Criteria andYcsnameZlGreaterThanOrEqualTo(String value) {
            addCriterion("CDC_YCSNAME_ZL >=", value, "ycsnameZl");
            return (Criteria) this;
        }

        public Criteria andYcsnameZlLessThan(String value) {
            addCriterion("CDC_YCSNAME_ZL <", value, "ycsnameZl");
            return (Criteria) this;
        }

        public Criteria andYcsnameZlLessThanOrEqualTo(String value) {
            addCriterion("CDC_YCSNAME_ZL <=", value, "ycsnameZl");
            return (Criteria) this;
        }

        public Criteria andYcsnameZlLike(String value) {
            addCriterion("CDC_YCSNAME_ZL like", value, "ycsnameZl");
            return (Criteria) this;
        }

        public Criteria andYcsnameZlNotLike(String value) {
            addCriterion("CDC_YCSNAME_ZL not like", value, "ycsnameZl");
            return (Criteria) this;
        }

        public Criteria andYcsnameZlIn(List<String> values) {
            addCriterion("CDC_YCSNAME_ZL in", values, "ycsnameZl");
            return (Criteria) this;
        }

        public Criteria andYcsnameZlNotIn(List<String> values) {
            addCriterion("CDC_YCSNAME_ZL not in", values, "ycsnameZl");
            return (Criteria) this;
        }

        public Criteria andYcsnameZlBetween(String value1, String value2) {
            addCriterion("CDC_YCSNAME_ZL between", value1, value2, "ycsnameZl");
            return (Criteria) this;
        }

        public Criteria andYcsnameZlNotBetween(String value1, String value2) {
            addCriterion("CDC_YCSNAME_ZL not between", value1, value2, "ycsnameZl");
            return (Criteria) this;
        }

        public Criteria andYcscertnumZlIsNull() {
            addCriterion("CDC_YCSCERTNUM_ZL is null");
            return (Criteria) this;
        }

        public Criteria andYcscertnumZlIsNotNull() {
            addCriterion("CDC_YCSCERTNUM_ZL is not null");
            return (Criteria) this;
        }

        public Criteria andYcscertnumZlEqualTo(String value) {
            addCriterion("CDC_YCSCERTNUM_ZL =", value, "ycscertnumZl");
            return (Criteria) this;
        }

        public Criteria andYcscertnumZlNotEqualTo(String value) {
            addCriterion("CDC_YCSCERTNUM_ZL <>", value, "ycscertnumZl");
            return (Criteria) this;
        }

        public Criteria andYcscertnumZlGreaterThan(String value) {
            addCriterion("CDC_YCSCERTNUM_ZL >", value, "ycscertnumZl");
            return (Criteria) this;
        }

        public Criteria andYcscertnumZlGreaterThanOrEqualTo(String value) {
            addCriterion("CDC_YCSCERTNUM_ZL >=", value, "ycscertnumZl");
            return (Criteria) this;
        }

        public Criteria andYcscertnumZlLessThan(String value) {
            addCriterion("CDC_YCSCERTNUM_ZL <", value, "ycscertnumZl");
            return (Criteria) this;
        }

        public Criteria andYcscertnumZlLessThanOrEqualTo(String value) {
            addCriterion("CDC_YCSCERTNUM_ZL <=", value, "ycscertnumZl");
            return (Criteria) this;
        }

        public Criteria andYcscertnumZlLike(String value) {
            addCriterion("CDC_YCSCERTNUM_ZL like", value, "ycscertnumZl");
            return (Criteria) this;
        }

        public Criteria andYcscertnumZlNotLike(String value) {
            addCriterion("CDC_YCSCERTNUM_ZL not like", value, "ycscertnumZl");
            return (Criteria) this;
        }

        public Criteria andYcscertnumZlIn(List<String> values) {
            addCriterion("CDC_YCSCERTNUM_ZL in", values, "ycscertnumZl");
            return (Criteria) this;
        }

        public Criteria andYcscertnumZlNotIn(List<String> values) {
            addCriterion("CDC_YCSCERTNUM_ZL not in", values, "ycscertnumZl");
            return (Criteria) this;
        }

        public Criteria andYcscertnumZlBetween(String value1, String value2) {
            addCriterion("CDC_YCSCERTNUM_ZL between", value1, value2, "ycscertnumZl");
            return (Criteria) this;
        }

        public Criteria andYcscertnumZlNotBetween(String value1, String value2) {
            addCriterion("CDC_YCSCERTNUM_ZL not between", value1, value2, "ycscertnumZl");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("CDC_STATE is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("CDC_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("CDC_STATE =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("CDC_STATE <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("CDC_STATE >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("CDC_STATE >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("CDC_STATE <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("CDC_STATE <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("CDC_STATE like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("CDC_STATE not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("CDC_STATE in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("CDC_STATE not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("CDC_STATE between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("CDC_STATE not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andIdLikeInsensitive(String value) {
            addCriterion("upper(CDC_ID) like", value.toUpperCase(), "id");
            return (Criteria) this;
        }

        public Criteria andDrawnoLikeInsensitive(String value) {
            addCriterion("upper(CDC_DRAWNO) like", value.toUpperCase(), "drawno");
            return (Criteria) this;
        }

        public Criteria andYcsnameLikeInsensitive(String value) {
            addCriterion("upper(CDC_YCSNAME) like", value.toUpperCase(), "ycsname");
            return (Criteria) this;
        }

        public Criteria andYcscertnumLikeInsensitive(String value) {
            addCriterion("upper(CDC_YCSCERTNUM) like", value.toUpperCase(), "ycscertnum");
            return (Criteria) this;
        }

        public Criteria andChecktypeLikeInsensitive(String value) {
            addCriterion("upper(CDC_CHECKTYPE) like", value.toUpperCase(), "checktype");
            return (Criteria) this;
        }

        public Criteria andCheckpassLikeInsensitive(String value) {
            addCriterion("upper(CDC_CHECKPASS) like", value.toUpperCase(), "checkpass");
            return (Criteria) this;
        }

        public Criteria andChecktimeLikeInsensitive(String value) {
            addCriterion("upper(CDC_CHECKTIME) like", value.toUpperCase(), "checktime");
            return (Criteria) this;
        }

        public Criteria andEntidLikeInsensitive(String value) {
            addCriterion("upper(CDC_ENTID) like", value.toUpperCase(), "entid");
            return (Criteria) this;
        }

        public Criteria andIdtLikeInsensitive(String value) {
            addCriterion("upper(CDC_IDT) like", value.toUpperCase(), "idt");
            return (Criteria) this;
        }

        public Criteria andWorkareaLikeInsensitive(String value) {
            addCriterion("upper(CDC_WORKAREA) like", value.toUpperCase(), "workarea");
            return (Criteria) this;
        }

        public Criteria andOrgcodeLikeInsensitive(String value) {
            addCriterion("upper(CDC_ORGCODE) like", value.toUpperCase(), "orgcode");
            return (Criteria) this;
        }

        public Criteria andYcsnameDqLikeInsensitive(String value) {
            addCriterion("upper(CDC_YCSNAME_DQ) like", value.toUpperCase(), "ycsnameDq");
            return (Criteria) this;
        }

        public Criteria andYcscertnumDqLikeInsensitive(String value) {
            addCriterion("upper(CDC_YCSCERTNUM_DQ) like", value.toUpperCase(), "ycscertnumDq");
            return (Criteria) this;
        }

        public Criteria andYcsnameLjLikeInsensitive(String value) {
            addCriterion("upper(CDC_YCSNAME_LJ) like", value.toUpperCase(), "ycsnameLj");
            return (Criteria) this;
        }

        public Criteria andYcscertnumLjLikeInsensitive(String value) {
            addCriterion("upper(CDC_YCSCERTNUM_LJ) like", value.toUpperCase(), "ycscertnumLj");
            return (Criteria) this;
        }

        public Criteria andYcsnameZlLikeInsensitive(String value) {
            addCriterion("upper(CDC_YCSNAME_ZL) like", value.toUpperCase(), "ycsnameZl");
            return (Criteria) this;
        }

        public Criteria andYcscertnumZlLikeInsensitive(String value) {
            addCriterion("upper(CDC_YCSCERTNUM_ZL) like", value.toUpperCase(), "ycscertnumZl");
            return (Criteria) this;
        }

        public Criteria andStateLikeInsensitive(String value) {
            addCriterion("upper(CDC_STATE) like", value.toUpperCase(), "state");
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