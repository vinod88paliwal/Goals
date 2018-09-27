package com.thread.executorservices;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorServiceScheduleWithFixedDelay {

	public static void main(String[] args) {

		ScheduledExecutorService service = Executors.newScheduledThreadPool(5);
		
		System.out.println("Before Starting : "+ new Date());
		
		service.scheduleWithFixedDelay(() -> {
				System.out.println("scheduleWithFixedDelay : "+new Date());
			
		}, 2, 3L, TimeUnit.SECONDS);
		
		//service.shutdown();
			
		System.out.println("***********Executor has been shutdown !!");
	
	}
}

//I  have a cup of coffee, which takes 10 minutes. Suppose that starts at midnight, I'd have
/*
00:00: Start making coffee
00:10: Finish making coffee
01:00: Start making coffee
01:10: Finish making coffee
02:00: Start making coffee
02:10: Finish making coffee


If I schedule with a fixed delay of one hour, I'd have: scheduleWithFixedDelay() :

00:00: Start making coffee
00:10: Finish making coffee
01:10: Start making coffee
01:20: Finish making coffee
02:20: Start making coffee
02:30: Finish making coffee

*/

