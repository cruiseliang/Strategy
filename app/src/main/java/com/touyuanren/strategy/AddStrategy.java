package com.touyuanren.strategy;

/**
 * Created by Liang on 2017/10/26 0026.
 */

public class AddStrategy implements Strategy {

    @Override
    public int calculate(int a, int b) {

        return a + b;
    }

}
