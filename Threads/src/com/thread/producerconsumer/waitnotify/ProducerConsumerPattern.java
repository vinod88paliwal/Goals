package com.thread.producerconsumer.waitnotify;

import java.util.*;

/**
 * Java program to solve Producer Consumer problem using wait and notify
 * method in Java. Producer Consumer is also a popular concurrency design pattern.
 *
 * @author Vinod Paliwal
 */
public class ProducerConsumerPattern {

    public static void main(String args[]) {
    	
    	LinkedList<Object> sharedQueue = new LinkedList<Object>();
        int size = 4;
        Thread prodThread = new Thread(new Producer(sharedQueue, size), "Producer");
        Thread consThread = new Thread(new Consumer(sharedQueue), "Consumer");
        
        prodThread.start();
        consThread.start();
    }
}