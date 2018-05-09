package com.chinasofti.action;

import com.chinasofti.common.Const;
import com.chinasofti.domain.BiManage;
import com.chinasofti.domain.OrganInfo;
import com.chinasofti.domain.Surveyor;
import com.chinasofti.domain.ThemYcsJBXX;
import com.chinasofti.post.HttpRequest;
import com.chinasofti.sevice.BiManageService;
import com.chinasofti.sevice.OrganService;
import com.chinasofti.sevice.SurveyorService;
import com.chinasofti.sevice.TrainService;
import com.chinasofti.utils.OrgcodeUtil;
import com.limp.framework.boss.ApplicationContext;
import com.limp.framework.boss.domain.Menu;
import com.limp.framework.boss.domain.User;
import com.limp.framework.boss.service.CacheService;
import com.limp.framework.boss.service.CommonService;
import com.limp.framework.core.abs.AbstractAction;
import com.limp.framework.core.annotation.Access;
import com.limp.framework.core.bean.Result;
import com.limp.framework.core.bean.ResultCode;
import com.limp.framework.core.constant.ResultMsg;
import com.limp.framework.utils.StrUtils;
import org.apache.commons.collections.map.HashedMap;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.websocket.Session;
import java.math.BigDecimal;
import java.util.*;

/**
 * 管理Bi加载功能
 * Created with IntelliJ IDEA.
 * User: zzh
 * Date: 17-7-1
 * Time: 下午7:14
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/ship/bi")
public class BiManageAction extends AbstractAction {
    @Resource
    private BiManageService biManageService;

    @Autowired
    private CommonService commonService;

    //缓存service
    @Resource
    private CacheService cacheService;

    //检验机构service
    @Resource
    private OrganService  organService;

    @Resource
    private SurveyorService surveyorService;

    @Resource
    private TrainService trainService;

    private static Logger log= Logger.getLogger(BiManageAction.class);

    /**************************验船师BI管理页面*begin**************************************/

    /**
     *测试样例： http://localhost:92/ship/bi/sur?uid=330124199006011848
     * action：BI 验船师管理页面
     * 业务描述：根据uid查询验船师和检验机构信息绑定到model中
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="/sur")
    public String surveyor(Model model,@RequestParam("uid") String uid){
        Surveyor sur=surveyorService.get(uid);//验船师基本信息
        if(!StrUtils.isBlank(sur)){
            OrganInfo organInfo=organService.get(sur.getOrganid());//检验机构基本信息
            model.addAttribute("org",organInfo);
        }
        model.addAttribute("sur",sur);
        return "bi/bi_surveyor";
    }
    /**
     * 跳转到企业信息首页  demo
     * @param biManage
     * @param request
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="getBiManageList",produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getPermissionList(BiManage biManage,HttpServletRequest request) {
       //登录用户
        User user=ApplicationContext.getLoginUser(request);
        cacheService.set("user", user.getUsrAccount());
        //菜单权限
        List<Menu> list=ApplicationContext.getMenuList(request);
        //元素权限
        log.debug("----getBiManageList----");
        log.debug("----getBiManageList----");
        List<BiManage> biManages = biManageService.getList();
        return Result.getInstance(ResultCode.SUCCESS.toString()
                , ResultMsg.SUCCESS, biManages, "").getJson();
    }
    /**************************验船师BI管理页面***************************************/
    @Access(login = true,privilege = false)
    @RequestMapping(value ="listMap",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String getYcsNumGroupByYearIndex(String method,@RequestParam Map<String,Object>params,HttpServletRequest req){
        log.debug("---调用方法---参数如下---");
        log.debug(method);
        log.debug(params);
        log.debug("---调用方法---参数如下 End---");
        String orgcode = ((OrganInfo)req.getSession().getAttribute(Const.ORG_IN_SESSION)).getUid();
        params.put("orgCode",OrgcodeUtil.getLikeStr(orgcode));
        params.put("curYear",Calendar.getInstance().get(Calendar.YEAR));
        List<Map<String,Object>> listMap=biManageService.selectListMapByMethod(method,params);
        return Result.getInstance(ResultCode.SUCCESS.toString()
                , ResultMsg.SUCCESS, listMap, "").getJson(commonService);
    }


    /**
     * 验船师持证总人数[专页面]
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="ycsNumGroupByYearIndex")
    public String getYcsNumGroupByYearIndex(ThemYcsJBXX  themYcsJBXX){
        return "bi/bi_surveyor_num";
    }



    /**
     * 验船师持证总人数
     * @param themYcsJBXX
     * @param req
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="getYcsNumGroupByYear",produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getYcsNumGroupByYear(ThemYcsJBXX  themYcsJBXX,HttpServletRequest req) {
        String orgcode = ((OrganInfo)req.getSession().getAttribute(Const.ORG_IN_SESSION)).getUid();
        themYcsJBXX.setOrgcode(OrgcodeUtil.getLikeStr(orgcode));
        List<Map<String,String>> ycsListMap = biManageService.getYcsNumGroupByYear(themYcsJBXX);
        return Result.getInstance(ResultCode.SUCCESS.toString()
                , ResultMsg.SUCCESS, ycsListMap, "").getJson();
    }
    /**
     * 各级持证验船师学历结构情况[专页面]
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="ycsXLGroupIndex")
    public String ycsXLGroupIndex(ThemYcsJBXX  themYcsJBXX){
        return "bi/bi_surveyor_xl";
    }
    /**
     * 验船师持证总人数
     * @param themYcsJBXX
     * @param req
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="getYcsXLGroupIndex",produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getYcsXLGroupIndex(ThemYcsJBXX  themYcsJBXX,HttpServletRequest req) {
        String orgcode = ((OrganInfo)req.getSession().getAttribute(Const.ORG_IN_SESSION)).getUid();
        themYcsJBXX.setOrgcode(OrgcodeUtil.getLikeStr(orgcode));
        List<Map<String,String>> ycsListMap = biManageService.getYcsXLGroupIndex(themYcsJBXX);
        return Result.getInstance(ResultCode.SUCCESS.toString()
                , ResultMsg.SUCCESS, ycsListMap, "").getJson(commonService);
    }
    /**
     * 各级持证验船师学历结构情况[专页面]
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="ycsCateIndex")
    public String ycsCateGroupIndex(ThemYcsJBXX  themYcsJBXX){
        return "bi/bi_surveyor_cate";
    }
    /**
     * 验船师持证总人数
     * @param themYcsJBXX
     * @param req
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="getYcsCateIndex",produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getYcsCateIndex(ThemYcsJBXX  themYcsJBXX,HttpServletRequest req) {
        String orgcode = ((OrganInfo)req.getSession().getAttribute(Const.ORG_IN_SESSION)).getUid();
        themYcsJBXX.setOrgcode(OrgcodeUtil.getLikeStr(orgcode));
        List<Map<String,String>> ycsListMap = biManageService.getYcsCateIndex(themYcsJBXX);
        return Result.getInstance(ResultCode.SUCCESS.toString()
                , ResultMsg.SUCCESS, ycsListMap, "").getJson(commonService);
    }

    /**
     * 初始化验船师页面基本信息
     * @param req
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="getYcsInitData",produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getYcsInitData(HttpServletRequest req,String year) {
        String uid = ((OrganInfo)req.getSession().getAttribute(Const.ORG_IN_SESSION)).getUid();
        Map map = biManageService.getYcsInitData(uid,year);
        return Result.getInstance(ResultCode.SUCCESS.toString()
                , ResultMsg.SUCCESS, map, "").getJson();
    }

    /**
     * 验船师缺口人数k线图数据接口
     * @param req
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="getYcsQkrsData",produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getYcsQkrsData(HttpServletRequest req) {
        String uid = ((OrganInfo)req.getSession().getAttribute(Const.ORG_IN_SESSION)).getUid();
        Map map = biManageService.getYcsQkrsData(uid);
        return Result.getInstance(ResultCode.SUCCESS.toString()
                , ResultMsg.SUCCESS, map, "").getJson();
    }

    /**
     * 验船师评分占比图
     * @param req
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="getYcsScoreData",produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getYcsScoreData(HttpServletRequest req) {
        String uid = ((OrganInfo)req.getSession().getAttribute(Const.ORG_IN_SESSION)).getUid();
        Map map = biManageService.getYcsScoreData(uid);
        return Result.getInstance(ResultCode.SUCCESS.toString()
                , ResultMsg.SUCCESS, map, "").getJson();
    }




    /**************************检验机构BI管理页面*begin**************************************/


    /**
     *
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="average")
    public String average(ThemYcsJBXX  themYcsJBXX){
        return "bi/bi_org_average";
    }
    /**
     *
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="orgnums")
    public String orgnums(ThemYcsJBXX  themYcsJBXX){
        return "bi/bi_orgnums";
    }
    /**
     *
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="orgnums2")
    public String orgnums2(ThemYcsJBXX  themYcsJBXX){
        return "bi/bi_orgnums2";
    }
    /**
     *
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="orgnums3")
    public String orgnums3(ThemYcsJBXX  themYcsJBXX){
        return "bi/bi_orgnums3";
    }

    //检验机构bi，跳转页面
    @Access(login = true,privilege = false)
    @RequestMapping(value ="/org",produces = "text/plain;charset=UTF-8")
    public String initOrg(Model model,@RequestParam("uid") String uid){
        OrganInfo organInfo=organService.get(uid);//检验机构基本信息
        model.addAttribute("org",organInfo);
        return "bi/bi_org";
    }
    //检验机构bi，获取关键信息
    @Access(login = true,privilege = false)
    @RequestMapping(value ="/getOrgData",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String getOrgData(HttpServletRequest req){
        String uid = ((OrganInfo)req.getSession().getAttribute(Const.ORG_IN_SESSION)).getUid();
        Map<String, Object> map = biManageService.getOrgData(uid);
        return Result.getInstance(ResultCode.SUCCESS.toString()
                , ResultMsg.SUCCESS, map, "").getJson();
    }
    //图表1  机构数量统计图
    @Access(login = true,privilege = false)
    @RequestMapping(value ="/orgEchartsData1",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String eChartsData1(HttpServletRequest req,String year){
        String uid = ((OrganInfo)req.getSession().getAttribute(Const.ORG_IN_SESSION)).getUid();
        Map<String, Object> map = biManageService.eChartsData1(uid,year);
        return Result.getInstance(ResultCode.SUCCESS.toString()
                , ResultMsg.SUCCESS, map, "").getJson(commonService);
    }
    //图表2  调用曾欢检验机构一张图里的接口
    @Access(login = true,privilege = false)
    @RequestMapping(value ="/orgEchartsData2",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String eChartsData2(HttpServletRequest req,String group,String date){
        String uid = ((OrganInfo)req.getSession().getAttribute(Const.ORG_IN_SESSION)).getUid();
        List<Map<String,String>> mapCate = organService.getGroupNum(uid,group,date);
        return  new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS,mapCate,"").getJson(commonService);
    }
    //图表3  机构能力平均分走势图
    @Access(login = true,privilege = false)
    @RequestMapping(value ="/orgEchartsData3",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String eChartsData3(String startYear,String endYear,HttpServletRequest req){
        String uid = ((OrganInfo)req.getSession().getAttribute(Const.ORG_IN_SESSION)).getUid();
        Map<String, Object> map = biManageService.eChartsData3(uid,startYear,endYear);
        return Result.getInstance(ResultCode.SUCCESS.toString()
                , ResultMsg.SUCCESS, map, "").getJson();
    }
    //图表4  机构数量和能力统计图
    @Access(login = true,privilege = false)
    @RequestMapping(value ="/orgEchartsData4",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String eChartsData4(String year,HttpServletRequest req){
        String uid = ((OrganInfo)req.getSession().getAttribute(Const.ORG_IN_SESSION)).getUid();

        Map map = biManageService.eChartsData4(uid,year);
        return Result.getInstance(ResultCode.SUCCESS.toString()
                , ResultMsg.SUCCESS, map, "").getJson();
    }
    //图表5  渔船检验机构检验工作完成率情况  调用接口1
    @Access(login = true,privilege = false)
    @RequestMapping(value ="/orgEchartsData5",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String eChartsData5(){
        Map<String, Object> map = biManageService.eChartsData5();
        return Result.getInstance(ResultCode.SUCCESS.toString()
                , ResultMsg.SUCCESS, map, "").getJson();
    }

    //图表6  近五年检验工作完成率情况走势图
    @Access(login = true, privilege = false)
    @RequestMapping(value = "/orgEchartsData6", produces = "text/plain;charset=UTF-8")
    public
    @ResponseBody
    String eChartsData6(String startYear, String endYear, HttpServletRequest req) {
        String uid = ((OrganInfo)req.getSession().getAttribute(Const.ORG_IN_SESSION)).getUid();
        Map<String, Object> map = biManageService.eChartsData6(uid, startYear, endYear);
        return Result.getInstance(ResultCode.SUCCESS.toString()
                , ResultMsg.SUCCESS, map, "").getJson();
    }
    //图表7  各地区检验工作完成率
    @Access(login = true,privilege = false)
    @RequestMapping(value ="/orgEchartsData7",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String eChartsData7(HttpServletRequest req){
        String uid = ((OrganInfo)req.getSession().getAttribute(Const.ORG_IN_SESSION)).getUid();
        Map<String, Object> map = biManageService.eChartsData7(uid);
        return Result.getInstance(ResultCode.SUCCESS.toString()
                , ResultMsg.SUCCESS, map, "").getJson();
    }
    //图表8  机构复核数量
    @Access(login = true,privilege = false)
    @RequestMapping(value ="/orgEchartsData8",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String eChartsData8(HttpServletRequest req){
        String uid = ((OrganInfo)req.getSession().getAttribute(Const.ORG_IN_SESSION)).getUid();
        List list = biManageService.eChartsData8(uid);
        return Result.getInstance(ResultCode.SUCCESS.toString()
                , ResultMsg.SUCCESS, list, "").getJson();
    }
    //图表9  机构业务复核数量预测三年
    @Access(login = true,privilege = false)
    @RequestMapping(value ="/orgEchartsData9",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String eChartsData9(HttpServletRequest req,String bYear,String eYear){
        String uid = ((OrganInfo)req.getSession().getAttribute(Const.ORG_IN_SESSION)).getUid();
        List list = biManageService.eChartsData9(uid,bYear,eYear);
        return Result.getInstance(ResultCode.SUCCESS.toString()
                , ResultMsg.SUCCESS, list, "").getJson();
    }


    @Access(login = true,privilege = false)
    @RequestMapping(value ="/orgEchartsData10",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String eChartsData10(HttpServletRequest req){
        OrganInfo orginfo = (OrganInfo) req.getSession().getAttribute(Const.ORG_IN_SESSION);
        List list = biManageService.eChartsData10(orginfo);
        return Result.getInstance(ResultCode.SUCCESS.toString()
                , ResultMsg.SUCCESS, list, "").getJson();
    }

    @Access(login = true,privilege = false)
    @RequestMapping(value ="/orgEchartsData11",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String orgEchartsData11(HttpServletRequest req){
        OrganInfo orginfo = (OrganInfo) req.getSession().getAttribute(Const.ORG_IN_SESSION);
        List list = biManageService.orgEchartsData11(orginfo);
        return Result.getInstance(ResultCode.SUCCESS.toString()
                , ResultMsg.SUCCESS, list, "").getJson();
    }
    /**************************检验机构BI管理页面**end*************************************/

//@@@@@@@@@@@@@@@@@@@@@-----法律法规bi页面-----start-----@@@@@@@@@@@
    //法律法规bi，跳转页面
    @Access(login = false, privilege = false)
    @RequestMapping(value = "/law",produces = "text/plain;charset=UTF-8")
    public String jumpLawBI() {
        return "bi/bi_lawsControl";
    }
    //法律法规bi，获取数据
    @Access(login = false, privilege = false)
    @RequestMapping(value = "/getLawBiData",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String getLawBIData() {
        Map<String, Object> map = biManageService.getLayBiData();
        return Result.getInstance(ResultCode.SUCCESS.toString()
                , ResultMsg.SUCCESS, map, "").getJson();
    }
    //@@@@@@@@@@@@@@@@@@@@@@----end-----@@@@@@@@@@@@@@@@@@@@@

    //↓↓↓↓↓↓-----产品检验bi页面-----start--------↓↓↓↓↓↓↓↓↓↓↓↓↓↓
    //产品检验bi：跳转页面  未使用
    @Access(login = false, privilege = false)
    @RequestMapping(value = "/proCheck",produces = "text/plain;charset=UTF-8")
    public String jumpProCheckBI() {
        return "bi/bi_productCheck";
    }

    //产品检验bi：获取数据
    @Access(login = false, privilege = false)
    @RequestMapping(value = "/getProCheckData",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String getProCheckData(HttpServletRequest req) {
        String uid = ((OrganInfo)req.getSession().getAttribute(Const.ORG_IN_SESSION)).getUid();
        Map<String,Object> map = biManageService.getProCheckData(uid);
        //{"msg":"success","result":{"cpzzCount":11,"checkPercent":{"year":2016,"checkPercent":100},"checkCount":{"year":2016,"checkCount":198},"repairCount":0},"code":"200"}
        return Result.getInstance(ResultCode.SUCCESS.toString()
                , ResultMsg.SUCCESS, map, "").getJson();
    }
    //产品检验bi图形1：产品制造企业认可数量分析图
    @Access(login = false, privilege = false)
    @RequestMapping(value = "/echatsCpzzData",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String echatsCpzzData(String startYear,String endYear,String flag,HttpServletRequest req) {
        String uid = ((OrganInfo)req.getSession().getAttribute(Const.ORG_IN_SESSION)).getUid();
        Map<String,Object> map = biManageService.echatsCpzzData( startYear, endYear,uid,flag);
        return Result.getInstance(ResultCode.SUCCESS.toString()
                , ResultMsg.SUCCESS, map, "").getJson();
    }
    //产品检验bi图形2：产品检测检修机构认可数量分析图
    @Access(login = false, privilege = false)
    @RequestMapping(value = "/echatsCheckCountData",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String echatsCheckCountData(String year,HttpServletRequest req) {
        String uid = ((OrganInfo)req.getSession().getAttribute(Const.ORG_IN_SESSION)).getUid();
        Map<String,Object> map = biManageService.echatsCheckCountData(year,uid);
        return Result.getInstance(ResultCode.SUCCESS.toString()
                , ResultMsg.SUCCESS, map, "").getJson();
    }
    //产品检验bi图形3：产品设备类检验数量分析图
    @Access(login = false, privilege = false)
    @RequestMapping(value = "/echatsCheckData",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String echatsCheckData(String startYear,String endYear,HttpServletRequest req) {
        log.info("========================产品检验bi图形3：产品设备类检验数量分析图=========================");
        String uid = ((OrganInfo)req.getSession().getAttribute(Const.ORG_IN_SESSION)).getUid();
        Map<String,Object> map = biManageService.echatsCheckData(startYear,endYear,uid);
        return Result.getInstance(ResultCode.SUCCESS.toString()
                , ResultMsg.SUCCESS, map, "").getJson();
    }

    //产品检验bi图形4：产品设备类维修数量分析图
    @Access(login = false, privilege = false)
    @RequestMapping(value = "/echatsRepairData",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String echatsRepairData(String type,String startYear,String endYear,HttpServletRequest req) {
        String uid = ((OrganInfo)req.getSession().getAttribute(Const.ORG_IN_SESSION)).getUid();
        Map<String,Object> map = biManageService.echatsRepairData(type,startYear,endYear,uid);
        return Result.getInstance(ResultCode.SUCCESS.toString()
                , ResultMsg.SUCCESS, map, "").getJson();
    }
    //产品检验bi图形5：产品质量监督抽查合格率分析图
    @Access(login = false, privilege = false)
    @RequestMapping(value = "/echatsCheckPersentData",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String echatsCheckPersentData(String startYear,String endYear,HttpServletRequest req) {
        String uid = ((OrganInfo)req.getSession().getAttribute(Const.ORG_IN_SESSION)).getUid();
        Map<String,Object> map = biManageService.echatsCheckPersentData(startYear,endYear,uid);
        return Result.getInstance(ResultCode.SUCCESS.toString()
                , ResultMsg.SUCCESS, map, "").getJson();
    }
    //产品检验bi图形6：救生筏海难救助情况统计
    @Access(login = false, privilege = false)
    @RequestMapping(value = "/echatsHelpData",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String echatsHelpData(String startYear,String endYear) {
        Map<String,Object> map = biManageService.echatsHelpData(startYear,endYear);
        return Result.getInstance(ResultCode.SUCCESS.toString()
                , ResultMsg.SUCCESS, map, "").getJson();
    }

    //↑↑↑↑↑↑↑↑↑↑↑↑-----产品检验专题----↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /**************************培训一张图BI管理页面*begin**************************************/

    /**
     * 培训一张图[页面]
     *
     * @param request
     * @return
     */
    @Access(login = true, privilege = false)
    @RequestMapping(value = "train", produces = "text/plain;charset=UTF-8")
    public String train(HttpServletRequest request) {
        return "bi/bi_train";
    }

    // 弹框信息[页面]
    @Access(login = true, privilege = false)
    @RequestMapping(value = "trainPage", produces = "text/plain;charset=UTF-8")
    public String trainPage(Model model, HttpServletRequest request) {
        String year = request.getParameter("year");
        String appendName = request.getParameter("appendName");
        String strs = request.getParameter("strs");
        model.addAttribute("year", year == null ? "" : year);
        model.addAttribute("appendName", appendName == null ? "" : appendName);
        model.addAttribute("strs", strs == null ? "" : strs);
        return "bi/bi_train_page";
    }

    //获取4个核心指标
    @Access(login = true, privilege = false)
    @RequestMapping(value = "getCoreNum", produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getCoreNum(HttpServletRequest request) {
        String procode = getProcodeByRequest(request);
        Map<String, String> coreNumMap = trainService.getCoreNum(procode);
        return Result.getInstance(ResultCode.SUCCESS.toString()
                , ResultMsg.SUCCESS, coreNumMap, "").getJson();
    }

    //通过request获取所属机构代码，判断是否为部级或属于哪个省
    private String getProcodeByRequest(HttpServletRequest request) {
        String procode = "";
        OrganInfo organInfo = (OrganInfo) request.getSession().getAttribute(Const.ORG_IN_SESSION);
        procode = organInfo.getOrgcode();
        if (!StrUtils.isBlank(procode)) {
            if (Const.MINISTRY_CODE.equals(procode)) {
                //部级
                procode = null;
            } else if (procode.length() > 2) {
                //省级
                procode = procode.substring(0, 2) + "%";
            }
        }
        return procode;
    }

    //获取培训人次统计图统计数据
    @Access(login = true, privilege = false)
    @RequestMapping(value = "getTrainingNumStatistics", produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getTrainingNumStatistics(HttpServletRequest request, String startDate, String endDate) {
        String procode = getProcodeByRequest(request);
        List<Map<String, String>> trainingNum = trainService.getTrainingNumStatistics(procode, startDate, endDate);
        return Result.getInstance(ResultCode.SUCCESS.toString()
                , ResultMsg.SUCCESS, trainingNum, "").getJson();
    }

    //获取培训完成率统计图统计数据
    @Access(login = true, privilege = false)
    @RequestMapping(value = "getPercentStatistics", produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getPercentStatistics(HttpServletRequest request, String orderBy) {
        String procode = getProcodeByRequest(request);
        List<Map<String, String>> percent = trainService.getPercentStatistics(orderBy, procode);
        return Result.getInstance(ResultCode.SUCCESS.toString()
                , ResultMsg.SUCCESS, percent, "").getJson();
    }

    //获取培训执行进度表统计数据
    @Access(login = true, privilege = false)
    @RequestMapping(value = "getTrainRateStatistics", produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getTrainRateStatistics(HttpServletRequest request, String idsString, String orderBy) {
        String procode = getProcodeByRequest(request);
        List<String> ids = new ArrayList<String>();
        if (!StrUtils.isBlank(idsString)) {
            for (String id : idsString.split(",")) {
                ids.add(id);
            }
        }
        List<Map<String, String>> trainRate = trainService.getTrainRateStatistics(ids, orderBy, procode);
        return Result.getInstance(ResultCode.SUCCESS.toString()
                , ResultMsg.SUCCESS, trainRate, "").getJson();
    }

    //获取培训班名称列表
    @Access(login = true, privilege = false)
    @RequestMapping(value = "getTrainNames", produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getTrainNames(HttpServletRequest request) {
        String procode = getProcodeByRequest(request);
        List<Map<String, String>> trainNames = trainService.getTrainNames(procode);
        return Result.getInstance(ResultCode.SUCCESS.toString()
                , ResultMsg.SUCCESS, trainNames, "").getJson();
    }

    //获取实际培训统计图统计数据
    @Access(login = true, privilege = false)
    @RequestMapping(value = "getTrainingNumStatisticsByYear", produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getTrainingNumStatisticsByYear(HttpServletRequest request, String year, String idsString) {
        String procode = getProcodeByRequest(request);
        List<String> ids = new ArrayList<String>();
        if (!StrUtils.isBlank(idsString)) {
            for (String id : idsString.split(",")) {
                ids.add(id);
            }
        }
        List<Map<String, String>> trainingNumS = trainService.getTrainingNumStatisticsByYear(year, ids, procode);
        return Result.getInstance(ResultCode.SUCCESS.toString()
                , ResultMsg.SUCCESS, trainingNumS, "").getJson();
    }

    //获取实际培训班名称列表
    @Access(login = true, privilege = false)
    @RequestMapping(value = "getTrainingNamesStatisticsByYear", produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getTrainingNamesStatisticsByYear(HttpServletRequest request, String year) {
        String procode = getProcodeByRequest(request);
        List<Map<String, String>> trainingNames = trainService.getTrainingNamesStatisticsByYear(year, procode);
        return Result.getInstance(ResultCode.SUCCESS.toString()
                , ResultMsg.SUCCESS, trainingNames, "").getJson();
    }

    //获取培训基地培训人次统计图统计数据
    @Access(login = true, privilege = false)
    @RequestMapping(value = "getSRCByTrainplaceAndYear", produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getSRCByTrainplaceAndYear(HttpServletRequest request, String year) {
        String procode = getProcodeByRequest(request);
        List<Map<String, String>> surtrainRecordCount = trainService.getSurtrainRecordCountByTrainplaceAndYear(year, procode);
        return Result.getInstance(ResultCode.SUCCESS.toString()
                , ResultMsg.SUCCESS, surtrainRecordCount, "").getJson();
    }

    //获取培训基地教师统计图统计数据
    @Access(login = true, privilege = false)
    @RequestMapping(value = "getTeacherNumStatistics", produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getTeacherNumStatistics(HttpServletRequest request, String year) {
        String procode = getProcodeByRequest(request);
        List<Map<String, String>> teacherNum = trainService.getTeacherNumStatistics(year, procode);
        return Result.getInstance(ResultCode.SUCCESS.toString()
                , ResultMsg.SUCCESS, teacherNum, "").getJson();
    }

    //获取培训评价分析图统计数据
    @Access(login = true, privilege = false)
    @RequestMapping(value = "getTrainEvaluateStatistics", produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getTrainEvaluateStatistics(HttpServletRequest request, String year, String idsString) {
        String procode = getProcodeByRequest(request);
        List<String> ids = new ArrayList<String>();
        if (!StrUtils.isBlank(idsString)) {
            for (String id : idsString.split(",")) {
                ids.add(id);
            }
        }
        List<Map<String, String>> trainEvaluate = trainService.getTrainEvaluateStatistics(year, ids, procode);
        return Result.getInstance(ResultCode.SUCCESS.toString()
                , ResultMsg.SUCCESS, trainEvaluate, "").getJson();
    }

    //获取培训评价培训班名称列表
    @Access(login = true, privilege = false)
    @RequestMapping(value = "getCTENames", produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getCTENames(HttpServletRequest request, String year) {
        String procode = getProcodeByRequest(request);
        List<Map<String, String>> CTENames = trainService.getCTENames(year, procode);
        return Result.getInstance(ResultCode.SUCCESS.toString()
                , ResultMsg.SUCCESS, CTENames, "").getJson();
    }

    //获取培训班评价类型名称列表
    @Access(login = true, privilege = false)
    @RequestMapping(value = "getCTETypenames", produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getCTETypenames(HttpServletRequest request, String year) {
        String procode = getProcodeByRequest(request);
        List<String> CTETypenames = trainService.getCTETypenames(year, procode);
        return Result.getInstance(ResultCode.SUCCESS.toString()
                , ResultMsg.SUCCESS, CTETypenames, "").getJson();
    }

    //获取培训需求分析图统计数据
    @Access(login = true, privilege = false)
    @RequestMapping(value = "getTrainDemandAnalysisStatistics", produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getTrainDemandAnalysisStatistics(HttpServletRequest request) {
        String procode = getProcodeByRequest(request);
        List<Map<String, String>> trainDemandAnalysis = trainService.getTrainDemandAnalysisStatistics(procode);
        return Result.getInstance(ResultCode.SUCCESS.toString()
                , ResultMsg.SUCCESS, trainDemandAnalysis, "").getJson();
    }

    //获取验船师缺口统计图统计数据
    @Access(login = true, privilege = false)
    @RequestMapping(value = "getSurveyorGapStatistics", produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getSurveyorGapStatistics(HttpServletRequest request) {
        String procode = getProcodeByRequest(request);
        List<Map<String, String>> surveyorGap = trainService.getSurveyorGapStatistics(procode);
        return Result.getInstance(ResultCode.SUCCESS.toString()
                , ResultMsg.SUCCESS, surveyorGap, "").getJson();
    }

    //获取培训规划统计图统计数据
    @Access(login = true, privilege = false)
    @RequestMapping(value = "getTrainPlanningStatistics", produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getTrainPlanningStatistics(HttpServletRequest request) {
        String procode = getProcodeByRequest(request);
        List<Map<String, String>> trainPlanning = trainService.getTrainPlanningStatistics(procode);
        return Result.getInstance(ResultCode.SUCCESS.toString()
                , ResultMsg.SUCCESS, trainPlanning, "").getJson();
    }

    /**************************培训一张图BI管理页面*end**************************************/

 /**************************检验管理专题**************************************/
    /**
     *测试样例：
     * action：BI 检验管理专题
     * 业务描述：根据uid查询验船师和检验管理专题绑定到model中
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="/check")
    public String checkManage(Model model,@RequestParam("uid") String uid){
      /*  Surveyor sur=surveyorService.get(uid);//验船师基本信息
        if(!StrUtils.isBlank(sur)){
            OrganInfo organInfo=organService.get(sur.getOrganid());//检验机构基本信息
            model.addAttribute("org",organInfo);
        }
        model.addAttribute("sur",sur);*/
        return "bi/bi_checkManage";
    }
    /**************************产品检验专题**************************************/
    /**
     *测试样例：
     * action：BI 检验管理专题
     * 业务描述：根据uid查询验船师和检验管理专题绑定到model中
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="/product")
    public String productCheck(Model model,@RequestParam("uid") String uid){
      /*  Surveyor sur=surveyorService.get(uid);//验船师基本信息
        if(!StrUtils.isBlank(sur)){
            OrganInfo organInfo=organService.get(sur.getOrganid());//检验机构基本信息
            model.addAttribute("org",organInfo);
        }
        model.addAttribute("sur",sur);*/
        return "bi/bi_productCheck";
    }
    /**************************技术发展专题**************************************/
    /**
     *测试样例：
     * action：BI 技术发展专题
     * 业务描述：根据uid查询验船师和检验管理专题绑定到model中
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="/tec")
    public String technologyDevelop(Model model,@RequestParam("uid") String uid){
      /*  Surveyor sur=surveyorService.get(uid);//验船师基本信息
        if(!StrUtils.isBlank(sur)){
            OrganInfo organInfo=organService.get(sur.getOrganid());//检验机构基本信息
            model.addAttribute("org",organInfo);
        }
        model.addAttribute("sur",sur);*/
        return "bi/bi_technologyDevelop";
    }
   /* *//**************************法规监督专题 *************************************//*
    *//**
     *测试样例：
     * action：BI 技术发展专题
     * 业务描述：根据uid查询验船师和检验管理专题绑定到model中
     * @return
     *//*
    @Access(login = true,privilege = false)
    @RequestMapping(value ="/law")
    public String lawsControl(Model model,@RequestParam("uid") String uid){
      *//*  Surveyor sur=surveyorService.get(uid);//验船师基本信息
        if(!StrUtils.isBlank(sur)){
            OrganInfo organInfo=organService.get(sur.getOrganid());//检验机构基本信息
            model.addAttribute("org",organInfo);
        }
        model.addAttribute("sur",sur);*//*
        return "bi/bi_lawsControl";*/
//    }


    /**************************技术发展处BI管理页面*begin**************************************/
    /**
     * 跳转到技术发展处专题页面
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="/techDevelop")
    public String initTechDeveLop(){
        return "bi/bi_technologyDevelop";
    }

    /**
     * 获取页面基本信息
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="/getTechDeveLopInfo")
    public @ResponseBody
    String getTechDeveLopInfo(){
        String lastYear = (Calendar.getInstance().get(Calendar.YEAR)-1)+"";
        Map<String, Object> map = new HashedMap();
        //图纸审查套数
        map.put("drawNums",this.biManageService.countDrawsByYear(lastYear));
        map.put("lastYear",lastYear);
        //全国渔船设计单位数量
        map.put("drawEntNums",this.biManageService.countEntNumsByEntcate("2"));
        //全国渔船修造企业数量
        map.put("repairBuidlEntNums",this.biManageService.countEntNumsByEntcate("3"));
        // 全国渔船维修企业数量
        map.put("repairEntNums",this.biManageService.countEntNumsByEntcate("4"));
        //国内海洋渔船标准化程度平均分
        map.put("standardScore",this.biManageService.getStandardScore("1","4002"));

        return Result.getInstance(ResultCode.SUCCESS.toString()
                , ResultMsg.SUCCESS, map, "").getJson();
    }

    /**
     * 图纸审查数量分析图数据
     * @param bYear
     * @param eYear
     * @return
     */
    @Access(login = true, privilege = false)
    @RequestMapping(value = "getDrawNumsGroupYear",produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getDrawNumsGroupYear(String bYear,String eYear) {
        Map drawNumsGroupYear =  this.biManageService.getDrawNumsGroupYear(bYear,eYear);
        return Result.getInstance(ResultCode.SUCCESS.toString()
                , ResultMsg.SUCCESS, drawNumsGroupYear, "").getJson();
    }

    /**
     * 获取图纸审查比列图数据
     * @param year
     * @return
     */
    @Access(login = true, privilege = false)
    @RequestMapping(value = "getDrawCheckNumsByYear",produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getDrawCheckNumsByYear(HttpServletRequest req,String year) {
        String uid = ((OrganInfo)req.getSession().getAttribute(Const.ORG_IN_SESSION)).getUid();
        List<Map> list =  this.biManageService.getDrawCheckNumsByYear(year,uid);
        return Result.getInstance(ResultCode.SUCCESS.toString()
                , ResultMsg.SUCCESS, list, "").getJson(commonService);
    }

    /**
     * 按省分组获取企业数量
     * @param year
     * @return
     */
    @Access(login = true, privilege = false)
    @RequestMapping(value = "getEntNumsGroupPrv",produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getEntNumsGroupPrv(String year,String entcate) {
        log.info("========================设计单位数量分析图==================================");
        List<Map> list =  this.biManageService.getEntNumsGroupPrv(year,entcate);
        return Result.getInstance(ResultCode.SUCCESS.toString()
                , ResultMsg.SUCCESS, list, "").getJson();
    }

    /**
     * 获取各省图纸审查数量
     * @param year
     * @return
     */
    @Access(login = true, privilege = false)
    @RequestMapping(value = "getDrawNumsGroupPrv",produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getDrawNumsGroupPrv(String year) {
        List<Map> list =  this.biManageService.getDrawNumsGroupPrv(year);
        return Result.getInstance(ResultCode.SUCCESS.toString()
                , ResultMsg.SUCCESS, list, "").getJson(commonService);
    }

    /**
     * 审图中心图纸审查一次合格率
     * @param bYear
     * @param eYear
     * @return
     */
    @Access(login = true, privilege = false)
    @RequestMapping(value = "getDrawFirPassRate",produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getDrawFirPassRate(String bYear,String eYear) {
        Map map =  this.biManageService.getDrawFirPassRate(bYear,eYear);
        return Result.getInstance(ResultCode.SUCCESS.toString()
                , ResultMsg.SUCCESS, map, "").getJson();
    }

    /**
     * 接口:新建渔船标准化分析图
     * @param year
     * @return
     */
    @Access(login = true, privilege = false)
    @RequestMapping(value = "getNewShipCapacityScore",produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getNewShipCapacityScore(String year) {
        Map map =  this.biManageService.getNewShipCapacityScore(year);
        return Result.getInstance(ResultCode.SUCCESS.toString()
                , ResultMsg.SUCCESS, map, "").getJson();
    }
    /**************************技术发展处BI管理页面*end**************************************/

    /**************************检验管理专题begin**************************************/

    /**
     * 跳转到检验管理专题页面
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="/checkManage")
    public String initCheckManage(){
        return "bi/bi_checkManage";
    }

    /**
     * 获取检验管理专题页面基本信息
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="/getCheckManageInfo")
    public @ResponseBody
    String getCheckManageInfo(HttpServletRequest req){
        String uid = ((OrganInfo)req.getSession().getAttribute(Const.ORG_IN_SESSION)).getUid();
        Map<String, Object> map;
        map = biManageService.getCheckManageInfo(uid);
        return Result.getInstance(ResultCode.SUCCESS.toString()
                , ResultMsg.SUCCESS, map, "").getJson();
    }

    /**
     * 渔船拥有量分析图数据接口
     *
     * @param bYear
     * @param eYear
     * @return
     */
    @Access(login = true, privilege = false)
    @RequestMapping(value = "/getShipInfos")
    public
    @ResponseBody
    String getShipInfos(String bYear, String eYear, HttpServletRequest req) {
        String uid = ((OrganInfo)req.getSession().getAttribute(Const.ORG_IN_SESSION)).getUid();
        Map<String, Object> map;
        map = biManageService.getShipInfos(bYear, eYear, uid);
        return Result.getInstance(ResultCode.SUCCESS.toString()
                , ResultMsg.SUCCESS, map, "").getJson();
    }

    /**
     * 渔船检验工作量分析图数据接口
     * @param bYear
     * @param eYear
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="/shipCheckWorks")
    public @ResponseBody
    String shipCheckWorks(String bYear,String eYear,HttpServletRequest req){
        String uid = ((OrganInfo)req.getSession().getAttribute(Const.ORG_IN_SESSION)).getUid();
        Map<String, Object> map = biManageService.shipCheckWorks(bYear,eYear,uid);
        return Result.getInstance(ResultCode.SUCCESS.toString()
                , ResultMsg.SUCCESS, map, "").getJson();
    }

    /**
     * 新建渔船检验工作量分析图数据接口
     * @param year
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="/getNewShipChecks",produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getNewShipChecks(String year,HttpServletRequest req){
        String uid = ((OrganInfo)req.getSession().getAttribute(Const.ORG_IN_SESSION)).getUid();
        Map<String, Object> map = biManageService.getNewShipChecks(year,uid);
        return Result.getInstance(ResultCode.SUCCESS.toString()
                , ResultMsg.SUCCESS, map, "").getJson();
    }

    /**
     * 渔船船龄统计分析数据接口
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="/getShipYearsOld",produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getShipYearsOld(HttpServletRequest req,String jobArea){
        String uid = ((OrganInfo)req.getSession().getAttribute(Const.ORG_IN_SESSION)).getUid();
        List list = biManageService.getShipYearsOld(uid,jobArea);
        return Result.getInstance(ResultCode.SUCCESS.toString()
                , ResultMsg.SUCCESS, list, "").getJson();
    }

    /**
     * 远洋渔船一次检验合格率分析
     *
     * @param bYear
     * @param eYear
     * @return
     */
    @Access(login = true, privilege = false)
    @RequestMapping(value = "/getOceanShipFirPassRate", produces = "text/plain;charset=UTF-8")
    public
    @ResponseBody
    String getOceanShipFirPassRate(HttpServletRequest req, String bYear, String eYear) {
        String uid = ((OrganInfo)req.getSession().getAttribute(Const.ORG_IN_SESSION)).getUid();
        Map map = biManageService.getOceanShipFirPassRate(uid, bYear, eYear);
        return Result.getInstance(ResultCode.SUCCESS.toString()
                , ResultMsg.SUCCESS, map, "").getJson();
    }

    /**
     * 远洋渔船企业一次检验合格率分析图数据接口
     * @param year
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="/getOceanEntFirPassRate",produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getOceanEntFirPassRate(HttpServletRequest req,String year){
        String uid = ((OrganInfo)req.getSession().getAttribute(Const.ORG_IN_SESSION)).getUid();
        Map map = biManageService.getOceanEntFirPassRate(uid,year);
        return Result.getInstance(ResultCode.SUCCESS.toString()
                , ResultMsg.SUCCESS, map, "").getJson();
    }

    /**
     *渔船检验工作完成率
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="/getshipCheckWorkRate",produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getshipCheckWorkRate(HttpServletRequest req){
        String uid = ((OrganInfo)req.getSession().getAttribute(Const.ORG_IN_SESSION)).getUid();
        BigDecimal rate = biManageService.getshipCheckWorkRate(uid);
        return Result.getInstance(ResultCode.SUCCESS.toString()
                , ResultMsg.SUCCESS, rate, "").getJson();
    }

    /**
     * 远洋渔船综合安全系数分析图
     * @param year
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="/getOceanShipSecurityScore",produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getOceanShipSecurityScore(HttpServletRequest req,String year){
        String uid = ((OrganInfo)req.getSession().getAttribute(Const.ORG_IN_SESSION)).getUid();
        Map map = biManageService.getOceanShipSecurityScore(uid,year);
        return Result.getInstance(ResultCode.SUCCESS.toString()
                , ResultMsg.SUCCESS, map, "").getJson();
    }

    /**
     * 远洋渔船综合安全指数高位分布图数据接口
     * @param year
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="/getOceanShipSecurityScoreDes",produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getOceanShipSecurityScoreDes(HttpServletRequest req, String year){
        String uid = ((OrganInfo)req.getSession().getAttribute(Const.ORG_IN_SESSION)).getUid();
        Map map= biManageService.getOceanShipSecurityScoreDes(uid,year);
        return Result.getInstance(ResultCode.SUCCESS.toString()
                , ResultMsg.SUCCESS, map, "").getJson();
    }

    /**
     * 渔业船舶拥有量分析图数据接口
     * @param year
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="/getShipNumsGroups",produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getShipNumsGroups(HttpServletRequest req,String year){
        String uid = ((OrganInfo)req.getSession().getAttribute(Const.ORG_IN_SESSION)).getUid();
        List list = biManageService.getShipNumsGroups(uid,year);
        return Result.getInstance(ResultCode.SUCCESS.toString()
                , ResultMsg.SUCCESS, list, "").getJson(commonService);
    }
    /**************************检验管理专题end**************************************/

}
