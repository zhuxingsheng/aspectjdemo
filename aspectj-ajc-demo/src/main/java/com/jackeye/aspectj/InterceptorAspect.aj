package com.jackeye.aspectj;

import com.jackeye.interceptor.Interceptor;

/**
 * Created by jack01.zhu on 2017/10/13.
 */
privileged  aspect InterceptorAspect {

    public pointcut executeMethod() : execution(public void execute(java.lang.String));

    after() returning (Object o): executeMethod() {
        System.out.println("Returned normally with " + o);
    }
    after() throwing (Exception e): executeMethod() {
        System.out.println("Threw an exception: " + e);
    }
    after(): executeMethod(){
        System.out.println("Returned or threw an Exception");
    }

    Object around():executeMethod() {
        Interceptor interceptor = new Interceptor();
        interceptor.beforeAspectJ(thisJoinPoint.getSignature(),thisJoinPoint.getTarget(), thisJoinPoint.getArgs());

        Object retVal =null;
        Throwable throwable = null;
        try{
            retVal = proceed();

        }catch (Throwable e) {
            throwable = e;
        }

        interceptor.afterAspectJ(retVal,thisJoinPoint.getSignature(),thisJoinPoint.getThis(), thisJoinPoint.getArgs(),throwable);

        return retVal;
    }
}
