/**
 * 
 */
package designpattern.behaviortype.iterator.interfaces;

/**
 * 迭代器接口
 * @author www
 *
 */
public interface Iterator {
	/**
	 * 前移  
	 * @return
	 */
    public Object previous();  
      
    /**
     * 后移  
     * @return
     */
    public Object next();  
    /**
     * 是否有下一个值
     * @return
     */
    public boolean hasNext();  
      
    /**
     * 取得第一个元素  
     * @return
     */
    public Object first(); 
}
