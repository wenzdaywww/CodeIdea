/**
 *
 */
package com.www.designmode.structural.bridge;

import com.www.designmode.structural.bridge.interfaces.Sourceable;

/**
 * @author www
 *
 */
public class SourceSub1 implements Sourceable {

	@Override
	public void method() {
		System.out.println("这是SourceSub1的method");
	}

}
