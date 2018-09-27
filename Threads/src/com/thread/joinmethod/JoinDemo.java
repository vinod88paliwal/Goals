package com.thread.joinmethod;

public class JoinDemo extends Thread {
	static JoinDemo thread1;

	public void run() {
		try {
			synchronized (thread1) {
				System.out.println(Thread.currentThread().getName() + " acquired a lock on thread1");
				Thread.sleep(5000);
				System.out.println(Thread.currentThread().getName() + " completed");
			}
		} catch (InterruptedException e) {
		}
	}

	public static void main(String[] ar) throws Exception {
		
		thread1 = new JoinDemo();
		thread1.setName("thread1");
		thread1.start();

		synchronized (thread1) {
			System.out.println(Thread.currentThread().getName() + " acquired a lock on Main");
			Thread.sleep(1000);
			thread1.join();
			System.out.println(Thread.currentThread().getName() + " completed");
		}
	}
}

/*Output : 
main acquired a lock on Main
thread1 acquired a lock on thread1
thread1 completed
main completed
*/