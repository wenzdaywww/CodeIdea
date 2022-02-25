package com.www.designmode.structural.bridge;

import com.www.designmode.structural.bridge.inf.Brand;

/**
 * <p>@Description 3、定义需要桥接的继承类，如电脑类型 </p>
 * <p>@Version 1.0 </p>
 * <p>@Author www </p>
 * <p>@Date 2022/2/25 22:48 </p>
 */
public class ComputerType {
    /** 电脑品牌 **/
    private Brand brand;
    /**
     * <p>@Description 构造方法 </p>
     * <p>@Author www </p>
     * <p>@Date 2022/2/25 22:49 </p>
     * @param brand
     * @return
     */
    public ComputerType(Brand brand) {
        this.brand = brand;
    }
    /**
     * <p>@Description 销售电脑 </p>
     * <p>@Author www </p>
     * <p>@Date 2022/2/25 22:50 </p>
     * @return void
     */
    public String sale(){
        return "销售" + brand.sale() + "品牌";
    }
}
