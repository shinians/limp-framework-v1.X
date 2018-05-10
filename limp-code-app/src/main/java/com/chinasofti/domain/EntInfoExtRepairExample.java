package com.chinasofti.domain;

import com.limp.framework.core.bean.Pager;

import java.util.ArrayList;
import java.util.List;

public class EntInfoExtRepairExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Pager page;

    public EntInfoExtRepairExample() {
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
            addCriterion("CEQ_ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("CEQ_ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("CEQ_ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("CEQ_ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("CEQ_ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("CEQ_ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("CEQ_ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("CEQ_ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("CEQ_ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("CEQ_ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("CEQ_ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("CEQ_ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("CEQ_ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("CEQ_ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andPidIsNull() {
            addCriterion("CEQ_PID is null");
            return (Criteria) this;
        }

        public Criteria andPidIsNotNull() {
            addCriterion("CEQ_PID is not null");
            return (Criteria) this;
        }

        public Criteria andPidEqualTo(String value) {
            addCriterion("CEQ_PID =", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotEqualTo(String value) {
            addCriterion("CEQ_PID <>", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThan(String value) {
            addCriterion("CEQ_PID >", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThanOrEqualTo(String value) {
            addCriterion("CEQ_PID >=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThan(String value) {
            addCriterion("CEQ_PID <", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThanOrEqualTo(String value) {
            addCriterion("CEQ_PID <=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLike(String value) {
            addCriterion("CEQ_PID like", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotLike(String value) {
            addCriterion("CEQ_PID not like", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidIn(List<String> values) {
            addCriterion("CEQ_PID in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotIn(List<String> values) {
            addCriterion("CEQ_PID not in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidBetween(String value1, String value2) {
            addCriterion("CEQ_PID between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotBetween(String value1, String value2) {
            addCriterion("CEQ_PID not between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("CEQ_CREATETIME is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("CEQ_CREATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(String value) {
            addCriterion("CEQ_CREATETIME =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(String value) {
            addCriterion("CEQ_CREATETIME <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(String value) {
            addCriterion("CEQ_CREATETIME >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("CEQ_CREATETIME >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(String value) {
            addCriterion("CEQ_CREATETIME <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(String value) {
            addCriterion("CEQ_CREATETIME <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLike(String value) {
            addCriterion("CEQ_CREATETIME like", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotLike(String value) {
            addCriterion("CEQ_CREATETIME not like", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<String> values) {
            addCriterion("CEQ_CREATETIME in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<String> values) {
            addCriterion("CEQ_CREATETIME not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(String value1, String value2) {
            addCriterion("CEQ_CREATETIME between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(String value1, String value2) {
            addCriterion("CEQ_CREATETIME not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andEntareaIsNull() {
            addCriterion("CEQ_ENTAREA is null");
            return (Criteria) this;
        }

        public Criteria andEntareaIsNotNull() {
            addCriterion("CEQ_ENTAREA is not null");
            return (Criteria) this;
        }

        public Criteria andEntareaEqualTo(String value) {
            addCriterion("CEQ_ENTAREA =", value, "entarea");
            return (Criteria) this;
        }

        public Criteria andEntareaNotEqualTo(String value) {
            addCriterion("CEQ_ENTAREA <>", value, "entarea");
            return (Criteria) this;
        }

        public Criteria andEntareaGreaterThan(String value) {
            addCriterion("CEQ_ENTAREA >", value, "entarea");
            return (Criteria) this;
        }

        public Criteria andEntareaGreaterThanOrEqualTo(String value) {
            addCriterion("CEQ_ENTAREA >=", value, "entarea");
            return (Criteria) this;
        }

        public Criteria andEntareaLessThan(String value) {
            addCriterion("CEQ_ENTAREA <", value, "entarea");
            return (Criteria) this;
        }

        public Criteria andEntareaLessThanOrEqualTo(String value) {
            addCriterion("CEQ_ENTAREA <=", value, "entarea");
            return (Criteria) this;
        }

        public Criteria andEntareaLike(String value) {
            addCriterion("CEQ_ENTAREA like", value, "entarea");
            return (Criteria) this;
        }

        public Criteria andEntareaNotLike(String value) {
            addCriterion("CEQ_ENTAREA not like", value, "entarea");
            return (Criteria) this;
        }

        public Criteria andEntareaIn(List<String> values) {
            addCriterion("CEQ_ENTAREA in", values, "entarea");
            return (Criteria) this;
        }

        public Criteria andEntareaNotIn(List<String> values) {
            addCriterion("CEQ_ENTAREA not in", values, "entarea");
            return (Criteria) this;
        }

        public Criteria andEntareaBetween(String value1, String value2) {
            addCriterion("CEQ_ENTAREA between", value1, value2, "entarea");
            return (Criteria) this;
        }

        public Criteria andEntareaNotBetween(String value1, String value2) {
            addCriterion("CEQ_ENTAREA not between", value1, value2, "entarea");
            return (Criteria) this;
        }

        public Criteria andRegistcapitalIsNull() {
            addCriterion("CEQ_REGISTCAPITAL is null");
            return (Criteria) this;
        }

        public Criteria andRegistcapitalIsNotNull() {
            addCriterion("CEQ_REGISTCAPITAL is not null");
            return (Criteria) this;
        }

        public Criteria andRegistcapitalEqualTo(String value) {
            addCriterion("CEQ_REGISTCAPITAL =", value, "registcapital");
            return (Criteria) this;
        }

        public Criteria andRegistcapitalNotEqualTo(String value) {
            addCriterion("CEQ_REGISTCAPITAL <>", value, "registcapital");
            return (Criteria) this;
        }

        public Criteria andRegistcapitalGreaterThan(String value) {
            addCriterion("CEQ_REGISTCAPITAL >", value, "registcapital");
            return (Criteria) this;
        }

        public Criteria andRegistcapitalGreaterThanOrEqualTo(String value) {
            addCriterion("CEQ_REGISTCAPITAL >=", value, "registcapital");
            return (Criteria) this;
        }

        public Criteria andRegistcapitalLessThan(String value) {
            addCriterion("CEQ_REGISTCAPITAL <", value, "registcapital");
            return (Criteria) this;
        }

        public Criteria andRegistcapitalLessThanOrEqualTo(String value) {
            addCriterion("CEQ_REGISTCAPITAL <=", value, "registcapital");
            return (Criteria) this;
        }

        public Criteria andRegistcapitalLike(String value) {
            addCriterion("CEQ_REGISTCAPITAL like", value, "registcapital");
            return (Criteria) this;
        }

        public Criteria andRegistcapitalNotLike(String value) {
            addCriterion("CEQ_REGISTCAPITAL not like", value, "registcapital");
            return (Criteria) this;
        }

        public Criteria andRegistcapitalIn(List<String> values) {
            addCriterion("CEQ_REGISTCAPITAL in", values, "registcapital");
            return (Criteria) this;
        }

        public Criteria andRegistcapitalNotIn(List<String> values) {
            addCriterion("CEQ_REGISTCAPITAL not in", values, "registcapital");
            return (Criteria) this;
        }

        public Criteria andRegistcapitalBetween(String value1, String value2) {
            addCriterion("CEQ_REGISTCAPITAL between", value1, value2, "registcapital");
            return (Criteria) this;
        }

        public Criteria andRegistcapitalNotBetween(String value1, String value2) {
            addCriterion("CEQ_REGISTCAPITAL not between", value1, value2, "registcapital");
            return (Criteria) this;
        }

        public Criteria andProfworkersnumIsNull() {
            addCriterion("CEQ_PROFWORKERSNUM is null");
            return (Criteria) this;
        }

        public Criteria andProfworkersnumIsNotNull() {
            addCriterion("CEQ_PROFWORKERSNUM is not null");
            return (Criteria) this;
        }

        public Criteria andProfworkersnumEqualTo(String value) {
            addCriterion("CEQ_PROFWORKERSNUM =", value, "profworkersnum");
            return (Criteria) this;
        }

        public Criteria andProfworkersnumNotEqualTo(String value) {
            addCriterion("CEQ_PROFWORKERSNUM <>", value, "profworkersnum");
            return (Criteria) this;
        }

        public Criteria andProfworkersnumGreaterThan(String value) {
            addCriterion("CEQ_PROFWORKERSNUM >", value, "profworkersnum");
            return (Criteria) this;
        }

        public Criteria andProfworkersnumGreaterThanOrEqualTo(String value) {
            addCriterion("CEQ_PROFWORKERSNUM >=", value, "profworkersnum");
            return (Criteria) this;
        }

        public Criteria andProfworkersnumLessThan(String value) {
            addCriterion("CEQ_PROFWORKERSNUM <", value, "profworkersnum");
            return (Criteria) this;
        }

        public Criteria andProfworkersnumLessThanOrEqualTo(String value) {
            addCriterion("CEQ_PROFWORKERSNUM <=", value, "profworkersnum");
            return (Criteria) this;
        }

        public Criteria andProfworkersnumLike(String value) {
            addCriterion("CEQ_PROFWORKERSNUM like", value, "profworkersnum");
            return (Criteria) this;
        }

        public Criteria andProfworkersnumNotLike(String value) {
            addCriterion("CEQ_PROFWORKERSNUM not like", value, "profworkersnum");
            return (Criteria) this;
        }

        public Criteria andProfworkersnumIn(List<String> values) {
            addCriterion("CEQ_PROFWORKERSNUM in", values, "profworkersnum");
            return (Criteria) this;
        }

        public Criteria andProfworkersnumNotIn(List<String> values) {
            addCriterion("CEQ_PROFWORKERSNUM not in", values, "profworkersnum");
            return (Criteria) this;
        }

        public Criteria andProfworkersnumBetween(String value1, String value2) {
            addCriterion("CEQ_PROFWORKERSNUM between", value1, value2, "profworkersnum");
            return (Criteria) this;
        }

        public Criteria andProfworkersnumNotBetween(String value1, String value2) {
            addCriterion("CEQ_PROFWORKERSNUM not between", value1, value2, "profworkersnum");
            return (Criteria) this;
        }

        public Criteria andFountdateIsNull() {
            addCriterion("CEQ_FOUNTDATE is null");
            return (Criteria) this;
        }

        public Criteria andFountdateIsNotNull() {
            addCriterion("CEQ_FOUNTDATE is not null");
            return (Criteria) this;
        }

        public Criteria andFountdateEqualTo(String value) {
            addCriterion("CEQ_FOUNTDATE =", value, "fountdate");
            return (Criteria) this;
        }

        public Criteria andFountdateNotEqualTo(String value) {
            addCriterion("CEQ_FOUNTDATE <>", value, "fountdate");
            return (Criteria) this;
        }

        public Criteria andFountdateGreaterThan(String value) {
            addCriterion("CEQ_FOUNTDATE >", value, "fountdate");
            return (Criteria) this;
        }

        public Criteria andFountdateGreaterThanOrEqualTo(String value) {
            addCriterion("CEQ_FOUNTDATE >=", value, "fountdate");
            return (Criteria) this;
        }

        public Criteria andFountdateLessThan(String value) {
            addCriterion("CEQ_FOUNTDATE <", value, "fountdate");
            return (Criteria) this;
        }

        public Criteria andFountdateLessThanOrEqualTo(String value) {
            addCriterion("CEQ_FOUNTDATE <=", value, "fountdate");
            return (Criteria) this;
        }

        public Criteria andFountdateLike(String value) {
            addCriterion("CEQ_FOUNTDATE like", value, "fountdate");
            return (Criteria) this;
        }

        public Criteria andFountdateNotLike(String value) {
            addCriterion("CEQ_FOUNTDATE not like", value, "fountdate");
            return (Criteria) this;
        }

        public Criteria andFountdateIn(List<String> values) {
            addCriterion("CEQ_FOUNTDATE in", values, "fountdate");
            return (Criteria) this;
        }

        public Criteria andFountdateNotIn(List<String> values) {
            addCriterion("CEQ_FOUNTDATE not in", values, "fountdate");
            return (Criteria) this;
        }

        public Criteria andFountdateBetween(String value1, String value2) {
            addCriterion("CEQ_FOUNTDATE between", value1, value2, "fountdate");
            return (Criteria) this;
        }

        public Criteria andFountdateNotBetween(String value1, String value2) {
            addCriterion("CEQ_FOUNTDATE not between", value1, value2, "fountdate");
            return (Criteria) this;
        }

        public Criteria andAccepttimeIsNull() {
            addCriterion("CEQ_ACCEPTTIME is null");
            return (Criteria) this;
        }

        public Criteria andAccepttimeIsNotNull() {
            addCriterion("CEQ_ACCEPTTIME is not null");
            return (Criteria) this;
        }

        public Criteria andAccepttimeEqualTo(String value) {
            addCriterion("CEQ_ACCEPTTIME =", value, "accepttime");
            return (Criteria) this;
        }

        public Criteria andAccepttimeNotEqualTo(String value) {
            addCriterion("CEQ_ACCEPTTIME <>", value, "accepttime");
            return (Criteria) this;
        }

        public Criteria andAccepttimeGreaterThan(String value) {
            addCriterion("CEQ_ACCEPTTIME >", value, "accepttime");
            return (Criteria) this;
        }

        public Criteria andAccepttimeGreaterThanOrEqualTo(String value) {
            addCriterion("CEQ_ACCEPTTIME >=", value, "accepttime");
            return (Criteria) this;
        }

        public Criteria andAccepttimeLessThan(String value) {
            addCriterion("CEQ_ACCEPTTIME <", value, "accepttime");
            return (Criteria) this;
        }

        public Criteria andAccepttimeLessThanOrEqualTo(String value) {
            addCriterion("CEQ_ACCEPTTIME <=", value, "accepttime");
            return (Criteria) this;
        }

        public Criteria andAccepttimeLike(String value) {
            addCriterion("CEQ_ACCEPTTIME like", value, "accepttime");
            return (Criteria) this;
        }

        public Criteria andAccepttimeNotLike(String value) {
            addCriterion("CEQ_ACCEPTTIME not like", value, "accepttime");
            return (Criteria) this;
        }

        public Criteria andAccepttimeIn(List<String> values) {
            addCriterion("CEQ_ACCEPTTIME in", values, "accepttime");
            return (Criteria) this;
        }

        public Criteria andAccepttimeNotIn(List<String> values) {
            addCriterion("CEQ_ACCEPTTIME not in", values, "accepttime");
            return (Criteria) this;
        }

        public Criteria andAccepttimeBetween(String value1, String value2) {
            addCriterion("CEQ_ACCEPTTIME between", value1, value2, "accepttime");
            return (Criteria) this;
        }

        public Criteria andAccepttimeNotBetween(String value1, String value2) {
            addCriterion("CEQ_ACCEPTTIME not between", value1, value2, "accepttime");
            return (Criteria) this;
        }

        public Criteria andApprovaltimeIsNull() {
            addCriterion("CEQ_APPROVALTIME is null");
            return (Criteria) this;
        }

        public Criteria andApprovaltimeIsNotNull() {
            addCriterion("CEQ_APPROVALTIME is not null");
            return (Criteria) this;
        }

        public Criteria andApprovaltimeEqualTo(String value) {
            addCriterion("CEQ_APPROVALTIME =", value, "approvaltime");
            return (Criteria) this;
        }

        public Criteria andApprovaltimeNotEqualTo(String value) {
            addCriterion("CEQ_APPROVALTIME <>", value, "approvaltime");
            return (Criteria) this;
        }

        public Criteria andApprovaltimeGreaterThan(String value) {
            addCriterion("CEQ_APPROVALTIME >", value, "approvaltime");
            return (Criteria) this;
        }

        public Criteria andApprovaltimeGreaterThanOrEqualTo(String value) {
            addCriterion("CEQ_APPROVALTIME >=", value, "approvaltime");
            return (Criteria) this;
        }

        public Criteria andApprovaltimeLessThan(String value) {
            addCriterion("CEQ_APPROVALTIME <", value, "approvaltime");
            return (Criteria) this;
        }

        public Criteria andApprovaltimeLessThanOrEqualTo(String value) {
            addCriterion("CEQ_APPROVALTIME <=", value, "approvaltime");
            return (Criteria) this;
        }

        public Criteria andApprovaltimeLike(String value) {
            addCriterion("CEQ_APPROVALTIME like", value, "approvaltime");
            return (Criteria) this;
        }

        public Criteria andApprovaltimeNotLike(String value) {
            addCriterion("CEQ_APPROVALTIME not like", value, "approvaltime");
            return (Criteria) this;
        }

        public Criteria andApprovaltimeIn(List<String> values) {
            addCriterion("CEQ_APPROVALTIME in", values, "approvaltime");
            return (Criteria) this;
        }

        public Criteria andApprovaltimeNotIn(List<String> values) {
            addCriterion("CEQ_APPROVALTIME not in", values, "approvaltime");
            return (Criteria) this;
        }

        public Criteria andApprovaltimeBetween(String value1, String value2) {
            addCriterion("CEQ_APPROVALTIME between", value1, value2, "approvaltime");
            return (Criteria) this;
        }

        public Criteria andApprovaltimeNotBetween(String value1, String value2) {
            addCriterion("CEQ_APPROVALTIME not between", value1, value2, "approvaltime");
            return (Criteria) this;
        }

        public Criteria andEntpostnumIsNull() {
            addCriterion("CEQ_ENTPOSTNUM is null");
            return (Criteria) this;
        }

        public Criteria andEntpostnumIsNotNull() {
            addCriterion("CEQ_ENTPOSTNUM is not null");
            return (Criteria) this;
        }

        public Criteria andEntpostnumEqualTo(String value) {
            addCriterion("CEQ_ENTPOSTNUM =", value, "entpostnum");
            return (Criteria) this;
        }

        public Criteria andEntpostnumNotEqualTo(String value) {
            addCriterion("CEQ_ENTPOSTNUM <>", value, "entpostnum");
            return (Criteria) this;
        }

        public Criteria andEntpostnumGreaterThan(String value) {
            addCriterion("CEQ_ENTPOSTNUM >", value, "entpostnum");
            return (Criteria) this;
        }

        public Criteria andEntpostnumGreaterThanOrEqualTo(String value) {
            addCriterion("CEQ_ENTPOSTNUM >=", value, "entpostnum");
            return (Criteria) this;
        }

        public Criteria andEntpostnumLessThan(String value) {
            addCriterion("CEQ_ENTPOSTNUM <", value, "entpostnum");
            return (Criteria) this;
        }

        public Criteria andEntpostnumLessThanOrEqualTo(String value) {
            addCriterion("CEQ_ENTPOSTNUM <=", value, "entpostnum");
            return (Criteria) this;
        }

        public Criteria andEntpostnumLike(String value) {
            addCriterion("CEQ_ENTPOSTNUM like", value, "entpostnum");
            return (Criteria) this;
        }

        public Criteria andEntpostnumNotLike(String value) {
            addCriterion("CEQ_ENTPOSTNUM not like", value, "entpostnum");
            return (Criteria) this;
        }

        public Criteria andEntpostnumIn(List<String> values) {
            addCriterion("CEQ_ENTPOSTNUM in", values, "entpostnum");
            return (Criteria) this;
        }

        public Criteria andEntpostnumNotIn(List<String> values) {
            addCriterion("CEQ_ENTPOSTNUM not in", values, "entpostnum");
            return (Criteria) this;
        }

        public Criteria andEntpostnumBetween(String value1, String value2) {
            addCriterion("CEQ_ENTPOSTNUM between", value1, value2, "entpostnum");
            return (Criteria) this;
        }

        public Criteria andEntpostnumNotBetween(String value1, String value2) {
            addCriterion("CEQ_ENTPOSTNUM not between", value1, value2, "entpostnum");
            return (Criteria) this;
        }

        public Criteria andEntemailIsNull() {
            addCriterion("CEQ_ENTEMAIL is null");
            return (Criteria) this;
        }

        public Criteria andEntemailIsNotNull() {
            addCriterion("CEQ_ENTEMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEntemailEqualTo(String value) {
            addCriterion("CEQ_ENTEMAIL =", value, "entemail");
            return (Criteria) this;
        }

        public Criteria andEntemailNotEqualTo(String value) {
            addCriterion("CEQ_ENTEMAIL <>", value, "entemail");
            return (Criteria) this;
        }

        public Criteria andEntemailGreaterThan(String value) {
            addCriterion("CEQ_ENTEMAIL >", value, "entemail");
            return (Criteria) this;
        }

        public Criteria andEntemailGreaterThanOrEqualTo(String value) {
            addCriterion("CEQ_ENTEMAIL >=", value, "entemail");
            return (Criteria) this;
        }

        public Criteria andEntemailLessThan(String value) {
            addCriterion("CEQ_ENTEMAIL <", value, "entemail");
            return (Criteria) this;
        }

        public Criteria andEntemailLessThanOrEqualTo(String value) {
            addCriterion("CEQ_ENTEMAIL <=", value, "entemail");
            return (Criteria) this;
        }

        public Criteria andEntemailLike(String value) {
            addCriterion("CEQ_ENTEMAIL like", value, "entemail");
            return (Criteria) this;
        }

        public Criteria andEntemailNotLike(String value) {
            addCriterion("CEQ_ENTEMAIL not like", value, "entemail");
            return (Criteria) this;
        }

        public Criteria andEntemailIn(List<String> values) {
            addCriterion("CEQ_ENTEMAIL in", values, "entemail");
            return (Criteria) this;
        }

        public Criteria andEntemailNotIn(List<String> values) {
            addCriterion("CEQ_ENTEMAIL not in", values, "entemail");
            return (Criteria) this;
        }

        public Criteria andEntemailBetween(String value1, String value2) {
            addCriterion("CEQ_ENTEMAIL between", value1, value2, "entemail");
            return (Criteria) this;
        }

        public Criteria andEntemailNotBetween(String value1, String value2) {
            addCriterion("CEQ_ENTEMAIL not between", value1, value2, "entemail");
            return (Criteria) this;
        }

        public Criteria andEntlevelIsNull() {
            addCriterion("CEQ_ENTLEVEL is null");
            return (Criteria) this;
        }

        public Criteria andEntlevelIsNotNull() {
            addCriterion("CEQ_ENTLEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andEntlevelEqualTo(String value) {
            addCriterion("CEQ_ENTLEVEL =", value, "entlevel");
            return (Criteria) this;
        }

        public Criteria andEntlevelNotEqualTo(String value) {
            addCriterion("CEQ_ENTLEVEL <>", value, "entlevel");
            return (Criteria) this;
        }

        public Criteria andEntlevelGreaterThan(String value) {
            addCriterion("CEQ_ENTLEVEL >", value, "entlevel");
            return (Criteria) this;
        }

        public Criteria andEntlevelGreaterThanOrEqualTo(String value) {
            addCriterion("CEQ_ENTLEVEL >=", value, "entlevel");
            return (Criteria) this;
        }

        public Criteria andEntlevelLessThan(String value) {
            addCriterion("CEQ_ENTLEVEL <", value, "entlevel");
            return (Criteria) this;
        }

        public Criteria andEntlevelLessThanOrEqualTo(String value) {
            addCriterion("CEQ_ENTLEVEL <=", value, "entlevel");
            return (Criteria) this;
        }

        public Criteria andEntlevelLike(String value) {
            addCriterion("CEQ_ENTLEVEL like", value, "entlevel");
            return (Criteria) this;
        }

        public Criteria andEntlevelNotLike(String value) {
            addCriterion("CEQ_ENTLEVEL not like", value, "entlevel");
            return (Criteria) this;
        }

        public Criteria andEntlevelIn(List<String> values) {
            addCriterion("CEQ_ENTLEVEL in", values, "entlevel");
            return (Criteria) this;
        }

        public Criteria andEntlevelNotIn(List<String> values) {
            addCriterion("CEQ_ENTLEVEL not in", values, "entlevel");
            return (Criteria) this;
        }

        public Criteria andEntlevelBetween(String value1, String value2) {
            addCriterion("CEQ_ENTLEVEL between", value1, value2, "entlevel");
            return (Criteria) this;
        }

        public Criteria andEntlevelNotBetween(String value1, String value2) {
            addCriterion("CEQ_ENTLEVEL not between", value1, value2, "entlevel");
            return (Criteria) this;
        }

        public Criteria andIdLikeInsensitive(String value) {
            addCriterion("upper(CEQ_ID) like", value.toUpperCase(), "id");
            return (Criteria) this;
        }

        public Criteria andPidLikeInsensitive(String value) {
            addCriterion("upper(CEQ_PID) like", value.toUpperCase(), "pid");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLikeInsensitive(String value) {
            addCriterion("upper(CEQ_CREATETIME) like", value.toUpperCase(), "createtime");
            return (Criteria) this;
        }

        public Criteria andEntareaLikeInsensitive(String value) {
            addCriterion("upper(CEQ_ENTAREA) like", value.toUpperCase(), "entarea");
            return (Criteria) this;
        }

        public Criteria andRegistcapitalLikeInsensitive(String value) {
            addCriterion("upper(CEQ_REGISTCAPITAL) like", value.toUpperCase(), "registcapital");
            return (Criteria) this;
        }

        public Criteria andProfworkersnumLikeInsensitive(String value) {
            addCriterion("upper(CEQ_PROFWORKERSNUM) like", value.toUpperCase(), "profworkersnum");
            return (Criteria) this;
        }

        public Criteria andFountdateLikeInsensitive(String value) {
            addCriterion("upper(CEQ_FOUNTDATE) like", value.toUpperCase(), "fountdate");
            return (Criteria) this;
        }

        public Criteria andAccepttimeLikeInsensitive(String value) {
            addCriterion("upper(CEQ_ACCEPTTIME) like", value.toUpperCase(), "accepttime");
            return (Criteria) this;
        }

        public Criteria andApprovaltimeLikeInsensitive(String value) {
            addCriterion("upper(CEQ_APPROVALTIME) like", value.toUpperCase(), "approvaltime");
            return (Criteria) this;
        }

        public Criteria andEntpostnumLikeInsensitive(String value) {
            addCriterion("upper(CEQ_ENTPOSTNUM) like", value.toUpperCase(), "entpostnum");
            return (Criteria) this;
        }

        public Criteria andEntemailLikeInsensitive(String value) {
            addCriterion("upper(CEQ_ENTEMAIL) like", value.toUpperCase(), "entemail");
            return (Criteria) this;
        }

        public Criteria andEntlevelLikeInsensitive(String value) {
            addCriterion("upper(CEQ_ENTLEVEL) like", value.toUpperCase(), "entlevel");
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