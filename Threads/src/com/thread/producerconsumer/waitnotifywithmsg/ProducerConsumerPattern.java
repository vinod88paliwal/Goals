package com.thread.producerconsumer.waitnotifywithmsg;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
 
//The producer consumer service will create the BlockingQueue with fixed size and it will be shared by both producers and consumers. This service will start producer and consumer threads and exit 
public class ProducerConsumerPattern {
 
    public static void main(String[] args) {
        //Creating BlockingQueue of size 10
        BlockingQueue<Message> queue = new ArrayBlockingQueue<Message>(10);
        			
        Producer producer = new Producer(queue);
        Consumer consumer = new Consumer(queue);
        //starting producer to produce messages in queue
        new Thread(producer).start();
        //starting consumer to consume messages from queue
        new Thread(consumer).start();
        System.out.println("Producer and Consumer has been started");
    }
}

//Thread sleep is used in producer and consumer to produce and consume messages with some delay.