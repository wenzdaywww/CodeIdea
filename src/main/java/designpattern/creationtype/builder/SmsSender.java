/**
 *
 */
package main.java.designpattern.creationtype.builder;

import main.java.designpattern.creationtype.builder.interfaces.Sender;

/**
 * sms
 * @author www
 *
 */
public class SmsSender implements Sender {

	public SmsSender(){
		System.out.println("SMS创建。。。。");
	}

	@Override
	public void send() {
		System.out.println("SMS发送。。。。");
	}

}
