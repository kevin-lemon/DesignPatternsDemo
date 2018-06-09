package com.pioneer.polaris.polaris.demo.Brige;

/**
 * Created by wxk on 2018/5/14.
 * 吧抽象类和实现分离出去通过桥接方式组合在一起实现一个功能。
 */

public class BrigeDemo {

    public static void main(String args[]){
        AddSuger addSuger = new AddSuger();
        LargeCoffe largeCoffe = new LargeCoffe(addSuger);
        largeCoffe.makeCoffee();
    }
}
