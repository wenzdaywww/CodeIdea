package com.www.designmode.creation.factory.method;

import com.www.designmode.creation.factory.method.interfaces.Factory;
import com.www.designmode.creation.factory.method.interfaces.Product;

/**
 * 冰箱生产工厂
 * @author www
 *
 */
public class CreateIcebox implements Factory {

	@Override
	public Product create() {
		return new Icebox();
	}

}
