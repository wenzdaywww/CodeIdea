package designpattern.creationtype.factory.factorymethod;

import designpattern.creationtype.factory.factorymethod.interfaces.Factory;
import designpattern.creationtype.factory.factorymethod.interfaces.Product;

/**
 * 洗衣机生产工厂
 * @author www
 *
 */
public class CreateWasher implements Factory {

	@Override
	public Product create() {
		return new Washer();
	}

}
