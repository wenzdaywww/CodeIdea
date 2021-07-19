package com.www.designpattern.creationtype.factory.factorymethod;

import com.www.designpattern.creationtype.factory.factorymethod.interfaces.Product;

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
