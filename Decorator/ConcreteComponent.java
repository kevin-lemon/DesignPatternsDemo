package com.pioneer.polaris.polaris.demo.Decorator;

/**
 * Created by wxk on 2018/5/3.
 */

public class ConcreteComponent implements Component {
    @Override
    public void operation() {
        System.out.println("ConcreteComponent operation");
    }
}
