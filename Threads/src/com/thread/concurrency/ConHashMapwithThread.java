package com.thread.concurrency;

import java.util.concurrent.ConcurrentHashMap;

public class ConHashMapwithThread {

    private static class Task implements Runnable {

    	ConcurrentHashMap<Integer, Integer> hm = new ConcurrentHashMap<Integer, Integer>();
    	    	
        @Override
        public void run() {
            
        	try{
        	//hm.notify();
        		hm.wait();
            } catch (InterruptedException ex) {
            	System.out.println(ex);
            }
    }

    public static void main(String args[]) {
        //starting each of thread
        Thread t1 = new Thread(new Task(), "Thread 1");

        t1.start();
     
    }
    }

}



