package com.chinasofti.action;

import com.chinasofti.domain.*;
import com.chinasofti.sevice.EntService;
import com.limp.framework.core.abs.AbstractAction;
import com.limp.framework.core.annotation.Access;
import com.limp.framework.core.bean.Pager;
import com.limp.framework.core.bean.Result;
import com.limp.framework.core.bean.ResultCode;
import com.limp.framework.core.constant.ResultMsg;
import com.limp.framework.utils.StrUtils;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * gmdss,筏站，产品制造企业，检测机构通用页面接口
 * User: zzh
 * Date: 17-4-24
 * Time: 上午11:17
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/ship/ent")
public class EntAction extends AbstractAction {
    @Resource
    private EntService endService;
    private Integer defaultRow = 5;
    private static Logger log = Logger.getLogger(EntAction.class);

    /**
     * 接口1：跳转到企业信息首页  demo
     * /ship/ent/index?registnum=91320981731741697X
     *
     * @param model
     * @param session
     * @return
     */
    @Access(login = false, privilege = false)
    @RequestMapping(value = "index", produces = "text/plain;charset=UTF-8")
    public String save(Model model, HttpSession session, EntInfo ent) {
        EntInfo entinfo = endService.getEntInfo(ent);
        model.addAttribute("pid", ent.getPid());
        model.addAttribute("drawno", ent.getPid());
        if (StrUtils.isBlank(ent.getPid())) {
            entinfo.setEntcate(ent.getEntcate());
        }
        // todo 异常处理 为查询待数据
        return "ent/ent_index_"+ entinfo.getEntcate();
    }

    /**
     * 接口2：获取主页面所有展示信息
     *企业四个页面公用这个接口，不只是用于gmdss
     * @param model
     * @param session
     * @param ent
     * @return
     */
    @Access(login = false, privilege = false)
    @RequestMapping(value = "getAllInfo", produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getGMDSSInfo(Model model, HttpServletResponse response, HttpSession session, EntInfo ent) {
        System.out.println("getAllInfo获取到的参数：======" + ent.getRegistnum());
        GmdssAllInfo gmdssAllInfo = endService.getGmdssAllInfo(ent);
        String companyPicture = endService.getCompanyPicture(ent);
        Map<String,String> map = new HashMap<>();
        map.put("companyPicture", companyPicture);
        log.debug(gmdssAllInfo.toString());
        response.addHeader("Access-Control-Allow-Origin", "*");
        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, gmdssAllInfo, map).getJson();
    }

    /**
     * GMDSS客户评价列表
     * @param ent
     * @param commcate 评价类型
     * @return
     */
    @Access(login = false, privilege = false)
    @RequestMapping(value = "getGmdssCommentList", produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getGmdssCommentList(Pager pager,EntInfo ent,String commcate) {
        pager = new Pager(pager.getPage(), 10);
        pager = endService.getComments(pager,ent,commcate);
        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, pager, "").getJson();
    }


    /**
     * 接口3：获取gmdss装船数量列表
     *
     * @param model
     * @param session
     * @param ent
     * @return
     */
    @Access(login = false, privilege = false)
    @RequestMapping(value = "getGmdssShipList", produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getGmdssShipList(Model model, HttpSession session, EntInfo ent) {
        System.out.println("获取到的参数：======getRegistnum" + ent.getRegistnum());
        List<ProductCheck> productCheckList = endService.getGmdssShipList(ent);
        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, productCheckList, "").getJson();
    }

    /**
     * 接口4：筏站：检修期内救生筏数 -update by ly 170905
     *
     * @param ent
     * @return
     */
    @Access(login = false, privilege = false)
    @RequestMapping(value = "getRoftInTimeList", produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getRoftInTimeList(Pager pager, EntInfo ent) {
        System.out.println("获取到的参数：======getRegistnum" + ent.getRegistnum());
        pager = new Pager(pager.getPage(), defaultRow);
        pager = endService.getRoftInTimeList(ent,pager);
        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, pager, "").getJson();
    }

    /**
     * 5.产品制造企业：出厂检验产品列表
     *
     * @param model
     * @param session
     * @param ent
     * @return
     */
    @Access(login = false, privilege = false)
    @RequestMapping(value = "getOutCheckProductList", produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getOutCheckProductList(Model model, HttpSession session, EntInfo ent) {
        System.out.println("获取到的参数：======getRegistnum" + ent.getRegistnum());
        List<ProductCheck> productCheckList = endService.getOutCheckProductList(ent);
        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, productCheckList, "").getJson();
    }

