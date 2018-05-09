package com.chinasofti.domain;

import com.limp.framework.core.bean.Pager;

import java.util.ArrayList;
import java.util.List;

public class DicCodeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Pager page;

    public DicCodeExample() {
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

        public Criteria andDictCateIsNull() {
            addCriterion("DICT_CATE is null");
            return (Criteria) this;
        }

        public Criteria andDictCateIsNotNull() {
            addCriterion("DICT_CATE is not null");
            return (Criteria) this;
        }

        public Criteria andDictCateEqualTo(String value) {
            addCriterion("DICT_CATE =", value, "dictCate");
            return (Criteria) this;
        }

        public Criteria andDictCateNotEqualTo(String value) {
            addCriterion("DICT_CATE <>", value, "dictCate");
            return (Criteria) this;
        }

        public Criteria andDictCateGreaterThan(String value) {
            addCriterion("DICT_CATE >", value, "dictCate");
            return (Criteria) this;
        }

        public Criteria andDictCateGreaterThanOrEqualTo(String value) {
            addCriterion("DICT_CATE >=", value, "dictCate");
            return (Criteria) this;
        }

        public Criteria andDictCateLessThan(String value) {
            addCriterion("DICT_CATE <", value, "dictCate");
            return (Criteria) this;
        }

        public Criteria andDictCateLessThanOrEqualTo(String value) {
            addCriterion("DICT_CATE <=", value, "dictCate");
            return (Criteria) this;
        }

        public Criteria andDictCateLike(String value) {
            addCriterion("DICT_CATE like", value, "dictCate");
            return (Criteria) this;
        }

        public Criteria andDictCateNotLike(String value) {
            addCriterion("DICT_CATE not like", value, "dictCate");
            return (Criteria) this;
        }

        public Criteria andDictCateIn(List<String> values) {
            addCriterion("DICT_CATE in", values, "dictCate");
            return (Criteria) this;
        }

        public Criteria andDictCateNotIn(List<String> values) {
            addCriterion("DICT_CATE not in", values, "dictCate");
            return (Criteria) this;
        }

        public Criteria andDictCateBetween(String value1, String value2) {
            addCriterion("DICT_CATE between", value1, value2, "dictCate");
            return (Criteria) this;
        }

        public Criteria andDictCateNotBetween(String value1, String value2) {
            addCriterion("DICT_CATE not between", value1, value2, "dictCate");
            return (Criteria) this;
        }

        public Criteria andDictdataNameIsNull() {
            addCriterion("DICTDATA_NAME is null");
            return (Criteria) this;
        }

        public Criteria andDictdataNameIsNotNull() {
            addCriterion("DICTDATA_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andDictdataNameEqualTo(String value) {
            addCriterion("DICTDATA_NAME =", value, "dictdataName");
            return (Criteria) this;
        }

        public Criteria andDictdataNameNotEqualTo(String value) {
            addCriterion("DICTDATA_NAME <>", value, "dictdataName");
            return (Criteria) this;
        }

        public Criteria andDictdataNameGreaterThan(String value) {
            addCriterion("DICTDATA_NAME >", value, "dictdataName");
            return (Criteria) this;
        }

        public Criteria andDictdataNameGreaterThanOrEqualTo(String value) {
            addCriterion("DICTDATA_NAME >=", value, "dictdataName");
            return (Criteria) this;
        }

        public Criteria andDictdataNameLessThan(String value) {
            addCriterion("DICTDATA_NAME <", value, "dictdataName");
            return (Criteria) this;
        }

        public Criteria andDictdataNameLessThanOrEqualTo(String value) {
            addCriterion("DICTDATA_NAME <=", value, "dictdataName");
            return (Criteria) this;
        }

        public Criteria andDictdataNameLike(String value) {
            addCriterion("DICTDATA_NAME like", value, "dictdataName");
            return (Criteria) this;
        }

        public Criteria andDictdataNameNotLike(String value) {
            addCriterion("DICTDATA_NAME not like", value, "dictdataName");
            return (Criteria) this;
        }

        public Criteria andDictdataNameIn(List<String> values) {
            addCriterion("DICTDATA_NAME in", values, "dictdataName");
            return (Criteria) this;
        }

        public Criteria andDictdataNameNotIn(List<String> values) {
            addCriterion("DICTDATA_NAME not in", values, "dictdataName");
            return (Criteria) this;
        }

        public Criteria andDictdataNameBetween(String value1, String value2) {
            addCriterion("DICTDATA_NAME between", value1, value2, "dictdataName");
            return (Criteria) this;
        }

        public Criteria andDictdataNameNotBetween(String value1, String value2) {
            addCriterion("DICTDATA_NAME not between", value1, value2, "dictdataName");
            return (Criteria) this;
        }

        public Criteria andDictdataValueIsNull() {
            addCriterion("DICTDATA_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andDictdataValueIsNotNull() {
            addCriterion("DICTDATA_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andDictdataValueEqualTo(String value) {
            addCriterion("DICTDATA_VALUE =", value, "dictdataValue");
            return (Criteria) this;
        }

        public Criteria andDictdataValueNotEqualTo(String value) {
            addCriterion("DICTDATA_VALUE <>", value, "dictdataValue");
            return (Criteria) this;
        }

        public Criteria andDictdataValueGreaterThan(String value) {
            addCriterion("DICTDATA_VALUE >", value, "dictdataValue");
            return (Criteria) this;
        }

        public Criteria andDictdataValueGreaterThanOrEqualTo(String value) {
            addCriterion("DICTDATA_VALUE >=", value, "dictdataValue");
            return (Criteria) this;
        }

        public Criteria andDictdataValueLessThan(String value) {
            addCriterion("DICTDATA_VALUE <", value, "dictdataValue");
            return (Criteria) this;
        }

        public Criteria andDictdataValueLessThanOrEqualTo(String value) {
            addCriterion("DICTDATA_VALUE <=", value, "dictdataValue");
            return (Criteria) this;
        }

        public Criteria andDictdataValueLike(String value) {
            addCriterion("DICTDATA_VALUE like", value, "dictdataValue");
            return (Criteria) this;
        }

        public Criteria andDictdataValueNotLike(String value) {
            addCriterion("DICTDATA_VALUE not like", value, "dictdataValue");
            return (Criteria) this;
        }

        public Criteria andDictdataValueIn(List<String> values) {
            addCriterion("DICTDATA_VALUE in", values, "dictdataValue");
            return (Criteria) this;
        }

        public Criteria andDictdataValueNotIn(List<String> values) {
            addCriterion("DICTDATA_VALUE not in", values, "dictdataValue");
            return (Criteria) this;
        }

        public Criteria andDictdataValueBetween(String value1, String value2) {
            addCriterion("DICTDATA_VALUE between", value1, value2, "dictdataValue");
            return (Criteria) this;
        }

        public Criteria andDictdataValueNotBetween(String value1, String value2) {
            addCriterion("DICTDATA_VALUE not between", value1, value2, "dictdataValue");
            return (Criteria) this;
        }

        public Criteria andDictIntroIsNull() {
            addCriterion("DICT_INTRO is null");
            return (Criteria) this;
        }

        public Criteria andDictIntroIsNotNull() {
            addCriterion("DICT_INTRO is not null");
            return (Criteria) this;
        }

        public Criteria andDictIntroEqualTo(String value) {
            addCriterion("DICT_INTRO =", value, "dictIntro");
            return (Criteria) this;
        }

        public Criteria andDictIntroNotEqualTo(String value) {
            addCriterion("DICT_INTRO <>", value, "dictIntro");
            return (Criteria) this;
        }

        public Criteria andDictIntroGreaterThan(String value) {
            addCriterion("DICT_INTRO >", value, "dictIntro");
            return (Criteria) this;
        }

        public Criteria andDictIntroGreaterThanOrEqualTo(String value) {
            addCriterion("DICT_INTRO >=", value, "dictIntro");
            return (Criteria) this;
        }

        public Criteria andDictIntroLessThan(String value) {
            addCriterion("DICT_INTRO <", value, "dictIntro");
            return (Criteria) this;
        }

        public Criteria andDictIntroLessThanOrEqualTo(String value) {
            addCriterion("DICT_INTRO <=", value, "dictIntro");
            return (Criteria) this;
        }

        public Criteria andDictIntroLike(String value) {
            addCriterion("DICT_INTRO like", value, "dictIntro");
            return (Criteria) this;
        }

        public Criteria andDictIntroNotLike(String value) {
            addCriterion("DICT_INTRO not like", value, "dictIntro");
            return (Criteria) this;
        }

        public Criteria andDictIntroIn(List<String> values) {
            addCriterion("DICT_INTRO in", values, "dictIntro");
            return (Criteria) this;
        }

        public Criteria andDictIntroNotIn(List<String> values) {
            addCriterion("DICT_INTRO not in", values, "dictIntro");
            return (Criteria) this;
        }

        public Criteria andDictIntroBetween(String value1, String value2) {
            addCriterion("DICT_INTRO between", value1, value2, "dictIntro");
            return (Criteria) this;
        }

        public Criteria andDictIntroNotBetween(String value1, String value2) {
            addCriterion("DICT_INTRO not between", value1, value2, "dictIntro");
            return (Criteria) this;
        }

        public Criteria andDictStatueIsNull() {
            addCriterion("DICT_STATUE is null");
            return (Criteria) this;
        }

        public Criteria andDictStatueIsNotNull() {
            addCriterion("DICT_STATUE is not null");
            return (Criteria) this;
        }

        public Criteria andDictStatueEqualTo(String value) {
            addCriterion("DICT_STATUE =", value, "dictStatue");
            return (Criteria) this;
        }

        public Criteria andDictStatueNotEqualTo(String value) {
            addCriterion("DICT_STATUE <>", value, "dictStatue");
            return (Criteria) this;
        }

        public Criteria andDictStatueGreaterThan(String value) {
            addCriterion("DICT_STATUE >", value, "dictStatue");
            return (Criteria) this;
        }

        public Criteria andDictStatueGreaterThanOrEqualTo(String value) {
            addCriterion("DICT_STATUE >=", value, "dictStatue");
            return (Criteria) this;
        }

        public Criteria andDictStatueLessThan(String value) {
            addCriterion("DICT_STATUE <", value, "dictStatue");
            return (Criteria) this;
        }

        public Criteria andDictStatueLessThanOrEqualTo(String value) {
            addCriterion("DICT_STATUE <=", value, "dictStatue");
            return (Criteria) this;
        }

        public Criteria andDictStatueLike(String value) {
            addCriterion("DICT_STATUE like", value, "dictStatue");
            return (Criteria) this;
        }

        public Criteria andDictStatueNotLike(String value) {
            addCriterion("DICT_STATUE not like", value, "dictStatue");
            return (Criteria) this;
        }

        public Criteria andDictStatueIn(List<String> values) {
            addCriterion("DICT_STATUE in", values, "dictStatue");
            return (Criteria) this;
        }

        public Criteria andDictStatueNotIn(List<String> values) {
            addCriterion("DICT_STATUE not in", values, "dictStatue");
            return (Criteria) this;
        }

        public Criteria andDictStatueBetween(String value1, String value2) {
            addCriterion("DICT_STATUE between", value1, value2, "dictStatue");
            return (Criteria) this;
        }

        public Criteria andDictStatueNotBetween(String value1, String value2) {
            addCriterion("DICT_STATUE not between", value1, value2, "dictStatue");
            return (Criteria) this;
        }

        public Criteria andDictPvalueIsNull() {
            addCriterion("DICT_PVALUE is null");
            return (Criteria) this;
        }

        public Criteria andDictPvalueIsNotNull() {
            addCriterion("DICT_PVALUE is not null");
            return (Criteria) this;
        }

        public Criteria andDictPvalueEqualTo(String value) {
            addCriterion("DICT_PVALUE =", value, "dictPvalue");
            return (Criteria) this;
        }

        public Criteria andDictPvalueNotEqualTo(String value) {
            addCriterion("DICT_PVALUE <>", value, "dictPvalue");
            return (Criteria) this;
        }

        public Criteria andDictPvalueGreaterThan(String value) {
            addCriterion("DICT_PVALUE >", value, "dictPvalue");
            return (Criteria) this;
        }

        public Criteria andDictPvalueGreaterThanOrEqualTo(String value) {
            addCriterion("DICT_PVALUE >=", value, "dictPvalue");
            return (Criteria) this;
        }

        public Criteria andDictPvalueLessThan(String value) {
            addCriterion("DICT_PVALUE <", value, "dictPvalue");
            return (Criteria) this;
        }

        public Criteria andDictPvalueLessThanOrEqualTo(String value) {
            addCriterion("DICT_PVALUE <=", value, "dictPvalue");
            return (Criteria) this;
        }

        public Criteria andDictPvalueLike(String value) {
            addCriterion("DICT_PVALUE like", value, "dictPvalue");
            return (Criteria) this;
        }

        public Criteria andDictPvalueNotLike(String value) {
            addCriterion("DICT_PVALUE not like", value, "dictPvalue");
            return (Criteria) this;
        }

        public Criteria andDictPvalueIn(List<String> values) {
            addCriterion("DICT_PVALUE in", values, "dictPvalue");
            return (Criteria) this;
        }

        public Criteria andDictPvalueNotIn(List<String> values) {
            addCriterion("DICT_PVALUE not in", values, "dictPvalue");
            return (Criteria) this;
        }

        public Criteria andDictPvalueBetween(String value1, String value2) {
            addCriterion("DICT_PVALUE between", value1, value2, "dictPvalue");
            return (Criteria) this;
        }

        public Criteria andDictPvalueNotBetween(String value1, String value2) {
            addCriterion("DICT_PVALUE not between", value1, value2, "dictPvalue");
            return (Criteria) this;
        }

        public Criteria andDictSortIsNull() {
            addCriterion("DICT_SORT is null");
            return (Criteria) this;
        }

        public Criteria andDictSortIsNotNull() {
            addCriterion("DICT_SORT is not null");
            return (Criteria) this;
        }

        public Criteria andDictSortEqualTo(Short value) {
            addCriterion("DICT_SORT =", value, "dictSort");
            return (Criteria) this;
        }

        public Criteria andDictSortNotEqualTo(Short value) {
            addCriterion("DICT_SORT <>", value, "dictSort");
            return (Criteria) this;
        }

        public Criteria andDictSortGreaterThan(Short value) {
            addCriterion("DICT_SORT >", value, "dictSort");
            return (Criteria) this;
        }

        public Criteria andDictSortGreaterThanOrEqualTo(Short value) {
            addCriterion("DICT_SORT >=", value, "dictSort");
            return (Criteria) this;
        }

        public Criteria andDictSortLessThan(Short value) {
            addCriterion("DICT_SORT <", value, "dictSort");
            return (Criteria) this;
        }

        public Criteria andDictSortLessThanOrEqualTo(Short value) {
            addCriterion("DICT_SORT <=", value, "dictSort");
            return (Criteria) this;
        }

        public Criteria andDictSortIn(List<Short> values) {
            addCriterion("DICT_SORT in", values, "dictSort");
            return (Criteria) this;
        }

        public Criteria andDictSortNotIn(List<Short> values) {
            addCriterion("DICT_SORT not in", values, "dictSort");
            return (Criteria) this;
        }

        public Criteria andDictSortBetween(Short value1, Short value2) {
            addCriterion("DICT_SORT between", value1, value2, "dictSort");
            return (Criteria) this;
        }

        public Criteria andDictSortNotBetween(Short value1, Short value2) {
            addCriterion("DICT_SORT not between", value1, value2, "dictSort");
            return (Criteria) this;
        }

        public Criteria andDictCateLikeInsensitive(String value) {
            addCriterion("upper(DICT_CATE) like", value.toUpperCase(), "dictCate");
            return (Criteria) this;
        }

        public Criteria andDictdataNameLikeInsensitive(String value) {
            addCriterion("upper(DICTDATA_NAME) like", value.toUpperCase(), "dictdataName");
            return (Criteria) this;
        }

        public Criteria andDictdataValueLikeInsensitive(String value) {
            addCriterion("upper(DICTDATA_VALUE) like", value.toUpperCase(), "dictdataValue");
            return (Criteria) this;
        }

        public Criteria andDictIntroLikeInsensitive(String value) {
            addCriterion("upper(DICT_INTRO) like", value.toUpperCase(), "dictIntro");
            return (Criteria) this;
        }

        public Criteria andDictStatueLikeInsensitive(String value) {
            addCriterion("upper(DICT_STATUE) like", value.toUpperCase(), "dictStatue");
            return (Criteria) this;
        }

        public Criteria andDictPvalueLikeInsensitive(String value) {
            addCriterion("upper(DICT_PVALUE) like", value.toUpperCase(), "dictPvalue");
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