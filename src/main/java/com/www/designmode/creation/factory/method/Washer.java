package com.www.designmode.creation.factory.method;

import com.www.designmode.creation.factory.method.interfaces.Product;

/**
 * 洗衣机
 * @author www
 *
 */
public class Washer implements Product{

	public Washer(){
		System.out.println("洗衣机被制造了");
	}
}
