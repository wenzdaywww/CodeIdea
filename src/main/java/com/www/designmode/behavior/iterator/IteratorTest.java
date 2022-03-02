package com.www.designmode.behavior.iterator;

import com.www.designmode.behavior.iterator.impl.MyList;
import com.www.designmode.behavior.iterator.inf.Collection;
import com.www.designmode.behavior.iterator.inf.Iterator;
import org.junit.Test;

/**
 * <p>@Description 迭代器模式 </p>
 * <p>@Version 1.0 </p>
 * <p>@Author www </p>
 * <p>@Date 2022/3/2 21:29 </p>
 */
public class IteratorTest {
	/**
	 * <p>@Description 测试 </p>
	 * <p>@Author www </p>
	 * <p>@Date 2022/3/2 21:29 </p>
	 * @return void
	 */
	@Test
	public void test() {
		Collection collection = new MyList();
		Iterator it = collection.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}
