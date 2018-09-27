package com.thread.threadpool;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorServiceExample {

	public static void main(String[] args) {
		
		ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(5);

		ScheduledFuture scheduledFuture =
		    scheduledExecutorService.schedule(new Callable() {
		        public Object call() throws Exception {
		            System.out.println("Executed!");
		            return "Called!";
		        }
		        
		    },
		    5,
		    TimeUnit.SECONDS);
		
		
		    //OR
		
		ScheduledFuture scheduledFuture1 =
			    scheduledExecutorService.schedule(() -> { 
			            System.out.println("Executed!");
			            return "Called!";
			    }, 5, TimeUnit.SECONDS);
	}
	
}
