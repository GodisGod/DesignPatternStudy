package study.com.designpatternstudy.ResponsibilityChain.demo;

/**
 * 多佛朗明哥
 */
public class Joker extends Enemy {

    @Override
    public String getEnemyName() {
        return "七武海 多弗朗明哥";
    }

    @Override
    public int getFightNum() {
        return 5000;
    }
}
