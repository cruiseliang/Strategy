package com.touyuanren.strategy;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //加法
        StrategyContext context = new StrategyContext(new AddStrategy());
        System.out.println(context.calculate(10, 5));
        //减法
        StrategyContext context2 = new StrategyContext(new SubstractStrategy());
        System.out.println(context2.calculate(3, 2));
        //乘法
    }


}
