package com.thread.joinmethod;

public class JoinTest {

	public static void main(String[] args) throws InterruptedException {
		
	Thread t1 = new Thread(() -> { System.out.println("1"); }, "t1");
    Thread t2 = new Thread(() -> { System.out.println("2"); }, "t2");
	Thread t3 = new Thread(() -> { System.out.println("3"); }, "t3");
	    
	t1.start();  t1.join(); //It guarantees that Control will not move to next (main thread will not run), until t1 completes it execution.
	t2.start();  t2.join(); //It guarantees that Control will not move to next (main thread will not run), until t2 completes it execution.
	t3.start(); // No join with Thread t3 because even if main thread completes its execution as no code in main thread so finally t3 code will be executed.
		 
	}
}
