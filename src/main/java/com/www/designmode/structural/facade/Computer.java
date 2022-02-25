package com.www.designmode.structural.facade;

import com.www.designmode.structural.facade.module.Cpu;
import com.www.designmode.structural.facade.module.Disk;
import com.www.designmode.structural.facade.module.Memory;

/**
 * <p>@Description 2、门面角色，如电脑 </p>
 * <p>@Version 1.0 </p>
 * <p>@Author www </p>
 * <p>@Date 2022/2/25 22:31 </p>
 */
public class Computer {
    /** CPU子系统 **/
	private Cpu cpu;
    /** 磁盘子系统 **/
    private Memory memory;
    /** 内存子系统 **/
    private Disk disk;
    /**
     * <p>@Description 构造方法 </p>
     * <p>@Author www </p>
     * <p>@Date 2022/2/25 22:34 </p>
     * @return
     */
    public Computer(){
        cpu = new Cpu();
        memory = new Memory();
        disk = new Disk();
    }
    /**
     * <p>@Description 电脑启动 </p>
     * <p>@Author www </p>
     * <p>@Date 2022/2/25 22:34 </p>
     * @return void
     */
    public void startup(){
        System.out.println("电脑开机...");
        cpu.startup();
        memory.startup();
        disk.startup();
        System.out.println("电脑开机完成!");
    }
    /**
     * <p>@Description 电脑关机 </p>
     * <p>@Author www </p>
     * <p>@Date 2022/2/25 22:34 </p>
     * @return void
     */
    public void shutdown(){
        System.out.println("电脑关机...");
        cpu.shutdown();
        memory.shutdown();
        disk.shutdown();
        System.out.println("电脑关机完成!");
    }
}
