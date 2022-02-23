package com.www.designmode.creation.factory.method;

import com.www.designmode.creation.factory.method.interfaces.Factory;
import com.www.designmode.creation.factory.method.interfaces.Product;

/**
 * 空调生产工厂
 * @author www
 *
 */
public class CreateAirCondition implements Factory {

	@Override
	public Product create() {
		return new AirCondition();
	}

}
