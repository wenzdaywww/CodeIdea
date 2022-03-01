package com.www.designmode.structural.flyweight;

/**
 * <p>@Description 外部状态：坐标 </p>
 * <p>@Version 1.0 </p>
 * <p>@Author www </p>
 * <p>@Date 2022/3/1 22:21 </p>
 */
public class Coordinate {
    /** x坐标 **/
	private int x;
    /** y坐标 **/
    private int y;
    /**
     * <p>@Description 构造方法 </p>
     * <p>@Author www </p>
     * <p>@Date 2022/3/1 22:22 </p>
     * @param x x坐标
     * @param y y坐标
     */
    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getx() {
        return this.x;
    }

    public void setx(int x) {
        this.x = x;
    }

    public int gety() {
        return this.y;
    }

    public void sety(int y) {
        this.y = y;
    }
}
