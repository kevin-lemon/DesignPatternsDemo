package Proxy;

/**
 * Created by wxk on 2018/5/3.
 * 代理模式，实现要代理的对象的接口，然后获取要代理的对象，调用代理对象的接口实现。
 */

public class ProxyDemo {

    public static void main(String args[]){
        Civilian civilian = new Civilian();
        Lawyer lawyer = new Lawyer(civilian);
        lawyer.submit();
        lawyer.defend();
        lawyer.burden();
        lawyer.finish();
    }
}