    /**
     * 接口6：分页接口1：gmdss：维修设备；筏站：修筏；检测机构：检测产品
     *          检修期内救生筏数的分页也使用此接口
     * @param model
     * @param session
     * @param ent
     * @param pager
     * @param orderName
     * @param orderType
     * @param type
     * @return
     */
    @Access(login = false, privilege = false)
    @RequestMapping(value = "getListByPage1", produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getListByPage1(Model model, HttpSession session, EntInfo ent, Pager pager, String orderName, String orderType, String type,String beginTime,String endTime) {
        System.out.println("获取到的参数：======getRegistnum" + ent.getRegistnum());
        pager = new Pager(pager.getPage(), pager.getRows());
        Pager<ProductRepair> productCheckList = endService.getListByPage1(ent, pager, orderName, orderType, type);
        log.debug(productCheckList);
        Map<String, Object> countByYear = endService.getCountByYear(ent, type, beginTime, endTime);
        System.out.println("countByYearcountByYearcountByYear:"+ countByYear);
        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, productCheckList, countByYear).getJson();
    }

    /**
     * 接口7：分页接口2:产品制造企业：产品认可型号，未使用
     *
     * @param model
     * @param session
     * @param ent
     * @param pager
     * @param orderName
     * @param orderType
     * @return
     */
    @Access(login = false, privilege = false)
    @RequestMapping(value = "getListByPage2", produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getListByPage2(Model model, HttpSession session, EntInfo ent, Pager pager, String orderName, String orderType) {
        System.out.println("获取到的参数：======getRegistnum" + ent.getRegistnum());
        pager = new Pager(pager.getPage(), defaultRow);
        Pager<ProCheckList> proCheckListPager = endService.getListByPage2(ent, pager, orderName, orderType);
        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, proCheckListPager, "").getJson();
    }

    /**
     * 接口8：监督抽查合格率列表 弹窗三
     * @param pager
     * @param ent
     * @param productCheck  什么类型的企业
     * @return
     */
    @Access(login = false, privilege = false)
    @RequestMapping(value = "getCheckPercentList", produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getCheckPercentList(Pager pager,EntInfo ent, ProductCheck productCheck) {
        pager = new Pager(pager.getPage(), defaultRow);
        Map<String, Object> checkPercentList = endService.getCheckPercentList(pager,ent, productCheck);
        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, checkPercentList, "").getJson();
    }
    /**
     * 分页接口补充 productCheck表
     */
    @Access(login = false, privilege = false)
    @RequestMapping(value = "getListByPage3", produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getListByPage3(Model model, HttpSession session, EntInfo ent, Pager pager, String orderName, String orderType, String type1,String type2) {
        System.out.println("获取到的参数：======getRegistnum" + ent.getRegistnum());
        pager = new Pager(pager.getPage(), pager.getRows());
        Pager<ProductCheck> listByPage3 = endService.getListByPage3(ent, pager, orderName, orderType, type1, type2);
        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, listByPage3, "").getJson();
    }
    /**
     * 接口9：获取维修企业一张图页面的基本信息
     * @param model
     * @param session
     * @param ent
     * @return
     */
    @Access(login = false, privilege = false)
    @RequestMapping(value = "getRepairEntInfo", produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getRepairEntInfo(Model model, HttpSession session, EntInfo ent) {
        Map<String, Object> repairEntInfo = this.endService.getRepairEntInfo(ent);
        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, repairEntInfo, "").getJson();
    }



    /**
     * 接口10：获取维修渔船信息
     * @param ent
     * @return
     */
    @Access(login = false, privilege = false)
    @RequestMapping(value = "getRepairShipInfo", produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getRepairShipInfo(EntInfo ent,Pager pager,String shipName) {
        pager = new Pager(pager.getPage(), defaultRow);
        pager = this.endService.getRepairShipInfo(ent,pager,shipName);
        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, pager, "").getJson();
    }

    /**
     * 接口9：累计检测产品数目列表，弹窗一  update by ly170907
     * @param pager
     * @param ent
     * @param productCheck
     * @return
     */
    @Access(login = false, privilege = false)
    @RequestMapping(value = "getCheckList", produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getCheckList(Pager pager,EntInfo ent,  ProductCheck productCheck) {
        pager = new Pager(pager.getPage(), defaultRow);
        Map<String, Object> checkList = endService.getCheckList(pager,ent, productCheck);
        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, checkList, "").getJson();
    }

    /**
     *产品检验列表
     * @param pager
     * @param ent
     * @param productCheck
     * @return
     */
    @Access(login = false, privilege = false)
    @RequestMapping(value = "getProductCheckList", produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getProductCheckList(Pager pager,EntInfo ent, ProductCheck productCheck) {
        pager = new Pager(pager.getPage(), defaultRow);
        pager = endService.getProductCheckList(pager,ent, productCheck);
        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, pager, "").getJson();
    }

