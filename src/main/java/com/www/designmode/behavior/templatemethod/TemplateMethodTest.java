package com.www.designmode.behavior.templatemethod;

import org.junit.Test;

/**
 * <p>@Description 模板方法模式测试 </p>
 * <p>@Version 1.0 </p>
 * <p>@Author www </p>
 * <p>@Date 2022/3/2 20:29 </p>
 */
public class TemplateMethodTest {
	/**
	 * <p>@Description 测试 </p>
	 * <p>@Author www </p>
	 * <p>@Date 2022/3/2 20:29 </p>
	 * @return void
	 */
	@Test
	public void test() {
		String exp = "8+8";
        AbstractCalculator cal = new Plus();
        int result = cal.calculate(exp, "\\+");
        System.out.println(result);
	}

}
