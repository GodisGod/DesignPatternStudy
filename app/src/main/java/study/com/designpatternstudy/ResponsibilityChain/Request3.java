package study.com.designpatternstudy.ResponsibilityChain;

/**
 * Created by  HONGDA on 2018/11/5.
 */
public class Request3 extends AbstractRequest{

    public Request3(Object object) {
        super(object);
    }

    @Override
    public int getRequestLevel() {
        return 3;
    }
}
