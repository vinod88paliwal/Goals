package com.oops.hashcodeequals;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HashCodeEqualsForTreeMap {

public static void main(String[] args) {
		System.out.println("dfd");
		
	Emp obj1 = new Emp(2,"ABC");
	Emp obj2 = new Emp(1,"DEF");
	Emp obj3 = new Emp(3,"PQR");
		
		//System.out.println(obj1.hashCode()+" -- "+obj2.hashCode());// Different code if not overridden, Even both Objects belongs to same class. 
		//System.out.println(obj1.equals(obj2)); //False if not overridden, even both Objects having same data
		
		
		Map map = new TreeMap();
		
		map.put(obj1, 3);
		map.put(obj2,  6);
		map.put(obj3,  2);
		
		Set<Emp> keys = map.keySet();
		
		System.out.println("Size : "+keys.size());
		
		for(Emp e : keys) {
			//System.out.println(e.id+" "+e.name);
			System.out.println(map.get(e));
			
		}
		
		
	}
}


