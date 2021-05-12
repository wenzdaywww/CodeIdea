/**
 * 
 */
package designpattern.structuraltype.bridge;

import designpattern.structuraltype.bridge.interfaces.Sourceable;

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
