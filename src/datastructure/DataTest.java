package datastructure;

import java.util.Iterator;

import org.junit.Test;

import datastructure.intertfaces.MyList;
import datastructure.lineartable.MyArrayList;
import datastructure.lineartable.MyLinkedList;
/**
 *
 *
 * @author www
 *
 */
public class DataTest {
	/**
	 * 动态数组线性表测试
	 */
	@Test
	public void arrayListTest() {
		MyList<String> myList=new MyArrayList<String>(10);
		for (int i = 0; i < 20; i++) {
			myList.add(Integer.toString(i));
		}
		myList.display();
		myList.addLast("last");
		myList.addFirst("first");
		myList.display();
		myList.remove(19);
		myList.display();
		myList.replace(12, "x1");
		myList.display();
		System.out.println(myList.contains("123"));
		System.out.println(myList.get(myList.size()));
		System.out.println(myList.removeLast());
		myList.display();
	}
	/**
	 * 链表线性表测试
	 */
	@Test
	public void linkedListTest(){
		MyList<String> myList=new MyLinkedList<String>();
		for (int i = 1; i <= 5; i++) {
			myList.add(Integer.toString(i));
		}
		myList.display();
		for (int i = 6; i <= 10; i++) {
			myList.add(myList.size(),Integer.toString(i));
		}
		myList.remove(5);
		myList.display();
		myList.replace(4, "123");
		myList.display();
		System.out.println(myList.removeFisrt());
		System.out.println(myList.contains("123"));
	}

	@Test
	public void iteratorTest(){
		MyList<Integer> linkedList=new MyLinkedList<Integer>();
		for (int i = 1; i <= 5; i++) {
			linkedList.add(i);
		}
		Iterator<Integer> linkedIter=linkedList.iterator();
		while (linkedIter.hasNext()) {
			System.out.print(linkedIter.next()+",");
		}
		System.out.println();
		MyList<Integer> arrList=new MyArrayList<Integer>();
		for (int i = 1; i <= 10; i++) {
			arrList.add(i);
		}
		arrList.display();
		Iterator<Integer> arrIter=arrList.iterator();
		while (arrIter.hasNext()) {
			arrIter.next();
		}
		arrIter.remove();
		arrList.display();
	}
}
