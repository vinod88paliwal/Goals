package com.producerconsumer.waitnotify;

import java.util.ArrayList;
import java.util.Random;

public class Producer implements Runnable{

//	static Object obj = new Object();
	private static ArrayList<Integer> list = null;
	
	public Producer(ArrayList<Integer> l){
		System.out.println("Producer cons");
		this.list = l;
	}
	
	@Override
	public void run() {

		 synchronized (list) {
	            while (true) {
	                try {
	            	if (list.size() == 10) {
	                    System.out.println("Queue full.. Waiting to Add");
	                    list.wait();
	                } else {
	                    int value = new Random().nextInt(100);
	                    //if (value <= 10) {
	                      //  Thread.sleep(200);
	                        System.out.println("The element added was : " + value);
	                        list.add(value);
	                        list.notify();
	                    //}
	                }
	            } catch (InterruptedException e) {
					e.printStackTrace();
				}
	            }
		 }
	}
}