package main.java.designpattern.creationtype.factory.factorymethod;

import main.java.designpattern.creationtype.factory.factorymethod.interfaces.Factory;
import main.java.designpattern.creationtype.factory.factorymethod.interfaces.Product;

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
