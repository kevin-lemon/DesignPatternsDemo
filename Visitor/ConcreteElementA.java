package Visitor;

/**
 * Created by wxk on 2018/5/15.
 */

public class ConcreteElementA extends Element {
    public ConcreteElementA(String name) {
        super(name);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public void download() {
        System.out.println("下载ing");
    }
    public void playMusic() {//音乐类独有方法
        System.out.println("播放音乐ing");
    }
    public String getName(){
        return name;
    }
}
