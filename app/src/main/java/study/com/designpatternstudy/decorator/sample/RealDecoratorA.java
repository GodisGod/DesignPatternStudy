package study.com.designpatternstudy.decorator.sample;

import android.util.Log;

/**
 * 具体装饰器A
 */
public class RealDecoratorA extends Decorator {

    /**
     * 将Component对象传给装饰器
     *
     * @param component
     */
    public RealDecoratorA(Component component) {
        super(component);
    }

    @Override
    public void operate() {
        operate1();//装饰方法可以在父类方法之前调用也可以在之后调用
        super.operate();//调用具体的组件方法
        operate2();
    }

    /**
     * 装饰方法1
     */
    private void operate1() {
        Log.i("LHD", "A装饰器1");
    }

    /**
     * 装饰方法2
     */
    private void operate2() {
        Log.i("LHD", "A装饰器2");
    }

}
