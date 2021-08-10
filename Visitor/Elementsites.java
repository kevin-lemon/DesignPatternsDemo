package Visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by wxk on 2018/5/15.
 */

public class Elementsites {
    List<Element> list = new ArrayList<>();//元素集合

    public void accept(Visitor visitor) {
        Iterator<Element> iterator = list.iterator();
        while (iterator.hasNext()) {//迭代遍历访问
            iterator.next().accept(visitor);
        }
    }

    public void addElement(Element element) {
        list.add(element);
    }
}
