package com.pioneer.polaris.polaris.demo.adapter;

/**
 * Created by wxk on 2018/5/3.
 * 类适配模式
 */

public class ClassAdapter extends Adaptee implements Target {
    @Override
    public void sampleOperation2() {
        System.out.println("ClassAdapter sampleOperation2");
    }
}
