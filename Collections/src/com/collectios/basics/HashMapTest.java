package com.collectios.basics;

import java.util.HashMap;
import java.util.Iterator;
public class HashMapTest {
public static void main(String[] args) {

	HashMap<Integer,String> hm = new HashMap<Integer, String>();
	
	hm.put(2,"two"); hm.put(1,"one"); hm.put(3,"tthreee");
	
	Iterator it= hm.keySet().iterator();
	//hm.put(1, "asgfdh");
	
	System.out.println("Before: "+hm);

	while (it.hasNext()) {
		Object object = (Object) it.next();
		//it.remove();
		
		System.out.println("Data: "+object);
		hm.put(4, "asgfdh");
		System.out.println("Middle: "+hm);
		
	}
	System.out.println("Afetr: "+hm);
	
	System.out.println("********************************8");
	
	HashMap<String, Integer> hm1 = new HashMap<String, Integer>();
	
	hm1.put("one", 1); hm1.put("two", 2);
	
				
		Iterator it1= hm1.entrySet().iterator();
			//hm.put("three",3);
		
		System.out.println(hm1.get("one"));
			
		while (it1.hasNext()) {
			Object object = (Object) it1.next();
			System.out.println(object);
		}
	
	
}
}
