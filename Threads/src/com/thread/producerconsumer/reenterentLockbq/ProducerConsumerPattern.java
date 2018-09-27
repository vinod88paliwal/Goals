package com.thread.producerconsumer.reenterentLockbq;

public class ProducerConsumerPattern
{
    public static void main(String[] args)
    {
    	   MyBlockingQueue sharedq = new MyBlockingQueue(5);
    	   
        Thread t1 = new Thread(new Producer(sharedq));
        Thread t2 = new Thread(new Consumer(sharedq));
        
        t2.start();
        t1.start();
        
        
    }
}
