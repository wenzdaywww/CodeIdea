package com.www.thread.countdownlatch;

import org.junit.Test;

import java.util.concurrent.CountDownLatch;

/**
 * <p>@Description 并发控制，倒计时器 </p>
 * <p>@Version 1.0 </p>
 * <p>@Author www </p>
 * <p>@Date 2022/8/2 20:09 </p>
 */
public class ThreadCountDownLatchTest {
    /**
     * <p>@Description 倒计时器 </p>
     * <p>@Author www </p>
     * <p>@Date 2022/8/2 20:13  </p>
     * @return void
     */
    @Test
    public void test() throws Exception{
        CountDownLatch downLatch = new CountDownLatch(5);
        long start = System.currentTimeMillis();
        for (Integer i = 0; i < 10; i++){
            Integer data1 = i;
            new Thread(() -> {
                try {
                    System.out.println(Thread.currentThread().getName() + "=" + data1);
                    Thread.sleep(2000);
                }catch (Exception e){
                    e.printStackTrace();
                }finally {
                    downLatch.countDown();
                }
            }).start();
        }
        System.out.println(downLatch.getCount());
        downLatch.await();
        System.out.println(downLatch.getCount());
        System.out.println(String.format("耗时:%sms",System.currentTimeMillis()-start));
    }
}
