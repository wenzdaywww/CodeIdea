package com.www.designpattern.creationtype.factory.simplefactory;

import com.www.designpattern.creationtype.factory.simplefactory.interfaces.Product;

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
