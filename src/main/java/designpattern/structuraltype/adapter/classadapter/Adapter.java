/**
 *
 */
package main.java.designpattern.structuraltype.adapter.classadapter;

import main.java.designpattern.structuraltype.adapter.classadapter.interfaces.Targetable;

/**
 * 类适配器
 * @author www
 *
 */
public class Adapter extends Source implements Targetable {

	@Override
	public void method2() {
		System.out.println("这是类适配的接口方法");
	}

}
