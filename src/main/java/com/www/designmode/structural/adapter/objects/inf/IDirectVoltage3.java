package com.www.designmode.structural.adapter.objects.inf;

/**
 * <p>@Description 2、需要适配的接口，如输出5V电压 </p>
 * <p>@Version 1.0 </p>
 * <p>@Author www </p>
 * <p>@Date 2022/2/24 21:24 </p>
 */
public interface IDirectVoltage3 {
    /**
     * <p>@Description 输出110V电压 </p>
     * <p>@Author www </p>
     * <p>@Date 2022/2/24 21:24 </p>
     * @return void
     */
    int output110V();
    /**
     * <p>@Description 输出120V电压 </p>
     * <p>@Author www </p>
     * <p>@Date 2022/2/24 21:24 </p>
     * @return void
     */
    int output120V();
}
