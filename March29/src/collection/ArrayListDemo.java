package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l = new ArrayList<>();
		for(int i =10; i<=100;i+=10) {
			l.add(i);
		}
		System.out.println("list is: " + l);
		l.add(2, 56);
		
		System.out.println("list is after insertion: " +l);
		
		l.set(3, 100);
		System.out.println("List after replacement: " +l);
		
		List <Integer> l2 = new ArrayList<>();
		l2.add(111);
		l2.add(222);
		l2.add(333);
		
		System.out.println("List2: " + l2);
		
		l.addAll(4, l2);
		System.out.println("List + List2: " + l);
		
		if(l.contains(222)) {
			System.out.println("List has the value");
		}else {
			System.out.println("List has not the val");
		}
		
		l.remove(3);
		System.out.println("After deletion: " + l);
	}

}
