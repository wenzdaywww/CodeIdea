/**
 * 接口试配器模式:
 * 当不希望实现一个接口中所有的方法时，可以创建一个抽象类Irapper，实现所有方法，我们写别的类的时候，继承抽象类即可。
 */
package main.java.designpattern.structuraltype.adapter.interfaceadapter;

import main.java.designpattern.structuraltype.adapter.interfaceadapter.interfaces.Sourceable;

/**
 * @author www
 *
 */
public class InterfaceAdapterTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Sourceable source1 = new SourceSub1();
        Sourceable source2 = new SourceSub2();

        source1.method1();
        source1.method2();
        source2.method1();
        source2.method2();
	}

}
