package com.chinasofti.domain;

import com.alibaba.fastjson.annotation.JSONField;
import com.limp.framework.core.bean.Pager;
import com.limp.framework.core.constant.Constant;

import java.io.Serializable;

public class ShipCheckShow implements Serializable {
    //主键
    private String id;
    //序号
    private String rownum_;
    //验船师身份证
    private String surid;
    //渔船编码
    private String ycbm;
    //渔船名称
    private String ycmc;
    //检验时间
    private String checktime;
    //检验类型
    private String checktype;
    //船东
    private String ownername;
    //船长
    private String shiplength;
    //材质
    private String shipmaterial;
    //作业区域
    private String jobarea;
    //检验年度
    private String startYear;
    private String endYear;
    //分页
    protected Pager page;
    //去重
    protected boolean distinct;

    private static final long serialVersionUID = 1L;

    public String getOwnername() {
        return ownername;
    }

    public String getShiplength() {
        return shiplength;
    }
    @JSONField(name=Constant.CODE_TRANS_PRE+"shipmaterial")
    public String getShipmaterial() {
        return shipmaterial;
    }

    public String getId() {
        return id;
    }

    public String getSurid() {
        return surid;
    }

    public String getYcbm() {
        return ycbm;
    }

    public String getYcmc() {
        return ycmc;
    }

    public String getChecktime() {
        return checktime;
    }

    public void setOwnername(String ownername) {
        this.ownername = ownername;
    }

    public void setShiplength(String shiplength) {
        this.shiplength = shiplength;
    }

    public void setShipmaterial(String shipmaterial) {
        this.shipmaterial = shipmaterial;
    }

    public Pager getPage() {
        return page;
    }

    public void setPage(Pager page) {
        this.page = page;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setSurid(String surid) {
        this.surid = surid;
    }

    public void setYcbm(String ycbm) {
        this.ycbm = ycbm;
    }

    public void setYcmc(String ycmc) {
        this.ycmc = ycmc;
    }

    public void setChecktime(String checktime) {
        this.checktime = checktime;
    }

    public String getRownum_() {
        return rownum_;
    }

    public void setRownum_(String rownum_) {
        this.rownum_ = rownum_;
    }
    @JSONField(name= Constant.CODE_TRANS_PRE+"jobarea")
    public String getJobarea() {
        return jobarea;
    }

    public void setJobarea(String jobarea) {
        this.jobarea = jobarea;
    }
    @JSONField(name= Constant.CODE_TRANS_PRE+"checktype")
    public String getChecktype() {
        return checktype;
    }

    public void setChecktype(String checktype) {
        this.checktype = checktype;
    }

    public String getStartYear() {
        return startYear;
    }

    public void setStartYear(String startYear) {
        this.startYear = startYear;
    }

    public String getEndYear() {
        return endYear;
    }

    public void setEndYear(String endYear) {
        this.endYear = endYear;
    }
}