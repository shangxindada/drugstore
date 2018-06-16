package com.shangxin.bean;

import java.util.Date;

public class OtherSellInfo {
    private String sellid;

    private String userid;

    private Float allprice;

    private Date selldata;

    public String getSellid() {
        return sellid;
    }

    public void setSellid(String sellid) {
        this.sellid = sellid == null ? null : sellid.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public Float getAllprice() {
        return allprice;
    }

    public void setAllprice(Float allprice) {
        this.allprice = allprice;
    }

    public Date getSelldata() {
        return selldata;
    }

    public void setSelldata(Date selldata) {
        this.selldata = selldata;
    }
}