package com.collectios.basics;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
		
		Map m = new HashMap();
		
		m.put(2, "its two");
		
		Hello h = new Hello(0, "hello");
		
		m.put(h, "hello");
		
		m.put("good", "good two");
		m.put(null,"bye");
		m.put(null,"bye11");
		m.put(33,null);
		
		m.put(h, m);
		
		System.out.println("33: "+m.get(33));
		
		System.out.println("Null: "+m.get(null));
		
		System.out.println(m.get(h));
	}
	
}
