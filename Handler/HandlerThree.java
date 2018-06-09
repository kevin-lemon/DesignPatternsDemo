package com.pioneer.polaris.polaris.demo.Handler;

/**
 * Created by wxk on 2018/5/15.
 */

public class HandlerThree extends Handler {
    @Override
    protected int getHandleLevel() {
        return 3;
    }

    @Override
    protected void handle(Request request) {
        System.out.println("Handler3处理了请求："+request.getRequestLevel());
    }
}
