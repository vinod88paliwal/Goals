package com.thread.advance.questions;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreadDemo1 {

	private static final Object lock = new Object();
	private String abc = "hello";

	final AtomicInteger i = new AtomicInteger();

	public void get1() {
		synchronized (lock) {
			abc = "Hello :" + i.incrementAndGet();
			// Consider at this point
			// Thread t1 gets preempted and
			// Thread t2 gets executed.
			System.out.println("get1() :" + abc);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void get2() {
		System.out.println("get2() "+abc);
	}

	public void get3() {
		synchronized (lock) {
			System.out.println("get3() "+abc);
		}
	}

	public static void main(String args[]) {
		final ThreadDemo1 obj = new ThreadDemo1();

		new Thread(new Runnable() {
			public void run() {
				obj.get1();
			}
		}, "t1").start();

		new Thread(new Runnable() {
			public void run() {
				obj.get2();
			}
		}, "t2").start();

		new Thread(new Runnable() {
			public void run() {
				obj.get3();
			}
		}, "t3").start();

	}

}
