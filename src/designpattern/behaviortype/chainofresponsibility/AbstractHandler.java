/**
 * 
 */
package designpattern.behaviortype.chainofresponsibility;

import designpattern.behaviortype.chainofresponsibility.interfaces.Handler;

/**
 * @author www
 *
 */
public abstract class AbstractHandler {
	private Handler handler;  

	public Handler getHandler() {  
		return handler;  
	}  

	public void setHandler(Handler handler) {  
		this.handler = handler;  
	} 
}
