package com.thread.advance.questions;

public class ThreadsPrinting123InSequence {
	
	private int count = 1;
	private int flag=1;
	private int MAX = 20;
	
public static void main(String[] args) throws InterruptedException {
	ThreadsPrinting123InSequence obj = new ThreadsPrinting123InSequence();
	
	Thread t1 = new Thread(() ->{ obj.print1();});
	Thread t2 = new Thread(() ->{ obj.print2();});
	Thread t3 = new Thread(() ->{ obj.print3();});
	
	t1.start();
	t2.start();
	t3.start();
	}
	
	
	public void print1() {
		synchronized (this) {
			while (count < MAX) {
				
				if(flag != 1) {
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
				System.out.println("print1() : "+count);
				count++;
				flag =2;
				notify();
			}
		}
	}

	public void print2() {
		synchronized (this) {
			while (count < MAX) {
				
				if(flag != 2) {
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
				System.out.println("print2() : "+count);
				count++;
				flag =3;
				notify();
			}
		}
	}
	
	public void print3() {
		synchronized (this) {
			while (count < MAX) {
				
				if(flag != 3) {
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
				System.out.println("print3() : "+count);
				count++;
				flag =1;
				notify();
			}
		}
	}
}



/*public class ThreadsPrinting123InSequence {
	public static int i = 0;

	public static void main(String[] args) throws InterruptedException {
		ThreadsPrinting123InSequence monitor = new ThreadsPrinting123InSequence();
		
		Notifier notifier = new Notifier(monitor);
		
		new Thread(notifier, "T1").start();
		new Thread(notifier, "T2").start();
		new Thread(notifier, "T3").start();
	}
}

class Notifier implements Runnable {

	private ThreadsPrinting123InSequence monitor = null;
	private  int i = 1;
	private static boolean first = true;
	private static boolean second = false;
	private static boolean third = false;

	public Notifier(ThreadsPrinting123InSequence objcurr) {
		this.monitor = objcurr;
	}

	@Override
	public void run() {
		try {
			while (true) {
				synchronized (monitor) {
					String Tname = Thread.currentThread().getName();
					if (first && Tname.equalsIgnoreCase("T1")) {
						//print();
						System.out.println(Thread.currentThread().getName() + " - " + i++);
						first = false;
						second = true;
						monitor.notifyAll();
						monitor.wait();
					} else if (second && Tname.equalsIgnoreCase("T2")) {
						//print();
						System.out.println(Thread.currentThread().getName() + " - " + i++);
						second = false;
						third = true;
						monitor.notifyAll();
						monitor.wait();
					} else if (third && Tname.equalsIgnoreCase("T3")) {
						//print();
						System.out.println(Thread.currentThread().getName() + " - " + i++);
						third = false;
						first = true;
						monitor.notifyAll();
						monitor.wait();
					}
				}
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void print() {
	    System.out.println(Thread.currentThread().getName() + " - " + i++);
	}
	
}	*/
	
	