/**
 * 对象适配器模式:
 * 当希望将一个对象转换成满足另一个新接口的对象时，可以创建一个Wrapper类，持有原类的一个实例，在Wrapper类的方法中，调用实例的方法就行。
 */
package designpattern.structuraltype.adapter.objectadapter;

import designpattern.structuraltype.adapter.objectadapter.interfaces.Targetable;

/**
 * @author www
 *
 */
public class ObjectAdapterTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Source source=new Source();
		Targetable targetable=new Wrapper(source);
		targetable.method1();
		targetable.method2();
	}

}
