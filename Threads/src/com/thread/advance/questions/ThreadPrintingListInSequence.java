package com.thread.advance.questions;

import java.util.Arrays;
import java.util.List;

public class ThreadPrintingListInSequence {
	 int flag = 1;

	 public static void main(String[] args) {
	 ThreadPrintingListInSequence lock = new ThreadPrintingListInSequence();
	
		        new ThreadAA(lock).start();
		        new ThreadBB(lock).start();
	 }	 
}
	class ThreadAA extends Thread{
		List<String> l1 = Arrays.asList("a1","a2","a3","a4","a5","a6","a7");
		 ThreadPrintingListInSequence lock;
	 
	    ThreadAA(ThreadPrintingListInSequence lock){
	        this.lock = lock;
	    }
	 
	    @Override
	    public void run() {
	    	//List<String> l1 = Arrays.asList("a1","a2","a3","a4","a5","a6","a7");
	        try{
	            synchronized (lock) {
	 
	            	 for (String s :l1) {
	 
	                    while(lock.flag!=1){
	                        lock.wait();
	                    }
	                    System.out.print(s+" ");
	                    Thread.sleep(100);
	                    lock.flag = 2;
	                    lock.notifyAll();
	                }
	 
	            }
	        }catch (Exception e) {
	            System.out.println("Exception 1 :"+e.getMessage());
	        }
	    }
	}

	class ThreadBB extends Thread{
		List<String> l2 = Arrays.asList("b1","b2","b3","b4","b5","b6","b7"); 
		
		 ThreadPrintingListInSequence lock;
	 
	    ThreadBB(ThreadPrintingListInSequence lock){
	        this.lock = lock;
	    }
	 
	    @Override
	    public void run() {
	    	//List<String> l2 = Arrays.asList("b1","b2","b3","b4","b5","b6","b7"); 
	        try{
	            synchronized (lock) {
	 
	                for (String s :l2) {
	 
	                    while(lock.flag!=2){
	                        lock.wait();
	                    }
	 
	                    System.out.print(s+" ");
	                    Thread.sleep(100);
	                    lock.flag = 1;
	                    lock.notifyAll();
	                }
	 
	            }
	        }catch (Exception e) {
	            System.out.println("Exception 2 :"+e.getMessage());
	        }
	    }
	}