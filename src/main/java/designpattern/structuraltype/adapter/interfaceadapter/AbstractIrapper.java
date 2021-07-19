/**
 *
 */
package main.java.designpattern.structuraltype.adapter.interfaceadapter;

import main.java.designpattern.structuraltype.adapter.interfaceadapter.interfaces.Sourceable;

/**
 * 接口适配的抽象类
 * @author www
 *
 */
public abstract class AbstractIrapper implements Sourceable {

	@Override
	public void method1() {}

	@Override
	public void method2() {}

}
