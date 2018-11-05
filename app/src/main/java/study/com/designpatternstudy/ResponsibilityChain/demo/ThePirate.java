package study.com.designpatternstudy.ResponsibilityChain.demo;

import android.util.Log;

/**
 * 海贼
 */
public abstract class ThePirate {
    private ThePirate nextPirate;

    /**
     * 设置下一个结点
     *
     * @param nextPirate
     */
    public void setNextPirate(ThePirate nextPirate) {
        this.nextPirate = nextPirate;
    }

    /**
     * 处理战斗需求
     *
     * @param enemy
     */
    public final void fightEnemy(Enemy enemy) {
        if (fightNum() >= enemy.getFightNum()) {
            Log.i("LHD", getHeroName() + "战斗力比较强，可以打败" + enemy.getEnemyName());
            fight(enemy);
        } else {
            if (nextPirate == null) {
                Log.i("LHD", "谁也打不过");
                //任务没有被处理，这个时候是不纯的责任链
                return;
            }
            Log.i("LHD", getHeroName() + "打不过" + enemy.getEnemyName() + "，那就让" + nextPirate.getHeroName() + "打他");
            nextPirate.fightEnemy(enemy);
        }
    }

    /**
     * 具体的战斗过程
     *
     * @param enemy
     */
    protected abstract void fight(Enemy enemy);

    /**
     * 获取英雄的名字
     *
     * @return
     */
    public abstract String getHeroName();

    /**
     * 获取战斗力数值
     *
     * @return
     */
    public abstract int fightNum();

}
