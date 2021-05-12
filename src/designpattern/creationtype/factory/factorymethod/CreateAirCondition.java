package designpattern.creationtype.factory.factorymethod;

import designpattern.creationtype.factory.factorymethod.interfaces.Factory;
import designpattern.creationtype.factory.factorymethod.interfaces.Product;

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
