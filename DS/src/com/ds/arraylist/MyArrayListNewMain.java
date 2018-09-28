package com.ds.arraylist;

import java.util.Iterator;

public class MyArrayListNewMain {
	public static void main(String[] args) {
	
	MyArrayListNew<Integer> al = new MyArrayListNew<Integer>();
	
	al.add(10); al.add(20);
	
	System.out.println(al);
	
	
	Iterator<Integer> it = al.iterator();
	
	while (it.hasNext()) {
		Integer obj = it.next();
		//l.add(30); //java.util.ConcurrentModificationException
		
		System.out.println("Integer : "+obj);
		
	}

	
	}

}
