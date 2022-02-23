package com.www.designmode.creation.factory.method;

import com.www.designmode.creation.factory.method.interfaces.Product;

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
