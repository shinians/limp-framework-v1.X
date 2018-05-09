package com.limp.framework.boss.domain;

import com.limp.framework.core.abs.AbstractModel;

import java.io.Serializable;
import java.util.Date;

public class PageLog extends AbstractModel implements Serializable {

    private String id;

    private String account;

    private String otlUsrguid;

    private String otlType;

    private String otlMenguid;

    private String otlUrl;

    private String otlParams;

    private String otlRemarks;

    private Integer otlState;

    private Date otlTime;

    private String otlRc0;

    private String otlRc1;

    private String otlRc2;

    private Integer otlRc3;

    private Integer otlRc4;

    private Date otlRc5;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    private static final long serialVersionUID = 1L;

    public  PageLog(){
        super();
    }


    /**
     *
     * @param otlUsrguid
     * @param otlType
     * @param optIntro 操作描述
     * @param otlUrl
     * @param otlParams
     * @param otlRemarks
     */
    public PageLog(String otlUsrguid, String otlType, String optIntro, String otlUrl, String otlParams, String otlRemarks) {
        this.otlUsrguid = otlUsrguid;
        this.otlType = otlType;
        this.otlRc1 = otlMenguid;
        this.otlUrl = otlUrl;
        this.otlParams = otlParams;
        this.otlRemarks = otlRemarks;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOtlUsrguid() {
        return otlUsrguid;
    }

    public void setOtlUsrguid(String otlUsrguid) {
        this.otlUsrguid = otlUsrguid == null ? null : otlUsrguid.trim();
    }

    public String getOtlType() {
        return otlType;
    }

    public void setOtlType(String otlType) {
        this.otlType = otlType == null ? null : otlType.trim();
    }

    public String getOtlMenguid() {
        return otlMenguid;
    }

    public void setOtlMenguid(String otlMenguid) {
        this.otlMenguid = otlMenguid == null ? null : otlMenguid.trim();
    }

    public String getOtlUrl() {
        return otlUrl;
    }

    public void setOtlUrl(String otlUrl) {
        this.otlUrl = otlUrl == null ? null : otlUrl.trim();
    }

    public String getOtlParams() {
        return otlParams;
    }

    public void setOtlParams(String otlParams) {
        this.otlParams = otlParams == null ? null : otlParams.trim();
    }

    public String getOtlRemarks() {
        return otlRemarks;
    }

    public void setOtlRemarks(String otlRemarks) {
        this.otlRemarks = otlRemarks == null ? null : otlRemarks.trim();
    }

    public Integer getOtlState() {
        return otlState;
    }

    public void setOtlState(Integer otlState) {
        this.otlState = otlState;
    }

    public Date getOtlTime() {
        return otlTime;
    }

    public void setOtlTime(Date otlTime) {
        this.otlTime = otlTime;
    }

    public String getOtlRc0() {
        return otlRc0;
    }

    public void setOtlRc0(String otlRc0) {
        this.otlRc0 = otlRc0 == null ? null : otlRc0.trim();
    }

    public String getOtlRc1() {
        return otlRc1;
    }

    public void setOtlRc1(String otlRc1) {
        this.otlRc1 = otlRc1 == null ? null : otlRc1.trim();
    }

    public String getOtlRc2() {
        return otlRc2;
    }

    public void setOtlRc2(String otlRc2) {
        this.otlRc2 = otlRc2 == null ? null : otlRc2.trim();
    }

    public Integer getOtlRc3() {
        return otlRc3;
    }

    public void setOtlRc3(Integer otlRc3) {
        this.otlRc3 = otlRc3;
    }

    public Integer getOtlRc4() {
        return otlRc4;
    }

    public void setOtlRc4(Integer otlRc4) {
        this.otlRc4 = otlRc4;
    }

    public Date getOtlRc5() {
        return otlRc5;
    }

    public void setOtlRc5(Date otlRc5) {
        this.otlRc5 = otlRc5;
    }
}