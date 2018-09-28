package com.collectios.basics;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableLab {

	public static void main(String[] args) {
				
		Hashtable st = new Hashtable();
		
		st.put("h1", 11);
		
	// it does not allow null neither in key nor in the value.	
		//st.put(null, 33);
		//st.put(44, null);
		
		System.out.println(st);
		
	Enumeration en=	 st.elements();
	st.put(33,44);
	
	while (en.hasMoreElements()) {
		st.put(55,66);	
		Object object = (Object) en.nextElement();
		System.out.println(object);
						
	}
	
	System.out.println(st);
	
    /*   Vector<String> v = new Vector<String>();

       Enumeration ev=	v.elements();
	
*/		
	}
	
}
