package com.chinasofti.domain;

import com.alibaba.fastjson.annotation.JSONField;
import com.limp.framework.core.constant.Constant;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class ShipTrace implements Serializable {

    //追溯类型
    private String traceType;
    //各类编号
    private String serialNumber;
    //所有人船东
    private String ownerName;
    //功率
    private String power;
    //场所地址
    private String jobPlace;
    //渔船编码
    private String shipCode;
    //船名
    private String shipName;
    //检验审核时间
    private String auditTime;
    //船籍港
    private String shipPort;
    //图号
    private String drawno;
    //企业
    private String entUnit;
    //企业id
    private String entUnitId;
    //机构
    private String unitOrg;
    //机构id
    private String unitOrgId;
    //第三方企业
    private String thirdEnt;
    //第三方企业id
    private String thirdEntId;
    //验船师/负责人
    private String surveyor;
    //验船师/负责人id
    private String surId;
    //各类情况
    private String situation;
    //钱
    private String money;
    //起始期
    private String validityStart;
    //截止期
    private String validityEnd;
    //种类
    private String kindType;
    //方式
    private String jobMode;
    //次数
    private String insCount;
    //问题
    private String question;
    //原渔船编码
    private String oriShipCode;
    //原船名
    private String oriShipName;
    //原所有人
    private String oriOwnerName;
    //行动名称
    private String xdname;
    //外键
    private String refid;

    //图片列表
    private List<ImageManager> imgList;
    //pdf列表
    private List<DocumentManager> docList;
    //年份展示
    private String auditYear;

    private static final long serialVersionUID = 1L;

    public String getTraceType() {
        return traceType;
    }

    public void setTraceType(String traceType) {
        this.traceType = traceType;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getJobPlace() {
        return jobPlace;
    }

    public void setJobPlace(String jobPlace) {
        this.jobPlace = jobPlace;
    }

    public String getShipCode() {
        return shipCode;
    }

    public void setShipCode(String shipCode) {
        this.shipCode = shipCode;
    }

    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    public String getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(String auditTime) {
        this.auditTime = auditTime;
    }

    public String getShipPort() {
        return shipPort;
    }

    public void setShipPort(String shipPort) {
        this.shipPort = shipPort;
    }

    public String getDrawno() {
        return drawno;
    }

    public void setDrawno(String drawno) {
        this.drawno = drawno;
    }

    public String getEntUnit() {
        return entUnit;
    }

    public void setEntUnit(String entUnit) {
        this.entUnit = entUnit;
    }

    public String getUnitOrg() {
        return unitOrg;
    }

    public void setUnitOrg(String unitOrg) {
        this.unitOrg = unitOrg;
    }

    public String getThirdEnt() {
        return thirdEnt;
    }

    public void setThirdEnt(String thirdEnt) {
        this.thirdEnt = thirdEnt;
    }

    public String getSurveyor() {
        return surveyor;
    }

    public void setSurveyor(String surveyor) {
        this.surveyor = surveyor;
    }

    public String getSituation() {
        return situation;
    }

    public void setSituation(String situation) {
        this.situation = situation;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public String getValidityStart() {
        return validityStart;
    }

    public void setValidityStart(String validityStart) {
        this.validityStart = validityStart;
    }

    public String getValidityEnd() {
        return validityEnd;
    }

    public void setValidityEnd(String validityEnd) {
        this.validityEnd = validityEnd;
    }

    public String getKindType() {
        return kindType;
    }

    public void setKindType(String kindType) {
        this.kindType = kindType;
    }
    
    public String getJobMode() {
        return jobMode;
    }

    public void setJobMode(String jobMode) {
        this.jobMode = jobMode;
    }

    public String getInsCount() {
        return insCount;
    }

    public void setInsCount(String insCount) {
        this.insCount = insCount;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getOriShipCode() {
        return oriShipCode;
    }

    public void setOriShipCode(String oriShipCode) {
        this.oriShipCode = oriShipCode;
    }

    public String getOriShipName() {
        return oriShipName;
    }

    public void setOriShipName(String oriShipName) {
        this.oriShipName = oriShipName;
    }

    public String getOriOwnerName() {
        return oriOwnerName;
    }

    public void setOriOwnerName(String oriOwnerName) {
        this.oriOwnerName = oriOwnerName;
    }

    public String getXdname() {
        return xdname;
    }

    public void setXdname(String xdname) {
        this.xdname = xdname;
    }

    public String getRefid() {
        return refid;
    }

    public void setRefid(String refid) {
        this.refid = refid;
    }

    public List<ImageManager> getImgList() {
        return imgList;
    }

    public void setImgList(List<ImageManager> imgList) {
        this.imgList = imgList;
    }

    public List<DocumentManager> getDocList() {
        return docList;
    }

    public void setDocList(List<DocumentManager> docList) {
        this.docList = docList;
    }

    public String getAuditYear() {
        return auditYear;
    }

    public void setAuditYear(String auditYear) {
        this.auditYear = auditYear;
    }

    public String getEntUnitId() {
        return entUnitId;
    }

    public void setEntUnitId(String entUnitId) {
        this.entUnitId = entUnitId;
    }

    public String getUnitOrgId() {
        return unitOrgId;
    }

    public void setUnitOrgId(String unitOrgId) {
        this.unitOrgId = unitOrgId;
    }

    public String getThirdEntId() {
        return thirdEntId;
    }

    public void setThirdEntId(String thirdEntId) {
        this.thirdEntId = thirdEntId;
    }

    public String getSurId() {
        return surId;
    }

    public void setSurId(String surId) {
        this.surId = surId;
    }
}