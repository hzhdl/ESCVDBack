package com.escvd.main.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SmartcontractDaoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SmartcontractDaoExample() {
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

        public Criteria andSmartcontractidIsNull() {
            addCriterion("SmartContractID is null");
            return (Criteria) this;
        }

        public Criteria andSmartcontractidIsNotNull() {
            addCriterion("SmartContractID is not null");
            return (Criteria) this;
        }

        public Criteria andSmartcontractidEqualTo(Integer value) {
            addCriterion("SmartContractID =", value, "smartcontractid");
            return (Criteria) this;
        }

        public Criteria andSmartcontractidNotEqualTo(Integer value) {
            addCriterion("SmartContractID <>", value, "smartcontractid");
            return (Criteria) this;
        }

        public Criteria andSmartcontractidGreaterThan(Integer value) {
            addCriterion("SmartContractID >", value, "smartcontractid");
            return (Criteria) this;
        }

        public Criteria andSmartcontractidGreaterThanOrEqualTo(Integer value) {
            addCriterion("SmartContractID >=", value, "smartcontractid");
            return (Criteria) this;
        }

        public Criteria andSmartcontractidLessThan(Integer value) {
            addCriterion("SmartContractID <", value, "smartcontractid");
            return (Criteria) this;
        }

        public Criteria andSmartcontractidLessThanOrEqualTo(Integer value) {
            addCriterion("SmartContractID <=", value, "smartcontractid");
            return (Criteria) this;
        }

        public Criteria andSmartcontractidIn(List<Integer> values) {
            addCriterion("SmartContractID in", values, "smartcontractid");
            return (Criteria) this;
        }

        public Criteria andSmartcontractidNotIn(List<Integer> values) {
            addCriterion("SmartContractID not in", values, "smartcontractid");
            return (Criteria) this;
        }

        public Criteria andSmartcontractidBetween(Integer value1, Integer value2) {
            addCriterion("SmartContractID between", value1, value2, "smartcontractid");
            return (Criteria) this;
        }

        public Criteria andSmartcontractidNotBetween(Integer value1, Integer value2) {
            addCriterion("SmartContractID not between", value1, value2, "smartcontractid");
            return (Criteria) this;
        }

        public Criteria andAbiIsNull() {
            addCriterion("ABI is null");
            return (Criteria) this;
        }

        public Criteria andAbiIsNotNull() {
            addCriterion("ABI is not null");
            return (Criteria) this;
        }

        public Criteria andAbiEqualTo(String value) {
            addCriterion("ABI =", value, "abi");
            return (Criteria) this;
        }

        public Criteria andAbiNotEqualTo(String value) {
            addCriterion("ABI <>", value, "abi");
            return (Criteria) this;
        }

        public Criteria andAbiGreaterThan(String value) {
            addCriterion("ABI >", value, "abi");
            return (Criteria) this;
        }

        public Criteria andAbiGreaterThanOrEqualTo(String value) {
            addCriterion("ABI >=", value, "abi");
            return (Criteria) this;
        }

        public Criteria andAbiLessThan(String value) {
            addCriterion("ABI <", value, "abi");
            return (Criteria) this;
        }

        public Criteria andAbiLessThanOrEqualTo(String value) {
            addCriterion("ABI <=", value, "abi");
            return (Criteria) this;
        }

        public Criteria andAbiLike(String value) {
            addCriterion("ABI like", value, "abi");
            return (Criteria) this;
        }

        public Criteria andAbiNotLike(String value) {
            addCriterion("ABI not like", value, "abi");
            return (Criteria) this;
        }

        public Criteria andAbiIn(List<String> values) {
            addCriterion("ABI in", values, "abi");
            return (Criteria) this;
        }

        public Criteria andAbiNotIn(List<String> values) {
            addCriterion("ABI not in", values, "abi");
            return (Criteria) this;
        }

        public Criteria andAbiBetween(String value1, String value2) {
            addCriterion("ABI between", value1, value2, "abi");
            return (Criteria) this;
        }

        public Criteria andAbiNotBetween(String value1, String value2) {
            addCriterion("ABI not between", value1, value2, "abi");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("Code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("Code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("Code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("Code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("Code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("Code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("Code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("Code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("Code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("Code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("Code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("Code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("Code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("Code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andBytecodeIsNull() {
            addCriterion("ByteCode is null");
            return (Criteria) this;
        }

        public Criteria andBytecodeIsNotNull() {
            addCriterion("ByteCode is not null");
            return (Criteria) this;
        }

        public Criteria andBytecodeEqualTo(String value) {
            addCriterion("ByteCode =", value, "bytecode");
            return (Criteria) this;
        }

        public Criteria andBytecodeNotEqualTo(String value) {
            addCriterion("ByteCode <>", value, "bytecode");
            return (Criteria) this;
        }

        public Criteria andBytecodeGreaterThan(String value) {
            addCriterion("ByteCode >", value, "bytecode");
            return (Criteria) this;
        }

        public Criteria andBytecodeGreaterThanOrEqualTo(String value) {
            addCriterion("ByteCode >=", value, "bytecode");
            return (Criteria) this;
        }

        public Criteria andBytecodeLessThan(String value) {
            addCriterion("ByteCode <", value, "bytecode");
            return (Criteria) this;
        }

        public Criteria andBytecodeLessThanOrEqualTo(String value) {
            addCriterion("ByteCode <=", value, "bytecode");
            return (Criteria) this;
        }

        public Criteria andBytecodeLike(String value) {
            addCriterion("ByteCode like", value, "bytecode");
            return (Criteria) this;
        }

        public Criteria andBytecodeNotLike(String value) {
            addCriterion("ByteCode not like", value, "bytecode");
            return (Criteria) this;
        }

        public Criteria andBytecodeIn(List<String> values) {
            addCriterion("ByteCode in", values, "bytecode");
            return (Criteria) this;
        }

        public Criteria andBytecodeNotIn(List<String> values) {
            addCriterion("ByteCode not in", values, "bytecode");
            return (Criteria) this;
        }

        public Criteria andBytecodeBetween(String value1, String value2) {
            addCriterion("ByteCode between", value1, value2, "bytecode");
            return (Criteria) this;
        }

        public Criteria andBytecodeNotBetween(String value1, String value2) {
            addCriterion("ByteCode not between", value1, value2, "bytecode");
            return (Criteria) this;
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

        public Criteria andTimestampIsNull() {
            addCriterion("TimeStamp is null");
            return (Criteria) this;
        }

        public Criteria andTimestampIsNotNull() {
            addCriterion("TimeStamp is not null");
            return (Criteria) this;
        }

        public Criteria andTimestampEqualTo(Date value) {
            addCriterion("TimeStamp =", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampNotEqualTo(Date value) {
            addCriterion("TimeStamp <>", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampGreaterThan(Date value) {
            addCriterion("TimeStamp >", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampGreaterThanOrEqualTo(Date value) {
            addCriterion("TimeStamp >=", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampLessThan(Date value) {
            addCriterion("TimeStamp <", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampLessThanOrEqualTo(Date value) {
            addCriterion("TimeStamp <=", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampIn(List<Date> values) {
            addCriterion("TimeStamp in", values, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampNotIn(List<Date> values) {
            addCriterion("TimeStamp not in", values, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampBetween(Date value1, Date value2) {
            addCriterion("TimeStamp between", value1, value2, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampNotBetween(Date value1, Date value2) {
            addCriterion("TimeStamp not between", value1, value2, "timestamp");
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