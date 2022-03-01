package com.www.designmode.structural.flyweight;

import org.junit.Test;

/**
 * <p>@Description 享元模式测试 </p>
 * <p>@Version 1.0 </p>
 * <p>@Author www </p>
 * <p>@Date 2022/3/1 22:15 </p>
 */
public class FlyweightTest {

	/**
	 * <p>@Description 测试 </p>
	 * <p>@Author www </p>
	 * <p>@Date 2022/3/1 22:15 </p>
	 * @return void
	 */
	@Test
	public void test() {
		//获取享元工厂对象
		ChessPiecesFactory factory = ChessPiecesFactory.getInstance();
		//通过享元工厂获取三颗黑子
		ChessPieces black1 = factory.getIgoChessman("black");
		ChessPieces black2 = factory.getIgoChessman("black");
		System.out.println("判断两颗黑子是否相同：" + (black1==black2));
		//通过享元工厂获取两颗白子
		ChessPieces white1 = factory.getIgoChessman("white");
		ChessPieces white2 = factory.getIgoChessman("white");
		System.out.println("判断两颗白子是否相同：" + (white1==white2));
		//显示棋子
		black1.display(new Coordinate(1,2));
        black2.display(new Coordinate(3,4));
        white1.display(new Coordinate(2,5));
        white2.display(new Coordinate(2,4));
	}

}
