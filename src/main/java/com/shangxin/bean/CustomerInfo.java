package com.shangxin.bean;

public class CustomerInfo {
    private String customerid;

    private String customername;

    private Float lastconsumption;

    private Float consumption;

    private String customerphone;

    public String getCustomerid() {
        return customerid;
    }

    public void setCustomerid(String customerid) {
        this.customerid = customerid == null ? null : customerid.trim();
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername == null ? null : customername.trim();
    }

    public Float getLastconsumption() {
        return lastconsumption;
    }

    public void setLastconsumption(Float lastconsumption) {
        this.lastconsumption = lastconsumption;
    }

    public Float getConsumption() {
        return consumption;
    }

    public void setConsumption(Float consumption) {
        this.consumption = consumption;
    }

    public String getCustomerphone() {
        return customerphone;
    }

    public void setCustomerphone(String customerphone) {
        this.customerphone = customerphone == null ? null : customerphone.trim();
    }
}