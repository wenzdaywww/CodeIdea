package com.www.designmode.behavior.observer.inf;

/**
 * <p>@Description 1、观察者接口,如事件接口 </p>
 * <p>@Version 1.0 </p>
 * <p>@Author www </p>
 * <p>@Date 2022/3/2 20:47 </p>
 */
public interface Event {
	/**
	 * <p>@Description 接收消息 </p>
	 * <p>@Author www </p>
	 * <p>@Date 2022/3/2 20:59 </p>
	 * @param msg 消息
	 * @return void
	 */
	void receiveMsg(String msg);
}

