package adapter;

/**
 * Created by wxk on 2018/5/3.
 * 在适配器adapter中实现要做适配的对象不存在的接口内的功能。
 * 定义：适配器模式将某个类的接口转换成客户端期望的另一个接口表示，
 * 主的目的是兼容性，让原本因接口不匹配不能一起工作的两个类可以协同工作。其别名为包装器(Wrapper)。
 */

public class AdapterDemo {

    public static void main(String args[]){
        Adaptee adaptee = new Adaptee();
        Adapter adapter = new Adapter(adaptee);
        adapter.sampleOperation1();
        adapter.sampleOperation2();
        ClassAdapter adapter1 = new ClassAdapter();
        adapter1.sampleOperation1();
        adapter1.sampleOperation2();
    }
}
