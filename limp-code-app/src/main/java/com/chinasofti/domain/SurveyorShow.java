package com.chinasofti.domain;

import com.alibaba.fastjson.annotation.JSONField;
import com.limp.framework.core.constant.Constant;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class SurveyorShow implements Serializable {
    //主键
    private String id;

    //所属机构
    private String organname;

    //验船师姓名
    private String ycsname;

    //身份证号
    private String ycscertnum;

    //船检工作年限
    private String shipchecktime;

    //性别
    private String sex;

    //生日
    private String birthdate;

    //学历
    private String educertcode;

    //专项资格
    private String zxzg;

    //累计检修渔船船次
    private String shipchecknum;

    //参加培训期数
    private String surtrainnum;

    //验船师能力评估分数
    private String capscore;

    //验船师最高级别
    private String surlevel;

    //验船师专业
    private String major;

    //验船师照片
    private List<ImageManager> surimg;

    //工作量走势
    private Map<String,List<Map<String,String>>> workMap;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getOrganname() {
        return organname;
    }

    public void setOrganname(String organname) {
        this.organname = organname == null ? null : organname.trim();
    }

    public String getYcsname() {
        return ycsname;
    }

    public void setYcsname(String ycsname) {
        this.ycsname = ycsname == null ? null : ycsname.trim();
    }

    public String getYcscertnum() {
        return ycscertnum;
    }

    public void setYcscertnum(String ycscertnum) {
        this.ycscertnum = ycscertnum == null ? null : ycscertnum.trim();
    }

    public String getShipchecktime() {
        return shipchecktime;
    }

    public void setShipchecktime(String shipchecktime) {
        this.shipchecktime = shipchecktime == null ? null : shipchecktime.trim();
    }

    @JSONField(name = Constant.CODE_TRANS_PRE + "sex")
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate == null ? null : birthdate.trim();
    }

    @JSONField(name = Constant.CODE_TRANS_PRE + "educertcode")
    public String getEducertcode() {
        return educertcode;
    }

    public void setEducertcode(String educertcode) {
        this.educertcode = educertcode == null ? null : educertcode.trim();
    }

    public String getZxzg() {
        return zxzg;
    }

    public void setZxzg(String zxzg) {
        this.zxzg = zxzg == null ? null : zxzg.trim();
    }

    public String getShipchecknum() {
        return shipchecknum;
    }

    public String getSurtrainnum() {
        return surtrainnum;
    }

    public String getCapscore() {
        return capscore;
    }

    @JSONField(name = Constant.CODE_TRANS_PRE + "surlevel")
    public String getSurlevel() {
        return surlevel;
    }

    public void setShipchecknum(String shipchecknum) {
        this.shipchecknum = shipchecknum;
    }

    public void setSurtrainnum(String surtrainnum) {
        this.surtrainnum = surtrainnum;
    }

    public void setCapscore(String capscore) {
        this.capscore = capscore;
    }

    public void setSurlevel(String surlevel) {
        this.surlevel = surlevel;
    }

    public List<ImageManager> getSurimg() {
        return surimg;
    }

    public void setSurimg(List<ImageManager> surimg) {
        this.surimg = surimg;
    }

    @JSONField(name = Constant.CODE_TRANS_PRE + "major")
    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public Map<String, List<Map<String, String>>> getWorkMap() {
        return workMap;
    }

    public void setWorkMap(Map<String, List<Map<String, String>>> workMap) {
        this.workMap = workMap;
    }
}