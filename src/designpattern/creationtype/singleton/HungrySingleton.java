package designpattern.creationtype.singleton;


/**
 * 饿汉式单例模式
 * @author www
 *
 */
public class HungrySingleton {

	private static HungrySingleton instance=new HungrySingleton();
	
	private HungrySingleton(){}
	
	public static HungrySingleton getInstance(){
		return instance;
	}
}
