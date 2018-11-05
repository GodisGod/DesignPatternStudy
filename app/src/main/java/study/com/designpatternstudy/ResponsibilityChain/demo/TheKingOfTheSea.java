package study.com.designpatternstudy.ResponsibilityChain.demo;

/**
 * 近海之王
 */
public class TheKingOfTheSea extends Enemy {

    @Override
    public String getEnemyName() {
        return "近海之王";
    }

    @Override
    public int getFightNum() {
        return 15000;
    }
}
