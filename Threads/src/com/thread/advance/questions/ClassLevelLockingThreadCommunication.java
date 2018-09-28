package com.thread.advance.questions;

public class ClassLevelLockingThreadCommunication {

	public static void main(String[] args) {
		final ClassLevelLockingThreadCommunication classLockingObj = new ClassLevelLockingThreadCommunication();

		new Thread(new Runnable() {
			@Override
			public void run() {
				classLockingObj.getA();
			}
		}).start();

		new Thread(new Runnable() {
			@Override
			public void run() {
				classLockingObj.getB();
			}
		}).start();

	/*	new Thread(new Runnable() {
			@Override
			public void run() {
				ClassLevelLockingThreadCommunication.getC();
			}
		}).start();

		new Thread(new Runnable() {
			@Override
			public void run() {
				ClassLevelLockingThreadCommunication.getD();
			}
		}).start();
*/
	}

	/*** INSTANCE METHOD ***/
	public synchronized void getA() {
		System.out.println( "ClassLevelLockingThreadCommunication.getA() :" + Thread.currentThread().getName() + " enetered");
		try {
			Thread.sleep(200);
		//	System.out.println("No other methoda call on same object till below line (wait() call)");
		System.out.println( "ClassLevelLockingThreadCommunication.getA() :" + Thread.currentThread().getName() + " is waiting for other thread to call notify() or notifyAll() on same object");
			wait();   //it releases the lock on classLockingObj so another Thread on same Obj (classLockingObj) is able to enter in another Method (getB()). It waits for other thread of same object to call the notify() or notifyAll() to come out from waiting state.
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("ClassLevelLockingThreadCommunication.getA() :" + Thread.currentThread().getName() + " leaving");
	}

	public synchronized void getB() {
		System.out.println("ClassLevelLockingThreadCommunication.getB() :" + Thread.currentThread().getName() + " enetered");
		try {
			Thread.sleep(2000);
			notify(); // It notifies the Thread to come-out from waiting state if any Thread is in wait state.
		System.out.println("ClassLevelLockingThreadCommunication.getB() :" + Thread.currentThread().getName() + " calling notify() to come-out from waiting state if any Thread is in wait state");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("ClassLevelLockingThreadCommunication.getB() : " + Thread.currentThread().getName() + " leaving");
	}

	/*** Class/static METHOD ***/
	public static synchronized void getC() {
		System.out.println("ClassLevelLockingThreadCommunication.getC() static: " + Thread.currentThread().getName() + " enetered");
		try {
			Thread.sleep(2000);
			ClassLevelLockingThreadCommunication.class.wait();
		
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("ClassLevelLockingThreadCommunication.getC() static: " + Thread.currentThread().getName() + " leaving");
	}

	public static synchronized void getD() {
		System.out.println("ClassLevelLockingThreadCommunication.getD() static : " + Thread.currentThread().getName() + " enetered");
		try {
			Thread.sleep(2000);
		
			ClassLevelLockingThreadCommunication.class.notify();
		
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("ClassLevelLockingThreadCommunication.getD() static : " + Thread.currentThread().getName() + " leaving");
	}
}

/*
Both object and Class locks are different and they don't interfere with each other.

we can create multiple object's of a class and each object will have one lock associated with it.
When we acquire a lock on any class, we actually acquire a lock on "Class" class instance which is only one for all instances of class.

For communication between Threads which acquire a lock on object, we call obj1.wait() and obj1.notify().
For communication between Threads which acquire a lock on class A, we call A.class.wait() and A.class.notify().
*/




