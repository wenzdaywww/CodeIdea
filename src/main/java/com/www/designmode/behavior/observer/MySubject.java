/**
 *
 */
package com.www.designmode.behavior.observer;

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
