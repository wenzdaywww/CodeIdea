/**
 *
 */
package com.www.designmode.creation.prototype;

/**
 * 邮箱
 * @author www
 *
 */
public class Mail implements Cloneable {
	/**标题*/
	private String title;
	/**内容*/
	private String context;

	public Mail() {
		System.out.println("邮件创建。。。。");
	}

	@Override
	public Mail clone(){
		Mail mail=null;
		try {
			mail = (Mail) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return mail;
	}
	/**
	 * 发送
	 */
	public void sendMail(){
		System.out.println("title="+title+",context="+context);
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContext() {
		return context;
	}
	public void setContext(String context) {
		this.context = context;
	}
}
