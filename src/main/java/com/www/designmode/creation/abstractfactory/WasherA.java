/**
 *
 */
package com.www.designmode.creation.abstractfactory;

import com.www.designmode.creation.abstractfactory.interfaces.Washer;

/**
 * A型洗衣机
 * @author www
 *
 */
public class WasherA implements Washer {

	public WasherA(){
		System.out.println("洗衣机-A被制造了");
	}
}
