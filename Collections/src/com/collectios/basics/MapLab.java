package com.collectios.basics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapLab {
public static void main(String[] args) {
	
	Map<String,Integer> mm =new HashMap<String, Integer>();
	
	 Map m = new HashMap();
	 
	 m.put("Hello",33.0);
	 m.put(11,100);
	 m.put(2,50);
	 m.put(15,5);
	 
    /* m.put(1,m); // can store map itself.
     m.put(m,2);
    */ 
	 
	 m.put(null, null);
	 m.put(777, null);
	
	 
     System.out.println(m);
     System.out.println(m.get(null));
     
     Set s=  m.entrySet();  
	 Iterator it=   s.iterator();
	  
	 // m.put(6,3); //this is not allowed after Iterator. to avoid exception use ConcurrentHashMap
	  /*
	  while(it.hasNext())
      {
          // key=value separator this by Map.Entry to get key and value
       Map.Entry mp =(Map.Entry)it.next();

          // getKey is used to get key of Map
          int key=(Integer)mp.getKey();

          // getValue is used to get value of key in Map
          Integer  value=(Integer) mp.getValue();

          System.out.println("Key :"+key+"  Value :"+value);
      }
*/  
}
}
