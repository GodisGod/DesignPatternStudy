package study.com.designpatternstudy.ResponsibilityChain;

import android.util.Log;

/**
 * Created by  HONGDA on 2018/11/5.
 */
public class Handler3 extends AbstractHandler {

    @Override
    protected int getHandleLevel() {
        return 3;
    }

    @Override
    protected void handle(AbstractRequest request) {
        Log.i("LHD", "级别3处理请求");
    }

}
