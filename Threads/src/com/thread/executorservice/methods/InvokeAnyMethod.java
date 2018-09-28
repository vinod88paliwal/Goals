package com.thread.executorservice.methods;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class InvokeAnyMethod {
	
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

	String result =  service.invokeAny(callSet);
	System.out.println("Result = " + result);
	
	service.shutdown();
	
	}

}
