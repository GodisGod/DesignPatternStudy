package study.com.designpatternstudy.decorator.sample;

import android.util.Log;

/**
 * 未经装饰的组件实现类
 */
public class ConcreteComponent extends Component {
    @Override
    public void operate() {
        //具体逻辑
        Log.i("LHD", "组件具体逻辑");
    }
}
