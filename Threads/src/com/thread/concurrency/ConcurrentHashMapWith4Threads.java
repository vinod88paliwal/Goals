package com.thread.concurrency;

public class ConcurrentHashMapWith4Threads {

	public static void main(String[] args) {
		
		Thread t1 = new Thread(new MyThread(), "thread01");
		Thread t2 = new Thread(new MyThread(), "thread02");
		Thread t3 = new Thread(new MyThread(), "thread03");
		
		t1.start();
		t2.start();
		t3.start();
		
		System.out.println("All threads done ...!!!!!");

	
	}
	
}
