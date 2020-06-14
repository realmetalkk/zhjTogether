package com.zhanghongjian.zhanghongjianidea;

public class Cat {


    public Cat(){
        System.out.println("调用了A的无参构造函数");
    }
    public Cat(String mess){
        System.out.println("调用了A的有参的构造函数\n"+
                "参数内容为："+mess);
    }
}
