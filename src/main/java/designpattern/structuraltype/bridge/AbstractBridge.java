/**
 *
 */
package main.java.designpattern.structuraltype.bridge;

import main.java.designpattern.structuraltype.bridge.interfaces.Sourceable;

/**
 * 桥
 * @author www
 *
 */
public abstract class AbstractBridge {
	private Sourceable source;
	/**
	 * 桥类的方法
	 */
	public void method(){
		source.method();
	}

	public Sourceable getSource() {
		return source;
	}

	public void setSource(Sourceable source) {
		this.source = source;
	}
}
