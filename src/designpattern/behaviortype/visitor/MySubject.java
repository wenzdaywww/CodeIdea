/**
 * 
 */
package designpattern.behaviortype.visitor;

import designpattern.behaviortype.visitor.interfaces.Subject;
import designpattern.behaviortype.visitor.interfaces.Visitor;

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
