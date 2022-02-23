package com.www.designmode.creation.singleton;
/**
 * <p>@Description 懒汉式单例模式 </p>
 * <p>@Version 1.0 </p>
 * <p>@Author www </p>
 * <p>@Date 2022/2/23 18:59 </p>
 */
public class LazySingleton {
	/** 实例对象，使用volatile解决乱序执行问题 **/
	private static volatile LazySingleton instance = null;
	/**
	 * <p>@Description 私有构造方法 </p>
	 * <p>@Author www </p>
	 * <p>@Date 2022/2/23 19:01 </p>
	 */
	private LazySingleton(){}
	/**
	 * <p>@Description 类锁同步获取实例方法，性能低 </p>
	 * <p>@Author www </p>
	 * <p>@Date 2022/2/23 19:01 </p>
	 * @return com.www.designpattern.creation.singleton.LazySingleton
	 */
	public static synchronized LazySingleton getInstance(){
		if (instance == null) {
			instance = new LazySingleton();
		}
		return instance;
	}
	/**
	 * <p>@Description 双重检查锁获取实例方法，由于虚拟机的乱序执行问题，多线程时该方法存在异常，
	 * 所以JDK1.5后，instance属性需要添加volatile关键字可解决乱序执行问题 </p>
	 * <p>@Author www </p>
	 * <p>@Date 2022/2/23 19:03 </p>
	 * @return com.www.designpattern.creation.singleton.LazySingleton
	 */
	public static LazySingleton getInstance1(){
		if(instance == null){
			synchronized (LazySingleton.class){
				instance = new LazySingleton();
			}
		}
		return instance;
	}
	/**
	 * <p>@Description 内部静态类，不存在多线程问题 </p>
	 * <p>@Version 1.0 </p>
	 * <p>@Author www </p>
	 * <p>@Date 2022/2/23 19:07 </p>
	 */
	private static class lazyHolder {
		private static LazySingleton lazyInstance = new LazySingleton();
	}
	/**
	 * <p>@Description 通过内部静态类获取实例对象 </p>
	 * <p>@Author www </p>
	 * <p>@Date 2022/2/23 19:08 </p>
	 * @return com.www.designpattern.creation.singleton.LazySingleton
	 */
	public static LazySingleton getInstance2(){
		return lazyHolder.lazyInstance;
	}
}
