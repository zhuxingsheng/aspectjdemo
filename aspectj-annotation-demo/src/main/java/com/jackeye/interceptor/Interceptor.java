package com.jackeye.interceptor;

/**
 * Created by jack01.zhu on 2017/10/13.
 */
public class Interceptor {

    private long startTime = 0,endTime = 0l;


    public void beforeAspectJ(Object signature, Object instance, Object[] args){
        startTime = System.currentTimeMillis();

        System.out.println("around before");
    }

    public void afterAspectJ(Object result, Object signature, Object instance,
            Object[] args, Throwable throwable){
        System.out.println("around after");
        endTime = System.currentTimeMillis();
        System.out.println("costs:"+(endTime - startTime));
    }
}
