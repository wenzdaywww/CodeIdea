package com.www.designmode.behavior.iterator.impl;

import com.www.designmode.behavior.iterator.inf.Collection;
import com.www.designmode.behavior.iterator.inf.Iterator;

/**
 * <p>@Description 迭代器实现 </p>
 * <p>@Version 1.0 </p>
 * <p>@Author www </p>
 * <p>@Date 2022/3/2 21:34 </p>
 */
public class MyIterator implements Iterator {
	/** 集合堆笑 **/
	private Collection collection;
	/** 位置 **/
	private int pos = -1;
	/**
	 * <p>@Description 构造方法 </p>
	 * <p>@Author www </p>
	 * <p>@Date 2022/3/2 21:34 </p>
	 * @param collection
	 * @return
	 */
	public MyIterator(Collection collection){
		this.collection = collection;
	}
	/**
	 * <p>@Description 获取下一个 </p>
	 * <p>@Author www </p>
	 * <p>@Date 2022/3/2 21:31 </p>
	 * @return java.lang.Object
	 */
	@Override
	public Object next() {
		if(pos < collection.size() - 1){
			pos++;
		}
		return collection.get(pos);
	}
	/**
	 * <p>@Description 是否有下一个值 </p>
	 * <p>@Author www </p>
	 * <p>@Date 2022/3/2 21:31 </p>
	 * @return boolean
	 */
	@Override
	public boolean hasNext() {
		if(pos < collection.size()-1){
			return true;
		}else{
			return false;
		}
	}

}
