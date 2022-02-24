package com.www.designmode.structural.adapter.interfaces.inf;

/**
 * <p>@Description 2、待适配器类，如适配后输出的电压 </p>
 * <p>@Version 1.0 </p>
 * <p>@Author www </p>
 * <p>@Date 2022/2/24 22:02 </p>
 */
public abstract class VoltageAdapter implements IDirectVoltage2{
    /**
     * <p>@Description 输出5V电压 </p>
     * <p>@Author www </p>
     * <p>@Date 2022/2/24 21:24 </p>
     * @return void
     */
    @Override
    public int output5V() {
        return 0;
    }
    /**
     * <p>@Description 输出12V电压 </p>
     * <p>@Author www </p>
     * <p>@Date 2022/2/24 21:24 </p>
     * @return void
     */
    @Override
    public int output12V() {
        return 0;
    }
}
