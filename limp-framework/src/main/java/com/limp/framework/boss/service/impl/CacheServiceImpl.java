package com.limp.framework.boss.service.impl;

import com.limp.framework.boss.service.CacheService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

/**
 * 类描述:单机版实现类
 * Created with IntelliJ IDEA.
 * User: zzh
 * Date: 17-7-9
 * Time: 下午8:26
 * To change this template use File | Settings | File Templates.
 */
@Service
public class CacheServiceImpl  implements CacheService {

    private static Logger logger= Logger.getLogger(CacheServiceImpl.class);

    /**
     *  异常信息说明：at least 1 bean which qualifies as autowire candidate for this dependency. Dependency annotations:
     *
     */
//    @Autowired
//    private static  JedisPool jedisPool=SpringContextHolder.getBean(JedisPool.class);

    public CacheServiceImpl() {
    }

    @Override
    public String get(String key) {
//      String string=  RedisCacheUtil.get(key); //通过静态方法获取value
        String value=SpringContextHolder.getBean(RedisCacheUtil.class).get(key);
        return value;
    }

    @Override
    public String set(String key, String value) {
        String value1=SpringContextHolder.getBean(RedisCacheUtil.class).set(key,value);

        return value;
    }

    @Override
    public String hget(String hkey, String key) {
        return null;
    }

    @Override
    public long hset(String hkey, String key, String value) {
        return 0;
    }

    @Override
    public long incr(String key) {
        return 0;
    }

    @Override
    public long expire(String key, int second) {
        return 0;
    }

    @Override
    public long ttl(String key) {
        return 0;
    }

    @Override
    public long del(String key) {
        return 0;
    }

    @Override
    public long hdel(String hkey, String key) {
        return 0;
    }

    /*@Override
    public String set(String key, String value) {
        Jedis jedis = jedisPool.getResource();
        String string = jedis.set(key, value);
        jedis.close();
        return string;
    }

    @Override
    public String hget(String hkey, String key) {
        Jedis jedis = jedisPool.getResource();
        String string = jedis.hget(hkey, key);
        jedis.close();
        return string;
    }

    @Override
    public long hset(String hkey, String key, String value) {
        Jedis jedis = jedisPool.getResource();
        Long result = jedis.hset(hkey, key, value);
        jedis.close();
        return result;
    }
    @Override
    public long incr(String key) {
        Jedis jedis = jedisPool.getResource();
        Long result = jedis.incr(key);
        jedis.close();
        return result;
    }

    @Override
    public long expire(String key, int second) {
        Jedis jedis = jedisPool.getResource();
        Long result = jedis.expire(key, second);
        jedis.close();
        return result;
    }

    @Override
    public long ttl(String key) {
        Jedis jedis = jedisPool.getResource();
        Long result = jedis.ttl(key);
        jedis.close();
        return result;
    }

    @Override
    public long del(String key) {
        Jedis jedis = jedisPool.getResource();
        Long result = jedis.del(key);
        jedis.close();
        return result;
    }

    @Override
    public long hdel(String hkey, String key) {
        Jedis jedis = jedisPool.getResource();
        Long result = jedis.hdel(hkey, key);
        jedis.close();
        return result;
    }*/
}
