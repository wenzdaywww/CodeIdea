/**
 * 组合模式：
 * 组合模式有时又叫部分-整体模式在处理类似树形结构的问题时比较方便
 * 将多个对象组合在一起进行操作，常用于表示树形结构中，例如二叉树，数等。
 */
package designpattern.structuraltype.composite;

/**
 * @author www
 *
 */
public class CompositeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Tree tree = new Tree("A");  
		TreeNode nodeB = new TreeNode("B");  
		TreeNode nodeC = new TreeNode("C");  
		nodeB.add(nodeC);  
		tree.root.add(nodeB);  
		System.out.println("C节点的父节点="+nodeC.getParent().getName());
		System.out.println("B节点的父节点="+nodeB.getParent().getName());
		System.out.println("根节点的子节点数"+tree.root.getChildrens().size());
		System.out.println("B节点的子节点数"+nodeB.getChildrens().size());
		System.out.println("C节点的子节点数"+nodeC.getChildrens().size());
	}

}
