package com.zhanghongjian.zhanghongjianidea;

import com.zhanghongjian.zhanghongjianidea.controlle.HelloControlle;
import com.zhanghongjian.zhanghongjianidea.dao.RedisTestDao;
import com.zhanghongjian.zhanghongjianidea.service.RedisTestServer;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.Serializable;

@SpringBootTest
public class RedisTest  {
    public static Logger logger= LoggerFactory.getLogger(RedisTest.class);



    @Autowired
    RedisTestDao redisTestDao;
    @Test
    public void testRedis(){
        redisTestDao.setKey("aa","22");
        logger.info(redisTestDao.getKey("aa"));

    }

    @Test
    public void testRedisList(){
        redisTestDao.setList();
    }

    @Test
    public void testRedisMap(){
        redisTestDao.setMapTest();
    }

    @Autowired
    RedisTestServer redisTestServer;
    @Test
    public void redisTestServerGetValue(){
        redisTestServer.setRedisValue("getRedisValue","getRedisValu656556");
        String RedisValue = redisTestServer.getRedisValue("getRedisValue");
        logger.info(RedisValue);

    }


    @Autowired
    HelloControlle helloControlle;
    @Test
    public void helloControlleTest(){
        helloControlle.setRedisValue();
    }

}
