package study.com.designpatternstudy.bridge;

import android.util.Log;

/**
 * 中杯
 */
public class MiddleCoffee extends Coffee {
    public MiddleCoffee(CoffeeAdditives coffeeAdditives) {
        super(coffeeAdditives);
    }

    @Override
    public void makeCoffee() {
        Log.i("LHD", "中杯的" + coffeeAdditives.addSomething() + "咖啡");
    }
}
