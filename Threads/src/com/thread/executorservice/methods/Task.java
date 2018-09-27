package com.thread.executorservice.methods;

public class Task implements Runnable {

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		
		System.out.println("Thread " + name + " started at " + System.currentTimeMillis());
		
		for (int i = 0; i < 5; i++) {
			try {
				System.out.println(name + " printed hello user at " + System.currentTimeMillis());
				Thread.sleep(1000);
			} catch (InterruptedException ex) {
				System.out.println("Thread " + name + " was interrupted at " + System.currentTimeMillis());
			}

		}
		System.out.println("Thread " + name + " ended at " + System.currentTimeMillis());
	}
}