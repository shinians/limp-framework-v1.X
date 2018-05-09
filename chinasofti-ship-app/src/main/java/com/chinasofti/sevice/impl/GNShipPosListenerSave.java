package com.chinasofti.sevice.impl;

import com.chinasofti.domain.GNShipPos;
import com.chinasofti.sevice.GetDataService;
import com.limp.framework.utils.StrUtils;
import org.apache.log4j.Logger;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by work on 2017/11/5.
 */
public class GNShipPosListenerSave implements Runnable {

    private static Logger log = Logger.getLogger(GNShipPosListenerGet.class);

    private GetDataService getDataService;

    private SimpleDateFormat sdf;

    private List<String> infoList;

    private Map<String, String> shipMap;

    public GNShipPosListenerSave(GetDataService getDataService, SimpleDateFormat sdf, List<String> infoList, Map<String, String> shipMap) {
        this.getDataService = getDataService;
        this.sdf = sdf;
        this.infoList = infoList;
        this.shipMap = shipMap;
    }

    @Override
    public void run() {
        log.debug("--->Success create GNShipPosListenerSave...");
        saveGNShipPos();
    }

    //解析并保存北斗数据
    private void saveGNShipPos() {
        log.info(sdf.format(new Date()) + ",服务器端：infoList===" + infoList.toString());
        List<GNShipPos> gnShipPosList = new ArrayList<GNShipPos>(infoList.size());
        for (String info : infoList) {
            //log.info(sdf.format(new Date()) + ",服务器端：" + info);
            String[] gns = info.split(" ");
            if (gns.length > 1 && "p".equals(gns[0])) {
                String[] pos = gns[1].split(",");
                GNShipPos gnShipPos = new GNShipPos();

                gnShipPos.setId(pos[0]);
                //System.out.println("数据序列号：" + pos[0]);
                String shipValue = pos[1];
                //System.out.println("终端号码：" + pos[1]);
                gnShipPos.setCommType(pos[2]);
                //System.out.println("通信服务商代码：" + pos[2]);
                gnShipPos.setPostype(pos[3]);
                //System.out.println("位置类型：" + pos[3]);
                gnShipPos.setPostime(sdf.format(new Date(Long.parseLong(pos[4]) * 1000)));//北斗传过来的是妙级的毫秒值。
                //System.out.println("GPS定位时间：" + pos[4] + "======" + sdf.format(new Date(Long.parseLong(pos[4]) * 1000)));
                Double lon = Double.parseDouble(pos[5]) / 600000;
                gnShipPos.setLon(String.format("%.5f", lon));
                //System.out.println("经度：" + pos[5] + "======" + String.format("%.5f", lon));
                Double lat = Double.parseDouble(pos[6]) / 600000;
                gnShipPos.setLat(String.format("%.5f", lat));
                //System.out.println("纬度：" + pos[6] + "======" + String.format("%.5f", lat));
                Double direction = Double.parseDouble(pos[7]) / 10;
                gnShipPos.setDirection(String.format("%.2f", direction));
                //System.out.println("航向：" + pos[7] + "======" + String.format("%.2f", direction));
                gnShipPos.setBow(pos[8]);
                //System.out.println("船艏向：" + pos[8]);
                Double speed = Double.parseDouble(pos[9]) / 10;
                gnShipPos.setSpeed(String.format("%.2f", speed));
                //System.out.println("速度：" + pos[9] + "======" + String.format("%.2f", speed));
                //System.out.println("状态：" + pos[10]);
                //System.out.println("备注：" + pos[11]);
                gnShipPos.setTerminalType(pos[12]);
                //System.out.println("通信终端类型：" + pos[12]);
                gnShipPos.setIdt(sdf.format(new Date()));

                //根据“终端号码”查询渔船名称和渔船编码
                String shipName = shipMap.get(shipValue + "n");
                gnShipPos.setShipname(StrUtils.isBlank(shipName) ? "渔船" + shipValue : shipName);
                String shipCode = shipMap.get(shipValue + "c");
                gnShipPos.setShipno(StrUtils.isBlank(shipCode) ? "YC-" + shipValue : shipCode);

                //log.info(sdf.format(new Date()) + ",GNShipPos===" + gnShipPos.toString());
                gnShipPosList.add(gnShipPos);
            }
        }
        try {
            int i = getDataService.saveGNShipPosList(gnShipPosList);
            log.info(sdf.format(new Date()) + ",保存成功" + i + "个,gnShipPosList===" + gnShipPosList.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
