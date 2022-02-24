package com.www.designmode.structural.adapter.interfaces.impl;

import com.www.designmode.structural.adapter.interfaces.inf.VoltageAdapter;

/**
 * <p>@Description 3、适配器类，如手机充电器 </p>
 * <p>@Version 1.0 </p>
 * <p>@Author www </p>
 * <p>@Date 2022/2/24 22:06 </p>
 */
public class PhoneAdapter extends VoltageAdapter {
    /**
     * <p>@Description 输出5V电压 </p>
     * <p>@Author www </p>
     * <p>@Date 2022/2/24 21:24 </p>
     * @return void
     */
    @Override
    public int output5V() {
        return 5;
    }
}
