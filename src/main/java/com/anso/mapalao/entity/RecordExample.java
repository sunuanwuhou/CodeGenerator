package com.anso.mapalao.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RecordExample() {
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

        public Criteria andDateTimeIsNull() {
            addCriterion("date_time is null");
            return (Criteria) this;
        }

        public Criteria andDateTimeIsNotNull() {
            addCriterion("date_time is not null");
            return (Criteria) this;
        }

        public Criteria andDateTimeEqualTo(String value) {
            addCriterion("date_time =", value, "dateTime");
            return (Criteria) this;
        }

        public Criteria andDateTimeNotEqualTo(String value) {
            addCriterion("date_time <>", value, "dateTime");
            return (Criteria) this;
        }

        public Criteria andDateTimeGreaterThan(String value) {
            addCriterion("date_time >", value, "dateTime");
            return (Criteria) this;
        }

        public Criteria andDateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("date_time >=", value, "dateTime");
            return (Criteria) this;
        }

        public Criteria andDateTimeLessThan(String value) {
            addCriterion("date_time <", value, "dateTime");
            return (Criteria) this;
        }

        public Criteria andDateTimeLessThanOrEqualTo(String value) {
            addCriterion("date_time <=", value, "dateTime");
            return (Criteria) this;
        }

        public Criteria andDateTimeLike(String value) {
            addCriterion("date_time like", value, "dateTime");
            return (Criteria) this;
        }

        public Criteria andDateTimeNotLike(String value) {
            addCriterion("date_time not like", value, "dateTime");
            return (Criteria) this;
        }

        public Criteria andDateTimeIn(List<String> values) {
            addCriterion("date_time in", values, "dateTime");
            return (Criteria) this;
        }

        public Criteria andDateTimeNotIn(List<String> values) {
            addCriterion("date_time not in", values, "dateTime");
            return (Criteria) this;
        }

        public Criteria andDateTimeBetween(String value1, String value2) {
            addCriterion("date_time between", value1, value2, "dateTime");
            return (Criteria) this;
        }

        public Criteria andDateTimeNotBetween(String value1, String value2) {
            addCriterion("date_time not between", value1, value2, "dateTime");
            return (Criteria) this;
        }

        public Criteria andC1LeakIsNull() {
            addCriterion("c1_leak is null");
            return (Criteria) this;
        }

        public Criteria andC1LeakIsNotNull() {
            addCriterion("c1_leak is not null");
            return (Criteria) this;
        }

        public Criteria andC1LeakEqualTo(String value) {
            addCriterion("c1_leak =", value, "c1Leak");
            return (Criteria) this;
        }

        public Criteria andC1LeakNotEqualTo(String value) {
            addCriterion("c1_leak <>", value, "c1Leak");
            return (Criteria) this;
        }

        public Criteria andC1LeakGreaterThan(String value) {
            addCriterion("c1_leak >", value, "c1Leak");
            return (Criteria) this;
        }

        public Criteria andC1LeakGreaterThanOrEqualTo(String value) {
            addCriterion("c1_leak >=", value, "c1Leak");
            return (Criteria) this;
        }

        public Criteria andC1LeakLessThan(String value) {
            addCriterion("c1_leak <", value, "c1Leak");
            return (Criteria) this;
        }

        public Criteria andC1LeakLessThanOrEqualTo(String value) {
            addCriterion("c1_leak <=", value, "c1Leak");
            return (Criteria) this;
        }

        public Criteria andC1LeakLike(String value) {
            addCriterion("c1_leak like", value, "c1Leak");
            return (Criteria) this;
        }

        public Criteria andC1LeakNotLike(String value) {
            addCriterion("c1_leak not like", value, "c1Leak");
            return (Criteria) this;
        }

        public Criteria andC1LeakIn(List<String> values) {
            addCriterion("c1_leak in", values, "c1Leak");
            return (Criteria) this;
        }

        public Criteria andC1LeakNotIn(List<String> values) {
            addCriterion("c1_leak not in", values, "c1Leak");
            return (Criteria) this;
        }

        public Criteria andC1LeakBetween(String value1, String value2) {
            addCriterion("c1_leak between", value1, value2, "c1Leak");
            return (Criteria) this;
        }

        public Criteria andC1LeakNotBetween(String value1, String value2) {
            addCriterion("c1_leak not between", value1, value2, "c1Leak");
            return (Criteria) this;
        }

        public Criteria andC2NoiseIsNull() {
            addCriterion("c2_noise is null");
            return (Criteria) this;
        }

        public Criteria andC2NoiseIsNotNull() {
            addCriterion("c2_noise is not null");
            return (Criteria) this;
        }

        public Criteria andC2NoiseEqualTo(String value) {
            addCriterion("c2_noise =", value, "c2Noise");
            return (Criteria) this;
        }

        public Criteria andC2NoiseNotEqualTo(String value) {
            addCriterion("c2_noise <>", value, "c2Noise");
            return (Criteria) this;
        }

        public Criteria andC2NoiseGreaterThan(String value) {
            addCriterion("c2_noise >", value, "c2Noise");
            return (Criteria) this;
        }

        public Criteria andC2NoiseGreaterThanOrEqualTo(String value) {
            addCriterion("c2_noise >=", value, "c2Noise");
            return (Criteria) this;
        }

        public Criteria andC2NoiseLessThan(String value) {
            addCriterion("c2_noise <", value, "c2Noise");
            return (Criteria) this;
        }

        public Criteria andC2NoiseLessThanOrEqualTo(String value) {
            addCriterion("c2_noise <=", value, "c2Noise");
            return (Criteria) this;
        }

        public Criteria andC2NoiseLike(String value) {
            addCriterion("c2_noise like", value, "c2Noise");
            return (Criteria) this;
        }

        public Criteria andC2NoiseNotLike(String value) {
            addCriterion("c2_noise not like", value, "c2Noise");
            return (Criteria) this;
        }

        public Criteria andC2NoiseIn(List<String> values) {
            addCriterion("c2_noise in", values, "c2Noise");
            return (Criteria) this;
        }

        public Criteria andC2NoiseNotIn(List<String> values) {
            addCriterion("c2_noise not in", values, "c2Noise");
            return (Criteria) this;
        }

        public Criteria andC2NoiseBetween(String value1, String value2) {
            addCriterion("c2_noise between", value1, value2, "c2Noise");
            return (Criteria) this;
        }

        public Criteria andC2NoiseNotBetween(String value1, String value2) {
            addCriterion("c2_noise not between", value1, value2, "c2Noise");
            return (Criteria) this;
        }

        public Criteria andC3SpreadIsNull() {
            addCriterion("c3_spread is null");
            return (Criteria) this;
        }

        public Criteria andC3SpreadIsNotNull() {
            addCriterion("c3_spread is not null");
            return (Criteria) this;
        }

        public Criteria andC3SpreadEqualTo(String value) {
            addCriterion("c3_spread =", value, "c3Spread");
            return (Criteria) this;
        }

        public Criteria andC3SpreadNotEqualTo(String value) {
            addCriterion("c3_spread <>", value, "c3Spread");
            return (Criteria) this;
        }

        public Criteria andC3SpreadGreaterThan(String value) {
            addCriterion("c3_spread >", value, "c3Spread");
            return (Criteria) this;
        }

        public Criteria andC3SpreadGreaterThanOrEqualTo(String value) {
            addCriterion("c3_spread >=", value, "c3Spread");
            return (Criteria) this;
        }

        public Criteria andC3SpreadLessThan(String value) {
            addCriterion("c3_spread <", value, "c3Spread");
            return (Criteria) this;
        }

        public Criteria andC3SpreadLessThanOrEqualTo(String value) {
            addCriterion("c3_spread <=", value, "c3Spread");
            return (Criteria) this;
        }

        public Criteria andC3SpreadLike(String value) {
            addCriterion("c3_spread like", value, "c3Spread");
            return (Criteria) this;
        }

        public Criteria andC3SpreadNotLike(String value) {
            addCriterion("c3_spread not like", value, "c3Spread");
            return (Criteria) this;
        }

        public Criteria andC3SpreadIn(List<String> values) {
            addCriterion("c3_spread in", values, "c3Spread");
            return (Criteria) this;
        }

        public Criteria andC3SpreadNotIn(List<String> values) {
            addCriterion("c3_spread not in", values, "c3Spread");
            return (Criteria) this;
        }

        public Criteria andC3SpreadBetween(String value1, String value2) {
            addCriterion("c3_spread between", value1, value2, "c3Spread");
            return (Criteria) this;
        }

        public Criteria andC3SpreadNotBetween(String value1, String value2) {
            addCriterion("c3_spread not between", value1, value2, "c3Spread");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
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