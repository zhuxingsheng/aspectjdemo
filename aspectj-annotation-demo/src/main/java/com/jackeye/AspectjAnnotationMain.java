package com.jackeye;

import com.jackeye.service.AspectjService;

/**
 * 直接使用-javaagent aop.xml
 *
 * Created by jack01.zhu on 2017/10/13.
 */
public class AspectjAnnotationMain {

    public static void main(String[]args) {
        AspectjService service = new AspectjService();
        service.execute("");
    }
}
