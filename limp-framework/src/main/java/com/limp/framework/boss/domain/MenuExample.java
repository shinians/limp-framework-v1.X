package com.limp.framework.boss.domain;


import com.limp.framework.core.bean.Pager;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MenuExample {

    protected String orderByClause;

    protected Pager page;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MenuExample() {
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

    public void setPage(Pager page) {
        this.page = page;
    }

    public Pager getPage() {
        return page;
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("MEN_GUID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("MEN_GUID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("MEN_GUID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("MEN_GUID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("MEN_GUID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("MEN_GUID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("MEN_GUID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("MEN_GUID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("MEN_GUID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("MEN_GUID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("MEN_GUID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("MEN_GUID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("MEN_GUID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("MEN_GUID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andMenSsmguidIsNull() {
            addCriterion("MEN_SSMGUID is null");
            return (Criteria) this;
        }

        public Criteria andMenSsmguidIsNotNull() {
            addCriterion("MEN_SSMGUID is not null");
            return (Criteria) this;
        }

        public Criteria andMenSsmguidEqualTo(String value) {
            addCriterion("MEN_SSMGUID =", value, "menSsmguid");
            return (Criteria) this;
        }

        public Criteria andMenSsmguidNotEqualTo(String value) {
            addCriterion("MEN_SSMGUID <>", value, "menSsmguid");
            return (Criteria) this;
        }

        public Criteria andMenSsmguidGreaterThan(String value) {
            addCriterion("MEN_SSMGUID >", value, "menSsmguid");
            return (Criteria) this;
        }

        public Criteria andMenSsmguidGreaterThanOrEqualTo(String value) {
            addCriterion("MEN_SSMGUID >=", value, "menSsmguid");
            return (Criteria) this;
        }

        public Criteria andMenSsmguidLessThan(String value) {
            addCriterion("MEN_SSMGUID <", value, "menSsmguid");
            return (Criteria) this;
        }

        public Criteria andMenSsmguidLessThanOrEqualTo(String value) {
            addCriterion("MEN_SSMGUID <=", value, "menSsmguid");
            return (Criteria) this;
        }

        public Criteria andMenSsmguidLike(String value) {
            addCriterion("MEN_SSMGUID like", value, "menSsmguid");
            return (Criteria) this;
        }

        public Criteria andMenSsmguidNotLike(String value) {
            addCriterion("MEN_SSMGUID not like", value, "menSsmguid");
            return (Criteria) this;
        }

        public Criteria andMenSsmguidIn(List<String> values) {
            addCriterion("MEN_SSMGUID in", values, "menSsmguid");
            return (Criteria) this;
        }

        public Criteria andMenSsmguidNotIn(List<String> values) {
            addCriterion("MEN_SSMGUID not in", values, "menSsmguid");
            return (Criteria) this;
        }

        public Criteria andMenSsmguidBetween(String value1, String value2) {
            addCriterion("MEN_SSMGUID between", value1, value2, "menSsmguid");
            return (Criteria) this;
        }

        public Criteria andMenSsmguidNotBetween(String value1, String value2) {
            addCriterion("MEN_SSMGUID not between", value1, value2, "menSsmguid");
            return (Criteria) this;
        }

        public Criteria andMenNameIsNull() {
            addCriterion("MEN_NAME is null");
            return (Criteria) this;
        }

        public Criteria andMenNameIsNotNull() {
            addCriterion("MEN_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andMenNameEqualTo(String value) {
            addCriterion("MEN_NAME =", value, "menName");
            return (Criteria) this;
        }

        public Criteria andMenNameNotEqualTo(String value) {
            addCriterion("MEN_NAME <>", value, "menName");
            return (Criteria) this;
        }

        public Criteria andMenNameGreaterThan(String value) {
            addCriterion("MEN_NAME >", value, "menName");
            return (Criteria) this;
        }

        public Criteria andMenNameGreaterThanOrEqualTo(String value) {
            addCriterion("MEN_NAME >=", value, "menName");
            return (Criteria) this;
        }

        public Criteria andMenNameLessThan(String value) {
            addCriterion("MEN_NAME <", value, "menName");
            return (Criteria) this;
        }

        public Criteria andMenNameLessThanOrEqualTo(String value) {
            addCriterion("MEN_NAME <=", value, "menName");
            return (Criteria) this;
        }

        public Criteria andMenNameLike(String value) {
            addCriterion("MEN_NAME like", value, "menName");
            return (Criteria) this;
        }

        public Criteria andMenNameNotLike(String value) {
            addCriterion("MEN_NAME not like", value, "menName");
            return (Criteria) this;
        }

        public Criteria andMenNameIn(List<String> values) {
            addCriterion("MEN_NAME in", values, "menName");
            return (Criteria) this;
        }

        public Criteria andMenNameNotIn(List<String> values) {
            addCriterion("MEN_NAME not in", values, "menName");
            return (Criteria) this;
        }

        public Criteria andMenNameBetween(String value1, String value2) {
            addCriterion("MEN_NAME between", value1, value2, "menName");
            return (Criteria) this;
        }

        public Criteria andMenNameNotBetween(String value1, String value2) {
            addCriterion("MEN_NAME not between", value1, value2, "menName");
            return (Criteria) this;
        }

        public Criteria andMenDescIsNull() {
            addCriterion("MEN_DESC is null");
            return (Criteria) this;
        }

        public Criteria andMenDescIsNotNull() {
            addCriterion("MEN_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andMenDescEqualTo(String value) {
            addCriterion("MEN_DESC =", value, "menDesc");
            return (Criteria) this;
        }

        public Criteria andMenDescNotEqualTo(String value) {
            addCriterion("MEN_DESC <>", value, "menDesc");
            return (Criteria) this;
        }

        public Criteria andMenDescGreaterThan(String value) {
            addCriterion("MEN_DESC >", value, "menDesc");
            return (Criteria) this;
        }

        public Criteria andMenDescGreaterThanOrEqualTo(String value) {
            addCriterion("MEN_DESC >=", value, "menDesc");
            return (Criteria) this;
        }

        public Criteria andMenDescLessThan(String value) {
            addCriterion("MEN_DESC <", value, "menDesc");
            return (Criteria) this;
        }

        public Criteria andMenDescLessThanOrEqualTo(String value) {
            addCriterion("MEN_DESC <=", value, "menDesc");
            return (Criteria) this;
        }

        public Criteria andMenDescLike(String value) {
            addCriterion("MEN_DESC like", value, "menDesc");
            return (Criteria) this;
        }

        public Criteria andMenDescNotLike(String value) {
            addCriterion("MEN_DESC not like", value, "menDesc");
            return (Criteria) this;
        }

        public Criteria andMenDescIn(List<String> values) {
            addCriterion("MEN_DESC in", values, "menDesc");
            return (Criteria) this;
        }

        public Criteria andMenDescNotIn(List<String> values) {
            addCriterion("MEN_DESC not in", values, "menDesc");
            return (Criteria) this;
        }

        public Criteria andMenDescBetween(String value1, String value2) {
            addCriterion("MEN_DESC between", value1, value2, "menDesc");
            return (Criteria) this;
        }

        public Criteria andMenDescNotBetween(String value1, String value2) {
            addCriterion("MEN_DESC not between", value1, value2, "menDesc");
            return (Criteria) this;
        }

        public Criteria andMenTypeIsNull() {
            addCriterion("MEN_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andMenTypeIsNotNull() {
            addCriterion("MEN_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andMenTypeEqualTo(Integer value) {
            addCriterion("MEN_TYPE =", value, "menType");
            return (Criteria) this;
        }

        public Criteria andMenTypeNotEqualTo(Integer value) {
            addCriterion("MEN_TYPE <>", value, "menType");
            return (Criteria) this;
        }

        public Criteria andMenTypeGreaterThan(Integer value) {
            addCriterion("MEN_TYPE >", value, "menType");
            return (Criteria) this;
        }

        public Criteria andMenTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("MEN_TYPE >=", value, "menType");
            return (Criteria) this;
        }

        public Criteria andMenTypeLessThan(Integer value) {
            addCriterion("MEN_TYPE <", value, "menType");
            return (Criteria) this;
        }

        public Criteria andMenTypeLessThanOrEqualTo(Integer value) {
            addCriterion("MEN_TYPE <=", value, "menType");
            return (Criteria) this;
        }

        public Criteria andMenTypeIn(List<Integer> values) {
            addCriterion("MEN_TYPE in", values, "menType");
            return (Criteria) this;
        }

        public Criteria andMenTypeNotIn(List<Integer> values) {
            addCriterion("MEN_TYPE not in", values, "menType");
            return (Criteria) this;
        }

        public Criteria andMenTypeBetween(Integer value1, Integer value2) {
            addCriterion("MEN_TYPE between", value1, value2, "menType");
            return (Criteria) this;
        }

        public Criteria andMenTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("MEN_TYPE not between", value1, value2, "menType");
            return (Criteria) this;
        }

        public Criteria andMenFatheridIsNull() {
            addCriterion("MEN_FATHERID is null");
            return (Criteria) this;
        }

        public Criteria andMenFatheridIsNotNull() {
            addCriterion("MEN_FATHERID is not null");
            return (Criteria) this;
        }

        public Criteria andMenFatheridEqualTo(String value) {
            addCriterion("MEN_FATHERID =", value, "menFatherid");
            return (Criteria) this;
        }

        public Criteria andMenFatheridNotEqualTo(String value) {
            addCriterion("MEN_FATHERID <>", value, "menFatherid");
            return (Criteria) this;
        }

        public Criteria andMenFatheridGreaterThan(String value) {
            addCriterion("MEN_FATHERID >", value, "menFatherid");
            return (Criteria) this;
        }

        public Criteria andMenFatheridGreaterThanOrEqualTo(String value) {
            addCriterion("MEN_FATHERID >=", value, "menFatherid");
            return (Criteria) this;
        }

        public Criteria andMenFatheridLessThan(String value) {
            addCriterion("MEN_FATHERID <", value, "menFatherid");
            return (Criteria) this;
        }

        public Criteria andMenFatheridLessThanOrEqualTo(String value) {
            addCriterion("MEN_FATHERID <=", value, "menFatherid");
            return (Criteria) this;
        }

        public Criteria andMenFatheridLike(String value) {
            addCriterion("MEN_FATHERID like", value, "menFatherid");
            return (Criteria) this;
        }

        public Criteria andMenFatheridNotLike(String value) {
            addCriterion("MEN_FATHERID not like", value, "menFatherid");
            return (Criteria) this;
        }

        public Criteria andMenFatheridIn(List<String> values) {
            addCriterion("MEN_FATHERID in", values, "menFatherid");
            return (Criteria) this;
        }

        public Criteria andMenFatheridNotIn(List<String> values) {
            addCriterion("MEN_FATHERID not in", values, "menFatherid");
            return (Criteria) this;
        }

        public Criteria andMenFatheridBetween(String value1, String value2) {
            addCriterion("MEN_FATHERID between", value1, value2, "menFatherid");
            return (Criteria) this;
        }

        public Criteria andMenFatheridNotBetween(String value1, String value2) {
            addCriterion("MEN_FATHERID not between", value1, value2, "menFatherid");
            return (Criteria) this;
        }

        public Criteria andMenUrlIsNull() {
            addCriterion("MEN_URL is null");
            return (Criteria) this;
        }

        public Criteria andMenUrlIsNotNull() {
            addCriterion("MEN_URL is not null");
            return (Criteria) this;
        }

        public Criteria andMenUrlEqualTo(String value) {
            addCriterion("MEN_URL =", value, "menUrl");
            return (Criteria) this;
        }

        public Criteria andMenUrlNotEqualTo(String value) {
            addCriterion("MEN_URL <>", value, "menUrl");
            return (Criteria) this;
        }

        public Criteria andMenUrlGreaterThan(String value) {
            addCriterion("MEN_URL >", value, "menUrl");
            return (Criteria) this;
        }

        public Criteria andMenUrlGreaterThanOrEqualTo(String value) {
            addCriterion("MEN_URL >=", value, "menUrl");
            return (Criteria) this;
        }

        public Criteria andMenUrlLessThan(String value) {
            addCriterion("MEN_URL <", value, "menUrl");
            return (Criteria) this;
        }

        public Criteria andMenUrlLessThanOrEqualTo(String value) {
            addCriterion("MEN_URL <=", value, "menUrl");
            return (Criteria) this;
        }

        public Criteria andMenUrlLike(String value) {
            addCriterion("MEN_URL like", value, "menUrl");
            return (Criteria) this;
        }

        public Criteria andMenUrlNotLike(String value) {
            addCriterion("MEN_URL not like", value, "menUrl");
            return (Criteria) this;
        }

        public Criteria andMenUrlIn(List<String> values) {
            addCriterion("MEN_URL in", values, "menUrl");
            return (Criteria) this;
        }

        public Criteria andMenUrlNotIn(List<String> values) {
            addCriterion("MEN_URL not in", values, "menUrl");
            return (Criteria) this;
        }

        public Criteria andMenUrlBetween(String value1, String value2) {
            addCriterion("MEN_URL between", value1, value2, "menUrl");
            return (Criteria) this;
        }

        public Criteria andMenUrlNotBetween(String value1, String value2) {
            addCriterion("MEN_URL not between", value1, value2, "menUrl");
            return (Criteria) this;
        }

        public Criteria andMenImgUrlIsNull() {
            addCriterion("MEN_IMGURL is null");
            return (Criteria) this;
        }

        public Criteria andMenImgUrlIsNotNull() {
            addCriterion("MEN_IMGURL is not null");
            return (Criteria) this;
        }

        public Criteria andMenImgUrlEqualTo(String value) {
            addCriterion("MEN_IMGURL =", value, "menImgUrl");
            return (Criteria) this;
        }

        public Criteria andMenImgUrlNotEqualTo(String value) {
            addCriterion("MEN_IMGURL <>", value, "menImgUrl");
            return (Criteria) this;
        }

        public Criteria andMenImgUrlGreaterThan(String value) {
            addCriterion("MEN_IMGURL >", value, "menImgUrl");
            return (Criteria) this;
        }

        public Criteria andMenImgUrlGreaterThanOrEqualTo(String value) {
            addCriterion("MEN_IMGURL >=", value, "menImgUrl");
            return (Criteria) this;
        }

        public Criteria andMenImgUrlLessThan(String value) {
            addCriterion("MEN_IMGURL <", value, "menImgUrl");
            return (Criteria) this;
        }

        public Criteria andMenImgUrlLessThanOrEqualTo(String value) {
            addCriterion("MEN_IMGURL <=", value, "menImgUrl");
            return (Criteria) this;
        }

        public Criteria andMenImgUrlLike(String value) {
            addCriterion("MEN_IMGURL like", value, "menImgUrl");
            return (Criteria) this;
        }

        public Criteria andMenImgUrlNotLike(String value) {
            addCriterion("MEN_IMGURL not like", value, "menImgUrl");
            return (Criteria) this;
        }

        public Criteria andMenImgUrlIn(List<String> values) {
            addCriterion("MEN_IMGURL in", values, "menImgUrl");
            return (Criteria) this;
        }

        public Criteria andMenImgUrlNotIn(List<String> values) {
            addCriterion("MEN_IMGURL not in", values, "menImgUrl");
            return (Criteria) this;
        }

        public Criteria andMenImgUrlBetween(String value1, String value2) {
            addCriterion("MEN_IMGURL between", value1, value2, "menImgUrl");
            return (Criteria) this;
        }

        public Criteria andMenImgUrlNotBetween(String value1, String value2) {
            addCriterion("MEN_IMGURL not between", value1, value2, "menImgUrl");
            return (Criteria) this;
        }

        public Criteria andMenSortIsNull() {
            addCriterion("MEN_SORT is null");
            return (Criteria) this;
        }

        public Criteria andMenSortIsNotNull() {
            addCriterion("MEN_SORT is not null");
            return (Criteria) this;
        }

        public Criteria andMenSortEqualTo(Integer value) {
            addCriterion("MEN_SORT =", value, "menSort");
            return (Criteria) this;
        }

        public Criteria andMenSortNotEqualTo(Integer value) {
            addCriterion("MEN_SORT <>", value, "menSort");
            return (Criteria) this;
        }

        public Criteria andMenSortGreaterThan(Integer value) {
            addCriterion("MEN_SORT >", value, "menSort");
            return (Criteria) this;
        }

        public Criteria andMenSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("MEN_SORT >=", value, "menSort");
            return (Criteria) this;
        }

        public Criteria andMenSortLessThan(Integer value) {
            addCriterion("MEN_SORT <", value, "menSort");
            return (Criteria) this;
        }

        public Criteria andMenSortLessThanOrEqualTo(Integer value) {
            addCriterion("MEN_SORT <=", value, "menSort");
            return (Criteria) this;
        }

        public Criteria andMenSortIn(List<Integer> values) {
            addCriterion("MEN_SORT in", values, "menSort");
            return (Criteria) this;
        }

        public Criteria andMenSortNotIn(List<Integer> values) {
            addCriterion("MEN_SORT not in", values, "menSort");
            return (Criteria) this;
        }

        public Criteria andMenSortBetween(Integer value1, Integer value2) {
            addCriterion("MEN_SORT between", value1, value2, "menSort");
            return (Criteria) this;
        }

        public Criteria andMenSortNotBetween(Integer value1, Integer value2) {
            addCriterion("MEN_SORT not between", value1, value2, "menSort");
            return (Criteria) this;
        }

        public Criteria andMenCreatedateIsNull() {
            addCriterion("MEN_CREATEDATE is null");
            return (Criteria) this;
        }

        public Criteria andMenCreatedateIsNotNull() {
            addCriterion("MEN_CREATEDATE is not null");
            return (Criteria) this;
        }

        public Criteria andMenCreatedateEqualTo(Date value) {
            addCriterionForJDBCDate("MEN_CREATEDATE =", value, "menCreatedate");
            return (Criteria) this;
        }

        public Criteria andMenCreatedateNotEqualTo(Date value) {
            addCriterionForJDBCDate("MEN_CREATEDATE <>", value, "menCreatedate");
            return (Criteria) this;
        }

        public Criteria andMenCreatedateGreaterThan(Date value) {
            addCriterionForJDBCDate("MEN_CREATEDATE >", value, "menCreatedate");
            return (Criteria) this;
        }

        public Criteria andMenCreatedateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("MEN_CREATEDATE >=", value, "menCreatedate");
            return (Criteria) this;
        }

        public Criteria andMenCreatedateLessThan(Date value) {
            addCriterionForJDBCDate("MEN_CREATEDATE <", value, "menCreatedate");
            return (Criteria) this;
        }

        public Criteria andMenCreatedateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("MEN_CREATEDATE <=", value, "menCreatedate");
            return (Criteria) this;
        }

        public Criteria andMenCreatedateIn(List<Date> values) {
            addCriterionForJDBCDate("MEN_CREATEDATE in", values, "menCreatedate");
            return (Criteria) this;
        }

        public Criteria andMenCreatedateNotIn(List<Date> values) {
            addCriterionForJDBCDate("MEN_CREATEDATE not in", values, "menCreatedate");
            return (Criteria) this;
        }

        public Criteria andMenCreatedateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("MEN_CREATEDATE between", value1, value2, "menCreatedate");
            return (Criteria) this;
        }

        public Criteria andMenCreatedateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("MEN_CREATEDATE not between", value1, value2, "menCreatedate");
            return (Criteria) this;
        }

        public Criteria andMenUpdatetimeIsNull() {
            addCriterion("MEN_UPDATETIME is null");
            return (Criteria) this;
        }

        public Criteria andMenUpdatetimeIsNotNull() {
            addCriterion("MEN_UPDATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andMenUpdatetimeEqualTo(Date value) {
            addCriterionForJDBCDate("MEN_UPDATETIME =", value, "menUpdatetime");
            return (Criteria) this;
        }

        public Criteria andMenUpdatetimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("MEN_UPDATETIME <>", value, "menUpdatetime");
            return (Criteria) this;
        }

        public Criteria andMenUpdatetimeGreaterThan(Date value) {
            addCriterionForJDBCDate("MEN_UPDATETIME >", value, "menUpdatetime");
            return (Criteria) this;
        }

        public Criteria andMenUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("MEN_UPDATETIME >=", value, "menUpdatetime");
            return (Criteria) this;
        }

        public Criteria andMenUpdatetimeLessThan(Date value) {
            addCriterionForJDBCDate("MEN_UPDATETIME <", value, "menUpdatetime");
            return (Criteria) this;
        }

        public Criteria andMenUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("MEN_UPDATETIME <=", value, "menUpdatetime");
            return (Criteria) this;
        }

        public Criteria andMenUpdatetimeIn(List<Date> values) {
            addCriterionForJDBCDate("MEN_UPDATETIME in", values, "menUpdatetime");
            return (Criteria) this;
        }

        public Criteria andMenUpdatetimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("MEN_UPDATETIME not in", values, "menUpdatetime");
            return (Criteria) this;
        }

        public Criteria andMenUpdatetimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("MEN_UPDATETIME between", value1, value2, "menUpdatetime");
            return (Criteria) this;
        }

        public Criteria andMenUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("MEN_UPDATETIME not between", value1, value2, "menUpdatetime");
            return (Criteria) this;
        }

        public Criteria andMenHintsIsNull() {
            addCriterion("MEN_HINTS is null");
            return (Criteria) this;
        }

        public Criteria andMenHintsIsNotNull() {
            addCriterion("MEN_HINTS is not null");
            return (Criteria) this;
        }

        public Criteria andMenHintsEqualTo(Integer value) {
            addCriterion("MEN_HINTS =", value, "menHints");
            return (Criteria) this;
        }

        public Criteria andMenHintsNotEqualTo(Integer value) {
            addCriterion("MEN_HINTS <>", value, "menHints");
            return (Criteria) this;
        }

        public Criteria andMenHintsGreaterThan(Integer value) {
            addCriterion("MEN_HINTS >", value, "menHints");
            return (Criteria) this;
        }

        public Criteria andMenHintsGreaterThanOrEqualTo(Integer value) {
            addCriterion("MEN_HINTS >=", value, "menHints");
            return (Criteria) this;
        }

        public Criteria andMenHintsLessThan(Integer value) {
            addCriterion("MEN_HINTS <", value, "menHints");
            return (Criteria) this;
        }

        public Criteria andMenHintsLessThanOrEqualTo(Integer value) {
            addCriterion("MEN_HINTS <=", value, "menHints");
            return (Criteria) this;
        }

        public Criteria andMenHintsIn(List<Integer> values) {
            addCriterion("MEN_HINTS in", values, "menHints");
            return (Criteria) this;
        }

        public Criteria andMenHintsNotIn(List<Integer> values) {
            addCriterion("MEN_HINTS not in", values, "menHints");
            return (Criteria) this;
        }

        public Criteria andMenHintsBetween(Integer value1, Integer value2) {
            addCriterion("MEN_HINTS between", value1, value2, "menHints");
            return (Criteria) this;
        }

        public Criteria andMenHintsNotBetween(Integer value1, Integer value2) {
            addCriterion("MEN_HINTS not between", value1, value2, "menHints");
            return (Criteria) this;
        }

        public Criteria andMenStateIsNull() {
            addCriterion("MEN_STATE is null");
            return (Criteria) this;
        }

        public Criteria andMenStateIsNotNull() {
            addCriterion("MEN_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andMenStateEqualTo(Integer value) {
            addCriterion("MEN_STATE =", value, "menState");
            return (Criteria) this;
        }

        public Criteria andMenStateNotEqualTo(Integer value) {
            addCriterion("MEN_STATE <>", value, "menState");
            return (Criteria) this;
        }

        public Criteria andMenStateGreaterThan(Integer value) {
            addCriterion("MEN_STATE >", value, "menState");
            return (Criteria) this;
        }

        public Criteria andMenStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("MEN_STATE >=", value, "menState");
            return (Criteria) this;
        }

        public Criteria andMenStateLessThan(Integer value) {
            addCriterion("MEN_STATE <", value, "menState");
            return (Criteria) this;
        }

        public Criteria andMenStateLessThanOrEqualTo(Integer value) {
            addCriterion("MEN_STATE <=", value, "menState");
            return (Criteria) this;
        }

        public Criteria andMenStateIn(List<Integer> values) {
            addCriterion("MEN_STATE in", values, "menState");
            return (Criteria) this;
        }

        public Criteria andMenStateNotIn(List<Integer> values) {
            addCriterion("MEN_STATE not in", values, "menState");
            return (Criteria) this;
        }

        public Criteria andMenStateBetween(Integer value1, Integer value2) {
            addCriterion("MEN_STATE between", value1, value2, "menState");
            return (Criteria) this;
        }

        public Criteria andMenStateNotBetween(Integer value1, Integer value2) {
            addCriterion("MEN_STATE not between", value1, value2, "menState");
            return (Criteria) this;
        }

        public Criteria andMenFieldIsNull() {
            addCriterion("MEN_FIELD is null");
            return (Criteria) this;
        }

        public Criteria andMenFieldIsNotNull() {
            addCriterion("MEN_FIELD is not null");
            return (Criteria) this;
        }

        public Criteria andMenFieldEqualTo(String value) {
            addCriterion("MEN_FIELD =", value, "menField");
            return (Criteria) this;
        }

        public Criteria andMenFieldNotEqualTo(String value) {
            addCriterion("MEN_FIELD <>", value, "menField");
            return (Criteria) this;
        }

        public Criteria andMenFieldGreaterThan(String value) {
            addCriterion("MEN_FIELD >", value, "menField");
            return (Criteria) this;
        }

        public Criteria andMenFieldGreaterThanOrEqualTo(String value) {
            addCriterion("MEN_FIELD >=", value, "menField");
            return (Criteria) this;
        }

        public Criteria andMenFieldLessThan(String value) {
            addCriterion("MEN_FIELD <", value, "menField");
            return (Criteria) this;
        }

        public Criteria andMenFieldLessThanOrEqualTo(String value) {
            addCriterion("MEN_FIELD <=", value, "menField");
            return (Criteria) this;
        }

        public Criteria andMenFieldLike(String value) {
            addCriterion("MEN_FIELD like", value, "menField");
            return (Criteria) this;
        }

        public Criteria andMenFieldNotLike(String value) {
            addCriterion("MEN_FIELD not like", value, "menField");
            return (Criteria) this;
        }

        public Criteria andMenFieldIn(List<String> values) {
            addCriterion("MEN_FIELD in", values, "menField");
            return (Criteria) this;
        }

        public Criteria andMenFieldNotIn(List<String> values) {
            addCriterion("MEN_FIELD not in", values, "menField");
            return (Criteria) this;
        }

        public Criteria andMenFieldBetween(String value1, String value2) {
            addCriterion("MEN_FIELD between", value1, value2, "menField");
            return (Criteria) this;
        }

        public Criteria andMenFieldNotBetween(String value1, String value2) {
            addCriterion("MEN_FIELD not between", value1, value2, "menField");
            return (Criteria) this;
        }

        public Criteria andMenKeywordIsNull() {
            addCriterion("MEN_KEYWORD is null");
            return (Criteria) this;
        }

        public Criteria andMenKeywordIsNotNull() {
            addCriterion("MEN_KEYWORD is not null");
            return (Criteria) this;
        }

        public Criteria andMenKeywordEqualTo(String value) {
            addCriterion("MEN_KEYWORD =", value, "menKeyword");
            return (Criteria) this;
        }

        public Criteria andMenKeywordNotEqualTo(String value) {
            addCriterion("MEN_KEYWORD <>", value, "menKeyword");
            return (Criteria) this;
        }

        public Criteria andMenKeywordGreaterThan(String value) {
            addCriterion("MEN_KEYWORD >", value, "menKeyword");
            return (Criteria) this;
        }

        public Criteria andMenKeywordGreaterThanOrEqualTo(String value) {
            addCriterion("MEN_KEYWORD >=", value, "menKeyword");
            return (Criteria) this;
        }

        public Criteria andMenKeywordLessThan(String value) {
            addCriterion("MEN_KEYWORD <", value, "menKeyword");
            return (Criteria) this;
        }

        public Criteria andMenKeywordLessThanOrEqualTo(String value) {
            addCriterion("MEN_KEYWORD <=", value, "menKeyword");
            return (Criteria) this;
        }

        public Criteria andMenKeywordLike(String value) {
            addCriterion("MEN_KEYWORD like", value, "menKeyword");
            return (Criteria) this;
        }

        public Criteria andMenKeywordNotLike(String value) {
            addCriterion("MEN_KEYWORD not like", value, "menKeyword");
            return (Criteria) this;
        }

        public Criteria andMenKeywordIn(List<String> values) {
            addCriterion("MEN_KEYWORD in", values, "menKeyword");
            return (Criteria) this;
        }

        public Criteria andMenKeywordNotIn(List<String> values) {
            addCriterion("MEN_KEYWORD not in", values, "menKeyword");
            return (Criteria) this;
        }

        public Criteria andMenKeywordBetween(String value1, String value2) {
            addCriterion("MEN_KEYWORD between", value1, value2, "menKeyword");
            return (Criteria) this;
        }

        public Criteria andMenKeywordNotBetween(String value1, String value2) {
            addCriterion("MEN_KEYWORD not between", value1, value2, "menKeyword");
            return (Criteria) this;
        }

        public Criteria andMenDatasourceIsNull() {
            addCriterion("MEN_DATASOURCE is null");
            return (Criteria) this;
        }

        public Criteria andMenDatasourceIsNotNull() {
            addCriterion("MEN_DATASOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andMenDatasourceEqualTo(String value) {
            addCriterion("MEN_DATASOURCE =", value, "menDatasource");
            return (Criteria) this;
        }

        public Criteria andMenDatasourceNotEqualTo(String value) {
            addCriterion("MEN_DATASOURCE <>", value, "menDatasource");
            return (Criteria) this;
        }

        public Criteria andMenDatasourceGreaterThan(String value) {
            addCriterion("MEN_DATASOURCE >", value, "menDatasource");
            return (Criteria) this;
        }

        public Criteria andMenDatasourceGreaterThanOrEqualTo(String value) {
            addCriterion("MEN_DATASOURCE >=", value, "menDatasource");
            return (Criteria) this;
        }

        public Criteria andMenDatasourceLessThan(String value) {
            addCriterion("MEN_DATASOURCE <", value, "menDatasource");
            return (Criteria) this;
        }

        public Criteria andMenDatasourceLessThanOrEqualTo(String value) {
            addCriterion("MEN_DATASOURCE <=", value, "menDatasource");
            return (Criteria) this;
        }

        public Criteria andMenDatasourceLike(String value) {
            addCriterion("MEN_DATASOURCE like", value, "menDatasource");
            return (Criteria) this;
        }

        public Criteria andMenDatasourceNotLike(String value) {
            addCriterion("MEN_DATASOURCE not like", value, "menDatasource");
            return (Criteria) this;
        }

        public Criteria andMenDatasourceIn(List<String> values) {
            addCriterion("MEN_DATASOURCE in", values, "menDatasource");
            return (Criteria) this;
        }

        public Criteria andMenDatasourceNotIn(List<String> values) {
            addCriterion("MEN_DATASOURCE not in", values, "menDatasource");
            return (Criteria) this;
        }

        public Criteria andMenDatasourceBetween(String value1, String value2) {
            addCriterion("MEN_DATASOURCE between", value1, value2, "menDatasource");
            return (Criteria) this;
        }

        public Criteria andMenDatasourceNotBetween(String value1, String value2) {
            addCriterion("MEN_DATASOURCE not between", value1, value2, "menDatasource");
            return (Criteria) this;
        }

        public Criteria andMenRc0IsNull() {
            addCriterion("MEN_RC0 is null");
            return (Criteria) this;
        }

        public Criteria andMenRc0IsNotNull() {
            addCriterion("MEN_RC0 is not null");
            return (Criteria) this;
        }

        public Criteria andMenRc0EqualTo(String value) {
            addCriterion("MEN_RC0 =", value, "menRc0");
            return (Criteria) this;
        }

        public Criteria andMenRc0NotEqualTo(String value) {
            addCriterion("MEN_RC0 <>", value, "menRc0");
            return (Criteria) this;
        }

        public Criteria andMenRc0GreaterThan(String value) {
            addCriterion("MEN_RC0 >", value, "menRc0");
            return (Criteria) this;
        }

        public Criteria andMenRc0GreaterThanOrEqualTo(String value) {
            addCriterion("MEN_RC0 >=", value, "menRc0");
            return (Criteria) this;
        }

        public Criteria andMenRc0LessThan(String value) {
            addCriterion("MEN_RC0 <", value, "menRc0");
            return (Criteria) this;
        }

        public Criteria andMenRc0LessThanOrEqualTo(String value) {
            addCriterion("MEN_RC0 <=", value, "menRc0");
            return (Criteria) this;
        }

        public Criteria andMenRc0Like(String value) {
            addCriterion("MEN_RC0 like", value, "menRc0");
            return (Criteria) this;
        }

        public Criteria andMenRc0NotLike(String value) {
            addCriterion("MEN_RC0 not like", value, "menRc0");
            return (Criteria) this;
        }

        public Criteria andMenRc0In(List<String> values) {
            addCriterion("MEN_RC0 in", values, "menRc0");
            return (Criteria) this;
        }

        public Criteria andMenRc0NotIn(List<String> values) {
            addCriterion("MEN_RC0 not in", values, "menRc0");
            return (Criteria) this;
        }

        public Criteria andMenRc0Between(String value1, String value2) {
            addCriterion("MEN_RC0 between", value1, value2, "menRc0");
            return (Criteria) this;
        }

        public Criteria andMenRc0NotBetween(String value1, String value2) {
            addCriterion("MEN_RC0 not between", value1, value2, "menRc0");
            return (Criteria) this;
        }

        public Criteria andMenRc1IsNull() {
            addCriterion("MEN_RC1 is null");
            return (Criteria) this;
        }

        public Criteria andMenRc1IsNotNull() {
            addCriterion("MEN_RC1 is not null");
            return (Criteria) this;
        }

        public Criteria andMenRc1EqualTo(String value) {
            addCriterion("MEN_RC1 =", value, "menRc1");
            return (Criteria) this;
        }

        public Criteria andMenRc1NotEqualTo(String value) {
            addCriterion("MEN_RC1 <>", value, "menRc1");
            return (Criteria) this;
        }

        public Criteria andMenRc1GreaterThan(String value) {
            addCriterion("MEN_RC1 >", value, "menRc1");
            return (Criteria) this;
        }

        public Criteria andMenRc1GreaterThanOrEqualTo(String value) {
            addCriterion("MEN_RC1 >=", value, "menRc1");
            return (Criteria) this;
        }

        public Criteria andMenRc1LessThan(String value) {
            addCriterion("MEN_RC1 <", value, "menRc1");
            return (Criteria) this;
        }

        public Criteria andMenRc1LessThanOrEqualTo(String value) {
            addCriterion("MEN_RC1 <=", value, "menRc1");
            return (Criteria) this;
        }

        public Criteria andMenRc1Like(String value) {
            addCriterion("MEN_RC1 like", value, "menRc1");
            return (Criteria) this;
        }

        public Criteria andMenRc1NotLike(String value) {
            addCriterion("MEN_RC1 not like", value, "menRc1");
            return (Criteria) this;
        }

        public Criteria andMenRc1In(List<String> values) {
            addCriterion("MEN_RC1 in", values, "menRc1");
            return (Criteria) this;
        }

        public Criteria andMenRc1NotIn(List<String> values) {
            addCriterion("MEN_RC1 not in", values, "menRc1");
            return (Criteria) this;
        }

        public Criteria andMenRc1Between(String value1, String value2) {
            addCriterion("MEN_RC1 between", value1, value2, "menRc1");
            return (Criteria) this;
        }

        public Criteria andMenRc1NotBetween(String value1, String value2) {
            addCriterion("MEN_RC1 not between", value1, value2, "menRc1");
            return (Criteria) this;
        }

        public Criteria andMenRc2IsNull() {
            addCriterion("MEN_RC2 is null");
            return (Criteria) this;
        }

        public Criteria andMenRc2IsNotNull() {
            addCriterion("MEN_RC2 is not null");
            return (Criteria) this;
        }

        public Criteria andMenRc2EqualTo(String value) {
            addCriterion("MEN_RC2 =", value, "menRc2");
            return (Criteria) this;
        }

        public Criteria andMenRc2NotEqualTo(String value) {
            addCriterion("MEN_RC2 <>", value, "menRc2");
            return (Criteria) this;
        }

        public Criteria andMenRc2GreaterThan(String value) {
            addCriterion("MEN_RC2 >", value, "menRc2");
            return (Criteria) this;
        }

        public Criteria andMenRc2GreaterThanOrEqualTo(String value) {
            addCriterion("MEN_RC2 >=", value, "menRc2");
            return (Criteria) this;
        }

        public Criteria andMenRc2LessThan(String value) {
            addCriterion("MEN_RC2 <", value, "menRc2");
            return (Criteria) this;
        }

        public Criteria andMenRc2LessThanOrEqualTo(String value) {
            addCriterion("MEN_RC2 <=", value, "menRc2");
            return (Criteria) this;
        }

        public Criteria andMenRc2Like(String value) {
            addCriterion("MEN_RC2 like", value, "menRc2");
            return (Criteria) this;
        }

        public Criteria andMenRc2NotLike(String value) {
            addCriterion("MEN_RC2 not like", value, "menRc2");
            return (Criteria) this;
        }

        public Criteria andMenRc2In(List<String> values) {
            addCriterion("MEN_RC2 in", values, "menRc2");
            return (Criteria) this;
        }

        public Criteria andMenRc2NotIn(List<String> values) {
            addCriterion("MEN_RC2 not in", values, "menRc2");
            return (Criteria) this;
        }

        public Criteria andMenRc2Between(String value1, String value2) {
            addCriterion("MEN_RC2 between", value1, value2, "menRc2");
            return (Criteria) this;
        }

        public Criteria andMenRc2NotBetween(String value1, String value2) {
            addCriterion("MEN_RC2 not between", value1, value2, "menRc2");
            return (Criteria) this;
        }

        public Criteria andMenRc3IsNull() {
            addCriterion("MEN_RC3 is null");
            return (Criteria) this;
        }

        public Criteria andMenRc3IsNotNull() {
            addCriterion("MEN_RC3 is not null");
            return (Criteria) this;
        }

        public Criteria andMenRc3EqualTo(String value) {
            addCriterion("MEN_RC3 =", value, "menRc3");
            return (Criteria) this;
        }

        public Criteria andMenRc3NotEqualTo(String value) {
            addCriterion("MEN_RC3 <>", value, "menRc3");
            return (Criteria) this;
        }

        public Criteria andMenRc3GreaterThan(String value) {
            addCriterion("MEN_RC3 >", value, "menRc3");
            return (Criteria) this;
        }

        public Criteria andMenRc3GreaterThanOrEqualTo(String value) {
            addCriterion("MEN_RC3 >=", value, "menRc3");
            return (Criteria) this;
        }

        public Criteria andMenRc3LessThan(String value) {
            addCriterion("MEN_RC3 <", value, "menRc3");
            return (Criteria) this;
        }

        public Criteria andMenRc3LessThanOrEqualTo(String value) {
            addCriterion("MEN_RC3 <=", value, "menRc3");
            return (Criteria) this;
        }

        public Criteria andMenRc3Like(String value) {
            addCriterion("MEN_RC3 like", value, "menRc3");
            return (Criteria) this;
        }

        public Criteria andMenRc3NotLike(String value) {
            addCriterion("MEN_RC3 not like", value, "menRc3");
            return (Criteria) this;
        }

        public Criteria andMenRc3In(List<String> values) {
            addCriterion("MEN_RC3 in", values, "menRc3");
            return (Criteria) this;
        }

        public Criteria andMenRc3NotIn(List<String> values) {
            addCriterion("MEN_RC3 not in", values, "menRc3");
            return (Criteria) this;
        }

        public Criteria andMenRc3Between(String value1, String value2) {
            addCriterion("MEN_RC3 between", value1, value2, "menRc3");
            return (Criteria) this;
        }

        public Criteria andMenRc3NotBetween(String value1, String value2) {
            addCriterion("MEN_RC3 not between", value1, value2, "menRc3");
            return (Criteria) this;
        }

        public Criteria andMenRc4IsNull() {
            addCriterion("MEN_RC4 is null");
            return (Criteria) this;
        }

        public Criteria andMenRc4IsNotNull() {
            addCriterion("MEN_RC4 is not null");
            return (Criteria) this;
        }

        public Criteria andMenRc4EqualTo(String value) {
            addCriterion("MEN_RC4 =", value, "menRc4");
            return (Criteria) this;
        }

        public Criteria andMenRc4NotEqualTo(String value) {
            addCriterion("MEN_RC4 <>", value, "menRc4");
            return (Criteria) this;
        }

        public Criteria andMenRc4GreaterThan(String value) {
            addCriterion("MEN_RC4 >", value, "menRc4");
            return (Criteria) this;
        }

        public Criteria andMenRc4GreaterThanOrEqualTo(String value) {
            addCriterion("MEN_RC4 >=", value, "menRc4");
            return (Criteria) this;
        }

        public Criteria andMenRc4LessThan(String value) {
            addCriterion("MEN_RC4 <", value, "menRc4");
            return (Criteria) this;
        }

        public Criteria andMenRc4LessThanOrEqualTo(String value) {
            addCriterion("MEN_RC4 <=", value, "menRc4");
            return (Criteria) this;
        }

        public Criteria andMenRc4Like(String value) {
            addCriterion("MEN_RC4 like", value, "menRc4");
            return (Criteria) this;
        }

        public Criteria andMenRc4NotLike(String value) {
            addCriterion("MEN_RC4 not like", value, "menRc4");
            return (Criteria) this;
        }

        public Criteria andMenRc4In(List<String> values) {
            addCriterion("MEN_RC4 in", values, "menRc4");
            return (Criteria) this;
        }

        public Criteria andMenRc4NotIn(List<String> values) {
            addCriterion("MEN_RC4 not in", values, "menRc4");
            return (Criteria) this;
        }

        public Criteria andMenRc4Between(String value1, String value2) {
            addCriterion("MEN_RC4 between", value1, value2, "menRc4");
            return (Criteria) this;
        }

        public Criteria andMenRc4NotBetween(String value1, String value2) {
            addCriterion("MEN_RC4 not between", value1, value2, "menRc4");
            return (Criteria) this;
        }

        public Criteria andMenRc5IsNull() {
            addCriterion("MEN_RC5 is null");
            return (Criteria) this;
        }

        public Criteria andMenRc5IsNotNull() {
            addCriterion("MEN_RC5 is not null");
            return (Criteria) this;
        }

        public Criteria andMenRc5EqualTo(String value) {
            addCriterion("MEN_RC5 =", value, "menRc5");
            return (Criteria) this;
        }

        public Criteria andMenRc5NotEqualTo(String value) {
            addCriterion("MEN_RC5 <>", value, "menRc5");
            return (Criteria) this;
        }

        public Criteria andMenRc5GreaterThan(String value) {
            addCriterion("MEN_RC5 >", value, "menRc5");
            return (Criteria) this;
        }

        public Criteria andMenRc5GreaterThanOrEqualTo(String value) {
            addCriterion("MEN_RC5 >=", value, "menRc5");
            return (Criteria) this;
        }

        public Criteria andMenRc5LessThan(String value) {
            addCriterion("MEN_RC5 <", value, "menRc5");
            return (Criteria) this;
        }

        public Criteria andMenRc5LessThanOrEqualTo(String value) {
            addCriterion("MEN_RC5 <=", value, "menRc5");
            return (Criteria) this;
        }

        public Criteria andMenRc5Like(String value) {
            addCriterion("MEN_RC5 like", value, "menRc5");
            return (Criteria) this;
        }

        public Criteria andMenRc5NotLike(String value) {
            addCriterion("MEN_RC5 not like", value, "menRc5");
            return (Criteria) this;
        }

        public Criteria andMenRc5In(List<String> values) {
            addCriterion("MEN_RC5 in", values, "menRc5");
            return (Criteria) this;
        }

        public Criteria andMenRc5NotIn(List<String> values) {
            addCriterion("MEN_RC5 not in", values, "menRc5");
            return (Criteria) this;
        }

        public Criteria andMenRc5Between(String value1, String value2) {
            addCriterion("MEN_RC5 between", value1, value2, "menRc5");
            return (Criteria) this;
        }

        public Criteria andMenRc5NotBetween(String value1, String value2) {
            addCriterion("MEN_RC5 not between", value1, value2, "menRc5");
            return (Criteria) this;
        }

        public Criteria andMenRc6IsNull() {
            addCriterion("MEN_RC6 is null");
            return (Criteria) this;
        }

        public Criteria andMenRc6IsNotNull() {
            addCriterion("MEN_RC6 is not null");
            return (Criteria) this;
        }

        public Criteria andMenRc6EqualTo(Integer value) {
            addCriterion("MEN_RC6 =", value, "menRc6");
            return (Criteria) this;
        }

        public Criteria andMenRc6NotEqualTo(Integer value) {
            addCriterion("MEN_RC6 <>", value, "menRc6");
            return (Criteria) this;
        }

        public Criteria andMenRc6GreaterThan(Integer value) {
            addCriterion("MEN_RC6 >", value, "menRc6");
            return (Criteria) this;
        }

        public Criteria andMenRc6GreaterThanOrEqualTo(Integer value) {
            addCriterion("MEN_RC6 >=", value, "menRc6");
            return (Criteria) this;
        }

        public Criteria andMenRc6LessThan(Integer value) {
            addCriterion("MEN_RC6 <", value, "menRc6");
            return (Criteria) this;
        }

        public Criteria andMenRc6LessThanOrEqualTo(Integer value) {
            addCriterion("MEN_RC6 <=", value, "menRc6");
            return (Criteria) this;
        }

        public Criteria andMenRc6In(List<Integer> values) {
            addCriterion("MEN_RC6 in", values, "menRc6");
            return (Criteria) this;
        }

        public Criteria andMenRc6NotIn(List<Integer> values) {
            addCriterion("MEN_RC6 not in", values, "menRc6");
            return (Criteria) this;
        }

        public Criteria andMenRc6Between(Integer value1, Integer value2) {
            addCriterion("MEN_RC6 between", value1, value2, "menRc6");
            return (Criteria) this;
        }

        public Criteria andMenRc6NotBetween(Integer value1, Integer value2) {
            addCriterion("MEN_RC6 not between", value1, value2, "menRc6");
            return (Criteria) this;
        }

        public Criteria andMenRc7IsNull() {
            addCriterion("MEN_RC7 is null");
            return (Criteria) this;
        }

        public Criteria andMenRc7IsNotNull() {
            addCriterion("MEN_RC7 is not null");
            return (Criteria) this;
        }

        public Criteria andMenRc7EqualTo(Integer value) {
            addCriterion("MEN_RC7 =", value, "menRc7");
            return (Criteria) this;
        }

        public Criteria andMenRc7NotEqualTo(Integer value) {
            addCriterion("MEN_RC7 <>", value, "menRc7");
            return (Criteria) this;
        }

        public Criteria andMenRc7GreaterThan(Integer value) {
            addCriterion("MEN_RC7 >", value, "menRc7");
            return (Criteria) this;
        }

        public Criteria andMenRc7GreaterThanOrEqualTo(Integer value) {
            addCriterion("MEN_RC7 >=", value, "menRc7");
            return (Criteria) this;
        }

        public Criteria andMenRc7LessThan(Integer value) {
            addCriterion("MEN_RC7 <", value, "menRc7");
            return (Criteria) this;
        }

        public Criteria andMenRc7LessThanOrEqualTo(Integer value) {
            addCriterion("MEN_RC7 <=", value, "menRc7");
            return (Criteria) this;
        }

        public Criteria andMenRc7In(List<Integer> values) {
            addCriterion("MEN_RC7 in", values, "menRc7");
            return (Criteria) this;
        }

        public Criteria andMenRc7NotIn(List<Integer> values) {
            addCriterion("MEN_RC7 not in", values, "menRc7");
            return (Criteria) this;
        }

        public Criteria andMenRc7Between(Integer value1, Integer value2) {
            addCriterion("MEN_RC7 between", value1, value2, "menRc7");
            return (Criteria) this;
        }

        public Criteria andMenRc7NotBetween(Integer value1, Integer value2) {
            addCriterion("MEN_RC7 not between", value1, value2, "menRc7");
            return (Criteria) this;
        }

        public Criteria andMenRc8IsNull() {
            addCriterion("MEN_RC8 is null");
            return (Criteria) this;
        }

        public Criteria andMenRc8IsNotNull() {
            addCriterion("MEN_RC8 is not null");
            return (Criteria) this;
        }

        public Criteria andMenRc8EqualTo(Date value) {
            addCriterionForJDBCDate("MEN_RC8 =", value, "menRc8");
            return (Criteria) this;
        }

        public Criteria andMenRc8NotEqualTo(Date value) {
            addCriterionForJDBCDate("MEN_RC8 <>", value, "menRc8");
            return (Criteria) this;
        }

        public Criteria andMenRc8GreaterThan(Date value) {
            addCriterionForJDBCDate("MEN_RC8 >", value, "menRc8");
            return (Criteria) this;
        }

        public Criteria andMenRc8GreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("MEN_RC8 >=", value, "menRc8");
            return (Criteria) this;
        }

        public Criteria andMenRc8LessThan(Date value) {
            addCriterionForJDBCDate("MEN_RC8 <", value, "menRc8");
            return (Criteria) this;
        }

        public Criteria andMenRc8LessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("MEN_RC8 <=", value, "menRc8");
            return (Criteria) this;
        }

        public Criteria andMenRc8In(List<Date> values) {
            addCriterionForJDBCDate("MEN_RC8 in", values, "menRc8");
            return (Criteria) this;
        }

        public Criteria andMenRc8NotIn(List<Date> values) {
            addCriterionForJDBCDate("MEN_RC8 not in", values, "menRc8");
            return (Criteria) this;
        }

        public Criteria andMenRc8Between(Date value1, Date value2) {
            addCriterionForJDBCDate("MEN_RC8 between", value1, value2, "menRc8");
            return (Criteria) this;
        }

        public Criteria andMenRc8NotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("MEN_RC8 not between", value1, value2, "menRc8");
            return (Criteria) this;
        }

        public Criteria andMenRc9IsNull() {
            addCriterion("MEN_RC9 is null");
            return (Criteria) this;
        }

        public Criteria andMenRc9IsNotNull() {
            addCriterion("MEN_RC9 is not null");
            return (Criteria) this;
        }

        public Criteria andMenRc9EqualTo(Date value) {
            addCriterionForJDBCDate("MEN_RC9 =", value, "menRc9");
            return (Criteria) this;
        }

        public Criteria andMenRc9NotEqualTo(Date value) {
            addCriterionForJDBCDate("MEN_RC9 <>", value, "menRc9");
            return (Criteria) this;
        }

        public Criteria andMenRc9GreaterThan(Date value) {
            addCriterionForJDBCDate("MEN_RC9 >", value, "menRc9");
            return (Criteria) this;
        }

        public Criteria andMenRc9GreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("MEN_RC9 >=", value, "menRc9");
            return (Criteria) this;
        }

        public Criteria andMenRc9LessThan(Date value) {
            addCriterionForJDBCDate("MEN_RC9 <", value, "menRc9");
            return (Criteria) this;
        }

        public Criteria andMenRc9LessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("MEN_RC9 <=", value, "menRc9");
            return (Criteria) this;
        }

        public Criteria andMenRc9In(List<Date> values) {
            addCriterionForJDBCDate("MEN_RC9 in", values, "menRc9");
            return (Criteria) this;
        }

        public Criteria andMenRc9NotIn(List<Date> values) {
            addCriterionForJDBCDate("MEN_RC9 not in", values, "menRc9");
            return (Criteria) this;
        }

        public Criteria andMenRc9Between(Date value1, Date value2) {
            addCriterionForJDBCDate("MEN_RC9 between", value1, value2, "menRc9");
            return (Criteria) this;
        }

        public Criteria andMenRc9NotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("MEN_RC9 not between", value1, value2, "menRc9");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table SYS_MENUS
     *
     * @mbggenerated do_not_delete_during_merge Thu Jun 13 16:18:56 CST 2013
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table SYS_MENUS
     *
     * @mbggenerated Thu Jun 13 16:18:56 CST 2013
     */
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