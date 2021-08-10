package Facade;

/**
 * Created by wxk on 2018/5/14.
 * 通过外观类吧所有接口以及其实现方法统一实现
 */

public class FacadeDemo {
    public static void main(String args[]){
        Facade facade = new Facade();
        facade.doSome();
    }
}
