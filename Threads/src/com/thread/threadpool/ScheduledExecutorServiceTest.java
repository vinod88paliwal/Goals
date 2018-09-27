package com.thread.threadpool;

import java.util.Date;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
public class ScheduledExecutorServiceTest {

	public static void main(String[] args) throws InterruptedException,ExecutionException, TimeoutException {
		
		ScheduledExecutorService ex = Executors.newScheduledThreadPool(2);
		
		System.out.println("Before Starting : "+ new Date());
		
		Future ft = ex.scheduleAtFixedRate(() -> {
			
			System.out.println("scheduleWithFixedDelay s : "+new Date());
			
			for (int j = 1; j <= 5; j++) {
					System.out.println(j);
				}
				
				System.out.println("scheduleWithFixedDelay e : "+new Date());
		
		}, 3, 5, TimeUnit.SECONDS);
		
		ex.awaitTermination(20, TimeUnit.SECONDS);
		ex.shutdownNow();
		
	}
	
}