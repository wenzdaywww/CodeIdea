/**
 *
 */
package main.java.designpattern.behaviortype.visitor;

import main.java.designpattern.behaviortype.visitor.interfaces.Subject;
import main.java.designpattern.behaviortype.visitor.interfaces.Visitor;

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
