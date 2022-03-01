package com.www.datastructure.list.impl;

import java.util.Iterator;
import java.util.NoSuchElementException;

import com.www.datastructure.list.inf.MyList;
/**
 * <p>@Description 自定义迭代器 </p>
 * <p>@Version 1.0 </p>
 * <p>@Author www </p>
 * <p>@Date 2022/3/1 22:57 </p>
 */
public class MyIterator<E> implements Iterator<E>{
	/** 集合对象 */
	private MyList<E> myList;
	/** 下一个位置 */
	private int nextPosition;
	/** 是否有下一个调用 */
	private boolean wasNextCalled;
	/**
	 * <p>@Description 构造方法 </p>
	 * <p>@Author www </p>
	 * <p>@Date 2022/3/1 22:57 </p>
	 * @param myList
	 * @return
	 */
	public MyIterator(MyList<E> myList){
		this.myList=myList;
		nextPosition=0;
		wasNextCalled=false;
	}
	/**
	 * <p>@Description 是否有下一个 </p>
	 * <p>@Author www </p>
	 * <p>@Date 2022/3/1 22:52 </p>
	 * @return boolean true有，false没有
	 */
	@Override
	public boolean hasNext() {
		return nextPosition<myList.size();
	}
	/**
	 * <p>@Description 获取下一个元素 </p>
	 * <p>@Author www </p>
	 * <p>@Date 2022/3/1 22:53 </p>
	 * @return T 元素
	 */
	@Override
	public E next() {
		if (hasNext()) {
			wasNextCalled=true;
			E obj=myList.get(nextPosition);
			nextPosition++;
			return obj;
		}else {
			throw new NoSuchElementException("Illegal call to next();iterator is after end of list.");
		}
	}
	/**
	 * <p>@Description 删除当前元素 </p>
	 * <p>@Author www </p>
	 * <p>@Date 2022/3/1 22:53 </p>
	 * @return void
	 */
	@Override
	public void remove() {
		if (wasNextCalled) {
			myList.remove(nextPosition);
			wasNextCalled=false;
			nextPosition--;
		}else {
			throw new NoSuchElementException("Illegal call to remove();next() was not called.");
		}
	}

}
