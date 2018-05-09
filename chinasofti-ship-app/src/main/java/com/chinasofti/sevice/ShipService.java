package com.chinasofti.sevice;

import com.chinasofti.domain.*;
import com.limp.framework.core.abs.AbstractService;
import com.limp.framework.core.bean.Pager;

import java.util.List;
import java.util.Map;

/**
 * 渔船service层
 * Created with IntelliJ IDEA.
 * User: zzh
 * Date: 17-7-11
 * Time: 下午6:43
 * To change this template use File | Settings | File Templates.
 */
public interface ShipService extends AbstractService<Ship> {
    /**
     * 统计渔船
     * @param ship
     * @return
     */
    public int getShipCountNum(Ship ship);

    /**
     * 根据验船师身份证号获取渔船检修记录次数
     * @param surveyor
     * @return
     */
    public String getShipChecknum(Surveyor surveyor);

    /**
     * 根据验船师身份证号获取每年检验量及平均检验量
     * @param shipCheck
     * @return
     */
    public Map getWorkload(ShipCheck shipCheck);

    /**
     * 根据验船师身份证号获取每年检验量及平均检验量
     * @param shipCheck
     * @return
     */
    public Map getWorkloadByYear(ShipCheck shipCheck);

    /**
     * 根据验船师身份证号和年度获取渔船检修记录
     * @param shipCheckShow
     * @return
     */
    public Pager<ShipCheckShow> getShipCheckList(ShipCheckShow shipCheckShow);

    /**
     * 根据验船师身份证号和年度获取年度信息
     * @param shipCheckShow
     * @return
     */
    public Map getShipCheckYear(ShipCheckShow shipCheckShow);

    /**
     * 根据验船师身份证号和年度获取渔船检修记录
     * @param shipCheckShow
     * @return
     */
    public Map<String,List<Map<String,Object>>> getCheckChart(ShipCheckShow shipCheckShow);

    /**
     * 根据渔船编码和渔船名称获取渔船记录
     * @param queryParams
     * @return
     */
    public Pager<Ship> getShipListByOrgcode(ShipQueryParams queryParams, Pager pager);

    /**
     * 根据渔船编码获取渔船详细信息
     * @param ship
     * @return
     */
    public Ship getShipDetail(Ship ship);

    /**
     * 根据渔船编码获取渔船信息
     * @param ship
     * @return
     */
    public ShipShow getShipInfo(ShipShow ship);

    /**
     * 根据渔船编码获取所有产品信息
     * @param ship
     * @return
     */
    public ProductShow getProductsList(ShipShow ship);

    /**
     * 根据渔船编码获取所有产品信息
     * @param ship
     * @return
     */
    public ProductShow getProductsList2(ShipShow ship);

    /**
     * 根据渔船编码获取所有产品信息
     * @param ship
     * @return
     */
    public List<ProductShow> getProductsCheckList(ShipShow ship);

    /**
     * 根据渔船编码获取所有产品信息
     * @param ship
     * @return
     */
    public List<ShipTrace> getShipFollowList(ShipShow ship);
    /**
     * 根据产品编码获取该产品追溯信息链
     * @param ps
     * @return
     */
    public List<ProductTrace> getProductsCheckList(ProductShow ps);
    /**
     * 根据产品编码获取该产品完整信息
     * @param ps
     * @return
     */
    public ProductShow getProductShow(ProductShow ps);

    /**
     * 国内海洋渔船位置信息
     * @param ship
     * @return
     */
    Map<String,String> getGNShipGis(ShipShow ship);

    /**
     * 远洋渔船位置信息
     * @param ship
     * @return
     */
    Map<String,String> getYYShipGis(ShipShow ship);

    List getFinalList(List proShipList);

    Pager getInspectList(Pager page);


    /**
     *  根据产品编码获取产品信息
     */
    Map getProductinfo(ProductShow ps);


    /**
     * 根据产品编码获取产品追溯信息
     * @param ps
     * @return
     */
    List<Map<String,String>> getProductHistory(ProductShow ps);

    /**
     * 獲取漁船位置信息
     * @param ship
     * @return
     */
    Object getShipPos(Ship ship);
}
