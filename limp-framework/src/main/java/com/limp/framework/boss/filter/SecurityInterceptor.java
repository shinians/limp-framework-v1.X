package com.limp.framework.boss.filter;

import com.limp.framework.boss.ApplicationContext;
import com.limp.framework.boss.domain.Menu;
import com.limp.framework.boss.service.CommonService;
import com.limp.framework.core.annotation.Access;
import com.limp.framework.core.bean.Result;
import com.limp.framework.core.bean.ResultCode;
import com.limp.framework.core.cache.LRUCache;
import com.limp.framework.core.constant.OPERATION;
import com.limp.framework.core.constant.ResultMsg;
import com.limp.framework.core.exception.LoginException;
import com.limp.framework.core.exception.PrivilegeException;
import com.limp.framework.utils.RequestUtil;
import com.limp.framework.utils.StrUtils;
import com.limp.framework.utils.TextUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Method;
import java.text.MessageFormat;
import java.util.Iterator;
import java.util.List;

/**
 * 拦截器
 * @author shinian
 */
public class SecurityInterceptor extends HandlerInterceptorAdapter  {


    private final static String ERROR_JSON = "errorJson";

    private final static String ERROR_PAGE = "errorPage";

    private String login = "login.action";

    /**
     * 验证是否 登录 拦截
     */
    private boolean interceptLogin = true;

    /**
     * 验证是否 权限 拦截
     */
    private boolean interceptPrivilege = true;

    private int capacity = 100;

    private LRUCache<String, Access> accessCache = new LRUCache<String, Access>(capacity);

    private Log log=LogFactory.getLog(SecurityInterceptor.class);

   private static final String ENCODING = "UTF-8";

    @Autowired
    private CommonService commonService;
	@Override
	public boolean preHandle(HttpServletRequest request,HttpServletResponse response, Object handler) throws Exception {
        request.setCharacterEncoding(ENCODING);
        //防止数据传递乱码
        response.setContentType("application/json;charset=UTF-8");
        if(log.isDebugEnabled()){
            log.debug("------执行SecurityInterceptor拦截器----");
        }
        // 0 jvm日志记录
        jvmLog();
        //1 log4j访问日志记录
        log4Request(request, handler);
        //2,权限控制
        Result result = null;
        try {
            //登录拦截
            if (interceptLogin) {
                interceptLogin(request, handler);
                //权限拦截 get和post都进行验证 this.isGet(request)
               if (this.interceptPrivilege) {
                    interceptPrivilege(request,handler);
                }
                //操作日志
                if(true){
                    operationLog(request, handler);
                }
            }
        } catch (LoginException e) {
            result =Result.getInstance(ResultCode.ERROR_NOT_LOGIN.toString(), ResultMsg.LOGOUT_ERROR, "system.error.undefined.login", "");
        } catch (PrivilegeException e) {
            result = Result.getInstance(ResultCode.ERROR.toString(), ResultMsg.PRIV_ERROR, "system.error.grant.privilege", "");
        } catch (Exception e) {
            result =Result.getInstance(ResultCode.ERROR.toString(), "系统错误", "system.error.unknow", "");
            e.printStackTrace();
        }

        //session如果没有登录用户的信息就跳转到登录页面
        if (!StrUtils.isBlank(result)) {
            log.info("....被拦截..."+result.getMsg());
            request.getSession().setAttribute("data", result);
            //POST请求 返回页面所有的信息，不会跳转 ，get请求ok
            // request.getRequestDispatcher(request.getContextPath()+"/error.jsp").forward(request,response); //服务器跳转
            //客户端跳转
            response.sendRedirect(request.getContextPath() + "/error.jsp");
            return false;
        }
        //继续执行action
        return true;
    }

    /*
     * 是否为get请求
     */

    private boolean isGet(HttpServletRequest request) {
        //判断是否为get方法/
        String requestMethod = request.getMethod();
        return "get".equalsIgnoreCase(requestMethod);
    }

    /**
     * 拦截 登录
     * @param request 请求
     * @param obj
     */

    private  void  interceptLogin(HttpServletRequest request,Object obj){
        Access access = getAccessInLRU(obj);
        //如果为access 的login为true
        if (!StrUtils.isBlank(access)&&access.login()) {
            log.debug("登录开始拦截验证->");
            String refer = request.getRequestURI();
            // /limp/system/user/getMenuById.action
            log.debug("refer:"+refer);
            //!refer.endsWith(login) && refer.matches(".*admin.*")过滤某种条件  如果为真，则进行验证
            //如果登录信息为空，则抛出LoginException
            if (StrUtils.isBlank(ApplicationContext.getLoginUser(request))) {
                throw new LoginException();
            }
        }
    }

