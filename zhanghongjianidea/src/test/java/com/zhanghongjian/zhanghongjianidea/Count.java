package com.zhanghongjian.zhanghongjianidea;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Count {
    public volatile static int count = 0;
    public static void main( String[] args ) throws InterruptedException {
        ExecutorService threadpool = Executors.newFixedThreadPool(1000);
        for (int i = 0; i < 10000; i++) {
            threadpool.execute(new Runnable() {
                @Override
                public void run() {
                    count++;
                }
            });
        }
        threadpool.shutdown();
        //保证提交的任务全部执行完毕
        threadpool.awaitTermination(10000, TimeUnit.SECONDS);
        System.out.println(count);

    }
}
