package com.www.thread.communication;

import java.util.concurrent.CountDownLatch;

/**
 * <p>@Description 线程间通信: 使用JUC工具类 CountDownLatch </p>
 * <p>@Version 1.0 </p>
 * <p>@Author www </p>
 * <p>@Date 2022/8/7 13:05 </p>
 */
public class CountDownLatchTest {
    /**
     * <p>@Description 测试 </p>
     * <p>@Author www </p>
     * <p>@Date 2022/8/7 13:07 </p>
     * @param args
     * @return void
     */
    public static void main(String[] args) {
        // 定义倒计时器对象
        CountDownLatch count = new CountDownLatch(1);
        // 实现线程A
        Thread threadA = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println("线程A执行，此时i为：" + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (i == 5){
                    count.countDown();//倒计时器减一
                }
            }
        });
        // 实现线程B
        Thread threadB = new Thread(() -> {
            try {
                System.out.println("线程B等待收到通知");
                count.await();//线程阻塞，等待计数器清0
                System.out.println("线程B收到通知，开始执行自己的业务...");
            } catch (InterruptedException e) {
                e.printStackTrace();
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
