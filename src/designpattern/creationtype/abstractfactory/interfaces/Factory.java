package designpattern.creationtype.abstractfactory.interfaces;
/**
 * 工厂
 * @author www
 *
 */
public interface Factory {
	/**
	 * 创建洗衣机对象
	 * @return
	 */
	public Washer createWasher(); 
	/**
	 * 创建冰箱对象
	 * @return
	 */
    public Icebox createIcebox();  
}
