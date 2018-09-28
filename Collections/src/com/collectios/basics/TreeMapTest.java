package com.collectios.basics;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapTest {

	public static void main(String[] args) {
		
		
		Per o1 = new Per("aaa");
		Per o2 = new Per("jjjj");
		Per o3 = new Per("xxxx");
		Per o4 = new Per("dssss");
		Per o5 = new Per("eeee");
		
		
		TreeMap map = new TreeMap();
		
		map.put(o2, o2);
		//map.put(o1, o1);
		/*map.put(29, o3);
		map.put(17, o4);
		map.put(11, o5);*/
		
		/*Per p = (Per) map.get(2);
		
		System.out.println(p);
		
		Set keys = map.keySet();
		
		for(Object i : keys) {
		System.out.println(map.get(i));
		}*/
		
	}
}


class Per{
	
	private String pName;
	private int pid;
	
	public Per( String pName) {
		//this.pid = pid;
		 this.pName = pName;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}

	@Override
	public String toString() {
		return "Per [ pName=" + pName + "]";
	}
}