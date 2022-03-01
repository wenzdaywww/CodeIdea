package com.www.designmode.structural.flyweight;

import java.util.HashMap;

/**
 * <p>@Description 享元工厂类，棋子工厂类，使用单例模式进行设计 </p>
 * <p>@Version 1.0 </p>
 * <p>@Author www </p>
 * <p>@Date 2022/3/1 22:24 </p>
 */
public class ChessPiecesFactory {
    /** 实例对象 **/
    private static ChessPiecesFactory instance = new ChessPiecesFactory();
    /** 使用Hashtable来存储享元对象，充当享元池 **/
	private static HashMap chessPiecesMap;
    /**
     * <p>@Description 构造方法 </p>
     * <p>@Author www </p>
     * <p>@Date 2022/3/1 22:26 </p>
     * @return
     */
	private ChessPiecesFactory() {
        chessPiecesMap = new HashMap();
        ChessPieces black = new BlackChessPieces();
        chessPiecesMap.put("black",black);
        ChessPieces white = new WhiteChessPieces();
        chessPiecesMap.put("white",white);
    }

    /**
     * <p>@Description 返回享元工厂类的唯一实例 </p>
     * <p>@Author www </p>
     * <p>@Date 2022/3/1 22:27 </p>
     * @return com.www.designmode.structural.flyweight.IgoChessmanFactory
     */
    public static ChessPiecesFactory getInstance() {
        return instance;
    }

    /**
     * <p>@Description 通过key来获取存储在Hashtable中的享元对象 </p>
     * <p>@Author www </p>
     * <p>@Date 2022/3/1 22:26 </p>
     * @param color 棋子验证
     * @return com.www.designmode.structural.flyweight.ChessPieces
     */
    public static ChessPieces getIgoChessman(String color) {
        return (ChessPieces) chessPiecesMap.get(color);
    }
}
