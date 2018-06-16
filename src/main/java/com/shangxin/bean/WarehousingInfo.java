package com.shangxin.bean;

import java.util.Date;

public class WarehousingInfo {
    private Integer warehousingid;

    private String drugnumber;

    private Float price;

    private int stock;

    private String remakes;

    private int mark;

    private Date date;

    public Integer getWarehousingid() {
        return warehousingid;
    }

    public void setWarehousingid(Integer warehousingid) {
        this.warehousingid = warehousingid;
    }

    public String getDrugnumber() {
        return drugnumber;
    }

    public void setDrugnumber(String drugnumber) {
        this.drugnumber = drugnumber == null ? null : drugnumber.trim();
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getRemakes() {
        return remakes;
    }

    public void setRemakes(String remakes) {
        this.remakes = remakes == null ? null : remakes.trim();
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}