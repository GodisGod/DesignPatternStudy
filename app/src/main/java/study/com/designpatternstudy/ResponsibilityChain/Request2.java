package study.com.designpatternstudy.ResponsibilityChain;

/**
 * Created by  HONGDA on 2018/11/5.
 */
public class Request2 extends AbstractRequest{

    public Request2(Object object) {
        super(object);
    }

    @Override
    public int getRequestLevel() {
        return 2;
    }
}
