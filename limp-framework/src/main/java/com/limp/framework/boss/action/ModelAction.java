package com.limp.framework.boss.action;

import com.limp.framework.core.annotation.Access;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created with IntelliJ IDEA.
 * @author:zzh
 * Date: 16-1-30
 * Time: 下午7:36
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/system/model")
public class ModelAction extends  BaseAction{

    private static Logger log = Logger.getLogger(ModelAction.class);
    /**
     *  图标页面
     * @return
     * @throws Exception
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value = "ico")
    public String index() throws Exception {
        return "../system/model/ico";

    }
}
