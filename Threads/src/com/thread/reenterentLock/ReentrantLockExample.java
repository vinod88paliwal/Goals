package com.thread.reenterentLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockExample {

	private final Lock lock = new ReentrantLock();
	private int count = 0;

	// Locking using Lock and ReentrantLock
	public int getCountLock() {
		lock.lock();

		try {
			System.out.println(Thread.currentThread().getName() + " gets count: " + count);
		} finally {
			lock.unlock();
		}

		return count++;
	}

	// Implicit locking using synchronized keyword
	public synchronized int getCountSynchronization() {
		System.out.println(Thread.currentThread().getName() + " gets count: " + count);
		return count++;
	}

	public static void main(String[] args) {

		ReentrantLockExample obj = new ReentrantLockExample();

		Thread t1 = new Thread(() -> {
			while (obj.getCountLock() < 6) {

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		Thread t2 = new Thread(() -> {
			while (obj.getCountSynchronization() < 6) {

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		t1.start();
		t2.start();
	}
}
