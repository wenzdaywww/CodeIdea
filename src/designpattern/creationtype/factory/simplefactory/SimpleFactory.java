package designpattern.creationtype.factory.simplefactory;

import designpattern.creationtype.factory.simplefactory.interfaces.Product;

/**
 * 简单工厂模式
 * @author www
 *
 */
public class SimpleFactory {
	/**
	 * 根据参数创建不同对象实例
	 * @param index
	 * @return
	 */
	public static Product produce(int index){
		Product product=null;
		switch (index) {
		case 0:
			product= new Washer();
			break;
		case 1:
			product=new Icebox();
			break;
		case 2:
			product=new AirCondition();
			break;
		default:
			System.out.println("未找到对应产品");
			break;
		}
		return product;
	}
}
