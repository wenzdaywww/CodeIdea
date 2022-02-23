package com.www.designmode.creation.abstractfactory;

import com.www.designmode.creation.abstractfactory.impl.MailFactory;
import com.www.designmode.creation.abstractfactory.impl.SmsFactory;
import com.www.designmode.creation.abstractfactory.inf.AbstractFactory;
import org.junit.Test;

/**
 * <p>@Description 抽象工厂方法测试 </p>
 * <p>@Version 1.0 </p>
 * <p>@Author www </p>
 * <p>@Date 2022/2/23 20:01 </p>
 */
public class AbstractFactoryTest {

	/**
	 * <p>@Description 测试 </p>
	 * <p>@Author www </p>
	 * <p>@Date 2022/2/23 20:01 </p>
	 * @return void
	 */
	@Test
	public void test() {
		AbstractFactory mailFactory = new MailFactory();
		mailFactory.getSender().send();
		AbstractFactory smsFactory = new SmsFactory();
		smsFactory.getSender().send();
	}

}
