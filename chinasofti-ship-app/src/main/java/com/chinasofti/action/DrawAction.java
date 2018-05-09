package com.chinasofti.action;

import com.chinasofti.domain.DrawInfo;
import com.chinasofti.domain.EntInfo;
import com.chinasofti.domain.GmdssAllInfo;
import com.chinasofti.sevice.DrawService;
import com.limp.framework.core.abs.AbstractAction;
import com.limp.framework.core.annotation.Access;
import com.limp.framework.core.bean.Result;
import com.limp.framework.core.bean.ResultCode;
import com.limp.framework.core.constant.ResultMsg;
import com.limp.framework.utils.StrUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * Created by zhangxiaojin on 2017/8/2.
 * 描述：图纸审查一张图
 */
@Controller
@RequestMapping("/ship/draw")
public class DrawAction extends AbstractAction {
    @Resource
    private DrawService drawService;

    /**
     * 图纸审查一张图所有信息
     * @param model
     * @param response
     * @param session
     * @param
     * @return
     */
    @Access(login = false, privilege = false)
    @RequestMapping(value = "drawCheckAllInfo", produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getDrawCheckAllInfo(Model model, HttpServletResponse response, HttpSession session, DrawInfo drawInfo) {
        Map<String, Object> drawCheckAllInfo = drawService.getDrawCheckAllInfo(drawInfo);
        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, drawCheckAllInfo, "").getJson();
    }

    /**
     * 跳转到图纸
     * @param model
     * @param session
     * @param ent
     * @return
     */
    @Access(login = false, privilege = false)
    @RequestMapping(value = "index", produces = "text/plain;charset=UTF-8")
    public String save(Model model, HttpSession session, EntInfo ent) {
//        EntInfo entinfo = endService.getEntInfo(ent);
        model.addAttribute("pid", ent.getPid());
       /* if (StrUtils.isBlank(ent.getPid())) {
            entinfo.setEntcate(ent.getEntcate());
        }*/
        // todo 异常处理 为查询待数据
        return "ent/ent_index_8";
    }


    /**
     * 图纸审查历程
     * @param model
     * @param response
     * @param session
     * @param drawInfo
     * @return
     */
    @Access(login = false, privilege = false)
    @RequestMapping(value = "drawProList", produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String drawProList(Model model, HttpServletResponse response, HttpSession session, DrawInfo drawInfo) {
        Map<String, Object> drawProList = drawService.drawProList(drawInfo);
        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, drawProList, "").getJson();
    }

    /**
     *应用图纸建造图纸列表
     * @param model
     * @param response
     * @param session
     * @param drawInfo
     * @return
     */
    @Access(login = false, privilege = false)
    @RequestMapping(value = "shipCountList", produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String shipCountList(Model model, HttpServletResponse response, HttpSession session, DrawInfo drawInfo) {
        Map<String, Object> map = drawService.shipCountList(drawInfo);
        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, map, "").getJson();
    }

    /**
     * 图纸修改列表
     * @param model
     * @param response
     * @param session
     * @param drawInfo
     * @return
     */
    @Access(login = false, privilege = false)
    @RequestMapping(value = "shipRepairList", produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String shipRepairList(Model model, HttpServletResponse response, HttpSession session, DrawInfo drawInfo) {
        Map<String, Object> shipRepairList = drawService.shipRepairList(drawInfo);
        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, shipRepairList, "").getJson();
    }

}
