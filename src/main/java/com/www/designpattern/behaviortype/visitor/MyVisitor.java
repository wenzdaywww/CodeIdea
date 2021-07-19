/**
 *
 */
package com.www.designpattern.behaviortype.visitor;

import com.www.designpattern.behaviortype.visitor.interfaces.Subject;
import com.www.designpattern.behaviortype.visitor.interfaces.Visitor;

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
