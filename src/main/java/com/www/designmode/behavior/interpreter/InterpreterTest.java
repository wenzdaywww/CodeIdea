/**
 * 解释器模式：
 *
 */
package com.www.designmode.behavior.interpreter;

/**
 * @author www
 *
 */
public class InterpreterTest {

	public static void main(String[] args) {
        // 计算9+2-8的值
        int result = new Minus().interpret((new Context(new Plus()
                .interpret(new Context(9, 2)), 8)));
        System.out.println(result);
	}
}
