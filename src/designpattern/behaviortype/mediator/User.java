/**
 * 
 */
package designpattern.behaviortype.mediator;

import designpattern.behaviortype.mediator.interfaces.Mediator;

/**
 * @author www
 *
 */
public abstract class User {
	private Mediator mediator;  

	public Mediator getMediator(){  
		return mediator;  
	}  

	public User(Mediator mediator) {  
		this.mediator = mediator;  
	}  

	public abstract void work(); 
}
