package com.thread.basics;

public class ThreadExample {

	public static void main(String[] args) {
		Thread thread1 = new Thread(new XThread(), "thread1");
		Thread thread2 = new Thread(new XThread(), "thread2");
		//	 The below 2 threads are assigned default names
		Thread thread3 = new XThread();
		Thread thread4 = new XThread();
		Thread thread5 = new XThread("thread5");
		//Start the threads
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		try {
	//The sleep() method is invoked on the main thread to cause a one second delay.
			Thread.currentThread().sleep(10000);
		} catch (InterruptedException e) {
		}
		//Display info about the main thread
		System.out.println(Thread.currentThread());
	}
}
