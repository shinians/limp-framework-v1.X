package com.limp.framework.boss.domain;


import com.limp.framework.core.abs.AbstractModel;

import java.util.Date;
import java.util.List;

public class Menu extends AbstractModel {
    /**
     * 用于排序使用
     */

    private String ssmMenuApi;

    private int child;

    private List<Menu> children;

    private String id;


    private String menSsmguid;

    private String menName;

    private String menDesc;

    private Integer menType;

    private String menFatherid;

    private String menUrl;


    private String menImgUrl;


    private Integer menSort;


    private Date menCreatedate;


    private Date menUpdatetime;

    private Integer menHints;


    private Integer menState;


    private String menField;

    private String menKeyword;
    /**
     * 父类标识
     */
    private String menFKeyword;


    private String menDatasource;


    private String menRc0;


    private String menRc1;


    private String menRc2;


    private String menRc3;


    private String menRc4;


    private String menRc5;


    private Integer menRc6;


    private Integer menRc7;


    private Date menRc8;


    private Date menRc9;


    public String getId() {
        return id;
    }

    public String getMenFKeyword() {
        return menFKeyword;
    }

    public void setMenFKeyword(String menFKeyword) {
        this.menFKeyword = menFKeyword;
    }

    public void setId(String id) {
        this.id = id;
    }


    public String getMenSsmguid() {
        return menSsmguid;
    }


    public void setMenSsmguid(String menSsmguid) {
        this.menSsmguid = menSsmguid == null ? null : menSsmguid.trim();
    }


    public String getMenName() {
        return menName;
    }


    public void setMenName(String menName) {
        this.menName = menName == null ? null : menName.trim();
    }

    public String getMenDesc() {
        return menDesc;
    }


    public void setMenDesc(String menDesc) {
        this.menDesc = menDesc == null ? null : menDesc.trim();
    }


    public Integer getMenType() {
        return menType;
    }


    public void setMenType(Integer menType) {
        this.menType = menType;
    }

    public String getMenFatherid() {
        return menFatherid;
    }


    public void setMenFatherid(String menFatherid) {
        this.menFatherid = menFatherid == null ? null : menFatherid.trim();
    }

    public String getMenUrl() {
        return menUrl;
    }


    public void setMenUrl(String menUrl) {
        this.menUrl = menUrl == null ? null : menUrl.trim();
    }


    public String getMenImgUrl() {
        return menImgUrl;
    }

    public void setMenImgUrl(String menImgUrl) {
        this.menImgUrl = menImgUrl == null ? null : menImgUrl.trim();
    }


    public Integer getMenSort() {
        return menSort;
    }


    public void setMenSort(Integer menSort) {
        this.menSort = menSort;
    }


    public Date getMenCreatedate() {
        return menCreatedate;
    }


    public void setMenCreatedate(Date menCreatedate) {
        this.menCreatedate = menCreatedate;
    }

    public Date getMenUpdatetime() {
        return menUpdatetime;
    }


    public void setMenUpdatetime(Date menUpdatetime) {
        this.menUpdatetime = menUpdatetime;
    }


    public Integer getMenHints() {
        return menHints;
    }


    public void setMenHints(Integer menHints) {
        this.menHints = menHints;
    }

    public Integer getMenState() {
        return menState;
    }


    public void setMenState(Integer menState) {
        this.menState = menState;
    }


    public String getMenField() {
        return menField;
    }

    public void setMenField(String menField) {
        this.menField = menField == null ? null : menField.trim();
    }


    public String getMenKeyword() {
        return menKeyword;
    }


    public void setMenKeyword(String menKeyword) {
        this.menKeyword = menKeyword == null ? null : menKeyword.trim();
    }

    public String getMenDatasource() {
        return menDatasource;
    }


    public void setMenDatasource(String menDatasource) {
        this.menDatasource = menDatasource == null ? null : menDatasource.trim();
    }


    public String getMenRc0() {
        return menRc0;
    }


    public void setMenRc0(String menRc0) {
        this.menRc0 = menRc0 == null ? null : menRc0.trim();
    }

    public String getMenRc1() {
        return menRc1;
    }


    public void setMenRc1(String menRc1) {
        this.menRc1 = menRc1 == null ? null : menRc1.trim();
    }


    public String getMenRc2() {
        return menRc2;
    }


    public void setMenRc2(String menRc2) {
        this.menRc2 = menRc2 == null ? null : menRc2.trim();
    }


    public String getMenRc3() {
        return menRc3;
    }


    public void setMenRc3(String menRc3) {
        this.menRc3 = menRc3 == null ? null : menRc3.trim();
    }


    public String getMenRc4() {
        return menRc4;
    }


    public void setMenRc4(String menRc4) {
        this.menRc4 = menRc4 == null ? null : menRc4.trim();
    }


    public String getMenRc5() {
        return menRc5;
    }


    public void setMenRc5(String menRc5) {
        this.menRc5 = menRc5 == null ? null : menRc5.trim();
    }


    public Integer getMenRc6() {
        return menRc6;
    }


    public void setMenRc6(Integer menRc6) {
        this.menRc6 = menRc6;
    }


    public Integer getMenRc7() {
        return menRc7;
    }

    public void setMenRc7(Integer menRc7) {
        this.menRc7 = menRc7;
    }


    public Date getMenRc8() {
        return menRc8;
    }


    public void setMenRc8(Date menRc8) {
        this.menRc8 = menRc8;
    }


    public Date getMenRc9() {
        return menRc9;
    }


    public void setMenRc9(Date menRc9) {
        this.menRc9 = menRc9;
    }

    public int getChild() {
        return child;
    }

    public void setChild(int child) {
        this.child = child;
    }

    public String getSsmMenuApi() {
        return ssmMenuApi;
    }

    public void setSsmMenuApi(String ssmMenuApi) {
        this.ssmMenuApi = ssmMenuApi;
    }

    public List<Menu> getChildren() {
        return children;
    }

    public void setChildren(List<Menu> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "ssmMenuApi='" + ssmMenuApi + '\'' +
                ", child=" + child +
                ", id='" + id + '\'' +
                ", menSsmguid='" + menSsmguid + '\'' +
                ", menName='" + menName + '\'' +
                ", menDesc='" + menDesc + '\'' +
                ", menType=" + menType +
                ", menFatherid='" + menFatherid + '\'' +
                ", menUrl='" + menUrl + '\'' +
                ", menImgUrl='" + menImgUrl + '\'' +
                ", menSort=" + menSort +
                ", menCreatedate=" + menCreatedate +
                ", menUpdatetime=" + menUpdatetime +
                ", menHints=" + menHints +
                ", menState=" + menState +
                ", menField='" + menField + '\'' +
                ", menKeyword='" + menKeyword + '\'' +
                ", menDatasource='" + menDatasource + '\'' +
                ", menRc0='" + menRc0 + '\'' +
                ", menRc1='" + menRc1 + '\'' +
                ", menRc2='" + menRc2 + '\'' +
                ", menRc3='" + menRc3 + '\'' +
                ", menRc4='" + menRc4 + '\'' +
                ", menRc5='" + menRc5 + '\'' +
                ", menRc6=" + menRc6 +
                ", menRc7=" + menRc7 +
                ", menRc8=" + menRc8 +
                ", menRc9=" + menRc9 +
                ", children=" + children +
                '}';
    }
}