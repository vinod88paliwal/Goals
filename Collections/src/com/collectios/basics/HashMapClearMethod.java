package com.collectios.basics;

import java.util.HashMap;
//The clear() method is used to remove all of the mappings from this map.
public class HashMapClearMethod {

	   public static void main(String args[]) {
		      // create hash map
		      HashMap newmap = new HashMap();
		      
		      // populate hash map
		      newmap.put(1, "tutorials");
		      newmap.put(2, "point");
		      newmap.put(3, "is best"); 
		      
		      System.out.println("Initial map elements: " + newmap);
		      
		      // clear hash map
		      newmap.clear();
		      
		      System.out.println("Map elements after clear: " + newmap);
		   }    
}