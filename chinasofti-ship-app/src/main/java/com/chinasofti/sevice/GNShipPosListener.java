package com.chinasofti.sevice;

import com.chinasofti.sevice.impl.GNShipPosListenerGet;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Map;

/**
 * Created by work on 2017/10/28.
 */
@Component("GNShipPosListener")
public class GNShipPosListener {

    private static Logger log = Logger.getLogger(GNShipPosListener.class);

    @Autowired
    private GetDataService getDataService;

    private Map<String, String> shipMap;

    //在web启动时执行
    @PostConstruct
    public void applicationStart() {
        log.debug("--->application start...");
        //使用时解开下面注释。
        //shipMap = getDataService.getShipMap();
        //createThread();
    }

    //创建一个线程
    private void createThread() {
        GNShipPosListenerGet gnShipPosListenerGet = new GNShipPosListenerGet(getDataService, shipMap);
        Thread thread = new Thread(gnShipPosListenerGet);
        thread.start();
    }

}
