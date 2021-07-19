/**
 *
 */
package com.www.designpattern.creationtype.abstractfactory;

import com.www.designpattern.creationtype.abstractfactory.interfaces.Factory;
import com.www.designpattern.creationtype.abstractfactory.interfaces.Icebox;
import com.www.designpattern.creationtype.abstractfactory.interfaces.Washer;

/**
 * B型工厂
 * @author www
 *
 */
public class FacetoryB implements Factory {

	@Override
	public Washer createWasher() {
		return new WasherB();
	}

	@Override
	public Icebox createIcebox() {
		return new IceboxB();
	}

}
