package Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wxk on 2018/5/14.
 */

public class SafeComposite extends SafeComponent {
    private List<SafeComponent> components = new ArrayList<>();

    public SafeComposite(String name) {
        super(name);
    }

    @Override
    public void doSonthing() {
        if (null!=components){
            for (SafeComponent c:components) {
                c.doSonthing();
            }
        }
    }
    public void addChild(SafeComponent component){
        components.add(component);
    }
    public void removeChild(SafeComponent child){
        components.remove(child);
    }
    public SafeComponent getChild(int index){
        return components.get(index);
    }
}
