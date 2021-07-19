/**
 * 原型模式:
 * 通过克隆原型，减少对象的创建,该模式的思想就是将一个对象作为原型，对其进行复制、克隆，产生一个和原对象类似的新对象。
 */
package main.java.designpattern.creationtype.prototype;
/**
 *
 * @author www
 *
 */
public class PrototypeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Mail mail=new Mail();
		mail.setTitle("标题");
		mail.setContext("内容");
		mail.sendMail();
		for (int i = 0; i < 5; i++) {
			Mail cloneMail=mail.clone();
			cloneMail.setTitle(cloneMail.getTitle()+Integer.toString(i));
			cloneMail.sendMail();
		}
	}

}
