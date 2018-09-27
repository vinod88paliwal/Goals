package com.thread.locks;

import java.time.LocalTime;
import java.util.Random;
//2.
public class Writer extends Thread{
	
	private ReadWriteList<Integer> sharedList;
	
	public Writer(ReadWriteList<Integer> sharedList) {
		this.sharedList = sharedList;
	}

	public void run() {
		Random random = new Random();
		int number = random.nextInt(100);
		sharedList.add(number);
		
		try {
			Thread.sleep(100);
			System.out.println(getName() +" ->put: "+number +" Time : "+LocalTime.now());
		} catch (InterruptedException e) {
				e.printStackTrace();
		}
		
	}
}
