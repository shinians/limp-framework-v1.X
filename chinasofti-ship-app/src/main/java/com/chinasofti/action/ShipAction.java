package com.chinasofti.action;

import com.chinasofti.common.Const;
import com.chinasofti.domain.*;
import com.chinasofti.sevice.ShipService;
import com.limp.framework.boss.service.CommonService;
import com.limp.framework.core.abs.AbstractAction;
import com.limp.framework.core.annotation.Access;
import com.limp.framework.core.bean.Pager;
import com.limp.framework.core.bean.Result;
import com.limp.framework.core.bean.ResultCode;
import com.limp.framework.core.constant.ResultMsg;
import com.limp.framework.utils.StrUtils;
import com.limp.framework.utils.TextUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

/**
 * 渔船及产品
 * Created with IntelliJ IDEA.
 * User: zzh
 * Date: 17-7-1
 * Time: 下午7:14
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/ship")
public class ShipAction extends AbstractAction {

    @Autowired
    private ShipService shipService;

    @Autowired
    private CommonService commonService;

    private static Logger log= Logger.getLogger(ShipAction.class);

    @Access(login = true,privilege = false)
    @RequestMapping(value ="index")
    public String shipTraceability(Model model, ShipShow shipShow){
        if(!StrUtils.isBlank(shipShow.getShipcode())){
            model.addAttribute("shipid",shipShow.getShipcode());
        }
        if(!StrUtils.isBlank(shipShow.getPronumber())){
            model.addAttribute("productid",shipShow.getPronumber());
        }
        return "ship_index";
    }
/**
 * ---------------------------------------------------------渔船及产品追溯------------------------------------------------------------------------------------------------------
 */


    /**
     * 渔船基本信息
     * @param ship
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="getShipInformation",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String getBoatInformation(ShipShow ship){
        Long start=System.currentTimeMillis();
        //渔船
        ShipShow shipShow = shipService.getShipInfo(ship);
        //照片
    //        List<ImageManager> imgList = shipService.getShipImg(ship);
        //gis
        String jobArea = shipShow.getJobArea();
        Map<String, String> gisMap = new HashMap<>();
        if (Const.DOMESTIC_OCEAN_STR.equals(jobArea)) {//国内渔船
            gisMap = shipService.getGNShipGis(ship);
        }else if (Const.OCEAN_STR.equals(jobArea)){//远洋渔船
            gisMap = shipService.getYYShipGis(ship);
        }

        //        shipShow.setImgPath(imgList);

        //安全综合指数
    //        String safeScore = shipService.getSateScore(ship);
        shipShow.setGispoint(gisMap);
        Long end=System.currentTimeMillis();
        log.info(TextUtils.format("视图查询需要时间为:{0}毫秒",end-start));
        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, shipShow,"").getJson(commonService);
    }
    /**
     * 产品列表
     * @param ship
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="getProductList",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String getProductList(ShipShow ship){
        Long start=System.currentTimeMillis();
        ShipShow shipShow = new ShipShow();
        //产品列表
        List<ProductShow> psList = shipService.getProductsCheckList(ship);

//        shipShow.setSafescore(safeScore);
        shipShow.setProductShowList(psList);


        Long end=System.currentTimeMillis();
        log.info(TextUtils.format("视图查询需要时间为:{0}毫秒",end-start));
        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, shipShow,"").getJson(commonService);
    }


    /**
     * 渔船追溯信息
     * @param ship
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="getShipHistory",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String getShipHistory(ShipShow ship){
        Long start=System.currentTimeMillis();
        //渔船
        ShipShow shipShow = new ShipShow();


        //渔船追溯
         List<ShipTrace> scList = shipService.getShipFollowList(ship);

        List finalList = shipService.getFinalList(scList);
        shipShow.setShipTraceList(finalList);
        Long end=System.currentTimeMillis();
        log.info(TextUtils.format("视图查询需要时间为:{0}毫秒",end-start));
        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, shipShow,"").getJson(commonService);
    }



    /**
     * 渔船追溯首页
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="getShipProduct",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String subIndex(ShipShow ship){
        Long start=System.currentTimeMillis();
        //渔船
        ShipShow shipShow = shipService.getShipInfo(ship);
        //照片
//        List<ImageManager> imgList = shipService.getShipImg(ship);
        //gis
        String jobArea = shipShow.getJobArea();
        Map<String, String> gisMap = new HashMap<>();
        if (Const.DOMESTIC_OCEAN_STR.equals(jobArea)) {//国内渔船
            gisMap = shipService.getGNShipGis(ship);
        }else if (Const.OCEAN_STR.equals(jobArea)){//远洋渔船
            gisMap = shipService.getYYShipGis(ship);
        }
        //安全综合指数
//        String safeScore = shipService.getSateScore(ship);
        //产品列表
        List<ProductShow> psList = shipService.getProductsCheckList(ship);
        //渔船追溯
        List<ShipTrace> scList = shipService.getShipFollowList(ship);

//        shipShow.setImgPath(imgList);
        shipShow.setGispoint(gisMap);
//        shipShow.setSafescore(safeScore);
        shipShow.setProductShowList(psList);

        List finalList = shipService.getFinalList(scList);
        shipShow.setShipTraceList(finalList);
        Long end=System.currentTimeMillis();
        log.info(TextUtils.format("视图查询需要时间为:{0}毫秒",end-start));
        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, shipShow,"").getJson(commonService);
    }

    /**
     * 产品追溯首页
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="getProductTrace",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String getProductTrace(ProductShow ps){
        //根据产品编码获取产品信息
        ProductShow psNew = shipService.getProductShow(ps);
        //根据产品编码获取产品追溯信息链
        List<ProductTrace> ptList = shipService.getProductsCheckList(ps);
        //渔船追溯
        ShipShow ss = new ShipShow();
        ss.setShipcode(ps.getShipcode());
        ss.setTraceArr(ps.getTraceArr());
        List<ShipTrace> scList = shipService.getShipFollowList(ss);
        //合并
        List proShipList = new ArrayList();
        proShipList.addAll(ptList);
        proShipList.addAll(scList);

        //排序后把所有相同年份的合并到一个map中
        List finalList = shipService.getFinalList(proShipList);
        psNew.setProShipList(finalList);
        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, psNew,"").getJson(commonService);
    }

    /**
     * 根据机构代码获取该机构检验的所有渔船
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="getShipListByOrgcode",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String getShipList(Pager pager,ShipQueryParams queryParams){
        pager = new Pager(pager.getPage(), pager.getRows());
        Pager<Ship> shipPage = shipService.getShipListByOrgcode(queryParams ,pager);
        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, shipPage,"").getJson(commonService);
    }

    /**
     * 根据渔船编码获取渔船基本信息
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="getShipDetail",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String getShipDetail(Ship ship){
        Ship shipDetail = shipService.getShipDetail(ship);
        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, shipDetail,"").getJson(commonService);
    }


    /**
     * 根据产品编码获取产品信息
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="getProductinfo",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String getProductinfo(ProductShow ps){
        //ps.setProductNum("Y1710001-Y1710020");
        Map productShow=null;
        List<Map<String,String>> productHistory=null;
        if(!StrUtils.isBlank(ps.getCheckUid())) {
            productShow = shipService.getProductinfo(ps);
            productHistory=shipService.getProductHistory(ps);
        }

        Map result=new HashMap();
        result.put("prodect",productShow);
        result.put("history",productHistory);
        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, result,"").getJson(commonService);
    }
/**---------------------------------------------------------------------------------------风险感知---------------------------------------------------------------------------------**/
    /**
     * 脱检渔船
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="getInspectList",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String getInspectList(Pager pager){
        pager = new Pager(pager.getPage(), pager.getRows());
        Pager shipPage = shipService.getInspectList(pager);
        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, shipPage,"").getJson();
    }
    /**
     * 獲取漁船位置信息
     * @param
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="getShipPos",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String getShipPos(Ship ship){
        Object result = shipService.getShipPos(ship);
        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, result,"").getJson(commonService);
    }
}
