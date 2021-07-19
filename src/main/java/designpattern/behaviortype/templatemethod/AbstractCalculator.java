/**
 *
 */
package main.java.designpattern.behaviortype.templatemethod;

/**
 * 抽象计算器
 * @author www
 *
 */
public abstract class AbstractCalculator {

	/**
	 * 主方法，实现对本类其它方法的调用
	 * */
	public final int calculate(String exp,String opt){
		int array[] = split(exp,opt);
		return calculate(array[0],array[1]);
	}

	/**
	 * 被子类重写的方法
	 * @param num1
	 * @param num2
	 * @return
	 */
	abstract public int calculate(int num1,int num2);
	/**
	 * 切割
	 * @param exp
	 * @param opt
	 * @return
	 */
	public int[] split(String exp,String opt){
		String []array = exp.split(opt);
		int arrayInt[] = new int[2];
		arrayInt[0] = Integer.parseInt(array[0]);
		arrayInt[1] = Integer.parseInt(array[1]);
		return arrayInt;
	}
}
