package com.oops.hashcodeequals;

import java.util.HashMap;
import java.util.Map;

public class HashcodeEqualsTest {

	public static void main(String[] args) {
		
		Emp obj1 = new Emp(1,"ABC");
		Emp obj2 = new Emp(1,"ABC");
		
		System.out.println(obj1.hashCode()+" -- "+obj2.hashCode()+" --> "+(obj1.hashCode() == obj2.hashCode()));// Different code if not overridden, Even both Objects belongs to same class. 
		System.out.println(obj1.equals(obj2)); //False if not overridden, even both Objects having same data.. because its comparing Object`s address not Objects`s values.
//If hashcode() not overridden means hashcode would be different (as comparing references) so it will store 2 objects of same type having same data in two buckets irrespective of equals() overidden or not.
//If hashcode() is overridden so  hashcode would be same so it will store 2 objects of same type having same data in same bucket as equals() method not overidden so equals() return false (as comparing references) 
		
		Map<Emp,Integer> map = new HashMap<Emp,Integer>();
		
		map.put(obj1, 1);
		map.put(obj2, 2);
		
		for(Emp e : map.keySet())
		{
			System.out.println(e.id+" "+e.name);
		}
		
	}
}


class Emp //implements Comparable<Emp>
{
	
	 int id;
	 String name;
	 
	public Emp(int id, String name) {
		this.id = id;
		this.name = name;
	}

/*	@Override
	public int compareTo(Emp o) {
		if(this.id < o.id)
			return 1;
		else if(this.id > o.id)
			return -1;
		else if (this.id == o.id)
		return 0;
		return 0;	
	}*/
	
/*	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	*/
	
	/*@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
*/
}