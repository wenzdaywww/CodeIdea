package com.www.designmode.structural.flyweight;


/**
 * <p>@Description 1、具体享元类，黑色棋子类 </p>
 * <p>@Version 1.0 </p>
 * <p>@Author www </p>
 * <p>@Date 2022/3/1 22:24 </p>
 */
public class BlackChessPieces extends ChessPieces {
	/**
	 * <p>@Description 获取棋子颜色 </p>
	 * <p>@Author www </p>
	 * <p>@Date 2022/3/1 22:22 </p>
	 * @return java.lang.String
	 */
	@Override
	public String getColor() {
		return "黑色";
	}
}
