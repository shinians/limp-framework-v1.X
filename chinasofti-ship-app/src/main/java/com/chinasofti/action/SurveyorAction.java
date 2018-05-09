package com.chinasofti.action;

import com.chinasofti.domain.*;
import com.chinasofti.sevice.*;
import com.limp.framework.boss.service.CommonService;
import com.limp.framework.core.abs.AbstractAction;
import com.limp.framework.core.annotation.Access;
import com.limp.framework.core.bean.Pager;
import com.limp.framework.core.bean.Result;
import com.limp.framework.core.bean.ResultCode;
import com.limp.framework.core.constant.ResultMsg;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 验船师管理
 * Created with IntelliJ IDEA.
 * Date: 17-7-12
 * Time: 上午9:31
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/ship/sur")
public class SurveyorAction  extends AbstractAction {

    @Autowired
    private CommonService commonService;

    private static Logger log = Logger.getLogger(SurveyorAction.class);


    private Integer rowCount; //一共多少行

    public   Integer defaultRow = 10; //默认一页10 条

    @Autowired
    private SurveyorService surveyorService;

    @Autowired
    private TrainService trainService;

    @Autowired
    private ShipService shipService;

    @Autowired
    private CapacityService capacityService;

    @Autowired
    private ImageService imageService;

    /**
     * 验船师页面跳转
     *
     * @return
     */
    @Access(login = true, privilege = false)
    @RequestMapping(value ="toindex")
    public String surveyor(Surveyor surveyor,Model model){
        //临时免登陆  login = true
        model.addAttribute("ycscertnum",surveyor.getYcscertnum());
        return "sur/surveyor";
    }

