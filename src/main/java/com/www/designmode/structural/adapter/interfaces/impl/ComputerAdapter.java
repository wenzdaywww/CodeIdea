package com.www.designmode.structural.adapter.interfaces.impl;

import com.www.designmode.structural.adapter.interfaces.inf.VoltageAdapter;

/**
 * <p>@Description 3、适配器类，如电脑充电器 </p>
 * <p>@Version 1.0 </p>
 * <p>@Author www </p>
 * <p>@Date 2022/2/24 22:06 </p>
 */
public class ComputerAdapter extends VoltageAdapter {
    /**
     * <p>@Description 输出12V电压 </p>
     * <p>@Author www </p>
     * <p>@Date 2022/2/24 21:24 </p>
     * @return void
     */
    @Override
    public int output12V() {
        return 12;
    }
}
