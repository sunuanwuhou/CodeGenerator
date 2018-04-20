package com.anso.mapalao.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RecordingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RecordingExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSiteidIsNull() {
            addCriterion("siteid is null");
            return (Criteria) this;
        }

        public Criteria andSiteidIsNotNull() {
            addCriterion("siteid is not null");
            return (Criteria) this;
        }

        public Criteria andSiteidEqualTo(Integer value) {
            addCriterion("siteid =", value, "siteid");
            return (Criteria) this;
        }

        public Criteria andSiteidNotEqualTo(Integer value) {
            addCriterion("siteid <>", value, "siteid");
            return (Criteria) this;
        }

        public Criteria andSiteidGreaterThan(Integer value) {
            addCriterion("siteid >", value, "siteid");
            return (Criteria) this;
        }

        public Criteria andSiteidGreaterThanOrEqualTo(Integer value) {
            addCriterion("siteid >=", value, "siteid");
            return (Criteria) this;
        }

        public Criteria andSiteidLessThan(Integer value) {
            addCriterion("siteid <", value, "siteid");
            return (Criteria) this;
        }

        public Criteria andSiteidLessThanOrEqualTo(Integer value) {
            addCriterion("siteid <=", value, "siteid");
            return (Criteria) this;
        }

        public Criteria andSiteidIn(List<Integer> values) {
            addCriterion("siteid in", values, "siteid");
            return (Criteria) this;
        }

        public Criteria andSiteidNotIn(List<Integer> values) {
            addCriterion("siteid not in", values, "siteid");
            return (Criteria) this;
        }

        public Criteria andSiteidBetween(Integer value1, Integer value2) {
            addCriterion("siteid between", value1, value2, "siteid");
            return (Criteria) this;
        }

        public Criteria andSiteidNotBetween(Integer value1, Integer value2) {
            addCriterion("siteid not between", value1, value2, "siteid");
            return (Criteria) this;
        }

        public Criteria andNumberIsNull() {
            addCriterion("number is null");
            return (Criteria) this;
        }

        public Criteria andNumberIsNotNull() {
            addCriterion("number is not null");
            return (Criteria) this;
        }

        public Criteria andNumberEqualTo(String value) {
            addCriterion("number =", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotEqualTo(String value) {
            addCriterion("number <>", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThan(String value) {
            addCriterion("number >", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThanOrEqualTo(String value) {
            addCriterion("number >=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThan(String value) {
            addCriterion("number <", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThanOrEqualTo(String value) {
            addCriterion("number <=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLike(String value) {
            addCriterion("number like", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotLike(String value) {
            addCriterion("number not like", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberIn(List<String> values) {
            addCriterion("number in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotIn(List<String> values) {
            addCriterion("number not in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberBetween(String value1, String value2) {
            addCriterion("number between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotBetween(String value1, String value2) {
            addCriterion("number not between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andRstIsNull() {
            addCriterion("rst is null");
            return (Criteria) this;
        }

        public Criteria andRstIsNotNull() {
            addCriterion("rst is not null");
            return (Criteria) this;
        }

        public Criteria andRstEqualTo(String value) {
            addCriterion("rst =", value, "rst");
            return (Criteria) this;
        }

        public Criteria andRstNotEqualTo(String value) {
            addCriterion("rst <>", value, "rst");
            return (Criteria) this;
        }

        public Criteria andRstGreaterThan(String value) {
            addCriterion("rst >", value, "rst");
            return (Criteria) this;
        }

        public Criteria andRstGreaterThanOrEqualTo(String value) {
            addCriterion("rst >=", value, "rst");
            return (Criteria) this;
        }

        public Criteria andRstLessThan(String value) {
            addCriterion("rst <", value, "rst");
            return (Criteria) this;
        }

        public Criteria andRstLessThanOrEqualTo(String value) {
            addCriterion("rst <=", value, "rst");
            return (Criteria) this;
        }

        public Criteria andRstLike(String value) {
            addCriterion("rst like", value, "rst");
            return (Criteria) this;
        }

        public Criteria andRstNotLike(String value) {
            addCriterion("rst not like", value, "rst");
            return (Criteria) this;
        }

        public Criteria andRstIn(List<String> values) {
            addCriterion("rst in", values, "rst");
            return (Criteria) this;
        }

        public Criteria andRstNotIn(List<String> values) {
            addCriterion("rst not in", values, "rst");
            return (Criteria) this;
        }

        public Criteria andRstBetween(String value1, String value2) {
            addCriterion("rst between", value1, value2, "rst");
            return (Criteria) this;
        }

        public Criteria andRstNotBetween(String value1, String value2) {
            addCriterion("rst not between", value1, value2, "rst");
            return (Criteria) this;
        }

        public Criteria andRetIsNull() {
            addCriterion("ret is null");
            return (Criteria) this;
        }

        public Criteria andRetIsNotNull() {
            addCriterion("ret is not null");
            return (Criteria) this;
        }

        public Criteria andRetEqualTo(String value) {
            addCriterion("ret =", value, "ret");
            return (Criteria) this;
        }

        public Criteria andRetNotEqualTo(String value) {
            addCriterion("ret <>", value, "ret");
            return (Criteria) this;
        }

        public Criteria andRetGreaterThan(String value) {
            addCriterion("ret >", value, "ret");
            return (Criteria) this;
        }

        public Criteria andRetGreaterThanOrEqualTo(String value) {
            addCriterion("ret >=", value, "ret");
            return (Criteria) this;
        }

        public Criteria andRetLessThan(String value) {
            addCriterion("ret <", value, "ret");
            return (Criteria) this;
        }

        public Criteria andRetLessThanOrEqualTo(String value) {
            addCriterion("ret <=", value, "ret");
            return (Criteria) this;
        }

        public Criteria andRetLike(String value) {
            addCriterion("ret like", value, "ret");
            return (Criteria) this;
        }

        public Criteria andRetNotLike(String value) {
            addCriterion("ret not like", value, "ret");
            return (Criteria) this;
        }

        public Criteria andRetIn(List<String> values) {
            addCriterion("ret in", values, "ret");
            return (Criteria) this;
        }

        public Criteria andRetNotIn(List<String> values) {
            addCriterion("ret not in", values, "ret");
            return (Criteria) this;
        }

        public Criteria andRetBetween(String value1, String value2) {
            addCriterion("ret between", value1, value2, "ret");
            return (Criteria) this;
        }

        public Criteria andRetNotBetween(String value1, String value2) {
            addCriterion("ret not between", value1, value2, "ret");
            return (Criteria) this;
        }

        public Criteria andSiteidtextIsNull() {
            addCriterion("siteidtext is null");
            return (Criteria) this;
        }

        public Criteria andSiteidtextIsNotNull() {
            addCriterion("siteidtext is not null");
            return (Criteria) this;
        }

        public Criteria andSiteidtextEqualTo(String value) {
            addCriterion("siteidtext =", value, "siteidtext");
            return (Criteria) this;
        }

        public Criteria andSiteidtextNotEqualTo(String value) {
            addCriterion("siteidtext <>", value, "siteidtext");
            return (Criteria) this;
        }

        public Criteria andSiteidtextGreaterThan(String value) {
            addCriterion("siteidtext >", value, "siteidtext");
            return (Criteria) this;
        }

        public Criteria andSiteidtextGreaterThanOrEqualTo(String value) {
            addCriterion("siteidtext >=", value, "siteidtext");
            return (Criteria) this;
        }

        public Criteria andSiteidtextLessThan(String value) {
            addCriterion("siteidtext <", value, "siteidtext");
            return (Criteria) this;
        }

        public Criteria andSiteidtextLessThanOrEqualTo(String value) {
            addCriterion("siteidtext <=", value, "siteidtext");
            return (Criteria) this;
        }

        public Criteria andSiteidtextLike(String value) {
            addCriterion("siteidtext like", value, "siteidtext");
            return (Criteria) this;
        }

        public Criteria andSiteidtextNotLike(String value) {
            addCriterion("siteidtext not like", value, "siteidtext");
            return (Criteria) this;
        }

        public Criteria andSiteidtextIn(List<String> values) {
            addCriterion("siteidtext in", values, "siteidtext");
            return (Criteria) this;
        }

        public Criteria andSiteidtextNotIn(List<String> values) {
            addCriterion("siteidtext not in", values, "siteidtext");
            return (Criteria) this;
        }

        public Criteria andSiteidtextBetween(String value1, String value2) {
            addCriterion("siteidtext between", value1, value2, "siteidtext");
            return (Criteria) this;
        }

        public Criteria andSiteidtextNotBetween(String value1, String value2) {
            addCriterion("siteidtext not between", value1, value2, "siteidtext");
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