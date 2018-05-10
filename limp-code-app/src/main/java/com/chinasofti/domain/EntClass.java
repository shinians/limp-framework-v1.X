package com.chinasofti.domain;

import java.io.Serializable;

public class EntClass implements Serializable {
    private String uid;

    private String entid;

    private String evaluator;

    private String evaluattime;

    private String detail;

    private String standart;

    private String entvalue;

    private static final long serialVersionUID = 1L;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

    public String getEntid() {
        return entid;
    }

    public void setEntid(String entid) {
        this.entid = entid == null ? null : entid.trim();
    }

    public String getEvaluator() {
        return evaluator;
    }

    public void setEvaluator(String evaluator) {
        this.evaluator = evaluator == null ? null : evaluator.trim();
    }

    public String getEvaluattime() {
        return evaluattime;
    }

    public void setEvaluattime(String evaluattime) {
        this.evaluattime = evaluattime == null ? null : evaluattime.trim();
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }

    public String getStandart() {
        return standart;
    }

    public void setStandart(String standart) {
        this.standart = standart == null ? null : standart.trim();
    }

    public String getEntvalue() {
        return entvalue;
    }

    public void setEntvalue(String entvalue) {
        this.entvalue = entvalue == null ? null : entvalue.trim();
    }
}