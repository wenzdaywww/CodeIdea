package main.java.designpattern.creationtype.factory.simplefactory;

import main.java.designpattern.creationtype.factory.simplefactory.interfaces.Product;

/**
 * 冰箱
 * @author www
 *
 */
public class Icebox implements Product {

	public Icebox(){
		System.out.println("冰箱被制造了");
	}
}
