package study.com.designpatternstudy.strategy;

/**
 * 公交车收费策略
 */
public class BusStrategy implements CalculateStrategy {
    @Override
    public String calculatePrice() {
        return "公交车收费策略";
    }
}
