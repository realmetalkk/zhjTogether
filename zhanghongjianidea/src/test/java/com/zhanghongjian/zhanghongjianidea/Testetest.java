package com.zhanghongjian.zhanghongjianidea;

public class Testetest {

    private static String sdaf;
    private static String jsdf;
    private String sdfsdf;

    public void testX (int[] coeffcientArry, int[] exponentArry){

        String x ="";
        for(int i=0;i<coeffcientArry.length;i++){
            x+=coeffcientArry[i];
            x+="x";
            x+=exponentArry[i];
            if(i!=coeffcientArry.length-1){
                x+="+";
            }
        }
        System.out.println(x);
    }

    public static void main(String[] args){

        Testetest testetest = new Testetest();
        int[] coeffcientArry = new int[] {2,2};
        int[] exponentArry = new int[] {2,4};
        testetest.testX(coeffcientArry,exponentArry);

        int[] coeffcientArry2 = new int[] {3,2};
        int[] exponentArry2 = new int[] {8,7};
        testetest.testX(coeffcientArry2,exponentArry2);

    }





}
