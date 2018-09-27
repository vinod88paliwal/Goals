package com.thread.reenterentLock;

public class Test {

	public static void main(String[] args) {
		
		new Thread(() -> {
			
			new Resource().doSomething(); 
		}).start();
	}
}
