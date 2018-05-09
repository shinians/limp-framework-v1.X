package com.limp.framework.boss.action;

import com.limp.framework.boss.ApplicationContext;
import com.limp.framework.boss.domain.MSG;
import com.limp.framework.boss.domain.User;
import com.limp.framework.boss.service.MsgService;
import com.limp.framework.core.annotation.Access;
import com.limp.framework.core.bean.Pager;
import com.limp.framework.core.bean.Result;
import com.limp.framework.core.bean.ResultCode;
import com.limp.framework.core.constant.Constant;
import com.limp.framework.core.constant.OPERATION;
import com.limp.framework.core.constant.ResultMsg;
import com.limp.framework.utils.StrUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * @author:zzh
 * Date: 16-1-30
 * Time: 下午7:36
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/system/msg")
public class MsgAction extends  BaseAction{
    private static Logger log = Logger.getLogger(MsgAction.class.getName());
    /**
     * 一共多少行
     */
    private Integer rowCount;
    private static final Integer DEFAULT_ROW = 10;

    @Resource
    private MsgService msgService;


    /**
     * 获得用户列表
     * @param pager 分页 f
     * @param msg 用户   y
     * @param orderName
     * @param orderType
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="getMsgList",produces = "text/plain;charset=UTF-8",method = RequestMethod.POST)
    public @ResponseBody String getMsgList(Pager pager,MSG msg,String orderName,String orderType) {
        pager = new Pager(pager.getPage(), DEFAULT_ROW);
        Pager<MSG> msgPager = msgService.getListExample(orderName,orderType,msg,pager);
        rowCount = pager.getRowCount();
        return  Result.getInstance(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS,msgPager,"").getJson();
    }


    @Access(login = true,privilege = false,operationLog = OPERATION.UPDATE,operationIntro = "用户已查看消息")
    @RequestMapping(value = "read",method = RequestMethod.POST,produces = "text/plain;charset=UTF-8")
    public @ResponseBody String readMsg(Model model,MSG msg,HttpSession session) {
        //验证是否为空
        if(StrUtils.isBlank(msg.getId())||StrUtils.isBlank(msg)){
            return  Result.getInstance(ResultCode.ERROR.toString(), ResultMsg.ERROR, ResultMsg.PARAMS_ERROR, "").getJson();
        }
        MSG readMsg=new MSG();
        readMsg.setId(msg.getId());
        readMsg.setStatus(new Short(Constant.STRING_1));
        if(msgService.update(readMsg)){
            //更新消息未读数量
            Integer retail=Integer.parseInt(session.getAttribute(Constant.KEY_MSGNUM).toString());
            retail=retail==0?0:retail-1;
            session.setAttribute(Constant.KEY_MSGNUM, retail);
            return  Result.getInstance(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, retail, "").getJson();
        };
        return  Result.getInstance(ResultCode.ERROR.toString(), ResultMsg.ERROR, "", "").getJson();
    }



    /**
     * 用户发送消息
     * @param msg
     * @return
     */
    @Access(login = true,privilege = false,operationLog = OPERATION.INSERT,operationIntro = "用户发送消息")
    @RequestMapping(value = "saveMsg",method = RequestMethod.POST,produces = "text/plain;charset=UTF-8")
    public @ResponseBody String saveMsg(MSG msg,HttpSession session) {
        //设置发送方id
        if(StrUtils.isBlank(msg.getUsridfrom())){
            User user=(User) ApplicationContext.getLoginUser(session);
            if(!StrUtils.isBlank(user)){
               msg.setUsridfrom(user.getId());
            }
        }
        if(!msgService.saveMsg(msg)){
            return  Result.getInstance(ResultCode.ERROR.toString(), ResultMsg.ADD_ERROR, "", "").getJson();
        } ;
        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.UPDATE_SUCCESS,"","").getJson();
       // return "redirect:msgList.action ";  //跳转到消息列表
    }

    @Access(login = true,privilege = false,operationLog = OPERATION.UPDATE,operationIntro = "用户更新消息")
    @RequestMapping(value = "update",method = RequestMethod.POST,produces = "text/plain;charset=UTF-8")
    public @ResponseBody String update(MSG msg) {
        if(msgService.update(msg)){
            return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS,"","").getJson();
        };
        return new Result(ResultCode.ERROR.toString(), ResultMsg.ERROR,"","").getJson();
    }




    @InitBinder
    public void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
    }



}
