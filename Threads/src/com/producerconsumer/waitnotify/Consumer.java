package com.producerconsumer.waitnotify;

import java.util.ArrayList;

public class Consumer implements Runnable{

private static ArrayList<Integer> list = null;
	
	public Consumer(ArrayList<Integer> l){
		System.out.println("Consumer cons");
		this.list = l;
	}
	
	@Override
	public void run() {

		while (true) {
			 try {
            Thread.sleep(500);
            System.out.println("After sleep");
            if (list.isEmpty()) {
                System.out.println("Waiting to remove");
                synchronized (list) {
                	list.wait();
                	System.out.println("After Wait....");
                }
            }
            synchronized (list) {
                int removed = list.remove(0);
                System.out.println("Removed from list: " + removed);
                list.notify();
            }
        
			 } catch (InterruptedException e) {
					e.printStackTrace();
				}
			 }
	}
}
