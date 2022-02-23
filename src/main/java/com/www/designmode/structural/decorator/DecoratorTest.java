/**
 * 修饰模式:
 * 给一个对象增加一些新的功能，而且是动态的，要求装饰对象和被装饰对象实现同一个接口，装饰对象持有被装饰对象的实例.
 */
package com.www.designmode.structural.decorator;

import com.www.designmode.structural.decorator.interfaces.Sourceable;

/**
 * @author www
 *
 */
public class DecoratorTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Sourceable source = new Source();
        Sourceable obj = new Decorator(source);
        obj.method();
	}

}
