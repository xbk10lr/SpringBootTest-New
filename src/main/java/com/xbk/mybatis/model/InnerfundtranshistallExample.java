package com.xbk.mybatis.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InnerfundtranshistallExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InnerfundtranshistallExample() {
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

        public Criteria andInnerfundtransnbrIsNull() {
            addCriterion("INNERFUNDTRANSNBR is null");
            return (Criteria) this;
        }

        public Criteria andInnerfundtransnbrIsNotNull() {
            addCriterion("INNERFUNDTRANSNBR is not null");
            return (Criteria) this;
        }

        public Criteria andInnerfundtransnbrEqualTo(String value) {
            addCriterion("INNERFUNDTRANSNBR =", value, "innerfundtransnbr");
            return (Criteria) this;
        }

        public Criteria andInnerfundtransnbrNotEqualTo(String value) {
            addCriterion("INNERFUNDTRANSNBR <>", value, "innerfundtransnbr");
            return (Criteria) this;
        }

        public Criteria andInnerfundtransnbrGreaterThan(String value) {
            addCriterion("INNERFUNDTRANSNBR >", value, "innerfundtransnbr");
            return (Criteria) this;
        }

        public Criteria andInnerfundtransnbrGreaterThanOrEqualTo(String value) {
            addCriterion("INNERFUNDTRANSNBR >=", value, "innerfundtransnbr");
            return (Criteria) this;
        }

        public Criteria andInnerfundtransnbrLessThan(String value) {
            addCriterion("INNERFUNDTRANSNBR <", value, "innerfundtransnbr");
            return (Criteria) this;
        }

        public Criteria andInnerfundtransnbrLessThanOrEqualTo(String value) {
            addCriterion("INNERFUNDTRANSNBR <=", value, "innerfundtransnbr");
            return (Criteria) this;
        }

        public Criteria andInnerfundtransnbrLike(String value) {
            addCriterion("INNERFUNDTRANSNBR like", value, "innerfundtransnbr");
            return (Criteria) this;
        }

        public Criteria andInnerfundtransnbrNotLike(String value) {
            addCriterion("INNERFUNDTRANSNBR not like", value, "innerfundtransnbr");
            return (Criteria) this;
        }

        public Criteria andInnerfundtransnbrIn(List<String> values) {
            addCriterion("INNERFUNDTRANSNBR in", values, "innerfundtransnbr");
            return (Criteria) this;
        }

        public Criteria andInnerfundtransnbrNotIn(List<String> values) {
            addCriterion("INNERFUNDTRANSNBR not in", values, "innerfundtransnbr");
            return (Criteria) this;
        }

        public Criteria andInnerfundtransnbrBetween(String value1, String value2) {
            addCriterion("INNERFUNDTRANSNBR between", value1, value2, "innerfundtransnbr");
            return (Criteria) this;
        }

        public Criteria andInnerfundtransnbrNotBetween(String value1, String value2) {
            addCriterion("INNERFUNDTRANSNBR not between", value1, value2, "innerfundtransnbr");
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

        public Criteria andOveralltransnbrIsNull() {
            addCriterion("OVERALLTRANSNBR is null");
            return (Criteria) this;
        }

        public Criteria andOveralltransnbrIsNotNull() {
            addCriterion("OVERALLTRANSNBR is not null");
            return (Criteria) this;
        }

        public Criteria andOveralltransnbrEqualTo(String value) {
            addCriterion("OVERALLTRANSNBR =", value, "overalltransnbr");
            return (Criteria) this;
        }

        public Criteria andOveralltransnbrNotEqualTo(String value) {
            addCriterion("OVERALLTRANSNBR <>", value, "overalltransnbr");
            return (Criteria) this;
        }

        public Criteria andOveralltransnbrGreaterThan(String value) {
            addCriterion("OVERALLTRANSNBR >", value, "overalltransnbr");
            return (Criteria) this;
        }

        public Criteria andOveralltransnbrGreaterThanOrEqualTo(String value) {
            addCriterion("OVERALLTRANSNBR >=", value, "overalltransnbr");
            return (Criteria) this;
        }

        public Criteria andOveralltransnbrLessThan(String value) {
            addCriterion("OVERALLTRANSNBR <", value, "overalltransnbr");
            return (Criteria) this;
        }

        public Criteria andOveralltransnbrLessThanOrEqualTo(String value) {
            addCriterion("OVERALLTRANSNBR <=", value, "overalltransnbr");
            return (Criteria) this;
        }

        public Criteria andOveralltransnbrLike(String value) {
            addCriterion("OVERALLTRANSNBR like", value, "overalltransnbr");
            return (Criteria) this;
        }

        public Criteria andOveralltransnbrNotLike(String value) {
            addCriterion("OVERALLTRANSNBR not like", value, "overalltransnbr");
            return (Criteria) this;
        }

        public Criteria andOveralltransnbrIn(List<String> values) {
            addCriterion("OVERALLTRANSNBR in", values, "overalltransnbr");
            return (Criteria) this;
        }

        public Criteria andOveralltransnbrNotIn(List<String> values) {
            addCriterion("OVERALLTRANSNBR not in", values, "overalltransnbr");
            return (Criteria) this;
        }

        public Criteria andOveralltransnbrBetween(String value1, String value2) {
            addCriterion("OVERALLTRANSNBR between", value1, value2, "overalltransnbr");
            return (Criteria) this;
        }

        public Criteria andOveralltransnbrNotBetween(String value1, String value2) {
            addCriterion("OVERALLTRANSNBR not between", value1, value2, "overalltransnbr");
            return (Criteria) this;
        }

        public Criteria andFundchannelcodeIsNull() {
            addCriterion("FUNDCHANNELCODE is null");
            return (Criteria) this;
        }

        public Criteria andFundchannelcodeIsNotNull() {
            addCriterion("FUNDCHANNELCODE is not null");
            return (Criteria) this;
        }

        public Criteria andFundchannelcodeEqualTo(String value) {
            addCriterion("FUNDCHANNELCODE =", value, "fundchannelcode");
            return (Criteria) this;
        }

        public Criteria andFundchannelcodeNotEqualTo(String value) {
            addCriterion("FUNDCHANNELCODE <>", value, "fundchannelcode");
            return (Criteria) this;
        }

        public Criteria andFundchannelcodeGreaterThan(String value) {
            addCriterion("FUNDCHANNELCODE >", value, "fundchannelcode");
            return (Criteria) this;
        }

        public Criteria andFundchannelcodeGreaterThanOrEqualTo(String value) {
            addCriterion("FUNDCHANNELCODE >=", value, "fundchannelcode");
            return (Criteria) this;
        }

        public Criteria andFundchannelcodeLessThan(String value) {
            addCriterion("FUNDCHANNELCODE <", value, "fundchannelcode");
            return (Criteria) this;
        }

        public Criteria andFundchannelcodeLessThanOrEqualTo(String value) {
            addCriterion("FUNDCHANNELCODE <=", value, "fundchannelcode");
            return (Criteria) this;
        }

        public Criteria andFundchannelcodeLike(String value) {
            addCriterion("FUNDCHANNELCODE like", value, "fundchannelcode");
            return (Criteria) this;
        }

        public Criteria andFundchannelcodeNotLike(String value) {
            addCriterion("FUNDCHANNELCODE not like", value, "fundchannelcode");
            return (Criteria) this;
        }

        public Criteria andFundchannelcodeIn(List<String> values) {
            addCriterion("FUNDCHANNELCODE in", values, "fundchannelcode");
            return (Criteria) this;
        }

        public Criteria andFundchannelcodeNotIn(List<String> values) {
            addCriterion("FUNDCHANNELCODE not in", values, "fundchannelcode");
            return (Criteria) this;
        }

        public Criteria andFundchannelcodeBetween(String value1, String value2) {
            addCriterion("FUNDCHANNELCODE between", value1, value2, "fundchannelcode");
            return (Criteria) this;
        }

        public Criteria andFundchannelcodeNotBetween(String value1, String value2) {
            addCriterion("FUNDCHANNELCODE not between", value1, value2, "fundchannelcode");
            return (Criteria) this;
        }

        public Criteria andUppersysnbrIsNull() {
            addCriterion("UPPERSYSNBR is null");
            return (Criteria) this;
        }

        public Criteria andUppersysnbrIsNotNull() {
            addCriterion("UPPERSYSNBR is not null");
            return (Criteria) this;
        }

        public Criteria andUppersysnbrEqualTo(String value) {
            addCriterion("UPPERSYSNBR =", value, "uppersysnbr");
            return (Criteria) this;
        }

        public Criteria andUppersysnbrNotEqualTo(String value) {
            addCriterion("UPPERSYSNBR <>", value, "uppersysnbr");
            return (Criteria) this;
        }

        public Criteria andUppersysnbrGreaterThan(String value) {
            addCriterion("UPPERSYSNBR >", value, "uppersysnbr");
            return (Criteria) this;
        }

        public Criteria andUppersysnbrGreaterThanOrEqualTo(String value) {
            addCriterion("UPPERSYSNBR >=", value, "uppersysnbr");
            return (Criteria) this;
        }

        public Criteria andUppersysnbrLessThan(String value) {
            addCriterion("UPPERSYSNBR <", value, "uppersysnbr");
            return (Criteria) this;
        }

        public Criteria andUppersysnbrLessThanOrEqualTo(String value) {
            addCriterion("UPPERSYSNBR <=", value, "uppersysnbr");
            return (Criteria) this;
        }

        public Criteria andUppersysnbrLike(String value) {
            addCriterion("UPPERSYSNBR like", value, "uppersysnbr");
            return (Criteria) this;
        }

        public Criteria andUppersysnbrNotLike(String value) {
            addCriterion("UPPERSYSNBR not like", value, "uppersysnbr");
            return (Criteria) this;
        }

        public Criteria andUppersysnbrIn(List<String> values) {
            addCriterion("UPPERSYSNBR in", values, "uppersysnbr");
            return (Criteria) this;
        }

        public Criteria andUppersysnbrNotIn(List<String> values) {
            addCriterion("UPPERSYSNBR not in", values, "uppersysnbr");
            return (Criteria) this;
        }

        public Criteria andUppersysnbrBetween(String value1, String value2) {
            addCriterion("UPPERSYSNBR between", value1, value2, "uppersysnbr");
            return (Criteria) this;
        }

        public Criteria andUppersysnbrNotBetween(String value1, String value2) {
            addCriterion("UPPERSYSNBR not between", value1, value2, "uppersysnbr");
            return (Criteria) this;
        }

        public Criteria andUppertransdateIsNull() {
            addCriterion("UPPERTRANSDATE is null");
            return (Criteria) this;
        }

        public Criteria andUppertransdateIsNotNull() {
            addCriterion("UPPERTRANSDATE is not null");
            return (Criteria) this;
        }

        public Criteria andUppertransdateEqualTo(Date value) {
            addCriterion("UPPERTRANSDATE =", value, "uppertransdate");
            return (Criteria) this;
        }

        public Criteria andUppertransdateNotEqualTo(Date value) {
            addCriterion("UPPERTRANSDATE <>", value, "uppertransdate");
            return (Criteria) this;
        }

        public Criteria andUppertransdateGreaterThan(Date value) {
            addCriterion("UPPERTRANSDATE >", value, "uppertransdate");
            return (Criteria) this;
        }

        public Criteria andUppertransdateGreaterThanOrEqualTo(Date value) {
            addCriterion("UPPERTRANSDATE >=", value, "uppertransdate");
            return (Criteria) this;
        }

        public Criteria andUppertransdateLessThan(Date value) {
            addCriterion("UPPERTRANSDATE <", value, "uppertransdate");
            return (Criteria) this;
        }

        public Criteria andUppertransdateLessThanOrEqualTo(Date value) {
            addCriterion("UPPERTRANSDATE <=", value, "uppertransdate");
            return (Criteria) this;
        }

        public Criteria andUppertransdateIn(List<Date> values) {
            addCriterion("UPPERTRANSDATE in", values, "uppertransdate");
            return (Criteria) this;
        }

        public Criteria andUppertransdateNotIn(List<Date> values) {
            addCriterion("UPPERTRANSDATE not in", values, "uppertransdate");
            return (Criteria) this;
        }

        public Criteria andUppertransdateBetween(Date value1, Date value2) {
            addCriterion("UPPERTRANSDATE between", value1, value2, "uppertransdate");
            return (Criteria) this;
        }

        public Criteria andUppertransdateNotBetween(Date value1, Date value2) {
            addCriterion("UPPERTRANSDATE not between", value1, value2, "uppertransdate");
            return (Criteria) this;
        }

        public Criteria andUppertranstimeIsNull() {
            addCriterion("UPPERTRANSTIME is null");
            return (Criteria) this;
        }

        public Criteria andUppertranstimeIsNotNull() {
            addCriterion("UPPERTRANSTIME is not null");
            return (Criteria) this;
        }

        public Criteria andUppertranstimeEqualTo(Date value) {
            addCriterion("UPPERTRANSTIME =", value, "uppertranstime");
            return (Criteria) this;
        }

        public Criteria andUppertranstimeNotEqualTo(Date value) {
            addCriterion("UPPERTRANSTIME <>", value, "uppertranstime");
            return (Criteria) this;
        }

        public Criteria andUppertranstimeGreaterThan(Date value) {
            addCriterion("UPPERTRANSTIME >", value, "uppertranstime");
            return (Criteria) this;
        }

        public Criteria andUppertranstimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPPERTRANSTIME >=", value, "uppertranstime");
            return (Criteria) this;
        }

        public Criteria andUppertranstimeLessThan(Date value) {
            addCriterion("UPPERTRANSTIME <", value, "uppertranstime");
            return (Criteria) this;
        }

        public Criteria andUppertranstimeLessThanOrEqualTo(Date value) {
            addCriterion("UPPERTRANSTIME <=", value, "uppertranstime");
            return (Criteria) this;
        }

        public Criteria andUppertranstimeIn(List<Date> values) {
            addCriterion("UPPERTRANSTIME in", values, "uppertranstime");
            return (Criteria) this;
        }

        public Criteria andUppertranstimeNotIn(List<Date> values) {
            addCriterion("UPPERTRANSTIME not in", values, "uppertranstime");
            return (Criteria) this;
        }

        public Criteria andUppertranstimeBetween(Date value1, Date value2) {
            addCriterion("UPPERTRANSTIME between", value1, value2, "uppertranstime");
            return (Criteria) this;
        }

        public Criteria andUppertranstimeNotBetween(Date value1, Date value2) {
            addCriterion("UPPERTRANSTIME not between", value1, value2, "uppertranstime");
            return (Criteria) this;
        }

        public Criteria andUppertransnbrIsNull() {
            addCriterion("UPPERTRANSNBR is null");
            return (Criteria) this;
        }

        public Criteria andUppertransnbrIsNotNull() {
            addCriterion("UPPERTRANSNBR is not null");
            return (Criteria) this;
        }

        public Criteria andUppertransnbrEqualTo(String value) {
            addCriterion("UPPERTRANSNBR =", value, "uppertransnbr");
            return (Criteria) this;
        }

        public Criteria andUppertransnbrNotEqualTo(String value) {
            addCriterion("UPPERTRANSNBR <>", value, "uppertransnbr");
            return (Criteria) this;
        }

        public Criteria andUppertransnbrGreaterThan(String value) {
            addCriterion("UPPERTRANSNBR >", value, "uppertransnbr");
            return (Criteria) this;
        }

        public Criteria andUppertransnbrGreaterThanOrEqualTo(String value) {
            addCriterion("UPPERTRANSNBR >=", value, "uppertransnbr");
            return (Criteria) this;
        }

        public Criteria andUppertransnbrLessThan(String value) {
            addCriterion("UPPERTRANSNBR <", value, "uppertransnbr");
            return (Criteria) this;
        }

        public Criteria andUppertransnbrLessThanOrEqualTo(String value) {
            addCriterion("UPPERTRANSNBR <=", value, "uppertransnbr");
            return (Criteria) this;
        }

        public Criteria andUppertransnbrLike(String value) {
            addCriterion("UPPERTRANSNBR like", value, "uppertransnbr");
            return (Criteria) this;
        }

        public Criteria andUppertransnbrNotLike(String value) {
            addCriterion("UPPERTRANSNBR not like", value, "uppertransnbr");
            return (Criteria) this;
        }

        public Criteria andUppertransnbrIn(List<String> values) {
            addCriterion("UPPERTRANSNBR in", values, "uppertransnbr");
            return (Criteria) this;
        }

        public Criteria andUppertransnbrNotIn(List<String> values) {
            addCriterion("UPPERTRANSNBR not in", values, "uppertransnbr");
            return (Criteria) this;
        }

        public Criteria andUppertransnbrBetween(String value1, String value2) {
            addCriterion("UPPERTRANSNBR between", value1, value2, "uppertransnbr");
            return (Criteria) this;
        }

        public Criteria andUppertransnbrNotBetween(String value1, String value2) {
            addCriterion("UPPERTRANSNBR not between", value1, value2, "uppertransnbr");
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

        public Criteria andPayernameIsNull() {
            addCriterion("PAYERNAME is null");
            return (Criteria) this;
        }

        public Criteria andPayernameIsNotNull() {
            addCriterion("PAYERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andPayernameEqualTo(String value) {
            addCriterion("PAYERNAME =", value, "payername");
            return (Criteria) this;
        }

        public Criteria andPayernameNotEqualTo(String value) {
            addCriterion("PAYERNAME <>", value, "payername");
            return (Criteria) this;
        }

        public Criteria andPayernameGreaterThan(String value) {
            addCriterion("PAYERNAME >", value, "payername");
            return (Criteria) this;
        }

        public Criteria andPayernameGreaterThanOrEqualTo(String value) {
            addCriterion("PAYERNAME >=", value, "payername");
            return (Criteria) this;
        }

        public Criteria andPayernameLessThan(String value) {
            addCriterion("PAYERNAME <", value, "payername");
            return (Criteria) this;
        }

        public Criteria andPayernameLessThanOrEqualTo(String value) {
            addCriterion("PAYERNAME <=", value, "payername");
            return (Criteria) this;
        }

        public Criteria andPayernameLike(String value) {
            addCriterion("PAYERNAME like", value, "payername");
            return (Criteria) this;
        }

        public Criteria andPayernameNotLike(String value) {
            addCriterion("PAYERNAME not like", value, "payername");
            return (Criteria) this;
        }

        public Criteria andPayernameIn(List<String> values) {
            addCriterion("PAYERNAME in", values, "payername");
            return (Criteria) this;
        }

        public Criteria andPayernameNotIn(List<String> values) {
            addCriterion("PAYERNAME not in", values, "payername");
            return (Criteria) this;
        }

        public Criteria andPayernameBetween(String value1, String value2) {
            addCriterion("PAYERNAME between", value1, value2, "payername");
            return (Criteria) this;
        }

        public Criteria andPayernameNotBetween(String value1, String value2) {
            addCriterion("PAYERNAME not between", value1, value2, "payername");
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

        public Criteria andPayeenameIsNull() {
            addCriterion("PAYEENAME is null");
            return (Criteria) this;
        }

        public Criteria andPayeenameIsNotNull() {
            addCriterion("PAYEENAME is not null");
            return (Criteria) this;
        }

        public Criteria andPayeenameEqualTo(String value) {
            addCriterion("PAYEENAME =", value, "payeename");
            return (Criteria) this;
        }

        public Criteria andPayeenameNotEqualTo(String value) {
            addCriterion("PAYEENAME <>", value, "payeename");
            return (Criteria) this;
        }

        public Criteria andPayeenameGreaterThan(String value) {
            addCriterion("PAYEENAME >", value, "payeename");
            return (Criteria) this;
        }

        public Criteria andPayeenameGreaterThanOrEqualTo(String value) {
            addCriterion("PAYEENAME >=", value, "payeename");
            return (Criteria) this;
        }

        public Criteria andPayeenameLessThan(String value) {
            addCriterion("PAYEENAME <", value, "payeename");
            return (Criteria) this;
        }

        public Criteria andPayeenameLessThanOrEqualTo(String value) {
            addCriterion("PAYEENAME <=", value, "payeename");
            return (Criteria) this;
        }

        public Criteria andPayeenameLike(String value) {
            addCriterion("PAYEENAME like", value, "payeename");
            return (Criteria) this;
        }

        public Criteria andPayeenameNotLike(String value) {
            addCriterion("PAYEENAME not like", value, "payeename");
            return (Criteria) this;
        }

        public Criteria andPayeenameIn(List<String> values) {
            addCriterion("PAYEENAME in", values, "payeename");
            return (Criteria) this;
        }

        public Criteria andPayeenameNotIn(List<String> values) {
            addCriterion("PAYEENAME not in", values, "payeename");
            return (Criteria) this;
        }

        public Criteria andPayeenameBetween(String value1, String value2) {
            addCriterion("PAYEENAME between", value1, value2, "payeename");
            return (Criteria) this;
        }

        public Criteria andPayeenameNotBetween(String value1, String value2) {
            addCriterion("PAYEENAME not between", value1, value2, "payeename");
            return (Criteria) this;
        }

        public Criteria andOriguppersysnbrIsNull() {
            addCriterion("ORIGUPPERSYSNBR is null");
            return (Criteria) this;
        }

        public Criteria andOriguppersysnbrIsNotNull() {
            addCriterion("ORIGUPPERSYSNBR is not null");
            return (Criteria) this;
        }

        public Criteria andOriguppersysnbrEqualTo(String value) {
            addCriterion("ORIGUPPERSYSNBR =", value, "origuppersysnbr");
            return (Criteria) this;
        }

        public Criteria andOriguppersysnbrNotEqualTo(String value) {
            addCriterion("ORIGUPPERSYSNBR <>", value, "origuppersysnbr");
            return (Criteria) this;
        }

        public Criteria andOriguppersysnbrGreaterThan(String value) {
            addCriterion("ORIGUPPERSYSNBR >", value, "origuppersysnbr");
            return (Criteria) this;
        }

        public Criteria andOriguppersysnbrGreaterThanOrEqualTo(String value) {
            addCriterion("ORIGUPPERSYSNBR >=", value, "origuppersysnbr");
            return (Criteria) this;
        }

        public Criteria andOriguppersysnbrLessThan(String value) {
            addCriterion("ORIGUPPERSYSNBR <", value, "origuppersysnbr");
            return (Criteria) this;
        }

        public Criteria andOriguppersysnbrLessThanOrEqualTo(String value) {
            addCriterion("ORIGUPPERSYSNBR <=", value, "origuppersysnbr");
            return (Criteria) this;
        }

        public Criteria andOriguppersysnbrLike(String value) {
            addCriterion("ORIGUPPERSYSNBR like", value, "origuppersysnbr");
            return (Criteria) this;
        }

        public Criteria andOriguppersysnbrNotLike(String value) {
            addCriterion("ORIGUPPERSYSNBR not like", value, "origuppersysnbr");
            return (Criteria) this;
        }

        public Criteria andOriguppersysnbrIn(List<String> values) {
            addCriterion("ORIGUPPERSYSNBR in", values, "origuppersysnbr");
            return (Criteria) this;
        }

        public Criteria andOriguppersysnbrNotIn(List<String> values) {
            addCriterion("ORIGUPPERSYSNBR not in", values, "origuppersysnbr");
            return (Criteria) this;
        }

        public Criteria andOriguppersysnbrBetween(String value1, String value2) {
            addCriterion("ORIGUPPERSYSNBR between", value1, value2, "origuppersysnbr");
            return (Criteria) this;
        }

        public Criteria andOriguppersysnbrNotBetween(String value1, String value2) {
            addCriterion("ORIGUPPERSYSNBR not between", value1, value2, "origuppersysnbr");
            return (Criteria) this;
        }

        public Criteria andOriguppertransnbrIsNull() {
            addCriterion("ORIGUPPERTRANSNBR is null");
            return (Criteria) this;
        }

        public Criteria andOriguppertransnbrIsNotNull() {
            addCriterion("ORIGUPPERTRANSNBR is not null");
            return (Criteria) this;
        }

        public Criteria andOriguppertransnbrEqualTo(String value) {
            addCriterion("ORIGUPPERTRANSNBR =", value, "origuppertransnbr");
            return (Criteria) this;
        }

        public Criteria andOriguppertransnbrNotEqualTo(String value) {
            addCriterion("ORIGUPPERTRANSNBR <>", value, "origuppertransnbr");
            return (Criteria) this;
        }

        public Criteria andOriguppertransnbrGreaterThan(String value) {
            addCriterion("ORIGUPPERTRANSNBR >", value, "origuppertransnbr");
            return (Criteria) this;
        }

        public Criteria andOriguppertransnbrGreaterThanOrEqualTo(String value) {
            addCriterion("ORIGUPPERTRANSNBR >=", value, "origuppertransnbr");
            return (Criteria) this;
        }

        public Criteria andOriguppertransnbrLessThan(String value) {
            addCriterion("ORIGUPPERTRANSNBR <", value, "origuppertransnbr");
            return (Criteria) this;
        }

        public Criteria andOriguppertransnbrLessThanOrEqualTo(String value) {
            addCriterion("ORIGUPPERTRANSNBR <=", value, "origuppertransnbr");
            return (Criteria) this;
        }

        public Criteria andOriguppertransnbrLike(String value) {
            addCriterion("ORIGUPPERTRANSNBR like", value, "origuppertransnbr");
            return (Criteria) this;
        }

        public Criteria andOriguppertransnbrNotLike(String value) {
            addCriterion("ORIGUPPERTRANSNBR not like", value, "origuppertransnbr");
            return (Criteria) this;
        }

        public Criteria andOriguppertransnbrIn(List<String> values) {
            addCriterion("ORIGUPPERTRANSNBR in", values, "origuppertransnbr");
            return (Criteria) this;
        }

        public Criteria andOriguppertransnbrNotIn(List<String> values) {
            addCriterion("ORIGUPPERTRANSNBR not in", values, "origuppertransnbr");
            return (Criteria) this;
        }

        public Criteria andOriguppertransnbrBetween(String value1, String value2) {
            addCriterion("ORIGUPPERTRANSNBR between", value1, value2, "origuppertransnbr");
            return (Criteria) this;
        }

        public Criteria andOriguppertransnbrNotBetween(String value1, String value2) {
            addCriterion("ORIGUPPERTRANSNBR not between", value1, value2, "origuppertransnbr");
            return (Criteria) this;
        }

        public Criteria andOriguppertransdateIsNull() {
            addCriterion("ORIGUPPERTRANSDATE is null");
            return (Criteria) this;
        }

        public Criteria andOriguppertransdateIsNotNull() {
            addCriterion("ORIGUPPERTRANSDATE is not null");
            return (Criteria) this;
        }

        public Criteria andOriguppertransdateEqualTo(Date value) {
            addCriterion("ORIGUPPERTRANSDATE =", value, "origuppertransdate");
            return (Criteria) this;
        }

        public Criteria andOriguppertransdateNotEqualTo(Date value) {
            addCriterion("ORIGUPPERTRANSDATE <>", value, "origuppertransdate");
            return (Criteria) this;
        }

        public Criteria andOriguppertransdateGreaterThan(Date value) {
            addCriterion("ORIGUPPERTRANSDATE >", value, "origuppertransdate");
            return (Criteria) this;
        }

        public Criteria andOriguppertransdateGreaterThanOrEqualTo(Date value) {
            addCriterion("ORIGUPPERTRANSDATE >=", value, "origuppertransdate");
            return (Criteria) this;
        }

        public Criteria andOriguppertransdateLessThan(Date value) {
            addCriterion("ORIGUPPERTRANSDATE <", value, "origuppertransdate");
            return (Criteria) this;
        }

        public Criteria andOriguppertransdateLessThanOrEqualTo(Date value) {
            addCriterion("ORIGUPPERTRANSDATE <=", value, "origuppertransdate");
            return (Criteria) this;
        }

        public Criteria andOriguppertransdateIn(List<Date> values) {
            addCriterion("ORIGUPPERTRANSDATE in", values, "origuppertransdate");
            return (Criteria) this;
        }

        public Criteria andOriguppertransdateNotIn(List<Date> values) {
            addCriterion("ORIGUPPERTRANSDATE not in", values, "origuppertransdate");
            return (Criteria) this;
        }

        public Criteria andOriguppertransdateBetween(Date value1, Date value2) {
            addCriterion("ORIGUPPERTRANSDATE between", value1, value2, "origuppertransdate");
            return (Criteria) this;
        }

        public Criteria andOriguppertransdateNotBetween(Date value1, Date value2) {
            addCriterion("ORIGUPPERTRANSDATE not between", value1, value2, "origuppertransdate");
            return (Criteria) this;
        }

        public Criteria andOriginnertransnbrIsNull() {
            addCriterion("ORIGINNERTRANSNBR is null");
            return (Criteria) this;
        }

        public Criteria andOriginnertransnbrIsNotNull() {
            addCriterion("ORIGINNERTRANSNBR is not null");
            return (Criteria) this;
        }

        public Criteria andOriginnertransnbrEqualTo(String value) {
            addCriterion("ORIGINNERTRANSNBR =", value, "originnertransnbr");
            return (Criteria) this;
        }

        public Criteria andOriginnertransnbrNotEqualTo(String value) {
            addCriterion("ORIGINNERTRANSNBR <>", value, "originnertransnbr");
            return (Criteria) this;
        }

        public Criteria andOriginnertransnbrGreaterThan(String value) {
            addCriterion("ORIGINNERTRANSNBR >", value, "originnertransnbr");
            return (Criteria) this;
        }

        public Criteria andOriginnertransnbrGreaterThanOrEqualTo(String value) {
            addCriterion("ORIGINNERTRANSNBR >=", value, "originnertransnbr");
            return (Criteria) this;
        }

        public Criteria andOriginnertransnbrLessThan(String value) {
            addCriterion("ORIGINNERTRANSNBR <", value, "originnertransnbr");
            return (Criteria) this;
        }

        public Criteria andOriginnertransnbrLessThanOrEqualTo(String value) {
            addCriterion("ORIGINNERTRANSNBR <=", value, "originnertransnbr");
            return (Criteria) this;
        }

        public Criteria andOriginnertransnbrLike(String value) {
            addCriterion("ORIGINNERTRANSNBR like", value, "originnertransnbr");
            return (Criteria) this;
        }

        public Criteria andOriginnertransnbrNotLike(String value) {
            addCriterion("ORIGINNERTRANSNBR not like", value, "originnertransnbr");
            return (Criteria) this;
        }

        public Criteria andOriginnertransnbrIn(List<String> values) {
            addCriterion("ORIGINNERTRANSNBR in", values, "originnertransnbr");
            return (Criteria) this;
        }

        public Criteria andOriginnertransnbrNotIn(List<String> values) {
            addCriterion("ORIGINNERTRANSNBR not in", values, "originnertransnbr");
            return (Criteria) this;
        }

        public Criteria andOriginnertransnbrBetween(String value1, String value2) {
            addCriterion("ORIGINNERTRANSNBR between", value1, value2, "originnertransnbr");
            return (Criteria) this;
        }

        public Criteria andOriginnertransnbrNotBetween(String value1, String value2) {
            addCriterion("ORIGINNERTRANSNBR not between", value1, value2, "originnertransnbr");
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

        public Criteria andReturncodeIsNull() {
            addCriterion("RETURNCODE is null");
            return (Criteria) this;
        }

        public Criteria andReturncodeIsNotNull() {
            addCriterion("RETURNCODE is not null");
            return (Criteria) this;
        }

        public Criteria andReturncodeEqualTo(String value) {
            addCriterion("RETURNCODE =", value, "returncode");
            return (Criteria) this;
        }

        public Criteria andReturncodeNotEqualTo(String value) {
            addCriterion("RETURNCODE <>", value, "returncode");
            return (Criteria) this;
        }

        public Criteria andReturncodeGreaterThan(String value) {
            addCriterion("RETURNCODE >", value, "returncode");
            return (Criteria) this;
        }

        public Criteria andReturncodeGreaterThanOrEqualTo(String value) {
            addCriterion("RETURNCODE >=", value, "returncode");
            return (Criteria) this;
        }

        public Criteria andReturncodeLessThan(String value) {
            addCriterion("RETURNCODE <", value, "returncode");
            return (Criteria) this;
        }

        public Criteria andReturncodeLessThanOrEqualTo(String value) {
            addCriterion("RETURNCODE <=", value, "returncode");
            return (Criteria) this;
        }

        public Criteria andReturncodeLike(String value) {
            addCriterion("RETURNCODE like", value, "returncode");
            return (Criteria) this;
        }

        public Criteria andReturncodeNotLike(String value) {
            addCriterion("RETURNCODE not like", value, "returncode");
            return (Criteria) this;
        }

        public Criteria andReturncodeIn(List<String> values) {
            addCriterion("RETURNCODE in", values, "returncode");
            return (Criteria) this;
        }

        public Criteria andReturncodeNotIn(List<String> values) {
            addCriterion("RETURNCODE not in", values, "returncode");
            return (Criteria) this;
        }

        public Criteria andReturncodeBetween(String value1, String value2) {
            addCriterion("RETURNCODE between", value1, value2, "returncode");
            return (Criteria) this;
        }

        public Criteria andReturncodeNotBetween(String value1, String value2) {
            addCriterion("RETURNCODE not between", value1, value2, "returncode");
            return (Criteria) this;
        }

        public Criteria andReturnmsgIsNull() {
            addCriterion("RETURNMSG is null");
            return (Criteria) this;
        }

        public Criteria andReturnmsgIsNotNull() {
            addCriterion("RETURNMSG is not null");
            return (Criteria) this;
        }

        public Criteria andReturnmsgEqualTo(String value) {
            addCriterion("RETURNMSG =", value, "returnmsg");
            return (Criteria) this;
        }

        public Criteria andReturnmsgNotEqualTo(String value) {
            addCriterion("RETURNMSG <>", value, "returnmsg");
            return (Criteria) this;
        }

        public Criteria andReturnmsgGreaterThan(String value) {
            addCriterion("RETURNMSG >", value, "returnmsg");
            return (Criteria) this;
        }

        public Criteria andReturnmsgGreaterThanOrEqualTo(String value) {
            addCriterion("RETURNMSG >=", value, "returnmsg");
            return (Criteria) this;
        }

        public Criteria andReturnmsgLessThan(String value) {
            addCriterion("RETURNMSG <", value, "returnmsg");
            return (Criteria) this;
        }

        public Criteria andReturnmsgLessThanOrEqualTo(String value) {
            addCriterion("RETURNMSG <=", value, "returnmsg");
            return (Criteria) this;
        }

        public Criteria andReturnmsgLike(String value) {
            addCriterion("RETURNMSG like", value, "returnmsg");
            return (Criteria) this;
        }

        public Criteria andReturnmsgNotLike(String value) {
            addCriterion("RETURNMSG not like", value, "returnmsg");
            return (Criteria) this;
        }

        public Criteria andReturnmsgIn(List<String> values) {
            addCriterion("RETURNMSG in", values, "returnmsg");
            return (Criteria) this;
        }

        public Criteria andReturnmsgNotIn(List<String> values) {
            addCriterion("RETURNMSG not in", values, "returnmsg");
            return (Criteria) this;
        }

        public Criteria andReturnmsgBetween(String value1, String value2) {
            addCriterion("RETURNMSG between", value1, value2, "returnmsg");
            return (Criteria) this;
        }

        public Criteria andReturnmsgNotBetween(String value1, String value2) {
            addCriterion("RETURNMSG not between", value1, value2, "returnmsg");
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

        public Criteria andDowntransnbrIsNull() {
            addCriterion("DOWNTRANSNBR is null");
            return (Criteria) this;
        }

        public Criteria andDowntransnbrIsNotNull() {
            addCriterion("DOWNTRANSNBR is not null");
            return (Criteria) this;
        }

        public Criteria andDowntransnbrEqualTo(String value) {
            addCriterion("DOWNTRANSNBR =", value, "downtransnbr");
            return (Criteria) this;
        }

        public Criteria andDowntransnbrNotEqualTo(String value) {
            addCriterion("DOWNTRANSNBR <>", value, "downtransnbr");
            return (Criteria) this;
        }

        public Criteria andDowntransnbrGreaterThan(String value) {
            addCriterion("DOWNTRANSNBR >", value, "downtransnbr");
            return (Criteria) this;
        }

        public Criteria andDowntransnbrGreaterThanOrEqualTo(String value) {
            addCriterion("DOWNTRANSNBR >=", value, "downtransnbr");
            return (Criteria) this;
        }

        public Criteria andDowntransnbrLessThan(String value) {
            addCriterion("DOWNTRANSNBR <", value, "downtransnbr");
            return (Criteria) this;
        }

        public Criteria andDowntransnbrLessThanOrEqualTo(String value) {
            addCriterion("DOWNTRANSNBR <=", value, "downtransnbr");
            return (Criteria) this;
        }

        public Criteria andDowntransnbrLike(String value) {
            addCriterion("DOWNTRANSNBR like", value, "downtransnbr");
            return (Criteria) this;
        }

        public Criteria andDowntransnbrNotLike(String value) {
            addCriterion("DOWNTRANSNBR not like", value, "downtransnbr");
            return (Criteria) this;
        }

        public Criteria andDowntransnbrIn(List<String> values) {
            addCriterion("DOWNTRANSNBR in", values, "downtransnbr");
            return (Criteria) this;
        }

        public Criteria andDowntransnbrNotIn(List<String> values) {
            addCriterion("DOWNTRANSNBR not in", values, "downtransnbr");
            return (Criteria) this;
        }

        public Criteria andDowntransnbrBetween(String value1, String value2) {
            addCriterion("DOWNTRANSNBR between", value1, value2, "downtransnbr");
            return (Criteria) this;
        }

        public Criteria andDowntransnbrNotBetween(String value1, String value2) {
            addCriterion("DOWNTRANSNBR not between", value1, value2, "downtransnbr");
            return (Criteria) this;
        }

        public Criteria andDowntransdateIsNull() {
            addCriterion("DOWNTRANSDATE is null");
            return (Criteria) this;
        }

        public Criteria andDowntransdateIsNotNull() {
            addCriterion("DOWNTRANSDATE is not null");
            return (Criteria) this;
        }

        public Criteria andDowntransdateEqualTo(Date value) {
            addCriterion("DOWNTRANSDATE =", value, "downtransdate");
            return (Criteria) this;
        }

        public Criteria andDowntransdateNotEqualTo(Date value) {
            addCriterion("DOWNTRANSDATE <>", value, "downtransdate");
            return (Criteria) this;
        }

        public Criteria andDowntransdateGreaterThan(Date value) {
            addCriterion("DOWNTRANSDATE >", value, "downtransdate");
            return (Criteria) this;
        }

        public Criteria andDowntransdateGreaterThanOrEqualTo(Date value) {
            addCriterion("DOWNTRANSDATE >=", value, "downtransdate");
            return (Criteria) this;
        }

        public Criteria andDowntransdateLessThan(Date value) {
            addCriterion("DOWNTRANSDATE <", value, "downtransdate");
            return (Criteria) this;
        }

        public Criteria andDowntransdateLessThanOrEqualTo(Date value) {
            addCriterion("DOWNTRANSDATE <=", value, "downtransdate");
            return (Criteria) this;
        }

        public Criteria andDowntransdateIn(List<Date> values) {
            addCriterion("DOWNTRANSDATE in", values, "downtransdate");
            return (Criteria) this;
        }

        public Criteria andDowntransdateNotIn(List<Date> values) {
            addCriterion("DOWNTRANSDATE not in", values, "downtransdate");
            return (Criteria) this;
        }

        public Criteria andDowntransdateBetween(Date value1, Date value2) {
            addCriterion("DOWNTRANSDATE between", value1, value2, "downtransdate");
            return (Criteria) this;
        }

        public Criteria andDowntransdateNotBetween(Date value1, Date value2) {
            addCriterion("DOWNTRANSDATE not between", value1, value2, "downtransdate");
            return (Criteria) this;
        }

        public Criteria andDowntranstimeIsNull() {
            addCriterion("DOWNTRANSTIME is null");
            return (Criteria) this;
        }

        public Criteria andDowntranstimeIsNotNull() {
            addCriterion("DOWNTRANSTIME is not null");
            return (Criteria) this;
        }

        public Criteria andDowntranstimeEqualTo(Date value) {
            addCriterion("DOWNTRANSTIME =", value, "downtranstime");
            return (Criteria) this;
        }

        public Criteria andDowntranstimeNotEqualTo(Date value) {
            addCriterion("DOWNTRANSTIME <>", value, "downtranstime");
            return (Criteria) this;
        }

        public Criteria andDowntranstimeGreaterThan(Date value) {
            addCriterion("DOWNTRANSTIME >", value, "downtranstime");
            return (Criteria) this;
        }

        public Criteria andDowntranstimeGreaterThanOrEqualTo(Date value) {
            addCriterion("DOWNTRANSTIME >=", value, "downtranstime");
            return (Criteria) this;
        }

        public Criteria andDowntranstimeLessThan(Date value) {
            addCriterion("DOWNTRANSTIME <", value, "downtranstime");
            return (Criteria) this;
        }

        public Criteria andDowntranstimeLessThanOrEqualTo(Date value) {
            addCriterion("DOWNTRANSTIME <=", value, "downtranstime");
            return (Criteria) this;
        }

        public Criteria andDowntranstimeIn(List<Date> values) {
            addCriterion("DOWNTRANSTIME in", values, "downtranstime");
            return (Criteria) this;
        }

        public Criteria andDowntranstimeNotIn(List<Date> values) {
            addCriterion("DOWNTRANSTIME not in", values, "downtranstime");
            return (Criteria) this;
        }

        public Criteria andDowntranstimeBetween(Date value1, Date value2) {
            addCriterion("DOWNTRANSTIME between", value1, value2, "downtranstime");
            return (Criteria) this;
        }

        public Criteria andDowntranstimeNotBetween(Date value1, Date value2) {
            addCriterion("DOWNTRANSTIME not between", value1, value2, "downtranstime");
            return (Criteria) this;
        }

        public Criteria andDownsysnbrIsNull() {
            addCriterion("DOWNSYSNBR is null");
            return (Criteria) this;
        }

        public Criteria andDownsysnbrIsNotNull() {
            addCriterion("DOWNSYSNBR is not null");
            return (Criteria) this;
        }

        public Criteria andDownsysnbrEqualTo(String value) {
            addCriterion("DOWNSYSNBR =", value, "downsysnbr");
            return (Criteria) this;
        }

        public Criteria andDownsysnbrNotEqualTo(String value) {
            addCriterion("DOWNSYSNBR <>", value, "downsysnbr");
            return (Criteria) this;
        }

        public Criteria andDownsysnbrGreaterThan(String value) {
            addCriterion("DOWNSYSNBR >", value, "downsysnbr");
            return (Criteria) this;
        }

        public Criteria andDownsysnbrGreaterThanOrEqualTo(String value) {
            addCriterion("DOWNSYSNBR >=", value, "downsysnbr");
            return (Criteria) this;
        }

        public Criteria andDownsysnbrLessThan(String value) {
            addCriterion("DOWNSYSNBR <", value, "downsysnbr");
            return (Criteria) this;
        }

        public Criteria andDownsysnbrLessThanOrEqualTo(String value) {
            addCriterion("DOWNSYSNBR <=", value, "downsysnbr");
            return (Criteria) this;
        }

        public Criteria andDownsysnbrLike(String value) {
            addCriterion("DOWNSYSNBR like", value, "downsysnbr");
            return (Criteria) this;
        }

        public Criteria andDownsysnbrNotLike(String value) {
            addCriterion("DOWNSYSNBR not like", value, "downsysnbr");
            return (Criteria) this;
        }

        public Criteria andDownsysnbrIn(List<String> values) {
            addCriterion("DOWNSYSNBR in", values, "downsysnbr");
            return (Criteria) this;
        }

        public Criteria andDownsysnbrNotIn(List<String> values) {
            addCriterion("DOWNSYSNBR not in", values, "downsysnbr");
            return (Criteria) this;
        }

        public Criteria andDownsysnbrBetween(String value1, String value2) {
            addCriterion("DOWNSYSNBR between", value1, value2, "downsysnbr");
            return (Criteria) this;
        }

        public Criteria andDownsysnbrNotBetween(String value1, String value2) {
            addCriterion("DOWNSYSNBR not between", value1, value2, "downsysnbr");
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

        public Criteria andCheckdataflagIsNull() {
            addCriterion("CHECKDATAFLAG is null");
            return (Criteria) this;
        }

        public Criteria andCheckdataflagIsNotNull() {
            addCriterion("CHECKDATAFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andCheckdataflagEqualTo(String value) {
            addCriterion("CHECKDATAFLAG =", value, "checkdataflag");
            return (Criteria) this;
        }

        public Criteria andCheckdataflagNotEqualTo(String value) {
            addCriterion("CHECKDATAFLAG <>", value, "checkdataflag");
            return (Criteria) this;
        }

        public Criteria andCheckdataflagGreaterThan(String value) {
            addCriterion("CHECKDATAFLAG >", value, "checkdataflag");
            return (Criteria) this;
        }

        public Criteria andCheckdataflagGreaterThanOrEqualTo(String value) {
            addCriterion("CHECKDATAFLAG >=", value, "checkdataflag");
            return (Criteria) this;
        }

        public Criteria andCheckdataflagLessThan(String value) {
            addCriterion("CHECKDATAFLAG <", value, "checkdataflag");
            return (Criteria) this;
        }

        public Criteria andCheckdataflagLessThanOrEqualTo(String value) {
            addCriterion("CHECKDATAFLAG <=", value, "checkdataflag");
            return (Criteria) this;
        }

        public Criteria andCheckdataflagLike(String value) {
            addCriterion("CHECKDATAFLAG like", value, "checkdataflag");
            return (Criteria) this;
        }

        public Criteria andCheckdataflagNotLike(String value) {
            addCriterion("CHECKDATAFLAG not like", value, "checkdataflag");
            return (Criteria) this;
        }

        public Criteria andCheckdataflagIn(List<String> values) {
            addCriterion("CHECKDATAFLAG in", values, "checkdataflag");
            return (Criteria) this;
        }

        public Criteria andCheckdataflagNotIn(List<String> values) {
            addCriterion("CHECKDATAFLAG not in", values, "checkdataflag");
            return (Criteria) this;
        }

        public Criteria andCheckdataflagBetween(String value1, String value2) {
            addCriterion("CHECKDATAFLAG between", value1, value2, "checkdataflag");
            return (Criteria) this;
        }

        public Criteria andCheckdataflagNotBetween(String value1, String value2) {
            addCriterion("CHECKDATAFLAG not between", value1, value2, "checkdataflag");
            return (Criteria) this;
        }

        public Criteria andPointdataflagIsNull() {
            addCriterion("POINTDATAFLAG is null");
            return (Criteria) this;
        }

        public Criteria andPointdataflagIsNotNull() {
            addCriterion("POINTDATAFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andPointdataflagEqualTo(String value) {
            addCriterion("POINTDATAFLAG =", value, "pointdataflag");
            return (Criteria) this;
        }

        public Criteria andPointdataflagNotEqualTo(String value) {
            addCriterion("POINTDATAFLAG <>", value, "pointdataflag");
            return (Criteria) this;
        }

        public Criteria andPointdataflagGreaterThan(String value) {
            addCriterion("POINTDATAFLAG >", value, "pointdataflag");
            return (Criteria) this;
        }

        public Criteria andPointdataflagGreaterThanOrEqualTo(String value) {
            addCriterion("POINTDATAFLAG >=", value, "pointdataflag");
            return (Criteria) this;
        }

        public Criteria andPointdataflagLessThan(String value) {
            addCriterion("POINTDATAFLAG <", value, "pointdataflag");
            return (Criteria) this;
        }

        public Criteria andPointdataflagLessThanOrEqualTo(String value) {
            addCriterion("POINTDATAFLAG <=", value, "pointdataflag");
            return (Criteria) this;
        }

        public Criteria andPointdataflagLike(String value) {
            addCriterion("POINTDATAFLAG like", value, "pointdataflag");
            return (Criteria) this;
        }

        public Criteria andPointdataflagNotLike(String value) {
            addCriterion("POINTDATAFLAG not like", value, "pointdataflag");
            return (Criteria) this;
        }

        public Criteria andPointdataflagIn(List<String> values) {
            addCriterion("POINTDATAFLAG in", values, "pointdataflag");
            return (Criteria) this;
        }

        public Criteria andPointdataflagNotIn(List<String> values) {
            addCriterion("POINTDATAFLAG not in", values, "pointdataflag");
            return (Criteria) this;
        }

        public Criteria andPointdataflagBetween(String value1, String value2) {
            addCriterion("POINTDATAFLAG between", value1, value2, "pointdataflag");
            return (Criteria) this;
        }

        public Criteria andPointdataflagNotBetween(String value1, String value2) {
            addCriterion("POINTDATAFLAG not between", value1, value2, "pointdataflag");
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

        public Criteria andBiztracknoIsNull() {
            addCriterion("BIZTRACKNO is null");
            return (Criteria) this;
        }

        public Criteria andBiztracknoIsNotNull() {
            addCriterion("BIZTRACKNO is not null");
            return (Criteria) this;
        }

        public Criteria andBiztracknoEqualTo(String value) {
            addCriterion("BIZTRACKNO =", value, "biztrackno");
            return (Criteria) this;
        }

        public Criteria andBiztracknoNotEqualTo(String value) {
            addCriterion("BIZTRACKNO <>", value, "biztrackno");
            return (Criteria) this;
        }

        public Criteria andBiztracknoGreaterThan(String value) {
            addCriterion("BIZTRACKNO >", value, "biztrackno");
            return (Criteria) this;
        }

        public Criteria andBiztracknoGreaterThanOrEqualTo(String value) {
            addCriterion("BIZTRACKNO >=", value, "biztrackno");
            return (Criteria) this;
        }

        public Criteria andBiztracknoLessThan(String value) {
            addCriterion("BIZTRACKNO <", value, "biztrackno");
            return (Criteria) this;
        }

        public Criteria andBiztracknoLessThanOrEqualTo(String value) {
            addCriterion("BIZTRACKNO <=", value, "biztrackno");
            return (Criteria) this;
        }

        public Criteria andBiztracknoLike(String value) {
            addCriterion("BIZTRACKNO like", value, "biztrackno");
            return (Criteria) this;
        }

        public Criteria andBiztracknoNotLike(String value) {
            addCriterion("BIZTRACKNO not like", value, "biztrackno");
            return (Criteria) this;
        }

        public Criteria andBiztracknoIn(List<String> values) {
            addCriterion("BIZTRACKNO in", values, "biztrackno");
            return (Criteria) this;
        }

        public Criteria andBiztracknoNotIn(List<String> values) {
            addCriterion("BIZTRACKNO not in", values, "biztrackno");
            return (Criteria) this;
        }

        public Criteria andBiztracknoBetween(String value1, String value2) {
            addCriterion("BIZTRACKNO between", value1, value2, "biztrackno");
            return (Criteria) this;
        }

        public Criteria andBiztracknoNotBetween(String value1, String value2) {
            addCriterion("BIZTRACKNO not between", value1, value2, "biztrackno");
            return (Criteria) this;
        }

        public Criteria andDevdeptnbrIsNull() {
            addCriterion("DEVDEPTNBR is null");
            return (Criteria) this;
        }

        public Criteria andDevdeptnbrIsNotNull() {
            addCriterion("DEVDEPTNBR is not null");
            return (Criteria) this;
        }

        public Criteria andDevdeptnbrEqualTo(String value) {
            addCriterion("DEVDEPTNBR =", value, "devdeptnbr");
            return (Criteria) this;
        }

        public Criteria andDevdeptnbrNotEqualTo(String value) {
            addCriterion("DEVDEPTNBR <>", value, "devdeptnbr");
            return (Criteria) this;
        }

        public Criteria andDevdeptnbrGreaterThan(String value) {
            addCriterion("DEVDEPTNBR >", value, "devdeptnbr");
            return (Criteria) this;
        }

        public Criteria andDevdeptnbrGreaterThanOrEqualTo(String value) {
            addCriterion("DEVDEPTNBR >=", value, "devdeptnbr");
            return (Criteria) this;
        }

        public Criteria andDevdeptnbrLessThan(String value) {
            addCriterion("DEVDEPTNBR <", value, "devdeptnbr");
            return (Criteria) this;
        }

        public Criteria andDevdeptnbrLessThanOrEqualTo(String value) {
            addCriterion("DEVDEPTNBR <=", value, "devdeptnbr");
            return (Criteria) this;
        }

        public Criteria andDevdeptnbrLike(String value) {
            addCriterion("DEVDEPTNBR like", value, "devdeptnbr");
            return (Criteria) this;
        }

        public Criteria andDevdeptnbrNotLike(String value) {
            addCriterion("DEVDEPTNBR not like", value, "devdeptnbr");
            return (Criteria) this;
        }

        public Criteria andDevdeptnbrIn(List<String> values) {
            addCriterion("DEVDEPTNBR in", values, "devdeptnbr");
            return (Criteria) this;
        }

        public Criteria andDevdeptnbrNotIn(List<String> values) {
            addCriterion("DEVDEPTNBR not in", values, "devdeptnbr");
            return (Criteria) this;
        }

        public Criteria andDevdeptnbrBetween(String value1, String value2) {
            addCriterion("DEVDEPTNBR between", value1, value2, "devdeptnbr");
            return (Criteria) this;
        }

        public Criteria andDevdeptnbrNotBetween(String value1, String value2) {
            addCriterion("DEVDEPTNBR not between", value1, value2, "devdeptnbr");
            return (Criteria) this;
        }

        public Criteria andCheckdateIsNull() {
            addCriterion("CHECKDATE is null");
            return (Criteria) this;
        }

        public Criteria andCheckdateIsNotNull() {
            addCriterion("CHECKDATE is not null");
            return (Criteria) this;
        }

        public Criteria andCheckdateEqualTo(Date value) {
            addCriterion("CHECKDATE =", value, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateNotEqualTo(Date value) {
            addCriterion("CHECKDATE <>", value, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateGreaterThan(Date value) {
            addCriterion("CHECKDATE >", value, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateGreaterThanOrEqualTo(Date value) {
            addCriterion("CHECKDATE >=", value, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateLessThan(Date value) {
            addCriterion("CHECKDATE <", value, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateLessThanOrEqualTo(Date value) {
            addCriterion("CHECKDATE <=", value, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateIn(List<Date> values) {
            addCriterion("CHECKDATE in", values, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateNotIn(List<Date> values) {
            addCriterion("CHECKDATE not in", values, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateBetween(Date value1, Date value2) {
            addCriterion("CHECKDATE between", value1, value2, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateNotBetween(Date value1, Date value2) {
            addCriterion("CHECKDATE not between", value1, value2, "checkdate");
            return (Criteria) this;
        }

        public Criteria andDelayaccflagIsNull() {
            addCriterion("DELAYACCFLAG is null");
            return (Criteria) this;
        }

        public Criteria andDelayaccflagIsNotNull() {
            addCriterion("DELAYACCFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andDelayaccflagEqualTo(String value) {
            addCriterion("DELAYACCFLAG =", value, "delayaccflag");
            return (Criteria) this;
        }

        public Criteria andDelayaccflagNotEqualTo(String value) {
            addCriterion("DELAYACCFLAG <>", value, "delayaccflag");
            return (Criteria) this;
        }

        public Criteria andDelayaccflagGreaterThan(String value) {
            addCriterion("DELAYACCFLAG >", value, "delayaccflag");
            return (Criteria) this;
        }

        public Criteria andDelayaccflagGreaterThanOrEqualTo(String value) {
            addCriterion("DELAYACCFLAG >=", value, "delayaccflag");
            return (Criteria) this;
        }

        public Criteria andDelayaccflagLessThan(String value) {
            addCriterion("DELAYACCFLAG <", value, "delayaccflag");
            return (Criteria) this;
        }

        public Criteria andDelayaccflagLessThanOrEqualTo(String value) {
            addCriterion("DELAYACCFLAG <=", value, "delayaccflag");
            return (Criteria) this;
        }

        public Criteria andDelayaccflagLike(String value) {
            addCriterion("DELAYACCFLAG like", value, "delayaccflag");
            return (Criteria) this;
        }

        public Criteria andDelayaccflagNotLike(String value) {
            addCriterion("DELAYACCFLAG not like", value, "delayaccflag");
            return (Criteria) this;
        }

        public Criteria andDelayaccflagIn(List<String> values) {
            addCriterion("DELAYACCFLAG in", values, "delayaccflag");
            return (Criteria) this;
        }

        public Criteria andDelayaccflagNotIn(List<String> values) {
            addCriterion("DELAYACCFLAG not in", values, "delayaccflag");
            return (Criteria) this;
        }

        public Criteria andDelayaccflagBetween(String value1, String value2) {
            addCriterion("DELAYACCFLAG between", value1, value2, "delayaccflag");
            return (Criteria) this;
        }

        public Criteria andDelayaccflagNotBetween(String value1, String value2) {
            addCriterion("DELAYACCFLAG not between", value1, value2, "delayaccflag");
            return (Criteria) this;
        }

        public Criteria andOthercorecleardateIsNull() {
            addCriterion("OTHERCORECLEARDATE is null");
            return (Criteria) this;
        }

        public Criteria andOthercorecleardateIsNotNull() {
            addCriterion("OTHERCORECLEARDATE is not null");
            return (Criteria) this;
        }

        public Criteria andOthercorecleardateEqualTo(Date value) {
            addCriterion("OTHERCORECLEARDATE =", value, "othercorecleardate");
            return (Criteria) this;
        }

        public Criteria andOthercorecleardateNotEqualTo(Date value) {
            addCriterion("OTHERCORECLEARDATE <>", value, "othercorecleardate");
            return (Criteria) this;
        }

        public Criteria andOthercorecleardateGreaterThan(Date value) {
            addCriterion("OTHERCORECLEARDATE >", value, "othercorecleardate");
            return (Criteria) this;
        }

        public Criteria andOthercorecleardateGreaterThanOrEqualTo(Date value) {
            addCriterion("OTHERCORECLEARDATE >=", value, "othercorecleardate");
            return (Criteria) this;
        }

        public Criteria andOthercorecleardateLessThan(Date value) {
            addCriterion("OTHERCORECLEARDATE <", value, "othercorecleardate");
            return (Criteria) this;
        }

        public Criteria andOthercorecleardateLessThanOrEqualTo(Date value) {
            addCriterion("OTHERCORECLEARDATE <=", value, "othercorecleardate");
            return (Criteria) this;
        }

        public Criteria andOthercorecleardateIn(List<Date> values) {
            addCriterion("OTHERCORECLEARDATE in", values, "othercorecleardate");
            return (Criteria) this;
        }

        public Criteria andOthercorecleardateNotIn(List<Date> values) {
            addCriterion("OTHERCORECLEARDATE not in", values, "othercorecleardate");
            return (Criteria) this;
        }

        public Criteria andOthercorecleardateBetween(Date value1, Date value2) {
            addCriterion("OTHERCORECLEARDATE between", value1, value2, "othercorecleardate");
            return (Criteria) this;
        }

        public Criteria andOthercorecleardateNotBetween(Date value1, Date value2) {
            addCriterion("OTHERCORECLEARDATE not between", value1, value2, "othercorecleardate");
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