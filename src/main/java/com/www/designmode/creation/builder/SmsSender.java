/**
 *
 */
package com.www.designmode.creation.builder;

import com.www.designmode.creation.builder.interfaces.Sender;

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
