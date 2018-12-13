/**
 * 
 */
package designpattern.creationtype.abstractfactory;

import designpattern.creationtype.abstractfactory.interfaces.Factory;
import designpattern.creationtype.abstractfactory.interfaces.Icebox;
import designpattern.creationtype.abstractfactory.interfaces.Washer;

/**
 * B型工厂
 * @author www
 *
 */
public class FacetoryB implements Factory {

	/* (non-Javadoc)
	 * @see creationtype.abstractfactory.interfaces.Factory#createWasher()
	 */
	@Override
	public Washer createWasher() {
		// TODO Auto-generated method stub
		return new WasherB();
	}

	/* (non-Javadoc)
	 * @see creationtype.abstractfactory.interfaces.Factory#createIcebox()
	 */
	@Override
	public Icebox createIcebox() {
		// TODO Auto-generated method stub
		return new IceboxB();
	}

}
