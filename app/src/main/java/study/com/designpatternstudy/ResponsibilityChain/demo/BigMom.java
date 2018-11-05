package study.com.designpatternstudy.ResponsibilityChain.demo;

/**
 * Created by  HONGDA on 2018/11/5.
 */
public class BigMom extends Enemy {

    @Override
    public String getEnemyName() {
        return "四皇 Big Mom";
    }

    @Override
    public int getFightNum() {
        return 9500;
    }
}
