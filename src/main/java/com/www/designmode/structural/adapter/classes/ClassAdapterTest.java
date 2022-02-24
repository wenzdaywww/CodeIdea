package com.www.designmode.structural.adapter.classes;

import com.www.designmode.structural.adapter.classes.impl.ClassAdapter;
import org.junit.Test;

/**
 * <p>@Description 类适配器模式测试 </p>
 * <p>@Version 1.0 </p>
 * <p>@Author www </p>
 * <p>@Date 2022/2/24 21:13 </p>
 */
public class ClassAdapterTest {

	/**
	 * <p>@Description 测试  </p>
	 * <p>@Author www </p>
	 * <p>@Date 2022/2/24 21:13 </p>
	 * @return void
	 */
	@Test
	public void test() {
		//创建适配器
		ClassAdapter adapter = new ClassAdapter();
		//需要输出220V
		System.out.println("电灯需要使用220V交流电: " + adapter.output220V() + "V");
		//需要输出5V
		System.out.println("手机需要使用5V直流电: " + adapter.output5V() + "V");
		//需要输出10V
		System.out.println("电脑需要使用12V直流电: " + adapter.output12V() + "V");
	}

}
