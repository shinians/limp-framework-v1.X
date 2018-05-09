package com.limp.framework.boss.service.impl;

import com.limp.framework.utils.StrUtils;
import com.limp.framework.utils.TextUtils;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * @author:shinian
 * @description:
 * @date:Created in 23:57 2018/3/26
 * @modified By:
 * 说明：增加【1】Component解决RedisCacheUtil无法识别问题
 */
@Component
public class RedisCacheUtil {
    private static Logger logger= Logger.getLogger(RedisCacheUtil.class);

    /**
     *  * 说明【2】：增加空构造方法，解决SpringContextHolder.getBean(RedisCacheUtil.class)无法获取问题
     */
    public RedisCacheUtil() {
        super();
    }

    /**
     *  异常信息说明：at least 1 bean which qualifies as autowire candidate for this dependency. Dependency annotations:
     *
     */
    private static JedisPool jedisPool=null;//SpringContextHolder.getBean(JedisPool.class);

    /**
     * RedisCacheUtil 构造方法：增加封装类【3】解决jedisPool无法注入问题（可能是无空构造方法）
     * @param poolConfig
     * @param host
     * @param port
     * @param timeout
     * @param password
     */
    public RedisCacheUtil(final JedisPoolConfig poolConfig,final String host,final int port, int timeout, String password) {
        try{
            jedisPool = new JedisPool(poolConfig,host,port,timeout,password);
            logger.debug("-->初始缓存连接池...【成功】<--");
            logger.debug(TextUtils.format("host地址：{0}",host));
            logger.debug(TextUtils.format("port端口：{0}",port));
            logger.debug(TextUtils.format("timeout连接超时设置{0}s：{0}",timeout));
        }catch(Exception e){
            logger.error("Jedis Pool init failed:", e);
        }

    }

    /**
     * 在缓存库中通过key获取value值
     * @param key
     * @return
     */
    public  String get(String key) {
        if(StrUtils.isBlank(jedisPool))
        {
            logger.error("---->jedisPool为空<---");
            return null;
        }
        Jedis jedis = jedisPool.getResource();
        String string = jedis.get(key);
        if (jedis != null) {
            jedis.close();
        }
        return string;
    }

    /**
     * 通过静态类访问该方法： RedisCacheUtil.get(key)
     * @param key
     * @return
     */
    public static String getByStatic(String key) {
        Jedis jedis = jedisPool.getResource();
        String string = jedis.get(key);
        if (jedis != null) {
            jedis.close();
        }
        return string;
    }

    /**
     * 设置 key-value数据到缓存数据
     * @param key
     * @param value
     * @return
     */
    public  String set(String key, String value) {
        if(StrUtils.isBlank(jedisPool))
        {
            logger.error("---->jedisPool为空<---");
            return null;
        }
        Jedis jedis = jedisPool.getResource();
        String string = jedis.set(key, value);
        if (jedis != null) {
            jedis.close();
        }
        return string;
    }


    public String hget(String hkey, String key) {
        Jedis jedis = jedisPool.getResource();
        String string = jedis.hget(hkey, key);
        if (jedis != null) {
            jedis.close();
        }
        return string;
    }

    public long hset(String hkey, String key, String value) {
        Jedis jedis = jedisPool.getResource();
        Long result = jedis.hset(hkey, key, value);
        if (jedis != null) {
            jedis.close();
        }
        return result;
    }
    public long incr(String key) {
        Jedis jedis = jedisPool.getResource();
        Long result = jedis.incr(key);
        if (jedis != null) {
            jedis.close();
        }
        return result;
    }

    /**
     * 设置过期时间
     * @param key
     * @param second
     * @return  true设置失败， false设置成功
     */
    public boolean expire(String key, int second) {
        if(StrUtils.isBlank(jedisPool))
        {
            return false;
        }
        Jedis jedis = jedisPool.getResource();
        Long result = jedis.expire(key, second);
        if (jedis != null) {
            jedis.close();
        }
        return result==1?true:false;
    }

    public long ttl(String key) {
        Jedis jedis = jedisPool.getResource();
        Long result = jedis.ttl(key);
        if (jedis != null) {
            jedis.close();
        }
        return result;
    }

    /**
     * 清空数据库
     * @return
     */
    public boolean flushDB(){
        if(StrUtils.isBlank(jedisPool))
        {
            return false;
        }
        Jedis jedis = jedisPool.getResource();
        String result = jedis.flushDB();
        if (jedis != null) {
            jedis.close();
        }
        return "OK".equals(result)?true:false;
    }
    /**
     * 根据key删除数据
     * @param key
     * @return
     */
    public long del(String key) {
        if(StrUtils.isBlank(jedisPool))
        {
            return 0;
        }
        Jedis jedis = jedisPool.getResource();
        Long result = jedis.del(key);
        if (jedis != null) {
            jedis.close();
        }
        return result;
    }

    public long hdel(String hkey, String key) {
        Jedis jedis = jedisPool.getResource();
        Long result = jedis.hdel(hkey, key);
        if (jedis != null) {
            jedis.close();
        }
        return result;
    }

}

