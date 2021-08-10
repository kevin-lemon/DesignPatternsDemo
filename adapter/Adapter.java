package adapter;

/**
 * Created by wxk on 2018/5/3.
 * 对象适配模式
 */

public class Adapter  implements Target{

    private Adaptee adaptee;
    public Adapter(Adaptee adaptee){
        this.adaptee = adaptee;
    }
    @Override
    public void sampleOperation1() {
        this.adaptee.sampleOperation1();
    }

    @Override
    public void sampleOperation2() {
        System.out.println("sampleOperation2");
    }
}
