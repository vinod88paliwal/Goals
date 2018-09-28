package com.thread.advance.questions;
/*
 Yes, It will be executed in synchronized way because sy1.hello() and sy2.hello() both synchronize on the same STATIC object "obj" 
  and hence execute in synchronized way.
 */
class SynchronizationExample {
	
	   private static Object obj = new Object();
	// static SynchronizationExample sy = new SynchronizationExample();
	
	   private void hello() {
			synchronized (obj) { //or synchronized (sy) {
				System.out.println("Thread :" + Thread.currentThread().getName() + " Inside");
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Thread :" + Thread.currentThread().getName() + " Leaving");
			}
		}
	   
	public static void main(String ar[]) {

		new Thread(new Runnable() {
			@Override
			public void run() {
				SynchronizationExample sy1 = new SynchronizationExample();
				sy1.hello();
			}
		}).start();

		new Thread(new Runnable() {
			@Override
			public void run() {
				SynchronizationExample sy2 = new SynchronizationExample();
				sy2.hello();
			}
		}).start();

		System.out.println("Done!!!");
	}
}