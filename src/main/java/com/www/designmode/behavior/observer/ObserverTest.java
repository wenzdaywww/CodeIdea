package com.www.designmode.behavior.observer;

import com.www.designmode.behavior.observer.impl.MessageEvent;
import com.www.designmode.behavior.observer.impl.MyListener;
import com.www.designmode.behavior.observer.inf.Listener;
import org.junit.Test;

/**
 * <p>@Description 观察者模式测试 </p>
 * <p>@Version 1.0 </p>
 * <p>@Author www </p>
 * <p>@Date 2022/3/2 21:15 </p>
 */
public class ObserverTest {
	/**
	 * <p>@Description 测试 </p>
	 * <p>@Author www </p>
	 * <p>@Date 2022/3/2 21:15 </p>
	 * @return void
	 */
	@Test
	public void test() {
		Listener sub = new MyListener();
        sub.add(new MessageEvent("消息接收器1"));
        sub.add(new MessageEvent("消息接收器2"));
        sub.add(new MessageEvent("消息接收器3"));
        sub.publishMsg("全体注意");
	}

}
