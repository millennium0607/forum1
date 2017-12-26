package com.wjb.forum.db.po;

import java.util.ArrayList;
import java.util.List;

public class BoardExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BoardExample() {
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

        public Criteria andBoardIdIsNull() {
            addCriterion("board_id is null");
            return (Criteria) this;
        }

        public Criteria andBoardIdIsNotNull() {
            addCriterion("board_id is not null");
            return (Criteria) this;
        }

        public Criteria andBoardIdEqualTo(Integer value) {
            addCriterion("board_id =", value, "boardId");
            return (Criteria) this;
        }

        public Criteria andBoardIdNotEqualTo(Integer value) {
            addCriterion("board_id <>", value, "boardId");
            return (Criteria) this;
        }

        public Criteria andBoardIdGreaterThan(Integer value) {
            addCriterion("board_id >", value, "boardId");
            return (Criteria) this;
        }

        public Criteria andBoardIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("board_id >=", value, "boardId");
            return (Criteria) this;
        }

        public Criteria andBoardIdLessThan(Integer value) {
            addCriterion("board_id <", value, "boardId");
            return (Criteria) this;
        }

        public Criteria andBoardIdLessThanOrEqualTo(Integer value) {
            addCriterion("board_id <=", value, "boardId");
            return (Criteria) this;
        }

        public Criteria andBoardIdIn(List<Integer> values) {
            addCriterion("board_id in", values, "boardId");
            return (Criteria) this;
        }

        public Criteria andBoardIdNotIn(List<Integer> values) {
            addCriterion("board_id not in", values, "boardId");
            return (Criteria) this;
        }

        public Criteria andBoardIdBetween(Integer value1, Integer value2) {
            addCriterion("board_id between", value1, value2, "boardId");
            return (Criteria) this;
        }

        public Criteria andBoardIdNotBetween(Integer value1, Integer value2) {
            addCriterion("board_id not between", value1, value2, "boardId");
            return (Criteria) this;
        }

        public Criteria andBoardNameIsNull() {
            addCriterion("board_name is null");
            return (Criteria) this;
        }

        public Criteria andBoardNameIsNotNull() {
            addCriterion("board_name is not null");
            return (Criteria) this;
        }

        public Criteria andBoardNameEqualTo(String value) {
            addCriterion("board_name =", value, "boardName");
            return (Criteria) this;
        }

        public Criteria andBoardNameNotEqualTo(String value) {
            addCriterion("board_name <>", value, "boardName");
            return (Criteria) this;
        }

        public Criteria andBoardNameGreaterThan(String value) {
            addCriterion("board_name >", value, "boardName");
            return (Criteria) this;
        }

        public Criteria andBoardNameGreaterThanOrEqualTo(String value) {
            addCriterion("board_name >=", value, "boardName");
            return (Criteria) this;
        }

        public Criteria andBoardNameLessThan(String value) {
            addCriterion("board_name <", value, "boardName");
            return (Criteria) this;
        }

        public Criteria andBoardNameLessThanOrEqualTo(String value) {
            addCriterion("board_name <=", value, "boardName");
            return (Criteria) this;
        }

        public Criteria andBoardNameLike(String value) {
            addCriterion("board_name like", value, "boardName");
            return (Criteria) this;
        }

        public Criteria andBoardNameNotLike(String value) {
            addCriterion("board_name not like", value, "boardName");
            return (Criteria) this;
        }

        public Criteria andBoardNameIn(List<String> values) {
            addCriterion("board_name in", values, "boardName");
            return (Criteria) this;
        }

        public Criteria andBoardNameNotIn(List<String> values) {
            addCriterion("board_name not in", values, "boardName");
            return (Criteria) this;
        }

        public Criteria andBoardNameBetween(String value1, String value2) {
            addCriterion("board_name between", value1, value2, "boardName");
            return (Criteria) this;
        }

        public Criteria andBoardNameNotBetween(String value1, String value2) {
            addCriterion("board_name not between", value1, value2, "boardName");
            return (Criteria) this;
        }

        public Criteria andBoardDescIsNull() {
            addCriterion("board_desc is null");
            return (Criteria) this;
        }

        public Criteria andBoardDescIsNotNull() {
            addCriterion("board_desc is not null");
            return (Criteria) this;
        }

        public Criteria andBoardDescEqualTo(String value) {
            addCriterion("board_desc =", value, "boardDesc");
            return (Criteria) this;
        }

        public Criteria andBoardDescNotEqualTo(String value) {
            addCriterion("board_desc <>", value, "boardDesc");
            return (Criteria) this;
        }

        public Criteria andBoardDescGreaterThan(String value) {
            addCriterion("board_desc >", value, "boardDesc");
            return (Criteria) this;
        }

        public Criteria andBoardDescGreaterThanOrEqualTo(String value) {
            addCriterion("board_desc >=", value, "boardDesc");
            return (Criteria) this;
        }

        public Criteria andBoardDescLessThan(String value) {
            addCriterion("board_desc <", value, "boardDesc");
            return (Criteria) this;
        }

        public Criteria andBoardDescLessThanOrEqualTo(String value) {
            addCriterion("board_desc <=", value, "boardDesc");
            return (Criteria) this;
        }

        public Criteria andBoardDescLike(String value) {
            addCriterion("board_desc like", value, "boardDesc");
            return (Criteria) this;
        }

        public Criteria andBoardDescNotLike(String value) {
            addCriterion("board_desc not like", value, "boardDesc");
            return (Criteria) this;
        }

        public Criteria andBoardDescIn(List<String> values) {
            addCriterion("board_desc in", values, "boardDesc");
            return (Criteria) this;
        }

        public Criteria andBoardDescNotIn(List<String> values) {
            addCriterion("board_desc not in", values, "boardDesc");
            return (Criteria) this;
        }

        public Criteria andBoardDescBetween(String value1, String value2) {
            addCriterion("board_desc between", value1, value2, "boardDesc");
            return (Criteria) this;
        }

        public Criteria andBoardDescNotBetween(String value1, String value2) {
            addCriterion("board_desc not between", value1, value2, "boardDesc");
            return (Criteria) this;
        }

        public Criteria andBoardPostNumIsNull() {
            addCriterion("board_post_num is null");
            return (Criteria) this;
        }

        public Criteria andBoardPostNumIsNotNull() {
            addCriterion("board_post_num is not null");
            return (Criteria) this;
        }

        public Criteria andBoardPostNumEqualTo(Integer value) {
            addCriterion("board_post_num =", value, "boardPostNum");
            return (Criteria) this;
        }

        public Criteria andBoardPostNumNotEqualTo(Integer value) {
            addCriterion("board_post_num <>", value, "boardPostNum");
            return (Criteria) this;
        }

        public Criteria andBoardPostNumGreaterThan(Integer value) {
            addCriterion("board_post_num >", value, "boardPostNum");
            return (Criteria) this;
        }

        public Criteria andBoardPostNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("board_post_num >=", value, "boardPostNum");
            return (Criteria) this;
        }

        public Criteria andBoardPostNumLessThan(Integer value) {
            addCriterion("board_post_num <", value, "boardPostNum");
            return (Criteria) this;
        }

        public Criteria andBoardPostNumLessThanOrEqualTo(Integer value) {
            addCriterion("board_post_num <=", value, "boardPostNum");
            return (Criteria) this;
        }

        public Criteria andBoardPostNumIn(List<Integer> values) {
            addCriterion("board_post_num in", values, "boardPostNum");
            return (Criteria) this;
        }

        public Criteria andBoardPostNumNotIn(List<Integer> values) {
            addCriterion("board_post_num not in", values, "boardPostNum");
            return (Criteria) this;
        }

        public Criteria andBoardPostNumBetween(Integer value1, Integer value2) {
            addCriterion("board_post_num between", value1, value2, "boardPostNum");
            return (Criteria) this;
        }

        public Criteria andBoardPostNumNotBetween(Integer value1, Integer value2) {
            addCriterion("board_post_num not between", value1, value2, "boardPostNum");
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