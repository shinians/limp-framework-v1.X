package com.limp.framework.boss.domain;

import com.limp.framework.core.bean.Pager;

import java.util.ArrayList;
import java.util.List;

public class UserExtExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Pager page;

    public UserExtExample() {
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
            addCriterion("USR_GUID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("USR_GUID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("USR_GUID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("USR_GUID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("USR_GUID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("USR_GUID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("USR_GUID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("USR_GUID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("USR_GUID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("USR_GUID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("USR_GUID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("USR_GUID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("USR_GUID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("USR_GUID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUsrFaceIsNull() {
            addCriterion("USR_FACE is null");
            return (Criteria) this;
        }

        public Criteria andUsrFaceIsNotNull() {
            addCriterion("USR_FACE is not null");
            return (Criteria) this;
        }

        public Criteria andUsrFaceEqualTo(String value) {
            addCriterion("USR_FACE =", value, "usrFace");
            return (Criteria) this;
        }

        public Criteria andUsrFaceNotEqualTo(String value) {
            addCriterion("USR_FACE <>", value, "usrFace");
            return (Criteria) this;
        }

        public Criteria andUsrFaceGreaterThan(String value) {
            addCriterion("USR_FACE >", value, "usrFace");
            return (Criteria) this;
        }

        public Criteria andUsrFaceGreaterThanOrEqualTo(String value) {
            addCriterion("USR_FACE >=", value, "usrFace");
            return (Criteria) this;
        }

        public Criteria andUsrFaceLessThan(String value) {
            addCriterion("USR_FACE <", value, "usrFace");
            return (Criteria) this;
        }

        public Criteria andUsrFaceLessThanOrEqualTo(String value) {
            addCriterion("USR_FACE <=", value, "usrFace");
            return (Criteria) this;
        }

        public Criteria andUsrFaceLike(String value) {
            addCriterion("USR_FACE like", value, "usrFace");
            return (Criteria) this;
        }

        public Criteria andUsrFaceNotLike(String value) {
            addCriterion("USR_FACE not like", value, "usrFace");
            return (Criteria) this;
        }

        public Criteria andUsrFaceIn(List<String> values) {
            addCriterion("USR_FACE in", values, "usrFace");
            return (Criteria) this;
        }

        public Criteria andUsrFaceNotIn(List<String> values) {
            addCriterion("USR_FACE not in", values, "usrFace");
            return (Criteria) this;
        }

        public Criteria andUsrFaceBetween(String value1, String value2) {
            addCriterion("USR_FACE between", value1, value2, "usrFace");
            return (Criteria) this;
        }

        public Criteria andUsrFaceNotBetween(String value1, String value2) {
            addCriterion("USR_FACE not between", value1, value2, "usrFace");
            return (Criteria) this;
        }

        public Criteria andUsrCompIsNull() {
            addCriterion("USR_COMP is null");
            return (Criteria) this;
        }

        public Criteria andUsrCompIsNotNull() {
            addCriterion("USR_COMP is not null");
            return (Criteria) this;
        }

        public Criteria andUsrCompEqualTo(String value) {
            addCriterion("USR_COMP =", value, "usrComp");
            return (Criteria) this;
        }

        public Criteria andUsrCompNotEqualTo(String value) {
            addCriterion("USR_COMP <>", value, "usrComp");
            return (Criteria) this;
        }

        public Criteria andUsrCompGreaterThan(String value) {
            addCriterion("USR_COMP >", value, "usrComp");
            return (Criteria) this;
        }

        public Criteria andUsrCompGreaterThanOrEqualTo(String value) {
            addCriterion("USR_COMP >=", value, "usrComp");
            return (Criteria) this;
        }

        public Criteria andUsrCompLessThan(String value) {
            addCriterion("USR_COMP <", value, "usrComp");
            return (Criteria) this;
        }

        public Criteria andUsrCompLessThanOrEqualTo(String value) {
            addCriterion("USR_COMP <=", value, "usrComp");
            return (Criteria) this;
        }

        public Criteria andUsrCompLike(String value) {
            addCriterion("USR_COMP like", value, "usrComp");
            return (Criteria) this;
        }

        public Criteria andUsrCompNotLike(String value) {
            addCriterion("USR_COMP not like", value, "usrComp");
            return (Criteria) this;
        }

        public Criteria andUsrCompIn(List<String> values) {
            addCriterion("USR_COMP in", values, "usrComp");
            return (Criteria) this;
        }

        public Criteria andUsrCompNotIn(List<String> values) {
            addCriterion("USR_COMP not in", values, "usrComp");
            return (Criteria) this;
        }

        public Criteria andUsrCompBetween(String value1, String value2) {
            addCriterion("USR_COMP between", value1, value2, "usrComp");
            return (Criteria) this;
        }

        public Criteria andUsrCompNotBetween(String value1, String value2) {
            addCriterion("USR_COMP not between", value1, value2, "usrComp");
            return (Criteria) this;
        }

        public Criteria andUsrRc6IsNull() {
            addCriterion("USR_RC6 is null");
            return (Criteria) this;
        }

        public Criteria andUsrRc6IsNotNull() {
            addCriterion("USR_RC6 is not null");
            return (Criteria) this;
        }

        public Criteria andUsrRc6EqualTo(String value) {
            addCriterion("USR_RC6 =", value, "usrRc6");
            return (Criteria) this;
        }

        public Criteria andUsrRc6NotEqualTo(String value) {
            addCriterion("USR_RC6 <>", value, "usrRc6");
            return (Criteria) this;
        }

        public Criteria andUsrRc6GreaterThan(String value) {
            addCriterion("USR_RC6 >", value, "usrRc6");
            return (Criteria) this;
        }

        public Criteria andUsrRc6GreaterThanOrEqualTo(String value) {
            addCriterion("USR_RC6 >=", value, "usrRc6");
            return (Criteria) this;
        }

        public Criteria andUsrRc6LessThan(String value) {
            addCriterion("USR_RC6 <", value, "usrRc6");
            return (Criteria) this;
        }

        public Criteria andUsrRc6LessThanOrEqualTo(String value) {
            addCriterion("USR_RC6 <=", value, "usrRc6");
            return (Criteria) this;
        }

        public Criteria andUsrRc6Like(String value) {
            addCriterion("USR_RC6 like", value, "usrRc6");
            return (Criteria) this;
        }

        public Criteria andUsrRc6NotLike(String value) {
            addCriterion("USR_RC6 not like", value, "usrRc6");
            return (Criteria) this;
        }

        public Criteria andUsrRc6In(List<String> values) {
            addCriterion("USR_RC6 in", values, "usrRc6");
            return (Criteria) this;
        }

        public Criteria andUsrRc6NotIn(List<String> values) {
            addCriterion("USR_RC6 not in", values, "usrRc6");
            return (Criteria) this;
        }

        public Criteria andUsrRc6Between(String value1, String value2) {
            addCriterion("USR_RC6 between", value1, value2, "usrRc6");
            return (Criteria) this;
        }

        public Criteria andUsrRc6NotBetween(String value1, String value2) {
            addCriterion("USR_RC6 not between", value1, value2, "usrRc6");
            return (Criteria) this;
        }

        public Criteria andUsrRc7IsNull() {
            addCriterion("USR_RC7 is null");
            return (Criteria) this;
        }

        public Criteria andUsrRc7IsNotNull() {
            addCriterion("USR_RC7 is not null");
            return (Criteria) this;
        }

        public Criteria andUsrRc7EqualTo(String value) {
            addCriterion("USR_RC7 =", value, "usrRc7");
            return (Criteria) this;
        }

        public Criteria andUsrRc7NotEqualTo(String value) {
            addCriterion("USR_RC7 <>", value, "usrRc7");
            return (Criteria) this;
        }

        public Criteria andUsrRc7GreaterThan(String value) {
            addCriterion("USR_RC7 >", value, "usrRc7");
            return (Criteria) this;
        }

        public Criteria andUsrRc7GreaterThanOrEqualTo(String value) {
            addCriterion("USR_RC7 >=", value, "usrRc7");
            return (Criteria) this;
        }

        public Criteria andUsrRc7LessThan(String value) {
            addCriterion("USR_RC7 <", value, "usrRc7");
            return (Criteria) this;
        }

        public Criteria andUsrRc7LessThanOrEqualTo(String value) {
            addCriterion("USR_RC7 <=", value, "usrRc7");
            return (Criteria) this;
        }

        public Criteria andUsrRc7Like(String value) {
            addCriterion("USR_RC7 like", value, "usrRc7");
            return (Criteria) this;
        }

        public Criteria andUsrRc7NotLike(String value) {
            addCriterion("USR_RC7 not like", value, "usrRc7");
            return (Criteria) this;
        }

        public Criteria andUsrRc7In(List<String> values) {
            addCriterion("USR_RC7 in", values, "usrRc7");
            return (Criteria) this;
        }

        public Criteria andUsrRc7NotIn(List<String> values) {
            addCriterion("USR_RC7 not in", values, "usrRc7");
            return (Criteria) this;
        }

        public Criteria andUsrRc7Between(String value1, String value2) {
            addCriterion("USR_RC7 between", value1, value2, "usrRc7");
            return (Criteria) this;
        }

        public Criteria andUsrRc7NotBetween(String value1, String value2) {
            addCriterion("USR_RC7 not between", value1, value2, "usrRc7");
            return (Criteria) this;
        }

        public Criteria andUsrRc8IsNull() {
            addCriterion("USR_RC8 is null");
            return (Criteria) this;
        }

        public Criteria andUsrRc8IsNotNull() {
            addCriterion("USR_RC8 is not null");
            return (Criteria) this;
        }

        public Criteria andUsrRc8EqualTo(String value) {
            addCriterion("USR_RC8 =", value, "usrRc8");
            return (Criteria) this;
        }

        public Criteria andUsrRc8NotEqualTo(String value) {
            addCriterion("USR_RC8 <>", value, "usrRc8");
            return (Criteria) this;
        }

        public Criteria andUsrRc8GreaterThan(String value) {
            addCriterion("USR_RC8 >", value, "usrRc8");
            return (Criteria) this;
        }

        public Criteria andUsrRc8GreaterThanOrEqualTo(String value) {
            addCriterion("USR_RC8 >=", value, "usrRc8");
            return (Criteria) this;
        }

        public Criteria andUsrRc8LessThan(String value) {
            addCriterion("USR_RC8 <", value, "usrRc8");
            return (Criteria) this;
        }

        public Criteria andUsrRc8LessThanOrEqualTo(String value) {
            addCriterion("USR_RC8 <=", value, "usrRc8");
            return (Criteria) this;
        }

        public Criteria andUsrRc8Like(String value) {
            addCriterion("USR_RC8 like", value, "usrRc8");
            return (Criteria) this;
        }

        public Criteria andUsrRc8NotLike(String value) {
            addCriterion("USR_RC8 not like", value, "usrRc8");
            return (Criteria) this;
        }

        public Criteria andUsrRc8In(List<String> values) {
            addCriterion("USR_RC8 in", values, "usrRc8");
            return (Criteria) this;
        }

        public Criteria andUsrRc8NotIn(List<String> values) {
            addCriterion("USR_RC8 not in", values, "usrRc8");
            return (Criteria) this;
        }

        public Criteria andUsrRc8Between(String value1, String value2) {
            addCriterion("USR_RC8 between", value1, value2, "usrRc8");
            return (Criteria) this;
        }

        public Criteria andUsrRc8NotBetween(String value1, String value2) {
            addCriterion("USR_RC8 not between", value1, value2, "usrRc8");
            return (Criteria) this;
        }

        public Criteria andUsrRc9IsNull() {
            addCriterion("USR_RC9 is null");
            return (Criteria) this;
        }

        public Criteria andUsrRc9IsNotNull() {
            addCriterion("USR_RC9 is not null");
            return (Criteria) this;
        }

        public Criteria andUsrRc9EqualTo(String value) {
            addCriterion("USR_RC9 =", value, "usrRc9");
            return (Criteria) this;
        }

        public Criteria andUsrRc9NotEqualTo(String value) {
            addCriterion("USR_RC9 <>", value, "usrRc9");
            return (Criteria) this;
        }

        public Criteria andUsrRc9GreaterThan(String value) {
            addCriterion("USR_RC9 >", value, "usrRc9");
            return (Criteria) this;
        }

        public Criteria andUsrRc9GreaterThanOrEqualTo(String value) {
            addCriterion("USR_RC9 >=", value, "usrRc9");
            return (Criteria) this;
        }

        public Criteria andUsrRc9LessThan(String value) {
            addCriterion("USR_RC9 <", value, "usrRc9");
            return (Criteria) this;
        }

        public Criteria andUsrRc9LessThanOrEqualTo(String value) {
            addCriterion("USR_RC9 <=", value, "usrRc9");
            return (Criteria) this;
        }

        public Criteria andUsrRc9Like(String value) {
            addCriterion("USR_RC9 like", value, "usrRc9");
            return (Criteria) this;
        }

        public Criteria andUsrRc9NotLike(String value) {
            addCriterion("USR_RC9 not like", value, "usrRc9");
            return (Criteria) this;
        }

        public Criteria andUsrRc9In(List<String> values) {
            addCriterion("USR_RC9 in", values, "usrRc9");
            return (Criteria) this;
        }

        public Criteria andUsrRc9NotIn(List<String> values) {
            addCriterion("USR_RC9 not in", values, "usrRc9");
            return (Criteria) this;
        }

        public Criteria andUsrRc9Between(String value1, String value2) {
            addCriterion("USR_RC9 between", value1, value2, "usrRc9");
            return (Criteria) this;
        }

        public Criteria andUsrRc9NotBetween(String value1, String value2) {
            addCriterion("USR_RC9 not between", value1, value2, "usrRc9");
            return (Criteria) this;
        }

        public Criteria andUsrRc10IsNull() {
            addCriterion("USR_RC10 is null");
            return (Criteria) this;
        }

        public Criteria andUsrRc10IsNotNull() {
            addCriterion("USR_RC10 is not null");
            return (Criteria) this;
        }

        public Criteria andUsrRc10EqualTo(String value) {
            addCriterion("USR_RC10 =", value, "usrRc10");
            return (Criteria) this;
        }

        public Criteria andUsrRc10NotEqualTo(String value) {
            addCriterion("USR_RC10 <>", value, "usrRc10");
            return (Criteria) this;
        }

        public Criteria andUsrRc10GreaterThan(String value) {
            addCriterion("USR_RC10 >", value, "usrRc10");
            return (Criteria) this;
        }

        public Criteria andUsrRc10GreaterThanOrEqualTo(String value) {
            addCriterion("USR_RC10 >=", value, "usrRc10");
            return (Criteria) this;
        }

        public Criteria andUsrRc10LessThan(String value) {
            addCriterion("USR_RC10 <", value, "usrRc10");
            return (Criteria) this;
        }

        public Criteria andUsrRc10LessThanOrEqualTo(String value) {
            addCriterion("USR_RC10 <=", value, "usrRc10");
            return (Criteria) this;
        }

        public Criteria andUsrRc10Like(String value) {
            addCriterion("USR_RC10 like", value, "usrRc10");
            return (Criteria) this;
        }

        public Criteria andUsrRc10NotLike(String value) {
            addCriterion("USR_RC10 not like", value, "usrRc10");
            return (Criteria) this;
        }

        public Criteria andUsrRc10In(List<String> values) {
            addCriterion("USR_RC10 in", values, "usrRc10");
            return (Criteria) this;
        }

        public Criteria andUsrRc10NotIn(List<String> values) {
            addCriterion("USR_RC10 not in", values, "usrRc10");
            return (Criteria) this;
        }

        public Criteria andUsrRc10Between(String value1, String value2) {
            addCriterion("USR_RC10 between", value1, value2, "usrRc10");
            return (Criteria) this;
        }

        public Criteria andUsrRc10NotBetween(String value1, String value2) {
            addCriterion("USR_RC10 not between", value1, value2, "usrRc10");
            return (Criteria) this;
        }

        public Criteria andUsrRc11IsNull() {
            addCriterion("USR_RC11 is null");
            return (Criteria) this;
        }

        public Criteria andUsrRc11IsNotNull() {
            addCriterion("USR_RC11 is not null");
            return (Criteria) this;
        }

        public Criteria andUsrRc11EqualTo(String value) {
            addCriterion("USR_RC11 =", value, "usrRc11");
            return (Criteria) this;
        }

        public Criteria andUsrRc11NotEqualTo(String value) {
            addCriterion("USR_RC11 <>", value, "usrRc11");
            return (Criteria) this;
        }

        public Criteria andUsrRc11GreaterThan(String value) {
            addCriterion("USR_RC11 >", value, "usrRc11");
            return (Criteria) this;
        }

        public Criteria andUsrRc11GreaterThanOrEqualTo(String value) {
            addCriterion("USR_RC11 >=", value, "usrRc11");
            return (Criteria) this;
        }

        public Criteria andUsrRc11LessThan(String value) {
            addCriterion("USR_RC11 <", value, "usrRc11");
            return (Criteria) this;
        }

        public Criteria andUsrRc11LessThanOrEqualTo(String value) {
            addCriterion("USR_RC11 <=", value, "usrRc11");
            return (Criteria) this;
        }

        public Criteria andUsrRc11Like(String value) {
            addCriterion("USR_RC11 like", value, "usrRc11");
            return (Criteria) this;
        }

        public Criteria andUsrRc11NotLike(String value) {
            addCriterion("USR_RC11 not like", value, "usrRc11");
            return (Criteria) this;
        }

        public Criteria andUsrRc11In(List<String> values) {
            addCriterion("USR_RC11 in", values, "usrRc11");
            return (Criteria) this;
        }

        public Criteria andUsrRc11NotIn(List<String> values) {
            addCriterion("USR_RC11 not in", values, "usrRc11");
            return (Criteria) this;
        }

        public Criteria andUsrRc11Between(String value1, String value2) {
            addCriterion("USR_RC11 between", value1, value2, "usrRc11");
            return (Criteria) this;
        }

        public Criteria andUsrRc11NotBetween(String value1, String value2) {
            addCriterion("USR_RC11 not between", value1, value2, "usrRc11");
            return (Criteria) this;
        }

        public Criteria andUsrRc12IsNull() {
            addCriterion("USR_RC12 is null");
            return (Criteria) this;
        }

        public Criteria andUsrRc12IsNotNull() {
            addCriterion("USR_RC12 is not null");
            return (Criteria) this;
        }

        public Criteria andUsrRc12EqualTo(String value) {
            addCriterion("USR_RC12 =", value, "usrRc12");
            return (Criteria) this;
        }

        public Criteria andUsrRc12NotEqualTo(String value) {
            addCriterion("USR_RC12 <>", value, "usrRc12");
            return (Criteria) this;
        }

        public Criteria andUsrRc12GreaterThan(String value) {
            addCriterion("USR_RC12 >", value, "usrRc12");
            return (Criteria) this;
        }

        public Criteria andUsrRc12GreaterThanOrEqualTo(String value) {
            addCriterion("USR_RC12 >=", value, "usrRc12");
            return (Criteria) this;
        }

        public Criteria andUsrRc12LessThan(String value) {
            addCriterion("USR_RC12 <", value, "usrRc12");
            return (Criteria) this;
        }

        public Criteria andUsrRc12LessThanOrEqualTo(String value) {
            addCriterion("USR_RC12 <=", value, "usrRc12");
            return (Criteria) this;
        }

        public Criteria andUsrRc12Like(String value) {
            addCriterion("USR_RC12 like", value, "usrRc12");
            return (Criteria) this;
        }

        public Criteria andUsrRc12NotLike(String value) {
            addCriterion("USR_RC12 not like", value, "usrRc12");
            return (Criteria) this;
        }

        public Criteria andUsrRc12In(List<String> values) {
            addCriterion("USR_RC12 in", values, "usrRc12");
            return (Criteria) this;
        }

        public Criteria andUsrRc12NotIn(List<String> values) {
            addCriterion("USR_RC12 not in", values, "usrRc12");
            return (Criteria) this;
        }

        public Criteria andUsrRc12Between(String value1, String value2) {
            addCriterion("USR_RC12 between", value1, value2, "usrRc12");
            return (Criteria) this;
        }

        public Criteria andUsrRc12NotBetween(String value1, String value2) {
            addCriterion("USR_RC12 not between", value1, value2, "usrRc12");
            return (Criteria) this;
        }

        public Criteria andUsrRc13IsNull() {
            addCriterion("USR_RC13 is null");
            return (Criteria) this;
        }

        public Criteria andUsrRc13IsNotNull() {
            addCriterion("USR_RC13 is not null");
            return (Criteria) this;
        }

        public Criteria andUsrRc13EqualTo(String value) {
            addCriterion("USR_RC13 =", value, "usrRc13");
            return (Criteria) this;
        }

        public Criteria andUsrRc13NotEqualTo(String value) {
            addCriterion("USR_RC13 <>", value, "usrRc13");
            return (Criteria) this;
        }

        public Criteria andUsrRc13GreaterThan(String value) {
            addCriterion("USR_RC13 >", value, "usrRc13");
            return (Criteria) this;
        }

        public Criteria andUsrRc13GreaterThanOrEqualTo(String value) {
            addCriterion("USR_RC13 >=", value, "usrRc13");
            return (Criteria) this;
        }

        public Criteria andUsrRc13LessThan(String value) {
            addCriterion("USR_RC13 <", value, "usrRc13");
            return (Criteria) this;
        }

        public Criteria andUsrRc13LessThanOrEqualTo(String value) {
            addCriterion("USR_RC13 <=", value, "usrRc13");
            return (Criteria) this;
        }

        public Criteria andUsrRc13Like(String value) {
            addCriterion("USR_RC13 like", value, "usrRc13");
            return (Criteria) this;
        }

        public Criteria andUsrRc13NotLike(String value) {
            addCriterion("USR_RC13 not like", value, "usrRc13");
            return (Criteria) this;
        }

        public Criteria andUsrRc13In(List<String> values) {
            addCriterion("USR_RC13 in", values, "usrRc13");
            return (Criteria) this;
        }

        public Criteria andUsrRc13NotIn(List<String> values) {
            addCriterion("USR_RC13 not in", values, "usrRc13");
            return (Criteria) this;
        }

        public Criteria andUsrRc13Between(String value1, String value2) {
            addCriterion("USR_RC13 between", value1, value2, "usrRc13");
            return (Criteria) this;
        }

        public Criteria andUsrRc13NotBetween(String value1, String value2) {
            addCriterion("USR_RC13 not between", value1, value2, "usrRc13");
            return (Criteria) this;
        }

        public Criteria andUsrRc14IsNull() {
            addCriterion("USR_RC14 is null");
            return (Criteria) this;
        }

        public Criteria andUsrRc14IsNotNull() {
            addCriterion("USR_RC14 is not null");
            return (Criteria) this;
        }

        public Criteria andUsrRc14EqualTo(String value) {
            addCriterion("USR_RC14 =", value, "usrRc14");
            return (Criteria) this;
        }

        public Criteria andUsrRc14NotEqualTo(String value) {
            addCriterion("USR_RC14 <>", value, "usrRc14");
            return (Criteria) this;
        }

        public Criteria andUsrRc14GreaterThan(String value) {
            addCriterion("USR_RC14 >", value, "usrRc14");
            return (Criteria) this;
        }

        public Criteria andUsrRc14GreaterThanOrEqualTo(String value) {
            addCriterion("USR_RC14 >=", value, "usrRc14");
            return (Criteria) this;
        }

        public Criteria andUsrRc14LessThan(String value) {
            addCriterion("USR_RC14 <", value, "usrRc14");
            return (Criteria) this;
        }

        public Criteria andUsrRc14LessThanOrEqualTo(String value) {
            addCriterion("USR_RC14 <=", value, "usrRc14");
            return (Criteria) this;
        }

        public Criteria andUsrRc14Like(String value) {
            addCriterion("USR_RC14 like", value, "usrRc14");
            return (Criteria) this;
        }

        public Criteria andUsrRc14NotLike(String value) {
            addCriterion("USR_RC14 not like", value, "usrRc14");
            return (Criteria) this;
        }

        public Criteria andUsrRc14In(List<String> values) {
            addCriterion("USR_RC14 in", values, "usrRc14");
            return (Criteria) this;
        }

        public Criteria andUsrRc14NotIn(List<String> values) {
            addCriterion("USR_RC14 not in", values, "usrRc14");
            return (Criteria) this;
        }

        public Criteria andUsrRc14Between(String value1, String value2) {
            addCriterion("USR_RC14 between", value1, value2, "usrRc14");
            return (Criteria) this;
        }

        public Criteria andUsrRc14NotBetween(String value1, String value2) {
            addCriterion("USR_RC14 not between", value1, value2, "usrRc14");
            return (Criteria) this;
        }

        public Criteria andUsrRc15IsNull() {
            addCriterion("USR_RC15 is null");
            return (Criteria) this;
        }

        public Criteria andUsrRc15IsNotNull() {
            addCriterion("USR_RC15 is not null");
            return (Criteria) this;
        }

        public Criteria andUsrRc15EqualTo(String value) {
            addCriterion("USR_RC15 =", value, "usrRc15");
            return (Criteria) this;
        }

        public Criteria andUsrRc15NotEqualTo(String value) {
            addCriterion("USR_RC15 <>", value, "usrRc15");
            return (Criteria) this;
        }

        public Criteria andUsrRc15GreaterThan(String value) {
            addCriterion("USR_RC15 >", value, "usrRc15");
            return (Criteria) this;
        }

        public Criteria andUsrRc15GreaterThanOrEqualTo(String value) {
            addCriterion("USR_RC15 >=", value, "usrRc15");
            return (Criteria) this;
        }

        public Criteria andUsrRc15LessThan(String value) {
            addCriterion("USR_RC15 <", value, "usrRc15");
            return (Criteria) this;
        }

        public Criteria andUsrRc15LessThanOrEqualTo(String value) {
            addCriterion("USR_RC15 <=", value, "usrRc15");
            return (Criteria) this;
        }

        public Criteria andUsrRc15Like(String value) {
            addCriterion("USR_RC15 like", value, "usrRc15");
            return (Criteria) this;
        }

        public Criteria andUsrRc15NotLike(String value) {
            addCriterion("USR_RC15 not like", value, "usrRc15");
            return (Criteria) this;
        }

        public Criteria andUsrRc15In(List<String> values) {
            addCriterion("USR_RC15 in", values, "usrRc15");
            return (Criteria) this;
        }

        public Criteria andUsrRc15NotIn(List<String> values) {
            addCriterion("USR_RC15 not in", values, "usrRc15");
            return (Criteria) this;
        }

        public Criteria andUsrRc15Between(String value1, String value2) {
            addCriterion("USR_RC15 between", value1, value2, "usrRc15");
            return (Criteria) this;
        }

        public Criteria andUsrRc15NotBetween(String value1, String value2) {
            addCriterion("USR_RC15 not between", value1, value2, "usrRc15");
            return (Criteria) this;
        }

        public Criteria andUsrRc16IsNull() {
            addCriterion("USR_RC16 is null");
            return (Criteria) this;
        }

        public Criteria andUsrRc16IsNotNull() {
            addCriterion("USR_RC16 is not null");
            return (Criteria) this;
        }

        public Criteria andUsrRc16EqualTo(String value) {
            addCriterion("USR_RC16 =", value, "usrRc16");
            return (Criteria) this;
        }

        public Criteria andUsrRc16NotEqualTo(String value) {
            addCriterion("USR_RC16 <>", value, "usrRc16");
            return (Criteria) this;
        }

        public Criteria andUsrRc16GreaterThan(String value) {
            addCriterion("USR_RC16 >", value, "usrRc16");
            return (Criteria) this;
        }

        public Criteria andUsrRc16GreaterThanOrEqualTo(String value) {
            addCriterion("USR_RC16 >=", value, "usrRc16");
            return (Criteria) this;
        }

        public Criteria andUsrRc16LessThan(String value) {
            addCriterion("USR_RC16 <", value, "usrRc16");
            return (Criteria) this;
        }

        public Criteria andUsrRc16LessThanOrEqualTo(String value) {
            addCriterion("USR_RC16 <=", value, "usrRc16");
            return (Criteria) this;
        }

        public Criteria andUsrRc16Like(String value) {
            addCriterion("USR_RC16 like", value, "usrRc16");
            return (Criteria) this;
        }

        public Criteria andUsrRc16NotLike(String value) {
            addCriterion("USR_RC16 not like", value, "usrRc16");
            return (Criteria) this;
        }

        public Criteria andUsrRc16In(List<String> values) {
            addCriterion("USR_RC16 in", values, "usrRc16");
            return (Criteria) this;
        }

        public Criteria andUsrRc16NotIn(List<String> values) {
            addCriterion("USR_RC16 not in", values, "usrRc16");
            return (Criteria) this;
        }

        public Criteria andUsrRc16Between(String value1, String value2) {
            addCriterion("USR_RC16 between", value1, value2, "usrRc16");
            return (Criteria) this;
        }

        public Criteria andUsrRc16NotBetween(String value1, String value2) {
            addCriterion("USR_RC16 not between", value1, value2, "usrRc16");
            return (Criteria) this;
        }

        public Criteria andUsrRc17IsNull() {
            addCriterion("USR_RC17 is null");
            return (Criteria) this;
        }

        public Criteria andUsrRc17IsNotNull() {
            addCriterion("USR_RC17 is not null");
            return (Criteria) this;
        }

        public Criteria andUsrRc17EqualTo(String value) {
            addCriterion("USR_RC17 =", value, "usrRc17");
            return (Criteria) this;
        }

        public Criteria andUsrRc17NotEqualTo(String value) {
            addCriterion("USR_RC17 <>", value, "usrRc17");
            return (Criteria) this;
        }

        public Criteria andUsrRc17GreaterThan(String value) {
            addCriterion("USR_RC17 >", value, "usrRc17");
            return (Criteria) this;
        }

        public Criteria andUsrRc17GreaterThanOrEqualTo(String value) {
            addCriterion("USR_RC17 >=", value, "usrRc17");
            return (Criteria) this;
        }

        public Criteria andUsrRc17LessThan(String value) {
            addCriterion("USR_RC17 <", value, "usrRc17");
            return (Criteria) this;
        }

        public Criteria andUsrRc17LessThanOrEqualTo(String value) {
            addCriterion("USR_RC17 <=", value, "usrRc17");
            return (Criteria) this;
        }

        public Criteria andUsrRc17Like(String value) {
            addCriterion("USR_RC17 like", value, "usrRc17");
            return (Criteria) this;
        }

        public Criteria andUsrRc17NotLike(String value) {
            addCriterion("USR_RC17 not like", value, "usrRc17");
            return (Criteria) this;
        }

        public Criteria andUsrRc17In(List<String> values) {
            addCriterion("USR_RC17 in", values, "usrRc17");
            return (Criteria) this;
        }

        public Criteria andUsrRc17NotIn(List<String> values) {
            addCriterion("USR_RC17 not in", values, "usrRc17");
            return (Criteria) this;
        }

        public Criteria andUsrRc17Between(String value1, String value2) {
            addCriterion("USR_RC17 between", value1, value2, "usrRc17");
            return (Criteria) this;
        }

        public Criteria andUsrRc17NotBetween(String value1, String value2) {
            addCriterion("USR_RC17 not between", value1, value2, "usrRc17");
            return (Criteria) this;
        }

        public Criteria andUsrRc18IsNull() {
            addCriterion("USR_RC18 is null");
            return (Criteria) this;
        }

        public Criteria andUsrRc18IsNotNull() {
            addCriterion("USR_RC18 is not null");
            return (Criteria) this;
        }

        public Criteria andUsrRc18EqualTo(Integer value) {
            addCriterion("USR_RC18 =", value, "usrRc18");
            return (Criteria) this;
        }

        public Criteria andUsrRc18NotEqualTo(Integer value) {
            addCriterion("USR_RC18 <>", value, "usrRc18");
            return (Criteria) this;
        }

        public Criteria andUsrRc18GreaterThan(Integer value) {
            addCriterion("USR_RC18 >", value, "usrRc18");
            return (Criteria) this;
        }

        public Criteria andUsrRc18GreaterThanOrEqualTo(Integer value) {
            addCriterion("USR_RC18 >=", value, "usrRc18");
            return (Criteria) this;
        }

        public Criteria andUsrRc18LessThan(Integer value) {
            addCriterion("USR_RC18 <", value, "usrRc18");
            return (Criteria) this;
        }

        public Criteria andUsrRc18LessThanOrEqualTo(Integer value) {
            addCriterion("USR_RC18 <=", value, "usrRc18");
            return (Criteria) this;
        }

        public Criteria andUsrRc18In(List<Integer> values) {
            addCriterion("USR_RC18 in", values, "usrRc18");
            return (Criteria) this;
        }

        public Criteria andUsrRc18NotIn(List<Integer> values) {
            addCriterion("USR_RC18 not in", values, "usrRc18");
            return (Criteria) this;
        }

        public Criteria andUsrRc18Between(Integer value1, Integer value2) {
            addCriterion("USR_RC18 between", value1, value2, "usrRc18");
            return (Criteria) this;
        }

        public Criteria andUsrRc18NotBetween(Integer value1, Integer value2) {
            addCriterion("USR_RC18 not between", value1, value2, "usrRc18");
            return (Criteria) this;
        }

        public Criteria andUsrRc19IsNull() {
            addCriterion("USR_RC19 is null");
            return (Criteria) this;
        }

        public Criteria andUsrRc19IsNotNull() {
            addCriterion("USR_RC19 is not null");
            return (Criteria) this;
        }

        public Criteria andUsrRc19EqualTo(Integer value) {
            addCriterion("USR_RC19 =", value, "usrRc19");
            return (Criteria) this;
        }

        public Criteria andUsrRc19NotEqualTo(Integer value) {
            addCriterion("USR_RC19 <>", value, "usrRc19");
            return (Criteria) this;
        }

        public Criteria andUsrRc19GreaterThan(Integer value) {
            addCriterion("USR_RC19 >", value, "usrRc19");
            return (Criteria) this;
        }

        public Criteria andUsrRc19GreaterThanOrEqualTo(Integer value) {
            addCriterion("USR_RC19 >=", value, "usrRc19");
            return (Criteria) this;
        }

        public Criteria andUsrRc19LessThan(Integer value) {
            addCriterion("USR_RC19 <", value, "usrRc19");
            return (Criteria) this;
        }

        public Criteria andUsrRc19LessThanOrEqualTo(Integer value) {
            addCriterion("USR_RC19 <=", value, "usrRc19");
            return (Criteria) this;
        }

        public Criteria andUsrRc19In(List<Integer> values) {
            addCriterion("USR_RC19 in", values, "usrRc19");
            return (Criteria) this;
        }

        public Criteria andUsrRc19NotIn(List<Integer> values) {
            addCriterion("USR_RC19 not in", values, "usrRc19");
            return (Criteria) this;
        }

        public Criteria andUsrRc19Between(Integer value1, Integer value2) {
            addCriterion("USR_RC19 between", value1, value2, "usrRc19");
            return (Criteria) this;
        }

        public Criteria andUsrRc19NotBetween(Integer value1, Integer value2) {
            addCriterion("USR_RC19 not between", value1, value2, "usrRc19");
            return (Criteria) this;
        }

        public Criteria andUsrRc20IsNull() {
            addCriterion("USR_RC20 is null");
            return (Criteria) this;
        }

        public Criteria andUsrRc20IsNotNull() {
            addCriterion("USR_RC20 is not null");
            return (Criteria) this;
        }

        public Criteria andUsrRc20EqualTo(Integer value) {
            addCriterion("USR_RC20 =", value, "usrRc20");
            return (Criteria) this;
        }

        public Criteria andUsrRc20NotEqualTo(Integer value) {
            addCriterion("USR_RC20 <>", value, "usrRc20");
            return (Criteria) this;
        }

        public Criteria andUsrRc20GreaterThan(Integer value) {
            addCriterion("USR_RC20 >", value, "usrRc20");
            return (Criteria) this;
        }

        public Criteria andUsrRc20GreaterThanOrEqualTo(Integer value) {
            addCriterion("USR_RC20 >=", value, "usrRc20");
            return (Criteria) this;
        }

        public Criteria andUsrRc20LessThan(Integer value) {
            addCriterion("USR_RC20 <", value, "usrRc20");
            return (Criteria) this;
        }

        public Criteria andUsrRc20LessThanOrEqualTo(Integer value) {
            addCriterion("USR_RC20 <=", value, "usrRc20");
            return (Criteria) this;
        }

        public Criteria andUsrRc20In(List<Integer> values) {
            addCriterion("USR_RC20 in", values, "usrRc20");
            return (Criteria) this;
        }

        public Criteria andUsrRc20NotIn(List<Integer> values) {
            addCriterion("USR_RC20 not in", values, "usrRc20");
            return (Criteria) this;
        }

        public Criteria andUsrRc20Between(Integer value1, Integer value2) {
            addCriterion("USR_RC20 between", value1, value2, "usrRc20");
            return (Criteria) this;
        }

        public Criteria andUsrRc20NotBetween(Integer value1, Integer value2) {
            addCriterion("USR_RC20 not between", value1, value2, "usrRc20");
            return (Criteria) this;
        }

        public Criteria andIdLikeInsensitive(String value) {
            addCriterion("upper(USR_GUID) like", value.toUpperCase(), "id");
            return (Criteria) this;
        }

        public Criteria andUsrFaceLikeInsensitive(String value) {
            addCriterion("upper(USR_FACE) like", value.toUpperCase(), "usrFace");
            return (Criteria) this;
        }

        public Criteria andUsrCompLikeInsensitive(String value) {
            addCriterion("upper(USR_COMP) like", value.toUpperCase(), "usrComp");
            return (Criteria) this;
        }

        public Criteria andUsrRc6LikeInsensitive(String value) {
            addCriterion("upper(USR_RC6) like", value.toUpperCase(), "usrRc6");
            return (Criteria) this;
        }

        public Criteria andUsrRc7LikeInsensitive(String value) {
            addCriterion("upper(USR_RC7) like", value.toUpperCase(), "usrRc7");
            return (Criteria) this;
        }

        public Criteria andUsrRc8LikeInsensitive(String value) {
            addCriterion("upper(USR_RC8) like", value.toUpperCase(), "usrRc8");
            return (Criteria) this;
        }

        public Criteria andUsrRc9LikeInsensitive(String value) {
            addCriterion("upper(USR_RC9) like", value.toUpperCase(), "usrRc9");
            return (Criteria) this;
        }

        public Criteria andUsrRc10LikeInsensitive(String value) {
            addCriterion("upper(USR_RC10) like", value.toUpperCase(), "usrRc10");
            return (Criteria) this;
        }

        public Criteria andUsrRc11LikeInsensitive(String value) {
            addCriterion("upper(USR_RC11) like", value.toUpperCase(), "usrRc11");
            return (Criteria) this;
        }

        public Criteria andUsrRc12LikeInsensitive(String value) {
            addCriterion("upper(USR_RC12) like", value.toUpperCase(), "usrRc12");
            return (Criteria) this;
        }

        public Criteria andUsrRc13LikeInsensitive(String value) {
            addCriterion("upper(USR_RC13) like", value.toUpperCase(), "usrRc13");
            return (Criteria) this;
        }

        public Criteria andUsrRc14LikeInsensitive(String value) {
            addCriterion("upper(USR_RC14) like", value.toUpperCase(), "usrRc14");
            return (Criteria) this;
        }

        public Criteria andUsrRc15LikeInsensitive(String value) {
            addCriterion("upper(USR_RC15) like", value.toUpperCase(), "usrRc15");
            return (Criteria) this;
        }

        public Criteria andUsrRc16LikeInsensitive(String value) {
            addCriterion("upper(USR_RC16) like", value.toUpperCase(), "usrRc16");
            return (Criteria) this;
        }

        public Criteria andUsrRc17LikeInsensitive(String value) {
            addCriterion("upper(USR_RC17) like", value.toUpperCase(), "usrRc17");
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