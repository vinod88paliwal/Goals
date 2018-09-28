package com.collectios.basics;

import java.util.HashMap;

//The putAll(Map<? extends K,? extends V> m) method is used to copy all of the mappings from
 //the specified map to this map.
public class HashMapPutAllMethod {

	  public static void main(String args[]) {
	      // create two hash maps
	      HashMap newmap1 = new HashMap();
	      HashMap newmap2 = new HashMap();
	      
	      // populate hash map
	      newmap1.put(1, "tutorials");
	      newmap1.put(2, "point");
	      newmap1.put(3, "is best");
	      
	      System.out.println("Values in newmap1: "+ newmap1);
	      
	      // put all values in newmap2
	      newmap2.putAll(newmap1);

	      System.out.println("Values in newmap2: "+ newmap2);
	   }    
}

