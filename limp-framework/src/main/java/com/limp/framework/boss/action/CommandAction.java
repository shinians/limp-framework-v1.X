package com.limp.framework.boss.action;

import com.limp.framework.boss.ApplicationContext;
import com.limp.framework.boss.domain.Command;
import com.limp.framework.boss.domain.PageLog;
import com.limp.framework.boss.service.CommandService;
import com.limp.framework.boss.service.LogService;
import com.limp.framework.core.annotation.Access;
import com.limp.framework.core.bean.Pager;
import com.limp.framework.core.bean.Result;
import com.limp.framework.core.bean.ResultCode;
import com.limp.framework.core.constant.OPERATION;
import com.limp.framework.core.constant.ResultMsg;
import com.limp.framework.utils.StrUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

/**
 * @author:shinian
 * @description:
 * @date:Created in 16:21 2017/12/8
 * @modified By:
 */
@Controller
@RequestMapping("/system/command")
public class CommandAction {
    @Autowired
    private CommandService commandService;

    /**
     * 每页显示的条数
     */
    private static final Integer DEFAULT_ROW = 10;

    /**
     *  一共多少行
     */
    private Integer rowCount;
    /**
     * 查询数据字段方法Pager
     * @param pager
     * @param command
     * @param orderStr
     * @param orderType
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="getPageList",produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getUserList(Pager pager,Command command,String orderStr,String orderType) {
        pager = new Pager(pager.getPage(), DEFAULT_ROW);
        Pager<Command> domainList = commandService.getCommandDomainList(orderStr,command, pager);
        rowCount = pager.getRowCount();
        return  new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS,domainList,"").getJson();
    }

    /**
     * 查询命令;
     * @param code
     * @return
     */
    @Access(login = true,privilege = true,operationIntro = "查询系统命令",operationLog = OPERATION.SELECT)
    @RequestMapping(value ="run",produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String run(String code) {
        if(StrUtils.isBlank(code)){
            return Result.getInstance(ResultCode.ERROR.toString(), ResultMsg.ERROR,"code参数不为空","").getJson();
        }
        List<Map<String,Object>> runCommand= commandService.runCommand(code);
        return  new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS,runCommand,"").getJson();
    }

    /**
     *
     * @param request
     * @param command
     * @return
     */
    @Access(login = true,privilege = true,operationIntro = "新增命令",operationLog= OPERATION.INSERT)
    @RequestMapping(value ="save",produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String save(HttpServletRequest request,Command command) {
        command.setOptuser(ApplicationContext.getLoginUser(request).getUsrAccount());
        if(commandService.save(command)){
            return  new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS,"","").getJson();
        };
        return  new Result(ResultCode.ERROR.toString(), ResultMsg.ERROR,"","").getJson();
    }

    /**
     * 更新系统命令
     * @param request
     * @param command
     * @return
     */
    @Access(login = true,privilege = true,operationIntro = "更新系统命令",operationLog= OPERATION.UPDATE)
    @RequestMapping(value ="update",produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String update(HttpServletRequest request,Command command) {
        command.setOptuser(ApplicationContext.getLoginUser(request).getUsrAccount());
        if(commandService.update(command)){
            return  new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS,"","").getJson();
        };
        return  new Result(ResultCode.ERROR.toString(), ResultMsg.ERROR,"","").getJson();
    }

}
