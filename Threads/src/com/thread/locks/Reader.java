package com.thread.locks;

import java.time.LocalTime;
import java.util.Random;
//3
public class Reader extends Thread{
	private ReadWriteList<Integer> sharedList;

	public Reader(ReadWriteList<Integer> sharedList) {
		this.sharedList = sharedList;
	}
	
	public void run() {
		Random random = new Random();
		int idx = random.nextInt(sharedList.size());
		
		Integer number = sharedList.get(idx);
		System.out.println(getName() +"-> get: "+number+" Time : "+LocalTime.now());

		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
	}
	}
	
}
