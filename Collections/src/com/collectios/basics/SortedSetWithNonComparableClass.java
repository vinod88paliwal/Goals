package com.collectios.basics;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetWithNonComparableClass {

	public static void main(String[] args) {
//thread "main" java.lang.ClassCastException: com.collectios.basics.Emp cannot be cast to java.lang.Comparable
//Becuse we didn`t sort by any property of Emp and SortedSet internally will not be able to short Emp object and will throw above exception.	
		SortedSet ss = new TreeSet();
		
		Emp e1 = new Emp();
		Emp e2 = new Emp();
		Emp e3 = new Emp();
		
		ss.add(e1); ss.add(e2); ss.add(e3);
		
		System.out.println(ss);
	}
	
	
}
