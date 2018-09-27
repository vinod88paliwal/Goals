package com.thread.producerconsumer.waitnotify;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
class Producer implements Runnable {

    private final List<Object> sharedQueue;
    private final int SIZE;

    public Producer(List<Object> sharedQueue, int size) {
        this.sharedQueue = sharedQueue;
        this.SIZE = size;
    }

    @Override
    public void run() {
    	
        for (int i = 0; i < 7; i++) {
            System.out.println("Produced: " + i);
            try {
            	synchronized (sharedQueue) {
            	//wait if queue is full
                if (sharedQueue.size() == SIZE) {
                    
                        System.out.println("Queue is full " + Thread.currentThread().getName()
                                            + " is waiting , size: " + sharedQueue.size());
                        sharedQueue.wait();
                    }
                //producing element and notify consumers
                    sharedQueue.add(i);
                    sharedQueue.notifyAll();
            }
            	
            } catch (InterruptedException ex) {
                Logger.getLogger(Producer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
 }