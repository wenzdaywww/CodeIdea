package com.www.designmode.structural.composite;

import org.junit.Test;

/**
 * <p>@Description 组合模式测试 </p>
 * <p>@Version 1.0 </p>
 * <p>@Author www </p>
 * <p>@Date 2022/2/25 23:23 </p>
 */
public class CompositeTest {

	/**
	 * <p>@Description 测试 </p>
	 * <p>@Author www </p>
	 * <p>@Date 2022/2/25 23:23 </p>
	 * @return void
	 */
	@Test
	public void test() {
		Folder folder = new Folder("组合模式");
		File note1 = new File("笔记1.txt","这是笔记1");
		File note2 = new File("笔记2.txt","这是笔记1");
		folder.add(note1);
		folder.add(note2);
		Folder folder1 = new Folder("未知模式");
		File note3 = new File("笔记1.txt","这是笔记1");
		folder1.add(note3);
		folder.add(folder1);
		folder.print();
	}
}
