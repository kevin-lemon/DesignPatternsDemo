package Flyweight;

import java.util.HashMap;

/**
 * Created by wxk on 2018/5/15.
 * 复合享元
 */

public class ConcreteCompositeFlyweight implements Flyweight{
    private HashMap<String,Flyweight> hashMap = new HashMap<>();

    @Override
    public void show(String name) {
        Flyweight flyweight = null;
        for (String insideState:hashMap.keySet()){
            flyweight = hashMap.get(insideState);
            flyweight.show(name);
        }
    }
    public void addFly(String insideState,Flyweight flyweight){
        hashMap.put(insideState,flyweight);
    }
}
