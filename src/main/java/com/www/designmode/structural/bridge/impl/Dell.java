package com.www.designmode.structural.bridge.impl;

import com.www.designmode.structural.bridge.inf.Brand;

/**
 * <p>@Description 2、实现接口类，如戴尔电脑 </p>
 * <p>@Version 1.0 </p>
 * <p>@Author www </p>
 * <p>@Date 2022/2/25 22:46 </p>
 */
public class Dell implements Brand {
    /**
     * <p>@Description 销售 </p>
     * <p>@Author www </p>
     * <p>@Date 2022/2/25 22:45 </p>
     * @return void
     */
    @Override
    public String sale() {
        return "戴尔";
    }
}
