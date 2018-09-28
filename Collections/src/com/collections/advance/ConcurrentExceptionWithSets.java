package com.collections.advance;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class ConcurrentExceptionWithSets {
		
	public static void main(String[] args) {
	
		//hashSet
		/*HashSet<String> hashSet = new HashSet<String>();
		
		hashSet.add("1"); hashSet.add("2"); hashSet.add("3"); 
		
		Iterator<String> it = hashSet.iterator();
		
		while (it.hasNext()) {
			String string = it.next();
			
		System.out.println("Iterated Set value : "+string);
		
		hashSet.add("4");
		System.out.println("After modification Iterated Set value : "+string);
		}
		System.out.println("Sets values : "+hashSet);
*/		
	
	//LinkedHashSet	
	/* LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
		
	 linkedHashSet.add("1"); linkedHashSet.add("2"); linkedHashSet.add("3"); 
		
		Iterator<String> it1 = linkedHashSet.iterator();
		
		while (it1.hasNext()) {
			String string = it1.next();
			
		System.out.println("Iterated LinkedHashSet value : "+string);
		
		linkedHashSet.add("4");
		System.out.println("After modification Iterated LinkedHashSet value : "+string);
		}
		System.out.println("LinkedHashSet values : "+linkedHashSet);
*/	

		//TreeSet
		 TreeSet<String> treeSet = new TreeSet<String>();
			
		 treeSet.add("2"); treeSet.add("1"); treeSet.add("3"); 
			
			Iterator<String> it2 = treeSet.iterator();
			
			while (it2.hasNext()) {
				String string = it2.next();
				
			System.out.println("Iterated treeSet value : "+string);
			
			treeSet.add("4");
			System.out.println("After modification Iterated treeSet value : "+string);
			}
			System.out.println("treeSet values : "+treeSet);
		
	}
}
