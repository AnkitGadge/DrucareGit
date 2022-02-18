package p1;

import java.util.ArrayList;
import java.util.*;

public class CollectionsAssignment {
	public static void main(String[] args) {
		System.out.println("============================");
	
		System.out.println("Java program to Initialize an ArrayList in Java");
		ArrayList arr = new ArrayList();
		arr.add(10);
		arr.add(10);
		arr.add(30);
		arr.add(40);
		System.out.println("Added Element"+ arr);
		System.out.println("============================");
		System.out.println("Java program to check if element exists in ArrayList");
		System.out.println(arr.contains(10));
		System.out.println("============================");
	
		System.out.println("Java program to Initialize an HashSet in Java");
		HashSet hset = new HashSet();
		hset.add(10);
		hset.add(30);
		hset.add(40);
		System.out.println("Added Element"+ hset);
		System.out.println("============================");
		System.out.println("Java program to check if element exists in HashSet");
		System.out.println(hset.contains(10));
		System.out.println("============================");
//		LinkedList list = new LinkedList();
//		list.add(1);
//		list.add(10);
//		list.add(11);
//		list.add(12);
//		ListIterator listIterator = list.listIterator();
//		System.out.println(list);
//		listIterator.add(44);
//		System.out.println(list);

		ArrayList colour = new ArrayList();
		colour.add("Red");
		colour.add("Blue");
		colour.add("Yellow");
		colour.add("Green");
		System.out.println("Iterated Elements Using Iterator");
		Iterator itr = colour.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + ", ");
		}
		System.out.println();
		ArrayList copying = new ArrayList(colour);
		ArrayList lnk = new ArrayList(colour);
	
		System.out.println("Copied Elements");
		
		System.out.println();
		System.out.print(copying);
		
		System.out.println();
		System.out.println("Copied Elements to Another ArrayList Are Printed");
		System.out.print(lnk);

	}
}
