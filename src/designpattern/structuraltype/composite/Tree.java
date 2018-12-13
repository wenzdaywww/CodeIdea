/**
 * 
 */
package designpattern.structuraltype.composite;

/**
 * 树
 * @author www
 *
 */
public class Tree {
	TreeNode root = null;  

	public Tree(String name) {  
		root = new TreeNode(name);  
	}
}
