package com.chinasofti.filter;

import com.chinasofti.domain.OrganInfo;
import com.chinasofti.domain.Surveyor;

import com.limp.framework.boss.ApplicationContext;
import com.limp.framework.boss.domain.User;
import com.limp.framework.boss.service.CommonService;
import com.limp.framework.boss.service.UserService;
import com.limp.framework.core.bean.Result;
import com.limp.framework.core.constant.Constant;
import com.limp.framework.utils.JsonUtils;
import com.limp.framework.utils.SecurityUtils;
import com.limp.framework.utils.StoreControl;
import com.limp.framework.utils.StrUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.jasig.cas.client.util.AssertionHolder;
import org.jasig.cas.client.validation.Assertion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;


public class CISInterceptor  implements HandlerInterceptor {



    private Log log=LogFactory.getLog(CISInterceptor.class);

   private static final String ENCODING = "UTF-8";

    @Autowired
    private CommonService commonService;
    @Autowired
    private UserService userService;


    @Override
    public boolean preHandle(HttpServletRequest request,HttpServletResponse response, Object handler) throws Exception {
        log.debug("/--开启大数据应用平台 拦截器----/");
        /**
         * 第一步：如果没有登陆
         * 第二步:判断用户是否登陆（登陆情况）
         *       2.1、登陆  -如果无业务权限信息：绑定验船师等信息（业务权限）
         *
         */

      try {
          Assertion assertion=AssertionHolder.getAssertion();
          //如果已经登录则，返回true
          User uUser= ApplicationContext.getLoginUser(request);
          /**
           * 1、没有登陆的情况，进行登陆操作
           */
            if(StrUtils.isBlank(uUser)||(!StrUtils.isBlank(assertion)
                    &&!assertion.getPrincipal().getName().equals(uUser.getUsrAccount()))){
                //1.1判断统一用户是否登陆，如果已经登陆则进行自动登陆 无return操作
                if(!StrUtils.isBlank(assertion)){
                    String userName = AssertionHolder.getAssertion().getPrincipal().getName();    //获取用户名;
                    Map<String,Object> attrMap = AssertionHolder.getAssertion().getPrincipal().getAttributes();    //获取用户名;

                    Map userInfo=JsonUtils.convertJsonStrToMap(attrMap.get("userInfo").toString());
                    if(!StrUtils.isBlank(userInfo)){
//                        userInfo.get("ID")
                    }
                    User user=new User();
                    user.setUsrAccount(userName);
                    //设置临时密码token:实现免登陆操作
                    SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
                    String pwdmd5 = SecurityUtils.encry(SecurityUtils.encry(StoreControl.getValue("API.PWD")) + sdf.format(new Date()));

                    user.setUsrPassword(pwdmd5);  //设置临时密码
                    Result action=userService.login(user,request);
                    log.debug(action);
                }
            }

          /**
           *  2、  再次获取用户信息
           */
          User uUserLogin= ApplicationContext.getLoginUser(request);

          //如果已经的登陆
          if(!StrUtils.isBlank(uUserLogin)) {
              //2.1 绑定验船师
              if(StrUtils.isBlank(request.getSession().getAttribute("surveyor"))){
                  if(!StrUtils.isBlank(uUserLogin.getUsrRc0())&&!StrUtils.isBlank(uUserLogin.getUsrRc1())){
                  }
              }
          }
      }catch (Exception e){
          e.printStackTrace();
      }

        return true;  //继续执行action
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
        //To change body of implemented methods use File | Settings | File Templates.
    }


}
