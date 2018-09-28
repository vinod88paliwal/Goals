package com.collectios.basics;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetLab {
public static void main(String[] args) {
	
	Set s = new HashSet();
	
	String str1 = "Yellow", str2 = "White", str3 = "Green", str4 = "Blue";
	
	s.add(str1);s.add(str2);s.add(str3);s.add(str4);
	s.add(null);
	System.out.println(s);
	
	Iterator it = s.iterator();
	
	s.add("dddd"); //java.util.ConcurrentModificationException
	
	//s.remove(str1);
	
	/*while (it.hasNext())
	{
		Object o = it.next();
		System.out.println(o);
	}
	*/
	int size = s.size();
	System.out.println(size);
	
	
	if(s.isEmpty())
		System.out.println("set is empty");
	else
		System.out.println("Size of set  1 ==>  "+size);
	
	s.remove(str1);
	
	System.out.println(s);
	
	System.out.println("Size of set 2 ==>  "+s.size());
	
}
}
