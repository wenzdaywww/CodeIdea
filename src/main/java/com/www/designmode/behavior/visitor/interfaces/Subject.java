/**
 *
 */
package com.www.designmode.behavior.visitor.interfaces;

/**
 * @author www
 *
 */
public interface Subject {
	/**
	 * accept
	 * @param visitor
	 */
	public void accept(Visitor visitor);
	/**
	 * getSubject
	 * @return
	 */
	public String getSubject();
}
