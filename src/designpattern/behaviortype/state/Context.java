/**
 * 
 */
package designpattern.behaviortype.state;

/**
 * @author www
 *
 */
public class Context {
	private static final String  ONLINE = "online";
	private static final String  OFFLINE = "offline";
	private State state;  
	  
    public Context(State state) {  
        this.state = state;  
    }  
  
    public State getState() {  
        return state;  
    }  
  
    public void setState(State state) {  
        this.state = state;  
    }  
  
    public void method() {  
        if (ONLINE.equals(state.getValue())) {  
            state.online();  
        } else if (OFFLINE.equals(state.getValue())) {  
            state.offline();  
        }  
    }  
}
