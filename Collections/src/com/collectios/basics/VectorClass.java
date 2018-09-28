package com.collectios.basics;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorClass {
	 public static void main(String[] args) {
			
		 Vector<String> v = new Vector<String>();
		 
		 v.add("1"); v.add("2"); v.add("3");
		 
		 Iterator<String> it = v.iterator();
		 
		 Enumeration<String> en = v.elements();

		 System.out.println("Size: "+v.size());
		 v.setSize(10);
		 
		 System.out.println("New Size: "+v.size());
		 
	/* while (it.hasNext()) {
		String string = (String) it.next();
		
		System.out.println(string);
		v.add("4");
		
	}
	*/	 	
		///	 or
		 
		 while (en.hasMoreElements()) {
			String string = (String) en.nextElement();
			
			System.out.println(string);
			
			//v.add("4"); // infinite llop
			
			v.set(1,"new"); // works fine.
			
		}
		 
		 
	 }
}
