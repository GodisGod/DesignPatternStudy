package study.com.designpatternstudy.decorator.sample;

/**
 * 装饰器抽象类
 */
public class Decorator extends Component {
    public Component component;//持有一个Component对象的引用
    /**
     * 将Component对象传给装饰器
     *
     * @param component
     */
    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operate() {
        //调用组件的具体方法
        component.operate();
    }
}
