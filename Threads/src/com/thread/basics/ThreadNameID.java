package com.thread.basics;

public class ThreadNameID extends Thread{  
	  public void run(){  
		   System.out.println("running...");  
		  }  
		 public static void main(String args[]){  
		  ThreadNameID t1=new ThreadNameID();  
		  ThreadNameID t2=new ThreadNameID();  
		  System.out.println("Name of t1:"+t1.getName());  
		  System.out.println("Name of t2:"+t2.getName());  
		  System.out.println("id of t1:"+t1.getId());  
		  
		  t1.start();  
		  t2.start();  
		  
		  t1.setName("Vinod Paliwal");  
		  System.out.println("After changing name of t1:"+t1.getName());  
		 }  
		}  