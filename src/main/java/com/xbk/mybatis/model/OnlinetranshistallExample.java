package com.xbk.mybatis.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OnlinetranshistallExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OnlinetranshistallExample() {
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

        public Criteria andDownsystransnbrIsNull() {
            addCriterion("DOWNSYSTRANSNBR is null");
            return (Criteria) this;
        }

        public Criteria andDownsystransnbrIsNotNull() {
            addCriterion("DOWNSYSTRANSNBR is not null");
            return (Criteria) this;
        }

        public Criteria andDownsystransnbrEqualTo(String value) {
            addCriterion("DOWNSYSTRANSNBR =", value, "downsystransnbr");
            return (Criteria) this;
        }

        public Criteria andDownsystransnbrNotEqualTo(String value) {
            addCriterion("DOWNSYSTRANSNBR <>", value, "downsystransnbr");
            return (Criteria) this;
        }

        public Criteria andDownsystransnbrGreaterThan(String value) {
            addCriterion("DOWNSYSTRANSNBR >", value, "downsystransnbr");
            return (Criteria) this;
        }

        public Criteria andDownsystransnbrGreaterThanOrEqualTo(String value) {
            addCriterion("DOWNSYSTRANSNBR >=", value, "downsystransnbr");
            return (Criteria) this;
        }

        public Criteria andDownsystransnbrLessThan(String value) {
            addCriterion("DOWNSYSTRANSNBR <", value, "downsystransnbr");
            return (Criteria) this;
        }

        public Criteria andDownsystransnbrLessThanOrEqualTo(String value) {
            addCriterion("DOWNSYSTRANSNBR <=", value, "downsystransnbr");
            return (Criteria) this;
        }

        public Criteria andDownsystransnbrLike(String value) {
            addCriterion("DOWNSYSTRANSNBR like", value, "downsystransnbr");
            return (Criteria) this;
        }

        public Criteria andDownsystransnbrNotLike(String value) {
            addCriterion("DOWNSYSTRANSNBR not like", value, "downsystransnbr");
            return (Criteria) this;
        }

        public Criteria andDownsystransnbrIn(List<String> values) {
            addCriterion("DOWNSYSTRANSNBR in", values, "downsystransnbr");
            return (Criteria) this;
        }

        public Criteria andDownsystransnbrNotIn(List<String> values) {
            addCriterion("DOWNSYSTRANSNBR not in", values, "downsystransnbr");
            return (Criteria) this;
        }

        public Criteria andDownsystransnbrBetween(String value1, String value2) {
            addCriterion("DOWNSYSTRANSNBR between", value1, value2, "downsystransnbr");
            return (Criteria) this;
        }

        public Criteria andDownsystransnbrNotBetween(String value1, String value2) {
            addCriterion("DOWNSYSTRANSNBR not between", value1, value2, "downsystransnbr");
            return (Criteria) this;
        }

        public Criteria andChannelnbrIsNull() {
            addCriterion("CHANNELNBR is null");
            return (Criteria) this;
        }

        public Criteria andChannelnbrIsNotNull() {
            addCriterion("CHANNELNBR is not null");
            return (Criteria) this;
        }

        public Criteria andChannelnbrEqualTo(String value) {
            addCriterion("CHANNELNBR =", value, "channelnbr");
            return (Criteria) this;
        }

        public Criteria andChannelnbrNotEqualTo(String value) {
            addCriterion("CHANNELNBR <>", value, "channelnbr");
            return (Criteria) this;
        }

        public Criteria andChannelnbrGreaterThan(String value) {
            addCriterion("CHANNELNBR >", value, "channelnbr");
            return (Criteria) this;
        }

        public Criteria andChannelnbrGreaterThanOrEqualTo(String value) {
            addCriterion("CHANNELNBR >=", value, "channelnbr");
            return (Criteria) this;
        }

        public Criteria andChannelnbrLessThan(String value) {
            addCriterion("CHANNELNBR <", value, "channelnbr");
            return (Criteria) this;
        }

        public Criteria andChannelnbrLessThanOrEqualTo(String value) {
            addCriterion("CHANNELNBR <=", value, "channelnbr");
            return (Criteria) this;
        }

        public Criteria andChannelnbrLike(String value) {
            addCriterion("CHANNELNBR like", value, "channelnbr");
            return (Criteria) this;
        }

        public Criteria andChannelnbrNotLike(String value) {
            addCriterion("CHANNELNBR not like", value, "channelnbr");
            return (Criteria) this;
        }

        public Criteria andChannelnbrIn(List<String> values) {
            addCriterion("CHANNELNBR in", values, "channelnbr");
            return (Criteria) this;
        }

        public Criteria andChannelnbrNotIn(List<String> values) {
            addCriterion("CHANNELNBR not in", values, "channelnbr");
            return (Criteria) this;
        }

        public Criteria andChannelnbrBetween(String value1, String value2) {
            addCriterion("CHANNELNBR between", value1, value2, "channelnbr");
            return (Criteria) this;
        }

        public Criteria andChannelnbrNotBetween(String value1, String value2) {
            addCriterion("CHANNELNBR not between", value1, value2, "channelnbr");
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

        public Criteria andDownsysdateIsNull() {
            addCriterion("DOWNSYSDATE is null");
            return (Criteria) this;
        }

        public Criteria andDownsysdateIsNotNull() {
            addCriterion("DOWNSYSDATE is not null");
            return (Criteria) this;
        }

        public Criteria andDownsysdateEqualTo(Date value) {
            addCriterion("DOWNSYSDATE =", value, "downsysdate");
            return (Criteria) this;
        }

        public Criteria andDownsysdateNotEqualTo(Date value) {
            addCriterion("DOWNSYSDATE <>", value, "downsysdate");
            return (Criteria) this;
        }

        public Criteria andDownsysdateGreaterThan(Date value) {
            addCriterion("DOWNSYSDATE >", value, "downsysdate");
            return (Criteria) this;
        }

        public Criteria andDownsysdateGreaterThanOrEqualTo(Date value) {
            addCriterion("DOWNSYSDATE >=", value, "downsysdate");
            return (Criteria) this;
        }

        public Criteria andDownsysdateLessThan(Date value) {
            addCriterion("DOWNSYSDATE <", value, "downsysdate");
            return (Criteria) this;
        }

        public Criteria andDownsysdateLessThanOrEqualTo(Date value) {
            addCriterion("DOWNSYSDATE <=", value, "downsysdate");
            return (Criteria) this;
        }

        public Criteria andDownsysdateIn(List<Date> values) {
            addCriterion("DOWNSYSDATE in", values, "downsysdate");
            return (Criteria) this;
        }

        public Criteria andDownsysdateNotIn(List<Date> values) {
            addCriterion("DOWNSYSDATE not in", values, "downsysdate");
            return (Criteria) this;
        }

        public Criteria andDownsysdateBetween(Date value1, Date value2) {
            addCriterion("DOWNSYSDATE between", value1, value2, "downsysdate");
            return (Criteria) this;
        }

        public Criteria andDownsysdateNotBetween(Date value1, Date value2) {
            addCriterion("DOWNSYSDATE not between", value1, value2, "downsysdate");
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

        public Criteria andTransamt3IsNull() {
            addCriterion("TRANSAMT3 is null");
            return (Criteria) this;
        }

        public Criteria andTransamt3IsNotNull() {
            addCriterion("TRANSAMT3 is not null");
            return (Criteria) this;
        }

        public Criteria andTransamt3EqualTo(BigDecimal value) {
            addCriterion("TRANSAMT3 =", value, "transamt3");
            return (Criteria) this;
        }

        public Criteria andTransamt3NotEqualTo(BigDecimal value) {
            addCriterion("TRANSAMT3 <>", value, "transamt3");
            return (Criteria) this;
        }

        public Criteria andTransamt3GreaterThan(BigDecimal value) {
            addCriterion("TRANSAMT3 >", value, "transamt3");
            return (Criteria) this;
        }

        public Criteria andTransamt3GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TRANSAMT3 >=", value, "transamt3");
            return (Criteria) this;
        }

        public Criteria andTransamt3LessThan(BigDecimal value) {
            addCriterion("TRANSAMT3 <", value, "transamt3");
            return (Criteria) this;
        }

        public Criteria andTransamt3LessThanOrEqualTo(BigDecimal value) {
            addCriterion("TRANSAMT3 <=", value, "transamt3");
            return (Criteria) this;
        }

        public Criteria andTransamt3In(List<BigDecimal> values) {
            addCriterion("TRANSAMT3 in", values, "transamt3");
            return (Criteria) this;
        }

        public Criteria andTransamt3NotIn(List<BigDecimal> values) {
            addCriterion("TRANSAMT3 not in", values, "transamt3");
            return (Criteria) this;
        }

        public Criteria andTransamt3Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRANSAMT3 between", value1, value2, "transamt3");
            return (Criteria) this;
        }

        public Criteria andTransamt3NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRANSAMT3 not between", value1, value2, "transamt3");
            return (Criteria) this;
        }

        public Criteria andTransamt4IsNull() {
            addCriterion("TRANSAMT4 is null");
            return (Criteria) this;
        }

        public Criteria andTransamt4IsNotNull() {
            addCriterion("TRANSAMT4 is not null");
            return (Criteria) this;
        }

        public Criteria andTransamt4EqualTo(BigDecimal value) {
            addCriterion("TRANSAMT4 =", value, "transamt4");
            return (Criteria) this;
        }

        public Criteria andTransamt4NotEqualTo(BigDecimal value) {
            addCriterion("TRANSAMT4 <>", value, "transamt4");
            return (Criteria) this;
        }

        public Criteria andTransamt4GreaterThan(BigDecimal value) {
            addCriterion("TRANSAMT4 >", value, "transamt4");
            return (Criteria) this;
        }

        public Criteria andTransamt4GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TRANSAMT4 >=", value, "transamt4");
            return (Criteria) this;
        }

        public Criteria andTransamt4LessThan(BigDecimal value) {
            addCriterion("TRANSAMT4 <", value, "transamt4");
            return (Criteria) this;
        }

        public Criteria andTransamt4LessThanOrEqualTo(BigDecimal value) {
            addCriterion("TRANSAMT4 <=", value, "transamt4");
            return (Criteria) this;
        }

        public Criteria andTransamt4In(List<BigDecimal> values) {
            addCriterion("TRANSAMT4 in", values, "transamt4");
            return (Criteria) this;
        }

        public Criteria andTransamt4NotIn(List<BigDecimal> values) {
            addCriterion("TRANSAMT4 not in", values, "transamt4");
            return (Criteria) this;
        }

        public Criteria andTransamt4Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRANSAMT4 between", value1, value2, "transamt4");
            return (Criteria) this;
        }

        public Criteria andTransamt4NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRANSAMT4 not between", value1, value2, "transamt4");
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

        public Criteria andDownsysrespcodeIsNull() {
            addCriterion("DOWNSYSRESPCODE is null");
            return (Criteria) this;
        }

        public Criteria andDownsysrespcodeIsNotNull() {
            addCriterion("DOWNSYSRESPCODE is not null");
            return (Criteria) this;
        }

        public Criteria andDownsysrespcodeEqualTo(String value) {
            addCriterion("DOWNSYSRESPCODE =", value, "downsysrespcode");
            return (Criteria) this;
        }

        public Criteria andDownsysrespcodeNotEqualTo(String value) {
            addCriterion("DOWNSYSRESPCODE <>", value, "downsysrespcode");
            return (Criteria) this;
        }

        public Criteria andDownsysrespcodeGreaterThan(String value) {
            addCriterion("DOWNSYSRESPCODE >", value, "downsysrespcode");
            return (Criteria) this;
        }

        public Criteria andDownsysrespcodeGreaterThanOrEqualTo(String value) {
            addCriterion("DOWNSYSRESPCODE >=", value, "downsysrespcode");
            return (Criteria) this;
        }

        public Criteria andDownsysrespcodeLessThan(String value) {
            addCriterion("DOWNSYSRESPCODE <", value, "downsysrespcode");
            return (Criteria) this;
        }

        public Criteria andDownsysrespcodeLessThanOrEqualTo(String value) {
            addCriterion("DOWNSYSRESPCODE <=", value, "downsysrespcode");
            return (Criteria) this;
        }

        public Criteria andDownsysrespcodeLike(String value) {
            addCriterion("DOWNSYSRESPCODE like", value, "downsysrespcode");
            return (Criteria) this;
        }

        public Criteria andDownsysrespcodeNotLike(String value) {
            addCriterion("DOWNSYSRESPCODE not like", value, "downsysrespcode");
            return (Criteria) this;
        }

        public Criteria andDownsysrespcodeIn(List<String> values) {
            addCriterion("DOWNSYSRESPCODE in", values, "downsysrespcode");
            return (Criteria) this;
        }

        public Criteria andDownsysrespcodeNotIn(List<String> values) {
            addCriterion("DOWNSYSRESPCODE not in", values, "downsysrespcode");
            return (Criteria) this;
        }

        public Criteria andDownsysrespcodeBetween(String value1, String value2) {
            addCriterion("DOWNSYSRESPCODE between", value1, value2, "downsysrespcode");
            return (Criteria) this;
        }

        public Criteria andDownsysrespcodeNotBetween(String value1, String value2) {
            addCriterion("DOWNSYSRESPCODE not between", value1, value2, "downsysrespcode");
            return (Criteria) this;
        }

        public Criteria andRespcodeIsNull() {
            addCriterion("RESPCODE is null");
            return (Criteria) this;
        }

        public Criteria andRespcodeIsNotNull() {
            addCriterion("RESPCODE is not null");
            return (Criteria) this;
        }

        public Criteria andRespcodeEqualTo(String value) {
            addCriterion("RESPCODE =", value, "respcode");
            return (Criteria) this;
        }

        public Criteria andRespcodeNotEqualTo(String value) {
            addCriterion("RESPCODE <>", value, "respcode");
            return (Criteria) this;
        }

        public Criteria andRespcodeGreaterThan(String value) {
            addCriterion("RESPCODE >", value, "respcode");
            return (Criteria) this;
        }

        public Criteria andRespcodeGreaterThanOrEqualTo(String value) {
            addCriterion("RESPCODE >=", value, "respcode");
            return (Criteria) this;
        }

        public Criteria andRespcodeLessThan(String value) {
            addCriterion("RESPCODE <", value, "respcode");
            return (Criteria) this;
        }

        public Criteria andRespcodeLessThanOrEqualTo(String value) {
            addCriterion("RESPCODE <=", value, "respcode");
            return (Criteria) this;
        }

        public Criteria andRespcodeLike(String value) {
            addCriterion("RESPCODE like", value, "respcode");
            return (Criteria) this;
        }

        public Criteria andRespcodeNotLike(String value) {
            addCriterion("RESPCODE not like", value, "respcode");
            return (Criteria) this;
        }

        public Criteria andRespcodeIn(List<String> values) {
            addCriterion("RESPCODE in", values, "respcode");
            return (Criteria) this;
        }

        public Criteria andRespcodeNotIn(List<String> values) {
            addCriterion("RESPCODE not in", values, "respcode");
            return (Criteria) this;
        }

        public Criteria andRespcodeBetween(String value1, String value2) {
            addCriterion("RESPCODE between", value1, value2, "respcode");
            return (Criteria) this;
        }

        public Criteria andRespcodeNotBetween(String value1, String value2) {
            addCriterion("RESPCODE not between", value1, value2, "respcode");
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

        public Criteria andDownsysdatetimeIsNull() {
            addCriterion("DOWNSYSDATETIME is null");
            return (Criteria) this;
        }

        public Criteria andDownsysdatetimeIsNotNull() {
            addCriterion("DOWNSYSDATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andDownsysdatetimeEqualTo(Date value) {
            addCriterion("DOWNSYSDATETIME =", value, "downsysdatetime");
            return (Criteria) this;
        }

        public Criteria andDownsysdatetimeNotEqualTo(Date value) {
            addCriterion("DOWNSYSDATETIME <>", value, "downsysdatetime");
            return (Criteria) this;
        }

        public Criteria andDownsysdatetimeGreaterThan(Date value) {
            addCriterion("DOWNSYSDATETIME >", value, "downsysdatetime");
            return (Criteria) this;
        }

        public Criteria andDownsysdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("DOWNSYSDATETIME >=", value, "downsysdatetime");
            return (Criteria) this;
        }

        public Criteria andDownsysdatetimeLessThan(Date value) {
            addCriterion("DOWNSYSDATETIME <", value, "downsysdatetime");
            return (Criteria) this;
        }

        public Criteria andDownsysdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("DOWNSYSDATETIME <=", value, "downsysdatetime");
            return (Criteria) this;
        }

        public Criteria andDownsysdatetimeIn(List<Date> values) {
            addCriterion("DOWNSYSDATETIME in", values, "downsysdatetime");
            return (Criteria) this;
        }

        public Criteria andDownsysdatetimeNotIn(List<Date> values) {
            addCriterion("DOWNSYSDATETIME not in", values, "downsysdatetime");
            return (Criteria) this;
        }

        public Criteria andDownsysdatetimeBetween(Date value1, Date value2) {
            addCriterion("DOWNSYSDATETIME between", value1, value2, "downsysdatetime");
            return (Criteria) this;
        }

        public Criteria andDownsysdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("DOWNSYSDATETIME not between", value1, value2, "downsysdatetime");
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

        public Criteria andSignnbrIsNull() {
            addCriterion("SIGNNBR is null");
            return (Criteria) this;
        }

        public Criteria andSignnbrIsNotNull() {
            addCriterion("SIGNNBR is not null");
            return (Criteria) this;
        }

        public Criteria andSignnbrEqualTo(String value) {
            addCriterion("SIGNNBR =", value, "signnbr");
            return (Criteria) this;
        }

        public Criteria andSignnbrNotEqualTo(String value) {
            addCriterion("SIGNNBR <>", value, "signnbr");
            return (Criteria) this;
        }

        public Criteria andSignnbrGreaterThan(String value) {
            addCriterion("SIGNNBR >", value, "signnbr");
            return (Criteria) this;
        }

        public Criteria andSignnbrGreaterThanOrEqualTo(String value) {
            addCriterion("SIGNNBR >=", value, "signnbr");
            return (Criteria) this;
        }

        public Criteria andSignnbrLessThan(String value) {
            addCriterion("SIGNNBR <", value, "signnbr");
            return (Criteria) this;
        }

        public Criteria andSignnbrLessThanOrEqualTo(String value) {
            addCriterion("SIGNNBR <=", value, "signnbr");
            return (Criteria) this;
        }

        public Criteria andSignnbrLike(String value) {
            addCriterion("SIGNNBR like", value, "signnbr");
            return (Criteria) this;
        }

        public Criteria andSignnbrNotLike(String value) {
            addCriterion("SIGNNBR not like", value, "signnbr");
            return (Criteria) this;
        }

        public Criteria andSignnbrIn(List<String> values) {
            addCriterion("SIGNNBR in", values, "signnbr");
            return (Criteria) this;
        }

        public Criteria andSignnbrNotIn(List<String> values) {
            addCriterion("SIGNNBR not in", values, "signnbr");
            return (Criteria) this;
        }

        public Criteria andSignnbrBetween(String value1, String value2) {
            addCriterion("SIGNNBR between", value1, value2, "signnbr");
            return (Criteria) this;
        }

        public Criteria andSignnbrNotBetween(String value1, String value2) {
            addCriterion("SIGNNBR not between", value1, value2, "signnbr");
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

        public Criteria andConfirmedamtIsNull() {
            addCriterion("CONFIRMEDAMT is null");
            return (Criteria) this;
        }

        public Criteria andConfirmedamtIsNotNull() {
            addCriterion("CONFIRMEDAMT is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmedamtEqualTo(BigDecimal value) {
            addCriterion("CONFIRMEDAMT =", value, "confirmedamt");
            return (Criteria) this;
        }

        public Criteria andConfirmedamtNotEqualTo(BigDecimal value) {
            addCriterion("CONFIRMEDAMT <>", value, "confirmedamt");
            return (Criteria) this;
        }

        public Criteria andConfirmedamtGreaterThan(BigDecimal value) {
            addCriterion("CONFIRMEDAMT >", value, "confirmedamt");
            return (Criteria) this;
        }

        public Criteria andConfirmedamtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CONFIRMEDAMT >=", value, "confirmedamt");
            return (Criteria) this;
        }

        public Criteria andConfirmedamtLessThan(BigDecimal value) {
            addCriterion("CONFIRMEDAMT <", value, "confirmedamt");
            return (Criteria) this;
        }

        public Criteria andConfirmedamtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CONFIRMEDAMT <=", value, "confirmedamt");
            return (Criteria) this;
        }

        public Criteria andConfirmedamtIn(List<BigDecimal> values) {
            addCriterion("CONFIRMEDAMT in", values, "confirmedamt");
            return (Criteria) this;
        }

        public Criteria andConfirmedamtNotIn(List<BigDecimal> values) {
            addCriterion("CONFIRMEDAMT not in", values, "confirmedamt");
            return (Criteria) this;
        }

        public Criteria andConfirmedamtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CONFIRMEDAMT between", value1, value2, "confirmedamt");
            return (Criteria) this;
        }

        public Criteria andConfirmedamtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CONFIRMEDAMT not between", value1, value2, "confirmedamt");
            return (Criteria) this;
        }

        public Criteria andConfirmedcountIsNull() {
            addCriterion("CONFIRMEDCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andConfirmedcountIsNotNull() {
            addCriterion("CONFIRMEDCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmedcountEqualTo(BigDecimal value) {
            addCriterion("CONFIRMEDCOUNT =", value, "confirmedcount");
            return (Criteria) this;
        }

        public Criteria andConfirmedcountNotEqualTo(BigDecimal value) {
            addCriterion("CONFIRMEDCOUNT <>", value, "confirmedcount");
            return (Criteria) this;
        }

        public Criteria andConfirmedcountGreaterThan(BigDecimal value) {
            addCriterion("CONFIRMEDCOUNT >", value, "confirmedcount");
            return (Criteria) this;
        }

        public Criteria andConfirmedcountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CONFIRMEDCOUNT >=", value, "confirmedcount");
            return (Criteria) this;
        }

        public Criteria andConfirmedcountLessThan(BigDecimal value) {
            addCriterion("CONFIRMEDCOUNT <", value, "confirmedcount");
            return (Criteria) this;
        }

        public Criteria andConfirmedcountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CONFIRMEDCOUNT <=", value, "confirmedcount");
            return (Criteria) this;
        }

        public Criteria andConfirmedcountIn(List<BigDecimal> values) {
            addCriterion("CONFIRMEDCOUNT in", values, "confirmedcount");
            return (Criteria) this;
        }

        public Criteria andConfirmedcountNotIn(List<BigDecimal> values) {
            addCriterion("CONFIRMEDCOUNT not in", values, "confirmedcount");
            return (Criteria) this;
        }

        public Criteria andConfirmedcountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CONFIRMEDCOUNT between", value1, value2, "confirmedcount");
            return (Criteria) this;
        }

        public Criteria andConfirmedcountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CONFIRMEDCOUNT not between", value1, value2, "confirmedcount");
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

        public Criteria andInteralamtIsNull() {
            addCriterion("INTERALAMT is null");
            return (Criteria) this;
        }

        public Criteria andInteralamtIsNotNull() {
            addCriterion("INTERALAMT is not null");
            return (Criteria) this;
        }

        public Criteria andInteralamtEqualTo(String value) {
            addCriterion("INTERALAMT =", value, "interalamt");
            return (Criteria) this;
        }

        public Criteria andInteralamtNotEqualTo(String value) {
            addCriterion("INTERALAMT <>", value, "interalamt");
            return (Criteria) this;
        }

        public Criteria andInteralamtGreaterThan(String value) {
            addCriterion("INTERALAMT >", value, "interalamt");
            return (Criteria) this;
        }

        public Criteria andInteralamtGreaterThanOrEqualTo(String value) {
            addCriterion("INTERALAMT >=", value, "interalamt");
            return (Criteria) this;
        }

        public Criteria andInteralamtLessThan(String value) {
            addCriterion("INTERALAMT <", value, "interalamt");
            return (Criteria) this;
        }

        public Criteria andInteralamtLessThanOrEqualTo(String value) {
            addCriterion("INTERALAMT <=", value, "interalamt");
            return (Criteria) this;
        }

        public Criteria andInteralamtLike(String value) {
            addCriterion("INTERALAMT like", value, "interalamt");
            return (Criteria) this;
        }

        public Criteria andInteralamtNotLike(String value) {
            addCriterion("INTERALAMT not like", value, "interalamt");
            return (Criteria) this;
        }

        public Criteria andInteralamtIn(List<String> values) {
            addCriterion("INTERALAMT in", values, "interalamt");
            return (Criteria) this;
        }

        public Criteria andInteralamtNotIn(List<String> values) {
            addCriterion("INTERALAMT not in", values, "interalamt");
            return (Criteria) this;
        }

        public Criteria andInteralamtBetween(String value1, String value2) {
            addCriterion("INTERALAMT between", value1, value2, "interalamt");
            return (Criteria) this;
        }

        public Criteria andInteralamtNotBetween(String value1, String value2) {
            addCriterion("INTERALAMT not between", value1, value2, "interalamt");
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

        public Criteria andOrigmerseqnbrIsNull() {
            addCriterion("ORIGMERSEQNBR is null");
            return (Criteria) this;
        }

        public Criteria andOrigmerseqnbrIsNotNull() {
            addCriterion("ORIGMERSEQNBR is not null");
            return (Criteria) this;
        }

        public Criteria andOrigmerseqnbrEqualTo(String value) {
            addCriterion("ORIGMERSEQNBR =", value, "origmerseqnbr");
            return (Criteria) this;
        }

        public Criteria andOrigmerseqnbrNotEqualTo(String value) {
            addCriterion("ORIGMERSEQNBR <>", value, "origmerseqnbr");
            return (Criteria) this;
        }

        public Criteria andOrigmerseqnbrGreaterThan(String value) {
            addCriterion("ORIGMERSEQNBR >", value, "origmerseqnbr");
            return (Criteria) this;
        }

        public Criteria andOrigmerseqnbrGreaterThanOrEqualTo(String value) {
            addCriterion("ORIGMERSEQNBR >=", value, "origmerseqnbr");
            return (Criteria) this;
        }

        public Criteria andOrigmerseqnbrLessThan(String value) {
            addCriterion("ORIGMERSEQNBR <", value, "origmerseqnbr");
            return (Criteria) this;
        }

        public Criteria andOrigmerseqnbrLessThanOrEqualTo(String value) {
            addCriterion("ORIGMERSEQNBR <=", value, "origmerseqnbr");
            return (Criteria) this;
        }

        public Criteria andOrigmerseqnbrLike(String value) {
            addCriterion("ORIGMERSEQNBR like", value, "origmerseqnbr");
            return (Criteria) this;
        }

        public Criteria andOrigmerseqnbrNotLike(String value) {
            addCriterion("ORIGMERSEQNBR not like", value, "origmerseqnbr");
            return (Criteria) this;
        }

        public Criteria andOrigmerseqnbrIn(List<String> values) {
            addCriterion("ORIGMERSEQNBR in", values, "origmerseqnbr");
            return (Criteria) this;
        }

        public Criteria andOrigmerseqnbrNotIn(List<String> values) {
            addCriterion("ORIGMERSEQNBR not in", values, "origmerseqnbr");
            return (Criteria) this;
        }

        public Criteria andOrigmerseqnbrBetween(String value1, String value2) {
            addCriterion("ORIGMERSEQNBR between", value1, value2, "origmerseqnbr");
            return (Criteria) this;
        }

        public Criteria andOrigmerseqnbrNotBetween(String value1, String value2) {
            addCriterion("ORIGMERSEQNBR not between", value1, value2, "origmerseqnbr");
            return (Criteria) this;
        }

        public Criteria andOrigmerdateIsNull() {
            addCriterion("ORIGMERDATE is null");
            return (Criteria) this;
        }

        public Criteria andOrigmerdateIsNotNull() {
            addCriterion("ORIGMERDATE is not null");
            return (Criteria) this;
        }

        public Criteria andOrigmerdateEqualTo(Date value) {
            addCriterion("ORIGMERDATE =", value, "origmerdate");
            return (Criteria) this;
        }

        public Criteria andOrigmerdateNotEqualTo(Date value) {
            addCriterion("ORIGMERDATE <>", value, "origmerdate");
            return (Criteria) this;
        }

        public Criteria andOrigmerdateGreaterThan(Date value) {
            addCriterion("ORIGMERDATE >", value, "origmerdate");
            return (Criteria) this;
        }

        public Criteria andOrigmerdateGreaterThanOrEqualTo(Date value) {
            addCriterion("ORIGMERDATE >=", value, "origmerdate");
            return (Criteria) this;
        }

        public Criteria andOrigmerdateLessThan(Date value) {
            addCriterion("ORIGMERDATE <", value, "origmerdate");
            return (Criteria) this;
        }

        public Criteria andOrigmerdateLessThanOrEqualTo(Date value) {
            addCriterion("ORIGMERDATE <=", value, "origmerdate");
            return (Criteria) this;
        }

        public Criteria andOrigmerdateIn(List<Date> values) {
            addCriterion("ORIGMERDATE in", values, "origmerdate");
            return (Criteria) this;
        }

        public Criteria andOrigmerdateNotIn(List<Date> values) {
            addCriterion("ORIGMERDATE not in", values, "origmerdate");
            return (Criteria) this;
        }

        public Criteria andOrigmerdateBetween(Date value1, Date value2) {
            addCriterion("ORIGMERDATE between", value1, value2, "origmerdate");
            return (Criteria) this;
        }

        public Criteria andOrigmerdateNotBetween(Date value1, Date value2) {
            addCriterion("ORIGMERDATE not between", value1, value2, "origmerdate");
            return (Criteria) this;
        }

        public Criteria andOrigseqnbrIsNull() {
            addCriterion("ORIGSEQNBR is null");
            return (Criteria) this;
        }

        public Criteria andOrigseqnbrIsNotNull() {
            addCriterion("ORIGSEQNBR is not null");
            return (Criteria) this;
        }

        public Criteria andOrigseqnbrEqualTo(String value) {
            addCriterion("ORIGSEQNBR =", value, "origseqnbr");
            return (Criteria) this;
        }

        public Criteria andOrigseqnbrNotEqualTo(String value) {
            addCriterion("ORIGSEQNBR <>", value, "origseqnbr");
            return (Criteria) this;
        }

        public Criteria andOrigseqnbrGreaterThan(String value) {
            addCriterion("ORIGSEQNBR >", value, "origseqnbr");
            return (Criteria) this;
        }

        public Criteria andOrigseqnbrGreaterThanOrEqualTo(String value) {
            addCriterion("ORIGSEQNBR >=", value, "origseqnbr");
            return (Criteria) this;
        }

        public Criteria andOrigseqnbrLessThan(String value) {
            addCriterion("ORIGSEQNBR <", value, "origseqnbr");
            return (Criteria) this;
        }

        public Criteria andOrigseqnbrLessThanOrEqualTo(String value) {
            addCriterion("ORIGSEQNBR <=", value, "origseqnbr");
            return (Criteria) this;
        }

        public Criteria andOrigseqnbrLike(String value) {
            addCriterion("ORIGSEQNBR like", value, "origseqnbr");
            return (Criteria) this;
        }

        public Criteria andOrigseqnbrNotLike(String value) {
            addCriterion("ORIGSEQNBR not like", value, "origseqnbr");
            return (Criteria) this;
        }

        public Criteria andOrigseqnbrIn(List<String> values) {
            addCriterion("ORIGSEQNBR in", values, "origseqnbr");
            return (Criteria) this;
        }

        public Criteria andOrigseqnbrNotIn(List<String> values) {
            addCriterion("ORIGSEQNBR not in", values, "origseqnbr");
            return (Criteria) this;
        }

        public Criteria andOrigseqnbrBetween(String value1, String value2) {
            addCriterion("ORIGSEQNBR between", value1, value2, "origseqnbr");
            return (Criteria) this;
        }

        public Criteria andOrigseqnbrNotBetween(String value1, String value2) {
            addCriterion("ORIGSEQNBR not between", value1, value2, "origseqnbr");
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

        public Criteria andCheckstatusIsNull() {
            addCriterion("CHECKSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andCheckstatusIsNotNull() {
            addCriterion("CHECKSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andCheckstatusEqualTo(String value) {
            addCriterion("CHECKSTATUS =", value, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusNotEqualTo(String value) {
            addCriterion("CHECKSTATUS <>", value, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusGreaterThan(String value) {
            addCriterion("CHECKSTATUS >", value, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusGreaterThanOrEqualTo(String value) {
            addCriterion("CHECKSTATUS >=", value, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusLessThan(String value) {
            addCriterion("CHECKSTATUS <", value, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusLessThanOrEqualTo(String value) {
            addCriterion("CHECKSTATUS <=", value, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusLike(String value) {
            addCriterion("CHECKSTATUS like", value, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusNotLike(String value) {
            addCriterion("CHECKSTATUS not like", value, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusIn(List<String> values) {
            addCriterion("CHECKSTATUS in", values, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusNotIn(List<String> values) {
            addCriterion("CHECKSTATUS not in", values, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusBetween(String value1, String value2) {
            addCriterion("CHECKSTATUS between", value1, value2, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusNotBetween(String value1, String value2) {
            addCriterion("CHECKSTATUS not between", value1, value2, "checkstatus");
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

        public Criteria andCybertypcdIsNull() {
            addCriterion("CYBERTYPCD is null");
            return (Criteria) this;
        }

        public Criteria andCybertypcdIsNotNull() {
            addCriterion("CYBERTYPCD is not null");
            return (Criteria) this;
        }

        public Criteria andCybertypcdEqualTo(String value) {
            addCriterion("CYBERTYPCD =", value, "cybertypcd");
            return (Criteria) this;
        }

        public Criteria andCybertypcdNotEqualTo(String value) {
            addCriterion("CYBERTYPCD <>", value, "cybertypcd");
            return (Criteria) this;
        }

        public Criteria andCybertypcdGreaterThan(String value) {
            addCriterion("CYBERTYPCD >", value, "cybertypcd");
            return (Criteria) this;
        }

        public Criteria andCybertypcdGreaterThanOrEqualTo(String value) {
            addCriterion("CYBERTYPCD >=", value, "cybertypcd");
            return (Criteria) this;
        }

        public Criteria andCybertypcdLessThan(String value) {
            addCriterion("CYBERTYPCD <", value, "cybertypcd");
            return (Criteria) this;
        }

        public Criteria andCybertypcdLessThanOrEqualTo(String value) {
            addCriterion("CYBERTYPCD <=", value, "cybertypcd");
            return (Criteria) this;
        }

        public Criteria andCybertypcdLike(String value) {
            addCriterion("CYBERTYPCD like", value, "cybertypcd");
            return (Criteria) this;
        }

        public Criteria andCybertypcdNotLike(String value) {
            addCriterion("CYBERTYPCD not like", value, "cybertypcd");
            return (Criteria) this;
        }

        public Criteria andCybertypcdIn(List<String> values) {
            addCriterion("CYBERTYPCD in", values, "cybertypcd");
            return (Criteria) this;
        }

        public Criteria andCybertypcdNotIn(List<String> values) {
            addCriterion("CYBERTYPCD not in", values, "cybertypcd");
            return (Criteria) this;
        }

        public Criteria andCybertypcdBetween(String value1, String value2) {
            addCriterion("CYBERTYPCD between", value1, value2, "cybertypcd");
            return (Criteria) this;
        }

        public Criteria andCybertypcdNotBetween(String value1, String value2) {
            addCriterion("CYBERTYPCD not between", value1, value2, "cybertypcd");
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

        public Criteria andSubpayeraccttypeIsNull() {
            addCriterion("SUBPAYERACCTTYPE is null");
            return (Criteria) this;
        }

        public Criteria andSubpayeraccttypeIsNotNull() {
            addCriterion("SUBPAYERACCTTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSubpayeraccttypeEqualTo(String value) {
            addCriterion("SUBPAYERACCTTYPE =", value, "subpayeraccttype");
            return (Criteria) this;
        }

        public Criteria andSubpayeraccttypeNotEqualTo(String value) {
            addCriterion("SUBPAYERACCTTYPE <>", value, "subpayeraccttype");
            return (Criteria) this;
        }

        public Criteria andSubpayeraccttypeGreaterThan(String value) {
            addCriterion("SUBPAYERACCTTYPE >", value, "subpayeraccttype");
            return (Criteria) this;
        }

        public Criteria andSubpayeraccttypeGreaterThanOrEqualTo(String value) {
            addCriterion("SUBPAYERACCTTYPE >=", value, "subpayeraccttype");
            return (Criteria) this;
        }

        public Criteria andSubpayeraccttypeLessThan(String value) {
            addCriterion("SUBPAYERACCTTYPE <", value, "subpayeraccttype");
            return (Criteria) this;
        }

        public Criteria andSubpayeraccttypeLessThanOrEqualTo(String value) {
            addCriterion("SUBPAYERACCTTYPE <=", value, "subpayeraccttype");
            return (Criteria) this;
        }

        public Criteria andSubpayeraccttypeLike(String value) {
            addCriterion("SUBPAYERACCTTYPE like", value, "subpayeraccttype");
            return (Criteria) this;
        }

        public Criteria andSubpayeraccttypeNotLike(String value) {
            addCriterion("SUBPAYERACCTTYPE not like", value, "subpayeraccttype");
            return (Criteria) this;
        }

        public Criteria andSubpayeraccttypeIn(List<String> values) {
            addCriterion("SUBPAYERACCTTYPE in", values, "subpayeraccttype");
            return (Criteria) this;
        }

        public Criteria andSubpayeraccttypeNotIn(List<String> values) {
            addCriterion("SUBPAYERACCTTYPE not in", values, "subpayeraccttype");
            return (Criteria) this;
        }

        public Criteria andSubpayeraccttypeBetween(String value1, String value2) {
            addCriterion("SUBPAYERACCTTYPE between", value1, value2, "subpayeraccttype");
            return (Criteria) this;
        }

        public Criteria andSubpayeraccttypeNotBetween(String value1, String value2) {
            addCriterion("SUBPAYERACCTTYPE not between", value1, value2, "subpayeraccttype");
            return (Criteria) this;
        }

        public Criteria andSubpayeracctnbrIsNull() {
            addCriterion("SUBPAYERACCTNBR is null");
            return (Criteria) this;
        }

        public Criteria andSubpayeracctnbrIsNotNull() {
            addCriterion("SUBPAYERACCTNBR is not null");
            return (Criteria) this;
        }

        public Criteria andSubpayeracctnbrEqualTo(String value) {
            addCriterion("SUBPAYERACCTNBR =", value, "subpayeracctnbr");
            return (Criteria) this;
        }

        public Criteria andSubpayeracctnbrNotEqualTo(String value) {
            addCriterion("SUBPAYERACCTNBR <>", value, "subpayeracctnbr");
            return (Criteria) this;
        }

        public Criteria andSubpayeracctnbrGreaterThan(String value) {
            addCriterion("SUBPAYERACCTNBR >", value, "subpayeracctnbr");
            return (Criteria) this;
        }

        public Criteria andSubpayeracctnbrGreaterThanOrEqualTo(String value) {
            addCriterion("SUBPAYERACCTNBR >=", value, "subpayeracctnbr");
            return (Criteria) this;
        }

        public Criteria andSubpayeracctnbrLessThan(String value) {
            addCriterion("SUBPAYERACCTNBR <", value, "subpayeracctnbr");
            return (Criteria) this;
        }

        public Criteria andSubpayeracctnbrLessThanOrEqualTo(String value) {
            addCriterion("SUBPAYERACCTNBR <=", value, "subpayeracctnbr");
            return (Criteria) this;
        }

        public Criteria andSubpayeracctnbrLike(String value) {
            addCriterion("SUBPAYERACCTNBR like", value, "subpayeracctnbr");
            return (Criteria) this;
        }

        public Criteria andSubpayeracctnbrNotLike(String value) {
            addCriterion("SUBPAYERACCTNBR not like", value, "subpayeracctnbr");
            return (Criteria) this;
        }

        public Criteria andSubpayeracctnbrIn(List<String> values) {
            addCriterion("SUBPAYERACCTNBR in", values, "subpayeracctnbr");
            return (Criteria) this;
        }

        public Criteria andSubpayeracctnbrNotIn(List<String> values) {
            addCriterion("SUBPAYERACCTNBR not in", values, "subpayeracctnbr");
            return (Criteria) this;
        }

        public Criteria andSubpayeracctnbrBetween(String value1, String value2) {
            addCriterion("SUBPAYERACCTNBR between", value1, value2, "subpayeracctnbr");
            return (Criteria) this;
        }

        public Criteria andSubpayeracctnbrNotBetween(String value1, String value2) {
            addCriterion("SUBPAYERACCTNBR not between", value1, value2, "subpayeracctnbr");
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

        public Criteria andCodeurlIsNull() {
            addCriterion("CODEURL is null");
            return (Criteria) this;
        }

        public Criteria andCodeurlIsNotNull() {
            addCriterion("CODEURL is not null");
            return (Criteria) this;
        }

        public Criteria andCodeurlEqualTo(String value) {
            addCriterion("CODEURL =", value, "codeurl");
            return (Criteria) this;
        }

        public Criteria andCodeurlNotEqualTo(String value) {
            addCriterion("CODEURL <>", value, "codeurl");
            return (Criteria) this;
        }

        public Criteria andCodeurlGreaterThan(String value) {
            addCriterion("CODEURL >", value, "codeurl");
            return (Criteria) this;
        }

        public Criteria andCodeurlGreaterThanOrEqualTo(String value) {
            addCriterion("CODEURL >=", value, "codeurl");
            return (Criteria) this;
        }

        public Criteria andCodeurlLessThan(String value) {
            addCriterion("CODEURL <", value, "codeurl");
            return (Criteria) this;
        }

        public Criteria andCodeurlLessThanOrEqualTo(String value) {
            addCriterion("CODEURL <=", value, "codeurl");
            return (Criteria) this;
        }

        public Criteria andCodeurlLike(String value) {
            addCriterion("CODEURL like", value, "codeurl");
            return (Criteria) this;
        }

        public Criteria andCodeurlNotLike(String value) {
            addCriterion("CODEURL not like", value, "codeurl");
            return (Criteria) this;
        }

        public Criteria andCodeurlIn(List<String> values) {
            addCriterion("CODEURL in", values, "codeurl");
            return (Criteria) this;
        }

        public Criteria andCodeurlNotIn(List<String> values) {
            addCriterion("CODEURL not in", values, "codeurl");
            return (Criteria) this;
        }

        public Criteria andCodeurlBetween(String value1, String value2) {
            addCriterion("CODEURL between", value1, value2, "codeurl");
            return (Criteria) this;
        }

        public Criteria andCodeurlNotBetween(String value1, String value2) {
            addCriterion("CODEURL not between", value1, value2, "codeurl");
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

        public Criteria andQrcodeordernbrIsNull() {
            addCriterion("QRCODEORDERNBR is null");
            return (Criteria) this;
        }

        public Criteria andQrcodeordernbrIsNotNull() {
            addCriterion("QRCODEORDERNBR is not null");
            return (Criteria) this;
        }

        public Criteria andQrcodeordernbrEqualTo(String value) {
            addCriterion("QRCODEORDERNBR =", value, "qrcodeordernbr");
            return (Criteria) this;
        }

        public Criteria andQrcodeordernbrNotEqualTo(String value) {
            addCriterion("QRCODEORDERNBR <>", value, "qrcodeordernbr");
            return (Criteria) this;
        }

        public Criteria andQrcodeordernbrGreaterThan(String value) {
            addCriterion("QRCODEORDERNBR >", value, "qrcodeordernbr");
            return (Criteria) this;
        }

        public Criteria andQrcodeordernbrGreaterThanOrEqualTo(String value) {
            addCriterion("QRCODEORDERNBR >=", value, "qrcodeordernbr");
            return (Criteria) this;
        }

        public Criteria andQrcodeordernbrLessThan(String value) {
            addCriterion("QRCODEORDERNBR <", value, "qrcodeordernbr");
            return (Criteria) this;
        }

        public Criteria andQrcodeordernbrLessThanOrEqualTo(String value) {
            addCriterion("QRCODEORDERNBR <=", value, "qrcodeordernbr");
            return (Criteria) this;
        }

        public Criteria andQrcodeordernbrLike(String value) {
            addCriterion("QRCODEORDERNBR like", value, "qrcodeordernbr");
            return (Criteria) this;
        }

        public Criteria andQrcodeordernbrNotLike(String value) {
            addCriterion("QRCODEORDERNBR not like", value, "qrcodeordernbr");
            return (Criteria) this;
        }

        public Criteria andQrcodeordernbrIn(List<String> values) {
            addCriterion("QRCODEORDERNBR in", values, "qrcodeordernbr");
            return (Criteria) this;
        }

        public Criteria andQrcodeordernbrNotIn(List<String> values) {
            addCriterion("QRCODEORDERNBR not in", values, "qrcodeordernbr");
            return (Criteria) this;
        }

        public Criteria andQrcodeordernbrBetween(String value1, String value2) {
            addCriterion("QRCODEORDERNBR between", value1, value2, "qrcodeordernbr");
            return (Criteria) this;
        }

        public Criteria andQrcodeordernbrNotBetween(String value1, String value2) {
            addCriterion("QRCODEORDERNBR not between", value1, value2, "qrcodeordernbr");
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