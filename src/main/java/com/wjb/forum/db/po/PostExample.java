package com.wjb.forum.db.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PostExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PostExample() {
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

        public Criteria andPostIdIsNull() {
            addCriterion("post_id is null");
            return (Criteria) this;
        }

        public Criteria andPostIdIsNotNull() {
            addCriterion("post_id is not null");
            return (Criteria) this;
        }

        public Criteria andPostIdEqualTo(Integer value) {
            addCriterion("post_id =", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdNotEqualTo(Integer value) {
            addCriterion("post_id <>", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdGreaterThan(Integer value) {
            addCriterion("post_id >", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("post_id >=", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdLessThan(Integer value) {
            addCriterion("post_id <", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdLessThanOrEqualTo(Integer value) {
            addCriterion("post_id <=", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdIn(List<Integer> values) {
            addCriterion("post_id in", values, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdNotIn(List<Integer> values) {
            addCriterion("post_id not in", values, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdBetween(Integer value1, Integer value2) {
            addCriterion("post_id between", value1, value2, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdNotBetween(Integer value1, Integer value2) {
            addCriterion("post_id not between", value1, value2, "postId");
            return (Criteria) this;
        }

        public Criteria andPostBoardIdIsNull() {
            addCriterion("post_board_id is null");
            return (Criteria) this;
        }

        public Criteria andPostBoardIdIsNotNull() {
            addCriterion("post_board_id is not null");
            return (Criteria) this;
        }

        public Criteria andPostBoardIdEqualTo(Integer value) {
            addCriterion("post_board_id =", value, "postBoardId");
            return (Criteria) this;
        }

        public Criteria andPostBoardIdNotEqualTo(Integer value) {
            addCriterion("post_board_id <>", value, "postBoardId");
            return (Criteria) this;
        }

        public Criteria andPostBoardIdGreaterThan(Integer value) {
            addCriterion("post_board_id >", value, "postBoardId");
            return (Criteria) this;
        }

        public Criteria andPostBoardIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("post_board_id >=", value, "postBoardId");
            return (Criteria) this;
        }

        public Criteria andPostBoardIdLessThan(Integer value) {
            addCriterion("post_board_id <", value, "postBoardId");
            return (Criteria) this;
        }

        public Criteria andPostBoardIdLessThanOrEqualTo(Integer value) {
            addCriterion("post_board_id <=", value, "postBoardId");
            return (Criteria) this;
        }

        public Criteria andPostBoardIdIn(List<Integer> values) {
            addCriterion("post_board_id in", values, "postBoardId");
            return (Criteria) this;
        }

        public Criteria andPostBoardIdNotIn(List<Integer> values) {
            addCriterion("post_board_id not in", values, "postBoardId");
            return (Criteria) this;
        }

        public Criteria andPostBoardIdBetween(Integer value1, Integer value2) {
            addCriterion("post_board_id between", value1, value2, "postBoardId");
            return (Criteria) this;
        }

        public Criteria andPostBoardIdNotBetween(Integer value1, Integer value2) {
            addCriterion("post_board_id not between", value1, value2, "postBoardId");
            return (Criteria) this;
        }

        public Criteria andPostUserNameIsNull() {
            addCriterion("post_user_name is null");
            return (Criteria) this;
        }

        public Criteria andPostUserNameIsNotNull() {
            addCriterion("post_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andPostUserNameEqualTo(String value) {
            addCriterion("post_user_name =", value, "postUserName");
            return (Criteria) this;
        }

        public Criteria andPostUserNameNotEqualTo(String value) {
            addCriterion("post_user_name <>", value, "postUserName");
            return (Criteria) this;
        }

        public Criteria andPostUserNameGreaterThan(String value) {
            addCriterion("post_user_name >", value, "postUserName");
            return (Criteria) this;
        }

        public Criteria andPostUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("post_user_name >=", value, "postUserName");
            return (Criteria) this;
        }

        public Criteria andPostUserNameLessThan(String value) {
            addCriterion("post_user_name <", value, "postUserName");
            return (Criteria) this;
        }

        public Criteria andPostUserNameLessThanOrEqualTo(String value) {
            addCriterion("post_user_name <=", value, "postUserName");
            return (Criteria) this;
        }

        public Criteria andPostUserNameLike(String value) {
            addCriterion("post_user_name like", value, "postUserName");
            return (Criteria) this;
        }

        public Criteria andPostUserNameNotLike(String value) {
            addCriterion("post_user_name not like", value, "postUserName");
            return (Criteria) this;
        }

        public Criteria andPostUserNameIn(List<String> values) {
            addCriterion("post_user_name in", values, "postUserName");
            return (Criteria) this;
        }

        public Criteria andPostUserNameNotIn(List<String> values) {
            addCriterion("post_user_name not in", values, "postUserName");
            return (Criteria) this;
        }

        public Criteria andPostUserNameBetween(String value1, String value2) {
            addCriterion("post_user_name between", value1, value2, "postUserName");
            return (Criteria) this;
        }

        public Criteria andPostUserNameNotBetween(String value1, String value2) {
            addCriterion("post_user_name not between", value1, value2, "postUserName");
            return (Criteria) this;
        }

        public Criteria andPostTitleIsNull() {
            addCriterion("post_title is null");
            return (Criteria) this;
        }

        public Criteria andPostTitleIsNotNull() {
            addCriterion("post_title is not null");
            return (Criteria) this;
        }

        public Criteria andPostTitleEqualTo(String value) {
            addCriterion("post_title =", value, "postTitle");
            return (Criteria) this;
        }

        public Criteria andPostTitleNotEqualTo(String value) {
            addCriterion("post_title <>", value, "postTitle");
            return (Criteria) this;
        }

        public Criteria andPostTitleGreaterThan(String value) {
            addCriterion("post_title >", value, "postTitle");
            return (Criteria) this;
        }

        public Criteria andPostTitleGreaterThanOrEqualTo(String value) {
            addCriterion("post_title >=", value, "postTitle");
            return (Criteria) this;
        }

        public Criteria andPostTitleLessThan(String value) {
            addCriterion("post_title <", value, "postTitle");
            return (Criteria) this;
        }

        public Criteria andPostTitleLessThanOrEqualTo(String value) {
            addCriterion("post_title <=", value, "postTitle");
            return (Criteria) this;
        }

        public Criteria andPostTitleLike(String value) {
            addCriterion("post_title like", value, "postTitle");
            return (Criteria) this;
        }

        public Criteria andPostTitleNotLike(String value) {
            addCriterion("post_title not like", value, "postTitle");
            return (Criteria) this;
        }

        public Criteria andPostTitleIn(List<String> values) {
            addCriterion("post_title in", values, "postTitle");
            return (Criteria) this;
        }

        public Criteria andPostTitleNotIn(List<String> values) {
            addCriterion("post_title not in", values, "postTitle");
            return (Criteria) this;
        }

        public Criteria andPostTitleBetween(String value1, String value2) {
            addCriterion("post_title between", value1, value2, "postTitle");
            return (Criteria) this;
        }

        public Criteria andPostTitleNotBetween(String value1, String value2) {
            addCriterion("post_title not between", value1, value2, "postTitle");
            return (Criteria) this;
        }

        public Criteria andPostGoodCountIsNull() {
            addCriterion("post_good_count is null");
            return (Criteria) this;
        }

        public Criteria andPostGoodCountIsNotNull() {
            addCriterion("post_good_count is not null");
            return (Criteria) this;
        }

        public Criteria andPostGoodCountEqualTo(Integer value) {
            addCriterion("post_good_count =", value, "postGoodCount");
            return (Criteria) this;
        }

        public Criteria andPostGoodCountNotEqualTo(Integer value) {
            addCriterion("post_good_count <>", value, "postGoodCount");
            return (Criteria) this;
        }

        public Criteria andPostGoodCountGreaterThan(Integer value) {
            addCriterion("post_good_count >", value, "postGoodCount");
            return (Criteria) this;
        }

        public Criteria andPostGoodCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("post_good_count >=", value, "postGoodCount");
            return (Criteria) this;
        }

        public Criteria andPostGoodCountLessThan(Integer value) {
            addCriterion("post_good_count <", value, "postGoodCount");
            return (Criteria) this;
        }

        public Criteria andPostGoodCountLessThanOrEqualTo(Integer value) {
            addCriterion("post_good_count <=", value, "postGoodCount");
            return (Criteria) this;
        }

        public Criteria andPostGoodCountIn(List<Integer> values) {
            addCriterion("post_good_count in", values, "postGoodCount");
            return (Criteria) this;
        }

        public Criteria andPostGoodCountNotIn(List<Integer> values) {
            addCriterion("post_good_count not in", values, "postGoodCount");
            return (Criteria) this;
        }

        public Criteria andPostGoodCountBetween(Integer value1, Integer value2) {
            addCriterion("post_good_count between", value1, value2, "postGoodCount");
            return (Criteria) this;
        }

        public Criteria andPostGoodCountNotBetween(Integer value1, Integer value2) {
            addCriterion("post_good_count not between", value1, value2, "postGoodCount");
            return (Criteria) this;
        }

        public Criteria andPostBadCountIsNull() {
            addCriterion("post_bad_count is null");
            return (Criteria) this;
        }

        public Criteria andPostBadCountIsNotNull() {
            addCriterion("post_bad_count is not null");
            return (Criteria) this;
        }

        public Criteria andPostBadCountEqualTo(Integer value) {
            addCriterion("post_bad_count =", value, "postBadCount");
            return (Criteria) this;
        }

        public Criteria andPostBadCountNotEqualTo(Integer value) {
            addCriterion("post_bad_count <>", value, "postBadCount");
            return (Criteria) this;
        }

        public Criteria andPostBadCountGreaterThan(Integer value) {
            addCriterion("post_bad_count >", value, "postBadCount");
            return (Criteria) this;
        }

        public Criteria andPostBadCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("post_bad_count >=", value, "postBadCount");
            return (Criteria) this;
        }

        public Criteria andPostBadCountLessThan(Integer value) {
            addCriterion("post_bad_count <", value, "postBadCount");
            return (Criteria) this;
        }

        public Criteria andPostBadCountLessThanOrEqualTo(Integer value) {
            addCriterion("post_bad_count <=", value, "postBadCount");
            return (Criteria) this;
        }

        public Criteria andPostBadCountIn(List<Integer> values) {
            addCriterion("post_bad_count in", values, "postBadCount");
            return (Criteria) this;
        }

        public Criteria andPostBadCountNotIn(List<Integer> values) {
            addCriterion("post_bad_count not in", values, "postBadCount");
            return (Criteria) this;
        }

        public Criteria andPostBadCountBetween(Integer value1, Integer value2) {
            addCriterion("post_bad_count between", value1, value2, "postBadCount");
            return (Criteria) this;
        }

        public Criteria andPostBadCountNotBetween(Integer value1, Integer value2) {
            addCriterion("post_bad_count not between", value1, value2, "postBadCount");
            return (Criteria) this;
        }

        public Criteria andPostViewCountIsNull() {
            addCriterion("post_view_count is null");
            return (Criteria) this;
        }

        public Criteria andPostViewCountIsNotNull() {
            addCriterion("post_view_count is not null");
            return (Criteria) this;
        }

        public Criteria andPostViewCountEqualTo(Integer value) {
            addCriterion("post_view_count =", value, "postViewCount");
            return (Criteria) this;
        }

        public Criteria andPostViewCountNotEqualTo(Integer value) {
            addCriterion("post_view_count <>", value, "postViewCount");
            return (Criteria) this;
        }

        public Criteria andPostViewCountGreaterThan(Integer value) {
            addCriterion("post_view_count >", value, "postViewCount");
            return (Criteria) this;
        }

        public Criteria andPostViewCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("post_view_count >=", value, "postViewCount");
            return (Criteria) this;
        }

        public Criteria andPostViewCountLessThan(Integer value) {
            addCriterion("post_view_count <", value, "postViewCount");
            return (Criteria) this;
        }

        public Criteria andPostViewCountLessThanOrEqualTo(Integer value) {
            addCriterion("post_view_count <=", value, "postViewCount");
            return (Criteria) this;
        }

        public Criteria andPostViewCountIn(List<Integer> values) {
            addCriterion("post_view_count in", values, "postViewCount");
            return (Criteria) this;
        }

        public Criteria andPostViewCountNotIn(List<Integer> values) {
            addCriterion("post_view_count not in", values, "postViewCount");
            return (Criteria) this;
        }

        public Criteria andPostViewCountBetween(Integer value1, Integer value2) {
            addCriterion("post_view_count between", value1, value2, "postViewCount");
            return (Criteria) this;
        }

        public Criteria andPostViewCountNotBetween(Integer value1, Integer value2) {
            addCriterion("post_view_count not between", value1, value2, "postViewCount");
            return (Criteria) this;
        }

        public Criteria andPostReplyCountIsNull() {
            addCriterion("post_reply_count is null");
            return (Criteria) this;
        }

        public Criteria andPostReplyCountIsNotNull() {
            addCriterion("post_reply_count is not null");
            return (Criteria) this;
        }

        public Criteria andPostReplyCountEqualTo(Integer value) {
            addCriterion("post_reply_count =", value, "postReplyCount");
            return (Criteria) this;
        }

        public Criteria andPostReplyCountNotEqualTo(Integer value) {
            addCriterion("post_reply_count <>", value, "postReplyCount");
            return (Criteria) this;
        }

        public Criteria andPostReplyCountGreaterThan(Integer value) {
            addCriterion("post_reply_count >", value, "postReplyCount");
            return (Criteria) this;
        }

        public Criteria andPostReplyCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("post_reply_count >=", value, "postReplyCount");
            return (Criteria) this;
        }

        public Criteria andPostReplyCountLessThan(Integer value) {
            addCriterion("post_reply_count <", value, "postReplyCount");
            return (Criteria) this;
        }

        public Criteria andPostReplyCountLessThanOrEqualTo(Integer value) {
            addCriterion("post_reply_count <=", value, "postReplyCount");
            return (Criteria) this;
        }

        public Criteria andPostReplyCountIn(List<Integer> values) {
            addCriterion("post_reply_count in", values, "postReplyCount");
            return (Criteria) this;
        }

        public Criteria andPostReplyCountNotIn(List<Integer> values) {
            addCriterion("post_reply_count not in", values, "postReplyCount");
            return (Criteria) this;
        }

        public Criteria andPostReplyCountBetween(Integer value1, Integer value2) {
            addCriterion("post_reply_count between", value1, value2, "postReplyCount");
            return (Criteria) this;
        }

        public Criteria andPostReplyCountNotBetween(Integer value1, Integer value2) {
            addCriterion("post_reply_count not between", value1, value2, "postReplyCount");
            return (Criteria) this;
        }

        public Criteria andPostStatusIsNull() {
            addCriterion("post_status is null");
            return (Criteria) this;
        }

        public Criteria andPostStatusIsNotNull() {
            addCriterion("post_status is not null");
            return (Criteria) this;
        }

        public Criteria andPostStatusEqualTo(Integer value) {
            addCriterion("post_status =", value, "postStatus");
            return (Criteria) this;
        }

        public Criteria andPostStatusNotEqualTo(Integer value) {
            addCriterion("post_status <>", value, "postStatus");
            return (Criteria) this;
        }

        public Criteria andPostStatusGreaterThan(Integer value) {
            addCriterion("post_status >", value, "postStatus");
            return (Criteria) this;
        }

        public Criteria andPostStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("post_status >=", value, "postStatus");
            return (Criteria) this;
        }

        public Criteria andPostStatusLessThan(Integer value) {
            addCriterion("post_status <", value, "postStatus");
            return (Criteria) this;
        }

        public Criteria andPostStatusLessThanOrEqualTo(Integer value) {
            addCriterion("post_status <=", value, "postStatus");
            return (Criteria) this;
        }

        public Criteria andPostStatusIn(List<Integer> values) {
            addCriterion("post_status in", values, "postStatus");
            return (Criteria) this;
        }

        public Criteria andPostStatusNotIn(List<Integer> values) {
            addCriterion("post_status not in", values, "postStatus");
            return (Criteria) this;
        }

        public Criteria andPostStatusBetween(Integer value1, Integer value2) {
            addCriterion("post_status between", value1, value2, "postStatus");
            return (Criteria) this;
        }

        public Criteria andPostStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("post_status not between", value1, value2, "postStatus");
            return (Criteria) this;
        }

        public Criteria andPostCreateTimeIsNull() {
            addCriterion("post_create_time is null");
            return (Criteria) this;
        }

        public Criteria andPostCreateTimeIsNotNull() {
            addCriterion("post_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andPostCreateTimeEqualTo(Date value) {
            addCriterion("post_create_time =", value, "postCreateTime");
            return (Criteria) this;
        }

        public Criteria andPostCreateTimeNotEqualTo(Date value) {
            addCriterion("post_create_time <>", value, "postCreateTime");
            return (Criteria) this;
        }

        public Criteria andPostCreateTimeGreaterThan(Date value) {
            addCriterion("post_create_time >", value, "postCreateTime");
            return (Criteria) this;
        }

        public Criteria andPostCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("post_create_time >=", value, "postCreateTime");
            return (Criteria) this;
        }

        public Criteria andPostCreateTimeLessThan(Date value) {
            addCriterion("post_create_time <", value, "postCreateTime");
            return (Criteria) this;
        }

        public Criteria andPostCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("post_create_time <=", value, "postCreateTime");
            return (Criteria) this;
        }

        public Criteria andPostCreateTimeIn(List<Date> values) {
            addCriterion("post_create_time in", values, "postCreateTime");
            return (Criteria) this;
        }

        public Criteria andPostCreateTimeNotIn(List<Date> values) {
            addCriterion("post_create_time not in", values, "postCreateTime");
            return (Criteria) this;
        }

        public Criteria andPostCreateTimeBetween(Date value1, Date value2) {
            addCriterion("post_create_time between", value1, value2, "postCreateTime");
            return (Criteria) this;
        }

        public Criteria andPostCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("post_create_time not between", value1, value2, "postCreateTime");
            return (Criteria) this;
        }

        public Criteria andPostUpdateTimeIsNull() {
            addCriterion("post_update_time is null");
            return (Criteria) this;
        }

        public Criteria andPostUpdateTimeIsNotNull() {
            addCriterion("post_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andPostUpdateTimeEqualTo(Date value) {
            addCriterion("post_update_time =", value, "postUpdateTime");
            return (Criteria) this;
        }

        public Criteria andPostUpdateTimeNotEqualTo(Date value) {
            addCriterion("post_update_time <>", value, "postUpdateTime");
            return (Criteria) this;
        }

        public Criteria andPostUpdateTimeGreaterThan(Date value) {
            addCriterion("post_update_time >", value, "postUpdateTime");
            return (Criteria) this;
        }

        public Criteria andPostUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("post_update_time >=", value, "postUpdateTime");
            return (Criteria) this;
        }

        public Criteria andPostUpdateTimeLessThan(Date value) {
            addCriterion("post_update_time <", value, "postUpdateTime");
            return (Criteria) this;
        }

        public Criteria andPostUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("post_update_time <=", value, "postUpdateTime");
            return (Criteria) this;
        }

        public Criteria andPostUpdateTimeIn(List<Date> values) {
            addCriterion("post_update_time in", values, "postUpdateTime");
            return (Criteria) this;
        }

        public Criteria andPostUpdateTimeNotIn(List<Date> values) {
            addCriterion("post_update_time not in", values, "postUpdateTime");
            return (Criteria) this;
        }

        public Criteria andPostUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("post_update_time between", value1, value2, "postUpdateTime");
            return (Criteria) this;
        }

        public Criteria andPostUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("post_update_time not between", value1, value2, "postUpdateTime");
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