    /*
     * 拦截权限
     */

    private void interceptPrivilege(HttpServletRequest request,Object obj) throws ServletException, IOException {
        Access access = getAccessInLRU(obj);
        //访问的action的access不为空，并且需要权限认证
        if (!StrUtils.isBlank(access)&& access.privilege()) {
               HandlerMethod handlerMethod = (HandlerMethod) obj;
                //方法名称
                String action=handlerMethod.getMethod().getName();
               //com.limp.framework.boss.action.NavAction
                String namespace=handlerMethod.getBeanType().getName();
            String refer = request.getRequestURI();
            log.info(TextUtils.format("权限-拦截 - {0}/{1}", namespace, action));
            log.info(TextUtils.format("权限-拦截URL(refer): {0}", refer));


            List<Menu> menus = (List<Menu>) ApplicationContext.getMenuList(request);
            for (Iterator<Menu> iterator = menus.iterator(); iterator.hasNext(); ) {
                Menu menu = iterator.next();
                String menuUrl = menu.getMenUrl();
                if (StrUtils.isBlank(menuUrl)) {
                    continue;
                }
                //如访问url和配置的菜单中的url一致（有无 .action均可）则有权限
                if (refer.equals(request.getContextPath()+menuUrl)
                        ||refer.equals(request.getContextPath()+menuUrl+".action")) {
                    PageLogUtils.saveLog(request, menu,"",commonService);
                    return;
                } else{
//                    log.info("----无权限访问----");
//                    log.info(menuUrl);
                }
            }
            //否则无权限
            throw new PrivilegeException();
        }
    }
    private void operationLog(HttpServletRequest request,Object obj) throws ServletException, IOException {
        Access access = getAccessInLRU(obj);
        //访问的action的access不为空，并且需要记录日志信息
        if (!StrUtils.isBlank(access)&&!OPERATION.FALSE.toString().equals(access.operationLog().name())) {
            PageLogUtils.saveLog(request,access.operationLog().name(),access.operationIntro(),commonService);
        }
    }

    /**
     * 返回是否能访问  |返回空也是有权限
     * @param handler
     * @return
     */
    private  Access  getAccessInLRU(Object handler){
        HandlerMethod handlerMethod = (HandlerMethod) handler;
        try {
            //方法名称
            String methodName=handlerMethod.getMethod().getName();
            String packageName=handlerMethod.getBeanType().getName();
            String key=packageName.concat("@").concat(methodName);
            if (accessCache.containsKey(key)) {
                return accessCache.get(key);
            }
            //添加到accessCache// todo 特定拦截
            if(true){
                Class<?> cls = Class.forName(packageName);
                Method[] fields = cls.getDeclaredMethods();
                for (Method field : fields) {
                    if(field.getName().equalsIgnoreCase(methodName)&&field.isAnnotationPresent(Access.class)==true){
                        Access access = field.getAnnotation(Access.class);
                        accessCache.put(key, access);
                       return access;
                    }
                }
            }
        } catch (Exception e){
          e.printStackTrace();
        }
        return null;
    }

    /**
     * JVM日志记录
     */
    private  void jvmLog(){
        // 打印JVM信息。
        if (log.isDebugEnabled()){
            log.debug(TextUtils.format("/-JVM信息-/:最大内存: {0}m  已分配内存: {1}m  已分配内存中的剩余空间: {2}m  最大可用内存: {3}m",
                    Runtime.getRuntime().maxMemory()/1024/1024, Runtime.getRuntime().totalMemory()/1024/1024,
                    Runtime.getRuntime().freeMemory()/1024/1024,
                    (Runtime.getRuntime().maxMemory()-Runtime.getRuntime().totalMemory()+Runtime.getRuntime().freeMemory())/1024/1024));
        }
    }
    /**
     * log4j记录请求日志
     * @param request
     * @param obj
     */
    private  void  log4Request(HttpServletRequest request,Object obj){
        log.debug("log4g记录日志->request");
        if (log.isDebugEnabled()) {
            log.debug("[/--------------[请求信息如下:]--------------/");
            log.debug(new MessageFormat("请求 - 地址: {0}").format(new Object[]{request.getRequestURI()}));
            RequestUtil.getRequestParameters(request);
            log.debug("请求-参数:"+RequestUtil.getRequestParameters(request));
            log.debug("[/--------------------------------------------/");
        }
    }
}
