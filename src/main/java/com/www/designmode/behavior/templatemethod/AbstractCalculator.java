package com.www.designmode.behavior.templatemethod;

/**
 * <p>@Description 1、实现了模板方法，定义了算法的骨架。抽象计算器 </p>
 * <p>@Version 1.0 </p>
 * <p>@Author www </p>
 * <p>@Date 2022/3/2 20:34 </p>
 */
public abstract class AbstractCalculator {
	/**
	 * <p>@Description 计算，主方法，实现对本类其它方法的调用 </p>
	 * <p>@Author www </p>
	 * <p>@Date 2022/3/2 20:35 </p>
	 * @param exp 表达式
	 * @param opt 运算符
	 * @return int 计算后的值
	 */
	public int calculate(String exp,String opt){
		int array[] = split(exp,opt);
		return calculate(array[0],array[1]);
	}
	/**
	 * <p>@Description 具体算法，被子类重写的方法 </p>
	 * <p>@Author www </p>
	 * <p>@Date 2022/3/2 20:35 </p>
	 * @param num1 数值
	 * @param num2 数值
	 * @return int 计算后的值
	 */
	abstract int calculate(int num1,int num2);
	/**
	 * <p>@Description 切割表达式 </p>
	 * <p>@Author www </p>
	 * <p>@Date 2022/3/2 20:35 </p>
	 * @param exp 表达式
	 * @param opt 运算符
	 * @return int[] 数值
	 */
	public int[] split(String exp,String opt){
		String []array = exp.split(opt);
		int arrayInt[] = new int[2];
		arrayInt[0] = Integer.parseInt(array[0]);
		arrayInt[1] = Integer.parseInt(array[1]);
		return arrayInt;
	}
}
