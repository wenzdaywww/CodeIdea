/**
 *
 */
package com.www.designpattern.creationtype.abstractfactory;

import com.www.designpattern.creationtype.abstractfactory.interfaces.Icebox;

/**
 * A型冰箱
 * @author www
 *
 */
public class IceboxA implements Icebox {

	public IceboxA(){
		System.out.println("冰箱-A被制造了");
	}
}