package com.wjb.forum.db.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReplyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReplyExample() {
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

        public Criteria andReplyIdIsNull() {
            addCriterion("reply_id is null");
            return (Criteria) this;
        }

        public Criteria andReplyIdIsNotNull() {
            addCriterion("reply_id is not null");
            return (Criteria) this;
        }

        public Criteria andReplyIdEqualTo(Integer value) {
            addCriterion("reply_id =", value, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyIdNotEqualTo(Integer value) {
            addCriterion("reply_id <>", value, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyIdGreaterThan(Integer value) {
            addCriterion("reply_id >", value, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("reply_id >=", value, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyIdLessThan(Integer value) {
            addCriterion("reply_id <", value, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyIdLessThanOrEqualTo(Integer value) {
            addCriterion("reply_id <=", value, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyIdIn(List<Integer> values) {
            addCriterion("reply_id in", values, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyIdNotIn(List<Integer> values) {
            addCriterion("reply_id not in", values, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyIdBetween(Integer value1, Integer value2) {
            addCriterion("reply_id between", value1, value2, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("reply_id not between", value1, value2, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyPostIdIsNull() {
            addCriterion("reply_post_id is null");
            return (Criteria) this;
        }

        public Criteria andReplyPostIdIsNotNull() {
            addCriterion("reply_post_id is not null");
            return (Criteria) this;
        }

        public Criteria andReplyPostIdEqualTo(Integer value) {
            addCriterion("reply_post_id =", value, "replyPostId");
            return (Criteria) this;
        }

        public Criteria andReplyPostIdNotEqualTo(Integer value) {
            addCriterion("reply_post_id <>", value, "replyPostId");
            return (Criteria) this;
        }

        public Criteria andReplyPostIdGreaterThan(Integer value) {
            addCriterion("reply_post_id >", value, "replyPostId");
            return (Criteria) this;
        }

        public Criteria andReplyPostIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("reply_post_id >=", value, "replyPostId");
            return (Criteria) this;
        }

        public Criteria andReplyPostIdLessThan(Integer value) {
            addCriterion("reply_post_id <", value, "replyPostId");
            return (Criteria) this;
        }

        public Criteria andReplyPostIdLessThanOrEqualTo(Integer value) {
            addCriterion("reply_post_id <=", value, "replyPostId");
            return (Criteria) this;
        }

        public Criteria andReplyPostIdIn(List<Integer> values) {
            addCriterion("reply_post_id in", values, "replyPostId");
            return (Criteria) this;
        }

        public Criteria andReplyPostIdNotIn(List<Integer> values) {
            addCriterion("reply_post_id not in", values, "replyPostId");
            return (Criteria) this;
        }

        public Criteria andReplyPostIdBetween(Integer value1, Integer value2) {
            addCriterion("reply_post_id between", value1, value2, "replyPostId");
            return (Criteria) this;
        }

        public Criteria andReplyPostIdNotBetween(Integer value1, Integer value2) {
            addCriterion("reply_post_id not between", value1, value2, "replyPostId");
            return (Criteria) this;
        }

        public Criteria andReplyUserNameIsNull() {
            addCriterion("reply_user_name is null");
            return (Criteria) this;
        }

        public Criteria andReplyUserNameIsNotNull() {
            addCriterion("reply_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andReplyUserNameEqualTo(String value) {
            addCriterion("reply_user_name =", value, "replyUserName");
            return (Criteria) this;
        }

        public Criteria andReplyUserNameNotEqualTo(String value) {
            addCriterion("reply_user_name <>", value, "replyUserName");
            return (Criteria) this;
        }

        public Criteria andReplyUserNameGreaterThan(String value) {
            addCriterion("reply_user_name >", value, "replyUserName");
            return (Criteria) this;
        }

        public Criteria andReplyUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("reply_user_name >=", value, "replyUserName");
            return (Criteria) this;
        }

        public Criteria andReplyUserNameLessThan(String value) {
            addCriterion("reply_user_name <", value, "replyUserName");
            return (Criteria) this;
        }

        public Criteria andReplyUserNameLessThanOrEqualTo(String value) {
            addCriterion("reply_user_name <=", value, "replyUserName");
            return (Criteria) this;
        }

        public Criteria andReplyUserNameLike(String value) {
            addCriterion("reply_user_name like", value, "replyUserName");
            return (Criteria) this;
        }

        public Criteria andReplyUserNameNotLike(String value) {
            addCriterion("reply_user_name not like", value, "replyUserName");
            return (Criteria) this;
        }

        public Criteria andReplyUserNameIn(List<String> values) {
            addCriterion("reply_user_name in", values, "replyUserName");
            return (Criteria) this;
        }

        public Criteria andReplyUserNameNotIn(List<String> values) {
            addCriterion("reply_user_name not in", values, "replyUserName");
            return (Criteria) this;
        }

        public Criteria andReplyUserNameBetween(String value1, String value2) {
            addCriterion("reply_user_name between", value1, value2, "replyUserName");
            return (Criteria) this;
        }

        public Criteria andReplyUserNameNotBetween(String value1, String value2) {
            addCriterion("reply_user_name not between", value1, value2, "replyUserName");
            return (Criteria) this;
        }

        public Criteria andReplyGoodCountIsNull() {
            addCriterion("reply_good_count is null");
            return (Criteria) this;
        }

        public Criteria andReplyGoodCountIsNotNull() {
            addCriterion("reply_good_count is not null");
            return (Criteria) this;
        }

        public Criteria andReplyGoodCountEqualTo(Integer value) {
            addCriterion("reply_good_count =", value, "replyGoodCount");
            return (Criteria) this;
        }

        public Criteria andReplyGoodCountNotEqualTo(Integer value) {
            addCriterion("reply_good_count <>", value, "replyGoodCount");
            return (Criteria) this;
        }

        public Criteria andReplyGoodCountGreaterThan(Integer value) {
            addCriterion("reply_good_count >", value, "replyGoodCount");
            return (Criteria) this;
        }

        public Criteria andReplyGoodCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("reply_good_count >=", value, "replyGoodCount");
            return (Criteria) this;
        }

        public Criteria andReplyGoodCountLessThan(Integer value) {
            addCriterion("reply_good_count <", value, "replyGoodCount");
            return (Criteria) this;
        }

        public Criteria andReplyGoodCountLessThanOrEqualTo(Integer value) {
            addCriterion("reply_good_count <=", value, "replyGoodCount");
            return (Criteria) this;
        }

        public Criteria andReplyGoodCountIn(List<Integer> values) {
            addCriterion("reply_good_count in", values, "replyGoodCount");
            return (Criteria) this;
        }

        public Criteria andReplyGoodCountNotIn(List<Integer> values) {
            addCriterion("reply_good_count not in", values, "replyGoodCount");
            return (Criteria) this;
        }

        public Criteria andReplyGoodCountBetween(Integer value1, Integer value2) {
            addCriterion("reply_good_count between", value1, value2, "replyGoodCount");
            return (Criteria) this;
        }

        public Criteria andReplyGoodCountNotBetween(Integer value1, Integer value2) {
            addCriterion("reply_good_count not between", value1, value2, "replyGoodCount");
            return (Criteria) this;
        }

        public Criteria andReplyBadCountIsNull() {
            addCriterion("reply_bad_count is null");
            return (Criteria) this;
        }

        public Criteria andReplyBadCountIsNotNull() {
            addCriterion("reply_bad_count is not null");
            return (Criteria) this;
        }

        public Criteria andReplyBadCountEqualTo(Integer value) {
            addCriterion("reply_bad_count =", value, "replyBadCount");
            return (Criteria) this;
        }

        public Criteria andReplyBadCountNotEqualTo(Integer value) {
            addCriterion("reply_bad_count <>", value, "replyBadCount");
            return (Criteria) this;
        }

        public Criteria andReplyBadCountGreaterThan(Integer value) {
            addCriterion("reply_bad_count >", value, "replyBadCount");
            return (Criteria) this;
        }

        public Criteria andReplyBadCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("reply_bad_count >=", value, "replyBadCount");
            return (Criteria) this;
        }

        public Criteria andReplyBadCountLessThan(Integer value) {
            addCriterion("reply_bad_count <", value, "replyBadCount");
            return (Criteria) this;
        }

        public Criteria andReplyBadCountLessThanOrEqualTo(Integer value) {
            addCriterion("reply_bad_count <=", value, "replyBadCount");
            return (Criteria) this;
        }

        public Criteria andReplyBadCountIn(List<Integer> values) {
            addCriterion("reply_bad_count in", values, "replyBadCount");
            return (Criteria) this;
        }

        public Criteria andReplyBadCountNotIn(List<Integer> values) {
            addCriterion("reply_bad_count not in", values, "replyBadCount");
            return (Criteria) this;
        }

        public Criteria andReplyBadCountBetween(Integer value1, Integer value2) {
            addCriterion("reply_bad_count between", value1, value2, "replyBadCount");
            return (Criteria) this;
        }

        public Criteria andReplyBadCountNotBetween(Integer value1, Integer value2) {
            addCriterion("reply_bad_count not between", value1, value2, "replyBadCount");
            return (Criteria) this;
        }

        public Criteria andReplyCreateTimeIsNull() {
            addCriterion("reply_create_time is null");
            return (Criteria) this;
        }

        public Criteria andReplyCreateTimeIsNotNull() {
            addCriterion("reply_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andReplyCreateTimeEqualTo(Date value) {
            addCriterion("reply_create_time =", value, "replyCreateTime");
            return (Criteria) this;
        }

        public Criteria andReplyCreateTimeNotEqualTo(Date value) {
            addCriterion("reply_create_time <>", value, "replyCreateTime");
            return (Criteria) this;
        }

        public Criteria andReplyCreateTimeGreaterThan(Date value) {
            addCriterion("reply_create_time >", value, "replyCreateTime");
            return (Criteria) this;
        }

        public Criteria andReplyCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("reply_create_time >=", value, "replyCreateTime");
            return (Criteria) this;
        }

        public Criteria andReplyCreateTimeLessThan(Date value) {
            addCriterion("reply_create_time <", value, "replyCreateTime");
            return (Criteria) this;
        }

        public Criteria andReplyCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("reply_create_time <=", value, "replyCreateTime");
            return (Criteria) this;
        }

        public Criteria andReplyCreateTimeIn(List<Date> values) {
            addCriterion("reply_create_time in", values, "replyCreateTime");
            return (Criteria) this;
        }

        public Criteria andReplyCreateTimeNotIn(List<Date> values) {
            addCriterion("reply_create_time not in", values, "replyCreateTime");
            return (Criteria) this;
        }

        public Criteria andReplyCreateTimeBetween(Date value1, Date value2) {
            addCriterion("reply_create_time between", value1, value2, "replyCreateTime");
            return (Criteria) this;
        }

        public Criteria andReplyCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("reply_create_time not between", value1, value2, "replyCreateTime");
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