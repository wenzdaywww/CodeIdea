package com.www.designmode.structural.decorator.inf;

/**
 * <p>@Description 1、定义基类，如咖啡 </p>
 * <p>@Version 1.0 </p>
 * <p>@Author www </p>
 * <p>@Date 2022/2/24 22:35 </p>
 */
public abstract class Coffee {
    /**
     * <p>@Description 咖啡价格 </p>
     * <p>@Author www </p>
     * <p>@Date 2022/2/24 22:36 </p>
     * @return int
     */
    public abstract int getPrice();
    /**
     * <p>@Description 咖啡名称 </p>
     * <p>@Author www </p>
     * <p>@Date 2022/2/24 22:36 </p>
     * @return java.lang.String
     */
    public abstract String getName();
}
