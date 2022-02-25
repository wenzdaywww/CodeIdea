package com.www.designmode.structural.facade.module;

/**
 * <p>@Description 1、子系统类，内存 </p>
 * <p>@Version 1.0 </p>
 * <p>@Author www </p>
 * <p>@Date 2022/2/25 22:33 </p>
 */
public class Memory {
	/**
	 * <p>@Description 内存启动 </p>
	 * <p>@Author www </p>
	 * <p>@Date 2022/2/25 22:33 </p>
	 * @return void
	 */
	public void startup(){
		System.out.println("内存启动...");
	}
	/**
	 * <p>@Description 内存关机 </p>
	 * <p>@Author www </p>
	 * <p>@Date 2022/2/25 22:33 </p>
	 * @return void
	 */
	public void shutdown(){
		System.out.println("内存关闭...");
	}
}
