package com.zhanghongjian.zhanghongjianidea;

public interface HelloInterface {

    String id = "StaticFinalId";

    static void sta(){
        System.out.println("staticMethod");
    }

    default void def(){
        System.out.println("defaultMethod");
    }

    void say(String world);
}
