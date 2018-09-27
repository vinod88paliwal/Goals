package com.thread.basics;

public class ThreadCurrentThreadName extends Thread{  
	 public void run(){  
		  System.out.println(Thread.currentThread().getName());  
		 }  
		  
		 public static void main(String args[]){  
			 
		  ThreadCurrentThreadName t1=new ThreadCurrentThreadName();  
		  ThreadCurrentThreadName t2=new ThreadCurrentThreadName();  
		  
		  t1.start();  
		  t2.start();  
		 }  
		} 
