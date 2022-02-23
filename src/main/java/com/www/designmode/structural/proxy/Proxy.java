/**
 *
 */
package com.www.designmode.structural.proxy;

import com.www.designmode.structural.proxy.interfaces.Sourceable;

/**
 * 代理类
 * @author www
 *
 */
public class Proxy implements Sourceable {

	private Source source;
    public Proxy(){
        super();
        this.source = new Source();
    }

	@Override
	public void method() {
		System.out.println("开始代理。。。");
		source.method();
		System.out.println("代理结束。。。");
	}

}
