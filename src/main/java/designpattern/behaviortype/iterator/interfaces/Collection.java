/**
 *
 */
package main.java.designpattern.behaviortype.iterator.interfaces;

/**
 * 集合
 * @author www
 *
 */
public interface Collection {
	/**
	 * 迭代器
	 * @return
	 */
	public Iterator iterator();

	/**
	 * 取得集合元素
	 * @param i
	 * @return
	 */
	public Object get(int i);

	/**
	 * 取得集合大小
	 * @return
	 */
	public int size();
}
