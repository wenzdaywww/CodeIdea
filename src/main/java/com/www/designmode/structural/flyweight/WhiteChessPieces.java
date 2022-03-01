package com.www.designmode.structural.flyweight;


/**
 * <p>@Description  1、具体享元类，白色棋子类 </p>
 * <p>@Version 1.0 </p>
 * <p>@Author www </p>
 * <p>@Date 2022/3/1 22:23 </p>
 */
public class WhiteChessPieces extends ChessPieces {

	/**
	 * <p>@Description 获取棋子颜色 </p>
	 * <p>@Author www </p>
	 * <p>@Date 2022/3/1 22:22 </p>
	 * @return java.lang.String
	 */
	@Override
	public String getColor() {
		return "白色";
	}
}
