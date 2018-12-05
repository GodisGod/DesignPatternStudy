package study.com.designpatternstudy.bridge;

/**
 * 咖啡佐料的抽象类
 */
public abstract class CoffeeAdditives {
    /**
     * 具体往咖啡里添加的东西由子类实现
     *
     * @return 具体添加的东西
     */
    public abstract String addSomething();
}
