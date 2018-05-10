package com.chinasofti.domain;

import java.io.Serializable;

public class DicCode implements Serializable {
    private String dictCate;

    private String dictdataName;

    private String dictdataValue;

    private String dictIntro;

    private String dictStatue;

    private String dictPvalue;

    private Short dictSort;

    private static final long serialVersionUID = 1L;

    public String getDictCate() {
        return dictCate;
    }

    public void setDictCate(String dictCate) {
        this.dictCate = dictCate == null ? null : dictCate.trim();
    }

    public String getDictdataName() {
        return dictdataName;
    }

    public void setDictdataName(String dictdataName) {
        this.dictdataName = dictdataName == null ? null : dictdataName.trim();
    }

    public String getDictdataValue() {
        return dictdataValue;
    }

    public void setDictdataValue(String dictdataValue) {
        this.dictdataValue = dictdataValue == null ? null : dictdataValue.trim();
    }

    public String getDictIntro() {
        return dictIntro;
    }

    public void setDictIntro(String dictIntro) {
        this.dictIntro = dictIntro == null ? null : dictIntro.trim();
    }

    public String getDictStatue() {
        return dictStatue;
    }

    public void setDictStatue(String dictStatue) {
        this.dictStatue = dictStatue == null ? null : dictStatue.trim();
    }

    public String getDictPvalue() {
        return dictPvalue;
    }

    public void setDictPvalue(String dictPvalue) {
        this.dictPvalue = dictPvalue == null ? null : dictPvalue.trim();
    }

    public Short getDictSort() {
        return dictSort;
    }

    public void setDictSort(Short dictSort) {
        this.dictSort = dictSort;
    }
}