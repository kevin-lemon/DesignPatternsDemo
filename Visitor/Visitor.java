package com.pioneer.polaris.polaris.demo.Visitor;

/**
 * Created by wxk on 2018/5/15.
 * Visitor（抽象访问者）：接口或者抽象类，为每一个元素（Element）声明一个访问的方法。
 ConcreteVisitor（具体访问者）：实现抽象访问者中的方法，即对每一个元素都有其具体的访问行为。
 Element（抽象元素）：接口或者抽象类，定义一个accept方法，能够接受访问者（Visitor）的访问。
 ConcreteElementA、ConcreteElementB（具体元素）：实现抽象元素中的accept方法，通常是调用访问者提供的访问该元素的方法。
 Client（客户端类）：即要使用访问者模式的地方。
 */

public interface Visitor {

    void  visit(ConcreteElementA music);
    void visit(ConcreteElementB video);
}
