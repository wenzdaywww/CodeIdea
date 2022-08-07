package com.www.thread.communication;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * <p>@Description 线程间通信: 使用 ReentrantLock 结合 Condition </p>
 * <p>@Version 1.0 </p>
 * <p>@Author www </p>
 * <p>@Date 2022/8/7 13:05 </p>
 */
public class ReentrantLockTest {
    /**
     * <p>@Description 测试 </p>
     * <p>@Author www </p>
     * <p>@Date 2022/8/7 13:07 </p>
     * @param args
     * @return void
     */
    public static void main(String[] args) {
        // 定义锁对象
        ReentrantLock lock = new ReentrantLock();
        Condition condition = lock.newCondition();
        // 实现线程A
        Thread threadA = new Thread(() -> {
            lock.lock();
            for (int i = 1; i <= 10; i++) {
                System.out.println("线程A执行，此时i为：" + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (i == 5){
                    condition.signal();//唤醒阻塞的线程
                }
            }
            lock.unlock();
        });
        // 实现线程B
        Thread threadB = new Thread(() -> {
            lock.lock();
            try {
                System.out.println("线程B等待收到通知");
                condition.await();//把当前线程阻塞挂起
                System.out.println("线程B收到通知，开始执行自己的业务...");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            lock.unlock();
        });
        //　需要先启动线程B
        threadB.start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 再启动线程A
        threadA.start();
    }

}
