package study.com.designpatternstudy.ResponsibilityChain;

/**
 * Created by  HONGDA on 2018/11/5.
 */
public class Request1 extends AbstractRequest{

    public Request1(Object object) {
        super(object);
    }

    @Override
    public int getRequestLevel() {
        return 1;
    }
}
