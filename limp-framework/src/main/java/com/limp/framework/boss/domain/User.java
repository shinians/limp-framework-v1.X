package com.limp.framework.boss.domain;

import com.limp.framework.core.abs.AbstractModel;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class User extends AbstractModel implements Serializable {

    private String id;

    private String usrAccount;

    private String usrName;

    private String usrRemarks;

    private String usrPassword;

    private String usrIp;

    private String usrMac;

    private Integer usrIsautoexpire;

    private Date usrExpire;

    private String usrExpireStr;

    private Integer usrIsbindip;

    private Integer usrIsbindmac;

    private Date usrLasttime;

    private String usrLastip;

    private String usrLastmac;

    private Integer usrLogincount;

    private Date usrCreatedate;

    private Date usrUpdatetime;

    private Integer usrState;

    private String usrRc0;

    private String usrRc1;

    private String usrRc2;

    private Integer usrRc3;

    private Integer usrRc4;

    private Date usrRc5;

    private String usrEmail;
    private String conAccount;
    private String apptype;
    private String usrRc6;
    private String usrRc7;
    private String usrRc8;
    private Integer usrRc9;
    private String optAccount;


    public String getUsrEmail() {
        return usrEmail;
    }

    public void setUsrEmail(String usrEmail) {
        this.usrEmail = usrEmail;
    }

    public String getConAccount() {
        return conAccount;
    }

    public void setConAccount(String conAccount) {
        this.conAccount = conAccount;
    }

    public String getApptype() {
        return apptype;
    }

    public void setApptype(String apptype) {
        this.apptype = apptype;
    }

    public String getUsrRc6() {
        return usrRc6;
    }

    public void setUsrRc6(String usrRc6) {
        this.usrRc6 = usrRc6;
    }

    public String getUsrRc7() {
        return usrRc7;
    }

    public void setUsrRc7(String usrRc7) {
        this.usrRc7 = usrRc7;
    }

    public String getUsrRc8() {
        return usrRc8;
    }

    public void setUsrRc8(String usrRc8) {
        this.usrRc8 = usrRc8;
    }

    public Integer getUsrRc9() {
        return usrRc9;
    }

    public void setUsrRc9(Integer usrRc9) {
        this.usrRc9 = usrRc9;
    }

    public String getOptAccount() {
        return optAccount;
    }

    public void setOptAccount(String optAccount) {
        this.optAccount = optAccount;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    private String[] roles;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsrAccount() {
        return usrAccount;
    }

    public void setUsrAccount(String usrAccount) {
        this.usrAccount = usrAccount == null ? null : usrAccount.trim();
    }

    public String getUsrName() {
        return usrName;
    }

    public void setUsrName(String usrName) {
        this.usrName = usrName == null ? null : usrName.trim();
    }

    public String getUsrRemarks() {
        return usrRemarks;
    }

    public void setUsrRemarks(String usrRemarks) {
        this.usrRemarks = usrRemarks == null ? null : usrRemarks.trim();
    }

    public String getUsrPassword() {
        return usrPassword;
    }

    public void setUsrPassword(String usrPassword) {
        this.usrPassword = usrPassword == null ? null : usrPassword.trim();
    }

    public String getUsrIp() {
        return usrIp;
    }

    public void setUsrIp(String usrIp) {
        this.usrIp = usrIp == null ? null : usrIp.trim();
    }

    public String getUsrMac() {
        return usrMac;
    }

    public void setUsrMac(String usrMac) {
        this.usrMac = usrMac == null ? null : usrMac.trim();
    }

    public Integer getUsrIsautoexpire() {
        return usrIsautoexpire;
    }

    public void setUsrIsautoexpire(Integer usrIsautoexpire) {
        this.usrIsautoexpire = usrIsautoexpire;
    }

    public Date getUsrExpire() {
        return usrExpire;
    }

    public String getUsrExpireStr() {
        String dateStr="无";
        try {
            SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
            dateStr= simpleDateFormat.format(usrExpire);
        }catch (Exception e){
        }
        return dateStr;
    }

    public void setUsrExpireStr(String usrExpireStr) {
        this.usrExpireStr = usrExpireStr;
    }

    public void setUsrExpire(Date usrExpire) {
        this.usrExpire = usrExpire;
    }

    public Integer getUsrIsbindip() {
        return usrIsbindip;
    }

    public void setUsrIsbindip(Integer usrIsbindip) {
        this.usrIsbindip = usrIsbindip;
    }

    public Integer getUsrIsbindmac() {
        return usrIsbindmac;
    }

    public void setUsrIsbindmac(Integer usrIsbindmac) {
        this.usrIsbindmac = usrIsbindmac;
    }

    public Date getUsrLasttime() {
        return usrLasttime;
    }

    public void setUsrLasttime(Date usrLasttime) {
        this.usrLasttime = usrLasttime;
    }

    public String getUsrLastip() {
        return usrLastip;
    }

    public void setUsrLastip(String usrLastip) {
        this.usrLastip = usrLastip == null ? null : usrLastip.trim();
    }

    public String getUsrLastmac() {
        return usrLastmac;
    }

    public void setUsrLastmac(String usrLastmac) {
        this.usrLastmac = usrLastmac == null ? null : usrLastmac.trim();
    }

    public Integer getUsrLogincount() {
        return usrLogincount;
    }

    public void setUsrLogincount(Integer usrLogincount) {
        this.usrLogincount = usrLogincount;
    }

    public Date getUsrCreatedate() {
        return usrCreatedate;
    }

    public void setUsrCreatedate(Date usrCreatedate) {
        this.usrCreatedate = usrCreatedate;
    }

    public Date getUsrUpdatetime() {
        return usrUpdatetime;
    }

    public void setUsrUpdatetime(Date usrUpdatetime) {
        this.usrUpdatetime = usrUpdatetime;
    }

    public Integer getUsrState() {
        return usrState;
    }

    public void setUsrState(Integer usrState) {
        this.usrState = usrState;
    }

    public String getUsrRc0() {
        return usrRc0;
    }

    public void setUsrRc0(String usrRc0) {
        this.usrRc0 = usrRc0 == null ? null : usrRc0.trim();
    }

    public String getUsrRc1() {
        return usrRc1;
    }

    public void setUsrRc1(String usrRc1) {
        this.usrRc1 = usrRc1 == null ? null : usrRc1.trim();
    }

    public String getUsrRc2() {
        return usrRc2;
    }

    public void setUsrRc2(String usrRc2) {
        this.usrRc2 = usrRc2 == null ? null : usrRc2.trim();
    }

    public Integer getUsrRc3() {
        return usrRc3;
    }

    public void setUsrRc3(Integer usrRc3) {
        this.usrRc3 = usrRc3;
    }

    public Integer getUsrRc4() {
        return usrRc4;
    }

    public void setUsrRc4(Integer usrRc4) {
        this.usrRc4 = usrRc4;
    }

    public Date getUsrRc5() {
        return usrRc5;
    }

    public void setUsrRc5(Date usrRc5) {
        this.usrRc5 = usrRc5;
    }

    public String[] getRoles() {
        if (this.getRoleList() != null){
            return this.getRoleList().toArray(new String[0]);
        }
        return roles == null ? new String[0] : roles;
    }

    public void setRoles(String[] roles) {
        this.roles = roles;
    }

    private String role;

    private List<String> roleList;

    public List<String> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<String> roleList) {
        this.roleList = roleList;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", usrAccount='" + usrAccount + '\'' +
                ", usrName='" + usrName + '\'' +
                ", usrRemarks='" + usrRemarks + '\'' +
                ", usrPassword='" + usrPassword + '\'' +
                ", usrIp='" + usrIp + '\'' +
                ", usrMac='" + usrMac + '\'' +
                ", usrIsautoexpire=" + usrIsautoexpire +
                ", usrIsbindip=" + usrIsbindip +
                ", usrIsbindmac=" + usrIsbindmac +
                ", usrLasttime=" + usrLasttime +
                ", usrLastip='" + usrLastip + '\'' +
                ", usrLastmac='" + usrLastmac + '\'' +
                ", usrLogincount=" + usrLogincount +
                ", usrCreatedate=" + usrCreatedate +
                ", usrUpdatetime=" + usrUpdatetime +
                ", usrState=" + usrState +
                ", usrRc0='" + usrRc0 + '\'' +
                ", usrRc1='" + usrRc1 + '\'' +
                ", usrRc2='" + usrRc2 + '\'' +
                ", usrRc3=" + usrRc3 +
                ", usrRc4=" + usrRc4 +
                ", usrRc5=" + usrRc5 +
                ", roles=" + (roles == null ? null : Arrays.asList(roles)) +
                ", role='" + role + '\'' +
                '}';
    }
}