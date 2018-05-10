package com.chinasofti.domain;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class ShipCheck implements Serializable {
    private String id;

    private String uid;

    private String surid;

    private String areacode;

    private String ycbm;

    private String ycmc;

    private Short checkpass;

    private String checktime;

    private Short checktype;

    private String questtype;

    private String quesintro;

    private String checkitem;

    private String orgcode;

    private String year;

    private String rc1;

    private String rc2;

    private String rc3;

    private Short rc5;

    private String orgname;

    private String ycsname;

    private String xdname;

    private String groupcode;

    private String state;

    private String rc4;

    private String nextVerifyTime;

    private String sheetId;

    private String applyTime;

    private String ifstopapply;

    public String getOrgcode() {
        return orgcode;
    }

    public void setOrgcode(String orgcode) {
        this.orgcode = orgcode;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getRc1() {
        return rc1;
    }

    public void setRc1(String rc1) {
        this.rc1 = rc1;
    }

    public String getRc2() {
        return rc2;
    }

    public void setRc2(String rc2) {
        this.rc2 = rc2;
    }

    public String getRc3() {
        return rc3;
    }

    public void setRc3(String rc3) {
        this.rc3 = rc3;
    }

    public Short getRc5() {
        return rc5;
    }

    public void setRc5(Short rc5) {
        this.rc5 = rc5;
    }

    public String getOrgname() {
        return orgname;
    }

    public void setOrgname(String orgname) {
        this.orgname = orgname;
    }

    public String getYcsname() {
        return ycsname;
    }

    public void setYcsname(String ycsname) {
        this.ycsname = ycsname;
    }

    public String getXdname() {
        return xdname;
    }

    public void setXdname(String xdname) {
        this.xdname = xdname;
    }

    public String getGroupcode() {
        return groupcode;
    }

    public void setGroupcode(String groupcode) {
        this.groupcode = groupcode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getRc4() {
        return rc4;
    }

    public void setRc4(String rc4) {
        this.rc4 = rc4;
    }

    public String getNextVerifyTime() {
        return nextVerifyTime;
    }

    public void setNextVerifyTime(String nextVerifyTime) {
        this.nextVerifyTime = nextVerifyTime;
    }

    public String getSheetId() {
        return sheetId;
    }

    public void setSheetId(String sheetId) {
        this.sheetId = sheetId;
    }

    public String getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(String applyTime) {
        this.applyTime = applyTime;
    }

    public String getIfstopapply() {
        return ifstopapply;
    }

    public void setIfstopapply(String ifstopapply) {
        this.ifstopapply = ifstopapply;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    //渔船工作区域属性临时存储
    private String jobarea;
    //渔船检验年度(根据验船师所有检验年度获取)
    private List<Map<String,String>> yearList;
    //临时时间
    private String startYear;
    private String endYear;

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

    public String getSurid() {
        return surid;
    }

    public void setSurid(String surid) {
        this.surid = surid == null ? null : surid.trim();
    }

    public String getAreacode() {
        return areacode;
    }

    public void setAreacode(String areacode) {
        this.areacode = areacode == null ? null : areacode.trim();
    }

    public String getYcbm() {
        return ycbm;
    }

    public void setYcbm(String ycbm) {
        this.ycbm = ycbm == null ? null : ycbm.trim();
    }

    public String getYcmc() {
        return ycmc;
    }

    public void setYcmc(String ycmc) {
        this.ycmc = ycmc == null ? null : ycmc.trim();
    }

    public Short getCheckpass() {
        return checkpass;
    }

    public void setCheckpass(Short checkpass) {
        this.checkpass = checkpass;
    }

    public String getChecktime() {
        return checktime;
    }

    public void setChecktime(String checktime) {
        this.checktime = checktime == null ? null : checktime.trim();
    }

    public Short getChecktype() {
        return checktype;
    }

    public void setChecktype(Short checktype) {
        this.checktype = checktype;
    }

    public String getQuesttype() {
        return questtype;
    }

    public void setQuesttype(String questtype) {
        this.questtype = questtype == null ? null : questtype.trim();
    }

    public String getQuesintro() {
        return quesintro;
    }

    public void setQuesintro(String quesintro) {
        this.quesintro = quesintro == null ? null : quesintro.trim();
    }

    public String getCheckitem() {
        return checkitem;
    }

    public void setCheckitem(String checkitem) {
        this.checkitem = checkitem == null ? null : checkitem.trim();
    }

    public String getJobarea() {
        return jobarea;
    }

    public void setJobarea(String jobarea) {
        this.jobarea = jobarea;
    }

    public List<Map<String, String>> getYearList() {
        return yearList;
    }

    public void setYearList(List<Map<String, String>> yearList) {
        this.yearList = yearList;
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