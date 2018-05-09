package com.chinasofti.action;

import com.chinasofti.common.Const;
import com.chinasofti.domain.*;
import com.chinasofti.mapper.oracle.ShipCheckMapper;
import com.chinasofti.sevice.CapacityService;
import com.chinasofti.sevice.EntService;
import com.chinasofti.sevice.ImageService;
import com.chinasofti.sevice.OrganService;
import com.chinasofti.utils.StrUtil;
import com.limp.framework.boss.service.CommonService;
import com.limp.framework.core.abs.AbstractAction;
import com.limp.framework.core.annotation.Access;
import com.limp.framework.core.bean.Pager;
import com.limp.framework.core.bean.Result;
import com.limp.framework.core.bean.ResultCode;
import com.limp.framework.core.constant.ResultMsg;
import com.limp.framework.utils.JsonUtils;
import com.limp.framework.utils.StrUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 管理检验机构信息
 * Created with IntelliJ IDEA.
 * User: zzh
 * Date: 17-7-1
 * Time: 下午7:14
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/ship/org")
public class OrganAction extends AbstractAction {


    private static Logger log = Logger.getLogger(OrganAction.class);


    private Integer rowCount; //一共多少行

    private static final Integer defaultRow = 10;

    @Autowired
    private OrganService organService;

    @Autowired
    private CommonService commonService;

    @Autowired
    private EntService entService;

    @Autowired
    private ImageService imageService;

    @Autowired
    private CapacityService capacityService;
   @Resource
    ShipCheckMapper shipCheckMapper;


    /**
     * 机构管理页面
     *
     * @return
     */
    @Access(login = true, privilege = false)
    @RequestMapping(value = "index")
    public String save(Model model, String uid) {
        OrganInfo organInfo=organService.get(uid);
        //机构信息
        final  Map orgJson=JsonUtils.convertJsonStrToMap(Result.transCodeZN(commonService, organInfo));
        model.addAttribute("org",orgJson);

        //机构信息n
        //model.addAttribute("orgToStr", Result.getInstance(ResultCode.SUCCESS.toString(),ResultMsg.SUCCESS,organInfo,"").getJson(commonService));
        //证书信息
        if(!StrUtils.isBlank(organInfo.getCertid())){
            OrgCertificate cert=organService.getLastCert(organInfo.getCertid());
            final  Map certJson=JsonUtils.convertJsonStrToMap(Result.transCodeZN(commonService, cert));
            model.addAttribute("cert", certJson);
        }
        model.addAttribute("KV", organService.getKeyNum(uid));
        log.debug("----机构信息1667523421-----");
        return "org/org_index";
    }

