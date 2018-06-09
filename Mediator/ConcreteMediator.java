package com.pioneer.polaris.polaris.demo.Mediator;

/**
 * Created by wxk on 2018/5/15.
 */

public class ConcreteMediator implements Mediator {
    private ConcreteColleaguA concreteColleaguA;
    private ConcreteColleaguB concreteColleaguB;

    public void setConcreteColleaguA(ConcreteColleaguA concreteColleaguA) {
        this.concreteColleaguA = concreteColleaguA;
    }

    public void setConcreteColleaguB(ConcreteColleaguB concreteColleaguB) {
        this.concreteColleaguB = concreteColleaguB;
    }

    @Override
    public void change() {
        if (concreteColleaguA!= null){
            concreteColleaguA.action();
        }
        if (concreteColleaguB != null){
            concreteColleaguB.action();
        }
    }
}
