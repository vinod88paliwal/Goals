package com.thread.semaphore;

import java.util.concurrent.Semaphore;

public class SemaphoreTest {

	private Semaphore binary = new Semaphore(1); // or  new Semaphore(1,true); true means, giving permit to longest waiting thread.

	private void mutualExclusion() {
		try {
			binary.acquire();

			// mutual exclusive region
			System.out.println(Thread.currentThread().getName()	+ " inside mutual exclusive region");
			Thread.sleep(1000);

		} catch (InterruptedException ie) {
			ie.printStackTrace();
		} finally {
			binary.release();
			System.out.println(Thread.currentThread().getName()	+ " outside of mutual exclusive region");
		}
	}
	
	public static void main(String args[]) {

		final SemaphoreTest test = new SemaphoreTest();
		
		new Thread() {
			
			@Override
			public void run() {
				test.mutualExclusion();
			}
		}.start();

		new Thread() {
			
			@Override
			public void run() {
				test.mutualExclusion();
			}
		}.start();
	}


}