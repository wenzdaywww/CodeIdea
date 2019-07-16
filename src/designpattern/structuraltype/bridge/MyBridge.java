/**
 * 
 */
package designpattern.structuraltype.bridge;

/**
 * @author www
 *
 */
public class MyBridge extends AbstractBridge{
	@Override
	public void method(){  
        getSource().method();  
    }
}
