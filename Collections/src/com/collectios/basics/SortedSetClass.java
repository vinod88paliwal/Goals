package com.collectios.basics;

public class SortedSetClass implements Comparable<SortedSetClass>{

	 private Integer i;
	 
	 
@Override
	public String toString() {
		return "SortedSetClass [i=" + i + "]";
	}


public SortedSetClass(Integer i) {
		this.i = i;
	}
	@Override
	public int compareTo(SortedSetClass obj)
	{
	  return this.i.compareTo(obj.i);
	}
	
}