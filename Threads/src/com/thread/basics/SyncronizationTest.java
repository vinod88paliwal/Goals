package com.thread.basics;

import java.time.LocalTime;

public class SyncronizationTest {

	static synchronized void m1() {
		System.out.println("m1()"+Thread.currentThread().getName()+" "+LocalTime.now());
	}
	
	static synchronized void m2() {
		System.out.println("m2()"+Thread.currentThread().getName()+" "+LocalTime.now());
	}
	 void m3() {
		System.out.println("m3()"+Thread.currentThread().getName()+" "+LocalTime.now());
	}
	 void m4() {
		System.out.println("m4()"+Thread.currentThread().getName()+" "+LocalTime.now());
	}
	
	
	public static void main(String[] args) {
		
		SyncronizationTest obj = new SyncronizationTest();
		
		new Thread(() -> {obj.m1();}).start();
		new Thread(() -> {obj.m1();}).start();
		new Thread(() -> {obj.m1();}).start();
		new Thread(() -> {obj.m1();}).start();
		
	}
}
