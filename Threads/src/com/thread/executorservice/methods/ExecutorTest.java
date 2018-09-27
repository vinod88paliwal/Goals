package com.thread.executorservice.methods;

import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class ExecutorTest implements Runnable {

	@Override
	public void run() {
		
		String name = Thread.currentThread().getName();
		System.out.println("Thread " + name + " started at " + System.currentTimeMillis());
		
		Task[] tasks = new Task[20];
		
		ThreadPoolExecutor pool = new ThreadPoolExecutor(10, 15, 2000L, TimeUnit.MILLISECONDS,
				new LinkedBlockingQueue<Runnable>());
		
		System.out.println("Thread " + name + " is going to create " + "20 tasks at " + System.currentTimeMillis());
		for (int i = 0; i < 20; i++) {
			pool.execute(new Task());
		}
		System.out.println("Thread " + name + " is done creating" + " tasks at " + System.currentTimeMillis());
		pool.shutdown();
		System.out.println("Thread " + name + " invoked shutdown at " + System.currentTimeMillis());
		try {
			pool.awaitTermination(5000L, TimeUnit.MILLISECONDS);
			System.out.println("Thread " + name + " invoked " + "shutdownNow at " + System.currentTimeMillis());
			pool.shutdownNow();
		} catch (InterruptedException ex) {
			System.out.println("Thread " + name + " was INTERRUPTED AT " + System.currentTimeMillis());
			System.out.println("Thread " + name + " invoked shutdownNow at " + System.currentTimeMillis());
			pool.shutdownNow();
		}

		System.out.println("Thread " + name + " ended at " + System.currentTimeMillis());
	}

	public static void main(String[] args) {
		System.out.println("Main started at " + System.currentTimeMillis());
		Thread t = new Thread(new ExecutorTest());
		t.start();
		for (int i = 0; i < 20000; i++)
			;
		t.interrupt();
		System.out.println("Main ended at " + System.currentTimeMillis());
	}
}