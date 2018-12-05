package study.com.designpatternstudy.bridge;

import android.util.Log;

/**
 * 小杯咖啡
 */
public class SmallCoffee extends Coffee {
    public SmallCoffee(CoffeeAdditives coffeeAdditives) {
        super(coffeeAdditives);
    }

    @Override
    public void makeCoffee() {
        Log.i("LHD", "小杯的" + coffeeAdditives.addSomething() + "咖啡");
    }
}
