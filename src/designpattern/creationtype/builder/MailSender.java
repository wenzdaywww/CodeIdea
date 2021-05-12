/**
 * 
 */
package designpattern.creationtype.builder;

import designpattern.creationtype.builder.interfaces.Sender;

/**
 * 邮箱
 * @author www
 *
 */
public class MailSender implements Sender{
	
	public MailSender(){
		System.out.println("邮箱创建。。。。");
	}

	@Override
	public void send() {
		System.out.println("邮箱发送。。。。");
	}

}
