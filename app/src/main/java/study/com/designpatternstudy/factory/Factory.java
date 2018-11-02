package study.com.designpatternstudy.factory;

/**
 * Created by  HONGDA on 2018/10/8.
 * 抽象的工厂接口
 */
public abstract class Factory {
    /**
     * 抽象工厂方法，具体生产什么由子类去实现
     */
    public abstract <T extends Product> T createProduct(Class<T> clz);
}
