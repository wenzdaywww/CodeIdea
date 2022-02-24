package com.www.designmode.structural.decorator.impl;

import com.www.designmode.structural.decorator.inf.Coffee;

/**
 * <p>@Description 2、定义继承的Decorator类 </p>
 * <p>@Version 1.0 </p>
 * <p>@Author www </p>
 * <p>@Date 2022/2/24 22:37 </p>
 */
public abstract class Decorator extends Coffee {
    /** 咖啡 **/
    protected Coffee coffee;
    /**
     * <p>@Description 构造方法 </p>
     * <p>@Author www </p>
     * <p>@Date 2022/2/24 22:38 </p>
     * @param coffee
     * @return
     */
    public Decorator(Coffee coffee){
       this.coffee = coffee;
    }
}
