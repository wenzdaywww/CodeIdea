/**
 * 
 */
package designpattern.behaviortype.visitor.interfaces;

/**
 * @author www
 *
 */
public interface Subject {
	public void accept(Visitor visitor);  
	public String getSubject();
}
