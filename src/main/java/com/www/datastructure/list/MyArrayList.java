package com.www.datastructure.list;

import java.util.Iterator;
import java.util.NoSuchElementException;

import com.www.datastructure.list.inf.MyList;

/**
 * <p>@Description 动态数组线性表，位置从0开始 </p>
 * <p>@Version 1.0 </p>
 * <p>@Author www </p>
 * <p>@Date 2022/3/1 22:42 </p>
 */
public class MyArrayList<T> implements MyList<T>{
	/** 数组长度 */
	private int length;
	/** 数组 */
	private T[] arr;
	/** 数组初始长度*/
	private int initSize;
	/**
	 * <p>@Description 构造方法 </p>
	 * <p>@Author www </p>
	 * <p>@Date 2022/3/1 22:42 </p>
	 */
	public MyArrayList() {
		this(10);
	}
	/**
	 * <p>@Description 构造方法 </p>
	 * <p>@Author www </p>
	 * <p>@Date 2022/3/1 22:42 </p>
	 * @param initSize 容量
	 */
	public MyArrayList(int initSize){
		length=0;
		this.initSize=initSize;
		arr=(T[])new Object[this.initSize];
	}
	/**
	 * <p>@Description 末尾添加元素 </p>
	 * <p>@Author www </p>
	 * <p>@Date 2022/3/1 22:43 </p>
	 * @param entry 元素
	 * @return boolean true添加成功，false添加失败
	 */
	@Override
	public boolean add(T entry) {
		boolean isSuccess=true;
		try {
			isSuccess=add(length, entry);
		} catch (Exception e) {
			isSuccess=false;
			e.printStackTrace();
		}
		return isSuccess;
	}
	/**
	 * <p>@Description 指定位置添加元素 </p>
	 * <p>@Author www </p>
	 * <p>@Date 2022/3/1 22:44 </p>
	 * @param position 位置坐标
	 * @param entry 元素
	 * @return boolean true添加成功，false添加失败
	 */
	@Override
	public boolean add(int position, T entry) {
		boolean isSuccess=true;
		try {
			//数组长度扩展，每次扩展长度=原数组长度+initSize
			if (isFull()) {
				T[] oldArr=arr;
				arr=(T[])new Object[initSize+oldArr.length];
				System.arraycopy(oldArr, 0, arr, 0, length);
			}
			if (position>=0&&position<=length+1) {
				for (int i = length ; (i-1)>=0 && i >= position; i--) {
					arr[i]=arr[i-1];
				}
				arr[position]=entry;
				length++;
			}else {
				isSuccess=false;
			}
		} catch (Exception e) {
			isSuccess=false;
			e.printStackTrace();
		}
		return isSuccess;
	}
	/**
	 * <p>@Description 添加到头部 </p>
	 * <p>@Author www </p>
	 * <p>@Date 2022/3/1 22:45 </p>
	 * @param entry 元素
	 * @return boolean true添加成功，false添加失败
	 */
	@Override
	public boolean addFirst(T entry) {
		return add(0, entry);
	}
	/**
	 * <p>@Description 添加到尾部 </p>
	 * <p>@Author www </p>
	 * <p>@Date 2022/3/1 22:45 </p>
	 * @param entry 元素
	 * @return boolean true添加成功，false添加失败
	 */
	@Override
	public boolean addLast(T entry) {
		return add(entry);
	}
	/**
	 * <p>@Description 删除指定位置元素 </p>
	 * <p>@Author www </p>
	 * <p>@Date 2022/3/1 22:45 </p>
	 * @param position 位置坐标
	 * @return T 删除的元素
	 */
	@Override
	public T remove(int position) {
		T obj=null;
		try {
			obj=arr[position];
			if (position==length-1) {
				arr[position]=null;
				length--;
			}else if (position>=0 && position<length-1) {
				for (int i = position; i < length-1; i++) {
					arr[i]=arr[i+1];

				}
				length--;
			}
		} catch (Exception e) {
			obj=null;
			e.printStackTrace();
		}
		return obj;
	}
	/**
	 * <p>@Description 删除头部第一个 </p>
	 * <p>@Author www </p>
	 * <p>@Date 2022/3/1 22:45 </p>
	 * @return T 删除的元素
	 */
	@Override
	public T removeFisrt() {
		return remove(0);
	}
	/**
	 * <p>@Description 删除尾部最后一个 </p>
	 * <p>@Author www </p>
	 * <p>@Date 2022/3/1 22:46 </p>
	 * @return T 删除的元素
	 */
	@Override
	public T removeLast() {
		return remove(length-1);
	}
	/**
	 * <p>@Description 清除所有元素 </p>
	 * <p>@Author www </p>
	 * <p>@Date 2022/3/1 22:46 </p>
	 * @return void
	 */
	@Override
	public void clear() {
		for (int i = 0; i < length; i++) {
			arr[i]=null;
		}
		length=0;
		arr=(T[])new Object[initSize];
	}
	/**
	 * <p>@Description 替换指定位置元素 </p>
	 * <p>@Author www </p>
	 * <p>@Date 2022/3/1 22:46 </p>
	 * @param position 位置坐标
	 * @param entry 替换的元素
	 * @return boolean true替换成功，false替换失败
	 */
	@Override
	public boolean replace(int position, T entry) {
		boolean isSuccess=true;
		try {
			arr[position]=entry;
		} catch (Exception e) {
			isSuccess=false;
			e.printStackTrace();
		}
		return isSuccess;
	}
	/**
	 * <p>@Description 获取指定位置元素 </p>
	 * <p>@Author www </p>
	 * <p>@Date 2022/3/1 22:47 </p>
	 * @param position 位置坐标
	 * @return T 元素
	 */
	@Override
	public T get(int position) {
		T obj=null;
		try {
			obj=arr[position];
		} catch (Exception e) {
			obj=null;
			e.printStackTrace();
		}
		return obj;
	}
	/**
	 * <p>@Description 获取第一个 </p>
	 * <p>@Author www </p>
	 * <p>@Date 2022/3/1 22:47 </p>
	 * @return T 元素
	 */
	@Override
	public T getFisrt() {
		return get(0);
	}
	/**
	 * <p>@Description 获取最后一个 </p>
	 * <p>@Author www </p>
	 * <p>@Date 2022/3/1 22:47 </p>
	 * @return T 元素
	 */
	@Override
	public T getLast() {
		return get(length-1);
	}
	/**
	 * <p>@Description 是否包含某元素 </p>
	 * <p>@Author www </p>
	 * <p>@Date 2022/3/1 22:47 </p>
	 * @param obj 某元素
	 * @return boolean true包含，false不包含
	 */
	@Override
	public boolean contains(Object obj) {
		boolean isContains=false;
		for (int i = 0; i < length; i++) {
			if (arr[i].equals(obj)) {
				isContains=true;
				break;
			}
		}
		return isContains;
	}
	/**
	 * <p>@Description 长度大小 </p>
	 * <p>@Author www </p>
	 * <p>@Date 2022/3/1 22:47 </p>
	 * @return int 长度大小
	 */
	@Override
	public int size() {
		return length;
	}
	/**
	 * <p>@Description 是否为空 </p>
	 * <p>@Author www </p>
	 * <p>@Date 2022/3/1 22:48 </p>
	 * @return boolean true为空，false不为空
	 */
	@Override
	public boolean isEmpty() {
		boolean isEmpty=false;
		if (length==0) {
			isEmpty=true;
		}
		return isEmpty;
	}
	/**
	 * <p>@Description 是否已满 </p>
	 * <p>@Author www </p>
	 * <p>@Date 2022/3/1 22:48 </p>
	 * @return boolean true已满
	 */
	@Override
	public boolean isFull() {
		return length==arr.length;
	}
	/**
	 * <p>@Description 打印显示 </p>
	 * <p>@Author www </p>
	 * <p>@Date 2022/3/1 22:48 </p>
	 * @return void
	 */
	@Override
	public void display() {
		String str="";
		str+="length="+size()+",arr.szie="+arr.length+":";
		for (int i = 0; i < length; i++) {
			str+=arr[i]+",";
		}
		System.out.println(str.substring(0, str.length()-1));
	}
	/**
	 * <p>@Description 获取迭代器 </p>
	 * <p>@Author www </p>
	 * <p>@Date 2022/3/1 22:52 </p>
	 * @return java.util.Iterator<T>
	 */
	@Override
	public Iterator<T> iterator() {
		return new ArrayIterator<T>();
	}
	/**
	 * <p>@Description 内部迭代器 </p>
	 * <p>@Version 1.0 </p>
	 * <p>@Author www </p>
	 * <p>@Date 2022/3/1 22:52 </p>
	 */
	private class ArrayIterator<T> implements Iterator<T>{
		/** 下一个索引 */
		private int nextIndex;
		/** 是否有下一个调用 */
		private boolean wasNextCalled;
		/**
		 * <p>@Description 构造方法 </p>
		 * <p>@Author www </p>
		 * <p>@Date 2022/3/1 22:52 </p>
		 * @return
		 */
		public ArrayIterator(){
			nextIndex=0;
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
			return nextIndex<length;
		}
		/**
		 * <p>@Description 获取下一个元素 </p>
		 * <p>@Author www </p>
		 * <p>@Date 2022/3/1 22:53 </p>
		 * @return T 元素
		 */
		@Override
		public T next() {
			if (hasNext()) {
				wasNextCalled=true;
				T obj=(T) arr[nextIndex];
				nextIndex++;
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
				MyArrayList.this.remove(nextIndex-1);
				wasNextCalled=false;
				nextIndex--;
			}else {
				throw new NoSuchElementException("Illegal call to remove();next() was not called.");
			}
		}
	}
}
