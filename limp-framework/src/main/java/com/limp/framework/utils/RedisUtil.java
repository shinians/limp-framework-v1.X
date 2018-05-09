package com.limp.framework.utils;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * Created with IntelliJ IDEA.
 * User: zzh
 * Date: 17-7-9
 * Time: 下午5:17
 * To change this template use File | Settings | File Templates.
 */
public final  class RedisUtil {

    //Redis服务器IP
    private static String ADDR = "115.28.166.113";

    //Redis的端口号
    private static int PORT = 8085;

    //访问密码
    private static String AUTH = "cis";

    //可用连接实例的最大数目，默认值为8；
    //如果赋值为-1，则表示不限制；如果pool已经分配了maxActive个jedis实例，则此时pool的状态为exhausted(耗尽)。
    private static int MAX_ACTIVE = 1024;

    //控制一个pool最多有多少个状态为idle(空闲的)的jedis实例，默认值也是8。
    private static int MAX_IDLE = 200;

    //等待可用连接的最大时间，单位毫秒，默认值为-1，表示永不超时。如果超过等待时间，则直接抛出JedisConnectionException；
    private static int MAX_WAIT = 10000;

    private static int TIMEOUT = 10000;

    //在borrow一个jedis实例时，是否提前进行validate操作；如果为true，则得到的jedis实例均是可用的；
    private static boolean TEST_ON_BORROW = true;

    private static JedisPool jedisPool = null;

    /**
     * 初始化Redis连接池
     */
    static {
        try {
            JedisPoolConfig config = new JedisPoolConfig();
            // dbcp的修改日志显示：change "maxActive" -> "maxTotal" and "maxWait" -> "maxWaitMillis" in all examples.
             config.setMaxTotal(MAX_ACTIVE);
            config.setMaxIdle(MAX_IDLE);
            config.setMaxWaitMillis(MAX_WAIT);
            config.setTestOnBorrow(TEST_ON_BORROW);
            jedisPool = new JedisPool(config, ADDR, PORT, TIMEOUT, AUTH);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取Jedis实例
     * @return
     */
    public synchronized static Jedis getJedis() {
        try {
            if (jedisPool != null) {
                Jedis resource = jedisPool.getResource();
                return resource;
            } else {
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String get(String key) {
        Jedis jedis = jedisPool.getResource();
        String string = jedis.get(key);
        return string;
    }
    public static void set(String key,String value) {
        Jedis jedis = jedisPool.getResource();
        jedis.set(key, value);
    }
    public static long setExpire(String key,Integer value) {
        Jedis jedis = jedisPool.getResource();
        return jedis.expire(key, value);

    }
    public static void del(String key) {
        Jedis jedis = jedisPool.getResource();
        jedis.del(key);
    }
    public static String flushDB( ) {
        Jedis jedis = jedisPool.getResource();
        return jedis.flushDB();

    }

    /**
     * 释放jedis资源
     * @param jedis
     */
    public static void returnResource(Jedis jedis) {
        try {
            jedis = jedisPool.getResource();
        } finally {
            if (jedis != null) {
                jedis.close();
            }
        }

    }

    public static void main(String[] args) {
        System.out.println(RedisUtil.get("12_12"));;

      //  System.out.println(RedisUtil.setExpire("12_12", 5));
        ;
   //   RedisUtil.set("12_12", "你好1");
//        RedisUtil.del("12_12");
        ;
//       RedisUtil.flushDB();;
        System.out.println(RedisUtil.flushDB());;

    }
}
