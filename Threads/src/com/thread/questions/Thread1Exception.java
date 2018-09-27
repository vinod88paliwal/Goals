package com.thread.questions;

public class Thread1Exception {

	public static void main(String[] args) {

		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				throw new RuntimeException("Thread Exception Example");
			}
		});

		t1.start();

		while (true) {
			System.out.println("ThreadDemo.main()");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}


/*
In above example, RuntimeException thrown by Thread "t1" will not affect "main" thread and it continues to print "ThreadDemo.main()"
In general, Exception thrown by one thread will not affect another thread, as all threads are independent and have different stack.

*/