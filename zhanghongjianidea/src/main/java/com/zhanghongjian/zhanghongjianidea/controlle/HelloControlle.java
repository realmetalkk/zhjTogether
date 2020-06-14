package com.zhanghongjian.zhanghongjianidea.controlle;

import com.zhanghongjian.zhanghongjianidea.service.RedisTestServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloControlle {

    private static Logger logger = LoggerFactory.getLogger(HelloControlle.class);

    private int a = 0;

    public HelloControlle(){
        System.out.println("初始化");
    }

    @RequestMapping("helloTest")
    @ResponseBody
    public String helloTest(){
        this.prin();
        return "helloTest";

    }
    @RequestMapping("helloTest2")
    @ResponseBody
    public String helloTest2(){
        this.prin();
        return "helloTest2";

    }
    @RequestMapping("/")
    @ResponseBody
    public String zhuye(){
        this.prin();
        return "zhuqqqye";

    }

    @Autowired
    RedisTestServer redisTestServer;
    public void setRedisValue(){
        redisTestServer.setRedisValue("controlle","controlle5");
        String controlleString = redisTestServer.getRedisValue("controlle");
        logger.info(controlleString);
        boolean delKeyFlag = redisTestServer.delKey("controlle");
        logger.info(String.valueOf(delKeyFlag));
    }

    public void prin(){
        a++;
        System.out.println(a);
    }
}
