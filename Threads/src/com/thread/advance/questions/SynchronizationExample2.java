package com.thread.advance.questions;
/*
Yes, It will be executed in synchronized way because lockReference1 and lockReference2 both pointing to same object (same memory location),
 So synchronized block acquires lock on object and not the references that is why lock on null reference in synchronized block gives NullPointerException.
*/
class SynchronizationExample2 {
	private static final Object LOCK = new Object();
	private Object lockReference1 = LOCK;
	private Object lockReference2 = LOCK;

	static SynchronizationExample2 se = new SynchronizationExample2();

	public void hello1() {
		synchronized (lockReference1) {
			System.out.println(Thread.currentThread().getName() + " in synchronized block of hello1()");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + " leaving synchronized block of hello1()");

		}
	}

	public void hello2() {
		synchronized (lockReference2) {
			System.out.println(Thread.currentThread().getName() + " in synchronized block of hello2()");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + " leaving synchronized block of hello2()");
		}
	}
	
	public static void main(String ar[]) {
	
		new Thread(new Runnable() {
			@Override
			public void run() {
				se.hello1();
			}
		}).start();

		new Thread(new Runnable() {
			@Override
			public void run() {
				se.hello2();
			}
		}).start();

	}
}
