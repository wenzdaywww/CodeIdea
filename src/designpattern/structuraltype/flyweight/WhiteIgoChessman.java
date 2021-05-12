/**
 * 
 */
package designpattern.structuraltype.flyweight;


/**
 * 白色棋子类：具体享元类
 * @author www
 *
 */
public class WhiteIgoChessman extends IgoChessman{

	@Override
	public String getColor() {
		return "黑色";
	}


}
