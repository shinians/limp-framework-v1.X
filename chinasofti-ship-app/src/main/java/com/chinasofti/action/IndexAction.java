package com.chinasofti.action;
import com.chinasofti.bean.ShipBean;
import com.chinasofti.domain.OrganInfo;
import com.chinasofti.sevice.ImageService;
import com.chinasofti.sevice.TestService;
import com.chinasofti.sevice.impl.TestServiceImpl;
import com.chinasofti.utils.SolrDao;
import com.limp.framework.boss.action.BaseAction;
import com.limp.framework.boss.domain.User;
import com.limp.framework.boss.service.CacheService;
import com.limp.framework.boss.service.CommonService;
import com.limp.framework.boss.service.DictCodesService;
import com.limp.framework.boss.service.UserService;
import com.limp.framework.core.annotation.Access;
import com.limp.framework.core.bean.Result;
import com.limp.framework.core.bean.ResultCode;
import com.limp.framework.core.constant.Constant;
import com.limp.framework.core.constant.OPERATION;
import com.limp.framework.core.constant.ResultMsg;
import com.limp.framework.utils.JsonUtils;
import com.limp.framework.utils.StrUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * @author: Administrator
 * Date: 16-1-11
 * Time: 下午9:08
 * To change this template use File | Settings | File Templates.
 */
//后台管理action
@Controller
@RequestMapping("/index")
public class IndexAction extends BaseAction {
    private static Logger log= Logger.getLogger(IndexAction.class);

    @Autowired
    private UserService userService;
    @Autowired
    private CacheService cacheService;
    @Autowired
    private CommonService commonService;
    @Autowired
    private DictCodesService dictCodesService;

    @Autowired
    public ImageService service;
    @Autowired
    public TestService testService;


    /**
     * 获取缓存的key值
     * @param key
     * @return
     */
    @RequestMapping(value ="getCode",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String getCode(String key) {
       /* String str= cacheService.get(key);
        log.debug("---value--->:"+str);
        if(StrUtils.isBlank(str)){
            log.debug("无此key值得缓存,开始添加到缓存池"+key);
            DicCodes dicCodes=new DicCodes();
            dicCodes.setDictKey(key);
            Pager<DicCodes> list=dictCodesService.getPageDomainList("",dicCodes,new Pager(1,30));
            for(DicCodes codes:list.getDataList()){
                cacheService.set(codes.getDictKey(),codes.getDictdataName());
                log.debug(TextUtils.format("添加缓存数据 set key:{0} value:{1}",
                        codes.getDictKey(),codes.getDictdataName()));

            }
            str=cacheService.get(key);
            log.debug("reload cache key----> "+str);
        }*/
        OrganInfo organInfo=new OrganInfo();
        organInfo.setId("123");
        organInfo.setFuntype(key);
        return  Result.getInstance(ResultCode.SUCCESS.toString(),ResultMsg.SUCCESS,organInfo,"").getJson(commonService);
    }
    /**
     * 管理员登录 :验证是否有权限访问
     * @param request
     * @param session
     * @param user
     * @param loginType  登录类型
     * @return
     */
    @RequestMapping(value ="mainValidate",produces = "text/plain;charset=UTF-8",method = RequestMethod.POST)
    public @ResponseBody String loginAdmin(HttpServletRequest request, HttpSession session, User user, String loginType) {
        Result action=userService.login(user,request);

        //验证是否存在权限
        action.getResultMap().put("ext", new HashMap<String, String>() {
            {
                put("url", "/index/main");
            }
        });
        return  action.getJson();
    }

    /**
     * 登录后跳转到后台首页
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value =MAIN)
    public String main(HttpServletRequest request, Model model){
        model.addAttribute("loadUrl",request.getParameter("loadUrl"));
        model.addAttribute("hideType", request.getParameter("hideType"));
        return "../chinasofti/platform";
    }

    /**
     * 微观检索
     * @return
     */
    @Access(login = false,privilege = false)
    @RequestMapping(value =PANEL)
    public String mainPanel(){

        //临时免登陆  login = true

        return "../chinasofti/microQuery";
    }


    /**
     * 登录页面
     * @return
     */
    @Access(login = false,privilege = false)
    @RequestMapping(value ="ssoLogin")
    public String login(){
        return "../chinasofti/ssoLogin";
    }

    /**
     *
     * @param key 关键字
     * @param type  搜索类别
     * @param page  页数
     * @param pageSize 每页返回的条数
     * @return
     */
    @RequestMapping(value ="s",produces = "text/plain;charset=UTF-8")
    @Access(login = false,privilege = false,operationLog = OPERATION.SELECT)
    public  @ResponseBody
    String getOrderList(String key,String type,String page,String pageSize){
       log.debug("--查询关键字--->"+key);
        SolrDao solrDao=new SolrDao();
        String qStr="";
        if(StrUtils.isBlank(type)){
            qStr="NAME:*"+key+"* OR ID:"+key +" ";
        }else{
            qStr="(NAME:*"+key+"* OR ID:"+key +") AND TYPE:"+type+" ";

        }
        String orderStr="";
        //如果是机构类型，则根据机构类别排序
        if(Constant.STRING_1.equals(type)){
             orderStr="RC3 ASC";
        }
        Map<String,Object> obj=solrDao.query(qStr,ShipBean.class,
                StrUtils.isBlank(page)?1:Integer.parseInt(page), StrUtils.isBlank(pageSize)?10:Integer.parseInt(pageSize),orderStr);
        List<ShipBean> list=(List <ShipBean>)obj.get("result");

        List<ShipBean> listTransSeaData=new ArrayList<>();
        /*for(ShipBean shipBean:list){
            if(Constant.STRING_2.equals(shipBean.getTYPE())){
                String ID=shipBean.getID();
                if (!StrUtils.isBlank(ID) && ID.length() > 6) {
                    shipBean.setID(ID.substring(ID.length() - 6, ID.length()) + "***");
                }
            }
            listTransSeaData.add(shipBean);
        }*/
        String s= JsonUtils.toJson(list);
        return Result.getInstance(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS,s,obj.get("ext")).getJson();
    }
    /**
     * 测试
     * @param key
     * @return
     */
    @RequestMapping(value ="saveTest",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String saveTest(String key) {
       /* TestService bi=new TestServiceImpl();
        bi.saveTest();*/
        String msgStr=testService.saveTest();

        return  Result.getInstance(ResultCode.SUCCESS.toString(),ResultMsg.SUCCESS,"","").getJson(commonService);
    }

}
