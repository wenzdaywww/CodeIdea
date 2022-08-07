package com.www.thread.communication;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.LockSupport;
import java.util.concurrent.locks.ReentrantLock;

/**
 * <p>@Description 线程间通信: 基于LockSupport实现线程间的阻塞和唤醒 </p>
 * <p>@Version 1.0 </p>
 * <p>@Author www </p>
 * <p>@Date 2022/8/7 13:05 </p>
 */
public class LockSupportTest {
    /**
     * <p>@Description 测试 </p>
     * <p>@Author www </p>
     * <p>@Date 2022/8/7 13:07 </p>
     * @param args
     * @return void
     */
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        // 实现线程B
        final Thread threadB = new Thread(() -> {
            System.out.println("线程B等待收到通知");
            if (list.size() != 5) {
                LockSupport.park();//线程等待
            }
            System.out.println("线程B收到通知，开始执行自己的业务...");
        });
        // 实现线程A
        Thread threadA = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                list.add(i);
                System.out.println("线程A向list中添加一个元素，此时list中的元素个数为：" + list.size());
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (list.size() == 5){
                    LockSupport.unpark(threadB);//线程唤醒
                }
            }
        });
        threadA.start();
        threadB.start();
    }

}
