package com.pioneer.polaris.polaris.demo.Flyweight;

/**
 * Created by wxk on 2018/5/15.
 */

public class ConcreteFlyweight implements Flyweight {
    private String inSideState = null;

    public ConcreteFlyweight(String inSideState){
        this.inSideState = inSideState;
    }

    @Override
    public void show(String name) {
        System.out.print(name);
    }
}
