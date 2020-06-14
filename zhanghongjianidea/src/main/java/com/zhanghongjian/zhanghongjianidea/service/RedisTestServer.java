package com.zhanghongjian.zhanghongjianidea.service;

import org.springframework.stereotype.Service;

@Service
public  interface RedisTestServer {

    public String getRedisValue(String key);


    public void setRedisValue(String key,String value);

    public boolean delKey(String key);
}
