package com.www.designmode.creation.factory.simple;

import org.junit.Test;

/**
 * <p>@Description 简单工厂模式测试 </p>
 * <p>@Version 1.0 </p>
 * <p>@Author www </p>
 * <p>@Date 2022/2/23 19:26 </p>
 */
public class SimpleFactoryTest {
	/**
	 * <p>@Description 测试 </p>
	 * <p>@Author www </p>
	 * <p>@Date 2022/2/23 19:50 </p>
	 * @return void
	 */
	@Test
	public void test() {
		SimpleFactory factory = new SimpleFactory();
		factory.getSender("sms").send();
		factory.getSender("mail").send();
	}
}
