package com.limp.framework.boss.action;

import com.limp.framework.boss.domain.UserUnit;
import com.limp.framework.boss.service.UserUnitService;
import com.limp.framework.core.abs.AbstractCRUDAction;
import com.limp.framework.core.annotation.Access;
import com.limp.framework.core.bean.Result;
import com.limp.framework.core.bean.ResultCode;
import com.limp.framework.core.constant.ResultMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * @author:zzh
 * Date: 17-7-6
 * Time: 下午11:15
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/system/unit")
public class UserUnitAction  extends AbstractCRUDAction<UserUnit> {
    @Autowired
    private UserUnitService userUnitService ;


    /**
     * 用户组
     * @param session
     * @return
     */
    @Access(login=true,privilege = false)
    @RequestMapping(value ="list", produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getPermissionList(HttpSession session) {
        List<UserUnit> list = userUnitService.getList();
        return Result.getInstance(ResultCode.SUCCESS.toString()
                , ResultMsg.SUCCESS, list, "").getJson();
    }
    @Override
    protected void prepare() {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
