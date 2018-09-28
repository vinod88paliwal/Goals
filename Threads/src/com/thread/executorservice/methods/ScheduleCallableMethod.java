package com.thread.executorservice.methods;

import java.time.LocalTime;
import java.util.Date;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class ScheduleCallableMethod {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		ScheduledExecutorService service = Executors.newScheduledThreadPool(5);
		System.out.println("Before Starting : "+ LocalTime.now());

	/*	ScheduledFuture scheduledFuture =
		    scheduledExecutorService.schedule(new Callable() {
		        public Object call() throws Exception {
		            System.out.println("Executed!");
		            return "Called!";
		        }
		    },
		    5, //After 5 Second it will execute the task.
		    TimeUnit.SECONDS);*/
		
					//OR  Java8 Lamda Style
		
		ScheduledFuture scheduledFuture = service.schedule(() -> {
			       
			            System.out.println("Executed!");
			            return "Called!";
			    },
			    5, //After 5 Second it will execute the task.
			    TimeUnit.SECONDS);

		System.out.println("result = " + scheduledFuture.get());

		service.shutdown();
	}
}
