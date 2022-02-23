/**
 *
 */
package com.www.designmode.behavior.observer;

import java.util.Enumeration;
import java.util.Vector;

import com.www.designmode.behavior.observer.interfaces.Observer;
import com.www.designmode.behavior.observer.interfaces.Subject;

/**
 * @author www
 *
 */
public abstract class AbstractSubject implements Subject {

	private Vector<Observer> vector = new Vector<Observer>();

	@Override
	public void add(Observer observer) {
		vector.add(observer);
	}

	@Override
	public void del(Observer observer) {
		vector.remove(observer);
	}

	@Override
	public void notifyObservers() {
		Enumeration<Observer> enumo = vector.elements();
		while(enumo.hasMoreElements()){
			enumo.nextElement().update();
		}
	}

}
