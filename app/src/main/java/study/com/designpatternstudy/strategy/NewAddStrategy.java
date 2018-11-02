package study.com.designpatternstudy.strategy;

/**
 * Created by  HONGDA on 2018/11/1.
 */
public class NewAddStrategy implements CalculateStrategy {
    @Override
    public String calculatePrice() {
        return "新添加的策略";
    }
}
