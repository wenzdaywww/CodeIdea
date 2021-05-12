/**
 * 
 */
package designpattern.creationtype.abstractfactory;

import designpattern.creationtype.abstractfactory.interfaces.Washer;

/**
 * B型洗衣机
 * @author www
 *
 */
public class WasherB implements Washer {

	public WasherB(){
		System.out.println("洗衣机-B被制造了");
	}
}
