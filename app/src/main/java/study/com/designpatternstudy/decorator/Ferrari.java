package study.com.designpatternstudy.decorator;

import android.util.Log;

/**
 * 法拉利装饰器
 */
public class Ferrari extends FactoryDecorator{

    public Ferrari(Component component) {
        super(component);
    }

    @Override
    public void operate() {
        super.operate();//安装发动机
        installCarLogo();//安装汽车logo
        installCarTyre();//安装车标
    }

    /**
     * 安装车标
     */
    private void installCarLogo() {
        Log.i("LHD", "安装法拉利车标");
    }

    /**
     * 安装轮胎
     */
    private void installCarTyre() {
        Log.i("LHD", "安装法拉利轮胎");
    }

}
