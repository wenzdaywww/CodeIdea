package main.java.datastructure.lineartable;

import java.util.Iterator;
import java.util.NoSuchElementException;

import main.java.datastructure.intertfaces.MyList;

/**
 * 链表线性表，位置从1开始
 * @author wenzday
 *
 */
public class MyLinkedList<T> implements MyList<T>{
	/** 链表第一个元素 */
	private Node<T> firstNode;
	/** 链表最后一个元素 */
	private Node<T> lastNode;
	/** 链表长度 */
	private int length;

	public MyLinkedList(){
		clear();
	}
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

	@Override
	public void clear() {
		length=0;
		firstNode=null;
		lastNode=null;
	}

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

	@Override
	public T getFisrt() {
		return firstNode.getData();
	}

	@Override
	public T getLast() {
		return lastNode.getData();
	}

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

	@Override
	public int size() {
		return length;
	}

	@Override
	public boolean isEmpty() {
		boolean isEmpty=false;
		if (length==0) {
			isEmpty=true;
		}
		return isEmpty;
	}

	@Override
	public boolean isFull() {
		return false;
	}

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

	@Override
	public Iterator<T> iterator(){
		return new LinkedIterator<T>();
	}
	/**
	 * 内部迭代器
	 * @author wenzday
	 * @param <T>
	 */
	@SuppressWarnings("hiding")
	private class LinkedIterator<T> implements Iterator<T>{
		/** 下一个节点 */
		private Node<T> nextNode;

		@SuppressWarnings("unchecked")
		private LinkedIterator(){
			nextNode=(Node<T>) firstNode;
		}
		@Override
		public boolean hasNext() {
			return nextNode!=null;
		}

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

		@Override
		public void remove() {
			throw new UnsupportedOperationException("remove() is not supported by this iterator.");
		}
	}
}
