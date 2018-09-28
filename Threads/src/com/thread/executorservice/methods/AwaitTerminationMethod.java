package com.thread.executorservice.methods;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class AwaitTerminationMethod {

	public static void main(String[] args) {
		
		ExecutorService service = Executors.newFixedThreadPool(3);
		
		for(int i = 1; i<=5; i++) {
			final int cnt = i;
		
		service.execute(() -> {
			try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
			
		System.out.println(Thread.currentThread().getName()+" has completed Runnable "+cnt);
		});
		
		
		}
		
		service.shutdown();
		try {
			service.awaitTermination(10000, TimeUnit.MICROSECONDS);
	
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("***********Executor has been shutdown !!");
	}
	
}
