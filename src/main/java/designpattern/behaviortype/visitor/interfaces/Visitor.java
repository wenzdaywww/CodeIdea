/**
 *
 */
package main.java.designpattern.behaviortype.visitor.interfaces;

/**
 * 访问接口
 * @author www
 *
 */
public interface Visitor {
	/**
	 * visit
	 * @param sub
	 */
	public void visit(Subject sub);
}
