package study.com.designpatternstudy.ResponsibilityChain;

import android.util.Log;

/**
 * Created by  HONGDA on 2018/11/5.
 */
public class Handler2 extends AbstractHandler {

    @Override
    protected int getHandleLevel() {
        return 2;
    }

    @Override
    protected void handle(AbstractRequest request) {
        Log.i("LHD", "级别2处理请求");
    }

}
