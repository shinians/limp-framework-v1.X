package com.chinasofti.utils;

import com.chinasofti.domain.GisPoint;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by ly on 2018/3/9.
 */
public class AddressUtil {
    private static double PI = 3.1415926535897932384626;
    private static double a = 6378245.0;
    private static double ee = 0.00669342162296594323;
    private static double x_pi = 3.14159265358979324 * 3000.0 / 180.0;
    //获取百度地图经纬信息
    public static GisPoint getBaiDuXYInfo(String address){
        GisPoint baiduXY = new GisPoint();
        String urlStr = "http://api.map.baidu.com/cloudgc/v1?ak=FF4e5da2538967ced511f531cae309e3&address="+address;
        try {
            URL url = new URL(urlStr);
            URLConnection urlConnection = url.openConnection(); // 打开连接
            BufferedReader br = new BufferedReader(new InputStreamReader(urlConnection.getInputStream(), "utf-8")); // 获取输入流
            String line = null;
            StringBuilder sb = new StringBuilder();
            while ((line = br.readLine()) != null)
            {
                sb.append(line + "\n");
            }
            br.close();
//            System.out.println(sb.toString());
            JsonParser parse =new JsonParser();
            JsonObject json = (JsonObject) parse.parse(sb.toString());
            JsonArray result = json.get("result").getAsJsonArray();
            if (result.size()==0)
                return null;
            JsonObject info = result.get(0).getAsJsonObject();
            JsonObject location = info.get("location").getAsJsonObject();
            String lng = location.get("lng").getAsString();
            String lat = location.get("lat").getAsString();
//            String[] strs = sb.toString().split(",");
//            String lng = strs[4].split(":")[1].substring(0,strs[4].split(":")[1].length()-1);
//            String lat = strs[3].split(":")[2];
            baiduXY.setLng(Double.valueOf(lng));
            baiduXY.setLat(Double.valueOf(lat));
        }catch (Exception e){
            e.printStackTrace();
        }
        return  baiduXY;
    }

    //获取百度地图经纬度转换WGS84坐标
    public static GisPoint bd09togcj02(GisPoint point) {
        GisPoint gcj02_point = new GisPoint();
        double x = point.getLng() - 0.0065;
        double y = point.getLat() - 0.006;
        double z = Math.sqrt(x * x + y * y) - 0.00002 * Math.sin(y * x_pi);
        double theta = Math.atan2(y, x) - 0.000003 * Math.cos(x * x_pi);
        gcj02_point.setLng(z * Math.cos(theta));
        gcj02_point.setLat(z * Math.sin(theta));
        return gcj02_point;
    }

    public static GisPoint gcj02towgs84(GisPoint point) {
        double dlat = transformlat(point.getLng() - 105.0, point.getLat() - 35.0);
        double dlng = transformlng(point.getLng() - 105.0, point.getLat() - 35.0);
        double radlat = point.getLat() / 180.0 * PI;
        double magic = Math.sin(radlat);
        magic = 1 - ee * magic * magic;
        double sqrtmagic = Math.sqrt(magic);
        dlat = (dlat * 180.0) / ((a * (1 - ee)) / (magic * sqrtmagic) * PI);
        dlng = (dlng * 180.0) / (a / sqrtmagic * Math.cos(radlat) * PI);
        double mglat = point.getLat() + dlat;
        double mglng = point.getLng() + dlng;
        GisPoint wgs_point = new GisPoint();
        wgs_point.setLng(point.getLng() * 2 - mglng);
        wgs_point.setLat(point.getLat() * 2 - mglat);
        return wgs_point;
    }

    private static double transformlat(double lng, double lat) {
        double ret = -100.0 + 2.0 * lng + 3.0 * lat + 0.2 * lat * lat + 0.1 * lng * lat + 0.2 * Math.sqrt(Math.abs(lng));
        ret += (20.0 * Math.sin(6.0 * lng * PI) + 20.0 * Math.sin(2.0 * lng * PI)) * 2.0 / 3.0;
        ret += (20.0 * Math.sin(lat * PI) + 40.0 * Math.sin(lat / 3.0 * PI)) * 2.0 / 3.0;
        ret += (160.0 * Math.sin(lat / 12.0 * PI) + 320 * Math.sin(lat * PI / 30.0)) * 2.0 / 3.0;
        return ret;
    }

    private static double transformlng(double lng, double lat) {
        double ret = 300.0 + lng + 2.0 * lat + 0.1 * lng * lng + 0.1 * lng * lat + 0.1 * Math.sqrt(Math.abs(lng));
        ret += (20.0 * Math.sin(6.0 * lng * PI) + 20.0 * Math.sin(2.0 * lng * PI)) * 2.0 / 3.0;
        ret += (20.0 * Math.sin(lng * PI) + 40.0 * Math.sin(lng / 3.0 * PI)) * 2.0 / 3.0;
        ret += (150.0 * Math.sin(lng / 12.0 * PI) + 300.0 * Math.sin(lng / 30.0 * PI)) * 2.0 / 3.0;
        return ret;
    }

    public static void main(String[] args) {
        GisPoint baidu_XY = getBaiDuXYInfo("秦皇岛");
        GisPoint gcj02_XY = bd09togcj02(baidu_XY);
        GisPoint wgs84_XY = gcj02towgs84(gcj02_XY);
        System.out.println(wgs84_XY.getLat()+","+wgs84_XY.getLng());
    }
}
