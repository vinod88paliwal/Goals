package com.thread.executorservice.methods;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class InvokeAllMethod {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		ExecutorService service = Executors.newSingleThreadExecutor();
		Set<Callable<String>> callSet = new HashSet<>();
		
		callSet.add(new Callable<String>() {
			@Override
			public String call() throws Exception {
				return "Task1"; 
				}
		     });
		
		callSet.add(() ->{ return  "Task2";}); //Java8 style
			
		Callable<String> c3 =() ->{ return "Task3";};  //Java8 style
		callSet.add(c3);

		List<Future<String>> futuresResult =  service.invokeAll(callSet);
		
		futuresResult.forEach(future -> {
			try {
				System.out.println("future.get() = " + future.get());
			} catch (InterruptedException | ExecutionException e) {
				e.printStackTrace();
			}
		});

		service.shutdown();
		
		}
}
