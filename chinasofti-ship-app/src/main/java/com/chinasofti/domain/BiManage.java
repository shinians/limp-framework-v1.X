package com.chinasofti.domain;

import com.limp.framework.core.abs.AbstractModel;

import java.io.Serializable;
import java.util.Date;

public class BiManage extends AbstractModel implements Serializable {
    private String id;

    private String name;

    private String intro;

    private String model;

    private Short type;

    private String fatherid;

    private String url;

    private Short urltype;

    private String width;

    private String height;

    private Short page;

    private Short celltype;

    private String sql;

    private String option;

    private String option1;

    private String datajson;

    private Date idt;

    private Date udt;

    private String account;

    private String code;

    private Short show;

    private Short sort;

    private Short state;

    private String rc1;

    private String rc2;

    private String rc3;

    private Short rc4;

    private Short rc5;

    private Date rc6;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro == null ? null : intro.trim();
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model == null ? null : model.trim();
    }

    public Short getType() {
        return type;
    }

    public void setType(Short type) {
        this.type = type;
    }

    public String getFatherid() {
        return fatherid;
    }

    public void setFatherid(String fatherid) {
        this.fatherid = fatherid == null ? null : fatherid.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Short getUrltype() {
        return urltype;
    }

    public void setUrltype(Short urltype) {
        this.urltype = urltype;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width == null ? null : width.trim();
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height == null ? null : height.trim();
    }

    public Short getPage() {
        return page;
    }

    public void setPage(Short page) {
        this.page = page;
    }

    public Short getCelltype() {
        return celltype;
    }

    public void setCelltype(Short celltype) {
        this.celltype = celltype;
    }

    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql == null ? null : sql.trim();
    }

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option == null ? null : option.trim();
    }

    public String getOption1() {
        return option1;
    }

    public void setOption1(String option1) {
        this.option1 = option1 == null ? null : option1.trim();
    }

    public String getDatajson() {
        return datajson;
    }

    public void setDatajson(String datajson) {
        this.datajson = datajson == null ? null : datajson.trim();
    }

    public Date getIdt() {
        return idt;
    }

    public void setIdt(Date idt) {
        this.idt = idt;
    }

    public Date getUdt() {
        return udt;
    }

    public void setUdt(Date udt) {
        this.udt = udt;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public Short getShow() {
        return show;
    }

    public void setShow(Short show) {
        this.show = show;
    }

    public Short getSort() {
        return sort;
    }

    public void setSort(Short sort) {
        this.sort = sort;
    }

    public Short getState() {
        return state;
    }

    public void setState(Short state) {
        this.state = state;
    }

    public String getRc1() {
        return rc1;
    }

    public void setRc1(String rc1) {
        this.rc1 = rc1 == null ? null : rc1.trim();
    }

    public String getRc2() {
        return rc2;
    }

    public void setRc2(String rc2) {
        this.rc2 = rc2 == null ? null : rc2.trim();
    }

    public String getRc3() {
        return rc3;
    }

    public void setRc3(String rc3) {
        this.rc3 = rc3 == null ? null : rc3.trim();
    }

    public Short getRc4() {
        return rc4;
    }

    public void setRc4(Short rc4) {
        this.rc4 = rc4;
    }

    public Short getRc5() {
        return rc5;
    }

    public void setRc5(Short rc5) {
        this.rc5 = rc5;
    }

    public Date getRc6() {
        return rc6;
    }

    public void setRc6(Date rc6) {
        this.rc6 = rc6;
    }
}