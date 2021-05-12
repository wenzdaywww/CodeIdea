package datastructure.lineartable;

import java.util.Iterator;
import java.util.NoSuchElementException;

import datastructure.intertfaces.MyList;

/**
 * 动态数组线性表，位置从0开始
 * @author wenzday
 *
 */
public class MyArrayList<T> implements MyList<T>{
	/** 数组长度 */
	private int length;
	/** 数组 */
	private T[] arr;
	/** 数组初始长度*/
	private int initSize;
	
	public MyArrayList() {
		this(10);
	}
	
	@SuppressWarnings("unchecked")
	public MyArrayList(int initSize){
		length=0;
		this.initSize=initSize;
		arr=(T[])new Object[this.initSize];
	}
	
	@Override
	public boolean add(T entry) {
		boolean isSuccess=true;
		try {
			isSuccess=add(length, entry);
		} catch (Exception e) {
			isSuccess=false;
			e.printStackTrace();
		}
		return isSuccess;
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean add(int position, T entry) {
		boolean isSuccess=true;
		try {
			//数组长度扩展，每次扩展长度=原数组长度+initSize
			if (isFull()) {
				T[] oldArr=arr;
				arr=(T[])new Object[initSize+oldArr.length];
				System.arraycopy(oldArr, 0, arr, 0, length);
			}
			if (position>=0&&position<=length+1) {
				for (int i = length ; (i-1)>=0 && i >= position; i--) {
					arr[i]=arr[i-1];
				}
				arr[position]=entry;
				length++;
			}else {
				isSuccess=false;
			}
		} catch (Exception e) {
			isSuccess=false;
			e.printStackTrace();
		}
		return isSuccess;
	}

	@Override
	public boolean addFirst(T entry) {
		return add(0, entry);
	}

	@Override
	public boolean addLast(T entry) {
		return add(entry);
	}
	
	@Override
	public T remove(int position) {
		T obj=null;
		try {
			obj=arr[position];
			if (position==length-1) {
				arr[position]=null;
				length--;
			}else if (position>=0 && position<length-1) {
				for (int i = position; i < length-1; i++) {
					arr[i]=arr[i+1];

				}
				length--;
			}
		} catch (Exception e) {
			obj=null;
			e.printStackTrace();
		}
		return obj;
	}

	@Override
	public T removeFisrt() {
		return remove(0);
	}

	@Override
	public T removeLast() {
		return remove(length-1);
	}

	@SuppressWarnings("unchecked")
	@Override
	public void clear() {
		for (int i = 0; i < length; i++) {
			arr[i]=null;
		}
		length=0;
		arr=(T[])new Object[initSize];
	}

	@Override
	public boolean replace(int position, T entry) {
		boolean isSuccess=true;
		try {
			arr[position]=entry;
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
			obj=arr[position];
		} catch (Exception e) {
			obj=null;
			e.printStackTrace();
		}
		return obj;
	}

	@Override
	public T getFisrt() {
		return get(0);
	}

	@Override
	public T getLast() {
		return get(length-1);
	}

	@Override
	public boolean contains(Object obj) {
		boolean isContains=false;
		for (int i = 0; i < length; i++) {
			if (arr[i].equals(obj)) {
				isContains=true;
				break;
			}
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
		return length==arr.length;
	}

	@Override
	public void display() {
		String str="";
		str+="length="+size()+",arr.szie="+arr.length+":";
		for (int i = 0; i < length; i++) {
			str+=arr[i]+",";
		}
		System.out.println(str.substring(0, str.length()-1));
	}

	@Override
	public Iterator<T> iterator() {
		return new ArrayIterator<T>();
	}
	/**
	 * 内部迭代器
	 * @author wenzday
	 * @param <T>
	 */
	@SuppressWarnings("hiding")
	private class ArrayIterator<T> implements Iterator<T>{
		/** 下一个索引 */
		private int nextIndex;
		/** 是否有下一个调用 */
		private boolean wasNextCalled;
		
		public ArrayIterator(){
			nextIndex=0;
			wasNextCalled=false;
		}
		@Override
		public boolean hasNext() {
			return nextIndex<length;
		}

		@SuppressWarnings("unchecked")
		@Override
		public T next() {
			if (hasNext()) {
				wasNextCalled=true;
				T obj=(T) arr[nextIndex];	
				nextIndex++;
				return obj;
			}else {
				throw new NoSuchElementException("Illegal call to next();iterator is after end of list.");
			}
		}

		@Override
		public void remove() {
			if (wasNextCalled) {
				MyArrayList.this.remove(nextIndex-1);
				wasNextCalled=false;
				nextIndex--;
			}else {
				throw new NoSuchElementException("Illegal call to remove();next() was not called.");
			}
		}
	}
}
