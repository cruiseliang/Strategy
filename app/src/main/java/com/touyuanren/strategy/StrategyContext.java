package com.touyuanren.strategy;

/**
 * Created by Liang on 2017/10/26 0026.
 */

public class StrategyContext {
    private Strategy strategy;

    public StrategyContext(Strategy strategy) {
        super();
        this.strategy = strategy;
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public int calculate(int a, int b) {
        return strategy.calculate(a, b);
    }
}
