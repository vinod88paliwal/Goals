package com.collections.advance;
import java.util.*;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class BlockingQueuePeekPollMethodsTest {

	public static void main(String[] args) {
		
		try {
			
			BlockingQueue<String> linkedBQueue = new LinkedBlockingQueue<String>(2);
			linkedBQueue.put("Java"); //puts object into BlockingQueue, //put() returns void
			System.out.println("size of BlockingQueue before peek : " + linkedBQueue.size());      
			System.out.println("peek() in BlockingQueue: " + linkedBQueue.peek());
			System.out.println("size of BlockingQueue after peek : " + linkedBQueue.size());
			System.out.println("calling poll() on BlockingQueue: " + linkedBQueue.poll());
			System.out.println("size of BlockingQueue after poll : " + linkedBQueue.size());
			
			System.out.println("Remaining Capacity: "+linkedBQueue.remainingCapacity());
			System.out.println("Offer1 : "+linkedBQueue.offer("J2SE"));
			System.out.println("Offer2 : "+linkedBQueue.offer("J2SE1"));
			System.out.println("Offer3 : "+linkedBQueue.offer("J2SE2"));
			
			System.out.println("size of BlockingQueue after offer : " + linkedBQueue.size());
			
			//System.out.println("Add: "+linkedBQueue.add("JDK"));
			//System.out.println("Add: "+linkedBQueue.add("JDK1"));
			//System.out.println("Add: "+linkedBQueue.add("JDK2"));
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
}
