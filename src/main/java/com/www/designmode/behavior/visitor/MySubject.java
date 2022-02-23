/**
 *
 */
package com.www.designmode.behavior.visitor;

import com.www.designmode.behavior.visitor.interfaces.Subject;
import com.www.designmode.behavior.visitor.interfaces.Visitor;

/**
 * @author www
 *
 */
public class MySubject implements Subject {

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	@Override
	public String getSubject() {
		return "love";
	}

}
