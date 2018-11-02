package study.com.designpatternstudy.state;

import android.util.Log;

/**
 * 开机状态，此时再出发开机功能不做任何操作
 */
public class PowerOnState implements FightState {
    @Override
    public void firstState() {
        Log.i("LHD", "变身一级状态");
    }

    @Override
    public void secondState() {
        Log.i("LHD", "变身二级状态");
    }
}
