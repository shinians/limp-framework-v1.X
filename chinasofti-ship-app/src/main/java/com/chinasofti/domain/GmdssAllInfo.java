package com.chinasofti.domain;

import java.io.Serializable;
import java.util.List;

/**
 * Created by zxj on 2017/7/21.
 * gmdss主页面所有信息
 */
public class GmdssAllInfo implements Serializable {
    private EntInfo entInfo;//企业基本信息
    private Object entInfoExt;//企业关键指标及补充信息
    //Gmdss:维修设备数。产品制造企业：产品认可型号。筏站：累计检修筏数量。检测机构：累计检测产品数量
    private int repairCount;
    //Gmdss:装船数量。产品制造企业：出厂检验产品。筏站：检修期内救生筏数。
    private int onShipCount;
    private String percentOfPass;//Gmdss+筏站：监督抽查合格率。产品制造企业：产品检验合格率。
    private CheckPercent checkPercent;//监督抽查合格率 折线图
    private String cretInTime;//证书有效期
    private List<String> prictures;//企业图片展示
    private List<EntProHistory> entProHistoryList;//认可历程
    private List<Comment> commentList;//客户评价
    private List commentNums;//客户评价数量分析
    //检测机构：检测产品形式。GMDSS：维修产品形式。筏站：修筏产品形式。
    private int productTypes;//产品形式
    private int capability;//企业能力评估
    private int years;//企业注册年限，产品制造企业使用

    public List getCommentNums() {
        return commentNums;
    }

    public void setCommentNums(List commentNums) {
        this.commentNums = commentNums;
    }

    public CheckPercent getCheckPercent() {
        return checkPercent;
    }

    public void setCheckPercent(CheckPercent checkPercent) {
        this.checkPercent = checkPercent;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public EntInfo getEntInfo() {
        return entInfo;
    }

    public void setEntInfo(EntInfo entInfo) {
        this.entInfo = entInfo;
    }

    public Object getEntInfoExt() {
        return entInfoExt;
    }

    public void setEntInfoExt(Object entInfoExt) {
        this.entInfoExt = entInfoExt;
    }

    public int getRepairCount() {
        return repairCount;
    }

    public void setRepairCount(int repairCount) {
        this.repairCount = repairCount;
    }

    public int getOnShipCount() {
        return onShipCount;
    }

    public void setOnShipCount(int onShipCount) {
        this.onShipCount = onShipCount;
    }


    public String getPercentOfPass() {
        return percentOfPass;
    }

    public void setPercentOfPass(String percentOfPass) {
        this.percentOfPass = percentOfPass;
    }

    public String getCretInTime() {
        return cretInTime;
    }

    public void setCretInTime(String cretInTime) {
        this.cretInTime = cretInTime;
    }

    public List<String> getPrictures() {
        return prictures;
    }

    public void setPrictures(List<String> prictures) {
        this.prictures = prictures;
    }

    public List<EntProHistory> getEntProHistoryList() {
        return entProHistoryList;
    }

    public void setEntProHistoryList(List<EntProHistory> entProHistoryList) {
        this.entProHistoryList = entProHistoryList;
    }

    public List<Comment> getCommentList() {
        return commentList;
    }

    public void setCommentList(List<Comment> commentList) {
        this.commentList = commentList;
    }

    public int getProductTypes() {
        return productTypes;
    }

    public void setProductTypes(int productTypes) {
        this.productTypes = productTypes;
    }

    public int getCapability() {
        return capability;
    }

    public void setCapability(int capability) {
        this.capability = capability;
    }

    @Override
    public String toString() {
        return "GmdssAllInfo{" +
                "entInfo=" + entInfo +
                ", entInfoExt=" + entInfoExt +
                ", repairCount=" + repairCount +
                ", onShipCount=" + onShipCount +
                ", percentOfPass='" + percentOfPass + '\'' +
                ", checkPercent=" + checkPercent +
                ", cretInTime='" + cretInTime + '\'' +
                ", prictures=" + prictures +
                ", entProHistoryList=" + entProHistoryList +
                ", commentList=" + commentList +
                ", productTypes=" + productTypes +
                ", capability=" + capability +
                ", years=" + years +
                '}';
    }
}
