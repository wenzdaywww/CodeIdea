package com.www.designmode.behavior.strategy;

import com.www.designmode.behavior.strategy.impl.UserStrategy;
import com.www.designmode.behavior.strategy.impl.VipUserStrategy;
import org.junit.Test;

/**
 * <p>@Description 策略模式测试 </p>
 * <p>@Version 1.0 </p>
 * <p>@Author www </p>
 * <p>@Date 2022/2/23 22:21 </p>
 */
public class StrategyTest {

	/**
	 * <p>@Description 测试 </p>
	 * <p>@Author www </p>
	 * <p>@Date 2022/2/23 22:21 </p>
	 * @return void
	 */
	@Test
	public void test() {
		//购物对象
		ShoppingDiscount shopping = new ShoppingDiscount();
		//一般用户购物
		shopping.setStrategy(new UserStrategy());
		shopping.shopping();
		//VIP用户购物
		shopping.setStrategy(new VipUserStrategy());
		shopping.shopping();
	}

}
