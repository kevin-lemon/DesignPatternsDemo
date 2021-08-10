package Visitor;

/**
 * Created by wxk on 2018/5/15.
 */

public abstract class Element {
    public String name;

    public Element(String name) {
        this.name = name;
    }
    public abstract void accept(Visitor visitor);
    public abstract void download();
}
