package com.www.designmode.structural.bridge;

import com.www.designmode.structural.bridge.impl.Dell;
import com.www.designmode.structural.bridge.impl.Lenovo;
import org.junit.Test;

/**
 * <p>@Description 桥接模式 </p>
 * <p>@Version 1.0 </p>
 * <p>@Author www </p>
 * <p>@Date 2022/2/25 22:43 </p>
 */
public class BridgeTest {

	/**
	 * <p>@Description 测试 </p>
	 * <p>@Author www </p>
	 * <p>@Date 2022/2/25 22:43 </p>
	 * @return void
	 */
	@Test
	public void test() {
		//销售联想笔记本电脑
		ComputerType computer1 = new LaptopComputer(new Lenovo());
		System.out.println(computer1.sale());
		//销售联想台式电脑
		ComputerType computer2 = new DesktopComputer(new Lenovo());
		System.out.println(computer2.sale());
		//销售戴尔笔记本电脑
		ComputerType computer3 = new LaptopComputer(new Dell());
		System.out.println(computer3.sale());
		//销售戴尔台式电脑
		ComputerType computer4 = new DesktopComputer(new Dell());
		System.out.println(computer4.sale());
	}

}
