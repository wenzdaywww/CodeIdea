package designpattern.creationtype.singleton;
/**
 * 懒汉式单例模式
 * @author www
 *
 */
public class LazySingleton {
	
	private static LazySingleton instance=null;
	
	private LazySingleton(){}
	
	public static synchronized LazySingleton getInstance(){
		if (instance==null) {
			instance=new LazySingleton();
		}
		return instance;
	}
}