    /**
     * 产品制造企业，产品检验合格率列表
     * @param pager
     * @param ent
     * @return
     */
    @Access(login = false, privilege = false)
    @RequestMapping(value = "getCpzzPercentList", produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getCpzzPercentList(Pager pager,EntInfo ent, ProductCheck productCheck) {
        pager = new Pager(pager.getPage(),defaultRow);
        Map<String, Object> checkList = endService.getCpzzPercentList(pager,ent, productCheck);
        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, checkList, "").getJson();
    }

    /**
     * 产品制造企业:产品检验合格率折线图数据接口
     * @param ent
     * @param productCheck
     * @return
     */
    @Access(login = false, privilege = false)
    @RequestMapping(value = "getCpzzPercent", produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getCpzzPercent(EntInfo ent, ProductCheck productCheck,String bYear,String eYear) {
        Map map = endService.getCpzzPercent(ent, productCheck,bYear,eYear);
        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, map, "").getJson();
    }

    //获取产品认可型号
    @Access(login = false, privilege = false)
    @RequestMapping(value = "getCpzzTypes", produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getCpzzTypes(Model model, HttpSession session, EntInfo ent, String which,String name) {
        Map<String, Object> map = endService.getCpzzTypes(ent, which, name);
        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, map, "").getJson();
    }

    /**
     * 获取维修渔船分类统计信息
     * @param ent
     * @param type
     * @return
     */
    @Access(login = false, privilege = false)
    @RequestMapping(value = "getShipRepairPercent", produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getShipRepairPercent(EntInfo ent, String type) {
        List<Map<String,Object>> shipRepairPercentList = this.endService.getShipRepairPercent(ent,type);
        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, shipRepairPercentList, "").getJson();
    }

    /**
     * 获取渔船首次维修后一次检验合格率
     * @param session
     * @param ent
     * @param beginYear
     * @param endYear
     * @return
     */
    @Access(login = false, privilege = false)
    @RequestMapping(value = "getFirstPassRate", produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getFirstPassRate(HttpSession session, EntInfo ent, String beginYear,String endYear) {
        Map shipRepairPercentMap = this.endService.getFirstPassGroupRate(ent,beginYear,endYear);
        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, shipRepairPercentMap, "").getJson();
    }

    /**
     * 得到维修企业每年的渔船维修数量
     * @param ent
     * @param beginYear
     * @param endYear
     * @return
     */
    @Access(login = false, privilege = false)
    @RequestMapping(value = "getRepairTimesGroupYear", produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getRepairTimesGroupYear(EntInfo ent, String beginYear,String endYear) {
        Map map = this.endService.getRepairTimesGroupYear(ent,beginYear,endYear);
        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, map, "").getJson();
    }

    /**
     * 得到企业分级列表
     * @param ent
     * @param pager
     * @return
     */
    @Access(login = false, privilege = false)
    @RequestMapping(value = "getEntClassList", produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getEntClassList(EntInfo ent,Pager pager) {
        pager = new Pager(pager.getPage(), defaultRow);
        pager = this.endService.getEntClassList(ent,pager);
        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, pager, "").getJson();
    }

    /**
     * 维修记录下载
     * @param request
     * @param response
     * @param fid
     */
    @Access(login = false, privilege = false)
    @RequestMapping(value = "repairRecordDownload", produces = "text/plain;charset=UTF-8")
    public void repairRecordDownload(HttpServletResponse response, HttpServletRequest request, String fid) {
        this.endService.repairRecordDownload(response,request,fid);
    }

    /*******************************设计单位************************/
    /**
     * 接口：获取设计单位一张图页面的基本信息
     * @param ent
     * @return
     */
    @Access(login = false, privilege = false)
    @RequestMapping(value = "getDrawEntInfo", produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getDrawEntInfo(EntInfo ent) {
        Map<String, Object> repairEntInfo = this.endService.getDrawEntInfo(ent);
        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, repairEntInfo, "").getJson();
    }

    /**
     * 接口: 获取设计图纸列表
     * @param ent
     * @return
     */
    @Access(login = false, privilege = false)
    @RequestMapping(value = "getDrawInfoList", produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getDrawInfoList(EntInfo ent,Pager pager,String keyWord) {
        pager = new Pager(pager.getPage(), defaultRow);
        pager = this.endService.getDrawInfoList(ent,pager,keyWord);
        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, pager, "").getJson();
    }

    /**
     * 接口: 获取图纸建造的渔船信息
     * @param ent
     * @param pager
     * @param keyWord
     * @return
     */
    @Access(login = false, privilege = false)
    @RequestMapping(value = "getDrawBuildList", produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getDrawBuildList(EntInfo ent,Pager pager,String keyWord) {
        pager = new Pager(pager.getPage(), defaultRow);
        pager = this.endService.getDrawBuildList(ent,pager,keyWord);
        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, pager, "").getJson();
    }

