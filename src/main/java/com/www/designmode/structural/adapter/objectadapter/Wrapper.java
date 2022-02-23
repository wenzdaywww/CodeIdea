/**
 * 对象适配器模式
 */
package com.www.designmode.structural.adapter.objectadapter;

import com.www.designmode.structural.adapter.objectadapter.interfaces.Targetable;


/**
 * 对象适配器
 * @author www
 *
 */
public class Wrapper implements Targetable {
	private Source source;

	public Wrapper(Source source){
		super();
		this.source = source;
	}
	@Override
	public void method1() {
		source.method1();
	}

	@Override
	public void method2() {
		System.out.println("这是对象适配的类方法");
	}

}
