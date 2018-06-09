package com.pioneer.polaris.polaris.demo.Visitor;

/**
 * Created by wxk on 2018/5/15.
 */

public class ConcreteElementB extends Element {
    public ConcreteElementB(String name) {
        super(name);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public void download() {
        System.out.println("下载");
    }
    public void playVideo() {//视频类独有方法
        System.out.println("播放视频ing");
    }
    public String getName(){
        return name;
    }
}
