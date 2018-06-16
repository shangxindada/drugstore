package com.shangxin.bean;

import java.sql.Date;

public class ExpiredDrugs {
    private int expnumber;

    private String drugnumber;

    private String expdrugname;

    private Date expdate;

    private String type;

    private int expnum;

    public int getExpnumber() {
        return expnumber;
    }

    public void setExpnumber(int expnumber) {
        this.expnumber = expnumber;
    }

    public String getDrugnumber() {
        return drugnumber;
    }

    public void setDrugnumber(String drugnumber) {
        this.drugnumber = drugnumber == null ? null : drugnumber.trim();
    }

    public String getExpdrugname() {
        return expdrugname;
    }

    public void setExpdrugname(String expdrugname) {
        this.expdrugname = expdrugname == null ? null : expdrugname.trim();
    }

    public Date getExpdate() {
        return expdate;
    }

    public void setExpdate(Date expdate) {
        this.expdate = expdate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public int getExpnum() {
        return expnum;
    }

    public void setExpnum(int expnum) {
        this.expnum = expnum;
    }
}