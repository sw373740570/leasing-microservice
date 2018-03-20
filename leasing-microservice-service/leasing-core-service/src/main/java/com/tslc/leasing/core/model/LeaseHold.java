package com.tslc.leasing.core.model;

public class LeaseHold {

    private int id;

    private String custName;

    private String idcard;

    private int custFlag;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public int getCustFlag() {
        return custFlag;
    }

    public void setCustFlag(int custFlag) {
        this.custFlag = custFlag;
    }
}
