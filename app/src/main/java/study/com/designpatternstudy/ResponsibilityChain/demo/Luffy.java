package study.com.designpatternstudy.ResponsibilityChain.demo;

import android.util.Log;

/**
 * 路飞
 */
public class Luffy extends ThePirate {
    @Override
    public int fightNum() {
        return 5100;
    }

    @Override
    public void fight(Enemy enemy) {
        Log.i("LHD", getHeroName() + "打败了" + enemy.getEnemyName());
    }

    @Override
    public String getHeroName() {
        return "草帽小子路飞";
    }
}
