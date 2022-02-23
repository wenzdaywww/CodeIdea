package com.www.designmode.creation.factory.method;

import com.www.designmode.creation.factory.method.interfaces.Product;

/**
 * 冰箱
 * @author www
 *
 */
public class Icebox implements Product {

	public Icebox(){
		System.out.println("冰箱被制造了");
	}
}
