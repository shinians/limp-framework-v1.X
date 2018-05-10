package com.chinasofti.domain;

import java.io.Serializable;

public class DrawProc1 implements Serializable {
    private String id;

    private String uid;

    private String procuid;

    private String drawno;

    private String company;

    private String time;

    private String approcompany;

    private String inturn;

    private String bigchange;

    private String bigchangetype;

    private String doc1;

    private String doc2;

    private String doc3;

    private String doc4;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

    public String getProcuid() {
        return procuid;
    }

    public void setProcuid(String procuid) {
        this.procuid = procuid == null ? null : procuid.trim();
    }

    public String getDrawno() {
        return drawno;
    }

    public void setDrawno(String drawno) {
        this.drawno = drawno == null ? null : drawno.trim();
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time == null ? null : time.trim();
    }

    public String getApprocompany() {
        return approcompany;
    }

    public void setApprocompany(String approcompany) {
        this.approcompany = approcompany == null ? null : approcompany.trim();
    }

    public String getInturn() {
        return inturn;
    }

    public void setInturn(String inturn) {
        this.inturn = inturn == null ? null : inturn.trim();
    }

    public String getBigchange() {
        return bigchange;
    }

    public void setBigchange(String bigchange) {
        this.bigchange = bigchange == null ? null : bigchange.trim();
    }

    public String getBigchangetype() {
        return bigchangetype;
    }

    public void setBigchangetype(String bigchangetype) {
        this.bigchangetype = bigchangetype == null ? null : bigchangetype.trim();
    }

    public String getDoc1() {
        return doc1;
    }

    public void setDoc1(String doc1) {
        this.doc1 = doc1 == null ? null : doc1.trim();
    }

    public String getDoc2() {
        return doc2;
    }

    public void setDoc2(String doc2) {
        this.doc2 = doc2 == null ? null : doc2.trim();
    }

    public String getDoc3() {
        return doc3;
    }

    public void setDoc3(String doc3) {
        this.doc3 = doc3 == null ? null : doc3.trim();
    }

    public String getDoc4() {
        return doc4;
    }

    public void setDoc4(String doc4) {
        this.doc4 = doc4 == null ? null : doc4.trim();
    }
}