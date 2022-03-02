package com.www.designmode.behavior.templatemethod;

/**
 * <p>@Description 2、实现抽象类中的抽象方法，已完成完整的算法。加法 </p>
 * <p>@Version 1.0 </p>
 * <p>@Author www </p>
 * <p>@Date 2022/3/2 20:37 </p>
 */
public class Plus extends AbstractCalculator {
	/**
	 * <p>@Description 加法计算 </p>
	 * <p>@Author www </p>
	 * <p>@Date 2022/3/2 20:37 </p>
	 * @param num1 数值
	 * @param num2 数值
	 * @return int 计算后的值
	 */
	@Override
	public int calculate(int num1, int num2) {
		return num1 + num2;
	}

}
