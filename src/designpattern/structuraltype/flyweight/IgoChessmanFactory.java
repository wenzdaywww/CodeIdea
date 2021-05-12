/**
 * 
 */
package designpattern.structuraltype.flyweight;

import java.util.Hashtable;

/**
 * 围棋棋子工厂类：享元工厂类，使用单例模式进行设计
 * @author www
 *
 */
public class IgoChessmanFactory {
    private static IgoChessmanFactory instance = new IgoChessmanFactory();  
    @SuppressWarnings("rawtypes")
	private static Hashtable ht; //使用Hashtable来存储享元对象，充当享元池  
      
    @SuppressWarnings({ "rawtypes", "unchecked" })
	private IgoChessmanFactory() {  
        ht = new Hashtable();  
        IgoChessman black,white;  
        black = new BlackIgoChessman();  
        ht.put("b",black);  
        white = new WhiteIgoChessman();  
        ht.put("w",white);  
    }  
      
    /**
     * 返回享元工厂类的唯一实例  
     * @return
     */
    public static IgoChessmanFactory getInstance() {  
        return instance;  
    }  
      
    /**
     * 通过key来获取存储在Hashtable中的享元对象  
     * @param color
     * @return
     */
    public static IgoChessman getIgoChessman(String color) {  
        return (IgoChessman)ht.get(color);    
    } 
}
