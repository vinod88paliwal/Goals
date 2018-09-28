package com.collectios.basics;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetLab {
public static void main(String[] args) {
	
	Set s = new TreeSet();
	
	//Set<Integer> s = new TreeSet<Integer>();	
	
	s.add(1000);
    s.add(400);
    s.add(900);
    s.add(700);
    s.add("gk"); //ClassCastException
   //s.add(null); //NullPointerException
    
    TreeSet<Integer> ts = new TreeSet<Integer>();
    
    ts.add(100);
   // ts.add("hk"); //It will not even compile will say not applicable argument.
   
	 Iterator it=  s.iterator();
	 while (it.hasNext()) 
	 {
	 Object o =  it.next();
	System.out.println(o);	
	}
    
}
}
