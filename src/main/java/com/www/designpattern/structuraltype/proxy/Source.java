/**
 *
 */
package com.www.designpattern.structuraltype.proxy;

import com.www.designpattern.structuraltype.proxy.interfaces.Sourceable;


/**
 * 被代理的类
 * @author www
 *
 */
public class Source implements Sourceable {

	@Override
	public void method() {
		System.out.println("这是被代理的类");
	}

}
