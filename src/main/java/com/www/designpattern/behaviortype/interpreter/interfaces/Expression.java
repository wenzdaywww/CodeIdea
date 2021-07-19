/**
 *
 */
package com.www.designpattern.behaviortype.interpreter.interfaces;

import com.www.designpattern.behaviortype.interpreter.Context;

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
