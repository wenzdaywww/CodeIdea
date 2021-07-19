/**
 *
 */
package main.java.designpattern.behaviortype.mediator;

import main.java.designpattern.behaviortype.mediator.interfaces.Mediator;


/**
 * @author www
 *
 */
public class User2 extends AbstractUser {

	public User2(Mediator mediator) {
		super(mediator);
	}

	@Override
	public void work() {
		System.out.println("user2 exe!");
	}

}
