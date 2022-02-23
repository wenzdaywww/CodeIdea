package com.www.designmode.behavior.strategy.impl;

import com.www.designmode.behavior.strategy.inf.Strategy;

/**
 * <p>@Description 2、一般用户的策略 </p>
 * <p>@Version 1.0 </p>
 * <p>@Author www </p>
 * <p>@Date 2022/2/23 22:25 </p>
 */
public class UserStrategy implements Strategy {
    /**
     * <p>@Description 用户类型不同优惠额度 </p>
     * <p>@Author www </p>
     * <p>@Date 2022/2/23 22:23 </p>
     * @return void
     */
    @Override
    public void discount() {
        System.out.println("一般用户，可以打8折");
    }
}
