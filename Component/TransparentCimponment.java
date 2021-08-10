package Component;

/**
 * Created by wxk on 2018/5/14.
 * 透明组合模式
 */

public abstract class TransparentCimponment {
    protected String name;

    public TransparentCimponment(String name) {
        this.name = name;
    }
    public abstract void doSonthing();

    public abstract void addChild(TransparentCimponment child);
    public abstract void removeChild(TransparentCimponment child);
    public abstract TransparentCimponment getChild(int index);
}
