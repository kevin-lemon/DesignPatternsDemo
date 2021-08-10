package Decorator;

/**
 * Created by wxk on 2018/5/3.
 * 装饰者模式
 * 实现要装饰的对象相同的接口的抽象类，具体实现类继承该实现类，在具体实现中调用父类的方法。
 * 父类的方法调用装饰的类的方法。
 */

public class DecoratorDemo {

    public static void main(String args[]){
        ConcreteComponent concreteComponent = new ConcreteComponent();
        MyDecorator myDecorator = new MyDecorator(concreteComponent);
        myDecorator.operation();
    }
}
