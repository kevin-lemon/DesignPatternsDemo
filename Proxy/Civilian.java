package Proxy;

/**
 * Created by wxk on 2018/5/3.
 */

public class Civilian implements ILawsuit {
    @Override
    public void submit() {
        System.out.println("起诉");
    }

    @Override
    public void burden() {
        System.out.println("举证");
    }

    @Override
    public void defend() {
        System.out.println("辩护");
    }

    @Override
    public void finish() {
        System.out.println("胜诉");
    }
}
