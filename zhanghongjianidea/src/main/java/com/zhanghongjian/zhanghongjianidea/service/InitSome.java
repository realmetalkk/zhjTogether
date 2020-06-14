package com.zhanghongjian.zhanghongjianidea.service;


import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;


/*
以Spring的内置事件ContextRefreshedEvent为例，当ApplicationContext被初始化或刷新时，
会触发ContextRefreshedEvent事件，下面我们就实现一个ApplicationListener来监听此事件的发生。
*/
@Component
public class InitSome implements ApplicationListener<ContextRefreshedEvent> {

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        System.out.println("初始化执行一些");
    }
}
