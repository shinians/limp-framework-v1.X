package com.chinasofti.sevice;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.chinasofti.domain.ShipClaim;
import com.chinasofti.domain.ShipInsurance;
import com.chinasofti.utils.hb.SIService;
import com.chinasofti.utils.hb.SIServicePortType;
import com.ctc.wstx.exc.WstxIOException;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by work on 2017/11/2.
 * 互保数据解析
 */
public class HbClient {

    public static void main(String[] args) {
        try {
            HbClient hbClient = new HbClient();
            //保单
            List<ShipInsurance> shipInsuranceList = hbClient.getShipPoliycAppByShipName("浙奉渔11038");
            if (shipInsuranceList.size() > 0) {
                //String shipCode = "";
                for (int i = 0; i < shipInsuranceList.size(); i++) {
                    ShipInsurance shipInsurance = shipInsuranceList.get(i);
                    //shipCode = StrUtils.isBlank(shipCode) ? getDataService.getShipCodeByShipNameOrNo(shipInsurance.getShipName(), shipInsurance.getPolicynum()) : shipCode;
                    //shipInsurance.setShipCode(shipCode);
                }
            } else {
                System.out.println("查询结果为空！");
            }
            System.out.println("\n\n");
            //理赔
            List<ShipClaim> shipClaimList = hbClient.getShipClaimAppByShipName("皖和渔80091");
            if (shipClaimList.size() > 0) {
                //String shipCode = "";
                for (int i = 0; i < shipClaimList.size(); i++) {
                    ShipClaim shipClaim = shipClaimList.get(i);
                    //shipCode = StrUtils.isBlank(shipCode) ? getDataService.getShipCodeByShipNameOrNo(shipClaim.getShipName(), shipClaim.getCclmno()) : shipCode;
                    //shipClaim.setShipCode(shipCode);
                }
            } else {
                System.out.println("查询结果为空！");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //根据渔船名称获取保单List
    public List<ShipInsurance> getShipPoliycAppByShipName(String shipName) throws Exception {
        SIServicePortType siServicePortType = new SIService()
                .getSIServiceHttpPort();
        String shipPoliycAppResults = null;
        try{
            shipPoliycAppResults = siServicePortType.getShipPoliycApp("{'c_ship_name':'" + shipName
                    + "'}");
        }catch (Exception e){
            System.out.println("==================webservice获取数据发生异常>>>>>尝试重新连接===============================");
            e.printStackTrace();
            shipPoliycAppResults = siServicePortType.getShipPoliycApp("{'c_ship_name':'" + shipName
                    + "'}");
        }
        List<ShipInsurance> shipInsuranceList = saveShipPoliycApp(shipPoliycAppResults);
        //for (int i = 0; i < shipInsuranceList.size(); i++) {
        //    System.out.println("shipInsurance(" + i + ")==="
        //            + shipInsuranceList.get(i));
        //}
        return shipInsuranceList;
    }

    //根据渔船名称获取理赔List
    public List<ShipClaim> getShipClaimAppByShipName(String shipName) throws Exception {
        SIServicePortType siServicePortType = new SIService()
                .getSIServiceHttpPort();
        String shipClaimAppResults;
        try{
            shipClaimAppResults = siServicePortType.getShipClaimApp("{'c_ship_name':'" + shipName
                    + "'}");
        }catch (Exception e){
            System.out.println("==================webservice获取数据发生异常>>>>>尝试重新连接===============================");
            e.printStackTrace();
            shipClaimAppResults = siServicePortType.getShipClaimApp("{'c_ship_name':'" + shipName
                    + "'}");
        }
        List<ShipClaim> shipClaimList = saveShipClaimApp(shipClaimAppResults);
        return shipClaimList;
    }

    // 解析并返回保单List
    private List<ShipInsurance> saveShipPoliycApp(String shipPoliycAppResults) {
        List<ShipInsurance> shipInsuranceList = new ArrayList<ShipInsurance>();
        JSONObject jsonObject = JSONObject.parseObject(shipPoliycAppResults);

        String message = jsonObject.get("message").toString();
        if ("".equals(message)) {
            String SIPolicyFormDetail = jsonObject.get("SIPolicyFormDetail")
                    .toString();
            JSONArray jsonArray = JSONArray.parseArray(SIPolicyFormDetail);

            for (int i = 0; i < jsonArray.size(); i++) {
                ShipInsurance shipInsurance = new ShipInsurance();
                String SIPolicy = jsonArray.get(i).toString();
                JSONObject jsonObjectSIPolicy = JSONObject
                        .parseObject(SIPolicy);

                shipInsurance.setSailareaCde(jsonObjectSIPolicy.get(
                        "c_sailarea_cde").toString());
                shipInsurance.setShiptypCde(jsonObjectSIPolicy.get(
                        "c_shiptyp_cde").toString());
                shipInsurance.setShipTonnage(jsonObjectSIPolicy.get(
                        "c_ship_tonnage").toString());
                shipInsurance.setInsrncBgnTm(jsonObjectSIPolicy.get(
                        "t_insrnc_bgn_tm").toString());
                shipInsurance.setPayablePrm(jsonObjectSIPolicy.get(
                        "n_payable_prm").toString());
                shipInsurance.setNclmSum(jsonObjectSIPolicy.get("n_nclm_sum")
                        .toString());
                shipInsurance.setInsrncEndTm(jsonObjectSIPolicy.get(
                        "t_insrnc_end_tm").toString());
                shipInsurance.setInsrntTel(jsonObjectSIPolicy.get(
                        "c_insrnt_tel").toString());
                shipInsurance.setAssCnm(jsonObjectSIPolicy.get("c_ass_cnm")
                        .toString());
                shipInsurance.setAssAddr(jsonObjectSIPolicy.get("c_ass_addr")
                        .toString());
                shipInsurance.setBuildTm(jsonObjectSIPolicy.get("t_build_tm")
                        .toString());
                shipInsurance.setShipLong(jsonObjectSIPolicy.get("n_ship_long")
                        .toString());
                shipInsurance.setRealityPrm(jsonObjectSIPolicy.get(
                        "n_reality_prm").toString());
                shipInsurance.setAssType(jsonObjectSIPolicy.get("c_ass_typ")
                        .toString());
                shipInsurance.setSumAmt(jsonObjectSIPolicy.get("n_sum_amt")
                        .toString());
                shipInsurance.setInputTm(jsonObjectSIPolicy.get("t_input_tm")
                        .toString());
                shipInsurance.setPoliyFlag(jsonObjectSIPolicy.get(
                        "c_poliy_flag").toString());
                shipInsurance.setShipmaterialCde(jsonObjectSIPolicy.get(
                        "c_shipmaterial_cde").toString());
                shipInsurance.setInsrntcde(jsonObjectSIPolicy.get("CInsrntCde")
                        .toString());
                shipInsurance.setPower(jsonObjectSIPolicy.get("n_power")
                        .toString());
                shipInsurance.setSumPrm(jsonObjectSIPolicy.get("n_sum_prm")
                        .toString());
                shipInsurance.setPortOfRegistry(jsonObjectSIPolicy.get(
                        "c_port_of_registry").toString());

                String shipName = jsonObjectSIPolicy.get("c_ship_name")
                        .toString();
                if ("".equals(shipName)) {
                    shipName = jsonObject.get("c_ship_name").toString();
                }
                shipInsurance.setShipName(shipName);

                String plyNo = jsonObjectSIPolicy.get("c_ply_no").toString();
                shipInsurance.setPolicynum(plyNo);

                JSONArray jsonArrayShipRdr = JSONArray
                        .parseArray(jsonObjectSIPolicy.get("shipRdrList")
                                .toString());
                if (jsonArrayShipRdr.size() > 0) {
                    for (int j = 0; j < jsonArrayShipRdr.size(); j++) {
                        String shipRdr = jsonArrayShipRdr.get(j).toString();
                        JSONObject jsonObjectShipRdr = JSONObject
                                .parseObject(shipRdr);

                        shipInsurance.setAmt(jsonObjectShipRdr.get("n_amt")
                                .toString());
                        shipInsurance.setPlyRate(jsonObjectShipRdr.get(
                                "n_ply_rate").toString());
                        shipInsurance.setPrm(jsonObjectShipRdr.get("n_prm")
                                .toString());
                        shipInsurance.setRate(jsonObjectShipRdr.get("n_rate")
                                .toString());

                        String rdrCde = jsonObjectShipRdr.get("c_rdr_cde")
                                .toString();

                        String rdrName = jsonObjectShipRdr.get("c_rdr_name")
                                .toString();
                        shipInsurance.setRdrCnm(rdrName);

                        shipInsurance.setId(UUID.randomUUID().toString());
                        shipInsuranceList.add(shipInsurance);
                    }
                } else {
                    shipInsurance.setId(UUID.randomUUID().toString());
                    shipInsuranceList.add(shipInsurance);
                }

            }
        } else {
            message = getMessageConversions(message);
        }

        return shipInsuranceList;
    }

    // 解析并返回理赔List
    private List<ShipClaim> saveShipClaimApp(String shipClaimAppResults) {
        List<ShipClaim> shipClaimList = new ArrayList<ShipClaim>();
        JSONArray jsonArray = JSONArray.parseArray(shipClaimAppResults);

        if (jsonArray.size() > 0) {
            for (int i = 0; i < jsonArray.size(); i++) {
                ShipClaim shipClaim = new ShipClaim();

                String shipClaimString = jsonArray.get(i).toString();
                JSONObject jsonObjectShipClaim = JSONObject
                        .parseObject(shipClaimString);

                String message = jsonObjectShipClaim.get("message").toString();
                if ("".equals(message)) {
                    shipClaim.setAccorgcnm(jsonObjectShipClaim
                            .get("CAccOrgCnm").toString());
                    shipClaim.setAccrsncnm(jsonObjectShipClaim
                            .get("CAccRsnCnm").toString());
                    shipClaim.setRescuemodecde(jsonObjectShipClaim.get(
                            "CRescuemodeCde").toString());
                    shipClaim.setThddamagedtl(jsonObjectShipClaim.get(
                            "CThdDamageDtl").toString());
                    shipClaim.setShipName(jsonObjectShipClaim.get("CShipName")
                            .toString());
                    shipClaim.setSrvyopn(jsonObjectShipClaim.get("CSrvyOpn")
                            .toString());
                    shipClaim.setClaimFlag(jsonObjectShipClaim
                            .get("CClaimFlag").toString());
                    shipClaim.setSrvyspot(jsonObjectShipClaim.get("CSrvySpot")
                            .toString());
                    shipClaim.setAccdntdtl(jsonObjectShipClaim
                            .get("CAccdntDtl").toString());
                    shipClaim.setThdshipname(jsonObjectShipClaim.get(
                            "CThdShipName").toString());
                    shipClaim.setLostdegreecde(jsonObjectShipClaim.get(
                            "CLostDegreeCde").toString());
                    shipClaim.setRescuestatecde(jsonObjectShipClaim.get(
                            "CRescueStateCde").toString());
                    shipClaim.setDamagedtl(jsonObjectShipClaim
                            .get("CDamageDtl").toString());
                    shipClaim.setThdshipstatuscde(jsonObjectShipClaim.get(
                            "CThdShipStatusCde").toString());
                    shipClaim.setAccdntspot(jsonObjectShipClaim.get(
                            "CAccdntSpot").toString());
                    shipClaim.setAccdnttm(jsonObjectShipClaim.get("TAccdntTm")
                            .toString());
                    shipClaim.setHelpflag(jsonObjectShipClaim.get("CHelpFlag")
                            .toString());
                    shipClaim.setThdunit(jsonObjectShipClaim.get("CThdUnit")
                            .toString());
                    shipClaim.setSrvytm(jsonObjectShipClaim.get("TSrvyTm")
                            .toString());
                    shipClaim.setRepaddress(jsonObjectShipClaim.get(
                            "CRepAddress").toString());

                    String CClmNo = jsonObjectShipClaim.get("CClmNo")
                            .toString();
                    shipClaim.setCclmno(CClmNo);

                    JSONArray jsonArrayFile = JSONArray
                            .parseArray(jsonObjectShipClaim.get("fileList")
                                    .toString());
                    if (jsonArrayFile.size() > 0) {
                        for (int j = 0; j < jsonArrayFile.size(); j++) {

                            String file = jsonArrayFile.get(j).toString();
                            JSONObject jsonObject = JSONObject
                                    .parseObject(file);

                            shipClaim.setFiletype(jsonObject.get("CFileType")
                                    .toString());
                            shipClaim.setFilepath(jsonObject.get("CFilePath")
                                    .toString());

                            shipClaim.setId(UUID.randomUUID().toString());
                            shipClaimList.add(shipClaim);
                        }
                    } else {
                        shipClaim.setId(UUID.randomUUID().toString());
                        shipClaimList.add(shipClaim);
                    }
                } else {
                    message = getMessageConversions(message);
//                    System.out.println("===错误信息message===" + message + "===");
                }
            }
        } else {
        }
        return shipClaimList;
    }

    //消息转换
    private String getMessageConversions(String message) {
        if ("01".equals(message)) {
            message = "系统查询结果为空";
        } else if ("02".equals(message)) {
            message = "运行时异常";
        } else if ("03".equals(message)) {
            message = "其它";
        }
        return message;
    }

}
