package com.escvd.main.entity;

import java.util.ArrayList;
import java.util.List;

public class VulnDaoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VulnDaoExample() {
        oredCriteria = new ArrayList<>();
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

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
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

        public Criteria andVulnidIsNull() {
            addCriterion("VulnID is null");
            return (Criteria) this;
        }

        public Criteria andVulnidIsNotNull() {
            addCriterion("VulnID is not null");
            return (Criteria) this;
        }

        public Criteria andVulnidEqualTo(Integer value) {
            addCriterion("VulnID =", value, "vulnid");
            return (Criteria) this;
        }

        public Criteria andVulnidNotEqualTo(Integer value) {
            addCriterion("VulnID <>", value, "vulnid");
            return (Criteria) this;
        }

        public Criteria andVulnidGreaterThan(Integer value) {
            addCriterion("VulnID >", value, "vulnid");
            return (Criteria) this;
        }

        public Criteria andVulnidGreaterThanOrEqualTo(Integer value) {
            addCriterion("VulnID >=", value, "vulnid");
            return (Criteria) this;
        }

        public Criteria andVulnidLessThan(Integer value) {
            addCriterion("VulnID <", value, "vulnid");
            return (Criteria) this;
        }

        public Criteria andVulnidLessThanOrEqualTo(Integer value) {
            addCriterion("VulnID <=", value, "vulnid");
            return (Criteria) this;
        }

        public Criteria andVulnidIn(List<Integer> values) {
            addCriterion("VulnID in", values, "vulnid");
            return (Criteria) this;
        }

        public Criteria andVulnidNotIn(List<Integer> values) {
            addCriterion("VulnID not in", values, "vulnid");
            return (Criteria) this;
        }

        public Criteria andVulnidBetween(Integer value1, Integer value2) {
            addCriterion("VulnID between", value1, value2, "vulnid");
            return (Criteria) this;
        }

        public Criteria andVulnidNotBetween(Integer value1, Integer value2) {
            addCriterion("VulnID not between", value1, value2, "vulnid");
            return (Criteria) this;
        }

        public Criteria andVulnnameIsNull() {
            addCriterion("VulnName is null");
            return (Criteria) this;
        }

        public Criteria andVulnnameIsNotNull() {
            addCriterion("VulnName is not null");
            return (Criteria) this;
        }

        public Criteria andVulnnameEqualTo(String value) {
            addCriterion("VulnName =", value, "vulnname");
            return (Criteria) this;
        }

        public Criteria andVulnnameNotEqualTo(String value) {
            addCriterion("VulnName <>", value, "vulnname");
            return (Criteria) this;
        }

        public Criteria andVulnnameGreaterThan(String value) {
            addCriterion("VulnName >", value, "vulnname");
            return (Criteria) this;
        }

        public Criteria andVulnnameGreaterThanOrEqualTo(String value) {
            addCriterion("VulnName >=", value, "vulnname");
            return (Criteria) this;
        }

        public Criteria andVulnnameLessThan(String value) {
            addCriterion("VulnName <", value, "vulnname");
            return (Criteria) this;
        }

        public Criteria andVulnnameLessThanOrEqualTo(String value) {
            addCriterion("VulnName <=", value, "vulnname");
            return (Criteria) this;
        }

        public Criteria andVulnnameLike(String value) {
            addCriterion("VulnName like", value, "vulnname");
            return (Criteria) this;
        }

        public Criteria andVulnnameNotLike(String value) {
            addCriterion("VulnName not like", value, "vulnname");
            return (Criteria) this;
        }

        public Criteria andVulnnameIn(List<String> values) {
            addCriterion("VulnName in", values, "vulnname");
            return (Criteria) this;
        }

        public Criteria andVulnnameNotIn(List<String> values) {
            addCriterion("VulnName not in", values, "vulnname");
            return (Criteria) this;
        }

        public Criteria andVulnnameBetween(String value1, String value2) {
            addCriterion("VulnName between", value1, value2, "vulnname");
            return (Criteria) this;
        }

        public Criteria andVulnnameNotBetween(String value1, String value2) {
            addCriterion("VulnName not between", value1, value2, "vulnname");
            return (Criteria) this;
        }

        public Criteria andVulndetailIsNull() {
            addCriterion("Vulndetail is null");
            return (Criteria) this;
        }

        public Criteria andVulndetailIsNotNull() {
            addCriterion("Vulndetail is not null");
            return (Criteria) this;
        }

        public Criteria andVulndetailEqualTo(String value) {
            addCriterion("Vulndetail =", value, "vulndetail");
            return (Criteria) this;
        }

        public Criteria andVulndetailNotEqualTo(String value) {
            addCriterion("Vulndetail <>", value, "vulndetail");
            return (Criteria) this;
        }

        public Criteria andVulndetailGreaterThan(String value) {
            addCriterion("Vulndetail >", value, "vulndetail");
            return (Criteria) this;
        }

        public Criteria andVulndetailGreaterThanOrEqualTo(String value) {
            addCriterion("Vulndetail >=", value, "vulndetail");
            return (Criteria) this;
        }

        public Criteria andVulndetailLessThan(String value) {
            addCriterion("Vulndetail <", value, "vulndetail");
            return (Criteria) this;
        }

        public Criteria andVulndetailLessThanOrEqualTo(String value) {
            addCriterion("Vulndetail <=", value, "vulndetail");
            return (Criteria) this;
        }

        public Criteria andVulndetailLike(String value) {
            addCriterion("Vulndetail like", value, "vulndetail");
            return (Criteria) this;
        }

        public Criteria andVulndetailNotLike(String value) {
            addCriterion("Vulndetail not like", value, "vulndetail");
            return (Criteria) this;
        }

        public Criteria andVulndetailIn(List<String> values) {
            addCriterion("Vulndetail in", values, "vulndetail");
            return (Criteria) this;
        }

        public Criteria andVulndetailNotIn(List<String> values) {
            addCriterion("Vulndetail not in", values, "vulndetail");
            return (Criteria) this;
        }

        public Criteria andVulndetailBetween(String value1, String value2) {
            addCriterion("Vulndetail between", value1, value2, "vulndetail");
            return (Criteria) this;
        }

        public Criteria andVulndetailNotBetween(String value1, String value2) {
            addCriterion("Vulndetail not between", value1, value2, "vulndetail");
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