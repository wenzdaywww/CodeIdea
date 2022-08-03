package com.www.thread.communication;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>@Description 线程间通信: 使用 volatile 关键字 </p>
 * <p>@Version 1.0 </p>
 * <p>@Author www </p>
 * <p>@Date 2022/8/3 21:53 </p>
 */
public class VolatileTest {
    // 定义一个共享变量来实现通信，它需要是volatile修饰，否则线程不能及时感知
    static volatile boolean notice = false;
    /**
     * <p>@Description 测试 </p>
     * <p>@Author www </p>
     * <p>@Date 2022/8/3 21:55 </p>
     * @return void
     */
    public static void main(String[] args)  {
        // 实现线程A
        new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println("线程A执行，此时i为：" + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (i == 5){
                    notice = true;
                }
            }
        }).start();
        // 实现线程B
        new Thread(() -> {
            while (true) {
                if (notice) {
                    System.out.println("线程B收到通知，开始执行自己的业务...");
                    break;
                }
            }
        }).start();
        // 实现线程C
        new Thread(() -> {
            while (true) {
                if (notice) {
                    System.out.println("线程C收到通知，开始执行自己的业务...");
                    break;
                }
            }
        }).start();
    }
}
