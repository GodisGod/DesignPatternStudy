package study.com.designpatternstudy.observe;

import java.util.Observable;

/**
 * Created by  HONGDA on 2018/10/22.
 */
public class Beiguanchazhe extends Observable {
    public void updateName(String newName) {
        //标识状态或者内容发送改变
        setChanged();
        //通知所有观察者
        notifyObservers(newName);
    }
}
