/**
 * 
 */
package designpattern.structuraltype.adapter.interfaceadapter;

import designpattern.structuraltype.adapter.interfaceadapter.interfaces.Sourceable;

/**
 * 接口适配的抽象类
 * @author www
 *
 */
public abstract class Irapper implements Sourceable {

	@Override
	public void method1() {}

	@Override
	public void method2() {}

}
