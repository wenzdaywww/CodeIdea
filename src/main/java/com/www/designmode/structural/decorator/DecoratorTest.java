package com.www.designmode.structural.decorator;

import com.www.designmode.structural.decorator.impl.MilkDecorator;
import com.www.designmode.structural.decorator.impl.SimpleCoffee;
import com.www.designmode.structural.decorator.impl.SugarDecorator;
import com.www.designmode.structural.decorator.inf.Coffee;
import org.junit.Test;

/**
 * <p>@Description 装饰者模式测试 </p>
 * <p>@Version 1.0 </p>
 * <p>@Author www </p>
 * <p>@Date 2022/2/24 22:21 </p>
 */
public class DecoratorTest {

	/**
	 * <p>@Description 测试 </p>
	 * <p>@Author www </p>
	 * <p>@Date 2022/2/24 22:21 </p>
	 * @return void
	 */
	@Test
	public void test() {
		//购买一杯咖啡
		Coffee coffee = new SimpleCoffee();
		//咖啡加牛奶
		coffee = new MilkDecorator(coffee);
		//咖啡加糖
		coffee = new SugarDecorator(coffee);
		System.out.println("购买的咖啡名称：" + coffee.getName() + " , 咖啡价格：" + coffee.getPrice());
	}

}
