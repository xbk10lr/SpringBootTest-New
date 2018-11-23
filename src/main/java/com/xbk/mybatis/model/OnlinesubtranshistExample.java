package com.xbk.mybatis.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OnlinesubtranshistExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OnlinesubtranshistExample() {
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

        public Criteria andSubtransseqnbrIsNull() {
            addCriterion("SUBTRANSSEQNBR is null");
            return (Criteria) this;
        }

        public Criteria andSubtransseqnbrIsNotNull() {
            addCriterion("SUBTRANSSEQNBR is not null");
            return (Criteria) this;
        }

        public Criteria andSubtransseqnbrEqualTo(String value) {
            addCriterion("SUBTRANSSEQNBR =", value, "subtransseqnbr");
            return (Criteria) this;
        }

        public Criteria andSubtransseqnbrNotEqualTo(String value) {
            addCriterion("SUBTRANSSEQNBR <>", value, "subtransseqnbr");
            return (Criteria) this;
        }

        public Criteria andSubtransseqnbrGreaterThan(String value) {
            addCriterion("SUBTRANSSEQNBR >", value, "subtransseqnbr");
            return (Criteria) this;
        }

        public Criteria andSubtransseqnbrGreaterThanOrEqualTo(String value) {
            addCriterion("SUBTRANSSEQNBR >=", value, "subtransseqnbr");
            return (Criteria) this;
        }

        public Criteria andSubtransseqnbrLessThan(String value) {
            addCriterion("SUBTRANSSEQNBR <", value, "subtransseqnbr");
            return (Criteria) this;
        }

        public Criteria andSubtransseqnbrLessThanOrEqualTo(String value) {
            addCriterion("SUBTRANSSEQNBR <=", value, "subtransseqnbr");
            return (Criteria) this;
        }

        public Criteria andSubtransseqnbrLike(String value) {
            addCriterion("SUBTRANSSEQNBR like", value, "subtransseqnbr");
            return (Criteria) this;
        }

        public Criteria andSubtransseqnbrNotLike(String value) {
            addCriterion("SUBTRANSSEQNBR not like", value, "subtransseqnbr");
            return (Criteria) this;
        }

        public Criteria andSubtransseqnbrIn(List<String> values) {
            addCriterion("SUBTRANSSEQNBR in", values, "subtransseqnbr");
            return (Criteria) this;
        }

        public Criteria andSubtransseqnbrNotIn(List<String> values) {
            addCriterion("SUBTRANSSEQNBR not in", values, "subtransseqnbr");
            return (Criteria) this;
        }

        public Criteria andSubtransseqnbrBetween(String value1, String value2) {
            addCriterion("SUBTRANSSEQNBR between", value1, value2, "subtransseqnbr");
            return (Criteria) this;
        }

        public Criteria andSubtransseqnbrNotBetween(String value1, String value2) {
            addCriterion("SUBTRANSSEQNBR not between", value1, value2, "subtransseqnbr");
            return (Criteria) this;
        }

        public Criteria andTransseqnbrIsNull() {
            addCriterion("TRANSSEQNBR is null");
            return (Criteria) this;
        }

        public Criteria andTransseqnbrIsNotNull() {
            addCriterion("TRANSSEQNBR is not null");
            return (Criteria) this;
        }

        public Criteria andTransseqnbrEqualTo(String value) {
            addCriterion("TRANSSEQNBR =", value, "transseqnbr");
            return (Criteria) this;
        }

        public Criteria andTransseqnbrNotEqualTo(String value) {
            addCriterion("TRANSSEQNBR <>", value, "transseqnbr");
            return (Criteria) this;
        }

        public Criteria andTransseqnbrGreaterThan(String value) {
            addCriterion("TRANSSEQNBR >", value, "transseqnbr");
            return (Criteria) this;
        }

        public Criteria andTransseqnbrGreaterThanOrEqualTo(String value) {
            addCriterion("TRANSSEQNBR >=", value, "transseqnbr");
            return (Criteria) this;
        }

        public Criteria andTransseqnbrLessThan(String value) {
            addCriterion("TRANSSEQNBR <", value, "transseqnbr");
            return (Criteria) this;
        }

        public Criteria andTransseqnbrLessThanOrEqualTo(String value) {
            addCriterion("TRANSSEQNBR <=", value, "transseqnbr");
            return (Criteria) this;
        }

        public Criteria andTransseqnbrLike(String value) {
            addCriterion("TRANSSEQNBR like", value, "transseqnbr");
            return (Criteria) this;
        }

        public Criteria andTransseqnbrNotLike(String value) {
            addCriterion("TRANSSEQNBR not like", value, "transseqnbr");
            return (Criteria) this;
        }

        public Criteria andTransseqnbrIn(List<String> values) {
            addCriterion("TRANSSEQNBR in", values, "transseqnbr");
            return (Criteria) this;
        }

        public Criteria andTransseqnbrNotIn(List<String> values) {
            addCriterion("TRANSSEQNBR not in", values, "transseqnbr");
            return (Criteria) this;
        }

        public Criteria andTransseqnbrBetween(String value1, String value2) {
            addCriterion("TRANSSEQNBR between", value1, value2, "transseqnbr");
            return (Criteria) this;
        }

        public Criteria andTransseqnbrNotBetween(String value1, String value2) {
            addCriterion("TRANSSEQNBR not between", value1, value2, "transseqnbr");
            return (Criteria) this;
        }

        public Criteria andDownsysseqnbrIsNull() {
            addCriterion("DOWNSYSSEQNBR is null");
            return (Criteria) this;
        }

        public Criteria andDownsysseqnbrIsNotNull() {
            addCriterion("DOWNSYSSEQNBR is not null");
            return (Criteria) this;
        }

        public Criteria andDownsysseqnbrEqualTo(String value) {
            addCriterion("DOWNSYSSEQNBR =", value, "downsysseqnbr");
            return (Criteria) this;
        }

        public Criteria andDownsysseqnbrNotEqualTo(String value) {
            addCriterion("DOWNSYSSEQNBR <>", value, "downsysseqnbr");
            return (Criteria) this;
        }

        public Criteria andDownsysseqnbrGreaterThan(String value) {
            addCriterion("DOWNSYSSEQNBR >", value, "downsysseqnbr");
            return (Criteria) this;
        }

        public Criteria andDownsysseqnbrGreaterThanOrEqualTo(String value) {
            addCriterion("DOWNSYSSEQNBR >=", value, "downsysseqnbr");
            return (Criteria) this;
        }

        public Criteria andDownsysseqnbrLessThan(String value) {
            addCriterion("DOWNSYSSEQNBR <", value, "downsysseqnbr");
            return (Criteria) this;
        }

        public Criteria andDownsysseqnbrLessThanOrEqualTo(String value) {
            addCriterion("DOWNSYSSEQNBR <=", value, "downsysseqnbr");
            return (Criteria) this;
        }

        public Criteria andDownsysseqnbrLike(String value) {
            addCriterion("DOWNSYSSEQNBR like", value, "downsysseqnbr");
            return (Criteria) this;
        }

        public Criteria andDownsysseqnbrNotLike(String value) {
            addCriterion("DOWNSYSSEQNBR not like", value, "downsysseqnbr");
            return (Criteria) this;
        }

        public Criteria andDownsysseqnbrIn(List<String> values) {
            addCriterion("DOWNSYSSEQNBR in", values, "downsysseqnbr");
            return (Criteria) this;
        }

        public Criteria andDownsysseqnbrNotIn(List<String> values) {
            addCriterion("DOWNSYSSEQNBR not in", values, "downsysseqnbr");
            return (Criteria) this;
        }

        public Criteria andDownsysseqnbrBetween(String value1, String value2) {
            addCriterion("DOWNSYSSEQNBR between", value1, value2, "downsysseqnbr");
            return (Criteria) this;
        }

        public Criteria andDownsysseqnbrNotBetween(String value1, String value2) {
            addCriterion("DOWNSYSSEQNBR not between", value1, value2, "downsysseqnbr");
            return (Criteria) this;
        }

        public Criteria andCleardateIsNull() {
            addCriterion("CLEARDATE is null");
            return (Criteria) this;
        }

        public Criteria andCleardateIsNotNull() {
            addCriterion("CLEARDATE is not null");
            return (Criteria) this;
        }

        public Criteria andCleardateEqualTo(Date value) {
            addCriterion("CLEARDATE =", value, "cleardate");
            return (Criteria) this;
        }

        public Criteria andCleardateNotEqualTo(Date value) {
            addCriterion("CLEARDATE <>", value, "cleardate");
            return (Criteria) this;
        }

        public Criteria andCleardateGreaterThan(Date value) {
            addCriterion("CLEARDATE >", value, "cleardate");
            return (Criteria) this;
        }

        public Criteria andCleardateGreaterThanOrEqualTo(Date value) {
            addCriterion("CLEARDATE >=", value, "cleardate");
            return (Criteria) this;
        }

        public Criteria andCleardateLessThan(Date value) {
            addCriterion("CLEARDATE <", value, "cleardate");
            return (Criteria) this;
        }

        public Criteria andCleardateLessThanOrEqualTo(Date value) {
            addCriterion("CLEARDATE <=", value, "cleardate");
            return (Criteria) this;
        }

        public Criteria andCleardateIn(List<Date> values) {
            addCriterion("CLEARDATE in", values, "cleardate");
            return (Criteria) this;
        }

        public Criteria andCleardateNotIn(List<Date> values) {
            addCriterion("CLEARDATE not in", values, "cleardate");
            return (Criteria) this;
        }

        public Criteria andCleardateBetween(Date value1, Date value2) {
            addCriterion("CLEARDATE between", value1, value2, "cleardate");
            return (Criteria) this;
        }

        public Criteria andCleardateNotBetween(Date value1, Date value2) {
            addCriterion("CLEARDATE not between", value1, value2, "cleardate");
            return (Criteria) this;
        }

        public Criteria andMertransdateIsNull() {
            addCriterion("MERTRANSDATE is null");
            return (Criteria) this;
        }

        public Criteria andMertransdateIsNotNull() {
            addCriterion("MERTRANSDATE is not null");
            return (Criteria) this;
        }

        public Criteria andMertransdateEqualTo(Date value) {
            addCriterion("MERTRANSDATE =", value, "mertransdate");
            return (Criteria) this;
        }

        public Criteria andMertransdateNotEqualTo(Date value) {
            addCriterion("MERTRANSDATE <>", value, "mertransdate");
            return (Criteria) this;
        }

        public Criteria andMertransdateGreaterThan(Date value) {
            addCriterion("MERTRANSDATE >", value, "mertransdate");
            return (Criteria) this;
        }

        public Criteria andMertransdateGreaterThanOrEqualTo(Date value) {
            addCriterion("MERTRANSDATE >=", value, "mertransdate");
            return (Criteria) this;
        }

        public Criteria andMertransdateLessThan(Date value) {
            addCriterion("MERTRANSDATE <", value, "mertransdate");
            return (Criteria) this;
        }

        public Criteria andMertransdateLessThanOrEqualTo(Date value) {
            addCriterion("MERTRANSDATE <=", value, "mertransdate");
            return (Criteria) this;
        }

        public Criteria andMertransdateIn(List<Date> values) {
            addCriterion("MERTRANSDATE in", values, "mertransdate");
            return (Criteria) this;
        }

        public Criteria andMertransdateNotIn(List<Date> values) {
            addCriterion("MERTRANSDATE not in", values, "mertransdate");
            return (Criteria) this;
        }

        public Criteria andMertransdateBetween(Date value1, Date value2) {
            addCriterion("MERTRANSDATE between", value1, value2, "mertransdate");
            return (Criteria) this;
        }

        public Criteria andMertransdateNotBetween(Date value1, Date value2) {
            addCriterion("MERTRANSDATE not between", value1, value2, "mertransdate");
            return (Criteria) this;
        }

        public Criteria andMertransdatetimeIsNull() {
            addCriterion("MERTRANSDATETIME is null");
            return (Criteria) this;
        }

        public Criteria andMertransdatetimeIsNotNull() {
            addCriterion("MERTRANSDATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andMertransdatetimeEqualTo(Date value) {
            addCriterion("MERTRANSDATETIME =", value, "mertransdatetime");
            return (Criteria) this;
        }

        public Criteria andMertransdatetimeNotEqualTo(Date value) {
            addCriterion("MERTRANSDATETIME <>", value, "mertransdatetime");
            return (Criteria) this;
        }

        public Criteria andMertransdatetimeGreaterThan(Date value) {
            addCriterion("MERTRANSDATETIME >", value, "mertransdatetime");
            return (Criteria) this;
        }

        public Criteria andMertransdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("MERTRANSDATETIME >=", value, "mertransdatetime");
            return (Criteria) this;
        }

        public Criteria andMertransdatetimeLessThan(Date value) {
            addCriterion("MERTRANSDATETIME <", value, "mertransdatetime");
            return (Criteria) this;
        }

        public Criteria andMertransdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("MERTRANSDATETIME <=", value, "mertransdatetime");
            return (Criteria) this;
        }

        public Criteria andMertransdatetimeIn(List<Date> values) {
            addCriterion("MERTRANSDATETIME in", values, "mertransdatetime");
            return (Criteria) this;
        }

        public Criteria andMertransdatetimeNotIn(List<Date> values) {
            addCriterion("MERTRANSDATETIME not in", values, "mertransdatetime");
            return (Criteria) this;
        }

        public Criteria andMertransdatetimeBetween(Date value1, Date value2) {
            addCriterion("MERTRANSDATETIME between", value1, value2, "mertransdatetime");
            return (Criteria) this;
        }

        public Criteria andMertransdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("MERTRANSDATETIME not between", value1, value2, "mertransdatetime");
            return (Criteria) this;
        }

        public Criteria andOrigsubmerseqnbrIsNull() {
            addCriterion("ORIGSUBMERSEQNBR is null");
            return (Criteria) this;
        }

        public Criteria andOrigsubmerseqnbrIsNotNull() {
            addCriterion("ORIGSUBMERSEQNBR is not null");
            return (Criteria) this;
        }

        public Criteria andOrigsubmerseqnbrEqualTo(String value) {
            addCriterion("ORIGSUBMERSEQNBR =", value, "origsubmerseqnbr");
            return (Criteria) this;
        }

        public Criteria andOrigsubmerseqnbrNotEqualTo(String value) {
            addCriterion("ORIGSUBMERSEQNBR <>", value, "origsubmerseqnbr");
            return (Criteria) this;
        }

        public Criteria andOrigsubmerseqnbrGreaterThan(String value) {
            addCriterion("ORIGSUBMERSEQNBR >", value, "origsubmerseqnbr");
            return (Criteria) this;
        }

        public Criteria andOrigsubmerseqnbrGreaterThanOrEqualTo(String value) {
            addCriterion("ORIGSUBMERSEQNBR >=", value, "origsubmerseqnbr");
            return (Criteria) this;
        }

        public Criteria andOrigsubmerseqnbrLessThan(String value) {
            addCriterion("ORIGSUBMERSEQNBR <", value, "origsubmerseqnbr");
            return (Criteria) this;
        }

        public Criteria andOrigsubmerseqnbrLessThanOrEqualTo(String value) {
            addCriterion("ORIGSUBMERSEQNBR <=", value, "origsubmerseqnbr");
            return (Criteria) this;
        }

        public Criteria andOrigsubmerseqnbrLike(String value) {
            addCriterion("ORIGSUBMERSEQNBR like", value, "origsubmerseqnbr");
            return (Criteria) this;
        }

        public Criteria andOrigsubmerseqnbrNotLike(String value) {
            addCriterion("ORIGSUBMERSEQNBR not like", value, "origsubmerseqnbr");
            return (Criteria) this;
        }

        public Criteria andOrigsubmerseqnbrIn(List<String> values) {
            addCriterion("ORIGSUBMERSEQNBR in", values, "origsubmerseqnbr");
            return (Criteria) this;
        }

        public Criteria andOrigsubmerseqnbrNotIn(List<String> values) {
            addCriterion("ORIGSUBMERSEQNBR not in", values, "origsubmerseqnbr");
            return (Criteria) this;
        }

        public Criteria andOrigsubmerseqnbrBetween(String value1, String value2) {
            addCriterion("ORIGSUBMERSEQNBR between", value1, value2, "origsubmerseqnbr");
            return (Criteria) this;
        }

        public Criteria andOrigsubmerseqnbrNotBetween(String value1, String value2) {
            addCriterion("ORIGSUBMERSEQNBR not between", value1, value2, "origsubmerseqnbr");
            return (Criteria) this;
        }

        public Criteria andOrigsubmertransdateIsNull() {
            addCriterion("ORIGSUBMERTRANSDATE is null");
            return (Criteria) this;
        }

        public Criteria andOrigsubmertransdateIsNotNull() {
            addCriterion("ORIGSUBMERTRANSDATE is not null");
            return (Criteria) this;
        }

        public Criteria andOrigsubmertransdateEqualTo(Date value) {
            addCriterion("ORIGSUBMERTRANSDATE =", value, "origsubmertransdate");
            return (Criteria) this;
        }

        public Criteria andOrigsubmertransdateNotEqualTo(Date value) {
            addCriterion("ORIGSUBMERTRANSDATE <>", value, "origsubmertransdate");
            return (Criteria) this;
        }

        public Criteria andOrigsubmertransdateGreaterThan(Date value) {
            addCriterion("ORIGSUBMERTRANSDATE >", value, "origsubmertransdate");
            return (Criteria) this;
        }

        public Criteria andOrigsubmertransdateGreaterThanOrEqualTo(Date value) {
            addCriterion("ORIGSUBMERTRANSDATE >=", value, "origsubmertransdate");
            return (Criteria) this;
        }

        public Criteria andOrigsubmertransdateLessThan(Date value) {
            addCriterion("ORIGSUBMERTRANSDATE <", value, "origsubmertransdate");
            return (Criteria) this;
        }

        public Criteria andOrigsubmertransdateLessThanOrEqualTo(Date value) {
            addCriterion("ORIGSUBMERTRANSDATE <=", value, "origsubmertransdate");
            return (Criteria) this;
        }

        public Criteria andOrigsubmertransdateIn(List<Date> values) {
            addCriterion("ORIGSUBMERTRANSDATE in", values, "origsubmertransdate");
            return (Criteria) this;
        }

        public Criteria andOrigsubmertransdateNotIn(List<Date> values) {
            addCriterion("ORIGSUBMERTRANSDATE not in", values, "origsubmertransdate");
            return (Criteria) this;
        }

        public Criteria andOrigsubmertransdateBetween(Date value1, Date value2) {
            addCriterion("ORIGSUBMERTRANSDATE between", value1, value2, "origsubmertransdate");
            return (Criteria) this;
        }

        public Criteria andOrigsubmertransdateNotBetween(Date value1, Date value2) {
            addCriterion("ORIGSUBMERTRANSDATE not between", value1, value2, "origsubmertransdate");
            return (Criteria) this;
        }

        public Criteria andOrigsubtransseqnbrIsNull() {
            addCriterion("ORIGSUBTRANSSEQNBR is null");
            return (Criteria) this;
        }

        public Criteria andOrigsubtransseqnbrIsNotNull() {
            addCriterion("ORIGSUBTRANSSEQNBR is not null");
            return (Criteria) this;
        }

        public Criteria andOrigsubtransseqnbrEqualTo(String value) {
            addCriterion("ORIGSUBTRANSSEQNBR =", value, "origsubtransseqnbr");
            return (Criteria) this;
        }

        public Criteria andOrigsubtransseqnbrNotEqualTo(String value) {
            addCriterion("ORIGSUBTRANSSEQNBR <>", value, "origsubtransseqnbr");
            return (Criteria) this;
        }

        public Criteria andOrigsubtransseqnbrGreaterThan(String value) {
            addCriterion("ORIGSUBTRANSSEQNBR >", value, "origsubtransseqnbr");
            return (Criteria) this;
        }

        public Criteria andOrigsubtransseqnbrGreaterThanOrEqualTo(String value) {
            addCriterion("ORIGSUBTRANSSEQNBR >=", value, "origsubtransseqnbr");
            return (Criteria) this;
        }

        public Criteria andOrigsubtransseqnbrLessThan(String value) {
            addCriterion("ORIGSUBTRANSSEQNBR <", value, "origsubtransseqnbr");
            return (Criteria) this;
        }

        public Criteria andOrigsubtransseqnbrLessThanOrEqualTo(String value) {
            addCriterion("ORIGSUBTRANSSEQNBR <=", value, "origsubtransseqnbr");
            return (Criteria) this;
        }

        public Criteria andOrigsubtransseqnbrLike(String value) {
            addCriterion("ORIGSUBTRANSSEQNBR like", value, "origsubtransseqnbr");
            return (Criteria) this;
        }

        public Criteria andOrigsubtransseqnbrNotLike(String value) {
            addCriterion("ORIGSUBTRANSSEQNBR not like", value, "origsubtransseqnbr");
            return (Criteria) this;
        }

        public Criteria andOrigsubtransseqnbrIn(List<String> values) {
            addCriterion("ORIGSUBTRANSSEQNBR in", values, "origsubtransseqnbr");
            return (Criteria) this;
        }

        public Criteria andOrigsubtransseqnbrNotIn(List<String> values) {
            addCriterion("ORIGSUBTRANSSEQNBR not in", values, "origsubtransseqnbr");
            return (Criteria) this;
        }

        public Criteria andOrigsubtransseqnbrBetween(String value1, String value2) {
            addCriterion("ORIGSUBTRANSSEQNBR between", value1, value2, "origsubtransseqnbr");
            return (Criteria) this;
        }

        public Criteria andOrigsubtransseqnbrNotBetween(String value1, String value2) {
            addCriterion("ORIGSUBTRANSSEQNBR not between", value1, value2, "origsubtransseqnbr");
            return (Criteria) this;
        }

        public Criteria andOrigcleardateIsNull() {
            addCriterion("ORIGCLEARDATE is null");
            return (Criteria) this;
        }

        public Criteria andOrigcleardateIsNotNull() {
            addCriterion("ORIGCLEARDATE is not null");
            return (Criteria) this;
        }

        public Criteria andOrigcleardateEqualTo(Date value) {
            addCriterion("ORIGCLEARDATE =", value, "origcleardate");
            return (Criteria) this;
        }

        public Criteria andOrigcleardateNotEqualTo(Date value) {
            addCriterion("ORIGCLEARDATE <>", value, "origcleardate");
            return (Criteria) this;
        }

        public Criteria andOrigcleardateGreaterThan(Date value) {
            addCriterion("ORIGCLEARDATE >", value, "origcleardate");
            return (Criteria) this;
        }

        public Criteria andOrigcleardateGreaterThanOrEqualTo(Date value) {
            addCriterion("ORIGCLEARDATE >=", value, "origcleardate");
            return (Criteria) this;
        }

        public Criteria andOrigcleardateLessThan(Date value) {
            addCriterion("ORIGCLEARDATE <", value, "origcleardate");
            return (Criteria) this;
        }

        public Criteria andOrigcleardateLessThanOrEqualTo(Date value) {
            addCriterion("ORIGCLEARDATE <=", value, "origcleardate");
            return (Criteria) this;
        }

        public Criteria andOrigcleardateIn(List<Date> values) {
            addCriterion("ORIGCLEARDATE in", values, "origcleardate");
            return (Criteria) this;
        }

        public Criteria andOrigcleardateNotIn(List<Date> values) {
            addCriterion("ORIGCLEARDATE not in", values, "origcleardate");
            return (Criteria) this;
        }

        public Criteria andOrigcleardateBetween(Date value1, Date value2) {
            addCriterion("ORIGCLEARDATE between", value1, value2, "origcleardate");
            return (Criteria) this;
        }

        public Criteria andOrigcleardateNotBetween(Date value1, Date value2) {
            addCriterion("ORIGCLEARDATE not between", value1, value2, "origcleardate");
            return (Criteria) this;
        }

        public Criteria andTranscodeIsNull() {
            addCriterion("TRANSCODE is null");
            return (Criteria) this;
        }

        public Criteria andTranscodeIsNotNull() {
            addCriterion("TRANSCODE is not null");
            return (Criteria) this;
        }

        public Criteria andTranscodeEqualTo(String value) {
            addCriterion("TRANSCODE =", value, "transcode");
            return (Criteria) this;
        }

        public Criteria andTranscodeNotEqualTo(String value) {
            addCriterion("TRANSCODE <>", value, "transcode");
            return (Criteria) this;
        }

        public Criteria andTranscodeGreaterThan(String value) {
            addCriterion("TRANSCODE >", value, "transcode");
            return (Criteria) this;
        }

        public Criteria andTranscodeGreaterThanOrEqualTo(String value) {
            addCriterion("TRANSCODE >=", value, "transcode");
            return (Criteria) this;
        }

        public Criteria andTranscodeLessThan(String value) {
            addCriterion("TRANSCODE <", value, "transcode");
            return (Criteria) this;
        }

        public Criteria andTranscodeLessThanOrEqualTo(String value) {
            addCriterion("TRANSCODE <=", value, "transcode");
            return (Criteria) this;
        }

        public Criteria andTranscodeLike(String value) {
            addCriterion("TRANSCODE like", value, "transcode");
            return (Criteria) this;
        }

        public Criteria andTranscodeNotLike(String value) {
            addCriterion("TRANSCODE not like", value, "transcode");
            return (Criteria) this;
        }

        public Criteria andTranscodeIn(List<String> values) {
            addCriterion("TRANSCODE in", values, "transcode");
            return (Criteria) this;
        }

        public Criteria andTranscodeNotIn(List<String> values) {
            addCriterion("TRANSCODE not in", values, "transcode");
            return (Criteria) this;
        }

        public Criteria andTranscodeBetween(String value1, String value2) {
            addCriterion("TRANSCODE between", value1, value2, "transcode");
            return (Criteria) this;
        }

        public Criteria andTranscodeNotBetween(String value1, String value2) {
            addCriterion("TRANSCODE not between", value1, value2, "transcode");
            return (Criteria) this;
        }

        public Criteria andMernbrIsNull() {
            addCriterion("MERNBR is null");
            return (Criteria) this;
        }

        public Criteria andMernbrIsNotNull() {
            addCriterion("MERNBR is not null");
            return (Criteria) this;
        }

        public Criteria andMernbrEqualTo(String value) {
            addCriterion("MERNBR =", value, "mernbr");
            return (Criteria) this;
        }

        public Criteria andMernbrNotEqualTo(String value) {
            addCriterion("MERNBR <>", value, "mernbr");
            return (Criteria) this;
        }

        public Criteria andMernbrGreaterThan(String value) {
            addCriterion("MERNBR >", value, "mernbr");
            return (Criteria) this;
        }

        public Criteria andMernbrGreaterThanOrEqualTo(String value) {
            addCriterion("MERNBR >=", value, "mernbr");
            return (Criteria) this;
        }

        public Criteria andMernbrLessThan(String value) {
            addCriterion("MERNBR <", value, "mernbr");
            return (Criteria) this;
        }

        public Criteria andMernbrLessThanOrEqualTo(String value) {
            addCriterion("MERNBR <=", value, "mernbr");
            return (Criteria) this;
        }

        public Criteria andMernbrLike(String value) {
            addCriterion("MERNBR like", value, "mernbr");
            return (Criteria) this;
        }

        public Criteria andMernbrNotLike(String value) {
            addCriterion("MERNBR not like", value, "mernbr");
            return (Criteria) this;
        }

        public Criteria andMernbrIn(List<String> values) {
            addCriterion("MERNBR in", values, "mernbr");
            return (Criteria) this;
        }

        public Criteria andMernbrNotIn(List<String> values) {
            addCriterion("MERNBR not in", values, "mernbr");
            return (Criteria) this;
        }

        public Criteria andMernbrBetween(String value1, String value2) {
            addCriterion("MERNBR between", value1, value2, "mernbr");
            return (Criteria) this;
        }

        public Criteria andMernbrNotBetween(String value1, String value2) {
            addCriterion("MERNBR not between", value1, value2, "mernbr");
            return (Criteria) this;
        }

        public Criteria andMeropendeptnbrIsNull() {
            addCriterion("MEROPENDEPTNBR is null");
            return (Criteria) this;
        }

        public Criteria andMeropendeptnbrIsNotNull() {
            addCriterion("MEROPENDEPTNBR is not null");
            return (Criteria) this;
        }

        public Criteria andMeropendeptnbrEqualTo(String value) {
            addCriterion("MEROPENDEPTNBR =", value, "meropendeptnbr");
            return (Criteria) this;
        }

        public Criteria andMeropendeptnbrNotEqualTo(String value) {
            addCriterion("MEROPENDEPTNBR <>", value, "meropendeptnbr");
            return (Criteria) this;
        }

        public Criteria andMeropendeptnbrGreaterThan(String value) {
            addCriterion("MEROPENDEPTNBR >", value, "meropendeptnbr");
            return (Criteria) this;
        }

        public Criteria andMeropendeptnbrGreaterThanOrEqualTo(String value) {
            addCriterion("MEROPENDEPTNBR >=", value, "meropendeptnbr");
            return (Criteria) this;
        }

        public Criteria andMeropendeptnbrLessThan(String value) {
            addCriterion("MEROPENDEPTNBR <", value, "meropendeptnbr");
            return (Criteria) this;
        }

        public Criteria andMeropendeptnbrLessThanOrEqualTo(String value) {
            addCriterion("MEROPENDEPTNBR <=", value, "meropendeptnbr");
            return (Criteria) this;
        }

        public Criteria andMeropendeptnbrLike(String value) {
            addCriterion("MEROPENDEPTNBR like", value, "meropendeptnbr");
            return (Criteria) this;
        }

        public Criteria andMeropendeptnbrNotLike(String value) {
            addCriterion("MEROPENDEPTNBR not like", value, "meropendeptnbr");
            return (Criteria) this;
        }

        public Criteria andMeropendeptnbrIn(List<String> values) {
            addCriterion("MEROPENDEPTNBR in", values, "meropendeptnbr");
            return (Criteria) this;
        }

        public Criteria andMeropendeptnbrNotIn(List<String> values) {
            addCriterion("MEROPENDEPTNBR not in", values, "meropendeptnbr");
            return (Criteria) this;
        }

        public Criteria andMeropendeptnbrBetween(String value1, String value2) {
            addCriterion("MEROPENDEPTNBR between", value1, value2, "meropendeptnbr");
            return (Criteria) this;
        }

        public Criteria andMeropendeptnbrNotBetween(String value1, String value2) {
            addCriterion("MEROPENDEPTNBR not between", value1, value2, "meropendeptnbr");
            return (Criteria) this;
        }

        public Criteria andMerdevdeptnbrIsNull() {
            addCriterion("MERDEVDEPTNBR is null");
            return (Criteria) this;
        }

        public Criteria andMerdevdeptnbrIsNotNull() {
            addCriterion("MERDEVDEPTNBR is not null");
            return (Criteria) this;
        }

        public Criteria andMerdevdeptnbrEqualTo(String value) {
            addCriterion("MERDEVDEPTNBR =", value, "merdevdeptnbr");
            return (Criteria) this;
        }

        public Criteria andMerdevdeptnbrNotEqualTo(String value) {
            addCriterion("MERDEVDEPTNBR <>", value, "merdevdeptnbr");
            return (Criteria) this;
        }

        public Criteria andMerdevdeptnbrGreaterThan(String value) {
            addCriterion("MERDEVDEPTNBR >", value, "merdevdeptnbr");
            return (Criteria) this;
        }

        public Criteria andMerdevdeptnbrGreaterThanOrEqualTo(String value) {
            addCriterion("MERDEVDEPTNBR >=", value, "merdevdeptnbr");
            return (Criteria) this;
        }

        public Criteria andMerdevdeptnbrLessThan(String value) {
            addCriterion("MERDEVDEPTNBR <", value, "merdevdeptnbr");
            return (Criteria) this;
        }

        public Criteria andMerdevdeptnbrLessThanOrEqualTo(String value) {
            addCriterion("MERDEVDEPTNBR <=", value, "merdevdeptnbr");
            return (Criteria) this;
        }

        public Criteria andMerdevdeptnbrLike(String value) {
            addCriterion("MERDEVDEPTNBR like", value, "merdevdeptnbr");
            return (Criteria) this;
        }

        public Criteria andMerdevdeptnbrNotLike(String value) {
            addCriterion("MERDEVDEPTNBR not like", value, "merdevdeptnbr");
            return (Criteria) this;
        }

        public Criteria andMerdevdeptnbrIn(List<String> values) {
            addCriterion("MERDEVDEPTNBR in", values, "merdevdeptnbr");
            return (Criteria) this;
        }

        public Criteria andMerdevdeptnbrNotIn(List<String> values) {
            addCriterion("MERDEVDEPTNBR not in", values, "merdevdeptnbr");
            return (Criteria) this;
        }

        public Criteria andMerdevdeptnbrBetween(String value1, String value2) {
            addCriterion("MERDEVDEPTNBR between", value1, value2, "merdevdeptnbr");
            return (Criteria) this;
        }

        public Criteria andMerdevdeptnbrNotBetween(String value1, String value2) {
            addCriterion("MERDEVDEPTNBR not between", value1, value2, "merdevdeptnbr");
            return (Criteria) this;
        }

        public Criteria andPayeracctkindIsNull() {
            addCriterion("PAYERACCTKIND is null");
            return (Criteria) this;
        }

        public Criteria andPayeracctkindIsNotNull() {
            addCriterion("PAYERACCTKIND is not null");
            return (Criteria) this;
        }

        public Criteria andPayeracctkindEqualTo(String value) {
            addCriterion("PAYERACCTKIND =", value, "payeracctkind");
            return (Criteria) this;
        }

        public Criteria andPayeracctkindNotEqualTo(String value) {
            addCriterion("PAYERACCTKIND <>", value, "payeracctkind");
            return (Criteria) this;
        }

        public Criteria andPayeracctkindGreaterThan(String value) {
            addCriterion("PAYERACCTKIND >", value, "payeracctkind");
            return (Criteria) this;
        }

        public Criteria andPayeracctkindGreaterThanOrEqualTo(String value) {
            addCriterion("PAYERACCTKIND >=", value, "payeracctkind");
            return (Criteria) this;
        }

        public Criteria andPayeracctkindLessThan(String value) {
            addCriterion("PAYERACCTKIND <", value, "payeracctkind");
            return (Criteria) this;
        }

        public Criteria andPayeracctkindLessThanOrEqualTo(String value) {
            addCriterion("PAYERACCTKIND <=", value, "payeracctkind");
            return (Criteria) this;
        }

        public Criteria andPayeracctkindLike(String value) {
            addCriterion("PAYERACCTKIND like", value, "payeracctkind");
            return (Criteria) this;
        }

        public Criteria andPayeracctkindNotLike(String value) {
            addCriterion("PAYERACCTKIND not like", value, "payeracctkind");
            return (Criteria) this;
        }

        public Criteria andPayeracctkindIn(List<String> values) {
            addCriterion("PAYERACCTKIND in", values, "payeracctkind");
            return (Criteria) this;
        }

        public Criteria andPayeracctkindNotIn(List<String> values) {
            addCriterion("PAYERACCTKIND not in", values, "payeracctkind");
            return (Criteria) this;
        }

        public Criteria andPayeracctkindBetween(String value1, String value2) {
            addCriterion("PAYERACCTKIND between", value1, value2, "payeracctkind");
            return (Criteria) this;
        }

        public Criteria andPayeracctkindNotBetween(String value1, String value2) {
            addCriterion("PAYERACCTKIND not between", value1, value2, "payeracctkind");
            return (Criteria) this;
        }

        public Criteria andPayeeacctkindIsNull() {
            addCriterion("PAYEEACCTKIND is null");
            return (Criteria) this;
        }

        public Criteria andPayeeacctkindIsNotNull() {
            addCriterion("PAYEEACCTKIND is not null");
            return (Criteria) this;
        }

        public Criteria andPayeeacctkindEqualTo(String value) {
            addCriterion("PAYEEACCTKIND =", value, "payeeacctkind");
            return (Criteria) this;
        }

        public Criteria andPayeeacctkindNotEqualTo(String value) {
            addCriterion("PAYEEACCTKIND <>", value, "payeeacctkind");
            return (Criteria) this;
        }

        public Criteria andPayeeacctkindGreaterThan(String value) {
            addCriterion("PAYEEACCTKIND >", value, "payeeacctkind");
            return (Criteria) this;
        }

        public Criteria andPayeeacctkindGreaterThanOrEqualTo(String value) {
            addCriterion("PAYEEACCTKIND >=", value, "payeeacctkind");
            return (Criteria) this;
        }

        public Criteria andPayeeacctkindLessThan(String value) {
            addCriterion("PAYEEACCTKIND <", value, "payeeacctkind");
            return (Criteria) this;
        }

        public Criteria andPayeeacctkindLessThanOrEqualTo(String value) {
            addCriterion("PAYEEACCTKIND <=", value, "payeeacctkind");
            return (Criteria) this;
        }

        public Criteria andPayeeacctkindLike(String value) {
            addCriterion("PAYEEACCTKIND like", value, "payeeacctkind");
            return (Criteria) this;
        }

        public Criteria andPayeeacctkindNotLike(String value) {
            addCriterion("PAYEEACCTKIND not like", value, "payeeacctkind");
            return (Criteria) this;
        }

        public Criteria andPayeeacctkindIn(List<String> values) {
            addCriterion("PAYEEACCTKIND in", values, "payeeacctkind");
            return (Criteria) this;
        }

        public Criteria andPayeeacctkindNotIn(List<String> values) {
            addCriterion("PAYEEACCTKIND not in", values, "payeeacctkind");
            return (Criteria) this;
        }

        public Criteria andPayeeacctkindBetween(String value1, String value2) {
            addCriterion("PAYEEACCTKIND between", value1, value2, "payeeacctkind");
            return (Criteria) this;
        }

        public Criteria andPayeeacctkindNotBetween(String value1, String value2) {
            addCriterion("PAYEEACCTKIND not between", value1, value2, "payeeacctkind");
            return (Criteria) this;
        }

        public Criteria andPayercardtypcdIsNull() {
            addCriterion("PAYERCARDTYPCD is null");
            return (Criteria) this;
        }

        public Criteria andPayercardtypcdIsNotNull() {
            addCriterion("PAYERCARDTYPCD is not null");
            return (Criteria) this;
        }

        public Criteria andPayercardtypcdEqualTo(String value) {
            addCriterion("PAYERCARDTYPCD =", value, "payercardtypcd");
            return (Criteria) this;
        }

        public Criteria andPayercardtypcdNotEqualTo(String value) {
            addCriterion("PAYERCARDTYPCD <>", value, "payercardtypcd");
            return (Criteria) this;
        }

        public Criteria andPayercardtypcdGreaterThan(String value) {
            addCriterion("PAYERCARDTYPCD >", value, "payercardtypcd");
            return (Criteria) this;
        }

        public Criteria andPayercardtypcdGreaterThanOrEqualTo(String value) {
            addCriterion("PAYERCARDTYPCD >=", value, "payercardtypcd");
            return (Criteria) this;
        }

        public Criteria andPayercardtypcdLessThan(String value) {
            addCriterion("PAYERCARDTYPCD <", value, "payercardtypcd");
            return (Criteria) this;
        }

        public Criteria andPayercardtypcdLessThanOrEqualTo(String value) {
            addCriterion("PAYERCARDTYPCD <=", value, "payercardtypcd");
            return (Criteria) this;
        }

        public Criteria andPayercardtypcdLike(String value) {
            addCriterion("PAYERCARDTYPCD like", value, "payercardtypcd");
            return (Criteria) this;
        }

        public Criteria andPayercardtypcdNotLike(String value) {
            addCriterion("PAYERCARDTYPCD not like", value, "payercardtypcd");
            return (Criteria) this;
        }

        public Criteria andPayercardtypcdIn(List<String> values) {
            addCriterion("PAYERCARDTYPCD in", values, "payercardtypcd");
            return (Criteria) this;
        }

        public Criteria andPayercardtypcdNotIn(List<String> values) {
            addCriterion("PAYERCARDTYPCD not in", values, "payercardtypcd");
            return (Criteria) this;
        }

        public Criteria andPayercardtypcdBetween(String value1, String value2) {
            addCriterion("PAYERCARDTYPCD between", value1, value2, "payercardtypcd");
            return (Criteria) this;
        }

        public Criteria andPayercardtypcdNotBetween(String value1, String value2) {
            addCriterion("PAYERCARDTYPCD not between", value1, value2, "payercardtypcd");
            return (Criteria) this;
        }

        public Criteria andPayeecardtypcdIsNull() {
            addCriterion("PAYEECARDTYPCD is null");
            return (Criteria) this;
        }

        public Criteria andPayeecardtypcdIsNotNull() {
            addCriterion("PAYEECARDTYPCD is not null");
            return (Criteria) this;
        }

        public Criteria andPayeecardtypcdEqualTo(String value) {
            addCriterion("PAYEECARDTYPCD =", value, "payeecardtypcd");
            return (Criteria) this;
        }

        public Criteria andPayeecardtypcdNotEqualTo(String value) {
            addCriterion("PAYEECARDTYPCD <>", value, "payeecardtypcd");
            return (Criteria) this;
        }

        public Criteria andPayeecardtypcdGreaterThan(String value) {
            addCriterion("PAYEECARDTYPCD >", value, "payeecardtypcd");
            return (Criteria) this;
        }

        public Criteria andPayeecardtypcdGreaterThanOrEqualTo(String value) {
            addCriterion("PAYEECARDTYPCD >=", value, "payeecardtypcd");
            return (Criteria) this;
        }

        public Criteria andPayeecardtypcdLessThan(String value) {
            addCriterion("PAYEECARDTYPCD <", value, "payeecardtypcd");
            return (Criteria) this;
        }

        public Criteria andPayeecardtypcdLessThanOrEqualTo(String value) {
            addCriterion("PAYEECARDTYPCD <=", value, "payeecardtypcd");
            return (Criteria) this;
        }

        public Criteria andPayeecardtypcdLike(String value) {
            addCriterion("PAYEECARDTYPCD like", value, "payeecardtypcd");
            return (Criteria) this;
        }

        public Criteria andPayeecardtypcdNotLike(String value) {
            addCriterion("PAYEECARDTYPCD not like", value, "payeecardtypcd");
            return (Criteria) this;
        }

        public Criteria andPayeecardtypcdIn(List<String> values) {
            addCriterion("PAYEECARDTYPCD in", values, "payeecardtypcd");
            return (Criteria) this;
        }

        public Criteria andPayeecardtypcdNotIn(List<String> values) {
            addCriterion("PAYEECARDTYPCD not in", values, "payeecardtypcd");
            return (Criteria) this;
        }

        public Criteria andPayeecardtypcdBetween(String value1, String value2) {
            addCriterion("PAYEECARDTYPCD between", value1, value2, "payeecardtypcd");
            return (Criteria) this;
        }

        public Criteria andPayeecardtypcdNotBetween(String value1, String value2) {
            addCriterion("PAYEECARDTYPCD not between", value1, value2, "payeecardtypcd");
            return (Criteria) this;
        }

        public Criteria andCustcifnbrIsNull() {
            addCriterion("CUSTCIFNBR is null");
            return (Criteria) this;
        }

        public Criteria andCustcifnbrIsNotNull() {
            addCriterion("CUSTCIFNBR is not null");
            return (Criteria) this;
        }

        public Criteria andCustcifnbrEqualTo(String value) {
            addCriterion("CUSTCIFNBR =", value, "custcifnbr");
            return (Criteria) this;
        }

        public Criteria andCustcifnbrNotEqualTo(String value) {
            addCriterion("CUSTCIFNBR <>", value, "custcifnbr");
            return (Criteria) this;
        }

        public Criteria andCustcifnbrGreaterThan(String value) {
            addCriterion("CUSTCIFNBR >", value, "custcifnbr");
            return (Criteria) this;
        }

        public Criteria andCustcifnbrGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTCIFNBR >=", value, "custcifnbr");
            return (Criteria) this;
        }

        public Criteria andCustcifnbrLessThan(String value) {
            addCriterion("CUSTCIFNBR <", value, "custcifnbr");
            return (Criteria) this;
        }

        public Criteria andCustcifnbrLessThanOrEqualTo(String value) {
            addCriterion("CUSTCIFNBR <=", value, "custcifnbr");
            return (Criteria) this;
        }

        public Criteria andCustcifnbrLike(String value) {
            addCriterion("CUSTCIFNBR like", value, "custcifnbr");
            return (Criteria) this;
        }

        public Criteria andCustcifnbrNotLike(String value) {
            addCriterion("CUSTCIFNBR not like", value, "custcifnbr");
            return (Criteria) this;
        }

        public Criteria andCustcifnbrIn(List<String> values) {
            addCriterion("CUSTCIFNBR in", values, "custcifnbr");
            return (Criteria) this;
        }

        public Criteria andCustcifnbrNotIn(List<String> values) {
            addCriterion("CUSTCIFNBR not in", values, "custcifnbr");
            return (Criteria) this;
        }

        public Criteria andCustcifnbrBetween(String value1, String value2) {
            addCriterion("CUSTCIFNBR between", value1, value2, "custcifnbr");
            return (Criteria) this;
        }

        public Criteria andCustcifnbrNotBetween(String value1, String value2) {
            addCriterion("CUSTCIFNBR not between", value1, value2, "custcifnbr");
            return (Criteria) this;
        }

        public Criteria andPayeracctnbrIsNull() {
            addCriterion("PAYERACCTNBR is null");
            return (Criteria) this;
        }

        public Criteria andPayeracctnbrIsNotNull() {
            addCriterion("PAYERACCTNBR is not null");
            return (Criteria) this;
        }

        public Criteria andPayeracctnbrEqualTo(String value) {
            addCriterion("PAYERACCTNBR =", value, "payeracctnbr");
            return (Criteria) this;
        }

        public Criteria andPayeracctnbrNotEqualTo(String value) {
            addCriterion("PAYERACCTNBR <>", value, "payeracctnbr");
            return (Criteria) this;
        }

        public Criteria andPayeracctnbrGreaterThan(String value) {
            addCriterion("PAYERACCTNBR >", value, "payeracctnbr");
            return (Criteria) this;
        }

        public Criteria andPayeracctnbrGreaterThanOrEqualTo(String value) {
            addCriterion("PAYERACCTNBR >=", value, "payeracctnbr");
            return (Criteria) this;
        }

        public Criteria andPayeracctnbrLessThan(String value) {
            addCriterion("PAYERACCTNBR <", value, "payeracctnbr");
            return (Criteria) this;
        }

        public Criteria andPayeracctnbrLessThanOrEqualTo(String value) {
            addCriterion("PAYERACCTNBR <=", value, "payeracctnbr");
            return (Criteria) this;
        }

        public Criteria andPayeracctnbrLike(String value) {
            addCriterion("PAYERACCTNBR like", value, "payeracctnbr");
            return (Criteria) this;
        }

        public Criteria andPayeracctnbrNotLike(String value) {
            addCriterion("PAYERACCTNBR not like", value, "payeracctnbr");
            return (Criteria) this;
        }

        public Criteria andPayeracctnbrIn(List<String> values) {
            addCriterion("PAYERACCTNBR in", values, "payeracctnbr");
            return (Criteria) this;
        }

        public Criteria andPayeracctnbrNotIn(List<String> values) {
            addCriterion("PAYERACCTNBR not in", values, "payeracctnbr");
            return (Criteria) this;
        }

        public Criteria andPayeracctnbrBetween(String value1, String value2) {
            addCriterion("PAYERACCTNBR between", value1, value2, "payeracctnbr");
            return (Criteria) this;
        }

        public Criteria andPayeracctnbrNotBetween(String value1, String value2) {
            addCriterion("PAYERACCTNBR not between", value1, value2, "payeracctnbr");
            return (Criteria) this;
        }

        public Criteria andPayeraccttypcdIsNull() {
            addCriterion("PAYERACCTTYPCD is null");
            return (Criteria) this;
        }

        public Criteria andPayeraccttypcdIsNotNull() {
            addCriterion("PAYERACCTTYPCD is not null");
            return (Criteria) this;
        }

        public Criteria andPayeraccttypcdEqualTo(String value) {
            addCriterion("PAYERACCTTYPCD =", value, "payeraccttypcd");
            return (Criteria) this;
        }

        public Criteria andPayeraccttypcdNotEqualTo(String value) {
            addCriterion("PAYERACCTTYPCD <>", value, "payeraccttypcd");
            return (Criteria) this;
        }

        public Criteria andPayeraccttypcdGreaterThan(String value) {
            addCriterion("PAYERACCTTYPCD >", value, "payeraccttypcd");
            return (Criteria) this;
        }

        public Criteria andPayeraccttypcdGreaterThanOrEqualTo(String value) {
            addCriterion("PAYERACCTTYPCD >=", value, "payeraccttypcd");
            return (Criteria) this;
        }

        public Criteria andPayeraccttypcdLessThan(String value) {
            addCriterion("PAYERACCTTYPCD <", value, "payeraccttypcd");
            return (Criteria) this;
        }

        public Criteria andPayeraccttypcdLessThanOrEqualTo(String value) {
            addCriterion("PAYERACCTTYPCD <=", value, "payeraccttypcd");
            return (Criteria) this;
        }

        public Criteria andPayeraccttypcdLike(String value) {
            addCriterion("PAYERACCTTYPCD like", value, "payeraccttypcd");
            return (Criteria) this;
        }

        public Criteria andPayeraccttypcdNotLike(String value) {
            addCriterion("PAYERACCTTYPCD not like", value, "payeraccttypcd");
            return (Criteria) this;
        }

        public Criteria andPayeraccttypcdIn(List<String> values) {
            addCriterion("PAYERACCTTYPCD in", values, "payeraccttypcd");
            return (Criteria) this;
        }

        public Criteria andPayeraccttypcdNotIn(List<String> values) {
            addCriterion("PAYERACCTTYPCD not in", values, "payeraccttypcd");
            return (Criteria) this;
        }

        public Criteria andPayeraccttypcdBetween(String value1, String value2) {
            addCriterion("PAYERACCTTYPCD between", value1, value2, "payeraccttypcd");
            return (Criteria) this;
        }

        public Criteria andPayeraccttypcdNotBetween(String value1, String value2) {
            addCriterion("PAYERACCTTYPCD not between", value1, value2, "payeraccttypcd");
            return (Criteria) this;
        }

        public Criteria andPayeracctdeptnbrIsNull() {
            addCriterion("PAYERACCTDEPTNBR is null");
            return (Criteria) this;
        }

        public Criteria andPayeracctdeptnbrIsNotNull() {
            addCriterion("PAYERACCTDEPTNBR is not null");
            return (Criteria) this;
        }

        public Criteria andPayeracctdeptnbrEqualTo(String value) {
            addCriterion("PAYERACCTDEPTNBR =", value, "payeracctdeptnbr");
            return (Criteria) this;
        }

        public Criteria andPayeracctdeptnbrNotEqualTo(String value) {
            addCriterion("PAYERACCTDEPTNBR <>", value, "payeracctdeptnbr");
            return (Criteria) this;
        }

        public Criteria andPayeracctdeptnbrGreaterThan(String value) {
            addCriterion("PAYERACCTDEPTNBR >", value, "payeracctdeptnbr");
            return (Criteria) this;
        }

        public Criteria andPayeracctdeptnbrGreaterThanOrEqualTo(String value) {
            addCriterion("PAYERACCTDEPTNBR >=", value, "payeracctdeptnbr");
            return (Criteria) this;
        }

        public Criteria andPayeracctdeptnbrLessThan(String value) {
            addCriterion("PAYERACCTDEPTNBR <", value, "payeracctdeptnbr");
            return (Criteria) this;
        }

        public Criteria andPayeracctdeptnbrLessThanOrEqualTo(String value) {
            addCriterion("PAYERACCTDEPTNBR <=", value, "payeracctdeptnbr");
            return (Criteria) this;
        }

        public Criteria andPayeracctdeptnbrLike(String value) {
            addCriterion("PAYERACCTDEPTNBR like", value, "payeracctdeptnbr");
            return (Criteria) this;
        }

        public Criteria andPayeracctdeptnbrNotLike(String value) {
            addCriterion("PAYERACCTDEPTNBR not like", value, "payeracctdeptnbr");
            return (Criteria) this;
        }

        public Criteria andPayeracctdeptnbrIn(List<String> values) {
            addCriterion("PAYERACCTDEPTNBR in", values, "payeracctdeptnbr");
            return (Criteria) this;
        }

        public Criteria andPayeracctdeptnbrNotIn(List<String> values) {
            addCriterion("PAYERACCTDEPTNBR not in", values, "payeracctdeptnbr");
            return (Criteria) this;
        }

        public Criteria andPayeracctdeptnbrBetween(String value1, String value2) {
            addCriterion("PAYERACCTDEPTNBR between", value1, value2, "payeracctdeptnbr");
            return (Criteria) this;
        }

        public Criteria andPayeracctdeptnbrNotBetween(String value1, String value2) {
            addCriterion("PAYERACCTDEPTNBR not between", value1, value2, "payeracctdeptnbr");
            return (Criteria) this;
        }

        public Criteria andPayeracctnameIsNull() {
            addCriterion("PAYERACCTNAME is null");
            return (Criteria) this;
        }

        public Criteria andPayeracctnameIsNotNull() {
            addCriterion("PAYERACCTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andPayeracctnameEqualTo(String value) {
            addCriterion("PAYERACCTNAME =", value, "payeracctname");
            return (Criteria) this;
        }

        public Criteria andPayeracctnameNotEqualTo(String value) {
            addCriterion("PAYERACCTNAME <>", value, "payeracctname");
            return (Criteria) this;
        }

        public Criteria andPayeracctnameGreaterThan(String value) {
            addCriterion("PAYERACCTNAME >", value, "payeracctname");
            return (Criteria) this;
        }

        public Criteria andPayeracctnameGreaterThanOrEqualTo(String value) {
            addCriterion("PAYERACCTNAME >=", value, "payeracctname");
            return (Criteria) this;
        }

        public Criteria andPayeracctnameLessThan(String value) {
            addCriterion("PAYERACCTNAME <", value, "payeracctname");
            return (Criteria) this;
        }

        public Criteria andPayeracctnameLessThanOrEqualTo(String value) {
            addCriterion("PAYERACCTNAME <=", value, "payeracctname");
            return (Criteria) this;
        }

        public Criteria andPayeracctnameLike(String value) {
            addCriterion("PAYERACCTNAME like", value, "payeracctname");
            return (Criteria) this;
        }

        public Criteria andPayeracctnameNotLike(String value) {
            addCriterion("PAYERACCTNAME not like", value, "payeracctname");
            return (Criteria) this;
        }

        public Criteria andPayeracctnameIn(List<String> values) {
            addCriterion("PAYERACCTNAME in", values, "payeracctname");
            return (Criteria) this;
        }

        public Criteria andPayeracctnameNotIn(List<String> values) {
            addCriterion("PAYERACCTNAME not in", values, "payeracctname");
            return (Criteria) this;
        }

        public Criteria andPayeracctnameBetween(String value1, String value2) {
            addCriterion("PAYERACCTNAME between", value1, value2, "payeracctname");
            return (Criteria) this;
        }

        public Criteria andPayeracctnameNotBetween(String value1, String value2) {
            addCriterion("PAYERACCTNAME not between", value1, value2, "payeracctname");
            return (Criteria) this;
        }

        public Criteria andPayeeacctnbrIsNull() {
            addCriterion("PAYEEACCTNBR is null");
            return (Criteria) this;
        }

        public Criteria andPayeeacctnbrIsNotNull() {
            addCriterion("PAYEEACCTNBR is not null");
            return (Criteria) this;
        }

        public Criteria andPayeeacctnbrEqualTo(String value) {
            addCriterion("PAYEEACCTNBR =", value, "payeeacctnbr");
            return (Criteria) this;
        }

        public Criteria andPayeeacctnbrNotEqualTo(String value) {
            addCriterion("PAYEEACCTNBR <>", value, "payeeacctnbr");
            return (Criteria) this;
        }

        public Criteria andPayeeacctnbrGreaterThan(String value) {
            addCriterion("PAYEEACCTNBR >", value, "payeeacctnbr");
            return (Criteria) this;
        }

        public Criteria andPayeeacctnbrGreaterThanOrEqualTo(String value) {
            addCriterion("PAYEEACCTNBR >=", value, "payeeacctnbr");
            return (Criteria) this;
        }

        public Criteria andPayeeacctnbrLessThan(String value) {
            addCriterion("PAYEEACCTNBR <", value, "payeeacctnbr");
            return (Criteria) this;
        }

        public Criteria andPayeeacctnbrLessThanOrEqualTo(String value) {
            addCriterion("PAYEEACCTNBR <=", value, "payeeacctnbr");
            return (Criteria) this;
        }

        public Criteria andPayeeacctnbrLike(String value) {
            addCriterion("PAYEEACCTNBR like", value, "payeeacctnbr");
            return (Criteria) this;
        }

        public Criteria andPayeeacctnbrNotLike(String value) {
            addCriterion("PAYEEACCTNBR not like", value, "payeeacctnbr");
            return (Criteria) this;
        }

        public Criteria andPayeeacctnbrIn(List<String> values) {
            addCriterion("PAYEEACCTNBR in", values, "payeeacctnbr");
            return (Criteria) this;
        }

        public Criteria andPayeeacctnbrNotIn(List<String> values) {
            addCriterion("PAYEEACCTNBR not in", values, "payeeacctnbr");
            return (Criteria) this;
        }

        public Criteria andPayeeacctnbrBetween(String value1, String value2) {
            addCriterion("PAYEEACCTNBR between", value1, value2, "payeeacctnbr");
            return (Criteria) this;
        }

        public Criteria andPayeeacctnbrNotBetween(String value1, String value2) {
            addCriterion("PAYEEACCTNBR not between", value1, value2, "payeeacctnbr");
            return (Criteria) this;
        }

        public Criteria andPayeeacctdeptnbrIsNull() {
            addCriterion("PAYEEACCTDEPTNBR is null");
            return (Criteria) this;
        }

        public Criteria andPayeeacctdeptnbrIsNotNull() {
            addCriterion("PAYEEACCTDEPTNBR is not null");
            return (Criteria) this;
        }

        public Criteria andPayeeacctdeptnbrEqualTo(String value) {
            addCriterion("PAYEEACCTDEPTNBR =", value, "payeeacctdeptnbr");
            return (Criteria) this;
        }

        public Criteria andPayeeacctdeptnbrNotEqualTo(String value) {
            addCriterion("PAYEEACCTDEPTNBR <>", value, "payeeacctdeptnbr");
            return (Criteria) this;
        }

        public Criteria andPayeeacctdeptnbrGreaterThan(String value) {
            addCriterion("PAYEEACCTDEPTNBR >", value, "payeeacctdeptnbr");
            return (Criteria) this;
        }

        public Criteria andPayeeacctdeptnbrGreaterThanOrEqualTo(String value) {
            addCriterion("PAYEEACCTDEPTNBR >=", value, "payeeacctdeptnbr");
            return (Criteria) this;
        }

        public Criteria andPayeeacctdeptnbrLessThan(String value) {
            addCriterion("PAYEEACCTDEPTNBR <", value, "payeeacctdeptnbr");
            return (Criteria) this;
        }

        public Criteria andPayeeacctdeptnbrLessThanOrEqualTo(String value) {
            addCriterion("PAYEEACCTDEPTNBR <=", value, "payeeacctdeptnbr");
            return (Criteria) this;
        }

        public Criteria andPayeeacctdeptnbrLike(String value) {
            addCriterion("PAYEEACCTDEPTNBR like", value, "payeeacctdeptnbr");
            return (Criteria) this;
        }

        public Criteria andPayeeacctdeptnbrNotLike(String value) {
            addCriterion("PAYEEACCTDEPTNBR not like", value, "payeeacctdeptnbr");
            return (Criteria) this;
        }

        public Criteria andPayeeacctdeptnbrIn(List<String> values) {
            addCriterion("PAYEEACCTDEPTNBR in", values, "payeeacctdeptnbr");
            return (Criteria) this;
        }

        public Criteria andPayeeacctdeptnbrNotIn(List<String> values) {
            addCriterion("PAYEEACCTDEPTNBR not in", values, "payeeacctdeptnbr");
            return (Criteria) this;
        }

        public Criteria andPayeeacctdeptnbrBetween(String value1, String value2) {
            addCriterion("PAYEEACCTDEPTNBR between", value1, value2, "payeeacctdeptnbr");
            return (Criteria) this;
        }

        public Criteria andPayeeacctdeptnbrNotBetween(String value1, String value2) {
            addCriterion("PAYEEACCTDEPTNBR not between", value1, value2, "payeeacctdeptnbr");
            return (Criteria) this;
        }

        public Criteria andPayeeaccttypcdIsNull() {
            addCriterion("PAYEEACCTTYPCD is null");
            return (Criteria) this;
        }

        public Criteria andPayeeaccttypcdIsNotNull() {
            addCriterion("PAYEEACCTTYPCD is not null");
            return (Criteria) this;
        }

        public Criteria andPayeeaccttypcdEqualTo(String value) {
            addCriterion("PAYEEACCTTYPCD =", value, "payeeaccttypcd");
            return (Criteria) this;
        }

        public Criteria andPayeeaccttypcdNotEqualTo(String value) {
            addCriterion("PAYEEACCTTYPCD <>", value, "payeeaccttypcd");
            return (Criteria) this;
        }

        public Criteria andPayeeaccttypcdGreaterThan(String value) {
            addCriterion("PAYEEACCTTYPCD >", value, "payeeaccttypcd");
            return (Criteria) this;
        }

        public Criteria andPayeeaccttypcdGreaterThanOrEqualTo(String value) {
            addCriterion("PAYEEACCTTYPCD >=", value, "payeeaccttypcd");
            return (Criteria) this;
        }

        public Criteria andPayeeaccttypcdLessThan(String value) {
            addCriterion("PAYEEACCTTYPCD <", value, "payeeaccttypcd");
            return (Criteria) this;
        }

        public Criteria andPayeeaccttypcdLessThanOrEqualTo(String value) {
            addCriterion("PAYEEACCTTYPCD <=", value, "payeeaccttypcd");
            return (Criteria) this;
        }

        public Criteria andPayeeaccttypcdLike(String value) {
            addCriterion("PAYEEACCTTYPCD like", value, "payeeaccttypcd");
            return (Criteria) this;
        }

        public Criteria andPayeeaccttypcdNotLike(String value) {
            addCriterion("PAYEEACCTTYPCD not like", value, "payeeaccttypcd");
            return (Criteria) this;
        }

        public Criteria andPayeeaccttypcdIn(List<String> values) {
            addCriterion("PAYEEACCTTYPCD in", values, "payeeaccttypcd");
            return (Criteria) this;
        }

        public Criteria andPayeeaccttypcdNotIn(List<String> values) {
            addCriterion("PAYEEACCTTYPCD not in", values, "payeeaccttypcd");
            return (Criteria) this;
        }

        public Criteria andPayeeaccttypcdBetween(String value1, String value2) {
            addCriterion("PAYEEACCTTYPCD between", value1, value2, "payeeaccttypcd");
            return (Criteria) this;
        }

        public Criteria andPayeeaccttypcdNotBetween(String value1, String value2) {
            addCriterion("PAYEEACCTTYPCD not between", value1, value2, "payeeaccttypcd");
            return (Criteria) this;
        }

        public Criteria andPayeeacctnameIsNull() {
            addCriterion("PAYEEACCTNAME is null");
            return (Criteria) this;
        }

        public Criteria andPayeeacctnameIsNotNull() {
            addCriterion("PAYEEACCTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andPayeeacctnameEqualTo(String value) {
            addCriterion("PAYEEACCTNAME =", value, "payeeacctname");
            return (Criteria) this;
        }

        public Criteria andPayeeacctnameNotEqualTo(String value) {
            addCriterion("PAYEEACCTNAME <>", value, "payeeacctname");
            return (Criteria) this;
        }

        public Criteria andPayeeacctnameGreaterThan(String value) {
            addCriterion("PAYEEACCTNAME >", value, "payeeacctname");
            return (Criteria) this;
        }

        public Criteria andPayeeacctnameGreaterThanOrEqualTo(String value) {
            addCriterion("PAYEEACCTNAME >=", value, "payeeacctname");
            return (Criteria) this;
        }

        public Criteria andPayeeacctnameLessThan(String value) {
            addCriterion("PAYEEACCTNAME <", value, "payeeacctname");
            return (Criteria) this;
        }

        public Criteria andPayeeacctnameLessThanOrEqualTo(String value) {
            addCriterion("PAYEEACCTNAME <=", value, "payeeacctname");
            return (Criteria) this;
        }

        public Criteria andPayeeacctnameLike(String value) {
            addCriterion("PAYEEACCTNAME like", value, "payeeacctname");
            return (Criteria) this;
        }

        public Criteria andPayeeacctnameNotLike(String value) {
            addCriterion("PAYEEACCTNAME not like", value, "payeeacctname");
            return (Criteria) this;
        }

        public Criteria andPayeeacctnameIn(List<String> values) {
            addCriterion("PAYEEACCTNAME in", values, "payeeacctname");
            return (Criteria) this;
        }

        public Criteria andPayeeacctnameNotIn(List<String> values) {
            addCriterion("PAYEEACCTNAME not in", values, "payeeacctname");
            return (Criteria) this;
        }

        public Criteria andPayeeacctnameBetween(String value1, String value2) {
            addCriterion("PAYEEACCTNAME between", value1, value2, "payeeacctname");
            return (Criteria) this;
        }

        public Criteria andPayeeacctnameNotBetween(String value1, String value2) {
            addCriterion("PAYEEACCTNAME not between", value1, value2, "payeeacctname");
            return (Criteria) this;
        }

        public Criteria andTransamtIsNull() {
            addCriterion("TRANSAMT is null");
            return (Criteria) this;
        }

        public Criteria andTransamtIsNotNull() {
            addCriterion("TRANSAMT is not null");
            return (Criteria) this;
        }

        public Criteria andTransamtEqualTo(BigDecimal value) {
            addCriterion("TRANSAMT =", value, "transamt");
            return (Criteria) this;
        }

        public Criteria andTransamtNotEqualTo(BigDecimal value) {
            addCriterion("TRANSAMT <>", value, "transamt");
            return (Criteria) this;
        }

        public Criteria andTransamtGreaterThan(BigDecimal value) {
            addCriterion("TRANSAMT >", value, "transamt");
            return (Criteria) this;
        }

        public Criteria andTransamtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TRANSAMT >=", value, "transamt");
            return (Criteria) this;
        }

        public Criteria andTransamtLessThan(BigDecimal value) {
            addCriterion("TRANSAMT <", value, "transamt");
            return (Criteria) this;
        }

        public Criteria andTransamtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TRANSAMT <=", value, "transamt");
            return (Criteria) this;
        }

        public Criteria andTransamtIn(List<BigDecimal> values) {
            addCriterion("TRANSAMT in", values, "transamt");
            return (Criteria) this;
        }

        public Criteria andTransamtNotIn(List<BigDecimal> values) {
            addCriterion("TRANSAMT not in", values, "transamt");
            return (Criteria) this;
        }

        public Criteria andTransamtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRANSAMT between", value1, value2, "transamt");
            return (Criteria) this;
        }

        public Criteria andTransamtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRANSAMT not between", value1, value2, "transamt");
            return (Criteria) this;
        }

        public Criteria andCurrencycdIsNull() {
            addCriterion("CURRENCYCD is null");
            return (Criteria) this;
        }

        public Criteria andCurrencycdIsNotNull() {
            addCriterion("CURRENCYCD is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencycdEqualTo(String value) {
            addCriterion("CURRENCYCD =", value, "currencycd");
            return (Criteria) this;
        }

        public Criteria andCurrencycdNotEqualTo(String value) {
            addCriterion("CURRENCYCD <>", value, "currencycd");
            return (Criteria) this;
        }

        public Criteria andCurrencycdGreaterThan(String value) {
            addCriterion("CURRENCYCD >", value, "currencycd");
            return (Criteria) this;
        }

        public Criteria andCurrencycdGreaterThanOrEqualTo(String value) {
            addCriterion("CURRENCYCD >=", value, "currencycd");
            return (Criteria) this;
        }

        public Criteria andCurrencycdLessThan(String value) {
            addCriterion("CURRENCYCD <", value, "currencycd");
            return (Criteria) this;
        }

        public Criteria andCurrencycdLessThanOrEqualTo(String value) {
            addCriterion("CURRENCYCD <=", value, "currencycd");
            return (Criteria) this;
        }

        public Criteria andCurrencycdLike(String value) {
            addCriterion("CURRENCYCD like", value, "currencycd");
            return (Criteria) this;
        }

        public Criteria andCurrencycdNotLike(String value) {
            addCriterion("CURRENCYCD not like", value, "currencycd");
            return (Criteria) this;
        }

        public Criteria andCurrencycdIn(List<String> values) {
            addCriterion("CURRENCYCD in", values, "currencycd");
            return (Criteria) this;
        }

        public Criteria andCurrencycdNotIn(List<String> values) {
            addCriterion("CURRENCYCD not in", values, "currencycd");
            return (Criteria) this;
        }

        public Criteria andCurrencycdBetween(String value1, String value2) {
            addCriterion("CURRENCYCD between", value1, value2, "currencycd");
            return (Criteria) this;
        }

        public Criteria andCurrencycdNotBetween(String value1, String value2) {
            addCriterion("CURRENCYCD not between", value1, value2, "currencycd");
            return (Criteria) this;
        }

        public Criteria andRefundedamtIsNull() {
            addCriterion("REFUNDEDAMT is null");
            return (Criteria) this;
        }

        public Criteria andRefundedamtIsNotNull() {
            addCriterion("REFUNDEDAMT is not null");
            return (Criteria) this;
        }

        public Criteria andRefundedamtEqualTo(BigDecimal value) {
            addCriterion("REFUNDEDAMT =", value, "refundedamt");
            return (Criteria) this;
        }

        public Criteria andRefundedamtNotEqualTo(BigDecimal value) {
            addCriterion("REFUNDEDAMT <>", value, "refundedamt");
            return (Criteria) this;
        }

        public Criteria andRefundedamtGreaterThan(BigDecimal value) {
            addCriterion("REFUNDEDAMT >", value, "refundedamt");
            return (Criteria) this;
        }

        public Criteria andRefundedamtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("REFUNDEDAMT >=", value, "refundedamt");
            return (Criteria) this;
        }

        public Criteria andRefundedamtLessThan(BigDecimal value) {
            addCriterion("REFUNDEDAMT <", value, "refundedamt");
            return (Criteria) this;
        }

        public Criteria andRefundedamtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("REFUNDEDAMT <=", value, "refundedamt");
            return (Criteria) this;
        }

        public Criteria andRefundedamtIn(List<BigDecimal> values) {
            addCriterion("REFUNDEDAMT in", values, "refundedamt");
            return (Criteria) this;
        }

        public Criteria andRefundedamtNotIn(List<BigDecimal> values) {
            addCriterion("REFUNDEDAMT not in", values, "refundedamt");
            return (Criteria) this;
        }

        public Criteria andRefundedamtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REFUNDEDAMT between", value1, value2, "refundedamt");
            return (Criteria) this;
        }

        public Criteria andRefundedamtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REFUNDEDAMT not between", value1, value2, "refundedamt");
            return (Criteria) this;
        }

        public Criteria andUnrefundamtIsNull() {
            addCriterion("UNREFUNDAMT is null");
            return (Criteria) this;
        }

        public Criteria andUnrefundamtIsNotNull() {
            addCriterion("UNREFUNDAMT is not null");
            return (Criteria) this;
        }

        public Criteria andUnrefundamtEqualTo(BigDecimal value) {
            addCriterion("UNREFUNDAMT =", value, "unrefundamt");
            return (Criteria) this;
        }

        public Criteria andUnrefundamtNotEqualTo(BigDecimal value) {
            addCriterion("UNREFUNDAMT <>", value, "unrefundamt");
            return (Criteria) this;
        }

        public Criteria andUnrefundamtGreaterThan(BigDecimal value) {
            addCriterion("UNREFUNDAMT >", value, "unrefundamt");
            return (Criteria) this;
        }

        public Criteria andUnrefundamtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("UNREFUNDAMT >=", value, "unrefundamt");
            return (Criteria) this;
        }

        public Criteria andUnrefundamtLessThan(BigDecimal value) {
            addCriterion("UNREFUNDAMT <", value, "unrefundamt");
            return (Criteria) this;
        }

        public Criteria andUnrefundamtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("UNREFUNDAMT <=", value, "unrefundamt");
            return (Criteria) this;
        }

        public Criteria andUnrefundamtIn(List<BigDecimal> values) {
            addCriterion("UNREFUNDAMT in", values, "unrefundamt");
            return (Criteria) this;
        }

        public Criteria andUnrefundamtNotIn(List<BigDecimal> values) {
            addCriterion("UNREFUNDAMT not in", values, "unrefundamt");
            return (Criteria) this;
        }

        public Criteria andUnrefundamtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UNREFUNDAMT between", value1, value2, "unrefundamt");
            return (Criteria) this;
        }

        public Criteria andUnrefundamtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UNREFUNDAMT not between", value1, value2, "unrefundamt");
            return (Criteria) this;
        }

        public Criteria andTransamt1IsNull() {
            addCriterion("TRANSAMT1 is null");
            return (Criteria) this;
        }

        public Criteria andTransamt1IsNotNull() {
            addCriterion("TRANSAMT1 is not null");
            return (Criteria) this;
        }

        public Criteria andTransamt1EqualTo(BigDecimal value) {
            addCriterion("TRANSAMT1 =", value, "transamt1");
            return (Criteria) this;
        }

        public Criteria andTransamt1NotEqualTo(BigDecimal value) {
            addCriterion("TRANSAMT1 <>", value, "transamt1");
            return (Criteria) this;
        }

        public Criteria andTransamt1GreaterThan(BigDecimal value) {
            addCriterion("TRANSAMT1 >", value, "transamt1");
            return (Criteria) this;
        }

        public Criteria andTransamt1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TRANSAMT1 >=", value, "transamt1");
            return (Criteria) this;
        }

        public Criteria andTransamt1LessThan(BigDecimal value) {
            addCriterion("TRANSAMT1 <", value, "transamt1");
            return (Criteria) this;
        }

        public Criteria andTransamt1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("TRANSAMT1 <=", value, "transamt1");
            return (Criteria) this;
        }

        public Criteria andTransamt1In(List<BigDecimal> values) {
            addCriterion("TRANSAMT1 in", values, "transamt1");
            return (Criteria) this;
        }

        public Criteria andTransamt1NotIn(List<BigDecimal> values) {
            addCriterion("TRANSAMT1 not in", values, "transamt1");
            return (Criteria) this;
        }

        public Criteria andTransamt1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRANSAMT1 between", value1, value2, "transamt1");
            return (Criteria) this;
        }

        public Criteria andTransamt1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRANSAMT1 not between", value1, value2, "transamt1");
            return (Criteria) this;
        }

        public Criteria andTransamt2IsNull() {
            addCriterion("TRANSAMT2 is null");
            return (Criteria) this;
        }

        public Criteria andTransamt2IsNotNull() {
            addCriterion("TRANSAMT2 is not null");
            return (Criteria) this;
        }

        public Criteria andTransamt2EqualTo(BigDecimal value) {
            addCriterion("TRANSAMT2 =", value, "transamt2");
            return (Criteria) this;
        }

        public Criteria andTransamt2NotEqualTo(BigDecimal value) {
            addCriterion("TRANSAMT2 <>", value, "transamt2");
            return (Criteria) this;
        }

        public Criteria andTransamt2GreaterThan(BigDecimal value) {
            addCriterion("TRANSAMT2 >", value, "transamt2");
            return (Criteria) this;
        }

        public Criteria andTransamt2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TRANSAMT2 >=", value, "transamt2");
            return (Criteria) this;
        }

        public Criteria andTransamt2LessThan(BigDecimal value) {
            addCriterion("TRANSAMT2 <", value, "transamt2");
            return (Criteria) this;
        }

        public Criteria andTransamt2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("TRANSAMT2 <=", value, "transamt2");
            return (Criteria) this;
        }

        public Criteria andTransamt2In(List<BigDecimal> values) {
            addCriterion("TRANSAMT2 in", values, "transamt2");
            return (Criteria) this;
        }

        public Criteria andTransamt2NotIn(List<BigDecimal> values) {
            addCriterion("TRANSAMT2 not in", values, "transamt2");
            return (Criteria) this;
        }

        public Criteria andTransamt2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRANSAMT2 between", value1, value2, "transamt2");
            return (Criteria) this;
        }

        public Criteria andTransamt2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRANSAMT2 not between", value1, value2, "transamt2");
            return (Criteria) this;
        }

        public Criteria andFeeamtIsNull() {
            addCriterion("FEEAMT is null");
            return (Criteria) this;
        }

        public Criteria andFeeamtIsNotNull() {
            addCriterion("FEEAMT is not null");
            return (Criteria) this;
        }

        public Criteria andFeeamtEqualTo(BigDecimal value) {
            addCriterion("FEEAMT =", value, "feeamt");
            return (Criteria) this;
        }

        public Criteria andFeeamtNotEqualTo(BigDecimal value) {
            addCriterion("FEEAMT <>", value, "feeamt");
            return (Criteria) this;
        }

        public Criteria andFeeamtGreaterThan(BigDecimal value) {
            addCriterion("FEEAMT >", value, "feeamt");
            return (Criteria) this;
        }

        public Criteria andFeeamtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FEEAMT >=", value, "feeamt");
            return (Criteria) this;
        }

        public Criteria andFeeamtLessThan(BigDecimal value) {
            addCriterion("FEEAMT <", value, "feeamt");
            return (Criteria) this;
        }

        public Criteria andFeeamtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FEEAMT <=", value, "feeamt");
            return (Criteria) this;
        }

        public Criteria andFeeamtIn(List<BigDecimal> values) {
            addCriterion("FEEAMT in", values, "feeamt");
            return (Criteria) this;
        }

        public Criteria andFeeamtNotIn(List<BigDecimal> values) {
            addCriterion("FEEAMT not in", values, "feeamt");
            return (Criteria) this;
        }

        public Criteria andFeeamtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FEEAMT between", value1, value2, "feeamt");
            return (Criteria) this;
        }

        public Criteria andFeeamtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FEEAMT not between", value1, value2, "feeamt");
            return (Criteria) this;
        }

        public Criteria andTransstatusIsNull() {
            addCriterion("TRANSSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andTransstatusIsNotNull() {
            addCriterion("TRANSSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andTransstatusEqualTo(String value) {
            addCriterion("TRANSSTATUS =", value, "transstatus");
            return (Criteria) this;
        }

        public Criteria andTransstatusNotEqualTo(String value) {
            addCriterion("TRANSSTATUS <>", value, "transstatus");
            return (Criteria) this;
        }

        public Criteria andTransstatusGreaterThan(String value) {
            addCriterion("TRANSSTATUS >", value, "transstatus");
            return (Criteria) this;
        }

        public Criteria andTransstatusGreaterThanOrEqualTo(String value) {
            addCriterion("TRANSSTATUS >=", value, "transstatus");
            return (Criteria) this;
        }

        public Criteria andTransstatusLessThan(String value) {
            addCriterion("TRANSSTATUS <", value, "transstatus");
            return (Criteria) this;
        }

        public Criteria andTransstatusLessThanOrEqualTo(String value) {
            addCriterion("TRANSSTATUS <=", value, "transstatus");
            return (Criteria) this;
        }

        public Criteria andTransstatusLike(String value) {
            addCriterion("TRANSSTATUS like", value, "transstatus");
            return (Criteria) this;
        }

        public Criteria andTransstatusNotLike(String value) {
            addCriterion("TRANSSTATUS not like", value, "transstatus");
            return (Criteria) this;
        }

        public Criteria andTransstatusIn(List<String> values) {
            addCriterion("TRANSSTATUS in", values, "transstatus");
            return (Criteria) this;
        }

        public Criteria andTransstatusNotIn(List<String> values) {
            addCriterion("TRANSSTATUS not in", values, "transstatus");
            return (Criteria) this;
        }

        public Criteria andTransstatusBetween(String value1, String value2) {
            addCriterion("TRANSSTATUS between", value1, value2, "transstatus");
            return (Criteria) this;
        }

        public Criteria andTransstatusNotBetween(String value1, String value2) {
            addCriterion("TRANSSTATUS not between", value1, value2, "transstatus");
            return (Criteria) this;
        }

        public Criteria andProcstepIsNull() {
            addCriterion("PROCSTEP is null");
            return (Criteria) this;
        }

        public Criteria andProcstepIsNotNull() {
            addCriterion("PROCSTEP is not null");
            return (Criteria) this;
        }

        public Criteria andProcstepEqualTo(String value) {
            addCriterion("PROCSTEP =", value, "procstep");
            return (Criteria) this;
        }

        public Criteria andProcstepNotEqualTo(String value) {
            addCriterion("PROCSTEP <>", value, "procstep");
            return (Criteria) this;
        }

        public Criteria andProcstepGreaterThan(String value) {
            addCriterion("PROCSTEP >", value, "procstep");
            return (Criteria) this;
        }

        public Criteria andProcstepGreaterThanOrEqualTo(String value) {
            addCriterion("PROCSTEP >=", value, "procstep");
            return (Criteria) this;
        }

        public Criteria andProcstepLessThan(String value) {
            addCriterion("PROCSTEP <", value, "procstep");
            return (Criteria) this;
        }

        public Criteria andProcstepLessThanOrEqualTo(String value) {
            addCriterion("PROCSTEP <=", value, "procstep");
            return (Criteria) this;
        }

        public Criteria andProcstepLike(String value) {
            addCriterion("PROCSTEP like", value, "procstep");
            return (Criteria) this;
        }

        public Criteria andProcstepNotLike(String value) {
            addCriterion("PROCSTEP not like", value, "procstep");
            return (Criteria) this;
        }

        public Criteria andProcstepIn(List<String> values) {
            addCriterion("PROCSTEP in", values, "procstep");
            return (Criteria) this;
        }

        public Criteria andProcstepNotIn(List<String> values) {
            addCriterion("PROCSTEP not in", values, "procstep");
            return (Criteria) this;
        }

        public Criteria andProcstepBetween(String value1, String value2) {
            addCriterion("PROCSTEP between", value1, value2, "procstep");
            return (Criteria) this;
        }

        public Criteria andProcstepNotBetween(String value1, String value2) {
            addCriterion("PROCSTEP not between", value1, value2, "procstep");
            return (Criteria) this;
        }

        public Criteria andProcstatusIsNull() {
            addCriterion("PROCSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andProcstatusIsNotNull() {
            addCriterion("PROCSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andProcstatusEqualTo(String value) {
            addCriterion("PROCSTATUS =", value, "procstatus");
            return (Criteria) this;
        }

        public Criteria andProcstatusNotEqualTo(String value) {
            addCriterion("PROCSTATUS <>", value, "procstatus");
            return (Criteria) this;
        }

        public Criteria andProcstatusGreaterThan(String value) {
            addCriterion("PROCSTATUS >", value, "procstatus");
            return (Criteria) this;
        }

        public Criteria andProcstatusGreaterThanOrEqualTo(String value) {
            addCriterion("PROCSTATUS >=", value, "procstatus");
            return (Criteria) this;
        }

        public Criteria andProcstatusLessThan(String value) {
            addCriterion("PROCSTATUS <", value, "procstatus");
            return (Criteria) this;
        }

        public Criteria andProcstatusLessThanOrEqualTo(String value) {
            addCriterion("PROCSTATUS <=", value, "procstatus");
            return (Criteria) this;
        }

        public Criteria andProcstatusLike(String value) {
            addCriterion("PROCSTATUS like", value, "procstatus");
            return (Criteria) this;
        }

        public Criteria andProcstatusNotLike(String value) {
            addCriterion("PROCSTATUS not like", value, "procstatus");
            return (Criteria) this;
        }

        public Criteria andProcstatusIn(List<String> values) {
            addCriterion("PROCSTATUS in", values, "procstatus");
            return (Criteria) this;
        }

        public Criteria andProcstatusNotIn(List<String> values) {
            addCriterion("PROCSTATUS not in", values, "procstatus");
            return (Criteria) this;
        }

        public Criteria andProcstatusBetween(String value1, String value2) {
            addCriterion("PROCSTATUS between", value1, value2, "procstatus");
            return (Criteria) this;
        }

        public Criteria andProcstatusNotBetween(String value1, String value2) {
            addCriterion("PROCSTATUS not between", value1, value2, "procstatus");
            return (Criteria) this;
        }

        public Criteria andMemo1IsNull() {
            addCriterion("MEMO1 is null");
            return (Criteria) this;
        }

        public Criteria andMemo1IsNotNull() {
            addCriterion("MEMO1 is not null");
            return (Criteria) this;
        }

        public Criteria andMemo1EqualTo(String value) {
            addCriterion("MEMO1 =", value, "memo1");
            return (Criteria) this;
        }

        public Criteria andMemo1NotEqualTo(String value) {
            addCriterion("MEMO1 <>", value, "memo1");
            return (Criteria) this;
        }

        public Criteria andMemo1GreaterThan(String value) {
            addCriterion("MEMO1 >", value, "memo1");
            return (Criteria) this;
        }

        public Criteria andMemo1GreaterThanOrEqualTo(String value) {
            addCriterion("MEMO1 >=", value, "memo1");
            return (Criteria) this;
        }

        public Criteria andMemo1LessThan(String value) {
            addCriterion("MEMO1 <", value, "memo1");
            return (Criteria) this;
        }

        public Criteria andMemo1LessThanOrEqualTo(String value) {
            addCriterion("MEMO1 <=", value, "memo1");
            return (Criteria) this;
        }

        public Criteria andMemo1Like(String value) {
            addCriterion("MEMO1 like", value, "memo1");
            return (Criteria) this;
        }

        public Criteria andMemo1NotLike(String value) {
            addCriterion("MEMO1 not like", value, "memo1");
            return (Criteria) this;
        }

        public Criteria andMemo1In(List<String> values) {
            addCriterion("MEMO1 in", values, "memo1");
            return (Criteria) this;
        }

        public Criteria andMemo1NotIn(List<String> values) {
            addCriterion("MEMO1 not in", values, "memo1");
            return (Criteria) this;
        }

        public Criteria andMemo1Between(String value1, String value2) {
            addCriterion("MEMO1 between", value1, value2, "memo1");
            return (Criteria) this;
        }

        public Criteria andMemo1NotBetween(String value1, String value2) {
            addCriterion("MEMO1 not between", value1, value2, "memo1");
            return (Criteria) this;
        }

        public Criteria andTranstimeIsNull() {
            addCriterion("TRANSTIME is null");
            return (Criteria) this;
        }

        public Criteria andTranstimeIsNotNull() {
            addCriterion("TRANSTIME is not null");
            return (Criteria) this;
        }

        public Criteria andTranstimeEqualTo(Date value) {
            addCriterion("TRANSTIME =", value, "transtime");
            return (Criteria) this;
        }

        public Criteria andTranstimeNotEqualTo(Date value) {
            addCriterion("TRANSTIME <>", value, "transtime");
            return (Criteria) this;
        }

        public Criteria andTranstimeGreaterThan(Date value) {
            addCriterion("TRANSTIME >", value, "transtime");
            return (Criteria) this;
        }

        public Criteria andTranstimeGreaterThanOrEqualTo(Date value) {
            addCriterion("TRANSTIME >=", value, "transtime");
            return (Criteria) this;
        }

        public Criteria andTranstimeLessThan(Date value) {
            addCriterion("TRANSTIME <", value, "transtime");
            return (Criteria) this;
        }

        public Criteria andTranstimeLessThanOrEqualTo(Date value) {
            addCriterion("TRANSTIME <=", value, "transtime");
            return (Criteria) this;
        }

        public Criteria andTranstimeIn(List<Date> values) {
            addCriterion("TRANSTIME in", values, "transtime");
            return (Criteria) this;
        }

        public Criteria andTranstimeNotIn(List<Date> values) {
            addCriterion("TRANSTIME not in", values, "transtime");
            return (Criteria) this;
        }

        public Criteria andTranstimeBetween(Date value1, Date value2) {
            addCriterion("TRANSTIME between", value1, value2, "transtime");
            return (Criteria) this;
        }

        public Criteria andTranstimeNotBetween(Date value1, Date value2) {
            addCriterion("TRANSTIME not between", value1, value2, "transtime");
            return (Criteria) this;
        }

        public Criteria andMemo2IsNull() {
            addCriterion("MEMO2 is null");
            return (Criteria) this;
        }

        public Criteria andMemo2IsNotNull() {
            addCriterion("MEMO2 is not null");
            return (Criteria) this;
        }

        public Criteria andMemo2EqualTo(String value) {
            addCriterion("MEMO2 =", value, "memo2");
            return (Criteria) this;
        }

        public Criteria andMemo2NotEqualTo(String value) {
            addCriterion("MEMO2 <>", value, "memo2");
            return (Criteria) this;
        }

        public Criteria andMemo2GreaterThan(String value) {
            addCriterion("MEMO2 >", value, "memo2");
            return (Criteria) this;
        }

        public Criteria andMemo2GreaterThanOrEqualTo(String value) {
            addCriterion("MEMO2 >=", value, "memo2");
            return (Criteria) this;
        }

        public Criteria andMemo2LessThan(String value) {
            addCriterion("MEMO2 <", value, "memo2");
            return (Criteria) this;
        }

        public Criteria andMemo2LessThanOrEqualTo(String value) {
            addCriterion("MEMO2 <=", value, "memo2");
            return (Criteria) this;
        }

        public Criteria andMemo2Like(String value) {
            addCriterion("MEMO2 like", value, "memo2");
            return (Criteria) this;
        }

        public Criteria andMemo2NotLike(String value) {
            addCriterion("MEMO2 not like", value, "memo2");
            return (Criteria) this;
        }

        public Criteria andMemo2In(List<String> values) {
            addCriterion("MEMO2 in", values, "memo2");
            return (Criteria) this;
        }

        public Criteria andMemo2NotIn(List<String> values) {
            addCriterion("MEMO2 not in", values, "memo2");
            return (Criteria) this;
        }

        public Criteria andMemo2Between(String value1, String value2) {
            addCriterion("MEMO2 between", value1, value2, "memo2");
            return (Criteria) this;
        }

        public Criteria andMemo2NotBetween(String value1, String value2) {
            addCriterion("MEMO2 not between", value1, value2, "memo2");
            return (Criteria) this;
        }

        public Criteria andDepartmentnbrIsNull() {
            addCriterion("DEPARTMENTNBR is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentnbrIsNotNull() {
            addCriterion("DEPARTMENTNBR is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentnbrEqualTo(String value) {
            addCriterion("DEPARTMENTNBR =", value, "departmentnbr");
            return (Criteria) this;
        }

        public Criteria andDepartmentnbrNotEqualTo(String value) {
            addCriterion("DEPARTMENTNBR <>", value, "departmentnbr");
            return (Criteria) this;
        }

        public Criteria andDepartmentnbrGreaterThan(String value) {
            addCriterion("DEPARTMENTNBR >", value, "departmentnbr");
            return (Criteria) this;
        }

        public Criteria andDepartmentnbrGreaterThanOrEqualTo(String value) {
            addCriterion("DEPARTMENTNBR >=", value, "departmentnbr");
            return (Criteria) this;
        }

        public Criteria andDepartmentnbrLessThan(String value) {
            addCriterion("DEPARTMENTNBR <", value, "departmentnbr");
            return (Criteria) this;
        }

        public Criteria andDepartmentnbrLessThanOrEqualTo(String value) {
            addCriterion("DEPARTMENTNBR <=", value, "departmentnbr");
            return (Criteria) this;
        }

        public Criteria andDepartmentnbrLike(String value) {
            addCriterion("DEPARTMENTNBR like", value, "departmentnbr");
            return (Criteria) this;
        }

        public Criteria andDepartmentnbrNotLike(String value) {
            addCriterion("DEPARTMENTNBR not like", value, "departmentnbr");
            return (Criteria) this;
        }

        public Criteria andDepartmentnbrIn(List<String> values) {
            addCriterion("DEPARTMENTNBR in", values, "departmentnbr");
            return (Criteria) this;
        }

        public Criteria andDepartmentnbrNotIn(List<String> values) {
            addCriterion("DEPARTMENTNBR not in", values, "departmentnbr");
            return (Criteria) this;
        }

        public Criteria andDepartmentnbrBetween(String value1, String value2) {
            addCriterion("DEPARTMENTNBR between", value1, value2, "departmentnbr");
            return (Criteria) this;
        }

        public Criteria andDepartmentnbrNotBetween(String value1, String value2) {
            addCriterion("DEPARTMENTNBR not between", value1, value2, "departmentnbr");
            return (Criteria) this;
        }

        public Criteria andSystemcodeIsNull() {
            addCriterion("SYSTEMCODE is null");
            return (Criteria) this;
        }

        public Criteria andSystemcodeIsNotNull() {
            addCriterion("SYSTEMCODE is not null");
            return (Criteria) this;
        }

        public Criteria andSystemcodeEqualTo(String value) {
            addCriterion("SYSTEMCODE =", value, "systemcode");
            return (Criteria) this;
        }

        public Criteria andSystemcodeNotEqualTo(String value) {
            addCriterion("SYSTEMCODE <>", value, "systemcode");
            return (Criteria) this;
        }

        public Criteria andSystemcodeGreaterThan(String value) {
            addCriterion("SYSTEMCODE >", value, "systemcode");
            return (Criteria) this;
        }

        public Criteria andSystemcodeGreaterThanOrEqualTo(String value) {
            addCriterion("SYSTEMCODE >=", value, "systemcode");
            return (Criteria) this;
        }

        public Criteria andSystemcodeLessThan(String value) {
            addCriterion("SYSTEMCODE <", value, "systemcode");
            return (Criteria) this;
        }

        public Criteria andSystemcodeLessThanOrEqualTo(String value) {
            addCriterion("SYSTEMCODE <=", value, "systemcode");
            return (Criteria) this;
        }

        public Criteria andSystemcodeLike(String value) {
            addCriterion("SYSTEMCODE like", value, "systemcode");
            return (Criteria) this;
        }

        public Criteria andSystemcodeNotLike(String value) {
            addCriterion("SYSTEMCODE not like", value, "systemcode");
            return (Criteria) this;
        }

        public Criteria andSystemcodeIn(List<String> values) {
            addCriterion("SYSTEMCODE in", values, "systemcode");
            return (Criteria) this;
        }

        public Criteria andSystemcodeNotIn(List<String> values) {
            addCriterion("SYSTEMCODE not in", values, "systemcode");
            return (Criteria) this;
        }

        public Criteria andSystemcodeBetween(String value1, String value2) {
            addCriterion("SYSTEMCODE between", value1, value2, "systemcode");
            return (Criteria) this;
        }

        public Criteria andSystemcodeNotBetween(String value1, String value2) {
            addCriterion("SYSTEMCODE not between", value1, value2, "systemcode");
            return (Criteria) this;
        }

        public Criteria andTransmodeIsNull() {
            addCriterion("TRANSMODE is null");
            return (Criteria) this;
        }

        public Criteria andTransmodeIsNotNull() {
            addCriterion("TRANSMODE is not null");
            return (Criteria) this;
        }

        public Criteria andTransmodeEqualTo(String value) {
            addCriterion("TRANSMODE =", value, "transmode");
            return (Criteria) this;
        }

        public Criteria andTransmodeNotEqualTo(String value) {
            addCriterion("TRANSMODE <>", value, "transmode");
            return (Criteria) this;
        }

        public Criteria andTransmodeGreaterThan(String value) {
            addCriterion("TRANSMODE >", value, "transmode");
            return (Criteria) this;
        }

        public Criteria andTransmodeGreaterThanOrEqualTo(String value) {
            addCriterion("TRANSMODE >=", value, "transmode");
            return (Criteria) this;
        }

        public Criteria andTransmodeLessThan(String value) {
            addCriterion("TRANSMODE <", value, "transmode");
            return (Criteria) this;
        }

        public Criteria andTransmodeLessThanOrEqualTo(String value) {
            addCriterion("TRANSMODE <=", value, "transmode");
            return (Criteria) this;
        }

        public Criteria andTransmodeLike(String value) {
            addCriterion("TRANSMODE like", value, "transmode");
            return (Criteria) this;
        }

        public Criteria andTransmodeNotLike(String value) {
            addCriterion("TRANSMODE not like", value, "transmode");
            return (Criteria) this;
        }

        public Criteria andTransmodeIn(List<String> values) {
            addCriterion("TRANSMODE in", values, "transmode");
            return (Criteria) this;
        }

        public Criteria andTransmodeNotIn(List<String> values) {
            addCriterion("TRANSMODE not in", values, "transmode");
            return (Criteria) this;
        }

        public Criteria andTransmodeBetween(String value1, String value2) {
            addCriterion("TRANSMODE between", value1, value2, "transmode");
            return (Criteria) this;
        }

        public Criteria andTransmodeNotBetween(String value1, String value2) {
            addCriterion("TRANSMODE not between", value1, value2, "transmode");
            return (Criteria) this;
        }

        public Criteria andTranstypcdIsNull() {
            addCriterion("TRANSTYPCD is null");
            return (Criteria) this;
        }

        public Criteria andTranstypcdIsNotNull() {
            addCriterion("TRANSTYPCD is not null");
            return (Criteria) this;
        }

        public Criteria andTranstypcdEqualTo(String value) {
            addCriterion("TRANSTYPCD =", value, "transtypcd");
            return (Criteria) this;
        }

        public Criteria andTranstypcdNotEqualTo(String value) {
            addCriterion("TRANSTYPCD <>", value, "transtypcd");
            return (Criteria) this;
        }

        public Criteria andTranstypcdGreaterThan(String value) {
            addCriterion("TRANSTYPCD >", value, "transtypcd");
            return (Criteria) this;
        }

        public Criteria andTranstypcdGreaterThanOrEqualTo(String value) {
            addCriterion("TRANSTYPCD >=", value, "transtypcd");
            return (Criteria) this;
        }

        public Criteria andTranstypcdLessThan(String value) {
            addCriterion("TRANSTYPCD <", value, "transtypcd");
            return (Criteria) this;
        }

        public Criteria andTranstypcdLessThanOrEqualTo(String value) {
            addCriterion("TRANSTYPCD <=", value, "transtypcd");
            return (Criteria) this;
        }

        public Criteria andTranstypcdLike(String value) {
            addCriterion("TRANSTYPCD like", value, "transtypcd");
            return (Criteria) this;
        }

        public Criteria andTranstypcdNotLike(String value) {
            addCriterion("TRANSTYPCD not like", value, "transtypcd");
            return (Criteria) this;
        }

        public Criteria andTranstypcdIn(List<String> values) {
            addCriterion("TRANSTYPCD in", values, "transtypcd");
            return (Criteria) this;
        }

        public Criteria andTranstypcdNotIn(List<String> values) {
            addCriterion("TRANSTYPCD not in", values, "transtypcd");
            return (Criteria) this;
        }

        public Criteria andTranstypcdBetween(String value1, String value2) {
            addCriterion("TRANSTYPCD between", value1, value2, "transtypcd");
            return (Criteria) this;
        }

        public Criteria andTranstypcdNotBetween(String value1, String value2) {
            addCriterion("TRANSTYPCD not between", value1, value2, "transtypcd");
            return (Criteria) this;
        }

        public Criteria andProfitseqnbrIsNull() {
            addCriterion("PROFITSEQNBR is null");
            return (Criteria) this;
        }

        public Criteria andProfitseqnbrIsNotNull() {
            addCriterion("PROFITSEQNBR is not null");
            return (Criteria) this;
        }

        public Criteria andProfitseqnbrEqualTo(String value) {
            addCriterion("PROFITSEQNBR =", value, "profitseqnbr");
            return (Criteria) this;
        }

        public Criteria andProfitseqnbrNotEqualTo(String value) {
            addCriterion("PROFITSEQNBR <>", value, "profitseqnbr");
            return (Criteria) this;
        }

        public Criteria andProfitseqnbrGreaterThan(String value) {
            addCriterion("PROFITSEQNBR >", value, "profitseqnbr");
            return (Criteria) this;
        }

        public Criteria andProfitseqnbrGreaterThanOrEqualTo(String value) {
            addCriterion("PROFITSEQNBR >=", value, "profitseqnbr");
            return (Criteria) this;
        }

        public Criteria andProfitseqnbrLessThan(String value) {
            addCriterion("PROFITSEQNBR <", value, "profitseqnbr");
            return (Criteria) this;
        }

        public Criteria andProfitseqnbrLessThanOrEqualTo(String value) {
            addCriterion("PROFITSEQNBR <=", value, "profitseqnbr");
            return (Criteria) this;
        }

        public Criteria andProfitseqnbrLike(String value) {
            addCriterion("PROFITSEQNBR like", value, "profitseqnbr");
            return (Criteria) this;
        }

        public Criteria andProfitseqnbrNotLike(String value) {
            addCriterion("PROFITSEQNBR not like", value, "profitseqnbr");
            return (Criteria) this;
        }

        public Criteria andProfitseqnbrIn(List<String> values) {
            addCriterion("PROFITSEQNBR in", values, "profitseqnbr");
            return (Criteria) this;
        }

        public Criteria andProfitseqnbrNotIn(List<String> values) {
            addCriterion("PROFITSEQNBR not in", values, "profitseqnbr");
            return (Criteria) this;
        }

        public Criteria andProfitseqnbrBetween(String value1, String value2) {
            addCriterion("PROFITSEQNBR between", value1, value2, "profitseqnbr");
            return (Criteria) this;
        }

        public Criteria andProfitseqnbrNotBetween(String value1, String value2) {
            addCriterion("PROFITSEQNBR not between", value1, value2, "profitseqnbr");
            return (Criteria) this;
        }

        public Criteria andConfirmedpayamtIsNull() {
            addCriterion("CONFIRMEDPAYAMT is null");
            return (Criteria) this;
        }

        public Criteria andConfirmedpayamtIsNotNull() {
            addCriterion("CONFIRMEDPAYAMT is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmedpayamtEqualTo(BigDecimal value) {
            addCriterion("CONFIRMEDPAYAMT =", value, "confirmedpayamt");
            return (Criteria) this;
        }

        public Criteria andConfirmedpayamtNotEqualTo(BigDecimal value) {
            addCriterion("CONFIRMEDPAYAMT <>", value, "confirmedpayamt");
            return (Criteria) this;
        }

        public Criteria andConfirmedpayamtGreaterThan(BigDecimal value) {
            addCriterion("CONFIRMEDPAYAMT >", value, "confirmedpayamt");
            return (Criteria) this;
        }

        public Criteria andConfirmedpayamtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CONFIRMEDPAYAMT >=", value, "confirmedpayamt");
            return (Criteria) this;
        }

        public Criteria andConfirmedpayamtLessThan(BigDecimal value) {
            addCriterion("CONFIRMEDPAYAMT <", value, "confirmedpayamt");
            return (Criteria) this;
        }

        public Criteria andConfirmedpayamtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CONFIRMEDPAYAMT <=", value, "confirmedpayamt");
            return (Criteria) this;
        }

        public Criteria andConfirmedpayamtIn(List<BigDecimal> values) {
            addCriterion("CONFIRMEDPAYAMT in", values, "confirmedpayamt");
            return (Criteria) this;
        }

        public Criteria andConfirmedpayamtNotIn(List<BigDecimal> values) {
            addCriterion("CONFIRMEDPAYAMT not in", values, "confirmedpayamt");
            return (Criteria) this;
        }

        public Criteria andConfirmedpayamtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CONFIRMEDPAYAMT between", value1, value2, "confirmedpayamt");
            return (Criteria) this;
        }

        public Criteria andConfirmedpayamtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CONFIRMEDPAYAMT not between", value1, value2, "confirmedpayamt");
            return (Criteria) this;
        }

        public Criteria andConfirmedpaydateIsNull() {
            addCriterion("CONFIRMEDPAYDATE is null");
            return (Criteria) this;
        }

        public Criteria andConfirmedpaydateIsNotNull() {
            addCriterion("CONFIRMEDPAYDATE is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmedpaydateEqualTo(Date value) {
            addCriterion("CONFIRMEDPAYDATE =", value, "confirmedpaydate");
            return (Criteria) this;
        }

        public Criteria andConfirmedpaydateNotEqualTo(Date value) {
            addCriterion("CONFIRMEDPAYDATE <>", value, "confirmedpaydate");
            return (Criteria) this;
        }

        public Criteria andConfirmedpaydateGreaterThan(Date value) {
            addCriterion("CONFIRMEDPAYDATE >", value, "confirmedpaydate");
            return (Criteria) this;
        }

        public Criteria andConfirmedpaydateGreaterThanOrEqualTo(Date value) {
            addCriterion("CONFIRMEDPAYDATE >=", value, "confirmedpaydate");
            return (Criteria) this;
        }

        public Criteria andConfirmedpaydateLessThan(Date value) {
            addCriterion("CONFIRMEDPAYDATE <", value, "confirmedpaydate");
            return (Criteria) this;
        }

        public Criteria andConfirmedpaydateLessThanOrEqualTo(Date value) {
            addCriterion("CONFIRMEDPAYDATE <=", value, "confirmedpaydate");
            return (Criteria) this;
        }

        public Criteria andConfirmedpaydateIn(List<Date> values) {
            addCriterion("CONFIRMEDPAYDATE in", values, "confirmedpaydate");
            return (Criteria) this;
        }

        public Criteria andConfirmedpaydateNotIn(List<Date> values) {
            addCriterion("CONFIRMEDPAYDATE not in", values, "confirmedpaydate");
            return (Criteria) this;
        }

        public Criteria andConfirmedpaydateBetween(Date value1, Date value2) {
            addCriterion("CONFIRMEDPAYDATE between", value1, value2, "confirmedpaydate");
            return (Criteria) this;
        }

        public Criteria andConfirmedpaydateNotBetween(Date value1, Date value2) {
            addCriterion("CONFIRMEDPAYDATE not between", value1, value2, "confirmedpaydate");
            return (Criteria) this;
        }

        public Criteria andConfirmedcleardateIsNull() {
            addCriterion("CONFIRMEDCLEARDATE is null");
            return (Criteria) this;
        }

        public Criteria andConfirmedcleardateIsNotNull() {
            addCriterion("CONFIRMEDCLEARDATE is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmedcleardateEqualTo(Date value) {
            addCriterion("CONFIRMEDCLEARDATE =", value, "confirmedcleardate");
            return (Criteria) this;
        }

        public Criteria andConfirmedcleardateNotEqualTo(Date value) {
            addCriterion("CONFIRMEDCLEARDATE <>", value, "confirmedcleardate");
            return (Criteria) this;
        }

        public Criteria andConfirmedcleardateGreaterThan(Date value) {
            addCriterion("CONFIRMEDCLEARDATE >", value, "confirmedcleardate");
            return (Criteria) this;
        }

        public Criteria andConfirmedcleardateGreaterThanOrEqualTo(Date value) {
            addCriterion("CONFIRMEDCLEARDATE >=", value, "confirmedcleardate");
            return (Criteria) this;
        }

        public Criteria andConfirmedcleardateLessThan(Date value) {
            addCriterion("CONFIRMEDCLEARDATE <", value, "confirmedcleardate");
            return (Criteria) this;
        }

        public Criteria andConfirmedcleardateLessThanOrEqualTo(Date value) {
            addCriterion("CONFIRMEDCLEARDATE <=", value, "confirmedcleardate");
            return (Criteria) this;
        }

        public Criteria andConfirmedcleardateIn(List<Date> values) {
            addCriterion("CONFIRMEDCLEARDATE in", values, "confirmedcleardate");
            return (Criteria) this;
        }

        public Criteria andConfirmedcleardateNotIn(List<Date> values) {
            addCriterion("CONFIRMEDCLEARDATE not in", values, "confirmedcleardate");
            return (Criteria) this;
        }

        public Criteria andConfirmedcleardateBetween(Date value1, Date value2) {
            addCriterion("CONFIRMEDCLEARDATE between", value1, value2, "confirmedcleardate");
            return (Criteria) this;
        }

        public Criteria andConfirmedcleardateNotBetween(Date value1, Date value2) {
            addCriterion("CONFIRMEDCLEARDATE not between", value1, value2, "confirmedcleardate");
            return (Criteria) this;
        }

        public Criteria andConfirmedmerseqnbrIsNull() {
            addCriterion("CONFIRMEDMERSEQNBR is null");
            return (Criteria) this;
        }

        public Criteria andConfirmedmerseqnbrIsNotNull() {
            addCriterion("CONFIRMEDMERSEQNBR is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmedmerseqnbrEqualTo(String value) {
            addCriterion("CONFIRMEDMERSEQNBR =", value, "confirmedmerseqnbr");
            return (Criteria) this;
        }

        public Criteria andConfirmedmerseqnbrNotEqualTo(String value) {
            addCriterion("CONFIRMEDMERSEQNBR <>", value, "confirmedmerseqnbr");
            return (Criteria) this;
        }

        public Criteria andConfirmedmerseqnbrGreaterThan(String value) {
            addCriterion("CONFIRMEDMERSEQNBR >", value, "confirmedmerseqnbr");
            return (Criteria) this;
        }

        public Criteria andConfirmedmerseqnbrGreaterThanOrEqualTo(String value) {
            addCriterion("CONFIRMEDMERSEQNBR >=", value, "confirmedmerseqnbr");
            return (Criteria) this;
        }

        public Criteria andConfirmedmerseqnbrLessThan(String value) {
            addCriterion("CONFIRMEDMERSEQNBR <", value, "confirmedmerseqnbr");
            return (Criteria) this;
        }

        public Criteria andConfirmedmerseqnbrLessThanOrEqualTo(String value) {
            addCriterion("CONFIRMEDMERSEQNBR <=", value, "confirmedmerseqnbr");
            return (Criteria) this;
        }

        public Criteria andConfirmedmerseqnbrLike(String value) {
            addCriterion("CONFIRMEDMERSEQNBR like", value, "confirmedmerseqnbr");
            return (Criteria) this;
        }

        public Criteria andConfirmedmerseqnbrNotLike(String value) {
            addCriterion("CONFIRMEDMERSEQNBR not like", value, "confirmedmerseqnbr");
            return (Criteria) this;
        }

        public Criteria andConfirmedmerseqnbrIn(List<String> values) {
            addCriterion("CONFIRMEDMERSEQNBR in", values, "confirmedmerseqnbr");
            return (Criteria) this;
        }

        public Criteria andConfirmedmerseqnbrNotIn(List<String> values) {
            addCriterion("CONFIRMEDMERSEQNBR not in", values, "confirmedmerseqnbr");
            return (Criteria) this;
        }

        public Criteria andConfirmedmerseqnbrBetween(String value1, String value2) {
            addCriterion("CONFIRMEDMERSEQNBR between", value1, value2, "confirmedmerseqnbr");
            return (Criteria) this;
        }

        public Criteria andConfirmedmerseqnbrNotBetween(String value1, String value2) {
            addCriterion("CONFIRMEDMERSEQNBR not between", value1, value2, "confirmedmerseqnbr");
            return (Criteria) this;
        }

        public Criteria andConfirmedmerdatetimeIsNull() {
            addCriterion("CONFIRMEDMERDATETIME is null");
            return (Criteria) this;
        }

        public Criteria andConfirmedmerdatetimeIsNotNull() {
            addCriterion("CONFIRMEDMERDATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmedmerdatetimeEqualTo(Date value) {
            addCriterion("CONFIRMEDMERDATETIME =", value, "confirmedmerdatetime");
            return (Criteria) this;
        }

        public Criteria andConfirmedmerdatetimeNotEqualTo(Date value) {
            addCriterion("CONFIRMEDMERDATETIME <>", value, "confirmedmerdatetime");
            return (Criteria) this;
        }

        public Criteria andConfirmedmerdatetimeGreaterThan(Date value) {
            addCriterion("CONFIRMEDMERDATETIME >", value, "confirmedmerdatetime");
            return (Criteria) this;
        }

        public Criteria andConfirmedmerdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CONFIRMEDMERDATETIME >=", value, "confirmedmerdatetime");
            return (Criteria) this;
        }

        public Criteria andConfirmedmerdatetimeLessThan(Date value) {
            addCriterion("CONFIRMEDMERDATETIME <", value, "confirmedmerdatetime");
            return (Criteria) this;
        }

        public Criteria andConfirmedmerdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("CONFIRMEDMERDATETIME <=", value, "confirmedmerdatetime");
            return (Criteria) this;
        }

        public Criteria andConfirmedmerdatetimeIn(List<Date> values) {
            addCriterion("CONFIRMEDMERDATETIME in", values, "confirmedmerdatetime");
            return (Criteria) this;
        }

        public Criteria andConfirmedmerdatetimeNotIn(List<Date> values) {
            addCriterion("CONFIRMEDMERDATETIME not in", values, "confirmedmerdatetime");
            return (Criteria) this;
        }

        public Criteria andConfirmedmerdatetimeBetween(Date value1, Date value2) {
            addCriterion("CONFIRMEDMERDATETIME between", value1, value2, "confirmedmerdatetime");
            return (Criteria) this;
        }

        public Criteria andConfirmedmerdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("CONFIRMEDMERDATETIME not between", value1, value2, "confirmedmerdatetime");
            return (Criteria) this;
        }

        public Criteria andRefundmodeIsNull() {
            addCriterion("REFUNDMODE is null");
            return (Criteria) this;
        }

        public Criteria andRefundmodeIsNotNull() {
            addCriterion("REFUNDMODE is not null");
            return (Criteria) this;
        }

        public Criteria andRefundmodeEqualTo(String value) {
            addCriterion("REFUNDMODE =", value, "refundmode");
            return (Criteria) this;
        }

        public Criteria andRefundmodeNotEqualTo(String value) {
            addCriterion("REFUNDMODE <>", value, "refundmode");
            return (Criteria) this;
        }

        public Criteria andRefundmodeGreaterThan(String value) {
            addCriterion("REFUNDMODE >", value, "refundmode");
            return (Criteria) this;
        }

        public Criteria andRefundmodeGreaterThanOrEqualTo(String value) {
            addCriterion("REFUNDMODE >=", value, "refundmode");
            return (Criteria) this;
        }

        public Criteria andRefundmodeLessThan(String value) {
            addCriterion("REFUNDMODE <", value, "refundmode");
            return (Criteria) this;
        }

        public Criteria andRefundmodeLessThanOrEqualTo(String value) {
            addCriterion("REFUNDMODE <=", value, "refundmode");
            return (Criteria) this;
        }

        public Criteria andRefundmodeLike(String value) {
            addCriterion("REFUNDMODE like", value, "refundmode");
            return (Criteria) this;
        }

        public Criteria andRefundmodeNotLike(String value) {
            addCriterion("REFUNDMODE not like", value, "refundmode");
            return (Criteria) this;
        }

        public Criteria andRefundmodeIn(List<String> values) {
            addCriterion("REFUNDMODE in", values, "refundmode");
            return (Criteria) this;
        }

        public Criteria andRefundmodeNotIn(List<String> values) {
            addCriterion("REFUNDMODE not in", values, "refundmode");
            return (Criteria) this;
        }

        public Criteria andRefundmodeBetween(String value1, String value2) {
            addCriterion("REFUNDMODE between", value1, value2, "refundmode");
            return (Criteria) this;
        }

        public Criteria andRefundmodeNotBetween(String value1, String value2) {
            addCriterion("REFUNDMODE not between", value1, value2, "refundmode");
            return (Criteria) this;
        }

        public Criteria andMerseqnbrIsNull() {
            addCriterion("MERSEQNBR is null");
            return (Criteria) this;
        }

        public Criteria andMerseqnbrIsNotNull() {
            addCriterion("MERSEQNBR is not null");
            return (Criteria) this;
        }

        public Criteria andMerseqnbrEqualTo(String value) {
            addCriterion("MERSEQNBR =", value, "merseqnbr");
            return (Criteria) this;
        }

        public Criteria andMerseqnbrNotEqualTo(String value) {
            addCriterion("MERSEQNBR <>", value, "merseqnbr");
            return (Criteria) this;
        }

        public Criteria andMerseqnbrGreaterThan(String value) {
            addCriterion("MERSEQNBR >", value, "merseqnbr");
            return (Criteria) this;
        }

        public Criteria andMerseqnbrGreaterThanOrEqualTo(String value) {
            addCriterion("MERSEQNBR >=", value, "merseqnbr");
            return (Criteria) this;
        }

        public Criteria andMerseqnbrLessThan(String value) {
            addCriterion("MERSEQNBR <", value, "merseqnbr");
            return (Criteria) this;
        }

        public Criteria andMerseqnbrLessThanOrEqualTo(String value) {
            addCriterion("MERSEQNBR <=", value, "merseqnbr");
            return (Criteria) this;
        }

        public Criteria andMerseqnbrLike(String value) {
            addCriterion("MERSEQNBR like", value, "merseqnbr");
            return (Criteria) this;
        }

        public Criteria andMerseqnbrNotLike(String value) {
            addCriterion("MERSEQNBR not like", value, "merseqnbr");
            return (Criteria) this;
        }

        public Criteria andMerseqnbrIn(List<String> values) {
            addCriterion("MERSEQNBR in", values, "merseqnbr");
            return (Criteria) this;
        }

        public Criteria andMerseqnbrNotIn(List<String> values) {
            addCriterion("MERSEQNBR not in", values, "merseqnbr");
            return (Criteria) this;
        }

        public Criteria andMerseqnbrBetween(String value1, String value2) {
            addCriterion("MERSEQNBR between", value1, value2, "merseqnbr");
            return (Criteria) this;
        }

        public Criteria andMerseqnbrNotBetween(String value1, String value2) {
            addCriterion("MERSEQNBR not between", value1, value2, "merseqnbr");
            return (Criteria) this;
        }

        public Criteria andTransdateIsNull() {
            addCriterion("TRANSDATE is null");
            return (Criteria) this;
        }

        public Criteria andTransdateIsNotNull() {
            addCriterion("TRANSDATE is not null");
            return (Criteria) this;
        }

        public Criteria andTransdateEqualTo(Date value) {
            addCriterion("TRANSDATE =", value, "transdate");
            return (Criteria) this;
        }

        public Criteria andTransdateNotEqualTo(Date value) {
            addCriterion("TRANSDATE <>", value, "transdate");
            return (Criteria) this;
        }

        public Criteria andTransdateGreaterThan(Date value) {
            addCriterion("TRANSDATE >", value, "transdate");
            return (Criteria) this;
        }

        public Criteria andTransdateGreaterThanOrEqualTo(Date value) {
            addCriterion("TRANSDATE >=", value, "transdate");
            return (Criteria) this;
        }

        public Criteria andTransdateLessThan(Date value) {
            addCriterion("TRANSDATE <", value, "transdate");
            return (Criteria) this;
        }

        public Criteria andTransdateLessThanOrEqualTo(Date value) {
            addCriterion("TRANSDATE <=", value, "transdate");
            return (Criteria) this;
        }

        public Criteria andTransdateIn(List<Date> values) {
            addCriterion("TRANSDATE in", values, "transdate");
            return (Criteria) this;
        }

        public Criteria andTransdateNotIn(List<Date> values) {
            addCriterion("TRANSDATE not in", values, "transdate");
            return (Criteria) this;
        }

        public Criteria andTransdateBetween(Date value1, Date value2) {
            addCriterion("TRANSDATE between", value1, value2, "transdate");
            return (Criteria) this;
        }

        public Criteria andTransdateNotBetween(Date value1, Date value2) {
            addCriterion("TRANSDATE not between", value1, value2, "transdate");
            return (Criteria) this;
        }

        public Criteria andPaytypcdIsNull() {
            addCriterion("PAYTYPCD is null");
            return (Criteria) this;
        }

        public Criteria andPaytypcdIsNotNull() {
            addCriterion("PAYTYPCD is not null");
            return (Criteria) this;
        }

        public Criteria andPaytypcdEqualTo(String value) {
            addCriterion("PAYTYPCD =", value, "paytypcd");
            return (Criteria) this;
        }

        public Criteria andPaytypcdNotEqualTo(String value) {
            addCriterion("PAYTYPCD <>", value, "paytypcd");
            return (Criteria) this;
        }

        public Criteria andPaytypcdGreaterThan(String value) {
            addCriterion("PAYTYPCD >", value, "paytypcd");
            return (Criteria) this;
        }

        public Criteria andPaytypcdGreaterThanOrEqualTo(String value) {
            addCriterion("PAYTYPCD >=", value, "paytypcd");
            return (Criteria) this;
        }

        public Criteria andPaytypcdLessThan(String value) {
            addCriterion("PAYTYPCD <", value, "paytypcd");
            return (Criteria) this;
        }

        public Criteria andPaytypcdLessThanOrEqualTo(String value) {
            addCriterion("PAYTYPCD <=", value, "paytypcd");
            return (Criteria) this;
        }

        public Criteria andPaytypcdLike(String value) {
            addCriterion("PAYTYPCD like", value, "paytypcd");
            return (Criteria) this;
        }

        public Criteria andPaytypcdNotLike(String value) {
            addCriterion("PAYTYPCD not like", value, "paytypcd");
            return (Criteria) this;
        }

        public Criteria andPaytypcdIn(List<String> values) {
            addCriterion("PAYTYPCD in", values, "paytypcd");
            return (Criteria) this;
        }

        public Criteria andPaytypcdNotIn(List<String> values) {
            addCriterion("PAYTYPCD not in", values, "paytypcd");
            return (Criteria) this;
        }

        public Criteria andPaytypcdBetween(String value1, String value2) {
            addCriterion("PAYTYPCD between", value1, value2, "paytypcd");
            return (Criteria) this;
        }

        public Criteria andPaytypcdNotBetween(String value1, String value2) {
            addCriterion("PAYTYPCD not between", value1, value2, "paytypcd");
            return (Criteria) this;
        }

        public Criteria andFeenbrIsNull() {
            addCriterion("FEENBR is null");
            return (Criteria) this;
        }

        public Criteria andFeenbrIsNotNull() {
            addCriterion("FEENBR is not null");
            return (Criteria) this;
        }

        public Criteria andFeenbrEqualTo(String value) {
            addCriterion("FEENBR =", value, "feenbr");
            return (Criteria) this;
        }

        public Criteria andFeenbrNotEqualTo(String value) {
            addCriterion("FEENBR <>", value, "feenbr");
            return (Criteria) this;
        }

        public Criteria andFeenbrGreaterThan(String value) {
            addCriterion("FEENBR >", value, "feenbr");
            return (Criteria) this;
        }

        public Criteria andFeenbrGreaterThanOrEqualTo(String value) {
            addCriterion("FEENBR >=", value, "feenbr");
            return (Criteria) this;
        }

        public Criteria andFeenbrLessThan(String value) {
            addCriterion("FEENBR <", value, "feenbr");
            return (Criteria) this;
        }

        public Criteria andFeenbrLessThanOrEqualTo(String value) {
            addCriterion("FEENBR <=", value, "feenbr");
            return (Criteria) this;
        }

        public Criteria andFeenbrLike(String value) {
            addCriterion("FEENBR like", value, "feenbr");
            return (Criteria) this;
        }

        public Criteria andFeenbrNotLike(String value) {
            addCriterion("FEENBR not like", value, "feenbr");
            return (Criteria) this;
        }

        public Criteria andFeenbrIn(List<String> values) {
            addCriterion("FEENBR in", values, "feenbr");
            return (Criteria) this;
        }

        public Criteria andFeenbrNotIn(List<String> values) {
            addCriterion("FEENBR not in", values, "feenbr");
            return (Criteria) this;
        }

        public Criteria andFeenbrBetween(String value1, String value2) {
            addCriterion("FEENBR between", value1, value2, "feenbr");
            return (Criteria) this;
        }

        public Criteria andFeenbrNotBetween(String value1, String value2) {
            addCriterion("FEENBR not between", value1, value2, "feenbr");
            return (Criteria) this;
        }

        public Criteria andSupfeenbrIsNull() {
            addCriterion("SUPFEENBR is null");
            return (Criteria) this;
        }

        public Criteria andSupfeenbrIsNotNull() {
            addCriterion("SUPFEENBR is not null");
            return (Criteria) this;
        }

        public Criteria andSupfeenbrEqualTo(String value) {
            addCriterion("SUPFEENBR =", value, "supfeenbr");
            return (Criteria) this;
        }

        public Criteria andSupfeenbrNotEqualTo(String value) {
            addCriterion("SUPFEENBR <>", value, "supfeenbr");
            return (Criteria) this;
        }

        public Criteria andSupfeenbrGreaterThan(String value) {
            addCriterion("SUPFEENBR >", value, "supfeenbr");
            return (Criteria) this;
        }

        public Criteria andSupfeenbrGreaterThanOrEqualTo(String value) {
            addCriterion("SUPFEENBR >=", value, "supfeenbr");
            return (Criteria) this;
        }

        public Criteria andSupfeenbrLessThan(String value) {
            addCriterion("SUPFEENBR <", value, "supfeenbr");
            return (Criteria) this;
        }

        public Criteria andSupfeenbrLessThanOrEqualTo(String value) {
            addCriterion("SUPFEENBR <=", value, "supfeenbr");
            return (Criteria) this;
        }

        public Criteria andSupfeenbrLike(String value) {
            addCriterion("SUPFEENBR like", value, "supfeenbr");
            return (Criteria) this;
        }

        public Criteria andSupfeenbrNotLike(String value) {
            addCriterion("SUPFEENBR not like", value, "supfeenbr");
            return (Criteria) this;
        }

        public Criteria andSupfeenbrIn(List<String> values) {
            addCriterion("SUPFEENBR in", values, "supfeenbr");
            return (Criteria) this;
        }

        public Criteria andSupfeenbrNotIn(List<String> values) {
            addCriterion("SUPFEENBR not in", values, "supfeenbr");
            return (Criteria) this;
        }

        public Criteria andSupfeenbrBetween(String value1, String value2) {
            addCriterion("SUPFEENBR between", value1, value2, "supfeenbr");
            return (Criteria) this;
        }

        public Criteria andSupfeenbrNotBetween(String value1, String value2) {
            addCriterion("SUPFEENBR not between", value1, value2, "supfeenbr");
            return (Criteria) this;
        }

        public Criteria andElecportflagIsNull() {
            addCriterion("ELECPORTFLAG is null");
            return (Criteria) this;
        }

        public Criteria andElecportflagIsNotNull() {
            addCriterion("ELECPORTFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andElecportflagEqualTo(String value) {
            addCriterion("ELECPORTFLAG =", value, "elecportflag");
            return (Criteria) this;
        }

        public Criteria andElecportflagNotEqualTo(String value) {
            addCriterion("ELECPORTFLAG <>", value, "elecportflag");
            return (Criteria) this;
        }

        public Criteria andElecportflagGreaterThan(String value) {
            addCriterion("ELECPORTFLAG >", value, "elecportflag");
            return (Criteria) this;
        }

        public Criteria andElecportflagGreaterThanOrEqualTo(String value) {
            addCriterion("ELECPORTFLAG >=", value, "elecportflag");
            return (Criteria) this;
        }

        public Criteria andElecportflagLessThan(String value) {
            addCriterion("ELECPORTFLAG <", value, "elecportflag");
            return (Criteria) this;
        }

        public Criteria andElecportflagLessThanOrEqualTo(String value) {
            addCriterion("ELECPORTFLAG <=", value, "elecportflag");
            return (Criteria) this;
        }

        public Criteria andElecportflagLike(String value) {
            addCriterion("ELECPORTFLAG like", value, "elecportflag");
            return (Criteria) this;
        }

        public Criteria andElecportflagNotLike(String value) {
            addCriterion("ELECPORTFLAG not like", value, "elecportflag");
            return (Criteria) this;
        }

        public Criteria andElecportflagIn(List<String> values) {
            addCriterion("ELECPORTFLAG in", values, "elecportflag");
            return (Criteria) this;
        }

        public Criteria andElecportflagNotIn(List<String> values) {
            addCriterion("ELECPORTFLAG not in", values, "elecportflag");
            return (Criteria) this;
        }

        public Criteria andElecportflagBetween(String value1, String value2) {
            addCriterion("ELECPORTFLAG between", value1, value2, "elecportflag");
            return (Criteria) this;
        }

        public Criteria andElecportflagNotBetween(String value1, String value2) {
            addCriterion("ELECPORTFLAG not between", value1, value2, "elecportflag");
            return (Criteria) this;
        }

        public Criteria andDatelastmaintIsNull() {
            addCriterion("DATELASTMAINT is null");
            return (Criteria) this;
        }

        public Criteria andDatelastmaintIsNotNull() {
            addCriterion("DATELASTMAINT is not null");
            return (Criteria) this;
        }

        public Criteria andDatelastmaintEqualTo(Date value) {
            addCriterion("DATELASTMAINT =", value, "datelastmaint");
            return (Criteria) this;
        }

        public Criteria andDatelastmaintNotEqualTo(Date value) {
            addCriterion("DATELASTMAINT <>", value, "datelastmaint");
            return (Criteria) this;
        }

        public Criteria andDatelastmaintGreaterThan(Date value) {
            addCriterion("DATELASTMAINT >", value, "datelastmaint");
            return (Criteria) this;
        }

        public Criteria andDatelastmaintGreaterThanOrEqualTo(Date value) {
            addCriterion("DATELASTMAINT >=", value, "datelastmaint");
            return (Criteria) this;
        }

        public Criteria andDatelastmaintLessThan(Date value) {
            addCriterion("DATELASTMAINT <", value, "datelastmaint");
            return (Criteria) this;
        }

        public Criteria andDatelastmaintLessThanOrEqualTo(Date value) {
            addCriterion("DATELASTMAINT <=", value, "datelastmaint");
            return (Criteria) this;
        }

        public Criteria andDatelastmaintIn(List<Date> values) {
            addCriterion("DATELASTMAINT in", values, "datelastmaint");
            return (Criteria) this;
        }

        public Criteria andDatelastmaintNotIn(List<Date> values) {
            addCriterion("DATELASTMAINT not in", values, "datelastmaint");
            return (Criteria) this;
        }

        public Criteria andDatelastmaintBetween(Date value1, Date value2) {
            addCriterion("DATELASTMAINT between", value1, value2, "datelastmaint");
            return (Criteria) this;
        }

        public Criteria andDatelastmaintNotBetween(Date value1, Date value2) {
            addCriterion("DATELASTMAINT not between", value1, value2, "datelastmaint");
            return (Criteria) this;
        }

        public Criteria andInteralflagIsNull() {
            addCriterion("INTERALFLAG is null");
            return (Criteria) this;
        }

        public Criteria andInteralflagIsNotNull() {
            addCriterion("INTERALFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andInteralflagEqualTo(String value) {
            addCriterion("INTERALFLAG =", value, "interalflag");
            return (Criteria) this;
        }

        public Criteria andInteralflagNotEqualTo(String value) {
            addCriterion("INTERALFLAG <>", value, "interalflag");
            return (Criteria) this;
        }

        public Criteria andInteralflagGreaterThan(String value) {
            addCriterion("INTERALFLAG >", value, "interalflag");
            return (Criteria) this;
        }

        public Criteria andInteralflagGreaterThanOrEqualTo(String value) {
            addCriterion("INTERALFLAG >=", value, "interalflag");
            return (Criteria) this;
        }

        public Criteria andInteralflagLessThan(String value) {
            addCriterion("INTERALFLAG <", value, "interalflag");
            return (Criteria) this;
        }

        public Criteria andInteralflagLessThanOrEqualTo(String value) {
            addCriterion("INTERALFLAG <=", value, "interalflag");
            return (Criteria) this;
        }

        public Criteria andInteralflagLike(String value) {
            addCriterion("INTERALFLAG like", value, "interalflag");
            return (Criteria) this;
        }

        public Criteria andInteralflagNotLike(String value) {
            addCriterion("INTERALFLAG not like", value, "interalflag");
            return (Criteria) this;
        }

        public Criteria andInteralflagIn(List<String> values) {
            addCriterion("INTERALFLAG in", values, "interalflag");
            return (Criteria) this;
        }

        public Criteria andInteralflagNotIn(List<String> values) {
            addCriterion("INTERALFLAG not in", values, "interalflag");
            return (Criteria) this;
        }

        public Criteria andInteralflagBetween(String value1, String value2) {
            addCriterion("INTERALFLAG between", value1, value2, "interalflag");
            return (Criteria) this;
        }

        public Criteria andInteralflagNotBetween(String value1, String value2) {
            addCriterion("INTERALFLAG not between", value1, value2, "interalflag");
            return (Criteria) this;
        }

        public Criteria andDeductamtIsNull() {
            addCriterion("DEDUCTAMT is null");
            return (Criteria) this;
        }

        public Criteria andDeductamtIsNotNull() {
            addCriterion("DEDUCTAMT is not null");
            return (Criteria) this;
        }

        public Criteria andDeductamtEqualTo(BigDecimal value) {
            addCriterion("DEDUCTAMT =", value, "deductamt");
            return (Criteria) this;
        }

        public Criteria andDeductamtNotEqualTo(BigDecimal value) {
            addCriterion("DEDUCTAMT <>", value, "deductamt");
            return (Criteria) this;
        }

        public Criteria andDeductamtGreaterThan(BigDecimal value) {
            addCriterion("DEDUCTAMT >", value, "deductamt");
            return (Criteria) this;
        }

        public Criteria andDeductamtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DEDUCTAMT >=", value, "deductamt");
            return (Criteria) this;
        }

        public Criteria andDeductamtLessThan(BigDecimal value) {
            addCriterion("DEDUCTAMT <", value, "deductamt");
            return (Criteria) this;
        }

        public Criteria andDeductamtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DEDUCTAMT <=", value, "deductamt");
            return (Criteria) this;
        }

        public Criteria andDeductamtIn(List<BigDecimal> values) {
            addCriterion("DEDUCTAMT in", values, "deductamt");
            return (Criteria) this;
        }

        public Criteria andDeductamtNotIn(List<BigDecimal> values) {
            addCriterion("DEDUCTAMT not in", values, "deductamt");
            return (Criteria) this;
        }

        public Criteria andDeductamtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DEDUCTAMT between", value1, value2, "deductamt");
            return (Criteria) this;
        }

        public Criteria andDeductamtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DEDUCTAMT not between", value1, value2, "deductamt");
            return (Criteria) this;
        }

        public Criteria andRealamtIsNull() {
            addCriterion("REALAMT is null");
            return (Criteria) this;
        }

        public Criteria andRealamtIsNotNull() {
            addCriterion("REALAMT is not null");
            return (Criteria) this;
        }

        public Criteria andRealamtEqualTo(BigDecimal value) {
            addCriterion("REALAMT =", value, "realamt");
            return (Criteria) this;
        }

        public Criteria andRealamtNotEqualTo(BigDecimal value) {
            addCriterion("REALAMT <>", value, "realamt");
            return (Criteria) this;
        }

        public Criteria andRealamtGreaterThan(BigDecimal value) {
            addCriterion("REALAMT >", value, "realamt");
            return (Criteria) this;
        }

        public Criteria andRealamtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("REALAMT >=", value, "realamt");
            return (Criteria) this;
        }

        public Criteria andRealamtLessThan(BigDecimal value) {
            addCriterion("REALAMT <", value, "realamt");
            return (Criteria) this;
        }

        public Criteria andRealamtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("REALAMT <=", value, "realamt");
            return (Criteria) this;
        }

        public Criteria andRealamtIn(List<BigDecimal> values) {
            addCriterion("REALAMT in", values, "realamt");
            return (Criteria) this;
        }

        public Criteria andRealamtNotIn(List<BigDecimal> values) {
            addCriterion("REALAMT not in", values, "realamt");
            return (Criteria) this;
        }

        public Criteria andRealamtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REALAMT between", value1, value2, "realamt");
            return (Criteria) this;
        }

        public Criteria andRealamtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REALAMT not between", value1, value2, "realamt");
            return (Criteria) this;
        }

        public Criteria andClientnoIsNull() {
            addCriterion("CLIENTNO is null");
            return (Criteria) this;
        }

        public Criteria andClientnoIsNotNull() {
            addCriterion("CLIENTNO is not null");
            return (Criteria) this;
        }

        public Criteria andClientnoEqualTo(String value) {
            addCriterion("CLIENTNO =", value, "clientno");
            return (Criteria) this;
        }

        public Criteria andClientnoNotEqualTo(String value) {
            addCriterion("CLIENTNO <>", value, "clientno");
            return (Criteria) this;
        }

        public Criteria andClientnoGreaterThan(String value) {
            addCriterion("CLIENTNO >", value, "clientno");
            return (Criteria) this;
        }

        public Criteria andClientnoGreaterThanOrEqualTo(String value) {
            addCriterion("CLIENTNO >=", value, "clientno");
            return (Criteria) this;
        }

        public Criteria andClientnoLessThan(String value) {
            addCriterion("CLIENTNO <", value, "clientno");
            return (Criteria) this;
        }

        public Criteria andClientnoLessThanOrEqualTo(String value) {
            addCriterion("CLIENTNO <=", value, "clientno");
            return (Criteria) this;
        }

        public Criteria andClientnoLike(String value) {
            addCriterion("CLIENTNO like", value, "clientno");
            return (Criteria) this;
        }

        public Criteria andClientnoNotLike(String value) {
            addCriterion("CLIENTNO not like", value, "clientno");
            return (Criteria) this;
        }

        public Criteria andClientnoIn(List<String> values) {
            addCriterion("CLIENTNO in", values, "clientno");
            return (Criteria) this;
        }

        public Criteria andClientnoNotIn(List<String> values) {
            addCriterion("CLIENTNO not in", values, "clientno");
            return (Criteria) this;
        }

        public Criteria andClientnoBetween(String value1, String value2) {
            addCriterion("CLIENTNO between", value1, value2, "clientno");
            return (Criteria) this;
        }

        public Criteria andClientnoNotBetween(String value1, String value2) {
            addCriterion("CLIENTNO not between", value1, value2, "clientno");
            return (Criteria) this;
        }

        public Criteria andBranchnoIsNull() {
            addCriterion("BRANCHNO is null");
            return (Criteria) this;
        }

        public Criteria andBranchnoIsNotNull() {
            addCriterion("BRANCHNO is not null");
            return (Criteria) this;
        }

        public Criteria andBranchnoEqualTo(String value) {
            addCriterion("BRANCHNO =", value, "branchno");
            return (Criteria) this;
        }

        public Criteria andBranchnoNotEqualTo(String value) {
            addCriterion("BRANCHNO <>", value, "branchno");
            return (Criteria) this;
        }

        public Criteria andBranchnoGreaterThan(String value) {
            addCriterion("BRANCHNO >", value, "branchno");
            return (Criteria) this;
        }

        public Criteria andBranchnoGreaterThanOrEqualTo(String value) {
            addCriterion("BRANCHNO >=", value, "branchno");
            return (Criteria) this;
        }

        public Criteria andBranchnoLessThan(String value) {
            addCriterion("BRANCHNO <", value, "branchno");
            return (Criteria) this;
        }

        public Criteria andBranchnoLessThanOrEqualTo(String value) {
            addCriterion("BRANCHNO <=", value, "branchno");
            return (Criteria) this;
        }

        public Criteria andBranchnoLike(String value) {
            addCriterion("BRANCHNO like", value, "branchno");
            return (Criteria) this;
        }

        public Criteria andBranchnoNotLike(String value) {
            addCriterion("BRANCHNO not like", value, "branchno");
            return (Criteria) this;
        }

        public Criteria andBranchnoIn(List<String> values) {
            addCriterion("BRANCHNO in", values, "branchno");
            return (Criteria) this;
        }

        public Criteria andBranchnoNotIn(List<String> values) {
            addCriterion("BRANCHNO not in", values, "branchno");
            return (Criteria) this;
        }

        public Criteria andBranchnoBetween(String value1, String value2) {
            addCriterion("BRANCHNO between", value1, value2, "branchno");
            return (Criteria) this;
        }

        public Criteria andBranchnoNotBetween(String value1, String value2) {
            addCriterion("BRANCHNO not between", value1, value2, "branchno");
            return (Criteria) this;
        }

        public Criteria andPointreacctdeptnbrIsNull() {
            addCriterion("POINTREACCTDEPTNBR is null");
            return (Criteria) this;
        }

        public Criteria andPointreacctdeptnbrIsNotNull() {
            addCriterion("POINTREACCTDEPTNBR is not null");
            return (Criteria) this;
        }

        public Criteria andPointreacctdeptnbrEqualTo(String value) {
            addCriterion("POINTREACCTDEPTNBR =", value, "pointreacctdeptnbr");
            return (Criteria) this;
        }

        public Criteria andPointreacctdeptnbrNotEqualTo(String value) {
            addCriterion("POINTREACCTDEPTNBR <>", value, "pointreacctdeptnbr");
            return (Criteria) this;
        }

        public Criteria andPointreacctdeptnbrGreaterThan(String value) {
            addCriterion("POINTREACCTDEPTNBR >", value, "pointreacctdeptnbr");
            return (Criteria) this;
        }

        public Criteria andPointreacctdeptnbrGreaterThanOrEqualTo(String value) {
            addCriterion("POINTREACCTDEPTNBR >=", value, "pointreacctdeptnbr");
            return (Criteria) this;
        }

        public Criteria andPointreacctdeptnbrLessThan(String value) {
            addCriterion("POINTREACCTDEPTNBR <", value, "pointreacctdeptnbr");
            return (Criteria) this;
        }

        public Criteria andPointreacctdeptnbrLessThanOrEqualTo(String value) {
            addCriterion("POINTREACCTDEPTNBR <=", value, "pointreacctdeptnbr");
            return (Criteria) this;
        }

        public Criteria andPointreacctdeptnbrLike(String value) {
            addCriterion("POINTREACCTDEPTNBR like", value, "pointreacctdeptnbr");
            return (Criteria) this;
        }

        public Criteria andPointreacctdeptnbrNotLike(String value) {
            addCriterion("POINTREACCTDEPTNBR not like", value, "pointreacctdeptnbr");
            return (Criteria) this;
        }

        public Criteria andPointreacctdeptnbrIn(List<String> values) {
            addCriterion("POINTREACCTDEPTNBR in", values, "pointreacctdeptnbr");
            return (Criteria) this;
        }

        public Criteria andPointreacctdeptnbrNotIn(List<String> values) {
            addCriterion("POINTREACCTDEPTNBR not in", values, "pointreacctdeptnbr");
            return (Criteria) this;
        }

        public Criteria andPointreacctdeptnbrBetween(String value1, String value2) {
            addCriterion("POINTREACCTDEPTNBR between", value1, value2, "pointreacctdeptnbr");
            return (Criteria) this;
        }

        public Criteria andPointreacctdeptnbrNotBetween(String value1, String value2) {
            addCriterion("POINTREACCTDEPTNBR not between", value1, value2, "pointreacctdeptnbr");
            return (Criteria) this;
        }

        public Criteria andRefunddeductamtIsNull() {
            addCriterion("REFUNDDEDUCTAMT is null");
            return (Criteria) this;
        }

        public Criteria andRefunddeductamtIsNotNull() {
            addCriterion("REFUNDDEDUCTAMT is not null");
            return (Criteria) this;
        }

        public Criteria andRefunddeductamtEqualTo(BigDecimal value) {
            addCriterion("REFUNDDEDUCTAMT =", value, "refunddeductamt");
            return (Criteria) this;
        }

        public Criteria andRefunddeductamtNotEqualTo(BigDecimal value) {
            addCriterion("REFUNDDEDUCTAMT <>", value, "refunddeductamt");
            return (Criteria) this;
        }

        public Criteria andRefunddeductamtGreaterThan(BigDecimal value) {
            addCriterion("REFUNDDEDUCTAMT >", value, "refunddeductamt");
            return (Criteria) this;
        }

        public Criteria andRefunddeductamtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("REFUNDDEDUCTAMT >=", value, "refunddeductamt");
            return (Criteria) this;
        }

        public Criteria andRefunddeductamtLessThan(BigDecimal value) {
            addCriterion("REFUNDDEDUCTAMT <", value, "refunddeductamt");
            return (Criteria) this;
        }

        public Criteria andRefunddeductamtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("REFUNDDEDUCTAMT <=", value, "refunddeductamt");
            return (Criteria) this;
        }

        public Criteria andRefunddeductamtIn(List<BigDecimal> values) {
            addCriterion("REFUNDDEDUCTAMT in", values, "refunddeductamt");
            return (Criteria) this;
        }

        public Criteria andRefunddeductamtNotIn(List<BigDecimal> values) {
            addCriterion("REFUNDDEDUCTAMT not in", values, "refunddeductamt");
            return (Criteria) this;
        }

        public Criteria andRefunddeductamtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REFUNDDEDUCTAMT between", value1, value2, "refunddeductamt");
            return (Criteria) this;
        }

        public Criteria andRefunddeductamtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REFUNDDEDUCTAMT not between", value1, value2, "refunddeductamt");
            return (Criteria) this;
        }

        public Criteria andUnrefunddeductamtIsNull() {
            addCriterion("UNREFUNDDEDUCTAMT is null");
            return (Criteria) this;
        }

        public Criteria andUnrefunddeductamtIsNotNull() {
            addCriterion("UNREFUNDDEDUCTAMT is not null");
            return (Criteria) this;
        }

        public Criteria andUnrefunddeductamtEqualTo(BigDecimal value) {
            addCriterion("UNREFUNDDEDUCTAMT =", value, "unrefunddeductamt");
            return (Criteria) this;
        }

        public Criteria andUnrefunddeductamtNotEqualTo(BigDecimal value) {
            addCriterion("UNREFUNDDEDUCTAMT <>", value, "unrefunddeductamt");
            return (Criteria) this;
        }

        public Criteria andUnrefunddeductamtGreaterThan(BigDecimal value) {
            addCriterion("UNREFUNDDEDUCTAMT >", value, "unrefunddeductamt");
            return (Criteria) this;
        }

        public Criteria andUnrefunddeductamtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("UNREFUNDDEDUCTAMT >=", value, "unrefunddeductamt");
            return (Criteria) this;
        }

        public Criteria andUnrefunddeductamtLessThan(BigDecimal value) {
            addCriterion("UNREFUNDDEDUCTAMT <", value, "unrefunddeductamt");
            return (Criteria) this;
        }

        public Criteria andUnrefunddeductamtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("UNREFUNDDEDUCTAMT <=", value, "unrefunddeductamt");
            return (Criteria) this;
        }

        public Criteria andUnrefunddeductamtIn(List<BigDecimal> values) {
            addCriterion("UNREFUNDDEDUCTAMT in", values, "unrefunddeductamt");
            return (Criteria) this;
        }

        public Criteria andUnrefunddeductamtNotIn(List<BigDecimal> values) {
            addCriterion("UNREFUNDDEDUCTAMT not in", values, "unrefunddeductamt");
            return (Criteria) this;
        }

        public Criteria andUnrefunddeductamtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UNREFUNDDEDUCTAMT between", value1, value2, "unrefunddeductamt");
            return (Criteria) this;
        }

        public Criteria andUnrefunddeductamtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UNREFUNDDEDUCTAMT not between", value1, value2, "unrefunddeductamt");
            return (Criteria) this;
        }

        public Criteria andReceiptamtIsNull() {
            addCriterion("RECEIPTAMT is null");
            return (Criteria) this;
        }

        public Criteria andReceiptamtIsNotNull() {
            addCriterion("RECEIPTAMT is not null");
            return (Criteria) this;
        }

        public Criteria andReceiptamtEqualTo(BigDecimal value) {
            addCriterion("RECEIPTAMT =", value, "receiptamt");
            return (Criteria) this;
        }

        public Criteria andReceiptamtNotEqualTo(BigDecimal value) {
            addCriterion("RECEIPTAMT <>", value, "receiptamt");
            return (Criteria) this;
        }

        public Criteria andReceiptamtGreaterThan(BigDecimal value) {
            addCriterion("RECEIPTAMT >", value, "receiptamt");
            return (Criteria) this;
        }

        public Criteria andReceiptamtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RECEIPTAMT >=", value, "receiptamt");
            return (Criteria) this;
        }

        public Criteria andReceiptamtLessThan(BigDecimal value) {
            addCriterion("RECEIPTAMT <", value, "receiptamt");
            return (Criteria) this;
        }

        public Criteria andReceiptamtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RECEIPTAMT <=", value, "receiptamt");
            return (Criteria) this;
        }

        public Criteria andReceiptamtIn(List<BigDecimal> values) {
            addCriterion("RECEIPTAMT in", values, "receiptamt");
            return (Criteria) this;
        }

        public Criteria andReceiptamtNotIn(List<BigDecimal> values) {
            addCriterion("RECEIPTAMT not in", values, "receiptamt");
            return (Criteria) this;
        }

        public Criteria andReceiptamtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RECEIPTAMT between", value1, value2, "receiptamt");
            return (Criteria) this;
        }

        public Criteria andReceiptamtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RECEIPTAMT not between", value1, value2, "receiptamt");
            return (Criteria) this;
        }

        public Criteria andCodetypcdIsNull() {
            addCriterion("CODETYPCD is null");
            return (Criteria) this;
        }

        public Criteria andCodetypcdIsNotNull() {
            addCriterion("CODETYPCD is not null");
            return (Criteria) this;
        }

        public Criteria andCodetypcdEqualTo(String value) {
            addCriterion("CODETYPCD =", value, "codetypcd");
            return (Criteria) this;
        }

        public Criteria andCodetypcdNotEqualTo(String value) {
            addCriterion("CODETYPCD <>", value, "codetypcd");
            return (Criteria) this;
        }

        public Criteria andCodetypcdGreaterThan(String value) {
            addCriterion("CODETYPCD >", value, "codetypcd");
            return (Criteria) this;
        }

        public Criteria andCodetypcdGreaterThanOrEqualTo(String value) {
            addCriterion("CODETYPCD >=", value, "codetypcd");
            return (Criteria) this;
        }

        public Criteria andCodetypcdLessThan(String value) {
            addCriterion("CODETYPCD <", value, "codetypcd");
            return (Criteria) this;
        }

        public Criteria andCodetypcdLessThanOrEqualTo(String value) {
            addCriterion("CODETYPCD <=", value, "codetypcd");
            return (Criteria) this;
        }

        public Criteria andCodetypcdLike(String value) {
            addCriterion("CODETYPCD like", value, "codetypcd");
            return (Criteria) this;
        }

        public Criteria andCodetypcdNotLike(String value) {
            addCriterion("CODETYPCD not like", value, "codetypcd");
            return (Criteria) this;
        }

        public Criteria andCodetypcdIn(List<String> values) {
            addCriterion("CODETYPCD in", values, "codetypcd");
            return (Criteria) this;
        }

        public Criteria andCodetypcdNotIn(List<String> values) {
            addCriterion("CODETYPCD not in", values, "codetypcd");
            return (Criteria) this;
        }

        public Criteria andCodetypcdBetween(String value1, String value2) {
            addCriterion("CODETYPCD between", value1, value2, "codetypcd");
            return (Criteria) this;
        }

        public Criteria andCodetypcdNotBetween(String value1, String value2) {
            addCriterion("CODETYPCD not between", value1, value2, "codetypcd");
            return (Criteria) this;
        }

        public Criteria andScancodemodeIsNull() {
            addCriterion("SCANCODEMODE is null");
            return (Criteria) this;
        }

        public Criteria andScancodemodeIsNotNull() {
            addCriterion("SCANCODEMODE is not null");
            return (Criteria) this;
        }

        public Criteria andScancodemodeEqualTo(String value) {
            addCriterion("SCANCODEMODE =", value, "scancodemode");
            return (Criteria) this;
        }

        public Criteria andScancodemodeNotEqualTo(String value) {
            addCriterion("SCANCODEMODE <>", value, "scancodemode");
            return (Criteria) this;
        }

        public Criteria andScancodemodeGreaterThan(String value) {
            addCriterion("SCANCODEMODE >", value, "scancodemode");
            return (Criteria) this;
        }

        public Criteria andScancodemodeGreaterThanOrEqualTo(String value) {
            addCriterion("SCANCODEMODE >=", value, "scancodemode");
            return (Criteria) this;
        }

        public Criteria andScancodemodeLessThan(String value) {
            addCriterion("SCANCODEMODE <", value, "scancodemode");
            return (Criteria) this;
        }

        public Criteria andScancodemodeLessThanOrEqualTo(String value) {
            addCriterion("SCANCODEMODE <=", value, "scancodemode");
            return (Criteria) this;
        }

        public Criteria andScancodemodeLike(String value) {
            addCriterion("SCANCODEMODE like", value, "scancodemode");
            return (Criteria) this;
        }

        public Criteria andScancodemodeNotLike(String value) {
            addCriterion("SCANCODEMODE not like", value, "scancodemode");
            return (Criteria) this;
        }

        public Criteria andScancodemodeIn(List<String> values) {
            addCriterion("SCANCODEMODE in", values, "scancodemode");
            return (Criteria) this;
        }

        public Criteria andScancodemodeNotIn(List<String> values) {
            addCriterion("SCANCODEMODE not in", values, "scancodemode");
            return (Criteria) this;
        }

        public Criteria andScancodemodeBetween(String value1, String value2) {
            addCriterion("SCANCODEMODE between", value1, value2, "scancodemode");
            return (Criteria) this;
        }

        public Criteria andScancodemodeNotBetween(String value1, String value2) {
            addCriterion("SCANCODEMODE not between", value1, value2, "scancodemode");
            return (Criteria) this;
        }

        public Criteria andDiscountableamtIsNull() {
            addCriterion("DISCOUNTABLEAMT is null");
            return (Criteria) this;
        }

        public Criteria andDiscountableamtIsNotNull() {
            addCriterion("DISCOUNTABLEAMT is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountableamtEqualTo(BigDecimal value) {
            addCriterion("DISCOUNTABLEAMT =", value, "discountableamt");
            return (Criteria) this;
        }

        public Criteria andDiscountableamtNotEqualTo(BigDecimal value) {
            addCriterion("DISCOUNTABLEAMT <>", value, "discountableamt");
            return (Criteria) this;
        }

        public Criteria andDiscountableamtGreaterThan(BigDecimal value) {
            addCriterion("DISCOUNTABLEAMT >", value, "discountableamt");
            return (Criteria) this;
        }

        public Criteria andDiscountableamtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DISCOUNTABLEAMT >=", value, "discountableamt");
            return (Criteria) this;
        }

        public Criteria andDiscountableamtLessThan(BigDecimal value) {
            addCriterion("DISCOUNTABLEAMT <", value, "discountableamt");
            return (Criteria) this;
        }

        public Criteria andDiscountableamtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DISCOUNTABLEAMT <=", value, "discountableamt");
            return (Criteria) this;
        }

        public Criteria andDiscountableamtIn(List<BigDecimal> values) {
            addCriterion("DISCOUNTABLEAMT in", values, "discountableamt");
            return (Criteria) this;
        }

        public Criteria andDiscountableamtNotIn(List<BigDecimal> values) {
            addCriterion("DISCOUNTABLEAMT not in", values, "discountableamt");
            return (Criteria) this;
        }

        public Criteria andDiscountableamtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DISCOUNTABLEAMT between", value1, value2, "discountableamt");
            return (Criteria) this;
        }

        public Criteria andDiscountableamtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DISCOUNTABLEAMT not between", value1, value2, "discountableamt");
            return (Criteria) this;
        }

        public Criteria andUndiscountableamtIsNull() {
            addCriterion("UNDISCOUNTABLEAMT is null");
            return (Criteria) this;
        }

        public Criteria andUndiscountableamtIsNotNull() {
            addCriterion("UNDISCOUNTABLEAMT is not null");
            return (Criteria) this;
        }

        public Criteria andUndiscountableamtEqualTo(BigDecimal value) {
            addCriterion("UNDISCOUNTABLEAMT =", value, "undiscountableamt");
            return (Criteria) this;
        }

        public Criteria andUndiscountableamtNotEqualTo(BigDecimal value) {
            addCriterion("UNDISCOUNTABLEAMT <>", value, "undiscountableamt");
            return (Criteria) this;
        }

        public Criteria andUndiscountableamtGreaterThan(BigDecimal value) {
            addCriterion("UNDISCOUNTABLEAMT >", value, "undiscountableamt");
            return (Criteria) this;
        }

        public Criteria andUndiscountableamtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("UNDISCOUNTABLEAMT >=", value, "undiscountableamt");
            return (Criteria) this;
        }

        public Criteria andUndiscountableamtLessThan(BigDecimal value) {
            addCriterion("UNDISCOUNTABLEAMT <", value, "undiscountableamt");
            return (Criteria) this;
        }

        public Criteria andUndiscountableamtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("UNDISCOUNTABLEAMT <=", value, "undiscountableamt");
            return (Criteria) this;
        }

        public Criteria andUndiscountableamtIn(List<BigDecimal> values) {
            addCriterion("UNDISCOUNTABLEAMT in", values, "undiscountableamt");
            return (Criteria) this;
        }

        public Criteria andUndiscountableamtNotIn(List<BigDecimal> values) {
            addCriterion("UNDISCOUNTABLEAMT not in", values, "undiscountableamt");
            return (Criteria) this;
        }

        public Criteria andUndiscountableamtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UNDISCOUNTABLEAMT between", value1, value2, "undiscountableamt");
            return (Criteria) this;
        }

        public Criteria andUndiscountableamtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UNDISCOUNTABLEAMT not between", value1, value2, "undiscountableamt");
            return (Criteria) this;
        }

        public Criteria andThirdmernbrIsNull() {
            addCriterion("THIRDMERNBR is null");
            return (Criteria) this;
        }

        public Criteria andThirdmernbrIsNotNull() {
            addCriterion("THIRDMERNBR is not null");
            return (Criteria) this;
        }

        public Criteria andThirdmernbrEqualTo(String value) {
            addCriterion("THIRDMERNBR =", value, "thirdmernbr");
            return (Criteria) this;
        }

        public Criteria andThirdmernbrNotEqualTo(String value) {
            addCriterion("THIRDMERNBR <>", value, "thirdmernbr");
            return (Criteria) this;
        }

        public Criteria andThirdmernbrGreaterThan(String value) {
            addCriterion("THIRDMERNBR >", value, "thirdmernbr");
            return (Criteria) this;
        }

        public Criteria andThirdmernbrGreaterThanOrEqualTo(String value) {
            addCriterion("THIRDMERNBR >=", value, "thirdmernbr");
            return (Criteria) this;
        }

        public Criteria andThirdmernbrLessThan(String value) {
            addCriterion("THIRDMERNBR <", value, "thirdmernbr");
            return (Criteria) this;
        }

        public Criteria andThirdmernbrLessThanOrEqualTo(String value) {
            addCriterion("THIRDMERNBR <=", value, "thirdmernbr");
            return (Criteria) this;
        }

        public Criteria andThirdmernbrLike(String value) {
            addCriterion("THIRDMERNBR like", value, "thirdmernbr");
            return (Criteria) this;
        }

        public Criteria andThirdmernbrNotLike(String value) {
            addCriterion("THIRDMERNBR not like", value, "thirdmernbr");
            return (Criteria) this;
        }

        public Criteria andThirdmernbrIn(List<String> values) {
            addCriterion("THIRDMERNBR in", values, "thirdmernbr");
            return (Criteria) this;
        }

        public Criteria andThirdmernbrNotIn(List<String> values) {
            addCriterion("THIRDMERNBR not in", values, "thirdmernbr");
            return (Criteria) this;
        }

        public Criteria andThirdmernbrBetween(String value1, String value2) {
            addCriterion("THIRDMERNBR between", value1, value2, "thirdmernbr");
            return (Criteria) this;
        }

        public Criteria andThirdmernbrNotBetween(String value1, String value2) {
            addCriterion("THIRDMERNBR not between", value1, value2, "thirdmernbr");
            return (Criteria) this;
        }

        public Criteria andWechatproxymernbrIsNull() {
            addCriterion("WECHATPROXYMERNBR is null");
            return (Criteria) this;
        }

        public Criteria andWechatproxymernbrIsNotNull() {
            addCriterion("WECHATPROXYMERNBR is not null");
            return (Criteria) this;
        }

        public Criteria andWechatproxymernbrEqualTo(String value) {
            addCriterion("WECHATPROXYMERNBR =", value, "wechatproxymernbr");
            return (Criteria) this;
        }

        public Criteria andWechatproxymernbrNotEqualTo(String value) {
            addCriterion("WECHATPROXYMERNBR <>", value, "wechatproxymernbr");
            return (Criteria) this;
        }

        public Criteria andWechatproxymernbrGreaterThan(String value) {
            addCriterion("WECHATPROXYMERNBR >", value, "wechatproxymernbr");
            return (Criteria) this;
        }

        public Criteria andWechatproxymernbrGreaterThanOrEqualTo(String value) {
            addCriterion("WECHATPROXYMERNBR >=", value, "wechatproxymernbr");
            return (Criteria) this;
        }

        public Criteria andWechatproxymernbrLessThan(String value) {
            addCriterion("WECHATPROXYMERNBR <", value, "wechatproxymernbr");
            return (Criteria) this;
        }

        public Criteria andWechatproxymernbrLessThanOrEqualTo(String value) {
            addCriterion("WECHATPROXYMERNBR <=", value, "wechatproxymernbr");
            return (Criteria) this;
        }

        public Criteria andWechatproxymernbrLike(String value) {
            addCriterion("WECHATPROXYMERNBR like", value, "wechatproxymernbr");
            return (Criteria) this;
        }

        public Criteria andWechatproxymernbrNotLike(String value) {
            addCriterion("WECHATPROXYMERNBR not like", value, "wechatproxymernbr");
            return (Criteria) this;
        }

        public Criteria andWechatproxymernbrIn(List<String> values) {
            addCriterion("WECHATPROXYMERNBR in", values, "wechatproxymernbr");
            return (Criteria) this;
        }

        public Criteria andWechatproxymernbrNotIn(List<String> values) {
            addCriterion("WECHATPROXYMERNBR not in", values, "wechatproxymernbr");
            return (Criteria) this;
        }

        public Criteria andWechatproxymernbrBetween(String value1, String value2) {
            addCriterion("WECHATPROXYMERNBR between", value1, value2, "wechatproxymernbr");
            return (Criteria) this;
        }

        public Criteria andWechatproxymernbrNotBetween(String value1, String value2) {
            addCriterion("WECHATPROXYMERNBR not between", value1, value2, "wechatproxymernbr");
            return (Criteria) this;
        }

        public Criteria andMernbrextendIsNull() {
            addCriterion("MERNBREXTEND is null");
            return (Criteria) this;
        }

        public Criteria andMernbrextendIsNotNull() {
            addCriterion("MERNBREXTEND is not null");
            return (Criteria) this;
        }

        public Criteria andMernbrextendEqualTo(String value) {
            addCriterion("MERNBREXTEND =", value, "mernbrextend");
            return (Criteria) this;
        }

        public Criteria andMernbrextendNotEqualTo(String value) {
            addCriterion("MERNBREXTEND <>", value, "mernbrextend");
            return (Criteria) this;
        }

        public Criteria andMernbrextendGreaterThan(String value) {
            addCriterion("MERNBREXTEND >", value, "mernbrextend");
            return (Criteria) this;
        }

        public Criteria andMernbrextendGreaterThanOrEqualTo(String value) {
            addCriterion("MERNBREXTEND >=", value, "mernbrextend");
            return (Criteria) this;
        }

        public Criteria andMernbrextendLessThan(String value) {
            addCriterion("MERNBREXTEND <", value, "mernbrextend");
            return (Criteria) this;
        }

        public Criteria andMernbrextendLessThanOrEqualTo(String value) {
            addCriterion("MERNBREXTEND <=", value, "mernbrextend");
            return (Criteria) this;
        }

        public Criteria andMernbrextendLike(String value) {
            addCriterion("MERNBREXTEND like", value, "mernbrextend");
            return (Criteria) this;
        }

        public Criteria andMernbrextendNotLike(String value) {
            addCriterion("MERNBREXTEND not like", value, "mernbrextend");
            return (Criteria) this;
        }

        public Criteria andMernbrextendIn(List<String> values) {
            addCriterion("MERNBREXTEND in", values, "mernbrextend");
            return (Criteria) this;
        }

        public Criteria andMernbrextendNotIn(List<String> values) {
            addCriterion("MERNBREXTEND not in", values, "mernbrextend");
            return (Criteria) this;
        }

        public Criteria andMernbrextendBetween(String value1, String value2) {
            addCriterion("MERNBREXTEND between", value1, value2, "mernbrextend");
            return (Criteria) this;
        }

        public Criteria andMernbrextendNotBetween(String value1, String value2) {
            addCriterion("MERNBREXTEND not between", value1, value2, "mernbrextend");
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