package com.thread.basics;

public class SleepTest {
    
    public static void main(String... args){
    
    System.out.println(Thread.currentThread().getName() + " is going to sleep for 1 Second");
           try {
                  Thread.currentThread().sleep(10000);
           } catch (InterruptedException e) {
                  // TODO Auto-generated catch block
                  e.printStackTrace();
           }
           
          /* try {
			Thread.currentThread().wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
*/           System.out.println("Main Thread is woken now");
    }

}