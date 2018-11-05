package study.com.designpatternstudy.ResponsibilityChain;

/**
 * Created by  HONGDA on 2018/11/5.
 */
public abstract class AbstractRequest {
    private Object object;//处理对象

    public AbstractRequest(Object object) {
        this.object = object;
    }

    /**
     * 获取处理的内容对象
     *
     * @return 具体的内容对象
     */
    public Object getContent() {
        return object;
    }

    /**
     * 获取请求级别
     *
     * @return 请求级别
     */
    public abstract int getRequestLevel();

}
