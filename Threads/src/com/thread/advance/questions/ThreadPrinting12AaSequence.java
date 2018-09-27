package com.thread.advance.questions;

public class ThreadPrinting12AaSequence {

	 int flag = 1;
	 int value =1;
	 private int MAX = 52;
	 
	 public void print1() {
			try{
		        synchronized (this) {
		        	while (value < MAX) {
		                while(flag!=1){
		                    wait();
		                }

		                System.out.print(Thread.currentThread().getName()+"--> "+value++ +" ");
		                Thread.sleep(100);
		                flag = 2;
		                notifyAll();
		        	}
		            }
		    }catch (Exception e) {
		        System.out.println("Exception 1 :"+e.getMessage());
		    }
		}
	 
	 public void print2() {
			try{
		        synchronized (this) {
		        	while (value <= MAX) {
		                while(flag!=2){
		                    wait();
		                }

		                System.out.print(Thread.currentThread().getName()+"--> "+value++ +" ");
		                Thread.sleep(100);
		                flag = 3;
		                notifyAll();
		        	}
		            }
		    }catch (Exception e) {
		        System.out.println("Exception 2 :"+e.getMessage());
		    }
		}
	 
	 public void printA() {
			try{
		        synchronized (this) {
		        	for (char ch = 'A'; ch <= 'Z'; ch++) {
		        		 
		                while(flag!=3){
		                    wait();
		                }

		                System.out.print(Thread.currentThread().getName()+"--> "+ch+" ");
		                Thread.sleep(100);
		                flag = 4;
		                notifyAll();
		        	 }
		        }
		    }catch (Exception e) {
		        System.out.println("Exception 3 :"+e.getMessage());
		    }
		}

	 public void printa() {
			try{
		        synchronized (this) {
		        	for (char ch = 'a'; ch <= 'z'; ch++) {
		                while(flag!=4){
		                    wait();
		                }

		                System.out.print(Thread.currentThread().getName()+"--> "+ch+" ");
		                System.out.println();
		                Thread.sleep(100);
		                flag = 1;
		                notifyAll();
		        	}
		        }
		    }catch (Exception e) {
		        System.out.println("Exception 4 :"+e.getMessage());
		    }
		}
	 
 public static void main(String[] args) {
		 
		 ThreadPrinting12AaSequence obj = new ThreadPrinting12AaSequence();
	 
		 Thread t1 = new Thread(()-> { obj.print1();  });
		 Thread t2 = new Thread(()-> { obj.print2();  });
		 Thread t3 = new Thread(()-> { obj.printA();  });
		 Thread t4 = new Thread(()-> { obj.printa();  });
					
			t1.start();
			t2.start();
			t3.start();
			t4.start();
	    }
}