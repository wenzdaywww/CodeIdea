package com.www.designmode.creation.prototype;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>@Description 原型模式测试 </p>
 * <p>@Version 1.0 </p>
 * <p>@Author www </p>
 * <p>@Date 2022/2/23 21:25 </p>
 */
public class PrototypeTest {

	/**
	 * <p>@Description 测试 </p>
	 * <p>@Author www </p>
	 * <p>@Date 2022/2/23 21:25 </p>
	 * @return void
	 */
	@Test
	public void test() {
		CloneSheep sheep = new CloneSheep();
		sheep.setHead("羊头");
		sheep.setBody("羊身");
		ArrayList<String> footList = new ArrayList<String>();
		footList.add("羊左前腿");
		footList.add("羊右前腿");
		footList.add("羊左后腿");
		footList.add("羊右后腿");
		sheep.setFoot(footList);
		System.out.println("克隆前羊母体：" + sheep.toString());
		for (int i = 0; i < 5; i++){
			CloneSheep cloneSheep = sheep.clone();
			cloneSheep.setHead("新羊头");
			cloneSheep.getFoot().set(0,"创建新羊左前腿");
			System.out.println(cloneSheep.toString());
			System.out.println("羊头是否是浅拷贝：" + (sheep.getHead() == cloneSheep.getHead())
					+ " 羊身是否是浅拷贝：" + (sheep.getBody() == cloneSheep.getBody())
					+ " 羊腿是否是浅拷贝：" + (sheep.getFoot() == cloneSheep.getFoot()));
		}
		System.out.println("克隆后羊母体：" + sheep.toString());
	}

}
