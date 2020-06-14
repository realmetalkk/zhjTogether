package com.zhanghongjian.zhanghongjianidea;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class HelloJdkDynamicProxy implements InvocationHandler {


    public HelloInterface helloInterface;
    private Object HelloJdkDynamicProxy;

    public HelloJdkDynamicProxy(HelloInterface helloInterface) {
        this.helloInterface = helloInterface;
    }

    public HelloInterface getHelloInterface() {

        HelloInterface helloInterfaceProxy = (HelloInterface) Proxy.newProxyInstance(helloInterface.getClass().getClassLoader(), helloInterface.getClass().getInterfaces(), this);

        return helloInterfaceProxy;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("你调用的方法"+ method);
        System.out.println("你调用的参数"+ Arrays.toString(args));
        Object  invoke = method.invoke(helloInterface,args);
        System.out.println("方法返回数据"+ invoke);
        return invoke;
    }

    public static void main(String[] args) {
        HelloInterface helloImplements = new HelloImplements();
        HelloInterface HelloInterProxy = new HelloJdkDynamicProxy(helloImplements).getHelloInterface();
//        HelloInterProxy.say("haha");
        HelloInterProxy.def();
        HelloInterface.sta();
    }
}
