package com.pioneer.polaris.polaris.demo.Component;

import com.pioneer.polaris.polaris.demo.Decorator.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wxk on 2018/5/14.
 */

public class TransparentComposite extends TransparentCimponment {
    private List<TransparentCimponment> components = new ArrayList<>();
    public TransparentComposite(String name) {
        super(name);
    }

    @Override
    public void doSonthing() {
        System.out.println(name);
        if (null!=components){
            for (TransparentCimponment c:components) {
                c.doSonthing();
            }
        }
    }

    @Override
    public void addChild(TransparentCimponment child) {
        components.add(child);
    }

    @Override
    public void removeChild(TransparentCimponment child) {
        components.remove(child);
    }

    @Override
    public TransparentCimponment getChild(int index) {
        return components.get(index);
    }
}