    /**
     * 获取图纸通过率
     * @param ent
     * @return
     */
    @Access(login = false, privilege = false)
    @RequestMapping(value = "getDrawPassRate", produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getDrawPassRate(EntInfo ent) {
        List list = this.endService.getDrawPassRate(ent);
        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, list, "").getJson();
    }

    /************************************修造企业******************************/
    /**
     * 接口: 获取修造企业页面基本信息
     * @param ent
     * @return
     */
    @Access(login = false, privilege = false)
    @RequestMapping(value = "getDrawBuildEntInfo", produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getDrawBuildEntInfo(EntInfo ent) {
        Map<String,Object> map = this.endService.getDrawBuildEntInfo(ent);
        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, map, "").getJson();
    }

    /**
     * 接口: 获取修造企业建造的渔船信息
     * @param ent
     * @return
     */
    @Access(login = false, privilege = false)
    @RequestMapping(value = "getBuildShipInfo", produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getBuildShipInfo(EntInfo ent,Pager pager,String shipName) {
        pager = new Pager(pager.getPage(), defaultRow);
        pager = this.endService.getBuildShipInfo(ent,pager,shipName);
        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, pager, "").getJson();
    }

    /**
     * 获取企业建造渔船饼图信息
     * @param ent
     * @param type
     * @return
     */
    @Access(login = false, privilege = false)
    @RequestMapping(value = "getShipBuildPercent", produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getShipBuildPercent(EntInfo ent, String type) {
        List<Map<String,Object>> shipRepairPercentList = this.endService.getShipBuildPercent(ent,type);
        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, shipRepairPercentList, "").getJson();
    }

    /**
     * 获取渔船建造后一次检验合格率
     * @param ent
     * @return
     */
    @Access(login = false, privilege = false)
    @RequestMapping(value = "getBuildFirstPassRate", produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getBuildFirstPassRate(EntInfo ent) {
        List<Map<String,Object>> shipRepairPercentList = this.endService.getBuildFirstPassRate(ent);
        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, shipRepairPercentList, "").getJson();
    }

    /**
     *获取修造企业建造的渔船数量和一次检验合格率
     * @param ent
     * @param beginYear
     * @param endYear
     * @return
     */
    @Access(login = false, privilege = false)
    @RequestMapping(value = "getBuildNumsGroupYear", produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getBuildNumsGroupYear(EntInfo ent, String beginYear,String endYear) {
        Map map = this.endService.getBuildNumsGroupYear(ent,beginYear,endYear);
        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, map, "").getJson();
    }

    /**
     * 根据机构id获取修造企业列表
     * @return
     */
    @Access(login = true, privilege = false)
    @RequestMapping(value = "getEnt3List", produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getEnt3ListByOrgcode(Pager pager,@RequestParam String id,@RequestParam(required = false) String eid,@RequestParam(required = false) String ename) {
        pager = new Pager(pager.getPage(), pager.getRows());
        EntInfo tmpEnt = new EntInfo();
        tmpEnt.setOrgcode(id);
        tmpEnt.setPid(eid);
        tmpEnt.setEntname(ename);
        Pager<Map<String,Object>> entPage = endService.getEnt3ListByOrgcode(tmpEnt,pager);
        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, entPage, "").getJson();
    }

    /**
     * 根据机构id获取检测机构列表
     * @return
     */
    @Access(login = true, privilege = false)
    @RequestMapping(value = "getEnt7List", produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getEnt7ListByOrgcode(Pager pager,@RequestParam String id,@RequestParam(required = false) String eid,@RequestParam(required = false) String ename) {
        pager = new Pager(pager.getPage(), pager.getRows());
        EntInfo tmpEnt = new EntInfo();
        tmpEnt.setOrgcode(id);
        tmpEnt.setPid(eid);
        tmpEnt.setEntname(ename);
        Pager<Map<String,Object>> entPage = endService.getEnt7ListByOrgcode(tmpEnt,pager);
        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, entPage, "").getJson();
    }

    /**
     * 获取示范渔船图片和渔船信息
     * @param entInfo
     * @param typeNum
     * @return
     */
    @Access(login = true, privilege = false)
    @RequestMapping(value = "getExampleShipPic", produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getExampleShipPic(EntInfo entInfo,String typeNum) {
        List list = endService.getExampleShipPic(entInfo,typeNum);
        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, list, "").getJson();
    }

    @Access(login = true,privilege = false)
    @RequestMapping(value ="getCapListPoint",produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getCapListPoint(Capacity capacity) {
        List<Capacity> capacityList=endService.getModelCapacitList(capacity);
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

    @Access(login = false, privilege = false)
    @RequestMapping(value = "toShipProduct", produces = "text/plain;charset=UTF-8")
    public String toShipProduct(Model model, HttpSession session, EntInfo ent) {
        model.addAttribute("uid", ent.getPid());
        return "ship_product";
    }
}
