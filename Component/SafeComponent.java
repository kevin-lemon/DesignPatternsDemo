package Component;

/**
 * Created by wxk on 2018/5/14.
 * 安全组合模式
 */

public abstract class SafeComponent {
    protected String name;

    public SafeComponent(String name) {
        this.name = name;
    }
    public abstract void doSonthing();
}
