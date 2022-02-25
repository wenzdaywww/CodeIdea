package com.www.designmode.structural.facade;

import org.junit.Test;

/**
 * <p>@Description 外观模式测试 </p>
 * <p>@Version 1.0 </p>
 * <p>@Author www </p>
 * <p>@Date 2022/2/25 22:29 </p>
 */
public class FacadeTest {

	/**
	 * <p>@Description 测试 </p>
	 * <p>@Author www </p>
	 * <p>@Date 2022/2/25 22:29 </p>
	 * @return void
	 */
	@Test
	public void test() {
		//创建一台电脑
		Computer computer = new Computer();
		//开机
		computer.startup();
		//关机
		computer.shutdown();
	}

}
