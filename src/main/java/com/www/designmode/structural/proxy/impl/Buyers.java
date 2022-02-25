package com.www.designmode.structural.proxy.impl;

import com.www.designmode.structural.proxy.inf.BuyCar;

/**
 * <p>@Description 2、被代理类实现，如买家 </p>
 * <p>@Version 1.0 </p>
 * <p>@Author www </p>
 * <p>@Date 2022/2/25 22:06 </p>
 */
public class Buyers implements BuyCar {
    /** 是否vip客户 **/
    private boolean vip;
    /** 客户名 **/
    private String name;
    /**
     * <p>@Description 购买汽车 </p>
     * <p>@Author www </p>
     * <p>@Date 2022/2/25 22:01 </p>
     * @return void
     */
    @Override
    public void buyCar() {
        System.out.println("不能直接购车");
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
