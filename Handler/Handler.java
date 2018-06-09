package com.pioneer.polaris.polaris.demo.Handler;

/**
 * Created by wxk on 2018/5/15.
 */

public abstract class Handler {
    protected Handler nextHandler;

    public void handleRequest(Request request){
        if (request.getRequestLevel() == getHandleLevel()){
            handle(request);
        }else {
            if (nextHandler != null){
                nextHandler.handleRequest(request);
            }else {
                System.out.println("没有对象能处理这个请求");
            }
        }
    }
    protected abstract int getHandleLevel();
    protected abstract void handle(Request request);
}
