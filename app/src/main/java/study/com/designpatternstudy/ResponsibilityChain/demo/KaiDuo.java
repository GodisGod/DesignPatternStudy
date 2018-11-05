package study.com.designpatternstudy.ResponsibilityChain.demo;

/**
 * 凯多
 */
public class KaiDuo extends Enemy {

    @Override
    public String getEnemyName() {
        return "四皇凯多";
    }

    @Override
    public int getFightNum() {
        return 10000;
    }
}
