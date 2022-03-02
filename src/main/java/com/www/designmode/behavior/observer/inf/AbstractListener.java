package com.www.designmode.behavior.observer.inf;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>@Description 4、被观察抽象类，如抽象监听器 </p>
 * <p>@Version 1.0 </p>
 * <p>@Author www </p>
 * <p>@Date 2022/3/2 21:02 </p>
 */
public abstract class AbstractListener implements Listener {
	/** 被观察者集合 **/
	private List<Event> list = new ArrayList<Event>();
	/**
	 * <p>@Description 增加观察者 </p>
	 * <p>@Author www </p>
	 * <p>@Date 2022/3/2 20:47 </p>
	 * @param observer 观察者
	 * @return void
	 */
	@Override
	public void add(Event observer) {
		list.add(observer);
	}
	/**
	 * <p>@Description 删除观察者 </p>
	 * <p>@Author www </p>
	 * <p>@Date 2022/3/2 20:47 </p>
	 * @param observer 观察者
	 * @return void
	 */
	@Override
	public void del(Event observer) {
		list.remove(observer);
	}
	/**
	 * <p>@Description 通知所有的观察者 </p>
	 * <p>@Author www </p>
	 * <p>@Date 2022/3/2 20:48 </p>
	 * @param msg 消息
	 * @return void
	 */
	@Override
	public void notifyObservers(String msg) {
		for (Event observer : list){
			observer.receiveMsg(msg);
		}
	}

}
