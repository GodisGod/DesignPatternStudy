package study.com.designpatternstudy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import study.com.designpatternstudy.ResponsibilityChain.AbstractHandler;
import study.com.designpatternstudy.ResponsibilityChain.AbstractRequest;
import study.com.designpatternstudy.ResponsibilityChain.Handler1;
import study.com.designpatternstudy.ResponsibilityChain.Handler2;
import study.com.designpatternstudy.ResponsibilityChain.Handler3;
import study.com.designpatternstudy.ResponsibilityChain.Request1;
import study.com.designpatternstudy.ResponsibilityChain.Request2;
import study.com.designpatternstudy.ResponsibilityChain.Request3;
import study.com.designpatternstudy.ResponsibilityChain.demo.BigMom;
import study.com.designpatternstudy.ResponsibilityChain.demo.Enemy;
import study.com.designpatternstudy.ResponsibilityChain.demo.Joker;
import study.com.designpatternstudy.ResponsibilityChain.demo.KaiDuo;
import study.com.designpatternstudy.ResponsibilityChain.demo.Luffy;
import study.com.designpatternstudy.ResponsibilityChain.demo.Roger;
import study.com.designpatternstudy.ResponsibilityChain.demo.Shanks;
import study.com.designpatternstudy.ResponsibilityChain.demo.TheKingOfTheSea;
import study.com.designpatternstudy.ResponsibilityChain.demo.ThePirate;
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

        findViewById(R.id.btn_response1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //构造3个处理者对象
                AbstractHandler handler1 = new Handler1();
                AbstractHandler handler2 = new Handler2();
                AbstractHandler handler3 = new Handler3();
                //设置当前处理者对象下一个节点的处理者对象
                handler1.setNextHandler(handler2);
                handler2.setNextHandler(handler3);
                //构造三个请求者
                AbstractRequest request1 = new Request1("request1");
                AbstractRequest request2 = new Request2("request2");
                AbstractRequest request3 = new Request3("request3");
                //总是从链式的首端发起请求
                handler1.handleRequest(request3);
                handler1.handleRequest(request2);
                handler1.handleRequest(request1);
            }
        });
        findViewById(R.id.btn_response2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //构建三个海贼
                ThePirate luffy = new Luffy();
                ThePirate shanks = new Shanks();
                ThePirate roger = new Roger();
                //设置关系，路飞的老大是香克斯，香克斯的老大是海贼王罗杰
                luffy.setNextPirate(shanks);
//                shanks.setNextPirate(roger);

                //构建三个敌人
                Enemy joker = new Joker();
                Enemy kaiDuo = new KaiDuo();
                Enemy kingOfTheSea = new TheKingOfTheSea();

                //让路飞去挨个揍敌人
                Log.i("LHD","路飞的第一个敌人");
                luffy.fightEnemy(joker);
                Log.i("LHD","路飞的第二个敌人");
                luffy.fightEnemy(kaiDuo);
                Log.i("LHD","路飞的第三个敌人");
                luffy.fightEnemy(kingOfTheSea);
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
