package study.com.designpatternstudy.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by  HONGDA on 2018/12/3.
 */
public class DynamicDaWang implements InvocationHandler {

    private Object object;//具体的喽啰对象的引用

    public DynamicDaWang(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(object, args);
        return result;
    }

}
