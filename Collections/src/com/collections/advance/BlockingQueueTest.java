package com.collections.advance;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class BlockingQueueTest {

	public static void main(String[] args) {
		
		try {
			BlockingQueue<String> bQueue = new ArrayBlockingQueue<String>(10);
	///		bQueue.put(null); //NullPointerException - BlockingQueue in Java doesn't allow null
			     
			bQueue = new LinkedBlockingQueue<String>();
				bQueue.put(null); //NullPointerException - BlockingQueue in Java doesn't allow null

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
	
}
