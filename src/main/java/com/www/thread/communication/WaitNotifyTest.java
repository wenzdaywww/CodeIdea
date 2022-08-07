package com.www.thread.communication;

/**
 * <p>@Description 线程间通信: 使用Object类的wait() 和 notify() 方法 </p>
 * <p>@Version 1.0 </p>
 * <p>@Author www </p>
 * <p>@Date 2022/8/7 13:05 </p>
 */
public class WaitNotifyTest {
    /**
     * <p>@Description 测试 </p>
     * <p>@Author www </p>
     * <p>@Date 2022/8/7 13:07 </p>
     * @param args
     * @return void
     */
    public static void main(String[] args) {
        // 定义一个锁对象
        Object lock = new Object();
        // 实现线程A
        Thread threadA = new Thread(() -> {
            synchronized (lock) {
                for (int i = 1; i <= 10; i++) {
                    System.out.println("线程A执行，此时i为：" + i);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if (i == 5){
                        lock.notify();// 唤醒B线程
                    }
                }
            }
        });
        // 实现线程B
        Thread threadB = new Thread(() -> {
            synchronized (lock) {
                try {
                    System.out.println("线程B等待收到通知");
                    lock.wait();
                    System.out.println("线程B收到通知，开始执行自己的业务...");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
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
