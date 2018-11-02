package study.com.designpatternstudy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import study.com.designpatternstudy.factory.CreateProductFactory;
import study.com.designpatternstudy.factory.Product;
import study.com.designpatternstudy.factory.ProductB;
import study.com.designpatternstudy.observe.Beiguanchazhe;
import study.com.designpatternstudy.observe.Guanchazhe;
import study.com.designpatternstudy.state.FightController;
import study.com.designpatternstudy.strategy.BusStrategy;
import study.com.designpatternstudy.strategy.CalculateStrategy;

public class MainActivity extends AppCompatActivity {

    CalculateStrategy calculateStrategy;

    public void setCalculateStrategy(CalculateStrategy calculateStrategy) {
        this.calculateStrategy = calculateStrategy;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_create).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CreateProductFactory factory = new CreateProductFactory();
//                Product p = factory.createProduct(ProductA.class);
                Product p = factory.createProduct(ProductB.class);
                p.productName();
            }
        });
        findViewById(R.id.btn_observe).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                initObserve();
            }
        });

        findViewById(R.id.btn_strategy).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setCalculateStrategy(new BusStrategy());
                String str = calculateStrategy.calculatePrice();
                Log.i("LHD", "策略模式 ：" + str);
            }
        });

        findViewById(R.id.btn_state).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FightController tvController = new FightController();
                //吃饱
                tvController.powerOn();
                //战斗
                tvController.firstState();

                //饥饿
                tvController.powerOff();
                //没法战斗
                tvController.firstState();
            }
        });

    }

    private void initObserve() {
        //被观察的对象
        Beiguanchazhe beiguanchazhe = new Beiguanchazhe();
        //观察者
        Guanchazhe guanchazhe1 = new Guanchazhe("guan cha zhe 1");
        Guanchazhe guanchazhe2 = new Guanchazhe("guan cha zhe 2");
        Guanchazhe guanchazhe3 = new Guanchazhe("guan cha zhe 3");
        //将观察者注册到可观察的对象的观察者列表中
        beiguanchazhe.addObserver(guanchazhe1);
        beiguanchazhe.addObserver(guanchazhe2);
        beiguanchazhe.addObserver(guanchazhe3);
        //发布消息
        beiguanchazhe.updateName("新的名字出现了");
    }

}
