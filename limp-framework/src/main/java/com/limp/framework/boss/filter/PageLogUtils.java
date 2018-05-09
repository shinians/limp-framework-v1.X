package com.limp.framework.boss.filter;

import com.limp.framework.boss.ApplicationContext;
import com.limp.framework.boss.domain.Menu;
import com.limp.framework.boss.domain.PageLog;
import com.limp.framework.boss.service.CommonService;
import com.limp.framework.core.constant.Constant;
import com.limp.framework.utils.IpUtils;
import com.limp.framework.utils.JsonUtils;
import com.limp.framework.utils.RequestUtil;
import com.limp.framework.utils.StrUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
  @author shinian
 * Date: 17-7-25
 * Time: 上午11:27
 * To change this template use File | Settings | File Templates.
 */
public class PageLogUtils  {

    private Log log= LogFactory.getLog(PageLogUtils.class);

    /**
     * 保存日志
     */
    public static void saveLog(HttpServletRequest request, Object obj,String optionIntro,CommonService commonService){
        new SavePageLogThread(request, obj,optionIntro,commonService).start();
    }


    /**
     *保存日志线程
     */
    public static class SavePageLogThread extends Thread {
        private Log log= LogFactory.getLog(SavePageLogThread.class);
        /**
         * 操作类型：存放menu或者日志类型
         */
        Object obj;
        /**
         * 操作日志描述
         */
        String optionIntro;
        /**
         * request对象
         */
        HttpServletRequest request;
        @Autowired
        private CommonService commonService;

        public SavePageLogThread(HttpServletRequest request, Object menuPer,String optionIntro,CommonService commonService) {
            this.request = request;
            this.optionIntro = optionIntro;
            this.obj = menuPer;
            this.commonService = commonService;
        }

        @Override
        public void run() {
            if(log.isDebugEnabled()){
                log.debug("多线程记录日志....");
            }
            PageLog pageLog = new PageLog();
            Object ob=ApplicationContext.getLoginUser(request);
            pageLog.setOtlUsrguid(StrUtils.isBlank(ApplicationContext.getLoginUser(request))?"":ApplicationContext.getLoginUser(request).getId());
            if (obj instanceof Menu) {
                Menu menu = (Menu) obj;
                pageLog.setOtlMenguid(menu.getId());
            }
            pageLog.setOtlParams(request.getQueryString());
            pageLog.setOtlState(Constant.STATE_EFFECTIVE);
            //请求时间
            pageLog.setOtlTime(new Date());
            //请求url
            pageLog.setOtlUrl(request.getRequestURI());
            //访问者IP
            pageLog.setOtlRc0(IpUtils.getIpAddr(request));
            //参数只保存前2000字符
            String params= JsonUtils.toJson((HashMap) RequestUtil.getRequestParameters(request));
            pageLog.setOtlParams(params.length()>2000?params.substring(0,2000):params);
            pageLog.setOtlType(StrUtils.isBlank(pageLog.getOtlMenguid()) ? obj.toString() : Constant.ACCESS);
            //操作详情
            pageLog.setOtlRc1(optionIntro);
            String agent=request.getHeader("User-Agent");
            //浏览器版本
            pageLog.setOtlRc2(!StrUtils.isBlank(agent)&&agent.length()>100?agent.substring(0,50):agent);

            commonService.insertPageLog(pageLog);
        }
    }


}
