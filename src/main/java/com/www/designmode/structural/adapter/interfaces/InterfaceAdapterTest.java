package com.www.designmode.structural.adapter.interfaces;

import com.www.designmode.structural.adapter.interfaces.impl.ComputerAdapter;
import com.www.designmode.structural.adapter.interfaces.impl.PhoneAdapter;
import org.junit.Test;

/**
 * <p>@Description 接口适配器测试 </p>
 * <p>@Version 1.0 </p>
 * <p>@Author www </p>
 * <p>@Date 2022/2/24 21:42 </p>
 */
public class InterfaceAdapterTest {

	/**
	 * <p>@Description 测试 </p>
	 * <p>@Author www </p>
	 * <p>@Date 2022/2/24 21:42 </p>
	 * @return void
	 */
	@Test
	public void test() {
		//创建一个手机充电器
		PhoneAdapter phoneAdapter = new PhoneAdapter();
		System.out.println("手机充电器输出的电压: " + phoneAdapter.output5V() + "V");
		//创建一个电脑充电器
		ComputerAdapter computerAdapter = new ComputerAdapter();
		System.out.println("电脑充电器输出的电压: " + computerAdapter.output12V() + "V");
	}

}
