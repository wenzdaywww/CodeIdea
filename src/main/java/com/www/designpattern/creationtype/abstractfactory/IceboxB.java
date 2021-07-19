/**
 *
 */
package com.www.designpattern.creationtype.abstractfactory;

import com.www.designpattern.creationtype.abstractfactory.interfaces.Icebox;

/**
 * B型洗衣机
 * @author www
 *
 */
public class IceboxB implements Icebox {

	public IceboxB(){
		System.out.println("冰箱-B被制造了");
	}
}