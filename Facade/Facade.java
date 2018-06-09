package com.pioneer.polaris.polaris.demo.Facade;

/**
 * Created by wxk on 2018/5/14.
 */

public class Facade {
    private SubSys1  subSys1 = new SubSys1Impl();
    private SubSys2 subSys2 = new SubSys2Impl();

    public void doSome(){
        subSys1.doSome();
        subSys2.doSome();
    }
}
