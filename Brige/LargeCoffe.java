package Brige;

/**
 * Created by wxk on 2018/5/14.
 */

public class LargeCoffe extends Coffee {
    public LargeCoffe(CoffeeAdditives coffeeAdditives) {
        super(coffeeAdditives);
    }

    @Override
    public void makeCoffee() {
        System.out.print("大杯");
        getImpl().add();
    }
}
