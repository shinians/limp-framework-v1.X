package com.chinasofti.common;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * User:
 * Date: 17-4-24
 * Time: 上午9:20
 *
 * @author
 */
public class StoreControl {

    private static final Properties properties = new Properties();
        static {
            try {
                //TODO 注意路径
                InputStream inputStream = StoreControl.class.getClassLoader().getResourceAsStream("store.properties");
                properties.load(inputStream);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public static String getDirPath(String key){
            return (String)properties.get(key);
        }

        public static String getValue(String key){
            return (String)properties.get(key);
        }

    }


