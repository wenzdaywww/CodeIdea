package com.www.designmode.structural.decorator.impl;

import com.www.designmode.structural.decorator.inf.Coffee;

/**
 * <p>@Description 3、装饰Decorator类,如咖啡加牛奶 </p>
 * <p>@Version 1.0 </p>
 * <p>@Author www </p>
 * <p>@Date 2022/2/24 22:40 </p>
 */
public class MilkDecorator extends Decorator{
    /**
     * <p>@Description 构造方法 </p>
     * <p>@Author www </p>
     * <p>@Date 2022/2/24 22:38 </p>
     * @param coffee
     * @return
     */
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    /**
     * <p>@Description 咖啡价格 </p>
     * <p>@Author www </p>
     * <p>@Date 2022/2/24 22:36 </p>
     * @return int
     */
    @Override
    public int getPrice() {
        return coffee.getPrice() + 10;
    }

    /**
     * <p>@Description 咖啡名称 </p>
     * <p>@Author www </p>
     * <p>@Date 2022/2/24 22:36 </p>
     * @return java.lang.String
     */
    @Override
    public String getName() {
        return "Milk " +coffee.getName() ;
    }
}
