/**
 *
 */
package com.www.designmode.structural.decorator;

import com.www.designmode.structural.decorator.interfaces.Sourceable;

/**
 * 修饰的类
 * @author www
 *
 */
public class Decorator implements Sourceable {

	private Sourceable source;

	public Decorator(Sourceable source2){
		this.source=source2;
	}

	@Override
	public void method() {
		System.out.println("开始修饰前");
		source.method();
		System.out.println("开始修饰后");
	}

}
