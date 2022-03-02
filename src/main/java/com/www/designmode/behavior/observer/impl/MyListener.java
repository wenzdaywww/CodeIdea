package com.www.designmode.behavior.observer.impl;

import com.www.designmode.behavior.observer.inf.AbstractListener;

/**
 * <p>@Description 5、被观察抽象类实现类，如监听器 </p>
 * <p>@Version 1.0 </p>
 * <p>@Author www </p>
 * <p>@Date 2022/3/2 21:07 </p>
 */
public class MyListener extends AbstractListener {
	/**
	 * <p>@Description 发布消息 </p>
	 * <p>@Author www </p>
	 * <p>@Date 2022/3/2 20:48 </p>
	 * @param msg 消息
	 * @return void
	 */
	@Override
	public void publishMsg(String msg) {
		System.out.println("广播消息内容：" + msg);
        notifyObservers(msg);
	}

}
