package com.www.designmode.creation.factory.method;

import com.www.designmode.creation.factory.method.interfaces.Factory;
import com.www.designmode.creation.factory.method.interfaces.Product;

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
