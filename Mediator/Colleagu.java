package com.pioneer.polaris.polaris.demo.Mediator;

/**
 * Created by wxk on 2018/5/15.
 */

public abstract class Colleagu {
    private Mediator mediator;
    public Colleagu(Mediator mediator){
        this.mediator = mediator;
    }
    abstract void action();
}