    /**
     *
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="getOrgKeyValue",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String getOrgKeyValue(String uid){
        return Result.getInstance(ResultCode.SUCCESS.toString(),ResultMsg.SUCCESS,organService.getKeyNum(uid),"").getJson();
    }

    /**
     * 获得组织机构列表
     * @param pager 分页
     * @param organInfo 组织机构
     * @param orderName 排序字段  (对应数据库字段值)
     * @param orderType DESC：ASC
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="getOrganPage",produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getOrgList(OrganInfo organInfo,Pager pager,String orderName,String orderType) {
        pager = new Pager(pager.getPage(), defaultRow);
        Pager<OrganInfo> orgPager = organService.getOrganPage(organInfo, pager, orderName, orderType);
        rowCount = pager.getRowCount();
        return  new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS,orgPager,"").getJson();
    }
    /**
     *
     * 字段会增加，详细信息
     * 获得:检验机构业务核定历程(业务复核、业务调整、注销等一些列的历程)
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="getOrgCheckHistoryList",produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getOrgCheckHistoryList(OrgcheckHistory orgcheckHistory) {
        List<OrgcheckHistory> orgCheckHistoryList = organService.getOrgCheckHistoryList(orgcheckHistory);
        return  new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS,orgCheckHistoryList,"").getJson(commonService);
    }

    /**
     * 辖区内机构总数  （三个图形的生成）
     * http://localhost:92/ship/org/getGroupNum?orgCode=0000000&group=CO_BUSTYPE
     * @param orgCode 机构代码
     * @param group 分组类别    |CO_BUSTYPE CO_PARTTYPE CO_FUNTYPE CO_FINASOURCE
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="getGroupNum",produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getGroupNum(String orgCode,String group,String date) {
        List<Map<String,String>> mapCate = organService.getGroupNum(orgCode,group,date);
        return  new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS,mapCate,"").getJson(commonService);
    }
    //

    /**
     * 验船师匹配度：前端只展现图
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="getSurMatchData",produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getSurMatchData(String orgCode,String startY,String endY,String line) {
        /**
         * 船体验船师（证书是船体类型验船师）、机电验船师 （证书是机电） 其他（除去上面两种类型后）  三种类别统计 ：	缺口人数	最低规定匹配人数	实际匹配人数
         * 缺口人数=实际匹配人数-最低规定匹配人数 （复数也需要展示）
         * 实际匹配人数=根据验船师基本信息表 的证书验船师专业类别进行统计数量
         *最低规定匹配人数：根据公式计算
         *            X∈[10000,15000]，Y∈[11000,16000]     Z∈[100,150] W∈[100,150]  取最大值
         *           公式：1、船体验船师数量(最低规定)=Q/X (全国船长大于24米的船舶吨位总数/X表示一名船体验船师需要检验的总吨位数)
         *           2、电验船师数量(最低规定)=R/Y （R表示全国船长大于24米的船舶功率总数/一名机电验船师需要检验的总功率数）
         *           3、其他=S/Z+T/W（S表示全国15米＜船长≤24米的渔船总数 /名验船师需要检验的15米＜船长≤24米的渔船数量+
         *           T表示全国船长≤15米的渔船总数/W表示表示一名验船师需要检验的船长≤15米的渔船数量）
         */
        //TODO:1、缺失证书信息     2、渔船信息表中 关联检验机构的机构代码为空（数据未关联）
//        List<Map<String,String>> mapCate = organService.getSurMatchData(orgCode,group);
        List<Map<String,String>> mapCate =organService.getYCSMatchRate(orgCode,startY,endY,line);
        log.debug(mapCate);
        return  new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS,mapCate,"").getJson();
    }
    /**
     * todo:缺失检验数据
     * 检验工作完成率 :新的一张表统计 年度 渔船检验工作完成率    机构代码 机构名称
     * 本机构 或者本机构以下：检验记录/该机构下的渔船拥有量
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="getCheckFinishRate",produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getCheckFinishRate(ThemJyjgJBXX jyjgJBXX,String start,String end) {
           List<ThemJyjgJBXX> themJyjgJBXXList=organService.getCheckFinishRate(jyjgJBXX,start,end);
           return Result.getInstance(ResultCode.SUCCESS.toString(),ResultMsg.SUCCESS,themJyjgJBXXList,"").getJson(commonService);
    }

    /**
     * 检验工作执行情况
     * @param orgCode
     * @param beginYear
     * @param endYear
     * @return
     */
    @Access(login = false,privilege = false)
    @RequestMapping(value ="tests",produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getSurMatchData11(String orgCode,String beginYear,String endYear) {
        return ""          ;
    }

    /**
     * 检验完成情况
     * @param orgCode
     * @param startY
     * @param endY
     * @return
     */
    @Access(login = false,privilege = false)
    @RequestMapping(value ="getShipCheckNumGroup",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String getShipCheckNumGroup(String orgCode,String startY,String endY,HttpServletRequest req) {
        log.debug("============================检验完成情况==========================");
        String orgType=orgCode;
        log.debug("============================机构代码=========================="+orgType);
        Map<String,Object> map=entService.getJygzwcqk(orgType,startY,endY);
        log.debug(">>>>>>>>>>>>:"+Result.getInstance(ResultCode.SUCCESS.toString(),ResultMsg.SUCCESS,map,"").getJson(commonService));
        return Result.getInstance(ResultCode.SUCCESS.toString(),ResultMsg.SUCCESS,map,"").getJson(commonService);
    }

    /**
     * 机构评分情况
     * http://localhost:8080/ship/org/getCapListPoint?refid=3300000
     * @param capacity
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="getCapListPoint",produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getCapListPoint(Capacity capacity) {
        List<Capacity> capacityList=capacityService.getModelCapacitList(capacity);
        Map<String,List<Capacity>> pMap=new HashMap<String,List<Capacity>>();
        for(Capacity cap:capacityList){
            if(pMap.containsKey(cap.getPid())){
                List<Capacity> list=pMap.get(cap.getPid());
                list.add(cap);
                pMap.put(cap.getPid(),list);
            }else{
                List<Capacity> list=new ArrayList<Capacity>();
                list.add(cap);
                pMap.put(cap.getPid(), list);
            }
        }
        return Result.getInstance(ResultCode.SUCCESS.toString(),ResultMsg.SUCCESS,capacityList,pMap).getJson();
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
        Map map = organService.getYcsQkrsData(uid);
        return Result.getInstance(ResultCode.SUCCESS.toString()
                , ResultMsg.SUCCESS, map, "").getJson();
    }


    public Integer getRowCount() {
        return rowCount;
    }

    public void setRowCount(Integer rowCount) {
        this.rowCount = rowCount;
    }

    public static Integer getDefaultRow() {
        return defaultRow;
    }
}
