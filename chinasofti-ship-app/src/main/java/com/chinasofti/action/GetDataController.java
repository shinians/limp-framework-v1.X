package com.chinasofti.action;

import com.alibaba.fastjson.JSON;
import com.chinasofti.db.AESUtil;
import com.chinasofti.db.ZipUtil;
import com.chinasofti.sevice.GetDataService;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.limp.framework.core.annotation.Access;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by chennan on 2017/10/18.
 */
@Controller
@RequestMapping("/db")
public class GetDataController {

    @Autowired
    private GetDataService getDataService;

    @RequestMapping("/getYYShipData")
    @Access(login = true,privilege = false)
    public @ResponseBody
    void findByNamePwd() throws IOException {
        getDataService.getYYShipData();
    }

    /**
     * 获取广东国内渔船数据
     * @throws IOException
     */
    @RequestMapping("/getGNShipData_gd")
    @Access(login = true,privilege = false)
    public @ResponseBody
    void getGNShipData_gd() throws IOException {
        getDataService.getGNShipData_gd();
    }

    /**
     * 对接互保数据
     * @throws IOException
     */
    @RequestMapping("/saveInsuranceAndClaim")
    @Access(login = true,privilege = false)
    public @ResponseBody
    void saveInsuranceAndClaim() throws Exception {
        getDataService.saveInsuranceAndClaim();
    }

}
