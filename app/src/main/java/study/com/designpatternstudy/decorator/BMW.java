package study.com.designpatternstudy.decorator;

import android.util.Log;

/**
 * 宝马车汽车厂
 */
public class BMW extends FactoryDecorator {

    public BMW(Component component) {
        super(component);
    }

    @Override
    public void operate() {
        installCarTyre();//安装车标
        super.operate();//安装发动机
        installCarLogo();//安装汽车logo
    }

    /**
     * 安装车标
     */
    private void installCarLogo() {
        Log.i("LHD", "安装宝马车标");
    }

    /**
     * 安装轮胎
     */
    private void installCarTyre() {
        Log.i("LHD", "安装宝马车轮胎");
    }

}
