package com.www.designmode.structural.bridge;

import com.www.designmode.structural.bridge.inf.Brand;

/**
 * <p>@Description 4、继承需要桥接的继承类，如笔记本电脑 </p>
 * <p>@Version 1.0 </p>
 * <p>@Author www </p>
 * <p>@Date 2022/2/25 22:52 </p>
 */
public class LaptopComputer extends ComputerType{
    /**
     * <p>@Description 构造方法 </p>
     * <p>@Author www </p>
     * <p>@Date 2022/2/25 22:49 </p>
     * @param brand
     * @return
     */
    public LaptopComputer(Brand brand) {
        super(brand);
    }

    /**
     * <p>@Description 销售电脑 </p>
     * <p>@Author www </p>
     * <p>@Date 2022/2/25 22:50 </p>
     * @return void
     */
    @Override
    public String sale() {
        return super.sale() + "笔记电脑";
    }
}
