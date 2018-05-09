package com.chinasofti.domain;

import com.limp.framework.core.bean.Pager;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EntInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Pager page;

    public EntInfoExample() {
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

        public Criteria andUidIsNull() {
            addCriterion("CE_UID is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("CE_UID is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(String value) {
            addCriterion("CE_UID =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(String value) {
            addCriterion("CE_UID <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(String value) {
            addCriterion("CE_UID >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(String value) {
            addCriterion("CE_UID >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(String value) {
            addCriterion("CE_UID <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(String value) {
            addCriterion("CE_UID <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLike(String value) {
            addCriterion("CE_UID like", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotLike(String value) {
            addCriterion("CE_UID not like", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<String> values) {
            addCriterion("CE_UID in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<String> values) {
            addCriterion("CE_UID not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(String value1, String value2) {
            addCriterion("CE_UID between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(String value1, String value2) {
            addCriterion("CE_UID not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andPidIsNull() {
            addCriterion("CE_PID is null");
            return (Criteria) this;
        }

        public Criteria andPidIsNotNull() {
            addCriterion("CE_PID is not null");
            return (Criteria) this;
        }

        public Criteria andPidEqualTo(String value) {
            addCriterion("CE_PID =", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotEqualTo(String value) {
            addCriterion("CE_PID <>", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThan(String value) {
            addCriterion("CE_PID >", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThanOrEqualTo(String value) {
            addCriterion("CE_PID >=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThan(String value) {
            addCriterion("CE_PID <", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThanOrEqualTo(String value) {
            addCriterion("CE_PID <=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLike(String value) {
            addCriterion("CE_PID like", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotLike(String value) {
            addCriterion("CE_PID not like", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidIn(List<String> values) {
            addCriterion("CE_PID in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotIn(List<String> values) {
            addCriterion("CE_PID not in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidBetween(String value1, String value2) {
            addCriterion("CE_PID between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotBetween(String value1, String value2) {
            addCriterion("CE_PID not between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andEntnameIsNull() {
            addCriterion("CE_ENTNAME is null");
            return (Criteria) this;
        }

        public Criteria andEntnameIsNotNull() {
            addCriterion("CE_ENTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andEntnameEqualTo(String value) {
            addCriterion("CE_ENTNAME =", value, "entname");
            return (Criteria) this;
        }

        public Criteria andEntnameNotEqualTo(String value) {
            addCriterion("CE_ENTNAME <>", value, "entname");
            return (Criteria) this;
        }

        public Criteria andEntnameGreaterThan(String value) {
            addCriterion("CE_ENTNAME >", value, "entname");
            return (Criteria) this;
        }

        public Criteria andEntnameGreaterThanOrEqualTo(String value) {
            addCriterion("CE_ENTNAME >=", value, "entname");
            return (Criteria) this;
        }

        public Criteria andEntnameLessThan(String value) {
            addCriterion("CE_ENTNAME <", value, "entname");
            return (Criteria) this;
        }

        public Criteria andEntnameLessThanOrEqualTo(String value) {
            addCriterion("CE_ENTNAME <=", value, "entname");
            return (Criteria) this;
        }

        public Criteria andEntnameLike(String value) {
            addCriterion("CE_ENTNAME like", value, "entname");
            return (Criteria) this;
        }

        public Criteria andEntnameNotLike(String value) {
            addCriterion("CE_ENTNAME not like", value, "entname");
            return (Criteria) this;
        }

        public Criteria andEntnameIn(List<String> values) {
            addCriterion("CE_ENTNAME in", values, "entname");
            return (Criteria) this;
        }

        public Criteria andEntnameNotIn(List<String> values) {
            addCriterion("CE_ENTNAME not in", values, "entname");
            return (Criteria) this;
        }

        public Criteria andEntnameBetween(String value1, String value2) {
            addCriterion("CE_ENTNAME between", value1, value2, "entname");
            return (Criteria) this;
        }

        public Criteria andEntnameNotBetween(String value1, String value2) {
            addCriterion("CE_ENTNAME not between", value1, value2, "entname");
            return (Criteria) this;
        }

        public Criteria andRegistnumIsNull() {
            addCriterion("CE_REGISTNUM is null");
            return (Criteria) this;
        }

        public Criteria andRegistnumIsNotNull() {
            addCriterion("CE_REGISTNUM is not null");
            return (Criteria) this;
        }

        public Criteria andRegistnumEqualTo(String value) {
            addCriterion("CE_REGISTNUM =", value, "registnum");
            return (Criteria) this;
        }

        public Criteria andRegistnumNotEqualTo(String value) {
            addCriterion("CE_REGISTNUM <>", value, "registnum");
            return (Criteria) this;
        }

        public Criteria andRegistnumGreaterThan(String value) {
            addCriterion("CE_REGISTNUM >", value, "registnum");
            return (Criteria) this;
        }

        public Criteria andRegistnumGreaterThanOrEqualTo(String value) {
            addCriterion("CE_REGISTNUM >=", value, "registnum");
            return (Criteria) this;
        }

        public Criteria andRegistnumLessThan(String value) {
            addCriterion("CE_REGISTNUM <", value, "registnum");
            return (Criteria) this;
        }

        public Criteria andRegistnumLessThanOrEqualTo(String value) {
            addCriterion("CE_REGISTNUM <=", value, "registnum");
            return (Criteria) this;
        }

        public Criteria andRegistnumLike(String value) {
            addCriterion("CE_REGISTNUM like", value, "registnum");
            return (Criteria) this;
        }

        public Criteria andRegistnumNotLike(String value) {
            addCriterion("CE_REGISTNUM not like", value, "registnum");
            return (Criteria) this;
        }

        public Criteria andRegistnumIn(List<String> values) {
            addCriterion("CE_REGISTNUM in", values, "registnum");
            return (Criteria) this;
        }

        public Criteria andRegistnumNotIn(List<String> values) {
            addCriterion("CE_REGISTNUM not in", values, "registnum");
            return (Criteria) this;
        }

        public Criteria andRegistnumBetween(String value1, String value2) {
            addCriterion("CE_REGISTNUM between", value1, value2, "registnum");
            return (Criteria) this;
        }

        public Criteria andRegistnumNotBetween(String value1, String value2) {
            addCriterion("CE_REGISTNUM not between", value1, value2, "registnum");
            return (Criteria) this;
        }

        public Criteria andLegalIsNull() {
            addCriterion("CE_LEGAL is null");
            return (Criteria) this;
        }

        public Criteria andLegalIsNotNull() {
            addCriterion("CE_LEGAL is not null");
            return (Criteria) this;
        }

        public Criteria andLegalEqualTo(String value) {
            addCriterion("CE_LEGAL =", value, "legal");
            return (Criteria) this;
        }

        public Criteria andLegalNotEqualTo(String value) {
            addCriterion("CE_LEGAL <>", value, "legal");
            return (Criteria) this;
        }

        public Criteria andLegalGreaterThan(String value) {
            addCriterion("CE_LEGAL >", value, "legal");
            return (Criteria) this;
        }

        public Criteria andLegalGreaterThanOrEqualTo(String value) {
            addCriterion("CE_LEGAL >=", value, "legal");
            return (Criteria) this;
        }

        public Criteria andLegalLessThan(String value) {
            addCriterion("CE_LEGAL <", value, "legal");
            return (Criteria) this;
        }

        public Criteria andLegalLessThanOrEqualTo(String value) {
            addCriterion("CE_LEGAL <=", value, "legal");
            return (Criteria) this;
        }

        public Criteria andLegalLike(String value) {
            addCriterion("CE_LEGAL like", value, "legal");
            return (Criteria) this;
        }

        public Criteria andLegalNotLike(String value) {
            addCriterion("CE_LEGAL not like", value, "legal");
            return (Criteria) this;
        }

        public Criteria andLegalIn(List<String> values) {
            addCriterion("CE_LEGAL in", values, "legal");
            return (Criteria) this;
        }

        public Criteria andLegalNotIn(List<String> values) {
            addCriterion("CE_LEGAL not in", values, "legal");
            return (Criteria) this;
        }

        public Criteria andLegalBetween(String value1, String value2) {
            addCriterion("CE_LEGAL between", value1, value2, "legal");
            return (Criteria) this;
        }

        public Criteria andLegalNotBetween(String value1, String value2) {
            addCriterion("CE_LEGAL not between", value1, value2, "legal");
            return (Criteria) this;
        }

        public Criteria andRegcapitalIsNull() {
            addCriterion("CE_REGCAPITAL is null");
            return (Criteria) this;
        }

        public Criteria andRegcapitalIsNotNull() {
            addCriterion("CE_REGCAPITAL is not null");
            return (Criteria) this;
        }

        public Criteria andRegcapitalEqualTo(String value) {
            addCriterion("CE_REGCAPITAL =", value, "regcapital");
            return (Criteria) this;
        }

        public Criteria andRegcapitalNotEqualTo(String value) {
            addCriterion("CE_REGCAPITAL <>", value, "regcapital");
            return (Criteria) this;
        }

        public Criteria andRegcapitalGreaterThan(String value) {
            addCriterion("CE_REGCAPITAL >", value, "regcapital");
            return (Criteria) this;
        }

        public Criteria andRegcapitalGreaterThanOrEqualTo(String value) {
            addCriterion("CE_REGCAPITAL >=", value, "regcapital");
            return (Criteria) this;
        }

        public Criteria andRegcapitalLessThan(String value) {
            addCriterion("CE_REGCAPITAL <", value, "regcapital");
            return (Criteria) this;
        }

        public Criteria andRegcapitalLessThanOrEqualTo(String value) {
            addCriterion("CE_REGCAPITAL <=", value, "regcapital");
            return (Criteria) this;
        }

        public Criteria andRegcapitalLike(String value) {
            addCriterion("CE_REGCAPITAL like", value, "regcapital");
            return (Criteria) this;
        }

        public Criteria andRegcapitalNotLike(String value) {
            addCriterion("CE_REGCAPITAL not like", value, "regcapital");
            return (Criteria) this;
        }

        public Criteria andRegcapitalIn(List<String> values) {
            addCriterion("CE_REGCAPITAL in", values, "regcapital");
            return (Criteria) this;
        }

        public Criteria andRegcapitalNotIn(List<String> values) {
            addCriterion("CE_REGCAPITAL not in", values, "regcapital");
            return (Criteria) this;
        }

        public Criteria andRegcapitalBetween(String value1, String value2) {
            addCriterion("CE_REGCAPITAL between", value1, value2, "regcapital");
            return (Criteria) this;
        }

        public Criteria andRegcapitalNotBetween(String value1, String value2) {
            addCriterion("CE_REGCAPITAL not between", value1, value2, "regcapital");
            return (Criteria) this;
        }

        public Criteria andCreditcodeIsNull() {
            addCriterion("CE_CREDITCODE is null");
            return (Criteria) this;
        }

        public Criteria andCreditcodeIsNotNull() {
            addCriterion("CE_CREDITCODE is not null");
            return (Criteria) this;
        }

        public Criteria andCreditcodeEqualTo(String value) {
            addCriterion("CE_CREDITCODE =", value, "creditcode");
            return (Criteria) this;
        }

        public Criteria andCreditcodeNotEqualTo(String value) {
            addCriterion("CE_CREDITCODE <>", value, "creditcode");
            return (Criteria) this;
        }

        public Criteria andCreditcodeGreaterThan(String value) {
            addCriterion("CE_CREDITCODE >", value, "creditcode");
            return (Criteria) this;
        }

        public Criteria andCreditcodeGreaterThanOrEqualTo(String value) {
            addCriterion("CE_CREDITCODE >=", value, "creditcode");
            return (Criteria) this;
        }

        public Criteria andCreditcodeLessThan(String value) {
            addCriterion("CE_CREDITCODE <", value, "creditcode");
            return (Criteria) this;
        }

        public Criteria andCreditcodeLessThanOrEqualTo(String value) {
            addCriterion("CE_CREDITCODE <=", value, "creditcode");
            return (Criteria) this;
        }

        public Criteria andCreditcodeLike(String value) {
            addCriterion("CE_CREDITCODE like", value, "creditcode");
            return (Criteria) this;
        }

        public Criteria andCreditcodeNotLike(String value) {
            addCriterion("CE_CREDITCODE not like", value, "creditcode");
            return (Criteria) this;
        }

        public Criteria andCreditcodeIn(List<String> values) {
            addCriterion("CE_CREDITCODE in", values, "creditcode");
            return (Criteria) this;
        }

        public Criteria andCreditcodeNotIn(List<String> values) {
            addCriterion("CE_CREDITCODE not in", values, "creditcode");
            return (Criteria) this;
        }

        public Criteria andCreditcodeBetween(String value1, String value2) {
            addCriterion("CE_CREDITCODE between", value1, value2, "creditcode");
            return (Criteria) this;
        }

        public Criteria andCreditcodeNotBetween(String value1, String value2) {
            addCriterion("CE_CREDITCODE not between", value1, value2, "creditcode");
            return (Criteria) this;
        }

        public Criteria andBusinesstermIsNull() {
            addCriterion("CE_BUSINESSTERM is null");
            return (Criteria) this;
        }

        public Criteria andBusinesstermIsNotNull() {
            addCriterion("CE_BUSINESSTERM is not null");
            return (Criteria) this;
        }

        public Criteria andBusinesstermEqualTo(String value) {
            addCriterion("CE_BUSINESSTERM =", value, "businessterm");
            return (Criteria) this;
        }

        public Criteria andBusinesstermNotEqualTo(String value) {
            addCriterion("CE_BUSINESSTERM <>", value, "businessterm");
            return (Criteria) this;
        }

        public Criteria andBusinesstermGreaterThan(String value) {
            addCriterion("CE_BUSINESSTERM >", value, "businessterm");
            return (Criteria) this;
        }

        public Criteria andBusinesstermGreaterThanOrEqualTo(String value) {
            addCriterion("CE_BUSINESSTERM >=", value, "businessterm");
            return (Criteria) this;
        }

        public Criteria andBusinesstermLessThan(String value) {
            addCriterion("CE_BUSINESSTERM <", value, "businessterm");
            return (Criteria) this;
        }

        public Criteria andBusinesstermLessThanOrEqualTo(String value) {
            addCriterion("CE_BUSINESSTERM <=", value, "businessterm");
            return (Criteria) this;
        }

        public Criteria andBusinesstermLike(String value) {
            addCriterion("CE_BUSINESSTERM like", value, "businessterm");
            return (Criteria) this;
        }

        public Criteria andBusinesstermNotLike(String value) {
            addCriterion("CE_BUSINESSTERM not like", value, "businessterm");
            return (Criteria) this;
        }

        public Criteria andBusinesstermIn(List<String> values) {
            addCriterion("CE_BUSINESSTERM in", values, "businessterm");
            return (Criteria) this;
        }

        public Criteria andBusinesstermNotIn(List<String> values) {
            addCriterion("CE_BUSINESSTERM not in", values, "businessterm");
            return (Criteria) this;
        }

        public Criteria andBusinesstermBetween(String value1, String value2) {
            addCriterion("CE_BUSINESSTERM between", value1, value2, "businessterm");
            return (Criteria) this;
        }

        public Criteria andBusinesstermNotBetween(String value1, String value2) {
            addCriterion("CE_BUSINESSTERM not between", value1, value2, "businessterm");
            return (Criteria) this;
        }

        public Criteria andEnttypeIsNull() {
            addCriterion("CE_ENTTYPE is null");
            return (Criteria) this;
        }

        public Criteria andEnttypeIsNotNull() {
            addCriterion("CE_ENTTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andEnttypeEqualTo(String value) {
            addCriterion("CE_ENTTYPE =", value, "enttype");
            return (Criteria) this;
        }

        public Criteria andEnttypeNotEqualTo(String value) {
            addCriterion("CE_ENTTYPE <>", value, "enttype");
            return (Criteria) this;
        }

        public Criteria andEnttypeGreaterThan(String value) {
            addCriterion("CE_ENTTYPE >", value, "enttype");
            return (Criteria) this;
        }

        public Criteria andEnttypeGreaterThanOrEqualTo(String value) {
            addCriterion("CE_ENTTYPE >=", value, "enttype");
            return (Criteria) this;
        }

        public Criteria andEnttypeLessThan(String value) {
            addCriterion("CE_ENTTYPE <", value, "enttype");
            return (Criteria) this;
        }

        public Criteria andEnttypeLessThanOrEqualTo(String value) {
            addCriterion("CE_ENTTYPE <=", value, "enttype");
            return (Criteria) this;
        }

        public Criteria andEnttypeLike(String value) {
            addCriterion("CE_ENTTYPE like", value, "enttype");
            return (Criteria) this;
        }

        public Criteria andEnttypeNotLike(String value) {
            addCriterion("CE_ENTTYPE not like", value, "enttype");
            return (Criteria) this;
        }

        public Criteria andEnttypeIn(List<String> values) {
            addCriterion("CE_ENTTYPE in", values, "enttype");
            return (Criteria) this;
        }

        public Criteria andEnttypeNotIn(List<String> values) {
            addCriterion("CE_ENTTYPE not in", values, "enttype");
            return (Criteria) this;
        }

        public Criteria andEnttypeBetween(String value1, String value2) {
            addCriterion("CE_ENTTYPE between", value1, value2, "enttype");
            return (Criteria) this;
        }

        public Criteria andEnttypeNotBetween(String value1, String value2) {
            addCriterion("CE_ENTTYPE not between", value1, value2, "enttype");
            return (Criteria) this;
        }

        public Criteria andRegofficeIsNull() {
            addCriterion("CE_REGOFFICE is null");
            return (Criteria) this;
        }

        public Criteria andRegofficeIsNotNull() {
            addCriterion("CE_REGOFFICE is not null");
            return (Criteria) this;
        }

        public Criteria andRegofficeEqualTo(String value) {
            addCriterion("CE_REGOFFICE =", value, "regoffice");
            return (Criteria) this;
        }

        public Criteria andRegofficeNotEqualTo(String value) {
            addCriterion("CE_REGOFFICE <>", value, "regoffice");
            return (Criteria) this;
        }

        public Criteria andRegofficeGreaterThan(String value) {
            addCriterion("CE_REGOFFICE >", value, "regoffice");
            return (Criteria) this;
        }

        public Criteria andRegofficeGreaterThanOrEqualTo(String value) {
            addCriterion("CE_REGOFFICE >=", value, "regoffice");
            return (Criteria) this;
        }

        public Criteria andRegofficeLessThan(String value) {
            addCriterion("CE_REGOFFICE <", value, "regoffice");
            return (Criteria) this;
        }

        public Criteria andRegofficeLessThanOrEqualTo(String value) {
            addCriterion("CE_REGOFFICE <=", value, "regoffice");
            return (Criteria) this;
        }

        public Criteria andRegofficeLike(String value) {
            addCriterion("CE_REGOFFICE like", value, "regoffice");
            return (Criteria) this;
        }

        public Criteria andRegofficeNotLike(String value) {
            addCriterion("CE_REGOFFICE not like", value, "regoffice");
            return (Criteria) this;
        }

        public Criteria andRegofficeIn(List<String> values) {
            addCriterion("CE_REGOFFICE in", values, "regoffice");
            return (Criteria) this;
        }

        public Criteria andRegofficeNotIn(List<String> values) {
            addCriterion("CE_REGOFFICE not in", values, "regoffice");
            return (Criteria) this;
        }

        public Criteria andRegofficeBetween(String value1, String value2) {
            addCriterion("CE_REGOFFICE between", value1, value2, "regoffice");
            return (Criteria) this;
        }

        public Criteria andRegofficeNotBetween(String value1, String value2) {
            addCriterion("CE_REGOFFICE not between", value1, value2, "regoffice");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("CE_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("CE_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("CE_ADDRESS =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("CE_ADDRESS <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("CE_ADDRESS >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("CE_ADDRESS >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("CE_ADDRESS <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("CE_ADDRESS <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("CE_ADDRESS like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("CE_ADDRESS not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("CE_ADDRESS in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("CE_ADDRESS not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("CE_ADDRESS between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("CE_ADDRESS not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andTelIsNull() {
            addCriterion("CE_TEL is null");
            return (Criteria) this;
        }

        public Criteria andTelIsNotNull() {
            addCriterion("CE_TEL is not null");
            return (Criteria) this;
        }

        public Criteria andTelEqualTo(String value) {
            addCriterion("CE_TEL =", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotEqualTo(String value) {
            addCriterion("CE_TEL <>", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThan(String value) {
            addCriterion("CE_TEL >", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThanOrEqualTo(String value) {
            addCriterion("CE_TEL >=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThan(String value) {
            addCriterion("CE_TEL <", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThanOrEqualTo(String value) {
            addCriterion("CE_TEL <=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLike(String value) {
            addCriterion("CE_TEL like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotLike(String value) {
            addCriterion("CE_TEL not like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelIn(List<String> values) {
            addCriterion("CE_TEL in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotIn(List<String> values) {
            addCriterion("CE_TEL not in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelBetween(String value1, String value2) {
            addCriterion("CE_TEL between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotBetween(String value1, String value2) {
            addCriterion("CE_TEL not between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andScopeIsNull() {
            addCriterion("CE_SCOPE is null");
            return (Criteria) this;
        }

        public Criteria andScopeIsNotNull() {
            addCriterion("CE_SCOPE is not null");
            return (Criteria) this;
        }

        public Criteria andScopeEqualTo(String value) {
            addCriterion("CE_SCOPE =", value, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeNotEqualTo(String value) {
            addCriterion("CE_SCOPE <>", value, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeGreaterThan(String value) {
            addCriterion("CE_SCOPE >", value, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeGreaterThanOrEqualTo(String value) {
            addCriterion("CE_SCOPE >=", value, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeLessThan(String value) {
            addCriterion("CE_SCOPE <", value, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeLessThanOrEqualTo(String value) {
            addCriterion("CE_SCOPE <=", value, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeLike(String value) {
            addCriterion("CE_SCOPE like", value, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeNotLike(String value) {
            addCriterion("CE_SCOPE not like", value, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeIn(List<String> values) {
            addCriterion("CE_SCOPE in", values, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeNotIn(List<String> values) {
            addCriterion("CE_SCOPE not in", values, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeBetween(String value1, String value2) {
            addCriterion("CE_SCOPE between", value1, value2, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeNotBetween(String value1, String value2) {
            addCriterion("CE_SCOPE not between", value1, value2, "scope");
            return (Criteria) this;
        }

        public Criteria andEntcateIsNull() {
            addCriterion("CE_ENTCATE is null");
            return (Criteria) this;
        }

        public Criteria andEntcateIsNotNull() {
            addCriterion("CE_ENTCATE is not null");
            return (Criteria) this;
        }

        public Criteria andEntcateEqualTo(String value) {
            addCriterion("CE_ENTCATE =", value, "entcate");
            return (Criteria) this;
        }

        public Criteria andEntcateNotEqualTo(String value) {
            addCriterion("CE_ENTCATE <>", value, "entcate");
            return (Criteria) this;
        }

        public Criteria andEntcateGreaterThan(String value) {
            addCriterion("CE_ENTCATE >", value, "entcate");
            return (Criteria) this;
        }

        public Criteria andEntcateGreaterThanOrEqualTo(String value) {
            addCriterion("CE_ENTCATE >=", value, "entcate");
            return (Criteria) this;
        }

        public Criteria andEntcateLessThan(String value) {
            addCriterion("CE_ENTCATE <", value, "entcate");
            return (Criteria) this;
        }

        public Criteria andEntcateLessThanOrEqualTo(String value) {
            addCriterion("CE_ENTCATE <=", value, "entcate");
            return (Criteria) this;
        }

        public Criteria andEntcateLike(String value) {
            addCriterion("CE_ENTCATE like", value, "entcate");
            return (Criteria) this;
        }

        public Criteria andEntcateNotLike(String value) {
            addCriterion("CE_ENTCATE not like", value, "entcate");
            return (Criteria) this;
        }

        public Criteria andEntcateIn(List<String> values) {
            addCriterion("CE_ENTCATE in", values, "entcate");
            return (Criteria) this;
        }

        public Criteria andEntcateNotIn(List<String> values) {
            addCriterion("CE_ENTCATE not in", values, "entcate");
            return (Criteria) this;
        }

        public Criteria andEntcateBetween(String value1, String value2) {
            addCriterion("CE_ENTCATE between", value1, value2, "entcate");
            return (Criteria) this;
        }

        public Criteria andEntcateNotBetween(String value1, String value2) {
            addCriterion("CE_ENTCATE not between", value1, value2, "entcate");
            return (Criteria) this;
        }

        public Criteria andRc1IsNull() {
            addCriterion("CE_RC1 is null");
            return (Criteria) this;
        }

        public Criteria andRc1IsNotNull() {
            addCriterion("CE_RC1 is not null");
            return (Criteria) this;
        }

        public Criteria andRc1EqualTo(String value) {
            addCriterion("CE_RC1 =", value, "rc1");
            return (Criteria) this;
        }

        public Criteria andRc1NotEqualTo(String value) {
            addCriterion("CE_RC1 <>", value, "rc1");
            return (Criteria) this;
        }

        public Criteria andRc1GreaterThan(String value) {
            addCriterion("CE_RC1 >", value, "rc1");
            return (Criteria) this;
        }

        public Criteria andRc1GreaterThanOrEqualTo(String value) {
            addCriterion("CE_RC1 >=", value, "rc1");
            return (Criteria) this;
        }

        public Criteria andRc1LessThan(String value) {
            addCriterion("CE_RC1 <", value, "rc1");
            return (Criteria) this;
        }

        public Criteria andRc1LessThanOrEqualTo(String value) {
            addCriterion("CE_RC1 <=", value, "rc1");
            return (Criteria) this;
        }

        public Criteria andRc1Like(String value) {
            addCriterion("CE_RC1 like", value, "rc1");
            return (Criteria) this;
        }

        public Criteria andRc1NotLike(String value) {
            addCriterion("CE_RC1 not like", value, "rc1");
            return (Criteria) this;
        }

        public Criteria andRc1In(List<String> values) {
            addCriterion("CE_RC1 in", values, "rc1");
            return (Criteria) this;
        }

        public Criteria andRc1NotIn(List<String> values) {
            addCriterion("CE_RC1 not in", values, "rc1");
            return (Criteria) this;
        }

        public Criteria andRc1Between(String value1, String value2) {
            addCriterion("CE_RC1 between", value1, value2, "rc1");
            return (Criteria) this;
        }

        public Criteria andRc1NotBetween(String value1, String value2) {
            addCriterion("CE_RC1 not between", value1, value2, "rc1");
            return (Criteria) this;
        }

        public Criteria andRc2IsNull() {
            addCriterion("CE_RC2 is null");
            return (Criteria) this;
        }

        public Criteria andRc2IsNotNull() {
            addCriterion("CE_RC2 is not null");
            return (Criteria) this;
        }

        public Criteria andRc2EqualTo(String value) {
            addCriterion("CE_RC2 =", value, "rc2");
            return (Criteria) this;
        }

        public Criteria andRc2NotEqualTo(String value) {
            addCriterion("CE_RC2 <>", value, "rc2");
            return (Criteria) this;
        }

        public Criteria andRc2GreaterThan(String value) {
            addCriterion("CE_RC2 >", value, "rc2");
            return (Criteria) this;
        }

        public Criteria andRc2GreaterThanOrEqualTo(String value) {
            addCriterion("CE_RC2 >=", value, "rc2");
            return (Criteria) this;
        }

        public Criteria andRc2LessThan(String value) {
            addCriterion("CE_RC2 <", value, "rc2");
            return (Criteria) this;
        }

        public Criteria andRc2LessThanOrEqualTo(String value) {
            addCriterion("CE_RC2 <=", value, "rc2");
            return (Criteria) this;
        }

        public Criteria andRc2Like(String value) {
            addCriterion("CE_RC2 like", value, "rc2");
            return (Criteria) this;
        }

        public Criteria andRc2NotLike(String value) {
            addCriterion("CE_RC2 not like", value, "rc2");
            return (Criteria) this;
        }

        public Criteria andRc2In(List<String> values) {
            addCriterion("CE_RC2 in", values, "rc2");
            return (Criteria) this;
        }

        public Criteria andRc2NotIn(List<String> values) {
            addCriterion("CE_RC2 not in", values, "rc2");
            return (Criteria) this;
        }

        public Criteria andRc2Between(String value1, String value2) {
            addCriterion("CE_RC2 between", value1, value2, "rc2");
            return (Criteria) this;
        }

        public Criteria andRc2NotBetween(String value1, String value2) {
            addCriterion("CE_RC2 not between", value1, value2, "rc2");
            return (Criteria) this;
        }

        public Criteria andIdtIsNull() {
            addCriterion("CE_IDT is null");
            return (Criteria) this;
        }

        public Criteria andIdtIsNotNull() {
            addCriterion("CE_IDT is not null");
            return (Criteria) this;
        }

        public Criteria andIdtEqualTo(Object value) {
            addCriterion("CE_IDT =", value, "idt");
            return (Criteria) this;
        }

        public Criteria andIdtNotEqualTo(Object value) {
            addCriterion("CE_IDT <>", value, "idt");
            return (Criteria) this;
        }

        public Criteria andIdtGreaterThan(Object value) {
            addCriterion("CE_IDT >", value, "idt");
            return (Criteria) this;
        }

        public Criteria andIdtGreaterThanOrEqualTo(Object value) {
            addCriterion("CE_IDT >=", value, "idt");
            return (Criteria) this;
        }

        public Criteria andIdtLessThan(Object value) {
            addCriterion("CE_IDT <", value, "idt");
            return (Criteria) this;
        }

        public Criteria andIdtLessThanOrEqualTo(Object value) {
            addCriterion("CE_IDT <=", value, "idt");
            return (Criteria) this;
        }

        public Criteria andIdtIn(List<Object> values) {
            addCriterion("CE_IDT in", values, "idt");
            return (Criteria) this;
        }

        public Criteria andIdtNotIn(List<Object> values) {
            addCriterion("CE_IDT not in", values, "idt");
            return (Criteria) this;
        }

        public Criteria andIdtBetween(Object value1, Object value2) {
            addCriterion("CE_IDT between", value1, value2, "idt");
            return (Criteria) this;
        }

        public Criteria andIdtNotBetween(Object value1, Object value2) {
            addCriterion("CE_IDT not between", value1, value2, "idt");
            return (Criteria) this;
        }

        public Criteria andUdtIsNull() {
            addCriterion("CE_UDT is null");
            return (Criteria) this;
        }

        public Criteria andUdtIsNotNull() {
            addCriterion("CE_UDT is not null");
            return (Criteria) this;
        }

        public Criteria andUdtEqualTo(Object value) {
            addCriterion("CE_UDT =", value, "udt");
            return (Criteria) this;
        }

        public Criteria andUdtNotEqualTo(Object value) {
            addCriterion("CE_UDT <>", value, "udt");
            return (Criteria) this;
        }

        public Criteria andUdtGreaterThan(Object value) {
            addCriterion("CE_UDT >", value, "udt");
            return (Criteria) this;
        }

        public Criteria andUdtGreaterThanOrEqualTo(Object value) {
            addCriterion("CE_UDT >=", value, "udt");
            return (Criteria) this;
        }

        public Criteria andUdtLessThan(Object value) {
            addCriterion("CE_UDT <", value, "udt");
            return (Criteria) this;
        }

        public Criteria andUdtLessThanOrEqualTo(Object value) {
            addCriterion("CE_UDT <=", value, "udt");
            return (Criteria) this;
        }

        public Criteria andUdtIn(List<Object> values) {
            addCriterion("CE_UDT in", values, "udt");
            return (Criteria) this;
        }

        public Criteria andUdtNotIn(List<Object> values) {
            addCriterion("CE_UDT not in", values, "udt");
            return (Criteria) this;
        }

        public Criteria andUdtBetween(Object value1, Object value2) {
            addCriterion("CE_UDT between", value1, value2, "udt");
            return (Criteria) this;
        }

        public Criteria andUdtNotBetween(Object value1, Object value2) {
            addCriterion("CE_UDT not between", value1, value2, "udt");
            return (Criteria) this;
        }

        public Criteria andZtIsNull() {
            addCriterion("CE_ZT is null");
            return (Criteria) this;
        }

        public Criteria andZtIsNotNull() {
            addCriterion("CE_ZT is not null");
            return (Criteria) this;
        }

        public Criteria andZtEqualTo(Short value) {
            addCriterion("CE_ZT =", value, "zt");
            return (Criteria) this;
        }

        public Criteria andZtNotEqualTo(Short value) {
            addCriterion("CE_ZT <>", value, "zt");
            return (Criteria) this;
        }

        public Criteria andZtGreaterThan(Short value) {
            addCriterion("CE_ZT >", value, "zt");
            return (Criteria) this;
        }

        public Criteria andZtGreaterThanOrEqualTo(Short value) {
            addCriterion("CE_ZT >=", value, "zt");
            return (Criteria) this;
        }

        public Criteria andZtLessThan(Short value) {
            addCriterion("CE_ZT <", value, "zt");
            return (Criteria) this;
        }

        public Criteria andZtLessThanOrEqualTo(Short value) {
            addCriterion("CE_ZT <=", value, "zt");
            return (Criteria) this;
        }

        public Criteria andZtIn(List<Short> values) {
            addCriterion("CE_ZT in", values, "zt");
            return (Criteria) this;
        }

        public Criteria andZtNotIn(List<Short> values) {
            addCriterion("CE_ZT not in", values, "zt");
            return (Criteria) this;
        }

        public Criteria andZtBetween(Short value1, Short value2) {
            addCriterion("CE_ZT between", value1, value2, "zt");
            return (Criteria) this;
        }

        public Criteria andZtNotBetween(Short value1, Short value2) {
            addCriterion("CE_ZT not between", value1, value2, "zt");
            return (Criteria) this;
        }

        public Criteria andRc3IsNull() {
            addCriterion("CE_RC3 is null");
            return (Criteria) this;
        }

        public Criteria andRc3IsNotNull() {
            addCriterion("CE_RC3 is not null");
            return (Criteria) this;
        }

        public Criteria andRc3EqualTo(Date value) {
            addCriterion("CE_RC3 =", value, "rc3");
            return (Criteria) this;
        }

        public Criteria andRc3NotEqualTo(Date value) {
            addCriterion("CE_RC3 <>", value, "rc3");
            return (Criteria) this;
        }

        public Criteria andRc3GreaterThan(Date value) {
            addCriterion("CE_RC3 >", value, "rc3");
            return (Criteria) this;
        }

        public Criteria andRc3GreaterThanOrEqualTo(Date value) {
            addCriterion("CE_RC3 >=", value, "rc3");
            return (Criteria) this;
        }

        public Criteria andRc3LessThan(Date value) {
            addCriterion("CE_RC3 <", value, "rc3");
            return (Criteria) this;
        }

        public Criteria andRc3LessThanOrEqualTo(Date value) {
            addCriterion("CE_RC3 <=", value, "rc3");
            return (Criteria) this;
        }

        public Criteria andRc3In(List<Date> values) {
            addCriterion("CE_RC3 in", values, "rc3");
            return (Criteria) this;
        }

        public Criteria andRc3NotIn(List<Date> values) {
            addCriterion("CE_RC3 not in", values, "rc3");
            return (Criteria) this;
        }

        public Criteria andRc3Between(Date value1, Date value2) {
            addCriterion("CE_RC3 between", value1, value2, "rc3");
            return (Criteria) this;
        }

        public Criteria andRc3NotBetween(Date value1, Date value2) {
            addCriterion("CE_RC3 not between", value1, value2, "rc3");
            return (Criteria) this;
        }

        public Criteria andRc4IsNull() {
            addCriterion("CE_RC4 is null");
            return (Criteria) this;
        }

        public Criteria andRc4IsNotNull() {
            addCriterion("CE_RC4 is not null");
            return (Criteria) this;
        }

        public Criteria andRc4EqualTo(Date value) {
            addCriterion("CE_RC4 =", value, "rc4");
            return (Criteria) this;
        }

        public Criteria andRc4NotEqualTo(Date value) {
            addCriterion("CE_RC4 <>", value, "rc4");
            return (Criteria) this;
        }

        public Criteria andRc4GreaterThan(Date value) {
            addCriterion("CE_RC4 >", value, "rc4");
            return (Criteria) this;
        }

        public Criteria andRc4GreaterThanOrEqualTo(Date value) {
            addCriterion("CE_RC4 >=", value, "rc4");
            return (Criteria) this;
        }

        public Criteria andRc4LessThan(Date value) {
            addCriterion("CE_RC4 <", value, "rc4");
            return (Criteria) this;
        }

        public Criteria andRc4LessThanOrEqualTo(Date value) {
            addCriterion("CE_RC4 <=", value, "rc4");
            return (Criteria) this;
        }

        public Criteria andRc4In(List<Date> values) {
            addCriterion("CE_RC4 in", values, "rc4");
            return (Criteria) this;
        }

        public Criteria andRc4NotIn(List<Date> values) {
            addCriterion("CE_RC4 not in", values, "rc4");
            return (Criteria) this;
        }

        public Criteria andRc4Between(Date value1, Date value2) {
            addCriterion("CE_RC4 between", value1, value2, "rc4");
            return (Criteria) this;
        }

        public Criteria andRc4NotBetween(Date value1, Date value2) {
            addCriterion("CE_RC4 not between", value1, value2, "rc4");
            return (Criteria) this;
        }

        public Criteria andOrgcodeIsNull() {
            addCriterion("CE_ORGCODE is null");
            return (Criteria) this;
        }

        public Criteria andOrgcodeIsNotNull() {
            addCriterion("CE_ORGCODE is not null");
            return (Criteria) this;
        }

        public Criteria andOrgcodeEqualTo(String value) {
            addCriterion("CE_ORGCODE =", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeNotEqualTo(String value) {
            addCriterion("CE_ORGCODE <>", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeGreaterThan(String value) {
            addCriterion("CE_ORGCODE >", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeGreaterThanOrEqualTo(String value) {
            addCriterion("CE_ORGCODE >=", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeLessThan(String value) {
            addCriterion("CE_ORGCODE <", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeLessThanOrEqualTo(String value) {
            addCriterion("CE_ORGCODE <=", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeLike(String value) {
            addCriterion("CE_ORGCODE like", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeNotLike(String value) {
            addCriterion("CE_ORGCODE not like", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeIn(List<String> values) {
            addCriterion("CE_ORGCODE in", values, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeNotIn(List<String> values) {
            addCriterion("CE_ORGCODE not in", values, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeBetween(String value1, String value2) {
            addCriterion("CE_ORGCODE between", value1, value2, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeNotBetween(String value1, String value2) {
            addCriterion("CE_ORGCODE not between", value1, value2, "orgcode");
            return (Criteria) this;
        }

        public Criteria andAreacodeIsNull() {
            addCriterion("CE_AREACODE is null");
            return (Criteria) this;
        }

        public Criteria andAreacodeIsNotNull() {
            addCriterion("CE_AREACODE is not null");
            return (Criteria) this;
        }

        public Criteria andAreacodeEqualTo(String value) {
            addCriterion("CE_AREACODE =", value, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeNotEqualTo(String value) {
            addCriterion("CE_AREACODE <>", value, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeGreaterThan(String value) {
            addCriterion("CE_AREACODE >", value, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeGreaterThanOrEqualTo(String value) {
            addCriterion("CE_AREACODE >=", value, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeLessThan(String value) {
            addCriterion("CE_AREACODE <", value, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeLessThanOrEqualTo(String value) {
            addCriterion("CE_AREACODE <=", value, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeLike(String value) {
            addCriterion("CE_AREACODE like", value, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeNotLike(String value) {
            addCriterion("CE_AREACODE not like", value, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeIn(List<String> values) {
            addCriterion("CE_AREACODE in", values, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeNotIn(List<String> values) {
            addCriterion("CE_AREACODE not in", values, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeBetween(String value1, String value2) {
            addCriterion("CE_AREACODE between", value1, value2, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeNotBetween(String value1, String value2) {
            addCriterion("CE_AREACODE not between", value1, value2, "areacode");
            return (Criteria) this;
        }

        public Criteria andEntstateIsNull() {
            addCriterion("CE_ENTSTATE is null");
            return (Criteria) this;
        }

        public Criteria andEntstateIsNotNull() {
            addCriterion("CE_ENTSTATE is not null");
            return (Criteria) this;
        }

        public Criteria andEntstateEqualTo(Short value) {
            addCriterion("CE_ENTSTATE =", value, "entstate");
            return (Criteria) this;
        }

        public Criteria andEntstateNotEqualTo(Short value) {
            addCriterion("CE_ENTSTATE <>", value, "entstate");
            return (Criteria) this;
        }

        public Criteria andEntstateGreaterThan(Short value) {
            addCriterion("CE_ENTSTATE >", value, "entstate");
            return (Criteria) this;
        }

        public Criteria andEntstateGreaterThanOrEqualTo(Short value) {
            addCriterion("CE_ENTSTATE >=", value, "entstate");
            return (Criteria) this;
        }

        public Criteria andEntstateLessThan(Short value) {
            addCriterion("CE_ENTSTATE <", value, "entstate");
            return (Criteria) this;
        }

        public Criteria andEntstateLessThanOrEqualTo(Short value) {
            addCriterion("CE_ENTSTATE <=", value, "entstate");
            return (Criteria) this;
        }

        public Criteria andEntstateIn(List<Short> values) {
            addCriterion("CE_ENTSTATE in", values, "entstate");
            return (Criteria) this;
        }

        public Criteria andEntstateNotIn(List<Short> values) {
            addCriterion("CE_ENTSTATE not in", values, "entstate");
            return (Criteria) this;
        }

        public Criteria andEntstateBetween(Short value1, Short value2) {
            addCriterion("CE_ENTSTATE between", value1, value2, "entstate");
            return (Criteria) this;
        }

        public Criteria andEntstateNotBetween(Short value1, Short value2) {
            addCriterion("CE_ENTSTATE not between", value1, value2, "entstate");
            return (Criteria) this;
        }

        public Criteria andAreanameIsNull() {
            addCriterion("CE_AREANAME is null");
            return (Criteria) this;
        }

        public Criteria andAreanameIsNotNull() {
            addCriterion("CE_AREANAME is not null");
            return (Criteria) this;
        }

        public Criteria andAreanameEqualTo(String value) {
            addCriterion("CE_AREANAME =", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameNotEqualTo(String value) {
            addCriterion("CE_AREANAME <>", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameGreaterThan(String value) {
            addCriterion("CE_AREANAME >", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameGreaterThanOrEqualTo(String value) {
            addCriterion("CE_AREANAME >=", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameLessThan(String value) {
            addCriterion("CE_AREANAME <", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameLessThanOrEqualTo(String value) {
            addCriterion("CE_AREANAME <=", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameLike(String value) {
            addCriterion("CE_AREANAME like", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameNotLike(String value) {
            addCriterion("CE_AREANAME not like", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameIn(List<String> values) {
            addCriterion("CE_AREANAME in", values, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameNotIn(List<String> values) {
            addCriterion("CE_AREANAME not in", values, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameBetween(String value1, String value2) {
            addCriterion("CE_AREANAME between", value1, value2, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameNotBetween(String value1, String value2) {
            addCriterion("CE_AREANAME not between", value1, value2, "areaname");
            return (Criteria) this;
        }

        public Criteria andOrgnameIsNull() {
            addCriterion("CE_ORGNAME is null");
            return (Criteria) this;
        }

        public Criteria andOrgnameIsNotNull() {
            addCriterion("CE_ORGNAME is not null");
            return (Criteria) this;
        }

        public Criteria andOrgnameEqualTo(String value) {
            addCriterion("CE_ORGNAME =", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameNotEqualTo(String value) {
            addCriterion("CE_ORGNAME <>", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameGreaterThan(String value) {
            addCriterion("CE_ORGNAME >", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameGreaterThanOrEqualTo(String value) {
            addCriterion("CE_ORGNAME >=", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameLessThan(String value) {
            addCriterion("CE_ORGNAME <", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameLessThanOrEqualTo(String value) {
            addCriterion("CE_ORGNAME <=", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameLike(String value) {
            addCriterion("CE_ORGNAME like", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameNotLike(String value) {
            addCriterion("CE_ORGNAME not like", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameIn(List<String> values) {
            addCriterion("CE_ORGNAME in", values, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameNotIn(List<String> values) {
            addCriterion("CE_ORGNAME not in", values, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameBetween(String value1, String value2) {
            addCriterion("CE_ORGNAME between", value1, value2, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameNotBetween(String value1, String value2) {
            addCriterion("CE_ORGNAME not between", value1, value2, "orgname");
            return (Criteria) this;
        }

        public Criteria andUidLikeInsensitive(String value) {
            addCriterion("upper(CE_UID) like", value.toUpperCase(), "uid");
            return (Criteria) this;
        }

        public Criteria andPidLikeInsensitive(String value) {
            addCriterion("upper(CE_PID) like", value.toUpperCase(), "pid");
            return (Criteria) this;
        }

        public Criteria andEntnameLikeInsensitive(String value) {
            addCriterion("upper(CE_ENTNAME) like", value.toUpperCase(), "entname");
            return (Criteria) this;
        }

        public Criteria andRegistnumLikeInsensitive(String value) {
            addCriterion("upper(CE_REGISTNUM) like", value.toUpperCase(), "registnum");
            return (Criteria) this;
        }

        public Criteria andLegalLikeInsensitive(String value) {
            addCriterion("upper(CE_LEGAL) like", value.toUpperCase(), "legal");
            return (Criteria) this;
        }

        public Criteria andRegcapitalLikeInsensitive(String value) {
            addCriterion("upper(CE_REGCAPITAL) like", value.toUpperCase(), "regcapital");
            return (Criteria) this;
        }

        public Criteria andCreditcodeLikeInsensitive(String value) {
            addCriterion("upper(CE_CREDITCODE) like", value.toUpperCase(), "creditcode");
            return (Criteria) this;
        }

        public Criteria andBusinesstermLikeInsensitive(String value) {
            addCriterion("upper(CE_BUSINESSTERM) like", value.toUpperCase(), "businessterm");
            return (Criteria) this;
        }

        public Criteria andEnttypeLikeInsensitive(String value) {
            addCriterion("upper(CE_ENTTYPE) like", value.toUpperCase(), "enttype");
            return (Criteria) this;
        }

        public Criteria andRegofficeLikeInsensitive(String value) {
            addCriterion("upper(CE_REGOFFICE) like", value.toUpperCase(), "regoffice");
            return (Criteria) this;
        }

        public Criteria andAddressLikeInsensitive(String value) {
            addCriterion("upper(CE_ADDRESS) like", value.toUpperCase(), "address");
            return (Criteria) this;
        }

        public Criteria andTelLikeInsensitive(String value) {
            addCriterion("upper(CE_TEL) like", value.toUpperCase(), "tel");
            return (Criteria) this;
        }

        public Criteria andScopeLikeInsensitive(String value) {
            addCriterion("upper(CE_SCOPE) like", value.toUpperCase(), "scope");
            return (Criteria) this;
        }

        public Criteria andEntcateLikeInsensitive(String value) {
            addCriterion("upper(CE_ENTCATE) like", value.toUpperCase(), "entcate");
            return (Criteria) this;
        }

        public Criteria andRc1LikeInsensitive(String value) {
            addCriterion("upper(CE_RC1) like", value.toUpperCase(), "rc1");
            return (Criteria) this;
        }

        public Criteria andRc2LikeInsensitive(String value) {
            addCriterion("upper(CE_RC2) like", value.toUpperCase(), "rc2");
            return (Criteria) this;
        }

        public Criteria andOrgcodeLikeInsensitive(String value) {
            addCriterion("upper(CE_ORGCODE) like", value.toUpperCase(), "orgcode");
            return (Criteria) this;
        }

        public Criteria andAreacodeLikeInsensitive(String value) {
            addCriterion("upper(CE_AREACODE) like", value.toUpperCase(), "areacode");
            return (Criteria) this;
        }

        public Criteria andAreanameLikeInsensitive(String value) {
            addCriterion("upper(CE_AREANAME) like", value.toUpperCase(), "areaname");
            return (Criteria) this;
        }

        public Criteria andOrgnameLikeInsensitive(String value) {
            addCriterion("upper(CE_ORGNAME) like", value.toUpperCase(), "orgname");
            return (Criteria) this;
        }
        public Criteria andIsNullOrIn() {
            addCriterion("(CE_ZT =2 or CE_ZT =12 or CE_ZT is null)");
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