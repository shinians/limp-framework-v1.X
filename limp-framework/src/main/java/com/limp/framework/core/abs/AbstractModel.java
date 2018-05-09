package com.limp.framework.core.abs;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.limp.framework.boss.domain.User;
import com.limp.framework.utils.StrUtils;

import java.util.Date;

/**
 * 此类提供：实体类中共有属性进行定义
 * 如排序字段:lpsort
 */
public abstract class AbstractModel {
    /**
     * 定义排序字段：注意此处定义，其他类无需额外定义，否则报错
     */

    private String lpsort;
    //json转换异常 ，空实现
/*
    private String id;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }*/
    //todo: 以下所有内容为uums提供如有冲突，可注释掉

    /**
     *创建者
     */
    protected String createBy;
    /**
     * 创建日期
     */
    protected Date createDate;
    /**
     * 更新者
     */
    protected String updateBy;
    /**
     * 更新日期
     */
    protected Date updateDate;

    /**
     * 新增之前执行方法，需要手动调用
     * @param user
     */
    public void preInsert(User user){
        if (!StrUtils.isBlank(user.getId())){
            this.updateBy = user.getId();
            this.createBy = user.getId();
        } else {// 获取不到当前用户ID则为系统创建
            this.updateBy = "0";
            this.createBy = "0";
        }
        this.updateDate = new Date();
        this.createDate = this.updateDate;
    }

    /**
     * 更新之前执行方法，需要手动调用
     */
    public void preUpdate(User user){
        if (!StrUtils.isBlank(user.getId())){
            this.updateBy = user.getId();
        } else {
        // 获取不到当前用户ID则为系统创建
            this.updateBy = "0";
        }
        this.updateDate = new Date();
    }


    public String getCreateBy() {
        return createBy;
    }
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    public Date getCreateDate() {
        return createDate;
    }

    public String getUpdateBy() {
        return updateBy;
    }
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    public Date getUpdateDate() {
        return updateDate;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy== null ? null : createBy.trim();
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy== null ? null : updateBy.trim();
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getLpsort() {
        return lpsort;
    }

    public void setLpsort(String lpsort) {
        this.lpsort = lpsort;
    }
}
