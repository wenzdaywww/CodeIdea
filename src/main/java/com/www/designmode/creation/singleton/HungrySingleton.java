package com.www.designmode.creation.singleton;


/**
 * <p>@Description 饿汉式单例模式 </p>
 * <p>@Version 1.0 </p>
 * <p>@Author www </p>
 * <p>@Date 2022/2/23 18:58 </p>
 */
public class HungrySingleton {
	/** 对象直接创建，不存在线程安全问题 **/
	private static HungrySingleton instance = new HungrySingleton();
	/**
	 * <p>@Description 私有构造方法 </p>
	 * <p>@Author www </p>
	 * <p>@Date 2022/2/23 18:58 </p>
	 */
	private HungrySingleton(){}
	/**
	 * <p>@Description 获取实例对象 </p>
	 * <p>@Author www </p>
	 * <p>@Date 2022/2/23 18:58 </p>
	 * @return com.www.designpattern.creation.singleton.HungrySingleton
	 */
	public static HungrySingleton getInstance(){
		return instance;
	}
}
