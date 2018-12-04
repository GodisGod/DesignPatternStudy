package study.com.designpatternstudy.decorator;

/**
 * 抽象车厂装饰类
 */
public class FactoryDecorator extends Component{
    //保持一个基本组件的引用
    protected Component component;

    public FactoryDecorator(Component component) {
        this.component = component;
    }

    @Override
    public void operate() {
        //调用基本组件的方法
        component.operate();
    }

}
