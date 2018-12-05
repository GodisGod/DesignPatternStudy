package study.com.designpatternstudy.bridge;

import android.util.Log;

/**
 * 大杯咖啡
 */
public class LargeCoffee extends Coffee {

    public LargeCoffee(CoffeeAdditives coffeeAdditives) {
        super(coffeeAdditives);
    }

    @Override
    public void makeCoffee() {
        Log.i("LHD", "大杯的" + coffeeAdditives.addSomething() + "咖啡");
    }
}
