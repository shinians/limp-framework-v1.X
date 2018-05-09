package com.limp.framework.boss.domain;

import java.io.Serializable;
import java.util.Date;

public class MSG implements Serializable {
    private String id;

    private String title;

    private String intro;

    private String path;

    private Date idt;

    private String usridfrom;

    private String usrAccountFrom;


    private String usridto;

    private String usrAccountTo;

    private Short type;

    private Short read;

    private Date udt;

    private Short status;

    private String action;

    private String rc1;

    private String rc2;

    private Short rc3;

    private Short rc4;

    private Date rc5;

    private static final long serialVersionUID = 1L;

    public MSG(){
        super();
    }

    public MSG(String usridto,String title,String intro,Short type){
        this.usridto=usridto;
        this.title=title;
        this.intro=intro;
        this.type=type;

    }

    public String getUsrAccountTo() {
        return usrAccountTo;
    }

    public void setUsrAccountTo(String usrAccountTo) {
        this.usrAccountTo = usrAccountTo;
    }

    public String getUsrAccountFrom() {
        return usrAccountFrom;
    }

    public void setUsrAccountFrom(String usrAccountFrom) {
        this.usrAccountFrom = usrAccountFrom;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro == null ? null : intro.trim();
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    public Date getIdt() {
        return idt;
    }

    public void Date(Date idt) {
        this.idt = idt;
    }

    public void setIdt(Date idt) {
        this.idt = idt;
    }

    public String getUsridfrom() {
        return usridfrom;
    }

    public void setUsridfrom(String usridfrom) {
        this.usridfrom = usridfrom == null ? null : usridfrom.trim();
    }

    public String getUsridto() {
        return usridto;
    }

    public void setUsridto(String usridto) {
        this.usridto = usridto == null ? null : usridto.trim();
    }

    public Short getType() {
        return type;
    }

    public void setType(Short type) {
        this.type = type;
    }

    public Short getRead() {
        return read;
    }

    public void setRead(Short read) {
        this.read = read;
    }

    public Object getUdt() {
        return udt;
    }

    public void setUdt(Date udt) {
        this.udt = udt;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action == null ? null : action.trim();
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

    public Short getRc3() {
        return rc3;
    }

    public void setRc3(Short rc3) {
        this.rc3 = rc3;
    }

    public Short getRc4() {
        return rc4;
    }

    public void setRc4(Short rc4) {
        this.rc4 = rc4;
    }

    public Date getRc5() {
        return rc5;
    }

    public void setRc5(Date rc5) {
        this.rc5 = rc5;
    }
}