/**
 * 建造者模式:
 * 工厂类模式提供的是创建单个类的模式，而建造者模式则是将各种产品集中起来进行管理，用来创建复合对象，所谓复合对象就是指某个类具有不同的属性。
 */
package designpattern.creationtype.builder;
/**
 * 
 * @author www
 *
 */
public class BuilderTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Builder builder = new Builder();  
        builder.produceMailSender(5); 
        builder.produceSmsSender(3);
	}

}
