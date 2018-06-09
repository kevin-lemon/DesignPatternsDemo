package com.pioneer.polaris.polaris.demo.Mediator;

/**
 * Created by wxk on 2018/5/15.
 */

public class ConcreteColleaguB extends Colleagu {
    public ConcreteColleaguB(Mediator mediator) {
        super(mediator);
    }

    @Override
    void action() {
        System.out.println("交给中介做B的事情");
    }
}
