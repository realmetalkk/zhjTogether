package com.zhanghongjian.zhanghongjianidea;

public class HelloImplements implements HelloInterface {

    @Override
    public void say(String world) {
        System.out.println("HelloImplements say"+world);
    }

    public HelloImplements(){
        System.out.println("constructor");
    }

    public HelloImplements(String sss){
        System.out.println("一个");
    }

    public HelloImplements(String sss,String aa){
        System.out.println("两个");
    }


    public static void main(String[] args) {
        HelloImplements helloimplements0 = new HelloImplements();
        HelloImplements helloimplements = new HelloImplements("sss");
        HelloImplements helloimplements2 = new HelloImplements("sss","ll");
    }
//    public static void main(String[] args) {
//        HelloImplements helloimplements = new HelloImplements();
//        helloimplements.def();
//        System.out.println(helloimplements.id);
//    }
}
