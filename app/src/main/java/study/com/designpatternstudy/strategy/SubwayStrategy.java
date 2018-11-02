package study.com.designpatternstudy.strategy;

/**
 * 地铁策略
 */
public class SubwayStrategy implements CalculateStrategy {
    @Override
    public String calculatePrice() {
        return "地铁策略";
    }
}
