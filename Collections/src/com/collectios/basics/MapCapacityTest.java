package com.collectios.basics;

import java.util.HashMap;
import java.util.Map;

public class MapCapacityTest {

	static Map<String,String> map = new HashMap<String,String>();
	
	public static void main(String[] args) {
		
		
		
		map.put("Key1", "value1");
		map.put("Key2", "value1");
		map.put("Key3", "value1");
		map.put("Key4", "value1");
		map.put("Key5", "value1");
		map.put("Key6", "value1");
		map.put("Key7", "value1");
		map.put("Key8", "value1");
		map.put("Key9", "value1");
		map.put("Key10", "value1");
		map.put("Key11", "value1");
		map.put("Key12", "value1");//12th entry in Map
		
		System.out.println(map);
		
		map.put("Key13", "value1");//13th entry in Map
		
		System.out.println(map);
		
		map.put("Key14", "value1");
		map.put("Key15", "value1");
		
	}
	
	
}
