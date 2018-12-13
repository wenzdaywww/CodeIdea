/**
 * 
 */
package designpattern.behaviortype.memento;

/**
 * 备份类
 * @author www
 *
 */
public class Memento {
    private String value;  
    
    public Memento(String value) {  
        this.value = value;  
    }  
  
    public String getValue() {  
        return value;  
    }  
  
    public void setValue(String value) {  
        this.value = value;  
    }  
}
