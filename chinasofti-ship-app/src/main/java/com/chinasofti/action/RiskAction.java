package com.chinasofti.action;

import com.limp.framework.boss.action.BaseAction;
import com.limp.framework.core.annotation.Access;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created with IntelliJ IDEA.
 * User: chen
 * Date: 16-1-11
 * Time: 下午9:08
 * To change this template use File | Settings | File Templates.
 */
//风险监测action
@Controller
@RequestMapping("/risk")
public class RiskAction extends BaseAction {
    private static Logger log= Logger.getLogger(RiskAction.class);

    /**
     * 查询页面
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="search")
    public String main(HttpServletRequest request, Model model){

        return "risk/riskSearch";
    }

}
