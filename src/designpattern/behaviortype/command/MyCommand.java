/**
 * 
 */
package designpattern.behaviortype.command;

import designpattern.behaviortype.command.interfaces.Command;

/**
 * 命令类
 * @author www
 *
 */
public class MyCommand implements Command {

    private Receiver receiver;  
    
    public MyCommand(Receiver receiver) {  
        this.receiver = receiver;  
    }  
  
    @Override  
    public void exe() { 
    	System.out.println("开始下命令。。。");
        receiver.action();  
    } 

}
