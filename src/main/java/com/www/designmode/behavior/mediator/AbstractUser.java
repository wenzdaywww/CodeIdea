/**
 *
 */
package com.www.designmode.behavior.mediator;

import com.www.designmode.behavior.mediator.interfaces.Mediator;

/**
 * @author www
 *
 */
public abstract class AbstractUser {
	private Mediator mediator;

	public Mediator getMediator(){
		return mediator;
	}

	public AbstractUser(Mediator mediator) {
		this.mediator = mediator;
	}
	/**
	 * work
	 */
	public abstract void work();
}
