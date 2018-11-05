package study.com.designpatternstudy.ResponsibilityChain.demo;

import android.util.Log;

/**
 * 香克斯
 */
public class Shanks extends ThePirate {
    @Override
    public int fightNum() {
        return 11000;
    }

    @Override
    public void fight(Enemy enemy) {
        Log.i("LHD", getHeroName() + "打败了" + enemy.getEnemyName());
    }

    @Override
    public String getHeroName() {
        return "四皇 红发香克斯";
    }
}
