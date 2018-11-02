package study.com.designpatternstudy.state;

import android.util.Log;

/**
 * 关机状态，此时只有开机功能是有效的
 */
public class PowerOffState implements FightState {
    @Override
    public void firstState() {
        Log.i("LHD", "肉、肉、肉");
    }

    @Override
    public void secondState() {
        Log.i("LHD", "肉、肉、肉");
    }

}
