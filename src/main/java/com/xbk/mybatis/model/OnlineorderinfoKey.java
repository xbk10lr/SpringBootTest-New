package com.xbk.mybatis.model;

import java.util.Date;

public class OnlineorderinfoKey {
    private String transseqnbr;

    private Date transdate;

    public String getTransseqnbr() {
        return transseqnbr;
    }

    public void setTransseqnbr(String transseqnbr) {
        this.transseqnbr = transseqnbr;
    }

    public Date getTransdate() {
        return transdate;
    }

    public void setTransdate(Date transdate) {
        this.transdate = transdate;
    }
}