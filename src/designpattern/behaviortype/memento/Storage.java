/**
 * 
 */
package designpattern.behaviortype.memento;

/**
 * 保管类
 * @author www
 *
 */
public class Storage {
	private Memento memento;  
    
    public Storage(Memento memento) {  
        this.memento = memento;  
    }  
    /**
     * 获取备份诶
     * @return
     */
    public Memento getMemento() {  
        return memento;  
    }  
    /**
     * 设置备份类
     * @param memento
     */
    public void setMemento(Memento memento) {  
        this.memento = memento;  
    }
}
