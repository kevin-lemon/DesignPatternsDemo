package com.pioneer.polaris.polaris.demo.Component;

/**
 * Created by wxk on 2018/5/14.
 */

public class TransparentLeaf extends TransparentCimponment {
    public TransparentLeaf(String name) {
        super(name);
    }

    @Override
    public void doSonthing() {
        System.out.println(name);
    }

    @Override
    public void addChild(TransparentCimponment child) {
        throw new UnsupportedOperationException("叶子节点没有子节点");
    }

    @Override
    public void removeChild(TransparentCimponment child) {
        throw new UnsupportedOperationException("叶子节点没有子节点");
    }

    @Override
    public TransparentCimponment getChild(int index) {
        throw new UnsupportedOperationException("叶子节点没有子节点");
    }
}
