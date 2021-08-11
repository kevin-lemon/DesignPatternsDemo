package Visitor;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by wxk on 2018/5/15.
 */

public class VisitorDemo {
    public static void main(String args[]){
        ConcreteElementA wangyiyue = new ConcreteElementA("网易云音乐");
        ConcreteElementA kugou = new ConcreteElementA("酷狗");
        ConcreteElementB youku = new ConcreteElementB("优酷");
        ConcreteElementB iqiyi = new ConcreteElementB("爱奇艺");
        Elementsites elementsites = new Elementsites();
        elementsites.addElement(wangyiyue);
        elementsites.addElement(kugou);
        elementsites.addElement(youku);
        elementsites.addElement(iqiyi);
        Visitor visitor = new Idler();
        elementsites.accept(visitor);
    }
}
