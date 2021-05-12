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
