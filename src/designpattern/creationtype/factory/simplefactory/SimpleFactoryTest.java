/**
 * 简单工厂模式:
 * 就是建立一个工厂类，对实现了同一接口的一些类进行实例的创建。
 */
package designpattern.creationtype.factory.simplefactory;
/**
 * 
 * @author www
 *
 */
public class SimpleFactoryTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SimpleFactory.produce(0);
		SimpleFactory.produce(1);
		SimpleFactory.produce(2);
		SimpleFactory.produce(3);
	}

}
