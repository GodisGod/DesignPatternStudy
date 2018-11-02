package study.com.designpatternstudy.factory;

import android.util.Log;

/**
 * Created by  HONGDA on 2018/10/8.
 */
public class ProductB extends Product {
    @Override
    public void productName() {
        Log.i("LHD", "这是B产品");
    }
}
