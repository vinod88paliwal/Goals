package com.thread.executorservice.methods;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class ScheduleRunnableMethod {
	
	
public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		ScheduledExecutorService service = Executors.newScheduledThreadPool(5);

		ScheduledFuture scheduledFuture = service.schedule(new Runnable() {
					
					@Override
					public void run() {
						System.out.println("Executed!");
						}
					},
		    5, //After 5 Second it will execute the task.
		    TimeUnit.SECONDS);
		
		
					//OR  Java8 Lamda Style
		
	/*	ScheduledFuture scheduledFuture = service.schedule(() -> {
			            System.out.println("Executed!");
			    },
			    5, //After 5 Second it will execute the task.
			    TimeUnit.SECONDS);*/

		System.out.println("result = " + scheduledFuture.get());

		service.shutdown();
	}
}
