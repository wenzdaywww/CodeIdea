/**
 *
 */
package main.java.designpattern.creationtype.abstractfactory;

import main.java.designpattern.creationtype.abstractfactory.interfaces.Factory;
import main.java.designpattern.creationtype.abstractfactory.interfaces.Icebox;
import main.java.designpattern.creationtype.abstractfactory.interfaces.Washer;

/**
 * A型工厂
 * @author www
 *
 */
public class FacetoryA implements Factory {

	@Override
	public Washer createWasher() {
		// TODO Auto-generated method stub
		return new WasherA();
	}

	@Override
	public Icebox createIcebox() {
		// TODO Auto-generated method stub
		return new IceboxA();
	}

}
