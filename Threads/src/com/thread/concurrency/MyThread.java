	package com.thread.concurrency;

import java.util.concurrent.ConcurrentHashMap;

public class MyThread implements Runnable{
	
	private ConcurrentHashMap<String,Integer> hm = new ConcurrentHashMap<String, Integer>();
	
	@Override
	public void run() {

		if("thread03".equals(Thread.currentThread().getName()))
		{
			System.out.println("If Thread Name: "+Thread.currentThread().getName());
			hm.put("one", 1); 
			hm.clear();
		}
		else {
			System.out.println("else Thread " +
					"Name: "+Thread.currentThread().getName());
			
			hm.put("two",2); hm.put("three",3); hm.put("four", 4);

			System.out.println(hm.get("one")); System.out.println(hm.get("two"));
			System.out.println(hm.get("three")); System.out.println(hm.get("four"));
			
			System.out.println("else.......");
		}
		
	}

}
