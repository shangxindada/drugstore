package com.shangxin.bean;

public class SellInfo {
    private String sellnumber;

    private String sellid;

    private String drugnumber;

    private Float sellprice;

    private Integer sellnum;

    public String getSellnumber() {
        return sellnumber;
    }

    public void setSellnumber(String sellnumber) {
        this.sellnumber = sellnumber == null ? null : sellnumber.trim();
    }

    public String getSellid() {
        return sellid;
    }

    public void setSellid(String sellid) {
        this.sellid = sellid == null ? null : sellid.trim();
    }

    public String getDrugnumber() {
        return drugnumber;
    }

    public void setDrugnumber(String drugnumber) {
        this.drugnumber = drugnumber == null ? null : drugnumber.trim();
    }

    public Float getSellprice() {
        return sellprice;
    }

    public void setSellprice(Float sellprice) {
        this.sellprice = sellprice;
    }

    public Integer getSellnum() {
        return sellnum;
    }

    public void setSellnum(Integer sellnum) {
        this.sellnum = sellnum;
    }
}