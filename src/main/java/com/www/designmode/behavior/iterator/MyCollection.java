/**
 *
 */
package com.www.designmode.behavior.iterator;

import com.www.designmode.behavior.iterator.interfaces.Collection;
import com.www.designmode.behavior.iterator.interfaces.Iterator;

/**
 * @author www
 *
 */
public class MyCollection implements Collection {

	   public String []string = {"A","B","C","D","E"};
	    @Override
	    public Iterator iterator() {
	        return new MyIterator(this);
	    }

	    @Override
	    public Object get(int i) {
	        return string[i];
	    }

	    @Override
	    public int size() {
	        return string.length;
	    }
}
