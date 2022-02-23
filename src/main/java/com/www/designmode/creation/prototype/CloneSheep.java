package com.www.designmode.creation.prototype;

import java.util.ArrayList;

/**
 * <p>@Description 克隆羊
 * 深拷贝：拷贝前后的对象地址不一致
 * 浅拷贝：拷贝前后的对象地址一致
 * Object类的clone方法只会拷贝对象中的基本的数据类型（8种基本数据类型byte,char,short,int,long,float,double，boolean），
 * 对于数组、容器对象、引用对象等都不会拷贝，这就是浅拷贝。如果要实现深拷贝，必须将原型模式中的数组、容器对象、引用对象等另行拷贝
 * </p>
 * <p>@Version 1.0 </p>
 * <p>@Author www </p>
 * <p>@Date 2022/2/23 21:23 </p>
 */
public class CloneSheep implements Cloneable {
	/** 羊头 */
	private String head;
	/** 羊身 */
	private String body;
	/** 羊腿 */
	private ArrayList<String> foot;
	/**
	 * <p>@Description 构造方法 </p>
	 * <p>@Author www </p>
	 * <p>@Date 2022/2/23 21:27 </p>
	 * @return
	 */
	public CloneSheep() {
		System.out.println("创建克隆羊。。。。");
	}
	/**
	 * <p>@Description 克隆 </p>
	 * <p>@Author www </p>
	 * <p>@Date 2022/2/23 21:40 </p>
	 * @return com.www.designmode.creation.prototype.CloneSheep
	 */
	@Override
	public CloneSheep clone(){
		CloneSheep sheep = null;
		try {
			sheep = (CloneSheep) super.clone();
			//Object类的clone方法只会拷贝对象中的基本的数据类型（8种基本数据类型byte,char,short,int,long,float,double，boolean），
			//对于数组、容器对象、引用对象等都不会拷贝，这就是浅拷贝。如果要实现深拷贝，必须将原型模式中的数组、容器对象、引用对象等另行拷贝
			sheep.head = new String(head);
			sheep.body = new String(body);
			sheep.foot = (ArrayList) foot.clone();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sheep;
	}

	public String getHead() {
		return head;
	}

	public void setHead(String head) {
		this.head = head;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public ArrayList<String> getFoot() {
		return foot;
	}

	public void setFoot(ArrayList<String> foot) {
		this.foot = foot;
	}

	@Override
	public String toString() {
		return "CloneSheep : {" +
				"head='" + head + '\'' +
				", body='" + body + '\'' +
				", foot='" + foot + '\'' +
				'}';
	}
}
