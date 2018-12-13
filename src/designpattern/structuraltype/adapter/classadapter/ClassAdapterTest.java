/**
 * 类适配器模式:
 * 当希望将一个类转换成满足另一个新接口的类时，可以使用类的适配器模式，创建一个新类，继承原有的类，实现新的接口即可。
 */
package designpattern.structuraltype.adapter.classadapter;

/**
 * @author www
 *
 */
public class ClassAdapterTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Adapter adapter=new Adapter();
		adapter.method1();
		adapter.method2();
	}

}
