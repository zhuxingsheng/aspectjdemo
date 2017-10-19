package com;

import com.vip.vpmp.service.AspectjService;
import org.opencloudb.service.TestService;

/**
 *
 * 使用agent方式
 * Created by jack01.zhu on 2017/10/13.
 */
public class AspectJMain {

    public static void main(String[]args) {
        AspectjService service = new AspectjService();
        service.execute("");
        service.execute();
        TestService s = new TestService();
        s.execute("");
        s.execute();
    }
}
