package com.collectios.basics;

import java.util.HashSet;
import java.util.Set;

public class SetLab {

	public static void main(String[] args) {
		
		Set s = new HashSet();
		
		boolean b = s.add(22);
		System.out.println(b);
		
		boolean b1 = s.add(22);
		System.out.println(b1);
					
		s.add(33);
		s.add(6);
			
		System.out.println(s);		

	  b=s.contains(6);
	  System.out.println(b);
	
	  s.add(null);
	  System.out.println(b +" -- "+s);
	  
	  s.add(null);
	  System.out.println(b +" -- "+s);
	  
	  s.add(null);
	  System.out.println(b +" -- "+s);
	  
	  
	  
	}
	
}
