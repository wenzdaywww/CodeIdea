package com.www.designpattern.creationtype.factory.factorymethod;

import com.www.designpattern.creationtype.factory.factorymethod.interfaces.Product;

/**
 * 空调
 * @author www
 *
 */
public class AirCondition implements Product {

	public AirCondition(){
		System.out.println("空调被制造了");
	}
}
