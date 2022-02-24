package com.www.designmode.structural.decorator.impl;

import com.www.designmode.structural.decorator.inf.Coffee;

/**
 * <p>@Description  </p>
 * <p>@Version 1.0 </p>
 * <p>@Author www </p>
 * <p>@Date 2022/2/24 22:47 </p>
 */
public class SimpleCoffee extends Coffee {
    /**
     * <p>@Description 咖啡价格 </p>
     * <p>@Author www </p>
     * <p>@Date 2022/2/24 22:36 </p>
     *
     * @return int
     */
    @Override
    public int getPrice() {
        return 20;
    }

    /**
     * <p>@Description 咖啡名称 </p>
     * <p>@Author www </p>
     * <p>@Date 2022/2/24 22:36 </p>
     *
     * @return java.lang.String
     */
    @Override
    public String getName() {
        return "Coffee";
    }
}
