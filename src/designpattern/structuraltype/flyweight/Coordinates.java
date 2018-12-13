/**
 * 
 */
package designpattern.structuraltype.flyweight;

/**
 * 外部状态：坐标
 * @author www
 *
 */
public class Coordinates {
	private int x;  
    private int y;  
      
    public Coordinates(int x,int y) {  
        this.x = x;  
        this.y = y;  
    }  
      
    public int getX() {  
        return this.x;  
    }  
      
    public void setX(int x) {  
        this.x = x;  
    }  
      
    public int getY() {  
        return this.y;  
    }  
      
    public void setY(int y) {  
        this.y = y;  
    }  
}
