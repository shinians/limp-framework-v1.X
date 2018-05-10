package com.chinasofti.domain;

import java.io.Serializable;

public class DrawProc4 implements Serializable {
    private String id;

    private String uid;

    private String procuid;

    private String drawno;

    private String company;

    private String people;

    private String accepttime;

    private String acceptsugg;

    private String acceptintimeEnd;

    private String money;

    private String doc1;

    private String doc2;

    private String doc3;

    private String doc4;

    private String doc5;

    private String acceptintimeStart;

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

    public String getPeople() {
        return people;
    }

    public void setPeople(String people) {
        this.people = people == null ? null : people.trim();
    }

    public String getAccepttime() {
        return accepttime;
    }

    public void setAccepttime(String accepttime) {
        this.accepttime = accepttime == null ? null : accepttime.trim();
    }

    public String getAcceptsugg() {
        return acceptsugg;
    }

    public void setAcceptsugg(String acceptsugg) {
        this.acceptsugg = acceptsugg == null ? null : acceptsugg.trim();
    }

    public String getAcceptintimeEnd() {
        return acceptintimeEnd;
    }

    public void setAcceptintimeEnd(String acceptintimeEnd) {
        this.acceptintimeEnd = acceptintimeEnd == null ? null : acceptintimeEnd.trim();
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money == null ? null : money.trim();
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

    public String getDoc5() {
        return doc5;
    }

    public void setDoc5(String doc5) {
        this.doc5 = doc5 == null ? null : doc5.trim();
    }

    public String getAcceptintimeStart() {
        return acceptintimeStart;
    }

    public void setAcceptintimeStart(String acceptintimeStart) {
        this.acceptintimeStart = acceptintimeStart == null ? null : acceptintimeStart.trim();
    }
}