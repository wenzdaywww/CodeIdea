package com.www.designmode.creation.factory.method;

import org.junit.Test;

/**
 * <p>@Description 工厂方法模式测试 </p>
 * <p>@Version 1.0 </p>
 * <p>@Author www </p>
 * <p>@Date 2022/2/23 19:52 </p>
 */
public class FactoryMethodTest {
	/**
	 * <p>@Description 测试 </p>
	 * <p>@Author www </p>
	 * <p>@Date 2022/2/23 19:52 </p>
	 * @return void
	 */
	@Test
	public void test(){
		MethodFactory.getSmsSender().send();
		MethodFactory.getMailSender().send();
	}
}
