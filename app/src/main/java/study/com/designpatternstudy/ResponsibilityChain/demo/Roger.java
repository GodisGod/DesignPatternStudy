package study.com.designpatternstudy.ResponsibilityChain.demo;

import android.util.Log;

/**
 * 罗杰
 */
public class Roger extends ThePirate {

    @Override
    public int fightNum() {
        return 20000;
    }

    @Override
    public void fight(Enemy enemy) {
        Log.i("LHD", getHeroName() + "打败了" + enemy.getEnemyName());
    }

    @Override
    public String getHeroName() {
        return "海贼王 哥尔·D·罗杰 Gol·D·Roger";
    }
}
