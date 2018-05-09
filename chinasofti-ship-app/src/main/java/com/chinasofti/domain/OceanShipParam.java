package com.chinasofti.domain;

import com.limp.framework.utils.StrUtils;

/**
 * Created by icss on 2017/12/1.
 * gis远洋渔船接收查询参数对象
 */
public class OceanShipParam {
    private Double lng1;
    private Double lat1;
    private Double lng2;
    private Double lat2;
    private String shipName;
    private String status;//检验状态:0.待检 1.已检 2.脱检
    private String safeScore;//0低:0-60分;1中:60-80分;2高:80-100分
    private String rate;//0低:0-60分;1中:60-80分;2高:80-100分
    private String age;//0:船龄15年以下;1:15-25 2:26-35;3:35年以上
    private String ownerName;//船东姓名
    private String[] ages;
    private String[] rates;
    private String[] scores;
    private String[] statuses;

    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void init(){
        if (!StrUtils.isBlank(age)) {
            ages = age.split(",");
        }
        if (!StrUtils.isBlank(rate)) {
            rates = rate.split(",");
        }
        if (!StrUtils.isBlank(safeScore)) {
            scores = safeScore.split(",");
        }
        if (!StrUtils.isBlank(status)) {
            statuses = status.split(",");
        }
    }

    public String[] getStatuses() {
        return statuses;
    }

    public void setStatuses(String[] statuses) {
        this.statuses = statuses;
    }

    public String[] getAges() {
        return ages;
    }

    public void setAges(String[] ages) {
        this.ages = ages;
    }

    public String[] getRates() {
        return rates;
    }

    public void setRates(String[] rates) {
        this.rates = rates;
    }

    public String[] getScores() {
        return scores;
    }

    public void setScores(String[] scores) {
        this.scores = scores;
    }

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    public String getSafeScore() {
        return safeScore;
    }

    public void setSafeScore(String safeScore) {
        this.safeScore = safeScore;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Double getLng1() {
        return lng1;
    }

    public void setLng1(Double lng1) {
        this.lng1 = lng1;
    }

    public Double getLat1() {
        return lat1;
    }

    public void setLat1(Double lat1) {
        this.lat1 = lat1;
    }

    public Double getLng2() {
        return lng2;
    }

    public void setLng2(Double lng2) {
        this.lng2 = lng2;
    }

    public Double getLat2() {
        return lat2;
    }

    public void setLat2(Double lat2) {
        this.lat2 = lat2;
    }
}
