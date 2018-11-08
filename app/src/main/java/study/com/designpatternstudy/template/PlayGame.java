package study.com.designpatternstudy.template;

import android.util.Log;

/**
 * Created by  HONGDA on 2018/11/8.
 */
public abstract class PlayGame {
    protected void createRole() {
        Log.i("LHD", "创建角色");
    }

    protected void setName() {
        Log.i("LHD", "设置名字");
    }

    protected void startGame() {
        Log.i("LHD", "开始游戏");
    }

    protected void finishGame() {
        Log.i("LHD", "通关游戏");
    }

    public void play(){
        createRole();
        setName();
        startGame();
        finishGame();
    }

}
