package com.chinasofti.domain;

import com.alibaba.fastjson.annotation.JSONField;
import com.limp.framework.core.constant.Constant;

import java.io.Serializable;
import java.util.List;

public class ProductTrace implements Serializable {

    //唯一标识
    private String uuid;
    //追溯类型
    private String traceType;
    //各类编号
    private String serialNumber;
    //有效起始时间
    private String startTime;
    //有效截止时间
    private String endTime;
    //认可时间
    private String insTime;
    //年份展示
    private String auditYear;
    //产品编号
    private String productNumber;
    //产品名称
    private String productName;
    //渔船编码
    private String shipCode;
    //渔船名称
    private String shipName;
    //企业名称
    private String entName;
    //企业ID
    private String entId;
    //企业地址
    private String entAddr;
    //验船师/维修人员
    private String personName;
    //验船师/维修人员ID
    private String personId;
    //检验类别/环节
    private String kindType;
    //结果/概况
    private String result;
    //检验机构
    private String orgName;
    //检验机构ID
    private String orgId;
    //原产品编码
    private String exProductNumber;
    //原产品名称
    private String exProductName;
    //原渔船编码
    private String exShipCode;
    //原渔船名称
    private String exShipName;

    //图片列表
    private List<ImageManager> imgList;
    //pdf列表
    private List<DocumentManager> docList;

    private static final long serialVersionUID = 1L;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
    @JSONField(name= Constant.CODE_TRANS_PRE+"traceType")
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

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getInsTime() {
        return insTime;
    }

    public void setInsTime(String insTime) {
        this.insTime = insTime;
    }

    public String getAuditYear() {
        return auditYear;
    }

    public void setAuditYear(String auditYear) {
        this.auditYear = auditYear;
    }

    public String getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(String productNumber) {
        this.productNumber = productNumber;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
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

    public String getEntName() {
        return entName;
    }

    public void setEntName(String entName) {
        this.entName = entName;
    }

    public String getEntId() {
        return entId;
    }

    public void setEntId(String entId) {
        this.entId = entId;
    }

    public String getEntAddr() {
        return entAddr;
    }

    public void setEntAddr(String entAddr) {
        this.entAddr = entAddr;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }
    @JSONField(name= Constant.CODE_TRANS_PRE+"kindType")
    public String getKindType() {
        return kindType;
    }

    public void setKindType(String kindType) {
        this.kindType = kindType;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public String getExProductNumber() {
        return exProductNumber;
    }

    public void setExProductNumber(String exProductNumber) {
        this.exProductNumber = exProductNumber;
    }

    public String getExProductName() {
        return exProductName;
    }

    public void setExProductName(String exProductName) {
        this.exProductName = exProductName;
    }

    public String getExShipCode() {
        return exShipCode;
    }

    public void setExShipCode(String exShipCode) {
        this.exShipCode = exShipCode;
    }

    public String getExShipName() {
        return exShipName;
    }

    public void setExShipName(String exShipName) {
        this.exShipName = exShipName;
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
}