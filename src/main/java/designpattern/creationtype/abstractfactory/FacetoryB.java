/**
 *
 */
package main.java.designpattern.creationtype.abstractfactory;

import main.java.designpattern.creationtype.abstractfactory.interfaces.Factory;
import main.java.designpattern.creationtype.abstractfactory.interfaces.Icebox;
import main.java.designpattern.creationtype.abstractfactory.interfaces.Washer;

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
