package com.zhanghongjian.zhanghongjianidea;

import java.lang.reflect.InvocationTargetException;

public class classForName {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
         Class helloImplementsClass = HelloImplements.class;
        HelloImplements helloImplements = (HelloImplements) helloImplementsClass.getConstructor().newInstance();
//        HelloImplements helloImplements2 = (HelloImplements) helloImplementsClass.getConstructor().newInstance("sdsf");
        helloImplements.say("44");

    }
}
