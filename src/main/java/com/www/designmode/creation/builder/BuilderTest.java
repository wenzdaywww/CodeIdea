package com.www.designmode.creation.builder;

import com.www.designmode.creation.builder.impl.AlienBuilder;
import com.www.designmode.creation.builder.impl.ManBuilder;
import com.www.designmode.creation.builder.impl.WomanBuilder;
import com.www.designmode.creation.builder.model.Person;
import org.junit.Test;

/**
 * <p>@Description 建造者模式测试 </p>
 * <p>@Version 1.0 </p>
 * <p>@Author www </p>
 * <p>@Date 2022/2/23 20:21 </p>
 */
public class BuilderTest {

	/**
	 * <p>@Description 测试 </p>
	 * <p>@Author www </p>
	 * <p>@Date 2022/2/23 20:22 </p>
	 * @return void
	 */
	@Test
	public void test() {
		//生成一个女娲
		NuwaMadePerson createPerson = new NuwaMadePerson();
		//女娲开始捏一个男人
		Person manPerson = createPerson.createOnePerson(new ManBuilder());
		//打印男人结构
		System.out.println(manPerson.toString());
		//女娲开始捏一个女人
		Person womanPerson = createPerson.createOnePerson(new WomanBuilder());
		//打印女人结构
		System.out.println(womanPerson.toString());
		//由于女娲不会捏外星人，所有外星人自己造外星人
		Person alienPerson = new AlienBuilder().buildPerson();
		//打印外星人结构
		System.out.println(alienPerson.toString());
	}

}
