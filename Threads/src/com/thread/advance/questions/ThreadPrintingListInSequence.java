package com.thread.advance.questions;

import java.util.Arrays;
import java.util.List;

public class ThreadPrintingListInSequence {
	
	 int flag = 1;
	 List<String> l1 = Arrays.asList("a1","a2","a3","a4","a5","a6","a7");
	 List<String> l2 = Arrays.asList("b1","b2","b3","b4","b5","b6","b7");
	 int c1=0, c2=0;

	
	public void printList1(){
		
	        try{
	            synchronized (this) {
	 
	            	 for (String s :l1) {
	 
	                    while(flag!=1)
	                        wait();

	                    System.out.print(s+" ");
	                    flag = 2;
	                    notify();
	                }
	            }
	        }catch (Exception e) {
	            System.out.println("Exception 1 :"+e.getMessage());
	        }
	    }

	public void printList2(){
		 
	        try{
	            synchronized (this) {
	 
	                for (String s :l2) {
	 
	                    while(flag!=2)
	                       wait();
	 
	                    System.out.print(s+" ");
	                    flag = 1;
	                    notify();
	                }
	            }
	        }catch (Exception e) {
	            System.out.println("Exception 2 :"+e.getMessage());
	        }
	    }
	
	 public static void main(String[] args) 
	 {
		 ThreadPrintingListInSequence obj = new ThreadPrintingListInSequence();
	
		 Thread t1 = new Thread(() -> obj.printList1());
		 Thread t2 = new Thread(() -> obj.printList2());
		 
		 t1.start();
		 t2.start();
	 }
}		 