package study.com.designpatternstudy.state;

import android.util.Log;

/**
 * Created by  HONGDA on 2018/11/2.
 */
public class CommonFightController implements FightState {

    //吃饱状态
    private final static int POWER_ON = 1;
    //饥饿状态
    private final static int POWER_OFF = 2;
    private int mState = POWER_OFF;

    public void powerOn() {
        mState = POWER_ON;
    }

    public void powerOff() {
        mState = POWER_OFF;
    }


    @Override
    public void firstState() {
        if (mState == POWER_ON) {
            Log.i("LHD", "一级状态");
        } else {
            Log.i("LHD", "肉、肉、肉");
        }
    }

    @Override
    public void secondState() {
        if (mState == POWER_ON) {
            Log.i("LHD", "二级状态");
        } else {
            Log.i("LHD", "肉、肉、肉");
        }
    }
}
