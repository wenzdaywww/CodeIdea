package com.www.thread.forkjoin;

import org.junit.Test;

import java.util.concurrent.ForkJoinPool;

/**
 * <p>@Description 任务拆分测试类 </p>
 * <p>@Version 1.0 </p>
 * <p>@Author www </p>
 * <p>@Date 2022/8/3 20:58 </p>
 */
public class ForkJoinTest {
    /**
     * <p>@Description 大任务拆分成小任务（有返回值）测试 </p>
     * <p>@Author www </p>
     * <p>@Date 2022/8/3 21:09 </p>
     * @return void
     */
    @Test
    public void test1() throws Exception{
        int arr[] = new int[1000];
        int total = 0;
        // 初始化1000个数字元素
        for (int i = 0; i < arr.length; i++) {
            // 对数组元素赋值,并将数组元素的值添加到total总和中
            total += (arr[i] = i);
        }
        System.out.println("初始化时的总和=" + total);
        // 创建包含Runtime.getRuntime().availableProcessors()返回值作为个数的并行线程的ForkJoinPool
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        // 提交可分解的PrintTask任务
//        execute：异步执行指定任务，无返回结果；
//        invoke、invokeAll：异步执行指定任务，等待完成才返回结果；
//        submit：异步执行指定任务，并立即返回一个Future对象；
        Integer integer = forkJoinPool.invoke( new RecursiveTaskDemo(arr, 0, arr.length)  );
        System.out.println("计算出来的总和=" + integer);
        // 关闭线程池
        forkJoinPool.shutdown();
    }
}
