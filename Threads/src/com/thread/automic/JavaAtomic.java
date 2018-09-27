package com.thread.automic;

import java.util.concurrent.atomic.AtomicInteger;

public class JavaAtomic {
    public static void main(String[] args) throws InterruptedException {
 
    	MyThread pt = new MyThread();
        Thread t1 = new Thread(pt, "t1");
        t1.start();
        Thread t2 = new Thread(pt, "t2");
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Processing count=" + pt.getCount());
    }
}
 
class MyThread implements Runnable {
    private AtomicInteger count = new AtomicInteger();
    //Java provided Atomic for other data types as well like AtomicLong
    
    @Override
    public void run() {
        for (int i = 1; i < 5; i++) {
            processSomething(i);
            count.incrementAndGet();
        }
    }
 
    private void processSomething(int i) {
        // processing some job
        try {
            Thread.sleep(i * 100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    public int getCount() {
        return this.count.get();
    }
    
}