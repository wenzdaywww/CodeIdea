/**
 *
 */
package com.www.designmode.behavior.command;

import com.www.designmode.behavior.command.interfaces.Command;

/**
 * 调用(军官类)
 * @author www
 *
 */
public class Invoker {
	private Command command;

	public Invoker(Command command) {
		this.command = command;
	}
	/**
	 * 行动
	 */
	public void action(){
		command.exe();
	}
}
