package com.collectios.basics;

import java.util.HashSet;

public class HashSetStoringObjectWithoutEquals {

	public static void main(String[] args) {
		
		HashSet hs = new HashSet();
	
	hs.add(22);
	Emp e = new Emp();
	
	hs.add(e); hs.add(e);
	
	System.out.println(hs);	
	}
	
}
