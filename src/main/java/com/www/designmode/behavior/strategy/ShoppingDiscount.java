package com.www.designmode.behavior.strategy;

import com.www.designmode.behavior.strategy.inf.Strategy;

/**
 * <p>@Description 3、购物折扣计算 </p>
 * <p>@Version 1.0 </p>
 * <p>@Author www </p>
 * <p>@Date 2022/2/23 22:28 </p>
 */
public class ShoppingDiscount {
    /** 策略对象 **/
    private Strategy strategy;
    /**
     * <p>@Description 构造方法 </p>
     * <p>@Author www </p>
     * <p>@Date 2022/2/23 22:30 </p>
     * @return
     */
    public ShoppingDiscount(){
    }
    /**
     * <p>@Description 构造方法 </p>
     * <p>@Author www </p>
     * <p>@Date 2022/2/23 22:30 </p>
     * @param strategy
     * @return
     */
    public ShoppingDiscount(Strategy strategy){
        this.strategy = strategy;
    }
    /**
     * <p>@Description 购物 </p>
     * <p>@Author www </p>
     * <p>@Date 2022/2/23 22:30 </p>
     * @return void
     */
    public void shopping(){
        strategy.discount();
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
