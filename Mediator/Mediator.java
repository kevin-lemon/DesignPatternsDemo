package com.pioneer.polaris.polaris.demo.Mediator;

/**
 * Created by wxk on 2018/5/15.
 * Mediator: 抽象的中介者角色，定义了同事对象到中介者的接口。
 ConcreteMediator：具体的中介者角色，从具体的同事对象接收消息，同时向具体的同事对象发出命令。
 Colleague：抽象同事类角色，定义了中介者对象的接口，只知道中介而不知道其他同事对象。
 ConcreteColleagueA，B：具体的同事类角色，每个具体同事类都知道本身在小范围内的行为，而不知道他在大范围中的行为。
 */

public interface Mediator {

    void change();
}
