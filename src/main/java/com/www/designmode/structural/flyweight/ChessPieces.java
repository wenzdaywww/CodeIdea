package com.www.designmode.structural.flyweight;

/**
 * <p>@Description 1、抽象享元类，围棋棋子类 </p>
 * <p>@Version 1.0 </p>
 * <p>@Author www </p>
 * <p>@Date 2022/3/1 22:20 </p>
 */
public abstract class ChessPieces {
	/**
	 * <p>@Description 获取棋子颜色 </p>
	 * <p>@Author www </p>
	 * <p>@Date 2022/3/1 22:22 </p>
	 * @return java.lang.String
	 */
	public abstract String getColor();
	/**
	 * <p>@Description 显示棋子坐标 </p>
	 * <p>@Author www </p>
	 * <p>@Date 2022/3/1 22:22 </p>
	 * @param coord 棋子坐标
	 * @return void
	 */
	public void display(Coordinate coord){
        System.out.println("棋子颜色：" + this.getColor() + "，棋子位置：" + coord.getx() + "，" + coord.gety() );
    }
}
