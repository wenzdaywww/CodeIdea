package com.www.designmode.structural.adapter.objects;

import com.www.designmode.structural.adapter.classes.Voltage220V;
import com.www.designmode.structural.adapter.objects.impl.ObjectAdapter;
import org.junit.Test;

/**
 * <p>@Description 对象适配器测试 </p>
 * <p>@Version 1.0 </p>
 * <p>@Author www </p>
 * <p>@Date 2022/2/24 21:46 </p>
 */
public class ObjectAdapterTest {

	/**
	 * <p>@Description 测试 </p>
	 * <p>@Author www </p>
	 * <p>@Date 2022/2/24 21:46 </p>
	 * @return void
	 */
	 @Test
	public void test() {
	 	//创建电源适配器
	 	ObjectAdapter adapter = new ObjectAdapter(new Voltage220V());
		 //需要输出110V
		 System.out.println("需要使用110V交流电: " + adapter.output110V() + "V");
		 //需要输出120V
		 System.out.println("需要使用120V交流电: " + adapter.output120V() + "V");
	}

}
