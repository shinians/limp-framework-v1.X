package com.chinasofti.domain;

import com.alibaba.fastjson.annotation.JSONField;
import com.limp.framework.core.abs.AbstractModel;
import com.limp.framework.core.constant.Constant;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class ShipShow extends AbstractModel implements Serializable {
    private String id;

    private String shipname;

    private String shipcode;

    private String pronumber;

    private String ownername;

    private String shipport;

    private String shipmaterial;

    private String shiplength;

    private String completdate;

    private String navzone;

    private String power;

    private String jobArea;

    private String safescore;

    private List<ImageManager> imgPath;

    private Map<String,String> gispoint;

    private ProductShow psList;

    private List<ProductShow> productShowList;

    private List<ShipTrace> shipTraceList;

    //追溯环节(渔船)
    private String[] traceArr;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getShipname() {
        return shipname;
    }

    public void setShipname(String shipname) {
        this.shipname = shipname;
    }

    public String getShipcode() {
        return shipcode;
    }

    public void setShipcode(String shipcode) {
        this.shipcode = shipcode;
    }

    public String getOwnername() {
        return ownername;
    }

    public void setOwnername(String ownername) {
        this.ownername = ownername;
    }

    public String getShipport() {
        return shipport;
    }

    public void setShipport(String shipport) {
        this.shipport = shipport;
    }
    @JSONField(name= Constant.CODE_TRANS_PRE+"shipmaterial")
    public String getShipmaterial() {
        return shipmaterial;
    }

    public void setShipmaterial(String shipmaterial) {
        this.shipmaterial = shipmaterial;
    }

    public String getShiplength() {
        return shiplength;
    }

    public void setShiplength(String shiplength) {
        this.shiplength = shiplength;
    }

    public String getCompletdate() {
        return completdate;
    }

    public void setCompletdate(String completdate) {
        this.completdate = completdate;
    }

    public String getNavzone() {
        return navzone;
    }

    public void setNavzone(String navzone) {
        this.navzone = navzone;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getSafescore() {
        return safescore;
    }

    public void setSafescore(String safescore) {
        this.safescore = safescore;
    }

    public List<ImageManager> getImgPath() {
        return imgPath;
    }

    public void setImgPath(List<ImageManager> imgPath) {
        this.imgPath = imgPath;
    }

    public Map<String, String> getGispoint() {
        return gispoint;
    }

    public void setGispoint(Map<String, String> gispoint) {
        this.gispoint = gispoint;
    }

    public ProductShow getPsList() {
        return psList;
    }

    public void setPsList(ProductShow psList) {
        this.psList = psList;
    }

    public List<ShipTrace> getShipTraceList() {
        return shipTraceList;
    }

    public void setShipTraceList(List<ShipTrace> shipTraceList) {
        this.shipTraceList = shipTraceList;
    }

    public String getPronumber() {
        return pronumber;
    }

    public void setPronumber(String pronumber) {
        this.pronumber = pronumber;
    }

    public String[] getTraceArr() {
        return traceArr;
    }

    public void setTraceArr(String[] traceArr) {
        this.traceArr = traceArr;
    }

    public String getJobArea() {
        return jobArea;
    }

    public void setJobArea(String jobArea) {
        this.jobArea = jobArea;
    }

    public List<ProductShow> getProductShowList() {
        return productShowList;
    }

    public void setProductShowList(List<ProductShow> productShowList) {
        this.productShowList = productShowList;
    }
}