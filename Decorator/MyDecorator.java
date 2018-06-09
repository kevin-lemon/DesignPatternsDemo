package com.pioneer.polaris.polaris.demo.Decorator;

/**
 * Created by wxk on 2018/5/3.
 */

public class MyDecorator extends Decorator {


    public MyDecorator(Component component) {
        super(component);
    }

    private void moreOperation(){
        System.out.println("myDecorator operation");
    }
    @Override
    public void operation() {
        moreOperation();
        super.operation();
    }
}
