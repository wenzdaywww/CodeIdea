/**
 * 
 */
package designpattern.structuraltype.facade;

/**
 * 磁盘
 * @author www
 *
 */
public class Disk {
	/**
	 * 磁盘启动
	 */
	public void startup(){  
		System.out.println("disk startup!");  
	}  
	/**
	 * 磁盘关机
	 */
	public void shutdown(){  
		System.out.println("disk shutdown!");  
	}
}
