/**
 *
 */
package com.www.designmode.behavior.interpreter;

import com.www.designmode.behavior.interpreter.interfaces.Expression;

/**
 * @author www
 *
 */
public class Plus implements Expression{
    @Override
    public int interpret(Context context) {
        return context.getNum1()+context.getNum2();
    }
}
