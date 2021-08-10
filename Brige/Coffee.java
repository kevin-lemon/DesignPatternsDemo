package Brige;

/**
 * Created by wxk on 2018/5/14.
 */

public abstract class Coffee {
    private CoffeeAdditives impl;
    public Coffee(CoffeeAdditives coffeeAdditives){
        this.impl = coffeeAdditives;
    }

    public CoffeeAdditives getImpl() {
        return impl;
    }

    public abstract void makeCoffee();
}
