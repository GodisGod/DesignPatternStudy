package study.com.designpatternstudy.proxy;

/**
 * Created by  HONGDA on 2018/12/3.
 */
public class DaWang implements Tasks {
    //大王的喽啰
    private Louluo louluo;
    public DaWang(Louluo louluo) {
        this.louluo = louluo;
    }

    @Override
    public void PatrolTheMountain() {
        //大王不会自己去巡山，所以让喽啰代替自己去
        louluo.PatrolTheMountain();
    }
}
