package com.limp.framework.boss.domain;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 15-12-31
 * Time: 上午12:01
 * To change this template use File | Settings | File Templates.
 */
public class UserInfo {
    private Integer id;
    private String email;
    private String name;
    private String passWord;
    private String sex;
    private String enable;
    private Date createTime;
    private String phone;
    private  String regionAccount;
    private Integer unitId;
    private String idContent;
    private String userMark;
    private String sendMark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEnable() {
        return enable;
    }

    public void setEnable(String enable) {
        this.enable = enable;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRegionAccount() {
        return regionAccount;
    }

    public void setRegionAccount(String regionAccount) {
        this.regionAccount = regionAccount;
    }

    public Integer getUnitId() {
        return unitId;
    }

    public void setUnitId(Integer unitId) {
        this.unitId = unitId;
    }

    public String getIdContent() {
        return idContent;
    }

    public void setIdContent(String idContent) {
        this.idContent = idContent;
    }

    public String getUserMark() {
        return userMark;
    }

    public void setUserMark(String userMark) {
        this.userMark = userMark;
    }

    public String getSendMark() {
        return sendMark;
    }

    public void setSendMark(String sendMark) {
        this.sendMark = sendMark;
    }
}
