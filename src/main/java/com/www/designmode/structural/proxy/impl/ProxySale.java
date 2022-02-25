package com.www.designmode.structural.proxy.impl;

import com.www.designmode.structural.proxy.inf.BuyCar;

/**
 * <p>@Description 3、代理者，如汽车销售 </p>
 * <p>@Version 1.0 </p>
 * <p>@Author www </p>
 * <p>@Date 2022/2/25 22:10 </p>
 */
public class ProxySale implements BuyCar {
    /** 买家 **/
    private Buyers buyers;

    /**
     * <p>@Description 购买汽车 </p>
     * <p>@Author www </p>
     * <p>@Date 2022/2/25 22:01 </p>
     * @return void
     */
    @Override
    public void buyCar() {
        if(buyers.isVip()){
            System.out.println("汽车销售为" + buyers.getName() + "代理购买汽车，因为是VIP客户，可享受优惠");
        }else {
            System.out.println("汽车销售为" + buyers.getName() + "代理购买汽车，因为不是VIP客户，没有优惠");
        }
    }

    public Buyers getBuyers() {
        return buyers;
    }

    public void setBuyers(Buyers buyers) {
        this.buyers = buyers;
    }
}
