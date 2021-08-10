package Component;

/**
 * Created by wxk on 2018/5/14.
 */

public class SafeLeaf extends SafeComponent {
    public SafeLeaf(String name) {
        super(name);
    }
    @Override
    public void doSonthing() {
        System.out.println(name);
    }
}
