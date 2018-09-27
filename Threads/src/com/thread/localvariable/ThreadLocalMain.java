package com.thread.localvariable;

public class ThreadLocalMain {

	public static void main(String[] args) {
		
		Thread threadLocal1 = new Thread(new ThreadLocal(),"threadLocal1");
		Thread threadLocal2 = new Thread(new ThreadLocal(),"threadLocal2");
		
		threadLocal1.start(); 
		threadLocal2.start();
		
	}
	
	
}
