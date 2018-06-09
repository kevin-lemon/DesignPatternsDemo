package com.pioneer.polaris.polaris.demo.Flyweight;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * Created by wxk on 2018/5/15.
 */

public class FlyWeightFactory {

    private ConcurrentMap<String,Flyweight> files = new ConcurrentHashMap<>();
    public FlyWeightFactory() {
    }
    public static FlyWeightFactory getInstance(){
        return FactoryHelper.INSTANCE;
    }
    private static class FactoryHelper{
        public final static FlyWeightFactory INSTANCE = new FlyWeightFactory();
    }

    public Flyweight getFlyWeight(String insideState){
        Flyweight flyweight = files.get(insideState);
        if (null == flyweight) {
            flyweight = new ConcreteFlyweight(insideState);
            files.put(insideState, flyweight);
        }
        return flyweight;
    }

    //复合享元
    public Flyweight getFactory(List<String> compositeState) {
        ConcreteCompositeFlyweight compositeFly = new ConcreteCompositeFlyweight();

        for (String inSideState : compositeState) {
            //添加一个享元对象
            compositeFly.addFly(inSideState,getFlyWeight(inSideState));
        }

        return compositeFly;
    }
}
