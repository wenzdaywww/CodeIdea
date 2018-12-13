/**
 * 
 */
package designpattern.structuraltype.bridge;

/**
 * @author www
 *
 */
public class MyBridge extends Bridge{
	
	public void method(){  
        getSource().method();  
    }
}
