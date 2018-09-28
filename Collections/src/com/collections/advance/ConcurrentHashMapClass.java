package com.collections.advance;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapClass {

	
	public static void main(String[] args) {
		
		try {
			ConcurrentHashMap<Integer,Integer> m = new ConcurrentHashMap<Integer,Integer>();
			
   
			m.put(2,3); m.put(3, 5); m.put(1,4);
			//m.put(null,33); it does not allow null as key
			//m.put(33,null); it does not allow null as value
			
			m.put(3,90);
			 Set s= m.entrySet();
			Iterator it = s.iterator();
			
			m.put(6,3); //Modification is allowed after Iterator.because we used ConcurrentHashMap
						//ConcurrentHashMap is thread safe.
			while (it.hasNext()) {
				  Map.Entry mp =(Map.Entry)it.next();

		          // getKey is used to get key of Map
		          int key=(Integer)mp.getKey();

		          // getValue is used to get value of key in Map
		          Integer  value=(Integer) mp.getValue();

		          System.out.println("Key :"+key+"  Value :"+value);
		          m.put(5,12);// Never throws ConcurrencModificationException

		          //it.remove();//
				}
			System.out.println(m.keySet());
			System.out.println(m.values());
			
		} catch (ConcurrentModificationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}