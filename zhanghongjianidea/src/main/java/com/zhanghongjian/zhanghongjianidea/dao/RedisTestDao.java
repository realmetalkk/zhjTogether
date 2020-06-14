package com.zhanghongjian.zhanghongjianidea.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

@Repository
public class RedisTestDao implements Serializable {

    private String testRedisId = "99";

    @Autowired
    private StringRedisTemplate  stringRedisTemplate;

    @Autowired
    private RedisTemplate redisTemplate;

    public  void setKey(String key,String value){
        ValueOperations<String, String> ops = stringRedisTemplate.opsForValue();
        System.out.println("set key"+key+"val"+value);
        ops.set(key,value,1000, TimeUnit.MINUTES);

    }
    public String getKey(String key){
        String vall = null;
        try {

            ValueOperations<String, String> ops = stringRedisTemplate.opsForValue();
            System.out.println("get key"+key);
            System.out.println("val"+ops.get(key));
//        redisTemplate.opsForValue().get();
             vall = ops.get(key);
            return vall ;
        }catch (Exception e){
            e.printStackTrace();
        }
        return vall ;
    }

    public boolean delKey(String key){
       return  redisTemplate.delete(key);
    }


    public void setList(){
        List<RedisTestDao>  redisTestDaoArrayList = new ArrayList<RedisTestDao>();
        RedisTestDao redistestdao = new RedisTestDao();
        RedisTestDao redistestdao2 = new RedisTestDao();
        redisTestDaoArrayList.add(redistestdao);
        redisTestDaoArrayList.add(redistestdao2);
        try {

            redisTemplate.opsForList().leftPush("redisTestDaoArrayList",redisTestDaoArrayList);

            List<RedisTestDao> resultRedisTestDaoList = (List<RedisTestDao>) redisTemplate.opsForList().leftPop("redisTestDaoArrayList");
            RedisTestDao redistestdaoResult = resultRedisTestDaoList.get(0);
            System.out.println(redistestdaoResult.testRedisId);
        }catch (Exception e){
            e.printStackTrace();
        }


    }

    public  void setMapTest(){

        Map<String,String> map = new HashMap<String,String>();
        map.put("a","11");
        map.put("b","12");
        redisTemplate.opsForHash().putAll("map",map);
        Map<String,String> reslutMap  = redisTemplate.opsForHash().entries("map");
        System.out.println(reslutMap.get("a"));
        System.out.println(reslutMap.get("b"));

    }

}
