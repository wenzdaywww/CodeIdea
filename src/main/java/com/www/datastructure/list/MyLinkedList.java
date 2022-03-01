package com.www.datastructure.list;

import java.util.Iterator;
import java.util.NoSuchElementException;

import com.www.datastructure.list.inf.MyList;

/**
 * <p>@Description 链表线性表，位置从1开始 </p>
 * <p>@Version 1.0 </p>
 * <p>@Author www </p>
 * <p>@Date 2022/3/1 22:42 </p>
 */
public class MyLinkedList<T> implements MyList<T>{
	/** 链表第一个元素 */
	private Node<T> firstNode;
	/** 链表最后一个元素 */
	private Node<T> lastNode;
	/** 链表长度 */
	private int length;
	/**
	 * <p>@Description 构造方法 </p>
	 * <p>@Author www </p>
	 * <p>@Date 2022/3/1 22:42 </p>
	 * @return
	 */
	public MyLinkedList(){
		clear();
	}
	/**
	 * <p>@Description 末尾添加元素 </p>
	 * <p>@Author www </p>
	 * <p>@Date 2022/3/1 22:43 </p>
	 * @param entry 元素
	 * @return boolean true添加成功，false添加失败
	 */
	@Override
	public boolean add(T entry) {
		boolean isSuccess=true;
		try {
			Node<T> node=new Node<T>(entry);
			if (isEmpty()) {
				firstNode=node;
			}else {
				lastNode.setNext(node);
			}
			lastNode=node;
			length++;
		} catch (Exception e) {
			isSuccess=false;
			e.printStackTrace();
		}
		return isSuccess;
	}
	/**
	 * <p>@Description 指定位置添加元素 </p>
	 * <p>@Author www </p>
	 * <p>@Date 2022/3/1 22:44 </p>
	 * @param position 位置坐标
	 * @param entry 元素
	 * @return boolean true添加成功，false添加失败
	 */
	@Override
	public boolean add(int position, T entry) {
		boolean isSuccess=true;
		try {
			Node<T> node=new Node<T>(entry);
			if (isEmpty()) {
				if (position==0) {
					firstNode=node;
					lastNode=node;
				}else {
					isSuccess=false;
				}
			}else {
				if (position==0) {
					node.setNext(firstNode);
					firstNode=node;
				}else if (position>0 && position<length) {
					Node<T> beforeNode=getNodeAt(position-1);
					Node<T> afterNode=beforeNode.getNext();
					beforeNode.setNext(node);
					node.setNext(afterNode);
				}else if (position==length) {
					lastNode.setNext(node);
					lastNode=node;
				}else {
					isSuccess=false;
				}
			}
			if (isSuccess) {
				length++;
			}
		} catch (Exception e) {
			isSuccess=false;
			e.printStackTrace();
		}
		return isSuccess;
	}
	/**
	 * <p>@Description 添加到头部 </p>
	 * <p>@Author www </p>
	 * <p>@Date 2022/3/1 22:45 </p>
	 * @param entry 元素
	 * @return boolean true添加成功，false添加失败
	 */
	@Override
	public boolean addFirst(T entry) {
		boolean isSuccess=true;
		try {
			Node<T> node=new Node<T>(entry);
			if (isEmpty()) {
				firstNode=node;
				lastNode=node;
			}else {
				node.setNext(firstNode);
				firstNode=node;
			}
			length++;
		} catch (Exception e) {
			isSuccess=false;
			e.printStackTrace();
		}
		return isSuccess;
	}
	/**
	 * <p>@Description 添加到尾部 </p>
	 * <p>@Author www </p>
	 * <p>@Date 2022/3/1 22:45 </p>
	 * @param entry 元素
	 * @return boolean true添加成功，false添加失败
	 */
	@Override
	public boolean addLast(T entry) {
		boolean isSuccess=true;
		try {
			Node<T> node=new Node<T>(entry);
			if (isEmpty()) {
				firstNode=node;
				lastNode=node;
			}else {
				lastNode.setNext(node);
				lastNode=node;
			}
			length++;
		} catch (Exception e) {
			isSuccess=false;
			e.printStackTrace();
		}
		return isSuccess;
	}
	/**
	 * <p>@Description 删除指定位置元素 </p>
	 * <p>@Author www </p>
	 * <p>@Date 2022/3/1 22:45 </p>
	 * @param position 位置坐标
	 * @return T 删除的元素
	 */
	@Override
	public T remove(int position) {
		T obj=null;
		try {
			if (!isEmpty()) {
				if (position==0) {
					obj=firstNode.getData();
					firstNode=firstNode.getNext();
				}else if (position>0 && position<length) {
					Node<T> beforeNode=getNodeAt(position-1);
					Node<T> deleteNode=beforeNode.getNext();
					Node<T> afterNode=deleteNode.getNext();
					beforeNode.setNext(afterNode);
					obj=deleteNode.getData();
					if (position==length-1) {
						lastNode=beforeNode;
					}
				}
				if (obj!=null) {
					length--;
				}
			}
		} catch (Exception e) {
			obj=null;
			e.printStackTrace();
		}
		return obj;
	}
	/**
	 * <p>@Description 删除头部第一个 </p>
	 * <p>@Author www </p>
	 * <p>@Date 2022/3/1 22:45 </p>
	 * @return T 删除的元素
	 */
	@Override
	public T removeFisrt() {
		T obj=null;
		try {
			if (!isEmpty()) {
				obj=firstNode.getData();
				firstNode=firstNode.getNext();
				length--;
			}
		} catch (Exception e) {
			obj=null;
			e.printStackTrace();
		}
		return obj;
	}
	/**
	 * <p>@Description 删除尾部最后一个 </p>
	 * <p>@Author www </p>
	 * <p>@Date 2022/3/1 22:46 </p>
	 * @return T 删除的元素
	 */
	@Override
	public T removeLast() {
		T obj=null;
		try {
			if (!isEmpty()) {
				Node<T> beforeNode=getNodeAt(length-2);
				beforeNode.setNext(null);
				obj=lastNode.getData();
				lastNode=beforeNode;
				length--;
			}
		} catch (Exception e) {
			obj=null;
			e.printStackTrace();
		}
		return obj;
	}
	/**
	 * <p>@Description 清除所有元素 </p>
	 * <p>@Author www </p>
	 * <p>@Date 2022/3/1 22:46 </p>
	 * @return void
	 */
	@Override
	public void clear() {
		length=0;
		firstNode=null;
		lastNode=null;
	}
	/**
	 * <p>@Description 替换指定位置元素 </p>
	 * <p>@Author www </p>
	 * <p>@Date 2022/3/1 22:46 </p>
	 * @param position 位置坐标
	 * @param entry 替换的元素
	 * @return boolean true替换成功，false替换失败
	 */
	@Override
	public boolean replace(int position, T entry) {
		boolean isSuccess=false;
		try {
			if (!isEmpty()) {
				Node<T> node=new Node<T>(entry);
				if (position==0) {
					node.setNext(firstNode.getNext());
					firstNode=node;
					isSuccess=true;
				}else if (position>0 && position<length-1) {
					Node<T> beforeNode=getNodeAt(position-1);
					Node<T> currentNode=beforeNode.getNext();
					Node<T> afterNode=currentNode.getNext();
					beforeNode.setNext(node);
					node.setNext(afterNode);
					isSuccess=true;
				}else if (position==length-1) {
					Node<T> lastNodeBefore=getNodeAt(length-2);
					lastNodeBefore.setNext(node);
					lastNode=node;
					isSuccess=true;
				}else {
					isSuccess=false;
				}
			}
		} catch (Exception e) {
			isSuccess=false;
			e.printStackTrace();
		}
		return isSuccess;
	}
	/**
	 * <p>@Description 获取指定位置元素 </p>
	 * <p>@Author www </p>
	 * <p>@Date 2022/3/1 22:47 </p>
	 * @param position 位置坐标
	 * @return T 元素
	 */
	@Override
	public T get(int position) {
		T obj=null;
		try {
			if (position>=0 && position<length) {
				Node<T> node=getNodeAt(position);
				obj=node.getData();
			}
		} catch (Exception e) {
			obj=null;
			e.printStackTrace();
		}
		return obj;
	}
	/**
	 * <p>@Description 获取第一个 </p>
	 * <p>@Author www </p>
	 * <p>@Date 2022/3/1 22:47 </p>
	 * @return T 元素
	 */
	@Override
	public T getFisrt() {
		return firstNode.getData();
	}
	/**
	 * <p>@Description 获取最后一个 </p>
	 * <p>@Author www </p>
	 * <p>@Date 2022/3/1 22:47 </p>
	 * @return T 元素
	 */
	@Override
	public T getLast() {
		return lastNode.getData();
	}
	/**
	 * <p>@Description 是否包含某元素 </p>
	 * <p>@Author www </p>
	 * <p>@Date 2022/3/1 22:47 </p>
	 * @param obj 某元素
	 * @return boolean true包含，false不包含
	 */
	@Override
	public boolean contains(Object obj) {
		boolean isContains=false;
		try {
			for (int i = 0; i <length; i++) {
				Node<T> node=getNodeAt(i);
				if (node.getData().equals(obj)) {
					isContains=true;
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isContains;
	}
	/**
	 * <p>@Description 长度大小 </p>
	 * <p>@Author www </p>
	 * <p>@Date 2022/3/1 22:47 </p>
	 * @return int 长度大小
	 */
	@Override
	public int size() {
		return length;
	}
	/**
	 * <p>@Description 是否为空 </p>
	 * <p>@Author www </p>
	 * <p>@Date 2022/3/1 22:48 </p>
	 * @return boolean true为空，false不为空
	 */
	@Override
	public boolean isEmpty() {
		boolean isEmpty=false;
		if (length==0) {
			isEmpty=true;
		}
		return isEmpty;
	}
	/**
	 * <p>@Description 是否已满 </p>
	 * <p>@Author www </p>
	 * <p>@Date 2022/3/1 22:48 </p>
	 * @return boolean true已满
	 */
	@Override
	public boolean isFull() {
		return false;
	}
	/**
	 * <p>@Description 打印显示 </p>
	 * <p>@Author www </p>
	 * <p>@Date 2022/3/1 22:48 </p>
	 * @return void
	 */
	@Override
	public void display() {
		String str="";
		str+="length="+size()+","+"lastNode="+lastNode.getData()+":";
		for (int i = 0; i < length; i++) {
			str+=getNodeAt(i).getData()+",";
		}
		System.out.println(str.substring(0, str.length()-1));
	}
	/**
	 * 获取指定位置链表元素
	 * @param position
	 * @return
	 */
	private Node<T> getNodeAt(int position){
		Node<T> node=null;
		try {
			if (position>=0 && position<length) {
				node=firstNode;
				for (int i = 0; i < position; i++) {
					node=node.getNext();
				}
			}
		} catch (Exception e) {
			node=null;
			e.printStackTrace();
		}
		return node;
	}
	/**
	 * <p>@Description 获取迭代器 </p>
	 * <p>@Author www </p>
	 * <p>@Date 2022/3/1 22:52 </p>
	 * @return java.util.Iterator<T>
	 */
	@Override
	public Iterator<T> iterator(){
		return new LinkedIterator<T>();
	}
	/**
	 * <p>@Description 内部迭代器 </p>
	 * <p>@Version 1.0 </p>
	 * <p>@Author www </p>
	 * <p>@Date 2022/3/1 22:54 </p>
	 */
	private class LinkedIterator<T> implements Iterator<T>{
		/** 下一个节点 */
		private Node<T> nextNode;
		/**
		 * <p>@Description 构造方法 </p>
		 * <p>@Author www </p>
		 * <p>@Date 2022/3/1 22:54 </p>
		 * @return
		 */
		private LinkedIterator(){
			nextNode = (Node<T>) firstNode;
		}
		/**
		 * <p>@Description 是否有下一个 </p>
		 * <p>@Author www </p>
		 * <p>@Date 2022/3/1 22:52 </p>
		 * @return boolean true有，false没有
		 */
		@Override
		public boolean hasNext() {
			return nextNode!=null;
		}
		/**
		 * <p>@Description 获取下一个元素 </p>
		 * <p>@Author www </p>
		 * <p>@Date 2022/3/1 22:53 </p>
		 * @return T 元素
		 */
		@Override
		public T next() {
			if (hasNext()) {
				Node<T> node=nextNode;
				nextNode=node.getNext();
				return node.getData();
			}else {
				throw new NoSuchElementException("Illegal call to next();iterator is after end of list.");
			}
		}
		/**
		 * <p>@Description 删除当前元素 </p>
		 * <p>@Author www </p>
		 * <p>@Date 2022/3/1 22:53 </p>
		 * @return void
		 */
		@Override
		public void remove() {
			throw new UnsupportedOperationException("remove() is not supported by this iterator.");
		}
	}
	/**
	 * <p>@Description 节点类 </p>
	 * <p>@Version 1.0 </p>
	 * <p>@Author www </p>
	 * <p>@Date 2022/3/1 22:55 </p>
	 */
	private class Node<T> {
		/** 链表元素 */
		private T data;
		/** 下一个链表元素 */
		private Node<T> next;
		/**
		 * <p>@Description 构造方法 </p>
		 * <p>@Author www </p>
		 * <p>@Date 2022/3/1 22:55 </p>
		 * @param data 元素
		 */
		public Node(T data){
			this.data=data;
			next=null;
		}
		/**
		 * <p>@Description 构造方法 </p>
		 * <p>@Author www </p>
		 * <p>@Date 2022/3/1 22:56 </p>
		 * @param data 元素
		 * @param nextNode 下一个节点
		 */
		public Node(T data, Node<T> nextNode){
			this.data=data;
			next=nextNode;
		}
		/**
		 * <p>@Description 获取节点数据 </p>
		 * <p>@Author www </p>
		 * <p>@Date 2022/3/1 22:56 </p>
		 * @return T
		 */
		public T getData() {
			return data;
		}
		/**
		 * <p>@Description 设置节点数据 </p>
		 * <p>@Author www </p>
		 * <p>@Date 2022/3/1 22:56 </p>
		 * @param data
		 * @return void
		 */
		public void setData(T data) {
			this.data = data;
		}
		/**
		 * <p>@Description 获取下一个节点 </p>
		 * <p>@Author www </p>
		 * <p>@Date 2022/3/1 22:56 </p>
		 * @return com.www.datastructure.list.MyLinkedList<T>.Node<T>
		 */
		public Node<T> getNext() {
			return next;
		}
		/**
		 * <p>@Description 设置下一个节点 </p>
		 * <p>@Author www </p>
		 * <p>@Date 2022/3/1 22:56 </p>
		 * @param next
		 * @return void
		 */
		public void setNext(Node<T> next) {
			this.next = next;
		}
	}
}
