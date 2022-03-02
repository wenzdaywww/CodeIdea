package com.www.designmode.behavior.observer.impl;

import com.www.designmode.behavior.observer.inf.Event;

/**
 * <p>@Description 2、观察者实现，如消息事件 </p>
 * <p>@Version 1.0 </p>
 * <p>@Author www </p>
 * <p>@Date 2022/3/2 21:08 </p>
 */
public class MessageEvent implements Event {
	/** 名称 **/
	private String name;
	/**
	 * <p>@Description 构造方法 </p>
	 * <p>@Author www </p>
	 * <p>@Date 2022/3/2 21:09 </p>
	 * @param name 名称
	 * @return
	 */
	public MessageEvent(String name) {
		this.name = name;
	}
	/**
	 * <p>@Description 接收消息 </p>
	 * <p>@Author www </p>
	 * <p>@Date 2022/3/2 20:59 </p>
	 * @param msg 消息
	 * @return void
	 */
	@Override
	public void receiveMsg(String msg) {
		System.out.println(name + "收到的消息：" + msg);
	}
}
