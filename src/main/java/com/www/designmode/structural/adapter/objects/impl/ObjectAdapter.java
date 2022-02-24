package com.www.designmode.structural.adapter.objects.impl;

import com.www.designmode.structural.adapter.classes.Voltage220V;
import com.www.designmode.structural.adapter.objects.inf.IDirectVoltage3;


/**
 * <p>@Description 3、适配器，如电源适配器 </p>
 * <p>@Version 1.0 </p>
 * <p>@Author www </p>
 * <p>@Date 2022/2/24 21:52 </p>
 */
public class ObjectAdapter implements IDirectVoltage3 {
	/** 电源对象 **/
	private Voltage220V voltage220V;
	/**
	 * <p>@Description 构造方法 </p>
	 * <p>@Author www </p>
	 * <p>@Date 2022/2/24 21:54 </p>
	 * @param voltage220V
	 * @return
	 */
	public ObjectAdapter(Voltage220V voltage220V){
		//获取待适配的对象
		this.voltage220V = voltage220V;
	}

	/**
	 * <p>@Description 输出110V电压 </p>
	 * <p>@Author www </p>
	 * <p>@Date 2022/2/24 21:24 </p>
	 * @return void
	 */
	@Override
	public int output110V() {
		return voltage220V.output220V() - 110;
	}

	/**
	 * <p>@Description 输出120V电压 </p>
	 * <p>@Author www </p>
	 * <p>@Date 2022/2/24 21:24 </p>
	 * @return void
	 */
	@Override
	public int output120V() {
		return voltage220V.output220V() - 100;
	}
}
