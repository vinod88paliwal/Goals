package com.collectios.basics;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetClassMain {
	
	public static void main(String[] args)
	{
		SortedSet s = new TreeSet();
		//Sorted set won`t allow to add different data type objects or variables
		
		//Set s = new HashSet();
			
	s.add(new Integer(10)); s.add(22);	s.add(new Integer(5));  	s.add(new Integer(6));
		//	s.add(new String("hello"));
			//s.add("hello");
			
		//  s.add(null);//Sorted set won`t allow null	
/*			SortedSetClass obj = new SortedSetClass(20);
			SortedSetClass obj1 = new SortedSetClass(10);
			SortedSetClass obj2 = new SortedSetClass(40);
			
			s.add(obj); s.add(obj1); s.add(obj2);
*/			
			//s.add("Hello");
			
			Iterator it = s.iterator();
			
			while (it.hasNext()) {
				Object object = (Object) it.next();
				
				System.out.println(object);
			}
	}
}
