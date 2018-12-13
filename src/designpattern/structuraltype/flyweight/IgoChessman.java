/**
 * 
 */
package designpattern.structuraltype.flyweight;

/**
 * 围棋棋子类：抽象享元类 
 * @author www
 *
 */
public abstract class IgoChessman {
	/**
	 * 棋子颜色
	 * @return
	 */
	public abstract String getColor();  
	/**
	 * 显示棋子
	 */
	public void display(Coordinates coord){  
        System.out.println("棋子颜色：" + this.getColor() + "，棋子位置：" + coord.getX() + "，" + coord.getY() );    
    }
}
