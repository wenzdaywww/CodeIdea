/**
 *
 */
package com.www.designmode.structural.composite;

import java.util.Enumeration;
import java.util.Vector;

/**
 * 树节点
 * @author www
 *
 */
public class TreeNode {
	/**节点名*/
	private String name;
	/** 父节点*/
    private TreeNode parent;
    /** 子节点 */
    private Vector<TreeNode> children = new Vector<TreeNode>();

    public TreeNode(String name){
        this.name = name;
    }
    /**
     * 添加孩子节点
     * @param node
     */
    public void add(TreeNode node){
    	node.setParent(this);
        children.add(node);
    }

    /**
     * 删除孩子节点
     * @param node
     */
    public void remove(TreeNode node){
        children.remove(node);
    }

    /**
     * 取得孩子节点
     * @return
     */
    public Enumeration<TreeNode> getChildren(){
        return children.elements();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TreeNode getParent() {
        return parent;
    }

    public void setParent(TreeNode parent) {
        this.parent = parent;
    }
	public Vector<TreeNode> getChildrens() {
		return children;
	}

}
