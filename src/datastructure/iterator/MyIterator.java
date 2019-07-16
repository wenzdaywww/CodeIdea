package datastructure.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

import datastructure.intertfaces.MyList;
/**
 * 
 * @author www
 *
 * @param <E>
 */
public class MyIterator<E> implements Iterator<E>{
	/** 集合对象 */
	private MyList<E> myList;
	/** 下一个位置 */
	private int nextPosition;
	/** 是否有下一个调用 */
	private boolean wasNextCalled; 
	
	public MyIterator(MyList<E> myList){
		this.myList=myList;
		nextPosition=0;
		wasNextCalled=false;
	}
	
	@Override
	public boolean hasNext() {
		return nextPosition<myList.size();
	}

	@Override
	public E next() {
		if (hasNext()) {
			wasNextCalled=true;
			E obj=myList.get(nextPosition);
			nextPosition++;
			return obj;
		}else {
			throw new NoSuchElementException("Illegal call to next();iterator is after end of list.");
		}
	}

	@Override
	public void remove() {
		if (wasNextCalled) {
			myList.remove(nextPosition);
			wasNextCalled=false;
			nextPosition--;
		}else {
			throw new NoSuchElementException("Illegal call to remove();next() was not called.");
		}
	}

}
