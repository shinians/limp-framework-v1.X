package com.chinasofti.sevice;

import com.chinasofti.domain.GNShipPos;
import com.chinasofti.domain.ShipClaim;
import com.chinasofti.domain.ShipInsurance;

import java.io.IOException;
import java.util.List;
import java.util.Map;


public interface GetDataService{
    //获取远洋渔船信息
    void getYYShipData() throws IOException;

    //保存保单
    void saveShipInsurance(ShipInsurance shipInsurance);

    //保存理赔
    void saveShipClaim(ShipClaim shipClaim);

    //根据渔船名称获取渔船编号，如果为空则组合为“YC-no”的形式
    String getShipCodeByShipNameOrNo(String shipName, String no);

    //获取所有渔船信息
    Map<String, String> getShipMap();

    //保存北斗定位数据
    int saveGNShipPosList(List<GNShipPos> gnShipPosList);

    //获取广东远国内船数据
    void getGNShipData_gd();
    //对接互保数据
    void saveInsuranceAndClaim() throws Exception;
}
