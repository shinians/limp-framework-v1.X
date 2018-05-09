package com.chinasofti.domain;

import com.alibaba.fastjson.annotation.JSONField;
import com.limp.framework.core.abs.AbstractModel;
import com.limp.framework.core.constant.Constant;

import java.io.Serializable;
import java.util.List;

public class ProductShow extends AbstractModel implements Serializable,Comparable<ProductShow> {

    private String checkUid;

    private String surId;

    private String surName;

    private String resppersonId;

    private String resppersonName;

    private String entId;

    private String entName;

    private String shipcode;

    private String shipname;

    private String checkTime;

    private String productType;

    private String pProductType;

    private String id;

    private String pid;

    private int productSum;

    private String productNum;

    private String productName;

    private String produtModel;

    private String productCert;

    private String productFrom;

    private String checkType;

    private String shipCheckType;

    private String domPath;
    //追溯环节(渔船)
    private String[] traceArr;

    private List<ProductShow> childList;
    //追溯信息(渔船+产品)
    private List proShipList;

    private static final long serialVersionUID = 1L;

    private String productType1;

    private String productType2;

    private String productType3;

    public String getResppersonId() {
        return resppersonId;
    }

    public void setResppersonId(String resppersonId) {
        this.resppersonId = resppersonId;
    }

    public String getResppersonName() {
        return resppersonName;
    }

    public void setResppersonName(String resppersonName) {
        this.resppersonName = resppersonName;
    }

    public String getShipCheckType() {
        return shipCheckType;
    }

    public void setShipCheckType(String shipCheckType) {
        this.shipCheckType = shipCheckType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getpProductType() {
        return pProductType;
    }

    public void setpProductType(String pProductType) {
        this.pProductType = pProductType;
    }

    public int getProductSum() {
        return productSum;
    }

    public void setProductSum(int productSum) {
        this.productSum = productSum;
    }

    public String getProductType1() {
        return productType1;
    }

    public void setProductType1(String productType1) {
        this.productType1 = productType1;
    }

    public String getProductType2() {
        return productType2;
    }

    public void setProductType2(String productType2) {
        this.productType2 = productType2;
    }

    public String getProductType3() {
        return productType3;
    }

    public void setProductType3(String productType3) {
        this.productType3 = productType3;
    }

    public String getCheckUid() {
        return checkUid;
    }

    public void setCheckUid(String checkUid) {
        this.checkUid = checkUid;
    }

    public String getSurId() {
        return surId;
    }

    public void setSurId(String surId) {
        this.surId = surId;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getEntId() {
        return entId;
    }

    public void setEntId(String entId) {
        this.entId = entId;
    }

    public String getEntName() {
        return entName;
    }

    public void setEntName(String entName) {
        this.entName = entName;
    }

    public String getShipcode() {
        return shipcode;
    }

    public void setShipcode(String shipcode) {
        this.shipcode = shipcode;
    }

    public String getShipname() {
        return shipname;
    }

    public void setShipname(String shipname) {
        this.shipname = shipname;
    }

    public String getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(String checkTime) {
        this.checkTime = checkTime;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getProductNum() {
        return productNum;
    }

    public void setProductNum(String productNum) {
        this.productNum = productNum;
    }

    @JSONField(name= Constant.CODE_TRANS_PRE+"productName")
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProdutModel() {
        return produtModel;
    }

    public void setProdutModel(String produtModel) {
        this.produtModel = produtModel;
    }

    public String getProductCert() {
        return productCert;
    }

    public void setProductCert(String productCert) {
        this.productCert = productCert;
    }

    public String getCheckType() {
        return checkType;
    }

    public void setCheckType(String checkType) {
        this.checkType = checkType;
    }

    public String getDomPath() {
        return domPath;
    }

    public void setDomPath(String domPath) {
        this.domPath = domPath;
    }

    public List<ProductShow> getChildList() {
        return childList;
    }

    public void setChildList(List<ProductShow> childList) {
        this.childList = childList;
    }

    public List getProShipList() {
        return proShipList;
    }

    public void setProShipList(List proShipList) {
        this.proShipList = proShipList;
    }

    public String[] getTraceArr() {
        return traceArr;
    }

    public void setTraceArr(String[] traceArr) {
        this.traceArr = traceArr;
    }

    public String getProductFrom() {
        return productFrom;
    }

    public void setProductFrom(String productFrom) {
        this.productFrom = productFrom;
    }

    @Override
    public int compareTo(ProductShow p) {
        return Integer.parseInt(this.getProductType()) - Integer.parseInt(p.getProductType());
    }
}