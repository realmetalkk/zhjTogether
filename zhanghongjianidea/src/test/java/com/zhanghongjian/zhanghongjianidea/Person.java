package com.zhanghongjian.zhanghongjianidea;

public class Person {
    Person() {
        System.out.println("构造方法被调用，对象初始化了");
    }

    Person(String n) {
        System.out.println("名字" + n);
    }

    Person(String n, int a) {
        System.out.println("名字" + n + "年龄" + a);
    }
}

class PersonDemo {
    public static void main(String[] args) {
        //初始化3次对象，分别带入不同的参数
//        new Person();
//        new Person("张三");
        new Person("李四" + 21);
    }


}