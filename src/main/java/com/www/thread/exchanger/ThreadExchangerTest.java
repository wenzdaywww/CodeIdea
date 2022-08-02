package com.www.thread.exchanger;


import org.junit.Test;

import java.util.concurrent.Exchanger;
import java.util.concurrent.TimeUnit;

/**
 * <p>@Description 线程间数据交换 </p>
 * <p>@Version 1.0 </p>
 * <p>@Author www </p>
 * <p>@Date 2022/8/2 19:34 </p>
 */
public class ThreadExchangerTest {
    /**
     * <p>@Description 线程间数据交换 </p>
     * <p>@Author www </p>
     * <p>@Date 2022/8/2 19:27  </p>
     * @return void
     */
    @Test
    public void exchangerTest(){
        Exchanger<Integer> exchanger = new Exchanger();
        for (Integer i = 0; i < 10; i++){
            Integer data1 = i;
            new Thread(() -> {
                try {
                    Integer obj = data1;
                    System.out.println(Thread.currentThread().getName() + "交换前=" + obj);
                    obj = exchanger.exchange(obj,6, TimeUnit.SECONDS);
                    System.out.println(Thread.currentThread().getName() + "交换后=" + obj);
                }catch (Exception e){
                    e.printStackTrace();
                }
            }).start();
        }
    }
}
