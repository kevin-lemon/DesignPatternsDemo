package com.pioneer.polaris.polaris.demo.Mediator;

/**
 * Created by wxk on 2018/5/15.
 */

public class ConcreteColleaguA extends Colleagu {
    public ConcreteColleaguA(Mediator mediator) {
        super(mediator);
    }

    @Override
    void action() {
        System.out.println("交给中介做A的事情");
    }
}
