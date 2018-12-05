package study.com.designpatternstudy.adapter;

/**
 * 对象适配器模式
 */
public class NewFruitJuiceAdapter implements FruitJuice {

    AppleJuice appleJuice;

    public NewFruitJuiceAdapter(AppleJuice appleJuice) {
        this.appleJuice = appleJuice;
    }

    @Override
    public String getFruitJuice() {
        String juice = appleJuice.getAppleJuice();
        //经过一系列逆天的操作
        //得到一杯加了糖的苹果汁
        return "加了糖的" + juice;
    }

}
