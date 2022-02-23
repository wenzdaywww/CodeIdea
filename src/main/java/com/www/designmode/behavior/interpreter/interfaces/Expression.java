/**
 *
 */
package com.www.designmode.behavior.interpreter.interfaces;

import com.www.designmode.behavior.interpreter.Context;

/**
 * @author www
 *
 */
public interface Expression {
	/**
	 * 解释
	 * @param context
	 * @return
	 */
	public int interpret(Context context);
}
