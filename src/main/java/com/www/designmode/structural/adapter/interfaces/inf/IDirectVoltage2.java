package com.www.designmode.structural.adapter.interfaces.inf;

/**
 * <p>@Description 1、需要适配的接口，如输出5V电压 </p>
 * <p>@Version 1.0 </p>
 * <p>@Author www </p>
 * <p>@Date 2022/2/24 21:24 </p>
 */
public interface IDirectVoltage2 {
    /**
     * <p>@Description 输出5V电压 </p>
     * <p>@Author www </p>
     * <p>@Date 2022/2/24 21:24 </p>
     * @return void
     */
    int output5V();
    /**
     * <p>@Description 输出12V电压 </p>
     * <p>@Author www </p>
     * <p>@Date 2022/2/24 21:24 </p>
     * @return void
     */
    int output12V();
}
