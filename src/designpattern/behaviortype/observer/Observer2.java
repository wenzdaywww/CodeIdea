/**
 * 
 */
package designpattern.behaviortype.observer;

import designpattern.behaviortype.observer.interfaces.Observer;

/**
 * 观察者2
 * @author www
 *
 */
public class Observer2 implements Observer {

	@Override
	public void update() {
		System.out.println("observer2 has received!");  
	}

}
