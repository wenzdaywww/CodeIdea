package com.www.designpattern.creationtype.factory.factorymethod;

import com.www.designpattern.creationtype.factory.factorymethod.interfaces.Factory;
import com.www.designpattern.creationtype.factory.factorymethod.interfaces.Product;

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
