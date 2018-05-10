package com.chinasofti.domain;

import java.io.Serializable;

public class ProductsRecord implements Serializable {
    private String id;

    private String proname;

    private String pronumber;

    private String certnumber;

    private String checktime;

    private String shipname;

    private String shipid;

    private String cate1;

    private String cate2;

    private String cate3;

    private String producttime;

    private String producttype;

    private String surver;

    private String entid;

    private String entname;

    private String yesorno;

    private String download;

    private String obg1;

    private String obg2;

    private String obg3;

    private String obg4;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getProname() {
        return proname;
    }

    public void setProname(String proname) {
        this.proname = proname == null ? null : proname.trim();
    }

    public String getPronumber() {
        return pronumber;
    }

    public void setPronumber(String pronumber) {
        this.pronumber = pronumber == null ? null : pronumber.trim();
    }

    public String getCertnumber() {
        return certnumber;
    }

    public void setCertnumber(String certnumber) {
        this.certnumber = certnumber == null ? null : certnumber.trim();
    }

    public String getChecktime() {
        return checktime;
    }

    public void setChecktime(String checktime) {
        this.checktime = checktime == null ? null : checktime.trim();
    }

    public String getShipname() {
        return shipname;
    }

    public void setShipname(String shipname) {
        this.shipname = shipname == null ? null : shipname.trim();
    }

    public String getShipid() {
        return shipid;
    }

    public void setShipid(String shipid) {
        this.shipid = shipid == null ? null : shipid.trim();
    }

    public String getCate1() {
        return cate1;
    }

    public void setCate1(String cate1) {
        this.cate1 = cate1 == null ? null : cate1.trim();
    }

    public String getCate2() {
        return cate2;
    }

    public void setCate2(String cate2) {
        this.cate2 = cate2 == null ? null : cate2.trim();
    }

    public String getCate3() {
        return cate3;
    }

    public void setCate3(String cate3) {
        this.cate3 = cate3 == null ? null : cate3.trim();
    }

    public String getProducttime() {
        return producttime;
    }

    public void setProducttime(String producttime) {
        this.producttime = producttime == null ? null : producttime.trim();
    }

    public String getProducttype() {
        return producttype;
    }

    public void setProducttype(String producttype) {
        this.producttype = producttype == null ? null : producttype.trim();
    }

    public String getSurver() {
        return surver;
    }

    public void setSurver(String surver) {
        this.surver = surver == null ? null : surver.trim();
    }

    public String getEntid() {
        return entid;
    }

    public void setEntid(String entid) {
        this.entid = entid == null ? null : entid.trim();
    }

    public String getEntname() {
        return entname;
    }

    public void setEntname(String entname) {
        this.entname = entname == null ? null : entname.trim();
    }

    public String getYesorno() {
        return yesorno;
    }

    public void setYesorno(String yesorno) {
        this.yesorno = yesorno == null ? null : yesorno.trim();
    }

    public String getDownload() {
        return download;
    }

    public void setDownload(String download) {
        this.download = download == null ? null : download.trim();
    }

    public String getObg1() {
        return obg1;
    }

    public void setObg1(String obg1) {
        this.obg1 = obg1 == null ? null : obg1.trim();
    }

    public String getObg2() {
        return obg2;
    }

    public void setObg2(String obg2) {
        this.obg2 = obg2 == null ? null : obg2.trim();
    }

    public String getObg3() {
        return obg3;
    }

    public void setObg3(String obg3) {
        this.obg3 = obg3 == null ? null : obg3.trim();
    }

    public String getObg4() {
        return obg4;
    }

    public void setObg4(String obg4) {
        this.obg4 = obg4 == null ? null : obg4.trim();
    }
}