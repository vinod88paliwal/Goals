package com.producerconsumer.waitnotify;

import java.util.ArrayList;

public class ClientApp {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new  ArrayList<Integer>(10);
		
		Producer prod = new Producer(al);
		new Thread(prod, "Producer").start();
		
		Consumer cons = new Consumer(al);
		new Thread(cons,"Consumer").start();
		
		 System.out.println("All the threads are started");
		
	}
	
	
}
