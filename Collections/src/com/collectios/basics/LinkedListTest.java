package com.collectios.basics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		
		LinkedList ll = new LinkedList();
		
		ll.add(22);
		ll.add(21);
		ll.add(34);
		
		System.out.println( ll.get(0));
	    // ll.add(6,77);
	
	Iterator it = ll.iterator();
	
	while(it.hasNext()){
		System.out.println(it.next());
		}
		
		
		
		
		
		/*
       ArrayList ll = new ArrayList(9000);
		
		ll.add(22);
		ll.add(21);
		ll.add(34);
       // ll.add(2,77);
	
	Iterator it = ll.iterator();
	
	while(it.hasNext()){
		System.out.println(it.next());
	}
	System.out.println( ll.get(0));
	*/
	}
	
}
