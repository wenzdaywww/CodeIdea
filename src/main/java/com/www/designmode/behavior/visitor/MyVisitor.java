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
public class MyVisitor implements Visitor{

	@Override
	public void visit(Subject sub) {
		System.out.println("visit the subject："+sub.getSubject());
	}

}
