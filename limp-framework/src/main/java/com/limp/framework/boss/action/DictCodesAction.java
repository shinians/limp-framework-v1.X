package com.limp.framework.boss.action;

import com.limp.framework.boss.domain.DicCodes;
import com.limp.framework.boss.service.AreaCodeService;
import com.limp.framework.boss.service.DictCodesService;
import com.limp.framework.boss.service.PermissionService;
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

import java.awt.*;
import java.util.*;

/**
 *
 *码表管理
 * @author: zzh
 * Date: 17-6-27
 * Time: 上午9:14
 * To change this template use File | Settings | File Templates.
 */


@Controller
@RequestMapping("/system/dict")
public class DictCodesAction extends AbstractAction {
    /**
     * 每页显示的条
     */
    private static final Integer DEFAULT_ROW = 10;

    /**
     *  一共多少行
     */
    private Integer rowCount;


    @Autowired
    private DictCodesService dictCodesService;


    /**
     * 查询数据字段方法Pager
     * @param pager
     * @param dicCode
     * @param orderStr
     * @param orderType
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="getDictList",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String getUserList(Pager pager,DicCodes dicCode,String orderStr,String orderType) {
        pager = new Pager(pager.getPage(), DEFAULT_ROW);
        Pager<DicCodes> dicCodesPager = dictCodesService.getPageDomainList(orderStr, dicCode, pager);
        return  new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS,dicCodesPager,"").getJson();
    }

    /**
     * 新增码表
     * @param dicCode
     * @return
     */
    @Access(login = true,privilege = true,operationLog = OPERATION.INSERT,operationIntro = "管理员新增码表记录")
    @RequestMapping(value ="save",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String add(DicCodes dicCode) {
        if(dictCodesService.save(dicCode)) {
            return  new Result(ResultCode.SUCCESS.toString(), ResultMsg.ADD_SUCCESS,"","").getJson();
        };
        return  new Result(ResultCode.ERROR.toString(), ResultMsg.ADD_ERROR,"","").getJson();
    }
    /**
     * 修改码表
     * @param dicCode
     * @return
     */
    @Access(login = true,privilege = false,operationLog = OPERATION.UPDATE,operationIntro = "管理员修改码表记录")
    @RequestMapping(value ="update",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String update(DicCodes dicCode) {
       if( dictCodesService.update(dicCode)){
           return  new Result(ResultCode.SUCCESS.toString(), ResultMsg.UPDATE_SUCCESS,"","").getJson();
       };
        return  new Result(ResultCode.ERROR.toString(), ResultMsg.UPDATE_ERROR,"","").getJson();
    }
    /**
     * 删除码表
     * @param dicCode
     * @return
     */
    @Access(login = true,privilege = false,operationLog = OPERATION.DELETE,operationIntro = "管理员删除码表记录")
    @RequestMapping(value ="delete",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String delete(DicCodes dicCode) {
        if(StrUtils.isBlank(dicCode)||StrUtils.isBlank(dicCode.getDictKey())){
            return  new Result(ResultCode.ERROR.toString(), ResultMsg.PARAMS_ERROR,"","").getJson();
        }
        if(dictCodesService.delete(dicCode.getDictKey())){
            return  new Result(ResultCode.SUCCESS.toString(), ResultMsg.DEL_SUCCESS,"","").getJson();
        };
        return  new Result(ResultCode.ERROR.toString(), ResultMsg.DEL_ERROR,"","").getJson();
    }


    /**
     * 根据类型获取字典
     * @param cates
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="getDicByCate",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String getDicByCates(String cates) {
        Map map = dictCodesService.getDicByCates(cates);
        return  new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS,map,"").getJson();
    }
}
