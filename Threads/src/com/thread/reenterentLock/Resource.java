package com.thread.reenterentLock;

public class Resource {

	public void doSomething(){
		//do some operation, DB read, write etc
		System.out.println("doSomething....");
	}
	
	public void doLogging(){
		//logging, no need for thread safety
		System.out.println("doLogging....");
	}
}