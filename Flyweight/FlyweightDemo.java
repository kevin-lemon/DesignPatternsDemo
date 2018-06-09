package com.pioneer.polaris.polaris.demo.Flyweight;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wxk on 2018/5/15.
 * 享元模式
 */

public class FlyweightDemo  {

    public static void main(String args[]){
        Flyweight flyweight = FlyWeightFactory.getInstance().getFlyWeight("test");
        flyweight.show("wxk");

//        使用复合享元
        List<String> list=new ArrayList<>();
        list.add("Android程序猿");
        list.add("前端程序猿");
        list.add("高级Java工程师");
        list.add("Android程序猿");
        Flyweight flyweights=FlyWeightFactory.getInstance().getFactory(list);
        flyweights.show("A");//外部状态
    }
}
