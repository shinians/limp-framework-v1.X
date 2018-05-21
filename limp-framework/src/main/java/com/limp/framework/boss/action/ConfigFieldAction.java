package com.limp.framework.boss.action;

import com.limp.framework.boss.domain.Config;
import com.limp.framework.boss.domain.ConfigField;
import com.limp.framework.boss.service.ConfigFieldService;
import com.limp.framework.core.abs.AbstractAction;
import com.limp.framework.core.annotation.Access;
import com.limp.framework.core.bean.Pager;
import com.limp.framework.core.bean.Result;
import com.limp.framework.core.bean.ResultCode;
import com.limp.framework.core.constant.ResultMsg;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @author:shinian
 * @description:
 * @date:Created in 21:09 2018/4/15
 * @modified By:
 */
@Controller
@RequestMapping("/system/conf")
public class ConfigFieldAction  extends AbstractAction {

    private static Logger log = Logger.getLogger(ConfigFieldAction.class);

    /**
     * 每页显示的条数
     */
    private static final Integer DEFAULT_ROW = 30;

    @Autowired
    private ConfigFieldService configFieldService;

    /**
     * 更新update：
     * @return
     */
    @Access(login = true,privilege = true)
    @RequestMapping(value ="updateConfFields",produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String updateConfFields(@RequestParam Map<String, String> params) {
        log.info(params);
        if(params.size()>0){
            for(Map.Entry<String, String> entry:params.entrySet()){
                ConfigField configField=new ConfigField();
                configField.setId(entry.getKey());
                configField.setValue(entry.getValue());
                configFieldService.update(configField);
            }
        }
        return Result.getInstance(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, params, "").getJson();
    }
    /**
     * 获取ConfField分页数据：
     * @param pager
     * @param configField
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="getConfFieldPageList",produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getUserList(Pager pager,ConfigField configField) {
        pager = new Pager(pager.getPage(), DEFAULT_ROW);
        Pager<ConfigField> domainList = configFieldService.getConfigFieldList(pager,configField);
        return Result.getInstance(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, domainList, "").getJson();
    }

    /**
     * 获取ConfPage分页数据：
     * @param pager
     * @param config
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="getConfPageList",produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getUserList(Pager pager,Config config) {
        pager = new Pager(pager.getPage(), DEFAULT_ROW);
        Pager<Config> domainList = configFieldService.getConfigList(pager, config);
        return Result.getInstance(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, domainList, "").getJson();
    }
}
