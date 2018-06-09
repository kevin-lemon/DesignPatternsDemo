package com.pioneer.polaris.polaris.demo.Handler;

/**
 * Created by wxk on 2018/5/15.
 * 责任链模式
 */

public class HandlerDemo {

    public static void main(String args[]){
        Handler handlerOne = new HandlerOne();
        Handler handlerTwo = new HandlerTwo();
        Handler handlerThree = new HandlerThree();
        handlerOne.nextHandler = handlerTwo;
        handlerTwo.nextHandler = handlerThree;
        Request requestOne = new RequestOne();
        Request requestTwo = new RequestTwo();
        Request requestThree = new RequestThree();
        handlerOne.handleRequest(requestOne);
        handlerOne.handleRequest(requestTwo);
        handlerOne.handleRequest(requestThree);
    }
}
