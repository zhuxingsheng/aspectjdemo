package com.jackeye.aspectj;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by jack01.zhu on 2017/10/18.
 */
@Aspect
public abstract class AbstractPerformanceAdvice {

    @Pointcut
    abstract void externalPointcut();

    @Around("externalPointcut()")
    public void log(final ProceedingJoinPoint call) throws Throwable {
        call.proceed();
        System.out.println("Logging statistics."+call.getSignature());
    }
}
