package study.com.designpatternstudy.adapter;

/**
 * 使用类适配器模式需要继承被适配对象
 */
public class JuiceAdapter extends AppleJuice {

    @Override
    public String getAppleJuice() {
        //经过一系列复杂的惨无人道的工序
        //我们给苹果汁加上了糖
        return "加上了糖的" + super.getAppleJuice();
    }

    @Override
    public void doSomething() {
        super.doSomething();
    }

}
