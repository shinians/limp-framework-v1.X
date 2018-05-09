package com.limp.framework.boss.service;

/**
 * Created with IntelliJ IDEA.
 * @author: zzh
 * Date: 17-7-9
 * Time: 下午8:24
 * To change this template use File | Settings | File Templates.
 * TODO:1、设置过时时间 2、设置key加密方式 3、redis连接异常采用jvm缓存或者其他方式
 * 4）扩展其他方法
 */

public interface CacheService {

    /**
     * 根据key值查询相应数据
     * @param key
     * @return
     */
    String get(String key);

    /**
     * 设置数据 key-value到缓存服务器
     * @param key
     * @param value
     * @return
     */
    String set(String key, String value);

    String hget(String hkey, String key);

    long hset(String hkey, String key, String value);

    long incr(String key);

    long expire(String key, int second);

    long ttl(String key);

    long del(String key);

    long hdel(String hkey, String key);
}
