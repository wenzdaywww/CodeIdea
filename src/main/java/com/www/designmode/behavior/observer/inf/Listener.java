package com.www.designmode.behavior.observer.inf;

/**
 * <p>@Description 3、被观察者接口，如监听器接口 </p>
 * <p>@Version 1.0 </p>
 * <p>@Author www </p>
 * <p>@Date 2022/3/2 20:47 </p>
 */
public interface Listener {
	/**
	 * <p>@Description 增加观察者 </p>
	 * <p>@Author www </p>
	 * <p>@Date 2022/3/2 20:47 </p>
	 * @param observer 观察者
	 * @return void
	 */
	void add(Event observer);
	/**
	 * <p>@Description 删除观察者 </p>
	 * <p>@Author www </p>
	 * <p>@Date 2022/3/2 20:47 </p>
	 * @param observer 观察者
	 * @return void
	 */
	void del(Event observer);
	/**
	 * <p>@Description 通知所有的观察者 </p>
	 * <p>@Author www </p>
	 * <p>@Date 2022/3/2 20:48 </p>
	 * @param msg 消息
	 * @return void
	 */
	void notifyObservers(String msg);
	/**
	 * <p>@Description 发布消息 </p>
	 * <p>@Author www </p>
	 * <p>@Date 2022/3/2 20:48 </p>
	 * @param msg 消息
	 * @return void
	 */
	void publishMsg(String msg);
}
