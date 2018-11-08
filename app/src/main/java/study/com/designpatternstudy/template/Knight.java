package study.com.designpatternstudy.template;

import android.util.Log;

/**
 * Created by  HONGDA on 2018/11/8.
 */
public class Knight extends PlayGame {

    @Override
    protected void createRole() {
        Log.i("LHD", "创建游戏角色");
    }

    @Override
    protected void setName() {
        Log.i("LHD", "设置角色名字");
    }
}
