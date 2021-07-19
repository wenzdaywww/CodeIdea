package main.java.datastructure.lineartable;
/**
 * 节点类
 * @author wenzday
 *
 */
public class Node<T> {
	/** 链表元素 */
	private T data;
	/** 下一个链表元素 */
	private Node<T> next;

	public Node(T data){
		this.data=data;
		next=null;
	}

	public Node(T data,Node<T> nextNode){
		this.data=data;
		next=nextNode;
	}

	/**
	 * 获取节点数据
	 * @return the data
	 */
	public T getData() {
		return data;
	}

	/**
	 * 设置节点数据
	 * @param data the data to set
	 */
	public void setData(T data) {
		this.data = data;
	}

	/**
	 * 获取下一个节点
	 * @return the next
	 */
	public Node<T> getNext() {
		return next;
	}

	/**
	 * 设置下一个节点
	 * @param next the next to set
	 */
	public void setNext(Node<T> next) {
		this.next = next;
	}

}
