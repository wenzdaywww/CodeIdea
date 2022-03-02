package com.www.designmode.behavior.iterator.impl;

import com.www.designmode.behavior.iterator.inf.Collection;
import com.www.designmode.behavior.iterator.inf.Iterator;

/**
 * <p>@Description 集合实现 </p>
 * <p>@Version 1.0 </p>
 * <p>@Author www </p>
 * <p>@Date 2022/3/2 21:32 </p>
 */
public class MyList implements Collection {
	public String []string = {"A","B","C","D","E"};
	/**
	 * <p>@Description 获取迭代器 </p>
	 * <p>@Author www </p>
	 * <p>@Date 2022/3/2 21:31 </p>
	 * @return com.www.designmode.behavior.iterator.inf.Iterator
	 */
	@Override
	public Iterator iterator() {
		return new MyIterator(this);
	}
	/**
	 * <p>@Description 取得集合元素 </p>
	 * <p>@Author www </p>
	 * <p>@Date 2022/3/2 21:32 </p>
	 * @param i
	 * @return java.lang.Object
	 */
	@Override
	public Object get(int i) {
		return string[i];
	}
	/**
	 * <p>@Description 取得集合大小 </p>
	 * <p>@Author www </p>
	 * <p>@Date 2022/3/2 21:32 </p>
	 * @return int
	 */
	@Override
	public int size() {
		return string.length;
	}
}
