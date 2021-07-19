/**
 *
 */
package main.java.designpattern.structuraltype.facade;

/**
 * 电脑
 * @author www
 *
 */
public class Computer {
	private Cpu cpu;
    private Memory memory;
    private Disk disk;

    public Computer(){
        cpu = new Cpu();
        memory = new Memory();
        disk = new Disk();
    }
    /**
     * 电脑启动
     */
    public void startup(){
        System.out.println("start the computer!");
        cpu.startup();
        memory.startup();
        disk.startup();
        System.out.println("start computer finished!");
    }
    /**
     * 电脑关机
     */
    public void shutdown(){
        System.out.println("begin to close the computer!");
        cpu.shutdown();
        memory.shutdown();
        disk.shutdown();
        System.out.println("computer closed!");
    }
}
