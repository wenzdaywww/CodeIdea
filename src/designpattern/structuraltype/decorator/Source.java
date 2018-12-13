/**
 * 
 */
package designpattern.structuraltype.decorator;

import designpattern.structuraltype.decorator.interfaces.Sourceable;

/**
 * 被修饰的类
 * @author www
 *
 */
public class Source implements Sourceable {

	@Override
	public void method() {
		System.out.println("这是被修饰的类");
	}

}
