package com.thread.cyclicbarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CyclicBarrierExamplewithMultipeTaks {

    //Runnable task1 
    private static class Task1 implements Runnable {

        private CyclicBarrier barrier;

        public Task1(CyclicBarrier barrier) {
            this.barrier = barrier;
        }

        @Override
        public void run() {
            try {
                System.out.println(Thread.currentThread().getName() + " is waiting on barrier");
                
                barrier.await();
            
                System.out.println(Thread.currentThread().getName() + " has crossed the barrier");
            
            } catch (InterruptedException ex) {
                Logger.getLogger(CyclicBarrierExamplewithMultipeTaks.class.getName()).log(Level.SEVERE, null, ex);
            } catch (BrokenBarrierException ex) {
                Logger.getLogger(CyclicBarrierExamplewithMultipeTaks.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

  //Runnable task2 
    private static class Task2 implements Runnable {

        private CyclicBarrier barrier;

        public Task2(CyclicBarrier barrier) {
            this.barrier = barrier;
        }

        @Override
        public void run() {
            try {
                System.out.println(Thread.currentThread().getName() + " is waiting on barrier");
                
                barrier.await();
            
                System.out.println(Thread.currentThread().getName() + " has crossed the barrier");
            
            } catch (InterruptedException ex) {
                Logger.getLogger(CyclicBarrierExamplewithMultipeTaks.class.getName()).log(Level.SEVERE, null, ex);
            } catch (BrokenBarrierException ex) {
                Logger.getLogger(CyclicBarrierExamplewithMultipeTaks.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

  //Runnable task3 
    private static class Task3 implements Runnable {

        private CyclicBarrier barrier;

        public Task3(CyclicBarrier barrier) {
            this.barrier = barrier;
        }

        @Override
        public void run() {
            try {
                System.out.println(Thread.currentThread().getName() + " is waiting on barrier");
                
                barrier.await();
            
                System.out.println(Thread.currentThread().getName() + " has crossed the barrier");
            
            } catch (InterruptedException ex) {
                Logger.getLogger(CyclicBarrierExamplewithMultipeTaks.class.getName()).log(Level.SEVERE, null, ex);
            } catch (BrokenBarrierException ex) {
                Logger.getLogger(CyclicBarrierExamplewithMultipeTaks.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static void main(String args[]) {

        //creating CyclicBarrier with 3 parties i.e. 3 Threads needs to call await()
        final CyclicBarrier cb = new CyclicBarrier(4, new Runnable(){
            @Override
            public void run(){
                //This task will be executed once all thread reaches barrier
                System.out.println("All parties are arrived at barrier, lets play");
            }
        });

        //starting each of thread
        Thread t1 = new Thread(new Task1(cb), "Thread 1");
        Thread t2 = new Thread(new Task2(cb), "Thread 2");
        Thread t3 = new Thread(new Task3(cb), "Thread 3");

        t1.start();
        t2.start();
        t3.start();
     
    }
}

