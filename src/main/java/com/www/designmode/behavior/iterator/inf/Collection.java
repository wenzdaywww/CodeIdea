package com.www.designmode.behavior.iterator.inf;

/**
 * <p>@Description 集合接口 </p>
 * <p>@Version 1.0 </p>
 * <p>@Author www </p>
 * <p>@Date 2022/3/2 21:30 </p>
 */
public interface Collection {
	/**
	 * <p>@Description 获取迭代器 </p>
	 * <p>@Author www </p>
	 * <p>@Date 2022/3/2 21:31 </p>
	 * @return com.www.designmode.behavior.iterator.inf.Iterator
	 */
	Iterator iterator();
	/**
	 * <p>@Description 取得集合元素 </p>
	 * <p>@Author www </p>
	 * <p>@Date 2022/3/2 21:32 </p>
	 * @param i
	 * @return java.lang.Object
	 */
	Object get(int i);
	/**
	 * <p>@Description 取得集合大小 </p>
	 * <p>@Author www </p>
	 * <p>@Date 2022/3/2 21:32 </p>
	 * @return int
	 */
	int size();
}
