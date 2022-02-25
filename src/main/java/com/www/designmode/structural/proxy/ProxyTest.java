package com.www.designmode.structural.proxy;

import com.www.designmode.structural.proxy.impl.Buyers;
import com.www.designmode.structural.proxy.impl.ProxySale;
import org.junit.Test;

/**
 * <p>@Description 代理模式测试 </p>
 * <p>@Version 1.0 </p>
 * <p>@Author www </p>
 * <p>@Date 2022/2/25 21:57 </p>
 */
public class ProxyTest {

	/**
	 * <p>@Description 测试 </p>
	 * <p>@Author www </p>
	 * <p>@Date 2022/2/25 21:57 </p>
	 * @return void
	 */
	@Test
	public void test() {
		//来了个买家1
		Buyers buyers1 = new Buyers();
		buyers1.setName("张三");
		buyers1.setVip(true);
		//来了个买家2
		Buyers buyers2 = new Buyers();
		buyers2.setName("李四");
		buyers2.setVip(false);
		//过来一个销售
		ProxySale sale = new ProxySale();
		//销售接待买家1
		sale.setBuyers(buyers1);
		sale.buyCar();
		//销售接待买家2
		sale.setBuyers(buyers2);
		sale.buyCar();
	}

}
