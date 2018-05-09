package com.chinasofti.sevice.impl;

import com.chinasofti.sevice.GetDataService;
import org.apache.log4j.Logger;

import java.io.*;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by work on 2017/11/5.
 */
public class GNShipPosListenerGet implements Runnable {

    private static Logger log = Logger.getLogger(GNShipPosListenerGet.class);

    private GetDataService getDataService;

    private Map<String, String> shipMap;

    private PrintWriter printWriter;

    private SimpleDateFormat sdf;

    public GNShipPosListenerGet(GetDataService getDataService, Map<String, String> shipMap) {
        this.getDataService = getDataService;
        this.shipMap = shipMap;
    }

    @Override
    public void run() {
        log.debug("--->Success create GNShipPosListenerGet...");
        getGNShipPos();
    }

    //获取北斗数据
    private void getGNShipPos() {
        try {
            sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Socket socket = new Socket("114.242.222.197", 7778);
            OutputStream os = socket.getOutputStream();//字节输出流
            printWriter = new PrintWriter(os);//将输出流包装成打印流
            printWriter.write("i chuanjianzhongruan,123456\r\n");
            printWriter.flush();

            //socket.shutdownOutput();

            Timer timer = new Timer(true);
            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    log.debug("连接保持:" + sdf.format(new Date()) + "---start----------------------------------");
                    try {
                        printWriter.write("k " + new Date().getTime() + "\r\n");
                        printWriter.flush();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    log.debug("连接保持:" + sdf.format(new Date()) + "---end----------------------------------");
                }
            }, 30 * 1000, 30 * 1000);

            while (true) {
                log.debug("while循环:" + sdf.format(new Date()) + "-------------------------------------");
                InputStream is = socket.getInputStream();
                BufferedReader br = new BufferedReader(new InputStreamReader(is));

                String info;
                List<String> infoList = new ArrayList<String>(100);
                while ((info = br.readLine()) != null) {
                    infoList.add(info);
                    if (infoList.size() == 100) {
                        List<String> infoListNew = new ArrayList<String>(infoList.size());
                        infoListNew.addAll(infoList);
                        GNShipPosListenerSave gnShipPosListenerSave = new GNShipPosListenerSave(getDataService, sdf, infoListNew, shipMap);
                        Thread thread = new Thread(gnShipPosListenerSave);
                        thread.start();
                        infoList.clear();
                    }
                }
                if (infoList.size() > 0) {
                    List<String> infoListNew = new ArrayList<String>(infoList.size());
                    infoListNew.addAll(infoList);
                    GNShipPosListenerSave gnShipPosListenerSave = new GNShipPosListenerSave(getDataService, sdf, infoListNew, shipMap);
                    Thread thread = new Thread(gnShipPosListenerSave);
                    thread.start();
                    infoList.clear();
                }
                Thread.sleep(30 * 1000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
