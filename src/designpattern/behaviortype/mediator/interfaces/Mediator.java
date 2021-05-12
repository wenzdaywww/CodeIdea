/**
 * 
 */
package designpattern.behaviortype.mediator.interfaces;

/**
 * 中介接口
 * @author www
 *
 */
public interface Mediator {
	/**
	 * 创建中介 
	 */
	public void createMediator();  
	/**
	 * 全部工作
	 */
    public void workAll(); 
}
