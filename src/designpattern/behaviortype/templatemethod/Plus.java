/**
 * 
 */
package designpattern.behaviortype.templatemethod;

/**
 * 加法
 * @author www
 *
 */
public class Plus extends AbstractCalculator {

	@Override
	public int calculate(int num1, int num2) {
		return num1+num2;
	}

}
