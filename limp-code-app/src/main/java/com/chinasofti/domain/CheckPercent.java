package com.chinasofti.domain;

import java.util.List;

/**
 * Created by zhangxiaojin on 2017/7/28.
 * 描述：
 */
public class CheckPercent {
    List<Integer> xAxis;//折线图横轴
    List<Integer> ownerList;//本企业合格率
    List<Integer> countryList;//全国的合格率

    public List<Integer> getxAxis() {
        return xAxis;
    }

    public void setxAxis(List<Integer> xAxis) {
        this.xAxis = xAxis;
    }

    public List<Integer> getOwnerList() {
        return ownerList;
    }

    public void setOwnerList(List<Integer> ownerList) {
        this.ownerList = ownerList;
    }

    public List<Integer> getCountryList() {
        return countryList;
    }

    public void setCountryList(List<Integer> countryList) {
        this.countryList = countryList;
    }
}
