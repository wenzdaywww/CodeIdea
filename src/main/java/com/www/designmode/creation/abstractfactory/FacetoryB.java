/**
 *
 */
package com.www.designmode.creation.abstractfactory;

import com.www.designmode.creation.abstractfactory.interfaces.Factory;
import com.www.designmode.creation.abstractfactory.interfaces.Icebox;
import com.www.designmode.creation.abstractfactory.interfaces.Washer;

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