    /**
     * 验船师首页
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="index",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String subIndex(Surveyor surveyor){
        //临时免登陆  login = true
        if(StringUtils.isEmpty(surveyor.getYcscertnum())){
            return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, null,"").getJson();
        }
        //渔船检修次数cis_ship_check，one2many
        String checknum =  shipService.getShipChecknum(surveyor);

        //参加培训期数cis_surtrain_record，one2many
        String trainnum = trainService.getSurTrainnum(surveyor);

        //验船师实体cis_surveyor
        Pager pager = new Pager(new Pager().getPage(),defaultRow);
        Pager<Surveyor> surveyorPager = surveyorService.getSurveyorPage(surveyor, pager, null, null);
        Surveyor currSur = new Surveyor();
        if(surveyorPager.getDataList().size()>0){
            currSur = surveyorPager.getDataList().get(0);
        }
        //证书登记cis_surcertificate，one2one
        Map<String,List> certMap = surveyorService.getSurCertMap(surveyor);

        //能力评估分数cis_capacity，one2one
        String score = capacityService.getSurScore(surveyor);

        //图片cis_img_manager，one2many
        List<ImageManager> imgUrls = imageService.getSurImg(surveyor);

        //证书资质历程
        List<Credentials> creList = surveyorService.getCreList(surveyor);

        //验船师工作量走势图
        //group by year 双list
        ShipCheck sc = new ShipCheck();
        sc.setSurid(surveyor.getYcscertnum());
        Map<String,List<Map<String,String>>> workMap = shipService.getWorkload(sc);

        Map tmpMap = new HashMap();
        tmpMap.put("checknum",checknum);
        tmpMap.put("trainnum",trainnum);
        tmpMap.put("currSur",currSur);
        tmpMap.put("certMap",certMap);
        tmpMap.put("score",score);
        tmpMap.put("imgUrls",imgUrls);
        tmpMap.put("workMap",workMap);
        SurveyorShow surshow = surveyorService.getSurShow(tmpMap);

        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, surshow,creList).getJson(commonService);
    }

    /**
     * 验船师首页
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="index1",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String subIndex1(Surveyor surveyor){
        //临时免登陆  login = true
        if(StringUtils.isEmpty(surveyor.getYcscertnum())){
            return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, null,"").getJson();
        }
        //渔船检修次数cis_ship_check，one2many
        String checknum =  shipService.getShipChecknum(surveyor);

        //参加培训期数cis_surtrain_record，one2many
        String trainnum = trainService.getSurTrainnum(surveyor);

        //能力评估分数cis_capacity，one2one
        String score = capacityService.getSurScore(surveyor);

        Map tmpMap = new HashMap();
        tmpMap.put("checknum",checknum);
        tmpMap.put("trainnum",trainnum);
        tmpMap.put("score",score);

        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, tmpMap,"").getJson(commonService);
    }

    /**
     * 验船师首页
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="index2",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String subIndex2(Surveyor surveyor){
        //临时免登陆  login = true
        if(StringUtils.isEmpty(surveyor.getYcscertnum())){
            return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, null,"").getJson();
        }
        //验船师实体cis_surveyor
        Pager pager = new Pager(new Pager().getPage(),defaultRow);
        Pager<Surveyor> surveyorPager = surveyorService.getSurveyorPage(surveyor, pager, null, null);
        Surveyor currSur = new Surveyor();
        if(surveyorPager.getDataList().size()>0){
            currSur = surveyorPager.getDataList().get(0);
        }
        //证书登记cis_surcertificate，one2one
        Map<String,List> certMap = surveyorService.getSurCertMap(surveyor);

        Map tmpMap = new HashMap();
        tmpMap.put("currSur",currSur);
        tmpMap.put("certMap",certMap);
        SurveyorShow surshow = surveyorService.getSurShow(tmpMap);

        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, surshow,"").getJson(commonService);
    }

    /**
     * 验船师首页
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="index3",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String subIndex3(Surveyor surveyor){
        //临时免登陆  login = true
        if(StringUtils.isEmpty(surveyor.getYcscertnum())){
            return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, null,"").getJson();
        }

        //图片cis_img_manager，one2many
        List<ImageManager> imgUrls = imageService.getSurImg(surveyor);

        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, imgUrls,"").getJson(commonService);
    }

    /**
     * 验船师首页
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="index4",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String subIndex4(Surveyor surveyor){
        //临时免登陆  login = true
        if(StringUtils.isEmpty(surveyor.getYcscertnum())){
            return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, null,"").getJson();
        }

        //证书资质历程
        List<Credentials> creList = surveyorService.getCreList(surveyor);

        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, creList,"").getJson(commonService);
    }

    /**
     * 验船师首页
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="index5",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String subIndex5(Surveyor surveyor){
        //临时免登陆  login = true
        if(StringUtils.isEmpty(surveyor.getYcscertnum())){
            return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, null,"").getJson();
        }

        //验船师工作量走势图
        //group by year 双list
        ShipCheck sc = new ShipCheck();
        sc.setSurid(surveyor.getYcscertnum());
        Map<String,List<Map<String,String>>> workMap = shipService.getWorkload(sc);

        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, workMap,"").getJson(commonService);
    }

    /**
     * 验船师子页面1
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="getSubSur1",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String subSurveyor1(Pager pager, @RequestParam String ycscertnum, @RequestParam String startYear,@RequestParam String endYear){
        //临时免登陆  login = true
        //渔船检验记录list
        pager = new Pager(pager.getPage(), pager.getRows());
        ShipCheckShow shipCheckShow = new ShipCheckShow();
        shipCheckShow.setSurid(ycscertnum);
        shipCheckShow.setStartYear(startYear);
        shipCheckShow.setEndYear(endYear);
        shipCheckShow.setDistinct(true);
        shipCheckShow.setPage(pager);
        Pager<ShipCheckShow> shipCheckShowPager = shipService.getShipCheckList(shipCheckShow);
        Map yearMap = shipService.getShipCheckYear(shipCheckShow);
        Map<String,List<Map<String,Object>>> chartMap = shipService.getCheckChart(shipCheckShow);
        Map<String,Object> tmpMap = new HashMap();
        tmpMap.put("yearMap",yearMap);
        tmpMap.put("chartMap",chartMap);
        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, shipCheckShowPager,tmpMap).getJson(commonService);
    }

    /**
     * 验船师子页面2加载
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="getSubSur2",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String subSurveyor2(Surveyor surveyor){
        //临时免登陆  login = true
        //验船师基本信息
        Pager pager = new Pager(new Pager().getPage(),defaultRow);
        Pager<Surveyor> surveyorPager = surveyorService.getSurveyorPage(surveyor, pager, null, null);
        Surveyor currSur = surveyorPager.getDataList().get(0);
        currSur = surveyorService.getSurveyorFormat(currSur);
        Map<String,List> certMap = surveyorService.getSurCertMap(surveyor);
        currSur.setCertMap(certMap);
        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, currSur,"").getJson(commonService);
    }

    /**
     * 验船师子页面3加载
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="getSubSur3",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String subSurveyor3(Pager pager, @RequestParam String ycscertnum){
        //临时免登陆  login = true
        //工作记录list  CIS_SURWORK_RECORD
        pager = new Pager(pager.getPage(), pager.getRows());
        SurWorkRecord surWorkRecord = new SurWorkRecord();
        surWorkRecord.setSurid(ycscertnum);
        surWorkRecord.setPage(pager);
        Pager<SurWorkRecord> swr = surveyorService.getSurWorkRecordList(surWorkRecord);
        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, swr,"").getJson();
    }

    /**
     * 验船师子页面4加载
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="getSubSur4",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String subSurveyor4(@RequestParam String ycscertnum){
        //临时免登陆  login = true
        //验船师培训记录list  cis_surtrain_record
        SurTrainShow sts = new SurTrainShow();
        sts.setCsrSurno(ycscertnum);
        List<SurTrainShow> stsList = trainService.getSurTrainList(sts);
        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, stsList,"").getJson(commonService);
    }

    /**
     * 验船师子页面5加载
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="getSubSur5",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String subSurveyor5(Capacity capacity){
        //临时免登陆  login = true
        //验船师能力评估实体
        Capacity newCap = capacityService.getLateCapacity(capacity);
        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, newCap,"").getJson();
    }

    /**
     * 验船师子页面6加载
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="getSubSur6",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String subSurveyor6(ShipCheck shipCheck){
        //临时免登陆  login = true
        //验船师工作量走势图
        Map workMap = shipService.getWorkloadByYear(shipCheck);
        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, workMap,"").getJson();
    }

    /**
     * 根据机构id获取验船师列表
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="getSurveyorList",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String getSurveyorListByOrgcode(Pager pager,@RequestParam String id,@RequestParam(required = false) String sid,@RequestParam(required = false) String sname){
        pager = new Pager(pager.getPage(), pager.getRows());
        Surveyor tmpSur = new Surveyor();
        tmpSur.setOrganid(id);
        tmpSur.setYcscertnum(sid);
        tmpSur.setYcsname(sname);
        Pager<Surveyor> surPage = surveyorService.getSurveyorListByOrgcode(tmpSur,pager);
        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, surPage,"").getJson(commonService);
    }

    /**
     * demo
     * 查询省份证号为330283199004231439的验船师
     * http://localhost:92/ship/sur/getSurPage?ycscertnum=330283199004231439
     * 模糊查询名称为张的验船师
     * http://localhost:92/ship/sur/getSurPage?ycsname=张
     * 模糊查询名称为张的验船师（第二页）
     * http://localhost:92/ship/sur/getSurPage?ycsname=张&page=2
     *
     * 获得验船师列表
     * @param pager 分页
     * @param surveyor 验船师信息：传入该实体对应的field即可作为查询条件：
     * @param orderName 排序字段  (对应数据库字段值)
     * @param orderType DESC：ASC
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="getSurPage",produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getSurPage(Surveyor surveyor,Pager pager,String orderName,String orderType) {
        pager = new Pager(pager.getPage(), defaultRow);
        Pager<Surveyor> surveyorPager = surveyorService.getSurveyorPage(surveyor, pager, orderName, orderType);
        rowCount = pager.getRowCount();
        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS,surveyorPager,"").getJson(commonService);
    }

    public Integer getRowCount() {
        return rowCount;
    }

    public void setRowCount(Integer rowCount) {
        this.rowCount = rowCount;
    }

    public Integer getDefaultRow() {
        return defaultRow;
    }

    public void setDefaultRow(Integer defaultRow) {
        this.defaultRow = defaultRow;
    }
}
