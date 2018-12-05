package study.com.designpatternstudy.bridge;

/**
 * 咖啡包装的抽象类
 */
public abstract class Coffee {
    //持有了咖啡佐料“抽象”对象的引用，注意是抽象对象，而不是某个具体的对象
    protected CoffeeAdditives coffeeAdditives;

    public Coffee(CoffeeAdditives coffeeAdditives) {
        this.coffeeAdditives = coffeeAdditives;
    }

    /**
     * 具体什么咖啡由子类决定
     */
    public abstract void makeCoffee();

}
