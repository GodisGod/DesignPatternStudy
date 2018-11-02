package study.com.designpatternstudy.observe;

import android.util.Log;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by  HONGDA on 2018/10/22.
 */
public class Guanchazhe implements Observer {

    private String name;

    public Guanchazhe(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        Log.i("LHD", "update  更新内容 ：" + arg);
    }

    @Override
    public String toString() {
        return "name = " + name;
    }

}
