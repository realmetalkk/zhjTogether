package com.zhanghongjian.zhanghongjianidea.service;

import com.zhanghongjian.zhanghongjianidea.dao.RedisTestDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RedisTestServerImplement implements RedisTestServer{

    private static Logger logger = LoggerFactory.getLogger(RedisTestServerImplement.class);

    @Autowired
    RedisTestDao redisTestDao;

    public String getRedisValue(String key){
        return redisTestDao.getKey(key);
    }
    public void setRedisValue(String key,String value){

        redisTestDao.setKey(key,value);
    }

    public boolean delKey(String key) {
        return redisTestDao.delKey(key);
    }
}
