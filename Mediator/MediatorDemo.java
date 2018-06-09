package com.pioneer.polaris.polaris.demo.Mediator;

/**
 * Created by wxk on 2018/5/15.
 */

public class MediatorDemo {
    public static void main(String args[]){
        ConcreteMediator concreteMediator = new ConcreteMediator();
        concreteMediator.change();
        concreteMediator.setConcreteColleaguA(new ConcreteColleaguA(concreteMediator));
        concreteMediator.change();
    }
}
