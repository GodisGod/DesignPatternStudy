package study.com.designpatternstudy.state;

import android.util.Log;

/**
 * Created by  HONGDA on 2018/11/2.
 */
public class FightController implements PowerController, FightState {

    FightState fightState;

    public void setFightState(FightState fightState) {
        this.fightState = fightState;
    }

    @Override
    public void powerOn() {
        Log.i("LHD", "吃饱啦！");
        setFightState(new PowerOnState());
    }

    @Override
    public void powerOff() {
        Log.i("LHD", "我饿啦！");
        setFightState(new PowerOffState());
    }


    @Override
    public void firstState() {
        fightState.firstState();
    }

    @Override
    public void secondState() {
        fightState.secondState();
    }

}
