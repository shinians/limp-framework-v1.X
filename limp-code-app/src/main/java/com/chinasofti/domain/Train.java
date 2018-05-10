package com.chinasofti.domain;

import com.alibaba.fastjson.annotation.JSONField;
import com.limp.framework.core.abs.AbstractModel;
import com.limp.framework.core.constant.Constant;

import java.io.Serializable;

public class Train extends AbstractModel implements Serializable {
    private String id;

    private String uid;

    private String trainname;

    private String trainintro;

    private String initiateTime;

    private String initiateUnits;

    private String trainplace;

    private String begintime;

    private String endtime;

    private String lssueplace;

    private String surcertificate;

    private String traintype;

    private String trainbath;

    private Object idt;

    private Object udt;

    private String state;

    private String examtype;

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

    public String getTrainname() {
        return trainname;
    }

    public void setTrainname(String trainname) {
        this.trainname = trainname == null ? null : trainname.trim();
    }

    public String getTrainintro() {
        return trainintro;
    }

    public void setTrainintro(String trainintro) {
        this.trainintro = trainintro == null ? null : trainintro.trim();
    }

    public String getInitiateTime() {
        return initiateTime;
    }

    public void setInitiateTime(String initiateTime) {
        this.initiateTime = initiateTime == null ? null : initiateTime.trim();
    }

    public String getInitiateUnits() {
        return initiateUnits;
    }

    public void setInitiateUnits(String initiateUnits) {
        this.initiateUnits = initiateUnits == null ? null : initiateUnits.trim();
    }

    public String getTrainplace() {
        return trainplace;
    }

    public void setTrainplace(String trainplace) {
        this.trainplace = trainplace == null ? null : trainplace.trim();
    }

    public String getBegintime() {
        return begintime;
    }

    public void setBegintime(String begintime) {
        this.begintime = begintime == null ? null : begintime.trim();
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime == null ? null : endtime.trim();
    }

    public String getLssueplace() {
        return lssueplace;
    }

    public void setLssueplace(String lssueplace) {
        this.lssueplace = lssueplace == null ? null : lssueplace.trim();
    }

    public String getSurcertificate() {
        return surcertificate;
    }

    public void setSurcertificate(String surcertificate) {
        this.surcertificate = surcertificate == null ? null : surcertificate.trim();
    }

    @JSONField(name = Constant.CODE_TRANS_PRE + "traintype")
    public String getTraintype() {
        return traintype;
    }

    public void setTraintype(String traintype) {
        this.traintype = traintype == null ? null : traintype.trim();
    }

    public String getTrainbath() {
        return trainbath;
    }

    public void setTrainbath(String trainbath) {
        this.trainbath = trainbath == null ? null : trainbath.trim();
    }

    public Object getIdt() {
        return idt;
    }

    public void setIdt(Object idt) {
        this.idt = idt;
    }

    public Object getUdt() {
        return udt;
    }

    public void setUdt(Object udt) {
        this.udt = udt;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getExamtype() {
        return examtype;
    }

    public void setExamtype(String examtype) {
        this.examtype = examtype == null ? null : examtype.trim();
    }
}