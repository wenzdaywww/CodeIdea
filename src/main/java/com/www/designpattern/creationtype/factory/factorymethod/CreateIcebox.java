package com.www.designpattern.creationtype.factory.factorymethod;

import com.www.designpattern.creationtype.factory.factorymethod.interfaces.Factory;
import com.www.designpattern.creationtype.factory.factorymethod.interfaces.Product;

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
