package com.limp.framework.boss.action;

import com.limp.framework.boss.ApplicationContext;
import com.limp.framework.boss.domain.AreaCode;
import com.limp.framework.boss.domain.DicCodes;
import com.limp.framework.boss.service.AreaCodeService;
import com.limp.framework.core.abs.AbstractAction;
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

/**
 * @author:shinian
 * @description:
 * @date:Created in 20:48 2018/4/28
 * @modified By:
 */
@Controller
@RequestMapping("/system/area")
public class AreaAction extends AbstractAction {
    @Autowired
    private AreaCodeService areaCodeService;
    /**
     * 每页显示的条数
     */
    private static final Integer DEFAULT_ROW = 10;
    /**
     * 查询菜单方法Pager
     * @param pager
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="getAreaPageList",produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getMenuPageList(Pager pager,AreaCode areaCode) {
        pager = new Pager(pager.getPage(), DEFAULT_ROW);
        Pager<AreaCode> areaCodePager = areaCodeService.getAreaPageList(pager,areaCode);
        return  new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS,areaCodePager,"").getJson();
    }

    /**
     *
     * @param request
     * @param areaCode
     * @return
     */
    @Access(login = true,privilege = false,operationIntro = "新增地区码表",operationLog= OPERATION.INSERT)
    @RequestMapping(value ="save",produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String save(HttpServletRequest request,AreaCode areaCode) {
        if(areaCodeService.save(areaCode)){
            return  new Result(ResultCode.SUCCESS.toString(), ResultMsg.ADD_SUCCESS,"","").getJson();
        };
        return  new Result(ResultCode.ERROR.toString(), ResultMsg.ADD_ERROR,"","").getJson();
    }

    /**
     * 更新地区码表
     * @param request
     * @param areaCode
     * @return
     */
    @Access(login = true,privilege = false,operationIntro = "更新地区码表",operationLog= OPERATION.UPDATE)
    @RequestMapping(value ="update",produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String update(HttpServletRequest request,AreaCode areaCode) {
        if(areaCodeService.update(areaCode)){
            return  new Result(ResultCode.SUCCESS.toString(), ResultMsg.UPDATE_SUCCESS,"","").getJson();
        };
        return  new Result(ResultCode.ERROR.toString(), ResultMsg.UPDATE_ERROR,"","").getJson();
    }


    @Access(login = true,privilege = false,operationLog = OPERATION.DELETE,operationIntro = "管理员删除地区记录")
    @RequestMapping(value ="delete",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String delete(AreaCode areaCode) {
        if(StrUtils.isBlank(areaCode)||StrUtils.isBlank(areaCode.getCode())){
            return  new Result(ResultCode.ERROR.toString(), ResultMsg.PARAMS_ERROR,"","").getJson();
        }
        if(areaCodeService.delete(areaCode.getCode())){
            return  new Result(ResultCode.SUCCESS.toString(), ResultMsg.DEL_SUCCESS,"","").getJson();
        };
        return  new Result(ResultCode.ERROR.toString(), ResultMsg.DEL_ERROR,"","").getJson();
    }
}
