package com.www.designmode.structural.facade.module;

/**
 * <p>@Description 1、子系统类，如磁盘模块 </p>
 * <p>@Version 1.0 </p>
 * <p>@Author www </p>
 * <p>@Date 2022/2/25 22:31 </p>
 */
public class Disk {
	/**
	 * <p>@Description 磁盘启动 </p>
	 * <p>@Author www </p>
	 * <p>@Date 2022/2/25 22:32 </p>
	 *
	 * @return void
	 */
	public void startup(){
		System.out.println("磁盘启动...");
	}
	/**
	 * <p>@Description 磁盘关机 </p>
	 * <p>@Author www </p>
	 * <p>@Date 2022/2/25 22:33 </p>
	 * @return void
	 */
	public void shutdown(){
		System.out.println("磁盘关闭...");
	}
}
