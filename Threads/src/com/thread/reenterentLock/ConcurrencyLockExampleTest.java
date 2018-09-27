package com.thread.reenterentLock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

 class ConcurrencyLockExample implements Runnable{

	private Resource resource;
	private Lock lock;
	
	public ConcurrencyLockExample(Resource r){
		this.resource = r;
		this.lock = new ReentrantLock();
	}
	
	@Override
	public void run() {
		try {
			if(lock.tryLock(10, TimeUnit.SECONDS)){
		System.out.println("Thread --> "+Thread.currentThread().getName());		
			resource.doSomething();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}finally{
			//release lock
			lock.unlock();
		}
		resource.doLogging();
	}
}
 
 public class ConcurrencyLockExampleTest {
	 
	 public static void main(String[] args) {
	
		Thread t1=  new Thread(new ConcurrencyLockExample(new Resource()));
		Thread t2= new Thread(new ConcurrencyLockExample(new Resource()));
		Thread t3= new Thread(new ConcurrencyLockExample(new Resource()));
		
		t1.start(); t2.start(); t3.start();
		
	}
	 
 }