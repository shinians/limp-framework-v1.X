package com.chinasofti.domain;

import com.limp.framework.core.bean.Pager;

import java.io.Serializable;
import java.util.Date;

public class SurTrainShow implements Serializable {
    private String csrId;

    private String csrUid;

    private String csrTrainid;

    private String csrSurno;

    private String csrSurname;

    private String trainname;

    private String begintime;

    private String endtime;

    private String initiateUnits;

    private String surcertificate;

    private String examtscore;

    private String lssuestatus;

    private String imageUrl;

    //分页
    protected Pager page;

    private static final long serialVersionUID = 1L;

    public String getCsrId() {
        return csrId;
    }

    public void setCsrId(String csrId) {
        this.csrId = csrId == null ? null : csrId.trim();
    }

    public String getCsrUid() {
        return csrUid;
    }

    public void setCsrUid(String csrUid) {
        this.csrUid = csrUid == null ? null : csrUid.trim();
    }

    public String getCsrTrainid() {
        return csrTrainid;
    }

    public void setCsrTrainid(String csrTrainid) {
        this.csrTrainid = csrTrainid == null ? null : csrTrainid.trim();
    }

    public String getCsrSurno() {
        return csrSurno;
    }

    public void setCsrSurno(String csrSurno) {
        this.csrSurno = csrSurno;
    }

    public String getCsrSurname() {
        return csrSurname;
    }

    public void setCsrSurname(String csrSurname) {
        this.csrSurname = csrSurname;
    }

    public String getTrainname() {
        return trainname;
    }

    public void setTrainname(String trainname) {
        this.trainname = trainname;
    }

    public String getBegintime() {
        return begintime;
    }

    public void setBegintime(String begintime) {
        this.begintime = begintime;
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }

    public String getInitiateUnits() {
        return initiateUnits;
    }

    public void setInitiateUnits(String initiateUnits) {
        this.initiateUnits = initiateUnits;
    }

    public String getSurcertificate() {
        return surcertificate;
    }

    public void setSurcertificate(String surcertificate) {
        this.surcertificate = surcertificate;
    }

    public String getExamtscore() {
        return examtscore;
    }

    public void setExamtscore(String examtscore) {
        this.examtscore = examtscore;
    }

    public String getLssuestatus() {
        return lssuestatus;
    }

    public void setLssuestatus(String lssuestatus) {
        this.lssuestatus = lssuestatus;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Pager getPage() {
        return page;
    }

    public void setPage(Pager page) {
        this.page = page;
    }

}