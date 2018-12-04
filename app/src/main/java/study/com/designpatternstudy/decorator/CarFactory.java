package study.com.designpatternstudy.decorator;

import android.util.Log;

/**
 * 未经装饰的汽车工厂
 */
public class CarFactory extends Component {

    @Override
    public void operate() {
        Log.i("LHD", "安装汽车发动机");
    }

}
