/**
 *
 */
package main.java.designpattern.behaviortype.observer;

/**
 * @author www
 *
 */
public class MySubject extends AbstractSubject{

	@Override
	public void operation() {
		System.out.println("update self!");
        notifyObservers();
	}

}
