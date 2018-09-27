package com.thread.basics;

public class MainofThreadAndRunnable {

	public static void main(String[] args) {
		
		//starting Thread in Java
		Thread mythread = new MyThread(); //Thread created not started
		mythread.setName("T1");

		Thread myrunnable = new Thread(new MyRunnable(),"T2"); //Thread created not started     

		mythread.start(); //Thread started now but not running
		myrunnable.start();

//TIP1: It�s not guaranteed that mythread will start before myrunnable it depends upon Thread scheduler.
//TIP2: Thread will be said to go on dead state once execution of run() method finished and you can not start that thread again.
		
		
	}
}
