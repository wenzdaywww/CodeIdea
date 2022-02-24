package com.www.designmode.structural.adapter.classes.impl;

import com.www.designmode.structural.adapter.classes.Voltage220V;
import com.www.designmode.structural.adapter.classes.inf.IDirectVoltage1;

/**
 * <p>@Description 3、适配器，如充电器 </p>
 * <p>@Version 1.0 </p>
 * <p>@Author www </p>
 * <p>@Date 2022/2/24 21:25 </p>
 */
public class ClassAdapter extends Voltage220V implements IDirectVoltage1 {
	/**
	 * <p>@Description 输出5V电压 </p>
	 * <p>@Author www </p>
	 * <p>@Date 2022/2/24 21:24 </p>
	 * @return void
	 */
	@Override
	public int output5V() {
		return super.output220V() - 215;
	}

	/**
	 * <p>@Description 输出10V电压 </p>
	 * <p>@Author www </p>
	 * <p>@Date 2022/2/24 21:24 </p>
	 * @return void
	 */
	@Override
	public int output12V() {
		return super.output220V() - 208;
	}
}
