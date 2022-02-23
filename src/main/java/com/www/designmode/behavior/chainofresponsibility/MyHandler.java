/**
 *
 */
package com.www.designmode.behavior.chainofresponsibility;

import com.www.designmode.behavior.chainofresponsibility.interfaces.Handler;

/**
 * @author www
 *
 */
public class MyHandler extends AbstractHandler implements Handler {

	private String name;

	public MyHandler(String name) {
		this.name = name;
	}

	@Override
	public void operator() {
		if(getHandler()!=null){
			System.out.println(name+"deal!");
			getHandler().operator();
		}else {
			System.out.println("handler为空");
		}
	}
}
