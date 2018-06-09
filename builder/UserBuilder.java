package com.pioneer.polaris.polaris.demo.builder;

/**
 * Created by wxk on 2018/5/14.
 */

public class UserBuilder implements IBuilder{
    private String name;
    private boolean sex;
    private int age;
    private float height;
    private float weight;

    @Override
    public IBuilder setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public IBuilder setSex(boolean sex) {
        this.sex = sex;
        return this;
    }

    @Override
    public IBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    @Override
    public IBuilder setHeight(float height) {
        this.height = height;
        return this;
    }

    @Override
    public IBuilder setWeight(float weight) {
        this.weight = weight;
        return this;
    }

    @Override
    public User create() {
        return new User(name,sex,age,height,weight);
    }
}
