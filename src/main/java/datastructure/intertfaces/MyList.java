package main.java.datastructure.intertfaces;

/**
 * 线性表接口
 * @author wenzday
 *
 */
public interface MyList<T> extends Iterable<T>{
	/**
	 * 末尾添加元素
	 * @param entry
	 * @return
	 */
	public boolean add(T entry);
	/**
	 * 指定位置添加元素
	 * @param position
	 * @param entry
	 * @return
	 */
	public boolean add(int position,T entry);
	/**
	 * 添加到第一个
	 * @param entry
	 * @return
	 */
	public boolean addFirst(T entry);
	/**
	 * 添加到最后一个
	 * @param entry
	 * @return
	 */
	public boolean addLast(T entry);
	/**
	 * 删除指定位置元素
	 * @param position
	 * @return
	 */
	public T remove(int position);
	/**
	 * 删除第一个
	 * @return
	 */
	public T removeFisrt();
	/**
	 * 删除最后一个
	 * @return
	 */
	public T removeLast();
	/**
	 * 清除所有元素
	 */
	public void clear();
	/**
	 * 替换指定位置元素
	 * @param position
	 * @param entry
	 * @return
	 */
	public boolean replace(int position,T entry);
	/**
	 * 获取指定位置元素
	 * @param position
	 * @return
	 */
	public T get(int position);
	/**
	 * 获取第一个
	 * @return
	 */
	public T getFisrt();
	/**
	 * 获取最后一个
	 * @return
	 */
	public T getLast();
	/**
	 * 是否包含某元素
	 * @param obj
	 * @return
	 */
	public boolean contains(Object obj);
	/**
	 * 长度大小
	 * @return
	 */
	public int size();
	/**
	 * 是否为空
	 * @return
	 */
	public boolean isEmpty();
	/**
	 * 是否已满
	 * @return
	 */
	public boolean isFull();
	/**
	 * 打印显示
	 */
	public void display();
}
