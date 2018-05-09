package com.chinasofti.domain;

import com.limp.framework.core.bean.Pager;
import java.util.ArrayList;
import java.util.List;

public class GNShipPosExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Pager page;

    public GNShipPosExample() {
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
            addCriterion("CSP_ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("CSP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("CSP_ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("CSP_ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("CSP_ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("CSP_ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("CSP_ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("CSP_ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("CSP_ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("CSP_ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("CSP_ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("CSP_ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("CSP_ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("CSP_ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andShipnoIsNull() {
            addCriterion("CSP_SHIPNO is null");
            return (Criteria) this;
        }

        public Criteria andShipnoIsNotNull() {
            addCriterion("CSP_SHIPNO is not null");
            return (Criteria) this;
        }

        public Criteria andShipnoEqualTo(String value) {
            addCriterion("CSP_SHIPNO =", value, "shipno");
            return (Criteria) this;
        }

        public Criteria andShipnoNotEqualTo(String value) {
            addCriterion("CSP_SHIPNO <>", value, "shipno");
            return (Criteria) this;
        }

        public Criteria andShipnoGreaterThan(String value) {
            addCriterion("CSP_SHIPNO >", value, "shipno");
            return (Criteria) this;
        }

        public Criteria andShipnoGreaterThanOrEqualTo(String value) {
            addCriterion("CSP_SHIPNO >=", value, "shipno");
            return (Criteria) this;
        }

        public Criteria andShipnoLessThan(String value) {
            addCriterion("CSP_SHIPNO <", value, "shipno");
            return (Criteria) this;
        }

        public Criteria andShipnoLessThanOrEqualTo(String value) {
            addCriterion("CSP_SHIPNO <=", value, "shipno");
            return (Criteria) this;
        }

        public Criteria andShipnoLike(String value) {
            addCriterion("CSP_SHIPNO like", value, "shipno");
            return (Criteria) this;
        }

        public Criteria andShipnoNotLike(String value) {
            addCriterion("CSP_SHIPNO not like", value, "shipno");
            return (Criteria) this;
        }

        public Criteria andShipnoIn(List<String> values) {
            addCriterion("CSP_SHIPNO in", values, "shipno");
            return (Criteria) this;
        }

        public Criteria andShipnoNotIn(List<String> values) {
            addCriterion("CSP_SHIPNO not in", values, "shipno");
            return (Criteria) this;
        }

        public Criteria andShipnoBetween(String value1, String value2) {
            addCriterion("CSP_SHIPNO between", value1, value2, "shipno");
            return (Criteria) this;
        }

        public Criteria andShipnoNotBetween(String value1, String value2) {
            addCriterion("CSP_SHIPNO not between", value1, value2, "shipno");
            return (Criteria) this;
        }

        public Criteria andShipnameIsNull() {
            addCriterion("CSP_SHIPNAME is null");
            return (Criteria) this;
        }

        public Criteria andShipnameIsNotNull() {
            addCriterion("CSP_SHIPNAME is not null");
            return (Criteria) this;
        }

        public Criteria andShipnameEqualTo(String value) {
            addCriterion("CSP_SHIPNAME =", value, "shipname");
            return (Criteria) this;
        }

        public Criteria andShipnameNotEqualTo(String value) {
            addCriterion("CSP_SHIPNAME <>", value, "shipname");
            return (Criteria) this;
        }

        public Criteria andShipnameGreaterThan(String value) {
            addCriterion("CSP_SHIPNAME >", value, "shipname");
            return (Criteria) this;
        }

        public Criteria andShipnameGreaterThanOrEqualTo(String value) {
            addCriterion("CSP_SHIPNAME >=", value, "shipname");
            return (Criteria) this;
        }

        public Criteria andShipnameLessThan(String value) {
            addCriterion("CSP_SHIPNAME <", value, "shipname");
            return (Criteria) this;
        }

        public Criteria andShipnameLessThanOrEqualTo(String value) {
            addCriterion("CSP_SHIPNAME <=", value, "shipname");
            return (Criteria) this;
        }

        public Criteria andShipnameLike(String value) {
            addCriterion("CSP_SHIPNAME like", value, "shipname");
            return (Criteria) this;
        }

        public Criteria andShipnameNotLike(String value) {
            addCriterion("CSP_SHIPNAME not like", value, "shipname");
            return (Criteria) this;
        }

        public Criteria andShipnameIn(List<String> values) {
            addCriterion("CSP_SHIPNAME in", values, "shipname");
            return (Criteria) this;
        }

        public Criteria andShipnameNotIn(List<String> values) {
            addCriterion("CSP_SHIPNAME not in", values, "shipname");
            return (Criteria) this;
        }

        public Criteria andShipnameBetween(String value1, String value2) {
            addCriterion("CSP_SHIPNAME between", value1, value2, "shipname");
            return (Criteria) this;
        }

        public Criteria andShipnameNotBetween(String value1, String value2) {
            addCriterion("CSP_SHIPNAME not between", value1, value2, "shipname");
            return (Criteria) this;
        }

        public Criteria andShipportIsNull() {
            addCriterion("CSP_SHIPPORT is null");
            return (Criteria) this;
        }

        public Criteria andShipportIsNotNull() {
            addCriterion("CSP_SHIPPORT is not null");
            return (Criteria) this;
        }

        public Criteria andShipportEqualTo(String value) {
            addCriterion("CSP_SHIPPORT =", value, "shipport");
            return (Criteria) this;
        }

        public Criteria andShipportNotEqualTo(String value) {
            addCriterion("CSP_SHIPPORT <>", value, "shipport");
            return (Criteria) this;
        }

        public Criteria andShipportGreaterThan(String value) {
            addCriterion("CSP_SHIPPORT >", value, "shipport");
            return (Criteria) this;
        }

        public Criteria andShipportGreaterThanOrEqualTo(String value) {
            addCriterion("CSP_SHIPPORT >=", value, "shipport");
            return (Criteria) this;
        }

        public Criteria andShipportLessThan(String value) {
            addCriterion("CSP_SHIPPORT <", value, "shipport");
            return (Criteria) this;
        }

        public Criteria andShipportLessThanOrEqualTo(String value) {
            addCriterion("CSP_SHIPPORT <=", value, "shipport");
            return (Criteria) this;
        }

        public Criteria andShipportLike(String value) {
            addCriterion("CSP_SHIPPORT like", value, "shipport");
            return (Criteria) this;
        }

        public Criteria andShipportNotLike(String value) {
            addCriterion("CSP_SHIPPORT not like", value, "shipport");
            return (Criteria) this;
        }

        public Criteria andShipportIn(List<String> values) {
            addCriterion("CSP_SHIPPORT in", values, "shipport");
            return (Criteria) this;
        }

        public Criteria andShipportNotIn(List<String> values) {
            addCriterion("CSP_SHIPPORT not in", values, "shipport");
            return (Criteria) this;
        }

        public Criteria andShipportBetween(String value1, String value2) {
            addCriterion("CSP_SHIPPORT between", value1, value2, "shipport");
            return (Criteria) this;
        }

        public Criteria andShipportNotBetween(String value1, String value2) {
            addCriterion("CSP_SHIPPORT not between", value1, value2, "shipport");
            return (Criteria) this;
        }

        public Criteria andRectimeIsNull() {
            addCriterion("CSP_RECTIME is null");
            return (Criteria) this;
        }

        public Criteria andRectimeIsNotNull() {
            addCriterion("CSP_RECTIME is not null");
            return (Criteria) this;
        }

        public Criteria andRectimeEqualTo(String value) {
            addCriterion("CSP_RECTIME =", value, "rectime");
            return (Criteria) this;
        }

        public Criteria andRectimeNotEqualTo(String value) {
            addCriterion("CSP_RECTIME <>", value, "rectime");
            return (Criteria) this;
        }

        public Criteria andRectimeGreaterThan(String value) {
            addCriterion("CSP_RECTIME >", value, "rectime");
            return (Criteria) this;
        }

        public Criteria andRectimeGreaterThanOrEqualTo(String value) {
            addCriterion("CSP_RECTIME >=", value, "rectime");
            return (Criteria) this;
        }

        public Criteria andRectimeLessThan(String value) {
            addCriterion("CSP_RECTIME <", value, "rectime");
            return (Criteria) this;
        }

        public Criteria andRectimeLessThanOrEqualTo(String value) {
            addCriterion("CSP_RECTIME <=", value, "rectime");
            return (Criteria) this;
        }

        public Criteria andRectimeLike(String value) {
            addCriterion("CSP_RECTIME like", value, "rectime");
            return (Criteria) this;
        }

        public Criteria andRectimeNotLike(String value) {
            addCriterion("CSP_RECTIME not like", value, "rectime");
            return (Criteria) this;
        }

        public Criteria andRectimeIn(List<String> values) {
            addCriterion("CSP_RECTIME in", values, "rectime");
            return (Criteria) this;
        }

        public Criteria andRectimeNotIn(List<String> values) {
            addCriterion("CSP_RECTIME not in", values, "rectime");
            return (Criteria) this;
        }

        public Criteria andRectimeBetween(String value1, String value2) {
            addCriterion("CSP_RECTIME between", value1, value2, "rectime");
            return (Criteria) this;
        }

        public Criteria andRectimeNotBetween(String value1, String value2) {
            addCriterion("CSP_RECTIME not between", value1, value2, "rectime");
            return (Criteria) this;
        }

        public Criteria andLonIsNull() {
            addCriterion("CSP_LON is null");
            return (Criteria) this;
        }

        public Criteria andLonIsNotNull() {
            addCriterion("CSP_LON is not null");
            return (Criteria) this;
        }

        public Criteria andLonEqualTo(String value) {
            addCriterion("CSP_LON =", value, "lon");
            return (Criteria) this;
        }

        public Criteria andLonNotEqualTo(String value) {
            addCriterion("CSP_LON <>", value, "lon");
            return (Criteria) this;
        }

        public Criteria andLonGreaterThan(String value) {
            addCriterion("CSP_LON >", value, "lon");
            return (Criteria) this;
        }

        public Criteria andLonGreaterThanOrEqualTo(String value) {
            addCriterion("CSP_LON >=", value, "lon");
            return (Criteria) this;
        }

        public Criteria andLonLessThan(String value) {
            addCriterion("CSP_LON <", value, "lon");
            return (Criteria) this;
        }

        public Criteria andLonLessThanOrEqualTo(String value) {
            addCriterion("CSP_LON <=", value, "lon");
            return (Criteria) this;
        }

        public Criteria andLonLike(String value) {
            addCriterion("CSP_LON like", value, "lon");
            return (Criteria) this;
        }

        public Criteria andLonNotLike(String value) {
            addCriterion("CSP_LON not like", value, "lon");
            return (Criteria) this;
        }

        public Criteria andLonIn(List<String> values) {
            addCriterion("CSP_LON in", values, "lon");
            return (Criteria) this;
        }

        public Criteria andLonNotIn(List<String> values) {
            addCriterion("CSP_LON not in", values, "lon");
            return (Criteria) this;
        }

        public Criteria andLonBetween(String value1, String value2) {
            addCriterion("CSP_LON between", value1, value2, "lon");
            return (Criteria) this;
        }

        public Criteria andLonNotBetween(String value1, String value2) {
            addCriterion("CSP_LON not between", value1, value2, "lon");
            return (Criteria) this;
        }

        public Criteria andLatIsNull() {
            addCriterion("CSP_LAT is null");
            return (Criteria) this;
        }

        public Criteria andLatIsNotNull() {
            addCriterion("CSP_LAT is not null");
            return (Criteria) this;
        }

        public Criteria andLatEqualTo(String value) {
            addCriterion("CSP_LAT =", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotEqualTo(String value) {
            addCriterion("CSP_LAT <>", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatGreaterThan(String value) {
            addCriterion("CSP_LAT >", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatGreaterThanOrEqualTo(String value) {
            addCriterion("CSP_LAT >=", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatLessThan(String value) {
            addCriterion("CSP_LAT <", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatLessThanOrEqualTo(String value) {
            addCriterion("CSP_LAT <=", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatLike(String value) {
            addCriterion("CSP_LAT like", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotLike(String value) {
            addCriterion("CSP_LAT not like", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatIn(List<String> values) {
            addCriterion("CSP_LAT in", values, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotIn(List<String> values) {
            addCriterion("CSP_LAT not in", values, "lat");
            return (Criteria) this;
        }

        public Criteria andLatBetween(String value1, String value2) {
            addCriterion("CSP_LAT between", value1, value2, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotBetween(String value1, String value2) {
            addCriterion("CSP_LAT not between", value1, value2, "lat");
            return (Criteria) this;
        }

        public Criteria andPostypeIsNull() {
            addCriterion("CSP_POSTYPE is null");
            return (Criteria) this;
        }

        public Criteria andPostypeIsNotNull() {
            addCriterion("CSP_POSTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPostypeEqualTo(String value) {
            addCriterion("CSP_POSTYPE =", value, "postype");
            return (Criteria) this;
        }

        public Criteria andPostypeNotEqualTo(String value) {
            addCriterion("CSP_POSTYPE <>", value, "postype");
            return (Criteria) this;
        }

        public Criteria andPostypeGreaterThan(String value) {
            addCriterion("CSP_POSTYPE >", value, "postype");
            return (Criteria) this;
        }

        public Criteria andPostypeGreaterThanOrEqualTo(String value) {
            addCriterion("CSP_POSTYPE >=", value, "postype");
            return (Criteria) this;
        }

        public Criteria andPostypeLessThan(String value) {
            addCriterion("CSP_POSTYPE <", value, "postype");
            return (Criteria) this;
        }

        public Criteria andPostypeLessThanOrEqualTo(String value) {
            addCriterion("CSP_POSTYPE <=", value, "postype");
            return (Criteria) this;
        }

        public Criteria andPostypeLike(String value) {
            addCriterion("CSP_POSTYPE like", value, "postype");
            return (Criteria) this;
        }

        public Criteria andPostypeNotLike(String value) {
            addCriterion("CSP_POSTYPE not like", value, "postype");
            return (Criteria) this;
        }

        public Criteria andPostypeIn(List<String> values) {
            addCriterion("CSP_POSTYPE in", values, "postype");
            return (Criteria) this;
        }

        public Criteria andPostypeNotIn(List<String> values) {
            addCriterion("CSP_POSTYPE not in", values, "postype");
            return (Criteria) this;
        }

        public Criteria andPostypeBetween(String value1, String value2) {
            addCriterion("CSP_POSTYPE between", value1, value2, "postype");
            return (Criteria) this;
        }

        public Criteria andPostypeNotBetween(String value1, String value2) {
            addCriterion("CSP_POSTYPE not between", value1, value2, "postype");
            return (Criteria) this;
        }

        public Criteria andIdtIsNull() {
            addCriterion("CSP_IDT is null");
            return (Criteria) this;
        }

        public Criteria andIdtIsNotNull() {
            addCriterion("CSP_IDT is not null");
            return (Criteria) this;
        }

        public Criteria andIdtEqualTo(String value) {
            addCriterion("CSP_IDT =", value, "idt");
            return (Criteria) this;
        }

        public Criteria andIdtNotEqualTo(String value) {
            addCriterion("CSP_IDT <>", value, "idt");
            return (Criteria) this;
        }

        public Criteria andIdtGreaterThan(String value) {
            addCriterion("CSP_IDT >", value, "idt");
            return (Criteria) this;
        }

        public Criteria andIdtGreaterThanOrEqualTo(String value) {
            addCriterion("CSP_IDT >=", value, "idt");
            return (Criteria) this;
        }

        public Criteria andIdtLessThan(String value) {
            addCriterion("CSP_IDT <", value, "idt");
            return (Criteria) this;
        }

        public Criteria andIdtLessThanOrEqualTo(String value) {
            addCriterion("CSP_IDT <=", value, "idt");
            return (Criteria) this;
        }

        public Criteria andIdtLike(String value) {
            addCriterion("CSP_IDT like", value, "idt");
            return (Criteria) this;
        }

        public Criteria andIdtNotLike(String value) {
            addCriterion("CSP_IDT not like", value, "idt");
            return (Criteria) this;
        }

        public Criteria andIdtIn(List<String> values) {
            addCriterion("CSP_IDT in", values, "idt");
            return (Criteria) this;
        }

        public Criteria andIdtNotIn(List<String> values) {
            addCriterion("CSP_IDT not in", values, "idt");
            return (Criteria) this;
        }

        public Criteria andIdtBetween(String value1, String value2) {
            addCriterion("CSP_IDT between", value1, value2, "idt");
            return (Criteria) this;
        }

        public Criteria andIdtNotBetween(String value1, String value2) {
            addCriterion("CSP_IDT not between", value1, value2, "idt");
            return (Criteria) this;
        }

        public Criteria andPostimeIsNull() {
            addCriterion("CSP_POSTIME is null");
            return (Criteria) this;
        }

        public Criteria andPostimeIsNotNull() {
            addCriterion("CSP_POSTIME is not null");
            return (Criteria) this;
        }

        public Criteria andPostimeEqualTo(String value) {
            addCriterion("CSP_POSTIME =", value, "postime");
            return (Criteria) this;
        }

        public Criteria andPostimeNotEqualTo(String value) {
            addCriterion("CSP_POSTIME <>", value, "postime");
            return (Criteria) this;
        }

        public Criteria andPostimeGreaterThan(String value) {
            addCriterion("CSP_POSTIME >", value, "postime");
            return (Criteria) this;
        }

        public Criteria andPostimeGreaterThanOrEqualTo(String value) {
            addCriterion("CSP_POSTIME >=", value, "postime");
            return (Criteria) this;
        }

        public Criteria andPostimeLessThan(String value) {
            addCriterion("CSP_POSTIME <", value, "postime");
            return (Criteria) this;
        }

        public Criteria andPostimeLessThanOrEqualTo(String value) {
            addCriterion("CSP_POSTIME <=", value, "postime");
            return (Criteria) this;
        }

        public Criteria andPostimeLike(String value) {
            addCriterion("CSP_POSTIME like", value, "postime");
            return (Criteria) this;
        }

        public Criteria andPostimeNotLike(String value) {
            addCriterion("CSP_POSTIME not like", value, "postime");
            return (Criteria) this;
        }

        public Criteria andPostimeIn(List<String> values) {
            addCriterion("CSP_POSTIME in", values, "postime");
            return (Criteria) this;
        }

        public Criteria andPostimeNotIn(List<String> values) {
            addCriterion("CSP_POSTIME not in", values, "postime");
            return (Criteria) this;
        }

        public Criteria andPostimeBetween(String value1, String value2) {
            addCriterion("CSP_POSTIME between", value1, value2, "postime");
            return (Criteria) this;
        }

        public Criteria andPostimeNotBetween(String value1, String value2) {
            addCriterion("CSP_POSTIME not between", value1, value2, "postime");
            return (Criteria) this;
        }

        public Criteria andDirectionIsNull() {
            addCriterion("CSP_DIRECTION is null");
            return (Criteria) this;
        }

        public Criteria andDirectionIsNotNull() {
            addCriterion("CSP_DIRECTION is not null");
            return (Criteria) this;
        }

        public Criteria andDirectionEqualTo(String value) {
            addCriterion("CSP_DIRECTION =", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionNotEqualTo(String value) {
            addCriterion("CSP_DIRECTION <>", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionGreaterThan(String value) {
            addCriterion("CSP_DIRECTION >", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionGreaterThanOrEqualTo(String value) {
            addCriterion("CSP_DIRECTION >=", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionLessThan(String value) {
            addCriterion("CSP_DIRECTION <", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionLessThanOrEqualTo(String value) {
            addCriterion("CSP_DIRECTION <=", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionLike(String value) {
            addCriterion("CSP_DIRECTION like", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionNotLike(String value) {
            addCriterion("CSP_DIRECTION not like", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionIn(List<String> values) {
            addCriterion("CSP_DIRECTION in", values, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionNotIn(List<String> values) {
            addCriterion("CSP_DIRECTION not in", values, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionBetween(String value1, String value2) {
            addCriterion("CSP_DIRECTION between", value1, value2, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionNotBetween(String value1, String value2) {
            addCriterion("CSP_DIRECTION not between", value1, value2, "direction");
            return (Criteria) this;
        }

        public Criteria andSpeedIsNull() {
            addCriterion("CSP_SPEED is null");
            return (Criteria) this;
        }

        public Criteria andSpeedIsNotNull() {
            addCriterion("CSP_SPEED is not null");
            return (Criteria) this;
        }

        public Criteria andSpeedEqualTo(String value) {
            addCriterion("CSP_SPEED =", value, "speed");
            return (Criteria) this;
        }

        public Criteria andSpeedNotEqualTo(String value) {
            addCriterion("CSP_SPEED <>", value, "speed");
            return (Criteria) this;
        }

        public Criteria andSpeedGreaterThan(String value) {
            addCriterion("CSP_SPEED >", value, "speed");
            return (Criteria) this;
        }

        public Criteria andSpeedGreaterThanOrEqualTo(String value) {
            addCriterion("CSP_SPEED >=", value, "speed");
            return (Criteria) this;
        }

        public Criteria andSpeedLessThan(String value) {
            addCriterion("CSP_SPEED <", value, "speed");
            return (Criteria) this;
        }

        public Criteria andSpeedLessThanOrEqualTo(String value) {
            addCriterion("CSP_SPEED <=", value, "speed");
            return (Criteria) this;
        }

        public Criteria andSpeedLike(String value) {
            addCriterion("CSP_SPEED like", value, "speed");
            return (Criteria) this;
        }

        public Criteria andSpeedNotLike(String value) {
            addCriterion("CSP_SPEED not like", value, "speed");
            return (Criteria) this;
        }

        public Criteria andSpeedIn(List<String> values) {
            addCriterion("CSP_SPEED in", values, "speed");
            return (Criteria) this;
        }

        public Criteria andSpeedNotIn(List<String> values) {
            addCriterion("CSP_SPEED not in", values, "speed");
            return (Criteria) this;
        }

        public Criteria andSpeedBetween(String value1, String value2) {
            addCriterion("CSP_SPEED between", value1, value2, "speed");
            return (Criteria) this;
        }

        public Criteria andSpeedNotBetween(String value1, String value2) {
            addCriterion("CSP_SPEED not between", value1, value2, "speed");
            return (Criteria) this;
        }

        public Criteria andBowIsNull() {
            addCriterion("CSP_BOW is null");
            return (Criteria) this;
        }

        public Criteria andBowIsNotNull() {
            addCriterion("CSP_BOW is not null");
            return (Criteria) this;
        }

        public Criteria andBowEqualTo(String value) {
            addCriterion("CSP_BOW =", value, "bow");
            return (Criteria) this;
        }

        public Criteria andBowNotEqualTo(String value) {
            addCriterion("CSP_BOW <>", value, "bow");
            return (Criteria) this;
        }

        public Criteria andBowGreaterThan(String value) {
            addCriterion("CSP_BOW >", value, "bow");
            return (Criteria) this;
        }

        public Criteria andBowGreaterThanOrEqualTo(String value) {
            addCriterion("CSP_BOW >=", value, "bow");
            return (Criteria) this;
        }

        public Criteria andBowLessThan(String value) {
            addCriterion("CSP_BOW <", value, "bow");
            return (Criteria) this;
        }

        public Criteria andBowLessThanOrEqualTo(String value) {
            addCriterion("CSP_BOW <=", value, "bow");
            return (Criteria) this;
        }

        public Criteria andBowLike(String value) {
            addCriterion("CSP_BOW like", value, "bow");
            return (Criteria) this;
        }

        public Criteria andBowNotLike(String value) {
            addCriterion("CSP_BOW not like", value, "bow");
            return (Criteria) this;
        }

        public Criteria andBowIn(List<String> values) {
            addCriterion("CSP_BOW in", values, "bow");
            return (Criteria) this;
        }

        public Criteria andBowNotIn(List<String> values) {
            addCriterion("CSP_BOW not in", values, "bow");
            return (Criteria) this;
        }

        public Criteria andBowBetween(String value1, String value2) {
            addCriterion("CSP_BOW between", value1, value2, "bow");
            return (Criteria) this;
        }

        public Criteria andBowNotBetween(String value1, String value2) {
            addCriterion("CSP_BOW not between", value1, value2, "bow");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeIsNull() {
            addCriterion("CSP_TERMINAL_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeIsNotNull() {
            addCriterion("CSP_TERMINAL_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeEqualTo(String value) {
            addCriterion("CSP_TERMINAL_TYPE =", value, "terminalType");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeNotEqualTo(String value) {
            addCriterion("CSP_TERMINAL_TYPE <>", value, "terminalType");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeGreaterThan(String value) {
            addCriterion("CSP_TERMINAL_TYPE >", value, "terminalType");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CSP_TERMINAL_TYPE >=", value, "terminalType");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeLessThan(String value) {
            addCriterion("CSP_TERMINAL_TYPE <", value, "terminalType");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeLessThanOrEqualTo(String value) {
            addCriterion("CSP_TERMINAL_TYPE <=", value, "terminalType");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeLike(String value) {
            addCriterion("CSP_TERMINAL_TYPE like", value, "terminalType");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeNotLike(String value) {
            addCriterion("CSP_TERMINAL_TYPE not like", value, "terminalType");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeIn(List<String> values) {
            addCriterion("CSP_TERMINAL_TYPE in", values, "terminalType");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeNotIn(List<String> values) {
            addCriterion("CSP_TERMINAL_TYPE not in", values, "terminalType");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeBetween(String value1, String value2) {
            addCriterion("CSP_TERMINAL_TYPE between", value1, value2, "terminalType");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeNotBetween(String value1, String value2) {
            addCriterion("CSP_TERMINAL_TYPE not between", value1, value2, "terminalType");
            return (Criteria) this;
        }

        public Criteria andCommTypeIsNull() {
            addCriterion("CSP_COMM_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCommTypeIsNotNull() {
            addCriterion("CSP_COMM_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCommTypeEqualTo(String value) {
            addCriterion("CSP_COMM_TYPE =", value, "commType");
            return (Criteria) this;
        }

        public Criteria andCommTypeNotEqualTo(String value) {
            addCriterion("CSP_COMM_TYPE <>", value, "commType");
            return (Criteria) this;
        }

        public Criteria andCommTypeGreaterThan(String value) {
            addCriterion("CSP_COMM_TYPE >", value, "commType");
            return (Criteria) this;
        }

        public Criteria andCommTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CSP_COMM_TYPE >=", value, "commType");
            return (Criteria) this;
        }

        public Criteria andCommTypeLessThan(String value) {
            addCriterion("CSP_COMM_TYPE <", value, "commType");
            return (Criteria) this;
        }

        public Criteria andCommTypeLessThanOrEqualTo(String value) {
            addCriterion("CSP_COMM_TYPE <=", value, "commType");
            return (Criteria) this;
        }

        public Criteria andCommTypeLike(String value) {
            addCriterion("CSP_COMM_TYPE like", value, "commType");
            return (Criteria) this;
        }

        public Criteria andCommTypeNotLike(String value) {
            addCriterion("CSP_COMM_TYPE not like", value, "commType");
            return (Criteria) this;
        }

        public Criteria andCommTypeIn(List<String> values) {
            addCriterion("CSP_COMM_TYPE in", values, "commType");
            return (Criteria) this;
        }

        public Criteria andCommTypeNotIn(List<String> values) {
            addCriterion("CSP_COMM_TYPE not in", values, "commType");
            return (Criteria) this;
        }

        public Criteria andCommTypeBetween(String value1, String value2) {
            addCriterion("CSP_COMM_TYPE between", value1, value2, "commType");
            return (Criteria) this;
        }

        public Criteria andCommTypeNotBetween(String value1, String value2) {
            addCriterion("CSP_COMM_TYPE not between", value1, value2, "commType");
            return (Criteria) this;
        }

        public Criteria andIdLikeInsensitive(String value) {
            addCriterion("upper(CSP_ID) like", value.toUpperCase(), "id");
            return (Criteria) this;
        }

        public Criteria andShipnoLikeInsensitive(String value) {
            addCriterion("upper(CSP_SHIPNO) like", value.toUpperCase(), "shipno");
            return (Criteria) this;
        }

        public Criteria andShipnameLikeInsensitive(String value) {
            addCriterion("upper(CSP_SHIPNAME) like", value.toUpperCase(), "shipname");
            return (Criteria) this;
        }

        public Criteria andShipportLikeInsensitive(String value) {
            addCriterion("upper(CSP_SHIPPORT) like", value.toUpperCase(), "shipport");
            return (Criteria) this;
        }

        public Criteria andRectimeLikeInsensitive(String value) {
            addCriterion("upper(CSP_RECTIME) like", value.toUpperCase(), "rectime");
            return (Criteria) this;
        }

        public Criteria andLonLikeInsensitive(String value) {
            addCriterion("upper(CSP_LON) like", value.toUpperCase(), "lon");
            return (Criteria) this;
        }

        public Criteria andLatLikeInsensitive(String value) {
            addCriterion("upper(CSP_LAT) like", value.toUpperCase(), "lat");
            return (Criteria) this;
        }

        public Criteria andPostypeLikeInsensitive(String value) {
            addCriterion("upper(CSP_POSTYPE) like", value.toUpperCase(), "postype");
            return (Criteria) this;
        }

        public Criteria andIdtLikeInsensitive(String value) {
            addCriterion("upper(CSP_IDT) like", value.toUpperCase(), "idt");
            return (Criteria) this;
        }

        public Criteria andPostimeLikeInsensitive(String value) {
            addCriterion("upper(CSP_POSTIME) like", value.toUpperCase(), "postime");
            return (Criteria) this;
        }

        public Criteria andDirectionLikeInsensitive(String value) {
            addCriterion("upper(CSP_DIRECTION) like", value.toUpperCase(), "direction");
            return (Criteria) this;
        }

        public Criteria andSpeedLikeInsensitive(String value) {
            addCriterion("upper(CSP_SPEED) like", value.toUpperCase(), "speed");
            return (Criteria) this;
        }

        public Criteria andBowLikeInsensitive(String value) {
            addCriterion("upper(CSP_BOW) like", value.toUpperCase(), "bow");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeLikeInsensitive(String value) {
            addCriterion("upper(CSP_TERMINAL_TYPE) like", value.toUpperCase(), "terminalType");
            return (Criteria) this;
        }

        public Criteria andCommTypeLikeInsensitive(String value) {
            addCriterion("upper(CSP_COMM_TYPE) like", value.toUpperCase(), "commType");
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