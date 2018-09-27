package com.thread.automic;
/*
 If you will run above program, you will notice that count value varies between 5 to 8. The reason is because
 count++ is not an atomic operation. So by the time one threads read it�s value and increment it by one, other
 thread has read the older value leading to wrong result. 
 */
public class JavaAtomicWithoutAtomicInteger {

	public static void main(String[] args) throws InterruptedException {
		 
        ProcessingThread pt = new ProcessingThread();
        Thread t1 = new Thread(pt, "t1");
        t1.start();
        Thread t2 = new Thread(pt, "t2");
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Processing count=" + pt.getCount());
    }
}

class ProcessingThread implements Runnable {
    private int count;
 
    @Override
    public void run() {
    	System.out.println("Thread--> "+Thread.currentThread().getName());
        for (int i = 1; i < 5; i++) {
            count++;
            System.out.println("Thread--> "+Thread.currentThread().getName()+" count -> "+count);
         // processing some job
            try {
                Thread.sleep(i * 100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
 
    public int getCount() {
        return this.count;
    }
}
