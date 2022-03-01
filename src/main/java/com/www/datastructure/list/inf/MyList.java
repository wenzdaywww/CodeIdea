package com.www.datastructure.list.inf;

/**
 * <p>@Description 线性表接口 </p>
 * <p>@Version 1.0 </p>
 * <p>@Author www </p>
 * <p>@Date 2022/3/1 22:43 </p>
 */
public interface MyList<T> extends Iterable<T>{
	/**
	 * <p>@Description 末尾添加元素 </p>
	 * <p>@Author www </p>
	 * <p>@Date 2022/3/1 22:43 </p>
	 * @param entry 元素
	 * @return boolean true添加成功，false添加失败
	 */
	boolean add(T entry);
	/**
	 * <p>@Description 指定位置添加元素 </p>
	 * <p>@Author www </p>
	 * <p>@Date 2022/3/1 22:44 </p>
	 * @param position 位置坐标
	 * @param entry 元素
	 * @return boolean true添加成功，false添加失败
	 */
	boolean add(int position,T entry);
	/**
	 * <p>@Description 添加到头部 </p>
	 * <p>@Author www </p>
	 * <p>@Date 2022/3/1 22:45 </p>
	 * @param entry 元素
	 * @return boolean true添加成功，false添加失败
	 */
	boolean addFirst(T entry);
	/**
	 * <p>@Description 添加到尾部 </p>
	 * <p>@Author www </p>
	 * <p>@Date 2022/3/1 22:45 </p>
	 * @param entry 元素
	 * @return boolean true添加成功，false添加失败
	 */
	boolean addLast(T entry);
	/**
	 * <p>@Description 删除指定位置元素 </p>
	 * <p>@Author www </p>
	 * <p>@Date 2022/3/1 22:45 </p>
	 * @param position 位置坐标
	 * @return T 删除的元素
	 */
	T remove(int position);
	/**
	 * <p>@Description 删除头部第一个 </p>
	 * <p>@Author www </p>
	 * <p>@Date 2022/3/1 22:45 </p>
	 * @return T 删除的元素
	 */
	T removeFisrt();
	/**
	 * <p>@Description 删除尾部最后一个 </p>
	 * <p>@Author www </p>
	 * <p>@Date 2022/3/1 22:46 </p>
	 * @return T 删除的元素
	 */
	T removeLast();
	/**
	 * <p>@Description 清除所有元素 </p>
	 * <p>@Author www </p>
	 * <p>@Date 2022/3/1 22:46 </p>
	 * @return void
	 */
	void clear();
	/**
	 * <p>@Description 替换指定位置元素 </p>
	 * <p>@Author www </p>
	 * <p>@Date 2022/3/1 22:46 </p>
	 * @param position 位置坐标
	 * @param entry 替换的元素
	 * @return boolean true替换成功，false替换失败
	 */
	boolean replace(int position,T entry);
	/**
	 * <p>@Description 获取指定位置元素 </p>
	 * <p>@Author www </p>
	 * <p>@Date 2022/3/1 22:47 </p>
	 * @param position 位置坐标
	 * @return T 元素
	 */
	T get(int position);
	/**
	 * <p>@Description 获取第一个 </p>
	 * <p>@Author www </p>
	 * <p>@Date 2022/3/1 22:47 </p>
	 * @return T 元素
	 */
	T getFisrt();
	/**
	 * <p>@Description 获取最后一个 </p>
	 * <p>@Author www </p>
	 * <p>@Date 2022/3/1 22:47 </p>
	 * @return T 元素
	 */
	T getLast();
	/**
	 * <p>@Description 是否包含某元素 </p>
	 * <p>@Author www </p>
	 * <p>@Date 2022/3/1 22:47 </p>
	 * @param obj 某元素
	 * @return boolean true包含，false不包含
	 */
	boolean contains(Object obj);
	/**
	 * <p>@Description 长度大小 </p>
	 * <p>@Author www </p>
	 * <p>@Date 2022/3/1 22:47 </p>
	 * @return int 长度大小
	 */
	int size();
	/**
	 * <p>@Description 是否为空 </p>
	 * <p>@Author www </p>
	 * <p>@Date 2022/3/1 22:48 </p>
	 * @return boolean true为空，false不为空
	 */
	boolean isEmpty();
	/**
	 * <p>@Description 是否已满 </p>
	 * <p>@Author www </p>
	 * <p>@Date 2022/3/1 22:48 </p>
	 * @return boolean true已满
	 */
	boolean isFull();
	/**
	 * <p>@Description 打印显示 </p>
	 * <p>@Author www </p>
	 * <p>@Date 2022/3/1 22:48 </p>
	 * @return void
	 */
	void display();
}
