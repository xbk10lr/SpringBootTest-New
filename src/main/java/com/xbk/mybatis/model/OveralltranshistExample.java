package com.xbk.mybatis.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OveralltranshistExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OveralltranshistExample() {
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

        public Criteria andOveralltranstypcdIsNull() {
            addCriterion("OVERALLTRANSTYPCD is null");
            return (Criteria) this;
        }

        public Criteria andOveralltranstypcdIsNotNull() {
            addCriterion("OVERALLTRANSTYPCD is not null");
            return (Criteria) this;
        }

        public Criteria andOveralltranstypcdEqualTo(String value) {
            addCriterion("OVERALLTRANSTYPCD =", value, "overalltranstypcd");
            return (Criteria) this;
        }

        public Criteria andOveralltranstypcdNotEqualTo(String value) {
            addCriterion("OVERALLTRANSTYPCD <>", value, "overalltranstypcd");
            return (Criteria) this;
        }

        public Criteria andOveralltranstypcdGreaterThan(String value) {
            addCriterion("OVERALLTRANSTYPCD >", value, "overalltranstypcd");
            return (Criteria) this;
        }

        public Criteria andOveralltranstypcdGreaterThanOrEqualTo(String value) {
            addCriterion("OVERALLTRANSTYPCD >=", value, "overalltranstypcd");
            return (Criteria) this;
        }

        public Criteria andOveralltranstypcdLessThan(String value) {
            addCriterion("OVERALLTRANSTYPCD <", value, "overalltranstypcd");
            return (Criteria) this;
        }

        public Criteria andOveralltranstypcdLessThanOrEqualTo(String value) {
            addCriterion("OVERALLTRANSTYPCD <=", value, "overalltranstypcd");
            return (Criteria) this;
        }

        public Criteria andOveralltranstypcdLike(String value) {
            addCriterion("OVERALLTRANSTYPCD like", value, "overalltranstypcd");
            return (Criteria) this;
        }

        public Criteria andOveralltranstypcdNotLike(String value) {
            addCriterion("OVERALLTRANSTYPCD not like", value, "overalltranstypcd");
            return (Criteria) this;
        }

        public Criteria andOveralltranstypcdIn(List<String> values) {
            addCriterion("OVERALLTRANSTYPCD in", values, "overalltranstypcd");
            return (Criteria) this;
        }

        public Criteria andOveralltranstypcdNotIn(List<String> values) {
            addCriterion("OVERALLTRANSTYPCD not in", values, "overalltranstypcd");
            return (Criteria) this;
        }

        public Criteria andOveralltranstypcdBetween(String value1, String value2) {
            addCriterion("OVERALLTRANSTYPCD between", value1, value2, "overalltranstypcd");
            return (Criteria) this;
        }

        public Criteria andOveralltranstypcdNotBetween(String value1, String value2) {
            addCriterion("OVERALLTRANSTYPCD not between", value1, value2, "overalltranstypcd");
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

        public Criteria andOveralltransstatusIsNull() {
            addCriterion("OVERALLTRANSSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andOveralltransstatusIsNotNull() {
            addCriterion("OVERALLTRANSSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andOveralltransstatusEqualTo(String value) {
            addCriterion("OVERALLTRANSSTATUS =", value, "overalltransstatus");
            return (Criteria) this;
        }

        public Criteria andOveralltransstatusNotEqualTo(String value) {
            addCriterion("OVERALLTRANSSTATUS <>", value, "overalltransstatus");
            return (Criteria) this;
        }

        public Criteria andOveralltransstatusGreaterThan(String value) {
            addCriterion("OVERALLTRANSSTATUS >", value, "overalltransstatus");
            return (Criteria) this;
        }

        public Criteria andOveralltransstatusGreaterThanOrEqualTo(String value) {
            addCriterion("OVERALLTRANSSTATUS >=", value, "overalltransstatus");
            return (Criteria) this;
        }

        public Criteria andOveralltransstatusLessThan(String value) {
            addCriterion("OVERALLTRANSSTATUS <", value, "overalltransstatus");
            return (Criteria) this;
        }

        public Criteria andOveralltransstatusLessThanOrEqualTo(String value) {
            addCriterion("OVERALLTRANSSTATUS <=", value, "overalltransstatus");
            return (Criteria) this;
        }

        public Criteria andOveralltransstatusLike(String value) {
            addCriterion("OVERALLTRANSSTATUS like", value, "overalltransstatus");
            return (Criteria) this;
        }

        public Criteria andOveralltransstatusNotLike(String value) {
            addCriterion("OVERALLTRANSSTATUS not like", value, "overalltransstatus");
            return (Criteria) this;
        }

        public Criteria andOveralltransstatusIn(List<String> values) {
            addCriterion("OVERALLTRANSSTATUS in", values, "overalltransstatus");
            return (Criteria) this;
        }

        public Criteria andOveralltransstatusNotIn(List<String> values) {
            addCriterion("OVERALLTRANSSTATUS not in", values, "overalltransstatus");
            return (Criteria) this;
        }

        public Criteria andOveralltransstatusBetween(String value1, String value2) {
            addCriterion("OVERALLTRANSSTATUS between", value1, value2, "overalltransstatus");
            return (Criteria) this;
        }

        public Criteria andOveralltransstatusNotBetween(String value1, String value2) {
            addCriterion("OVERALLTRANSSTATUS not between", value1, value2, "overalltransstatus");
            return (Criteria) this;
        }

        public Criteria andMemoIsNull() {
            addCriterion("MEMO is null");
            return (Criteria) this;
        }

        public Criteria andMemoIsNotNull() {
            addCriterion("MEMO is not null");
            return (Criteria) this;
        }

        public Criteria andMemoEqualTo(String value) {
            addCriterion("MEMO =", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotEqualTo(String value) {
            addCriterion("MEMO <>", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThan(String value) {
            addCriterion("MEMO >", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThanOrEqualTo(String value) {
            addCriterion("MEMO >=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThan(String value) {
            addCriterion("MEMO <", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThanOrEqualTo(String value) {
            addCriterion("MEMO <=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLike(String value) {
            addCriterion("MEMO like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotLike(String value) {
            addCriterion("MEMO not like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoIn(List<String> values) {
            addCriterion("MEMO in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotIn(List<String> values) {
            addCriterion("MEMO not in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoBetween(String value1, String value2) {
            addCriterion("MEMO between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotBetween(String value1, String value2) {
            addCriterion("MEMO not between", value1, value2, "memo");
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

        public Criteria andOrigoveralltransnbrIsNull() {
            addCriterion("ORIGOVERALLTRANSNBR is null");
            return (Criteria) this;
        }

        public Criteria andOrigoveralltransnbrIsNotNull() {
            addCriterion("ORIGOVERALLTRANSNBR is not null");
            return (Criteria) this;
        }

        public Criteria andOrigoveralltransnbrEqualTo(String value) {
            addCriterion("ORIGOVERALLTRANSNBR =", value, "origoveralltransnbr");
            return (Criteria) this;
        }

        public Criteria andOrigoveralltransnbrNotEqualTo(String value) {
            addCriterion("ORIGOVERALLTRANSNBR <>", value, "origoveralltransnbr");
            return (Criteria) this;
        }

        public Criteria andOrigoveralltransnbrGreaterThan(String value) {
            addCriterion("ORIGOVERALLTRANSNBR >", value, "origoveralltransnbr");
            return (Criteria) this;
        }

        public Criteria andOrigoveralltransnbrGreaterThanOrEqualTo(String value) {
            addCriterion("ORIGOVERALLTRANSNBR >=", value, "origoveralltransnbr");
            return (Criteria) this;
        }

        public Criteria andOrigoveralltransnbrLessThan(String value) {
            addCriterion("ORIGOVERALLTRANSNBR <", value, "origoveralltransnbr");
            return (Criteria) this;
        }

        public Criteria andOrigoveralltransnbrLessThanOrEqualTo(String value) {
            addCriterion("ORIGOVERALLTRANSNBR <=", value, "origoveralltransnbr");
            return (Criteria) this;
        }

        public Criteria andOrigoveralltransnbrLike(String value) {
            addCriterion("ORIGOVERALLTRANSNBR like", value, "origoveralltransnbr");
            return (Criteria) this;
        }

        public Criteria andOrigoveralltransnbrNotLike(String value) {
            addCriterion("ORIGOVERALLTRANSNBR not like", value, "origoveralltransnbr");
            return (Criteria) this;
        }

        public Criteria andOrigoveralltransnbrIn(List<String> values) {
            addCriterion("ORIGOVERALLTRANSNBR in", values, "origoveralltransnbr");
            return (Criteria) this;
        }

        public Criteria andOrigoveralltransnbrNotIn(List<String> values) {
            addCriterion("ORIGOVERALLTRANSNBR not in", values, "origoveralltransnbr");
            return (Criteria) this;
        }

        public Criteria andOrigoveralltransnbrBetween(String value1, String value2) {
            addCriterion("ORIGOVERALLTRANSNBR between", value1, value2, "origoveralltransnbr");
            return (Criteria) this;
        }

        public Criteria andOrigoveralltransnbrNotBetween(String value1, String value2) {
            addCriterion("ORIGOVERALLTRANSNBR not between", value1, value2, "origoveralltransnbr");
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

        public Criteria andPayeeacctlistIsNull() {
            addCriterion("PAYEEACCTLIST is null");
            return (Criteria) this;
        }

        public Criteria andPayeeacctlistIsNotNull() {
            addCriterion("PAYEEACCTLIST is not null");
            return (Criteria) this;
        }

        public Criteria andPayeeacctlistEqualTo(String value) {
            addCriterion("PAYEEACCTLIST =", value, "payeeacctlist");
            return (Criteria) this;
        }

        public Criteria andPayeeacctlistNotEqualTo(String value) {
            addCriterion("PAYEEACCTLIST <>", value, "payeeacctlist");
            return (Criteria) this;
        }

        public Criteria andPayeeacctlistGreaterThan(String value) {
            addCriterion("PAYEEACCTLIST >", value, "payeeacctlist");
            return (Criteria) this;
        }

        public Criteria andPayeeacctlistGreaterThanOrEqualTo(String value) {
            addCriterion("PAYEEACCTLIST >=", value, "payeeacctlist");
            return (Criteria) this;
        }

        public Criteria andPayeeacctlistLessThan(String value) {
            addCriterion("PAYEEACCTLIST <", value, "payeeacctlist");
            return (Criteria) this;
        }

        public Criteria andPayeeacctlistLessThanOrEqualTo(String value) {
            addCriterion("PAYEEACCTLIST <=", value, "payeeacctlist");
            return (Criteria) this;
        }

        public Criteria andPayeeacctlistLike(String value) {
            addCriterion("PAYEEACCTLIST like", value, "payeeacctlist");
            return (Criteria) this;
        }

        public Criteria andPayeeacctlistNotLike(String value) {
            addCriterion("PAYEEACCTLIST not like", value, "payeeacctlist");
            return (Criteria) this;
        }

        public Criteria andPayeeacctlistIn(List<String> values) {
            addCriterion("PAYEEACCTLIST in", values, "payeeacctlist");
            return (Criteria) this;
        }

        public Criteria andPayeeacctlistNotIn(List<String> values) {
            addCriterion("PAYEEACCTLIST not in", values, "payeeacctlist");
            return (Criteria) this;
        }

        public Criteria andPayeeacctlistBetween(String value1, String value2) {
            addCriterion("PAYEEACCTLIST between", value1, value2, "payeeacctlist");
            return (Criteria) this;
        }

        public Criteria andPayeeacctlistNotBetween(String value1, String value2) {
            addCriterion("PAYEEACCTLIST not between", value1, value2, "payeeacctlist");
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

        public Criteria andPayeebanknbrIsNull() {
            addCriterion("PAYEEBANKNBR is null");
            return (Criteria) this;
        }

        public Criteria andPayeebanknbrIsNotNull() {
            addCriterion("PAYEEBANKNBR is not null");
            return (Criteria) this;
        }

        public Criteria andPayeebanknbrEqualTo(String value) {
            addCriterion("PAYEEBANKNBR =", value, "payeebanknbr");
            return (Criteria) this;
        }

        public Criteria andPayeebanknbrNotEqualTo(String value) {
            addCriterion("PAYEEBANKNBR <>", value, "payeebanknbr");
            return (Criteria) this;
        }

        public Criteria andPayeebanknbrGreaterThan(String value) {
            addCriterion("PAYEEBANKNBR >", value, "payeebanknbr");
            return (Criteria) this;
        }

        public Criteria andPayeebanknbrGreaterThanOrEqualTo(String value) {
            addCriterion("PAYEEBANKNBR >=", value, "payeebanknbr");
            return (Criteria) this;
        }

        public Criteria andPayeebanknbrLessThan(String value) {
            addCriterion("PAYEEBANKNBR <", value, "payeebanknbr");
            return (Criteria) this;
        }

        public Criteria andPayeebanknbrLessThanOrEqualTo(String value) {
            addCriterion("PAYEEBANKNBR <=", value, "payeebanknbr");
            return (Criteria) this;
        }

        public Criteria andPayeebanknbrLike(String value) {
            addCriterion("PAYEEBANKNBR like", value, "payeebanknbr");
            return (Criteria) this;
        }

        public Criteria andPayeebanknbrNotLike(String value) {
            addCriterion("PAYEEBANKNBR not like", value, "payeebanknbr");
            return (Criteria) this;
        }

        public Criteria andPayeebanknbrIn(List<String> values) {
            addCriterion("PAYEEBANKNBR in", values, "payeebanknbr");
            return (Criteria) this;
        }

        public Criteria andPayeebanknbrNotIn(List<String> values) {
            addCriterion("PAYEEBANKNBR not in", values, "payeebanknbr");
            return (Criteria) this;
        }

        public Criteria andPayeebanknbrBetween(String value1, String value2) {
            addCriterion("PAYEEBANKNBR between", value1, value2, "payeebanknbr");
            return (Criteria) this;
        }

        public Criteria andPayeebanknbrNotBetween(String value1, String value2) {
            addCriterion("PAYEEBANKNBR not between", value1, value2, "payeebanknbr");
            return (Criteria) this;
        }

        public Criteria andPayeebanknameIsNull() {
            addCriterion("PAYEEBANKNAME is null");
            return (Criteria) this;
        }

        public Criteria andPayeebanknameIsNotNull() {
            addCriterion("PAYEEBANKNAME is not null");
            return (Criteria) this;
        }

        public Criteria andPayeebanknameEqualTo(String value) {
            addCriterion("PAYEEBANKNAME =", value, "payeebankname");
            return (Criteria) this;
        }

        public Criteria andPayeebanknameNotEqualTo(String value) {
            addCriterion("PAYEEBANKNAME <>", value, "payeebankname");
            return (Criteria) this;
        }

        public Criteria andPayeebanknameGreaterThan(String value) {
            addCriterion("PAYEEBANKNAME >", value, "payeebankname");
            return (Criteria) this;
        }

        public Criteria andPayeebanknameGreaterThanOrEqualTo(String value) {
            addCriterion("PAYEEBANKNAME >=", value, "payeebankname");
            return (Criteria) this;
        }

        public Criteria andPayeebanknameLessThan(String value) {
            addCriterion("PAYEEBANKNAME <", value, "payeebankname");
            return (Criteria) this;
        }

        public Criteria andPayeebanknameLessThanOrEqualTo(String value) {
            addCriterion("PAYEEBANKNAME <=", value, "payeebankname");
            return (Criteria) this;
        }

        public Criteria andPayeebanknameLike(String value) {
            addCriterion("PAYEEBANKNAME like", value, "payeebankname");
            return (Criteria) this;
        }

        public Criteria andPayeebanknameNotLike(String value) {
            addCriterion("PAYEEBANKNAME not like", value, "payeebankname");
            return (Criteria) this;
        }

        public Criteria andPayeebanknameIn(List<String> values) {
            addCriterion("PAYEEBANKNAME in", values, "payeebankname");
            return (Criteria) this;
        }

        public Criteria andPayeebanknameNotIn(List<String> values) {
            addCriterion("PAYEEBANKNAME not in", values, "payeebankname");
            return (Criteria) this;
        }

        public Criteria andPayeebanknameBetween(String value1, String value2) {
            addCriterion("PAYEEBANKNAME between", value1, value2, "payeebankname");
            return (Criteria) this;
        }

        public Criteria andPayeebanknameNotBetween(String value1, String value2) {
            addCriterion("PAYEEBANKNAME not between", value1, value2, "payeebankname");
            return (Criteria) this;
        }

        public Criteria andPayerbanknbrIsNull() {
            addCriterion("PAYERBANKNBR is null");
            return (Criteria) this;
        }

        public Criteria andPayerbanknbrIsNotNull() {
            addCriterion("PAYERBANKNBR is not null");
            return (Criteria) this;
        }

        public Criteria andPayerbanknbrEqualTo(String value) {
            addCriterion("PAYERBANKNBR =", value, "payerbanknbr");
            return (Criteria) this;
        }

        public Criteria andPayerbanknbrNotEqualTo(String value) {
            addCriterion("PAYERBANKNBR <>", value, "payerbanknbr");
            return (Criteria) this;
        }

        public Criteria andPayerbanknbrGreaterThan(String value) {
            addCriterion("PAYERBANKNBR >", value, "payerbanknbr");
            return (Criteria) this;
        }

        public Criteria andPayerbanknbrGreaterThanOrEqualTo(String value) {
            addCriterion("PAYERBANKNBR >=", value, "payerbanknbr");
            return (Criteria) this;
        }

        public Criteria andPayerbanknbrLessThan(String value) {
            addCriterion("PAYERBANKNBR <", value, "payerbanknbr");
            return (Criteria) this;
        }

        public Criteria andPayerbanknbrLessThanOrEqualTo(String value) {
            addCriterion("PAYERBANKNBR <=", value, "payerbanknbr");
            return (Criteria) this;
        }

        public Criteria andPayerbanknbrLike(String value) {
            addCriterion("PAYERBANKNBR like", value, "payerbanknbr");
            return (Criteria) this;
        }

        public Criteria andPayerbanknbrNotLike(String value) {
            addCriterion("PAYERBANKNBR not like", value, "payerbanknbr");
            return (Criteria) this;
        }

        public Criteria andPayerbanknbrIn(List<String> values) {
            addCriterion("PAYERBANKNBR in", values, "payerbanknbr");
            return (Criteria) this;
        }

        public Criteria andPayerbanknbrNotIn(List<String> values) {
            addCriterion("PAYERBANKNBR not in", values, "payerbanknbr");
            return (Criteria) this;
        }

        public Criteria andPayerbanknbrBetween(String value1, String value2) {
            addCriterion("PAYERBANKNBR between", value1, value2, "payerbanknbr");
            return (Criteria) this;
        }

        public Criteria andPayerbanknbrNotBetween(String value1, String value2) {
            addCriterion("PAYERBANKNBR not between", value1, value2, "payerbanknbr");
            return (Criteria) this;
        }

        public Criteria andPayerbanknameIsNull() {
            addCriterion("PAYERBANKNAME is null");
            return (Criteria) this;
        }

        public Criteria andPayerbanknameIsNotNull() {
            addCriterion("PAYERBANKNAME is not null");
            return (Criteria) this;
        }

        public Criteria andPayerbanknameEqualTo(String value) {
            addCriterion("PAYERBANKNAME =", value, "payerbankname");
            return (Criteria) this;
        }

        public Criteria andPayerbanknameNotEqualTo(String value) {
            addCriterion("PAYERBANKNAME <>", value, "payerbankname");
            return (Criteria) this;
        }

        public Criteria andPayerbanknameGreaterThan(String value) {
            addCriterion("PAYERBANKNAME >", value, "payerbankname");
            return (Criteria) this;
        }

        public Criteria andPayerbanknameGreaterThanOrEqualTo(String value) {
            addCriterion("PAYERBANKNAME >=", value, "payerbankname");
            return (Criteria) this;
        }

        public Criteria andPayerbanknameLessThan(String value) {
            addCriterion("PAYERBANKNAME <", value, "payerbankname");
            return (Criteria) this;
        }

        public Criteria andPayerbanknameLessThanOrEqualTo(String value) {
            addCriterion("PAYERBANKNAME <=", value, "payerbankname");
            return (Criteria) this;
        }

        public Criteria andPayerbanknameLike(String value) {
            addCriterion("PAYERBANKNAME like", value, "payerbankname");
            return (Criteria) this;
        }

        public Criteria andPayerbanknameNotLike(String value) {
            addCriterion("PAYERBANKNAME not like", value, "payerbankname");
            return (Criteria) this;
        }

        public Criteria andPayerbanknameIn(List<String> values) {
            addCriterion("PAYERBANKNAME in", values, "payerbankname");
            return (Criteria) this;
        }

        public Criteria andPayerbanknameNotIn(List<String> values) {
            addCriterion("PAYERBANKNAME not in", values, "payerbankname");
            return (Criteria) this;
        }

        public Criteria andPayerbanknameBetween(String value1, String value2) {
            addCriterion("PAYERBANKNAME between", value1, value2, "payerbankname");
            return (Criteria) this;
        }

        public Criteria andPayerbanknameNotBetween(String value1, String value2) {
            addCriterion("PAYERBANKNAME not between", value1, value2, "payerbankname");
            return (Criteria) this;
        }

        public Criteria andReasonIsNull() {
            addCriterion("REASON is null");
            return (Criteria) this;
        }

        public Criteria andReasonIsNotNull() {
            addCriterion("REASON is not null");
            return (Criteria) this;
        }

        public Criteria andReasonEqualTo(String value) {
            addCriterion("REASON =", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotEqualTo(String value) {
            addCriterion("REASON <>", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThan(String value) {
            addCriterion("REASON >", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThanOrEqualTo(String value) {
            addCriterion("REASON >=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThan(String value) {
            addCriterion("REASON <", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThanOrEqualTo(String value) {
            addCriterion("REASON <=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLike(String value) {
            addCriterion("REASON like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotLike(String value) {
            addCriterion("REASON not like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonIn(List<String> values) {
            addCriterion("REASON in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotIn(List<String> values) {
            addCriterion("REASON not in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonBetween(String value1, String value2) {
            addCriterion("REASON between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotBetween(String value1, String value2) {
            addCriterion("REASON not between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andBusinesstypIsNull() {
            addCriterion("BUSINESSTYP is null");
            return (Criteria) this;
        }

        public Criteria andBusinesstypIsNotNull() {
            addCriterion("BUSINESSTYP is not null");
            return (Criteria) this;
        }

        public Criteria andBusinesstypEqualTo(String value) {
            addCriterion("BUSINESSTYP =", value, "businesstyp");
            return (Criteria) this;
        }

        public Criteria andBusinesstypNotEqualTo(String value) {
            addCriterion("BUSINESSTYP <>", value, "businesstyp");
            return (Criteria) this;
        }

        public Criteria andBusinesstypGreaterThan(String value) {
            addCriterion("BUSINESSTYP >", value, "businesstyp");
            return (Criteria) this;
        }

        public Criteria andBusinesstypGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESSTYP >=", value, "businesstyp");
            return (Criteria) this;
        }

        public Criteria andBusinesstypLessThan(String value) {
            addCriterion("BUSINESSTYP <", value, "businesstyp");
            return (Criteria) this;
        }

        public Criteria andBusinesstypLessThanOrEqualTo(String value) {
            addCriterion("BUSINESSTYP <=", value, "businesstyp");
            return (Criteria) this;
        }

        public Criteria andBusinesstypLike(String value) {
            addCriterion("BUSINESSTYP like", value, "businesstyp");
            return (Criteria) this;
        }

        public Criteria andBusinesstypNotLike(String value) {
            addCriterion("BUSINESSTYP not like", value, "businesstyp");
            return (Criteria) this;
        }

        public Criteria andBusinesstypIn(List<String> values) {
            addCriterion("BUSINESSTYP in", values, "businesstyp");
            return (Criteria) this;
        }

        public Criteria andBusinesstypNotIn(List<String> values) {
            addCriterion("BUSINESSTYP not in", values, "businesstyp");
            return (Criteria) this;
        }

        public Criteria andBusinesstypBetween(String value1, String value2) {
            addCriterion("BUSINESSTYP between", value1, value2, "businesstyp");
            return (Criteria) this;
        }

        public Criteria andBusinesstypNotBetween(String value1, String value2) {
            addCriterion("BUSINESSTYP not between", value1, value2, "businesstyp");
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