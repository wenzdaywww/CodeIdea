package com.www.thread.forkjoin;

import java.util.concurrent.RecursiveTask;

/**
 * <p>@Description 大任务拆分成小任务（有返回值） </p>
 * <p>@Version 1.0 </p>
 * <p>@Author www </p>
 * <p>@Date 2022/8/2 20:23 </p>
 */
public class RecursiveTaskDemo extends RecursiveTask<Integer> {
    /** 每个"小任务"最多只打印100个数 */
    private static final int MAX = 100;
    private int arr[];
    private int start;
    private int end;
    /**
     * <p>@Description 构造方法 </p>
     * <p>@Author www </p>
     * <p>@Date 2022/8/3 21:06 </p>
     * @param arr
     * @param start
     * @param end
     * @return
     */
    public RecursiveTaskDemo(int[] arr, int start, int end) {
        this.arr = arr;
        this.start = start;
        this.end = end;
    }
    /**
     * <p>@Description 任务处理 </p>
     * <p>@Author www </p>
     * <p>@Date 2022/8/3 20:57 </p>
     * @return java.lang.Integer
     */
    @Override
    protected Integer compute() {
        int sum = 0;
        // 当end-start的值小于MAX时候，开始打印
        if((end - start) < MAX) {
            for (int i = start; i < end; i++) {
                sum += arr[i];
            }
            System.out.println("任务处理: " + Thread.currentThread().getName() + " 求和=" + sum);
            try {
                Thread.sleep(3000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return sum;
        }else {
            // 将大任务分解成两个小任务
            int middle = (start + end) / 2;
            RecursiveTaskDemo left = new RecursiveTaskDemo(arr, start, middle);
            RecursiveTaskDemo right = new RecursiveTaskDemo(arr, middle, end);
            System.out.println("任务分解: " + Thread.currentThread().getName() + " 分解任务数=" + middle);
            // 并行执行两个小任务
            left.fork();
            right.fork();
            // 把两个小任务累加的结果合并起来
            return left.join() + right.join();
        }
    }
}
